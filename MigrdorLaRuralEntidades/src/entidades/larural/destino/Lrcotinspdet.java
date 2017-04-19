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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "LRCOTINSPDET")
@NamedQueries({
    @NamedQuery(name = "Lrcotinspdet.findAll", query = "SELECT l FROM Lrcotinspdet l"),
    @NamedQuery(name = "Lrcotinspdet.findByLrcotinspdetid", query = "SELECT l FROM Lrcotinspdet l WHERE l.lrcotinspdetid = :lrcotinspdetid"),
    @NamedQuery(name = "Lrcotinspdet.findByLrcotinspdetpuntaje", query = "SELECT l FROM Lrcotinspdet l WHERE l.lrcotinspdetpuntaje = :lrcotinspdetpuntaje"),
    @NamedQuery(name = "Lrcotinspdet.findByLrcotinspdetvalor", query = "SELECT l FROM Lrcotinspdet l WHERE l.lrcotinspdetvalor = :lrcotinspdetvalor"),
    @NamedQuery(name = "Lrcotinspdet.findByLrcotinspdetfal", query = "SELECT l FROM Lrcotinspdet l WHERE l.lrcotinspdetfal = :lrcotinspdetfal"),
    @NamedQuery(name = "Lrcotinspdet.findByLrcotinspdetfmd", query = "SELECT l FROM Lrcotinspdet l WHERE l.lrcotinspdetfmd = :lrcotinspdetfmd")})
public class Lrcotinspdet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCOTINSPDETID", nullable = false)
    private Long lrcotinspdetid;
    @Basic(optional = false)
    @Column(name = "LRCOTINSPDETPUNTAJE", nullable = false)
    private long lrcotinspdetpuntaje;
    @Basic(optional = false)
    @Column(name = "LRCOTINSPDETVALOR", nullable = false, length = 40)
    private String lrcotinspdetvalor;
    @Basic(optional = false)
    @Column(name = "LRCOTINSPDETFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotinspdetfal;
    @Basic(optional = false)
    @Column(name = "LRCOTINSPDETFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotinspdetfmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcotinspdetid")
    private List<Lrcotiinspdetfoto> lrcotiinspdetfotoList;
    @JoinColumn(name = "LRCOTINSPECCIONID", referencedColumnName = "LRCOTINSPECCIONID", nullable = false)
    @ManyToOne(optional = false)
    private Lrcotinspeccion lrcotinspeccionid;
    @JoinColumn(name = "LRDIMENSIONID", referencedColumnName = "LRDIMENSIONID", nullable = false)
    @ManyToOne(optional = false)
    private Lrdimension lrdimensionid;
    @JoinColumn(name = "LRCOTINSPDETINSPECTORID", referencedColumnName = "LRINSPECTORID")
    @ManyToOne
    private Lrinspector lrcotinspdetinspectorid;
    @JoinColumn(name = "LRCOTINSPDETINSPECTORMODID", referencedColumnName = "LRINSPECTORID")
    @ManyToOne
    private Lrinspector lrcotinspdetinspectormodid;
    @JoinColumn(name = "LRSECTORID", referencedColumnName = "LRSECTORID")
    @ManyToOne
    private Lrsector lrsectorid;

    public Lrcotinspdet() {
    }

    public Lrcotinspdet(Long lrcotinspdetid) {
        this.lrcotinspdetid = lrcotinspdetid;
    }

    public Lrcotinspdet(Long lrcotinspdetid, long lrcotinspdetpuntaje, String lrcotinspdetvalor, Date lrcotinspdetfal, Date lrcotinspdetfmd) {
        this.lrcotinspdetid = lrcotinspdetid;
        this.lrcotinspdetpuntaje = lrcotinspdetpuntaje;
        this.lrcotinspdetvalor = lrcotinspdetvalor;
        this.lrcotinspdetfal = lrcotinspdetfal;
        this.lrcotinspdetfmd = lrcotinspdetfmd;
    }

    public Long getLrcotinspdetid() {
        return lrcotinspdetid;
    }

    public void setLrcotinspdetid(Long lrcotinspdetid) {
        this.lrcotinspdetid = lrcotinspdetid;
    }

    public long getLrcotinspdetpuntaje() {
        return lrcotinspdetpuntaje;
    }

    public void setLrcotinspdetpuntaje(long lrcotinspdetpuntaje) {
        this.lrcotinspdetpuntaje = lrcotinspdetpuntaje;
    }

    public String getLrcotinspdetvalor() {
        return lrcotinspdetvalor;
    }

    public void setLrcotinspdetvalor(String lrcotinspdetvalor) {
        this.lrcotinspdetvalor = lrcotinspdetvalor;
    }

    public Date getLrcotinspdetfal() {
        return lrcotinspdetfal;
    }

    public void setLrcotinspdetfal(Date lrcotinspdetfal) {
        this.lrcotinspdetfal = lrcotinspdetfal;
    }

    public Date getLrcotinspdetfmd() {
        return lrcotinspdetfmd;
    }

    public void setLrcotinspdetfmd(Date lrcotinspdetfmd) {
        this.lrcotinspdetfmd = lrcotinspdetfmd;
    }

    public List<Lrcotiinspdetfoto> getLrcotiinspdetfotoList() {
        return lrcotiinspdetfotoList;
    }

    public void setLrcotiinspdetfotoList(List<Lrcotiinspdetfoto> lrcotiinspdetfotoList) {
        this.lrcotiinspdetfotoList = lrcotiinspdetfotoList;
    }

    public Lrcotinspeccion getLrcotinspeccionid() {
        return lrcotinspeccionid;
    }

    public void setLrcotinspeccionid(Lrcotinspeccion lrcotinspeccionid) {
        this.lrcotinspeccionid = lrcotinspeccionid;
    }

    public Lrdimension getLrdimensionid() {
        return lrdimensionid;
    }

    public void setLrdimensionid(Lrdimension lrdimensionid) {
        this.lrdimensionid = lrdimensionid;
    }

    public Lrinspector getLrcotinspdetinspectorid() {
        return lrcotinspdetinspectorid;
    }

    public void setLrcotinspdetinspectorid(Lrinspector lrcotinspdetinspectorid) {
        this.lrcotinspdetinspectorid = lrcotinspdetinspectorid;
    }

    public Lrinspector getLrcotinspdetinspectormodid() {
        return lrcotinspdetinspectormodid;
    }

    public void setLrcotinspdetinspectormodid(Lrinspector lrcotinspdetinspectormodid) {
        this.lrcotinspdetinspectormodid = lrcotinspdetinspectormodid;
    }

    public Lrsector getLrsectorid() {
        return lrsectorid;
    }

    public void setLrsectorid(Lrsector lrsectorid) {
        this.lrsectorid = lrsectorid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcotinspdetid != null ? lrcotinspdetid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcotinspdet)) {
            return false;
        }
        Lrcotinspdet other = (Lrcotinspdet) object;
        if ((this.lrcotinspdetid == null && other.lrcotinspdetid != null) || (this.lrcotinspdetid != null && !this.lrcotinspdetid.equals(other.lrcotinspdetid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcotinspdet[ lrcotinspdetid=" + lrcotinspdetid + " ]";
    }
    
}
