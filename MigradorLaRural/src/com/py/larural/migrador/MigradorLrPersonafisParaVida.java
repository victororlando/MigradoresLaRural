/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.migrador;

import com.py.larural.oradestino.LrPersonaManager;
import com.py.larural.oraorigen.AsegVidaManager;
import entidades.larural.destino.Lrpersona;
import entidades.larural.destino.Lrpersonafis;
import entidades.larural.origen.AsegVida;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author victoro
 */
public class MigradorLrPersonafisParaVida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tiempoInicio, tiempoFin;
        tiempoInicio = System.currentTimeMillis();
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("MigradorLaRuralPU");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

        short secc = 201;
        short ejercicio = 2017;
        short anexo = 0;
        short estado = 1;
        short tipoOperacion = 1;

        //Managers
        AsegVidaManager asegVidaManager = new AsegVidaManager(AsegVida.class, "MigradorLaRuralOrigenPU");
        LrPersonaManager lrPersonaManager = new LrPersonaManager(Lrpersona.class, "MigradorLaRuralPU");
        //Entidades especificas
        //Map de valores
        //Listas
        int countAux = 0;
        int countAsegVida = asegVidaManager.count();
        System.out.println("Cantidad de registros a migrar: " + countAsegVida);

        int persistCount = 1;

        int nulos = 0;
        while (countAux < countAsegVida) {
            List<AsegVida> asegVidaList = asegVidaManager.obtenerAsegVida(new int[]{countAux, 50 + countAux});

            for (AsegVida aseg : asegVidaList) {
                Lrpersona lrPersona = lrPersonaManager.obtenerPersona(aseg.getDocumento(), aseg.getTipoDocumento().getCodTipo());
                if (lrPersona != null) {

                    Lrpersonafis lrpf = new Lrpersonafis();
                    lrpf.setLrpersonafisid(lrPersona.getLrpersonaid());
                    lrpf.setLrpersonafisnombres(aseg.getNombAseg());
                    lrpf.setLrpersonafisapellidos(null);
                    if (aseg.getSexo() != null) {
                        if (aseg.getSexo() == 1) {
                            lrpf.setLrpersonafissex('M');
                        } else {
                            lrpf.setLrpersonafissex('F');
                        }
                    }
                    lrpf.setLrpersonafisfchnac(aseg.getFechaNacimiento());
                    lrpf.setLrpersonafisedad(null);
                    lrpf.setLrprofid(aseg.getProfesion().getProfesionPK().getProfesion());
                    lrpf.setLrnacionalidadid(null);
                    lrpf.setLrcargoid(null);
                    lrpf.setLrareaid(null);
                    lrpf.setLrpersonafiscargoantig(null);
                    lrpf.setLrpersonafisantiguedad(null);
                    lrpf.setLrpersonafisestcivil(null);
                    lrpf.setLrpersonafislugartrab(null);
                    lrpf.setLrdepidlaboral(null);
                    lrpf.setLrciuidlaboral(null);
                    lrpf.setLrpaisidresidencia(null);
                    lrpf.setLrpersonafisdirlaboral(null);
                    lrpf.setLrpersonafisdoctip(null);
                    lrpf.setLrpersonafisseccid(null);
                    lrpf.setLrpersonafistipoentidadid(null);
                    entitymanager.persist(lrpf);
                    if ((persistCount % 5000) == 0) {
                        entitymanager.getTransaction().commit();
                        entitymanager.clear();
                        entitymanager.getTransaction().begin();
                        System.out.println("commit: " + persistCount);
                    }
                    persistCount++;
                }
            }
            countAux = countAux + 50;
            System.out.println("Procesado: " + countAux);
        }
        System.out.println("Persistido: " + (persistCount - 1) + "registros");
        entitymanager.getTransaction().commit();
        entitymanager.close();
        tiempoFin = System.currentTimeMillis();
        System.out.println("Tiempo proceso: " + (((tiempoFin - tiempoInicio) / 1000) / 60));
    }

}
