/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oradestino;

import entidades.larural.destino.Lrmodocotizacion;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author chiq
 */
public class LrModoCotizacionManager extends AbstractManagerDestino<Lrmodocotizacion> {

    public LrModoCotizacionManager(Class<Lrmodocotizacion> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public Map<String, Lrmodocotizacion> obtenerMapaDeRegistros() {
        List<Lrmodocotizacion> lista;
        Map<String, Lrmodocotizacion> map = new HashMap<>();
        try {
            lista = em.createQuery("Select l from Lrmodocotizacion l", Lrmodocotizacion.class)
                    .getResultList();

            for (Lrmodocotizacion l : lista) {
                map.put(l.getLrmodocotizacioncod().trim().toUpperCase(), l);
            }
        } catch (Exception e) {

        }
        return map;
    }

}
