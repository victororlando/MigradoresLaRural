/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oraorigen;

import entidades.larural.origen.Certvida;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chiq
 */
public class CertVidaManager extends AbstractManagerOrigen<Certvida> {

    public CertVidaManager(Class<Certvida> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public List<Certvida> obtenerCertvida(short secc, short ejercicio, short anexo, short tipoSeguro, short tipoOperacion, int polNro, int item) {
        List<Certvida> accPersonalesList = new ArrayList<>();

        accPersonalesList = em.createQuery("Select c from Certvida c  where "
                + " c.certvidaPK.anexo = :anexo "
                + "and c.certvidaPK.ejercicio = :ejercicio "
                + "and c.certvidaPK.polnro = :polNro "
                + "and c.certvidaPK.secc = :secc "
                + "and c.certvidaPK.tipoOperacion = :tipoOperacion "
                + "and c.certvidaPK.tipoSeguro = :tipoSeguro "
                + "and c.item = :item")
                .setParameter("secc", secc)
                .setParameter("ejercicio", ejercicio)
                .setParameter("anexo", anexo)
                .setParameter("tipoSeguro", tipoSeguro)
                .setParameter("tipoOperacion", tipoOperacion)
                .setParameter("polNro", polNro)
                .setParameter("item", item)
                .getResultList();

        return accPersonalesList;
    }

}
