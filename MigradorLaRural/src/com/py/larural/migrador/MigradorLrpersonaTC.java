/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.migrador;

import com.py.larural.oradestino.LrPersonaManager;
import com.py.larural.oraorigen.PolsdemiManager;
import entidades.larural.destino.Lrpersona;
import entidades.larural.destino.Lrpersonatc;
import entidades.larural.destino.LrpersonatcPK;
import entidades.larural.origen.Polsdemi;
import entidades.larural.origen.Tarjetas;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author victoro
 */
public class MigradorLrpersonaTC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tiempoInicio, tiempoFin;
        tiempoInicio = System.currentTimeMillis();
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("MigradorLaRuralPU");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

        short secc[] = {201, 401,403, 1301,1302,1303,1304,501,1401,1402,1403,1404,1405,1001,1003,1019,301,302,303,304,104,106,113};
        short ejercicio = 2017;
        short anexo = 0;
        short estado = 1;
        short tipoOperacion = 1;

        //Managers
        PolsdemiManager polsdemiManager = new PolsdemiManager(Polsdemi.class, "MigradorLaRuralOrigenPU");
        LrPersonaManager lrPersonaManager = new LrPersonaManager(Lrpersona.class, "MigradorLaRuralPU");

        //Map de valores
        Map<Long, Lrpersona> mapLrPersona = lrPersonaManager.obtenerLrPersonasConAseId();
//        Map<String, Tarjetas> tarjetasMap = polsdemiManager.obtenerTarjetas(secc, ejercicio, anexo);

        int countAux = 0;
        int countPolsdemi = polsdemiManager.count(secc, ejercicio, anexo, estado, tipoOperacion);
        System.out.println("Cantidad de registros a migrar: " + countPolsdemi);

        int persistCount = 1;

        int nulos = 0;
        int id = 1;
        while (countAux < countPolsdemi) {
            List<Polsdemi> polsdemiList = polsdemiManager.obtenerPolsdemi(ejercicio, anexo, new int[]{countAux, 100 + countAux}, estado, tipoOperacion);                        
            for (Polsdemi pol : polsdemiList) {
                if (mapLrPersona.get(pol.getNAseg().getNAseg().longValue()) != null) {
                    
                    if (pol.getNroTarjeta() != null && !pol.getNroTarjeta().isEmpty()) {
//                    Si polsdemi.nro_tarjeta no es vacío entonces se pagó con TC. Ver Tabla Tarjetas para insertar en LRPErsonaTC y si la tarjeta es de un asegurado guardar en este campo el número de asegurado sino es null
                        Tarjetas t = polsdemiManager.obtenerTarjeta(pol.getNroTarjeta());
                        if (t != null) {
                            Lrpersonatc lrpt = new Lrpersonatc();
                            LrpersonatcPK lrptPk = new LrpersonatcPK();

                            if (mapLrPersona.get(pol.getNAseg().getNAseg().longValue()) != null) { // no deberia retornar null
                                lrptPk.setLrpersonaid(mapLrPersona.get(pol.getNAseg().getNAseg().longValue()).getLrpersonaid());
                                mapLrPersona.remove(pol.getNAseg().getNAseg().longValue());
                            }

                            lrptPk.setLrpersonatcid(id);
                            lrpt.setLrpersonatcPK(lrptPk);
                            lrpt.setEntidadid((pol.getCodEntidad() != null ? Long.parseLong(pol.getCodEntidad().toString()) : null));
                            lrpt.setLrpersonatcnro(pol.getNroTarjeta());
                            lrpt.setLrpersonatcvto(t.getVtoTarjeta());
                            lrpt.setLrpersonatcpin(t.getPin());
                            lrpt.setLrpersonausu((short) 0);
                            lrpt.setLrpersonatctitular(t.getTitular());
                            lrpt.setLrpersonahab((short) 1);
                            lrpt.setLrpersonarcprioridad(t.getPrioridad());
                            lrpt.setLrpersonatclineacredito(t.getLineaCredito());
                            lrpt.setLrpersonatcexterno(t.getTitutarExterno());
                            lrpt.setLrpersonatcaseg(t.getTarjetasPK().getNAseg());
//                            System.out.println(lrptPk + " Nro. tc: " + t.getTarjetasPK().getNroTarjeta());
                            id++;
                            
                            //persist lrpersonatc

                            entitymanager.persist(lrpt);
                            if ((persistCount % 1) == 0) {
                                entitymanager.getTransaction().commit();
                                entitymanager.clear();
                                entitymanager.getTransaction().begin();
                                System.out.println("commit: " + persistCount);
                            }
                            persistCount++;
                        }
                    }
                }
            }
            countAux = countAux + 100;
            System.out.println("Procesado: " + countAux);
        }
        System.out.println("Persistido: " + (persistCount - 1) + "registros");
        entitymanager.getTransaction().commit();
        entitymanager.close();
        tiempoFin = System.currentTimeMillis();
        System.out.println("Tiempo proceso: " + (((tiempoFin - tiempoInicio) / 1000) / 60));
    }

}
