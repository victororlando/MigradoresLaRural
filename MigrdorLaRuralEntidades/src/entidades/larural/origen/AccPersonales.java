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
@Table(name = "ACC_PERSONALES", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "AccPersonales.findAll", query = "SELECT a FROM AccPersonales a"),
    @NamedQuery(name = "AccPersonales.findByTipoSeguro", query = "SELECT a FROM AccPersonales a WHERE a.accPersonalesPK.tipoSeguro = :tipoSeguro"),
    @NamedQuery(name = "AccPersonales.findByTipoOperacion", query = "SELECT a FROM AccPersonales a WHERE a.accPersonalesPK.tipoOperacion = :tipoOperacion"),
    @NamedQuery(name = "AccPersonales.findByEjercicio", query = "SELECT a FROM AccPersonales a WHERE a.accPersonalesPK.ejercicio = :ejercicio"),
    @NamedQuery(name = "AccPersonales.findBySecc", query = "SELECT a FROM AccPersonales a WHERE a.accPersonalesPK.secc = :secc"),
    @NamedQuery(name = "AccPersonales.findByPolnro", query = "SELECT a FROM AccPersonales a WHERE a.accPersonalesPK.polnro = :polnro"),
    @NamedQuery(name = "AccPersonales.findByAnexo", query = "SELECT a FROM AccPersonales a WHERE a.accPersonalesPK.anexo = :anexo"),
    @NamedQuery(name = "AccPersonales.findByItem", query = "SELECT a FROM AccPersonales a WHERE a.accPersonalesPK.item = :item"),
    @NamedQuery(name = "AccPersonales.findByCapMuerte", query = "SELECT a FROM AccPersonales a WHERE a.capMuerte = :capMuerte"),
    @NamedQuery(name = "AccPersonales.findByCapMuerteMe", query = "SELECT a FROM AccPersonales a WHERE a.capMuerteMe = :capMuerteMe"),
    @NamedQuery(name = "AccPersonales.findByCapIncapacidad", query = "SELECT a FROM AccPersonales a WHERE a.capIncapacidad = :capIncapacidad"),
    @NamedQuery(name = "AccPersonales.findByCapIncapacidadMe", query = "SELECT a FROM AccPersonales a WHERE a.capIncapacidadMe = :capIncapacidadMe"),
    @NamedQuery(name = "AccPersonales.findByCapGtosmed", query = "SELECT a FROM AccPersonales a WHERE a.capGtosmed = :capGtosmed"),
    @NamedQuery(name = "AccPersonales.findByCapGtosmedMe", query = "SELECT a FROM AccPersonales a WHERE a.capGtosmedMe = :capGtosmedMe"),
    @NamedQuery(name = "AccPersonales.findByEstado", query = "SELECT a FROM AccPersonales a WHERE a.estado = :estado"),
    @NamedQuery(name = "AccPersonales.findByBeneficiario", query = "SELECT a FROM AccPersonales a WHERE a.beneficiario = :beneficiario"),
    @NamedQuery(name = "AccPersonales.findByCodUsuarioCarga", query = "SELECT a FROM AccPersonales a WHERE a.codUsuarioCarga = :codUsuarioCarga"),
    @NamedQuery(name = "AccPersonales.findByFechaCarga", query = "SELECT a FROM AccPersonales a WHERE a.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "AccPersonales.findByCodUsuarioModifica", query = "SELECT a FROM AccPersonales a WHERE a.codUsuarioModifica = :codUsuarioModifica"),
    @NamedQuery(name = "AccPersonales.findByFechaModifica", query = "SELECT a FROM AccPersonales a WHERE a.fechaModifica = :fechaModifica"),
    @NamedQuery(name = "AccPersonales.findByColectivo", query = "SELECT a FROM AccPersonales a WHERE a.colectivo = :colectivo"),
    @NamedQuery(name = "AccPersonales.findByPrima", query = "SELECT a FROM AccPersonales a WHERE a.prima = :prima"),
    @NamedQuery(name = "AccPersonales.findByPrimaMe", query = "SELECT a FROM AccPersonales a WHERE a.primaMe = :primaMe"),
    @NamedQuery(name = "AccPersonales.findByGtosAdmi", query = "SELECT a FROM AccPersonales a WHERE a.gtosAdmi = :gtosAdmi"),
    @NamedQuery(name = "AccPersonales.findByGtosAdmiMe", query = "SELECT a FROM AccPersonales a WHERE a.gtosAdmiMe = :gtosAdmiMe"),
    @NamedQuery(name = "AccPersonales.findByRpf", query = "SELECT a FROM AccPersonales a WHERE a.rpf = :rpf"),
    @NamedQuery(name = "AccPersonales.findByRpfMe", query = "SELECT a FROM AccPersonales a WHERE a.rpfMe = :rpfMe"),
    @NamedQuery(name = "AccPersonales.findByIva", query = "SELECT a FROM AccPersonales a WHERE a.iva = :iva"),
    @NamedQuery(name = "AccPersonales.findByIvaMe", query = "SELECT a FROM AccPersonales a WHERE a.ivaMe = :ivaMe"),
    @NamedQuery(name = "AccPersonales.findByPremio", query = "SELECT a FROM AccPersonales a WHERE a.premio = :premio"),
    @NamedQuery(name = "AccPersonales.findByPremioMe", query = "SELECT a FROM AccPersonales a WHERE a.premioMe = :premioMe"),
    @NamedQuery(name = "AccPersonales.findByCapRentaDiaria", query = "SELECT a FROM AccPersonales a WHERE a.capRentaDiaria = :capRentaDiaria"),
    @NamedQuery(name = "AccPersonales.findByCapRentaDiariaMe", query = "SELECT a FROM AccPersonales a WHERE a.capRentaDiariaMe = :capRentaDiariaMe"),
    @NamedQuery(name = "AccPersonales.findByNroEntrada", query = "SELECT a FROM AccPersonales a WHERE a.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "AccPersonales.findByNroCert", query = "SELECT a FROM AccPersonales a WHERE a.nroCert = :nroCert"),
    @NamedQuery(name = "AccPersonales.findBySumaseg", query = "SELECT a FROM AccPersonales a WHERE a.sumaseg = :sumaseg"),
    @NamedQuery(name = "AccPersonales.findBySumasegMe", query = "SELECT a FROM AccPersonales a WHERE a.sumasegMe = :sumasegMe")})
public class AccPersonales implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AccPersonalesPK accPersonalesPK;
    @Basic(optional = false)
    @Column(name = "CAP_MUERTE", nullable = false)
    private long capMuerte;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "CAP_MUERTE_ME", nullable = false, precision = 17, scale = 2)
    private BigDecimal capMuerteMe;
    @Basic(optional = false)
    @Column(name = "CAP_INCAPACIDAD", nullable = false)
    private long capIncapacidad;
    @Basic(optional = false)
    @Column(name = "CAP_INCAPACIDAD_ME", nullable = false, precision = 17, scale = 2)
    private BigDecimal capIncapacidadMe;
    @Basic(optional = false)
    @Column(name = "CAP_GTOSMED", nullable = false)
    private long capGtosmed;
    @Basic(optional = false)
    @Column(name = "CAP_GTOSMED_ME", nullable = false, precision = 17, scale = 2)
    private BigDecimal capGtosmedMe;
    @Basic(optional = false)
    @Column(name = "ESTADO", nullable = false)
    private short estado;
    @Basic(optional = false)
    @Column(name = "BENEFICIARIO", nullable = false, length = 4000)
    private String beneficiario;
    @Basic(optional = false)
    @Column(name = "COD_USUARIO_CARGA", nullable = false)
    private short codUsuarioCarga;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Basic(optional = false)
    @Column(name = "COD_USUARIO_MODIFICA", nullable = false)
    private short codUsuarioModifica;
    @Basic(optional = false)
    @Column(name = "FECHA_MODIFICA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModifica;
    @Basic(optional = false)
    @Column(name = "COLECTIVO", nullable = false)
    private short colectivo;
    @Basic(optional = false)
    @Column(name = "PRIMA", nullable = false)
    private long prima;
    @Basic(optional = false)
    @Column(name = "PRIMA_ME", nullable = false, precision = 17, scale = 2)
    private BigDecimal primaMe;
    @Basic(optional = false)
    @Column(name = "GTOS_ADMI", nullable = false)
    private long gtosAdmi;
    @Basic(optional = false)
    @Column(name = "GTOS_ADMI_ME", nullable = false, precision = 17, scale = 2)
    private BigDecimal gtosAdmiMe;
    @Basic(optional = false)
    @Column(name = "RPF", nullable = false)
    private long rpf;
    @Basic(optional = false)
    @Column(name = "RPF_ME", nullable = false, precision = 17, scale = 2)
    private BigDecimal rpfMe;
    @Basic(optional = false)
    @Column(name = "IVA", nullable = false)
    private long iva;
    @Basic(optional = false)
    @Column(name = "IVA_ME", nullable = false, precision = 17, scale = 2)
    private BigDecimal ivaMe;
    @Basic(optional = false)
    @Column(name = "PREMIO", nullable = false)
    private long premio;
    @Basic(optional = false)
    @Column(name = "PREMIO_ME", nullable = false, precision = 17, scale = 2)
    private BigDecimal premioMe;
    @Basic(optional = false)
    @Column(name = "CAP_RENTA_DIARIA", nullable = false)
    private long capRentaDiaria;
    @Basic(optional = false)
    @Column(name = "CAP_RENTA_DIARIA_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal capRentaDiariaMe;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private long nroEntrada;
    @Basic(optional = false)
    @Column(name = "NRO_CERT", nullable = false)
    private int nroCert;
    @Basic(optional = false)
    @Column(name = "SUMASEG", nullable = false, precision = 17, scale = 2)
    private BigDecimal sumaseg;
    @Basic(optional = false)
    @Column(name = "SUMASEG_ME", nullable = false, precision = 17, scale = 2)
    private BigDecimal sumasegMe;
    @JoinColumn(name = "N_ASEG", referencedColumnName = "N_ASEG", nullable = false)
    @ManyToOne(optional = false)
    private AsegAccPer nAseg;

    public AccPersonales() {
    }

    public AccPersonales(AccPersonalesPK accPersonalesPK) {
        this.accPersonalesPK = accPersonalesPK;
    }

    public AccPersonales(AccPersonalesPK accPersonalesPK, long capMuerte, BigDecimal capMuerteMe, long capIncapacidad, BigDecimal capIncapacidadMe, long capGtosmed, BigDecimal capGtosmedMe, short estado, String beneficiario, short codUsuarioCarga, Date fechaCarga, short codUsuarioModifica, Date fechaModifica, short colectivo, long prima, BigDecimal primaMe, long gtosAdmi, BigDecimal gtosAdmiMe, long rpf, BigDecimal rpfMe, long iva, BigDecimal ivaMe, long premio, BigDecimal premioMe, long capRentaDiaria, BigDecimal capRentaDiariaMe, long nroEntrada, int nroCert, BigDecimal sumaseg, BigDecimal sumasegMe) {
        this.accPersonalesPK = accPersonalesPK;
        this.capMuerte = capMuerte;
        this.capMuerteMe = capMuerteMe;
        this.capIncapacidad = capIncapacidad;
        this.capIncapacidadMe = capIncapacidadMe;
        this.capGtosmed = capGtosmed;
        this.capGtosmedMe = capGtosmedMe;
        this.estado = estado;
        this.beneficiario = beneficiario;
        this.codUsuarioCarga = codUsuarioCarga;
        this.fechaCarga = fechaCarga;
        this.codUsuarioModifica = codUsuarioModifica;
        this.fechaModifica = fechaModifica;
        this.colectivo = colectivo;
        this.prima = prima;
        this.primaMe = primaMe;
        this.gtosAdmi = gtosAdmi;
        this.gtosAdmiMe = gtosAdmiMe;
        this.rpf = rpf;
        this.rpfMe = rpfMe;
        this.iva = iva;
        this.ivaMe = ivaMe;
        this.premio = premio;
        this.premioMe = premioMe;
        this.capRentaDiaria = capRentaDiaria;
        this.capRentaDiariaMe = capRentaDiariaMe;
        this.nroEntrada = nroEntrada;
        this.nroCert = nroCert;
        this.sumaseg = sumaseg;
        this.sumasegMe = sumasegMe;
    }

    public AccPersonales(short tipoSeguro, short tipoOperacion, short ejercicio, short secc, int polnro, short anexo, int item) {
        this.accPersonalesPK = new AccPersonalesPK(tipoSeguro, tipoOperacion, ejercicio, secc, polnro, anexo, item);
    }

    public AccPersonalesPK getAccPersonalesPK() {
        return accPersonalesPK;
    }

    public void setAccPersonalesPK(AccPersonalesPK accPersonalesPK) {
        this.accPersonalesPK = accPersonalesPK;
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

    public long getCapGtosmed() {
        return capGtosmed;
    }

    public void setCapGtosmed(long capGtosmed) {
        this.capGtosmed = capGtosmed;
    }

    public BigDecimal getCapGtosmedMe() {
        return capGtosmedMe;
    }

    public void setCapGtosmedMe(BigDecimal capGtosmedMe) {
        this.capGtosmedMe = capGtosmedMe;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public short getCodUsuarioCarga() {
        return codUsuarioCarga;
    }

    public void setCodUsuarioCarga(short codUsuarioCarga) {
        this.codUsuarioCarga = codUsuarioCarga;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public short getCodUsuarioModifica() {
        return codUsuarioModifica;
    }

    public void setCodUsuarioModifica(short codUsuarioModifica) {
        this.codUsuarioModifica = codUsuarioModifica;
    }

    public Date getFechaModifica() {
        return fechaModifica;
    }

    public void setFechaModifica(Date fechaModifica) {
        this.fechaModifica = fechaModifica;
    }

    public short getColectivo() {
        return colectivo;
    }

    public void setColectivo(short colectivo) {
        this.colectivo = colectivo;
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

    public long getCapRentaDiaria() {
        return capRentaDiaria;
    }

    public void setCapRentaDiaria(long capRentaDiaria) {
        this.capRentaDiaria = capRentaDiaria;
    }

    public BigDecimal getCapRentaDiariaMe() {
        return capRentaDiariaMe;
    }

    public void setCapRentaDiariaMe(BigDecimal capRentaDiariaMe) {
        this.capRentaDiariaMe = capRentaDiariaMe;
    }

    public long getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(long nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public int getNroCert() {
        return nroCert;
    }

    public void setNroCert(int nroCert) {
        this.nroCert = nroCert;
    }

    public BigDecimal getSumaseg() {
        return sumaseg;
    }

    public void setSumaseg(BigDecimal sumaseg) {
        this.sumaseg = sumaseg;
    }

    public BigDecimal getSumasegMe() {
        return sumasegMe;
    }

    public void setSumasegMe(BigDecimal sumasegMe) {
        this.sumasegMe = sumasegMe;
    }

    public AsegAccPer getNAseg() {
        return nAseg;
    }

    public void setNAseg(AsegAccPer nAseg) {
        this.nAseg = nAseg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accPersonalesPK != null ? accPersonalesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccPersonales)) {
            return false;
        }
        AccPersonales other = (AccPersonales) object;
        if ((this.accPersonalesPK == null && other.accPersonalesPK != null) || (this.accPersonalesPK != null && !this.accPersonalesPK.equals(other.accPersonalesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.AccPersonales[ accPersonalesPK=" + accPersonalesPK + " ]";
    }
    
}
