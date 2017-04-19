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
@Table(name = "LRGRUPOSOBJETOS")
@NamedQueries({
    @NamedQuery(name = "Lrgruposobjetos.findAll", query = "SELECT l FROM Lrgruposobjetos l"),
    @NamedQuery(name = "Lrgruposobjetos.findByLrgruposobjetosid", query = "SELECT l FROM Lrgruposobjetos l WHERE l.lrgruposobjetosid = :lrgruposobjetosid"),
    @NamedQuery(name = "Lrgruposobjetos.findByLrgruposobjetosnom", query = "SELECT l FROM Lrgruposobjetos l WHERE l.lrgruposobjetosnom = :lrgruposobjetosnom"),
    @NamedQuery(name = "Lrgruposobjetos.findByLrgruposobjetoshab", query = "SELECT l FROM Lrgruposobjetos l WHERE l.lrgruposobjetoshab = :lrgruposobjetoshab"),
    @NamedQuery(name = "Lrgruposobjetos.findByLrgruposobjetosfal", query = "SELECT l FROM Lrgruposobjetos l WHERE l.lrgruposobjetosfal = :lrgruposobjetosfal"),
    @NamedQuery(name = "Lrgruposobjetos.findByLrgruposobjetosual", query = "SELECT l FROM Lrgruposobjetos l WHERE l.lrgruposobjetosual = :lrgruposobjetosual"),
    @NamedQuery(name = "Lrgruposobjetos.findByLrgruposobjetosfmd", query = "SELECT l FROM Lrgruposobjetos l WHERE l.lrgruposobjetosfmd = :lrgruposobjetosfmd"),
    @NamedQuery(name = "Lrgruposobjetos.findByLrgruposobjetosumd", query = "SELECT l FROM Lrgruposobjetos l WHERE l.lrgruposobjetosumd = :lrgruposobjetosumd")})
public class Lrgruposobjetos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRGRUPOSOBJETOSID", nullable = false)
    private Long lrgruposobjetosid;
    @Basic(optional = false)
    @Column(name = "LRGRUPOSOBJETOSNOM", nullable = false, length = 60)
    private String lrgruposobjetosnom;
    @Basic(optional = false)
    @Column(name = "LRGRUPOSOBJETOSHAB", nullable = false)
    private Character lrgruposobjetoshab;
    @Basic(optional = false)
    @Column(name = "LRGRUPOSOBJETOSFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrgruposobjetosfal;
    @Basic(optional = false)
    @Column(name = "LRGRUPOSOBJETOSUAL", nullable = false, length = 30)
    private String lrgruposobjetosual;
    @Column(name = "LRGRUPOSOBJETOSFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrgruposobjetosfmd;
    @Column(name = "LRGRUPOSOBJETOSUMD", length = 30)
    private String lrgruposobjetosumd;
    @OneToMany(mappedBy = "lrgruposobjetosid")
    private List<Lrobjetos> lrobjetosList;

    public Lrgruposobjetos() {
    }

    public Lrgruposobjetos(Long lrgruposobjetosid) {
        this.lrgruposobjetosid = lrgruposobjetosid;
    }

    public Lrgruposobjetos(Long lrgruposobjetosid, String lrgruposobjetosnom, Character lrgruposobjetoshab, Date lrgruposobjetosfal, String lrgruposobjetosual) {
        this.lrgruposobjetosid = lrgruposobjetosid;
        this.lrgruposobjetosnom = lrgruposobjetosnom;
        this.lrgruposobjetoshab = lrgruposobjetoshab;
        this.lrgruposobjetosfal = lrgruposobjetosfal;
        this.lrgruposobjetosual = lrgruposobjetosual;
    }

    public Long getLrgruposobjetosid() {
        return lrgruposobjetosid;
    }

    public void setLrgruposobjetosid(Long lrgruposobjetosid) {
        this.lrgruposobjetosid = lrgruposobjetosid;
    }

    public String getLrgruposobjetosnom() {
        return lrgruposobjetosnom;
    }

    public void setLrgruposobjetosnom(String lrgruposobjetosnom) {
        this.lrgruposobjetosnom = lrgruposobjetosnom;
    }

    public Character getLrgruposobjetoshab() {
        return lrgruposobjetoshab;
    }

    public void setLrgruposobjetoshab(Character lrgruposobjetoshab) {
        this.lrgruposobjetoshab = lrgruposobjetoshab;
    }

    public Date getLrgruposobjetosfal() {
        return lrgruposobjetosfal;
    }

    public void setLrgruposobjetosfal(Date lrgruposobjetosfal) {
        this.lrgruposobjetosfal = lrgruposobjetosfal;
    }

    public String getLrgruposobjetosual() {
        return lrgruposobjetosual;
    }

    public void setLrgruposobjetosual(String lrgruposobjetosual) {
        this.lrgruposobjetosual = lrgruposobjetosual;
    }

    public Date getLrgruposobjetosfmd() {
        return lrgruposobjetosfmd;
    }

    public void setLrgruposobjetosfmd(Date lrgruposobjetosfmd) {
        this.lrgruposobjetosfmd = lrgruposobjetosfmd;
    }

    public String getLrgruposobjetosumd() {
        return lrgruposobjetosumd;
    }

    public void setLrgruposobjetosumd(String lrgruposobjetosumd) {
        this.lrgruposobjetosumd = lrgruposobjetosumd;
    }

    public List<Lrobjetos> getLrobjetosList() {
        return lrobjetosList;
    }

    public void setLrobjetosList(List<Lrobjetos> lrobjetosList) {
        this.lrobjetosList = lrobjetosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrgruposobjetosid != null ? lrgruposobjetosid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrgruposobjetos)) {
            return false;
        }
        Lrgruposobjetos other = (Lrgruposobjetos) object;
        if ((this.lrgruposobjetosid == null && other.lrgruposobjetosid != null) || (this.lrgruposobjetosid != null && !this.lrgruposobjetosid.equals(other.lrgruposobjetosid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrgruposobjetos[ lrgruposobjetosid=" + lrgruposobjetosid + " ]";
    }
    
}
