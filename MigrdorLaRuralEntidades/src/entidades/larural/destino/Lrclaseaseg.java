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
@Table(name = "LRCLASEASEG")
@NamedQueries({
    @NamedQuery(name = "Lrclaseaseg.findAll", query = "SELECT l FROM Lrclaseaseg l"),
    @NamedQuery(name = "Lrclaseaseg.findByLrclaseasegid", query = "SELECT l FROM Lrclaseaseg l WHERE l.lrclaseasegid = :lrclaseasegid"),
    @NamedQuery(name = "Lrclaseaseg.findByLrclaseasegcod", query = "SELECT l FROM Lrclaseaseg l WHERE l.lrclaseasegcod = :lrclaseasegcod"),
    @NamedQuery(name = "Lrclaseaseg.findByLrclaseasegdesc", query = "SELECT l FROM Lrclaseaseg l WHERE l.lrclaseasegdesc = :lrclaseasegdesc"),
    @NamedQuery(name = "Lrclaseaseg.findByLrclaseasegact", query = "SELECT l FROM Lrclaseaseg l WHERE l.lrclaseasegact = :lrclaseasegact"),
    @NamedQuery(name = "Lrclaseaseg.findByLrclaseasegual", query = "SELECT l FROM Lrclaseaseg l WHERE l.lrclaseasegual = :lrclaseasegual"),
    @NamedQuery(name = "Lrclaseaseg.findByLrclaseasegfal", query = "SELECT l FROM Lrclaseaseg l WHERE l.lrclaseasegfal = :lrclaseasegfal"),
    @NamedQuery(name = "Lrclaseaseg.findByLrclaseasegumd", query = "SELECT l FROM Lrclaseaseg l WHERE l.lrclaseasegumd = :lrclaseasegumd"),
    @NamedQuery(name = "Lrclaseaseg.findByLrclaseasegfmd", query = "SELECT l FROM Lrclaseaseg l WHERE l.lrclaseasegfmd = :lrclaseasegfmd")})
public class Lrclaseaseg implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCLASEASEGID", nullable = false)
    private Long lrclaseasegid;
    @Basic(optional = false)
    @Column(name = "LRCLASEASEGCOD", nullable = false)
    private long lrclaseasegcod;
    @Basic(optional = false)
    @Column(name = "LRCLASEASEGDESC", nullable = false, length = 100)
    private String lrclaseasegdesc;
    @Basic(optional = false)
    @Column(name = "LRCLASEASEGACT", nullable = false)
    private Character lrclaseasegact;
    @Basic(optional = false)
    @Column(name = "LRCLASEASEGUAL", nullable = false, length = 30)
    private String lrclaseasegual;
    @Basic(optional = false)
    @Column(name = "LRCLASEASEGFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrclaseasegfal;
    @Column(name = "LRCLASEASEGUMD", length = 30)
    private String lrclaseasegumd;
    @Column(name = "LRCLASEASEGFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrclaseasegfmd;
    @OneToMany(mappedBy = "lrclaseasegid")
    private List<Lrpropuesta> lrpropuestaList;

    public Lrclaseaseg() {
    }

    public Lrclaseaseg(Long lrclaseasegid) {
        this.lrclaseasegid = lrclaseasegid;
    }

    public Lrclaseaseg(Long lrclaseasegid, long lrclaseasegcod, String lrclaseasegdesc, Character lrclaseasegact, String lrclaseasegual, Date lrclaseasegfal) {
        this.lrclaseasegid = lrclaseasegid;
        this.lrclaseasegcod = lrclaseasegcod;
        this.lrclaseasegdesc = lrclaseasegdesc;
        this.lrclaseasegact = lrclaseasegact;
        this.lrclaseasegual = lrclaseasegual;
        this.lrclaseasegfal = lrclaseasegfal;
    }

    public Long getLrclaseasegid() {
        return lrclaseasegid;
    }

    public void setLrclaseasegid(Long lrclaseasegid) {
        this.lrclaseasegid = lrclaseasegid;
    }

    public long getLrclaseasegcod() {
        return lrclaseasegcod;
    }

    public void setLrclaseasegcod(long lrclaseasegcod) {
        this.lrclaseasegcod = lrclaseasegcod;
    }

    public String getLrclaseasegdesc() {
        return lrclaseasegdesc;
    }

    public void setLrclaseasegdesc(String lrclaseasegdesc) {
        this.lrclaseasegdesc = lrclaseasegdesc;
    }

    public Character getLrclaseasegact() {
        return lrclaseasegact;
    }

    public void setLrclaseasegact(Character lrclaseasegact) {
        this.lrclaseasegact = lrclaseasegact;
    }

    public String getLrclaseasegual() {
        return lrclaseasegual;
    }

    public void setLrclaseasegual(String lrclaseasegual) {
        this.lrclaseasegual = lrclaseasegual;
    }

    public Date getLrclaseasegfal() {
        return lrclaseasegfal;
    }

    public void setLrclaseasegfal(Date lrclaseasegfal) {
        this.lrclaseasegfal = lrclaseasegfal;
    }

    public String getLrclaseasegumd() {
        return lrclaseasegumd;
    }

    public void setLrclaseasegumd(String lrclaseasegumd) {
        this.lrclaseasegumd = lrclaseasegumd;
    }

    public Date getLrclaseasegfmd() {
        return lrclaseasegfmd;
    }

    public void setLrclaseasegfmd(Date lrclaseasegfmd) {
        this.lrclaseasegfmd = lrclaseasegfmd;
    }

    public List<Lrpropuesta> getLrpropuestaList() {
        return lrpropuestaList;
    }

    public void setLrpropuestaList(List<Lrpropuesta> lrpropuestaList) {
        this.lrpropuestaList = lrpropuestaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrclaseasegid != null ? lrclaseasegid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrclaseaseg)) {
            return false;
        }
        Lrclaseaseg other = (Lrclaseaseg) object;
        if ((this.lrclaseasegid == null && other.lrclaseasegid != null) || (this.lrclaseasegid != null && !this.lrclaseasegid.equals(other.lrclaseasegid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrclaseaseg[ lrclaseasegid=" + lrclaseasegid + " ]";
    }
    
}
