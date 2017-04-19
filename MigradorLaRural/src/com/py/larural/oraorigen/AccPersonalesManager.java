/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oraorigen;

import entidades.larural.origen.AccPersonales;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chiq
 */
public class AccPersonalesManager extends AbstractManagerOrigen<AccPersonales> {

    public AccPersonalesManager(Class<AccPersonales> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public List<AccPersonales> obtenerAccPersonales(short secc, short ejercicio, short anexo, short tipoSeguro, short tipoOperacion, int polNro, int item) {
        List<AccPersonales> accPersonalesList = new ArrayList<>();

        accPersonalesList = em.createQuery("Select c from AccPersonales c  where "
                + " c.accPersonalesPK.anexo = :anexo "
                + "and c.accPersonalesPK.ejercicio = :ejercicio "
                + "and c.accPersonalesPK.polnro = :polNro "
                + "and c.accPersonalesPK.secc = :secc "
                + "and c.accPersonalesPK.tipoOperacion = :tipoOperacion "
                + "and c.accPersonalesPK.tipoSeguro = :tipoSeguro "
                + "and c.accPersonalesPK.item = :item")
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
