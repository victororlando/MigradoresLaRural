/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oraorigen;

import entidades.larural.origen.Beneficiarios;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chiq
 */
public class BeneficiarioManager extends AbstractManagerOrigen<Beneficiarios> {

    public BeneficiarioManager(Class<Beneficiarios> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public List<Beneficiarios> obtenerBeneficiario(short secc, short ejercicio, short anexo, short tipoSeguro, short tipoOperacion, int polNro, short item) {
        List<Beneficiarios> accPersonalesList = new ArrayList<>();

        accPersonalesList = em.createQuery("Select b from Beneficiarios b  where "
                + " b.beneficiariosPK.anexo = :anexo "
                + "and b.beneficiariosPK.ejercicio = :ejercicio "
                + "and b.beneficiariosPK.polnro = :polNro "
                + "and b.beneficiariosPK.secc = :secc "
                + "and b.beneficiariosPK.tipoOperacion = :tipoOperacion "
                + "and b.item = :item "
                + "and b.beneficiariosPK.tipoSeguro = :tipoSeguro ")
                .setParameter("secc", secc)
                .setParameter("ejercicio", ejercicio)
                .setParameter("anexo", anexo)
                .setParameter("tipoSeguro", tipoSeguro)
                .setParameter("tipoOperacion", tipoOperacion)
                .setParameter("item", item)
                .setParameter("polNro", polNro)
                .getResultList();

        return accPersonalesList;
    }

}
