/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oradestino;

import entidades.larural.destino.Lrcoberturaplan;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chiq
 */
public class LrCoberturaPlanManager extends AbstractManagerDestino<Lrcoberturaplan> {

    public LrCoberturaPlanManager(Class<Lrcoberturaplan> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public List<Lrcoberturaplan> obtenerLrCoberturaPlan(Long planAprobado) {
        List<Lrcoberturaplan> devolver = new ArrayList<>();

        try {
            devolver = em.createNativeQuery("select c.lrcoberturaplanid, c.* "
                    + " from lrcoberturaplan c, v_coberturastipo ct "
                    + " where c.coberturastipid = ct.CoberturasTipID "
                    + " and c.seccid = ct.SeccID and lrparmcotiplanid = ?  and c.seccid = 501", Lrcoberturaplan.class)
                    .setParameter(1, planAprobado)
                    .getResultList();

        } catch (Exception e) {
            System.out.println("No se pudo obtener lrCoberturaPlanId para lrparmcotiplanid: " + planAprobado);
        }
        return devolver;
    }

}
