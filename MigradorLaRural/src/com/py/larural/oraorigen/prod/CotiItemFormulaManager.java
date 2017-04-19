/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oraorigen.prod;

import entidades.larural.origen.lrgxprod.Cotiitemformulas;
import java.util.List;

/**
 *
 * @author chiq
 */
public class CotiItemFormulaManager extends AbstractManagerOrigenProd<Cotiitemformulas> {

    public CotiItemFormulaManager(Class<Cotiitemformulas> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public Cotiitemformulas obtenerCotiItemFormula(long l, long nroCotizacion, long tipo) {
        Cotiitemformulas devolver = null;
        try {
            devolver = em.createQuery("Select c from Cotiitemformulas c where c.cotiitemformulasPK.cotiitemformulasid = :cotiId and c.cotiitemformulasPK.cotiitemformulastipo = :tipo and c.cotiitemformulasPK.cotizacionesid = :nroCotizacion", Cotiitemformulas.class)
                    .setParameter("cotiId", l)
                    .setParameter("tipo", tipo)
                    .setParameter("nroCotizacion", nroCotizacion)
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println("No se pudo obtener cotiItemFormula con valores--> cotiitemformulasid: " + l + " idCotizacion: " + nroCotizacion + " tipoCotiItemFormulasId: " + tipo);
        }
        return devolver;
    }

    public Short obtenerCotiItemFormulasTipoPlan(Long nroCotizacionAMigrar, Long cotidetseccionesidplan) {
        List<Cotiitemformulas> listAux = null;
        Short devolver = null;
        try {
            listAux = em.createNativeQuery("select * from cotiitemformulas "
                    + " where cotizacionesid = ? "
                    + " and cotiitemformulastipo = ?", Cotiitemformulas.class)
                    .setParameter(1, nroCotizacionAMigrar)
                    .setParameter(2, cotidetseccionesidplan)
                    .getResultList();

            if (!listAux.isEmpty()) {
                devolver = listAux.get(0).getCotiitemformulastipoplan();
            }
        } catch (Exception e) {
            System.out.println("No se pudo obtener obtenerCotiItemFormulasTipoPlan con valores --> cotizacionesid: " + nroCotizacionAMigrar + " cotidetseccionesidplan: " + cotidetseccionesidplan);
        }
        return devolver;
    }

}
