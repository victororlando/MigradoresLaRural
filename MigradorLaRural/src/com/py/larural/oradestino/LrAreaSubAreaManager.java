/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oradestino;

import entidades.larural.destino.Lrareasubarea;

/**
 *
 * @author chiq
 */
public class LrAreaSubAreaManager extends AbstractManagerDestino<Lrareasubarea> {

    public LrAreaSubAreaManager(Class<Lrareasubarea> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public Lrareasubarea obtenerAreaSubArea(String s) {
        Lrareasubarea sub = null;
        try {
            sub = em.createQuery("Select l from Lrareasubarea l where l.lrarea.lrareadesc = :descripcion and l.lrsubarea.lrsubareadesc = :descripcion", Lrareasubarea.class)
                    .setParameter("descripcion", s)
                    .getSingleResult();
        } catch (Exception e) {

        }
        return sub;
    }

}
