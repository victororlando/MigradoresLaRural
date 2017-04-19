/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oradestino;

import entidades.larural.destino.Lrrenov;

/**
 *
 * @author chiq
 */
public class LrRenovManager extends AbstractManagerDestino<Lrrenov> {

    public LrRenovManager(Class<Lrrenov> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public long lastId() {
        Long id = null;
        try {
            id = (Long) em.createQuery("Select max(l.lrrenovid) from Lrrenov l")
                    .getSingleResult();

            if (id == null) {
                id = 1L;
            }
        } catch (Exception e) {

        }
        return id;
    }

}
