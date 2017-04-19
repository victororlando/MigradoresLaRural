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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRINSPECTOR", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"LRUSUARIOSID"})})
@NamedQueries({
    @NamedQuery(name = "Lrinspector.findAll", query = "SELECT l FROM Lrinspector l"),
    @NamedQuery(name = "Lrinspector.findByLrinspectorid", query = "SELECT l FROM Lrinspector l WHERE l.lrinspectorid = :lrinspectorid"),
    @NamedQuery(name = "Lrinspector.findByLrinspectorac", query = "SELECT l FROM Lrinspector l WHERE l.lrinspectorac = :lrinspectorac"),
    @NamedQuery(name = "Lrinspector.findByLrinspectorual", query = "SELECT l FROM Lrinspector l WHERE l.lrinspectorual = :lrinspectorual"),
    @NamedQuery(name = "Lrinspector.findByLrinspectorfal", query = "SELECT l FROM Lrinspector l WHERE l.lrinspectorfal = :lrinspectorfal"),
    @NamedQuery(name = "Lrinspector.findByLrinspectorumd", query = "SELECT l FROM Lrinspector l WHERE l.lrinspectorumd = :lrinspectorumd"),
    @NamedQuery(name = "Lrinspector.findByLrinspectorfmd", query = "SELECT l FROM Lrinspector l WHERE l.lrinspectorfmd = :lrinspectorfmd")})
public class Lrinspector implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRINSPECTORID", nullable = false)
    private Long lrinspectorid;
    @Basic(optional = false)
    @Column(name = "LRINSPECTORAC", nullable = false)
    private Character lrinspectorac;
    @Basic(optional = false)
    @Column(name = "LRINSPECTORUAL", nullable = false, length = 30)
    private String lrinspectorual;
    @Basic(optional = false)
    @Column(name = "LRINSPECTORFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrinspectorfal;
    @Basic(optional = false)
    @Column(name = "LRINSPECTORUMD", nullable = false, length = 30)
    private String lrinspectorumd;
    @Basic(optional = false)
    @Column(name = "LRINSPECTORFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrinspectorfmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrinspectortareaid")
    private List<Lrtareainspeccion> lrtareainspeccionList;
    @OneToMany(mappedBy = "lrinspectorid")
    private List<Lrcotinspeccion> lrcotinspeccionList;
    @OneToMany(mappedBy = "lrinspectormodid")
    private List<Lrcotinspeccion> lrcotinspeccionList1;
    @OneToMany(mappedBy = "lrinspectoraprobid")
    private List<Lrcotinspeccion> lrcotinspeccionList2;
    @JoinColumn(name = "LRUSUARIOSID", referencedColumnName = "LRUSUARIOSID", nullable = false)
    @OneToOne(optional = false)
    private Lrusuario lrusuariosid;
    @OneToMany(mappedBy = "lrcotinspdetinspectorid")
    private List<Lrcotinspdet> lrcotinspdetList;
    @OneToMany(mappedBy = "lrcotinspdetinspectormodid")
    private List<Lrcotinspdet> lrcotinspdetList1;

    public Lrinspector() {
    }

    public Lrinspector(Long lrinspectorid) {
        this.lrinspectorid = lrinspectorid;
    }

    public Lrinspector(Long lrinspectorid, Character lrinspectorac, String lrinspectorual, Date lrinspectorfal, String lrinspectorumd, Date lrinspectorfmd) {
        this.lrinspectorid = lrinspectorid;
        this.lrinspectorac = lrinspectorac;
        this.lrinspectorual = lrinspectorual;
        this.lrinspectorfal = lrinspectorfal;
        this.lrinspectorumd = lrinspectorumd;
        this.lrinspectorfmd = lrinspectorfmd;
    }

    public Long getLrinspectorid() {
        return lrinspectorid;
    }

    public void setLrinspectorid(Long lrinspectorid) {
        this.lrinspectorid = lrinspectorid;
    }

    public Character getLrinspectorac() {
        return lrinspectorac;
    }

    public void setLrinspectorac(Character lrinspectorac) {
        this.lrinspectorac = lrinspectorac;
    }

    public String getLrinspectorual() {
        return lrinspectorual;
    }

    public void setLrinspectorual(String lrinspectorual) {
        this.lrinspectorual = lrinspectorual;
    }

    public Date getLrinspectorfal() {
        return lrinspectorfal;
    }

    public void setLrinspectorfal(Date lrinspectorfal) {
        this.lrinspectorfal = lrinspectorfal;
    }

    public String getLrinspectorumd() {
        return lrinspectorumd;
    }

    public void setLrinspectorumd(String lrinspectorumd) {
        this.lrinspectorumd = lrinspectorumd;
    }

    public Date getLrinspectorfmd() {
        return lrinspectorfmd;
    }

    public void setLrinspectorfmd(Date lrinspectorfmd) {
        this.lrinspectorfmd = lrinspectorfmd;
    }

    public List<Lrtareainspeccion> getLrtareainspeccionList() {
        return lrtareainspeccionList;
    }

    public void setLrtareainspeccionList(List<Lrtareainspeccion> lrtareainspeccionList) {
        this.lrtareainspeccionList = lrtareainspeccionList;
    }

    public List<Lrcotinspeccion> getLrcotinspeccionList() {
        return lrcotinspeccionList;
    }

    public void setLrcotinspeccionList(List<Lrcotinspeccion> lrcotinspeccionList) {
        this.lrcotinspeccionList = lrcotinspeccionList;
    }

    public List<Lrcotinspeccion> getLrcotinspeccionList1() {
        return lrcotinspeccionList1;
    }

    public void setLrcotinspeccionList1(List<Lrcotinspeccion> lrcotinspeccionList1) {
        this.lrcotinspeccionList1 = lrcotinspeccionList1;
    }

    public List<Lrcotinspeccion> getLrcotinspeccionList2() {
        return lrcotinspeccionList2;
    }

    public void setLrcotinspeccionList2(List<Lrcotinspeccion> lrcotinspeccionList2) {
        this.lrcotinspeccionList2 = lrcotinspeccionList2;
    }

    public Lrusuario getLrusuariosid() {
        return lrusuariosid;
    }

    public void setLrusuariosid(Lrusuario lrusuariosid) {
        this.lrusuariosid = lrusuariosid;
    }

    public List<Lrcotinspdet> getLrcotinspdetList() {
        return lrcotinspdetList;
    }

    public void setLrcotinspdetList(List<Lrcotinspdet> lrcotinspdetList) {
        this.lrcotinspdetList = lrcotinspdetList;
    }

    public List<Lrcotinspdet> getLrcotinspdetList1() {
        return lrcotinspdetList1;
    }

    public void setLrcotinspdetList1(List<Lrcotinspdet> lrcotinspdetList1) {
        this.lrcotinspdetList1 = lrcotinspdetList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrinspectorid != null ? lrinspectorid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrinspector)) {
            return false;
        }
        Lrinspector other = (Lrinspector) object;
        if ((this.lrinspectorid == null && other.lrinspectorid != null) || (this.lrinspectorid != null && !this.lrinspectorid.equals(other.lrinspectorid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrinspector[ lrinspectorid=" + lrinspectorid + " ]";
    }
    
}
