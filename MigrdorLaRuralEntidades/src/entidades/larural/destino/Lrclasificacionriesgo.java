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
@Table(name = "LRCLASIFICACIONRIESGO", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"LRCLASIFICACIONRIESGOORDEN"})})
@NamedQueries({
    @NamedQuery(name = "Lrclasificacionriesgo.findAll", query = "SELECT l FROM Lrclasificacionriesgo l"),
    @NamedQuery(name = "Lrclasificacionriesgo.findByLrclasificacionriesgoid", query = "SELECT l FROM Lrclasificacionriesgo l WHERE l.lrclasificacionriesgoid = :lrclasificacionriesgoid"),
    @NamedQuery(name = "Lrclasificacionriesgo.findByLrclasificacionriesgodesc", query = "SELECT l FROM Lrclasificacionriesgo l WHERE l.lrclasificacionriesgodesc = :lrclasificacionriesgodesc"),
    @NamedQuery(name = "Lrclasificacionriesgo.findByLrclasificacionriesgofal", query = "SELECT l FROM Lrclasificacionriesgo l WHERE l.lrclasificacionriesgofal = :lrclasificacionriesgofal"),
    @NamedQuery(name = "Lrclasificacionriesgo.findByLrclasificacionriesgoual", query = "SELECT l FROM Lrclasificacionriesgo l WHERE l.lrclasificacionriesgoual = :lrclasificacionriesgoual"),
    @NamedQuery(name = "Lrclasificacionriesgo.findByLrclasificacionriesgofmd", query = "SELECT l FROM Lrclasificacionriesgo l WHERE l.lrclasificacionriesgofmd = :lrclasificacionriesgofmd"),
    @NamedQuery(name = "Lrclasificacionriesgo.findByLrclasificacionriesgoumd", query = "SELECT l FROM Lrclasificacionriesgo l WHERE l.lrclasificacionriesgoumd = :lrclasificacionriesgoumd"),
    @NamedQuery(name = "Lrclasificacionriesgo.findByLrclasificacionriesgoact", query = "SELECT l FROM Lrclasificacionriesgo l WHERE l.lrclasificacionriesgoact = :lrclasificacionriesgoact"),
    @NamedQuery(name = "Lrclasificacionriesgo.findByLrclasificacionriesgoorden", query = "SELECT l FROM Lrclasificacionriesgo l WHERE l.lrclasificacionriesgoorden = :lrclasificacionriesgoorden")})
public class Lrclasificacionriesgo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCLASIFICACIONRIESGOID", nullable = false)
    private Long lrclasificacionriesgoid;
    @Basic(optional = false)
    @Column(name = "LRCLASIFICACIONRIESGODESC", nullable = false, length = 100)
    private String lrclasificacionriesgodesc;
    @Basic(optional = false)
    @Column(name = "LRCLASIFICACIONRIESGOFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrclasificacionriesgofal;
    @Basic(optional = false)
    @Column(name = "LRCLASIFICACIONRIESGOUAL", nullable = false, length = 30)
    private String lrclasificacionriesgoual;
    @Basic(optional = false)
    @Column(name = "LRCLASIFICACIONRIESGOFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrclasificacionriesgofmd;
    @Basic(optional = false)
    @Column(name = "LRCLASIFICACIONRIESGOUMD", nullable = false, length = 30)
    private String lrclasificacionriesgoumd;
    @Basic(optional = false)
    @Column(name = "LRCLASIFICACIONRIESGOACT", nullable = false)
    private Character lrclasificacionriesgoact;
    @Basic(optional = false)
    @Column(name = "LRCLASIFICACIONRIESGOORDEN", nullable = false)
    private short lrclasificacionriesgoorden;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrclasificacionriesgo")
    private List<Lrclasificacionrubro> lrclasificacionrubroList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrclasificacionriesgo")
    private List<Lrcoberturaclasif> lrcoberturaclasifList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrclasificacionriesgo")
    private List<Lrmatrizpuntaje> lrmatrizpuntajeList;

    public Lrclasificacionriesgo() {
    }

    public Lrclasificacionriesgo(Long lrclasificacionriesgoid) {
        this.lrclasificacionriesgoid = lrclasificacionriesgoid;
    }

    public Lrclasificacionriesgo(Long lrclasificacionriesgoid, String lrclasificacionriesgodesc, Date lrclasificacionriesgofal, String lrclasificacionriesgoual, Date lrclasificacionriesgofmd, String lrclasificacionriesgoumd, Character lrclasificacionriesgoact, short lrclasificacionriesgoorden) {
        this.lrclasificacionriesgoid = lrclasificacionriesgoid;
        this.lrclasificacionriesgodesc = lrclasificacionriesgodesc;
        this.lrclasificacionriesgofal = lrclasificacionriesgofal;
        this.lrclasificacionriesgoual = lrclasificacionriesgoual;
        this.lrclasificacionriesgofmd = lrclasificacionriesgofmd;
        this.lrclasificacionriesgoumd = lrclasificacionriesgoumd;
        this.lrclasificacionriesgoact = lrclasificacionriesgoact;
        this.lrclasificacionriesgoorden = lrclasificacionriesgoorden;
    }

    public Long getLrclasificacionriesgoid() {
        return lrclasificacionriesgoid;
    }

    public void setLrclasificacionriesgoid(Long lrclasificacionriesgoid) {
        this.lrclasificacionriesgoid = lrclasificacionriesgoid;
    }

    public String getLrclasificacionriesgodesc() {
        return lrclasificacionriesgodesc;
    }

    public void setLrclasificacionriesgodesc(String lrclasificacionriesgodesc) {
        this.lrclasificacionriesgodesc = lrclasificacionriesgodesc;
    }

    public Date getLrclasificacionriesgofal() {
        return lrclasificacionriesgofal;
    }

    public void setLrclasificacionriesgofal(Date lrclasificacionriesgofal) {
        this.lrclasificacionriesgofal = lrclasificacionriesgofal;
    }

    public String getLrclasificacionriesgoual() {
        return lrclasificacionriesgoual;
    }

    public void setLrclasificacionriesgoual(String lrclasificacionriesgoual) {
        this.lrclasificacionriesgoual = lrclasificacionriesgoual;
    }

    public Date getLrclasificacionriesgofmd() {
        return lrclasificacionriesgofmd;
    }

    public void setLrclasificacionriesgofmd(Date lrclasificacionriesgofmd) {
        this.lrclasificacionriesgofmd = lrclasificacionriesgofmd;
    }

    public String getLrclasificacionriesgoumd() {
        return lrclasificacionriesgoumd;
    }

    public void setLrclasificacionriesgoumd(String lrclasificacionriesgoumd) {
        this.lrclasificacionriesgoumd = lrclasificacionriesgoumd;
    }

    public Character getLrclasificacionriesgoact() {
        return lrclasificacionriesgoact;
    }

    public void setLrclasificacionriesgoact(Character lrclasificacionriesgoact) {
        this.lrclasificacionriesgoact = lrclasificacionriesgoact;
    }

    public short getLrclasificacionriesgoorden() {
        return lrclasificacionriesgoorden;
    }

    public void setLrclasificacionriesgoorden(short lrclasificacionriesgoorden) {
        this.lrclasificacionriesgoorden = lrclasificacionriesgoorden;
    }

    public List<Lrclasificacionrubro> getLrclasificacionrubroList() {
        return lrclasificacionrubroList;
    }

    public void setLrclasificacionrubroList(List<Lrclasificacionrubro> lrclasificacionrubroList) {
        this.lrclasificacionrubroList = lrclasificacionrubroList;
    }

    public List<Lrcoberturaclasif> getLrcoberturaclasifList() {
        return lrcoberturaclasifList;
    }

    public void setLrcoberturaclasifList(List<Lrcoberturaclasif> lrcoberturaclasifList) {
        this.lrcoberturaclasifList = lrcoberturaclasifList;
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
        hash += (lrclasificacionriesgoid != null ? lrclasificacionriesgoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrclasificacionriesgo)) {
            return false;
        }
        Lrclasificacionriesgo other = (Lrclasificacionriesgo) object;
        if ((this.lrclasificacionriesgoid == null && other.lrclasificacionriesgoid != null) || (this.lrclasificacionriesgoid != null && !this.lrclasificacionriesgoid.equals(other.lrclasificacionriesgoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrclasificacionriesgo[ lrclasificacionriesgoid=" + lrclasificacionriesgoid + " ]";
    }
    
}
