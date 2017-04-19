/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oradestino;

import entidades.larural.destino.Lrpersonatc;

/**
 *
 * @author chiq
 */
public class LrPersonaTcManager extends AbstractManagerDestino<Lrpersonatc> {

    public LrPersonaTcManager(Class<Lrpersonatc> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public Lrpersonatc obtnerTarjeta(String nroTarjeta){
        Lrpersonatc devolver = null;
        try{
            devolver = em.createQuery("Select t from Lrpersonatc t where t.lrpersonatcnro = :nroTarjeta", Lrpersonatc.class)
                    .setParameter("nroTarjeta", nroTarjeta)
                    .getSingleResult();
        }catch(Exception e){
            
        }
        return devolver;
    }
    
}
