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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRFLUJOCOTIZACION")
@NamedQueries({
    @NamedQuery(name = "Lrflujocotizacion.findAll", query = "SELECT l FROM Lrflujocotizacion l"),
    @NamedQuery(name = "Lrflujocotizacion.findByLrflujocotizacionid", query = "SELECT l FROM Lrflujocotizacion l WHERE l.lrflujocotizacionid = :lrflujocotizacionid"),
    @NamedQuery(name = "Lrflujocotizacion.findByLrflujocotizacionual", query = "SELECT l FROM Lrflujocotizacion l WHERE l.lrflujocotizacionual = :lrflujocotizacionual"),
    @NamedQuery(name = "Lrflujocotizacion.findByLrflujocotizacionfal", query = "SELECT l FROM Lrflujocotizacion l WHERE l.lrflujocotizacionfal = :lrflujocotizacionfal"),
    @NamedQuery(name = "Lrflujocotizacion.findByLrflujocotizacionuac", query = "SELECT l FROM Lrflujocotizacion l WHERE l.lrflujocotizacionuac = :lrflujocotizacionuac")})
public class Lrflujocotizacion implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrflujocotizacionid")
    private List<Lrflujocotizaciondet> lrflujocotizaciondetList;
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "LRFLUJOCOTIZACION_SEQ_GENERATOR", sequenceName = "LRFLUJOCOTIZACIONID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LRFLUJOCOTIZACION_SEQ_GENERATOR")
    @Basic(optional = false)
    @Column(name = "LRFLUJOCOTIZACIONID", nullable = false)
    private Long lrflujocotizacionid;
    @Basic(optional = false)
    @Column(name = "LRFLUJOCOTIZACIONUAL", nullable = false, length = 30)
    private String lrflujocotizacionual;
    @Basic(optional = false)
    @Column(name = "LRFLUJOCOTIZACIONFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrflujocotizacionfal;
    @Basic(optional = false)
    @Column(name = "LRFLUJOCOTIZACIONUAC", nullable = false, length = 30)
    private String lrflujocotizacionuac;
    @JoinColumns({
        @JoinColumn(name = "LRAREAID", referencedColumnName = "LRAREAID", nullable = false),
        @JoinColumn(name = "LRSUBAREAID", referencedColumnName = "LRSUBAREAID", nullable = false)})
    @ManyToOne(optional = false)
    private Lrareasubarea lrareasubarea;
    @JoinColumns({
        @JoinColumn(name = "LRCOTIZACIONNRO", referencedColumnName = "LRCOTIZACIONNRO", nullable = false),
        @JoinColumn(name = "LRCOTIZACIONVERSION", referencedColumnName = "LRCOTIZACIONVERSION", nullable = false)})
    @ManyToOne(optional = false)
    private Lrcotizacion lrcotizacion;

    public Lrflujocotizacion() {
    }

    public Lrflujocotizacion(Long lrflujocotizacionid) {
        this.lrflujocotizacionid = lrflujocotizacionid;
    }

    public Lrflujocotizacion(Long lrflujocotizacionid, String lrflujocotizacionual, Date lrflujocotizacionfal, String lrflujocotizacionuac) {
        this.lrflujocotizacionid = lrflujocotizacionid;
        this.lrflujocotizacionual = lrflujocotizacionual;
        this.lrflujocotizacionfal = lrflujocotizacionfal;
        this.lrflujocotizacionuac = lrflujocotizacionuac;
    }

    public Long getLrflujocotizacionid() {
        return lrflujocotizacionid;
    }

    public void setLrflujocotizacionid(Long lrflujocotizacionid) {
        this.lrflujocotizacionid = lrflujocotizacionid;
    }

    public String getLrflujocotizacionual() {
        return lrflujocotizacionual;
    }

    public void setLrflujocotizacionual(String lrflujocotizacionual) {
        this.lrflujocotizacionual = lrflujocotizacionual;
    }

    public Date getLrflujocotizacionfal() {
        return lrflujocotizacionfal;
    }

    public void setLrflujocotizacionfal(Date lrflujocotizacionfal) {
        this.lrflujocotizacionfal = lrflujocotizacionfal;
    }

    public String getLrflujocotizacionuac() {
        return lrflujocotizacionuac;
    }

    public void setLrflujocotizacionuac(String lrflujocotizacionuac) {
        this.lrflujocotizacionuac = lrflujocotizacionuac;
    }

    public Lrareasubarea getLrareasubarea() {
        return lrareasubarea;
    }

    public void setLrareasubarea(Lrareasubarea lrareasubarea) {
        this.lrareasubarea = lrareasubarea;
    }

    public Lrcotizacion getLrcotizacion() {
        return lrcotizacion;
    }

    public void setLrcotizacion(Lrcotizacion lrcotizacion) {
        this.lrcotizacion = lrcotizacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrflujocotizacionid != null ? lrflujocotizacionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrflujocotizacion)) {
            return false;
        }
        Lrflujocotizacion other = (Lrflujocotizacion) object;
        if ((this.lrflujocotizacionid == null && other.lrflujocotizacionid != null) || (this.lrflujocotizacionid != null && !this.lrflujocotizacionid.equals(other.lrflujocotizacionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrflujocotizacion[ lrflujocotizacionid=" + lrflujocotizacionid + " ]";
    }

    public List<Lrflujocotizaciondet> getLrflujocotizaciondetList() {
        return lrflujocotizaciondetList;
    }

    public void setLrflujocotizaciondetList(List<Lrflujocotizaciondet> lrflujocotizaciondetList) {
        this.lrflujocotizaciondetList = lrflujocotizaciondetList;
    }

}
