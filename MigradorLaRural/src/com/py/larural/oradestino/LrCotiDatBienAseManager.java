/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oradestino;

import entidades.larural.destino.Lrcotidatbienase;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chiq
 */
public class LrCotiDatBienAseManager extends AbstractManagerDestino<Lrcotidatbienase> {

    public LrCotiDatBienAseManager(Class<Lrcotidatbienase> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public Long lastId() {
        Long id = null;
        BigDecimal auxid = null;
        try {
           auxid  = (BigDecimal) em.createNativeQuery("Select max(LRCOTIDATBIENASEID) from Lrcotidatbienase")
                    .getSingleResult();
            if (auxid == null) {
                id = 0L;
            }else{
                id = auxid.longValue();
            }
        } catch (Exception e) {
            Logger.getLogger("LrCotiDatBienAseManager").log(Level.ALL, "Error");
        }
        return id;
    }

}
