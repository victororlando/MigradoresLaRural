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
import javax.persistence.UniqueConstraint;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRPARMITEM", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"LRPARMITEMNRO"})})
@NamedQueries({
    @NamedQuery(name = "Lrparmitem.findAll", query = "SELECT l FROM Lrparmitem l"),
    @NamedQuery(name = "Lrparmitem.findByLrparmitemid", query = "SELECT l FROM Lrparmitem l WHERE l.lrparmitemid = :lrparmitemid"),
    @NamedQuery(name = "Lrparmitem.findByLrparmitemdesc", query = "SELECT l FROM Lrparmitem l WHERE l.lrparmitemdesc = :lrparmitemdesc"),
    @NamedQuery(name = "Lrparmitem.findByLrparmitemcodigo", query = "SELECT l FROM Lrparmitem l WHERE l.lrparmitemcodigo = :lrparmitemcodigo"),
    @NamedQuery(name = "Lrparmitem.findByLrparmitemac", query = "SELECT l FROM Lrparmitem l WHERE l.lrparmitemac = :lrparmitemac"),
    @NamedQuery(name = "Lrparmitem.findByLrparmitemual", query = "SELECT l FROM Lrparmitem l WHERE l.lrparmitemual = :lrparmitemual"),
    @NamedQuery(name = "Lrparmitem.findByLrparmitemfal", query = "SELECT l FROM Lrparmitem l WHERE l.lrparmitemfal = :lrparmitemfal"),
    @NamedQuery(name = "Lrparmitem.findByLrparmitemumd", query = "SELECT l FROM Lrparmitem l WHERE l.lrparmitemumd = :lrparmitemumd"),
    @NamedQuery(name = "Lrparmitem.findByLrparmitemfmd", query = "SELECT l FROM Lrparmitem l WHERE l.lrparmitemfmd = :lrparmitemfmd"),
    @NamedQuery(name = "Lrparmitem.findByLrparmitemnro", query = "SELECT l FROM Lrparmitem l WHERE l.lrparmitemnro = :lrparmitemnro")})
public class Lrparmitem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRPARMITEMID", nullable = false)
    private Long lrparmitemid;
    @Basic(optional = false)
    @Column(name = "LRPARMITEMDESC", nullable = false, length = 500)
    private String lrparmitemdesc;
    @Basic(optional = false)
    @Column(name = "LRPARMITEMCODIGO", nullable = false)
    private short lrparmitemcodigo;
    @Basic(optional = false)
    @Column(name = "LRPARMITEMAC", nullable = false)
    private Character lrparmitemac;
    @Basic(optional = false)
    @Column(name = "LRPARMITEMUAL", nullable = false, length = 30)
    private String lrparmitemual;
    @Basic(optional = false)
    @Column(name = "LRPARMITEMFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrparmitemfal;
    @Basic(optional = false)
    @Column(name = "LRPARMITEMUMD", nullable = false, length = 30)
    private String lrparmitemumd;
    @Basic(optional = false)
    @Column(name = "LRPARMITEMFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrparmitemfmd;
    @Basic(optional = false)
    @Column(name = "LRPARMITEMNRO", nullable = false)
    private long lrparmitemnro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrparmitem")
    private List<Lrparmcotireglas> lrparmcotireglasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrparmitemid")
    private List<Lrcotizacionitem> lrcotizacionitemList;

    public Lrparmitem() {
    }

    public Lrparmitem(Long lrparmitemid) {
        this.lrparmitemid = lrparmitemid;
    }

    public Lrparmitem(Long lrparmitemid, String lrparmitemdesc, short lrparmitemcodigo, Character lrparmitemac, String lrparmitemual, Date lrparmitemfal, String lrparmitemumd, Date lrparmitemfmd, long lrparmitemnro) {
        this.lrparmitemid = lrparmitemid;
        this.lrparmitemdesc = lrparmitemdesc;
        this.lrparmitemcodigo = lrparmitemcodigo;
        this.lrparmitemac = lrparmitemac;
        this.lrparmitemual = lrparmitemual;
        this.lrparmitemfal = lrparmitemfal;
        this.lrparmitemumd = lrparmitemumd;
        this.lrparmitemfmd = lrparmitemfmd;
        this.lrparmitemnro = lrparmitemnro;
    }

    public Long getLrparmitemid() {
        return lrparmitemid;
    }

    public void setLrparmitemid(Long lrparmitemid) {
        this.lrparmitemid = lrparmitemid;
    }

    public String getLrparmitemdesc() {
        return lrparmitemdesc;
    }

    public void setLrparmitemdesc(String lrparmitemdesc) {
        this.lrparmitemdesc = lrparmitemdesc;
    }

    public short getLrparmitemcodigo() {
        return lrparmitemcodigo;
    }

    public void setLrparmitemcodigo(short lrparmitemcodigo) {
        this.lrparmitemcodigo = lrparmitemcodigo;
    }

    public Character getLrparmitemac() {
        return lrparmitemac;
    }

    public void setLrparmitemac(Character lrparmitemac) {
        this.lrparmitemac = lrparmitemac;
    }

    public String getLrparmitemual() {
        return lrparmitemual;
    }

    public void setLrparmitemual(String lrparmitemual) {
        this.lrparmitemual = lrparmitemual;
    }

    public Date getLrparmitemfal() {
        return lrparmitemfal;
    }

    public void setLrparmitemfal(Date lrparmitemfal) {
        this.lrparmitemfal = lrparmitemfal;
    }

    public String getLrparmitemumd() {
        return lrparmitemumd;
    }

    public void setLrparmitemumd(String lrparmitemumd) {
        this.lrparmitemumd = lrparmitemumd;
    }

    public Date getLrparmitemfmd() {
        return lrparmitemfmd;
    }

    public void setLrparmitemfmd(Date lrparmitemfmd) {
        this.lrparmitemfmd = lrparmitemfmd;
    }

    public long getLrparmitemnro() {
        return lrparmitemnro;
    }

    public void setLrparmitemnro(long lrparmitemnro) {
        this.lrparmitemnro = lrparmitemnro;
    }

    public List<Lrparmcotireglas> getLrparmcotireglasList() {
        return lrparmcotireglasList;
    }

    public void setLrparmcotireglasList(List<Lrparmcotireglas> lrparmcotireglasList) {
        this.lrparmcotireglasList = lrparmcotireglasList;
    }

    public List<Lrcotizacionitem> getLrcotizacionitemList() {
        return lrcotizacionitemList;
    }

    public void setLrcotizacionitemList(List<Lrcotizacionitem> lrcotizacionitemList) {
        this.lrcotizacionitemList = lrcotizacionitemList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrparmitemid != null ? lrparmitemid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrparmitem)) {
            return false;
        }
        Lrparmitem other = (Lrparmitem) object;
        if ((this.lrparmitemid == null && other.lrparmitemid != null) || (this.lrparmitemid != null && !this.lrparmitemid.equals(other.lrparmitemid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrparmitem[ lrparmitemid=" + lrparmitemid + " ]";
    }
    
}
