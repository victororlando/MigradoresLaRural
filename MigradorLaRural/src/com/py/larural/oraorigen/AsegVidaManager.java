/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oraorigen;

import entidades.larural.origen.AsegVida;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chiq
 */
public class AsegVidaManager extends AbstractManagerOrigen<AsegVida> {

    public AsegVidaManager(Class<AsegVida> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public List obtenerAsegVida(int[] range) {
        List<Short> seccList = new ArrayList<>();
        List<AsegVida> devolver = new ArrayList<>();
        try {
            devolver = em.createQuery("Select  a from AsegVida a")
                    .setMaxResults(range[1] - range[0])
                    .setFirstResult(range[0])
                    .getResultList();
        } catch (Exception e) {

        }
        return devolver;
    }

    public int count() {
        Long devolver = null;
        try {
            devolver = (Long) em.createQuery("Select  count(a) from AsegVida a")                    
                    .getSingleResult();

            if (devolver == null) {
                return 0;
            }

        } catch (Exception e) {
            Logger.getLogger("AsegVidaManager").log(Level.INFO, "Se produjo un error al ejecutar count");
        }
        return devolver.intValue();
    }


}
