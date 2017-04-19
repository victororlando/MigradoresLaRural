/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "PROAUEMI", schema = "SOFTTEN", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"EJERCICIO", "NRO_PROPUESTA"})})
@NamedQueries({
    @NamedQuery(name = "Proauemi.findAll", query = "SELECT p FROM Proauemi p"),
    @NamedQuery(name = "Proauemi.findByFecha", query = "SELECT p FROM Proauemi p WHERE p.fecha = :fecha"),
    @NamedQuery(name = "Proauemi.findByEjercicio", query = "SELECT p FROM Proauemi p WHERE p.proauemiPK.ejercicio = :ejercicio"),
    @NamedQuery(name = "Proauemi.findByNroPropuesta", query = "SELECT p FROM Proauemi p WHERE p.nroPropuesta = :nroPropuesta"),
    @NamedQuery(name = "Proauemi.findByItem", query = "SELECT p FROM Proauemi p WHERE p.proauemiPK.item = :item"),
    @NamedQuery(name = "Proauemi.findByNroInspeccion", query = "SELECT p FROM Proauemi p WHERE p.nroInspeccion = :nroInspeccion"),
    @NamedQuery(name = "Proauemi.findByTipoSeguro", query = "SELECT p FROM Proauemi p WHERE p.proauemiPK.tipoSeguro = :tipoSeguro"),
    @NamedQuery(name = "Proauemi.findByTipoOperacion", query = "SELECT p FROM Proauemi p WHERE p.proauemiPK.tipoOperacion = :tipoOperacion"),
    @NamedQuery(name = "Proauemi.findBySecc", query = "SELECT p FROM Proauemi p WHERE p.proauemiPK.secc = :secc"),
    @NamedQuery(name = "Proauemi.findByPolnro", query = "SELECT p FROM Proauemi p WHERE p.proauemiPK.polnro = :polnro"),
    @NamedQuery(name = "Proauemi.findByAnexo", query = "SELECT p FROM Proauemi p WHERE p.proauemiPK.anexo = :anexo"),
    @NamedQuery(name = "Proauemi.findByAno", query = "SELECT p FROM Proauemi p WHERE p.ano = :ano"),
    @NamedQuery(name = "Proauemi.findByNroMotor", query = "SELECT p FROM Proauemi p WHERE p.nroMotor = :nroMotor"),
    @NamedQuery(name = "Proauemi.findByNroChasis", query = "SELECT p FROM Proauemi p WHERE p.nroChasis = :nroChasis"),
    @NamedQuery(name = "Proauemi.findByNroChapa", query = "SELECT p FROM Proauemi p WHERE p.nroChapa = :nroChapa"),
    @NamedQuery(name = "Proauemi.findByCasco", query = "SELECT p FROM Proauemi p WHERE p.casco = :casco"),
    @NamedQuery(name = "Proauemi.findByPrimaCasco", query = "SELECT p FROM Proauemi p WHERE p.primaCasco = :primaCasco"),
    @NamedQuery(name = "Proauemi.findByCapitalIncendio", query = "SELECT p FROM Proauemi p WHERE p.capitalIncendio = :capitalIncendio"),
    @NamedQuery(name = "Proauemi.findByCapitalAccidente", query = "SELECT p FROM Proauemi p WHERE p.capitalAccidente = :capitalAccidente"),
    @NamedQuery(name = "Proauemi.findByCapitalRobo", query = "SELECT p FROM Proauemi p WHERE p.capitalRobo = :capitalRobo"),
    @NamedQuery(name = "Proauemi.findByCantRc", query = "SELECT p FROM Proauemi p WHERE p.cantRc = :cantRc"),
    @NamedQuery(name = "Proauemi.findByPrimaRc", query = "SELECT p FROM Proauemi p WHERE p.primaRc = :primaRc"),
    @NamedQuery(name = "Proauemi.findByCapRc1", query = "SELECT p FROM Proauemi p WHERE p.capRc1 = :capRc1"),
    @NamedQuery(name = "Proauemi.findByCapRc2", query = "SELECT p FROM Proauemi p WHERE p.capRc2 = :capRc2"),
    @NamedQuery(name = "Proauemi.findByCapRc3", query = "SELECT p FROM Proauemi p WHERE p.capRc3 = :capRc3"),
    @NamedQuery(name = "Proauemi.findByCapAccesorios", query = "SELECT p FROM Proauemi p WHERE p.capAccesorios = :capAccesorios"),
    @NamedQuery(name = "Proauemi.findByPrimaOtros", query = "SELECT p FROM Proauemi p WHERE p.primaOtros = :primaOtros"),
    @NamedQuery(name = "Proauemi.findByRoboViaPublica", query = "SELECT p FROM Proauemi p WHERE p.roboViaPublica = :roboViaPublica"),
    @NamedQuery(name = "Proauemi.findByPrimaRoboViaPublica", query = "SELECT p FROM Proauemi p WHERE p.primaRoboViaPublica = :primaRoboViaPublica"),
    @NamedQuery(name = "Proauemi.findByTumultoPopular", query = "SELECT p FROM Proauemi p WHERE p.tumultoPopular = :tumultoPopular"),
    @NamedQuery(name = "Proauemi.findByPrimaTumultoPopular", query = "SELECT p FROM Proauemi p WHERE p.primaTumultoPopular = :primaTumultoPopular"),
    @NamedQuery(name = "Proauemi.findByDiasCoberturaExterior", query = "SELECT p FROM Proauemi p WHERE p.diasCoberturaExterior = :diasCoberturaExterior"),
    @NamedQuery(name = "Proauemi.findByPrimaCoberturaExterior", query = "SELECT p FROM Proauemi p WHERE p.primaCoberturaExterior = :primaCoberturaExterior"),
    @NamedQuery(name = "Proauemi.findByPrimaAdicional", query = "SELECT p FROM Proauemi p WHERE p.primaAdicional = :primaAdicional"),
    @NamedQuery(name = "Proauemi.findByDescripcionAdicional", query = "SELECT p FROM Proauemi p WHERE p.descripcionAdicional = :descripcionAdicional"),
    @NamedQuery(name = "Proauemi.findByDctoBonificacion", query = "SELECT p FROM Proauemi p WHERE p.dctoBonificacion = :dctoBonificacion"),
    @NamedQuery(name = "Proauemi.findByFranquicia", query = "SELECT p FROM Proauemi p WHERE p.franquicia = :franquicia"),
    @NamedQuery(name = "Proauemi.findBySos", query = "SELECT p FROM Proauemi p WHERE p.sos = :sos"),
    @NamedQuery(name = "Proauemi.findByPrimaSos", query = "SELECT p FROM Proauemi p WHERE p.primaSos = :primaSos"),
    @NamedQuery(name = "Proauemi.findByCantOcupantes", query = "SELECT p FROM Proauemi p WHERE p.cantOcupantes = :cantOcupantes"),
    @NamedQuery(name = "Proauemi.findByCapMuerte", query = "SELECT p FROM Proauemi p WHERE p.capMuerte = :capMuerte"),
    @NamedQuery(name = "Proauemi.findByPrimaMuerte", query = "SELECT p FROM Proauemi p WHERE p.primaMuerte = :primaMuerte"),
    @NamedQuery(name = "Proauemi.findByCapIncapacidad", query = "SELECT p FROM Proauemi p WHERE p.capIncapacidad = :capIncapacidad"),
    @NamedQuery(name = "Proauemi.findByCapGtosMedicos", query = "SELECT p FROM Proauemi p WHERE p.capGtosMedicos = :capGtosMedicos"),
    @NamedQuery(name = "Proauemi.findByPrimaGtosMedicos", query = "SELECT p FROM Proauemi p WHERE p.primaGtosMedicos = :primaGtosMedicos"),
    @NamedQuery(name = "Proauemi.findByCantAirbag", query = "SELECT p FROM Proauemi p WHERE p.cantAirbag = :cantAirbag"),
    @NamedQuery(name = "Proauemi.findByCapAirbag", query = "SELECT p FROM Proauemi p WHERE p.capAirbag = :capAirbag"),
    @NamedQuery(name = "Proauemi.findByPrimaAirbag", query = "SELECT p FROM Proauemi p WHERE p.primaAirbag = :primaAirbag"),
    @NamedQuery(name = "Proauemi.findByCodPrendario", query = "SELECT p FROM Proauemi p WHERE p.codPrendario = :codPrendario"),
    @NamedQuery(name = "Proauemi.findByTraccion", query = "SELECT p FROM Proauemi p WHERE p.traccion = :traccion"),
    @NamedQuery(name = "Proauemi.findByEje", query = "SELECT p FROM Proauemi p WHERE p.eje = :eje"),
    @NamedQuery(name = "Proauemi.findByVolanteCambiado", query = "SELECT p FROM Proauemi p WHERE p.volanteCambiado = :volanteCambiado"),
    @NamedQuery(name = "Proauemi.findByNroPuerta", query = "SELECT p FROM Proauemi p WHERE p.nroPuerta = :nroPuerta"),
    @NamedQuery(name = "Proauemi.findByTipoCombust", query = "SELECT p FROM Proauemi p WHERE p.tipoCombust = :tipoCombust"),
    @NamedQuery(name = "Proauemi.findByTipoAdicional", query = "SELECT p FROM Proauemi p WHERE p.tipoAdicional = :tipoAdicional"),
    @NamedQuery(name = "Proauemi.findByAirbag", query = "SELECT p FROM Proauemi p WHERE p.airbag = :airbag"),
    @NamedQuery(name = "Proauemi.findByPrimaIncapacidad", query = "SELECT p FROM Proauemi p WHERE p.primaIncapacidad = :primaIncapacidad"),
    @NamedQuery(name = "Proauemi.findByPorcBonificacion", query = "SELECT p FROM Proauemi p WHERE p.porcBonificacion = :porcBonificacion"),
    @NamedQuery(name = "Proauemi.findByAcdteRobo", query = "SELECT p FROM Proauemi p WHERE p.acdteRobo = :acdteRobo"),
    @NamedQuery(name = "Proauemi.findByCapAcdteRobo", query = "SELECT p FROM Proauemi p WHERE p.capAcdteRobo = :capAcdteRobo"),
    @NamedQuery(name = "Proauemi.findByPrimaAcdteRobo", query = "SELECT p FROM Proauemi p WHERE p.primaAcdteRobo = :primaAcdteRobo"),
    @NamedQuery(name = "Proauemi.findByRoboParcial", query = "SELECT p FROM Proauemi p WHERE p.roboParcial = :roboParcial"),
    @NamedQuery(name = "Proauemi.findByCapRp", query = "SELECT p FROM Proauemi p WHERE p.capRp = :capRp"),
    @NamedQuery(name = "Proauemi.findByPrimaRp", query = "SELECT p FROM Proauemi p WHERE p.primaRp = :primaRp"),
    @NamedQuery(name = "Proauemi.findByRpRt", query = "SELECT p FROM Proauemi p WHERE p.rpRt = :rpRt"),
    @NamedQuery(name = "Proauemi.findByCapRpRt", query = "SELECT p FROM Proauemi p WHERE p.capRpRt = :capRpRt"),
    @NamedQuery(name = "Proauemi.findByPrimaRpRt", query = "SELECT p FROM Proauemi p WHERE p.primaRpRt = :primaRpRt"),
    @NamedQuery(name = "Proauemi.findByMarcmode", query = "SELECT p FROM Proauemi p WHERE p.marcmode = :marcmode"),
    @NamedQuery(name = "Proauemi.findByAlarma", query = "SELECT p FROM Proauemi p WHERE p.alarma = :alarma"),
    @NamedQuery(name = "Proauemi.findByCarta", query = "SELECT p FROM Proauemi p WHERE p.carta = :carta"),
    @NamedQuery(name = "Proauemi.findByNroCarta", query = "SELECT p FROM Proauemi p WHERE p.nroCarta = :nroCarta"),
    @NamedQuery(name = "Proauemi.findByPrimaCarta", query = "SELECT p FROM Proauemi p WHERE p.primaCarta = :primaCarta"),
    @NamedQuery(name = "Proauemi.findByDiasCarta", query = "SELECT p FROM Proauemi p WHERE p.diasCarta = :diasCarta"),
    @NamedQuery(name = "Proauemi.findByFormaPago", query = "SELECT p FROM Proauemi p WHERE p.formaPago = :formaPago"),
    @NamedQuery(name = "Proauemi.findByDestinadoA", query = "SELECT p FROM Proauemi p WHERE p.destinadoA = :destinadoA"),
    @NamedQuery(name = "Proauemi.findByFechaCargaComercial", query = "SELECT p FROM Proauemi p WHERE p.fechaCargaComercial = :fechaCargaComercial"),
    @NamedQuery(name = "Proauemi.findByFechaEntregaComercial", query = "SELECT p FROM Proauemi p WHERE p.fechaEntregaComercial = :fechaEntregaComercial"),
    @NamedQuery(name = "Proauemi.findByCodUsuarioCarga", query = "SELECT p FROM Proauemi p WHERE p.codUsuarioCarga = :codUsuarioCarga"),
    @NamedQuery(name = "Proauemi.findByCodUsuarioAprueba", query = "SELECT p FROM Proauemi p WHERE p.codUsuarioAprueba = :codUsuarioAprueba"),
    @NamedQuery(name = "Proauemi.findByFechaCargaPropuesta", query = "SELECT p FROM Proauemi p WHERE p.fechaCargaPropuesta = :fechaCargaPropuesta"),
    @NamedQuery(name = "Proauemi.findByRespMax", query = "SELECT p FROM Proauemi p WHERE p.respMax = :respMax"),
    @NamedQuery(name = "Proauemi.findByTipoFlota", query = "SELECT p FROM Proauemi p WHERE p.tipoFlota = :tipoFlota"),
    @NamedQuery(name = "Proauemi.findByCodUsuarioImprime", query = "SELECT p FROM Proauemi p WHERE p.codUsuarioImprime = :codUsuarioImprime"),
    @NamedQuery(name = "Proauemi.findByPrima", query = "SELECT p FROM Proauemi p WHERE p.prima = :prima"),
    @NamedQuery(name = "Proauemi.findByAnulacion", query = "SELECT p FROM Proauemi p WHERE p.anulacion = :anulacion"),
    @NamedQuery(name = "Proauemi.findByUsuarioModifica", query = "SELECT p FROM Proauemi p WHERE p.usuarioModifica = :usuarioModifica"),
    @NamedQuery(name = "Proauemi.findByPctFranqAirbag", query = "SELECT p FROM Proauemi p WHERE p.pctFranqAirbag = :pctFranqAirbag"),
    @NamedQuery(name = "Proauemi.findByPolizaCarta", query = "SELECT p FROM Proauemi p WHERE p.polizaCarta = :polizaCarta"),
    @NamedQuery(name = "Proauemi.findByPctCapRpRt", query = "SELECT p FROM Proauemi p WHERE p.pctCapRpRt = :pctCapRpRt"),
    @NamedQuery(name = "Proauemi.findByPctAcdteRobo", query = "SELECT p FROM Proauemi p WHERE p.pctAcdteRobo = :pctAcdteRobo"),
    @NamedQuery(name = "Proauemi.findByCapAutoRadio", query = "SELECT p FROM Proauemi p WHERE p.capAutoRadio = :capAutoRadio"),
    @NamedQuery(name = "Proauemi.findByGranizo", query = "SELECT p FROM Proauemi p WHERE p.granizo = :granizo"),
    @NamedQuery(name = "Proauemi.findByExclIncendio", query = "SELECT p FROM Proauemi p WHERE p.exclIncendio = :exclIncendio"),
    @NamedQuery(name = "Proauemi.findByExclRobo", query = "SELECT p FROM Proauemi p WHERE p.exclRobo = :exclRobo"),
    @NamedQuery(name = "Proauemi.findByExclDanos", query = "SELECT p FROM Proauemi p WHERE p.exclDanos = :exclDanos"),
    @NamedQuery(name = "Proauemi.findByExclRc", query = "SELECT p FROM Proauemi p WHERE p.exclRc = :exclRc"),
    @NamedQuery(name = "Proauemi.findByCodPlan", query = "SELECT p FROM Proauemi p WHERE p.codPlan = :codPlan"),
    @NamedQuery(name = "Proauemi.findByCodProvAlarma", query = "SELECT p FROM Proauemi p WHERE p.codProvAlarma = :codProvAlarma"),
    @NamedQuery(name = "Proauemi.findByNroOrdenAlarma", query = "SELECT p FROM Proauemi p WHERE p.nroOrdenAlarma = :nroOrdenAlarma"),
    @NamedQuery(name = "Proauemi.findByPctRobo", query = "SELECT p FROM Proauemi p WHERE p.pctRobo = :pctRobo"),
    @NamedQuery(name = "Proauemi.findByCategoria", query = "SELECT p FROM Proauemi p WHERE p.categoria = :categoria"),
    @NamedQuery(name = "Proauemi.findByDanosInspeccion", query = "SELECT p FROM Proauemi p WHERE p.danosInspeccion = :danosInspeccion"),
    @NamedQuery(name = "Proauemi.findByNroCartaAnul", query = "SELECT p FROM Proauemi p WHERE p.nroCartaAnul = :nroCartaAnul"),
    @NamedQuery(name = "Proauemi.findByPorcDctoFlota", query = "SELECT p FROM Proauemi p WHERE p.porcDctoFlota = :porcDctoFlota"),
    @NamedQuery(name = "Proauemi.findByMontoDctoFlota", query = "SELECT p FROM Proauemi p WHERE p.montoDctoFlota = :montoDctoFlota"),
    @NamedQuery(name = "Proauemi.findByCapitalCualquierCond", query = "SELECT p FROM Proauemi p WHERE p.capitalCualquierCond = :capitalCualquierCond"),
    @NamedQuery(name = "Proauemi.findByAccesorioDeFabrica", query = "SELECT p FROM Proauemi p WHERE p.accesorioDeFabrica = :accesorioDeFabrica"),
    @NamedQuery(name = "Proauemi.findByCapMercaderia", query = "SELECT p FROM Proauemi p WHERE p.capMercaderia = :capMercaderia"),
    @NamedQuery(name = "Proauemi.findByPrimaMercaderia", query = "SELECT p FROM Proauemi p WHERE p.primaMercaderia = :primaMercaderia"),
    @NamedQuery(name = "Proauemi.findByFechaAnulCartaVerde", query = "SELECT p FROM Proauemi p WHERE p.fechaAnulCartaVerde = :fechaAnulCartaVerde"),
    @NamedQuery(name = "Proauemi.findByNroOrdenAlarmaAnul", query = "SELECT p FROM Proauemi p WHERE p.nroOrdenAlarmaAnul = :nroOrdenAlarmaAnul"),
    @NamedQuery(name = "Proauemi.findByFechaAnulOrdenAlarma", query = "SELECT p FROM Proauemi p WHERE p.fechaAnulOrdenAlarma = :fechaAnulOrdenAlarma"),
    @NamedQuery(name = "Proauemi.findByUsuarioAnulOrdenAlarma", query = "SELECT p FROM Proauemi p WHERE p.usuarioAnulOrdenAlarma = :usuarioAnulOrdenAlarma"),
    @NamedQuery(name = "Proauemi.findByNroEntrada", query = "SELECT p FROM Proauemi p WHERE p.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "Proauemi.findByTipoPintura", query = "SELECT p FROM Proauemi p WHERE p.tipoPintura = :tipoPintura"),
    @NamedQuery(name = "Proauemi.findByCilindradas", query = "SELECT p FROM Proauemi p WHERE p.cilindradas = :cilindradas"),
    @NamedQuery(name = "Proauemi.findByTipoTransmision", query = "SELECT p FROM Proauemi p WHERE p.tipoTransmision = :tipoTransmision"),
    @NamedQuery(name = "Proauemi.findByNroCoche", query = "SELECT p FROM Proauemi p WHERE p.nroCoche = :nroCoche"),
    @NamedQuery(name = "Proauemi.findByCapAntena", query = "SELECT p FROM Proauemi p WHERE p.capAntena = :capAntena"),
    @NamedQuery(name = "Proauemi.findByCapRuedaAuxilio", query = "SELECT p FROM Proauemi p WHERE p.capRuedaAuxilio = :capRuedaAuxilio"),
    @NamedQuery(name = "Proauemi.findByCapFaros", query = "SELECT p FROM Proauemi p WHERE p.capFaros = :capFaros"),
    @NamedQuery(name = "Proauemi.findByCapTasas", query = "SELECT p FROM Proauemi p WHERE p.capTasas = :capTasas"),
    @NamedQuery(name = "Proauemi.findByAmbulancia", query = "SELECT p FROM Proauemi p WHERE p.ambulancia = :ambulancia"),
    @NamedQuery(name = "Proauemi.findByCerrajeria", query = "SELECT p FROM Proauemi p WHERE p.cerrajeria = :cerrajeria"),
    @NamedQuery(name = "Proauemi.findByAlarmaCapitalMinimo", query = "SELECT p FROM Proauemi p WHERE p.alarmaCapitalMinimo = :alarmaCapitalMinimo"),
    @NamedQuery(name = "Proauemi.findByAsistenciaJuridica", query = "SELECT p FROM Proauemi p WHERE p.asistenciaJuridica = :asistenciaJuridica"),
    @NamedQuery(name = "Proauemi.findByNombreAsistenciaJuridica", query = "SELECT p FROM Proauemi p WHERE p.nombreAsistenciaJuridica = :nombreAsistenciaJuridica"),
    @NamedQuery(name = "Proauemi.findByAccesoriosAccInc", query = "SELECT p FROM Proauemi p WHERE p.accesoriosAccInc = :accesoriosAccInc"),
    @NamedQuery(name = "Proauemi.findByCobExtDanos", query = "SELECT p FROM Proauemi p WHERE p.cobExtDanos = :cobExtDanos"),
    @NamedQuery(name = "Proauemi.findByCobExtRobo", query = "SELECT p FROM Proauemi p WHERE p.cobExtRobo = :cobExtRobo"),
    @NamedQuery(name = "Proauemi.findByCostoReinstalacion", query = "SELECT p FROM Proauemi p WHERE p.costoReinstalacion = :costoReinstalacion"),
    @NamedQuery(name = "Proauemi.findByDmRt", query = "SELECT p FROM Proauemi p WHERE p.dmRt = :dmRt"),
    @NamedQuery(name = "Proauemi.findByPctGranizo", query = "SELECT p FROM Proauemi p WHERE p.pctGranizo = :pctGranizo"),
    @NamedQuery(name = "Proauemi.findByPctInc", query = "SELECT p FROM Proauemi p WHERE p.pctInc = :pctInc"),
    @NamedQuery(name = "Proauemi.findByPctAcc", query = "SELECT p FROM Proauemi p WHERE p.pctAcc = :pctAcc"),
    @NamedQuery(name = "Proauemi.findByPorcTumultoPop", query = "SELECT p FROM Proauemi p WHERE p.porcTumultoPop = :porcTumultoPop"),
    @NamedQuery(name = "Proauemi.findByTextoEspecial", query = "SELECT p FROM Proauemi p WHERE p.textoEspecial = :textoEspecial"),
    @NamedQuery(name = "Proauemi.findByNroCotizacion", query = "SELECT p FROM Proauemi p WHERE p.nroCotizacion = :nroCotizacion"),
    @NamedQuery(name = "Proauemi.findByTipoImportacion", query = "SELECT p FROM Proauemi p WHERE p.tipoImportacion = :tipoImportacion"),
    @NamedQuery(name = "Proauemi.findByDeclaracion", query = "SELECT p FROM Proauemi p WHERE p.declaracion = :declaracion")})
public class Proauemi implements Serializable {
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "proauemi")
    private ProauemiMe proauemiMe;

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProauemiPK proauemiPK;
    @Basic(optional = false)
    @Column(name = "FECHA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "NRO_PROPUESTA", nullable = false)
    private int nroPropuesta;
    @Column(name = "NRO_INSPECCION")
    private Integer nroInspeccion;
    @Basic(optional = false)
    @Column(name = "ANO", nullable = false)
    private short ano;
    @Column(name = "NRO_MOTOR", length = 25)
    private String nroMotor;
    @Column(name = "NRO_CHASIS", length = 30)
    private String nroChasis;
    @Column(name = "NRO_CHAPA", length = 15)
    private String nroChapa;
    @Basic(optional = false)
    @Column(name = "CASCO", nullable = false)
    private long casco;
    @Basic(optional = false)
    @Column(name = "PRIMA_CASCO", nullable = false)
    private long primaCasco;
    @Basic(optional = false)
    @Column(name = "CAPITAL_INCENDIO", nullable = false)
    private long capitalIncendio;
    @Basic(optional = false)
    @Column(name = "CAPITAL_ACCIDENTE", nullable = false)
    private long capitalAccidente;
    @Basic(optional = false)
    @Column(name = "CAPITAL_ROBO", nullable = false)
    private long capitalRobo;
    @Basic(optional = false)
    @Column(name = "CANT_RC", nullable = false)
    private short cantRc;
    @Basic(optional = false)
    @Column(name = "PRIMA_RC", nullable = false)
    private long primaRc;
    @Basic(optional = false)
    @Column(name = "CAP_RC1", nullable = false)
    private long capRc1;
    @Basic(optional = false)
    @Column(name = "CAP_RC2", nullable = false)
    private long capRc2;
    @Basic(optional = false)
    @Column(name = "CAP_RC3", nullable = false)
    private long capRc3;
    @Basic(optional = false)
    @Column(name = "CAP_ACCESORIOS", nullable = false)
    private long capAccesorios;
    @Basic(optional = false)
    @Column(name = "PRIMA_OTROS", nullable = false)
    private long primaOtros;
    @Basic(optional = false)
    @Column(name = "ROBO_VIA_PUBLICA", nullable = false)
    private short roboViaPublica;
    @Basic(optional = false)
    @Column(name = "PRIMA_ROBO_VIA_PUBLICA", nullable = false)
    private long primaRoboViaPublica;
    @Basic(optional = false)
    @Column(name = "TUMULTO_POPULAR", nullable = false)
    private short tumultoPopular;
    @Basic(optional = false)
    @Column(name = "PRIMA_TUMULTO_POPULAR", nullable = false)
    private long primaTumultoPopular;
    @Basic(optional = false)
    @Column(name = "DIAS_COBERTURA_EXTERIOR", nullable = false)
    private short diasCoberturaExterior;
    @Basic(optional = false)
    @Column(name = "PRIMA_COBERTURA_EXTERIOR", nullable = false)
    private long primaCoberturaExterior;
    @Basic(optional = false)
    @Column(name = "PRIMA_ADICIONAL", nullable = false)
    private long primaAdicional;
    @Column(name = "DESCRIPCION_ADICIONAL", length = 60)
    private String descripcionAdicional;
    @Basic(optional = false)
    @Column(name = "DCTO_BONIFICACION", nullable = false)
    private long dctoBonificacion;
    @Basic(optional = false)
    @Column(name = "FRANQUICIA", nullable = false)
    private long franquicia;
    @Basic(optional = false)
    @Column(name = "SOS", nullable = false)
    private short sos;
    @Basic(optional = false)
    @Column(name = "PRIMA_SOS", nullable = false)
    private long primaSos;
    @Basic(optional = false)
    @Column(name = "CANT_OCUPANTES", nullable = false)
    private short cantOcupantes;
    @Basic(optional = false)
    @Column(name = "CAP_MUERTE", nullable = false)
    private long capMuerte;
    @Basic(optional = false)
    @Column(name = "PRIMA_MUERTE", nullable = false)
    private long primaMuerte;
    @Basic(optional = false)
    @Column(name = "CAP_INCAPACIDAD", nullable = false)
    private long capIncapacidad;
    @Basic(optional = false)
    @Column(name = "CAP_GTOS_MEDICOS", nullable = false)
    private long capGtosMedicos;
    @Basic(optional = false)
    @Column(name = "PRIMA_GTOS_MEDICOS", nullable = false)
    private long primaGtosMedicos;
    @Basic(optional = false)
    @Column(name = "CANT_AIRBAG", nullable = false)
    private short cantAirbag;
    @Basic(optional = false)
    @Column(name = "CAP_AIRBAG", nullable = false)
    private long capAirbag;
    @Basic(optional = false)
    @Column(name = "PRIMA_AIRBAG", nullable = false)
    private long primaAirbag;
    @Column(name = "COD_PRENDARIO")
    private Short codPrendario;
    @Column(name = "TRACCION")
    private Short traccion;
    @Column(name = "EJE")
    private Short eje;
    @Column(name = "VOLANTE_CAMBIADO")
    private Short volanteCambiado;
    @Column(name = "NRO_PUERTA")
    private Short nroPuerta;
    @Column(name = "TIPO_COMBUST")
    private Short tipoCombust;
    @Basic(optional = false)
    @Column(name = "TIPO_ADICIONAL", nullable = false)
    private short tipoAdicional;
    @Column(name = "AIRBAG")
    private Short airbag;
    @Basic(optional = false)
    @Column(name = "PRIMA_INCAPACIDAD", nullable = false)
    private long primaIncapacidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PORC_BONIFICACION", nullable = false, precision = 5, scale = 2)
    private BigDecimal porcBonificacion;
    @Basic(optional = false)
    @Column(name = "ACDTE_ROBO", nullable = false)
    private short acdteRobo;
    @Basic(optional = false)
    @Column(name = "CAP_ACDTE_ROBO", nullable = false)
    private long capAcdteRobo;
    @Basic(optional = false)
    @Column(name = "PRIMA_ACDTE_ROBO", nullable = false)
    private long primaAcdteRobo;
    @Basic(optional = false)
    @Column(name = "ROBO_PARCIAL", nullable = false)
    private short roboParcial;
    @Basic(optional = false)
    @Column(name = "CAP_RP", nullable = false)
    private long capRp;
    @Basic(optional = false)
    @Column(name = "PRIMA_RP", nullable = false)
    private long primaRp;
    @Basic(optional = false)
    @Column(name = "RP_RT", nullable = false)
    private short rpRt;
    @Basic(optional = false)
    @Column(name = "CAP_RP_RT", nullable = false)
    private long capRpRt;
    @Basic(optional = false)
    @Column(name = "PRIMA_RP_RT", nullable = false)
    private long primaRpRt;
    @Basic(optional = false)
    @Column(name = "MARCMODE", nullable = false, length = 300)
    private String marcmode;
    @Column(name = "ALARMA")
    private Short alarma;
    @Basic(optional = false)
    @Column(name = "CARTA", nullable = false)
    private short carta;
    @Basic(optional = false)
    @Column(name = "NRO_CARTA", nullable = false)
    private int nroCarta;
    @Basic(optional = false)
    @Column(name = "PRIMA_CARTA", nullable = false)
    private long primaCarta;
    @Basic(optional = false)
    @Column(name = "DIAS_CARTA", nullable = false)
    private short diasCarta;
    @Basic(optional = false)
    @Column(name = "FORMA_PAGO", nullable = false)
    private short formaPago;
    @Basic(optional = false)
    @Column(name = "DESTINADO_A", nullable = false)
    private short destinadoA;
    @Column(name = "FECHA_CARGA_COMERCIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCargaComercial;
    @Column(name = "FECHA_ENTREGA_COMERCIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntregaComercial;
    @Basic(optional = false)
    @Column(name = "COD_USUARIO_CARGA", nullable = false)
    private short codUsuarioCarga;
    @Basic(optional = false)
    @Column(name = "COD_USUARIO_APRUEBA", nullable = false)
    private short codUsuarioAprueba;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA_PROPUESTA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCargaPropuesta;
    @Basic(optional = false)
    @Column(name = "RESP_MAX", nullable = false)
    private long respMax;
    @Basic(optional = false)
    @Column(name = "TIPO_FLOTA", nullable = false)
    private short tipoFlota;
    @Column(name = "COD_USUARIO_IMPRIME")
    private Short codUsuarioImprime;
    @Basic(optional = false)
    @Column(name = "PRIMA", nullable = false)
    private long prima;
    @Basic(optional = false)
    @Column(name = "ANULACION", nullable = false)
    private short anulacion;
    @Column(name = "USUARIO_MODIFICA")
    private Short usuarioModifica;
    @Basic(optional = false)
    @Column(name = "PCT_FRANQ_AIRBAG", nullable = false, precision = 5, scale = 2)
    private BigDecimal pctFranqAirbag;
    @Column(name = "POLIZA_CARTA", length = 21)
    private String polizaCarta;
    @Basic(optional = false)
    @Column(name = "PCT_CAP_RP_RT", nullable = false, precision = 5, scale = 2)
    private BigDecimal pctCapRpRt;
    @Basic(optional = false)
    @Column(name = "PCT_ACDTE_ROBO", nullable = false, precision = 5, scale = 2)
    private BigDecimal pctAcdteRobo;
    @Basic(optional = false)
    @Column(name = "CAP_AUTO_RADIO", nullable = false)
    private long capAutoRadio;
    @Basic(optional = false)
    @Column(name = "GRANIZO", nullable = false)
    private short granizo;
    @Column(name = "EXCL_INCENDIO")
    private Short exclIncendio;
    @Column(name = "EXCL_ROBO")
    private Short exclRobo;
    @Column(name = "EXCL_DANOS")
    private Short exclDanos;
    @Column(name = "EXCL_RC")
    private Short exclRc;
    @Column(name = "COD_PLAN")
    private Short codPlan;
    @Column(name = "COD_PROV_ALARMA")
    private Integer codProvAlarma;
    @Column(name = "NRO_ORDEN_ALARMA")
    private Long nroOrdenAlarma;
    @Column(name = "PCT_ROBO", precision = 5, scale = 2)
    private BigDecimal pctRobo;
    @Column(name = "CATEGORIA")
    private Short categoria;
    @Column(name = "DANOS_INSPECCION", length = 4000)
    private String danosInspeccion;
    @Column(name = "NRO_CARTA_ANUL")
    private Integer nroCartaAnul;
    @Basic(optional = false)
    @Column(name = "PORC_DCTO_FLOTA", nullable = false, precision = 5, scale = 2)
    private BigDecimal porcDctoFlota;
    @Basic(optional = false)
    @Column(name = "MONTO_DCTO_FLOTA", nullable = false)
    private long montoDctoFlota;
    @Column(name = "CAPITAL_CUALQUIER_COND")
    private Long capitalCualquierCond;
    @Column(name = "ACCESORIO_DE_FABRICA")
    private Short accesorioDeFabrica;
    @Column(name = "CAP_MERCADERIA")
    private Long capMercaderia;
    @Column(name = "PRIMA_MERCADERIA")
    private Long primaMercaderia;
    @Column(name = "FECHA_ANUL_CARTA_VERDE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAnulCartaVerde;
    @Column(name = "NRO_ORDEN_ALARMA_ANUL")
    private Long nroOrdenAlarmaAnul;
    @Column(name = "FECHA_ANUL_ORDEN_ALARMA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAnulOrdenAlarma;
    @Column(name = "USUARIO_ANUL_ORDEN_ALARMA")
    private Short usuarioAnulOrdenAlarma;
    @Column(name = "NRO_ENTRADA")
    private Integer nroEntrada;
    @Basic(optional = false)
    @Column(name = "TIPO_PINTURA", nullable = false)
    private short tipoPintura;
    @Column(name = "CILINDRADAS", length = 20)
    private String cilindradas;
    @Basic(optional = false)
    @Column(name = "TIPO_TRANSMISION", nullable = false)
    private short tipoTransmision;
    @Basic(optional = false)
    @Column(name = "NRO_COCHE", nullable = false)
    private short nroCoche;
    @Basic(optional = false)
    @Column(name = "CAP_ANTENA", nullable = false)
    private long capAntena;
    @Basic(optional = false)
    @Column(name = "CAP_RUEDA_AUXILIO", nullable = false)
    private long capRuedaAuxilio;
    @Basic(optional = false)
    @Column(name = "CAP_FAROS", nullable = false)
    private long capFaros;
    @Basic(optional = false)
    @Column(name = "CAP_TASAS", nullable = false)
    private long capTasas;
    @Basic(optional = false)
    @Column(name = "AMBULANCIA", nullable = false)
    private short ambulancia;
    @Basic(optional = false)
    @Column(name = "CERRAJERIA", nullable = false)
    private short cerrajeria;
    @Basic(optional = false)
    @Column(name = "ALARMA_CAPITAL_MINIMO", nullable = false)
    private long alarmaCapitalMinimo;
    @Basic(optional = false)
    @Column(name = "ASISTENCIA_JURIDICA", nullable = false)
    private short asistenciaJuridica;
    @Column(name = "NOMBRE_ASISTENCIA_JURIDICA", length = 60)
    private String nombreAsistenciaJuridica;
    @Basic(optional = false)
    @Column(name = "ACCESORIOS_ACC_INC", nullable = false)
    private short accesoriosAccInc;
    @Basic(optional = false)
    @Column(name = "COB_EXT_DANOS", nullable = false)
    private short cobExtDanos;
    @Basic(optional = false)
    @Column(name = "COB_EXT_ROBO", nullable = false)
    private short cobExtRobo;
    @Basic(optional = false)
    @Column(name = "COSTO_REINSTALACION", nullable = false, precision = 5, scale = 2)
    private BigDecimal costoReinstalacion;
    @Basic(optional = false)
    @Column(name = "DM_RT", nullable = false, precision = 5, scale = 2)
    private BigDecimal dmRt;
    @Basic(optional = false)
    @Column(name = "PCT_GRANIZO", nullable = false, precision = 5, scale = 2)
    private BigDecimal pctGranizo;
    @Basic(optional = false)
    @Column(name = "PCT_INC", nullable = false, precision = 5, scale = 2)
    private BigDecimal pctInc;
    @Basic(optional = false)
    @Column(name = "PCT_ACC", nullable = false, precision = 5, scale = 2)
    private BigDecimal pctAcc;
    @Basic(optional = false)
    @Column(name = "PORC_TUMULTO_POP", nullable = false, precision = 5, scale = 2)
    private BigDecimal porcTumultoPop;
    @Column(name = "TEXTO_ESPECIAL", length = 4000)
    private String textoEspecial;
    @Basic(optional = false)
    @Column(name = "NRO_COTIZACION", nullable = false)
    private long nroCotizacion;
    @Column(name = "TIPO_IMPORTACION")
    private BigInteger tipoImportacion;
    @Column(name = "DECLARACION", length = 1)
    private String declaracion;
    @JoinColumn(name = "COD_LOCALIDAD", referencedColumnName = "COD_LOCALIDAD")
    @ManyToOne
    private Archloca codLocalidad;
    @JoinColumn(name = "COD_COLOR", referencedColumnName = "COD_COLOR", nullable = false)
    @ManyToOne(optional = false)
    private ColoresVehiculos codColor;
    @JoinColumns({
        @JoinColumn(name = "COD_TIPO", referencedColumnName = "COD_TIPO", nullable = false),
        @JoinColumn(name = "COD_MARCA", referencedColumnName = "COD_MARCA", nullable = false),
        @JoinColumn(name = "COD_MODELO", referencedColumnName = "COD_MODELO", nullable = false)})
    @ManyToOne(optional = false)
    private ModelosVehiculos modelosVehiculos;
    @JoinColumn(name = "COD_PROCEDENCIA", referencedColumnName = "COD_PROCEDENCIA")
    @ManyToOne
    private Procedencia codProcedencia;

    public Proauemi() {
    }

    public Proauemi(ProauemiPK proauemiPK) {
        this.proauemiPK = proauemiPK;
    }

    public Proauemi(ProauemiPK proauemiPK, Date fecha, int nroPropuesta, short ano, long casco, long primaCasco, long capitalIncendio, long capitalAccidente, long capitalRobo, short cantRc, long primaRc, long capRc1, long capRc2, long capRc3, long capAccesorios, long primaOtros, short roboViaPublica, long primaRoboViaPublica, short tumultoPopular, long primaTumultoPopular, short diasCoberturaExterior, long primaCoberturaExterior, long primaAdicional, long dctoBonificacion, long franquicia, short sos, long primaSos, short cantOcupantes, long capMuerte, long primaMuerte, long capIncapacidad, long capGtosMedicos, long primaGtosMedicos, short cantAirbag, long capAirbag, long primaAirbag, short tipoAdicional, long primaIncapacidad, BigDecimal porcBonificacion, short acdteRobo, long capAcdteRobo, long primaAcdteRobo, short roboParcial, long capRp, long primaRp, short rpRt, long capRpRt, long primaRpRt, String marcmode, short carta, int nroCarta, long primaCarta, short diasCarta, short formaPago, short destinadoA, short codUsuarioCarga, short codUsuarioAprueba, Date fechaCargaPropuesta, long respMax, short tipoFlota, long prima, short anulacion, BigDecimal pctFranqAirbag, BigDecimal pctCapRpRt, BigDecimal pctAcdteRobo, long capAutoRadio, short granizo, BigDecimal porcDctoFlota, long montoDctoFlota, short tipoPintura, short tipoTransmision, short nroCoche, long capAntena, long capRuedaAuxilio, long capFaros, long capTasas, short ambulancia, short cerrajeria, long alarmaCapitalMinimo, short asistenciaJuridica, short accesoriosAccInc, short cobExtDanos, short cobExtRobo, BigDecimal costoReinstalacion, BigDecimal dmRt, BigDecimal pctGranizo, BigDecimal pctInc, BigDecimal pctAcc, BigDecimal porcTumultoPop, long nroCotizacion) {
        this.proauemiPK = proauemiPK;
        this.fecha = fecha;
        this.nroPropuesta = nroPropuesta;
        this.ano = ano;
        this.casco = casco;
        this.primaCasco = primaCasco;
        this.capitalIncendio = capitalIncendio;
        this.capitalAccidente = capitalAccidente;
        this.capitalRobo = capitalRobo;
        this.cantRc = cantRc;
        this.primaRc = primaRc;
        this.capRc1 = capRc1;
        this.capRc2 = capRc2;
        this.capRc3 = capRc3;
        this.capAccesorios = capAccesorios;
        this.primaOtros = primaOtros;
        this.roboViaPublica = roboViaPublica;
        this.primaRoboViaPublica = primaRoboViaPublica;
        this.tumultoPopular = tumultoPopular;
        this.primaTumultoPopular = primaTumultoPopular;
        this.diasCoberturaExterior = diasCoberturaExterior;
        this.primaCoberturaExterior = primaCoberturaExterior;
        this.primaAdicional = primaAdicional;
        this.dctoBonificacion = dctoBonificacion;
        this.franquicia = franquicia;
        this.sos = sos;
        this.primaSos = primaSos;
        this.cantOcupantes = cantOcupantes;
        this.capMuerte = capMuerte;
        this.primaMuerte = primaMuerte;
        this.capIncapacidad = capIncapacidad;
        this.capGtosMedicos = capGtosMedicos;
        this.primaGtosMedicos = primaGtosMedicos;
        this.cantAirbag = cantAirbag;
        this.capAirbag = capAirbag;
        this.primaAirbag = primaAirbag;
        this.tipoAdicional = tipoAdicional;
        this.primaIncapacidad = primaIncapacidad;
        this.porcBonificacion = porcBonificacion;
        this.acdteRobo = acdteRobo;
        this.capAcdteRobo = capAcdteRobo;
        this.primaAcdteRobo = primaAcdteRobo;
        this.roboParcial = roboParcial;
        this.capRp = capRp;
        this.primaRp = primaRp;
        this.rpRt = rpRt;
        this.capRpRt = capRpRt;
        this.primaRpRt = primaRpRt;
        this.marcmode = marcmode;
        this.carta = carta;
        this.nroCarta = nroCarta;
        this.primaCarta = primaCarta;
        this.diasCarta = diasCarta;
        this.formaPago = formaPago;
        this.destinadoA = destinadoA;
        this.codUsuarioCarga = codUsuarioCarga;
        this.codUsuarioAprueba = codUsuarioAprueba;
        this.fechaCargaPropuesta = fechaCargaPropuesta;
        this.respMax = respMax;
        this.tipoFlota = tipoFlota;
        this.prima = prima;
        this.anulacion = anulacion;
        this.pctFranqAirbag = pctFranqAirbag;
        this.pctCapRpRt = pctCapRpRt;
        this.pctAcdteRobo = pctAcdteRobo;
        this.capAutoRadio = capAutoRadio;
        this.granizo = granizo;
        this.porcDctoFlota = porcDctoFlota;
        this.montoDctoFlota = montoDctoFlota;
        this.tipoPintura = tipoPintura;
        this.tipoTransmision = tipoTransmision;
        this.nroCoche = nroCoche;
        this.capAntena = capAntena;
        this.capRuedaAuxilio = capRuedaAuxilio;
        this.capFaros = capFaros;
        this.capTasas = capTasas;
        this.ambulancia = ambulancia;
        this.cerrajeria = cerrajeria;
        this.alarmaCapitalMinimo = alarmaCapitalMinimo;
        this.asistenciaJuridica = asistenciaJuridica;
        this.accesoriosAccInc = accesoriosAccInc;
        this.cobExtDanos = cobExtDanos;
        this.cobExtRobo = cobExtRobo;
        this.costoReinstalacion = costoReinstalacion;
        this.dmRt = dmRt;
        this.pctGranizo = pctGranizo;
        this.pctInc = pctInc;
        this.pctAcc = pctAcc;
        this.porcTumultoPop = porcTumultoPop;
        this.nroCotizacion = nroCotizacion;
    }

    public Proauemi(short ejercicio, int item, short tipoSeguro, short tipoOperacion, short secc, int polnro, short anexo) {
        this.proauemiPK = new ProauemiPK(ejercicio, item, tipoSeguro, tipoOperacion, secc, polnro, anexo);
    }

    public ProauemiPK getProauemiPK() {
        return proauemiPK;
    }

    public void setProauemiPK(ProauemiPK proauemiPK) {
        this.proauemiPK = proauemiPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNroPropuesta() {
        return nroPropuesta;
    }

    public void setNroPropuesta(int nroPropuesta) {
        this.nroPropuesta = nroPropuesta;
    }

    public Integer getNroInspeccion() {
        return nroInspeccion;
    }

    public void setNroInspeccion(Integer nroInspeccion) {
        this.nroInspeccion = nroInspeccion;
    }

    public short getAno() {
        return ano;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    public String getNroMotor() {
        return nroMotor;
    }

    public void setNroMotor(String nroMotor) {
        this.nroMotor = nroMotor;
    }

    public String getNroChasis() {
        return nroChasis;
    }

    public void setNroChasis(String nroChasis) {
        this.nroChasis = nroChasis;
    }

    public String getNroChapa() {
        return nroChapa;
    }

    public void setNroChapa(String nroChapa) {
        this.nroChapa = nroChapa;
    }

    public long getCasco() {
        return casco;
    }

    public void setCasco(long casco) {
        this.casco = casco;
    }

    public long getPrimaCasco() {
        return primaCasco;
    }

    public void setPrimaCasco(long primaCasco) {
        this.primaCasco = primaCasco;
    }

    public long getCapitalIncendio() {
        return capitalIncendio;
    }

    public void setCapitalIncendio(long capitalIncendio) {
        this.capitalIncendio = capitalIncendio;
    }

    public long getCapitalAccidente() {
        return capitalAccidente;
    }

    public void setCapitalAccidente(long capitalAccidente) {
        this.capitalAccidente = capitalAccidente;
    }

    public long getCapitalRobo() {
        return capitalRobo;
    }

    public void setCapitalRobo(long capitalRobo) {
        this.capitalRobo = capitalRobo;
    }

    public short getCantRc() {
        return cantRc;
    }

    public void setCantRc(short cantRc) {
        this.cantRc = cantRc;
    }

    public long getPrimaRc() {
        return primaRc;
    }

    public void setPrimaRc(long primaRc) {
        this.primaRc = primaRc;
    }

    public long getCapRc1() {
        return capRc1;
    }

    public void setCapRc1(long capRc1) {
        this.capRc1 = capRc1;
    }

    public long getCapRc2() {
        return capRc2;
    }

    public void setCapRc2(long capRc2) {
        this.capRc2 = capRc2;
    }

    public long getCapRc3() {
        return capRc3;
    }

    public void setCapRc3(long capRc3) {
        this.capRc3 = capRc3;
    }

    public long getCapAccesorios() {
        return capAccesorios;
    }

    public void setCapAccesorios(long capAccesorios) {
        this.capAccesorios = capAccesorios;
    }

    public long getPrimaOtros() {
        return primaOtros;
    }

    public void setPrimaOtros(long primaOtros) {
        this.primaOtros = primaOtros;
    }

    public short getRoboViaPublica() {
        return roboViaPublica;
    }

    public void setRoboViaPublica(short roboViaPublica) {
        this.roboViaPublica = roboViaPublica;
    }

    public long getPrimaRoboViaPublica() {
        return primaRoboViaPublica;
    }

    public void setPrimaRoboViaPublica(long primaRoboViaPublica) {
        this.primaRoboViaPublica = primaRoboViaPublica;
    }

    public short getTumultoPopular() {
        return tumultoPopular;
    }

    public void setTumultoPopular(short tumultoPopular) {
        this.tumultoPopular = tumultoPopular;
    }

    public long getPrimaTumultoPopular() {
        return primaTumultoPopular;
    }

    public void setPrimaTumultoPopular(long primaTumultoPopular) {
        this.primaTumultoPopular = primaTumultoPopular;
    }

    public short getDiasCoberturaExterior() {
        return diasCoberturaExterior;
    }

    public void setDiasCoberturaExterior(short diasCoberturaExterior) {
        this.diasCoberturaExterior = diasCoberturaExterior;
    }

    public long getPrimaCoberturaExterior() {
        return primaCoberturaExterior;
    }

    public void setPrimaCoberturaExterior(long primaCoberturaExterior) {
        this.primaCoberturaExterior = primaCoberturaExterior;
    }

    public long getPrimaAdicional() {
        return primaAdicional;
    }

    public void setPrimaAdicional(long primaAdicional) {
        this.primaAdicional = primaAdicional;
    }

    public String getDescripcionAdicional() {
        return descripcionAdicional;
    }

    public void setDescripcionAdicional(String descripcionAdicional) {
        this.descripcionAdicional = descripcionAdicional;
    }

    public long getDctoBonificacion() {
        return dctoBonificacion;
    }

    public void setDctoBonificacion(long dctoBonificacion) {
        this.dctoBonificacion = dctoBonificacion;
    }

    public long getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(long franquicia) {
        this.franquicia = franquicia;
    }

    public short getSos() {
        return sos;
    }

    public void setSos(short sos) {
        this.sos = sos;
    }

    public long getPrimaSos() {
        return primaSos;
    }

    public void setPrimaSos(long primaSos) {
        this.primaSos = primaSos;
    }

    public short getCantOcupantes() {
        return cantOcupantes;
    }

    public void setCantOcupantes(short cantOcupantes) {
        this.cantOcupantes = cantOcupantes;
    }

    public long getCapMuerte() {
        return capMuerte;
    }

    public void setCapMuerte(long capMuerte) {
        this.capMuerte = capMuerte;
    }

    public long getPrimaMuerte() {
        return primaMuerte;
    }

    public void setPrimaMuerte(long primaMuerte) {
        this.primaMuerte = primaMuerte;
    }

    public long getCapIncapacidad() {
        return capIncapacidad;
    }

    public void setCapIncapacidad(long capIncapacidad) {
        this.capIncapacidad = capIncapacidad;
    }

    public long getCapGtosMedicos() {
        return capGtosMedicos;
    }

    public void setCapGtosMedicos(long capGtosMedicos) {
        this.capGtosMedicos = capGtosMedicos;
    }

    public long getPrimaGtosMedicos() {
        return primaGtosMedicos;
    }

    public void setPrimaGtosMedicos(long primaGtosMedicos) {
        this.primaGtosMedicos = primaGtosMedicos;
    }

    public short getCantAirbag() {
        return cantAirbag;
    }

    public void setCantAirbag(short cantAirbag) {
        this.cantAirbag = cantAirbag;
    }

    public long getCapAirbag() {
        return capAirbag;
    }

    public void setCapAirbag(long capAirbag) {
        this.capAirbag = capAirbag;
    }

    public long getPrimaAirbag() {
        return primaAirbag;
    }

    public void setPrimaAirbag(long primaAirbag) {
        this.primaAirbag = primaAirbag;
    }

    public Short getCodPrendario() {
        return codPrendario;
    }

    public void setCodPrendario(Short codPrendario) {
        this.codPrendario = codPrendario;
    }

    public Short getTraccion() {
        return traccion;
    }

    public void setTraccion(Short traccion) {
        this.traccion = traccion;
    }

    public Short getEje() {
        return eje;
    }

    public void setEje(Short eje) {
        this.eje = eje;
    }

    public Short getVolanteCambiado() {
        return volanteCambiado;
    }

    public void setVolanteCambiado(Short volanteCambiado) {
        this.volanteCambiado = volanteCambiado;
    }

    public Short getNroPuerta() {
        return nroPuerta;
    }

    public void setNroPuerta(Short nroPuerta) {
        this.nroPuerta = nroPuerta;
    }

    public Short getTipoCombust() {
        return tipoCombust;
    }

    public void setTipoCombust(Short tipoCombust) {
        this.tipoCombust = tipoCombust;
    }

    public short getTipoAdicional() {
        return tipoAdicional;
    }

    public void setTipoAdicional(short tipoAdicional) {
        this.tipoAdicional = tipoAdicional;
    }

    public Short getAirbag() {
        return airbag;
    }

    public void setAirbag(Short airbag) {
        this.airbag = airbag;
    }

    public long getPrimaIncapacidad() {
        return primaIncapacidad;
    }

    public void setPrimaIncapacidad(long primaIncapacidad) {
        this.primaIncapacidad = primaIncapacidad;
    }

    public BigDecimal getPorcBonificacion() {
        return porcBonificacion;
    }

    public void setPorcBonificacion(BigDecimal porcBonificacion) {
        this.porcBonificacion = porcBonificacion;
    }

    public short getAcdteRobo() {
        return acdteRobo;
    }

    public void setAcdteRobo(short acdteRobo) {
        this.acdteRobo = acdteRobo;
    }

    public long getCapAcdteRobo() {
        return capAcdteRobo;
    }

    public void setCapAcdteRobo(long capAcdteRobo) {
        this.capAcdteRobo = capAcdteRobo;
    }

    public long getPrimaAcdteRobo() {
        return primaAcdteRobo;
    }

    public void setPrimaAcdteRobo(long primaAcdteRobo) {
        this.primaAcdteRobo = primaAcdteRobo;
    }

    public short getRoboParcial() {
        return roboParcial;
    }

    public void setRoboParcial(short roboParcial) {
        this.roboParcial = roboParcial;
    }

    public long getCapRp() {
        return capRp;
    }

    public void setCapRp(long capRp) {
        this.capRp = capRp;
    }

    public long getPrimaRp() {
        return primaRp;
    }

    public void setPrimaRp(long primaRp) {
        this.primaRp = primaRp;
    }

    public short getRpRt() {
        return rpRt;
    }

    public void setRpRt(short rpRt) {
        this.rpRt = rpRt;
    }

    public long getCapRpRt() {
        return capRpRt;
    }

    public void setCapRpRt(long capRpRt) {
        this.capRpRt = capRpRt;
    }

    public long getPrimaRpRt() {
        return primaRpRt;
    }

    public void setPrimaRpRt(long primaRpRt) {
        this.primaRpRt = primaRpRt;
    }

    public String getMarcmode() {
        return marcmode;
    }

    public void setMarcmode(String marcmode) {
        this.marcmode = marcmode;
    }

    public Short getAlarma() {
        return alarma;
    }

    public void setAlarma(Short alarma) {
        this.alarma = alarma;
    }

    public short getCarta() {
        return carta;
    }

    public void setCarta(short carta) {
        this.carta = carta;
    }

    public int getNroCarta() {
        return nroCarta;
    }

    public void setNroCarta(int nroCarta) {
        this.nroCarta = nroCarta;
    }

    public long getPrimaCarta() {
        return primaCarta;
    }

    public void setPrimaCarta(long primaCarta) {
        this.primaCarta = primaCarta;
    }

    public short getDiasCarta() {
        return diasCarta;
    }

    public void setDiasCarta(short diasCarta) {
        this.diasCarta = diasCarta;
    }

    public short getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(short formaPago) {
        this.formaPago = formaPago;
    }

    public short getDestinadoA() {
        return destinadoA;
    }

    public void setDestinadoA(short destinadoA) {
        this.destinadoA = destinadoA;
    }

    public Date getFechaCargaComercial() {
        return fechaCargaComercial;
    }

    public void setFechaCargaComercial(Date fechaCargaComercial) {
        this.fechaCargaComercial = fechaCargaComercial;
    }

    public Date getFechaEntregaComercial() {
        return fechaEntregaComercial;
    }

    public void setFechaEntregaComercial(Date fechaEntregaComercial) {
        this.fechaEntregaComercial = fechaEntregaComercial;
    }

    public short getCodUsuarioCarga() {
        return codUsuarioCarga;
    }

    public void setCodUsuarioCarga(short codUsuarioCarga) {
        this.codUsuarioCarga = codUsuarioCarga;
    }

    public short getCodUsuarioAprueba() {
        return codUsuarioAprueba;
    }

    public void setCodUsuarioAprueba(short codUsuarioAprueba) {
        this.codUsuarioAprueba = codUsuarioAprueba;
    }

    public Date getFechaCargaPropuesta() {
        return fechaCargaPropuesta;
    }

    public void setFechaCargaPropuesta(Date fechaCargaPropuesta) {
        this.fechaCargaPropuesta = fechaCargaPropuesta;
    }

    public long getRespMax() {
        return respMax;
    }

    public void setRespMax(long respMax) {
        this.respMax = respMax;
    }

    public short getTipoFlota() {
        return tipoFlota;
    }

    public void setTipoFlota(short tipoFlota) {
        this.tipoFlota = tipoFlota;
    }

    public Short getCodUsuarioImprime() {
        return codUsuarioImprime;
    }

    public void setCodUsuarioImprime(Short codUsuarioImprime) {
        this.codUsuarioImprime = codUsuarioImprime;
    }

    public long getPrima() {
        return prima;
    }

    public void setPrima(long prima) {
        this.prima = prima;
    }

    public short getAnulacion() {
        return anulacion;
    }

    public void setAnulacion(short anulacion) {
        this.anulacion = anulacion;
    }

    public Short getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(Short usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    public BigDecimal getPctFranqAirbag() {
        return pctFranqAirbag;
    }

    public void setPctFranqAirbag(BigDecimal pctFranqAirbag) {
        this.pctFranqAirbag = pctFranqAirbag;
    }

    public String getPolizaCarta() {
        return polizaCarta;
    }

    public void setPolizaCarta(String polizaCarta) {
        this.polizaCarta = polizaCarta;
    }

    public BigDecimal getPctCapRpRt() {
        return pctCapRpRt;
    }

    public void setPctCapRpRt(BigDecimal pctCapRpRt) {
        this.pctCapRpRt = pctCapRpRt;
    }

    public BigDecimal getPctAcdteRobo() {
        return pctAcdteRobo;
    }

    public void setPctAcdteRobo(BigDecimal pctAcdteRobo) {
        this.pctAcdteRobo = pctAcdteRobo;
    }

    public long getCapAutoRadio() {
        return capAutoRadio;
    }

    public void setCapAutoRadio(long capAutoRadio) {
        this.capAutoRadio = capAutoRadio;
    }

    public short getGranizo() {
        return granizo;
    }

    public void setGranizo(short granizo) {
        this.granizo = granizo;
    }

    public Short getExclIncendio() {
        return exclIncendio;
    }

    public void setExclIncendio(Short exclIncendio) {
        this.exclIncendio = exclIncendio;
    }

    public Short getExclRobo() {
        return exclRobo;
    }

    public void setExclRobo(Short exclRobo) {
        this.exclRobo = exclRobo;
    }

    public Short getExclDanos() {
        return exclDanos;
    }

    public void setExclDanos(Short exclDanos) {
        this.exclDanos = exclDanos;
    }

    public Short getExclRc() {
        return exclRc;
    }

    public void setExclRc(Short exclRc) {
        this.exclRc = exclRc;
    }

    public Short getCodPlan() {
        return codPlan;
    }

    public void setCodPlan(Short codPlan) {
        this.codPlan = codPlan;
    }

    public Integer getCodProvAlarma() {
        return codProvAlarma;
    }

    public void setCodProvAlarma(Integer codProvAlarma) {
        this.codProvAlarma = codProvAlarma;
    }

    public Long getNroOrdenAlarma() {
        return nroOrdenAlarma;
    }

    public void setNroOrdenAlarma(Long nroOrdenAlarma) {
        this.nroOrdenAlarma = nroOrdenAlarma;
    }

    public BigDecimal getPctRobo() {
        return pctRobo;
    }

    public void setPctRobo(BigDecimal pctRobo) {
        this.pctRobo = pctRobo;
    }

    public Short getCategoria() {
        return categoria;
    }

    public void setCategoria(Short categoria) {
        this.categoria = categoria;
    }

    public String getDanosInspeccion() {
        return danosInspeccion;
    }

    public void setDanosInspeccion(String danosInspeccion) {
        this.danosInspeccion = danosInspeccion;
    }

    public Integer getNroCartaAnul() {
        return nroCartaAnul;
    }

    public void setNroCartaAnul(Integer nroCartaAnul) {
        this.nroCartaAnul = nroCartaAnul;
    }

    public BigDecimal getPorcDctoFlota() {
        return porcDctoFlota;
    }

    public void setPorcDctoFlota(BigDecimal porcDctoFlota) {
        this.porcDctoFlota = porcDctoFlota;
    }

    public long getMontoDctoFlota() {
        return montoDctoFlota;
    }

    public void setMontoDctoFlota(long montoDctoFlota) {
        this.montoDctoFlota = montoDctoFlota;
    }

    public Long getCapitalCualquierCond() {
        return capitalCualquierCond;
    }

    public void setCapitalCualquierCond(Long capitalCualquierCond) {
        this.capitalCualquierCond = capitalCualquierCond;
    }

    public Short getAccesorioDeFabrica() {
        return accesorioDeFabrica;
    }

    public void setAccesorioDeFabrica(Short accesorioDeFabrica) {
        this.accesorioDeFabrica = accesorioDeFabrica;
    }

    public Long getCapMercaderia() {
        return capMercaderia;
    }

    public void setCapMercaderia(Long capMercaderia) {
        this.capMercaderia = capMercaderia;
    }

    public Long getPrimaMercaderia() {
        return primaMercaderia;
    }

    public void setPrimaMercaderia(Long primaMercaderia) {
        this.primaMercaderia = primaMercaderia;
    }

    public Date getFechaAnulCartaVerde() {
        return fechaAnulCartaVerde;
    }

    public void setFechaAnulCartaVerde(Date fechaAnulCartaVerde) {
        this.fechaAnulCartaVerde = fechaAnulCartaVerde;
    }

    public Long getNroOrdenAlarmaAnul() {
        return nroOrdenAlarmaAnul;
    }

    public void setNroOrdenAlarmaAnul(Long nroOrdenAlarmaAnul) {
        this.nroOrdenAlarmaAnul = nroOrdenAlarmaAnul;
    }

    public Date getFechaAnulOrdenAlarma() {
        return fechaAnulOrdenAlarma;
    }

    public void setFechaAnulOrdenAlarma(Date fechaAnulOrdenAlarma) {
        this.fechaAnulOrdenAlarma = fechaAnulOrdenAlarma;
    }

    public Short getUsuarioAnulOrdenAlarma() {
        return usuarioAnulOrdenAlarma;
    }

    public void setUsuarioAnulOrdenAlarma(Short usuarioAnulOrdenAlarma) {
        this.usuarioAnulOrdenAlarma = usuarioAnulOrdenAlarma;
    }

    public Integer getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(Integer nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public short getTipoPintura() {
        return tipoPintura;
    }

    public void setTipoPintura(short tipoPintura) {
        this.tipoPintura = tipoPintura;
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    public short getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(short tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public short getNroCoche() {
        return nroCoche;
    }

    public void setNroCoche(short nroCoche) {
        this.nroCoche = nroCoche;
    }

    public long getCapAntena() {
        return capAntena;
    }

    public void setCapAntena(long capAntena) {
        this.capAntena = capAntena;
    }

    public long getCapRuedaAuxilio() {
        return capRuedaAuxilio;
    }

    public void setCapRuedaAuxilio(long capRuedaAuxilio) {
        this.capRuedaAuxilio = capRuedaAuxilio;
    }

    public long getCapFaros() {
        return capFaros;
    }

    public void setCapFaros(long capFaros) {
        this.capFaros = capFaros;
    }

    public long getCapTasas() {
        return capTasas;
    }

    public void setCapTasas(long capTasas) {
        this.capTasas = capTasas;
    }

    public short getAmbulancia() {
        return ambulancia;
    }

    public void setAmbulancia(short ambulancia) {
        this.ambulancia = ambulancia;
    }

    public short getCerrajeria() {
        return cerrajeria;
    }

    public void setCerrajeria(short cerrajeria) {
        this.cerrajeria = cerrajeria;
    }

    public long getAlarmaCapitalMinimo() {
        return alarmaCapitalMinimo;
    }

    public void setAlarmaCapitalMinimo(long alarmaCapitalMinimo) {
        this.alarmaCapitalMinimo = alarmaCapitalMinimo;
    }

    public short getAsistenciaJuridica() {
        return asistenciaJuridica;
    }

    public void setAsistenciaJuridica(short asistenciaJuridica) {
        this.asistenciaJuridica = asistenciaJuridica;
    }

    public String getNombreAsistenciaJuridica() {
        return nombreAsistenciaJuridica;
    }

    public void setNombreAsistenciaJuridica(String nombreAsistenciaJuridica) {
        this.nombreAsistenciaJuridica = nombreAsistenciaJuridica;
    }

    public short getAccesoriosAccInc() {
        return accesoriosAccInc;
    }

    public void setAccesoriosAccInc(short accesoriosAccInc) {
        this.accesoriosAccInc = accesoriosAccInc;
    }

    public short getCobExtDanos() {
        return cobExtDanos;
    }

    public void setCobExtDanos(short cobExtDanos) {
        this.cobExtDanos = cobExtDanos;
    }

    public short getCobExtRobo() {
        return cobExtRobo;
    }

    public void setCobExtRobo(short cobExtRobo) {
        this.cobExtRobo = cobExtRobo;
    }

    public BigDecimal getCostoReinstalacion() {
        return costoReinstalacion;
    }

    public void setCostoReinstalacion(BigDecimal costoReinstalacion) {
        this.costoReinstalacion = costoReinstalacion;
    }

    public BigDecimal getDmRt() {
        return dmRt;
    }

    public void setDmRt(BigDecimal dmRt) {
        this.dmRt = dmRt;
    }

    public BigDecimal getPctGranizo() {
        return pctGranizo;
    }

    public void setPctGranizo(BigDecimal pctGranizo) {
        this.pctGranizo = pctGranizo;
    }

    public BigDecimal getPctInc() {
        return pctInc;
    }

    public void setPctInc(BigDecimal pctInc) {
        this.pctInc = pctInc;
    }

    public BigDecimal getPctAcc() {
        return pctAcc;
    }

    public void setPctAcc(BigDecimal pctAcc) {
        this.pctAcc = pctAcc;
    }

    public BigDecimal getPorcTumultoPop() {
        return porcTumultoPop;
    }

    public void setPorcTumultoPop(BigDecimal porcTumultoPop) {
        this.porcTumultoPop = porcTumultoPop;
    }

    public String getTextoEspecial() {
        return textoEspecial;
    }

    public void setTextoEspecial(String textoEspecial) {
        this.textoEspecial = textoEspecial;
    }

    public long getNroCotizacion() {
        return nroCotizacion;
    }

    public void setNroCotizacion(long nroCotizacion) {
        this.nroCotizacion = nroCotizacion;
    }

    public BigInteger getTipoImportacion() {
        return tipoImportacion;
    }

    public void setTipoImportacion(BigInteger tipoImportacion) {
        this.tipoImportacion = tipoImportacion;
    }

    public String getDeclaracion() {
        return declaracion;
    }

    public void setDeclaracion(String declaracion) {
        this.declaracion = declaracion;
    }

    public Archloca getCodLocalidad() {
        return codLocalidad;
    }

    public void setCodLocalidad(Archloca codLocalidad) {
        this.codLocalidad = codLocalidad;
    }

    public ColoresVehiculos getCodColor() {
        return codColor;
    }

    public void setCodColor(ColoresVehiculos codColor) {
        this.codColor = codColor;
    }

    public ModelosVehiculos getModelosVehiculos() {
        return modelosVehiculos;
    }

    public void setModelosVehiculos(ModelosVehiculos modelosVehiculos) {
        this.modelosVehiculos = modelosVehiculos;
    }

    public Procedencia getCodProcedencia() {
        return codProcedencia;
    }

    public void setCodProcedencia(Procedencia codProcedencia) {
        this.codProcedencia = codProcedencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proauemiPK != null ? proauemiPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proauemi)) {
            return false;
        }
        Proauemi other = (Proauemi) object;
        if ((this.proauemiPK == null && other.proauemiPK != null) || (this.proauemiPK != null && !this.proauemiPK.equals(other.proauemiPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Proauemi[ proauemiPK=" + proauemiPK + " ]";
    }

    public ProauemiMe getProauemiMe() {
        return proauemiMe;
    }

    public void setProauemiMe(ProauemiMe proauemiMe) {
        this.proauemiMe = proauemiMe;
    }

}
