/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oradestino;

import entidades.larural.destino.Lrclaseaseg;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author chiq
 */
public class LrClaseAsegManager extends AbstractManagerDestino<Lrclaseaseg> {

    public LrClaseAsegManager(Class<Lrclaseaseg> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public Map<String, Lrclaseaseg> obtenerMapaDeRegistros() {
        List<Lrclaseaseg> listClaseAseg;
        Map<String, Lrclaseaseg> map = new HashMap<>();
        try {
            listClaseAseg = em.createQuery("Select l from Lrclaseaseg l", Lrclaseaseg.class)
                    .getResultList();

            for (Lrclaseaseg l : listClaseAseg) {
                map.put(l.getLrclaseasegdesc().toUpperCase(), l);
            }
        } catch (Exception e) {

        }
        return map;
    }

}
