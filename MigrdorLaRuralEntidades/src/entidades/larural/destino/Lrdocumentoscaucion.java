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
@Table(name = "LRDOCUMENTOSCAUCION")
@NamedQueries({
    @NamedQuery(name = "Lrdocumentoscaucion.findAll", query = "SELECT l FROM Lrdocumentoscaucion l"),
    @NamedQuery(name = "Lrdocumentoscaucion.findByLrdocumentoscaucionid", query = "SELECT l FROM Lrdocumentoscaucion l WHERE l.lrdocumentoscaucionid = :lrdocumentoscaucionid"),
    @NamedQuery(name = "Lrdocumentoscaucion.findByLrdocumentoscauciondesc", query = "SELECT l FROM Lrdocumentoscaucion l WHERE l.lrdocumentoscauciondesc = :lrdocumentoscauciondesc"),
    @NamedQuery(name = "Lrdocumentoscaucion.findByLrdocumentoscauciontipopers", query = "SELECT l FROM Lrdocumentoscaucion l WHERE l.lrdocumentoscauciontipopers = :lrdocumentoscauciontipopers"),
    @NamedQuery(name = "Lrdocumentoscaucion.findByLrdocumentoscaucionfal", query = "SELECT l FROM Lrdocumentoscaucion l WHERE l.lrdocumentoscaucionfal = :lrdocumentoscaucionfal"),
    @NamedQuery(name = "Lrdocumentoscaucion.findByLrdocumentoscaucionual", query = "SELECT l FROM Lrdocumentoscaucion l WHERE l.lrdocumentoscaucionual = :lrdocumentoscaucionual"),
    @NamedQuery(name = "Lrdocumentoscaucion.findByLrdocumentoscaucionfmd", query = "SELECT l FROM Lrdocumentoscaucion l WHERE l.lrdocumentoscaucionfmd = :lrdocumentoscaucionfmd"),
    @NamedQuery(name = "Lrdocumentoscaucion.findByLrdocumentoscaucionumd", query = "SELECT l FROM Lrdocumentoscaucion l WHERE l.lrdocumentoscaucionumd = :lrdocumentoscaucionumd"),
    @NamedQuery(name = "Lrdocumentoscaucion.findByLrdocumentoscaucionhab", query = "SELECT l FROM Lrdocumentoscaucion l WHERE l.lrdocumentoscaucionhab = :lrdocumentoscaucionhab")})
public class Lrdocumentoscaucion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRDOCUMENTOSCAUCIONID", nullable = false)
    private Long lrdocumentoscaucionid;
    @Basic(optional = false)
    @Column(name = "LRDOCUMENTOSCAUCIONDESC", nullable = false, length = 100)
    private String lrdocumentoscauciondesc;
    @Basic(optional = false)
    @Column(name = "LRDOCUMENTOSCAUCIONTIPOPERS", nullable = false)
    private Character lrdocumentoscauciontipopers;
    @Column(name = "LRDOCUMENTOSCAUCIONFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrdocumentoscaucionfal;
    @Column(name = "LRDOCUMENTOSCAUCIONUAL", length = 30)
    private String lrdocumentoscaucionual;
    @Column(name = "LRDOCUMENTOSCAUCIONFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrdocumentoscaucionfmd;
    @Column(name = "LRDOCUMENTOSCAUCIONUMD", length = 30)
    private String lrdocumentoscaucionumd;
    @Basic(optional = false)
    @Column(name = "LRDOCUMENTOSCAUCIONHAB", nullable = false)
    private Character lrdocumentoscaucionhab;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrdocumentoscaucion")
    private List<Lrfichaclientedocu> lrfichaclientedocuList;

    public Lrdocumentoscaucion() {
    }

    public Lrdocumentoscaucion(Long lrdocumentoscaucionid) {
        this.lrdocumentoscaucionid = lrdocumentoscaucionid;
    }

    public Lrdocumentoscaucion(Long lrdocumentoscaucionid, String lrdocumentoscauciondesc, Character lrdocumentoscauciontipopers, Character lrdocumentoscaucionhab) {
        this.lrdocumentoscaucionid = lrdocumentoscaucionid;
        this.lrdocumentoscauciondesc = lrdocumentoscauciondesc;
        this.lrdocumentoscauciontipopers = lrdocumentoscauciontipopers;
        this.lrdocumentoscaucionhab = lrdocumentoscaucionhab;
    }

    public Long getLrdocumentoscaucionid() {
        return lrdocumentoscaucionid;
    }

    public void setLrdocumentoscaucionid(Long lrdocumentoscaucionid) {
        this.lrdocumentoscaucionid = lrdocumentoscaucionid;
    }

    public String getLrdocumentoscauciondesc() {
        return lrdocumentoscauciondesc;
    }

    public void setLrdocumentoscauciondesc(String lrdocumentoscauciondesc) {
        this.lrdocumentoscauciondesc = lrdocumentoscauciondesc;
    }

    public Character getLrdocumentoscauciontipopers() {
        return lrdocumentoscauciontipopers;
    }

    public void setLrdocumentoscauciontipopers(Character lrdocumentoscauciontipopers) {
        this.lrdocumentoscauciontipopers = lrdocumentoscauciontipopers;
    }

    public Date getLrdocumentoscaucionfal() {
        return lrdocumentoscaucionfal;
    }

    public void setLrdocumentoscaucionfal(Date lrdocumentoscaucionfal) {
        this.lrdocumentoscaucionfal = lrdocumentoscaucionfal;
    }

    public String getLrdocumentoscaucionual() {
        return lrdocumentoscaucionual;
    }

    public void setLrdocumentoscaucionual(String lrdocumentoscaucionual) {
        this.lrdocumentoscaucionual = lrdocumentoscaucionual;
    }

    public Date getLrdocumentoscaucionfmd() {
        return lrdocumentoscaucionfmd;
    }

    public void setLrdocumentoscaucionfmd(Date lrdocumentoscaucionfmd) {
        this.lrdocumentoscaucionfmd = lrdocumentoscaucionfmd;
    }

    public String getLrdocumentoscaucionumd() {
        return lrdocumentoscaucionumd;
    }

    public void setLrdocumentoscaucionumd(String lrdocumentoscaucionumd) {
        this.lrdocumentoscaucionumd = lrdocumentoscaucionumd;
    }

    public Character getLrdocumentoscaucionhab() {
        return lrdocumentoscaucionhab;
    }

    public void setLrdocumentoscaucionhab(Character lrdocumentoscaucionhab) {
        this.lrdocumentoscaucionhab = lrdocumentoscaucionhab;
    }

    public List<Lrfichaclientedocu> getLrfichaclientedocuList() {
        return lrfichaclientedocuList;
    }

    public void setLrfichaclientedocuList(List<Lrfichaclientedocu> lrfichaclientedocuList) {
        this.lrfichaclientedocuList = lrfichaclientedocuList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrdocumentoscaucionid != null ? lrdocumentoscaucionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrdocumentoscaucion)) {
            return false;
        }
        Lrdocumentoscaucion other = (Lrdocumentoscaucion) object;
        if ((this.lrdocumentoscaucionid == null && other.lrdocumentoscaucionid != null) || (this.lrdocumentoscaucionid != null && !this.lrdocumentoscaucionid.equals(other.lrdocumentoscaucionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrdocumentoscaucion[ lrdocumentoscaucionid=" + lrdocumentoscaucionid + " ]";
    }
    
}
