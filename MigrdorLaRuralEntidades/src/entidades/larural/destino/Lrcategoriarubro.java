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
@Table(name = "LRCATEGORIARUBRO")
@NamedQueries({
    @NamedQuery(name = "Lrcategoriarubro.findAll", query = "SELECT l FROM Lrcategoriarubro l"),
    @NamedQuery(name = "Lrcategoriarubro.findByLrcategoriarubroid", query = "SELECT l FROM Lrcategoriarubro l WHERE l.lrcategoriarubroid = :lrcategoriarubroid"),
    @NamedQuery(name = "Lrcategoriarubro.findByLrcategoriarubrodesc", query = "SELECT l FROM Lrcategoriarubro l WHERE l.lrcategoriarubrodesc = :lrcategoriarubrodesc"),
    @NamedQuery(name = "Lrcategoriarubro.findByLrcategoriarubroac", query = "SELECT l FROM Lrcategoriarubro l WHERE l.lrcategoriarubroac = :lrcategoriarubroac"),
    @NamedQuery(name = "Lrcategoriarubro.findByLrcategoriarubroual", query = "SELECT l FROM Lrcategoriarubro l WHERE l.lrcategoriarubroual = :lrcategoriarubroual"),
    @NamedQuery(name = "Lrcategoriarubro.findByLrcategoriarubrofal", query = "SELECT l FROM Lrcategoriarubro l WHERE l.lrcategoriarubrofal = :lrcategoriarubrofal"),
    @NamedQuery(name = "Lrcategoriarubro.findByLrcategoriarubroumd", query = "SELECT l FROM Lrcategoriarubro l WHERE l.lrcategoriarubroumd = :lrcategoriarubroumd"),
    @NamedQuery(name = "Lrcategoriarubro.findByLrcategoriarubrofmd", query = "SELECT l FROM Lrcategoriarubro l WHERE l.lrcategoriarubrofmd = :lrcategoriarubrofmd")})
public class Lrcategoriarubro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCATEGORIARUBROID", nullable = false)
    private Long lrcategoriarubroid;
    @Basic(optional = false)
    @Column(name = "LRCATEGORIARUBRODESC", nullable = false, length = 500)
    private String lrcategoriarubrodesc;
    @Basic(optional = false)
    @Column(name = "LRCATEGORIARUBROAC", nullable = false)
    private Character lrcategoriarubroac;
    @Basic(optional = false)
    @Column(name = "LRCATEGORIARUBROUAL", nullable = false, length = 30)
    private String lrcategoriarubroual;
    @Basic(optional = false)
    @Column(name = "LRCATEGORIARUBROFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcategoriarubrofal;
    @Basic(optional = false)
    @Column(name = "LRCATEGORIARUBROUMD", nullable = false, length = 30)
    private String lrcategoriarubroumd;
    @Basic(optional = false)
    @Column(name = "LRCATEGORIARUBROFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcategoriarubrofmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcategoriarubro")
    private List<Lragruparubro> lragruparubroList;

    public Lrcategoriarubro() {
    }

    public Lrcategoriarubro(Long lrcategoriarubroid) {
        this.lrcategoriarubroid = lrcategoriarubroid;
    }

    public Lrcategoriarubro(Long lrcategoriarubroid, String lrcategoriarubrodesc, Character lrcategoriarubroac, String lrcategoriarubroual, Date lrcategoriarubrofal, String lrcategoriarubroumd, Date lrcategoriarubrofmd) {
        this.lrcategoriarubroid = lrcategoriarubroid;
        this.lrcategoriarubrodesc = lrcategoriarubrodesc;
        this.lrcategoriarubroac = lrcategoriarubroac;
        this.lrcategoriarubroual = lrcategoriarubroual;
        this.lrcategoriarubrofal = lrcategoriarubrofal;
        this.lrcategoriarubroumd = lrcategoriarubroumd;
        this.lrcategoriarubrofmd = lrcategoriarubrofmd;
    }

    public Long getLrcategoriarubroid() {
        return lrcategoriarubroid;
    }

    public void setLrcategoriarubroid(Long lrcategoriarubroid) {
        this.lrcategoriarubroid = lrcategoriarubroid;
    }

    public String getLrcategoriarubrodesc() {
        return lrcategoriarubrodesc;
    }

    public void setLrcategoriarubrodesc(String lrcategoriarubrodesc) {
        this.lrcategoriarubrodesc = lrcategoriarubrodesc;
    }

    public Character getLrcategoriarubroac() {
        return lrcategoriarubroac;
    }

    public void setLrcategoriarubroac(Character lrcategoriarubroac) {
        this.lrcategoriarubroac = lrcategoriarubroac;
    }

    public String getLrcategoriarubroual() {
        return lrcategoriarubroual;
    }

    public void setLrcategoriarubroual(String lrcategoriarubroual) {
        this.lrcategoriarubroual = lrcategoriarubroual;
    }

    public Date getLrcategoriarubrofal() {
        return lrcategoriarubrofal;
    }

    public void setLrcategoriarubrofal(Date lrcategoriarubrofal) {
        this.lrcategoriarubrofal = lrcategoriarubrofal;
    }

    public String getLrcategoriarubroumd() {
        return lrcategoriarubroumd;
    }

    public void setLrcategoriarubroumd(String lrcategoriarubroumd) {
        this.lrcategoriarubroumd = lrcategoriarubroumd;
    }

    public Date getLrcategoriarubrofmd() {
        return lrcategoriarubrofmd;
    }

    public void setLrcategoriarubrofmd(Date lrcategoriarubrofmd) {
        this.lrcategoriarubrofmd = lrcategoriarubrofmd;
    }

    public List<Lragruparubro> getLragruparubroList() {
        return lragruparubroList;
    }

    public void setLragruparubroList(List<Lragruparubro> lragruparubroList) {
        this.lragruparubroList = lragruparubroList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcategoriarubroid != null ? lrcategoriarubroid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcategoriarubro)) {
            return false;
        }
        Lrcategoriarubro other = (Lrcategoriarubro) object;
        if ((this.lrcategoriarubroid == null && other.lrcategoriarubroid != null) || (this.lrcategoriarubroid != null && !this.lrcategoriarubroid.equals(other.lrcategoriarubroid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcategoriarubro[ lrcategoriarubroid=" + lrcategoriarubroid + " ]";
    }
    
}
