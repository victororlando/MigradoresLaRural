/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oraorigen;

import entidades.larural.origen.ItemDePolizas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author chiq
 */
public class ItemDePolizasManager extends AbstractManagerOrigen<ItemDePolizas> {

    public ItemDePolizasManager(Class<ItemDePolizas> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public Map<String, List<ItemDePolizas>> obtenerMapItemsNoRepetidos(List<ItemDePolizas> itemsList) {
        Map<String, List<ItemDePolizas>> map = new HashMap<>();

        for (ItemDePolizas i : itemsList) {
            if (!map.containsKey(i.getUbivia())) {
                map.put(i.getUbivia(), new ArrayList<>());
            }
        }

        for (ItemDePolizas i : itemsList) {
            map.get(i.getUbivia()).add(i);

        }

        return map;
    }

    public Map<String, List<ItemDePolizas>> obtenerMapItemsNoRepetidos(short secc, short ejericio, short anexo, short tipoSeguro, short tipoOperacion, int polNro) {
        Map<String, List<ItemDePolizas>> map = new HashMap<>();
        List<ItemDePolizas> itemsList = new ArrayList<>();

        itemsList = em.createQuery("Select i from ItemDePolizas i "
                + " where i.itemDePolizasPK.secc = :secc "
                + " and i.itemDePolizasPK.ejercicio = :ejercicio"
                + " and i.itemDePolizasPK.anexo = :anexo"
                + " and i.itemDePolizasPK.tipoSeguro = :tipoSeguro "
                + " and i.itemDePolizasPK.tipoOperacion = :tipoOperacion "
                + " and i.itemDePolizasPK.polnro = :polNro ")
                .setParameter("secc", secc)
                .setParameter("ejercicio", ejericio)
                .setParameter("anexo", anexo)
                .setParameter("tipoSeguro", tipoSeguro)
                .setParameter("tipoOperacion", tipoOperacion)
                .setParameter("polNro", polNro)
                .getResultList();

        for (ItemDePolizas i : itemsList) {
            if (!map.containsKey(i.getUbivia())) {
                map.put(i.getUbivia(), new ArrayList<>());
            }
        }

        for (ItemDePolizas i : itemsList) {
            map.get(i.getUbivia()).add(i);

        }

        return map;
    }

}
