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
import javax.persistence.UniqueConstraint;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRSECTOR", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"LRSECTORORDEN"})})
@NamedQueries({
    @NamedQuery(name = "Lrsector.findAll", query = "SELECT l FROM Lrsector l"),
    @NamedQuery(name = "Lrsector.findByLrsectorid", query = "SELECT l FROM Lrsector l WHERE l.lrsectorid = :lrsectorid"),
    @NamedQuery(name = "Lrsector.findByLrsectororden", query = "SELECT l FROM Lrsector l WHERE l.lrsectororden = :lrsectororden"),
    @NamedQuery(name = "Lrsector.findByLrsectordesc", query = "SELECT l FROM Lrsector l WHERE l.lrsectordesc = :lrsectordesc"),
    @NamedQuery(name = "Lrsector.findByLrsectorac", query = "SELECT l FROM Lrsector l WHERE l.lrsectorac = :lrsectorac"),
    @NamedQuery(name = "Lrsector.findByLrsectorual", query = "SELECT l FROM Lrsector l WHERE l.lrsectorual = :lrsectorual"),
    @NamedQuery(name = "Lrsector.findByLrsectorfal", query = "SELECT l FROM Lrsector l WHERE l.lrsectorfal = :lrsectorfal"),
    @NamedQuery(name = "Lrsector.findByLrsectorumd", query = "SELECT l FROM Lrsector l WHERE l.lrsectorumd = :lrsectorumd"),
    @NamedQuery(name = "Lrsector.findByLrsectorfmd", query = "SELECT l FROM Lrsector l WHERE l.lrsectorfmd = :lrsectorfmd")})
public class Lrsector implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRSECTORID", nullable = false)
    private Long lrsectorid;
    @Basic(optional = false)
    @Column(name = "LRSECTORORDEN", nullable = false)
    private short lrsectororden;
    @Basic(optional = false)
    @Column(name = "LRSECTORDESC", nullable = false, length = 50)
    private String lrsectordesc;
    @Basic(optional = false)
    @Column(name = "LRSECTORAC", nullable = false)
    private Character lrsectorac;
    @Basic(optional = false)
    @Column(name = "LRSECTORUAL", nullable = false, length = 30)
    private String lrsectorual;
    @Basic(optional = false)
    @Column(name = "LRSECTORFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrsectorfal;
    @Basic(optional = false)
    @Column(name = "LRSECTORUMD", nullable = false, length = 30)
    private String lrsectorumd;
    @Basic(optional = false)
    @Column(name = "LRSECTORFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrsectorfmd;
    @OneToMany(mappedBy = "lrsectorid")
    private List<Lrcotidatbiensector> lrcotidatbiensectorList;
    @OneToMany(mappedBy = "lrsectorid")
    private List<Lrcotinspdet> lrcotinspdetList;

    public Lrsector() {
    }

    public Lrsector(Long lrsectorid) {
        this.lrsectorid = lrsectorid;
    }

    public Lrsector(Long lrsectorid, short lrsectororden, String lrsectordesc, Character lrsectorac, String lrsectorual, Date lrsectorfal, String lrsectorumd, Date lrsectorfmd) {
        this.lrsectorid = lrsectorid;
        this.lrsectororden = lrsectororden;
        this.lrsectordesc = lrsectordesc;
        this.lrsectorac = lrsectorac;
        this.lrsectorual = lrsectorual;
        this.lrsectorfal = lrsectorfal;
        this.lrsectorumd = lrsectorumd;
        this.lrsectorfmd = lrsectorfmd;
    }

    public Long getLrsectorid() {
        return lrsectorid;
    }

    public void setLrsectorid(Long lrsectorid) {
        this.lrsectorid = lrsectorid;
    }

    public short getLrsectororden() {
        return lrsectororden;
    }

    public void setLrsectororden(short lrsectororden) {
        this.lrsectororden = lrsectororden;
    }

    public String getLrsectordesc() {
        return lrsectordesc;
    }

    public void setLrsectordesc(String lrsectordesc) {
        this.lrsectordesc = lrsectordesc;
    }

    public Character getLrsectorac() {
        return lrsectorac;
    }

    public void setLrsectorac(Character lrsectorac) {
        this.lrsectorac = lrsectorac;
    }

    public String getLrsectorual() {
        return lrsectorual;
    }

    public void setLrsectorual(String lrsectorual) {
        this.lrsectorual = lrsectorual;
    }

    public Date getLrsectorfal() {
        return lrsectorfal;
    }

    public void setLrsectorfal(Date lrsectorfal) {
        this.lrsectorfal = lrsectorfal;
    }

    public String getLrsectorumd() {
        return lrsectorumd;
    }

    public void setLrsectorumd(String lrsectorumd) {
        this.lrsectorumd = lrsectorumd;
    }

    public Date getLrsectorfmd() {
        return lrsectorfmd;
    }

    public void setLrsectorfmd(Date lrsectorfmd) {
        this.lrsectorfmd = lrsectorfmd;
    }

    public List<Lrcotidatbiensector> getLrcotidatbiensectorList() {
        return lrcotidatbiensectorList;
    }

    public void setLrcotidatbiensectorList(List<Lrcotidatbiensector> lrcotidatbiensectorList) {
        this.lrcotidatbiensectorList = lrcotidatbiensectorList;
    }

    public List<Lrcotinspdet> getLrcotinspdetList() {
        return lrcotinspdetList;
    }

    public void setLrcotinspdetList(List<Lrcotinspdet> lrcotinspdetList) {
        this.lrcotinspdetList = lrcotinspdetList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrsectorid != null ? lrsectorid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrsector)) {
            return false;
        }
        Lrsector other = (Lrsector) object;
        if ((this.lrsectorid == null && other.lrsectorid != null) || (this.lrsectorid != null && !this.lrsectorid.equals(other.lrsectorid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrsector[ lrsectorid=" + lrsectorid + " ]";
    }
    
}
