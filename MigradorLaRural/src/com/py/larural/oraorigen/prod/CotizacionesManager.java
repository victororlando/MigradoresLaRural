/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oraorigen.prod;

import entidades.larural.origen.lrgxprod.Cotizaciones;

/**
 *
 * @author chiq
 */
public class CotizacionesManager extends AbstractManagerOrigenProd<Cotizaciones> {

    public CotizacionesManager(Class<Cotizaciones> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public Cotizaciones obtenerCotizacion(long cotizacionesId) {
        Cotizaciones devolver = null;
        try {
            devolver = em.createQuery("Select c from Cotizaciones c where c.cotizacionesid = :cotizacionesId", Cotizaciones.class)
                    .setParameter("cotizacionesId", cotizacionesId)
                    .getSingleResult();
        } catch (Exception e) {

        }
        return devolver;
    }

}
