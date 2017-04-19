/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oraorigen;

import entidades.larural.origen.CoberturasDetalle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author chiq
 */
public class CoberturasDetalleManager extends AbstractManagerOrigen<CoberturasDetalle> {

    public CoberturasDetalleManager(Class<CoberturasDetalle> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public CoberturasDetalle obtenerCoberturasDetalle(short secc, short ejercicio, short anexo, short tipoSeguro, int item, short tipoOperacion, int polNro) {
        List<CoberturasDetalle> coberturasDetalleList = new ArrayList<>();

        coberturasDetalleList = em.createQuery("Select c from CoberturasDetalle c  where "
                + "c.coberturasDetallePK.anexo = :anexo "
                + "and c.coberturasDetallePK.ejercicio = :ejercicio "
                + "and c.coberturasDetallePK.polnro = :polNro "
                + "and c.coberturasDetallePK.secc = :secc "
                + "and c.coberturasDetallePK.tipoOperacion = :tipoOperacion "
                + "and c.coberturasDetallePK.tipoSeguro = :tipoSeguro "
                + "and c.coberturasDetallePK.item = :item ")
                .setParameter("secc", secc)
                .setParameter("ejercicio", ejercicio)
                .setParameter("anexo", anexo)
                .setParameter("tipoSeguro", tipoSeguro)
                .setParameter("item", item)
                .setParameter("tipoOperacion", tipoOperacion)
                .setParameter("polNro", polNro)
                .getResultList();

        if (!coberturasDetalleList.isEmpty()) {
            return coberturasDetalleList.get(0);
        }

        return null;
    }

}
