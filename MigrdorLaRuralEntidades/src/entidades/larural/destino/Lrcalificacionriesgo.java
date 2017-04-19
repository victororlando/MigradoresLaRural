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
@Table(name = "LRCALIFICACIONRIESGO")
@NamedQueries({
    @NamedQuery(name = "Lrcalificacionriesgo.findAll", query = "SELECT l FROM Lrcalificacionriesgo l"),
    @NamedQuery(name = "Lrcalificacionriesgo.findByLrcalificacionriesgoid", query = "SELECT l FROM Lrcalificacionriesgo l WHERE l.lrcalificacionriesgoid = :lrcalificacionriesgoid"),
    @NamedQuery(name = "Lrcalificacionriesgo.findByLrcalificacionriesgodesc", query = "SELECT l FROM Lrcalificacionriesgo l WHERE l.lrcalificacionriesgodesc = :lrcalificacionriesgodesc"),
    @NamedQuery(name = "Lrcalificacionriesgo.findByLrcalificacionriesgofal", query = "SELECT l FROM Lrcalificacionriesgo l WHERE l.lrcalificacionriesgofal = :lrcalificacionriesgofal"),
    @NamedQuery(name = "Lrcalificacionriesgo.findByLrcalificacionriesgoual", query = "SELECT l FROM Lrcalificacionriesgo l WHERE l.lrcalificacionriesgoual = :lrcalificacionriesgoual"),
    @NamedQuery(name = "Lrcalificacionriesgo.findByLrcalificacionriesgofmd", query = "SELECT l FROM Lrcalificacionriesgo l WHERE l.lrcalificacionriesgofmd = :lrcalificacionriesgofmd"),
    @NamedQuery(name = "Lrcalificacionriesgo.findByLrcalificacionriesgoumd", query = "SELECT l FROM Lrcalificacionriesgo l WHERE l.lrcalificacionriesgoumd = :lrcalificacionriesgoumd"),
    @NamedQuery(name = "Lrcalificacionriesgo.findByLrcalificacionriesgoact", query = "SELECT l FROM Lrcalificacionriesgo l WHERE l.lrcalificacionriesgoact = :lrcalificacionriesgoact"),
    @NamedQuery(name = "Lrcalificacionriesgo.findByLrcalificacionriesgoorden", query = "SELECT l FROM Lrcalificacionriesgo l WHERE l.lrcalificacionriesgoorden = :lrcalificacionriesgoorden")})
public class Lrcalificacionriesgo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCALIFICACIONRIESGOID", nullable = false)
    private Long lrcalificacionriesgoid;
    @Basic(optional = false)
    @Column(name = "LRCALIFICACIONRIESGODESC", nullable = false, length = 100)
    private String lrcalificacionriesgodesc;
    @Basic(optional = false)
    @Column(name = "LRCALIFICACIONRIESGOFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcalificacionriesgofal;
    @Basic(optional = false)
    @Column(name = "LRCALIFICACIONRIESGOUAL", nullable = false, length = 30)
    private String lrcalificacionriesgoual;
    @Basic(optional = false)
    @Column(name = "LRCALIFICACIONRIESGOFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcalificacionriesgofmd;
    @Basic(optional = false)
    @Column(name = "LRCALIFICACIONRIESGOUMD", nullable = false, length = 30)
    private String lrcalificacionriesgoumd;
    @Basic(optional = false)
    @Column(name = "LRCALIFICACIONRIESGOACT", nullable = false)
    private Character lrcalificacionriesgoact;
    @Basic(optional = false)
    @Column(name = "LRCALIFICACIONRIESGOORDEN", nullable = false)
    private short lrcalificacionriesgoorden;
    @OneToMany(mappedBy = "lrcalificacionriesgoid")
    private List<Lrcotinspeccion> lrcotinspeccionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcalificacionriesgo")
    private List<Lrpuntuaciondefinitiva> lrpuntuaciondefinitivaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcalificacionriesgo")
    private List<Lrmatrizpuntaje> lrmatrizpuntajeList;

    public Lrcalificacionriesgo() {
    }

    public Lrcalificacionriesgo(Long lrcalificacionriesgoid) {
        this.lrcalificacionriesgoid = lrcalificacionriesgoid;
    }

    public Lrcalificacionriesgo(Long lrcalificacionriesgoid, String lrcalificacionriesgodesc, Date lrcalificacionriesgofal, String lrcalificacionriesgoual, Date lrcalificacionriesgofmd, String lrcalificacionriesgoumd, Character lrcalificacionriesgoact, short lrcalificacionriesgoorden) {
        this.lrcalificacionriesgoid = lrcalificacionriesgoid;
        this.lrcalificacionriesgodesc = lrcalificacionriesgodesc;
        this.lrcalificacionriesgofal = lrcalificacionriesgofal;
        this.lrcalificacionriesgoual = lrcalificacionriesgoual;
        this.lrcalificacionriesgofmd = lrcalificacionriesgofmd;
        this.lrcalificacionriesgoumd = lrcalificacionriesgoumd;
        this.lrcalificacionriesgoact = lrcalificacionriesgoact;
        this.lrcalificacionriesgoorden = lrcalificacionriesgoorden;
    }

    public Long getLrcalificacionriesgoid() {
        return lrcalificacionriesgoid;
    }

    public void setLrcalificacionriesgoid(Long lrcalificacionriesgoid) {
        this.lrcalificacionriesgoid = lrcalificacionriesgoid;
    }

    public String getLrcalificacionriesgodesc() {
        return lrcalificacionriesgodesc;
    }

    public void setLrcalificacionriesgodesc(String lrcalificacionriesgodesc) {
        this.lrcalificacionriesgodesc = lrcalificacionriesgodesc;
    }

    public Date getLrcalificacionriesgofal() {
        return lrcalificacionriesgofal;
    }

    public void setLrcalificacionriesgofal(Date lrcalificacionriesgofal) {
        this.lrcalificacionriesgofal = lrcalificacionriesgofal;
    }

    public String getLrcalificacionriesgoual() {
        return lrcalificacionriesgoual;
    }

    public void setLrcalificacionriesgoual(String lrcalificacionriesgoual) {
        this.lrcalificacionriesgoual = lrcalificacionriesgoual;
    }

    public Date getLrcalificacionriesgofmd() {
        return lrcalificacionriesgofmd;
    }

    public void setLrcalificacionriesgofmd(Date lrcalificacionriesgofmd) {
        this.lrcalificacionriesgofmd = lrcalificacionriesgofmd;
    }

    public String getLrcalificacionriesgoumd() {
        return lrcalificacionriesgoumd;
    }

    public void setLrcalificacionriesgoumd(String lrcalificacionriesgoumd) {
        this.lrcalificacionriesgoumd = lrcalificacionriesgoumd;
    }

    public Character getLrcalificacionriesgoact() {
        return lrcalificacionriesgoact;
    }

    public void setLrcalificacionriesgoact(Character lrcalificacionriesgoact) {
        this.lrcalificacionriesgoact = lrcalificacionriesgoact;
    }

    public short getLrcalificacionriesgoorden() {
        return lrcalificacionriesgoorden;
    }

    public void setLrcalificacionriesgoorden(short lrcalificacionriesgoorden) {
        this.lrcalificacionriesgoorden = lrcalificacionriesgoorden;
    }

    public List<Lrcotinspeccion> getLrcotinspeccionList() {
        return lrcotinspeccionList;
    }

    public void setLrcotinspeccionList(List<Lrcotinspeccion> lrcotinspeccionList) {
        this.lrcotinspeccionList = lrcotinspeccionList;
    }

    public List<Lrpuntuaciondefinitiva> getLrpuntuaciondefinitivaList() {
        return lrpuntuaciondefinitivaList;
    }

    public void setLrpuntuaciondefinitivaList(List<Lrpuntuaciondefinitiva> lrpuntuaciondefinitivaList) {
        this.lrpuntuaciondefinitivaList = lrpuntuaciondefinitivaList;
    }

    public List<Lrmatrizpuntaje> getLrmatrizpuntajeList() {
        return lrmatrizpuntajeList;
    }

    public void setLrmatrizpuntajeList(List<Lrmatrizpuntaje> lrmatrizpuntajeList) {
        this.lrmatrizpuntajeList = lrmatrizpuntajeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcalificacionriesgoid != null ? lrcalificacionriesgoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcalificacionriesgo)) {
            return false;
        }
        Lrcalificacionriesgo other = (Lrcalificacionriesgo) object;
        if ((this.lrcalificacionriesgoid == null && other.lrcalificacionriesgoid != null) || (this.lrcalificacionriesgoid != null && !this.lrcalificacionriesgoid.equals(other.lrcalificacionriesgoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcalificacionriesgo[ lrcalificacionriesgoid=" + lrcalificacionriesgoid + " ]";
    }
    
}
