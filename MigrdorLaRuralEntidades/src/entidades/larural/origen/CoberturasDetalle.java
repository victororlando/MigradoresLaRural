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
@Table(name = "COBERTURAS_DETALLE", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "CoberturasDetalle.findAll", query = "SELECT c FROM CoberturasDetalle c"),
    @NamedQuery(name = "CoberturasDetalle.findByTipoSeguro", query = "SELECT c FROM CoberturasDetalle c WHERE c.coberturasDetallePK.tipoSeguro = :tipoSeguro"),
    @NamedQuery(name = "CoberturasDetalle.findByTipoOperacion", query = "SELECT c FROM CoberturasDetalle c WHERE c.coberturasDetallePK.tipoOperacion = :tipoOperacion"),
    @NamedQuery(name = "CoberturasDetalle.findByEjercicio", query = "SELECT c FROM CoberturasDetalle c WHERE c.coberturasDetallePK.ejercicio = :ejercicio"),
    @NamedQuery(name = "CoberturasDetalle.findBySecc", query = "SELECT c FROM CoberturasDetalle c WHERE c.coberturasDetallePK.secc = :secc"),
    @NamedQuery(name = "CoberturasDetalle.findByPolnro", query = "SELECT c FROM CoberturasDetalle c WHERE c.coberturasDetallePK.polnro = :polnro"),
    @NamedQuery(name = "CoberturasDetalle.findByAnexo", query = "SELECT c FROM CoberturasDetalle c WHERE c.coberturasDetallePK.anexo = :anexo"),
    @NamedQuery(name = "CoberturasDetalle.findByItem", query = "SELECT c FROM CoberturasDetalle c WHERE c.coberturasDetallePK.item = :item"),
    @NamedQuery(name = "CoberturasDetalle.findByCodRiesgo", query = "SELECT c FROM CoberturasDetalle c WHERE c.coberturasDetallePK.codRiesgo = :codRiesgo"),
    @NamedQuery(name = "CoberturasDetalle.findByCodCobertura", query = "SELECT c FROM CoberturasDetalle c WHERE c.coberturasDetallePK.codCobertura = :codCobertura"),
    @NamedQuery(name = "CoberturasDetalle.findByNroTransaccion", query = "SELECT c FROM CoberturasDetalle c WHERE c.nroTransaccion = :nroTransaccion"),
    @NamedQuery(name = "CoberturasDetalle.findByNroCert", query = "SELECT c FROM CoberturasDetalle c WHERE c.nroCert = :nroCert"),
    @NamedQuery(name = "CoberturasDetalle.findBySumaseg", query = "SELECT c FROM CoberturasDetalle c WHERE c.sumaseg = :sumaseg"),
    @NamedQuery(name = "CoberturasDetalle.findByPrima", query = "SELECT c FROM CoberturasDetalle c WHERE c.prima = :prima"),
    @NamedQuery(name = "CoberturasDetalle.findByPrimaReaseguro", query = "SELECT c FROM CoberturasDetalle c WHERE c.primaReaseguro = :primaReaseguro"),
    @NamedQuery(name = "CoberturasDetalle.findByEstado", query = "SELECT c FROM CoberturasDetalle c WHERE c.estado = :estado"),
    @NamedQuery(name = "CoberturasDetalle.findByFechaCarga", query = "SELECT c FROM CoberturasDetalle c WHERE c.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "CoberturasDetalle.findByUsuarioModifica", query = "SELECT c FROM CoberturasDetalle c WHERE c.usuarioModifica = :usuarioModifica"),
    @NamedQuery(name = "CoberturasDetalle.findByFechaModifica", query = "SELECT c FROM CoberturasDetalle c WHERE c.fechaModifica = :fechaModifica")})
public class CoberturasDetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CoberturasDetallePK coberturasDetallePK;
    @Basic(optional = false)
    @Column(name = "NRO_TRANSACCION", nullable = false)
    private long nroTransaccion;
    @Basic(optional = false)
    @Column(name = "NRO_CERT", nullable = false)
    private long nroCert;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "SUMASEG", nullable = false, precision = 17, scale = 2)
    private BigDecimal sumaseg;
    @Basic(optional = false)
    @Column(name = "PRIMA", nullable = false, precision = 17, scale = 2)
    private BigDecimal prima;
    @Basic(optional = false)
    @Column(name = "PRIMA_REASEGURO", nullable = false, precision = 17, scale = 2)
    private BigDecimal primaReaseguro;
    @Basic(optional = false)
    @Column(name = "ESTADO", nullable = false)
    private short estado;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Basic(optional = false)
    @Column(name = "USUARIO_MODIFICA", nullable = false)
    private short usuarioModifica;
    @Basic(optional = false)
    @Column(name = "FECHA_MODIFICA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModifica;
    @JoinColumn(name = "COD_MONEY", referencedColumnName = "COD_MONEY", nullable = false)
    @ManyToOne(optional = false)
    private Monedas codMoney;
    @JoinColumns({
        @JoinColumn(name = "SECC", referencedColumnName = "SECC", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "COD_RIESGO", referencedColumnName = "COD_RIESGO", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private RiesgosAsegurados riesgosAsegurados;
    @JoinColumns({
        @JoinColumn(name = "SECC", referencedColumnName = "SECC", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "COD_RIESGO", referencedColumnName = "COD_RIESGO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "COD_COBERTURA", referencedColumnName = "COD_COBERTURA", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private TiposCoberturas tiposCoberturas;
    @JoinColumn(name = "USUARIO_CARGA", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios usuarioCarga;

    public CoberturasDetalle() {
    }

    public CoberturasDetalle(CoberturasDetallePK coberturasDetallePK) {
        this.coberturasDetallePK = coberturasDetallePK;
    }

    public CoberturasDetalle(CoberturasDetallePK coberturasDetallePK, long nroTransaccion, long nroCert, BigDecimal sumaseg, BigDecimal prima, BigDecimal primaReaseguro, short estado, Date fechaCarga, short usuarioModifica, Date fechaModifica) {
        this.coberturasDetallePK = coberturasDetallePK;
        this.nroTransaccion = nroTransaccion;
        this.nroCert = nroCert;
        this.sumaseg = sumaseg;
        this.prima = prima;
        this.primaReaseguro = primaReaseguro;
        this.estado = estado;
        this.fechaCarga = fechaCarga;
        this.usuarioModifica = usuarioModifica;
        this.fechaModifica = fechaModifica;
    }

    public CoberturasDetalle(short tipoSeguro, short tipoOperacion, short ejercicio, short secc, int polnro, short anexo, int item, short codRiesgo, short codCobertura) {
        this.coberturasDetallePK = new CoberturasDetallePK(tipoSeguro, tipoOperacion, ejercicio, secc, polnro, anexo, item, codRiesgo, codCobertura);
    }

    public CoberturasDetallePK getCoberturasDetallePK() {
        return coberturasDetallePK;
    }

    public void setCoberturasDetallePK(CoberturasDetallePK coberturasDetallePK) {
        this.coberturasDetallePK = coberturasDetallePK;
    }

    public long getNroTransaccion() {
        return nroTransaccion;
    }

    public void setNroTransaccion(long nroTransaccion) {
        this.nroTransaccion = nroTransaccion;
    }

    public long getNroCert() {
        return nroCert;
    }

    public void setNroCert(long nroCert) {
        this.nroCert = nroCert;
    }

    public BigDecimal getSumaseg() {
        return sumaseg;
    }

    public void setSumaseg(BigDecimal sumaseg) {
        this.sumaseg = sumaseg;
    }

    public BigDecimal getPrima() {
        return prima;
    }

    public void setPrima(BigDecimal prima) {
        this.prima = prima;
    }

    public BigDecimal getPrimaReaseguro() {
        return primaReaseguro;
    }

    public void setPrimaReaseguro(BigDecimal primaReaseguro) {
        this.primaReaseguro = primaReaseguro;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public short getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(short usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    public Date getFechaModifica() {
        return fechaModifica;
    }

    public void setFechaModifica(Date fechaModifica) {
        this.fechaModifica = fechaModifica;
    }

    public Monedas getCodMoney() {
        return codMoney;
    }

    public void setCodMoney(Monedas codMoney) {
        this.codMoney = codMoney;
    }

    public RiesgosAsegurados getRiesgosAsegurados() {
        return riesgosAsegurados;
    }

    public void setRiesgosAsegurados(RiesgosAsegurados riesgosAsegurados) {
        this.riesgosAsegurados = riesgosAsegurados;
    }

    public TiposCoberturas getTiposCoberturas() {
        return tiposCoberturas;
    }

    public void setTiposCoberturas(TiposCoberturas tiposCoberturas) {
        this.tiposCoberturas = tiposCoberturas;
    }

    public Usuarios getUsuarioCarga() {
        return usuarioCarga;
    }

    public void setUsuarioCarga(Usuarios usuarioCarga) {
        this.usuarioCarga = usuarioCarga;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coberturasDetallePK != null ? coberturasDetallePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoberturasDetalle)) {
            return false;
        }
        CoberturasDetalle other = (CoberturasDetalle) object;
        if ((this.coberturasDetallePK == null && other.coberturasDetallePK != null) || (this.coberturasDetallePK != null && !this.coberturasDetallePK.equals(other.coberturasDetallePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.CoberturasDetalle[ coberturasDetallePK=" + coberturasDetallePK + " ]";
    }
    
}
