/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "POLICOASE", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "Policoase.findAll", query = "SELECT p FROM Policoase p"),
    @NamedQuery(name = "Policoase.findByEjercicio", query = "SELECT p FROM Policoase p WHERE p.policoasePK.ejercicio = :ejercicio"),
    @NamedQuery(name = "Policoase.findByTipoSeguro", query = "SELECT p FROM Policoase p WHERE p.policoasePK.tipoSeguro = :tipoSeguro"),
    @NamedQuery(name = "Policoase.findByTipoOperacion", query = "SELECT p FROM Policoase p WHERE p.policoasePK.tipoOperacion = :tipoOperacion"),
    @NamedQuery(name = "Policoase.findBySecc", query = "SELECT p FROM Policoase p WHERE p.policoasePK.secc = :secc"),
    @NamedQuery(name = "Policoase.findByPolnro", query = "SELECT p FROM Policoase p WHERE p.policoasePK.polnro = :polnro"),
    @NamedQuery(name = "Policoase.findByAnexo", query = "SELECT p FROM Policoase p WHERE p.policoasePK.anexo = :anexo"),
    @NamedQuery(name = "Policoase.findBySumaseg", query = "SELECT p FROM Policoase p WHERE p.sumaseg = :sumaseg"),
    @NamedQuery(name = "Policoase.findBySumasegMe", query = "SELECT p FROM Policoase p WHERE p.sumasegMe = :sumasegMe"),
    @NamedQuery(name = "Policoase.findByPrima", query = "SELECT p FROM Policoase p WHERE p.prima = :prima"),
    @NamedQuery(name = "Policoase.findByPrimaMe", query = "SELECT p FROM Policoase p WHERE p.primaMe = :primaMe"),
    @NamedQuery(name = "Policoase.findByIva", query = "SELECT p FROM Policoase p WHERE p.iva = :iva"),
    @NamedQuery(name = "Policoase.findByIvaMe", query = "SELECT p FROM Policoase p WHERE p.ivaMe = :ivaMe"),
    @NamedQuery(name = "Policoase.findByOtros", query = "SELECT p FROM Policoase p WHERE p.otros = :otros"),
    @NamedQuery(name = "Policoase.findByOtrosMe", query = "SELECT p FROM Policoase p WHERE p.otrosMe = :otrosMe"),
    @NamedQuery(name = "Policoase.findByGtosAdmi", query = "SELECT p FROM Policoase p WHERE p.gtosAdmi = :gtosAdmi"),
    @NamedQuery(name = "Policoase.findByGtosAdmiMe", query = "SELECT p FROM Policoase p WHERE p.gtosAdmiMe = :gtosAdmiMe"),
    @NamedQuery(name = "Policoase.findByRpf", query = "SELECT p FROM Policoase p WHERE p.rpf = :rpf"),
    @NamedQuery(name = "Policoase.findByRpfMe", query = "SELECT p FROM Policoase p WHERE p.rpfMe = :rpfMe"),
    @NamedQuery(name = "Policoase.findByPremio", query = "SELECT p FROM Policoase p WHERE p.premio = :premio"),
    @NamedQuery(name = "Policoase.findByPremioMe", query = "SELECT p FROM Policoase p WHERE p.premioMe = :premioMe"),
    @NamedQuery(name = "Policoase.findByInicial", query = "SELECT p FROM Policoase p WHERE p.inicial = :inicial"),
    @NamedQuery(name = "Policoase.findByInicialMe", query = "SELECT p FROM Policoase p WHERE p.inicialMe = :inicialMe"),
    @NamedQuery(name = "Policoase.findByImpCuotas", query = "SELECT p FROM Policoase p WHERE p.impCuotas = :impCuotas"),
    @NamedQuery(name = "Policoase.findByImpCuotasMe", query = "SELECT p FROM Policoase p WHERE p.impCuotasMe = :impCuotasMe"),
    @NamedQuery(name = "Policoase.findByNroCuotas", query = "SELECT p FROM Policoase p WHERE p.nroCuotas = :nroCuotas"),
    @NamedQuery(name = "Policoase.findByNroFactura", query = "SELECT p FROM Policoase p WHERE p.nroFactura = :nroFactura")})
public class Policoase implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PolicoasePK policoasePK;
    @Column(name = "SUMASEG")
    private Long sumaseg;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SUMASEG_ME", precision = 15, scale = 2)
    private BigDecimal sumasegMe;
    @Column(name = "PRIMA")
    private Long prima;
    @Column(name = "PRIMA_ME", precision = 15, scale = 2)
    private BigDecimal primaMe;
    @Column(name = "IVA")
    private Long iva;
    @Column(name = "IVA_ME", precision = 15, scale = 2)
    private BigDecimal ivaMe;
    @Column(name = "OTROS")
    private Long otros;
    @Column(name = "OTROS_ME", precision = 15, scale = 2)
    private BigDecimal otrosMe;
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
    @Basic(optional = false)
    @Column(name = "INICIAL", nullable = false)
    private long inicial;
    @Basic(optional = false)
    @Column(name = "INICIAL_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal inicialMe;
    @Basic(optional = false)
    @Column(name = "IMP_CUOTAS", nullable = false)
    private long impCuotas;
    @Basic(optional = false)
    @Column(name = "IMP_CUOTAS_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal impCuotasMe;
    @Basic(optional = false)
    @Column(name = "NRO_CUOTAS", nullable = false)
    private short nroCuotas;
    @Column(name = "NRO_FACTURA")
    private Long nroFactura;
    @JoinColumn(name = "CIA_PILOTO", referencedColumnName = "N_CIA", nullable = false)
    @ManyToOne(optional = false)
    private Lisciare ciaPiloto;
    @JoinColumns({
        @JoinColumn(name = "EJERCICIO", referencedColumnName = "EJERCICIO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "TIPO_SEGURO", referencedColumnName = "TIPO_SEGURO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "TIPO_OPERACION", referencedColumnName = "TIPO_OPERACION", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "SECC", referencedColumnName = "SECC", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "POLNRO", referencedColumnName = "POLNRO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "ANEXO", referencedColumnName = "ANEXO", nullable = false, insertable = false, updatable = false)})
    @OneToOne(optional = false)
    private Polsdemi polsdemi;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "policoase")
    private List<ItemPolizasCoaseguro> itemPolizasCoaseguroList;

    public Policoase() {
    }

    public Policoase(PolicoasePK policoasePK) {
        this.policoasePK = policoasePK;
    }

    public Policoase(PolicoasePK policoasePK, long inicial, BigDecimal inicialMe, long impCuotas, BigDecimal impCuotasMe, short nroCuotas) {
        this.policoasePK = policoasePK;
        this.inicial = inicial;
        this.inicialMe = inicialMe;
        this.impCuotas = impCuotas;
        this.impCuotasMe = impCuotasMe;
        this.nroCuotas = nroCuotas;
    }

    public Policoase(short ejercicio, short tipoSeguro, short tipoOperacion, short secc, int polnro, short anexo) {
        this.policoasePK = new PolicoasePK(ejercicio, tipoSeguro, tipoOperacion, secc, polnro, anexo);
    }

    public PolicoasePK getPolicoasePK() {
        return policoasePK;
    }

    public void setPolicoasePK(PolicoasePK policoasePK) {
        this.policoasePK = policoasePK;
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

    public Long getOtros() {
        return otros;
    }

    public void setOtros(Long otros) {
        this.otros = otros;
    }

    public BigDecimal getOtrosMe() {
        return otrosMe;
    }

    public void setOtrosMe(BigDecimal otrosMe) {
        this.otrosMe = otrosMe;
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

    public long getInicial() {
        return inicial;
    }

    public void setInicial(long inicial) {
        this.inicial = inicial;
    }

    public BigDecimal getInicialMe() {
        return inicialMe;
    }

    public void setInicialMe(BigDecimal inicialMe) {
        this.inicialMe = inicialMe;
    }

    public long getImpCuotas() {
        return impCuotas;
    }

    public void setImpCuotas(long impCuotas) {
        this.impCuotas = impCuotas;
    }

    public BigDecimal getImpCuotasMe() {
        return impCuotasMe;
    }

    public void setImpCuotasMe(BigDecimal impCuotasMe) {
        this.impCuotasMe = impCuotasMe;
    }

    public short getNroCuotas() {
        return nroCuotas;
    }

    public void setNroCuotas(short nroCuotas) {
        this.nroCuotas = nroCuotas;
    }

    public Long getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(Long nroFactura) {
        this.nroFactura = nroFactura;
    }

    public Lisciare getCiaPiloto() {
        return ciaPiloto;
    }

    public void setCiaPiloto(Lisciare ciaPiloto) {
        this.ciaPiloto = ciaPiloto;
    }

    public Polsdemi getPolsdemi() {
        return polsdemi;
    }

    public void setPolsdemi(Polsdemi polsdemi) {
        this.polsdemi = polsdemi;
    }

    public List<ItemPolizasCoaseguro> getItemPolizasCoaseguroList() {
        return itemPolizasCoaseguroList;
    }

    public void setItemPolizasCoaseguroList(List<ItemPolizasCoaseguro> itemPolizasCoaseguroList) {
        this.itemPolizasCoaseguroList = itemPolizasCoaseguroList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (policoasePK != null ? policoasePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Policoase)) {
            return false;
        }
        Policoase other = (Policoase) object;
        if ((this.policoasePK == null && other.policoasePK != null) || (this.policoasePK != null && !this.policoasePK.equals(other.policoasePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Policoase[ policoasePK=" + policoasePK + " ]";
    }
    
}
