/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LISTCOBR",  schema = "SOFTTEN", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"NOMBRE"})})
@NamedQueries({
    @NamedQuery(name = "Listcobr.findAll", query = "SELECT l FROM Listcobr l"),
    @NamedQuery(name = "Listcobr.findByNCobr", query = "SELECT l FROM Listcobr l WHERE l.nCobr = :nCobr"),
    @NamedQuery(name = "Listcobr.findByNombre", query = "SELECT l FROM Listcobr l WHERE l.nombre = :nombre"),
    @NamedQuery(name = "Listcobr.findByPctComis", query = "SELECT l FROM Listcobr l WHERE l.pctComis = :pctComis"),
    @NamedQuery(name = "Listcobr.findByConIva", query = "SELECT l FROM Listcobr l WHERE l.conIva = :conIva"),
    @NamedQuery(name = "Listcobr.findByPorcInicial", query = "SELECT l FROM Listcobr l WHERE l.porcInicial = :porcInicial"),
    @NamedQuery(name = "Listcobr.findByPorcDctos", query = "SELECT l FROM Listcobr l WHERE l.porcDctos = :porcDctos"),
    @NamedQuery(name = "Listcobr.findByEstado", query = "SELECT l FROM Listcobr l WHERE l.estado = :estado"),
    @NamedQuery(name = "Listcobr.findByFechaCarga", query = "SELECT l FROM Listcobr l WHERE l.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "Listcobr.findByUsuarioSistema", query = "SELECT l FROM Listcobr l WHERE l.usuarioSistema = :usuarioSistema"),
    @NamedQuery(name = "Listcobr.findByNroEntrada", query = "SELECT l FROM Listcobr l WHERE l.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "Listcobr.findBySeguidoc", query = "SELECT l FROM Listcobr l WHERE l.seguidoc = :seguidoc"),
    @NamedQuery(name = "Listcobr.findByNroTalonario", query = "SELECT l FROM Listcobr l WHERE l.nroTalonario = :nroTalonario"),
    @NamedQuery(name = "Listcobr.findByCobranzaElectronica", query = "SELECT l FROM Listcobr l WHERE l.cobranzaElectronica = :cobranzaElectronica"),
    @NamedQuery(name = "Listcobr.findByImpCobResumen", query = "SELECT l FROM Listcobr l WHERE l.impCobResumen = :impCobResumen"),
    @NamedQuery(name = "Listcobr.findByIngresoDxpMasivo", query = "SELECT l FROM Listcobr l WHERE l.ingresoDxpMasivo = :ingresoDxpMasivo")})
public class Listcobr implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "N_COBR", nullable = false)
    private Integer nCobr;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PCT_COMIS", nullable = false, precision = 5, scale = 2)
    private BigDecimal pctComis;
    @Basic(optional = false)
    @Column(name = "CON_IVA", nullable = false)
    private short conIva;
    @Column(name = "PORC_INICIAL", precision = 5, scale = 2)
    private BigDecimal porcInicial;
    @Column(name = "PORC_DCTOS", precision = 5, scale = 2)
    private BigDecimal porcDctos;
    @Basic(optional = false)
    @Column(name = "ESTADO", nullable = false)
    private short estado;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Column(name = "USUARIO_SISTEMA")
    private Short usuarioSistema;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @Column(name = "SEGUIDOC")
    private Short seguidoc;
    @Column(name = "NRO_TALONARIO")
    private Short nroTalonario;
    @Column(name = "COBRANZA_ELECTRONICA", length = 1)
    private String cobranzaElectronica;
    @Column(name = "IMP_COB_RESUMEN", length = 1)
    private String impCobResumen;
    @Column(name = "INGRESO_DXP_MASIVO", length = 1)
    private String ingresoDxpMasivo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nCobr")
    private List<Polsdemi> polsdemiList;
    @JoinColumn(name = "COD_BENEF", referencedColumnName = "COD_BENEF")
    @ManyToOne
    private Archbene codBenef;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;

    public Listcobr() {
    }

    public Listcobr(Integer nCobr) {
        this.nCobr = nCobr;
    }

    public Listcobr(Integer nCobr, String nombre, BigDecimal pctComis, short conIva, short estado, Date fechaCarga, int nroEntrada) {
        this.nCobr = nCobr;
        this.nombre = nombre;
        this.pctComis = pctComis;
        this.conIva = conIva;
        this.estado = estado;
        this.fechaCarga = fechaCarga;
        this.nroEntrada = nroEntrada;
    }

    public Integer getNCobr() {
        return nCobr;
    }

    public void setNCobr(Integer nCobr) {
        this.nCobr = nCobr;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPctComis() {
        return pctComis;
    }

    public void setPctComis(BigDecimal pctComis) {
        this.pctComis = pctComis;
    }

    public short getConIva() {
        return conIva;
    }

    public void setConIva(short conIva) {
        this.conIva = conIva;
    }

    public BigDecimal getPorcInicial() {
        return porcInicial;
    }

    public void setPorcInicial(BigDecimal porcInicial) {
        this.porcInicial = porcInicial;
    }

    public BigDecimal getPorcDctos() {
        return porcDctos;
    }

    public void setPorcDctos(BigDecimal porcDctos) {
        this.porcDctos = porcDctos;
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

    public Short getUsuarioSistema() {
        return usuarioSistema;
    }

    public void setUsuarioSistema(Short usuarioSistema) {
        this.usuarioSistema = usuarioSistema;
    }

    public int getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(int nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public Short getSeguidoc() {
        return seguidoc;
    }

    public void setSeguidoc(Short seguidoc) {
        this.seguidoc = seguidoc;
    }

    public Short getNroTalonario() {
        return nroTalonario;
    }

    public void setNroTalonario(Short nroTalonario) {
        this.nroTalonario = nroTalonario;
    }

    public String getCobranzaElectronica() {
        return cobranzaElectronica;
    }

    public void setCobranzaElectronica(String cobranzaElectronica) {
        this.cobranzaElectronica = cobranzaElectronica;
    }

    public String getImpCobResumen() {
        return impCobResumen;
    }

    public void setImpCobResumen(String impCobResumen) {
        this.impCobResumen = impCobResumen;
    }

    public String getIngresoDxpMasivo() {
        return ingresoDxpMasivo;
    }

    public void setIngresoDxpMasivo(String ingresoDxpMasivo) {
        this.ingresoDxpMasivo = ingresoDxpMasivo;
    }

    public List<Polsdemi> getPolsdemiList() {
        return polsdemiList;
    }

    public void setPolsdemiList(List<Polsdemi> polsdemiList) {
        this.polsdemiList = polsdemiList;
    }

    public Archbene getCodBenef() {
        return codBenef;
    }

    public void setCodBenef(Archbene codBenef) {
        this.codBenef = codBenef;
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
        hash += (nCobr != null ? nCobr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Listcobr)) {
            return false;
        }
        Listcobr other = (Listcobr) object;
        if ((this.nCobr == null && other.nCobr != null) || (this.nCobr != null && !this.nCobr.equals(other.nCobr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Listcobr[ nCobr=" + nCobr + " ]";
    }
    
}
