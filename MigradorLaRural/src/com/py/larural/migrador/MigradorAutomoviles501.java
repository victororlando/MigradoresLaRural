/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.migrador;

import com.py.larural.oradestino.GenericManagerDestino;
import com.py.larural.oradestino.LrAjusteManager;
import com.py.larural.oradestino.LrAjustePlanManager;
import com.py.larural.oradestino.LrClaseAsegManager;
import com.py.larural.oradestino.LrClasePolizaManager;
import com.py.larural.oradestino.LrCoberturaPlanManager;
import com.py.larural.oradestino.LrCotiDatBienAseManager;
import com.py.larural.oradestino.LrCotizacionManager;
import com.py.larural.oradestino.LrEstadoCotizacionManager;
import com.py.larural.oradestino.LrModoCoberturaManager;
import com.py.larural.oradestino.LrModoCotizacionManager;
import com.py.larural.oradestino.LrParmCotiPlanSeccManager;
import com.py.larural.oradestino.LrPersonaManager;
import com.py.larural.oradestino.LrSeccDetalleManager;
import com.py.larural.oradestino.LrTipoPropuestaManager;
import com.py.larural.oraorigen.ItemDePolizasManager;
import com.py.larural.oraorigen.PolsdemiManager;
import com.py.larural.oraorigen.prod.CotiItemFormulaManager;
import com.py.larural.oraorigen.prod.CotidatbienaseManager;
import com.py.larural.oraorigen.prod.CotizacionesManager;
import entidades.larural.destino.Lrajuste;
import entidades.larural.destino.Lrajusteplan;
import entidades.larural.destino.Lrclaseaseg;
import entidades.larural.destino.Lrclasepoliza;
import entidades.larural.destino.Lrcoberturaplan;
import entidades.larural.destino.Lrcotidatbienase;
import entidades.larural.destino.LrcotidatbienasePK;
import entidades.larural.destino.Lrcotiplanbien;
import entidades.larural.destino.LrcotiplanbienPK;
import entidades.larural.destino.Lrcotiplanbiencobertura;
import entidades.larural.destino.Lrcotiplanbiendesc;
import entidades.larural.destino.Lrcotiplanbiengasto;
import entidades.larural.destino.Lrcotiplanbienpremio;
import entidades.larural.destino.LrcotiplanbienpremioPK;
import entidades.larural.destino.Lrcotizacion;
import entidades.larural.destino.LrcotizacionPK;
import entidades.larural.destino.Lrcotizacionplan;
import entidades.larural.destino.LrcotizacionplanPK;
import entidades.larural.destino.Lrdatosvehiculo;
import entidades.larural.destino.Lrestadocotizacion;
import entidades.larural.destino.Lrestadopropuesta;
import entidades.larural.destino.Lrmodocobertura;
import entidades.larural.destino.Lrmodocotizacion;
import entidades.larural.destino.Lrparmcotiplansecc;
import entidades.larural.destino.Lrpersona;
import entidades.larural.destino.Lrpropuesta;
import entidades.larural.destino.Lrseccdetalle;
import entidades.larural.destino.Lrtipopremio;
import entidades.larural.destino.Lrtipopropuesta;
import entidades.larural.destino.Lrubicacion;
import entidades.larural.origen.ItemDePolizas;
import entidades.larural.origen.Polsdemi;
import entidades.larural.origen.ProauemiMe;
import entidades.larural.origen.lrgxprod.Cotidatbienase;
import entidades.larural.origen.lrgxprod.Cotidetsecciones;
import entidades.larural.origen.lrgxprod.Cotiitemformulas;
import entidades.larural.origen.lrgxprod.Cotizaciones;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author victoro
 */
public class MigradorAutomoviles501 {

    //Managers
    public static PolsdemiManager polsdemiManager = new PolsdemiManager(Polsdemi.class, "MigradorLaRuralOrigenPU");
    public static ItemDePolizasManager itemDePolizaManager = new ItemDePolizasManager(ItemDePolizas.class, "MigradorLaRuralOrigenPU");
    public static CotizacionesManager cotizacionesManager = new CotizacionesManager(Cotizaciones.class, "LRGXPROD");
    public static LrPersonaManager lrPersonaManager = new LrPersonaManager(Lrpersona.class, "MigradorLaRuralPU");
    public static GenericManagerDestino<Lrestadopropuesta> lrEstadoPropuestaManager = new GenericManagerDestino<>(Lrestadopropuesta.class);
    public static LrClaseAsegManager lrClaseAsegManager = new LrClaseAsegManager(Lrclaseaseg.class, "MigradorLaRuralPU");
    public static LrTipoPropuestaManager lrTipoPropuestaManager = new LrTipoPropuestaManager(Lrtipopropuesta.class, "MigradorLaRuralPU");
    public static LrCotizacionManager lrCotizacionManager = new LrCotizacionManager(Lrcotizacion.class, "MigradorLaRuralPU");
    public static LrEstadoCotizacionManager lrEstadoCotizacionManager = new LrEstadoCotizacionManager(Lrestadocotizacion.class, "MigradorLaRuralPU");
    public static LrSeccDetalleManager lrSeccDetalleManager = new LrSeccDetalleManager(Lrseccdetalle.class, "MigradorLaRuralPU");
    public static LrClasePolizaManager lrClasePolizaManager = new LrClasePolizaManager(Lrclasepoliza.class, "MigradorLaRuralPU");
    public static LrModoCotizacionManager lrModoCotizacionManager = new LrModoCotizacionManager(Lrmodocotizacion.class, "MigradorLaRuralPU");
    public static LrCotiDatBienAseManager lrCotiDatBienAseManager = new LrCotiDatBienAseManager(Lrcotidatbienase.class, "MigradorLaRuralPU");
    public static CotidatbienaseManager cotidatbienaseManager = new CotidatbienaseManager(Cotidatbienase.class, "LRGXPROD");
    public static LrParmCotiPlanSeccManager lrParmCotiPlanSeccManager = new LrParmCotiPlanSeccManager(Lrparmcotiplansecc.class, "MigradorLaRuralPU");
    public static CotiItemFormulaManager cotiItemFormulasManager = new CotiItemFormulaManager(Cotiitemformulas.class, "LRGXPROD");
    public static LrModoCoberturaManager lrModoCoberturaManager = new LrModoCoberturaManager(Lrmodocobertura.class, "MigradorLaRuralPU");
    public static LrCoberturaPlanManager lrCoberturaPlanManager = new LrCoberturaPlanManager(Lrcoberturaplan.class, "MigradorLaRuralPU");
    public static Long nroCotizacionAMigrar = null;
    public static Long tipoCotiItemFormula = null;
    public static LrAjusteManager lrAjusteManager = new LrAjusteManager(Lrajuste.class, "MigradorLaRuralPU");
    public static LrAjustePlanManager lrAjustePlanManager = new LrAjustePlanManager(Lrajusteplan.class, "MigradorLaRuralPU");

    //se agrego a la planilla para migrar lrubicacion, lrcotidatbienase, lrdatosvehiculos
    public static void main(String[] args) {
        double tiempoInicio, tiempoFin;
        tiempoInicio = System.currentTimeMillis();
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("MigradorLaRuralPU");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

        short secc = 501;
        short ejercicio = 2015;
        short anexo = 0;
        short estado = 1;
        short tipoOperacion = 1;

        //Constantes
        Lrtipopropuesta lrTipoPropuestaNormal = (Lrtipopropuesta) new GenericManagerDestino<>(Lrtipopropuesta.class).genericFind("lrtipopropuestadesc", "NORMAL");
        Lrestadopropuesta lrEstadoPropuestaConcretado = (Lrestadopropuesta) lrEstadoPropuestaManager.genericFind("lrestadopropuestadesc", "CONCRETADO");
        Lrtipopropuesta lrTipoPropuestaGeneral = (Lrtipopropuesta) lrTipoPropuestaManager.find(1L);
        long lastIdLrCotizacion = lrCotizacionManager.lastId();
        Lrestadocotizacion lrEstadoContizacionConcretado = lrEstadoCotizacionManager.obtenerLrSeccDetallePorSecc("CONCRETADO");
        Lrseccdetalle lrseccDetallePorSeccIndividual = lrSeccDetalleManager.obtenerLrSeccDetallePorSecc((short) 50);
        Lrseccdetalle lrseccDetallePorSeccFlota = lrSeccDetalleManager.obtenerLrSeccDetallePorSecc((short) 161);
        long lastLrCotiDatBienAseId = lrCotiDatBienAseManager.lastId();

        //Map de valores
        Map<Long, Lrpersona> mapLrPersona = lrPersonaManager.obtenerLrPersonasConAseId();
        Map<String, Lrclaseaseg> lrClaseAsegMap = lrClaseAsegManager.obtenerMapaDeRegistros();
        Map<String, Lrclasepoliza> lrClasePolizaMap = lrClasePolizaManager.obtenerMapaRegistros();
        Map<String, Lrmodocotizacion> lrModoCotizacionMap = lrModoCotizacionManager.obtenerMapaDeRegistros();

        //Listas
        List<Lrcotizacion> lrCotizacionList = new ArrayList<>();
        List<Lrubicacion> lrUbicacionList = new ArrayList<>();
        List<Lrcotidatbienase> lrCotiDatBienAseList = new ArrayList<>();
        List<Lrdatosvehiculo> lrDatosVehiculosList = new ArrayList<>();
        List<Lrcotizacionplan> lrCotizacionPlanList = new ArrayList<>();
        List<Lrcotiplanbien> lrCotiPlanBienList = new ArrayList<>();
        List<Lrcotiplanbiencobertura> lrCotiPlanBienCoberturaList = new ArrayList<>();
        List<Lrcotiplanbienpremio> lrCotiPlanBienPremioList = new ArrayList<>();
        List<Lrcotiplanbiengasto> lrCotiPlanBienGastoList = new ArrayList<>();
        List<Lrcotiplanbiendesc> LrcotiplanbiendescList = new ArrayList<>();

        int countAux = 0;
        int countPolsdemi = polsdemiManager.countPolsdemiParaAutomoviles(secc, ejercicio, anexo, estado, tipoOperacion);
        System.out.println("Cantidad de registros a migrar: " + countPolsdemi);

        int persistCount = 1;

        int nulos = 0;

        boolean continueFor = false;
        countAux = 1614; //despues de error
        long cursorNro = 1614;
        while (countAux < countPolsdemi) {
            List<Object[]> polsdemiObjectList = polsdemiManager.obtenerPolsdemiParaAutomoviles(secc, ejercicio, anexo, new int[]{countAux, 100 + countAux}, estado, tipoOperacion);

            for (Object[] polObject : polsdemiObjectList) {
                lastIdLrCotizacion = lastIdLrCotizacion + 1;
                nroCotizacionAMigrar = Long.parseLong(polObject[3].toString());
                if (mapLrPersona.get(((BigDecimal) polObject[5]).longValue()) != null) {
                    Cotizaciones c = cotizacionesManager.obtenerCotizacion(((BigDecimal) polObject[3]).longValue());
                    if (c != null) {
                        System.out.println(c.getCotizacionesid());
                        continueFor = false;
                        Lrpropuesta lrp = new Lrpropuesta();
                        lrp.setLrpropuestamonid(c.getCotizacionesmda());
                        lrp.setLrpersonaid(mapLrPersona.get(((BigDecimal) polObject[5]).longValue()));
                        lrp.setLrestadopropuestaid(lrEstadoPropuestaConcretado);
                        String claseAseg = polObject[6] != null ? polObject[6].toString() : null;
                        if (claseAseg != null) {
                            lrp.setLrclaseasegid(lrClaseAsegMap.get(claseAseg.toUpperCase()));
                        }
                        lrp.setLrpropuestafecprop(c.getCotizacionesfecha());
                        lrp.setLrpropuestamontototal(c.getCotizacionestotalmonto());
                        lrp.setLrpropuestavalortipcamb(c.getCotizacionesmdacotiven());
                        lrp.setLrpropuestacomentario(null);
                        lrp.setLrpropuestanroflota(polObject[8] != null ? ((BigDecimal) polObject[8]).longValue() : 0); //TODO para secc = 501
                        if (polObject[9] != null) {
                            if (((BigDecimal) polObject[9]).longValue() == 0) {
                                lrp.setLrpropuestaflota('N');
                            } else if (((BigDecimal) polObject[9]).longValue() == 2) {
                                lrp.setLrpropuestaflota('S');
                            }
                        }
                        lrp.setLrpropuestaagenciaid(c.getCotizacionesidagencia());
                        lrp.setLrpropuestaususuc(c.getCotizacionessuc());
                        lrp.setLrpropuestaac('S');
                        lrp.setLrpropuestaual("mmig_user");
                        lrp.setLrpropuestafal(new Date());
                        lrp.setLrpropuestaumd("mmig_user");
                        lrp.setLrpropuestafmd(new Date());
                        lrp.setLrpropuestaoficialid(c.getCotizacionesidoficial());
                        lrp.setLrpropuestaescoaseguro('N');
                        lrp.setLrtipopropuestaid(lrTipoPropuestaGeneral);
                        lrp.setLrpropuestatodoriesgo(null);
                        lrp.setLrpropuestaespack('N');

                        /////LRCOTIZACION
                        Lrcotizacion lrc = new Lrcotizacion();
                        LrcotizacionPK lrcpk = new LrcotizacionPK();
                        lrcpk.setLrcotizacionnro(lastIdLrCotizacion);
                        lrcpk.setLrcotizacionversion(1);
                        lrc.setLrcotizacionPK(lrcpk);
                        lrc.setLrcotizacionnromigra(c.getCotizacionesid());
                        lrc.setLrpropuestaid(lrp);
                        lrc.setLrcotizacionfechacoti(c.getCotizacionesfecha() != null ? c.getCotizacionesfecha() : new Date());
                        lrc.setLrcotizacionrubroid(null);
                        lrc.setLrcotizacionsubrubroid(null);
                        lrc.setLrestadocotizacionid(lrEstadoContizacionConcretado);
                        if (polObject[9] != null) {
                            if (((BigDecimal) polObject[9]).longValue() == 0) {
                                lrc.setLrseccdetalleid(lrseccDetallePorSeccIndividual);
                            } else if (((BigDecimal) polObject[9]).longValue() == 2) {
                                lrc.setLrseccdetalleid(lrseccDetallePorSeccFlota);
                            }
                        }
                        String clasePoliza = polObject[10] != null ? polObject[10].toString() : null;

                        if (clasePoliza != null) {
                            lrc.setLrclasepolizaid(lrClasePolizaMap.get(clasePoliza.toUpperCase()));
                        } else {
                            lrc.setLrclasepolizaid(lrClasePolizaMap.get("NUEVA"));
                        }

                        if (lrc.getLrclasepolizaid() == null) {
                            lrc.setLrclasepolizaid(lrClasePolizaMap.get("NUEVA"));
                        }

                        lrc.setLrmodocotizacionid(lrModoCotizacionMap.get("ANU"));

                        lrc.setLrcotizacionagenteid(c.getCotizacionesidagente() == null ? 0 : c.getCotizacionesidagente());
                        lrc.setLrcotizacionsubagenteid(c.getCotizacionesidsubagente() == null ? 0 : c.getCotizacionesidsubagente());
                        lrc.setLrcotizacionformapagoid(c.getCotizacionesidformapago() == null ? 0 : c.getCotizacionesidformapago());
                        lrc.setLrcotizaciontipocobroid(c.getCotizacionesidtipocobro() == null ? 0 : c.getCotizacionesidtipocobro());

                        if (c.getCotidetseccionesList() != null && !c.getCotidetseccionesList().isEmpty()) {
                            if (c.getCotidetseccionesList().get(0).getCotidatbienaseList() != null
                                    && !c.getCotidetseccionesList().get(0).getCotidatbienaseList().isEmpty()) {
                                if (c.getCotidetseccionesList().get(0).getCotidatbienaseList().get(0).getCotidatbienasepolnro() > 0) {
                                    lrc.setLrcotizaciontipocoti((short) 2);
                                } else {
                                    lrc.setLrcotizaciontipocoti((short) 1);
                                }
                            }
                        }

                        lrc.setLrcotizacionmontototal(c.getCotizacionestotalmonto() != null ? c.getCotizacionestotalmonto() : BigDecimal.ZERO);
                        lrc.setLrcotizacioncobradorid(c.getCotizacionesidcobrador() == null ? 0 : c.getCotizacionesidcobrador());
                        lrc.setLrcotizacionpordeclaracion('N');
                        lrc.setLrcotizacionvtotarjeta(c.getCotizacionesvtotarjeta() == null ? new Date() : c.getCotizacionesvtotarjeta());
                        lrc.setLrcotizacionnrotarjeta(c.getCotizacionesnrotarjeta() == null ? " " : c.getCotizacionesnrotarjeta());
                        lrc.setLrcotizacionaprobcontclr(c.getCotizacionesaprobcontclr() == null ? 'N' : c.getCotizacionesaprobcontclr());
                        if (c.getCotidetseccionesList() != null && !c.getCotidetseccionesList().isEmpty()) {
                            if (c.getCotidetseccionesList().get(0).getCotidatbienaseList() != null
                                    && !c.getCotidetseccionesList().get(0).getCotidatbienaseList().isEmpty()) {
                                lrc.setLrcotizacionvigdesde(c.getCotidetseccionesList().get(0).getCotidatbienaseList().get(0).getCotidatbienasefchvigdesde());
                                lrc.setLrcotizacionvighasta(c.getCotidetseccionesList().get(0).getCotidatbienaseList().get(0).getCotidatbienasefchvighasta());
                                lrc.setLrcotizacionvigencia(c.getCotidetseccionesList().get(0).getCotidatbienaseList().get(0).getCotidatbienasediasvigencia());
                            }
                        }

                        lrc.setLractividadid(null);
                        lrc.setLrcotizacionnropoliza(((BigDecimal) polObject[2]).intValue());
                        //lrc.setLrcotizacionejerciciorenov();
                        //lrc.setLrcotizacionnropolizarenov();
                        lrc.setLrcotizacionanexo(polObject[7] != null ? (short) ((BigDecimal) polObject[7]).intValue() : 0);
                        //lrc.setLrcotizacionendoso();
                        //lrc.setLrcotizacionendosopor();
                        lrc.setLrcotizacionual("mmiguser");
                        lrc.setLrcotizacionfal(new Date());
                        lrc.setLrcotizacionumd("mmiguser");
                        lrc.setLrcotizacionfmd(new Date());
                        if (c.getCotizacionescodentidad() != null) {
                            lrc.setEntidadid((long) c.getCotizacionescodentidad());
                        }
                        lrc.setLrcotizaciondeclaraciondelmes('N');
                        lrc.setEndoprendaid(c.getCotizacionesidprendario());

                        if (c.getCotizacionestipocoti() != null) {
                            if (c.getCotizacionestipocoti() == 0) {
                                lrc.setLrtipocotizacionid(1L);
                            } else if (c.getCotizacionestipocoti() == 1) {
                                lrc.setLrtipocotizacionid(4L);
                            }
                        }

                        lrc.setLrmedidaprestacionid(null);
                        lrc.setLrcotizacionac('S');
                        lrc.setLrcotizacionobs4(" ");
                        lrc.setLrcotizacionobs3(" ");
                        lrc.setLrcotizacionobs2(" ");
                        lrc.setLrcotizacionobs1(" ");
                        if (c.getCotidetseccionesList() != null && !c.getCotidetseccionesList().isEmpty()) {
                            lrc.setLrcotizacionfchtope(c.getCotidetseccionesList().get(0).getCotidetseccionesfmd());
                            lrc.setLrcotizacionusuactual(c.getCotidetseccionesList().get(0).getCotidetseccionesumd() == null ? " " : c.getCotidetseccionesList().get(0).getCotidetseccionesumd());

                        }
                        if (lrc.getLrcotizacionusuactual() == null) {
                            lrc.setLrcotizacionusuactual(" ");
                        } else if (lrc.getLrcotizacionusuactual().isEmpty()) {
                            lrc.setLrcotizacionusuactual(" ");
                        }
                        lrc.setLrcotizacionporpmd(BigDecimal.ZERO);
                        lrc.setLrcotizaciontasapactada(BigDecimal.ZERO);
                        //lrc.setLrcotizacionpersonaaseg(Long.MIN_VALUE); //Para cotizador de caución If Secc=1508 or secc=1509 or secc=1510 or secc=1511 or secc=1514 ver tabla contratista
                        lrc.setLrcotizacionfroning('N');
                        if (polObject[5] != null) {
                            //TODO no se puede insertar en Integer, el dato es mayor
                            lrc.setLrcotizaciontcaseg(Integer.parseInt(polObject[5].toString()));
                        }
                        //TODO ver al migrar tarjetas
//                    lrc.setLrcotizaciontcextern;
                        lrc.setLrcotizacionnrotransaccion(null);

                        short iSecc = Short.parseShort(polObject[0].toString());
                        short iEjericio = Short.parseShort(polObject[1].toString());
                        short iAnexo = Short.parseShort(polObject[7].toString());
                        short iTipoSeguro = Short.parseShort(polObject[12].toString());
                        short iTipoOperacion = Short.parseShort(polObject[13].toString());
                        int iPolNro = Integer.parseInt(polObject[2].toString());

                        Map<String, List<ItemDePolizas>> mapItemsPolizas = itemDePolizaManager.obtenerMapItemsNoRepetidos(iSecc, iEjericio, iAnexo, iTipoSeguro, iTipoOperacion, iPolNro);

                        int nroItem = 0;
                        for (Map.Entry<String, List<ItemDePolizas>> entry : mapItemsPolizas.entrySet()) {
                            Lrubicacion lru = new Lrubicacion();
                            lru.setLrubicacioncalleprincipal(" ");
                            lru.setLrubicacioncalletransversal(" ");
                            lru.setLrubicacionctactectral(" ");
                            lru.setLrubicacionedificio(" ");
                            lru.setLrubicaciondpto(" ");
                            lru.setLrubicacionlocal(" ");
                            lru.setLrubicacionpiso((short) 0);
                            lru.setLrubicacionnro(" ");
                            lru.setLrubicacionbloque(" ");
                            lru.setLrubicacionual("mmuser");
                            lru.setLrubicacionfal(new Date());
                            lru.setLrubicacionumd("mmuser");
                            lru.setLrubicacionfmd(new Date());
                            lru.setLrcotizacion(lrc);
                            for (Cotidetsecciones cds : c.getCotidetseccionesList()) {
                                for (Cotiitemformulas cif : cds.getCotiitemformulasList()) {
                                    if (cif.getCotiitemformulasPK().getCotidetseccionesid() == 83) {
                                        lru.setLrubicacionrespmax(cif.getCotiitemformulasvalc() != null ? cif.getCotiitemformulasvalc() : BigDecimal.ZERO);
                                    }
                                }
                            }
                            if (lru.getLrubicacionrespmax() == null) {
                                lru.setLrubicacionrespmax(BigDecimal.ZERO);
                            }
                            lru.setLrbarriosid(0);
                            lru.setLrubicacioncantsuc(0);
                            lru.setLrubicacioncantemp(0);
                            lru.setLrubicacionnominado('N');
                            lru.setLrubicacionhasta(" ");
                            lru.setLrubicaciondesde(" ");
                            lru.setLrubicacioninventario("0");
                            lru.setLrubicacionposeeinv('N');
                            lru.setLrubicaciontotalventanillas(BigDecimal.ZERO);
                            lru.setLrubicacionsumaaseguradaplayer(BigDecimal.ZERO);
                            lru.setLrubicacioncantplayeros(0L);
                            lru.setLrubicacionhorariohasta(null);
                            lru.setLrubicacionhorariodesde(null);
                            lru.setLrubicaciondescripcion(null);
                            lru.setLrubicacionmedidaseguridadvent('N');
                            lru.setLrubicacionmaxporventan(BigDecimal.ZERO);
                            lru.setLrubicacioncantventan(0L);
                            lru.setLrubicacioncajafuerte('N');
                            lru.setLrubicaciondepid((short) 0);
                            lru.setLrubicacionciuid((short) 0);
                            lru.setLrubicacionnroinspeccion(0L);
                            lru.setLrubicaciontotalplayeros(0L);
                            lru.setLrubicaciondestinotransid(0L);
                            lru.setLrubicacionastillero(null);
                            lru.setLrubicacionagravante('N');
                            lru.setLrubicacionorigentransid(0L);
                            lru.setLrubicacionporpersona('N');
                            lru.setLrubicacionporpromediogrupal('N');
                            lru.setLrubicacionporpromediogral('N');
                            lru.setLrubicacionmontocarteraactual(BigDecimal.ZERO);
                            lru.setLrubicacionsiniestralidad(BigDecimal.ZERO);
                            lru.setLrubicacionpromedadcliente(BigDecimal.ZERO);
                            lru.setLrubicacioncantperprestarias(0L);
                            lru.setLrubicacioncapitalmaxpersona(BigDecimal.ZERO);
                            lru.setLrubicacionpersonaaseid(null);
                            lru.setLrubicacionrutaferry(null);
                            lru.setLrubicacionferry('N');
                            //lru.setLRUBICACIONAPLICAENDPREND
                            //lru.setLRUBICACIONCANTVIAJEROS
                            //lru.setLRUBICACIONCANTVEHICULOS
                            Lrcotizacionplan lrcp = new Lrcotizacionplan();
                            Long parmCotiDetSecciones = null;
                            BigDecimal cotidetseccionesmto = BigDecimal.ZERO;
                            Long planAprob = null;
                            for (Cotidetsecciones cds : c.getCotidetseccionesList()) {
                                if (c.getCotizacionestipoflota() == null) {
                                    parmCotiDetSecciones = 50L;
                                } else if (c.getCotizacionestipoflota() == 0) {
                                    parmCotiDetSecciones = 50L;
                                } else if (c.getCotizacionestipoflota() == 2) {
                                    parmCotiDetSecciones = 161L;
                                }
                                //LrCotizacionPlan

                                if (c.getCotizacionesid() == 35031) {
                                    System.out.println("");
                                }

                                Short cotiItemFormulasTipoPlan;
                                if (cds.getCotidetseccionesidplan() != null && cds.getCotidetseccionesidplan() == 27) {
                                    cotiItemFormulasTipoPlan = 16;
                                } else if (cds.getCotidetseccionesidplan() != null && cds.getCotidetseccionesidplan() == 31) {
                                    cotiItemFormulasTipoPlan = 35;
                                } else {
                                    cotiItemFormulasTipoPlan = cotiItemFormulasManager.obtenerCotiItemFormulasTipoPlan(nroCotizacionAMigrar, cds.getCotidetseccionesidplan());
                                }

                                Long cotiDetseccionesIdPlan;
                                if (cds.getCotidetseccionesidplan() != null && cds.getCotidetseccionesidplan() == 1) {
                                    cotiDetseccionesIdPlan = 2L;
                                } else {
                                    cotiDetseccionesIdPlan = cds.getCotidetseccionesidplan();
                                }

                                Lrparmcotiplansecc lrpcps = lrParmCotiPlanSeccManager.obtenerLrParmCotiPlanSecc(parmCotiDetSecciones, cotiDetseccionesIdPlan, cotiItemFormulasTipoPlan);

                                if (lrpcps == null) {
                                    continueFor = true;
                                    continue;
                                }

                                LrcotizacionplanPK lrcppk = new LrcotizacionplanPK();
                                lrcppk.setSseccdetalleid(lrpcps.getLrparmcotiplanseccPK().getLrseccdetalleid());
                                lrcppk.setStipoplanid(lrpcps.getLrparmcotiplanseccPK().getLrtipoplanid());
                                lrcppk.setSparmcotiplanid(lrpcps.getLrparmcotiplanseccPK().getLrparmcotiplanid());
                                lrcppk.setLrcotizacionnro(lrc.getLrcotizacionPK().getLrcotizacionnro());
                                lrcppk.setLrcotizacionversion(lrc.getLrcotizacionPK().getLrcotizacionversion());
                                lrcp.setLrcotizacion(lrc);
                                lrcp.setLrparmcotiplansecc(lrpcps);
                                lrcp.setLrcotizacionplanPK(lrcppk);
                                lrcp.setLrcotizacionplanmonto(cds.getCotidetseccionesmto() != null ? cds.getCotidetseccionesmto() : BigDecimal.ZERO);
                                lrcp.setLrcotizacionplanaprobado('S');
                                lrcp.setLrcotizacionplancantcuotas(cds.getCotidetseccionescancuotas() != null ? cds.getCotidetseccionescancuotas() : 0);
                                lrcp.setLrcotizacionplanimpinicial(cds.getCotidetseccionesimpinicial() != null ? cds.getCotidetseccionesimpinicial() : BigDecimal.ZERO);
                                lrcp.setLrcotizacionplanimpcuota(cds.getCotidetseccionesimpcuota() != null ? cds.getCotidetseccionesimpcuota() : BigDecimal.ZERO);
                                lrcp.setLrcotizacionplanpolnro(cds.getCotidetseccionespolnro() == null ? 0L : cds.getCotidetseccionespolnro());

                                short seccNro = Short.parseShort(polObject[0].toString());
                                int polNro = Integer.parseInt(polObject[2].toString());
                                int nroPropuesta = Integer.parseInt(polObject[38].toString());

                                BigDecimal porcComag = polsdemiManager.obtenerPorcComag(seccNro, polNro, nroPropuesta);

                                lrcp.setLrcotizacionplancomagteporc(porcComag);
                                lrcp.setLrcotizacionplanual("mmuser");
                                lrcp.setLrcotizacionplanfal(new Date());
                                lrcp.setLrcotizacionplanumd("mmuser");
                                lrcp.setLrcotizacionplanfmd(new Date());
                                lrcp.setLrcotizacionplantipopremioid(obtenerTipoPremioId(c.getCotizacionestipofranquicia(), c.getCotizacionesaprobcontclr(), cds.getCotidetseccionescancuotas()));
                                lrcp.setLrcotizacionplanporc(BigDecimal.ZERO);
                                cotidetseccionesmto = cds.getCotidetseccionesmto();
                                planAprob = cotiDetseccionesIdPlan;
                            }
                            if (continueFor) {
                                continue;
                            }

                            lrCotizacionPlanList.add(lrcp);

                            tipoCotiItemFormula = lrcp.getLrparmcotiplansecc().getLrparmcotiplanseccPK().getLrparmcotiplanid();
                            //lrcotidatbienase
                            for (ItemDePolizas i : entry.getValue()) {
                                lastLrCotiDatBienAseId = lastLrCotiDatBienAseId + 1;
                                Lrcotidatbienase lrcdba = new Lrcotidatbienase();
                                LrcotidatbienasePK lrcotiPk = new LrcotidatbienasePK();
                                lrcotiPk.setLrcotidatbienaseid(lastLrCotiDatBienAseId);
                                lrcdba.setLrcotidatbienasePK(lrcotiPk);
                                lrcdba.setLrubicacion(lru);
                                lrcdba.setLrcotidatbienasenroitem(i.getItemDePolizasPK().getItem());
                                lrcdba.setRiesgosaseid(i.getRiesgosAsegurados() != null ? i.getRiesgosAsegurados().getRiesgosAseguradosPK().getCodRiesgo() : null);
                                lrcdba.setSeccid(secc);

                                if (polObject[14] != null && Integer.parseInt(polObject[14].toString()) == 1) {
                                    lrcdba.setLrcotidatbienasesumaase(((BigDecimal) polObject[15]));
                                } else {
                                    ProauemiMe proauemime = polsdemiManager.obtnerProaumiMe(i.getItemDePolizasPK().getSecc(),
                                            i.getItemDePolizasPK().getEjercicio(),
                                            i.getItemDePolizasPK().getAnexo(),
                                            i.getItemDePolizasPK().getTipoOperacion(),
                                            i.getItemDePolizasPK().getPolnro(),
                                            i.getItemDePolizasPK().getItem());
                                    if (proauemime != null) {
                                        lrcdba.setLrcotidatbienasesumaase(proauemime.getCasco());
                                    } else {
                                        System.out.println("");
                                    }
                                }

                                lrcdba.setSlrpersonaid(null);
                                lrcdba.setLrcargoid(null);
                                lrcdba.setLrdespachanteid(null);
                                lrcdba.setLrcotidatbienaseagrupacargoid(0L);
                                lrcdba.setLrcotidatbienasecoberttipid((short) 0);
                                lrcdba.setLrcotidatbienasecant(polObject[16] != null ? Long.parseLong(polObject[16].toString()) : 0);
                                lrcdba.setLrcotidatbienaseprimaren(BigDecimal.ZERO);
                                lrcdba.setLrcotidatbienasehasta(BigDecimal.ZERO);
                                lrcdba.setLrcotidatbienasedesde(BigDecimal.ZERO);
                                lrcdba.setLrcotidatbienasepromedioedad((short) 0);
                                lrcdba.setLrcotidatbienasetasa(BigDecimal.ZERO);
                                lrcdba.setLrcotidatbienaseobjetoseguroid(0L);
                                lrcdba.setLrcotidatbienasetipo(null);
                                lrcdba.setLrcotidatbienasesumaaseaux(BigDecimal.ZERO);
//                                lrcdba.setLRCOTIDATBIENASEUSA
                                //lrcdba.setLRCOTIDATBIENASELRITEMASEGPLAN
                                lrCotiDatBienAseList.add(lrcdba);

                                Long nroCotizacion = Long.parseLong(polObject[3].toString());
                                Cotidatbienase cotidatbienase = cotidatbienaseManager.obtenerCotidatbienase(nroCotizacion);
                                if (cotidatbienase != null) {
//                                    System.out.println(polObject[17].toString());
//                                    System.out.println(polObject[18].toString());
//                                    System.out.println(polObject[19].toString());
//                                    System.out.println(polObject[20].toString());
//                                    System.out.println(polObject[21].toString());
//                                    System.out.println(polObject[22].toString());
//                                    System.out.println(polObject[23].toString());
//                                    System.out.println(polObject[24].toString());
//                                    System.out.println(polObject[25].toString());
//                                    System.out.println(polObject[26].toString());
//                                    System.out.println(polObject[27] == null ? "null" : polObject[27].toString());
//                                    System.out.println(polObject[28] == null ? "null" : polObject[28].toString());
//                                    System.out.println(polObject[29] == null ? "null" : polObject[29].toString());
//                                    System.out.println(polObject[30] == null ? "null" : polObject[30].toString());
//                                    System.out.println(polObject[31] == null ? "null" : polObject[31].toString());
//                                    System.out.println(polObject[32] == null ? "null" : polObject[32].toString());
//                                    System.out.println(polObject[33] == null ? "null" : polObject[33].toString());
//                                    System.out.println(polObject[34] == null ? "null" : polObject[34].toString());
//                                    System.out.println(polObject[35] == null ? "null" : polObject[35].toString());
//                                    System.out.println(polObject[36] == null ? "null" : polObject[36].toString());
//                                    System.out.println(polObject[37] == null ? "null" : polObject[37].toString());
//                                    System.out.println("---");

                                    Lrdatosvehiculo lrdv = new Lrdatosvehiculo();
                                    lrdv.setVehiculostipid(polObject[17] != null ? Long.parseLong(polObject[17].toString()) : 0);
                                    lrdv.setMarcasid(polObject[18] != null ? Long.parseLong(polObject[18].toString()) : 0);
                                    lrdv.setModelosid(polObject[19] != null ? Long.parseLong(polObject[19].toString()) : 0);
                                    lrdv.setLrdatosvehiculoanho(polObject[20] != null ? Short.parseShort(polObject[20].toString()) : 0);
                                    lrdv.setLrdatosvehiculomotor(polObject[21] == null ? " " : polObject[21].toString());
                                    lrdv.setLrdatosvehiculovalorcasco(polObject[22] != null ? (BigDecimal) polObject[22] : BigDecimal.ZERO);
                                    lrdv.setLrdatosvehiculonrochasis(polObject[23] != null ? polObject[23].toString() : "");
                                    lrdv.setLrdatosvehiculonrochapa(polObject[24] != null ? (polObject[24].toString()) : "");
                                    if (cotidatbienase.getCotidatbienasevblindaje() != null && cotidatbienase.getCotidatbienasevblindaje() == 1) {
                                        lrdv.setLrdatosvehiculoblindaje('S');
                                    } else {
                                        lrdv.setLrdatosvehiculoblindaje('N');
                                    }
                                    lrdv.setLrdatosvehiculotipoblindaje(cotidatbienase.getCotidatbienasetipoblindaje() == null ? " " : cotidatbienase.getCotidatbienasetipoblindaje());
                                    if (polObject[14] != null && Integer.parseInt(polObject[14].toString()) == 1) {
                                        lrdv.setLrdatosvehiculovalorblindaje((BigDecimal) polObject[25]);
                                    } else {
                                        ProauemiMe proauemime = polsdemiManager.obtnerProaumiMe(i.getItemDePolizasPK().getSecc(),
                                                i.getItemDePolizasPK().getEjercicio(),
                                                i.getItemDePolizasPK().getAnexo(),
                                                i.getItemDePolizasPK().getTipoOperacion(),
                                                i.getItemDePolizasPK().getPolnro(),
                                                i.getItemDePolizasPK().getItem());
                                        if (proauemime != null) {
                                            lrdv.setLrdatosvehiculovalorblindaje(proauemime.getCapRpRt());
                                        }
                                    }

                                    if (cotidatbienase.getCotidatbienasevtubosin() != null && cotidatbienase.getCotidatbienasevtubosin() == 1) {
                                        lrdv.setLrdatosvehiculotuvostro('S');
                                    } else {
                                        lrdv.setLrdatosvehiculotuvostro('N');
                                    }

                                    lrdv.setTiposimportacionid(polObject[26] != null ? Long.parseLong(polObject[26].toString()) : 0);
                                    if (cotidatbienase.getCotidatbienaseairbacl() != null && cotidatbienase.getCotidatbienaseairbacl() == 1) {
                                        lrdv.setLrdatosvehiculoairbagcl('S');
                                    } else {
                                        lrdv.setLrdatosvehiculoairbagcl('N');
                                    }
                                    if (cotidatbienase.getCotidatbienaseairbacf() != null && cotidatbienase.getCotidatbienaseairbacf() == 1) {
                                        lrdv.setLrdatosvehiculoairbagcf('S');
                                    } else {
                                        lrdv.setLrdatosvehiculoairbagcf('N');
                                    }
                                    if (cotidatbienase.getCotidatbienaseairbacotros() == null) {
                                        lrdv.setLrdatosvehiculoairbagotros(" ");
                                    } else if (cotidatbienase.getCotidatbienaseairbacotros().isEmpty()) {
                                        lrdv.setLrdatosvehiculoairbagotros(" ");
                                    }

                                    if (cotidatbienase.getCotidatbienasesisseg() != null && cotidatbienase.getCotidatbienasesisseg() == 1) {
                                        lrdv.setLrdatosvehiculosisseg('S');
                                    } else {
                                        lrdv.setLrdatosvehiculosisseg('N');
                                    }

                                    if (cotidatbienase.getCotidatbienasesissegtip() == null) {
                                        lrdv.setLrdatosvehiculosissegtip(" ");
                                    } else if (cotidatbienase.getCotidatbienasesissegtip().isEmpty()) {
                                        lrdv.setLrdatosvehiculosissegtip(" ");
                                    }

                                    lrdv.setLrdatosvehiculocilindros(polObject[27] == null ? " " : polObject[27].toString());
                                    if (polObject[28] == null) {
                                        lrdv.setLrdatosvehiculocaja("NN");
                                    } else if (Integer.parseInt(polObject[28].toString()) == -1) {
                                        lrdv.setLrdatosvehiculocaja("SD");
                                    } else if (Integer.parseInt(polObject[28].toString()) == 1) {
                                        lrdv.setLrdatosvehiculocaja("ME");
                                    } else if (Integer.parseInt(polObject[28].toString()) == 2) {
                                        lrdv.setLrdatosvehiculocaja("AU");
                                    }

                                    lrdv.setLrdatosvehiculotipoeje(polObject[29] == null ? " " : polObject[29].toString());
                                    if (polObject[30] == null) {
                                        lrdv.setLrdatosvehiculotracc("SIN DATOS");
                                    } else if (Integer.parseInt(polObject[30].toString()) == -1) {
                                        lrdv.setLrdatosvehiculotracc("SIN DATOS");
                                    } else if (Integer.parseInt(polObject[30].toString()) == 1) {
                                        lrdv.setLrdatosvehiculotracc("4x2");
                                    } else if (Integer.parseInt(polObject[30].toString()) == 2) {
                                        lrdv.setLrdatosvehiculotracc("4x4");
                                    }
                                    lrdv.setVehiculocolorid(polObject[31] != null ? Long.parseLong(polObject[31].toString()) : 0l);
                                    if (polObject[32] == null) {
                                        lrdv.setLrdatosvehiculomovidoa("SIN DATOS");
                                    } else if (Integer.parseInt(polObject[32].toString()) == -1) {
                                        lrdv.setLrdatosvehiculomovidoa("SIN DATOS");
                                    } else if (Integer.parseInt(polObject[32].toString()) == 1) {
                                        lrdv.setLrdatosvehiculomovidoa("DIESEL");
                                    } else if (Integer.parseInt(polObject[32].toString()) == 2) {
                                        lrdv.setLrdatosvehiculomovidoa("NAFTA");
                                    }
                                    lrdv.setLrdatosvehiculopuertas(polObject[33] == null ? (short) 0 : Short.parseShort(polObject[33].toString()));
                                    lrdv.setProcedenciaid(polObject[34] != null ? Long.parseLong(polObject[34].toString()) : 0);
                                    lrdv.setLrdatosvehiculotone(" ");
                                    lrdv.setLrdatosvehiculoantiguedad(cotidatbienase.getCotidatbienaseantiguedad() != null ? cotidatbienase.getCotidatbienaseantiguedad() : 0);
                                    lrdv.setVehiculosusoid(polObject[35] != null ? Long.parseLong(polObject[35].toString()) : 0);
                                    lrdv.setLrdatosvehiculocodgps(cotidatbienase.getCotidatbienasecodgps() != null ? cotidatbienase.getCotidatbienasecodgps() : 0);
                                    if (polObject[36] != null && Integer.parseInt(polObject[36].toString()) == 1) {
                                        lrdv.setLrdatosvehiculocartaverde('S');
                                    } else {
                                        lrdv.setLrdatosvehiculocartaverde('N');
                                    }

                                    lrdv.setLrdatosvehiculorcadic(cotidatbienase.getCotidatbienasercadicional() != null ? cotidatbienase.getCotidatbienasercadicional() : 0);
                                    lrdv.setLrdatosvehiculoovpadic(cotidatbienase.getCotidatbienaseovpadicional() != null ? cotidatbienase.getCotidatbienaseovpadicional() : 0);
                                    if (cotidatbienase.getCotidatbienasesingrua() != null && cotidatbienase.getCotidatbienasesingrua() == 1) {
                                        lrdv.setLrdatosvehiculosingrua('S');
                                    } else {
                                        lrdv.setLrdatosvehiculosingrua('N');
                                    }

                                    lrdv.setLrdatosvehiculofranqadic('N');
                                    lrdv.setLrdatosvehiculocantocu(polObject[37] != null ? Short.parseShort(polObject[37].toString()) : 0);
                                    lrdv.setLrdatosvehiculofal(new Date());
                                    lrdv.setLrdatosvehiculoual("mmiguser");
                                    lrdv.setLrdatosvehiculofmd(new Date());
                                    lrdv.setLrdatosvehiculoumd("mmiguser");
                                    lrdv.setLrcotidatbienase(lrcdba);
                                    lrDatosVehiculosList.add(lrdv);
                                    //Imprimiendo datos de LrDatosvehiculos
//                                    System.out.println("lrdv.getLrdatosvehiculoairbagcf(): " + lrdv.getLrdatosvehiculoairbagcf());
//                                    System.out.println("lrdv.getLrdatosvehiculoairbagcl()" + lrdv.getLrdatosvehiculoairbagcl());
//                                    System.out.println("lrdv.getLrdatosvehiculoairbagotros()" + lrdv.getLrdatosvehiculoairbagotros());
//                                    System.out.println("lrdv.getLrdatosvehiculoanho()" + lrdv.getLrdatosvehiculoanho());
//                                    System.out.println("lrdv.getLrdatosvehiculoblindaje()" + lrdv.getLrdatosvehiculoblindaje());
//                                    System.out.println("lrdv.getLrdatosvehiculocaja()" + lrdv.getLrdatosvehiculocaja());
//                                    System.out.println("lrdv.getLrdatosvehiculocantocu()" + lrdv.getLrdatosvehiculocantocu());
//                                    System.out.println("lrdv.getLrdatosvehiculocantocu()" + lrdv.getLrdatosvehiculocartaverde());
//                                    System.out.println("lrdv.getLrdatosvehiculocilindros()" + lrdv.getLrdatosvehiculocilindros());
//                                    System.out.println("lrdv.getLrdatosvehiculocodgps()" + lrdv.getLrdatosvehiculocodgps());
//                                    System.out.println("lrdv.getLrdatosvehiculofal()" + lrdv.getLrdatosvehiculofal());
//                                    System.out.println("lrdv.getLrdatosvehiculofmd()" + lrdv.getLrdatosvehiculofmd());
//                                    System.out.println("lrdv.getLrdatosvehiculofranqadic()" + lrdv.getLrdatosvehiculofranqadic());
//                                    System.out.println("lrdv.getLrdatosvehiculoid()" + lrdv.getLrdatosvehiculoid());
//                                    System.out.println("lrdv.getLrdatosvehiculomotor()" + lrdv.getLrdatosvehiculomotor());
//                                    System.out.println("lrdv.getLrdatosvehiculomovidoa()" + lrdv.getLrdatosvehiculomovidoa());
//                                    System.out.println("lrdv.getLrdatosvehiculonrochapa()" + lrdv.getLrdatosvehiculonrochapa());
//                                    System.out.println("lrdv.getLrdatosvehiculonrochasis()" + lrdv.getLrdatosvehiculonrochasis());
//                                    System.out.println("lrdv.getLrdatosvehiculoovpadic()" + lrdv.getLrdatosvehiculoovpadic());
//                                    System.out.println("lrdv.getLrdatosvehiculopuertas()" + lrdv.getLrdatosvehiculopuertas());
//                                    System.out.println("lrdv.getLrdatosvehiculorcadic()" + lrdv.getLrdatosvehiculorcadic());
//                                    System.out.println("lrdv.getLrdatosvehiculosingrua()" + lrdv.getLrdatosvehiculosingrua());
//                                    System.out.println("lrdv.getLrdatosvehiculosisseg()" + lrdv.getLrdatosvehiculosisseg());
//                                    System.out.println("lrdv.getLrdatosvehiculosissegtip()" + lrdv.getLrdatosvehiculosissegtip());
//                                    System.out.println("lrdv.getLrdatosvehiculotipoblindaje()" + lrdv.getLrdatosvehiculotipoblindaje());
//                                    System.out.println("lrdv.getLrdatosvehiculotipoeje()" + lrdv.getLrdatosvehiculotipoeje());
//                                    System.out.println("lrdv.getLrdatosvehiculotone()" + lrdv.getLrdatosvehiculotone());
//                                    System.out.println("lrdv.getLrdatosvehiculotracc()" + lrdv.getLrdatosvehiculotracc());
//                                    System.out.println("lrdv.getLrdatosvehiculotuvostro()" + lrdv.getLrdatosvehiculotuvostro());
//                                    System.out.println("lrdv.getLrdatosvehiculoual()" + lrdv.getLrdatosvehiculoual());
//                                    System.out.println("lrdv.getLrdatosvehiculoumd()" + lrdv.getLrdatosvehiculoumd());
//                                    System.out.println("lrdv.getLrdatosvehiculovalorblindaje()" + lrdv.getLrdatosvehiculovalorblindaje());
//                                    System.out.println("lrdv.getLrdatosvehiculovalorcasco()" + lrdv.getLrdatosvehiculovalorcasco());
//                                    System.out.println("lrdv.getMarcasid()" + lrdv.getMarcasid());
//                                    System.out.println("lrdv.getModelosid()" + lrdv.getModelosid());
//                                    System.out.println("lrdv.getProcedenciaid()" + lrdv.getProcedenciaid());
//                                    System.out.println("lrdv.getTiposimportacionid()" + lrdv.getTiposimportacionid());
//                                    System.out.println("lrdv.getVehiculocolorid()" + lrdv.getVehiculocolorid());
//                                    System.out.println("lrdv.getVehiculostipid()" + lrdv.getVehiculostipid());
//                                    System.out.println("lrdv.getVehiculosusoid()" + lrdv.getVehiculosusoid());
//                                    <property name="eclipselink.logging.level.sql" value="FINE"/>
//                                    <property name="eclipselink.logging.parameters" value="true"/>
                                }
                                lrcdba.setLrdatosvehiculoList(lrDatosVehiculosList);

                                //LrCotiPlanBien
                                Lrcotiplanbien lrcpb = new Lrcotiplanbien();
                                LrcotiplanbienPK lrcpbpk = new LrcotiplanbienPK();

                                lrcpbpk.setLrcotizacionnro(lrc.getLrcotizacionPK().getLrcotizacionnro());
                                lrcpbpk.setScotizacionversion(lrc.getLrcotizacionPK().getLrcotizacionversion());
                                lrcpbpk.setSparmcotiplanid(lrcp.getLrcotizacionplanPK().getSparmcotiplanid());
                                lrcpbpk.setSseccdetalleid(lrcp.getLrcotizacionplanPK().getSseccdetalleid());
                                lrcpbpk.setStipoplanid(lrcp.getLrcotizacionplanPK().getStipoplanid());
                                lrcpbpk.setScotidatbienaseid(lrcdba.getLrcotidatbienasePK().getLrcotidatbienaseid());

                                lrcpb.setLrcotiplanbienPK(lrcpbpk);

                                lrcpb.setLrcotizacionplan(lrcp);
                                lrcpb.setLrcotidatbienase(lrcdba);
                                lrcpb.setLrcotiplanbientasabruta(BigDecimal.ZERO);
                                lrcpb.setLrcotiplanbiendescuentomat(BigDecimal.ZERO);
                                lrcpb.setLrcotiplanbiendescuentomat(BigDecimal.ZERO);
                                lrcpb.setLrcotiplanbiendescuentorea(BigDecimal.ZERO);
                                lrcpb.setLrcotiplanbienrecargorea(BigDecimal.ZERO);
                                lrcpb.setLrcotiplanbiendescuentocoa(BigDecimal.ZERO);
                                lrcpb.setLrcotiplanbienrecargocoa(BigDecimal.ZERO);
                                lrcpb.setLrcotiplanbienprimatecbruta(getCotiF(37L));
                                if (c.getCotizacionestipofranquicia() == null) {
                                    lrcpb.setLrcotiplanbienmmu(BigDecimal.ZERO);
                                } else if (c.getCotizacionestipofranquicia() == 0) {
                                    lrcpb.setLrcotiplanbienmmu(getCotiF(72));
                                } else if (c.getCotizacionestipofranquicia() == 11) {
                                    lrcpb.setLrcotiplanbienmmu(getCotiF(118));
                                }
                                if (c.getCotizacionestipofranquicia() == null) {
                                    lrcpb.setLrcotiplanbienmmu(BigDecimal.ZERO);
                                } else if (c.getCotizacionestipofranquicia() == 12) {
                                    lrcpb.setLrcotiplanbienmmu(getCotiF(119));
                                }
                                if (c.getCotizacionestipofranquicia() == null) {
                                    lrcpb.setLrcotiplanbienmmu(BigDecimal.ZERO);
                                } else if (c.getCotizacionestipofranquicia() == 13) {
                                    lrcpb.setLrcotiplanbienmmu(getCotiF(120));
                                }
                                lrcpb.setLrcotiplanbienfes(getCotiF(63) != null ? getCotiF(63) : BigDecimal.ZERO);
                                lrcpb.setLrcotiplanbiendesctec(getCotiF(46) != null ? getCotiF(46) : BigDecimal.ZERO);
                                if (c.getCotizacionestipofranquicia() == null) {
                                    lrcpb.setLrcotiplanbienprimatecneta(BigDecimal.ZERO);
                                } else if (c.getCotizacionestipofranquicia() == 0) {
                                    BigDecimal cotiF = getCotiF(72);
                                    lrcpb.setLrcotiplanbienprimatecneta(cotiF != null ? cotiF : BigDecimal.ZERO);
                                } else if (c.getCotizacionestipofranquicia() == 11) {
                                    BigDecimal cotiF = getCotiF(100);
                                    lrcpb.setLrcotiplanbienprimatecneta(cotiF != null ? cotiF : BigDecimal.ZERO);
                                    lrcpb.setLrcotiplanbiensubtotcomisiones(lrcpb.getLrcotiplanbienprimatecneta() != null ? lrcpb.getLrcotiplanbienprimatecneta() : BigDecimal.ZERO);
                                } else if (c.getCotizacionestipofranquicia() == 12) {
                                    BigDecimal cotiF = getCotiF(101);
                                    lrcpb.setLrcotiplanbienprimatecneta(cotiF != null ? cotiF : BigDecimal.ZERO);
                                    lrcpb.setLrcotiplanbiensubtotcomisiones(lrcpb.getLrcotiplanbienprimatecneta() != null ? lrcpb.getLrcotiplanbienprimatecneta() : BigDecimal.ZERO);
                                } else if (c.getCotizacionestipofranquicia() == 13) {
                                    BigDecimal cotiF = getCotiF(102);
                                    lrcpb.setLrcotiplanbienprimatecneta(cotiF != null ? cotiF : BigDecimal.ZERO);
                                    lrcpb.setLrcotiplanbiensubtotcomisiones(lrcpb.getLrcotiplanbienprimatecneta() != null ? lrcpb.getLrcotiplanbienprimatecneta() : BigDecimal.ZERO);
                                }
                                lrcpb.setLrcotiplanbientasatec(BigDecimal.ZERO);
                                BigDecimal cotiF2 = getCotiF(51);
                                lrcpb.setLrcotiplanbiendesccorporativo(cotiF2 != null ? cotiF2 : BigDecimal.ZERO);
                                if (c.getCotizacionestipofranquicia() != null && c.getCotizacionestipofranquicia() == 0) {
                                    BigDecimal cotiF = getCotiF(56);
                                    if (cotiF == null) {
                                        cotiF = BigDecimal.ZERO;
                                    }
                                    lrcpb.setLrcotiplanbiensubtotcomisiones(cotiF.subtract(lrcpb.getLrcotiplanbiendesccorporativo() != null ? lrcpb.getLrcotiplanbiendesccorporativo() : BigDecimal.ZERO));
                                } else {
                                    lrcpb.setLrcotiplanbiensubtotcomisiones(BigDecimal.ZERO);
                                }
                                short seccNro = Short.parseShort(polObject[0].toString());
                                int polNro = Integer.parseInt(polObject[2].toString());
                                int nroPropuesta = Integer.parseInt(polObject[38].toString());

                                BigDecimal obtenerImpComisionContraro = polsdemiManager.obtenerImpComisionContrato(secc, polNro, nroPropuesta);
                                lrcpb.setLrcotiplanbiencomicontrato(obtenerImpComisionContraro);
                                lrcpb.setLrcotiplanbiencominegociada(obtenerImpComisionContraro);
                                lrcpb.setLrcotiplanbiencomicedida(BigDecimal.ZERO);
                                BigDecimal cotiF3 = getCotiF(65);
                                lrcpb.setLrcotiplanbiencomiotrosgastos(cotiF3 != null ? cotiF3 : BigDecimal.ZERO);
                                if (c.getCotizacionestipofranquicia() == null) {
                                    lrcpb.setLrcotiplanbiengtoadm(BigDecimal.ZERO);
                                } else if (c.getCotizacionestipofranquicia() == 0) {
                                    lrcpb.setLrcotiplanbiengtoadm(getCotiF(67));
                                } else if (c.getCotizacionestipofranquicia() == 11) {
                                    lrcpb.setLrcotiplanbiengtoadm(getCotiF(106));
                                } else if (c.getCotizacionestipofranquicia() == 12) {
                                    lrcpb.setLrcotiplanbiengtoadm(getCotiF(107));
                                } else if (c.getCotizacionestipofranquicia() == 13) {
                                    lrcpb.setLrcotiplanbiengtoadm(getCotiF(108));
                                }
                                lrcpb.setLrcotiplanbienprimacombruta(getCotiF(66));
                                lrcpb.setLrcotiplanbienrecargocom(getCotiF(39).add(getCotiF(40).add(getCotiF(41)).add(getCotiF(42))));
                                lrcpb.setLrcotiplanbienrecargocom(getCotiF(47).add(getCotiF(49)).add(getCotiF(53)).add(getCotiF(55)).add(getCotiF(76)));
                                lrcpb.setLrcotiplanbienbonificacion(getCotiF(44));

                                if (c.getCotizacionestipofranquicia() == null) {
                                    lrcpb.setLrcotiplanbienprimacomneta(BigDecimal.ZERO);
                                } else if (c.getCotizacionestipofranquicia() == 0) {
                                    lrcpb.setLrcotiplanbienprimacomneta(getCotiF(68));
                                } else if (c.getCotizacionestipofranquicia() == 11) {
                                    lrcpb.setLrcotiplanbienprimacomneta(getCotiF(109));
                                } else if (c.getCotizacionestipofranquicia() == 12) {
                                    lrcpb.setLrcotiplanbienprimacomneta(getCotiF(110));
                                } else if (c.getCotizacionestipofranquicia() == 13) {
                                    lrcpb.setLrcotiplanbienprimacomneta(getCotiF(111));
                                }
                                lrcpb.setLrcotiplanbientasacomneta(BigDecimal.ZERO);
                                if (c.getCotizacionestipofranquicia() == null) {
                                    lrcpb.setLrcotiplanbieniva(BigDecimal.ZERO);
                                } else if (c.getCotizacionestipofranquicia() == 0) {
                                    lrcpb.setLrcotiplanbieniva(getCotiF(69));
                                } else if (c.getCotizacionestipofranquicia() == 11) {
                                    lrcpb.setLrcotiplanbieniva(getCotiF(112));
                                } else if (c.getCotizacionestipofranquicia() == 12) {
                                    lrcpb.setLrcotiplanbieniva(getCotiF(113));
                                } else if (c.getCotizacionestipofranquicia() == 13) {
                                    lrcpb.setLrcotiplanbieniva(getCotiF(114));
                                }
                                if (c.getCotizacionestipofranquicia() == null) {
                                    lrcpb.setLrcotiplanbienpremiocont(BigDecimal.ZERO);
                                } else if (c.getCotizacionestipofranquicia() == 0) {
                                    lrcpb.setLrcotiplanbienpremiocont(getCotiF(77));
                                } else if (c.getCotizacionestipofranquicia() == 11) {
                                    BigDecimal cotiF = getCotiF(133);
                                    if (cotiF == null) {
                                        lrcpb.setLrcotiplanbienpremiocont(getCotiF(87));
                                    } else if (cotiF.compareTo(BigDecimal.ZERO) == 0) {
                                        lrcpb.setLrcotiplanbienpremiocont(getCotiF(87));
                                    }
                                } else if (c.getCotizacionestipofranquicia() == 12) {
                                    BigDecimal cotiF = getCotiF(134);
                                    if (cotiF == null) {
                                        lrcpb.setLrcotiplanbienpremiocont(getCotiF(89));
                                    } else if (cotiF.compareTo(BigDecimal.ZERO) == 0) {
                                        lrcpb.setLrcotiplanbienpremiocont(getCotiF(89));
                                    }
                                } else if (c.getCotizacionestipofranquicia() == 13) {
                                    BigDecimal cotiF = getCotiF(135);
                                    if (cotiF == null) {
                                        lrcpb.setLrcotiplanbienpremiocont(getCotiF(91));
                                    } else if (cotiF.compareTo(BigDecimal.ZERO) == 0) {
                                        lrcpb.setLrcotiplanbienpremiocont(getCotiF(91));
                                    }
                                }
                                lrcpb.setLrcotiplanbienrpf(BigDecimal.ZERO);
                                lrcpb.setLrcotiplanbiendescrpf(BigDecimal.ZERO);
                                lrcpb.setLrcotiplanbienpremiofin(cotidetseccionesmto);

                                if (c.getCotizacionestipofranquicia() == null) {
                                    lrcpb.setLrcotiplanbienajustetrajeta(BigDecimal.ZERO);
                                    lrcpb.setLrcotiplanbienpremiotarjetalr(BigDecimal.ZERO);
                                    lrcpb.setLrcotiplanbiensubtotalcom(BigDecimal.ZERO);

                                } else if (c.getCotizacionestipofranquicia() == 0) {
                                    lrcpb.setLrcotiplanbienajustetrajeta(getCotiF(142));
                                    lrcpb.setLrcotiplanbienpremiotarjetalr(getCotiF(143));
                                    lrcpb.setLrcotiplanbiensubtotalcom((getCotiF(56).subtract(getCotiF(51))).add(getCotiF(65)));
                                } else if (c.getCotizacionestipofranquicia() == 11) {
                                    lrcpb.setLrcotiplanbienajustetrajeta(getCotiF(146));
                                    lrcpb.setLrcotiplanbienpremiotarjetalr(getCotiF(147));
                                    lrcpb.setLrcotiplanbiensubtotalcom(getCotiF(100).add(getCotiF(65)));
                                } else if (c.getCotizacionestipofranquicia() == 12) {
                                    lrcpb.setLrcotiplanbienajustetrajeta(getCotiF(150));
                                    lrcpb.setLrcotiplanbienpremiotarjetalr(getCotiF(151));
                                    lrcpb.setLrcotiplanbiensubtotalcom(getCotiF(101).add(getCotiF(65)));
                                } else if (c.getCotizacionestipofranquicia() == 13) {
                                    lrcpb.setLrcotiplanbienajustetrajeta(getCotiF(154));
                                    lrcpb.setLrcotiplanbienpremiotarjetalr(getCotiF(155));
                                    lrcpb.setLrcotiplanbiensubtotalcom(getCotiF(102).add(getCotiF(65)));
                                }
                                lrcpb.setLrcotiplanbienpremiocontpmd(BigDecimal.ZERO);
                                lrcpb.setLrcotiplanbienpremiotarjetalrp(BigDecimal.ZERO);
//                                lrcpb.setLRCOTIPLANBIENTOTALDESC falta este campo en la BD

                                //LRCOTIPLANBIENCOBERTURA
                                List<Lrcoberturaplan> lrCoberturaPlanList = lrCoberturaPlanManager.obtenerLrCoberturaPlan(planAprob);

                                lrCotiPlanBienCoberturaList = new ArrayList<>();
                                for (Lrcoberturaplan lrCoberturaPlan : lrCoberturaPlanList) {
                                    Lrcotiplanbiencobertura lrcpbc = new Lrcotiplanbiencobertura();
                                    if (cotidatbienase != null && cotidatbienase.getCotidatbienasercadicional() == 1) {
                                        lrcpbc.setSmodocoberturaid(lrModoCoberturaManager.find(41L));

                                    } else if (cotidatbienase != null && cotidatbienase.getCotidatbienasercadicional() == 2) {
                                        lrcpbc.setSmodocoberturaid(lrModoCoberturaManager.find(42L));
                                    } else if (cotidatbienase != null && cotidatbienase.getCotidatbienasercadicional() == 3) {
                                        lrcpbc.setSmodocoberturaid(lrModoCoberturaManager.find(43L));
                                    } else if (cotidatbienase != null && cotidatbienase.getCotidatbienasercadicional() == 4) {
                                        lrcpbc.setSmodocoberturaid(lrModoCoberturaManager.find(61L));
                                    } else {
                                        lrcpbc.setSmodocoberturaid(lrModoCoberturaManager.find(1L));
                                    }
                                    lrcpbc.setScoberturaplanid(lrCoberturaPlan);
                                    lrcpbc.setLrcotiplanbien(lrcpb);
                                    lrcpbc.setLrcotiplanbiencoberturaporc(BigDecimal.ZERO);
                                    if (lrCoberturaPlan.getCoberturastipid() == 1) {
                                        lrcpbc.setLrcotiplanbiencoberturavalor(getCotiF(1));
                                    } else if (lrCoberturaPlan.getCoberturastipid() == 2) {
                                        lrcpbc.setLrcotiplanbiencoberturavalor(getCotiF(2));
                                    } else if (lrCoberturaPlan.getCoberturastipid() == 3) {
                                        lrcpbc.setLrcotiplanbiencoberturavalor(getCotiF(3));
                                    } else if (lrCoberturaPlan.getCoberturastipid() == 4) {
                                        lrcpbc.setLrcotiplanbiencoberturavalor(getCotiF(4));
                                    } else if (lrCoberturaPlan.getCoberturastipid() == 5) {
                                        lrcpbc.setLrcotiplanbiencoberturavalor(getCotiF(5));
                                    } else if (lrCoberturaPlan.getCoberturastipid() == 6) {
                                        lrcpbc.setLrcotiplanbiencoberturavalor(getCotiF(6));
                                    } else if (lrCoberturaPlan.getCoberturastipid() == 7) {
                                        lrcpbc.setLrcotiplanbiencoberturavalor(getCotiF(7));
                                    } else if (lrCoberturaPlan.getCoberturastipid() == 8) {
                                        lrcpbc.setLrcotiplanbiencoberturavalor(getCotiF(8));
                                    } else if (lrCoberturaPlan.getCoberturastipid() == 9) {
                                        lrcpbc.setLrcotiplanbiencoberturavalor(getCotiF(9));
                                    } else if (lrCoberturaPlan.getCoberturastipid() == 10) {
                                        lrcpbc.setLrcotiplanbiencoberturavalor(getCotiF(10));
                                    } else if (lrCoberturaPlan.getCoberturastipid() == 11) {
                                        lrcpbc.setLrcotiplanbiencoberturavalor(getCotiF(11));
                                    } else if (lrCoberturaPlan.getCoberturastipid() == 12) {
                                        lrcpbc.setLrcotiplanbiencoberturavalor(getCotiF(12));
                                    } else if (lrCoberturaPlan.getCoberturastipid() == 13) {
                                        lrcpbc.setLrcotiplanbiencoberturavalor(getCotiF(14));
                                    } else if (lrCoberturaPlan.getCoberturastipid() == 14) {
                                        lrcpbc.setLrcotiplanbiencoberturavalor(getCotiF(15));
                                    } else if (lrCoberturaPlan.getCoberturastipid() == 15) {
                                        lrcpbc.setLrcotiplanbiencoberturavalor(getCotiF(16));
                                    } else if (lrCoberturaPlan.getCoberturastipid() == 16) {
                                        lrcpbc.setLrcotiplanbiencoberturavalor(getCotiF(18));
                                    } else if (lrCoberturaPlan.getCoberturastipid() == 17) {
                                        lrcpbc.setLrcotiplanbiencoberturavalor(getCotiF(19));
                                    }
                                    lrcpbc.setLrcotiplanbiencoberturaual("mmuser");
                                    lrcpbc.setLrcotiplanbiencoberturafal(new Date());
                                    lrcpbc.setLrcotiplanbiencoberturaumd("mmuser");
                                    lrcpbc.setLrcotiplanbiencoberturafmd(new Date());

                                    lrCotiPlanBienCoberturaList.add(lrcpbc);
                                }

                                //LRCOTIPLANBIENPREMIO
                                for (Cotidetsecciones cds : c.getCotidetseccionesList()) {
                                    Lrcotiplanbienpremio lrcpbp = new Lrcotiplanbienpremio();
                                    LrcotiplanbienpremioPK lrcpbppk = new LrcotiplanbienpremioPK();

                                    lrcpbppk.setLrcotizacionnro(lrc.getLrcotizacionPK().getLrcotizacionnro());
                                    lrcpbppk.setScotizacionversion(lrc.getLrcotizacionPK().getLrcotizacionversion());
                                    lrcpbppk.setStipoplanid(lrcpb.getLrcotiplanbienPK().getStipoplanid());
                                    lrcpbppk.setSparmcotiplanid(lrcpb.getLrcotiplanbienPK().getSparmcotiplanid());
                                    lrcpbppk.setSseccdetalleid(lrcpb.getLrcotiplanbienPK().getSseccdetalleid());
                                    lrcpbppk.setScotidatbienaseid(lrcdba.getLrcotidatbienasePK().getLrcotidatbienaseid());

                                    lrcpbp.setLrcotiplanbienpremioPK(lrcpbppk);
                                    Lrtipopremio lrtp = (Lrtipopremio) new GenericManagerDestino<>(Lrtipopremio.class).find(obtenerTipoPremioId(c.getCotizacionestipofranquicia(), c.getCotizacionesaprobcontclr(), cds.getCotidetseccionescancuotas()));
                                    lrcpbp.setLrtipopremio(lrtp);
                                    lrcpbppk.setLrtipopremioid(lrtp.getLrtipopremioid());
                                    lrcpbp.setLrcotiplanbien(lrcpb);
                                    //lrcpbp.setLRTIPOPLANGRUPID // NO SE ENCUETRAN EL CAMPO
                                    lrcpbp.setLrcotiplanbienpremiomonto(BigDecimal.ZERO);
                                    lrcpbp.setLrcotiplanbienpremiodescmat(BigDecimal.ZERO);
                                    lrcpbp.setLrcotiplanbienpremiorecmat(BigDecimal.ZERO);
                                    lrcpbp.setLrcotiplanbienpremiodescrea(BigDecimal.ZERO);
                                    lrcpbp.setLrcotiplanbienpremiorecrea(BigDecimal.ZERO);
                                    lrcpbp.setLrcotiplanbienpremiodesccoa(BigDecimal.ZERO);
                                    lrcpbp.setLrcotiplanbienpremioreccoa(BigDecimal.ZERO);
                                    lrcpbp.setLrcotiplanbienpremioprimtecbru(getCotiF(37L));
                                    lrcpbp.setLrcotiplanbienpremiodesctec(getCotiF(46L));
                                    lrcpbp.setLrcotiplanbienpremiotasatec(BigDecimal.ZERO);
                                    lrcpbp.setLrcotiplanbienpremiodesccorp(getCotiF(51L));
                                    if (c.getCotizacionestipofranquicia() == null) {
                                        lrcpbp.setLrcotiplanbienpremiommu(BigDecimal.ZERO);
                                        lrcpbp.setLrcotiplanbienpremioprimatecne(BigDecimal.ZERO);
                                        lrcpbp.setLrcotiplanbienpremiosubtotcomi(BigDecimal.ZERO);
                                        lrcpbp.setLrcotiplanbienpremiogtoadm(BigDecimal.ZERO);
                                        lrcpbp.setLrcotiplanbienpremioprimacomne(BigDecimal.ZERO);
                                        lrcpbp.setLrcotiplanbienpremioiva(BigDecimal.ZERO);
                                        lrcpbp.setLrcotiplanbienpremiocomicontra(BigDecimal.ZERO);
                                        lrcpbp.setLrcotiplanbienpremioajustetc(BigDecimal.ZERO);
                                        lrcpbp.setLrcotiplanbienpremiosubtotalco(BigDecimal.ZERO);
                                    } else if (c.getCotizacionestipofranquicia() == 0) {
                                        lrcpbp.setLrcotiplanbienpremiommu(getCotiF(72L));
                                        lrcpbp.setLrcotiplanbienpremioprimatecne(getCotiF(56L));
                                        lrcpbp.setLrcotiplanbienpremiosubtotcomi(getCotiF(56L).subtract(getCotiF(51L)));
                                        lrcpbp.setLrcotiplanbienpremiogtoadm(getCotiF(67));
                                        lrcpbp.setLrcotiplanbienpremioprimacomne(getCotiF(68));
                                        lrcpbp.setLrcotiplanbienpremioiva(getCotiF(69));
                                        lrcpbp.setLrcotiplanbienpremiocomicontra(getCotiF(77));
                                        lrcpbp.setLrcotiplanbienpremioajustetc(getCotiF(142));
                                        lrcpbp.setLrcotiplanbienpremiosubtotalco(getCotiF(56).subtract(getCotiF(51)).add(getCotiF(65)));

                                    } else if (c.getCotizacionestipofranquicia() == 11) {

                                        lrcpbp.setLrcotiplanbienpremiommu(getCotiF(118L));
                                        lrcpbp.setLrcotiplanbienpremioprimatecne(getCotiF(100L));
                                        lrcpbp.setLrcotiplanbienpremiosubtotcomi(lrcpbp.getLrcotiplanbienpremioprimatecne());
                                        lrcpbp.setLrcotiplanbienpremiogtoadm(getCotiF(106));
                                        lrcpbp.setLrcotiplanbienpremioprimacomne(getCotiF(109));
                                        lrcpbp.setLrcotiplanbienpremioiva(getCotiF(112));
                                        BigDecimal cotiF = getCotiF(133);
                                        if (cotiF == null) {
                                            lrcpbp.setLrcotiplanbienpremiocomicontra(getCotiF(87));
                                        } else if (cotiF.compareTo(BigDecimal.ZERO) == 0) {
                                            lrcpbp.setLrcotiplanbienpremiocomicontra(getCotiF(87));
                                        }
                                        lrcpbp.setLrcotiplanbienpremioajustetc(getCotiF(146));
                                        lrcpbp.setLrcotiplanbienpremiosubtotalco(getCotiF(100).add(getCotiF(65)));

                                    } else if (c.getCotizacionestipofranquicia() == 12) {

                                        lrcpbp.setLrcotiplanbienpremiommu(getCotiF(119L));
                                        lrcpbp.setLrcotiplanbienpremioprimatecne(getCotiF(101L));
                                        lrcpbp.setLrcotiplanbienpremiosubtotcomi(lrcpbp.getLrcotiplanbienpremioprimatecne());
                                        lrcpbp.setLrcotiplanbienpremiogtoadm(getCotiF(107));
                                        lrcpbp.setLrcotiplanbienpremioprimacomne(getCotiF(110));
                                        lrcpbp.setLrcotiplanbienpremioiva(getCotiF(113));
                                        BigDecimal cotiF = getCotiF(134);
                                        if (cotiF == null) {
                                            lrcpbp.setLrcotiplanbienpremiocomicontra(getCotiF(89));
                                        } else if (cotiF.compareTo(BigDecimal.ZERO) == 0) {
                                            lrcpbp.setLrcotiplanbienpremiocomicontra(getCotiF(89));
                                        }
                                        lrcpbp.setLrcotiplanbienpremioajustetc(getCotiF(150));
                                        lrcpbp.setLrcotiplanbienpremiosubtotalco(getCotiF(101).add(getCotiF(65)));

                                    } else if (c.getCotizacionestipofranquicia() == 13) {

                                        lrcpbp.setLrcotiplanbienpremiommu(getCotiF(120L));
                                        lrcpbp.setLrcotiplanbienpremioprimatecne(getCotiF(102L));
                                        lrcpbp.setLrcotiplanbienpremiosubtotcomi(lrcpbp.getLrcotiplanbienpremioprimatecne());
                                        lrcpbp.setLrcotiplanbienpremiogtoadm(getCotiF(108));
                                        lrcpbp.setLrcotiplanbienpremioprimacomne(getCotiF(111));
                                        lrcpbp.setLrcotiplanbienpremioiva(getCotiF(114));
                                        BigDecimal cotiF = getCotiF(135);
                                        if (cotiF == null) {
                                            lrcpbp.setLrcotiplanbienpremiocomicontra(getCotiF(91));
                                        } else if (cotiF.compareTo(BigDecimal.ZERO) == 0) {
                                            lrcpbp.setLrcotiplanbienpremiocomicontra(getCotiF(91));
                                        }
                                        lrcpbp.setLrcotiplanbienpremioajustetc(getCotiF(154));
                                        lrcpbp.setLrcotiplanbienpremiosubtotalco(getCotiF(102).add(getCotiF(65)));
                                    }

                                    BigDecimal imc = polsdemiManager.obtenerImpComisionContrato(secc, polNro, nroPropuesta);
                                    lrcpbp.setLrcotiplanbienpremiocomicontra(imc);
                                    lrcpbp.setLrcotiplanbienpremiocominegoci(imc);
                                    lrcpbp.setLrcotiplanbienpremiocomicedida(BigDecimal.ZERO);
                                    lrcpbp.setLrcotiplanbienpremiootrosgtos(getCotiF(65L));
                                    lrcpbp.setLrcotiplanbienpremioprimacombr(getCotiF(66));
                                    lrcpbp.setLrcotiplanbienpremioreccom(getCotiF(39).add(getCotiF(40).add(getCotiF(41)).add(getCotiF(42))));
                                    lrcpbp.setLrcotiplanbienpremiodesccom(getCotiF(47).add(getCotiF(49)).add(getCotiF(53)).add(getCotiF(55)).add(getCotiF(76)));
                                    lrcpbp.setLrcotiplanbienpremiobonificaci(getCotiF(44));
                                    lrcpbp.setLrcotiplanbienpremiotasacomnet(BigDecimal.ZERO);
                                    lrcpbp.setLrcotiplanbienpremiorpf(BigDecimal.ZERO);
                                    lrcpbp.setLrcotiplanbienpremiodescrpf(BigDecimal.ZERO);

                                    lrCotiPlanBienPremioList.add(lrcpbp);

                                    lrCotiPlanBienGastoList = new ArrayList<>();
                                    LrcotiplanbiendescList = new ArrayList<>();
                                    for (Cotiitemformulas cif : cds.getCotiitemformulasList()) {
                                        //LRCOTIPLANBIENGASTO
                                        Lrcotiplanbiengasto lrg = new Lrcotiplanbiengasto();
                                        lrg.setLrcotiplanbien(lrcpb);
                                        if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 58) {
                                            lrg.setLrcotiplanbiengastotiposervid(5L);
                                            lrg.setLrcotiplanbiengastoprovid(3863L);
                                        } else if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 59) {
                                            lrg.setLrcotiplanbiengastotiposervid(4L);
                                            lrg.setLrcotiplanbiengastoprovid(3402L);
                                        } else if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 60) {
                                            lrg.setLrcotiplanbiengastotiposervid(11L);
                                            lrg.setLrcotiplanbiengastoprovid(3403L);
                                        } else if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 61) {
                                            lrg.setLrcotiplanbiengastotiposervid(9);
                                            lrg.setLrcotiplanbiengastoprovid(8498L);
                                        } else if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 62) {
                                            lrg.setLrcotiplanbiengastotiposervid(8);
                                            lrg.setLrcotiplanbiengastoprovid(3L);
                                        } else if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 63) {
                                            lrg.setLrcotiplanbiengastotiposervid(10);
                                            lrg.setLrcotiplanbiengastoprovid(3L);
                                        } else if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 67) {
                                            lrg.setLrcotiplanbiengastotiposervid(1);
                                            lrg.setLrcotiplanbiengastoprovid(3L);
                                        } else if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 39) {
                                            lrg.setLrcotiplanbiengastotiposervid(24);
                                            lrg.setLrcotiplanbiengastoprovid(3L);
                                        } else if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 40) {
                                            lrg.setLrcotiplanbiengastotiposervid(26);
                                            lrg.setLrcotiplanbiengastoprovid(3L);
                                        } else if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 41) {
                                            lrg.setLrcotiplanbiengastotiposervid(25);
                                            lrg.setLrcotiplanbiengastoprovid(3L);
                                        } else if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 42) {
                                            lrg.setLrcotiplanbiengastotiposervid(27);
                                            lrg.setLrcotiplanbiengastoprovid(3L);
                                        } else {
                                            lrg.setLrcotiplanbiengastotiposervid(28);
                                            lrg.setLrcotiplanbiengastoprovid(3L);
                                        }
                                        lrg.setLrcotiplanbiengastotiposervdes(lrParmCotiPlanSeccManager.obtenerNombreServicio(lrg.getLrcotiplanbiengastotiposervid()));
//                                    lrg.setLrcotiplanbiengastovalor(); NO entendi
//                                    lrg.setLrcotiplanbiengastoporc(); No entendi
                                        lrg.setLrcotiplanbiengastoual("mmuser");
                                        lrg.setLrcotiplanbiengastofal(new Date());
                                        lrg.setLrcotiplanbiengastoumd("mmuser");
                                        lrg.setLrcotiplanbiengastofmd(new Date());
                                        lrCotiPlanBienGastoList.add(lrg);

                                        //LRCOTIPLANBIENDESC
                                        Lrcotiplanbiendesc lrcpbd = null;
                                        if (c.getCotizacionestipocoti() != null && c.getCotizacionestipocoti() == 1) {
                                            if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 43 && cif.getCotiitemformulasvalc() != null && cif.getCotiitemformulasvalc().compareTo(BigDecimal.ZERO) > 0) {
                                                lrcpbd = crearLrCotiPlanBienDesc(lrcpb, cif, 52);
                                            } else if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 47 && cif.getCotiitemformulasvalc() != null && cif.getCotiitemformulasvalc().compareTo(BigDecimal.ZERO) > 0) {
                                                lrcpbd = crearLrCotiPlanBienDesc(lrcpb, cif, 161);
                                                if (lrcpbd != null) {
                                                    lrcpbd.setLrcotiplanbiendescvalor(cif.getCotiitemformulasvalc());
                                                }
                                            }
                                        } else {
                                            if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 45 && cif.getCotiitemformulasvalc() != null && cif.getCotiitemformulasvalc().compareTo(BigDecimal.ZERO) > 0) {
                                                lrcpbd = crearLrCotiPlanBienDesc(lrcpb, cif, 21);
                                            } else if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 48 && cif.getCotiitemformulasvalc() != null && cif.getCotiitemformulasvalc().compareTo(BigDecimal.ZERO) > 0) {
                                                lrcpbd = crearLrCotiPlanBienDesc(lrcpb, cif, 44);
                                            } else if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 52 && cif.getCotiitemformulasvalc() != null && cif.getCotiitemformulasvalc().compareTo(BigDecimal.ZERO) > 0) {
                                                lrcpbd = crearLrCotiPlanBienDesc(lrcpb, cif, 163);
                                            } else if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 54 && cif.getCotiitemformulasvalc() != null && cif.getCotiitemformulasvalc().compareTo(BigDecimal.ZERO) > 0) {
                                                lrcpbd = crearLrCotiPlanBienDesc(lrcpb, cif, 45);
                                            } else if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 50 && cif.getCotiitemformulasvalc() != null && cif.getCotiitemformulasvalc().compareTo(BigDecimal.ZERO) > 0) {
                                                lrcpbd = crearLrCotiPlanBienDesc(lrcpb, cif, 24);
                                            } else if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 93 && cif.getCotiitemformulasvalc() != null && cif.getCotiitemformulasvalc().compareTo(BigDecimal.ZERO) > 0) {
                                                lrcpbd = crearLrCotiPlanBienDesc(lrcpb, cif, 162);
                                            } else if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 75 && cif.getCotiitemformulasvalc() != null && cif.getCotiitemformulasvalc().compareTo(BigDecimal.ZERO) > 0) {
                                                lrcpbd = crearLrCotiPlanBienDesc(lrcpb, cif, 23);
                                            } else if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 94 && cif.getCotiitemformulasvalc() != null && cif.getCotiitemformulasvalc().compareTo(BigDecimal.ZERO) > 0) {
                                                lrcpbd = crearLrCotiPlanBienDesc(lrcpb, cif, 144);
                                            } else if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 95 && cif.getCotiitemformulasvalc() != null && cif.getCotiitemformulasvalc().compareTo(BigDecimal.ZERO) > 0) {
                                                lrcpbd = crearLrCotiPlanBienDesc(lrcpb, cif, 145);
                                            } else if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 140 && cif.getCotiitemformulasvalc() != null && cif.getCotiitemformulasvalc().compareTo(BigDecimal.ZERO) > 0) {
                                                lrcpbd = crearLrCotiPlanBienDesc(lrcpb, cif, 61);
                                            } else if (cif.getCotiitemformulasPK().getCotiitemformulasid() == 96 && cif.getCotiitemformulasvalc() != null && cif.getCotiitemformulasvalc().compareTo(BigDecimal.ZERO) > 0) {
                                                lrcpbd = crearLrCotiPlanBienDesc(lrcpb, cif, 146);
                                            }
                                        }
                                        if (lrcpbd != null) {
                                            LrcotiplanbiendescList.add(lrcpbd);
                                        }

                                    }

                                    lrcpb.setLrcotiplanbiencoberturaList(lrCotiPlanBienCoberturaList);
                                    lrcpb.setLrcotiplanbienpremioList(lrCotiPlanBienPremioList);
                                    lrcpb.setLrcotiplanbiengastoList(lrCotiPlanBienGastoList);
                                    lrcpb.setLrcotiplanbiendescList(LrcotiplanbiendescList);
                                    lrCotiPlanBienList.add(lrcpb);
                                    lrcp.setLrcotiplanbienList(lrCotiPlanBienList);

                                }

                            }

                            lru.setLrcotidatbienaseList(lrCotiDatBienAseList);
                            lrUbicacionList.add(lru);
                        }
                        lrCotizacionList.add(lrc);

                        lrc.setLrubicacionList(lrUbicacionList);
                        lrc.setLrcotizacionplanList(lrCotizacionPlanList);
                        lrp.setLrcotizacionList(lrCotizacionList);

//                        entitymanager.persist(lrp);
                        if ((persistCount % 1) == 0) {
                            entitymanager.getTransaction().commit();
                            entitymanager.clear();
                            entitymanager.getTransaction().begin();
                            System.out.println("commit: " + persistCount);
                            System.out.println("Ultimo Cursor nro persistido: " + cursorNro);
                            cursorNro++;
                        }
                        lrUbicacionList = new ArrayList<>();
                        lrCotizacionList = new ArrayList<>();
                        lrCotiDatBienAseList = new ArrayList<>();
                        lrDatosVehiculosList = new ArrayList<>();
                        lrCotizacionPlanList = new ArrayList<>();
                        lrCotiPlanBienList = new ArrayList<>();
                        lrCotiPlanBienCoberturaList = new ArrayList<>();
                        lrCotiPlanBienPremioList = new ArrayList<>();
                        lrCotiPlanBienGastoList = new ArrayList<>();
                        LrcotiplanbiendescList = new ArrayList<>();

                        persistCount++;
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

        //Migradmos LrDatosdevehiculos 
//        entitymanager = emfactory.createEntityManager();
//        entitymanager.getTransaction().begin();
//
//        countAux = 0;
//        while (countAux < countPolsdemi) {
//            List<Object[]> polsdemiObjectList = polsdemiManager.obtenerPolsdemiParaAutomoviles(secc, ejercicio, anexo, new int[]{countAux, 100 + countAux}, estado, tipoOperacion);
//
//            for (Object[] polObject : polsdemiObjectList) {
//                Lrdatosvehiculo lrdv = new Lrdatosvehiculo();
//            }
//        }
    }

    private static Lrcotiplanbiendesc crearLrCotiPlanBienDesc(Lrcotiplanbien lrcpb, Cotiitemformulas cif, int ajusteId) {
        Lrcotiplanbiendesc lrcpbd = new Lrcotiplanbiendesc();
        lrcpbd.setLrcotiplanbiendescvalor(BigDecimal.ZERO);
        Lrajusteplan ajustePlan = lrAjustePlanManager.obtenerLrAjustePlan(ajusteId, lrcpb.getLrcotiplanbienPK().getSseccdetalleid(), lrcpb.getLrcotiplanbienPK().getSparmcotiplanid(), lrcpb.getLrcotiplanbienPK().getStipoplanid());

        if (ajustePlan == null) {
            return null;
        }

        lrcpbd.setLrajusteplan(ajustePlan);
        lrcpbd.setLrcotiplanbiendescporc(cif.getCotiitemformulasvalc() == null ? BigDecimal.ZERO : cif.getCotiitemformulasvalc());
        lrcpbd.setLrcotiplanbien(lrcpb);
        lrcpbd.setLrcotiplanbiendescual("mmuser");
        lrcpbd.setLrcotiplanbiendescfal(new Date());
        lrcpbd.setLrcotiplanbiendescumd(("mmuser"));
        lrcpbd.setLrcotiplanbiendescfmd(new Date());

        return lrcpbd;

    }

    public MigradorAutomoviles501() {
    }

    private static Long obtenerTipoPremioId(Short tipoFranquicia, Character probcontclr, Short cantCuotas) {
        
       if (tipoFranquicia == null){
           tipoFranquicia = 0;
       }
       
       if (probcontclr == null){
           probcontclr = 'N';
       }
       
       if (cantCuotas == null){
           cantCuotas = 0;
       }
        
        if (tipoFranquicia != null && tipoFranquicia == 0) {
            if (probcontclr != null && probcontclr == 'S') {
                if (cantCuotas != null && cantCuotas > 0) {
                    return 33L;
                } else {
                    return 1L;
                }
            } else {
                if (cantCuotas != null && cantCuotas > 0) {
                    return 4L;
                } else {
                    return 3L;
                }
            }
        }
        if (tipoFranquicia != null && tipoFranquicia == 11) {
            if (probcontclr != null && probcontclr == 'S') {
                if (cantCuotas != null && cantCuotas > 0) {
                    return 30L;
                } else {
                    return 27L;
                }
            } else {
                if (cantCuotas != null && cantCuotas > 0) {
                    return 24L;
                } else {
                    return 21L;
                }
            }
        }
        if (tipoFranquicia != null && tipoFranquicia == 12) {
            if (probcontclr != null && probcontclr == 'S') {
                if (cantCuotas != null && cantCuotas > 0) {
                    return 31L;
                } else {
                    return 28L;
                }
            } else {
                if (cantCuotas != null && cantCuotas > 0) {
                    return 25L;
                } else {
                    return 22L;
                }
            }
        }
        if (tipoFranquicia != null && tipoFranquicia == 13) {
            if (probcontclr != null && probcontclr == 'S') {
                if (cantCuotas != null && cantCuotas > 0) {
                    return 32L;
                } else {
                    return 29L;
                }
            } else {
                if (cantCuotas != null && cantCuotas > 0) {
                    return 26L;
                } else {
                    return 23L;
                }
            }
        }

        return 0l;
    }

    public static BigDecimal getCotiF(long l) {
        Cotiitemformulas cif = cotiItemFormulasManager.obtenerCotiItemFormula(l, nroCotizacionAMigrar, tipoCotiItemFormula);

        if (cif == null) {
            return BigDecimal.ZERO;
        } else {
            return cif.getCotiitemformulasvalc();
        }
    }

}
