/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oradestino;

import entidades.larural.destino.Lraccionsubacccion;

/**
 *
 * @author chiq
 */
public class LrAccionSubAccionManager extends AbstractManagerDestino<Lraccionsubacccion> {

    public LrAccionSubAccionManager(Class<Lraccionsubacccion> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public Lraccionsubacccion obtenerAccionSubAccion(String s) {
        Lraccionsubacccion sub = null;
        try {
            sub = em.createQuery("Select l from Lraccionsubacccion l where l.lraccion.lracciondesc = :descripcion and l.lrsubaccion.lrsubacciondesc = :descripcion", Lraccionsubacccion.class)
                    .setParameter("descripcion", s)
                    .getSingleResult();
        } catch (Exception e) {

        }
        return sub;
    }

}
