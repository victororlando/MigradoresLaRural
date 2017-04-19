/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "LRESTADOGRAL")
@NamedQueries({
    @NamedQuery(name = "Lrestadogral.findAll", query = "SELECT l FROM Lrestadogral l"),
    @NamedQuery(name = "Lrestadogral.findByLrestadogralid", query = "SELECT l FROM Lrestadogral l WHERE l.lrestadogralid = :lrestadogralid"),
    @NamedQuery(name = "Lrestadogral.findByLrestadograldesc", query = "SELECT l FROM Lrestadogral l WHERE l.lrestadograldesc = :lrestadograldesc"),
    @NamedQuery(name = "Lrestadogral.findByLrestadogralac", query = "SELECT l FROM Lrestadogral l WHERE l.lrestadogralac = :lrestadogralac"),
    @NamedQuery(name = "Lrestadogral.findByLrestadogralual", query = "SELECT l FROM Lrestadogral l WHERE l.lrestadogralual = :lrestadogralual"),
    @NamedQuery(name = "Lrestadogral.findByLrestadogralfal", query = "SELECT l FROM Lrestadogral l WHERE l.lrestadogralfal = :lrestadogralfal"),
    @NamedQuery(name = "Lrestadogral.findByLrestadogralumd", query = "SELECT l FROM Lrestadogral l WHERE l.lrestadogralumd = :lrestadogralumd"),
    @NamedQuery(name = "Lrestadogral.findByLrestadogralfmd", query = "SELECT l FROM Lrestadogral l WHERE l.lrestadogralfmd = :lrestadogralfmd")})
public class Lrestadogral implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRESTADOGRALID", nullable = false)
    private Long lrestadogralid;
    @Basic(optional = false)
    @Column(name = "LRESTADOGRALDESC", nullable = false, length = 100)
    private String lrestadograldesc;
    @Basic(optional = false)
    @Column(name = "LRESTADOGRALAC", nullable = false)
    private Character lrestadogralac;
    @Basic(optional = false)
    @Column(name = "LRESTADOGRALUAL", nullable = false, length = 30)
    private String lrestadogralual;
    @Basic(optional = false)
    @Column(name = "LRESTADOGRALFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrestadogralfal;
    @Column(name = "LRESTADOGRALUMD", length = 30)
    private String lrestadogralumd;
    @Column(name = "LRESTADOGRALFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrestadogralfmd;
    @JoinColumn(name = "LRTIPOESTADOID", referencedColumnName = "LRTIPOESTADOID", nullable = false)
    @ManyToOne(optional = false)
    private Lrtipoestado lrtipoestadoid;

    public Lrestadogral() {
    }

    public Lrestadogral(Long lrestadogralid) {
        this.lrestadogralid = lrestadogralid;
    }

    public Lrestadogral(Long lrestadogralid, String lrestadograldesc, Character lrestadogralac, String lrestadogralual, Date lrestadogralfal) {
        this.lrestadogralid = lrestadogralid;
        this.lrestadograldesc = lrestadograldesc;
        this.lrestadogralac = lrestadogralac;
        this.lrestadogralual = lrestadogralual;
        this.lrestadogralfal = lrestadogralfal;
    }

    public Long getLrestadogralid() {
        return lrestadogralid;
    }

    public void setLrestadogralid(Long lrestadogralid) {
        this.lrestadogralid = lrestadogralid;
    }

    public String getLrestadograldesc() {
        return lrestadograldesc;
    }

    public void setLrestadograldesc(String lrestadograldesc) {
        this.lrestadograldesc = lrestadograldesc;
    }

    public Character getLrestadogralac() {
        return lrestadogralac;
    }

    public void setLrestadogralac(Character lrestadogralac) {
        this.lrestadogralac = lrestadogralac;
    }

    public String getLrestadogralual() {
        return lrestadogralual;
    }

    public void setLrestadogralual(String lrestadogralual) {
        this.lrestadogralual = lrestadogralual;
    }

    public Date getLrestadogralfal() {
        return lrestadogralfal;
    }

    public void setLrestadogralfal(Date lrestadogralfal) {
        this.lrestadogralfal = lrestadogralfal;
    }

    public String getLrestadogralumd() {
        return lrestadogralumd;
    }

    public void setLrestadogralumd(String lrestadogralumd) {
        this.lrestadogralumd = lrestadogralumd;
    }

    public Date getLrestadogralfmd() {
        return lrestadogralfmd;
    }

    public void setLrestadogralfmd(Date lrestadogralfmd) {
        this.lrestadogralfmd = lrestadogralfmd;
    }

    public Lrtipoestado getLrtipoestadoid() {
        return lrtipoestadoid;
    }

    public void setLrtipoestadoid(Lrtipoestado lrtipoestadoid) {
        this.lrtipoestadoid = lrtipoestadoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrestadogralid != null ? lrestadogralid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrestadogral)) {
            return false;
        }
        Lrestadogral other = (Lrestadogral) object;
        if ((this.lrestadogralid == null && other.lrestadogralid != null) || (this.lrestadogralid != null && !this.lrestadogralid.equals(other.lrestadogralid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrestadogral[ lrestadogralid=" + lrestadogralid + " ]";
    }
    
}
