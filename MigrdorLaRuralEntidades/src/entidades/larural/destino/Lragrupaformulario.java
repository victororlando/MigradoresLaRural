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
import javax.persistence.JoinColumns;
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
@Table(name = "LRAGRUPAFORMULARIO")
@NamedQueries({
    @NamedQuery(name = "Lragrupaformulario.findAll", query = "SELECT l FROM Lragrupaformulario l"),
    @NamedQuery(name = "Lragrupaformulario.findByLragrupaformularioid", query = "SELECT l FROM Lragrupaformulario l WHERE l.lragrupaformularioid = :lragrupaformularioid"),
    @NamedQuery(name = "Lragrupaformulario.findByLragrupaformulariodesc", query = "SELECT l FROM Lragrupaformulario l WHERE l.lragrupaformulariodesc = :lragrupaformulariodesc"),
    @NamedQuery(name = "Lragrupaformulario.findByLragrupaformularioac", query = "SELECT l FROM Lragrupaformulario l WHERE l.lragrupaformularioac = :lragrupaformularioac"),
    @NamedQuery(name = "Lragrupaformulario.findByLragrupaformularioual", query = "SELECT l FROM Lragrupaformulario l WHERE l.lragrupaformularioual = :lragrupaformularioual"),
    @NamedQuery(name = "Lragrupaformulario.findByLragrupaformulariofal", query = "SELECT l FROM Lragrupaformulario l WHERE l.lragrupaformulariofal = :lragrupaformulariofal"),
    @NamedQuery(name = "Lragrupaformulario.findByLragrupaformularioumd", query = "SELECT l FROM Lragrupaformulario l WHERE l.lragrupaformularioumd = :lragrupaformularioumd"),
    @NamedQuery(name = "Lragrupaformulario.findByLragrupaformulariofmd", query = "SELECT l FROM Lragrupaformulario l WHERE l.lragrupaformulariofmd = :lragrupaformulariofmd"),
    @NamedQuery(name = "Lragrupaformulario.findByLragrupaformulariovigencia", query = "SELECT l FROM Lragrupaformulario l WHERE l.lragrupaformulariovigencia = :lragrupaformulariovigencia")})
public class Lragrupaformulario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRAGRUPAFORMULARIOID", nullable = false)
    private Long lragrupaformularioid;
    @Basic(optional = false)
    @Column(name = "LRAGRUPAFORMULARIODESC", nullable = false, length = 100)
    private String lragrupaformulariodesc;
    @Basic(optional = false)
    @Column(name = "LRAGRUPAFORMULARIOAC", nullable = false)
    private Character lragrupaformularioac;
    @Basic(optional = false)
    @Column(name = "LRAGRUPAFORMULARIOUAL", nullable = false, length = 30)
    private String lragrupaformularioual;
    @Basic(optional = false)
    @Column(name = "LRAGRUPAFORMULARIOFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lragrupaformulariofal;
    @Basic(optional = false)
    @Column(name = "LRAGRUPAFORMULARIOUMD", nullable = false, length = 30)
    private String lragrupaformularioumd;
    @Basic(optional = false)
    @Column(name = "LRAGRUPAFORMULARIOFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lragrupaformulariofmd;
    @Column(name = "LRAGRUPAFORMULARIOVIGENCIA")
    private Short lragrupaformulariovigencia;
    @JoinColumns({
        @JoinColumn(name = "LRAFAREAID", referencedColumnName = "LRAREAID", nullable = false),
        @JoinColumn(name = "LRAFSUBAREAID", referencedColumnName = "LRSUBAREAID", nullable = false)})
    @ManyToOne(optional = false)
    private Lrareasubarea lrareasubarea;
    @JoinColumn(name = "LRAFSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false)
    @ManyToOne(optional = false)
    private Lrseccdetalle lrafseccdetalleid;
    @OneToMany(mappedBy = "lragrupaformularioid")
    private List<Lrcotinspeccion> lrcotinspeccionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lragrupaformularioid")
    private List<Lrdimension> lrdimensionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lragrupaformulario")
    private List<Lrpuntuaciondefinitiva> lrpuntuaciondefinitivaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lragrupaformularioid")
    private List<Lrseccformulario> lrseccformularioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lragrupaformulario")
    private List<Lrclasificainspeccion> lrclasificainspeccionList;

    public Lragrupaformulario() {
    }

    public Lragrupaformulario(Long lragrupaformularioid) {
        this.lragrupaformularioid = lragrupaformularioid;
    }

    public Lragrupaformulario(Long lragrupaformularioid, String lragrupaformulariodesc, Character lragrupaformularioac, String lragrupaformularioual, Date lragrupaformulariofal, String lragrupaformularioumd, Date lragrupaformulariofmd) {
        this.lragrupaformularioid = lragrupaformularioid;
        this.lragrupaformulariodesc = lragrupaformulariodesc;
        this.lragrupaformularioac = lragrupaformularioac;
        this.lragrupaformularioual = lragrupaformularioual;
        this.lragrupaformulariofal = lragrupaformulariofal;
        this.lragrupaformularioumd = lragrupaformularioumd;
        this.lragrupaformulariofmd = lragrupaformulariofmd;
    }

    public Long getLragrupaformularioid() {
        return lragrupaformularioid;
    }

    public void setLragrupaformularioid(Long lragrupaformularioid) {
        this.lragrupaformularioid = lragrupaformularioid;
    }

    public String getLragrupaformulariodesc() {
        return lragrupaformulariodesc;
    }

    public void setLragrupaformulariodesc(String lragrupaformulariodesc) {
        this.lragrupaformulariodesc = lragrupaformulariodesc;
    }

    public Character getLragrupaformularioac() {
        return lragrupaformularioac;
    }

    public void setLragrupaformularioac(Character lragrupaformularioac) {
        this.lragrupaformularioac = lragrupaformularioac;
    }

    public String getLragrupaformularioual() {
        return lragrupaformularioual;
    }

    public void setLragrupaformularioual(String lragrupaformularioual) {
        this.lragrupaformularioual = lragrupaformularioual;
    }

    public Date getLragrupaformulariofal() {
        return lragrupaformulariofal;
    }

    public void setLragrupaformulariofal(Date lragrupaformulariofal) {
        this.lragrupaformulariofal = lragrupaformulariofal;
    }

    public String getLragrupaformularioumd() {
        return lragrupaformularioumd;
    }

    public void setLragrupaformularioumd(String lragrupaformularioumd) {
        this.lragrupaformularioumd = lragrupaformularioumd;
    }

    public Date getLragrupaformulariofmd() {
        return lragrupaformulariofmd;
    }

    public void setLragrupaformulariofmd(Date lragrupaformulariofmd) {
        this.lragrupaformulariofmd = lragrupaformulariofmd;
    }

    public Short getLragrupaformulariovigencia() {
        return lragrupaformulariovigencia;
    }

    public void setLragrupaformulariovigencia(Short lragrupaformulariovigencia) {
        this.lragrupaformulariovigencia = lragrupaformulariovigencia;
    }

    public Lrareasubarea getLrareasubarea() {
        return lrareasubarea;
    }

    public void setLrareasubarea(Lrareasubarea lrareasubarea) {
        this.lrareasubarea = lrareasubarea;
    }

    public Lrseccdetalle getLrafseccdetalleid() {
        return lrafseccdetalleid;
    }

    public void setLrafseccdetalleid(Lrseccdetalle lrafseccdetalleid) {
        this.lrafseccdetalleid = lrafseccdetalleid;
    }

    public List<Lrcotinspeccion> getLrcotinspeccionList() {
        return lrcotinspeccionList;
    }

    public void setLrcotinspeccionList(List<Lrcotinspeccion> lrcotinspeccionList) {
        this.lrcotinspeccionList = lrcotinspeccionList;
    }

    public List<Lrdimension> getLrdimensionList() {
        return lrdimensionList;
    }

    public void setLrdimensionList(List<Lrdimension> lrdimensionList) {
        this.lrdimensionList = lrdimensionList;
    }

    public List<Lrpuntuaciondefinitiva> getLrpuntuaciondefinitivaList() {
        return lrpuntuaciondefinitivaList;
    }

    public void setLrpuntuaciondefinitivaList(List<Lrpuntuaciondefinitiva> lrpuntuaciondefinitivaList) {
        this.lrpuntuaciondefinitivaList = lrpuntuaciondefinitivaList;
    }

    public List<Lrseccformulario> getLrseccformularioList() {
        return lrseccformularioList;
    }

    public void setLrseccformularioList(List<Lrseccformulario> lrseccformularioList) {
        this.lrseccformularioList = lrseccformularioList;
    }

    public List<Lrclasificainspeccion> getLrclasificainspeccionList() {
        return lrclasificainspeccionList;
    }

    public void setLrclasificainspeccionList(List<Lrclasificainspeccion> lrclasificainspeccionList) {
        this.lrclasificainspeccionList = lrclasificainspeccionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lragrupaformularioid != null ? lragrupaformularioid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lragrupaformulario)) {
            return false;
        }
        Lragrupaformulario other = (Lragrupaformulario) object;
        if ((this.lragrupaformularioid == null && other.lragrupaformularioid != null) || (this.lragrupaformularioid != null && !this.lragrupaformularioid.equals(other.lragrupaformularioid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lragrupaformulario[ lragrupaformularioid=" + lragrupaformularioid + " ]";
    }
    
}
