/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen.lrgxprod;

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

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "COTIZACIONES", schema = "RURAL")
@NamedQueries({
    @NamedQuery(name = "Cotizaciones.findAll", query = "SELECT c FROM Cotizaciones c"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionesid", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionesid = :cotizacionesid"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionesfecha", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionesfecha = :cotizacionesfecha"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionesual", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionesual = :cotizacionesual"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionesfal", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionesfal = :cotizacionesfal"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionesumd", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionesumd = :cotizacionesumd"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionesfmd", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionesfmd = :cotizacionesfmd"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionescantdetalles", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionescantdetalles = :cotizacionescantdetalles"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionesmda", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionesmda = :cotizacionesmda"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionestotalmonto", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionestotalmonto = :cotizacionestotalmonto"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionessuc", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionessuc = :cotizacionessuc"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionesmdacotiven", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionesmdacotiven = :cotizacionesmdacotiven"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionesmdacoticom", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionesmdacoticom = :cotizacionesmdacoticom"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionesfchmdacoti", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionesfchmdacoti = :cotizacionesfchmdacoti"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionessucnumerador", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionessucnumerador = :cotizacionessucnumerador"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionescomestado", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionescomestado = :cotizacionescomestado"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionesidagente", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionesidagente = :cotizacionesidagente"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionestipofranquicia", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionestipofranquicia = :cotizacionestipofranquicia"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionestipocoti", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionestipocoti = :cotizacionestipocoti"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionesidcobrador", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionesidcobrador = :cotizacionesidcobrador"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionesidprendario", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionesidprendario = :cotizacionesidprendario"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionesidoficial", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionesidoficial = :cotizacionesidoficial"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionesidformapago", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionesidformapago = :cotizacionesidformapago"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionesidtipocobro", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionesidtipocobro = :cotizacionesidtipocobro"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionesidagencia", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionesidagencia = :cotizacionesidagencia"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionescodentidad", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionescodentidad = :cotizacionescodentidad"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionesvtotarjeta", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionesvtotarjeta = :cotizacionesvtotarjeta"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionesnrotarjeta", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionesnrotarjeta = :cotizacionesnrotarjeta"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionestipoflota", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionestipoflota = :cotizacionestipoflota"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionesidsubagente", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionesidsubagente = :cotizacionesidsubagente"),
    @NamedQuery(name = "Cotizaciones.findByCotizacionesaprobcontclr", query = "SELECT c FROM Cotizaciones c WHERE c.cotizacionesaprobcontclr = :cotizacionesaprobcontclr")})
public class Cotizaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COTIZACIONESID", nullable = false)
    private Long cotizacionesid;
    @Basic(optional = false)
    @Column(name = "COTIZACIONESFECHA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date cotizacionesfecha;
    @Basic(optional = false)
    @Column(name = "COTIZACIONESUAL", nullable = false, length = 30)
    private String cotizacionesual;
    @Basic(optional = false)
    @Column(name = "COTIZACIONESFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date cotizacionesfal;
    @Column(name = "COTIZACIONESUMD", length = 30)
    private String cotizacionesumd;
    @Column(name = "COTIZACIONESFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cotizacionesfmd;
    @Basic(optional = false)
    @Column(name = "COTIZACIONESCANTDETALLES", nullable = false)
    private short cotizacionescantdetalles;
    @Basic(optional = false)
    @Column(name = "COTIZACIONESMDA", nullable = false)
    private short cotizacionesmda;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COTIZACIONESTOTALMONTO", precision = 17, scale = 2)
    private BigDecimal cotizacionestotalmonto;
    @Column(name = "COTIZACIONESSUC")
    private Long cotizacionessuc;
    @Column(name = "COTIZACIONESMDACOTIVEN", precision = 17, scale = 4)
    private BigDecimal cotizacionesmdacotiven;
    @Column(name = "COTIZACIONESMDACOTICOM", precision = 17, scale = 4)
    private BigDecimal cotizacionesmdacoticom;
    @Column(name = "COTIZACIONESFCHMDACOTI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cotizacionesfchmdacoti;
    @Column(name = "COTIZACIONESSUCNUMERADOR")
    private Long cotizacionessucnumerador;
    @Column(name = "COTIZACIONESCOMESTADO", length = 120)
    private String cotizacionescomestado;
    @Column(name = "COTIZACIONESIDAGENTE")
    private Long cotizacionesidagente;
    @Column(name = "COTIZACIONESTIPOFRANQUICIA")
    private Short cotizacionestipofranquicia;
    @Column(name = "COTIZACIONESTIPOCOTI")
    private Short cotizacionestipocoti;
    @Column(name = "COTIZACIONESIDCOBRADOR")
    private Long cotizacionesidcobrador;
    @Column(name = "COTIZACIONESIDPRENDARIO")
    private Long cotizacionesidprendario;
    @Column(name = "COTIZACIONESIDOFICIAL")
    private Long cotizacionesidoficial;
    @Column(name = "COTIZACIONESIDFORMAPAGO")
    private Long cotizacionesidformapago;
    @Column(name = "COTIZACIONESIDTIPOCOBRO")
    private Long cotizacionesidtipocobro;
    @Column(name = "COTIZACIONESIDAGENCIA")
    private Long cotizacionesidagencia;
    @Column(name = "COTIZACIONESCODENTIDAD")
    private Short cotizacionescodentidad;
    @Column(name = "COTIZACIONESVTOTARJETA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cotizacionesvtotarjeta;
    @Column(name = "COTIZACIONESNROTARJETA", length = 30)
    private String cotizacionesnrotarjeta;
    @Column(name = "COTIZACIONESTIPOFLOTA")
    private Short cotizacionestipoflota;
    @Column(name = "COTIZACIONESIDSUBAGENTE")
    private Long cotizacionesidsubagente;
    @Column(name = "COTIZACIONESAPROBCONTCLR")
    private Character cotizacionesaprobcontclr;
    @JoinColumn(name = "COTIZACIONESESTADO", referencedColumnName = "COTIZACIONESESTADO", nullable = false)
    @ManyToOne(optional = false)
    private Cotizacionesestado cotizacionesestado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cotizaciones")
    private List<Cotidetsecciones> cotidetseccionesList;

    public Cotizaciones() {
    }

    public Cotizaciones(Long cotizacionesid) {
        this.cotizacionesid = cotizacionesid;
    }

    public Cotizaciones(Long cotizacionesid, Date cotizacionesfecha, String cotizacionesual, Date cotizacionesfal, short cotizacionescantdetalles, short cotizacionesmda) {
        this.cotizacionesid = cotizacionesid;
        this.cotizacionesfecha = cotizacionesfecha;
        this.cotizacionesual = cotizacionesual;
        this.cotizacionesfal = cotizacionesfal;
        this.cotizacionescantdetalles = cotizacionescantdetalles;
        this.cotizacionesmda = cotizacionesmda;
    }

    public Long getCotizacionesid() {
        return cotizacionesid;
    }

    public void setCotizacionesid(Long cotizacionesid) {
        this.cotizacionesid = cotizacionesid;
    }

    public Date getCotizacionesfecha() {
        return cotizacionesfecha;
    }

    public void setCotizacionesfecha(Date cotizacionesfecha) {
        this.cotizacionesfecha = cotizacionesfecha;
    }

    public String getCotizacionesual() {
        return cotizacionesual;
    }

    public void setCotizacionesual(String cotizacionesual) {
        this.cotizacionesual = cotizacionesual;
    }

    public Date getCotizacionesfal() {
        return cotizacionesfal;
    }

    public void setCotizacionesfal(Date cotizacionesfal) {
        this.cotizacionesfal = cotizacionesfal;
    }

    public String getCotizacionesumd() {
        return cotizacionesumd;
    }

    public void setCotizacionesumd(String cotizacionesumd) {
        this.cotizacionesumd = cotizacionesumd;
    }

    public Date getCotizacionesfmd() {
        return cotizacionesfmd;
    }

    public void setCotizacionesfmd(Date cotizacionesfmd) {
        this.cotizacionesfmd = cotizacionesfmd;
    }

    public short getCotizacionescantdetalles() {
        return cotizacionescantdetalles;
    }

    public void setCotizacionescantdetalles(short cotizacionescantdetalles) {
        this.cotizacionescantdetalles = cotizacionescantdetalles;
    }

    public short getCotizacionesmda() {
        return cotizacionesmda;
    }

    public void setCotizacionesmda(short cotizacionesmda) {
        this.cotizacionesmda = cotizacionesmda;
    }

    public BigDecimal getCotizacionestotalmonto() {
        return cotizacionestotalmonto;
    }

    public void setCotizacionestotalmonto(BigDecimal cotizacionestotalmonto) {
        this.cotizacionestotalmonto = cotizacionestotalmonto;
    }

    public Long getCotizacionessuc() {
        return cotizacionessuc;
    }

    public void setCotizacionessuc(Long cotizacionessuc) {
        this.cotizacionessuc = cotizacionessuc;
    }

    public BigDecimal getCotizacionesmdacotiven() {
        return cotizacionesmdacotiven;
    }

    public void setCotizacionesmdacotiven(BigDecimal cotizacionesmdacotiven) {
        this.cotizacionesmdacotiven = cotizacionesmdacotiven;
    }

    public BigDecimal getCotizacionesmdacoticom() {
        return cotizacionesmdacoticom;
    }

    public void setCotizacionesmdacoticom(BigDecimal cotizacionesmdacoticom) {
        this.cotizacionesmdacoticom = cotizacionesmdacoticom;
    }

    public Date getCotizacionesfchmdacoti() {
        return cotizacionesfchmdacoti;
    }

    public void setCotizacionesfchmdacoti(Date cotizacionesfchmdacoti) {
        this.cotizacionesfchmdacoti = cotizacionesfchmdacoti;
    }

    public Long getCotizacionessucnumerador() {
        return cotizacionessucnumerador;
    }

    public void setCotizacionessucnumerador(Long cotizacionessucnumerador) {
        this.cotizacionessucnumerador = cotizacionessucnumerador;
    }

    public String getCotizacionescomestado() {
        return cotizacionescomestado;
    }

    public void setCotizacionescomestado(String cotizacionescomestado) {
        this.cotizacionescomestado = cotizacionescomestado;
    }

    public Long getCotizacionesidagente() {
        return cotizacionesidagente;
    }

    public void setCotizacionesidagente(Long cotizacionesidagente) {
        this.cotizacionesidagente = cotizacionesidagente;
    }

    public Short getCotizacionestipofranquicia() {
        return cotizacionestipofranquicia;
    }

    public void setCotizacionestipofranquicia(Short cotizacionestipofranquicia) {
        this.cotizacionestipofranquicia = cotizacionestipofranquicia;
    }

    public Short getCotizacionestipocoti() {
        return cotizacionestipocoti;
    }

    public void setCotizacionestipocoti(Short cotizacionestipocoti) {
        this.cotizacionestipocoti = cotizacionestipocoti;
    }

    public Long getCotizacionesidcobrador() {
        return cotizacionesidcobrador;
    }

    public void setCotizacionesidcobrador(Long cotizacionesidcobrador) {
        this.cotizacionesidcobrador = cotizacionesidcobrador;
    }

    public Long getCotizacionesidprendario() {
        return cotizacionesidprendario;
    }

    public void setCotizacionesidprendario(Long cotizacionesidprendario) {
        this.cotizacionesidprendario = cotizacionesidprendario;
    }

    public Long getCotizacionesidoficial() {
        return cotizacionesidoficial;
    }

    public void setCotizacionesidoficial(Long cotizacionesidoficial) {
        this.cotizacionesidoficial = cotizacionesidoficial;
    }

    public Long getCotizacionesidformapago() {
        return cotizacionesidformapago;
    }

    public void setCotizacionesidformapago(Long cotizacionesidformapago) {
        this.cotizacionesidformapago = cotizacionesidformapago;
    }

    public Long getCotizacionesidtipocobro() {
        return cotizacionesidtipocobro;
    }

    public void setCotizacionesidtipocobro(Long cotizacionesidtipocobro) {
        this.cotizacionesidtipocobro = cotizacionesidtipocobro;
    }

    public Long getCotizacionesidagencia() {
        return cotizacionesidagencia;
    }

    public void setCotizacionesidagencia(Long cotizacionesidagencia) {
        this.cotizacionesidagencia = cotizacionesidagencia;
    }

    public Short getCotizacionescodentidad() {
        return cotizacionescodentidad;
    }

    public void setCotizacionescodentidad(Short cotizacionescodentidad) {
        this.cotizacionescodentidad = cotizacionescodentidad;
    }

    public Date getCotizacionesvtotarjeta() {
        return cotizacionesvtotarjeta;
    }

    public void setCotizacionesvtotarjeta(Date cotizacionesvtotarjeta) {
        this.cotizacionesvtotarjeta = cotizacionesvtotarjeta;
    }

    public String getCotizacionesnrotarjeta() {
        return cotizacionesnrotarjeta;
    }

    public void setCotizacionesnrotarjeta(String cotizacionesnrotarjeta) {
        this.cotizacionesnrotarjeta = cotizacionesnrotarjeta;
    }

    public Short getCotizacionestipoflota() {
        return cotizacionestipoflota;
    }

    public void setCotizacionestipoflota(Short cotizacionestipoflota) {
        this.cotizacionestipoflota = cotizacionestipoflota;
    }

    public Long getCotizacionesidsubagente() {
        return cotizacionesidsubagente;
    }

    public void setCotizacionesidsubagente(Long cotizacionesidsubagente) {
        this.cotizacionesidsubagente = cotizacionesidsubagente;
    }

    public Character getCotizacionesaprobcontclr() {
        return cotizacionesaprobcontclr;
    }

    public void setCotizacionesaprobcontclr(Character cotizacionesaprobcontclr) {
        this.cotizacionesaprobcontclr = cotizacionesaprobcontclr;
    }

    public Cotizacionesestado getCotizacionesestado() {
        return cotizacionesestado;
    }

    public void setCotizacionesestado(Cotizacionesestado cotizacionesestado) {
        this.cotizacionesestado = cotizacionesestado;
    }

    public List<Cotidetsecciones> getCotidetseccionesList() {
        return cotidetseccionesList;
    }

    public void setCotidetseccionesList(List<Cotidetsecciones> cotidetseccionesList) {
        this.cotidetseccionesList = cotidetseccionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cotizacionesid != null ? cotizacionesid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cotizaciones)) {
            return false;
        }
        Cotizaciones other = (Cotizaciones) object;
        if ((this.cotizacionesid == null && other.cotizacionesid != null) || (this.cotizacionesid != null && !this.cotizacionesid.equals(other.cotizacionesid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.lrgxprod.Cotizaciones[ cotizacionesid=" + cotizacionesid + " ]";
    }
    
}
