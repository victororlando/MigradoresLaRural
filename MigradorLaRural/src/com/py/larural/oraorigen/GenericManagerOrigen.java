/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oraorigen;

/**
 *
 * @author chiq
 */
public class GenericManagerOrigen<B> extends AbstractManagerOrigen<B> {

    public GenericManagerOrigen(Class<B> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

        public GenericManagerOrigen(Class<B> entityClass) {
        super(entityClass, "MigradorLaRuralOrigenPU");
    }


}
