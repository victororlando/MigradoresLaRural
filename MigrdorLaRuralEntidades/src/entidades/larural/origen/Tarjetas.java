/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

import java.io.Serializable;
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
@Table(name = "TARJETAS",schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "Tarjetas.findAll", query = "SELECT t FROM Tarjetas t"),
    @NamedQuery(name = "Tarjetas.findByNAseg", query = "SELECT t FROM Tarjetas t WHERE t.tarjetasPK.nAseg = :nAseg"),
    @NamedQuery(name = "Tarjetas.findByCodEntidad", query = "SELECT t FROM Tarjetas t WHERE t.tarjetasPK.codEntidad = :codEntidad"),
    @NamedQuery(name = "Tarjetas.findByNroTarjeta", query = "SELECT t FROM Tarjetas t WHERE t.tarjetasPK.nroTarjeta = :nroTarjeta"),
    @NamedQuery(name = "Tarjetas.findByVtoTarjeta", query = "SELECT t FROM Tarjetas t WHERE t.vtoTarjeta = :vtoTarjeta"),
    @NamedQuery(name = "Tarjetas.findByPin", query = "SELECT t FROM Tarjetas t WHERE t.pin = :pin"),
    @NamedQuery(name = "Tarjetas.findByTitular", query = "SELECT t FROM Tarjetas t WHERE t.titular = :titular"),
    @NamedQuery(name = "Tarjetas.findByNroEntrada", query = "SELECT t FROM Tarjetas t WHERE t.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "Tarjetas.findByEstado", query = "SELECT t FROM Tarjetas t WHERE t.estado = :estado"),
    @NamedQuery(name = "Tarjetas.findByPrioridad", query = "SELECT t FROM Tarjetas t WHERE t.prioridad = :prioridad"),
    @NamedQuery(name = "Tarjetas.findByLineaCredito", query = "SELECT t FROM Tarjetas t WHERE t.lineaCredito = :lineaCredito"),
    @NamedQuery(name = "Tarjetas.findByTitutarExterno", query = "SELECT t FROM Tarjetas t WHERE t.titutarExterno = :titutarExterno"),
    @NamedQuery(name = "Tarjetas.findByNTitular", query = "SELECT t FROM Tarjetas t WHERE t.nTitular = :nTitular"),
    @NamedQuery(name = "Tarjetas.findByNTitularAseg", query = "SELECT t FROM Tarjetas t WHERE t.nTitularAseg = :nTitularAseg"),
    @NamedQuery(name = "Tarjetas.findByPersonaidn", query = "SELECT t FROM Tarjetas t WHERE t.personaidn = :personaidn")})
public class Tarjetas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TarjetasPK tarjetasPK;
    @Column(name = "VTO_TARJETA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vtoTarjeta;
    @Column(name = "PIN", length = 20)
    private String pin;
    @Column(name = "TITULAR", length = 100)
    private String titular;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @Basic(optional = false)
    @Column(name = "ESTADO", nullable = false)
    private short estado;
    @Column(name = "PRIORIDAD")
    private Short prioridad;
    @Column(name = "LINEA_CREDITO")
    private Long lineaCredito;
    @Column(name = "TITUTAR_EXTERNO", length = 1)
    private String titutarExterno;
    @Column(name = "N_TITULAR")
    private Integer nTitular;
    @Column(name = "N_TITULAR_ASEG")
    private Integer nTitularAseg;
    @Column(name = "PERSONAIDN")
    private Long personaidn;
    @JoinColumn(name = "N_ASEG", referencedColumnName = "N_ASEG", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Listaseg listaseg;
    @JoinColumn(name = "COD_ENTIDAD", referencedColumnName = "COD_ENTIDAD", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Listbco listbco;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;

    public Tarjetas() {
    }

    public Tarjetas(TarjetasPK tarjetasPK) {
        this.tarjetasPK = tarjetasPK;
    }

    public Tarjetas(TarjetasPK tarjetasPK, int nroEntrada, short estado) {
        this.tarjetasPK = tarjetasPK;
        this.nroEntrada = nroEntrada;
        this.estado = estado;
    }

    public Tarjetas(int nAseg, short codEntidad, String nroTarjeta) {
        this.tarjetasPK = new TarjetasPK(nAseg, codEntidad, nroTarjeta);
    }

    public TarjetasPK getTarjetasPK() {
        return tarjetasPK;
    }

    public void setTarjetasPK(TarjetasPK tarjetasPK) {
        this.tarjetasPK = tarjetasPK;
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

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(int nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public Short getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Short prioridad) {
        this.prioridad = prioridad;
    }

    public Long getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(Long lineaCredito) {
        this.lineaCredito = lineaCredito;
    }

    public String getTitutarExterno() {
        return titutarExterno;
    }

    public void setTitutarExterno(String titutarExterno) {
        this.titutarExterno = titutarExterno;
    }

    public Integer getNTitular() {
        return nTitular;
    }

    public void setNTitular(Integer nTitular) {
        this.nTitular = nTitular;
    }

    public Integer getNTitularAseg() {
        return nTitularAseg;
    }

    public void setNTitularAseg(Integer nTitularAseg) {
        this.nTitularAseg = nTitularAseg;
    }

    public Long getPersonaidn() {
        return personaidn;
    }

    public void setPersonaidn(Long personaidn) {
        this.personaidn = personaidn;
    }

    public Listaseg getListaseg() {
        return listaseg;
    }

    public void setListaseg(Listaseg listaseg) {
        this.listaseg = listaseg;
    }

    public Listbco getListbco() {
        return listbco;
    }

    public void setListbco(Listbco listbco) {
        this.listbco = listbco;
    }

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tarjetasPK != null ? tarjetasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarjetas)) {
            return false;
        }
        Tarjetas other = (Tarjetas) object;
        if ((this.tarjetasPK == null && other.tarjetasPK != null) || (this.tarjetasPK != null && !this.tarjetasPK.equals(other.tarjetasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Tarjetas[ tarjetasPK=" + tarjetasPK + " ]";
    }
    
}
