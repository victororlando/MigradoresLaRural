/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oradestino;

import entidades.larural.destino.Lrclasepoliza;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author chiq
 */
public class LrClasePolizaManager extends AbstractManagerDestino<Lrclasepoliza> {

    public LrClasePolizaManager(Class<Lrclasepoliza> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public Map<String, Lrclasepoliza> obtenerMapaRegistros() {
        List<Lrclasepoliza> lrclasepoliza;
        Map<String, Lrclasepoliza> map = new HashMap<>();
        try {
            lrclasepoliza = em.createQuery("Select l from Lrclasepoliza l", Lrclasepoliza.class)
                    .getResultList();

            for (Lrclasepoliza l : lrclasepoliza) {
                map.put(l.getLrclasepolizadesc().toUpperCase(), l);
            }
        } catch (Exception e) {

        }
        return map;
    }

}
