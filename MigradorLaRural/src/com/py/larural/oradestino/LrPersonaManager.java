/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oradestino;

import entidades.larural.destino.Lrpersona;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chiq
 */
public class LrPersonaManager extends AbstractManagerDestino<Lrpersona> {

    public LrPersonaManager(Class<Lrpersona> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public Map<Long, Lrpersona> obtenerLrPersonasConAseId() {
        List<Lrpersona> lista = new ArrayList<>();
        try {
            lista = em.createQuery("Select l from Lrpersona l where l.lrpersonaaseid is not null and l.lrpersonaaseid <> 0")
                    .getResultList();
        } catch (Exception e) {
            Logger.getLogger("LrPersonaManager").log(Level.INFO, "Se produjo un error al obtener la lista de personas con lrpersonaaseid not null");
        }

        Map<Long, Lrpersona> mapLrPersona = new HashMap<>();

        for (Lrpersona lrp : lista) {
            mapLrPersona.put(lrp.getLrpersonaaseid(), lrp);
        }

        return mapLrPersona;
    }

    public Lrpersona obtenerPersona(String nroDocumento) {
        Lrpersona lrPersonaDevolver = null;
        try {
            lrPersonaDevolver = em.createQuery("Select l from Lrpersona l where l.lrpersonanrodoc = :nroDocumento ", Lrpersona.class)
                    .setParameter("nroDocumento", nroDocumento)
                    .getSingleResult();
        } catch (Exception e) {

        }
        return lrPersonaDevolver;
    }

    public Lrpersona obtenerPersona(String nroDocumento, short tipoDocumento) {
        Lrpersona lrPersonaDevolver = null;
        try {
            lrPersonaDevolver = em.createQuery("Select l from Lrpersona l where l.lrpersonanrodoc = :nroDocumento and l.lrpersonadoctip = :tipoDocumento", Lrpersona.class)
                    .setParameter("nroDocumento", nroDocumento)
                    .setParameter("tipoDocumento", tipoDocumento)
                    .getSingleResult();
        } catch (Exception e) {

        }
        return lrPersonaDevolver;
    }

}
