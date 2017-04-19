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
@Table(name = "LRTIPOPLANGRUP")
@NamedQueries({
    @NamedQuery(name = "Lrtipoplangrup.findAll", query = "SELECT l FROM Lrtipoplangrup l"),
    @NamedQuery(name = "Lrtipoplangrup.findByLrtipoplangrupid", query = "SELECT l FROM Lrtipoplangrup l WHERE l.lrtipoplangrupid = :lrtipoplangrupid"),
    @NamedQuery(name = "Lrtipoplangrup.findByLrtipoplangrupdesc", query = "SELECT l FROM Lrtipoplangrup l WHERE l.lrtipoplangrupdesc = :lrtipoplangrupdesc"),
    @NamedQuery(name = "Lrtipoplangrup.findByLrtipoplangrupac", query = "SELECT l FROM Lrtipoplangrup l WHERE l.lrtipoplangrupac = :lrtipoplangrupac"),
    @NamedQuery(name = "Lrtipoplangrup.findByLrtipoplangrupual", query = "SELECT l FROM Lrtipoplangrup l WHERE l.lrtipoplangrupual = :lrtipoplangrupual"),
    @NamedQuery(name = "Lrtipoplangrup.findByLrtipoplangrupfal", query = "SELECT l FROM Lrtipoplangrup l WHERE l.lrtipoplangrupfal = :lrtipoplangrupfal"),
    @NamedQuery(name = "Lrtipoplangrup.findByLrtipoplangrupumd", query = "SELECT l FROM Lrtipoplangrup l WHERE l.lrtipoplangrupumd = :lrtipoplangrupumd"),
    @NamedQuery(name = "Lrtipoplangrup.findByLrtipoplangrupfmd", query = "SELECT l FROM Lrtipoplangrup l WHERE l.lrtipoplangrupfmd = :lrtipoplangrupfmd")})
public class Lrtipoplangrup implements Serializable {
    @Column(name = "LRTIPOPLANGRUPESPACK")
    private Character lrtipoplangrupespack;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANGRUPID", nullable = false)
    private Long lrtipoplangrupid;
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANGRUPDESC", nullable = false, length = 500)
    private String lrtipoplangrupdesc;
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANGRUPAC", nullable = false)
    private Character lrtipoplangrupac;
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANGRUPUAL", nullable = false, length = 30)
    private String lrtipoplangrupual;
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANGRUPFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtipoplangrupfal;
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANGRUPUMD", nullable = false, length = 30)
    private String lrtipoplangrupumd;
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANGRUPFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtipoplangrupfmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrtipoplangrup")
    private List<Lrplangrupvehigrup> lrplangrupvehigrupList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrtipoplangrup")
    private List<Lrplangrupusuario> lrplangrupusuarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrtipoplangrup")
    private List<Lrtipoplan> lrtipoplanList;

    public Lrtipoplangrup() {
    }

    public Lrtipoplangrup(Long lrtipoplangrupid) {
        this.lrtipoplangrupid = lrtipoplangrupid;
    }

    public Lrtipoplangrup(Long lrtipoplangrupid, String lrtipoplangrupdesc, Character lrtipoplangrupac, String lrtipoplangrupual, Date lrtipoplangrupfal, String lrtipoplangrupumd, Date lrtipoplangrupfmd) {
        this.lrtipoplangrupid = lrtipoplangrupid;
        this.lrtipoplangrupdesc = lrtipoplangrupdesc;
        this.lrtipoplangrupac = lrtipoplangrupac;
        this.lrtipoplangrupual = lrtipoplangrupual;
        this.lrtipoplangrupfal = lrtipoplangrupfal;
        this.lrtipoplangrupumd = lrtipoplangrupumd;
        this.lrtipoplangrupfmd = lrtipoplangrupfmd;
    }

    public Long getLrtipoplangrupid() {
        return lrtipoplangrupid;
    }

    public void setLrtipoplangrupid(Long lrtipoplangrupid) {
        this.lrtipoplangrupid = lrtipoplangrupid;
    }

    public String getLrtipoplangrupdesc() {
        return lrtipoplangrupdesc;
    }

    public void setLrtipoplangrupdesc(String lrtipoplangrupdesc) {
        this.lrtipoplangrupdesc = lrtipoplangrupdesc;
    }

    public Character getLrtipoplangrupac() {
        return lrtipoplangrupac;
    }

    public void setLrtipoplangrupac(Character lrtipoplangrupac) {
        this.lrtipoplangrupac = lrtipoplangrupac;
    }

    public String getLrtipoplangrupual() {
        return lrtipoplangrupual;
    }

    public void setLrtipoplangrupual(String lrtipoplangrupual) {
        this.lrtipoplangrupual = lrtipoplangrupual;
    }

    public Date getLrtipoplangrupfal() {
        return lrtipoplangrupfal;
    }

    public void setLrtipoplangrupfal(Date lrtipoplangrupfal) {
        this.lrtipoplangrupfal = lrtipoplangrupfal;
    }

    public String getLrtipoplangrupumd() {
        return lrtipoplangrupumd;
    }

    public void setLrtipoplangrupumd(String lrtipoplangrupumd) {
        this.lrtipoplangrupumd = lrtipoplangrupumd;
    }

    public Date getLrtipoplangrupfmd() {
        return lrtipoplangrupfmd;
    }

    public void setLrtipoplangrupfmd(Date lrtipoplangrupfmd) {
        this.lrtipoplangrupfmd = lrtipoplangrupfmd;
    }

    public List<Lrplangrupvehigrup> getLrplangrupvehigrupList() {
        return lrplangrupvehigrupList;
    }

    public void setLrplangrupvehigrupList(List<Lrplangrupvehigrup> lrplangrupvehigrupList) {
        this.lrplangrupvehigrupList = lrplangrupvehigrupList;
    }

    public List<Lrplangrupusuario> getLrplangrupusuarioList() {
        return lrplangrupusuarioList;
    }

    public void setLrplangrupusuarioList(List<Lrplangrupusuario> lrplangrupusuarioList) {
        this.lrplangrupusuarioList = lrplangrupusuarioList;
    }

    public List<Lrtipoplan> getLrtipoplanList() {
        return lrtipoplanList;
    }

    public void setLrtipoplanList(List<Lrtipoplan> lrtipoplanList) {
        this.lrtipoplanList = lrtipoplanList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrtipoplangrupid != null ? lrtipoplangrupid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtipoplangrup)) {
            return false;
        }
        Lrtipoplangrup other = (Lrtipoplangrup) object;
        if ((this.lrtipoplangrupid == null && other.lrtipoplangrupid != null) || (this.lrtipoplangrupid != null && !this.lrtipoplangrupid.equals(other.lrtipoplangrupid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtipoplangrup[ lrtipoplangrupid=" + lrtipoplangrupid + " ]";
    }

    public Character getLrtipoplangrupespack() {
        return lrtipoplangrupespack;
    }

    public void setLrtipoplangrupespack(Character lrtipoplangrupespack) {
        this.lrtipoplangrupespack = lrtipoplangrupespack;
    }
    
}
