/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen.lrgxprod;

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
@Table(name = "COTIDATBIENASE", schema = "RURAL")
@NamedQueries({
    @NamedQuery(name = "Cotidatbienase.findAll", query = "SELECT c FROM Cotidatbienase c"),
    @NamedQuery(name = "Cotidatbienase.findByCotizacionesid", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasePK.cotizacionesid = :cotizacionesid"),
    @NamedQuery(name = "Cotidatbienase.findByCotidetseccionesid", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasePK.cotidetseccionesid = :cotidetseccionesid"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienaseid", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasePK.cotidatbienaseid = :cotidatbienaseid"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienaseual", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienaseual = :cotidatbienaseual"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasefal", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasefal = :cotidatbienasefal"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienaseumd", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienaseumd = :cotidatbienaseumd"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasefmd", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasefmd = :cotidatbienasefmd"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienaseejer", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienaseejer = :cotidatbienaseejer"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasetipoper", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasetipoper = :cotidatbienasetipoper"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasetipsegu", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasetipsegu = :cotidatbienasetipsegu"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasepolnro", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasepolnro = :cotidatbienasepolnro"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienaseanexo", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienaseanexo = :cotidatbienaseanexo"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasevtipoid", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasevtipoid = :cotidatbienasevtipoid"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasevmarcaid", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasevmarcaid = :cotidatbienasevmarcaid"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasevmodelo", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasevmodelo = :cotidatbienasevmodelo"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasevanio", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasevanio = :cotidatbienasevanio"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasevnromotor", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasevnromotor = :cotidatbienasevnromotor"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasevalorcasco", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasevalorcasco = :cotidatbienasevalorcasco"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasevnrochasis", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasevnrochasis = :cotidatbienasevnrochasis"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasevnrochapa", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasevnrochapa = :cotidatbienasevnrochapa"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasevcantocup", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasevcantocup = :cotidatbienasevcantocup"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasevblindaje", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasevblindaje = :cotidatbienasevblindaje"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasevtubosin", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasevtubosin = :cotidatbienasevtubosin"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasevdatimpo", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasevdatimpo = :cotidatbienasevdatimpo"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienaseairbacotros", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienaseairbacotros = :cotidatbienaseairbacotros"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienaseairbacl", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienaseairbacl = :cotidatbienaseairbacl"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienaseairbacf", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienaseairbacf = :cotidatbienaseairbacf"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasesissegtip", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasesissegtip = :cotidatbienasesissegtip"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasesisseg", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasesisseg = :cotidatbienasesisseg"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasecilindros", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasecilindros = :cotidatbienasecilindros"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasecaja", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasecaja = :cotidatbienasecaja"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasetipoeje", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasetipoeje = :cotidatbienasetipoeje"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasetracc", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasetracc = :cotidatbienasetracc"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasemovido", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasemovido = :cotidatbienasemovido"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasepuertas", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasepuertas = :cotidatbienasepuertas"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasevproce", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasevproce = :cotidatbienasevproce"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasevtone", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasevtone = :cotidatbienasevtone"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasevcolor", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasevcolor = :cotidatbienasevcolor"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienaseantiguedad", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienaseantiguedad = :cotidatbienaseantiguedad"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienaseusovehi", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienaseusovehi = :cotidatbienaseusovehi"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasecodgps", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasecodgps = :cotidatbienasecodgps"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasevalorblindaje", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasevalorblindaje = :cotidatbienasevalorblindaje"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasecobraiva", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasecobraiva = :cotidatbienasecobraiva"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienaserccartaverde", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienaserccartaverde = :cotidatbienaserccartaverde"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasercadicional", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasercadicional = :cotidatbienasercadicional"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasediasvigencia", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasediasvigencia = :cotidatbienasediasvigencia"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasefchvighasta", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasefchvighasta = :cotidatbienasefchvighasta"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasefchvigdesde", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasefchvigdesde = :cotidatbienasefchvigdesde"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienaseovpadicional", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienaseovpadicional = :cotidatbienaseovpadicional"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasetipofranquicia", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasetipofranquicia = :cotidatbienasetipofranquicia"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasesingrua", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasesingrua = :cotidatbienasesingrua"),
    @NamedQuery(name = "Cotidatbienase.findByCotidatbienasetipoblindaje", query = "SELECT c FROM Cotidatbienase c WHERE c.cotidatbienasetipoblindaje = :cotidatbienasetipoblindaje")})
public class Cotidatbienase implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CotidatbienasePK cotidatbienasePK;
    @Basic(optional = false)
    @Column(name = "COTIDATBIENASEUAL", nullable = false, length = 30)
    private String cotidatbienaseual;
    @Basic(optional = false)
    @Column(name = "COTIDATBIENASEFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date cotidatbienasefal;
    @Column(name = "COTIDATBIENASEUMD", length = 30)
    private String cotidatbienaseumd;
    @Column(name = "COTIDATBIENASEFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cotidatbienasefmd;
    @Column(name = "COTIDATBIENASEEJER")
    private Short cotidatbienaseejer;
    @Basic(optional = false)
    @Column(name = "COTIDATBIENASETIPOPER", nullable = false)
    private short cotidatbienasetipoper;
    @Column(name = "COTIDATBIENASETIPSEGU")
    private Short cotidatbienasetipsegu;
    @Column(name = "COTIDATBIENASEPOLNRO")
    private Integer cotidatbienasepolnro;
    @Column(name = "COTIDATBIENASEANEXO")
    private Short cotidatbienaseanexo;
    @Column(name = "COTIDATBIENASEVTIPOID")
    private Long cotidatbienasevtipoid;
    @Column(name = "COTIDATBIENASEVMARCAID")
    private Long cotidatbienasevmarcaid;
    @Column(name = "COTIDATBIENASEVMODELO")
    private Long cotidatbienasevmodelo;
    @Column(name = "COTIDATBIENASEVANIO")
    private Short cotidatbienasevanio;
    @Column(name = "COTIDATBIENASEVNROMOTOR", length = 60)
    private String cotidatbienasevnromotor;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COTIDATBIENASEVALORCASCO", precision = 17, scale = 2)
    private BigDecimal cotidatbienasevalorcasco;
    @Column(name = "COTIDATBIENASEVNROCHASIS", length = 60)
    private String cotidatbienasevnrochasis;
    @Column(name = "COTIDATBIENASEVNROCHAPA", length = 30)
    private String cotidatbienasevnrochapa;
    @Column(name = "COTIDATBIENASEVCANTOCUP")
    private Short cotidatbienasevcantocup;
    @Column(name = "COTIDATBIENASEVBLINDAJE")
    private Short cotidatbienasevblindaje;
    @Column(name = "COTIDATBIENASEVTUBOSIN")
    private Short cotidatbienasevtubosin;
    @Column(name = "COTIDATBIENASEVDATIMPO")
    private Short cotidatbienasevdatimpo;
    @Column(name = "COTIDATBIENASEAIRBACOTROS", length = 60)
    private String cotidatbienaseairbacotros;
    @Column(name = "COTIDATBIENASEAIRBACL")
    private Short cotidatbienaseairbacl;
    @Column(name = "COTIDATBIENASEAIRBACF")
    private Short cotidatbienaseairbacf;
    @Column(name = "COTIDATBIENASESISSEGTIP", length = 60)
    private String cotidatbienasesissegtip;
    @Column(name = "COTIDATBIENASESISSEG")
    private Short cotidatbienasesisseg;
    @Column(name = "COTIDATBIENASECILINDROS", length = 60)
    private String cotidatbienasecilindros;
    @Column(name = "COTIDATBIENASECAJA", length = 3)
    private String cotidatbienasecaja;
    @Column(name = "COTIDATBIENASETIPOEJE", length = 60)
    private String cotidatbienasetipoeje;
    @Column(name = "COTIDATBIENASETRACC", length = 60)
    private String cotidatbienasetracc;
    @Column(name = "COTIDATBIENASEMOVIDO", length = 60)
    private String cotidatbienasemovido;
    @Column(name = "COTIDATBIENASEPUERTAS")
    private Short cotidatbienasepuertas;
    @Column(name = "COTIDATBIENASEVPROCE")
    private Long cotidatbienasevproce;
    @Column(name = "COTIDATBIENASEVTONE", length = 60)
    private String cotidatbienasevtone;
    @Column(name = "COTIDATBIENASEVCOLOR")
    private Long cotidatbienasevcolor;
    @Column(name = "COTIDATBIENASEANTIGUEDAD")
    private Short cotidatbienaseantiguedad;
    @Column(name = "COTIDATBIENASEUSOVEHI")
    private Long cotidatbienaseusovehi;
    @Column(name = "COTIDATBIENASECODGPS")
    private Short cotidatbienasecodgps;
    @Column(name = "COTIDATBIENASEVALORBLINDAJE", precision = 17, scale = 2)
    private BigDecimal cotidatbienasevalorblindaje;
    @Column(name = "COTIDATBIENASECOBRAIVA")
    private Short cotidatbienasecobraiva;
    @Column(name = "COTIDATBIENASERCCARTAVERDE")
    private Short cotidatbienaserccartaverde;
    @Column(name = "COTIDATBIENASERCADICIONAL")
    private Short cotidatbienasercadicional;
    @Column(name = "COTIDATBIENASEDIASVIGENCIA")
    private Short cotidatbienasediasvigencia;
    @Column(name = "COTIDATBIENASEFCHVIGHASTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cotidatbienasefchvighasta;
    @Column(name = "COTIDATBIENASEFCHVIGDESDE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cotidatbienasefchvigdesde;
    @Column(name = "COTIDATBIENASEOVPADICIONAL")
    private Short cotidatbienaseovpadicional;
    @Column(name = "COTIDATBIENASETIPOFRANQUICIA")
    private Short cotidatbienasetipofranquicia;
    @Column(name = "COTIDATBIENASESINGRUA")
    private Short cotidatbienasesingrua;
    @Column(name = "COTIDATBIENASETIPOBLINDAJE", length = 10)
    private String cotidatbienasetipoblindaje;
    @JoinColumns({
        @JoinColumn(name = "COTIZACIONESID", referencedColumnName = "COTIZACIONESID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "COTIDETSECCIONESID", referencedColumnName = "COTIDETSECCIONESID", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Cotidetsecciones cotidetsecciones;

    public Cotidatbienase() {
    }

    public Cotidatbienase(CotidatbienasePK cotidatbienasePK) {
        this.cotidatbienasePK = cotidatbienasePK;
    }

    public Cotidatbienase(CotidatbienasePK cotidatbienasePK, String cotidatbienaseual, Date cotidatbienasefal, short cotidatbienasetipoper) {
        this.cotidatbienasePK = cotidatbienasePK;
        this.cotidatbienaseual = cotidatbienaseual;
        this.cotidatbienasefal = cotidatbienasefal;
        this.cotidatbienasetipoper = cotidatbienasetipoper;
    }

    public Cotidatbienase(long cotizacionesid, long cotidetseccionesid, long cotidatbienaseid) {
        this.cotidatbienasePK = new CotidatbienasePK(cotizacionesid, cotidetseccionesid, cotidatbienaseid);
    }

    public CotidatbienasePK getCotidatbienasePK() {
        return cotidatbienasePK;
    }

    public void setCotidatbienasePK(CotidatbienasePK cotidatbienasePK) {
        this.cotidatbienasePK = cotidatbienasePK;
    }

    public String getCotidatbienaseual() {
        return cotidatbienaseual;
    }

    public void setCotidatbienaseual(String cotidatbienaseual) {
        this.cotidatbienaseual = cotidatbienaseual;
    }

    public Date getCotidatbienasefal() {
        return cotidatbienasefal;
    }

    public void setCotidatbienasefal(Date cotidatbienasefal) {
        this.cotidatbienasefal = cotidatbienasefal;
    }

    public String getCotidatbienaseumd() {
        return cotidatbienaseumd;
    }

    public void setCotidatbienaseumd(String cotidatbienaseumd) {
        this.cotidatbienaseumd = cotidatbienaseumd;
    }

    public Date getCotidatbienasefmd() {
        return cotidatbienasefmd;
    }

    public void setCotidatbienasefmd(Date cotidatbienasefmd) {
        this.cotidatbienasefmd = cotidatbienasefmd;
    }

    public Short getCotidatbienaseejer() {
        return cotidatbienaseejer;
    }

    public void setCotidatbienaseejer(Short cotidatbienaseejer) {
        this.cotidatbienaseejer = cotidatbienaseejer;
    }

    public short getCotidatbienasetipoper() {
        return cotidatbienasetipoper;
    }

    public void setCotidatbienasetipoper(short cotidatbienasetipoper) {
        this.cotidatbienasetipoper = cotidatbienasetipoper;
    }

    public Short getCotidatbienasetipsegu() {
        return cotidatbienasetipsegu;
    }

    public void setCotidatbienasetipsegu(Short cotidatbienasetipsegu) {
        this.cotidatbienasetipsegu = cotidatbienasetipsegu;
    }

    public Integer getCotidatbienasepolnro() {
        return cotidatbienasepolnro;
    }

    public void setCotidatbienasepolnro(Integer cotidatbienasepolnro) {
        this.cotidatbienasepolnro = cotidatbienasepolnro;
    }

    public Short getCotidatbienaseanexo() {
        return cotidatbienaseanexo;
    }

    public void setCotidatbienaseanexo(Short cotidatbienaseanexo) {
        this.cotidatbienaseanexo = cotidatbienaseanexo;
    }

    public Long getCotidatbienasevtipoid() {
        return cotidatbienasevtipoid;
    }

    public void setCotidatbienasevtipoid(Long cotidatbienasevtipoid) {
        this.cotidatbienasevtipoid = cotidatbienasevtipoid;
    }

    public Long getCotidatbienasevmarcaid() {
        return cotidatbienasevmarcaid;
    }

    public void setCotidatbienasevmarcaid(Long cotidatbienasevmarcaid) {
        this.cotidatbienasevmarcaid = cotidatbienasevmarcaid;
    }

    public Long getCotidatbienasevmodelo() {
        return cotidatbienasevmodelo;
    }

    public void setCotidatbienasevmodelo(Long cotidatbienasevmodelo) {
        this.cotidatbienasevmodelo = cotidatbienasevmodelo;
    }

    public Short getCotidatbienasevanio() {
        return cotidatbienasevanio;
    }

    public void setCotidatbienasevanio(Short cotidatbienasevanio) {
        this.cotidatbienasevanio = cotidatbienasevanio;
    }

    public String getCotidatbienasevnromotor() {
        return cotidatbienasevnromotor;
    }

    public void setCotidatbienasevnromotor(String cotidatbienasevnromotor) {
        this.cotidatbienasevnromotor = cotidatbienasevnromotor;
    }

    public BigDecimal getCotidatbienasevalorcasco() {
        return cotidatbienasevalorcasco;
    }

    public void setCotidatbienasevalorcasco(BigDecimal cotidatbienasevalorcasco) {
        this.cotidatbienasevalorcasco = cotidatbienasevalorcasco;
    }

    public String getCotidatbienasevnrochasis() {
        return cotidatbienasevnrochasis;
    }

    public void setCotidatbienasevnrochasis(String cotidatbienasevnrochasis) {
        this.cotidatbienasevnrochasis = cotidatbienasevnrochasis;
    }

    public String getCotidatbienasevnrochapa() {
        return cotidatbienasevnrochapa;
    }

    public void setCotidatbienasevnrochapa(String cotidatbienasevnrochapa) {
        this.cotidatbienasevnrochapa = cotidatbienasevnrochapa;
    }

    public Short getCotidatbienasevcantocup() {
        return cotidatbienasevcantocup;
    }

    public void setCotidatbienasevcantocup(Short cotidatbienasevcantocup) {
        this.cotidatbienasevcantocup = cotidatbienasevcantocup;
    }

    public Short getCotidatbienasevblindaje() {
        return cotidatbienasevblindaje;
    }

    public void setCotidatbienasevblindaje(Short cotidatbienasevblindaje) {
        this.cotidatbienasevblindaje = cotidatbienasevblindaje;
    }

    public Short getCotidatbienasevtubosin() {
        return cotidatbienasevtubosin;
    }

    public void setCotidatbienasevtubosin(Short cotidatbienasevtubosin) {
        this.cotidatbienasevtubosin = cotidatbienasevtubosin;
    }

    public Short getCotidatbienasevdatimpo() {
        return cotidatbienasevdatimpo;
    }

    public void setCotidatbienasevdatimpo(Short cotidatbienasevdatimpo) {
        this.cotidatbienasevdatimpo = cotidatbienasevdatimpo;
    }

    public String getCotidatbienaseairbacotros() {
        return cotidatbienaseairbacotros;
    }

    public void setCotidatbienaseairbacotros(String cotidatbienaseairbacotros) {
        this.cotidatbienaseairbacotros = cotidatbienaseairbacotros;
    }

    public Short getCotidatbienaseairbacl() {
        return cotidatbienaseairbacl;
    }

    public void setCotidatbienaseairbacl(Short cotidatbienaseairbacl) {
        this.cotidatbienaseairbacl = cotidatbienaseairbacl;
    }

    public Short getCotidatbienaseairbacf() {
        return cotidatbienaseairbacf;
    }

    public void setCotidatbienaseairbacf(Short cotidatbienaseairbacf) {
        this.cotidatbienaseairbacf = cotidatbienaseairbacf;
    }

    public String getCotidatbienasesissegtip() {
        return cotidatbienasesissegtip;
    }

    public void setCotidatbienasesissegtip(String cotidatbienasesissegtip) {
        this.cotidatbienasesissegtip = cotidatbienasesissegtip;
    }

    public Short getCotidatbienasesisseg() {
        return cotidatbienasesisseg;
    }

    public void setCotidatbienasesisseg(Short cotidatbienasesisseg) {
        this.cotidatbienasesisseg = cotidatbienasesisseg;
    }

    public String getCotidatbienasecilindros() {
        return cotidatbienasecilindros;
    }

    public void setCotidatbienasecilindros(String cotidatbienasecilindros) {
        this.cotidatbienasecilindros = cotidatbienasecilindros;
    }

    public String getCotidatbienasecaja() {
        return cotidatbienasecaja;
    }

    public void setCotidatbienasecaja(String cotidatbienasecaja) {
        this.cotidatbienasecaja = cotidatbienasecaja;
    }

    public String getCotidatbienasetipoeje() {
        return cotidatbienasetipoeje;
    }

    public void setCotidatbienasetipoeje(String cotidatbienasetipoeje) {
        this.cotidatbienasetipoeje = cotidatbienasetipoeje;
    }

    public String getCotidatbienasetracc() {
        return cotidatbienasetracc;
    }

    public void setCotidatbienasetracc(String cotidatbienasetracc) {
        this.cotidatbienasetracc = cotidatbienasetracc;
    }

    public String getCotidatbienasemovido() {
        return cotidatbienasemovido;
    }

    public void setCotidatbienasemovido(String cotidatbienasemovido) {
        this.cotidatbienasemovido = cotidatbienasemovido;
    }

    public Short getCotidatbienasepuertas() {
        return cotidatbienasepuertas;
    }

    public void setCotidatbienasepuertas(Short cotidatbienasepuertas) {
        this.cotidatbienasepuertas = cotidatbienasepuertas;
    }

    public Long getCotidatbienasevproce() {
        return cotidatbienasevproce;
    }

    public void setCotidatbienasevproce(Long cotidatbienasevproce) {
        this.cotidatbienasevproce = cotidatbienasevproce;
    }

    public String getCotidatbienasevtone() {
        return cotidatbienasevtone;
    }

    public void setCotidatbienasevtone(String cotidatbienasevtone) {
        this.cotidatbienasevtone = cotidatbienasevtone;
    }

    public Long getCotidatbienasevcolor() {
        return cotidatbienasevcolor;
    }

    public void setCotidatbienasevcolor(Long cotidatbienasevcolor) {
        this.cotidatbienasevcolor = cotidatbienasevcolor;
    }

    public Short getCotidatbienaseantiguedad() {
        return cotidatbienaseantiguedad;
    }

    public void setCotidatbienaseantiguedad(Short cotidatbienaseantiguedad) {
        this.cotidatbienaseantiguedad = cotidatbienaseantiguedad;
    }

    public Long getCotidatbienaseusovehi() {
        return cotidatbienaseusovehi;
    }

    public void setCotidatbienaseusovehi(Long cotidatbienaseusovehi) {
        this.cotidatbienaseusovehi = cotidatbienaseusovehi;
    }

    public Short getCotidatbienasecodgps() {
        return cotidatbienasecodgps;
    }

    public void setCotidatbienasecodgps(Short cotidatbienasecodgps) {
        this.cotidatbienasecodgps = cotidatbienasecodgps;
    }

    public BigDecimal getCotidatbienasevalorblindaje() {
        return cotidatbienasevalorblindaje;
    }

    public void setCotidatbienasevalorblindaje(BigDecimal cotidatbienasevalorblindaje) {
        this.cotidatbienasevalorblindaje = cotidatbienasevalorblindaje;
    }

    public Short getCotidatbienasecobraiva() {
        return cotidatbienasecobraiva;
    }

    public void setCotidatbienasecobraiva(Short cotidatbienasecobraiva) {
        this.cotidatbienasecobraiva = cotidatbienasecobraiva;
    }

    public Short getCotidatbienaserccartaverde() {
        return cotidatbienaserccartaverde;
    }

    public void setCotidatbienaserccartaverde(Short cotidatbienaserccartaverde) {
        this.cotidatbienaserccartaverde = cotidatbienaserccartaverde;
    }

    public Short getCotidatbienasercadicional() {
        return cotidatbienasercadicional;
    }

    public void setCotidatbienasercadicional(Short cotidatbienasercadicional) {
        this.cotidatbienasercadicional = cotidatbienasercadicional;
    }

    public Short getCotidatbienasediasvigencia() {
        return cotidatbienasediasvigencia;
    }

    public void setCotidatbienasediasvigencia(Short cotidatbienasediasvigencia) {
        this.cotidatbienasediasvigencia = cotidatbienasediasvigencia;
    }

    public Date getCotidatbienasefchvighasta() {
        return cotidatbienasefchvighasta;
    }

    public void setCotidatbienasefchvighasta(Date cotidatbienasefchvighasta) {
        this.cotidatbienasefchvighasta = cotidatbienasefchvighasta;
    }

    public Date getCotidatbienasefchvigdesde() {
        return cotidatbienasefchvigdesde;
    }

    public void setCotidatbienasefchvigdesde(Date cotidatbienasefchvigdesde) {
        this.cotidatbienasefchvigdesde = cotidatbienasefchvigdesde;
    }

    public Short getCotidatbienaseovpadicional() {
        return cotidatbienaseovpadicional;
    }

    public void setCotidatbienaseovpadicional(Short cotidatbienaseovpadicional) {
        this.cotidatbienaseovpadicional = cotidatbienaseovpadicional;
    }

    public Short getCotidatbienasetipofranquicia() {
        return cotidatbienasetipofranquicia;
    }

    public void setCotidatbienasetipofranquicia(Short cotidatbienasetipofranquicia) {
        this.cotidatbienasetipofranquicia = cotidatbienasetipofranquicia;
    }

    public Short getCotidatbienasesingrua() {
        return cotidatbienasesingrua;
    }

    public void setCotidatbienasesingrua(Short cotidatbienasesingrua) {
        this.cotidatbienasesingrua = cotidatbienasesingrua;
    }

    public String getCotidatbienasetipoblindaje() {
        return cotidatbienasetipoblindaje;
    }

    public void setCotidatbienasetipoblindaje(String cotidatbienasetipoblindaje) {
        this.cotidatbienasetipoblindaje = cotidatbienasetipoblindaje;
    }

    public Cotidetsecciones getCotidetsecciones() {
        return cotidetsecciones;
    }

    public void setCotidetsecciones(Cotidetsecciones cotidetsecciones) {
        this.cotidetsecciones = cotidetsecciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cotidatbienasePK != null ? cotidatbienasePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cotidatbienase)) {
            return false;
        }
        Cotidatbienase other = (Cotidatbienase) object;
        if ((this.cotidatbienasePK == null && other.cotidatbienasePK != null) || (this.cotidatbienasePK != null && !this.cotidatbienasePK.equals(other.cotidatbienasePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.lrgxprod.Cotidatbienase[ cotidatbienasePK=" + cotidatbienasePK + " ]";
    }
    
}
