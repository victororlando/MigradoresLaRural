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
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "PROPAUTO", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "Propauto.findAll", query = "SELECT p FROM Propauto p"),
    @NamedQuery(name = "Propauto.findByCodAgcia", query = "SELECT p FROM Propauto p WHERE p.codAgcia = :codAgcia"),
    @NamedQuery(name = "Propauto.findByFecha", query = "SELECT p FROM Propauto p WHERE p.fecha = :fecha"),
    @NamedQuery(name = "Propauto.findByEjercicio", query = "SELECT p FROM Propauto p WHERE p.propautoPK.ejercicio = :ejercicio"),
    @NamedQuery(name = "Propauto.findByNroPropuesta", query = "SELECT p FROM Propauto p WHERE p.propautoPK.nroPropuesta = :nroPropuesta"),
    @NamedQuery(name = "Propauto.findByTipoSeguro", query = "SELECT p FROM Propauto p WHERE p.tipoSeguro = :tipoSeguro"),
    @NamedQuery(name = "Propauto.findByTipoOperacion", query = "SELECT p FROM Propauto p WHERE p.tipoOperacion = :tipoOperacion"),
    @NamedQuery(name = "Propauto.findByPolant", query = "SELECT p FROM Propauto p WHERE p.polant = :polant"),
    @NamedQuery(name = "Propauto.findByVigdes", query = "SELECT p FROM Propauto p WHERE p.vigdes = :vigdes"),
    @NamedQuery(name = "Propauto.findByVighas", query = "SELECT p FROM Propauto p WHERE p.vighas = :vighas"),
    @NamedQuery(name = "Propauto.findByCantDias", query = "SELECT p FROM Propauto p WHERE p.cantDias = :cantDias"),
    @NamedQuery(name = "Propauto.findByCodMoney", query = "SELECT p FROM Propauto p WHERE p.codMoney = :codMoney"),
    @NamedQuery(name = "Propauto.findByTCambio", query = "SELECT p FROM Propauto p WHERE p.tCambio = :tCambio"),
    @NamedQuery(name = "Propauto.findByNroInspeccion", query = "SELECT p FROM Propauto p WHERE p.nroInspeccion = :nroInspeccion"),
    @NamedQuery(name = "Propauto.findByCodTipo", query = "SELECT p FROM Propauto p WHERE p.codTipo = :codTipo"),
    @NamedQuery(name = "Propauto.findByCodMarca", query = "SELECT p FROM Propauto p WHERE p.codMarca = :codMarca"),
    @NamedQuery(name = "Propauto.findByCodModelo", query = "SELECT p FROM Propauto p WHERE p.codModelo = :codModelo"),
    @NamedQuery(name = "Propauto.findByAno", query = "SELECT p FROM Propauto p WHERE p.ano = :ano"),
    @NamedQuery(name = "Propauto.findByNroMotor", query = "SELECT p FROM Propauto p WHERE p.nroMotor = :nroMotor"),
    @NamedQuery(name = "Propauto.findByNroChasis", query = "SELECT p FROM Propauto p WHERE p.nroChasis = :nroChasis"),
    @NamedQuery(name = "Propauto.findByCodLocalidad", query = "SELECT p FROM Propauto p WHERE p.codLocalidad = :codLocalidad"),
    @NamedQuery(name = "Propauto.findByNroChapa", query = "SELECT p FROM Propauto p WHERE p.nroChapa = :nroChapa"),
    @NamedQuery(name = "Propauto.findByCasco", query = "SELECT p FROM Propauto p WHERE p.casco = :casco"),
    @NamedQuery(name = "Propauto.findByCascoMe", query = "SELECT p FROM Propauto p WHERE p.cascoMe = :cascoMe"),
    @NamedQuery(name = "Propauto.findByPrimaCasco", query = "SELECT p FROM Propauto p WHERE p.primaCasco = :primaCasco"),
    @NamedQuery(name = "Propauto.findByPrimaCascoMe", query = "SELECT p FROM Propauto p WHERE p.primaCascoMe = :primaCascoMe"),
    @NamedQuery(name = "Propauto.findByCapitalIncendio", query = "SELECT p FROM Propauto p WHERE p.capitalIncendio = :capitalIncendio"),
    @NamedQuery(name = "Propauto.findByCptalIncendioMe", query = "SELECT p FROM Propauto p WHERE p.cptalIncendioMe = :cptalIncendioMe"),
    @NamedQuery(name = "Propauto.findByCapitalAccidente", query = "SELECT p FROM Propauto p WHERE p.capitalAccidente = :capitalAccidente"),
    @NamedQuery(name = "Propauto.findByCptalAccidenteMe", query = "SELECT p FROM Propauto p WHERE p.cptalAccidenteMe = :cptalAccidenteMe"),
    @NamedQuery(name = "Propauto.findByCapitalRobo", query = "SELECT p FROM Propauto p WHERE p.capitalRobo = :capitalRobo"),
    @NamedQuery(name = "Propauto.findByCptalRoboMe", query = "SELECT p FROM Propauto p WHERE p.cptalRoboMe = :cptalRoboMe"),
    @NamedQuery(name = "Propauto.findByCantRc", query = "SELECT p FROM Propauto p WHERE p.cantRc = :cantRc"),
    @NamedQuery(name = "Propauto.findByPrimaRc", query = "SELECT p FROM Propauto p WHERE p.primaRc = :primaRc"),
    @NamedQuery(name = "Propauto.findByPrimaRcMe", query = "SELECT p FROM Propauto p WHERE p.primaRcMe = :primaRcMe"),
    @NamedQuery(name = "Propauto.findByCapRc1", query = "SELECT p FROM Propauto p WHERE p.capRc1 = :capRc1"),
    @NamedQuery(name = "Propauto.findByCapRc1Me", query = "SELECT p FROM Propauto p WHERE p.capRc1Me = :capRc1Me"),
    @NamedQuery(name = "Propauto.findByCapRc2", query = "SELECT p FROM Propauto p WHERE p.capRc2 = :capRc2"),
    @NamedQuery(name = "Propauto.findByCapRc2Me", query = "SELECT p FROM Propauto p WHERE p.capRc2Me = :capRc2Me"),
    @NamedQuery(name = "Propauto.findByCapRc3", query = "SELECT p FROM Propauto p WHERE p.capRc3 = :capRc3"),
    @NamedQuery(name = "Propauto.findByCapRc3Me", query = "SELECT p FROM Propauto p WHERE p.capRc3Me = :capRc3Me"),
    @NamedQuery(name = "Propauto.findByCapAccesorios", query = "SELECT p FROM Propauto p WHERE p.capAccesorios = :capAccesorios"),
    @NamedQuery(name = "Propauto.findByCptalAccesoriosMe", query = "SELECT p FROM Propauto p WHERE p.cptalAccesoriosMe = :cptalAccesoriosMe"),
    @NamedQuery(name = "Propauto.findByPrimaOtros", query = "SELECT p FROM Propauto p WHERE p.primaOtros = :primaOtros"),
    @NamedQuery(name = "Propauto.findByPrimaOtrosMe", query = "SELECT p FROM Propauto p WHERE p.primaOtrosMe = :primaOtrosMe"),
    @NamedQuery(name = "Propauto.findByRoboViaPublica", query = "SELECT p FROM Propauto p WHERE p.roboViaPublica = :roboViaPublica"),
    @NamedQuery(name = "Propauto.findByPrimaRoboViaPublica", query = "SELECT p FROM Propauto p WHERE p.primaRoboViaPublica = :primaRoboViaPublica"),
    @NamedQuery(name = "Propauto.findByPrimaRoboViaMe", query = "SELECT p FROM Propauto p WHERE p.primaRoboViaMe = :primaRoboViaMe"),
    @NamedQuery(name = "Propauto.findByTumultoPopular", query = "SELECT p FROM Propauto p WHERE p.tumultoPopular = :tumultoPopular"),
    @NamedQuery(name = "Propauto.findByPrimaTumultoPopular", query = "SELECT p FROM Propauto p WHERE p.primaTumultoPopular = :primaTumultoPopular"),
    @NamedQuery(name = "Propauto.findByPrimaTumultoPopMe", query = "SELECT p FROM Propauto p WHERE p.primaTumultoPopMe = :primaTumultoPopMe"),
    @NamedQuery(name = "Propauto.findByDiasCoberturaExterior", query = "SELECT p FROM Propauto p WHERE p.diasCoberturaExterior = :diasCoberturaExterior"),
    @NamedQuery(name = "Propauto.findByPrimaCoberturaExterior", query = "SELECT p FROM Propauto p WHERE p.primaCoberturaExterior = :primaCoberturaExterior"),
    @NamedQuery(name = "Propauto.findByPrimaCobExtMe", query = "SELECT p FROM Propauto p WHERE p.primaCobExtMe = :primaCobExtMe"),
    @NamedQuery(name = "Propauto.findByPrimaAdicional", query = "SELECT p FROM Propauto p WHERE p.primaAdicional = :primaAdicional"),
    @NamedQuery(name = "Propauto.findByPrimaAdicionalMe", query = "SELECT p FROM Propauto p WHERE p.primaAdicionalMe = :primaAdicionalMe"),
    @NamedQuery(name = "Propauto.findByDescripcionAdicional", query = "SELECT p FROM Propauto p WHERE p.descripcionAdicional = :descripcionAdicional"),
    @NamedQuery(name = "Propauto.findByPorcBonificacon", query = "SELECT p FROM Propauto p WHERE p.porcBonificacon = :porcBonificacon"),
    @NamedQuery(name = "Propauto.findByDctoBonificacion", query = "SELECT p FROM Propauto p WHERE p.dctoBonificacion = :dctoBonificacion"),
    @NamedQuery(name = "Propauto.findByDctoBonifMe", query = "SELECT p FROM Propauto p WHERE p.dctoBonifMe = :dctoBonifMe"),
    @NamedQuery(name = "Propauto.findByFranquicia", query = "SELECT p FROM Propauto p WHERE p.franquicia = :franquicia"),
    @NamedQuery(name = "Propauto.findByFranquiciaMe", query = "SELECT p FROM Propauto p WHERE p.franquiciaMe = :franquiciaMe"),
    @NamedQuery(name = "Propauto.findBySos", query = "SELECT p FROM Propauto p WHERE p.sos = :sos"),
    @NamedQuery(name = "Propauto.findByPrimaSos", query = "SELECT p FROM Propauto p WHERE p.primaSos = :primaSos"),
    @NamedQuery(name = "Propauto.findByPrimaSosMe", query = "SELECT p FROM Propauto p WHERE p.primaSosMe = :primaSosMe"),
    @NamedQuery(name = "Propauto.findByCantOcupantes", query = "SELECT p FROM Propauto p WHERE p.cantOcupantes = :cantOcupantes"),
    @NamedQuery(name = "Propauto.findByCapMuerte", query = "SELECT p FROM Propauto p WHERE p.capMuerte = :capMuerte"),
    @NamedQuery(name = "Propauto.findByCapMuerteMe", query = "SELECT p FROM Propauto p WHERE p.capMuerteMe = :capMuerteMe"),
    @NamedQuery(name = "Propauto.findByPrimaMuerte", query = "SELECT p FROM Propauto p WHERE p.primaMuerte = :primaMuerte"),
    @NamedQuery(name = "Propauto.findByPrimaMuerteMe", query = "SELECT p FROM Propauto p WHERE p.primaMuerteMe = :primaMuerteMe"),
    @NamedQuery(name = "Propauto.findByCapIncapacidad", query = "SELECT p FROM Propauto p WHERE p.capIncapacidad = :capIncapacidad"),
    @NamedQuery(name = "Propauto.findByCapIncapacidadMe", query = "SELECT p FROM Propauto p WHERE p.capIncapacidadMe = :capIncapacidadMe"),
    @NamedQuery(name = "Propauto.findByCapGtosMedicos", query = "SELECT p FROM Propauto p WHERE p.capGtosMedicos = :capGtosMedicos"),
    @NamedQuery(name = "Propauto.findByCapGtosmedMe", query = "SELECT p FROM Propauto p WHERE p.capGtosmedMe = :capGtosmedMe"),
    @NamedQuery(name = "Propauto.findByPrimaGtosMedicos", query = "SELECT p FROM Propauto p WHERE p.primaGtosMedicos = :primaGtosMedicos"),
    @NamedQuery(name = "Propauto.findByPrimaGtosmedMe", query = "SELECT p FROM Propauto p WHERE p.primaGtosmedMe = :primaGtosmedMe"),
    @NamedQuery(name = "Propauto.findByCantAirbag", query = "SELECT p FROM Propauto p WHERE p.cantAirbag = :cantAirbag"),
    @NamedQuery(name = "Propauto.findByCapAirbag", query = "SELECT p FROM Propauto p WHERE p.capAirbag = :capAirbag"),
    @NamedQuery(name = "Propauto.findByCapAirbagMe", query = "SELECT p FROM Propauto p WHERE p.capAirbagMe = :capAirbagMe"),
    @NamedQuery(name = "Propauto.findByPrimaAirbag", query = "SELECT p FROM Propauto p WHERE p.primaAirbag = :primaAirbag"),
    @NamedQuery(name = "Propauto.findByPrimaAirbagMe", query = "SELECT p FROM Propauto p WHERE p.primaAirbagMe = :primaAirbagMe"),
    @NamedQuery(name = "Propauto.findBySumaseg", query = "SELECT p FROM Propauto p WHERE p.sumaseg = :sumaseg"),
    @NamedQuery(name = "Propauto.findBySumasegMe", query = "SELECT p FROM Propauto p WHERE p.sumasegMe = :sumasegMe"),
    @NamedQuery(name = "Propauto.findByPrima", query = "SELECT p FROM Propauto p WHERE p.prima = :prima"),
    @NamedQuery(name = "Propauto.findByPrimaMe", query = "SELECT p FROM Propauto p WHERE p.primaMe = :primaMe"),
    @NamedQuery(name = "Propauto.findByGtosAdmi", query = "SELECT p FROM Propauto p WHERE p.gtosAdmi = :gtosAdmi"),
    @NamedQuery(name = "Propauto.findByGtosAdmiMe", query = "SELECT p FROM Propauto p WHERE p.gtosAdmiMe = :gtosAdmiMe"),
    @NamedQuery(name = "Propauto.findByRpf", query = "SELECT p FROM Propauto p WHERE p.rpf = :rpf"),
    @NamedQuery(name = "Propauto.findByRpfMe", query = "SELECT p FROM Propauto p WHERE p.rpfMe = :rpfMe"),
    @NamedQuery(name = "Propauto.findByIva", query = "SELECT p FROM Propauto p WHERE p.iva = :iva"),
    @NamedQuery(name = "Propauto.findByIvaMe", query = "SELECT p FROM Propauto p WHERE p.ivaMe = :ivaMe"),
    @NamedQuery(name = "Propauto.findByOtros", query = "SELECT p FROM Propauto p WHERE p.otros = :otros"),
    @NamedQuery(name = "Propauto.findByOtrosMe", query = "SELECT p FROM Propauto p WHERE p.otrosMe = :otrosMe"),
    @NamedQuery(name = "Propauto.findByPremio", query = "SELECT p FROM Propauto p WHERE p.premio = :premio"),
    @NamedQuery(name = "Propauto.findByPremioMe", query = "SELECT p FROM Propauto p WHERE p.premioMe = :premioMe"),
    @NamedQuery(name = "Propauto.findByNAgte", query = "SELECT p FROM Propauto p WHERE p.nAgte = :nAgte"),
    @NamedQuery(name = "Propauto.findByPorcComag", query = "SELECT p FROM Propauto p WHERE p.porcComag = :porcComag"),
    @NamedQuery(name = "Propauto.findByImpComag", query = "SELECT p FROM Propauto p WHERE p.impComag = :impComag"),
    @NamedQuery(name = "Propauto.findByImpComagMe", query = "SELECT p FROM Propauto p WHERE p.impComagMe = :impComagMe"),
    @NamedQuery(name = "Propauto.findByNCobr", query = "SELECT p FROM Propauto p WHERE p.nCobr = :nCobr"),
    @NamedQuery(name = "Propauto.findByPorcComcb", query = "SELECT p FROM Propauto p WHERE p.porcComcb = :porcComcb"),
    @NamedQuery(name = "Propauto.findByTraccion", query = "SELECT p FROM Propauto p WHERE p.traccion = :traccion"),
    @NamedQuery(name = "Propauto.findByEje", query = "SELECT p FROM Propauto p WHERE p.eje = :eje"),
    @NamedQuery(name = "Propauto.findByVolanteCambiado", query = "SELECT p FROM Propauto p WHERE p.volanteCambiado = :volanteCambiado"),
    @NamedQuery(name = "Propauto.findByNroPuerta", query = "SELECT p FROM Propauto p WHERE p.nroPuerta = :nroPuerta"),
    @NamedQuery(name = "Propauto.findByTipoCombust", query = "SELECT p FROM Propauto p WHERE p.tipoCombust = :tipoCombust"),
    @NamedQuery(name = "Propauto.findByCodProcedencia", query = "SELECT p FROM Propauto p WHERE p.codProcedencia = :codProcedencia"),
    @NamedQuery(name = "Propauto.findByCodMoneyReaseguro", query = "SELECT p FROM Propauto p WHERE p.codMoneyReaseguro = :codMoneyReaseguro"),
    @NamedQuery(name = "Propauto.findByCapRetenido", query = "SELECT p FROM Propauto p WHERE p.capRetenido = :capRetenido"),
    @NamedQuery(name = "Propauto.findByCapRetenidoMe", query = "SELECT p FROM Propauto p WHERE p.capRetenidoMe = :capRetenidoMe"),
    @NamedQuery(name = "Propauto.findByPorcRetenido", query = "SELECT p FROM Propauto p WHERE p.porcRetenido = :porcRetenido"),
    @NamedQuery(name = "Propauto.findByPrimaRetenida", query = "SELECT p FROM Propauto p WHERE p.primaRetenida = :primaRetenida"),
    @NamedQuery(name = "Propauto.findByPrimaRetenidaMe", query = "SELECT p FROM Propauto p WHERE p.primaRetenidaMe = :primaRetenidaMe"),
    @NamedQuery(name = "Propauto.findByCapContrato", query = "SELECT p FROM Propauto p WHERE p.capContrato = :capContrato"),
    @NamedQuery(name = "Propauto.findByCapContratoMe", query = "SELECT p FROM Propauto p WHERE p.capContratoMe = :capContratoMe"),
    @NamedQuery(name = "Propauto.findByPorcContrato", query = "SELECT p FROM Propauto p WHERE p.porcContrato = :porcContrato"),
    @NamedQuery(name = "Propauto.findByPrimaContrato", query = "SELECT p FROM Propauto p WHERE p.primaContrato = :primaContrato"),
    @NamedQuery(name = "Propauto.findByPrimaContratoMe", query = "SELECT p FROM Propauto p WHERE p.primaContratoMe = :primaContratoMe"),
    @NamedQuery(name = "Propauto.findByCapFacultativo", query = "SELECT p FROM Propauto p WHERE p.capFacultativo = :capFacultativo"),
    @NamedQuery(name = "Propauto.findByCapFacultativoMe", query = "SELECT p FROM Propauto p WHERE p.capFacultativoMe = :capFacultativoMe"),
    @NamedQuery(name = "Propauto.findByPorcFacultativo", query = "SELECT p FROM Propauto p WHERE p.porcFacultativo = :porcFacultativo"),
    @NamedQuery(name = "Propauto.findByPrimaFacultativo", query = "SELECT p FROM Propauto p WHERE p.primaFacultativo = :primaFacultativo"),
    @NamedQuery(name = "Propauto.findByPrimaFacultativoMe", query = "SELECT p FROM Propauto p WHERE p.primaFacultativoMe = :primaFacultativoMe"),
    @NamedQuery(name = "Propauto.findByCodUsuario", query = "SELECT p FROM Propauto p WHERE p.codUsuario = :codUsuario"),
    @NamedQuery(name = "Propauto.findByCodEntidad", query = "SELECT p FROM Propauto p WHERE p.codEntidad = :codEntidad"),
    @NamedQuery(name = "Propauto.findByNroTarjeta", query = "SELECT p FROM Propauto p WHERE p.nroTarjeta = :nroTarjeta"),
    @NamedQuery(name = "Propauto.findByVtoTarjeta", query = "SELECT p FROM Propauto p WHERE p.vtoTarjeta = :vtoTarjeta"),
    @NamedQuery(name = "Propauto.findByPin", query = "SELECT p FROM Propauto p WHERE p.pin = :pin"),
    @NamedQuery(name = "Propauto.findByFechaCarga", query = "SELECT p FROM Propauto p WHERE p.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "Propauto.findByCodPrendario", query = "SELECT p FROM Propauto p WHERE p.codPrendario = :codPrendario"),
    @NamedQuery(name = "Propauto.findByTipoEndoso", query = "SELECT p FROM Propauto p WHERE p.tipoEndoso = :tipoEndoso"),
    @NamedQuery(name = "Propauto.findByAlarma", query = "SELECT p FROM Propauto p WHERE p.alarma = :alarma"),
    @NamedQuery(name = "Propauto.findByAirbag", query = "SELECT p FROM Propauto p WHERE p.airbag = :airbag"),
    @NamedQuery(name = "Propauto.findByPrimaIncapacidad", query = "SELECT p FROM Propauto p WHERE p.primaIncapacidad = :primaIncapacidad"),
    @NamedQuery(name = "Propauto.findByPrimaIncapacidadMe", query = "SELECT p FROM Propauto p WHERE p.primaIncapacidadMe = :primaIncapacidadMe"),
    @NamedQuery(name = "Propauto.findByTipoAdicional", query = "SELECT p FROM Propauto p WHERE p.tipoAdicional = :tipoAdicional"),
    @NamedQuery(name = "Propauto.findByInicial", query = "SELECT p FROM Propauto p WHERE p.inicial = :inicial"),
    @NamedQuery(name = "Propauto.findByNroCuotas", query = "SELECT p FROM Propauto p WHERE p.nroCuotas = :nroCuotas"),
    @NamedQuery(name = "Propauto.findByImpCuotas", query = "SELECT p FROM Propauto p WHERE p.impCuotas = :impCuotas"),
    @NamedQuery(name = "Propauto.findByInicialMe", query = "SELECT p FROM Propauto p WHERE p.inicialMe = :inicialMe"),
    @NamedQuery(name = "Propauto.findByImpCuotasMe", query = "SELECT p FROM Propauto p WHERE p.impCuotasMe = :impCuotasMe"),
    @NamedQuery(name = "Propauto.findByAcdteRobo", query = "SELECT p FROM Propauto p WHERE p.acdteRobo = :acdteRobo"),
    @NamedQuery(name = "Propauto.findByCapAcdteRobo", query = "SELECT p FROM Propauto p WHERE p.capAcdteRobo = :capAcdteRobo"),
    @NamedQuery(name = "Propauto.findByCapAcdteRoboMe", query = "SELECT p FROM Propauto p WHERE p.capAcdteRoboMe = :capAcdteRoboMe"),
    @NamedQuery(name = "Propauto.findByPrimaAcdteRobo", query = "SELECT p FROM Propauto p WHERE p.primaAcdteRobo = :primaAcdteRobo"),
    @NamedQuery(name = "Propauto.findByPrimaAcdteRoboMe", query = "SELECT p FROM Propauto p WHERE p.primaAcdteRoboMe = :primaAcdteRoboMe"),
    @NamedQuery(name = "Propauto.findByRoboParcial", query = "SELECT p FROM Propauto p WHERE p.roboParcial = :roboParcial"),
    @NamedQuery(name = "Propauto.findByCapRp", query = "SELECT p FROM Propauto p WHERE p.capRp = :capRp"),
    @NamedQuery(name = "Propauto.findByCapRpMe", query = "SELECT p FROM Propauto p WHERE p.capRpMe = :capRpMe"),
    @NamedQuery(name = "Propauto.findByPrimaRp", query = "SELECT p FROM Propauto p WHERE p.primaRp = :primaRp"),
    @NamedQuery(name = "Propauto.findByPrimaRpMe", query = "SELECT p FROM Propauto p WHERE p.primaRpMe = :primaRpMe"),
    @NamedQuery(name = "Propauto.findByRpRt", query = "SELECT p FROM Propauto p WHERE p.rpRt = :rpRt"),
    @NamedQuery(name = "Propauto.findByCapRpRt", query = "SELECT p FROM Propauto p WHERE p.capRpRt = :capRpRt"),
    @NamedQuery(name = "Propauto.findByCapRpRtMe", query = "SELECT p FROM Propauto p WHERE p.capRpRtMe = :capRpRtMe"),
    @NamedQuery(name = "Propauto.findByPrimaRpRt", query = "SELECT p FROM Propauto p WHERE p.primaRpRt = :primaRpRt"),
    @NamedQuery(name = "Propauto.findByPrimaRpRtMe", query = "SELECT p FROM Propauto p WHERE p.primaRpRtMe = :primaRpRtMe"),
    @NamedQuery(name = "Propauto.findByMarcmode", query = "SELECT p FROM Propauto p WHERE p.marcmode = :marcmode"),
    @NamedQuery(name = "Propauto.findByPolnro", query = "SELECT p FROM Propauto p WHERE p.polnro = :polnro"),
    @NamedQuery(name = "Propauto.findByCarta", query = "SELECT p FROM Propauto p WHERE p.carta = :carta"),
    @NamedQuery(name = "Propauto.findByNroCarta", query = "SELECT p FROM Propauto p WHERE p.nroCarta = :nroCarta"),
    @NamedQuery(name = "Propauto.findByDiasCarta", query = "SELECT p FROM Propauto p WHERE p.diasCarta = :diasCarta"),
    @NamedQuery(name = "Propauto.findByPrimaCarta", query = "SELECT p FROM Propauto p WHERE p.primaCarta = :primaCarta"),
    @NamedQuery(name = "Propauto.findByPrimaCartaMe", query = "SELECT p FROM Propauto p WHERE p.primaCartaMe = :primaCartaMe"),
    @NamedQuery(name = "Propauto.findBySecc", query = "SELECT p FROM Propauto p WHERE p.secc = :secc"),
    @NamedQuery(name = "Propauto.findByDestinadoA", query = "SELECT p FROM Propauto p WHERE p.destinadoA = :destinadoA"),
    @NamedQuery(name = "Propauto.findByNroFlota", query = "SELECT p FROM Propauto p WHERE p.nroFlota = :nroFlota"),
    @NamedQuery(name = "Propauto.findByEstado", query = "SELECT p FROM Propauto p WHERE p.estado = :estado"),
    @NamedQuery(name = "Propauto.findByFechaCargaComercial", query = "SELECT p FROM Propauto p WHERE p.fechaCargaComercial = :fechaCargaComercial"),
    @NamedQuery(name = "Propauto.findByFechaEntregaComercial", query = "SELECT p FROM Propauto p WHERE p.fechaEntregaComercial = :fechaEntregaComercial"),
    @NamedQuery(name = "Propauto.findByCodUsuarioAprueba", query = "SELECT p FROM Propauto p WHERE p.codUsuarioAprueba = :codUsuarioAprueba"),
    @NamedQuery(name = "Propauto.findByFormaParte", query = "SELECT p FROM Propauto p WHERE p.formaParte = :formaParte"),
    @NamedQuery(name = "Propauto.findByCentro", query = "SELECT p FROM Propauto p WHERE p.centro = :centro"),
    @NamedQuery(name = "Propauto.findByItem", query = "SELECT p FROM Propauto p WHERE p.item = :item"),
    @NamedQuery(name = "Propauto.findByAnexo", query = "SELECT p FROM Propauto p WHERE p.anexo = :anexo"),
    @NamedQuery(name = "Propauto.findByCodUsuarioMod", query = "SELECT p FROM Propauto p WHERE p.codUsuarioMod = :codUsuarioMod"),
    @NamedQuery(name = "Propauto.findByFechaMod", query = "SELECT p FROM Propauto p WHERE p.fechaMod = :fechaMod"),
    @NamedQuery(name = "Propauto.findByCodFormaPago", query = "SELECT p FROM Propauto p WHERE p.codFormaPago = :codFormaPago"),
    @NamedQuery(name = "Propauto.findByPorLicitacion", query = "SELECT p FROM Propauto p WHERE p.porLicitacion = :porLicitacion"),
    @NamedQuery(name = "Propauto.findByTipoFlota", query = "SELECT p FROM Propauto p WHERE p.tipoFlota = :tipoFlota"),
    @NamedQuery(name = "Propauto.findByCantItems", query = "SELECT p FROM Propauto p WHERE p.cantItems = :cantItems"),
    @NamedQuery(name = "Propauto.findByNroLoteCom", query = "SELECT p FROM Propauto p WHERE p.nroLoteCom = :nroLoteCom"),
    @NamedQuery(name = "Propauto.findByUsuarioEntregaCom", query = "SELECT p FROM Propauto p WHERE p.usuarioEntregaCom = :usuarioEntregaCom"),
    @NamedQuery(name = "Propauto.findByPrimerVto", query = "SELECT p FROM Propauto p WHERE p.primerVto = :primerVto"),
    @NamedQuery(name = "Propauto.findByExtraPrima", query = "SELECT p FROM Propauto p WHERE p.extraPrima = :extraPrima"),
    @NamedQuery(name = "Propauto.findByExtraPrimaMe", query = "SELECT p FROM Propauto p WHERE p.extraPrimaMe = :extraPrimaMe"),
    @NamedQuery(name = "Propauto.findByBAdmi", query = "SELECT p FROM Propauto p WHERE p.bAdmi = :bAdmi"),
    @NamedQuery(name = "Propauto.findByBRpf", query = "SELECT p FROM Propauto p WHERE p.bRpf = :bRpf"),
    @NamedQuery(name = "Propauto.findByBIva", query = "SELECT p FROM Propauto p WHERE p.bIva = :bIva"),
    @NamedQuery(name = "Propauto.findByUsuarioComercial", query = "SELECT p FROM Propauto p WHERE p.usuarioComercial = :usuarioComercial"),
    @NamedQuery(name = "Propauto.findByPctFranqAirbag", query = "SELECT p FROM Propauto p WHERE p.pctFranqAirbag = :pctFranqAirbag"),
    @NamedQuery(name = "Propauto.findByCapAutoRadio", query = "SELECT p FROM Propauto p WHERE p.capAutoRadio = :capAutoRadio"),
    @NamedQuery(name = "Propauto.findByCapAutoRadioMe", query = "SELECT p FROM Propauto p WHERE p.capAutoRadioMe = :capAutoRadioMe"),
    @NamedQuery(name = "Propauto.findByPctCapRpRt", query = "SELECT p FROM Propauto p WHERE p.pctCapRpRt = :pctCapRpRt"),
    @NamedQuery(name = "Propauto.findByPctAcdteRobo", query = "SELECT p FROM Propauto p WHERE p.pctAcdteRobo = :pctAcdteRobo"),
    @NamedQuery(name = "Propauto.findByUsuarioAuditoria", query = "SELECT p FROM Propauto p WHERE p.usuarioAuditoria = :usuarioAuditoria"),
    @NamedQuery(name = "Propauto.findByExclIncendio", query = "SELECT p FROM Propauto p WHERE p.exclIncendio = :exclIncendio"),
    @NamedQuery(name = "Propauto.findByExclRobo", query = "SELECT p FROM Propauto p WHERE p.exclRobo = :exclRobo"),
    @NamedQuery(name = "Propauto.findByExclDanos", query = "SELECT p FROM Propauto p WHERE p.exclDanos = :exclDanos"),
    @NamedQuery(name = "Propauto.findByExclRc", query = "SELECT p FROM Propauto p WHERE p.exclRc = :exclRc"),
    @NamedQuery(name = "Propauto.findByCodPlan", query = "SELECT p FROM Propauto p WHERE p.codPlan = :codPlan"),
    @NamedQuery(name = "Propauto.findByPctInicial", query = "SELECT p FROM Propauto p WHERE p.pctInicial = :pctInicial"),
    @NamedQuery(name = "Propauto.findByCodProvAlarma", query = "SELECT p FROM Propauto p WHERE p.codProvAlarma = :codProvAlarma"),
    @NamedQuery(name = "Propauto.findByNroOrdenAlarma", query = "SELECT p FROM Propauto p WHERE p.nroOrdenAlarma = :nroOrdenAlarma"),
    @NamedQuery(name = "Propauto.findByPctRobo", query = "SELECT p FROM Propauto p WHERE p.pctRobo = :pctRobo"),
    @NamedQuery(name = "Propauto.findByCategoria", query = "SELECT p FROM Propauto p WHERE p.categoria = :categoria"),
    @NamedQuery(name = "Propauto.findByDanosInspeccion", query = "SELECT p FROM Propauto p WHERE p.danosInspeccion = :danosInspeccion"),
    @NamedQuery(name = "Propauto.findByPorcDctoFlota", query = "SELECT p FROM Propauto p WHERE p.porcDctoFlota = :porcDctoFlota"),
    @NamedQuery(name = "Propauto.findByMontoDctoFlota", query = "SELECT p FROM Propauto p WHERE p.montoDctoFlota = :montoDctoFlota"),
    @NamedQuery(name = "Propauto.findByMontoDctoFlotaMe", query = "SELECT p FROM Propauto p WHERE p.montoDctoFlotaMe = :montoDctoFlotaMe"),
    @NamedQuery(name = "Propauto.findByCapitalCualquierCondMe", query = "SELECT p FROM Propauto p WHERE p.capitalCualquierCondMe = :capitalCualquierCondMe"),
    @NamedQuery(name = "Propauto.findByCapitalCualquierCond", query = "SELECT p FROM Propauto p WHERE p.capitalCualquierCond = :capitalCualquierCond"),
    @NamedQuery(name = "Propauto.findByIncluido", query = "SELECT p FROM Propauto p WHERE p.incluido = :incluido"),
    @NamedQuery(name = "Propauto.findByAccesorioDeFabrica", query = "SELECT p FROM Propauto p WHERE p.accesorioDeFabrica = :accesorioDeFabrica"),
    @NamedQuery(name = "Propauto.findByCapMercaderia", query = "SELECT p FROM Propauto p WHERE p.capMercaderia = :capMercaderia"),
    @NamedQuery(name = "Propauto.findByCapMercaderiaMe", query = "SELECT p FROM Propauto p WHERE p.capMercaderiaMe = :capMercaderiaMe"),
    @NamedQuery(name = "Propauto.findByPrimaMercaderia", query = "SELECT p FROM Propauto p WHERE p.primaMercaderia = :primaMercaderia"),
    @NamedQuery(name = "Propauto.findByPrimaMercaderiaMe", query = "SELECT p FROM Propauto p WHERE p.primaMercaderiaMe = :primaMercaderiaMe"),
    @NamedQuery(name = "Propauto.findByNroEntrada", query = "SELECT p FROM Propauto p WHERE p.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "Propauto.findByPctComisOrganiza", query = "SELECT p FROM Propauto p WHERE p.pctComisOrganiza = :pctComisOrganiza"),
    @NamedQuery(name = "Propauto.findByTipoPintura", query = "SELECT p FROM Propauto p WHERE p.tipoPintura = :tipoPintura"),
    @NamedQuery(name = "Propauto.findByCilindradas", query = "SELECT p FROM Propauto p WHERE p.cilindradas = :cilindradas"),
    @NamedQuery(name = "Propauto.findByTipoTransmision", query = "SELECT p FROM Propauto p WHERE p.tipoTransmision = :tipoTransmision"),
    @NamedQuery(name = "Propauto.findByNroCoche", query = "SELECT p FROM Propauto p WHERE p.nroCoche = :nroCoche"),
    @NamedQuery(name = "Propauto.findByCapAntena", query = "SELECT p FROM Propauto p WHERE p.capAntena = :capAntena"),
    @NamedQuery(name = "Propauto.findByCapAntenaMe", query = "SELECT p FROM Propauto p WHERE p.capAntenaMe = :capAntenaMe"),
    @NamedQuery(name = "Propauto.findByCapRuedaAuxilio", query = "SELECT p FROM Propauto p WHERE p.capRuedaAuxilio = :capRuedaAuxilio"),
    @NamedQuery(name = "Propauto.findByCapRuedaAuxilioMe", query = "SELECT p FROM Propauto p WHERE p.capRuedaAuxilioMe = :capRuedaAuxilioMe"),
    @NamedQuery(name = "Propauto.findByCapFaros", query = "SELECT p FROM Propauto p WHERE p.capFaros = :capFaros"),
    @NamedQuery(name = "Propauto.findByCapFarosMe", query = "SELECT p FROM Propauto p WHERE p.capFarosMe = :capFarosMe"),
    @NamedQuery(name = "Propauto.findByCapTasas", query = "SELECT p FROM Propauto p WHERE p.capTasas = :capTasas"),
    @NamedQuery(name = "Propauto.findByCapTasasMe", query = "SELECT p FROM Propauto p WHERE p.capTasasMe = :capTasasMe"),
    @NamedQuery(name = "Propauto.findByAmbulancia", query = "SELECT p FROM Propauto p WHERE p.ambulancia = :ambulancia"),
    @NamedQuery(name = "Propauto.findByCerrajeria", query = "SELECT p FROM Propauto p WHERE p.cerrajeria = :cerrajeria"),
    @NamedQuery(name = "Propauto.findByAlarmaCapitalMinimo", query = "SELECT p FROM Propauto p WHERE p.alarmaCapitalMinimo = :alarmaCapitalMinimo"),
    @NamedQuery(name = "Propauto.findByAsistenciaJuridica", query = "SELECT p FROM Propauto p WHERE p.asistenciaJuridica = :asistenciaJuridica"),
    @NamedQuery(name = "Propauto.findByNombreAsistenciaJuridica", query = "SELECT p FROM Propauto p WHERE p.nombreAsistenciaJuridica = :nombreAsistenciaJuridica"),
    @NamedQuery(name = "Propauto.findByGranizo", query = "SELECT p FROM Propauto p WHERE p.granizo = :granizo"),
    @NamedQuery(name = "Propauto.findByAccesoriosAccInc", query = "SELECT p FROM Propauto p WHERE p.accesoriosAccInc = :accesoriosAccInc"),
    @NamedQuery(name = "Propauto.findByCobExtDanos", query = "SELECT p FROM Propauto p WHERE p.cobExtDanos = :cobExtDanos"),
    @NamedQuery(name = "Propauto.findByCobExtRobo", query = "SELECT p FROM Propauto p WHERE p.cobExtRobo = :cobExtRobo"),
    @NamedQuery(name = "Propauto.findByNroRecibo", query = "SELECT p FROM Propauto p WHERE p.nroRecibo = :nroRecibo"),
    @NamedQuery(name = "Propauto.findByCostoReinstalacion", query = "SELECT p FROM Propauto p WHERE p.costoReinstalacion = :costoReinstalacion"),
    @NamedQuery(name = "Propauto.findByDmRt", query = "SELECT p FROM Propauto p WHERE p.dmRt = :dmRt"),
    @NamedQuery(name = "Propauto.findByPctGranizo", query = "SELECT p FROM Propauto p WHERE p.pctGranizo = :pctGranizo"),
    @NamedQuery(name = "Propauto.findByPctInc", query = "SELECT p FROM Propauto p WHERE p.pctInc = :pctInc"),
    @NamedQuery(name = "Propauto.findByPctAcc", query = "SELECT p FROM Propauto p WHERE p.pctAcc = :pctAcc"),
    @NamedQuery(name = "Propauto.findByPorcTumultoPop", query = "SELECT p FROM Propauto p WHERE p.porcTumultoPop = :porcTumultoPop"),
    @NamedQuery(name = "Propauto.findByTextoEspecial", query = "SELECT p FROM Propauto p WHERE p.textoEspecial = :textoEspecial"),
    @NamedQuery(name = "Propauto.findByTipoOrganizador", query = "SELECT p FROM Propauto p WHERE p.tipoOrganizador = :tipoOrganizador"),
    @NamedQuery(name = "Propauto.findByNroCotizacion", query = "SELECT p FROM Propauto p WHERE p.nroCotizacion = :nroCotizacion"),
    @NamedQuery(name = "Propauto.findByTipoImportacion", query = "SELECT p FROM Propauto p WHERE p.tipoImportacion = :tipoImportacion"),
    @NamedQuery(name = "Propauto.findByClaseAsegManual", query = "SELECT p FROM Propauto p WHERE p.claseAsegManual = :claseAsegManual"),
    @NamedQuery(name = "Propauto.findByClaseAsegSistema", query = "SELECT p FROM Propauto p WHERE p.claseAsegSistema = :claseAsegSistema"),
    @NamedQuery(name = "Propauto.findByClasePolizaManual", query = "SELECT p FROM Propauto p WHERE p.clasePolizaManual = :clasePolizaManual"),
    @NamedQuery(name = "Propauto.findByClasePolizaSistema", query = "SELECT p FROM Propauto p WHERE p.clasePolizaSistema = :clasePolizaSistema"),
    @NamedQuery(name = "Propauto.findByDeclaracion", query = "SELECT p FROM Propauto p WHERE p.declaracion = :declaracion"),
    @NamedQuery(name = "Propauto.findByContarjetalr", query = "SELECT p FROM Propauto p WHERE p.contarjetalr = :contarjetalr")})
public class Propauto implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PropautoPK propautoPK;
    @Basic(optional = false)
    @Column(name = "COD_AGCIA", nullable = false)
    private short codAgcia;
    @Basic(optional = false)
    @Column(name = "FECHA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "TIPO_SEGURO", nullable = false)
    private short tipoSeguro;
    @Basic(optional = false)
    @Column(name = "TIPO_OPERACION", nullable = false)
    private short tipoOperacion;
    @Column(name = "POLANT")
    private Integer polant;
    @Basic(optional = false)
    @Column(name = "VIGDES", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date vigdes;
    @Basic(optional = false)
    @Column(name = "VIGHAS", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date vighas;
    @Column(name = "CANT_DIAS")
    private Integer cantDias;
    @Basic(optional = false)
    @Column(name = "COD_MONEY", nullable = false)
    private short codMoney;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "T_CAMBIO", nullable = false, precision = 15, scale = 10)
    private BigDecimal tCambio;
    @Column(name = "NRO_INSPECCION")
    private Integer nroInspeccion;
    @Column(name = "COD_TIPO")
    private Short codTipo;
    @Column(name = "COD_MARCA")
    private Short codMarca;
    @Column(name = "COD_MODELO")
    private Short codModelo;
    @Column(name = "ANO")
    private Short ano;
    @Column(name = "NRO_MOTOR", length = 20)
    private String nroMotor;
    @Column(name = "NRO_CHASIS", length = 30)
    private String nroChasis;
    @Column(name = "COD_LOCALIDAD")
    private Short codLocalidad;
    @Column(name = "NRO_CHAPA", length = 15)
    private String nroChapa;
    @Basic(optional = false)
    @Column(name = "CASCO", nullable = false)
    private long casco;
    @Basic(optional = false)
    @Column(name = "CASCO_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal cascoMe;
    @Basic(optional = false)
    @Column(name = "PRIMA_CASCO", nullable = false)
    private long primaCasco;
    @Basic(optional = false)
    @Column(name = "PRIMA_CASCO_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaCascoMe;
    @Basic(optional = false)
    @Column(name = "CAPITAL_INCENDIO", nullable = false)
    private long capitalIncendio;
    @Basic(optional = false)
    @Column(name = "CPTAL_INCENDIO_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal cptalIncendioMe;
    @Basic(optional = false)
    @Column(name = "CAPITAL_ACCIDENTE", nullable = false)
    private long capitalAccidente;
    @Basic(optional = false)
    @Column(name = "CPTAL_ACCIDENTE_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal cptalAccidenteMe;
    @Basic(optional = false)
    @Column(name = "CAPITAL_ROBO", nullable = false)
    private long capitalRobo;
    @Basic(optional = false)
    @Column(name = "CPTAL_ROBO_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal cptalRoboMe;
    @Basic(optional = false)
    @Column(name = "CANT_RC", nullable = false)
    private short cantRc;
    @Basic(optional = false)
    @Column(name = "PRIMA_RC", nullable = false)
    private long primaRc;
    @Basic(optional = false)
    @Column(name = "PRIMA_RC_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaRcMe;
    @Basic(optional = false)
    @Column(name = "CAP_RC1", nullable = false)
    private long capRc1;
    @Basic(optional = false)
    @Column(name = "CAP_RC1_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal capRc1Me;
    @Basic(optional = false)
    @Column(name = "CAP_RC2", nullable = false)
    private long capRc2;
    @Basic(optional = false)
    @Column(name = "CAP_RC2_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal capRc2Me;
    @Basic(optional = false)
    @Column(name = "CAP_RC3", nullable = false)
    private long capRc3;
    @Basic(optional = false)
    @Column(name = "CAP_RC3_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal capRc3Me;
    @Basic(optional = false)
    @Column(name = "CAP_ACCESORIOS", nullable = false)
    private long capAccesorios;
    @Basic(optional = false)
    @Column(name = "CPTAL_ACCESORIOS_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal cptalAccesoriosMe;
    @Basic(optional = false)
    @Column(name = "PRIMA_OTROS", nullable = false)
    private long primaOtros;
    @Basic(optional = false)
    @Column(name = "PRIMA_OTROS_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaOtrosMe;
    @Basic(optional = false)
    @Column(name = "ROBO_VIA_PUBLICA", nullable = false)
    private short roboViaPublica;
    @Basic(optional = false)
    @Column(name = "PRIMA_ROBO_VIA_PUBLICA", nullable = false)
    private long primaRoboViaPublica;
    @Basic(optional = false)
    @Column(name = "PRIMA_ROBO_VIA_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaRoboViaMe;
    @Basic(optional = false)
    @Column(name = "TUMULTO_POPULAR", nullable = false)
    private short tumultoPopular;
    @Basic(optional = false)
    @Column(name = "PRIMA_TUMULTO_POPULAR", nullable = false)
    private long primaTumultoPopular;
    @Basic(optional = false)
    @Column(name = "PRIMA_TUMULTO_POP_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaTumultoPopMe;
    @Basic(optional = false)
    @Column(name = "DIAS_COBERTURA_EXTERIOR", nullable = false)
    private short diasCoberturaExterior;
    @Basic(optional = false)
    @Column(name = "PRIMA_COBERTURA_EXTERIOR", nullable = false)
    private long primaCoberturaExterior;
    @Basic(optional = false)
    @Column(name = "PRIMA_COB_EXT_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaCobExtMe;
    @Basic(optional = false)
    @Column(name = "PRIMA_ADICIONAL", nullable = false)
    private long primaAdicional;
    @Basic(optional = false)
    @Column(name = "PRIMA_ADICIONAL_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaAdicionalMe;
    @Column(name = "DESCRIPCION_ADICIONAL", length = 60)
    private String descripcionAdicional;
    @Basic(optional = false)
    @Column(name = "PORC_BONIFICACON", nullable = false, precision = 5, scale = 2)
    private BigDecimal porcBonificacon;
    @Basic(optional = false)
    @Column(name = "DCTO_BONIFICACION", nullable = false)
    private long dctoBonificacion;
    @Basic(optional = false)
    @Column(name = "DCTO_BONIF_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal dctoBonifMe;
    @Basic(optional = false)
    @Column(name = "FRANQUICIA", nullable = false)
    private long franquicia;
    @Basic(optional = false)
    @Column(name = "FRANQUICIA_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal franquiciaMe;
    @Column(name = "SOS")
    private Short sos;
    @Basic(optional = false)
    @Column(name = "PRIMA_SOS", nullable = false)
    private long primaSos;
    @Basic(optional = false)
    @Column(name = "PRIMA_SOS_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaSosMe;
    @Basic(optional = false)
    @Column(name = "CANT_OCUPANTES", nullable = false)
    private short cantOcupantes;
    @Basic(optional = false)
    @Column(name = "CAP_MUERTE", nullable = false)
    private long capMuerte;
    @Basic(optional = false)
    @Column(name = "CAP_MUERTE_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal capMuerteMe;
    @Basic(optional = false)
    @Column(name = "PRIMA_MUERTE", nullable = false)
    private long primaMuerte;
    @Basic(optional = false)
    @Column(name = "PRIMA_MUERTE_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaMuerteMe;
    @Basic(optional = false)
    @Column(name = "CAP_INCAPACIDAD", nullable = false)
    private long capIncapacidad;
    @Basic(optional = false)
    @Column(name = "CAP_INCAPACIDAD_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal capIncapacidadMe;
    @Basic(optional = false)
    @Column(name = "CAP_GTOS_MEDICOS", nullable = false)
    private long capGtosMedicos;
    @Basic(optional = false)
    @Column(name = "CAP_GTOSMED_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal capGtosmedMe;
    @Basic(optional = false)
    @Column(name = "PRIMA_GTOS_MEDICOS", nullable = false)
    private long primaGtosMedicos;
    @Basic(optional = false)
    @Column(name = "PRIMA_GTOSMED_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaGtosmedMe;
    @Basic(optional = false)
    @Column(name = "CANT_AIRBAG", nullable = false)
    private short cantAirbag;
    @Basic(optional = false)
    @Column(name = "CAP_AIRBAG", nullable = false)
    private long capAirbag;
    @Basic(optional = false)
    @Column(name = "CAP_AIRBAG_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal capAirbagMe;
    @Basic(optional = false)
    @Column(name = "PRIMA_AIRBAG", nullable = false)
    private long primaAirbag;
    @Basic(optional = false)
    @Column(name = "PRIMA_AIRBAG_ME", nullable = false, precision = 10, scale = 2)
    private BigDecimal primaAirbagMe;
    @Basic(optional = false)
    @Column(name = "SUMASEG", nullable = false)
    private long sumaseg;
    @Basic(optional = false)
    @Column(name = "SUMASEG_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal sumasegMe;
    @Basic(optional = false)
    @Column(name = "PRIMA", nullable = false)
    private long prima;
    @Basic(optional = false)
    @Column(name = "PRIMA_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaMe;
    @Basic(optional = false)
    @Column(name = "GTOS_ADMI", nullable = false)
    private long gtosAdmi;
    @Basic(optional = false)
    @Column(name = "GTOS_ADMI_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal gtosAdmiMe;
    @Basic(optional = false)
    @Column(name = "RPF", nullable = false)
    private long rpf;
    @Basic(optional = false)
    @Column(name = "RPF_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal rpfMe;
    @Basic(optional = false)
    @Column(name = "IVA", nullable = false)
    private long iva;
    @Basic(optional = false)
    @Column(name = "IVA_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal ivaMe;
    @Basic(optional = false)
    @Column(name = "OTROS", nullable = false)
    private long otros;
    @Basic(optional = false)
    @Column(name = "OTROS_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal otrosMe;
    @Basic(optional = false)
    @Column(name = "PREMIO", nullable = false)
    private long premio;
    @Basic(optional = false)
    @Column(name = "PREMIO_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal premioMe;
    @Basic(optional = false)
    @Column(name = "N_AGTE", nullable = false)
    private int nAgte;
    @Basic(optional = false)
    @Column(name = "PORC_COMAG", nullable = false, precision = 5, scale = 2)
    private BigDecimal porcComag;
    @Basic(optional = false)
    @Column(name = "IMP_COMAG", nullable = false)
    private long impComag;
    @Basic(optional = false)
    @Column(name = "IMP_COMAG_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal impComagMe;
    @Column(name = "N_COBR")
    private Integer nCobr;
    @Column(name = "PORC_COMCB", precision = 5, scale = 2)
    private BigDecimal porcComcb;
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
    @Column(name = "COD_PROCEDENCIA")
    private Short codProcedencia;
    @Basic(optional = false)
    @Column(name = "COD_MONEY_REASEGURO", nullable = false)
    private short codMoneyReaseguro;
    @Basic(optional = false)
    @Column(name = "CAP_RETENIDO", nullable = false)
    private long capRetenido;
    @Basic(optional = false)
    @Column(name = "CAP_RETENIDO_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal capRetenidoMe;
    @Basic(optional = false)
    @Column(name = "PORC_RETENIDO", nullable = false, precision = 10, scale = 7)
    private BigDecimal porcRetenido;
    @Basic(optional = false)
    @Column(name = "PRIMA_RETENIDA", nullable = false)
    private long primaRetenida;
    @Basic(optional = false)
    @Column(name = "PRIMA_RETENIDA_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaRetenidaMe;
    @Basic(optional = false)
    @Column(name = "CAP_CONTRATO", nullable = false)
    private long capContrato;
    @Basic(optional = false)
    @Column(name = "CAP_CONTRATO_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal capContratoMe;
    @Basic(optional = false)
    @Column(name = "PORC_CONTRATO", nullable = false, precision = 10, scale = 7)
    private BigDecimal porcContrato;
    @Basic(optional = false)
    @Column(name = "PRIMA_CONTRATO", nullable = false)
    private long primaContrato;
    @Basic(optional = false)
    @Column(name = "PRIMA_CONTRATO_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaContratoMe;
    @Basic(optional = false)
    @Column(name = "CAP_FACULTATIVO", nullable = false)
    private long capFacultativo;
    @Basic(optional = false)
    @Column(name = "CAP_FACULTATIVO_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal capFacultativoMe;
    @Basic(optional = false)
    @Column(name = "PORC_FACULTATIVO", nullable = false, precision = 10, scale = 7)
    private BigDecimal porcFacultativo;
    @Basic(optional = false)
    @Column(name = "PRIMA_FACULTATIVO", nullable = false)
    private long primaFacultativo;
    @Basic(optional = false)
    @Column(name = "PRIMA_FACULTATIVO_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaFacultativoMe;
    @Column(name = "COD_USUARIO")
    private Short codUsuario;
    @Column(name = "COD_ENTIDAD")
    private Short codEntidad;
    @Column(name = "NRO_TARJETA", length = 30)
    private String nroTarjeta;
    @Column(name = "VTO_TARJETA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vtoTarjeta;
    @Column(name = "PIN", length = 20)
    private String pin;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Column(name = "COD_PRENDARIO")
    private Short codPrendario;
    @Column(name = "TIPO_ENDOSO")
    private Short tipoEndoso;
    @Column(name = "ALARMA")
    private Short alarma;
    @Column(name = "AIRBAG")
    private Short airbag;
    @Basic(optional = false)
    @Column(name = "PRIMA_INCAPACIDAD", nullable = false)
    private long primaIncapacidad;
    @Basic(optional = false)
    @Column(name = "PRIMA_INCAPACIDAD_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaIncapacidadMe;
    @Basic(optional = false)
    @Column(name = "TIPO_ADICIONAL", nullable = false)
    private short tipoAdicional;
    @Basic(optional = false)
    @Column(name = "INICIAL", nullable = false)
    private long inicial;
    @Basic(optional = false)
    @Column(name = "NRO_CUOTAS", nullable = false)
    private short nroCuotas;
    @Basic(optional = false)
    @Column(name = "IMP_CUOTAS", nullable = false)
    private long impCuotas;
    @Basic(optional = false)
    @Column(name = "INICIAL_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal inicialMe;
    @Basic(optional = false)
    @Column(name = "IMP_CUOTAS_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal impCuotasMe;
    @Basic(optional = false)
    @Column(name = "ACDTE_ROBO", nullable = false)
    private short acdteRobo;
    @Basic(optional = false)
    @Column(name = "CAP_ACDTE_ROBO", nullable = false)
    private long capAcdteRobo;
    @Basic(optional = false)
    @Column(name = "CAP_ACDTE_ROBO_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal capAcdteRoboMe;
    @Basic(optional = false)
    @Column(name = "PRIMA_ACDTE_ROBO", nullable = false)
    private long primaAcdteRobo;
    @Basic(optional = false)
    @Column(name = "PRIMA_ACDTE_ROBO_ME", nullable = false, precision = 10, scale = 2)
    private BigDecimal primaAcdteRoboMe;
    @Basic(optional = false)
    @Column(name = "ROBO_PARCIAL", nullable = false)
    private short roboParcial;
    @Basic(optional = false)
    @Column(name = "CAP_RP", nullable = false)
    private long capRp;
    @Basic(optional = false)
    @Column(name = "CAP_RP_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal capRpMe;
    @Basic(optional = false)
    @Column(name = "PRIMA_RP", nullable = false)
    private long primaRp;
    @Basic(optional = false)
    @Column(name = "PRIMA_RP_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaRpMe;
    @Basic(optional = false)
    @Column(name = "RP_RT", nullable = false)
    private short rpRt;
    @Basic(optional = false)
    @Column(name = "CAP_RP_RT", nullable = false)
    private long capRpRt;
    @Basic(optional = false)
    @Column(name = "CAP_RP_RT_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal capRpRtMe;
    @Basic(optional = false)
    @Column(name = "PRIMA_RP_RT", nullable = false)
    private long primaRpRt;
    @Basic(optional = false)
    @Column(name = "PRIMA_RP_RT_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaRpRtMe;
    @Basic(optional = false)
    @Column(name = "MARCMODE", nullable = false, length = 100)
    private String marcmode;
    @Column(name = "POLNRO")
    private Integer polnro;
    @Basic(optional = false)
    @Column(name = "CARTA", nullable = false)
    private short carta;
    @Basic(optional = false)
    @Column(name = "NRO_CARTA", nullable = false)
    private int nroCarta;
    @Basic(optional = false)
    @Column(name = "DIAS_CARTA", nullable = false)
    private short diasCarta;
    @Basic(optional = false)
    @Column(name = "PRIMA_CARTA", nullable = false)
    private long primaCarta;
    @Basic(optional = false)
    @Column(name = "PRIMA_CARTA_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaCartaMe;
    @Basic(optional = false)
    @Column(name = "SECC", nullable = false)
    private short secc;
    @Column(name = "DESTINADO_A")
    private Short destinadoA;
    @Basic(optional = false)
    @Column(name = "NRO_FLOTA", nullable = false)
    private int nroFlota;
    @Basic(optional = false)
    @Column(name = "ESTADO", nullable = false)
    private short estado;
    @Column(name = "FECHA_CARGA_COMERCIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCargaComercial;
    @Column(name = "FECHA_ENTREGA_COMERCIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntregaComercial;
    @Column(name = "COD_USUARIO_APRUEBA")
    private Short codUsuarioAprueba;
    @Column(name = "FORMA_PARTE", length = 350)
    private String formaParte;
    @Basic(optional = false)
    @Column(name = "CENTRO", nullable = false)
    private short centro;
    @Basic(optional = false)
    @Column(name = "ITEM", nullable = false)
    private int item;
    @Basic(optional = false)
    @Column(name = "ANEXO", nullable = false)
    private short anexo;
    @Basic(optional = false)
    @Column(name = "COD_USUARIO_MOD", nullable = false)
    private short codUsuarioMod;
    @Basic(optional = false)
    @Column(name = "FECHA_MOD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaMod;
    @Column(name = "COD_FORMA_PAGO")
    private Short codFormaPago;
    @Basic(optional = false)
    @Column(name = "POR_LICITACION", nullable = false)
    private short porLicitacion;
    @Basic(optional = false)
    @Column(name = "TIPO_FLOTA", nullable = false)
    private short tipoFlota;
    @Basic(optional = false)
    @Column(name = "CANT_ITEMS", nullable = false)
    private int cantItems;
    @Column(name = "NRO_LOTE_COM")
    private Short nroLoteCom;
    @Column(name = "USUARIO_ENTREGA_COM")
    private Short usuarioEntregaCom;
    @Column(name = "PRIMER_VTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date primerVto;
    @Column(name = "EXTRA_PRIMA")
    private Long extraPrima;
    @Column(name = "EXTRA_PRIMA_ME", precision = 15, scale = 2)
    private BigDecimal extraPrimaMe;
    @Column(name = "B_ADMI")
    private Short bAdmi;
    @Column(name = "B_RPF")
    private Short bRpf;
    @Column(name = "B_IVA")
    private Short bIva;
    @Column(name = "USUARIO_COMERCIAL")
    private Short usuarioComercial;
    @Column(name = "PCT_FRANQ_AIRBAG", precision = 5, scale = 2)
    private BigDecimal pctFranqAirbag;
    @Basic(optional = false)
    @Column(name = "CAP_AUTO_RADIO", nullable = false)
    private long capAutoRadio;
    @Basic(optional = false)
    @Column(name = "CAP_AUTO_RADIO_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal capAutoRadioMe;
    @Basic(optional = false)
    @Column(name = "PCT_CAP_RP_RT", nullable = false, precision = 5, scale = 2)
    private BigDecimal pctCapRpRt;
    @Basic(optional = false)
    @Column(name = "PCT_ACDTE_ROBO", nullable = false, precision = 5, scale = 2)
    private BigDecimal pctAcdteRobo;
    @Column(name = "USUARIO_AUDITORIA")
    private Short usuarioAuditoria;
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
    @Column(name = "PCT_INICIAL")
    private Short pctInicial;
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
    @Column(name = "PORC_DCTO_FLOTA", precision = 5, scale = 2)
    private BigDecimal porcDctoFlota;
    @Column(name = "MONTO_DCTO_FLOTA")
    private Long montoDctoFlota;
    @Column(name = "MONTO_DCTO_FLOTA_ME", precision = 15, scale = 2)
    private BigDecimal montoDctoFlotaMe;
    @Column(name = "CAPITAL_CUALQUIER_COND_ME", precision = 15, scale = 2)
    private BigDecimal capitalCualquierCondMe;
    @Column(name = "CAPITAL_CUALQUIER_COND")
    private Long capitalCualquierCond;
    @Basic(optional = false)
    @Column(name = "INCLUIDO", nullable = false)
    private short incluido;
    @Basic(optional = false)
    @Column(name = "ACCESORIO_DE_FABRICA", nullable = false)
    private short accesorioDeFabrica;
    @Basic(optional = false)
    @Column(name = "CAP_MERCADERIA", nullable = false)
    private long capMercaderia;
    @Basic(optional = false)
    @Column(name = "CAP_MERCADERIA_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal capMercaderiaMe;
    @Basic(optional = false)
    @Column(name = "PRIMA_MERCADERIA", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaMercaderia;
    @Basic(optional = false)
    @Column(name = "PRIMA_MERCADERIA_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaMercaderiaMe;
    @Column(name = "NRO_ENTRADA")
    private Integer nroEntrada;
    @Basic(optional = false)
    @Column(name = "PCT_COMIS_ORGANIZA", nullable = false, precision = 5, scale = 2)
    private BigDecimal pctComisOrganiza;
    @Column(name = "TIPO_PINTURA")
    private Short tipoPintura;
    @Column(name = "CILINDRADAS", length = 20)
    private String cilindradas;
    @Column(name = "TIPO_TRANSMISION")
    private Short tipoTransmision;
    @Basic(optional = false)
    @Column(name = "NRO_COCHE", nullable = false)
    private short nroCoche;
    @Basic(optional = false)
    @Column(name = "CAP_ANTENA", nullable = false)
    private long capAntena;
    @Basic(optional = false)
    @Column(name = "CAP_ANTENA_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal capAntenaMe;
    @Basic(optional = false)
    @Column(name = "CAP_RUEDA_AUXILIO", nullable = false)
    private long capRuedaAuxilio;
    @Basic(optional = false)
    @Column(name = "CAP_RUEDA_AUXILIO_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal capRuedaAuxilioMe;
    @Basic(optional = false)
    @Column(name = "CAP_FAROS", nullable = false)
    private long capFaros;
    @Basic(optional = false)
    @Column(name = "CAP_FAROS_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal capFarosMe;
    @Basic(optional = false)
    @Column(name = "CAP_TASAS", nullable = false)
    private long capTasas;
    @Basic(optional = false)
    @Column(name = "CAP_TASAS_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal capTasasMe;
    @Basic(optional = false)
    @Column(name = "AMBULANCIA", nullable = false)
    private short ambulancia;
    @Basic(optional = false)
    @Column(name = "CERRAJERIA", nullable = false)
    private short cerrajeria;
    @Basic(optional = false)
    @Column(name = "ALARMA_CAPITAL_MINIMO", nullable = false, precision = 15, scale = 2)
    private BigDecimal alarmaCapitalMinimo;
    @Basic(optional = false)
    @Column(name = "ASISTENCIA_JURIDICA", nullable = false)
    private short asistenciaJuridica;
    @Column(name = "NOMBRE_ASISTENCIA_JURIDICA", length = 60)
    private String nombreAsistenciaJuridica;
    @Basic(optional = false)
    @Column(name = "GRANIZO", nullable = false)
    private short granizo;
    @Basic(optional = false)
    @Column(name = "ACCESORIOS_ACC_INC", nullable = false)
    private short accesoriosAccInc;
    @Basic(optional = false)
    @Column(name = "COB_EXT_DANOS", nullable = false)
    private short cobExtDanos;
    @Basic(optional = false)
    @Column(name = "COB_EXT_ROBO", nullable = false)
    private short cobExtRobo;
    @Column(name = "NRO_RECIBO")
    private Long nroRecibo;
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
    @Column(name = "TIPO_ORGANIZADOR", nullable = false)
    private short tipoOrganizador;
    @Basic(optional = false)
    @Column(name = "NRO_COTIZACION", nullable = false)
    private long nroCotizacion;
    @Column(name = "TIPO_IMPORTACION")
    private BigInteger tipoImportacion;
    @Column(name = "CLASE_ASEG_MANUAL", length = 10)
    private String claseAsegManual;
    @Column(name = "CLASE_ASEG_SISTEMA", length = 10)
    private String claseAsegSistema;
    @Column(name = "CLASE_POLIZA_MANUAL", length = 25)
    private String clasePolizaManual;
    @Column(name = "CLASE_POLIZA_SISTEMA", length = 25)
    private String clasePolizaSistema;
    @Column(name = "DECLARACION", length = 1)
    private String declaracion;
    @Column(name = "CONTARJETALR", length = 1)
    private String contarjetalr;
    @JoinColumn(name = "COD_COLOR", referencedColumnName = "COD_COLOR")
    @ManyToOne
    private ColoresVehiculos codColor;
    @JoinColumn(name = "N_ASEG", referencedColumnName = "N_ASEG", nullable = false)
    @ManyToOne(optional = false)
    private Listaseg nAseg;
    @JoinColumn(name = "COD_ORGANIZADOR", referencedColumnName = "COD_ORGANIZADOR", nullable = false)
    @ManyToOne(optional = false)
    private Organizadores codOrganizador;
    @JoinColumn(name = "COD_TIPCOBRO", referencedColumnName = "COD_TIPCOBRO", nullable = false)
    @ManyToOne(optional = false)
    private TiposCobros codTipcobro;

    public Propauto() {
    }

    public Propauto(PropautoPK propautoPK) {
        this.propautoPK = propautoPK;
    }

    public Propauto(PropautoPK propautoPK, short codAgcia, Date fecha, short tipoSeguro, short tipoOperacion, Date vigdes, Date vighas, short codMoney, BigDecimal tCambio, long casco, BigDecimal cascoMe, long primaCasco, BigDecimal primaCascoMe, long capitalIncendio, BigDecimal cptalIncendioMe, long capitalAccidente, BigDecimal cptalAccidenteMe, long capitalRobo, BigDecimal cptalRoboMe, short cantRc, long primaRc, BigDecimal primaRcMe, long capRc1, BigDecimal capRc1Me, long capRc2, BigDecimal capRc2Me, long capRc3, BigDecimal capRc3Me, long capAccesorios, BigDecimal cptalAccesoriosMe, long primaOtros, BigDecimal primaOtrosMe, short roboViaPublica, long primaRoboViaPublica, BigDecimal primaRoboViaMe, short tumultoPopular, long primaTumultoPopular, BigDecimal primaTumultoPopMe, short diasCoberturaExterior, long primaCoberturaExterior, BigDecimal primaCobExtMe, long primaAdicional, BigDecimal primaAdicionalMe, BigDecimal porcBonificacon, long dctoBonificacion, BigDecimal dctoBonifMe, long franquicia, BigDecimal franquiciaMe, long primaSos, BigDecimal primaSosMe, short cantOcupantes, long capMuerte, BigDecimal capMuerteMe, long primaMuerte, BigDecimal primaMuerteMe, long capIncapacidad, BigDecimal capIncapacidadMe, long capGtosMedicos, BigDecimal capGtosmedMe, long primaGtosMedicos, BigDecimal primaGtosmedMe, short cantAirbag, long capAirbag, BigDecimal capAirbagMe, long primaAirbag, BigDecimal primaAirbagMe, long sumaseg, BigDecimal sumasegMe, long prima, BigDecimal primaMe, long gtosAdmi, BigDecimal gtosAdmiMe, long rpf, BigDecimal rpfMe, long iva, BigDecimal ivaMe, long otros, BigDecimal otrosMe, long premio, BigDecimal premioMe, int nAgte, BigDecimal porcComag, long impComag, BigDecimal impComagMe, short codMoneyReaseguro, long capRetenido, BigDecimal capRetenidoMe, BigDecimal porcRetenido, long primaRetenida, BigDecimal primaRetenidaMe, long capContrato, BigDecimal capContratoMe, BigDecimal porcContrato, long primaContrato, BigDecimal primaContratoMe, long capFacultativo, BigDecimal capFacultativoMe, BigDecimal porcFacultativo, long primaFacultativo, BigDecimal primaFacultativoMe, Date fechaCarga, long primaIncapacidad, BigDecimal primaIncapacidadMe, short tipoAdicional, long inicial, short nroCuotas, long impCuotas, BigDecimal inicialMe, BigDecimal impCuotasMe, short acdteRobo, long capAcdteRobo, BigDecimal capAcdteRoboMe, long primaAcdteRobo, BigDecimal primaAcdteRoboMe, short roboParcial, long capRp, BigDecimal capRpMe, long primaRp, BigDecimal primaRpMe, short rpRt, long capRpRt, BigDecimal capRpRtMe, long primaRpRt, BigDecimal primaRpRtMe, String marcmode, short carta, int nroCarta, short diasCarta, long primaCarta, BigDecimal primaCartaMe, short secc, int nroFlota, short estado, short centro, int item, short anexo, short codUsuarioMod, Date fechaMod, short porLicitacion, short tipoFlota, int cantItems, long capAutoRadio, BigDecimal capAutoRadioMe, BigDecimal pctCapRpRt, BigDecimal pctAcdteRobo, short incluido, short accesorioDeFabrica, long capMercaderia, BigDecimal capMercaderiaMe, BigDecimal primaMercaderia, BigDecimal primaMercaderiaMe, BigDecimal pctComisOrganiza, short nroCoche, long capAntena, BigDecimal capAntenaMe, long capRuedaAuxilio, BigDecimal capRuedaAuxilioMe, long capFaros, BigDecimal capFarosMe, long capTasas, BigDecimal capTasasMe, short ambulancia, short cerrajeria, BigDecimal alarmaCapitalMinimo, short asistenciaJuridica, short granizo, short accesoriosAccInc, short cobExtDanos, short cobExtRobo, BigDecimal costoReinstalacion, BigDecimal dmRt, BigDecimal pctGranizo, BigDecimal pctInc, BigDecimal pctAcc, BigDecimal porcTumultoPop, short tipoOrganizador, long nroCotizacion) {
        this.propautoPK = propautoPK;
        this.codAgcia = codAgcia;
        this.fecha = fecha;
        this.tipoSeguro = tipoSeguro;
        this.tipoOperacion = tipoOperacion;
        this.vigdes = vigdes;
        this.vighas = vighas;
        this.codMoney = codMoney;
        this.tCambio = tCambio;
        this.casco = casco;
        this.cascoMe = cascoMe;
        this.primaCasco = primaCasco;
        this.primaCascoMe = primaCascoMe;
        this.capitalIncendio = capitalIncendio;
        this.cptalIncendioMe = cptalIncendioMe;
        this.capitalAccidente = capitalAccidente;
        this.cptalAccidenteMe = cptalAccidenteMe;
        this.capitalRobo = capitalRobo;
        this.cptalRoboMe = cptalRoboMe;
        this.cantRc = cantRc;
        this.primaRc = primaRc;
        this.primaRcMe = primaRcMe;
        this.capRc1 = capRc1;
        this.capRc1Me = capRc1Me;
        this.capRc2 = capRc2;
        this.capRc2Me = capRc2Me;
        this.capRc3 = capRc3;
        this.capRc3Me = capRc3Me;
        this.capAccesorios = capAccesorios;
        this.cptalAccesoriosMe = cptalAccesoriosMe;
        this.primaOtros = primaOtros;
        this.primaOtrosMe = primaOtrosMe;
        this.roboViaPublica = roboViaPublica;
        this.primaRoboViaPublica = primaRoboViaPublica;
        this.primaRoboViaMe = primaRoboViaMe;
        this.tumultoPopular = tumultoPopular;
        this.primaTumultoPopular = primaTumultoPopular;
        this.primaTumultoPopMe = primaTumultoPopMe;
        this.diasCoberturaExterior = diasCoberturaExterior;
        this.primaCoberturaExterior = primaCoberturaExterior;
        this.primaCobExtMe = primaCobExtMe;
        this.primaAdicional = primaAdicional;
        this.primaAdicionalMe = primaAdicionalMe;
        this.porcBonificacon = porcBonificacon;
        this.dctoBonificacion = dctoBonificacion;
        this.dctoBonifMe = dctoBonifMe;
        this.franquicia = franquicia;
        this.franquiciaMe = franquiciaMe;
        this.primaSos = primaSos;
        this.primaSosMe = primaSosMe;
        this.cantOcupantes = cantOcupantes;
        this.capMuerte = capMuerte;
        this.capMuerteMe = capMuerteMe;
        this.primaMuerte = primaMuerte;
        this.primaMuerteMe = primaMuerteMe;
        this.capIncapacidad = capIncapacidad;
        this.capIncapacidadMe = capIncapacidadMe;
        this.capGtosMedicos = capGtosMedicos;
        this.capGtosmedMe = capGtosmedMe;
        this.primaGtosMedicos = primaGtosMedicos;
        this.primaGtosmedMe = primaGtosmedMe;
        this.cantAirbag = cantAirbag;
        this.capAirbag = capAirbag;
        this.capAirbagMe = capAirbagMe;
        this.primaAirbag = primaAirbag;
        this.primaAirbagMe = primaAirbagMe;
        this.sumaseg = sumaseg;
        this.sumasegMe = sumasegMe;
        this.prima = prima;
        this.primaMe = primaMe;
        this.gtosAdmi = gtosAdmi;
        this.gtosAdmiMe = gtosAdmiMe;
        this.rpf = rpf;
        this.rpfMe = rpfMe;
        this.iva = iva;
        this.ivaMe = ivaMe;
        this.otros = otros;
        this.otrosMe = otrosMe;
        this.premio = premio;
        this.premioMe = premioMe;
        this.nAgte = nAgte;
        this.porcComag = porcComag;
        this.impComag = impComag;
        this.impComagMe = impComagMe;
        this.codMoneyReaseguro = codMoneyReaseguro;
        this.capRetenido = capRetenido;
        this.capRetenidoMe = capRetenidoMe;
        this.porcRetenido = porcRetenido;
        this.primaRetenida = primaRetenida;
        this.primaRetenidaMe = primaRetenidaMe;
        this.capContrato = capContrato;
        this.capContratoMe = capContratoMe;
        this.porcContrato = porcContrato;
        this.primaContrato = primaContrato;
        this.primaContratoMe = primaContratoMe;
        this.capFacultativo = capFacultativo;
        this.capFacultativoMe = capFacultativoMe;
        this.porcFacultativo = porcFacultativo;
        this.primaFacultativo = primaFacultativo;
        this.primaFacultativoMe = primaFacultativoMe;
        this.fechaCarga = fechaCarga;
        this.primaIncapacidad = primaIncapacidad;
        this.primaIncapacidadMe = primaIncapacidadMe;
        this.tipoAdicional = tipoAdicional;
        this.inicial = inicial;
        this.nroCuotas = nroCuotas;
        this.impCuotas = impCuotas;
        this.inicialMe = inicialMe;
        this.impCuotasMe = impCuotasMe;
        this.acdteRobo = acdteRobo;
        this.capAcdteRobo = capAcdteRobo;
        this.capAcdteRoboMe = capAcdteRoboMe;
        this.primaAcdteRobo = primaAcdteRobo;
        this.primaAcdteRoboMe = primaAcdteRoboMe;
        this.roboParcial = roboParcial;
        this.capRp = capRp;
        this.capRpMe = capRpMe;
        this.primaRp = primaRp;
        this.primaRpMe = primaRpMe;
        this.rpRt = rpRt;
        this.capRpRt = capRpRt;
        this.capRpRtMe = capRpRtMe;
        this.primaRpRt = primaRpRt;
        this.primaRpRtMe = primaRpRtMe;
        this.marcmode = marcmode;
        this.carta = carta;
        this.nroCarta = nroCarta;
        this.diasCarta = diasCarta;
        this.primaCarta = primaCarta;
        this.primaCartaMe = primaCartaMe;
        this.secc = secc;
        this.nroFlota = nroFlota;
        this.estado = estado;
        this.centro = centro;
        this.item = item;
        this.anexo = anexo;
        this.codUsuarioMod = codUsuarioMod;
        this.fechaMod = fechaMod;
        this.porLicitacion = porLicitacion;
        this.tipoFlota = tipoFlota;
        this.cantItems = cantItems;
        this.capAutoRadio = capAutoRadio;
        this.capAutoRadioMe = capAutoRadioMe;
        this.pctCapRpRt = pctCapRpRt;
        this.pctAcdteRobo = pctAcdteRobo;
        this.incluido = incluido;
        this.accesorioDeFabrica = accesorioDeFabrica;
        this.capMercaderia = capMercaderia;
        this.capMercaderiaMe = capMercaderiaMe;
        this.primaMercaderia = primaMercaderia;
        this.primaMercaderiaMe = primaMercaderiaMe;
        this.pctComisOrganiza = pctComisOrganiza;
        this.nroCoche = nroCoche;
        this.capAntena = capAntena;
        this.capAntenaMe = capAntenaMe;
        this.capRuedaAuxilio = capRuedaAuxilio;
        this.capRuedaAuxilioMe = capRuedaAuxilioMe;
        this.capFaros = capFaros;
        this.capFarosMe = capFarosMe;
        this.capTasas = capTasas;
        this.capTasasMe = capTasasMe;
        this.ambulancia = ambulancia;
        this.cerrajeria = cerrajeria;
        this.alarmaCapitalMinimo = alarmaCapitalMinimo;
        this.asistenciaJuridica = asistenciaJuridica;
        this.granizo = granizo;
        this.accesoriosAccInc = accesoriosAccInc;
        this.cobExtDanos = cobExtDanos;
        this.cobExtRobo = cobExtRobo;
        this.costoReinstalacion = costoReinstalacion;
        this.dmRt = dmRt;
        this.pctGranizo = pctGranizo;
        this.pctInc = pctInc;
        this.pctAcc = pctAcc;
        this.porcTumultoPop = porcTumultoPop;
        this.tipoOrganizador = tipoOrganizador;
        this.nroCotizacion = nroCotizacion;
    }

    public Propauto(short ejercicio, int nroPropuesta) {
        this.propautoPK = new PropautoPK(ejercicio, nroPropuesta);
    }

    public PropautoPK getPropautoPK() {
        return propautoPK;
    }

    public void setPropautoPK(PropautoPK propautoPK) {
        this.propautoPK = propautoPK;
    }

    public short getCodAgcia() {
        return codAgcia;
    }

    public void setCodAgcia(short codAgcia) {
        this.codAgcia = codAgcia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public short getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(short tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public short getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(short tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public Integer getPolant() {
        return polant;
    }

    public void setPolant(Integer polant) {
        this.polant = polant;
    }

    public Date getVigdes() {
        return vigdes;
    }

    public void setVigdes(Date vigdes) {
        this.vigdes = vigdes;
    }

    public Date getVighas() {
        return vighas;
    }

    public void setVighas(Date vighas) {
        this.vighas = vighas;
    }

    public Integer getCantDias() {
        return cantDias;
    }

    public void setCantDias(Integer cantDias) {
        this.cantDias = cantDias;
    }

    public short getCodMoney() {
        return codMoney;
    }

    public void setCodMoney(short codMoney) {
        this.codMoney = codMoney;
    }

    public BigDecimal getTCambio() {
        return tCambio;
    }

    public void setTCambio(BigDecimal tCambio) {
        this.tCambio = tCambio;
    }

    public Integer getNroInspeccion() {
        return nroInspeccion;
    }

    public void setNroInspeccion(Integer nroInspeccion) {
        this.nroInspeccion = nroInspeccion;
    }

    public Short getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(Short codTipo) {
        this.codTipo = codTipo;
    }

    public Short getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(Short codMarca) {
        this.codMarca = codMarca;
    }

    public Short getCodModelo() {
        return codModelo;
    }

    public void setCodModelo(Short codModelo) {
        this.codModelo = codModelo;
    }

    public Short getAno() {
        return ano;
    }

    public void setAno(Short ano) {
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

    public Short getCodLocalidad() {
        return codLocalidad;
    }

    public void setCodLocalidad(Short codLocalidad) {
        this.codLocalidad = codLocalidad;
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

    public BigDecimal getCascoMe() {
        return cascoMe;
    }

    public void setCascoMe(BigDecimal cascoMe) {
        this.cascoMe = cascoMe;
    }

    public long getPrimaCasco() {
        return primaCasco;
    }

    public void setPrimaCasco(long primaCasco) {
        this.primaCasco = primaCasco;
    }

    public BigDecimal getPrimaCascoMe() {
        return primaCascoMe;
    }

    public void setPrimaCascoMe(BigDecimal primaCascoMe) {
        this.primaCascoMe = primaCascoMe;
    }

    public long getCapitalIncendio() {
        return capitalIncendio;
    }

    public void setCapitalIncendio(long capitalIncendio) {
        this.capitalIncendio = capitalIncendio;
    }

    public BigDecimal getCptalIncendioMe() {
        return cptalIncendioMe;
    }

    public void setCptalIncendioMe(BigDecimal cptalIncendioMe) {
        this.cptalIncendioMe = cptalIncendioMe;
    }

    public long getCapitalAccidente() {
        return capitalAccidente;
    }

    public void setCapitalAccidente(long capitalAccidente) {
        this.capitalAccidente = capitalAccidente;
    }

    public BigDecimal getCptalAccidenteMe() {
        return cptalAccidenteMe;
    }

    public void setCptalAccidenteMe(BigDecimal cptalAccidenteMe) {
        this.cptalAccidenteMe = cptalAccidenteMe;
    }

    public long getCapitalRobo() {
        return capitalRobo;
    }

    public void setCapitalRobo(long capitalRobo) {
        this.capitalRobo = capitalRobo;
    }

    public BigDecimal getCptalRoboMe() {
        return cptalRoboMe;
    }

    public void setCptalRoboMe(BigDecimal cptalRoboMe) {
        this.cptalRoboMe = cptalRoboMe;
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

    public BigDecimal getPrimaRcMe() {
        return primaRcMe;
    }

    public void setPrimaRcMe(BigDecimal primaRcMe) {
        this.primaRcMe = primaRcMe;
    }

    public long getCapRc1() {
        return capRc1;
    }

    public void setCapRc1(long capRc1) {
        this.capRc1 = capRc1;
    }

    public BigDecimal getCapRc1Me() {
        return capRc1Me;
    }

    public void setCapRc1Me(BigDecimal capRc1Me) {
        this.capRc1Me = capRc1Me;
    }

    public long getCapRc2() {
        return capRc2;
    }

    public void setCapRc2(long capRc2) {
        this.capRc2 = capRc2;
    }

    public BigDecimal getCapRc2Me() {
        return capRc2Me;
    }

    public void setCapRc2Me(BigDecimal capRc2Me) {
        this.capRc2Me = capRc2Me;
    }

    public long getCapRc3() {
        return capRc3;
    }

    public void setCapRc3(long capRc3) {
        this.capRc3 = capRc3;
    }

    public BigDecimal getCapRc3Me() {
        return capRc3Me;
    }

    public void setCapRc3Me(BigDecimal capRc3Me) {
        this.capRc3Me = capRc3Me;
    }

    public long getCapAccesorios() {
        return capAccesorios;
    }

    public void setCapAccesorios(long capAccesorios) {
        this.capAccesorios = capAccesorios;
    }

    public BigDecimal getCptalAccesoriosMe() {
        return cptalAccesoriosMe;
    }

    public void setCptalAccesoriosMe(BigDecimal cptalAccesoriosMe) {
        this.cptalAccesoriosMe = cptalAccesoriosMe;
    }

    public long getPrimaOtros() {
        return primaOtros;
    }

    public void setPrimaOtros(long primaOtros) {
        this.primaOtros = primaOtros;
    }

    public BigDecimal getPrimaOtrosMe() {
        return primaOtrosMe;
    }

    public void setPrimaOtrosMe(BigDecimal primaOtrosMe) {
        this.primaOtrosMe = primaOtrosMe;
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

    public BigDecimal getPrimaRoboViaMe() {
        return primaRoboViaMe;
    }

    public void setPrimaRoboViaMe(BigDecimal primaRoboViaMe) {
        this.primaRoboViaMe = primaRoboViaMe;
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

    public BigDecimal getPrimaTumultoPopMe() {
        return primaTumultoPopMe;
    }

    public void setPrimaTumultoPopMe(BigDecimal primaTumultoPopMe) {
        this.primaTumultoPopMe = primaTumultoPopMe;
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

    public BigDecimal getPrimaCobExtMe() {
        return primaCobExtMe;
    }

    public void setPrimaCobExtMe(BigDecimal primaCobExtMe) {
        this.primaCobExtMe = primaCobExtMe;
    }

    public long getPrimaAdicional() {
        return primaAdicional;
    }

    public void setPrimaAdicional(long primaAdicional) {
        this.primaAdicional = primaAdicional;
    }

    public BigDecimal getPrimaAdicionalMe() {
        return primaAdicionalMe;
    }

    public void setPrimaAdicionalMe(BigDecimal primaAdicionalMe) {
        this.primaAdicionalMe = primaAdicionalMe;
    }

    public String getDescripcionAdicional() {
        return descripcionAdicional;
    }

    public void setDescripcionAdicional(String descripcionAdicional) {
        this.descripcionAdicional = descripcionAdicional;
    }

    public BigDecimal getPorcBonificacon() {
        return porcBonificacon;
    }

    public void setPorcBonificacon(BigDecimal porcBonificacon) {
        this.porcBonificacon = porcBonificacon;
    }

    public long getDctoBonificacion() {
        return dctoBonificacion;
    }

    public void setDctoBonificacion(long dctoBonificacion) {
        this.dctoBonificacion = dctoBonificacion;
    }

    public BigDecimal getDctoBonifMe() {
        return dctoBonifMe;
    }

    public void setDctoBonifMe(BigDecimal dctoBonifMe) {
        this.dctoBonifMe = dctoBonifMe;
    }

    public long getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(long franquicia) {
        this.franquicia = franquicia;
    }

    public BigDecimal getFranquiciaMe() {
        return franquiciaMe;
    }

    public void setFranquiciaMe(BigDecimal franquiciaMe) {
        this.franquiciaMe = franquiciaMe;
    }

    public Short getSos() {
        return sos;
    }

    public void setSos(Short sos) {
        this.sos = sos;
    }

    public long getPrimaSos() {
        return primaSos;
    }

    public void setPrimaSos(long primaSos) {
        this.primaSos = primaSos;
    }

    public BigDecimal getPrimaSosMe() {
        return primaSosMe;
    }

    public void setPrimaSosMe(BigDecimal primaSosMe) {
        this.primaSosMe = primaSosMe;
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

    public BigDecimal getCapMuerteMe() {
        return capMuerteMe;
    }

    public void setCapMuerteMe(BigDecimal capMuerteMe) {
        this.capMuerteMe = capMuerteMe;
    }

    public long getPrimaMuerte() {
        return primaMuerte;
    }

    public void setPrimaMuerte(long primaMuerte) {
        this.primaMuerte = primaMuerte;
    }

    public BigDecimal getPrimaMuerteMe() {
        return primaMuerteMe;
    }

    public void setPrimaMuerteMe(BigDecimal primaMuerteMe) {
        this.primaMuerteMe = primaMuerteMe;
    }

    public long getCapIncapacidad() {
        return capIncapacidad;
    }

    public void setCapIncapacidad(long capIncapacidad) {
        this.capIncapacidad = capIncapacidad;
    }

    public BigDecimal getCapIncapacidadMe() {
        return capIncapacidadMe;
    }

    public void setCapIncapacidadMe(BigDecimal capIncapacidadMe) {
        this.capIncapacidadMe = capIncapacidadMe;
    }

    public long getCapGtosMedicos() {
        return capGtosMedicos;
    }

    public void setCapGtosMedicos(long capGtosMedicos) {
        this.capGtosMedicos = capGtosMedicos;
    }

    public BigDecimal getCapGtosmedMe() {
        return capGtosmedMe;
    }

    public void setCapGtosmedMe(BigDecimal capGtosmedMe) {
        this.capGtosmedMe = capGtosmedMe;
    }

    public long getPrimaGtosMedicos() {
        return primaGtosMedicos;
    }

    public void setPrimaGtosMedicos(long primaGtosMedicos) {
        this.primaGtosMedicos = primaGtosMedicos;
    }

    public BigDecimal getPrimaGtosmedMe() {
        return primaGtosmedMe;
    }

    public void setPrimaGtosmedMe(BigDecimal primaGtosmedMe) {
        this.primaGtosmedMe = primaGtosmedMe;
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

    public BigDecimal getCapAirbagMe() {
        return capAirbagMe;
    }

    public void setCapAirbagMe(BigDecimal capAirbagMe) {
        this.capAirbagMe = capAirbagMe;
    }

    public long getPrimaAirbag() {
        return primaAirbag;
    }

    public void setPrimaAirbag(long primaAirbag) {
        this.primaAirbag = primaAirbag;
    }

    public BigDecimal getPrimaAirbagMe() {
        return primaAirbagMe;
    }

    public void setPrimaAirbagMe(BigDecimal primaAirbagMe) {
        this.primaAirbagMe = primaAirbagMe;
    }

    public long getSumaseg() {
        return sumaseg;
    }

    public void setSumaseg(long sumaseg) {
        this.sumaseg = sumaseg;
    }

    public BigDecimal getSumasegMe() {
        return sumasegMe;
    }

    public void setSumasegMe(BigDecimal sumasegMe) {
        this.sumasegMe = sumasegMe;
    }

    public long getPrima() {
        return prima;
    }

    public void setPrima(long prima) {
        this.prima = prima;
    }

    public BigDecimal getPrimaMe() {
        return primaMe;
    }

    public void setPrimaMe(BigDecimal primaMe) {
        this.primaMe = primaMe;
    }

    public long getGtosAdmi() {
        return gtosAdmi;
    }

    public void setGtosAdmi(long gtosAdmi) {
        this.gtosAdmi = gtosAdmi;
    }

    public BigDecimal getGtosAdmiMe() {
        return gtosAdmiMe;
    }

    public void setGtosAdmiMe(BigDecimal gtosAdmiMe) {
        this.gtosAdmiMe = gtosAdmiMe;
    }

    public long getRpf() {
        return rpf;
    }

    public void setRpf(long rpf) {
        this.rpf = rpf;
    }

    public BigDecimal getRpfMe() {
        return rpfMe;
    }

    public void setRpfMe(BigDecimal rpfMe) {
        this.rpfMe = rpfMe;
    }

    public long getIva() {
        return iva;
    }

    public void setIva(long iva) {
        this.iva = iva;
    }

    public BigDecimal getIvaMe() {
        return ivaMe;
    }

    public void setIvaMe(BigDecimal ivaMe) {
        this.ivaMe = ivaMe;
    }

    public long getOtros() {
        return otros;
    }

    public void setOtros(long otros) {
        this.otros = otros;
    }

    public BigDecimal getOtrosMe() {
        return otrosMe;
    }

    public void setOtrosMe(BigDecimal otrosMe) {
        this.otrosMe = otrosMe;
    }

    public long getPremio() {
        return premio;
    }

    public void setPremio(long premio) {
        this.premio = premio;
    }

    public BigDecimal getPremioMe() {
        return premioMe;
    }

    public void setPremioMe(BigDecimal premioMe) {
        this.premioMe = premioMe;
    }

    public int getNAgte() {
        return nAgte;
    }

    public void setNAgte(int nAgte) {
        this.nAgte = nAgte;
    }

    public BigDecimal getPorcComag() {
        return porcComag;
    }

    public void setPorcComag(BigDecimal porcComag) {
        this.porcComag = porcComag;
    }

    public long getImpComag() {
        return impComag;
    }

    public void setImpComag(long impComag) {
        this.impComag = impComag;
    }

    public BigDecimal getImpComagMe() {
        return impComagMe;
    }

    public void setImpComagMe(BigDecimal impComagMe) {
        this.impComagMe = impComagMe;
    }

    public Integer getNCobr() {
        return nCobr;
    }

    public void setNCobr(Integer nCobr) {
        this.nCobr = nCobr;
    }

    public BigDecimal getPorcComcb() {
        return porcComcb;
    }

    public void setPorcComcb(BigDecimal porcComcb) {
        this.porcComcb = porcComcb;
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

    public Short getCodProcedencia() {
        return codProcedencia;
    }

    public void setCodProcedencia(Short codProcedencia) {
        this.codProcedencia = codProcedencia;
    }

    public short getCodMoneyReaseguro() {
        return codMoneyReaseguro;
    }

    public void setCodMoneyReaseguro(short codMoneyReaseguro) {
        this.codMoneyReaseguro = codMoneyReaseguro;
    }

    public long getCapRetenido() {
        return capRetenido;
    }

    public void setCapRetenido(long capRetenido) {
        this.capRetenido = capRetenido;
    }

    public BigDecimal getCapRetenidoMe() {
        return capRetenidoMe;
    }

    public void setCapRetenidoMe(BigDecimal capRetenidoMe) {
        this.capRetenidoMe = capRetenidoMe;
    }

    public BigDecimal getPorcRetenido() {
        return porcRetenido;
    }

    public void setPorcRetenido(BigDecimal porcRetenido) {
        this.porcRetenido = porcRetenido;
    }

    public long getPrimaRetenida() {
        return primaRetenida;
    }

    public void setPrimaRetenida(long primaRetenida) {
        this.primaRetenida = primaRetenida;
    }

    public BigDecimal getPrimaRetenidaMe() {
        return primaRetenidaMe;
    }

    public void setPrimaRetenidaMe(BigDecimal primaRetenidaMe) {
        this.primaRetenidaMe = primaRetenidaMe;
    }

    public long getCapContrato() {
        return capContrato;
    }

    public void setCapContrato(long capContrato) {
        this.capContrato = capContrato;
    }

    public BigDecimal getCapContratoMe() {
        return capContratoMe;
    }

    public void setCapContratoMe(BigDecimal capContratoMe) {
        this.capContratoMe = capContratoMe;
    }

    public BigDecimal getPorcContrato() {
        return porcContrato;
    }

    public void setPorcContrato(BigDecimal porcContrato) {
        this.porcContrato = porcContrato;
    }

    public long getPrimaContrato() {
        return primaContrato;
    }

    public void setPrimaContrato(long primaContrato) {
        this.primaContrato = primaContrato;
    }

    public BigDecimal getPrimaContratoMe() {
        return primaContratoMe;
    }

    public void setPrimaContratoMe(BigDecimal primaContratoMe) {
        this.primaContratoMe = primaContratoMe;
    }

    public long getCapFacultativo() {
        return capFacultativo;
    }

    public void setCapFacultativo(long capFacultativo) {
        this.capFacultativo = capFacultativo;
    }

    public BigDecimal getCapFacultativoMe() {
        return capFacultativoMe;
    }

    public void setCapFacultativoMe(BigDecimal capFacultativoMe) {
        this.capFacultativoMe = capFacultativoMe;
    }

    public BigDecimal getPorcFacultativo() {
        return porcFacultativo;
    }

    public void setPorcFacultativo(BigDecimal porcFacultativo) {
        this.porcFacultativo = porcFacultativo;
    }

    public long getPrimaFacultativo() {
        return primaFacultativo;
    }

    public void setPrimaFacultativo(long primaFacultativo) {
        this.primaFacultativo = primaFacultativo;
    }

    public BigDecimal getPrimaFacultativoMe() {
        return primaFacultativoMe;
    }

    public void setPrimaFacultativoMe(BigDecimal primaFacultativoMe) {
        this.primaFacultativoMe = primaFacultativoMe;
    }

    public Short getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Short codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Short getCodEntidad() {
        return codEntidad;
    }

    public void setCodEntidad(Short codEntidad) {
        this.codEntidad = codEntidad;
    }

    public String getNroTarjeta() {
        return nroTarjeta;
    }

    public void setNroTarjeta(String nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    public Date getVtoTarjeta() {
        return vtoTarjeta;
    }

    public void setVtoTarjeta(Date vtoTarjeta) {
        this.vtoTarjeta = vtoTarjeta;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public Short getCodPrendario() {
        return codPrendario;
    }

    public void setCodPrendario(Short codPrendario) {
        this.codPrendario = codPrendario;
    }

    public Short getTipoEndoso() {
        return tipoEndoso;
    }

    public void setTipoEndoso(Short tipoEndoso) {
        this.tipoEndoso = tipoEndoso;
    }

    public Short getAlarma() {
        return alarma;
    }

    public void setAlarma(Short alarma) {
        this.alarma = alarma;
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

    public BigDecimal getPrimaIncapacidadMe() {
        return primaIncapacidadMe;
    }

    public void setPrimaIncapacidadMe(BigDecimal primaIncapacidadMe) {
        this.primaIncapacidadMe = primaIncapacidadMe;
    }

    public short getTipoAdicional() {
        return tipoAdicional;
    }

    public void setTipoAdicional(short tipoAdicional) {
        this.tipoAdicional = tipoAdicional;
    }

    public long getInicial() {
        return inicial;
    }

    public void setInicial(long inicial) {
        this.inicial = inicial;
    }

    public short getNroCuotas() {
        return nroCuotas;
    }

    public void setNroCuotas(short nroCuotas) {
        this.nroCuotas = nroCuotas;
    }

    public long getImpCuotas() {
        return impCuotas;
    }

    public void setImpCuotas(long impCuotas) {
        this.impCuotas = impCuotas;
    }

    public BigDecimal getInicialMe() {
        return inicialMe;
    }

    public void setInicialMe(BigDecimal inicialMe) {
        this.inicialMe = inicialMe;
    }

    public BigDecimal getImpCuotasMe() {
        return impCuotasMe;
    }

    public void setImpCuotasMe(BigDecimal impCuotasMe) {
        this.impCuotasMe = impCuotasMe;
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

    public BigDecimal getCapAcdteRoboMe() {
        return capAcdteRoboMe;
    }

    public void setCapAcdteRoboMe(BigDecimal capAcdteRoboMe) {
        this.capAcdteRoboMe = capAcdteRoboMe;
    }

    public long getPrimaAcdteRobo() {
        return primaAcdteRobo;
    }

    public void setPrimaAcdteRobo(long primaAcdteRobo) {
        this.primaAcdteRobo = primaAcdteRobo;
    }

    public BigDecimal getPrimaAcdteRoboMe() {
        return primaAcdteRoboMe;
    }

    public void setPrimaAcdteRoboMe(BigDecimal primaAcdteRoboMe) {
        this.primaAcdteRoboMe = primaAcdteRoboMe;
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

    public BigDecimal getCapRpMe() {
        return capRpMe;
    }

    public void setCapRpMe(BigDecimal capRpMe) {
        this.capRpMe = capRpMe;
    }

    public long getPrimaRp() {
        return primaRp;
    }

    public void setPrimaRp(long primaRp) {
        this.primaRp = primaRp;
    }

    public BigDecimal getPrimaRpMe() {
        return primaRpMe;
    }

    public void setPrimaRpMe(BigDecimal primaRpMe) {
        this.primaRpMe = primaRpMe;
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

    public BigDecimal getCapRpRtMe() {
        return capRpRtMe;
    }

    public void setCapRpRtMe(BigDecimal capRpRtMe) {
        this.capRpRtMe = capRpRtMe;
    }

    public long getPrimaRpRt() {
        return primaRpRt;
    }

    public void setPrimaRpRt(long primaRpRt) {
        this.primaRpRt = primaRpRt;
    }

    public BigDecimal getPrimaRpRtMe() {
        return primaRpRtMe;
    }

    public void setPrimaRpRtMe(BigDecimal primaRpRtMe) {
        this.primaRpRtMe = primaRpRtMe;
    }

    public String getMarcmode() {
        return marcmode;
    }

    public void setMarcmode(String marcmode) {
        this.marcmode = marcmode;
    }

    public Integer getPolnro() {
        return polnro;
    }

    public void setPolnro(Integer polnro) {
        this.polnro = polnro;
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

    public short getDiasCarta() {
        return diasCarta;
    }

    public void setDiasCarta(short diasCarta) {
        this.diasCarta = diasCarta;
    }

    public long getPrimaCarta() {
        return primaCarta;
    }

    public void setPrimaCarta(long primaCarta) {
        this.primaCarta = primaCarta;
    }

    public BigDecimal getPrimaCartaMe() {
        return primaCartaMe;
    }

    public void setPrimaCartaMe(BigDecimal primaCartaMe) {
        this.primaCartaMe = primaCartaMe;
    }

    public short getSecc() {
        return secc;
    }

    public void setSecc(short secc) {
        this.secc = secc;
    }

    public Short getDestinadoA() {
        return destinadoA;
    }

    public void setDestinadoA(Short destinadoA) {
        this.destinadoA = destinadoA;
    }

    public int getNroFlota() {
        return nroFlota;
    }

    public void setNroFlota(int nroFlota) {
        this.nroFlota = nroFlota;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
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

    public Short getCodUsuarioAprueba() {
        return codUsuarioAprueba;
    }

    public void setCodUsuarioAprueba(Short codUsuarioAprueba) {
        this.codUsuarioAprueba = codUsuarioAprueba;
    }

    public String getFormaParte() {
        return formaParte;
    }

    public void setFormaParte(String formaParte) {
        this.formaParte = formaParte;
    }

    public short getCentro() {
        return centro;
    }

    public void setCentro(short centro) {
        this.centro = centro;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public short getAnexo() {
        return anexo;
    }

    public void setAnexo(short anexo) {
        this.anexo = anexo;
    }

    public short getCodUsuarioMod() {
        return codUsuarioMod;
    }

    public void setCodUsuarioMod(short codUsuarioMod) {
        this.codUsuarioMod = codUsuarioMod;
    }

    public Date getFechaMod() {
        return fechaMod;
    }

    public void setFechaMod(Date fechaMod) {
        this.fechaMod = fechaMod;
    }

    public Short getCodFormaPago() {
        return codFormaPago;
    }

    public void setCodFormaPago(Short codFormaPago) {
        this.codFormaPago = codFormaPago;
    }

    public short getPorLicitacion() {
        return porLicitacion;
    }

    public void setPorLicitacion(short porLicitacion) {
        this.porLicitacion = porLicitacion;
    }

    public short getTipoFlota() {
        return tipoFlota;
    }

    public void setTipoFlota(short tipoFlota) {
        this.tipoFlota = tipoFlota;
    }

    public int getCantItems() {
        return cantItems;
    }

    public void setCantItems(int cantItems) {
        this.cantItems = cantItems;
    }

    public Short getNroLoteCom() {
        return nroLoteCom;
    }

    public void setNroLoteCom(Short nroLoteCom) {
        this.nroLoteCom = nroLoteCom;
    }

    public Short getUsuarioEntregaCom() {
        return usuarioEntregaCom;
    }

    public void setUsuarioEntregaCom(Short usuarioEntregaCom) {
        this.usuarioEntregaCom = usuarioEntregaCom;
    }

    public Date getPrimerVto() {
        return primerVto;
    }

    public void setPrimerVto(Date primerVto) {
        this.primerVto = primerVto;
    }

    public Long getExtraPrima() {
        return extraPrima;
    }

    public void setExtraPrima(Long extraPrima) {
        this.extraPrima = extraPrima;
    }

    public BigDecimal getExtraPrimaMe() {
        return extraPrimaMe;
    }

    public void setExtraPrimaMe(BigDecimal extraPrimaMe) {
        this.extraPrimaMe = extraPrimaMe;
    }

    public Short getBAdmi() {
        return bAdmi;
    }

    public void setBAdmi(Short bAdmi) {
        this.bAdmi = bAdmi;
    }

    public Short getBRpf() {
        return bRpf;
    }

    public void setBRpf(Short bRpf) {
        this.bRpf = bRpf;
    }

    public Short getBIva() {
        return bIva;
    }

    public void setBIva(Short bIva) {
        this.bIva = bIva;
    }

    public Short getUsuarioComercial() {
        return usuarioComercial;
    }

    public void setUsuarioComercial(Short usuarioComercial) {
        this.usuarioComercial = usuarioComercial;
    }

    public BigDecimal getPctFranqAirbag() {
        return pctFranqAirbag;
    }

    public void setPctFranqAirbag(BigDecimal pctFranqAirbag) {
        this.pctFranqAirbag = pctFranqAirbag;
    }

    public long getCapAutoRadio() {
        return capAutoRadio;
    }

    public void setCapAutoRadio(long capAutoRadio) {
        this.capAutoRadio = capAutoRadio;
    }

    public BigDecimal getCapAutoRadioMe() {
        return capAutoRadioMe;
    }

    public void setCapAutoRadioMe(BigDecimal capAutoRadioMe) {
        this.capAutoRadioMe = capAutoRadioMe;
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

    public Short getUsuarioAuditoria() {
        return usuarioAuditoria;
    }

    public void setUsuarioAuditoria(Short usuarioAuditoria) {
        this.usuarioAuditoria = usuarioAuditoria;
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

    public Short getPctInicial() {
        return pctInicial;
    }

    public void setPctInicial(Short pctInicial) {
        this.pctInicial = pctInicial;
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

    public BigDecimal getPorcDctoFlota() {
        return porcDctoFlota;
    }

    public void setPorcDctoFlota(BigDecimal porcDctoFlota) {
        this.porcDctoFlota = porcDctoFlota;
    }

    public Long getMontoDctoFlota() {
        return montoDctoFlota;
    }

    public void setMontoDctoFlota(Long montoDctoFlota) {
        this.montoDctoFlota = montoDctoFlota;
    }

    public BigDecimal getMontoDctoFlotaMe() {
        return montoDctoFlotaMe;
    }

    public void setMontoDctoFlotaMe(BigDecimal montoDctoFlotaMe) {
        this.montoDctoFlotaMe = montoDctoFlotaMe;
    }

    public BigDecimal getCapitalCualquierCondMe() {
        return capitalCualquierCondMe;
    }

    public void setCapitalCualquierCondMe(BigDecimal capitalCualquierCondMe) {
        this.capitalCualquierCondMe = capitalCualquierCondMe;
    }

    public Long getCapitalCualquierCond() {
        return capitalCualquierCond;
    }

    public void setCapitalCualquierCond(Long capitalCualquierCond) {
        this.capitalCualquierCond = capitalCualquierCond;
    }

    public short getIncluido() {
        return incluido;
    }

    public void setIncluido(short incluido) {
        this.incluido = incluido;
    }

    public short getAccesorioDeFabrica() {
        return accesorioDeFabrica;
    }

    public void setAccesorioDeFabrica(short accesorioDeFabrica) {
        this.accesorioDeFabrica = accesorioDeFabrica;
    }

    public long getCapMercaderia() {
        return capMercaderia;
    }

    public void setCapMercaderia(long capMercaderia) {
        this.capMercaderia = capMercaderia;
    }

    public BigDecimal getCapMercaderiaMe() {
        return capMercaderiaMe;
    }

    public void setCapMercaderiaMe(BigDecimal capMercaderiaMe) {
        this.capMercaderiaMe = capMercaderiaMe;
    }

    public BigDecimal getPrimaMercaderia() {
        return primaMercaderia;
    }

    public void setPrimaMercaderia(BigDecimal primaMercaderia) {
        this.primaMercaderia = primaMercaderia;
    }

    public BigDecimal getPrimaMercaderiaMe() {
        return primaMercaderiaMe;
    }

    public void setPrimaMercaderiaMe(BigDecimal primaMercaderiaMe) {
        this.primaMercaderiaMe = primaMercaderiaMe;
    }

    public Integer getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(Integer nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public BigDecimal getPctComisOrganiza() {
        return pctComisOrganiza;
    }

    public void setPctComisOrganiza(BigDecimal pctComisOrganiza) {
        this.pctComisOrganiza = pctComisOrganiza;
    }

    public Short getTipoPintura() {
        return tipoPintura;
    }

    public void setTipoPintura(Short tipoPintura) {
        this.tipoPintura = tipoPintura;
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Short getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(Short tipoTransmision) {
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

    public BigDecimal getCapAntenaMe() {
        return capAntenaMe;
    }

    public void setCapAntenaMe(BigDecimal capAntenaMe) {
        this.capAntenaMe = capAntenaMe;
    }

    public long getCapRuedaAuxilio() {
        return capRuedaAuxilio;
    }

    public void setCapRuedaAuxilio(long capRuedaAuxilio) {
        this.capRuedaAuxilio = capRuedaAuxilio;
    }

    public BigDecimal getCapRuedaAuxilioMe() {
        return capRuedaAuxilioMe;
    }

    public void setCapRuedaAuxilioMe(BigDecimal capRuedaAuxilioMe) {
        this.capRuedaAuxilioMe = capRuedaAuxilioMe;
    }

    public long getCapFaros() {
        return capFaros;
    }

    public void setCapFaros(long capFaros) {
        this.capFaros = capFaros;
    }

    public BigDecimal getCapFarosMe() {
        return capFarosMe;
    }

    public void setCapFarosMe(BigDecimal capFarosMe) {
        this.capFarosMe = capFarosMe;
    }

    public long getCapTasas() {
        return capTasas;
    }

    public void setCapTasas(long capTasas) {
        this.capTasas = capTasas;
    }

    public BigDecimal getCapTasasMe() {
        return capTasasMe;
    }

    public void setCapTasasMe(BigDecimal capTasasMe) {
        this.capTasasMe = capTasasMe;
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

    public BigDecimal getAlarmaCapitalMinimo() {
        return alarmaCapitalMinimo;
    }

    public void setAlarmaCapitalMinimo(BigDecimal alarmaCapitalMinimo) {
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

    public short getGranizo() {
        return granizo;
    }

    public void setGranizo(short granizo) {
        this.granizo = granizo;
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

    public Long getNroRecibo() {
        return nroRecibo;
    }

    public void setNroRecibo(Long nroRecibo) {
        this.nroRecibo = nroRecibo;
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

    public short getTipoOrganizador() {
        return tipoOrganizador;
    }

    public void setTipoOrganizador(short tipoOrganizador) {
        this.tipoOrganizador = tipoOrganizador;
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

    public String getClaseAsegManual() {
        return claseAsegManual;
    }

    public void setClaseAsegManual(String claseAsegManual) {
        this.claseAsegManual = claseAsegManual;
    }

    public String getClaseAsegSistema() {
        return claseAsegSistema;
    }

    public void setClaseAsegSistema(String claseAsegSistema) {
        this.claseAsegSistema = claseAsegSistema;
    }

    public String getClasePolizaManual() {
        return clasePolizaManual;
    }

    public void setClasePolizaManual(String clasePolizaManual) {
        this.clasePolizaManual = clasePolizaManual;
    }

    public String getClasePolizaSistema() {
        return clasePolizaSistema;
    }

    public void setClasePolizaSistema(String clasePolizaSistema) {
        this.clasePolizaSistema = clasePolizaSistema;
    }

    public String getDeclaracion() {
        return declaracion;
    }

    public void setDeclaracion(String declaracion) {
        this.declaracion = declaracion;
    }

    public String getContarjetalr() {
        return contarjetalr;
    }

    public void setContarjetalr(String contarjetalr) {
        this.contarjetalr = contarjetalr;
    }

    public ColoresVehiculos getCodColor() {
        return codColor;
    }

    public void setCodColor(ColoresVehiculos codColor) {
        this.codColor = codColor;
    }

    public Listaseg getNAseg() {
        return nAseg;
    }

    public void setNAseg(Listaseg nAseg) {
        this.nAseg = nAseg;
    }

    public Organizadores getCodOrganizador() {
        return codOrganizador;
    }

    public void setCodOrganizador(Organizadores codOrganizador) {
        this.codOrganizador = codOrganizador;
    }

    public TiposCobros getCodTipcobro() {
        return codTipcobro;
    }

    public void setCodTipcobro(TiposCobros codTipcobro) {
        this.codTipcobro = codTipcobro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (propautoPK != null ? propautoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Propauto)) {
            return false;
        }
        Propauto other = (Propauto) object;
        if ((this.propautoPK == null && other.propautoPK != null) || (this.propautoPK != null && !this.propautoPK.equals(other.propautoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Propauto[ propautoPK=" + propautoPK + " ]";
    }
    
}
