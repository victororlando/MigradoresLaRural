/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.py.larural.migrador;

import com.py.larural.oradestino.GenericManagerDestino;
import com.py.larural.oradestino.LrAccionSubAccionManager;
import com.py.larural.oradestino.LrAreaSubAreaManager;
import com.py.larural.oradestino.LrClaseAsegManager;
import com.py.larural.oradestino.LrClasePolizaManager;
import com.py.larural.oradestino.LrCotiDatBienAseManager;
import com.py.larural.oradestino.LrCotizacionManager;
import com.py.larural.oradestino.LrEstadoCotizacionManager;
import com.py.larural.oradestino.LrModoCotizacionManager;
import com.py.larural.oradestino.LrPersonaManager;
import com.py.larural.oradestino.LrPersonaTcManager;
import com.py.larural.oradestino.LrSeccDetalleManager;
import com.py.larural.oraorigen.AccPersonalesManager;
import com.py.larural.oraorigen.BeneficiarioManager;
import com.py.larural.oraorigen.CoberturasDetalleManager;
import com.py.larural.oraorigen.ItemDePolizasManager;
import com.py.larural.oraorigen.PolsdemiManager;
import entidades.larural.destino.Lraccionsubacccion;
import entidades.larural.destino.Lragrupacargo;
import entidades.larural.destino.Lragrupacargoturno;
import entidades.larural.destino.Lrareasubarea;
import entidades.larural.destino.Lrbeneficiario;
import entidades.larural.destino.Lrclaseaseg;
import entidades.larural.destino.Lrclasepoliza;
import entidades.larural.destino.Lrcotibientexto;
import entidades.larural.destino.Lrcoticoaseguro;
import entidades.larural.destino.Lrcotidatbienase;
import entidades.larural.destino.LrcotidatbienasePK;
import entidades.larural.destino.Lrcotizacion;
import entidades.larural.destino.LrcotizacionPK;
import entidades.larural.destino.Lrestadocotizacion;
import entidades.larural.destino.Lrestadopropuesta;
import entidades.larural.destino.Lrflujocotizacion;
import entidades.larural.destino.Lrflujocotizaciondet;
import entidades.larural.destino.Lrmedidaprestacion;
import entidades.larural.destino.Lrmodocotizacion;
import entidades.larural.destino.Lrobjetoseguro;
import entidades.larural.destino.Lrpersona;
import entidades.larural.destino.Lrpersonaasegurada;
import entidades.larural.destino.Lrpersonatc;
import entidades.larural.destino.Lrpropuesta;
import entidades.larural.destino.Lrseccdetalle;
import entidades.larural.destino.Lrtipocotizacion;
import entidades.larural.destino.Lrtipopropuesta;
import entidades.larural.destino.Lrturno;
import entidades.larural.destino.Lrubicacion;
import entidades.larural.origen.AccPersonales;
import entidades.larural.origen.Beneficiarios;
import entidades.larural.origen.CoberturasDetalle;
import entidades.larural.origen.Districoase;
import entidades.larural.origen.ItemDePolizas;
import entidades.larural.origen.ItemDePolizasMe;
import entidades.larural.origen.Polsdemi;
import entidades.larural.origen.Tarjetas;
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
public class MigradorAccidentesPersonales401_403 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tiempoInicio, tiempoFin;
        tiempoInicio = System.currentTimeMillis();
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("MigradorLaRuralPU");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

        short secc[] = {401, 403};
        short ejercicio = 2017;
        short anexo = 0;
        short estado = 1;
        short tipoOperacion = 1;

        //Managers
        PolsdemiManager polsdemiManager = new PolsdemiManager(Polsdemi.class, "MigradorLaRuralOrigenPU");
        ItemDePolizasManager itemDePolizaManager = new ItemDePolizasManager(ItemDePolizas.class, "MigradorLaRuralOrigenPU");
        LrPersonaManager lrPersonaManager = new LrPersonaManager(Lrpersona.class, "MigradorLaRuralPU");
        LrClaseAsegManager lrClaseAsegManager = new LrClaseAsegManager(Lrclaseaseg.class, "MigradorLaRuralPU");
        LrClasePolizaManager lrClasePolizaManager = new LrClasePolizaManager(Lrclasepoliza.class, "MigradorLaRuralPU");
        GenericManagerDestino<Lrestadopropuesta> lrEstadoPropuestaManager = new GenericManagerDestino<>(Lrestadopropuesta.class);
        LrSeccDetalleManager lrSeccDetalleManager = new LrSeccDetalleManager(Lrseccdetalle.class, "MigradorLaRuralPU");
        LrEstadoCotizacionManager lrEstadoCotizacionManager = new LrEstadoCotizacionManager(Lrestadocotizacion.class, "MigradorLaRuralPU");
        LrModoCotizacionManager lrModoCotizacionManager = new LrModoCotizacionManager(Lrmodocotizacion.class, "MigradorLaRuralPU");
        LrAreaSubAreaManager lrAreaSubAreaManager = new LrAreaSubAreaManager(Lrareasubarea.class, "MigradorLaRuralPU");
        LrAccionSubAccionManager lrAccionSubAccionManager = new LrAccionSubAccionManager(Lraccionsubacccion.class, "MigradorLaRuralPU");
        LrCotizacionManager lrCotizacionManager = new LrCotizacionManager(Lrcotizacion.class, "MigradorLaRuralPU");
        LrCotiDatBienAseManager lrCotiDatBienAseManager = new LrCotiDatBienAseManager(Lrcotidatbienase.class, "MigradorLaRuralPU");
        CoberturasDetalleManager coberturasDetalleManager = new CoberturasDetalleManager(CoberturasDetalle.class, "MigradorLaRuralOrigenPU");
        AccPersonalesManager accPersonalesManager = new AccPersonalesManager(AccPersonales.class, "MigradorLaRuralOrigenPU");
        BeneficiarioManager beneficiarioManager = new BeneficiarioManager(Beneficiarios.class, "MigradorLaRuralOrigenPU");
        LrPersonaTcManager lrPersonaTcManager = new LrPersonaTcManager(Lrpersonatc.class, "MigradorLaRuralPU");

        //Entidades especificas
        Lrtipopropuesta lrTipoPropuestaLicitacion = (Lrtipopropuesta) new GenericManagerDestino<>(Lrtipopropuesta.class).genericFind("lrtipopropuestadesc", "LICITACION");
        Lrtipopropuesta lrTipoPropuestaNormal = (Lrtipopropuesta) new GenericManagerDestino<>(Lrtipopropuesta.class).genericFind("lrtipopropuestadesc", "NORMAL");
        Lrestadopropuesta lretadopropuestaAprobado = (Lrestadopropuesta) lrEstadoPropuestaManager.genericFind("lrestadopropuestadesc", "APROBADO");
        Lrestadocotizacion lrEstadoContizacionImpactado = lrEstadoCotizacionManager.obtenerLrSeccDetallePorSecc("IMPACTADO");
        Lrtipocotizacion lrTipoCotizacion = (Lrtipocotizacion) new GenericManagerDestino<>(Lrtipocotizacion.class).genericFind("lrtipocotizaciondesc", "Normal");
        Lrmedidaprestacion lrMedidaPrestacion = (Lrmedidaprestacion) new GenericManagerDestino<>(Lrmedidaprestacion.class).genericFind("lrmedidaprestaciondesc", "A PRIMER RIESGO");
        Lrseccdetalle lrseccDetallePorSecc = lrSeccDetalleManager.obtenerLrSeccDetallePorSecc(secc);
        Lrareasubarea lrAreaSubareaMigracion = lrAreaSubAreaManager.obtenerAreaSubArea("MIGRACIONES");
        Lraccionsubacccion lrAccionSubAccionMigracion = lrAccionSubAccionManager.obtenerAccionSubAccion("MIGRACIONES");
        long lastIdLrCotizacion = lrCotizacionManager.lastId();
        long lastLrCotiDatBienAseId = lrCotiDatBienAseManager.lastId();
        Lragrupacargo lrAgrupaCargoMigracion = (Lragrupacargo) new GenericManagerDestino<>(Lragrupacargo.class).genericFind("lragrupacargodesc", "CARGO MIGRACION");
        Lrturno lrTurnoSinTurno = (Lrturno) new GenericManagerDestino<>(Lrturno.class).genericFind("lrturnodesc", "SIN TURNO");
        Lrobjetoseguro lrObjetoSeguroMayores70 = (Lrobjetoseguro) new GenericManagerDestino<>(Lrobjetoseguro.class).genericFind("lrobjetosegurodesc", "MAYORES A 70 AÑOS");

        //Map de valores
        Map<Long, Lrpersona> mapLrPersona = lrPersonaManager.obtenerLrPersonasConAseId();
        Map<String, Lrclaseaseg> lrClaseAsegMap = lrClaseAsegManager.obtenerMapaDeRegistros();
        Map<String, Lrclasepoliza> lrClasePolizaMap = lrClasePolizaManager.obtenerMapaRegistros();
        Map<String, Lrmodocotizacion> lrModoCotizacionMap = lrModoCotizacionManager.obtenerMapaDeRegistros();
        Map<String, Tarjetas> tarjetasMap = polsdemiManager.obtenerTarjetas(secc, ejercicio, anexo);

        //Listas
        List<Lrcotizacion> lrCotizacionList = new ArrayList<>();
        List<Lrubicacion> lrUbicacionList = new ArrayList<>();
        List<Lrcotidatbienase> lrCotiDatBienAseList = new ArrayList<>();
        List<Lrcoticoaseguro> lrCoticoaseguroList = new ArrayList<>();
        List<Lrcotibientexto> lrCotiBienTextoList = new ArrayList<>();
        List<Lrflujocotizacion> lrFlujoCotizacionList = new ArrayList<>();
        List<Lrflujocotizaciondet> lrFlujoCotizacionDetList = new ArrayList<>();
        List<Lrpersonaasegurada> lrPersonaAseguradaList = new ArrayList<>();
        List<Lragrupacargoturno> lrAgrupaCargoTurnoList = new ArrayList<>();
        List<Lrbeneficiario> lrBeneficiariosList = new ArrayList<>();

        int countAux = 0;
        int countPolsdemi = polsdemiManager.count(secc, ejercicio, anexo, estado, tipoOperacion);
        System.out.println("Cantidad de registros a migrar: " + countPolsdemi);

        int persistCount = 1;

        int nulos = 0;
        BigDecimal sumatoriaPropuesta = BigDecimal.ZERO;
        BigDecimal sumatoriaCotizacion = BigDecimal.ZERO;
        BigDecimal sumatoriaUbicacion = BigDecimal.ZERO;
        BigDecimal sumatoriaCoti = BigDecimal.ZERO;
        while (countAux < countPolsdemi) {
            List<Polsdemi> polsdemiList = polsdemiManager.obtenerPolsdemi(secc, ejercicio, anexo, new int[]{countAux, 100 + countAux}, estado, tipoOperacion);

            for (Polsdemi pol : polsdemiList) {
                sumatoriaPropuesta = BigDecimal.ZERO;
                sumatoriaCotizacion = BigDecimal.ZERO;
                lastIdLrCotizacion = lastIdLrCotizacion + 1;
                if (mapLrPersona.get(pol.getNAseg().getNAseg().longValue()) != null) {
                    ////LRPROPUESTA/////
                    Lrpropuesta lrp = new Lrpropuesta();
                    lrp.setLrpropuestamonid(pol.getCodMoney().getCodMoney());
                    lrp.setLrpersonaid(mapLrPersona.get(pol.getNAseg().getNAseg().longValue()));
                    lrp.setLrestadopropuestaid(lretadopropuestaAprobado);
                    String claseAseg = pol.getPolsdemiClasifica() != null ? pol.getPolsdemiClasifica().getClaseAsegManual() : null;
                    if (claseAseg != null) {
                        lrp.setLrclaseasegid(lrClaseAsegMap.get(claseAseg.toUpperCase()));
                    }
                    lrp.setLrpropuestafecprop(pol.getFecha());
                    lrp.setLrpropuestavalortipcamb(pol.getTCambio());
                    lrp.setLrpropuestacomentario(pol.getTextoEspecial());
                    lrp.setLrpropuestanroflota(null); //TODO para secc = 501
                    lrp.setLrpropuestaagenciaid(Long.parseLong(pol.getCodAgcia().getCodAgcia().toString()));
                    lrp.setLrpropuestaususuc(null);
                    lrp.setLrpropuestaac('S');
                    lrp.setLrpropuestaual("mmig_user");
                    lrp.setLrpropuestafal(new Date());
                    lrp.setLrpropuestaumd("mmig_user");
                    lrp.setLrpropuestafmd(new Date());
                    lrp.setLrpropuestaoficialid(Long.parseLong(pol.getCodOrganizador().getCodOrganizador().toString()));
                    lrp.setLrpropuestaescoaseguro((pol.getDistricoaseList().isEmpty() == true ? 'N' : 'S'));
                    lrp.setLrtipopropuestaid(pol.getPorLicitacion() == 1 ? lrTipoPropuestaLicitacion : lrTipoPropuestaNormal);
                    lrp.setLrpropuestatodoriesgo('N'); //TODO ver para secc = 1099
                    if (pol.getNroCotizacionPack() != null && pol.getNroCotizacionPack() > 0) {
                        lrp.setLrpropuestaespack('S');
                    } else {
                        lrp.setLrpropuestaespack('N');
                    }

                    /////LRCOTIZACION
                    Lrcotizacion lrc = new Lrcotizacion();
                    LrcotizacionPK lrcpk = new LrcotizacionPK();
                    lrcpk.setLrcotizacionnro(lastIdLrCotizacion);
                    lrcpk.setLrcotizacionversion(1);
                    lrc.setLrcotizacionPK(lrcpk);
                    lrc.setLrpropuestaid(lrp);
                    lrc.setLrcotizacionfechacoti(pol.getFecha());
                    lrc.setLrcotizacionrubroid((!pol.getItemDePolizasList().isEmpty() ? pol.getItemDePolizasList().get(0).getCodRubro() == null ? null : (long) pol.getItemDePolizasList().get(0).getCodRubro().getCodRubro() : null));
                    lrc.setLrcotizacionsubrubroid((!pol.getItemDePolizasList().isEmpty() ? pol.getItemDePolizasList().get(0).getSubRubro() == null ? null : (long) pol.getItemDePolizasList().get(0).getSubRubro().getSubRubro() : null));
                    lrc.setLrestadocotizacionid(lrEstadoContizacionImpactado);
                    lrc.setLrseccdetalleid(lrseccDetallePorSecc);
                    String clasePoliza = pol.getPolsdemiClasifica() != null ? pol.getPolsdemiClasifica().getClasePolizaManual() : null;

                    if (clasePoliza == null) {
//                        System.out.println("");
                    }

                    if (clasePoliza != null) {
                        if (lrClasePolizaMap.get(clasePoliza.toUpperCase()) == null) {
//                            System.out.println("");
                        }

                        lrc.setLrclasepolizaid(lrClasePolizaMap.get(clasePoliza.toUpperCase()));
                    } else {
                        lrc.setLrclasepolizaid(lrClasePolizaMap.get("NUEVA"));
                    }

                    if (lrc.getLrclasepolizaid() == null) {
                        lrc.setLrclasepolizaid(lrClasePolizaMap.get("NUEVA"));
                    }

                    if (pol.getDeclaracion() != null && pol.getDeclaracion().equals("N")) {
                        if (pol.getCantDias() == 365) {
                            lrc.setLrmodocotizacionid(lrModoCotizacionMap.get("ANU"));
                        } else if (pol.getCantDias() > 365) {
                            lrc.setLrmodocotizacionid(lrModoCotizacionMap.get("MUA"));
                        } else if (pol.getCantDias() < 365) {
                            lrc.setLrmodocotizacionid(lrModoCotizacionMap.get("PC"));
                        }
                    } else if (pol.getDeclaracion() != null && pol.getDeclaracion().equals("S")) {
                        lrc.setLrmodocotizacionid(lrModoCotizacionMap.get("DM"));
                    }

                    lrc.setLrcotizacionagenteid(pol.getNAseg().getNAgte());
                    lrc.setLrcotizacionsubagenteid(pol.getNSub1());
                    lrc.setLrcotizacionformapagoid(pol.getCodFormaPago().getCodFormaPago());
                    lrc.setLrcotizaciontipocobroid(pol.getCodTipcobro().getCodTipcobro());
                    if (pol.getPolant() > 0) {
                        lrc.setLrcotizaciontipocoti((short) 2);
                    } else {
                        lrc.setLrcotizaciontipocoti((short) 1);
                    }

                    lrc.setLrcotizacioncobradorid(pol.getNCobr().getNCobr());
                    lrc.setLrcotizacionprendarioid(pol.getCodPrendario() == null ? 0L : pol.getCodPrendario());
                    lrc.setLrcotizacionpordeclaracion(pol.getDeclaracion() != null ? pol.getDeclaracion().charAt(0) : null);
                    lrc.setLrcotizacionvtotarjeta(pol.getVtoTarjeta() == null ? new Date() : pol.getVtoTarjeta());
                    lrc.setLrcotizacionnrotarjeta(pol.getNroTarjeta() == null ? " " : pol.getNroTarjeta());
                    if (pol.getNCobr().getNCobr() == 47 && pol.getCodEntidad() == 156 && pol.getCodTipcobro().getCodTipcobro() == 5) {
                        lrc.setLrcotizacionaprobcontclr('S');
                    } else {
                        lrc.setLrcotizacionaprobcontclr('N');
                    }
                    lrc.setLrcotizacionvigdesde(pol.getVigdes() == null ? new Date() : pol.getVigdes());
                    lrc.setLrcotizacionvighasta(pol.getVighas() == null ? new Date() : pol.getVighas());
                    lrc.setLrcotizacionvigencia((short) pol.getCantDias());
                    lrc.setLractividadid(!pol.getItemDePolizasList().isEmpty() == true ? pol.getItemDePolizasList().get(0).getCodActividad() != null ? (long) pol.getItemDePolizasList().get(0).getCodActividad().getCodActividad() : null : null);
                    lrc.setLrcotizacionnropoliza(pol.getPolsdemiPK().getPolnro());
                    //lrc.setLrcotizacionejerciciorenov();
                    //lrc.setLrcotizacionnropolizarenov();
                    lrc.setLrcotizacionanexo(pol.getPolsdemiPK().getAnexo());
                    //lrc.setLrcotizacionendoso();
                    //lrc.setLrcotizacionendosopor();
                    lrc.setLrcotizacionual("mmiguser");
                    lrc.setLrcotizacionfal(new Date());
                    lrc.setLrcotizacionumd("mmiguser");
                    lrc.setLrcotizacionfmd(new Date());
                    lrc.setEntidadid((pol.getCodEntidad() != null ? Long.parseLong(pol.getCodEntidad().toString()) : null));
                    lrc.setLrcotizaciondeclaraciondelmes(pol.getDeclaracion() != null ? pol.getDeclaracion().charAt(0) : null);
                    //lrc.setEndoprendaid();
                    lrc.setLrtipocotizacionid(lrTipoCotizacion == null ? null : lrTipoCotizacion.getLrtipocotizacionid());
                    lrc.setLrmedidaprestacionid(lrMedidaPrestacion == null ? null : lrMedidaPrestacion.getLrmedidaprestacionid());
                    lrc.setLrcotizacionac('S');
                    lrc.setLrcotizacionobs4(" ");
                    lrc.setLrcotizacionobs3(" ");
                    lrc.setLrcotizacionobs2(" ");
                    lrc.setLrcotizacionobs1(" ");
                    lrc.setLrcotizacionfchtope(new Date());
                    lrc.setLrcotizacionporpmd(null);
                    lrc.setLrcotizaciontasapactada(null);
                    lrc.setLrcotizacionusuactual(" ");
//                lrc.setLrcotizacionpersonaaseg(Long.MIN_VALUE); //Para cotizador de caución If Secc=1508 or secc=1509 or secc=1510 or secc=1511 or secc=1514 ver tabla contratista
                    lrc.setLrcotizacionfroning(pol.getFronting() == 1 ? 'S' : 'N');
                    if (pol.getNroTarjeta() != null) {
                        Lrpersonatc lrpt = lrPersonaTcManager.obtnerTarjeta(pol.getNroTarjeta());
                        if (lrpt != null) {
                            lrc.setLrcotizaciontcaseg(lrpt.getLrpersonatcaseg());
                            if (lrpt.getLrpersonatcexterno() != null && !lrpt.getLrpersonatcexterno().isEmpty()) {
                                lrc.setLrcotizaciontcexterno(lrpt.getLrpersonatcexterno().trim().charAt(0));
                            }
                        }
                    }

//                lrc.setLrcotizacionnrotransaccion(null);
                    lrCotizacionList.add(lrc);

                    /////LRUBICACION
                    Map<String, List<ItemDePolizas>> mapItemsPolizas = itemDePolizaManager.obtenerMapItemsNoRepetidos(
                            pol.getItemDePolizasList());

                    int nroItem = 0;
                    sumatoriaUbicacion = BigDecimal.ZERO;
                    for (Map.Entry<String, List<ItemDePolizas>> entry : mapItemsPolizas.entrySet()) {
                        Lrubicacion lru = new Lrubicacion();
                        lru.setLrubicacioncalleprincipal(entry.getKey());
                        lru.setLrubicacioncalletransversal(" ");
                        lru.setLrubicacionctactectral(entry.getValue().get(0).getCtaCatastral() == null ? " " : entry.getValue().get(0).getCtaCatastral());
                        lru.setLrubicacionedificio(" ");
                        lru.setLrubicaciondpto(" ");
                        lru.setLrubicacionlocal(" ");
                        lru.setLrubicacionpiso((short) 0);
                        lru.setLrubicacionnro(" ");
                        lru.setLrubicacionbloque(" ");
                        lru.setLrubicacionual("ver con lady sanabria");
                        lru.setLrubicacionfal(new Date());
                        lru.setLrubicacionumd("ver con lady sanabria");
                        lru.setLrubicacionfmd(new Date());
                        lru.setLrcotizacion(lrc);
                        lru.setLrubicacionrespmax(BigDecimal.ZERO); //sumatoria
                        lru.setLrbarriosid(null);
//                    lru.setLrubicacioncantsuc(0);
//                    lru.setLrubicacioncantemp(0);
                        lru.setLrubicacionnominado('N');
                        lru.setLrubicacionhasta(" ");
                        lru.setLrubicaciondesde(" ");
                        lru.setLrubicacioninventario(" ");
                        lru.setLrubicacionposeeinv('N');
                        lru.setLrubicaciontotalventanillas(null);
                        lru.setLrubicacionsumaaseguradaplayer(null);
                        lru.setLrubicacioncantplayeros(null);
                        lru.setLrubicacionhorariohasta(null);
                        lru.setLrubicacionhorariodesde(null);
                        lru.setLrubicaciondescripcion("");
                        lru.setLrubicacionmedidaseguridadvent('N');
                        lru.setLrubicacionmaxporventan(null);
                        lru.setLrubicacioncantventan(null);
                        lru.setLrubicacioncajafuerte('N');
                        lru.setLrubicaciondepid((short) 0);
                        lru.setLrubicacionciuid((short) 0);
                        lru.setLrubicacionnroinspeccion(null);
                        lru.setLrubicaciontotalplayeros(null);
                        lru.setLrubicaciondestinotransid(null);
                        lru.setLrubicacionastillero("");
                        lru.setLrubicacionagravante('N');
                        lru.setLrubicacionorigentransid(null);
                        if (pol.getPolsdemiPK().getSecc() == 104 || pol.getPolsdemiPK().getSecc() == 113) {
                            lru.setLrubicacionporpersona('S');
                        } else {
                            lru.setLrubicacionporpersona('N');
                        }
                        lru.setLrubicacionporpromediogrupal('N');
                        lru.setLrubicacionporpromediogral('N');
                        lru.setLrubicacionmontocarteraactual(null);
                        lru.setLrubicacionsiniestralidad(null);
                        lru.setLrubicacionpromedadcliente(null);
                        lru.setLrubicacioncantperprestarias(null);
                        lru.setLrubicacioncapitalmaxpersona(null);
                        lru.setLrubicacionpersonaaseid(null);
//                    lru.setLrubicacionrutaferry();  para cotizador de aeronavegación (ver luego)
//                    lru.setLrubicacionferry(); para cotizador de aeronavegación (ver luego)

                        short iSecc = entry.getValue().get(0).getItemDePolizasPK().getSecc();
                        short iEjericio = entry.getValue().get(0).getItemDePolizasPK().getEjercicio();
                        short iAnexo = entry.getValue().get(0).getItemDePolizasPK().getAnexo();
                        short iTipoSeguro = entry.getValue().get(0).getItemDePolizasPK().getTipoSeguro();
                        short iTipoOperacion = entry.getValue().get(0).getItemDePolizasPK().getTipoOperacion();
                        int iPolNro = entry.getValue().get(0).getItemDePolizasPK().getPolnro();
                        int iItem = entry.getValue().get(0).getItemDePolizasPK().getItem();

                        List<AccPersonales> accpList = accPersonalesManager.obtenerAccPersonales(iSecc, iEjericio, iAnexo, iTipoSeguro, iTipoOperacion, iPolNro, iItem);
//                        System.out.println("sec: " + pol.getPolsdemiPK().getSecc() + "ejercicio: " + pol.getPolsdemiPK().getEjercicio() + "anexo: " + pol.getPolsdemiPK().getAnexo() + "tipoSeguro: " + pol.getPolsdemiPK().getTipoSeguro() + "tipooperacion: " + pol.getPolsdemiPK().getTipoOperacion() + "polnro " + pol.getPolsdemiPK().getPolnro());
                        int cantPersonaAsegurada = 0;
                        int aseguradaNro = 0;
                        for (AccPersonales acc : accpList) {
                            Lrpersonaasegurada lrpa = new Lrpersonaasegurada();
                            lrpa.setLragrupacargoid(lrAgrupaCargoMigracion);
                            lrpa.setLrturnoid(lrTurnoSinTurno);
                            lrpa.setLrubicacionid(lru);
                            lrpa.setLrpersonaaseguradanro((short) acc.getAccPersonalesPK().getItem());
                            aseguradaNro = lrpa.getLrpersonaaseguradanro();
                            if (acc.getSumasegMe() != null) {
                                lrpa.setLrpersonaaseguradasumaaseg(acc.getSumasegMe());

                            } else {
                                lrpa.setLrpersonaaseguradasumaaseg(acc.getSumaseg());
                            }
                            lrpa.setLrpersonaaseguradaual("mmiguser");
                            lrpa.setLrpersonaaseguradafal(new Date());
                            lrpa.setLrpersonaaseguradaumd("mmiguser");
                            lrpa.setLrpersonaaseguradafmd(new Date());
                            lrpa.setLrpersonaaseguradapersonaid(0);
                            lrpa.setLrpersonaaseguradausamoto('N');
                            cantPersonaAsegurada++;

                            List<Beneficiarios> beneficiarioList = beneficiarioManager.obtenerBeneficiario(acc.getAccPersonalesPK().getSecc(), acc.getAccPersonalesPK().getEjercicio(), acc.getAccPersonalesPK().getAnexo(), acc.getAccPersonalesPK().getTipoSeguro(), acc.getAccPersonalesPK().getTipoOperacion(), acc.getAccPersonalesPK().getPolnro(), (short) acc.getAccPersonalesPK().getItem());
                            for (Beneficiarios b : beneficiarioList) {
                                Lrpersona lrPersonaBeneficiario = lrPersonaManager.obtenerPersona(b.getCiNro());
                                Lrbeneficiario lrb = new Lrbeneficiario();
                                lrb.setLrpersonaaseguradaid(lrpa);
                                //TODO ver planilla
                                lrb.setLrbeneficiarioimporte(BigDecimal.ZERO);
                                lrb.setLrbeneficiarioac('S');
                                lrb.setLrbeneficiarioual("mmuser");
                                lrb.setLrbeneficiariofal(new Date());
                                lrb.setLrbeneficiarioumd("mmuser");
                                lrb.setLrbeneficiariofmd(new Date());
                                lrb.setLrbeneficiariopersonaid(0); //TODO setear persona de beneficiario
                                lrb.setLrtiposvincid(null);
                                lrb.setLrbeneficiarioporc(b.getPorcentaje());
                                lrBeneficiariosList.add(lrb);
                            }
                            lrpa.setLrbeneficiarioList(lrBeneficiariosList);
                            lrPersonaAseguradaList.add(lrpa);

                        }
                        lru.setLrpersonaaseguradaList(lrPersonaAseguradaList);
                        lru.setLragrupacargoturnoList(lrAgrupaCargoTurnoList);
                        for (ItemDePolizas i : entry.getValue()) {
                            CoberturasDetalle cd = coberturasDetalleManager.obtenerCoberturasDetalle(i.getItemDePolizasPK().getSecc(), i.getItemDePolizasPK().getEjercicio(), i.getItemDePolizasPK().getAnexo(), i.getItemDePolizasPK().getTipoSeguro(), i.getItemDePolizasPK().getItem(), i.getItemDePolizasPK().getTipoOperacion(), i.getItemDePolizasPK().getPolnro());
                            if (cd != null) {
                                lastLrCotiDatBienAseId = lastLrCotiDatBienAseId + 1;
                                Lrcotidatbienase lrcoti = new Lrcotidatbienase();
                                LrcotidatbienasePK lrcotiPk = new LrcotidatbienasePK();
                                lrcotiPk.setLrcotidatbienaseid(lastLrCotiDatBienAseId);
                                lrcoti.setLrcotidatbienasePK(lrcotiPk);
                                lrcoti.setLrubicacion(lru);
                                lrcoti.setLrcotidatbienasenroitem(cd.getCoberturasDetallePK().getItem());
                                lrcoti.setRiesgosaseid(cd.getRiesgosAsegurados().getRiesgosAseguradosPK().getCodRiesgo());
                                lrcoti.setSeccid(cd.getCoberturasDetallePK().getSecc());
                                lrcoti.setLrcotidatbienasesumaaseaux(cd.getSumaseg());
                                if (pol.getCodMoney().getCodMoney() == 1) {
                                    if (cd.getCoberturasDetallePK().getSecc() == 401 || cd.getCoberturasDetallePK().getSecc() == 403) {
                                        BigDecimal mAux = lrcoti.getLrcotidatbienasesumaaseaux() == null ? BigDecimal.ZERO : lrcoti.getLrcotidatbienasesumaaseaux();
                                        lrcoti.setLrcotidatbienasesumaase(mAux.multiply(new BigDecimal(aseguradaNro)));
                                    }
                                    lrcoti.setLrcotidatbienaseprimaren(new BigDecimal(i.getPrima()));
                                } else {
                                    for (ItemDePolizasMe ime : pol.getItemDePolizasMeList()) {
                                        if (ime.getItemDePolizasMePK().getItem() == i.getItemDePolizasPK().getItem()) {
                                            lrcoti.setLrcotidatbienasesumaase((ime.getSumaseg()));
                                            lrcoti.setLrcotidatbienaseprimaren((ime.getPrima()));
                                        }
                                    }
                                }
                                //Algunos registros no tiene monto. verificar
                                if (lrcoti.getLrcotidatbienasesumaase() == null) {
                                    lrcoti.setLrcotidatbienasesumaase(BigDecimal.ZERO);
                                }

                                lrcoti.setSlrpersonaid(null); // se aplica solo para cotizador de robo. sino null
                                lrcoti.setLrcargoid(null);
                                lrcoti.setLrdespachanteid(null);
                                lrcoti.setLrcotidatbienaseagrupacargoid(lrAgrupaCargoMigracion.getLragrupacargoid()); // se aplica solo para cotizador de vida  secc=401 or secc=403 or Secc=104 or Secc=106 or Secc=113 , el resto null
                                lrcoti.setLrcotidatbienasecoberttipid(cd.getTiposCoberturas().getTiposCoberturasPK().getCodCobertura()); // se aplica para secc=401 or secc=403 or Secc=104 or Secc=106 or Secc=113, sino null
                                //TODO lrpersonaaseguradanro ver como meter la cantidad de persona
                                if (pol.getPolsdemiPK().getSecc() == 401 || pol.getPolsdemiPK().getSecc() == 403) {
                                    lrcoti.setLrcotidatbienasecant((long) cantPersonaAsegurada); //para cotizador de accidentes personales y vida..
                                }
                                lrcoti.setLrcotidatbienasedesde(null); // para cotizador de vida cancelacion de deudas (ver luego)
                                if (pol.getPolsdemiPK().getSecc() == 106) {
                                    lrcoti.setLrcotidatbienasehasta(cd.getSumaseg()); // para cotizador de vida cancelacion de deudas (ver luego)
//                                    lrcoti.setLrcotidatbienasetasa(cd.get); no encuentro el campo tasa_asignada_vida
                                    lrcoti.setLrcotidatbienaseobjetoseguroid(lrObjetoSeguroMayores70.getLrobjetoseguroid());
                                }
                                lrcoti.setLrcotidatbienasepromedioedad(null); // para cotizador de vida cancelacion de deudas (ver luego)
                                lrcoti.setLrcotidatbienasetipo(" ");

                                sumatoriaCoti = sumatoriaCoti.add(lrcoti.getLrcotidatbienasesumaase());

                                lrCotiDatBienAseList.add(lrcoti);

                                //LRCOTIBIENTEXTO
                                Lrcotibientexto lrcbt = new Lrcotibientexto();
                                lrcbt.setLrcotidatbienase(lrcoti);
                                lrcbt.setLrcotibientextonombre("Texto poliza");
                                lrcbt.setLrcotibientextotxt(i.getTexto() == null ? " " : i.getTexto());
                                lrcbt.setLrcotibientextoual("mmiguser");
                                lrcbt.setLrcotibientextofal(new Date());
                                lrcbt.setLrcotibientextoumd("mmiguser");
                                lrcbt.setLrcotibientextofmd(new Date());
                                lrcbt.setLrcotibientextoespecial('S');
                                lrCotiBienTextoList.add(lrcbt);

                                lrcoti.setLrcotibientextoList(lrCotiBienTextoList);
                            }
                        }
                        lru.setLrubicacionrespmax(sumatoriaCoti);
                        sumatoriaUbicacion = sumatoriaUbicacion.add(lru.getLrubicacionrespmax());
                        lru.setLrcotidatbienaseList(lrCotiDatBienAseList);
                        lrUbicacionList.add(lru);
                    }

                    lrc.setLrcotizacionmontototal(sumatoriaUbicacion);
                    sumatoriaCotizacion = sumatoriaCotizacion.add(lrc.getLrcotizacionmontototal());
                    lrp.setLrpropuestamontototal(sumatoriaCotizacion);
                    for (Districoase dis : pol.getDistricoaseList()) {
                        //LRCOTICOASEGURO
                        Lrcoticoaseguro lrcc = new Lrcoticoaseguro();
//                        lrcc.setLrcoticoaseguroid(Long.MIN_VALUE);
                        lrcc.setLrcotizacion(lrc);
                        lrcc.setLrcoticoaseguroporcpart(dis.getPctPartic());
                        if (dis.getPolsdemi().getCodMoney().getCodMoney() == 1) {
                            lrcc.setLrcoticoasegurosumaseg(dis.getSumaseg() == null ? BigDecimal.ZERO : new BigDecimal((dis.getSumaseg())));
                            lrcc.setLrcoticoaseguroprimacom(dis.getPrima() == null ? BigDecimal.ZERO : new BigDecimal(dis.getPrima()));
                            lrcc.setLrcoticoaseguropremio(dis.getPremio() == null ? BigDecimal.ZERO : new BigDecimal(dis.getPremio()));
                            lrcc.setLrcoticoaseguroprimatec(dis.getPrima() == null ? BigDecimal.ZERO : new BigDecimal(dis.getPrima()));
                            lrcc.setLrcoticoasegurogasadm(dis.getGtosAdmi() == null ? BigDecimal.ZERO : new BigDecimal(dis.getGtosAdmi()));
                            lrcc.setLrcoticoaseguroiva(dis.getIva() == null ? BigDecimal.ZERO : new BigDecimal(dis.getIva()));
                        } else {
                            lrcc.setLrcoticoasegurosumaseg(dis.getSumasegMe() == null ? BigDecimal.ZERO : dis.getSumasegMe());
                            lrcc.setLrcoticoaseguroprimacom(dis.getPrimaMe() == null ? BigDecimal.ZERO : dis.getPrimaMe());
                            lrcc.setLrcoticoaseguropremio(dis.getPremioMe() == null ? BigDecimal.ZERO : dis.getPremioMe());
                            lrcc.setLrcoticoaseguroprimatec(dis.getPrimaMe() == null ? BigDecimal.ZERO : dis.getPrimaMe());
                            lrcc.setLrcoticoasegurogasadm(dis.getGtosAdmiMe() == null ? BigDecimal.ZERO : dis.getGtosAdmiMe());
                            lrcc.setLrcoticoaseguroiva(dis.getIvaMe() == null ? BigDecimal.ZERO : dis.getIvaMe());
                        }
                        lrcc.setLrcoticoaseguropiloto(pol.getPolsdemiPK().getTipoSeguro() == 2 ? 'S' : 'N');
                        lrcc.setLrcoticoaseguroual("mmiguser");
                        lrcc.setLrcoticoasegurofal(new Date());
                        lrcc.setLrcoticoaseguroumd("mmiguser");
                        lrcc.setLrcoticoasegurofmd(new Date());
                        lrcc.setComreacoaid(dis.getDistricoasePK().getNCia());
                        lrcc.setLrcoticoaseguropoliza(dis.getPolizaCoa());
                        lrCoticoaseguroList.add(lrcc);

                    }

                    //LRFLUJOCOTIZACION
                    Lrflujocotizacion lrfc = new Lrflujocotizacion();
                    lrfc.setLrcotizacion(lrc);
                    lrfc.setLrareasubarea(lrAreaSubareaMigracion);
                    lrfc.setLrflujocotizacionual("mmiguser");
                    lrfc.setLrflujocotizacionfal(new Date());
                    lrfc.setLrflujocotizacionuac("mmiguser");

                    //LRFLUJOCOTIZACIONDET
                    Lrflujocotizaciondet lrfcd = new Lrflujocotizaciondet();
                    lrfcd.setLrflujocotizacionid(lrfc);
                    lrfcd.setLrflujocotizaciondetcant(0);
                    lrfcd.setLrflujocotizaciondetual("mmiguser");
                    lrfcd.setLrflujocotizaciondetfal(new Date());
                    lrfcd.setLraccionsubacccion(lrAccionSubAccionMigracion);

                    lrFlujoCotizacionDetList.add(lrfcd);

                    lrfc.setLrflujocotizaciondetList(lrFlujoCotizacionDetList);

                    lrFlujoCotizacionList.add(lrfc);

                    //Seteando Listas
                    lrc.setLrubicacionList(lrUbicacionList);
                    lrc.setLrcoticoaseguroList(lrCoticoaseguroList);
                    lrc.setLrflujocotizacionList(lrFlujoCotizacionList);
                    lrp.setLrcotizacionList(lrCotizacionList);

//                descomentar para persistir
                    entitymanager.persist(lrp);
                    if ((persistCount % 1) == 0) {
                        entitymanager.getTransaction().commit();
                        entitymanager.clear();
                        entitymanager.getTransaction().begin();
                        System.out.println("commit: " + persistCount);
                    }
                    lrUbicacionList = new ArrayList<>();
                    lrCoticoaseguroList = new ArrayList<>();
                    lrFlujoCotizacionList = new ArrayList<>();
                    lrCotizacionList = new ArrayList<>();
                    lrCotiDatBienAseList = new ArrayList<>();
                    lrFlujoCotizacionDetList = new ArrayList<>();
                    lrPersonaAseguradaList = new ArrayList<>();

                    persistCount++;
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
