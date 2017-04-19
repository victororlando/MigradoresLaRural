/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oradestino;

import entidades.larural.destino.Lrseccdetalle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chiq
 */
public class LrSeccDetalleManager extends AbstractManagerDestino<Lrseccdetalle> {

    public LrSeccDetalleManager(Class<Lrseccdetalle> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public Lrseccdetalle obtenerLrSeccDetallePorSecc(short secc) {
        Lrseccdetalle devolver = null;
        try {
            devolver = em.createQuery("Select l from Lrseccdetalle l where l.lrseccdetallehab = 'S' and l.lrseccdetalleid = :secc", Lrseccdetalle.class)
                    .setParameter("secc", secc)
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println("No se pudo obtner obtenerLrSeccDetallePorSecc de secc: " + secc);
        }
        return devolver;

    }

    public Lrseccdetalle obtenerLrSeccDetallePorSecc(short[] secc) {
        Lrseccdetalle devolver = null;
        List<Short> seccList = new ArrayList<>();

        for (int i = 0; i < secc.length; i++) {
            seccList.add(secc[i]);
        }
        try {
            devolver = em.createQuery("Select l from Lrseccdetalle l where l.lrseccdetallehab = 'S' and l.lrseccdetallemodid in :secc", Lrseccdetalle.class)
                    .setParameter("secc", seccList)
                    .getSingleResult();
        } catch (Exception e) {

        }
        return devolver;

    }

}
