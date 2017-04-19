/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRPERSONASAUTORIZADAS")
@NamedQueries({
    @NamedQuery(name = "Lrpersonasautorizadas.findAll", query = "SELECT l FROM Lrpersonasautorizadas l"),
    @NamedQuery(name = "Lrpersonasautorizadas.findByLrpersonasautorizadasid", query = "SELECT l FROM Lrpersonasautorizadas l WHERE l.lrpersonasautorizadasid = :lrpersonasautorizadasid"),
    @NamedQuery(name = "Lrpersonasautorizadas.findByLrpersonasautorizadassumaasegu", query = "SELECT l FROM Lrpersonasautorizadas l WHERE l.lrpersonasautorizadassumaasegu = :lrpersonasautorizadassumaasegu"),
    @NamedQuery(name = "Lrpersonasautorizadas.findByLrpersonasautorizadasportaarma", query = "SELECT l FROM Lrpersonasautorizadas l WHERE l.lrpersonasautorizadasportaarma = :lrpersonasautorizadasportaarma"),
    @NamedQuery(name = "Lrpersonasautorizadas.findByLrpersonasautorizadasmetrosapi", query = "SELECT l FROM Lrpersonasautorizadas l WHERE l.lrpersonasautorizadasmetrosapi = :lrpersonasautorizadasmetrosapi")})
public class Lrpersonasautorizadas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRPERSONASAUTORIZADASID", nullable = false)
    private Long lrpersonasautorizadasid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRPERSONASAUTORIZADASSUMAASEGU", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersonasautorizadassumaasegu;
    @Basic(optional = false)
    @Column(name = "LRPERSONASAUTORIZADASPORTAARMA", nullable = false)
    private Character lrpersonasautorizadasportaarma;
    @Basic(optional = false)
    @Column(name = "LRPERSONASAUTORIZADASMETROSAPI", nullable = false, precision = 9, scale = 2)
    private BigDecimal lrpersonasautorizadasmetrosapi;
    @JoinColumn(name = "LRCAJASFUERTESID", referencedColumnName = "LRCAJASFUERTESID")
    @ManyToOne
    private Lrcajasfuertes lrcajasfuertesid;
    @JoinColumn(name = "SLRCARGOID", referencedColumnName = "LRCARGOID")
    @ManyToOne
    private Lrcargo slrcargoid;
    @JoinColumns({
        @JoinColumn(name = "LRCOTIDATBIENASEID", referencedColumnName = "LRCOTIDATBIENASEID"),
        @JoinColumn(name = "LRUBICACIONID", referencedColumnName = "LRUBICACIONID")})
    @ManyToOne
    private Lrcotidatbienase lrcotidatbienase;
    @JoinColumn(name = "LRFORMATRANSLADOID", referencedColumnName = "LRFORMATRANSLADOID")
    @ManyToOne
    private Lrformatranslado lrformatransladoid;
    @JoinColumn(name = "SPERAUTOLRPERSONAID", referencedColumnName = "LRPERSONAID", nullable = false)
    @ManyToOne(optional = false)
    private Lrpersona sperautolrpersonaid;
    @JoinColumn(name = "LRUBICACIONID", referencedColumnName = "LRUBICACIONID", insertable = false, updatable = false)
    @ManyToOne
    private Lrubicacion lrubicacionid;

    public Lrpersonasautorizadas() {
    }

    public Lrpersonasautorizadas(Long lrpersonasautorizadasid) {
        this.lrpersonasautorizadasid = lrpersonasautorizadasid;
    }

    public Lrpersonasautorizadas(Long lrpersonasautorizadasid, BigDecimal lrpersonasautorizadassumaasegu, Character lrpersonasautorizadasportaarma, BigDecimal lrpersonasautorizadasmetrosapi) {
        this.lrpersonasautorizadasid = lrpersonasautorizadasid;
        this.lrpersonasautorizadassumaasegu = lrpersonasautorizadassumaasegu;
        this.lrpersonasautorizadasportaarma = lrpersonasautorizadasportaarma;
        this.lrpersonasautorizadasmetrosapi = lrpersonasautorizadasmetrosapi;
    }

    public Long getLrpersonasautorizadasid() {
        return lrpersonasautorizadasid;
    }

    public void setLrpersonasautorizadasid(Long lrpersonasautorizadasid) {
        this.lrpersonasautorizadasid = lrpersonasautorizadasid;
    }

    public BigDecimal getLrpersonasautorizadassumaasegu() {
        return lrpersonasautorizadassumaasegu;
    }

    public void setLrpersonasautorizadassumaasegu(BigDecimal lrpersonasautorizadassumaasegu) {
        this.lrpersonasautorizadassumaasegu = lrpersonasautorizadassumaasegu;
    }

    public Character getLrpersonasautorizadasportaarma() {
        return lrpersonasautorizadasportaarma;
    }

    public void setLrpersonasautorizadasportaarma(Character lrpersonasautorizadasportaarma) {
        this.lrpersonasautorizadasportaarma = lrpersonasautorizadasportaarma;
    }

    public BigDecimal getLrpersonasautorizadasmetrosapi() {
        return lrpersonasautorizadasmetrosapi;
    }

    public void setLrpersonasautorizadasmetrosapi(BigDecimal lrpersonasautorizadasmetrosapi) {
        this.lrpersonasautorizadasmetrosapi = lrpersonasautorizadasmetrosapi;
    }

    public Lrcajasfuertes getLrcajasfuertesid() {
        return lrcajasfuertesid;
    }

    public void setLrcajasfuertesid(Lrcajasfuertes lrcajasfuertesid) {
        this.lrcajasfuertesid = lrcajasfuertesid;
    }

    public Lrcargo getSlrcargoid() {
        return slrcargoid;
    }

    public void setSlrcargoid(Lrcargo slrcargoid) {
        this.slrcargoid = slrcargoid;
    }

    public Lrcotidatbienase getLrcotidatbienase() {
        return lrcotidatbienase;
    }

    public void setLrcotidatbienase(Lrcotidatbienase lrcotidatbienase) {
        this.lrcotidatbienase = lrcotidatbienase;
    }

    public Lrformatranslado getLrformatransladoid() {
        return lrformatransladoid;
    }

    public void setLrformatransladoid(Lrformatranslado lrformatransladoid) {
        this.lrformatransladoid = lrformatransladoid;
    }

    public Lrpersona getSperautolrpersonaid() {
        return sperautolrpersonaid;
    }

    public void setSperautolrpersonaid(Lrpersona sperautolrpersonaid) {
        this.sperautolrpersonaid = sperautolrpersonaid;
    }

    public Lrubicacion getLrubicacionid() {
        return lrubicacionid;
    }

    public void setLrubicacionid(Lrubicacion lrubicacionid) {
        this.lrubicacionid = lrubicacionid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrpersonasautorizadasid != null ? lrpersonasautorizadasid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrpersonasautorizadas)) {
            return false;
        }
        Lrpersonasautorizadas other = (Lrpersonasautorizadas) object;
        if ((this.lrpersonasautorizadasid == null && other.lrpersonasautorizadasid != null) || (this.lrpersonasautorizadasid != null && !this.lrpersonasautorizadasid.equals(other.lrpersonasautorizadasid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrpersonasautorizadas[ lrpersonasautorizadasid=" + lrpersonasautorizadasid + " ]";
    }
    
}
