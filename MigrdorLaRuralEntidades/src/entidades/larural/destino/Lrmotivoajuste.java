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
@Table(name = "LRMOTIVOAJUSTE")
@NamedQueries({
    @NamedQuery(name = "Lrmotivoajuste.findAll", query = "SELECT l FROM Lrmotivoajuste l"),
    @NamedQuery(name = "Lrmotivoajuste.findByLrmotivoajusteid", query = "SELECT l FROM Lrmotivoajuste l WHERE l.lrmotivoajusteid = :lrmotivoajusteid"),
    @NamedQuery(name = "Lrmotivoajuste.findByLrmotivoajustedesc", query = "SELECT l FROM Lrmotivoajuste l WHERE l.lrmotivoajustedesc = :lrmotivoajustedesc"),
    @NamedQuery(name = "Lrmotivoajuste.findByLrmotivoajusteac", query = "SELECT l FROM Lrmotivoajuste l WHERE l.lrmotivoajusteac = :lrmotivoajusteac"),
    @NamedQuery(name = "Lrmotivoajuste.findByLrmotivoajusteual", query = "SELECT l FROM Lrmotivoajuste l WHERE l.lrmotivoajusteual = :lrmotivoajusteual"),
    @NamedQuery(name = "Lrmotivoajuste.findByLrmotivoajustefal", query = "SELECT l FROM Lrmotivoajuste l WHERE l.lrmotivoajustefal = :lrmotivoajustefal"),
    @NamedQuery(name = "Lrmotivoajuste.findByLrmotivoajusteumd", query = "SELECT l FROM Lrmotivoajuste l WHERE l.lrmotivoajusteumd = :lrmotivoajusteumd"),
    @NamedQuery(name = "Lrmotivoajuste.findByLrmotivoajustefmd", query = "SELECT l FROM Lrmotivoajuste l WHERE l.lrmotivoajustefmd = :lrmotivoajustefmd")})
public class Lrmotivoajuste implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRMOTIVOAJUSTEID", nullable = false)
    private Long lrmotivoajusteid;
    @Basic(optional = false)
    @Column(name = "LRMOTIVOAJUSTEDESC", nullable = false, length = 100)
    private String lrmotivoajustedesc;
    @Basic(optional = false)
    @Column(name = "LRMOTIVOAJUSTEAC", nullable = false)
    private Character lrmotivoajusteac;
    @Column(name = "LRMOTIVOAJUSTEUAL", length = 30)
    private String lrmotivoajusteual;
    @Column(name = "LRMOTIVOAJUSTEFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrmotivoajustefal;
    @Column(name = "LRMOTIVOAJUSTEUMD", length = 30)
    private String lrmotivoajusteumd;
    @Column(name = "LRMOTIVOAJUSTEFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrmotivoajustefmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrmotivoajuste")
    private List<Lrcotiplanmotivoajuste> lrcotiplanmotivoajusteList;

    public Lrmotivoajuste() {
    }

    public Lrmotivoajuste(Long lrmotivoajusteid) {
        this.lrmotivoajusteid = lrmotivoajusteid;
    }

    public Lrmotivoajuste(Long lrmotivoajusteid, String lrmotivoajustedesc, Character lrmotivoajusteac) {
        this.lrmotivoajusteid = lrmotivoajusteid;
        this.lrmotivoajustedesc = lrmotivoajustedesc;
        this.lrmotivoajusteac = lrmotivoajusteac;
    }

    public Long getLrmotivoajusteid() {
        return lrmotivoajusteid;
    }

    public void setLrmotivoajusteid(Long lrmotivoajusteid) {
        this.lrmotivoajusteid = lrmotivoajusteid;
    }

    public String getLrmotivoajustedesc() {
        return lrmotivoajustedesc;
    }

    public void setLrmotivoajustedesc(String lrmotivoajustedesc) {
        this.lrmotivoajustedesc = lrmotivoajustedesc;
    }

    public Character getLrmotivoajusteac() {
        return lrmotivoajusteac;
    }

    public void setLrmotivoajusteac(Character lrmotivoajusteac) {
        this.lrmotivoajusteac = lrmotivoajusteac;
    }

    public String getLrmotivoajusteual() {
        return lrmotivoajusteual;
    }

    public void setLrmotivoajusteual(String lrmotivoajusteual) {
        this.lrmotivoajusteual = lrmotivoajusteual;
    }

    public Date getLrmotivoajustefal() {
        return lrmotivoajustefal;
    }

    public void setLrmotivoajustefal(Date lrmotivoajustefal) {
        this.lrmotivoajustefal = lrmotivoajustefal;
    }

    public String getLrmotivoajusteumd() {
        return lrmotivoajusteumd;
    }

    public void setLrmotivoajusteumd(String lrmotivoajusteumd) {
        this.lrmotivoajusteumd = lrmotivoajusteumd;
    }

    public Date getLrmotivoajustefmd() {
        return lrmotivoajustefmd;
    }

    public void setLrmotivoajustefmd(Date lrmotivoajustefmd) {
        this.lrmotivoajustefmd = lrmotivoajustefmd;
    }

    public List<Lrcotiplanmotivoajuste> getLrcotiplanmotivoajusteList() {
        return lrcotiplanmotivoajusteList;
    }

    public void setLrcotiplanmotivoajusteList(List<Lrcotiplanmotivoajuste> lrcotiplanmotivoajusteList) {
        this.lrcotiplanmotivoajusteList = lrcotiplanmotivoajusteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrmotivoajusteid != null ? lrmotivoajusteid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrmotivoajuste)) {
            return false;
        }
        Lrmotivoajuste other = (Lrmotivoajuste) object;
        if ((this.lrmotivoajusteid == null && other.lrmotivoajusteid != null) || (this.lrmotivoajusteid != null && !this.lrmotivoajusteid.equals(other.lrmotivoajusteid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrmotivoajuste[ lrmotivoajusteid=" + lrmotivoajusteid + " ]";
    }
    
}
