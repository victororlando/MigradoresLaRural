/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oradestino;

import entidades.larural.destino.Lrcotizacion;

/**
 *
 * @author chiq
 */
public class LrCotizacionManager extends AbstractManagerDestino<Lrcotizacion> {

    public LrCotizacionManager(Class<Lrcotizacion> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public Long lastId() {
        Long id = null;
        try {
            id = (Long) em.createQuery("Select max(l.lrcotizacionPK.lrcotizacionnro) from Lrcotizacion l")
                    .getSingleResult();
            if (id == null) {
                id = 0L;
            }
        } catch (Exception e) {

        }
        return id;
    }

}
