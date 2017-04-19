/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRCOTIBIENTEXTO")
@NamedQueries({
    @NamedQuery(name = "Lrcotibientexto.findAll", query = "SELECT l FROM Lrcotibientexto l"),
    @NamedQuery(name = "Lrcotibientexto.findByLrcotibientextoid", query = "SELECT l FROM Lrcotibientexto l WHERE l.lrcotibientextoid = :lrcotibientextoid"),
    @NamedQuery(name = "Lrcotibientexto.findByLrcotibientextonombre", query = "SELECT l FROM Lrcotibientexto l WHERE l.lrcotibientextonombre = :lrcotibientextonombre"),
    @NamedQuery(name = "Lrcotibientexto.findByLrcotibientextotxt", query = "SELECT l FROM Lrcotibientexto l WHERE l.lrcotibientextotxt = :lrcotibientextotxt"),
    @NamedQuery(name = "Lrcotibientexto.findByLrcotibientextoual", query = "SELECT l FROM Lrcotibientexto l WHERE l.lrcotibientextoual = :lrcotibientextoual"),
    @NamedQuery(name = "Lrcotibientexto.findByLrcotibientextofal", query = "SELECT l FROM Lrcotibientexto l WHERE l.lrcotibientextofal = :lrcotibientextofal"),
    @NamedQuery(name = "Lrcotibientexto.findByLrcotibientextoumd", query = "SELECT l FROM Lrcotibientexto l WHERE l.lrcotibientextoumd = :lrcotibientextoumd"),
    @NamedQuery(name = "Lrcotibientexto.findByLrcotibientextofmd", query = "SELECT l FROM Lrcotibientexto l WHERE l.lrcotibientextofmd = :lrcotibientextofmd"),
    @NamedQuery(name = "Lrcotibientexto.findByLrcotibientextoespecial", query = "SELECT l FROM Lrcotibientexto l WHERE l.lrcotibientextoespecial = :lrcotibientextoespecial")})
public class Lrcotibientexto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "LRCOTIBIENTEXTO_SEQ_GENERATOR", sequenceName = "LRCOTIBIENTEXTOID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LRCOTIBIENTEXTO_SEQ_GENERATOR")
    @Basic(optional = false)
    @Column(name = "LRCOTIBIENTEXTOID", nullable = false)
    private Long lrcotibientextoid;
    @Basic(optional = false)
    @Column(name = "LRCOTIBIENTEXTONOMBRE", nullable = false, length = 60)
    private String lrcotibientextonombre;
    @Basic(optional = false)
    @Column(name = "LRCOTIBIENTEXTOTXT", nullable = false, length = 4000)
    private String lrcotibientextotxt;
    @Column(name = "LRCOTIBIENTEXTOUAL", length = 30)
    private String lrcotibientextoual;
    @Column(name = "LRCOTIBIENTEXTOFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotibientextofal;
    @Column(name = "LRCOTIBIENTEXTOUMD", length = 30)
    private String lrcotibientextoumd;
    @Column(name = "LRCOTIBIENTEXTOFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotibientextofmd;
    @Basic(optional = false)
    @Column(name = "LRCOTIBIENTEXTOESPECIAL", nullable = false)
    private Character lrcotibientextoespecial;
    @JoinColumns({
        @JoinColumn(name = "LRCOTIDATBIENASEID", referencedColumnName = "LRCOTIDATBIENASEID", nullable = false),
        @JoinColumn(name = "LRUBICACIONID", referencedColumnName = "LRUBICACIONID", nullable = false)})
    @ManyToOne(optional = false)
    private Lrcotidatbienase lrcotidatbienase;

    public Lrcotibientexto() {
    }

    public Lrcotibientexto(Long lrcotibientextoid) {
        this.lrcotibientextoid = lrcotibientextoid;
    }

    public Lrcotibientexto(Long lrcotibientextoid, String lrcotibientextonombre, String lrcotibientextotxt, Character lrcotibientextoespecial) {
        this.lrcotibientextoid = lrcotibientextoid;
        this.lrcotibientextonombre = lrcotibientextonombre;
        this.lrcotibientextotxt = lrcotibientextotxt;
        this.lrcotibientextoespecial = lrcotibientextoespecial;
    }

    public Long getLrcotibientextoid() {
        return lrcotibientextoid;
    }

    public void setLrcotibientextoid(Long lrcotibientextoid) {
        this.lrcotibientextoid = lrcotibientextoid;
    }

    public String getLrcotibientextonombre() {
        return lrcotibientextonombre;
    }

    public void setLrcotibientextonombre(String lrcotibientextonombre) {
        this.lrcotibientextonombre = lrcotibientextonombre;
    }

    public String getLrcotibientextotxt() {
        return lrcotibientextotxt;
    }

    public void setLrcotibientextotxt(String lrcotibientextotxt) {
        this.lrcotibientextotxt = lrcotibientextotxt;
    }

    public String getLrcotibientextoual() {
        return lrcotibientextoual;
    }

    public void setLrcotibientextoual(String lrcotibientextoual) {
        this.lrcotibientextoual = lrcotibientextoual;
    }

    public Date getLrcotibientextofal() {
        return lrcotibientextofal;
    }

    public void setLrcotibientextofal(Date lrcotibientextofal) {
        this.lrcotibientextofal = lrcotibientextofal;
    }

    public String getLrcotibientextoumd() {
        return lrcotibientextoumd;
    }

    public void setLrcotibientextoumd(String lrcotibientextoumd) {
        this.lrcotibientextoumd = lrcotibientextoumd;
    }

    public Date getLrcotibientextofmd() {
        return lrcotibientextofmd;
    }

    public void setLrcotibientextofmd(Date lrcotibientextofmd) {
        this.lrcotibientextofmd = lrcotibientextofmd;
    }

    public Character getLrcotibientextoespecial() {
        return lrcotibientextoespecial;
    }

    public void setLrcotibientextoespecial(Character lrcotibientextoespecial) {
        this.lrcotibientextoespecial = lrcotibientextoespecial;
    }

    public Lrcotidatbienase getLrcotidatbienase() {
        return lrcotidatbienase;
    }

    public void setLrcotidatbienase(Lrcotidatbienase lrcotidatbienase) {
        this.lrcotidatbienase = lrcotidatbienase;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcotibientextoid != null ? lrcotibientextoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcotibientexto)) {
            return false;
        }
        Lrcotibientexto other = (Lrcotibientexto) object;
        if ((this.lrcotibientextoid == null && other.lrcotibientextoid != null) || (this.lrcotibientextoid != null && !this.lrcotibientextoid.equals(other.lrcotibientextoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcotibientexto[ lrcotibientextoid=" + lrcotibientextoid + " ]";
    }

}
