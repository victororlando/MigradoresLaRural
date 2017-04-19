/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.oraorigen;

import entidades.larural.origen.Polsdemi;
import entidades.larural.origen.ProauemiMe;
import entidades.larural.origen.Tarjetas;
import java.math.BigDecimal;
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
public class PolsdemiManager extends AbstractManagerOrigen<Polsdemi> {

    public PolsdemiManager(Class<Polsdemi> entityClass, String persitenceUnitName) {
        super(entityClass, persitenceUnitName);
    }

    public List obtenerPolsdemi(short secc, short ejercicio, short anexo, int[] range, short estado, short tipoOperacion) {
        List<Polsdemi> devolver = new ArrayList<>();
        try {
            devolver = em.createQuery("Select p from Polsdemi p where p.polsdemiPK.anexo = :anexo and p.polsdemiPK.ejercicio = :ejercicio and p.polsdemiPK.secc = :secc and p.estado = :estado and p.polsdemiPK.tipoOperacion = :tipoOperacion ")
                    .setParameter("secc", secc)
                    .setParameter("estado", estado)
                    .setParameter("tipoOperacion", tipoOperacion)
                    .setParameter("ejercicio", ejercicio)
                    .setParameter("anexo", anexo)
                    .setMaxResults(range[1] - range[0])
                    .setFirstResult(range[0])
                    .getResultList();
        } catch (Exception e) {

        }
        return devolver;
    }

    public List obtenerPolsdemi(short ejercicio, short anexo, int[] range, short estado, short tipoOperacion) {
        List<Polsdemi> devolver = new ArrayList<>();
        try {
            devolver = em.createQuery("Select p from Polsdemi p where p.polsdemiPK.anexo = :anexo and p.polsdemiPK.ejercicio = :ejercicio and p.estado = :estado and p.polsdemiPK.tipoOperacion = :tipoOperacion ")
                    .setParameter("estado", estado)
                    .setParameter("tipoOperacion", tipoOperacion)
                    .setParameter("ejercicio", ejercicio)
                    .setParameter("anexo", anexo)
                    .setMaxResults(range[1] - range[0])
                    .setFirstResult(range[0])
                    .getResultList();
        } catch (Exception e) {

        }
        return devolver;
    }

    public List obtenerPolsdemi(short secc[], short ejercicio, short anexo, int[] range, short estado, short tipoOperacion) {
        List<Short> seccList = new ArrayList<>();

        for (int i = 0; i < secc.length; i++) {
            seccList.add(secc[i]);
        }

        List<Polsdemi> devolver = new ArrayList<>();
        try {
            devolver = em.createQuery("Select p from Polsdemi p where p.polsdemiPK.anexo = :anexo and p.polsdemiPK.ejercicio = :ejercicio and p.polsdemiPK.secc in :secc and p.estado = :estado and p.polsdemiPK.tipoOperacion = :tipoOperacion ")
                    .setParameter("secc", seccList)
                    .setParameter("estado", estado)
                    .setParameter("tipoOperacion", tipoOperacion)
                    .setParameter("ejercicio", ejercicio)
                    .setParameter("anexo", anexo)
                    .setMaxResults(range[1] - range[0])
                    .setFirstResult(range[0])
                    .getResultList();
        } catch (Exception e) {

        }
        return devolver;
    }

    public int count(short secc, short ejercicio, short anexo, short estado, short tipoOperacion) {
        Long devolver = null;
        try {
            devolver = (Long) em.createQuery("Select count(p) from Polsdemi p where p.polsdemiPK.anexo = :anexo and p.polsdemiPK.ejercicio = :ejercicio and p.polsdemiPK.secc = :secc and p.estado = :estado and p.polsdemiPK.tipoOperacion = :tipoOperacion")
                    .setParameter("secc", secc)
                    .setParameter("estado", estado)
                    .setParameter("tipoOperacion", tipoOperacion)
                    .setParameter("ejercicio", ejercicio)
                    .setParameter("anexo", anexo)
                    .getSingleResult();

            if (devolver == null) {
                return 0;
            }

        } catch (Exception e) {
            Logger.getLogger("PolsdemiManager").log(Level.INFO, "Se produjo un error al ejecutar count");
        }
        return devolver.intValue();
    }

    public int count(short secc[], short ejercicio, short anexo, short estado, short tipoOperacion) {
        Long devolver = null;
        List<Short> seccList = new ArrayList<>();

        for (int i = 0; i < secc.length; i++) {
            seccList.add(secc[i]);
        }

        try {
            devolver = (Long) em.createQuery("Select count(p) from Polsdemi p where p.polsdemiPK.anexo = :anexo and p.polsdemiPK.ejercicio = :ejercicio and p.polsdemiPK.secc in :secc and p.estado = :estado and p.polsdemiPK.tipoOperacion = :tipoOperacion")
                    .setParameter("secc", seccList)
                    .setParameter("estado", estado)
                    .setParameter("tipoOperacion", tipoOperacion)
                    .setParameter("ejercicio", ejercicio)
                    .setParameter("anexo", anexo)
                    .getSingleResult();

            if (devolver == null) {
                return 0;
            }

        } catch (Exception e) {
            Logger.getLogger("PolsdemiManager").log(Level.INFO, "Se produjo un error al ejecutar count");
        }
        return devolver.intValue();
    }

    public Map<String, Tarjetas> obtenerTarjetas(short secc, short ejercicio, short anexo) {
        Map<String, Tarjetas> map = new HashMap<>();
        try {
            List<Tarjetas> aux = em.createNativeQuery("Select t.* from Tarjetas t, polsdemi p where t.nro_tarjeta = p.NRO_TARJETA and p.anexo = ? and p.ejercicio = ? and p.secc = ?", Tarjetas.class)
                    .setParameter(1, anexo)
                    .setParameter(2, ejercicio)
                    .setParameter(3, secc)
                    .getResultList();

            for (Tarjetas t : aux) {
                map.put(t.getTarjetasPK().getNroTarjeta(), t);
            }
        } catch (Exception e) {
            Logger.getLogger("PolsdemiManager").log(Level.INFO, "Se produjo un error al obtener tarjetas relacionadas");
        }
        return map;
    }

    public Map<String, Tarjetas> obtenerTarjetas(short[] secc, short ejercicio, short anexo) {
        Map<String, Tarjetas> map = new HashMap<>();
        List<Short> seccList = new ArrayList<>();

        for (int i = 0; i < secc.length; i++) {
            seccList.add(secc[i]);
        }

        try {
            List<Tarjetas> aux = em.createNativeQuery("Select t.* from Tarjetas t, polsdemi p where t.nro_tarjeta = p.NRO_TARJETA and p.anexo = ? and p.ejercicio = ? and p.secc in (?)", Tarjetas.class)
                    .setParameter(1, anexo)
                    .setParameter(2, ejercicio)
                    .setParameter(3, seccList)
                    .getResultList();

            for (Tarjetas t : aux) {
                map.put(t.getTarjetasPK().getNroTarjeta(), t);
            }
        } catch (Exception e) {
            Logger.getLogger("PolsdemiManager").log(Level.INFO, "Se produjo un error al obtener tarjetas relacionadas");
        }
        return map;
    }

    public List<Object[]> obtenerPolsdemiParaAutomoviles(short secc, short ejercicio, short anexo, int[] range, short estado, short tipoOperacion) {
        List<Object[]> ode = null;
//       
        try {
            String sql = "select pro.secc,pro.ejercicio,pro.polnro,pro.nro_cotizacion,pa.nro_flota, pol.n_aseg, pa.CLASE_ASEG_MANUAL, pro.ANEXO, "
                    + " pa.NRO_FLOTA, pro.TIPO_FLOTA, pa.CLASE_POLIZA_MANUAL, pol.NRO_TARJETA, pol.TIPO_SEGURO, pol.TIPO_OPERACION, pol.COD_MONEY, pro.casco, pol.CANT_ITEM, "
                    + " pro.COD_TIPO, pro.COD_MARCA, pro.COD_MODELO, pro.ANO,pro.NRO_MOTOR, pro.CASCO, pro.NRO_CHASIS, pro.NRO_CHAPA, pro.CAP_RP_RT, pro.TIPO_IMPORTACION, "
                    + " pro.CILINDRADAS, pro.TIPO_TRANSMISION, pro.eje, pro.TRACCION,pro.COD_COLOR, pro.TIPO_COMBUST, pro.NRO_PUERTA, pro.COD_PROCEDENCIA, pro.DESTINADO_A, pro.CARTA, pro.CANT_OCUPANTES, pro.nro_propuesta "
                    + " from softten.polsdemi pol, softten.proauemi pro, softten.propauto pa "
                    + " where pro.nro_cotizacion > 0 "
                    + " and pol.ejercicio = ? "
                    + " and pol.tipo_operacion = ? "
                    + " and pol.estado = ? "
                    + " and pol.anexo = ?"
                    + " and pol.secc = ? "
                    + " and pol.ejercicio = pro.ejercicio "
                    + " and pol.secc = pro.secc "
                    + " and pol.polnro = pro.polnro and pol.anexo = pro.anexo and pol.tipo_operacion =  pro.tipo_operacion "
                    + " and pol.tipo_seguro = pro.tipo_seguro "
                    + " and pa.nro_propuesta = pro.nro_propuesta";
            ode = em.createNativeQuery(sql)
                    .setParameter(1, ejercicio)
                    .setParameter(2, tipoOperacion)
                    .setParameter(3, estado)
                    .setParameter(4, anexo)
                    .setParameter(5, secc)
                    .setMaxResults(range[1] - range[0])
                    .setFirstResult(range[0])
                    .getResultList();

        } catch (Exception e) {
            Logger.getLogger("PolsdemiManager").log(Level.ALL, "No se pudo obtener los registros de polsdemi para migrar automoviles");
        }

        return ode;
    }

    public int countPolsdemiParaAutomoviles(short secc, short ejercicio, short anexo, short estado, short tipoOperacion) {
        BigDecimal devolver = null;
        try {
            String sql = "select count(*) "
                    + " from softten.polsdemi pol, softten.proauemi pro, softten.propauto pa "
                    + " where pro.nro_cotizacion > 0 "
                    + " and pol.ejercicio = ? "
                    + " and pol.tipo_operacion = ? "
                    + " and pol.estado = ? "
                    + " and pol.anexo = ?"
                    + " and pol.secc = ? "
                    + " and pol.ejercicio = pro.ejercicio "
                    + " and pol.secc = pro.secc "
                    + " and pol.polnro = pro.polnro and pol.anexo = pro.anexo and pol.tipo_operacion =  pro.tipo_operacion "
                    + " and pol.tipo_seguro = pro.tipo_seguro "
                    + " and pa.nro_propuesta = pro.nro_propuesta";
            devolver = (BigDecimal) em.createNativeQuery(sql)
                    .setParameter(1, ejercicio)
                    .setParameter(2, tipoOperacion)
                    .setParameter(3, estado)
                    .setParameter(4, anexo)
                    .setParameter(5, secc)
                    .getSingleResult();

            if (devolver == null) {
                return 0;
            }

        } catch (Exception e) {
            Logger.getLogger("PolsdemiManager").log(Level.ALL, "No se pudo obtener los registros de polsdemi para migrar automoviles");
        }

        return devolver.intValue();
    }

    public ProauemiMe obtnerProaumiMe(short secc, short ejercicio, short anexo, short tipoOperacion, int polNro, int item) {
        ProauemiMe devolver = null;
        try {
            devolver = em.createQuery("Select p from ProauemiMe p  "
                    + " where p.proauemiMePK.secc = :secc "
                    + " and p.proauemiMePK.ejercicio = :ejercicio "
                    + " and p.proauemiMePK.anexo = :anexo "
                    + " and p.proauemiMePK.tipoOperacion = :tipoOperacion "
                    + " and p.proauemiMePK.polnro = :polNro "
                    + " and p.proauemiMePK.item = :item ", ProauemiMe.class)
                    .setParameter("secc", secc)
                    .setParameter("ejercicio", ejercicio)
                    .setParameter("anexo", anexo)
                    .setParameter("tipoOperacion", tipoOperacion)
                    .setParameter("polNro", polNro)
                    .setParameter("item", item)
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println("Se produjo un erro al obtener ProauemiMe con valores secc: " + secc + " ejercicio: "
                    + ejercicio + " anexo: " + anexo + " tipoOperacion: " + tipoOperacion + " polNro: " + polNro + " item: " + item);
        }
        return devolver;
    }

    public Tarjetas obtenerTarjeta(String nroTarjeta) {
        Tarjetas t = null;
        try {
            t = em.createQuery("Select t from Tarjetas t where t.tarjetasPK.nroTarjeta = :nroTarjeta", Tarjetas.class)
                    .setParameter("nroTarjeta", nroTarjeta)
                    .getSingleResult();
        } catch (Exception e) {

        }
        return t;
    }

    public BigDecimal obtenerPorcComag(short secc, int polNro, int nroPropuesta) {
        BigDecimal devolver = null;
        try {
            devolver = (BigDecimal) em.createNativeQuery("select a.porc_comag from proauemi p,agteindi_auto_aux a "
                    + " where p.nro_propuesta = a.nro_propuesta "
                    + " and p.secc = ? and p.polnro = ? and p.nro_propuesta = ?")
                    .setParameter(1, secc)
                    .setParameter(2, polNro)
                    .setParameter(3, nroPropuesta)
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println("Se produjo un error al obtener porc_comag. secc: " + secc + " polnro: " + polNro + " nroPropuesta: " + nroPropuesta);
        }
        return devolver;
    }

    public BigDecimal obtenerImpComisionContrato(short secc, int polNro, int nroPropuesta) {
        BigDecimal devolver = BigDecimal.ZERO;
        try {
            devolver = (BigDecimal) em.createNativeQuery("select a.imp_comision from proauemi p,agteindi_auto_aux a "
                    + " where p.nro_propuesta = a.nro_propuesta "
                    + " and p.secc = ? and p.polnro = ? and p.nro_propuesta = ?")
                    .setParameter(1, secc)
                    .setParameter(2, polNro)
                    .setParameter(3, nroPropuesta)
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println("No se pudo obtener imp_comision. secc: " + secc + " polNro: " + polNro + " nroPropuesta: " + nroPropuesta);
        }
        return devolver;
    }

    public List obtenerPolsdemiLrrenov(short anexo, int[] range) {

     

        List<Polsdemi> devolver = new ArrayList<>();
        try {
            devolver = em.createQuery("Select p from Polsdemi p where p.polsdemiPK.anexo = :anexo ")
                    .setParameter("anexo", anexo)
                    .setMaxResults(range[1] - range[0])
                    .setFirstResult(range[0])
                    .getResultList();
        } catch (Exception e) {

        }
        return devolver;
    }

}
