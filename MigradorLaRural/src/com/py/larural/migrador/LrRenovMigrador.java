/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.migrador;

import com.py.larural.oradestino.LrRenovManager;
import com.py.larural.oraorigen.PolsdemiManager;
import entidades.larural.destino.Lrrenov;
import entidades.larural.origen.Polsdemi;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author victoro
 */
public class LrRenovMigrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tiempoInicio, tiempoFin;
        tiempoInicio = System.currentTimeMillis();
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("MigradorLaRuralPU");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

        //Managers
        PolsdemiManager polsdemiManager = new PolsdemiManager(Polsdemi.class, "MigradorLaRuralOrigenPU");
        LrRenovManager lrrenovManager = new LrRenovManager(Lrrenov.class, "MigradorLaRuralPU");

        long lrrenovIdActual = lrrenovManager.lastId();

        int countAux = 0;
        int countPolsdemi = polsdemiManager.count();
        System.out.println("Cantidad de registros a migrar: " + countPolsdemi);

        int persistCount = 1;

        

        short anexo = 0;
        
        while (countAux < countPolsdemi) {
            List<Polsdemi> polsdemiList = polsdemiManager.obtenerPolsdemiLrrenov(anexo,new int[]{countAux, 100 + countAux});

            for (Polsdemi pol : polsdemiList) {
                lrrenovIdActual += 1;
                Lrrenov lrr = new Lrrenov();
//                lrr.setLrrenovid(lrrenovIdActual); //tiene secuencia
                lrr.setLrrenovtiposeg(pol.getPolsdemiPK().getTipoSeguro());
                lrr.setLrrenovtipoope(pol.getPolsdemiPK().getTipoOperacion());
                lrr.setLrrenovejercicio(pol.getPolsdemiPK().getEjercicio());
                lrr.setLrrenovsecc(pol.getPolsdemiPK().getSecc());
                lrr.setLrrenovpoliza(pol.getPolsdemiPK().getPolnro());
                lrr.setLrrenovanexo(pol.getPolsdemiPK().getAnexo());
                lrr.setLrrenovsumaaseg(new BigDecimal((pol.getSumaseg())));
                lrr.setLrrenovprimatec(new BigDecimal(pol.getPrima()));
                lrr.setLrrenovgastosadm(new BigDecimal(pol.getGtosAdmi()));
                lrr.setLrrenovrpf(new BigDecimal(pol.getRpf()));
                lrr.setLrrenovotros(new BigDecimal(pol.getOtros()));
                lrr.setLrrenovprimacom(new BigDecimal(pol.getPremio() - pol.getIva()));
                lrr.setLrrenoviva(new BigDecimal(pol.getIva()));
                lrr.setLrrenovpremio(new BigDecimal(pol.getPremio()));
                lrr.setLrrenovporccomagte(pol.getPorcComag());
                lrr.setLrrenovimpcomagte(new BigDecimal(pol.getImpComag()));
                lrr.setLrrenoventregaini(new BigDecimal(pol.getInicial()));
                lrr.setLrrenovcantcuotas(pol.getNroCuotas());
                lrr.setLrrenovimpcuotas(pol.getImpCuotas());
                lrr.setLrrenovual("miguser");
                lrr.setLrrenovfal(new Date());

//                descomentar para persistir
                entitymanager.persist(lrr);
                if ((persistCount % 5000) == 0) {
                    entitymanager.getTransaction().commit();
                    entitymanager.clear();
                    entitymanager.getTransaction().begin();
                    System.out.println("commit: " + persistCount);
                }
                persistCount++;

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
