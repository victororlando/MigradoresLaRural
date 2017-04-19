/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "LRMOTIVORECHAZO")
@NamedQueries({
    @NamedQuery(name = "Lrmotivorechazo.findAll", query = "SELECT l FROM Lrmotivorechazo l"),
    @NamedQuery(name = "Lrmotivorechazo.findByLrmotivorechazoid", query = "SELECT l FROM Lrmotivorechazo l WHERE l.lrmotivorechazoid = :lrmotivorechazoid"),
    @NamedQuery(name = "Lrmotivorechazo.findByLrmotivorechazodesc", query = "SELECT l FROM Lrmotivorechazo l WHERE l.lrmotivorechazodesc = :lrmotivorechazodesc"),
    @NamedQuery(name = "Lrmotivorechazo.findByLrmotivorechazoac", query = "SELECT l FROM Lrmotivorechazo l WHERE l.lrmotivorechazoac = :lrmotivorechazoac"),
    @NamedQuery(name = "Lrmotivorechazo.findByLrmotivorechazoual", query = "SELECT l FROM Lrmotivorechazo l WHERE l.lrmotivorechazoual = :lrmotivorechazoual"),
    @NamedQuery(name = "Lrmotivorechazo.findByLrmotivorechazofal", query = "SELECT l FROM Lrmotivorechazo l WHERE l.lrmotivorechazofal = :lrmotivorechazofal"),
    @NamedQuery(name = "Lrmotivorechazo.findByLrmotivorechazoumd", query = "SELECT l FROM Lrmotivorechazo l WHERE l.lrmotivorechazoumd = :lrmotivorechazoumd"),
    @NamedQuery(name = "Lrmotivorechazo.findByLrmotivorechazofmd", query = "SELECT l FROM Lrmotivorechazo l WHERE l.lrmotivorechazofmd = :lrmotivorechazofmd")})
public class Lrmotivorechazo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRMOTIVORECHAZOID", nullable = false)
    private Long lrmotivorechazoid;
    @Basic(optional = false)
    @Column(name = "LRMOTIVORECHAZODESC", nullable = false, length = 2000)
    private String lrmotivorechazodesc;
    @Basic(optional = false)
    @Column(name = "LRMOTIVORECHAZOAC", nullable = false)
    private Character lrmotivorechazoac;
    @Basic(optional = false)
    @Column(name = "LRMOTIVORECHAZOUAL", nullable = false, length = 30)
    private String lrmotivorechazoual;
    @Basic(optional = false)
    @Column(name = "LRMOTIVORECHAZOFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrmotivorechazofal;
    @Column(name = "LRMOTIVORECHAZOUMD", length = 30)
    private String lrmotivorechazoumd;
    @Column(name = "LRMOTIVORECHAZOFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrmotivorechazofmd;
    @JoinColumns({
        @JoinColumn(name = "LRAREAID", referencedColumnName = "LRAREAID", nullable = false),
        @JoinColumn(name = "LRSUBAREAID", referencedColumnName = "LRSUBAREAID", nullable = false)})
    @ManyToOne(optional = false)
    private Lrareasubarea lrareasubarea;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrmotivorechazoid")
    private List<Lrcotimotivorechazo> lrcotimotivorechazoList;

    public Lrmotivorechazo() {
    }

    public Lrmotivorechazo(Long lrmotivorechazoid) {
        this.lrmotivorechazoid = lrmotivorechazoid;
    }

    public Lrmotivorechazo(Long lrmotivorechazoid, String lrmotivorechazodesc, Character lrmotivorechazoac, String lrmotivorechazoual, Date lrmotivorechazofal) {
        this.lrmotivorechazoid = lrmotivorechazoid;
        this.lrmotivorechazodesc = lrmotivorechazodesc;
        this.lrmotivorechazoac = lrmotivorechazoac;
        this.lrmotivorechazoual = lrmotivorechazoual;
        this.lrmotivorechazofal = lrmotivorechazofal;
    }

    public Long getLrmotivorechazoid() {
        return lrmotivorechazoid;
    }

    public void setLrmotivorechazoid(Long lrmotivorechazoid) {
        this.lrmotivorechazoid = lrmotivorechazoid;
    }

    public String getLrmotivorechazodesc() {
        return lrmotivorechazodesc;
    }

    public void setLrmotivorechazodesc(String lrmotivorechazodesc) {
        this.lrmotivorechazodesc = lrmotivorechazodesc;
    }

    public Character getLrmotivorechazoac() {
        return lrmotivorechazoac;
    }

    public void setLrmotivorechazoac(Character lrmotivorechazoac) {
        this.lrmotivorechazoac = lrmotivorechazoac;
    }

    public String getLrmotivorechazoual() {
        return lrmotivorechazoual;
    }

    public void setLrmotivorechazoual(String lrmotivorechazoual) {
        this.lrmotivorechazoual = lrmotivorechazoual;
    }

    public Date getLrmotivorechazofal() {
        return lrmotivorechazofal;
    }

    public void setLrmotivorechazofal(Date lrmotivorechazofal) {
        this.lrmotivorechazofal = lrmotivorechazofal;
    }

    public String getLrmotivorechazoumd() {
        return lrmotivorechazoumd;
    }

    public void setLrmotivorechazoumd(String lrmotivorechazoumd) {
        this.lrmotivorechazoumd = lrmotivorechazoumd;
    }

    public Date getLrmotivorechazofmd() {
        return lrmotivorechazofmd;
    }

    public void setLrmotivorechazofmd(Date lrmotivorechazofmd) {
        this.lrmotivorechazofmd = lrmotivorechazofmd;
    }

    public Lrareasubarea getLrareasubarea() {
        return lrareasubarea;
    }

    public void setLrareasubarea(Lrareasubarea lrareasubarea) {
        this.lrareasubarea = lrareasubarea;
    }

    public List<Lrcotimotivorechazo> getLrcotimotivorechazoList() {
        return lrcotimotivorechazoList;
    }

    public void setLrcotimotivorechazoList(List<Lrcotimotivorechazo> lrcotimotivorechazoList) {
        this.lrcotimotivorechazoList = lrcotimotivorechazoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrmotivorechazoid != null ? lrmotivorechazoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrmotivorechazo)) {
            return false;
        }
        Lrmotivorechazo other = (Lrmotivorechazo) object;
        if ((this.lrmotivorechazoid == null && other.lrmotivorechazoid != null) || (this.lrmotivorechazoid != null && !this.lrmotivorechazoid.equals(other.lrmotivorechazoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrmotivorechazo[ lrmotivorechazoid=" + lrmotivorechazoid + " ]";
    }
    
}
