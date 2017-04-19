/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oradestino;

/**
 *
 * @author chiq
 */
public class GenericManagerDestino<B> extends AbstractManagerDestino<B> {

    public GenericManagerDestino(Class<B> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public GenericManagerDestino(Class<B> entityClass) {
        super(entityClass, "MigradorLaRuralPU");
    }

    public Object genericFind(String field, String valor) {
        return super.genericFind(field, valor);
    }

    public Object find(Long id) {
        return super.find(id);
    }

}
