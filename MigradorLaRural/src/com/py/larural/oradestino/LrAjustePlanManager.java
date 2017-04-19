/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oradestino;

import entidades.larural.destino.Lrajuste;
import entidades.larural.destino.Lrajusteplan;

/**
 *
 * @author chiq
 */
public class LrAjustePlanManager extends AbstractManagerDestino<Lrajusteplan> {

    public LrAjustePlanManager(Class<Lrajusteplan> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public Lrajusteplan obtenerLrAjustePlan(long ajusteId, long SSECCDETALLEID, long SPARMCOTIPLANID, long STIPOPLANID) {
        Lrajusteplan devolver = null;
        try {
            devolver = em.createQuery("Select l from Lrajusteplan l where l.lrajusteplanPK.lrajusteid = :ajusteId "
                    + " and l.lrajusteplanPK.lrparmcotiplanid = :SPARMCOTIPLANID "
                    + " and l.lrajusteplanPK.lrseccdetalleid = :SSECCDETALLEID and l.lrajusteplanPK.lrtipoplanid = :STIPOPLANID", Lrajusteplan.class)
                    .setParameter("ajusteId", ajusteId)
                    .setParameter("SSECCDETALLEID", SSECCDETALLEID)
                    .setParameter("SPARMCOTIPLANID", SPARMCOTIPLANID)
                    .setParameter("STIPOPLANID", STIPOPLANID)
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println("No se pudo obtener LrajustePlan. ajusteId: " + ajusteId + " SSECCDETALLEID: " + SSECCDETALLEID + " SPARMCOTIPLANID: " + SPARMCOTIPLANID + " STIPOPLANID:" + STIPOPLANID);
        }
        return devolver;
    }

}
