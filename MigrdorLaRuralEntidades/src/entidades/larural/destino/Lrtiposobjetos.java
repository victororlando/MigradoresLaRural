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
@Table(name = "LRTIPOSOBJETOS")
@NamedQueries({
    @NamedQuery(name = "Lrtiposobjetos.findAll", query = "SELECT l FROM Lrtiposobjetos l"),
    @NamedQuery(name = "Lrtiposobjetos.findByLrtiposobjetosid", query = "SELECT l FROM Lrtiposobjetos l WHERE l.lrtiposobjetosid = :lrtiposobjetosid"),
    @NamedQuery(name = "Lrtiposobjetos.findByLrtiposobjetosnom", query = "SELECT l FROM Lrtiposobjetos l WHERE l.lrtiposobjetosnom = :lrtiposobjetosnom"),
    @NamedQuery(name = "Lrtiposobjetos.findByLrtiposobjetosdes", query = "SELECT l FROM Lrtiposobjetos l WHERE l.lrtiposobjetosdes = :lrtiposobjetosdes"),
    @NamedQuery(name = "Lrtiposobjetos.findByLrtiposobjetoshab", query = "SELECT l FROM Lrtiposobjetos l WHERE l.lrtiposobjetoshab = :lrtiposobjetoshab"),
    @NamedQuery(name = "Lrtiposobjetos.findByLrtiposobjetosmen", query = "SELECT l FROM Lrtiposobjetos l WHERE l.lrtiposobjetosmen = :lrtiposobjetosmen"),
    @NamedQuery(name = "Lrtiposobjetos.findByLrtiposobjetosprg", query = "SELECT l FROM Lrtiposobjetos l WHERE l.lrtiposobjetosprg = :lrtiposobjetosprg"),
    @NamedQuery(name = "Lrtiposobjetos.findByLrtiposobjetosfal", query = "SELECT l FROM Lrtiposobjetos l WHERE l.lrtiposobjetosfal = :lrtiposobjetosfal"),
    @NamedQuery(name = "Lrtiposobjetos.findByLrtiposobjetosual", query = "SELECT l FROM Lrtiposobjetos l WHERE l.lrtiposobjetosual = :lrtiposobjetosual"),
    @NamedQuery(name = "Lrtiposobjetos.findByLrtiposobjetosfmd", query = "SELECT l FROM Lrtiposobjetos l WHERE l.lrtiposobjetosfmd = :lrtiposobjetosfmd"),
    @NamedQuery(name = "Lrtiposobjetos.findByLrtiposobjetosumd", query = "SELECT l FROM Lrtiposobjetos l WHERE l.lrtiposobjetosumd = :lrtiposobjetosumd")})
public class Lrtiposobjetos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRTIPOSOBJETOSID", nullable = false)
    private Long lrtiposobjetosid;
    @Basic(optional = false)
    @Column(name = "LRTIPOSOBJETOSNOM", nullable = false, length = 60)
    private String lrtiposobjetosnom;
    @Basic(optional = false)
    @Column(name = "LRTIPOSOBJETOSDES", nullable = false, length = 500)
    private String lrtiposobjetosdes;
    @Basic(optional = false)
    @Column(name = "LRTIPOSOBJETOSHAB", nullable = false)
    private Character lrtiposobjetoshab;
    @Column(name = "LRTIPOSOBJETOSMEN")
    private Character lrtiposobjetosmen;
    @Column(name = "LRTIPOSOBJETOSPRG")
    private Character lrtiposobjetosprg;
    @Basic(optional = false)
    @Column(name = "LRTIPOSOBJETOSFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtiposobjetosfal;
    @Basic(optional = false)
    @Column(name = "LRTIPOSOBJETOSUAL", nullable = false, length = 30)
    private String lrtiposobjetosual;
    @Column(name = "LRTIPOSOBJETOSFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtiposobjetosfmd;
    @Column(name = "LRTIPOSOBJETOSUMD", length = 30)
    private String lrtiposobjetosumd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrtiposobjetosid")
    private List<Lrobjetos> lrobjetosList;

    public Lrtiposobjetos() {
    }

    public Lrtiposobjetos(Long lrtiposobjetosid) {
        this.lrtiposobjetosid = lrtiposobjetosid;
    }

    public Lrtiposobjetos(Long lrtiposobjetosid, String lrtiposobjetosnom, String lrtiposobjetosdes, Character lrtiposobjetoshab, Date lrtiposobjetosfal, String lrtiposobjetosual) {
        this.lrtiposobjetosid = lrtiposobjetosid;
        this.lrtiposobjetosnom = lrtiposobjetosnom;
        this.lrtiposobjetosdes = lrtiposobjetosdes;
        this.lrtiposobjetoshab = lrtiposobjetoshab;
        this.lrtiposobjetosfal = lrtiposobjetosfal;
        this.lrtiposobjetosual = lrtiposobjetosual;
    }

    public Long getLrtiposobjetosid() {
        return lrtiposobjetosid;
    }

    public void setLrtiposobjetosid(Long lrtiposobjetosid) {
        this.lrtiposobjetosid = lrtiposobjetosid;
    }

    public String getLrtiposobjetosnom() {
        return lrtiposobjetosnom;
    }

    public void setLrtiposobjetosnom(String lrtiposobjetosnom) {
        this.lrtiposobjetosnom = lrtiposobjetosnom;
    }

    public String getLrtiposobjetosdes() {
        return lrtiposobjetosdes;
    }

    public void setLrtiposobjetosdes(String lrtiposobjetosdes) {
        this.lrtiposobjetosdes = lrtiposobjetosdes;
    }

    public Character getLrtiposobjetoshab() {
        return lrtiposobjetoshab;
    }

    public void setLrtiposobjetoshab(Character lrtiposobjetoshab) {
        this.lrtiposobjetoshab = lrtiposobjetoshab;
    }

    public Character getLrtiposobjetosmen() {
        return lrtiposobjetosmen;
    }

    public void setLrtiposobjetosmen(Character lrtiposobjetosmen) {
        this.lrtiposobjetosmen = lrtiposobjetosmen;
    }

    public Character getLrtiposobjetosprg() {
        return lrtiposobjetosprg;
    }

    public void setLrtiposobjetosprg(Character lrtiposobjetosprg) {
        this.lrtiposobjetosprg = lrtiposobjetosprg;
    }

    public Date getLrtiposobjetosfal() {
        return lrtiposobjetosfal;
    }

    public void setLrtiposobjetosfal(Date lrtiposobjetosfal) {
        this.lrtiposobjetosfal = lrtiposobjetosfal;
    }

    public String getLrtiposobjetosual() {
        return lrtiposobjetosual;
    }

    public void setLrtiposobjetosual(String lrtiposobjetosual) {
        this.lrtiposobjetosual = lrtiposobjetosual;
    }

    public Date getLrtiposobjetosfmd() {
        return lrtiposobjetosfmd;
    }

    public void setLrtiposobjetosfmd(Date lrtiposobjetosfmd) {
        this.lrtiposobjetosfmd = lrtiposobjetosfmd;
    }

    public String getLrtiposobjetosumd() {
        return lrtiposobjetosumd;
    }

    public void setLrtiposobjetosumd(String lrtiposobjetosumd) {
        this.lrtiposobjetosumd = lrtiposobjetosumd;
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
        hash += (lrtiposobjetosid != null ? lrtiposobjetosid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtiposobjetos)) {
            return false;
        }
        Lrtiposobjetos other = (Lrtiposobjetos) object;
        if ((this.lrtiposobjetosid == null && other.lrtiposobjetosid != null) || (this.lrtiposobjetosid != null && !this.lrtiposobjetosid.equals(other.lrtiposobjetosid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtiposobjetos[ lrtiposobjetosid=" + lrtiposobjetosid + " ]";
    }
    
}
