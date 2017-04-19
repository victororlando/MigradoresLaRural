/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oradestino;

import entidades.larural.destino.Lrparmcotiplansecc;
import entidades.larural.destino.Lrparmcotiplansecc;

/**
 *
 * @author chiq
 */
public class LrParmCotiPlanSeccManager extends AbstractManagerDestino<Lrparmcotiplansecc> {

    public LrParmCotiPlanSeccManager(Class<Lrparmcotiplansecc> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public Lrparmcotiplansecc obtenerLrParmCotiPlanSecc(Long secDetalleId, Long lrParmCotiPlanid, Short cotiItemFormulasTipoPlan) {
        Lrparmcotiplansecc devolver = null;
        try {
            devolver = em.createQuery("Select l from Lrparmcotiplansecc l where l.lrparmcotiplanseccPK.lrseccdetalleid = :seccDetalleId and l.lrparmcotiplanseccPK.lrparmcotiplanid = :lrParmCotiPlanId and l.lrparmcotiplanseccPK.lrtipoplanid = :cotiItemFormulasTipoPlan", Lrparmcotiplansecc.class)
                    .setParameter("seccDetalleId", secDetalleId)
                    .setParameter("lrParmCotiPlanId", lrParmCotiPlanid)
                    .setParameter("cotiItemFormulasTipoPlan", cotiItemFormulasTipoPlan)
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println("Se produjo un error al obtener LrParmCotiPlanSecc: " + "lrseccdetalleid: " + secDetalleId + " lrparmcotiplanid: " + lrParmCotiPlanid + " lrtipoplanid: " + cotiItemFormulasTipoPlan);
        }
        return devolver;
    }

    public String obtenerNombreServicio(long id) {
        String devolver = " ";
        try{
        devolver = (String) em.createNativeQuery("select secctiposserviciosnombre from v_secctiposservicios s, lrprovservtipo p "
                + " where s.SeccTiposServiciosID = p.tiposserviciosseccid "
                + " and s.SeccID = p.seccid and p.seccid = 501 and s.secctiposserviciosid =?")
                .setParameter(1, id)
                .getSingleResult();
        }catch(Exception e){
            System.out.println("No se encontro nombre de servicio para secctiposserviciosid: " + id);
        }
        return devolver;
    }

}
