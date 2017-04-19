/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oradestino;

import entidades.larural.destino.Lrestadocotizacion;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chiq
 */
public class LrEstadoCotizacionManager extends AbstractManagerDestino<Lrestadocotizacion> {

    public LrEstadoCotizacionManager(Class<Lrestadocotizacion> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public Lrestadocotizacion obtenerLrSeccDetallePorSecc(String descripcion) {
        Lrestadocotizacion devolver = null;
        try {
            devolver = (Lrestadocotizacion) em.createNativeQuery("Select * from Lrestadocotizacion l where trim(l.lrestadocotizaciondesc) = ?", Lrestadocotizacion.class)
                    .setParameter(1, descripcion)
                    .getSingleResult();
        } catch (Exception e) {
            Logger.getLogger("LrestadoCotizacionManager").
                    log(Level.INFO, "No se pudo encontrar el estado de cotizacion con descricpcion{0}", descripcion);
        }
        return devolver;
    }

}
