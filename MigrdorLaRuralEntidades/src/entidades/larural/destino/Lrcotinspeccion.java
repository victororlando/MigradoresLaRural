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
@Table(name = "LRCOTINSPECCION")
@NamedQueries({
    @NamedQuery(name = "Lrcotinspeccion.findAll", query = "SELECT l FROM Lrcotinspeccion l"),
    @NamedQuery(name = "Lrcotinspeccion.findByLrcotinspeccionid", query = "SELECT l FROM Lrcotinspeccion l WHERE l.lrcotinspeccionid = :lrcotinspeccionid"),
    @NamedQuery(name = "Lrcotinspeccion.findByLrcotinspeccionfecha", query = "SELECT l FROM Lrcotinspeccion l WHERE l.lrcotinspeccionfecha = :lrcotinspeccionfecha"),
    @NamedQuery(name = "Lrcotinspeccion.findByLrcotinspeccionpuntajetotal", query = "SELECT l FROM Lrcotinspeccion l WHERE l.lrcotinspeccionpuntajetotal = :lrcotinspeccionpuntajetotal"),
    @NamedQuery(name = "Lrcotinspeccion.findByLrcotinspeccionfal", query = "SELECT l FROM Lrcotinspeccion l WHERE l.lrcotinspeccionfal = :lrcotinspeccionfal"),
    @NamedQuery(name = "Lrcotinspeccion.findByLrcotinspeccionfmd", query = "SELECT l FROM Lrcotinspeccion l WHERE l.lrcotinspeccionfmd = :lrcotinspeccionfmd"),
    @NamedQuery(name = "Lrcotinspeccion.findByLrcotinspeccionprocesos", query = "SELECT l FROM Lrcotinspeccion l WHERE l.lrcotinspeccionprocesos = :lrcotinspeccionprocesos"),
    @NamedQuery(name = "Lrcotinspeccion.findByLrcotinspeccionfchcoord", query = "SELECT l FROM Lrcotinspeccion l WHERE l.lrcotinspeccionfchcoord = :lrcotinspeccionfchcoord"),
    @NamedQuery(name = "Lrcotinspeccion.findByLrcotinspeccionfap", query = "SELECT l FROM Lrcotinspeccion l WHERE l.lrcotinspeccionfap = :lrcotinspeccionfap")})
public class Lrcotinspeccion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCOTINSPECCIONID", nullable = false)
    private Long lrcotinspeccionid;
    @Basic(optional = false)
    @Column(name = "LRCOTINSPECCIONFECHA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotinspeccionfecha;
    @Basic(optional = false)
    @Column(name = "LRCOTINSPECCIONPUNTAJETOTAL", nullable = false)
    private short lrcotinspeccionpuntajetotal;
    @Basic(optional = false)
    @Column(name = "LRCOTINSPECCIONFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotinspeccionfal;
    @Basic(optional = false)
    @Column(name = "LRCOTINSPECCIONFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotinspeccionfmd;
    @Basic(optional = false)
    @Column(name = "LRCOTINSPECCIONPROCESOS", nullable = false, length = 4000)
    private String lrcotinspeccionprocesos;
    @Basic(optional = false)
    @Column(name = "LRCOTINSPECCIONFCHCOORD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotinspeccionfchcoord;
    @Basic(optional = false)
    @Column(name = "LRCOTINSPECCIONFAP", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotinspeccionfap;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcotinspeccionid")
    private List<Lrflujoinspeccion> lrflujoinspeccionList;
    @OneToMany(mappedBy = "lrcotinspeccionid")
    private List<Lrtareainspeccion> lrtareainspeccionList;
    @JoinColumn(name = "LRAGRUPAFORMULARIOID", referencedColumnName = "LRAGRUPAFORMULARIOID")
    @ManyToOne
    private Lragrupaformulario lragrupaformularioid;
    @JoinColumn(name = "LRCALIFICACIONRIESGOID", referencedColumnName = "LRCALIFICACIONRIESGOID")
    @ManyToOne
    private Lrcalificacionriesgo lrcalificacionriesgoid;
    @JoinColumn(name = "LRINSPECTORID", referencedColumnName = "LRINSPECTORID")
    @ManyToOne
    private Lrinspector lrinspectorid;
    @JoinColumn(name = "LRINSPECTORMODID", referencedColumnName = "LRINSPECTORID")
    @ManyToOne
    private Lrinspector lrinspectormodid;
    @JoinColumn(name = "LRINSPECTORAPROBID", referencedColumnName = "LRINSPECTORID")
    @ManyToOne
    private Lrinspector lrinspectoraprobid;
    @JoinColumn(name = "LRUBICACIONID", referencedColumnName = "LRUBICACIONID", nullable = false)
    @ManyToOne(optional = false)
    private Lrubicacion lrubicacionid;
    @OneToMany(mappedBy = "lrcotinspeccionid")
    private List<Lrcotidatbiensector> lrcotidatbiensectorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcotinspeccionid")
    private List<Lrcotinspdet> lrcotinspdetList;

    public Lrcotinspeccion() {
    }

    public Lrcotinspeccion(Long lrcotinspeccionid) {
        this.lrcotinspeccionid = lrcotinspeccionid;
    }

    public Lrcotinspeccion(Long lrcotinspeccionid, Date lrcotinspeccionfecha, short lrcotinspeccionpuntajetotal, Date lrcotinspeccionfal, Date lrcotinspeccionfmd, String lrcotinspeccionprocesos, Date lrcotinspeccionfchcoord, Date lrcotinspeccionfap) {
        this.lrcotinspeccionid = lrcotinspeccionid;
        this.lrcotinspeccionfecha = lrcotinspeccionfecha;
        this.lrcotinspeccionpuntajetotal = lrcotinspeccionpuntajetotal;
        this.lrcotinspeccionfal = lrcotinspeccionfal;
        this.lrcotinspeccionfmd = lrcotinspeccionfmd;
        this.lrcotinspeccionprocesos = lrcotinspeccionprocesos;
        this.lrcotinspeccionfchcoord = lrcotinspeccionfchcoord;
        this.lrcotinspeccionfap = lrcotinspeccionfap;
    }

    public Long getLrcotinspeccionid() {
        return lrcotinspeccionid;
    }

    public void setLrcotinspeccionid(Long lrcotinspeccionid) {
        this.lrcotinspeccionid = lrcotinspeccionid;
    }

    public Date getLrcotinspeccionfecha() {
        return lrcotinspeccionfecha;
    }

    public void setLrcotinspeccionfecha(Date lrcotinspeccionfecha) {
        this.lrcotinspeccionfecha = lrcotinspeccionfecha;
    }

    public short getLrcotinspeccionpuntajetotal() {
        return lrcotinspeccionpuntajetotal;
    }

    public void setLrcotinspeccionpuntajetotal(short lrcotinspeccionpuntajetotal) {
        this.lrcotinspeccionpuntajetotal = lrcotinspeccionpuntajetotal;
    }

    public Date getLrcotinspeccionfal() {
        return lrcotinspeccionfal;
    }

    public void setLrcotinspeccionfal(Date lrcotinspeccionfal) {
        this.lrcotinspeccionfal = lrcotinspeccionfal;
    }

    public Date getLrcotinspeccionfmd() {
        return lrcotinspeccionfmd;
    }

    public void setLrcotinspeccionfmd(Date lrcotinspeccionfmd) {
        this.lrcotinspeccionfmd = lrcotinspeccionfmd;
    }

    public String getLrcotinspeccionprocesos() {
        return lrcotinspeccionprocesos;
    }

    public void setLrcotinspeccionprocesos(String lrcotinspeccionprocesos) {
        this.lrcotinspeccionprocesos = lrcotinspeccionprocesos;
    }

    public Date getLrcotinspeccionfchcoord() {
        return lrcotinspeccionfchcoord;
    }

    public void setLrcotinspeccionfchcoord(Date lrcotinspeccionfchcoord) {
        this.lrcotinspeccionfchcoord = lrcotinspeccionfchcoord;
    }

    public Date getLrcotinspeccionfap() {
        return lrcotinspeccionfap;
    }

    public void setLrcotinspeccionfap(Date lrcotinspeccionfap) {
        this.lrcotinspeccionfap = lrcotinspeccionfap;
    }

    public List<Lrflujoinspeccion> getLrflujoinspeccionList() {
        return lrflujoinspeccionList;
    }

    public void setLrflujoinspeccionList(List<Lrflujoinspeccion> lrflujoinspeccionList) {
        this.lrflujoinspeccionList = lrflujoinspeccionList;
    }

    public List<Lrtareainspeccion> getLrtareainspeccionList() {
        return lrtareainspeccionList;
    }

    public void setLrtareainspeccionList(List<Lrtareainspeccion> lrtareainspeccionList) {
        this.lrtareainspeccionList = lrtareainspeccionList;
    }

    public Lragrupaformulario getLragrupaformularioid() {
        return lragrupaformularioid;
    }

    public void setLragrupaformularioid(Lragrupaformulario lragrupaformularioid) {
        this.lragrupaformularioid = lragrupaformularioid;
    }

    public Lrcalificacionriesgo getLrcalificacionriesgoid() {
        return lrcalificacionriesgoid;
    }

    public void setLrcalificacionriesgoid(Lrcalificacionriesgo lrcalificacionriesgoid) {
        this.lrcalificacionriesgoid = lrcalificacionriesgoid;
    }

    public Lrinspector getLrinspectorid() {
        return lrinspectorid;
    }

    public void setLrinspectorid(Lrinspector lrinspectorid) {
        this.lrinspectorid = lrinspectorid;
    }

    public Lrinspector getLrinspectormodid() {
        return lrinspectormodid;
    }

    public void setLrinspectormodid(Lrinspector lrinspectormodid) {
        this.lrinspectormodid = lrinspectormodid;
    }

    public Lrinspector getLrinspectoraprobid() {
        return lrinspectoraprobid;
    }

    public void setLrinspectoraprobid(Lrinspector lrinspectoraprobid) {
        this.lrinspectoraprobid = lrinspectoraprobid;
    }

    public Lrubicacion getLrubicacionid() {
        return lrubicacionid;
    }

    public void setLrubicacionid(Lrubicacion lrubicacionid) {
        this.lrubicacionid = lrubicacionid;
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
        hash += (lrcotinspeccionid != null ? lrcotinspeccionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcotinspeccion)) {
            return false;
        }
        Lrcotinspeccion other = (Lrcotinspeccion) object;
        if ((this.lrcotinspeccionid == null && other.lrcotinspeccionid != null) || (this.lrcotinspeccionid != null && !this.lrcotinspeccionid.equals(other.lrcotinspeccionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcotinspeccion[ lrcotinspeccionid=" + lrcotinspeccionid + " ]";
    }
    
}
