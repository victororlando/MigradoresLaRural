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
@Table(name = "LRCLASEPOLIZA")
@NamedQueries({
    @NamedQuery(name = "Lrclasepoliza.findAll", query = "SELECT l FROM Lrclasepoliza l"),
    @NamedQuery(name = "Lrclasepoliza.findByLrclasepolizaid", query = "SELECT l FROM Lrclasepoliza l WHERE l.lrclasepolizaid = :lrclasepolizaid"),
    @NamedQuery(name = "Lrclasepoliza.findByLrclasepolizacod", query = "SELECT l FROM Lrclasepoliza l WHERE l.lrclasepolizacod = :lrclasepolizacod"),
    @NamedQuery(name = "Lrclasepoliza.findByLrclasepolizadesc", query = "SELECT l FROM Lrclasepoliza l WHERE l.lrclasepolizadesc = :lrclasepolizadesc"),
    @NamedQuery(name = "Lrclasepoliza.findByLrclasepolizaact", query = "SELECT l FROM Lrclasepoliza l WHERE l.lrclasepolizaact = :lrclasepolizaact"),
    @NamedQuery(name = "Lrclasepoliza.findByLrclasepolizaual", query = "SELECT l FROM Lrclasepoliza l WHERE l.lrclasepolizaual = :lrclasepolizaual"),
    @NamedQuery(name = "Lrclasepoliza.findByLrclasepolizafal", query = "SELECT l FROM Lrclasepoliza l WHERE l.lrclasepolizafal = :lrclasepolizafal"),
    @NamedQuery(name = "Lrclasepoliza.findByLrclasepolizaumd", query = "SELECT l FROM Lrclasepoliza l WHERE l.lrclasepolizaumd = :lrclasepolizaumd"),
    @NamedQuery(name = "Lrclasepoliza.findByLrclasepolizafmd", query = "SELECT l FROM Lrclasepoliza l WHERE l.lrclasepolizafmd = :lrclasepolizafmd")})
public class Lrclasepoliza implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCLASEPOLIZAID", nullable = false)
    private Long lrclasepolizaid;
    @Basic(optional = false)
    @Column(name = "LRCLASEPOLIZACOD", nullable = false)
    private long lrclasepolizacod;
    @Basic(optional = false)
    @Column(name = "LRCLASEPOLIZADESC", nullable = false, length = 100)
    private String lrclasepolizadesc;
    @Basic(optional = false)
    @Column(name = "LRCLASEPOLIZAACT", nullable = false)
    private Character lrclasepolizaact;
    @Basic(optional = false)
    @Column(name = "LRCLASEPOLIZAUAL", nullable = false, length = 30)
    private String lrclasepolizaual;
    @Basic(optional = false)
    @Column(name = "LRCLASEPOLIZAFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrclasepolizafal;
    @Column(name = "LRCLASEPOLIZAUMD", length = 30)
    private String lrclasepolizaumd;
    @Column(name = "LRCLASEPOLIZAFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrclasepolizafmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrclasepolizaid")
    private List<Lrcotizacion> lrcotizacionList;

    public Lrclasepoliza() {
    }

    public Lrclasepoliza(Long lrclasepolizaid) {
        this.lrclasepolizaid = lrclasepolizaid;
    }

    public Lrclasepoliza(Long lrclasepolizaid, long lrclasepolizacod, String lrclasepolizadesc, Character lrclasepolizaact, String lrclasepolizaual, Date lrclasepolizafal) {
        this.lrclasepolizaid = lrclasepolizaid;
        this.lrclasepolizacod = lrclasepolizacod;
        this.lrclasepolizadesc = lrclasepolizadesc;
        this.lrclasepolizaact = lrclasepolizaact;
        this.lrclasepolizaual = lrclasepolizaual;
        this.lrclasepolizafal = lrclasepolizafal;
    }

    public Long getLrclasepolizaid() {
        return lrclasepolizaid;
    }

    public void setLrclasepolizaid(Long lrclasepolizaid) {
        this.lrclasepolizaid = lrclasepolizaid;
    }

    public long getLrclasepolizacod() {
        return lrclasepolizacod;
    }

    public void setLrclasepolizacod(long lrclasepolizacod) {
        this.lrclasepolizacod = lrclasepolizacod;
    }

    public String getLrclasepolizadesc() {
        return lrclasepolizadesc;
    }

    public void setLrclasepolizadesc(String lrclasepolizadesc) {
        this.lrclasepolizadesc = lrclasepolizadesc;
    }

    public Character getLrclasepolizaact() {
        return lrclasepolizaact;
    }

    public void setLrclasepolizaact(Character lrclasepolizaact) {
        this.lrclasepolizaact = lrclasepolizaact;
    }

    public String getLrclasepolizaual() {
        return lrclasepolizaual;
    }

    public void setLrclasepolizaual(String lrclasepolizaual) {
        this.lrclasepolizaual = lrclasepolizaual;
    }

    public Date getLrclasepolizafal() {
        return lrclasepolizafal;
    }

    public void setLrclasepolizafal(Date lrclasepolizafal) {
        this.lrclasepolizafal = lrclasepolizafal;
    }

    public String getLrclasepolizaumd() {
        return lrclasepolizaumd;
    }

    public void setLrclasepolizaumd(String lrclasepolizaumd) {
        this.lrclasepolizaumd = lrclasepolizaumd;
    }

    public Date getLrclasepolizafmd() {
        return lrclasepolizafmd;
    }

    public void setLrclasepolizafmd(Date lrclasepolizafmd) {
        this.lrclasepolizafmd = lrclasepolizafmd;
    }

    public List<Lrcotizacion> getLrcotizacionList() {
        return lrcotizacionList;
    }

    public void setLrcotizacionList(List<Lrcotizacion> lrcotizacionList) {
        this.lrcotizacionList = lrcotizacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrclasepolizaid != null ? lrclasepolizaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrclasepoliza)) {
            return false;
        }
        Lrclasepoliza other = (Lrclasepoliza) object;
        if ((this.lrclasepolizaid == null && other.lrclasepolizaid != null) || (this.lrclasepolizaid != null && !this.lrclasepolizaid.equals(other.lrclasepolizaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrclasepoliza[ lrclasepolizaid=" + lrclasepolizaid + " ]";
    }
    
}
