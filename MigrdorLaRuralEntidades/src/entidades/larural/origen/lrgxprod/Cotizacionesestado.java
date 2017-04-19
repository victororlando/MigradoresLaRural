/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen.lrgxprod;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "COTIZACIONESESTADO", schema = "RURAL")
@NamedQueries({
    @NamedQuery(name = "Cotizacionesestado.findAll", query = "SELECT c FROM Cotizacionesestado c"),
    @NamedQuery(name = "Cotizacionesestado.findByCotizacionesestado", query = "SELECT c FROM Cotizacionesestado c WHERE c.cotizacionesestado = :cotizacionesestado"),
    @NamedQuery(name = "Cotizacionesestado.findByCotizacionesestadofal", query = "SELECT c FROM Cotizacionesestado c WHERE c.cotizacionesestadofal = :cotizacionesestadofal"),
    @NamedQuery(name = "Cotizacionesestado.findByCotizacionesestadoual", query = "SELECT c FROM Cotizacionesestado c WHERE c.cotizacionesestadoual = :cotizacionesestadoual"),
    @NamedQuery(name = "Cotizacionesestado.findByCotizacionesestadofmd", query = "SELECT c FROM Cotizacionesestado c WHERE c.cotizacionesestadofmd = :cotizacionesestadofmd"),
    @NamedQuery(name = "Cotizacionesestado.findByCotizacionesestadoumd", query = "SELECT c FROM Cotizacionesestado c WHERE c.cotizacionesestadoumd = :cotizacionesestadoumd"),
    @NamedQuery(name = "Cotizacionesestado.findByCotizacionesestadonom", query = "SELECT c FROM Cotizacionesestado c WHERE c.cotizacionesestadonom = :cotizacionesestadonom"),
    @NamedQuery(name = "Cotizacionesestado.findByCotizacionesestadodesc", query = "SELECT c FROM Cotizacionesestado c WHERE c.cotizacionesestadodesc = :cotizacionesestadodesc"),
    @NamedQuery(name = "Cotizacionesestado.findByCotizacionesestadoabr", query = "SELECT c FROM Cotizacionesestado c WHERE c.cotizacionesestadoabr = :cotizacionesestadoabr"),
    @NamedQuery(name = "Cotizacionesestado.findByCotizacionesestadopend", query = "SELECT c FROM Cotizacionesestado c WHERE c.cotizacionesestadopend = :cotizacionesestadopend"),
    @NamedQuery(name = "Cotizacionesestado.findByCotizacionesestadorech", query = "SELECT c FROM Cotizacionesestado c WHERE c.cotizacionesestadorech = :cotizacionesestadorech"),
    @NamedQuery(name = "Cotizacionesestado.findByCotizacionesestadocanc", query = "SELECT c FROM Cotizacionesestado c WHERE c.cotizacionesestadocanc = :cotizacionesestadocanc"),
    @NamedQuery(name = "Cotizacionesestado.findByCotizacionesestadoapro", query = "SELECT c FROM Cotizacionesestado c WHERE c.cotizacionesestadoapro = :cotizacionesestadoapro")})
public class Cotizacionesestado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COTIZACIONESESTADO", nullable = false)
    private Long cotizacionesestado;
    @Basic(optional = false)
    @Column(name = "COTIZACIONESESTADOFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date cotizacionesestadofal;
    @Basic(optional = false)
    @Column(name = "COTIZACIONESESTADOUAL", nullable = false, length = 30)
    private String cotizacionesestadoual;
    @Column(name = "COTIZACIONESESTADOFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cotizacionesestadofmd;
    @Column(name = "COTIZACIONESESTADOUMD", length = 30)
    private String cotizacionesestadoumd;
    @Basic(optional = false)
    @Column(name = "COTIZACIONESESTADONOM", nullable = false, length = 60)
    private String cotizacionesestadonom;
    @Column(name = "COTIZACIONESESTADODESC", length = 500)
    private String cotizacionesestadodesc;
    @Column(name = "COTIZACIONESESTADOABR", length = 4)
    private String cotizacionesestadoabr;
    @Column(name = "COTIZACIONESESTADOPEND")
    private Character cotizacionesestadopend;
    @Column(name = "COTIZACIONESESTADORECH")
    private Character cotizacionesestadorech;
    @Column(name = "COTIZACIONESESTADOCANC")
    private Character cotizacionesestadocanc;
    @Column(name = "COTIZACIONESESTADOAPRO")
    private Character cotizacionesestadoapro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cotizacionesestado")
    private List<Cotizaciones> cotizacionesList;

    public Cotizacionesestado() {
    }

    public Cotizacionesestado(Long cotizacionesestado) {
        this.cotizacionesestado = cotizacionesestado;
    }

    public Cotizacionesestado(Long cotizacionesestado, Date cotizacionesestadofal, String cotizacionesestadoual, String cotizacionesestadonom) {
        this.cotizacionesestado = cotizacionesestado;
        this.cotizacionesestadofal = cotizacionesestadofal;
        this.cotizacionesestadoual = cotizacionesestadoual;
        this.cotizacionesestadonom = cotizacionesestadonom;
    }

    public Long getCotizacionesestado() {
        return cotizacionesestado;
    }

    public void setCotizacionesestado(Long cotizacionesestado) {
        this.cotizacionesestado = cotizacionesestado;
    }

    public Date getCotizacionesestadofal() {
        return cotizacionesestadofal;
    }

    public void setCotizacionesestadofal(Date cotizacionesestadofal) {
        this.cotizacionesestadofal = cotizacionesestadofal;
    }

    public String getCotizacionesestadoual() {
        return cotizacionesestadoual;
    }

    public void setCotizacionesestadoual(String cotizacionesestadoual) {
        this.cotizacionesestadoual = cotizacionesestadoual;
    }

    public Date getCotizacionesestadofmd() {
        return cotizacionesestadofmd;
    }

    public void setCotizacionesestadofmd(Date cotizacionesestadofmd) {
        this.cotizacionesestadofmd = cotizacionesestadofmd;
    }

    public String getCotizacionesestadoumd() {
        return cotizacionesestadoumd;
    }

    public void setCotizacionesestadoumd(String cotizacionesestadoumd) {
        this.cotizacionesestadoumd = cotizacionesestadoumd;
    }

    public String getCotizacionesestadonom() {
        return cotizacionesestadonom;
    }

    public void setCotizacionesestadonom(String cotizacionesestadonom) {
        this.cotizacionesestadonom = cotizacionesestadonom;
    }

    public String getCotizacionesestadodesc() {
        return cotizacionesestadodesc;
    }

    public void setCotizacionesestadodesc(String cotizacionesestadodesc) {
        this.cotizacionesestadodesc = cotizacionesestadodesc;
    }

    public String getCotizacionesestadoabr() {
        return cotizacionesestadoabr;
    }

    public void setCotizacionesestadoabr(String cotizacionesestadoabr) {
        this.cotizacionesestadoabr = cotizacionesestadoabr;
    }

    public Character getCotizacionesestadopend() {
        return cotizacionesestadopend;
    }

    public void setCotizacionesestadopend(Character cotizacionesestadopend) {
        this.cotizacionesestadopend = cotizacionesestadopend;
    }

    public Character getCotizacionesestadorech() {
        return cotizacionesestadorech;
    }

    public void setCotizacionesestadorech(Character cotizacionesestadorech) {
        this.cotizacionesestadorech = cotizacionesestadorech;
    }

    public Character getCotizacionesestadocanc() {
        return cotizacionesestadocanc;
    }

    public void setCotizacionesestadocanc(Character cotizacionesestadocanc) {
        this.cotizacionesestadocanc = cotizacionesestadocanc;
    }

    public Character getCotizacionesestadoapro() {
        return cotizacionesestadoapro;
    }

    public void setCotizacionesestadoapro(Character cotizacionesestadoapro) {
        this.cotizacionesestadoapro = cotizacionesestadoapro;
    }

    public List<Cotizaciones> getCotizacionesList() {
        return cotizacionesList;
    }

    public void setCotizacionesList(List<Cotizaciones> cotizacionesList) {
        this.cotizacionesList = cotizacionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cotizacionesestado != null ? cotizacionesestado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cotizacionesestado)) {
            return false;
        }
        Cotizacionesestado other = (Cotizacionesestado) object;
        if ((this.cotizacionesestado == null && other.cotizacionesestado != null) || (this.cotizacionesestado != null && !this.cotizacionesestado.equals(other.cotizacionesestado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.lrgxprod.Cotizacionesestado[ cotizacionesestado=" + cotizacionesestado + " ]";
    }

}
