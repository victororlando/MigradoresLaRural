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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "LRTASARUBRORIESGO")
@NamedQueries({
    @NamedQuery(name = "Lrtasarubroriesgo.findAll", query = "SELECT l FROM Lrtasarubroriesgo l"),
    @NamedQuery(name = "Lrtasarubroriesgo.findByLrclasificacionriesgoid", query = "SELECT l FROM Lrtasarubroriesgo l WHERE l.lrtasarubroriesgoPK.lrclasificacionriesgoid = :lrclasificacionriesgoid"),
    @NamedQuery(name = "Lrtasarubroriesgo.findByRubrosid", query = "SELECT l FROM Lrtasarubroriesgo l WHERE l.lrtasarubroriesgoPK.rubrosid = :rubrosid"),
    @NamedQuery(name = "Lrtasarubroriesgo.findByLrseccdetalleid", query = "SELECT l FROM Lrtasarubroriesgo l WHERE l.lrtasarubroriesgoPK.lrseccdetalleid = :lrseccdetalleid"),
    @NamedQuery(name = "Lrtasarubroriesgo.findByLrtasarubroriesgoexc", query = "SELECT l FROM Lrtasarubroriesgo l WHERE l.lrtasarubroriesgoexc = :lrtasarubroriesgoexc"),
    @NamedQuery(name = "Lrtasarubroriesgo.findByLrtasarubroriesgoacepesp", query = "SELECT l FROM Lrtasarubroriesgo l WHERE l.lrtasarubroriesgoacepesp = :lrtasarubroriesgoacepesp"),
    @NamedQuery(name = "Lrtasarubroriesgo.findByLrtasarubroriesgoac", query = "SELECT l FROM Lrtasarubroriesgo l WHERE l.lrtasarubroriesgoac = :lrtasarubroriesgoac"),
    @NamedQuery(name = "Lrtasarubroriesgo.findByLrtasarubroriesgoual", query = "SELECT l FROM Lrtasarubroriesgo l WHERE l.lrtasarubroriesgoual = :lrtasarubroriesgoual"),
    @NamedQuery(name = "Lrtasarubroriesgo.findByLrtasarubroriesgofal", query = "SELECT l FROM Lrtasarubroriesgo l WHERE l.lrtasarubroriesgofal = :lrtasarubroriesgofal"),
    @NamedQuery(name = "Lrtasarubroriesgo.findByLrtasarubroriesgoumd", query = "SELECT l FROM Lrtasarubroriesgo l WHERE l.lrtasarubroriesgoumd = :lrtasarubroriesgoumd"),
    @NamedQuery(name = "Lrtasarubroriesgo.findByLrtasarubroriesgofmd", query = "SELECT l FROM Lrtasarubroriesgo l WHERE l.lrtasarubroriesgofmd = :lrtasarubroriesgofmd")})
public class Lrtasarubroriesgo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrtasarubroriesgoPK lrtasarubroriesgoPK;
    @Basic(optional = false)
    @Column(name = "LRTASARUBRORIESGOEXC", nullable = false)
    private Character lrtasarubroriesgoexc;
    @Basic(optional = false)
    @Column(name = "LRTASARUBRORIESGOACEPESP", nullable = false)
    private Character lrtasarubroriesgoacepesp;
    @Basic(optional = false)
    @Column(name = "LRTASARUBRORIESGOAC", nullable = false)
    private Character lrtasarubroriesgoac;
    @Basic(optional = false)
    @Column(name = "LRTASARUBRORIESGOUAL", nullable = false, length = 30)
    private String lrtasarubroriesgoual;
    @Basic(optional = false)
    @Column(name = "LRTASARUBRORIESGOFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtasarubroriesgofal;
    @Column(name = "LRTASARUBRORIESGOUMD", length = 30)
    private String lrtasarubroriesgoumd;
    @Column(name = "LRTASARUBRORIESGOFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtasarubroriesgofmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrtasarubroriesgo")
    private List<Lrtasariesgocat> lrtasariesgocatList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrtasarubroriesgo")
    private List<Lrcontrolreaseguro> lrcontrolreaseguroList;
    @JoinColumns({
        @JoinColumn(name = "RUBROSID", referencedColumnName = "RUBROSID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "LRCLASIFICACIONRIESGOID", referencedColumnName = "LRCLASIFICACIONRIESGOID", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Lrclasificacionrubro lrclasificacionrubro;
    @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrseccdetalle lrseccdetalle;
    @JoinColumn(name = "LRTIPOCOTIZACIONID", referencedColumnName = "LRTIPOCOTIZACIONID", nullable = false)
    @ManyToOne(optional = false)
    private Lrtipocotizacion lrtipocotizacionid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrtasarubroriesgo")
    private List<Lrclasificainspeccion> lrclasificainspeccionList;

    public Lrtasarubroriesgo() {
    }

    public Lrtasarubroriesgo(LrtasarubroriesgoPK lrtasarubroriesgoPK) {
        this.lrtasarubroriesgoPK = lrtasarubroriesgoPK;
    }

    public Lrtasarubroriesgo(LrtasarubroriesgoPK lrtasarubroriesgoPK, Character lrtasarubroriesgoexc, Character lrtasarubroriesgoacepesp, Character lrtasarubroriesgoac, String lrtasarubroriesgoual, Date lrtasarubroriesgofal) {
        this.lrtasarubroriesgoPK = lrtasarubroriesgoPK;
        this.lrtasarubroriesgoexc = lrtasarubroriesgoexc;
        this.lrtasarubroriesgoacepesp = lrtasarubroriesgoacepesp;
        this.lrtasarubroriesgoac = lrtasarubroriesgoac;
        this.lrtasarubroriesgoual = lrtasarubroriesgoual;
        this.lrtasarubroriesgofal = lrtasarubroriesgofal;
    }

    public Lrtasarubroriesgo(long lrclasificacionriesgoid, long rubrosid, long lrseccdetalleid) {
        this.lrtasarubroriesgoPK = new LrtasarubroriesgoPK(lrclasificacionriesgoid, rubrosid, lrseccdetalleid);
    }

    public LrtasarubroriesgoPK getLrtasarubroriesgoPK() {
        return lrtasarubroriesgoPK;
    }

    public void setLrtasarubroriesgoPK(LrtasarubroriesgoPK lrtasarubroriesgoPK) {
        this.lrtasarubroriesgoPK = lrtasarubroriesgoPK;
    }

    public Character getLrtasarubroriesgoexc() {
        return lrtasarubroriesgoexc;
    }

    public void setLrtasarubroriesgoexc(Character lrtasarubroriesgoexc) {
        this.lrtasarubroriesgoexc = lrtasarubroriesgoexc;
    }

    public Character getLrtasarubroriesgoacepesp() {
        return lrtasarubroriesgoacepesp;
    }

    public void setLrtasarubroriesgoacepesp(Character lrtasarubroriesgoacepesp) {
        this.lrtasarubroriesgoacepesp = lrtasarubroriesgoacepesp;
    }

    public Character getLrtasarubroriesgoac() {
        return lrtasarubroriesgoac;
    }

    public void setLrtasarubroriesgoac(Character lrtasarubroriesgoac) {
        this.lrtasarubroriesgoac = lrtasarubroriesgoac;
    }

    public String getLrtasarubroriesgoual() {
        return lrtasarubroriesgoual;
    }

    public void setLrtasarubroriesgoual(String lrtasarubroriesgoual) {
        this.lrtasarubroriesgoual = lrtasarubroriesgoual;
    }

    public Date getLrtasarubroriesgofal() {
        return lrtasarubroriesgofal;
    }

    public void setLrtasarubroriesgofal(Date lrtasarubroriesgofal) {
        this.lrtasarubroriesgofal = lrtasarubroriesgofal;
    }

    public String getLrtasarubroriesgoumd() {
        return lrtasarubroriesgoumd;
    }

    public void setLrtasarubroriesgoumd(String lrtasarubroriesgoumd) {
        this.lrtasarubroriesgoumd = lrtasarubroriesgoumd;
    }

    public Date getLrtasarubroriesgofmd() {
        return lrtasarubroriesgofmd;
    }

    public void setLrtasarubroriesgofmd(Date lrtasarubroriesgofmd) {
        this.lrtasarubroriesgofmd = lrtasarubroriesgofmd;
    }

    public List<Lrtasariesgocat> getLrtasariesgocatList() {
        return lrtasariesgocatList;
    }

    public void setLrtasariesgocatList(List<Lrtasariesgocat> lrtasariesgocatList) {
        this.lrtasariesgocatList = lrtasariesgocatList;
    }

    public List<Lrcontrolreaseguro> getLrcontrolreaseguroList() {
        return lrcontrolreaseguroList;
    }

    public void setLrcontrolreaseguroList(List<Lrcontrolreaseguro> lrcontrolreaseguroList) {
        this.lrcontrolreaseguroList = lrcontrolreaseguroList;
    }

    public Lrclasificacionrubro getLrclasificacionrubro() {
        return lrclasificacionrubro;
    }

    public void setLrclasificacionrubro(Lrclasificacionrubro lrclasificacionrubro) {
        this.lrclasificacionrubro = lrclasificacionrubro;
    }

    public Lrseccdetalle getLrseccdetalle() {
        return lrseccdetalle;
    }

    public void setLrseccdetalle(Lrseccdetalle lrseccdetalle) {
        this.lrseccdetalle = lrseccdetalle;
    }

    public Lrtipocotizacion getLrtipocotizacionid() {
        return lrtipocotizacionid;
    }

    public void setLrtipocotizacionid(Lrtipocotizacion lrtipocotizacionid) {
        this.lrtipocotizacionid = lrtipocotizacionid;
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
        hash += (lrtasarubroriesgoPK != null ? lrtasarubroriesgoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtasarubroriesgo)) {
            return false;
        }
        Lrtasarubroriesgo other = (Lrtasarubroriesgo) object;
        if ((this.lrtasarubroriesgoPK == null && other.lrtasarubroriesgoPK != null) || (this.lrtasarubroriesgoPK != null && !this.lrtasarubroriesgoPK.equals(other.lrtasarubroriesgoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtasarubroriesgo[ lrtasarubroriesgoPK=" + lrtasarubroriesgoPK + " ]";
    }
    
}
