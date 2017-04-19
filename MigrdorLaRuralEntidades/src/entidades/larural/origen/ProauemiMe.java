/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "PROAUEMI_ME", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "ProauemiMe.findAll", query = "SELECT p FROM ProauemiMe p"),
    @NamedQuery(name = "ProauemiMe.findByEjercicio", query = "SELECT p FROM ProauemiMe p WHERE p.proauemiMePK.ejercicio = :ejercicio"),
    @NamedQuery(name = "ProauemiMe.findBySecc", query = "SELECT p FROM ProauemiMe p WHERE p.proauemiMePK.secc = :secc"),
    @NamedQuery(name = "ProauemiMe.findByPolnro", query = "SELECT p FROM ProauemiMe p WHERE p.proauemiMePK.polnro = :polnro"),
    @NamedQuery(name = "ProauemiMe.findByAnexo", query = "SELECT p FROM ProauemiMe p WHERE p.proauemiMePK.anexo = :anexo"),
    @NamedQuery(name = "ProauemiMe.findByTipoSeguro", query = "SELECT p FROM ProauemiMe p WHERE p.proauemiMePK.tipoSeguro = :tipoSeguro"),
    @NamedQuery(name = "ProauemiMe.findByTipoOperacion", query = "SELECT p FROM ProauemiMe p WHERE p.proauemiMePK.tipoOperacion = :tipoOperacion"),
    @NamedQuery(name = "ProauemiMe.findByItem", query = "SELECT p FROM ProauemiMe p WHERE p.proauemiMePK.item = :item"),
    @NamedQuery(name = "ProauemiMe.findByCasco", query = "SELECT p FROM ProauemiMe p WHERE p.casco = :casco"),
    @NamedQuery(name = "ProauemiMe.findByPrimaCasco", query = "SELECT p FROM ProauemiMe p WHERE p.primaCasco = :primaCasco"),
    @NamedQuery(name = "ProauemiMe.findByCapitalIncendio", query = "SELECT p FROM ProauemiMe p WHERE p.capitalIncendio = :capitalIncendio"),
    @NamedQuery(name = "ProauemiMe.findByCapitalAccidente", query = "SELECT p FROM ProauemiMe p WHERE p.capitalAccidente = :capitalAccidente"),
    @NamedQuery(name = "ProauemiMe.findByCapitalRobo", query = "SELECT p FROM ProauemiMe p WHERE p.capitalRobo = :capitalRobo"),
    @NamedQuery(name = "ProauemiMe.findByPrimaRc", query = "SELECT p FROM ProauemiMe p WHERE p.primaRc = :primaRc"),
    @NamedQuery(name = "ProauemiMe.findByCapRc1", query = "SELECT p FROM ProauemiMe p WHERE p.capRc1 = :capRc1"),
    @NamedQuery(name = "ProauemiMe.findByCapRc2", query = "SELECT p FROM ProauemiMe p WHERE p.capRc2 = :capRc2"),
    @NamedQuery(name = "ProauemiMe.findByCapRc3", query = "SELECT p FROM ProauemiMe p WHERE p.capRc3 = :capRc3"),
    @NamedQuery(name = "ProauemiMe.findByCapAccesorios", query = "SELECT p FROM ProauemiMe p WHERE p.capAccesorios = :capAccesorios"),
    @NamedQuery(name = "ProauemiMe.findByPrimaOtros", query = "SELECT p FROM ProauemiMe p WHERE p.primaOtros = :primaOtros"),
    @NamedQuery(name = "ProauemiMe.findByPrimaRoboViaPublica", query = "SELECT p FROM ProauemiMe p WHERE p.primaRoboViaPublica = :primaRoboViaPublica"),
    @NamedQuery(name = "ProauemiMe.findByPrimaTumultoPopular", query = "SELECT p FROM ProauemiMe p WHERE p.primaTumultoPopular = :primaTumultoPopular"),
    @NamedQuery(name = "ProauemiMe.findByPrimaCoberturaExterior", query = "SELECT p FROM ProauemiMe p WHERE p.primaCoberturaExterior = :primaCoberturaExterior"),
    @NamedQuery(name = "ProauemiMe.findByPrimaAdicional", query = "SELECT p FROM ProauemiMe p WHERE p.primaAdicional = :primaAdicional"),
    @NamedQuery(name = "ProauemiMe.findByCapMuerte", query = "SELECT p FROM ProauemiMe p WHERE p.capMuerte = :capMuerte"),
    @NamedQuery(name = "ProauemiMe.findByPrimaMuerte", query = "SELECT p FROM ProauemiMe p WHERE p.primaMuerte = :primaMuerte"),
    @NamedQuery(name = "ProauemiMe.findByCapIncapacidad", query = "SELECT p FROM ProauemiMe p WHERE p.capIncapacidad = :capIncapacidad"),
    @NamedQuery(name = "ProauemiMe.findByCapGtosMedicos", query = "SELECT p FROM ProauemiMe p WHERE p.capGtosMedicos = :capGtosMedicos"),
    @NamedQuery(name = "ProauemiMe.findByPrimaGtosMedicos", query = "SELECT p FROM ProauemiMe p WHERE p.primaGtosMedicos = :primaGtosMedicos"),
    @NamedQuery(name = "ProauemiMe.findByPrimaAirbag", query = "SELECT p FROM ProauemiMe p WHERE p.primaAirbag = :primaAirbag"),
    @NamedQuery(name = "ProauemiMe.findByCapAirbag", query = "SELECT p FROM ProauemiMe p WHERE p.capAirbag = :capAirbag"),
    @NamedQuery(name = "ProauemiMe.findByCapAcdteRobo", query = "SELECT p FROM ProauemiMe p WHERE p.capAcdteRobo = :capAcdteRobo"),
    @NamedQuery(name = "ProauemiMe.findByPrimaAcdteRobo", query = "SELECT p FROM ProauemiMe p WHERE p.primaAcdteRobo = :primaAcdteRobo"),
    @NamedQuery(name = "ProauemiMe.findByCapRp", query = "SELECT p FROM ProauemiMe p WHERE p.capRp = :capRp"),
    @NamedQuery(name = "ProauemiMe.findByPrimaRp", query = "SELECT p FROM ProauemiMe p WHERE p.primaRp = :primaRp"),
    @NamedQuery(name = "ProauemiMe.findByCapRpRt", query = "SELECT p FROM ProauemiMe p WHERE p.capRpRt = :capRpRt"),
    @NamedQuery(name = "ProauemiMe.findByPrimaRpRt", query = "SELECT p FROM ProauemiMe p WHERE p.primaRpRt = :primaRpRt"),
    @NamedQuery(name = "ProauemiMe.findByPrimaSos", query = "SELECT p FROM ProauemiMe p WHERE p.primaSos = :primaSos"),
    @NamedQuery(name = "ProauemiMe.findByPrimaIncapacidad", query = "SELECT p FROM ProauemiMe p WHERE p.primaIncapacidad = :primaIncapacidad"),
    @NamedQuery(name = "ProauemiMe.findByFranquicia", query = "SELECT p FROM ProauemiMe p WHERE p.franquicia = :franquicia"),
    @NamedQuery(name = "ProauemiMe.findByDctoBonificacion", query = "SELECT p FROM ProauemiMe p WHERE p.dctoBonificacion = :dctoBonificacion"),
    @NamedQuery(name = "ProauemiMe.findByPrimaCarta", query = "SELECT p FROM ProauemiMe p WHERE p.primaCarta = :primaCarta"),
    @NamedQuery(name = "ProauemiMe.findByRespMax", query = "SELECT p FROM ProauemiMe p WHERE p.respMax = :respMax"),
    @NamedQuery(name = "ProauemiMe.findByPrima", query = "SELECT p FROM ProauemiMe p WHERE p.prima = :prima"),
    @NamedQuery(name = "ProauemiMe.findByCapAutoRadio", query = "SELECT p FROM ProauemiMe p WHERE p.capAutoRadio = :capAutoRadio"),
    @NamedQuery(name = "ProauemiMe.findByMontoDctoFlota", query = "SELECT p FROM ProauemiMe p WHERE p.montoDctoFlota = :montoDctoFlota"),
    @NamedQuery(name = "ProauemiMe.findByCapitalCualquierCond", query = "SELECT p FROM ProauemiMe p WHERE p.capitalCualquierCond = :capitalCualquierCond"),
    @NamedQuery(name = "ProauemiMe.findByCapMercaderia", query = "SELECT p FROM ProauemiMe p WHERE p.capMercaderia = :capMercaderia"),
    @NamedQuery(name = "ProauemiMe.findByPrimaMercaderia", query = "SELECT p FROM ProauemiMe p WHERE p.primaMercaderia = :primaMercaderia"),
    @NamedQuery(name = "ProauemiMe.findByCapAntena", query = "SELECT p FROM ProauemiMe p WHERE p.capAntena = :capAntena"),
    @NamedQuery(name = "ProauemiMe.findByCapRuedaAuxilio", query = "SELECT p FROM ProauemiMe p WHERE p.capRuedaAuxilio = :capRuedaAuxilio"),
    @NamedQuery(name = "ProauemiMe.findByCapFaros", query = "SELECT p FROM ProauemiMe p WHERE p.capFaros = :capFaros"),
    @NamedQuery(name = "ProauemiMe.findByCapTasas", query = "SELECT p FROM ProauemiMe p WHERE p.capTasas = :capTasas")})
public class ProauemiMe implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProauemiMePK proauemiMePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "CASCO", nullable = false, precision = 15, scale = 2)
    private BigDecimal casco;
    @Basic(optional = false)
    @Column(name = "PRIMA_CASCO", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaCasco;
    @Basic(optional = false)
    @Column(name = "CAPITAL_INCENDIO", nullable = false, precision = 15, scale = 2)
    private BigDecimal capitalIncendio;
    @Basic(optional = false)
    @Column(name = "CAPITAL_ACCIDENTE", nullable = false, precision = 15, scale = 2)
    private BigDecimal capitalAccidente;
    @Basic(optional = false)
    @Column(name = "CAPITAL_ROBO", nullable = false, precision = 15, scale = 2)
    private BigDecimal capitalRobo;
    @Basic(optional = false)
    @Column(name = "PRIMA_RC", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaRc;
    @Basic(optional = false)
    @Column(name = "CAP_RC1", nullable = false, precision = 15, scale = 2)
    private BigDecimal capRc1;
    @Basic(optional = false)
    @Column(name = "CAP_RC2", nullable = false, precision = 15, scale = 2)
    private BigDecimal capRc2;
    @Basic(optional = false)
    @Column(name = "CAP_RC3", nullable = false, precision = 15, scale = 2)
    private BigDecimal capRc3;
    @Basic(optional = false)
    @Column(name = "CAP_ACCESORIOS", nullable = false, precision = 15, scale = 2)
    private BigDecimal capAccesorios;
    @Basic(optional = false)
    @Column(name = "PRIMA_OTROS", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaOtros;
    @Basic(optional = false)
    @Column(name = "PRIMA_ROBO_VIA_PUBLICA", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaRoboViaPublica;
    @Basic(optional = false)
    @Column(name = "PRIMA_TUMULTO_POPULAR", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaTumultoPopular;
    @Basic(optional = false)
    @Column(name = "PRIMA_COBERTURA_EXTERIOR", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaCoberturaExterior;
    @Basic(optional = false)
    @Column(name = "PRIMA_ADICIONAL", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaAdicional;
    @Basic(optional = false)
    @Column(name = "CAP_MUERTE", nullable = false, precision = 15, scale = 2)
    private BigDecimal capMuerte;
    @Basic(optional = false)
    @Column(name = "PRIMA_MUERTE", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaMuerte;
    @Basic(optional = false)
    @Column(name = "CAP_INCAPACIDAD", nullable = false, precision = 15, scale = 2)
    private BigDecimal capIncapacidad;
    @Basic(optional = false)
    @Column(name = "CAP_GTOS_MEDICOS", nullable = false, precision = 15, scale = 2)
    private BigDecimal capGtosMedicos;
    @Basic(optional = false)
    @Column(name = "PRIMA_GTOS_MEDICOS", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaGtosMedicos;
    @Basic(optional = false)
    @Column(name = "PRIMA_AIRBAG", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaAirbag;
    @Basic(optional = false)
    @Column(name = "CAP_AIRBAG", nullable = false, precision = 15, scale = 2)
    private BigDecimal capAirbag;
    @Basic(optional = false)
    @Column(name = "CAP_ACDTE_ROBO", nullable = false, precision = 15, scale = 2)
    private BigDecimal capAcdteRobo;
    @Basic(optional = false)
    @Column(name = "PRIMA_ACDTE_ROBO", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaAcdteRobo;
    @Basic(optional = false)
    @Column(name = "CAP_RP", nullable = false, precision = 15, scale = 2)
    private BigDecimal capRp;
    @Basic(optional = false)
    @Column(name = "PRIMA_RP", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaRp;
    @Basic(optional = false)
    @Column(name = "CAP_RP_RT", nullable = false, precision = 15, scale = 2)
    private BigDecimal capRpRt;
    @Basic(optional = false)
    @Column(name = "PRIMA_RP_RT", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaRpRt;
    @Basic(optional = false)
    @Column(name = "PRIMA_SOS", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaSos;
    @Basic(optional = false)
    @Column(name = "PRIMA_INCAPACIDAD", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaIncapacidad;
    @Basic(optional = false)
    @Column(name = "FRANQUICIA", nullable = false, precision = 15, scale = 2)
    private BigDecimal franquicia;
    @Basic(optional = false)
    @Column(name = "DCTO_BONIFICACION", nullable = false, precision = 15, scale = 2)
    private BigDecimal dctoBonificacion;
    @Basic(optional = false)
    @Column(name = "PRIMA_CARTA", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaCarta;
    @Basic(optional = false)
    @Column(name = "RESP_MAX", nullable = false, precision = 15, scale = 2)
    private BigDecimal respMax;
    @Basic(optional = false)
    @Column(name = "PRIMA", nullable = false, precision = 15, scale = 2)
    private BigDecimal prima;
    @Basic(optional = false)
    @Column(name = "CAP_AUTO_RADIO", nullable = false, precision = 15, scale = 2)
    private BigDecimal capAutoRadio;
    @Basic(optional = false)
    @Column(name = "MONTO_DCTO_FLOTA", nullable = false, precision = 15, scale = 2)
    private BigDecimal montoDctoFlota;
    @Basic(optional = false)
    @Column(name = "CAPITAL_CUALQUIER_COND", nullable = false, precision = 15, scale = 2)
    private BigDecimal capitalCualquierCond;
    @Basic(optional = false)
    @Column(name = "CAP_MERCADERIA", nullable = false, precision = 15, scale = 2)
    private BigDecimal capMercaderia;
    @Basic(optional = false)
    @Column(name = "PRIMA_MERCADERIA", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaMercaderia;
    @Basic(optional = false)
    @Column(name = "CAP_ANTENA", nullable = false, precision = 15, scale = 2)
    private BigDecimal capAntena;
    @Basic(optional = false)
    @Column(name = "CAP_RUEDA_AUXILIO", nullable = false, precision = 15, scale = 2)
    private BigDecimal capRuedaAuxilio;
    @Basic(optional = false)
    @Column(name = "CAP_FAROS", nullable = false, precision = 15, scale = 2)
    private BigDecimal capFaros;
    @Basic(optional = false)
    @Column(name = "CAP_TASAS", nullable = false, precision = 15, scale = 2)
    private BigDecimal capTasas;
    @JoinColumns({
        @JoinColumn(name = "EJERCICIO", referencedColumnName = "EJERCICIO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "TIPO_SEGURO", referencedColumnName = "TIPO_SEGURO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "TIPO_OPERACION", referencedColumnName = "TIPO_OPERACION", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "SECC", referencedColumnName = "SECC", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "POLNRO", referencedColumnName = "POLNRO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "ANEXO", referencedColumnName = "ANEXO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "ITEM", referencedColumnName = "ITEM", nullable = false, insertable = false, updatable = false)})
    @OneToOne(optional = false)
    private Proauemi proauemi;

    public ProauemiMe() {
    }

    public ProauemiMe(ProauemiMePK proauemiMePK) {
        this.proauemiMePK = proauemiMePK;
    }

    public ProauemiMe(ProauemiMePK proauemiMePK, BigDecimal casco, BigDecimal primaCasco, BigDecimal capitalIncendio, BigDecimal capitalAccidente, BigDecimal capitalRobo, BigDecimal primaRc, BigDecimal capRc1, BigDecimal capRc2, BigDecimal capRc3, BigDecimal capAccesorios, BigDecimal primaOtros, BigDecimal primaRoboViaPublica, BigDecimal primaTumultoPopular, BigDecimal primaCoberturaExterior, BigDecimal primaAdicional, BigDecimal capMuerte, BigDecimal primaMuerte, BigDecimal capIncapacidad, BigDecimal capGtosMedicos, BigDecimal primaGtosMedicos, BigDecimal primaAirbag, BigDecimal capAirbag, BigDecimal capAcdteRobo, BigDecimal primaAcdteRobo, BigDecimal capRp, BigDecimal primaRp, BigDecimal capRpRt, BigDecimal primaRpRt, BigDecimal primaSos, BigDecimal primaIncapacidad, BigDecimal franquicia, BigDecimal dctoBonificacion, BigDecimal primaCarta, BigDecimal respMax, BigDecimal prima, BigDecimal capAutoRadio, BigDecimal montoDctoFlota, BigDecimal capitalCualquierCond, BigDecimal capMercaderia, BigDecimal primaMercaderia, BigDecimal capAntena, BigDecimal capRuedaAuxilio, BigDecimal capFaros, BigDecimal capTasas) {
        this.proauemiMePK = proauemiMePK;
        this.casco = casco;
        this.primaCasco = primaCasco;
        this.capitalIncendio = capitalIncendio;
        this.capitalAccidente = capitalAccidente;
        this.capitalRobo = capitalRobo;
        this.primaRc = primaRc;
        this.capRc1 = capRc1;
        this.capRc2 = capRc2;
        this.capRc3 = capRc3;
        this.capAccesorios = capAccesorios;
        this.primaOtros = primaOtros;
        this.primaRoboViaPublica = primaRoboViaPublica;
        this.primaTumultoPopular = primaTumultoPopular;
        this.primaCoberturaExterior = primaCoberturaExterior;
        this.primaAdicional = primaAdicional;
        this.capMuerte = capMuerte;
        this.primaMuerte = primaMuerte;
        this.capIncapacidad = capIncapacidad;
        this.capGtosMedicos = capGtosMedicos;
        this.primaGtosMedicos = primaGtosMedicos;
        this.primaAirbag = primaAirbag;
        this.capAirbag = capAirbag;
        this.capAcdteRobo = capAcdteRobo;
        this.primaAcdteRobo = primaAcdteRobo;
        this.capRp = capRp;
        this.primaRp = primaRp;
        this.capRpRt = capRpRt;
        this.primaRpRt = primaRpRt;
        this.primaSos = primaSos;
        this.primaIncapacidad = primaIncapacidad;
        this.franquicia = franquicia;
        this.dctoBonificacion = dctoBonificacion;
        this.primaCarta = primaCarta;
        this.respMax = respMax;
        this.prima = prima;
        this.capAutoRadio = capAutoRadio;
        this.montoDctoFlota = montoDctoFlota;
        this.capitalCualquierCond = capitalCualquierCond;
        this.capMercaderia = capMercaderia;
        this.primaMercaderia = primaMercaderia;
        this.capAntena = capAntena;
        this.capRuedaAuxilio = capRuedaAuxilio;
        this.capFaros = capFaros;
        this.capTasas = capTasas;
    }

    public ProauemiMe(short ejercicio, short secc, int polnro, short anexo, short tipoSeguro, short tipoOperacion, int item) {
        this.proauemiMePK = new ProauemiMePK(ejercicio, secc, polnro, anexo, tipoSeguro, tipoOperacion, item);
    }

    public ProauemiMePK getProauemiMePK() {
        return proauemiMePK;
    }

    public void setProauemiMePK(ProauemiMePK proauemiMePK) {
        this.proauemiMePK = proauemiMePK;
    }

    public BigDecimal getCasco() {
        return casco;
    }

    public void setCasco(BigDecimal casco) {
        this.casco = casco;
    }

    public BigDecimal getPrimaCasco() {
        return primaCasco;
    }

    public void setPrimaCasco(BigDecimal primaCasco) {
        this.primaCasco = primaCasco;
    }

    public BigDecimal getCapitalIncendio() {
        return capitalIncendio;
    }

    public void setCapitalIncendio(BigDecimal capitalIncendio) {
        this.capitalIncendio = capitalIncendio;
    }

    public BigDecimal getCapitalAccidente() {
        return capitalAccidente;
    }

    public void setCapitalAccidente(BigDecimal capitalAccidente) {
        this.capitalAccidente = capitalAccidente;
    }

    public BigDecimal getCapitalRobo() {
        return capitalRobo;
    }

    public void setCapitalRobo(BigDecimal capitalRobo) {
        this.capitalRobo = capitalRobo;
    }

    public BigDecimal getPrimaRc() {
        return primaRc;
    }

    public void setPrimaRc(BigDecimal primaRc) {
        this.primaRc = primaRc;
    }

    public BigDecimal getCapRc1() {
        return capRc1;
    }

    public void setCapRc1(BigDecimal capRc1) {
        this.capRc1 = capRc1;
    }

    public BigDecimal getCapRc2() {
        return capRc2;
    }

    public void setCapRc2(BigDecimal capRc2) {
        this.capRc2 = capRc2;
    }

    public BigDecimal getCapRc3() {
        return capRc3;
    }

    public void setCapRc3(BigDecimal capRc3) {
        this.capRc3 = capRc3;
    }

    public BigDecimal getCapAccesorios() {
        return capAccesorios;
    }

    public void setCapAccesorios(BigDecimal capAccesorios) {
        this.capAccesorios = capAccesorios;
    }

    public BigDecimal getPrimaOtros() {
        return primaOtros;
    }

    public void setPrimaOtros(BigDecimal primaOtros) {
        this.primaOtros = primaOtros;
    }

    public BigDecimal getPrimaRoboViaPublica() {
        return primaRoboViaPublica;
    }

    public void setPrimaRoboViaPublica(BigDecimal primaRoboViaPublica) {
        this.primaRoboViaPublica = primaRoboViaPublica;
    }

    public BigDecimal getPrimaTumultoPopular() {
        return primaTumultoPopular;
    }

    public void setPrimaTumultoPopular(BigDecimal primaTumultoPopular) {
        this.primaTumultoPopular = primaTumultoPopular;
    }

    public BigDecimal getPrimaCoberturaExterior() {
        return primaCoberturaExterior;
    }

    public void setPrimaCoberturaExterior(BigDecimal primaCoberturaExterior) {
        this.primaCoberturaExterior = primaCoberturaExterior;
    }

    public BigDecimal getPrimaAdicional() {
        return primaAdicional;
    }

    public void setPrimaAdicional(BigDecimal primaAdicional) {
        this.primaAdicional = primaAdicional;
    }

    public BigDecimal getCapMuerte() {
        return capMuerte;
    }

    public void setCapMuerte(BigDecimal capMuerte) {
        this.capMuerte = capMuerte;
    }

    public BigDecimal getPrimaMuerte() {
        return primaMuerte;
    }

    public void setPrimaMuerte(BigDecimal primaMuerte) {
        this.primaMuerte = primaMuerte;
    }

    public BigDecimal getCapIncapacidad() {
        return capIncapacidad;
    }

    public void setCapIncapacidad(BigDecimal capIncapacidad) {
        this.capIncapacidad = capIncapacidad;
    }

    public BigDecimal getCapGtosMedicos() {
        return capGtosMedicos;
    }

    public void setCapGtosMedicos(BigDecimal capGtosMedicos) {
        this.capGtosMedicos = capGtosMedicos;
    }

    public BigDecimal getPrimaGtosMedicos() {
        return primaGtosMedicos;
    }

    public void setPrimaGtosMedicos(BigDecimal primaGtosMedicos) {
        this.primaGtosMedicos = primaGtosMedicos;
    }

    public BigDecimal getPrimaAirbag() {
        return primaAirbag;
    }

    public void setPrimaAirbag(BigDecimal primaAirbag) {
        this.primaAirbag = primaAirbag;
    }

    public BigDecimal getCapAirbag() {
        return capAirbag;
    }

    public void setCapAirbag(BigDecimal capAirbag) {
        this.capAirbag = capAirbag;
    }

    public BigDecimal getCapAcdteRobo() {
        return capAcdteRobo;
    }

    public void setCapAcdteRobo(BigDecimal capAcdteRobo) {
        this.capAcdteRobo = capAcdteRobo;
    }

    public BigDecimal getPrimaAcdteRobo() {
        return primaAcdteRobo;
    }

    public void setPrimaAcdteRobo(BigDecimal primaAcdteRobo) {
        this.primaAcdteRobo = primaAcdteRobo;
    }

    public BigDecimal getCapRp() {
        return capRp;
    }

    public void setCapRp(BigDecimal capRp) {
        this.capRp = capRp;
    }

    public BigDecimal getPrimaRp() {
        return primaRp;
    }

    public void setPrimaRp(BigDecimal primaRp) {
        this.primaRp = primaRp;
    }

    public BigDecimal getCapRpRt() {
        return capRpRt;
    }

    public void setCapRpRt(BigDecimal capRpRt) {
        this.capRpRt = capRpRt;
    }

    public BigDecimal getPrimaRpRt() {
        return primaRpRt;
    }

    public void setPrimaRpRt(BigDecimal primaRpRt) {
        this.primaRpRt = primaRpRt;
    }

    public BigDecimal getPrimaSos() {
        return primaSos;
    }

    public void setPrimaSos(BigDecimal primaSos) {
        this.primaSos = primaSos;
    }

    public BigDecimal getPrimaIncapacidad() {
        return primaIncapacidad;
    }

    public void setPrimaIncapacidad(BigDecimal primaIncapacidad) {
        this.primaIncapacidad = primaIncapacidad;
    }

    public BigDecimal getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(BigDecimal franquicia) {
        this.franquicia = franquicia;
    }

    public BigDecimal getDctoBonificacion() {
        return dctoBonificacion;
    }

    public void setDctoBonificacion(BigDecimal dctoBonificacion) {
        this.dctoBonificacion = dctoBonificacion;
    }

    public BigDecimal getPrimaCarta() {
        return primaCarta;
    }

    public void setPrimaCarta(BigDecimal primaCarta) {
        this.primaCarta = primaCarta;
    }

    public BigDecimal getRespMax() {
        return respMax;
    }

    public void setRespMax(BigDecimal respMax) {
        this.respMax = respMax;
    }

    public BigDecimal getPrima() {
        return prima;
    }

    public void setPrima(BigDecimal prima) {
        this.prima = prima;
    }

    public BigDecimal getCapAutoRadio() {
        return capAutoRadio;
    }

    public void setCapAutoRadio(BigDecimal capAutoRadio) {
        this.capAutoRadio = capAutoRadio;
    }

    public BigDecimal getMontoDctoFlota() {
        return montoDctoFlota;
    }

    public void setMontoDctoFlota(BigDecimal montoDctoFlota) {
        this.montoDctoFlota = montoDctoFlota;
    }

    public BigDecimal getCapitalCualquierCond() {
        return capitalCualquierCond;
    }

    public void setCapitalCualquierCond(BigDecimal capitalCualquierCond) {
        this.capitalCualquierCond = capitalCualquierCond;
    }

    public BigDecimal getCapMercaderia() {
        return capMercaderia;
    }

    public void setCapMercaderia(BigDecimal capMercaderia) {
        this.capMercaderia = capMercaderia;
    }

    public BigDecimal getPrimaMercaderia() {
        return primaMercaderia;
    }

    public void setPrimaMercaderia(BigDecimal primaMercaderia) {
        this.primaMercaderia = primaMercaderia;
    }

    public BigDecimal getCapAntena() {
        return capAntena;
    }

    public void setCapAntena(BigDecimal capAntena) {
        this.capAntena = capAntena;
    }

    public BigDecimal getCapRuedaAuxilio() {
        return capRuedaAuxilio;
    }

    public void setCapRuedaAuxilio(BigDecimal capRuedaAuxilio) {
        this.capRuedaAuxilio = capRuedaAuxilio;
    }

    public BigDecimal getCapFaros() {
        return capFaros;
    }

    public void setCapFaros(BigDecimal capFaros) {
        this.capFaros = capFaros;
    }

    public BigDecimal getCapTasas() {
        return capTasas;
    }

    public void setCapTasas(BigDecimal capTasas) {
        this.capTasas = capTasas;
    }

    public Proauemi getProauemi() {
        return proauemi;
    }

    public void setProauemi(Proauemi proauemi) {
        this.proauemi = proauemi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proauemiMePK != null ? proauemiMePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProauemiMe)) {
            return false;
        }
        ProauemiMe other = (ProauemiMe) object;
        if ((this.proauemiMePK == null && other.proauemiMePK != null) || (this.proauemiMePK != null && !this.proauemiMePK.equals(other.proauemiMePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.ProauemiMe[ proauemiMePK=" + proauemiMePK + " ]";
    }
    
}
