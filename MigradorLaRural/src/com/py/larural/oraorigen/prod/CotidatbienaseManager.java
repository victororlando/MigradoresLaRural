/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oraorigen.prod;

import entidades.larural.origen.lrgxprod.Cotidatbienase;

/**
 *
 * @author chiq
 */
public class CotidatbienaseManager extends AbstractManagerOrigenProd<Cotidatbienase> {

    public CotidatbienaseManager(Class<Cotidatbienase> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public Cotidatbienase obtenerCotidatbienase(Long nroCotizacion) {
        Cotidatbienase devolver = null;
        String sql = "select cfrom cotidatbienase coti, cotizaciones c"
                + " where coti.cotizacionesid = ? ";
                
        try {
            devolver = em.createQuery("Select c from Cotidatbienase c where c.cotidatbienasePK.cotizacionesid = :cotizacionNro ", Cotidatbienase.class)
                    .setParameter("cotizacionNro", nroCotizacion)
                    .getSingleResult();
        } catch (Exception e) {

        }
        return devolver;
    }

}
