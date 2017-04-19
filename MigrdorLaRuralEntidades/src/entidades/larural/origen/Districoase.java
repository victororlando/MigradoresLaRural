/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "DISTRICOASE", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "Districoase.findAll", query = "SELECT d FROM Districoase d"),
    @NamedQuery(name = "Districoase.findByEjercicio", query = "SELECT d FROM Districoase d WHERE d.districoasePK.ejercicio = :ejercicio"),
    @NamedQuery(name = "Districoase.findByTipoSeguro", query = "SELECT d FROM Districoase d WHERE d.districoasePK.tipoSeguro = :tipoSeguro"),
    @NamedQuery(name = "Districoase.findByTipoOperacion", query = "SELECT d FROM Districoase d WHERE d.districoasePK.tipoOperacion = :tipoOperacion"),
    @NamedQuery(name = "Districoase.findBySecc", query = "SELECT d FROM Districoase d WHERE d.districoasePK.secc = :secc"),
    @NamedQuery(name = "Districoase.findByAnexo", query = "SELECT d FROM Districoase d WHERE d.districoasePK.anexo = :anexo"),
    @NamedQuery(name = "Districoase.findByPolnro", query = "SELECT d FROM Districoase d WHERE d.districoasePK.polnro = :polnro"),
    @NamedQuery(name = "Districoase.findByNCia", query = "SELECT d FROM Districoase d WHERE d.districoasePK.nCia = :nCia"),
    @NamedQuery(name = "Districoase.findByPctPartic", query = "SELECT d FROM Districoase d WHERE d.pctPartic = :pctPartic"),
    @NamedQuery(name = "Districoase.findBySumaseg", query = "SELECT d FROM Districoase d WHERE d.sumaseg = :sumaseg"),
    @NamedQuery(name = "Districoase.findBySumasegMe", query = "SELECT d FROM Districoase d WHERE d.sumasegMe = :sumasegMe"),
    @NamedQuery(name = "Districoase.findByPrima", query = "SELECT d FROM Districoase d WHERE d.prima = :prima"),
    @NamedQuery(name = "Districoase.findByPrimaMe", query = "SELECT d FROM Districoase d WHERE d.primaMe = :primaMe"),
    @NamedQuery(name = "Districoase.findByIva", query = "SELECT d FROM Districoase d WHERE d.iva = :iva"),
    @NamedQuery(name = "Districoase.findByIvaMe", query = "SELECT d FROM Districoase d WHERE d.ivaMe = :ivaMe"),
    @NamedQuery(name = "Districoase.findByGtosAdmi", query = "SELECT d FROM Districoase d WHERE d.gtosAdmi = :gtosAdmi"),
    @NamedQuery(name = "Districoase.findByGtosAdmiMe", query = "SELECT d FROM Districoase d WHERE d.gtosAdmiMe = :gtosAdmiMe"),
    @NamedQuery(name = "Districoase.findByRpf", query = "SELECT d FROM Districoase d WHERE d.rpf = :rpf"),
    @NamedQuery(name = "Districoase.findByRpfMe", query = "SELECT d FROM Districoase d WHERE d.rpfMe = :rpfMe"),
    @NamedQuery(name = "Districoase.findByPremio", query = "SELECT d FROM Districoase d WHERE d.premio = :premio"),
    @NamedQuery(name = "Districoase.findByPremioMe", query = "SELECT d FROM Districoase d WHERE d.premioMe = :premioMe"),
    @NamedQuery(name = "Districoase.findByImpuesto", query = "SELECT d FROM Districoase d WHERE d.impuesto = :impuesto"),
    @NamedQuery(name = "Districoase.findByImpuestoMe", query = "SELECT d FROM Districoase d WHERE d.impuestoMe = :impuestoMe"),
    @NamedQuery(name = "Districoase.findBySaldoDxp", query = "SELECT d FROM Districoase d WHERE d.saldoDxp = :saldoDxp"),
    @NamedQuery(name = "Districoase.findBySaldoDxpMe", query = "SELECT d FROM Districoase d WHERE d.saldoDxpMe = :saldoDxpMe"),
    @NamedQuery(name = "Districoase.findBySdoImpto", query = "SELECT d FROM Districoase d WHERE d.sdoImpto = :sdoImpto"),
    @NamedQuery(name = "Districoase.findBySdoImptoMe", query = "SELECT d FROM Districoase d WHERE d.sdoImptoMe = :sdoImptoMe"),
    @NamedQuery(name = "Districoase.findByCobros", query = "SELECT d FROM Districoase d WHERE d.cobros = :cobros"),
    @NamedQuery(name = "Districoase.findByCobrosMe", query = "SELECT d FROM Districoase d WHERE d.cobrosMe = :cobrosMe"),
    @NamedQuery(name = "Districoase.findByDxpAnulado", query = "SELECT d FROM Districoase d WHERE d.dxpAnulado = :dxpAnulado"),
    @NamedQuery(name = "Districoase.findByDxpAnuladoMe", query = "SELECT d FROM Districoase d WHERE d.dxpAnuladoMe = :dxpAnuladoMe"),
    @NamedQuery(name = "Districoase.findByImptoAnulado", query = "SELECT d FROM Districoase d WHERE d.imptoAnulado = :imptoAnulado"),
    @NamedQuery(name = "Districoase.findByImptoAnuladoMe", query = "SELECT d FROM Districoase d WHERE d.imptoAnuladoMe = :imptoAnuladoMe"),
    @NamedQuery(name = "Districoase.findByUltpago", query = "SELECT d FROM Districoase d WHERE d.ultpago = :ultpago"),
    @NamedQuery(name = "Districoase.findByPolizaCoa", query = "SELECT d FROM Districoase d WHERE d.polizaCoa = :polizaCoa"),
    @NamedQuery(name = "Districoase.findByAcreditado", query = "SELECT d FROM Districoase d WHERE d.acreditado = :acreditado"),
    @NamedQuery(name = "Districoase.findByAcreditadoMe", query = "SELECT d FROM Districoase d WHERE d.acreditadoMe = :acreditadoMe"),
    @NamedQuery(name = "Districoase.findByPagado", query = "SELECT d FROM Districoase d WHERE d.pagado = :pagado"),
    @NamedQuery(name = "Districoase.findByPagadoMe", query = "SELECT d FROM Districoase d WHERE d.pagadoMe = :pagadoMe"),
    @NamedQuery(name = "Districoase.findBySaldoAPagar", query = "SELECT d FROM Districoase d WHERE d.saldoAPagar = :saldoAPagar"),
    @NamedQuery(name = "Districoase.findBySaldoAPagarMe", query = "SELECT d FROM Districoase d WHERE d.saldoAPagarMe = :saldoAPagarMe"),
    @NamedQuery(name = "Districoase.findByMontoNoIng", query = "SELECT d FROM Districoase d WHERE d.montoNoIng = :montoNoIng"),
    @NamedQuery(name = "Districoase.findByMontoNoIngMe", query = "SELECT d FROM Districoase d WHERE d.montoNoIngMe = :montoNoIngMe"),
    @NamedQuery(name = "Districoase.findBySdoPrima", query = "SELECT d FROM Districoase d WHERE d.sdoPrima = :sdoPrima"),
    @NamedQuery(name = "Districoase.findBySdoPrimaMe", query = "SELECT d FROM Districoase d WHERE d.sdoPrimaMe = :sdoPrimaMe"),
    @NamedQuery(name = "Districoase.findBySdoGtosAdmi", query = "SELECT d FROM Districoase d WHERE d.sdoGtosAdmi = :sdoGtosAdmi"),
    @NamedQuery(name = "Districoase.findBySdoGtosAdmiMe", query = "SELECT d FROM Districoase d WHERE d.sdoGtosAdmiMe = :sdoGtosAdmiMe"),
    @NamedQuery(name = "Districoase.findBySdoRpf", query = "SELECT d FROM Districoase d WHERE d.sdoRpf = :sdoRpf"),
    @NamedQuery(name = "Districoase.findBySdoRpfMe", query = "SELECT d FROM Districoase d WHERE d.sdoRpfMe = :sdoRpfMe"),
    @NamedQuery(name = "Districoase.findBySdoPremio", query = "SELECT d FROM Districoase d WHERE d.sdoPremio = :sdoPremio"),
    @NamedQuery(name = "Districoase.findBySdoPremioMe", query = "SELECT d FROM Districoase d WHERE d.sdoPremioMe = :sdoPremioMe"),
    @NamedQuery(name = "Districoase.findBySdoIva", query = "SELECT d FROM Districoase d WHERE d.sdoIva = :sdoIva"),
    @NamedQuery(name = "Districoase.findBySdoIvaMe", query = "SELECT d FROM Districoase d WHERE d.sdoIvaMe = :sdoIvaMe"),
    @NamedQuery(name = "Districoase.findBySdoSumaseg", query = "SELECT d FROM Districoase d WHERE d.sdoSumaseg = :sdoSumaseg"),
    @NamedQuery(name = "Districoase.findBySdoSumasegMe", query = "SELECT d FROM Districoase d WHERE d.sdoSumasegMe = :sdoSumasegMe"),
    @NamedQuery(name = "Districoase.findByStroPend", query = "SELECT d FROM Districoase d WHERE d.stroPend = :stroPend"),
    @NamedQuery(name = "Districoase.findByStroPendMe", query = "SELECT d FROM Districoase d WHERE d.stroPendMe = :stroPendMe"),
    @NamedQuery(name = "Districoase.findByPgStro", query = "SELECT d FROM Districoase d WHERE d.pgStro = :pgStro"),
    @NamedQuery(name = "Districoase.findByPgStroMe", query = "SELECT d FROM Districoase d WHERE d.pgStroMe = :pgStroMe"),
    @NamedQuery(name = "Districoase.findByPgGtos", query = "SELECT d FROM Districoase d WHERE d.pgGtos = :pgGtos"),
    @NamedQuery(name = "Districoase.findByPgGtosMe", query = "SELECT d FROM Districoase d WHERE d.pgGtosMe = :pgGtosMe"),
    @NamedQuery(name = "Districoase.findBySdoPgStro", query = "SELECT d FROM Districoase d WHERE d.sdoPgStro = :sdoPgStro"),
    @NamedQuery(name = "Districoase.findBySdoPgStroMe", query = "SELECT d FROM Districoase d WHERE d.sdoPgStroMe = :sdoPgStroMe"),
    @NamedQuery(name = "Districoase.findBySdoPgGtos", query = "SELECT d FROM Districoase d WHERE d.sdoPgGtos = :sdoPgGtos"),
    @NamedQuery(name = "Districoase.findBySdoPgGtosMe", query = "SELECT d FROM Districoase d WHERE d.sdoPgGtosMe = :sdoPgGtosMe")})
public class Districoase implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DistricoasePK districoasePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PCT_PARTIC", precision = 8, scale = 5)
    private BigDecimal pctPartic;
    @Column(name = "SUMASEG")
    private Long sumaseg;
    @Column(name = "SUMASEG_ME", precision = 15, scale = 2)
    private BigDecimal sumasegMe;
    @Column(name = "PRIMA")
    private Long prima;
    @Column(name = "PRIMA_ME", precision = 15, scale = 2)
    private BigDecimal primaMe;
    @Column(name = "IVA")
    private Long iva;
    @Basic(optional = false)
    @Column(name = "IVA_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal ivaMe;
    @Column(name = "GTOS_ADMI")
    private Long gtosAdmi;
    @Column(name = "GTOS_ADMI_ME", precision = 15, scale = 2)
    private BigDecimal gtosAdmiMe;
    @Column(name = "RPF")
    private Long rpf;
    @Column(name = "RPF_ME", precision = 15, scale = 2)
    private BigDecimal rpfMe;
    @Column(name = "PREMIO")
    private Long premio;
    @Column(name = "PREMIO_ME", precision = 15, scale = 2)
    private BigDecimal premioMe;
    @Column(name = "IMPUESTO")
    private Long impuesto;
    @Column(name = "IMPUESTO_ME", precision = 15, scale = 2)
    private BigDecimal impuestoMe;
    @Column(name = "SALDO_DXP")
    private Long saldoDxp;
    @Column(name = "SALDO_DXP_ME", precision = 15, scale = 2)
    private BigDecimal saldoDxpMe;
    @Column(name = "SDO_IMPTO")
    private Long sdoImpto;
    @Column(name = "SDO_IMPTO_ME", precision = 15, scale = 2)
    private BigDecimal sdoImptoMe;
    @Column(name = "COBROS")
    private Long cobros;
    @Column(name = "COBROS_ME", precision = 15, scale = 2)
    private BigDecimal cobrosMe;
    @Column(name = "DXP_ANULADO")
    private Long dxpAnulado;
    @Column(name = "DXP_ANULADO_ME", precision = 15, scale = 2)
    private BigDecimal dxpAnuladoMe;
    @Column(name = "IMPTO_ANULADO")
    private Long imptoAnulado;
    @Column(name = "IMPTO_ANULADO_ME", precision = 15, scale = 2)
    private BigDecimal imptoAnuladoMe;
    @Column(name = "ULTPAGO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultpago;
    @Column(name = "POLIZA_COA", length = 20)
    private String polizaCoa;
    @Column(name = "ACREDITADO")
    private Long acreditado;
    @Column(name = "ACREDITADO_ME", precision = 15, scale = 2)
    private BigDecimal acreditadoMe;
    @Column(name = "PAGADO")
    private Long pagado;
    @Column(name = "PAGADO_ME", precision = 15, scale = 2)
    private BigDecimal pagadoMe;
    @Column(name = "SALDO_A_PAGAR")
    private Long saldoAPagar;
    @Column(name = "SALDO_A_PAGAR_ME", precision = 15, scale = 2)
    private BigDecimal saldoAPagarMe;
    @Column(name = "MONTO_NO_ING")
    private Long montoNoIng;
    @Column(name = "MONTO_NO_ING_ME", precision = 15, scale = 2)
    private BigDecimal montoNoIngMe;
    @Column(name = "SDO_PRIMA")
    private Long sdoPrima;
    @Column(name = "SDO_PRIMA_ME", precision = 15, scale = 2)
    private BigDecimal sdoPrimaMe;
    @Column(name = "SDO_GTOS_ADMI")
    private Long sdoGtosAdmi;
    @Column(name = "SDO_GTOS_ADMI_ME", precision = 15, scale = 2)
    private BigDecimal sdoGtosAdmiMe;
    @Column(name = "SDO_RPF")
    private Long sdoRpf;
    @Column(name = "SDO_RPF_ME", precision = 15, scale = 2)
    private BigDecimal sdoRpfMe;
    @Column(name = "SDO_PREMIO")
    private Long sdoPremio;
    @Column(name = "SDO_PREMIO_ME", precision = 15, scale = 2)
    private BigDecimal sdoPremioMe;
    @Column(name = "SDO_IVA")
    private Long sdoIva;
    @Column(name = "SDO_IVA_ME", precision = 15, scale = 2)
    private BigDecimal sdoIvaMe;
    @Column(name = "SDO_SUMASEG")
    private Long sdoSumaseg;
    @Column(name = "SDO_SUMASEG_ME", precision = 15, scale = 2)
    private BigDecimal sdoSumasegMe;
    @Column(name = "STRO_PEND")
    private Long stroPend;
    @Column(name = "STRO_PEND_ME", precision = 15, scale = 2)
    private BigDecimal stroPendMe;
    @Column(name = "PG_STRO")
    private Long pgStro;
    @Column(name = "PG_STRO_ME", precision = 15, scale = 2)
    private BigDecimal pgStroMe;
    @Column(name = "PG_GTOS")
    private Long pgGtos;
    @Column(name = "PG_GTOS_ME", precision = 15, scale = 2)
    private BigDecimal pgGtosMe;
    @Column(name = "SDO_PG_STRO")
    private Long sdoPgStro;
    @Column(name = "SDO_PG_STRO_ME", precision = 15, scale = 2)
    private BigDecimal sdoPgStroMe;
    @Column(name = "SDO_PG_GTOS")
    private Long sdoPgGtos;
    @Column(name = "SDO_PG_GTOS_ME", precision = 15, scale = 2)
    private BigDecimal sdoPgGtosMe;
    @JoinColumn(name = "N_CIA", referencedColumnName = "N_CIA", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lisciare lisciare;
    @JoinColumns({
        @JoinColumn(name = "EJERCICIO", referencedColumnName = "EJERCICIO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "TIPO_SEGURO", referencedColumnName = "TIPO_SEGURO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "TIPO_OPERACION", referencedColumnName = "TIPO_OPERACION", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "SECC", referencedColumnName = "SECC", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "POLNRO", referencedColumnName = "POLNRO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "ANEXO", referencedColumnName = "ANEXO", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Polsdemi polsdemi;

    public Districoase() {
    }

    public Districoase(DistricoasePK districoasePK) {
        this.districoasePK = districoasePK;
    }

    public Districoase(DistricoasePK districoasePK, BigDecimal ivaMe) {
        this.districoasePK = districoasePK;
        this.ivaMe = ivaMe;
    }

    public Districoase(short ejercicio, short tipoSeguro, short tipoOperacion, short secc, short anexo, int polnro, short nCia) {
        this.districoasePK = new DistricoasePK(ejercicio, tipoSeguro, tipoOperacion, secc, anexo, polnro, nCia);
    }

    public DistricoasePK getDistricoasePK() {
        return districoasePK;
    }

    public void setDistricoasePK(DistricoasePK districoasePK) {
        this.districoasePK = districoasePK;
    }

    public BigDecimal getPctPartic() {
        return pctPartic;
    }

    public void setPctPartic(BigDecimal pctPartic) {
        this.pctPartic = pctPartic;
    }

    public Long getSumaseg() {
        return sumaseg;
    }

    public void setSumaseg(Long sumaseg) {
        this.sumaseg = sumaseg;
    }

    public BigDecimal getSumasegMe() {
        return sumasegMe;
    }

    public void setSumasegMe(BigDecimal sumasegMe) {
        this.sumasegMe = sumasegMe;
    }

    public Long getPrima() {
        return prima;
    }

    public void setPrima(Long prima) {
        this.prima = prima;
    }

    public BigDecimal getPrimaMe() {
        return primaMe;
    }

    public void setPrimaMe(BigDecimal primaMe) {
        this.primaMe = primaMe;
    }

    public Long getIva() {
        return iva;
    }

    public void setIva(Long iva) {
        this.iva = iva;
    }

    public BigDecimal getIvaMe() {
        return ivaMe;
    }

    public void setIvaMe(BigDecimal ivaMe) {
        this.ivaMe = ivaMe;
    }

    public Long getGtosAdmi() {
        return gtosAdmi;
    }

    public void setGtosAdmi(Long gtosAdmi) {
        this.gtosAdmi = gtosAdmi;
    }

    public BigDecimal getGtosAdmiMe() {
        return gtosAdmiMe;
    }

    public void setGtosAdmiMe(BigDecimal gtosAdmiMe) {
        this.gtosAdmiMe = gtosAdmiMe;
    }

    public Long getRpf() {
        return rpf;
    }

    public void setRpf(Long rpf) {
        this.rpf = rpf;
    }

    public BigDecimal getRpfMe() {
        return rpfMe;
    }

    public void setRpfMe(BigDecimal rpfMe) {
        this.rpfMe = rpfMe;
    }

    public Long getPremio() {
        return premio;
    }

    public void setPremio(Long premio) {
        this.premio = premio;
    }

    public BigDecimal getPremioMe() {
        return premioMe;
    }

    public void setPremioMe(BigDecimal premioMe) {
        this.premioMe = premioMe;
    }

    public Long getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Long impuesto) {
        this.impuesto = impuesto;
    }

    public BigDecimal getImpuestoMe() {
        return impuestoMe;
    }

    public void setImpuestoMe(BigDecimal impuestoMe) {
        this.impuestoMe = impuestoMe;
    }

    public Long getSaldoDxp() {
        return saldoDxp;
    }

    public void setSaldoDxp(Long saldoDxp) {
        this.saldoDxp = saldoDxp;
    }

    public BigDecimal getSaldoDxpMe() {
        return saldoDxpMe;
    }

    public void setSaldoDxpMe(BigDecimal saldoDxpMe) {
        this.saldoDxpMe = saldoDxpMe;
    }

    public Long getSdoImpto() {
        return sdoImpto;
    }

    public void setSdoImpto(Long sdoImpto) {
        this.sdoImpto = sdoImpto;
    }

    public BigDecimal getSdoImptoMe() {
        return sdoImptoMe;
    }

    public void setSdoImptoMe(BigDecimal sdoImptoMe) {
        this.sdoImptoMe = sdoImptoMe;
    }

    public Long getCobros() {
        return cobros;
    }

    public void setCobros(Long cobros) {
        this.cobros = cobros;
    }

    public BigDecimal getCobrosMe() {
        return cobrosMe;
    }

    public void setCobrosMe(BigDecimal cobrosMe) {
        this.cobrosMe = cobrosMe;
    }

    public Long getDxpAnulado() {
        return dxpAnulado;
    }

    public void setDxpAnulado(Long dxpAnulado) {
        this.dxpAnulado = dxpAnulado;
    }

    public BigDecimal getDxpAnuladoMe() {
        return dxpAnuladoMe;
    }

    public void setDxpAnuladoMe(BigDecimal dxpAnuladoMe) {
        this.dxpAnuladoMe = dxpAnuladoMe;
    }

    public Long getImptoAnulado() {
        return imptoAnulado;
    }

    public void setImptoAnulado(Long imptoAnulado) {
        this.imptoAnulado = imptoAnulado;
    }

    public BigDecimal getImptoAnuladoMe() {
        return imptoAnuladoMe;
    }

    public void setImptoAnuladoMe(BigDecimal imptoAnuladoMe) {
        this.imptoAnuladoMe = imptoAnuladoMe;
    }

    public Date getUltpago() {
        return ultpago;
    }

    public void setUltpago(Date ultpago) {
        this.ultpago = ultpago;
    }

    public String getPolizaCoa() {
        return polizaCoa;
    }

    public void setPolizaCoa(String polizaCoa) {
        this.polizaCoa = polizaCoa;
    }

    public Long getAcreditado() {
        return acreditado;
    }

    public void setAcreditado(Long acreditado) {
        this.acreditado = acreditado;
    }

    public BigDecimal getAcreditadoMe() {
        return acreditadoMe;
    }

    public void setAcreditadoMe(BigDecimal acreditadoMe) {
        this.acreditadoMe = acreditadoMe;
    }

    public Long getPagado() {
        return pagado;
    }

    public void setPagado(Long pagado) {
        this.pagado = pagado;
    }

    public BigDecimal getPagadoMe() {
        return pagadoMe;
    }

    public void setPagadoMe(BigDecimal pagadoMe) {
        this.pagadoMe = pagadoMe;
    }

    public Long getSaldoAPagar() {
        return saldoAPagar;
    }

    public void setSaldoAPagar(Long saldoAPagar) {
        this.saldoAPagar = saldoAPagar;
    }

    public BigDecimal getSaldoAPagarMe() {
        return saldoAPagarMe;
    }

    public void setSaldoAPagarMe(BigDecimal saldoAPagarMe) {
        this.saldoAPagarMe = saldoAPagarMe;
    }

    public Long getMontoNoIng() {
        return montoNoIng;
    }

    public void setMontoNoIng(Long montoNoIng) {
        this.montoNoIng = montoNoIng;
    }

    public BigDecimal getMontoNoIngMe() {
        return montoNoIngMe;
    }

    public void setMontoNoIngMe(BigDecimal montoNoIngMe) {
        this.montoNoIngMe = montoNoIngMe;
    }

    public Long getSdoPrima() {
        return sdoPrima;
    }

    public void setSdoPrima(Long sdoPrima) {
        this.sdoPrima = sdoPrima;
    }

    public BigDecimal getSdoPrimaMe() {
        return sdoPrimaMe;
    }

    public void setSdoPrimaMe(BigDecimal sdoPrimaMe) {
        this.sdoPrimaMe = sdoPrimaMe;
    }

    public Long getSdoGtosAdmi() {
        return sdoGtosAdmi;
    }

    public void setSdoGtosAdmi(Long sdoGtosAdmi) {
        this.sdoGtosAdmi = sdoGtosAdmi;
    }

    public BigDecimal getSdoGtosAdmiMe() {
        return sdoGtosAdmiMe;
    }

    public void setSdoGtosAdmiMe(BigDecimal sdoGtosAdmiMe) {
        this.sdoGtosAdmiMe = sdoGtosAdmiMe;
    }

    public Long getSdoRpf() {
        return sdoRpf;
    }

    public void setSdoRpf(Long sdoRpf) {
        this.sdoRpf = sdoRpf;
    }

    public BigDecimal getSdoRpfMe() {
        return sdoRpfMe;
    }

    public void setSdoRpfMe(BigDecimal sdoRpfMe) {
        this.sdoRpfMe = sdoRpfMe;
    }

    public Long getSdoPremio() {
        return sdoPremio;
    }

    public void setSdoPremio(Long sdoPremio) {
        this.sdoPremio = sdoPremio;
    }

    public BigDecimal getSdoPremioMe() {
        return sdoPremioMe;
    }

    public void setSdoPremioMe(BigDecimal sdoPremioMe) {
        this.sdoPremioMe = sdoPremioMe;
    }

    public Long getSdoIva() {
        return sdoIva;
    }

    public void setSdoIva(Long sdoIva) {
        this.sdoIva = sdoIva;
    }

    public BigDecimal getSdoIvaMe() {
        return sdoIvaMe;
    }

    public void setSdoIvaMe(BigDecimal sdoIvaMe) {
        this.sdoIvaMe = sdoIvaMe;
    }

    public Long getSdoSumaseg() {
        return sdoSumaseg;
    }

    public void setSdoSumaseg(Long sdoSumaseg) {
        this.sdoSumaseg = sdoSumaseg;
    }

    public BigDecimal getSdoSumasegMe() {
        return sdoSumasegMe;
    }

    public void setSdoSumasegMe(BigDecimal sdoSumasegMe) {
        this.sdoSumasegMe = sdoSumasegMe;
    }

    public Long getStroPend() {
        return stroPend;
    }

    public void setStroPend(Long stroPend) {
        this.stroPend = stroPend;
    }

    public BigDecimal getStroPendMe() {
        return stroPendMe;
    }

    public void setStroPendMe(BigDecimal stroPendMe) {
        this.stroPendMe = stroPendMe;
    }

    public Long getPgStro() {
        return pgStro;
    }

    public void setPgStro(Long pgStro) {
        this.pgStro = pgStro;
    }

    public BigDecimal getPgStroMe() {
        return pgStroMe;
    }

    public void setPgStroMe(BigDecimal pgStroMe) {
        this.pgStroMe = pgStroMe;
    }

    public Long getPgGtos() {
        return pgGtos;
    }

    public void setPgGtos(Long pgGtos) {
        this.pgGtos = pgGtos;
    }

    public BigDecimal getPgGtosMe() {
        return pgGtosMe;
    }

    public void setPgGtosMe(BigDecimal pgGtosMe) {
        this.pgGtosMe = pgGtosMe;
    }

    public Long getSdoPgStro() {
        return sdoPgStro;
    }

    public void setSdoPgStro(Long sdoPgStro) {
        this.sdoPgStro = sdoPgStro;
    }

    public BigDecimal getSdoPgStroMe() {
        return sdoPgStroMe;
    }

    public void setSdoPgStroMe(BigDecimal sdoPgStroMe) {
        this.sdoPgStroMe = sdoPgStroMe;
    }

    public Long getSdoPgGtos() {
        return sdoPgGtos;
    }

    public void setSdoPgGtos(Long sdoPgGtos) {
        this.sdoPgGtos = sdoPgGtos;
    }

    public BigDecimal getSdoPgGtosMe() {
        return sdoPgGtosMe;
    }

    public void setSdoPgGtosMe(BigDecimal sdoPgGtosMe) {
        this.sdoPgGtosMe = sdoPgGtosMe;
    }

    public Lisciare getLisciare() {
        return lisciare;
    }

    public void setLisciare(Lisciare lisciare) {
        this.lisciare = lisciare;
    }

    public Polsdemi getPolsdemi() {
        return polsdemi;
    }

    public void setPolsdemi(Polsdemi polsdemi) {
        this.polsdemi = polsdemi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (districoasePK != null ? districoasePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Districoase)) {
            return false;
        }
        Districoase other = (Districoase) object;
        if ((this.districoasePK == null && other.districoasePK != null) || (this.districoasePK != null && !this.districoasePK.equals(other.districoasePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Districoase[ districoasePK=" + districoasePK + " ]";
    }
    
}
