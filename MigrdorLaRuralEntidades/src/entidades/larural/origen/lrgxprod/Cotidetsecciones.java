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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "COTIDETSECCIONES", schema = "RURAL")
@NamedQueries({
    @NamedQuery(name = "Cotidetsecciones.findAll", query = "SELECT c FROM Cotidetsecciones c"),
    @NamedQuery(name = "Cotidetsecciones.findByCotizacionesid", query = "SELECT c FROM Cotidetsecciones c WHERE c.cotidetseccionesPK.cotizacionesid = :cotizacionesid"),
    @NamedQuery(name = "Cotidetsecciones.findByCotidetseccionesid", query = "SELECT c FROM Cotidetsecciones c WHERE c.cotidetseccionesPK.cotidetseccionesid = :cotidetseccionesid"),
    @NamedQuery(name = "Cotidetsecciones.findByCotidetseccionesual", query = "SELECT c FROM Cotidetsecciones c WHERE c.cotidetseccionesual = :cotidetseccionesual"),
    @NamedQuery(name = "Cotidetsecciones.findByCotidetseccionesfal", query = "SELECT c FROM Cotidetsecciones c WHERE c.cotidetseccionesfal = :cotidetseccionesfal"),
    @NamedQuery(name = "Cotidetsecciones.findByCotidetseccionesumd", query = "SELECT c FROM Cotidetsecciones c WHERE c.cotidetseccionesumd = :cotidetseccionesumd"),
    @NamedQuery(name = "Cotidetsecciones.findByCotidetseccionesfmd", query = "SELECT c FROM Cotidetsecciones c WHERE c.cotidetseccionesfmd = :cotidetseccionesfmd"),
    @NamedQuery(name = "Cotidetsecciones.findByCotidetseccionesmto", query = "SELECT c FROM Cotidetsecciones c WHERE c.cotidetseccionesmto = :cotidetseccionesmto"),
    @NamedQuery(name = "Cotidetsecciones.findByCotidetseccionesidplan", query = "SELECT c FROM Cotidetsecciones c WHERE c.cotidetseccionesidplan = :cotidetseccionesidplan"),
    @NamedQuery(name = "Cotidetsecciones.findByCotidetseccionesclasepoliza", query = "SELECT c FROM Cotidetsecciones c WHERE c.cotidetseccionesclasepoliza = :cotidetseccionesclasepoliza"),
    @NamedQuery(name = "Cotidetsecciones.findByCotidetseccionesclaseaseg", query = "SELECT c FROM Cotidetsecciones c WHERE c.cotidetseccionesclaseaseg = :cotidetseccionesclaseaseg"),
    @NamedQuery(name = "Cotidetsecciones.findByCotidetseccionescancuotas", query = "SELECT c FROM Cotidetsecciones c WHERE c.cotidetseccionescancuotas = :cotidetseccionescancuotas"),
    @NamedQuery(name = "Cotidetsecciones.findByCotidetseccionesimpinicial", query = "SELECT c FROM Cotidetsecciones c WHERE c.cotidetseccionesimpinicial = :cotidetseccionesimpinicial"),
    @NamedQuery(name = "Cotidetsecciones.findByCotidetseccionesimpcuota", query = "SELECT c FROM Cotidetsecciones c WHERE c.cotidetseccionesimpcuota = :cotidetseccionesimpcuota"),
    @NamedQuery(name = "Cotidetsecciones.findByCotidetseccionespolnro", query = "SELECT c FROM Cotidetsecciones c WHERE c.cotidetseccionespolnro = :cotidetseccionespolnro")})
public class Cotidetsecciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CotidetseccionesPK cotidetseccionesPK;
    @Basic(optional = false)
    @Column(name = "COTIDETSECCIONESUAL", nullable = false, length = 30)
    private String cotidetseccionesual;
    @Column(name = "COTIDETSECCIONESFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cotidetseccionesfal;
    @Column(name = "COTIDETSECCIONESUMD", length = 30)
    private String cotidetseccionesumd;
    @Column(name = "COTIDETSECCIONESFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cotidetseccionesfmd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COTIDETSECCIONESMTO", precision = 17, scale = 2)
    private BigDecimal cotidetseccionesmto;
    @Column(name = "COTIDETSECCIONESIDPLAN")
    private Long cotidetseccionesidplan;
    @Column(name = "COTIDETSECCIONESCLASEPOLIZA", length = 26)
    private String cotidetseccionesclasepoliza;
    @Column(name = "COTIDETSECCIONESCLASEASEG", length = 11)
    private String cotidetseccionesclaseaseg;
    @Column(name = "COTIDETSECCIONESCANCUOTAS")
    private Short cotidetseccionescancuotas;
    @Column(name = "COTIDETSECCIONESIMPINICIAL", precision = 16, scale = 2)
    private BigDecimal cotidetseccionesimpinicial;
    @Column(name = "COTIDETSECCIONESIMPCUOTA", precision = 16, scale = 2)
    private BigDecimal cotidetseccionesimpcuota;
    @Column(name = "COTIDETSECCIONESPOLNRO")
    private Integer cotidetseccionespolnro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cotidetsecciones")
    private List<Cotidatbienase> cotidatbienaseList;
    @JoinColumn(name = "COTIZACIONESID", referencedColumnName = "COTIZACIONESID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cotizaciones cotizaciones;
    @JoinColumn(name = "PARMCOTISECCIONESID", referencedColumnName = "PARMCOTISECCIONESID", nullable = false)
    @ManyToOne(optional = false)
    private Parmcotisecciones parmcotiseccionesid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cotidetsecciones")
    private List<Cotiitemformulas> cotiitemformulasList;

    public Cotidetsecciones() {
    }

    public Cotidetsecciones(CotidetseccionesPK cotidetseccionesPK) {
        this.cotidetseccionesPK = cotidetseccionesPK;
    }

    public Cotidetsecciones(CotidetseccionesPK cotidetseccionesPK, String cotidetseccionesual) {
        this.cotidetseccionesPK = cotidetseccionesPK;
        this.cotidetseccionesual = cotidetseccionesual;
    }

    public Cotidetsecciones(long cotizacionesid, long cotidetseccionesid) {
        this.cotidetseccionesPK = new CotidetseccionesPK(cotizacionesid, cotidetseccionesid);
    }

    public CotidetseccionesPK getCotidetseccionesPK() {
        return cotidetseccionesPK;
    }

    public void setCotidetseccionesPK(CotidetseccionesPK cotidetseccionesPK) {
        this.cotidetseccionesPK = cotidetseccionesPK;
    }

    public String getCotidetseccionesual() {
        return cotidetseccionesual;
    }

    public void setCotidetseccionesual(String cotidetseccionesual) {
        this.cotidetseccionesual = cotidetseccionesual;
    }

    public Date getCotidetseccionesfal() {
        return cotidetseccionesfal;
    }

    public void setCotidetseccionesfal(Date cotidetseccionesfal) {
        this.cotidetseccionesfal = cotidetseccionesfal;
    }

    public String getCotidetseccionesumd() {
        return cotidetseccionesumd;
    }

    public void setCotidetseccionesumd(String cotidetseccionesumd) {
        this.cotidetseccionesumd = cotidetseccionesumd;
    }

    public Date getCotidetseccionesfmd() {
        return cotidetseccionesfmd;
    }

    public void setCotidetseccionesfmd(Date cotidetseccionesfmd) {
        this.cotidetseccionesfmd = cotidetseccionesfmd;
    }

    public BigDecimal getCotidetseccionesmto() {
        return cotidetseccionesmto;
    }

    public void setCotidetseccionesmto(BigDecimal cotidetseccionesmto) {
        this.cotidetseccionesmto = cotidetseccionesmto;
    }

    public Long getCotidetseccionesidplan() {
        return cotidetseccionesidplan;
    }

    public void setCotidetseccionesidplan(Long cotidetseccionesidplan) {
        this.cotidetseccionesidplan = cotidetseccionesidplan;
    }

    public String getCotidetseccionesclasepoliza() {
        return cotidetseccionesclasepoliza;
    }

    public void setCotidetseccionesclasepoliza(String cotidetseccionesclasepoliza) {
        this.cotidetseccionesclasepoliza = cotidetseccionesclasepoliza;
    }

    public String getCotidetseccionesclaseaseg() {
        return cotidetseccionesclaseaseg;
    }

    public void setCotidetseccionesclaseaseg(String cotidetseccionesclaseaseg) {
        this.cotidetseccionesclaseaseg = cotidetseccionesclaseaseg;
    }

    public Short getCotidetseccionescancuotas() {
        return cotidetseccionescancuotas;
    }

    public void setCotidetseccionescancuotas(Short cotidetseccionescancuotas) {
        this.cotidetseccionescancuotas = cotidetseccionescancuotas;
    }

    public BigDecimal getCotidetseccionesimpinicial() {
        return cotidetseccionesimpinicial;
    }

    public void setCotidetseccionesimpinicial(BigDecimal cotidetseccionesimpinicial) {
        this.cotidetseccionesimpinicial = cotidetseccionesimpinicial;
    }

    public BigDecimal getCotidetseccionesimpcuota() {
        return cotidetseccionesimpcuota;
    }

    public void setCotidetseccionesimpcuota(BigDecimal cotidetseccionesimpcuota) {
        this.cotidetseccionesimpcuota = cotidetseccionesimpcuota;
    }

    public Integer getCotidetseccionespolnro() {
        return cotidetseccionespolnro;
    }

    public void setCotidetseccionespolnro(Integer cotidetseccionespolnro) {
        this.cotidetseccionespolnro = cotidetseccionespolnro;
    }

    public List<Cotidatbienase> getCotidatbienaseList() {
        return cotidatbienaseList;
    }

    public void setCotidatbienaseList(List<Cotidatbienase> cotidatbienaseList) {
        this.cotidatbienaseList = cotidatbienaseList;
    }

    public Cotizaciones getCotizaciones() {
        return cotizaciones;
    }

    public void setCotizaciones(Cotizaciones cotizaciones) {
        this.cotizaciones = cotizaciones;
    }

    public Parmcotisecciones getParmcotiseccionesid() {
        return parmcotiseccionesid;
    }

    public void setParmcotiseccionesid(Parmcotisecciones parmcotiseccionesid) {
        this.parmcotiseccionesid = parmcotiseccionesid;
    }

    public List<Cotiitemformulas> getCotiitemformulasList() {
        return cotiitemformulasList;
    }

    public void setCotiitemformulasList(List<Cotiitemformulas> cotiitemformulasList) {
        this.cotiitemformulasList = cotiitemformulasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cotidetseccionesPK != null ? cotidetseccionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cotidetsecciones)) {
            return false;
        }
        Cotidetsecciones other = (Cotidetsecciones) object;
        if ((this.cotidetseccionesPK == null && other.cotidetseccionesPK != null) || (this.cotidetseccionesPK != null && !this.cotidetseccionesPK.equals(other.cotidetseccionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.lrgxprod.Cotidetsecciones[ cotidetseccionesPK=" + cotidetseccionesPK + " ]";
    }
    
}
