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
@Table(name = "LRCOTIDATBIENDET")
@NamedQueries({
    @NamedQuery(name = "Lrcotidatbiendet.findAll", query = "SELECT l FROM Lrcotidatbiendet l"),
    @NamedQuery(name = "Lrcotidatbiendet.findByLrcotidatbiendetid", query = "SELECT l FROM Lrcotidatbiendet l WHERE l.lrcotidatbiendetid = :lrcotidatbiendetid"),
    @NamedQuery(name = "Lrcotidatbiendet.findByLrcotidatbiendetcant", query = "SELECT l FROM Lrcotidatbiendet l WHERE l.lrcotidatbiendetcant = :lrcotidatbiendetcant"),
    @NamedQuery(name = "Lrcotidatbiendet.findByLrcotidatbiendetsdet", query = "SELECT l FROM Lrcotidatbiendet l WHERE l.lrcotidatbiendetsdet = :lrcotidatbiendetsdet"),
    @NamedQuery(name = "Lrcotidatbiendet.findByLrcotidatbiendetprecio", query = "SELECT l FROM Lrcotidatbiendet l WHERE l.lrcotidatbiendetprecio = :lrcotidatbiendetprecio"),
    @NamedQuery(name = "Lrcotidatbiendet.findByLrcotidatbiendettotal", query = "SELECT l FROM Lrcotidatbiendet l WHERE l.lrcotidatbiendettotal = :lrcotidatbiendettotal"),
    @NamedQuery(name = "Lrcotidatbiendet.findByLrcotidatbiendetfotografia", query = "SELECT l FROM Lrcotidatbiendet l WHERE l.lrcotidatbiendetfotografia = :lrcotidatbiendetfotografia"),
    @NamedQuery(name = "Lrcotidatbiendet.findByLrcotidatbiendetinventario", query = "SELECT l FROM Lrcotidatbiendet l WHERE l.lrcotidatbiendetinventario = :lrcotidatbiendetinventario")})
public class Lrcotidatbiendet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCOTIDATBIENDETID", nullable = false)
    private Long lrcotidatbiendetid;
    @Column(name = "LRCOTIDATBIENDETCANT")
    private Integer lrcotidatbiendetcant;
    @Column(name = "LRCOTIDATBIENDETSDET", length = 100)
    private String lrcotidatbiendetsdet;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LRCOTIDATBIENDETPRECIO", precision = 17, scale = 2)
    private BigDecimal lrcotidatbiendetprecio;
    @Column(name = "LRCOTIDATBIENDETTOTAL", precision = 17, scale = 2)
    private BigDecimal lrcotidatbiendettotal;
    @Column(name = "LRCOTIDATBIENDETFOTOGRAFIA", length = 100)
    private String lrcotidatbiendetfotografia;
    @Column(name = "LRCOTIDATBIENDETINVENTARIO", length = 100)
    private String lrcotidatbiendetinventario;
    @JoinColumns({
        @JoinColumn(name = "LRCOTIDATBIENASEID", referencedColumnName = "LRCOTIDATBIENASEID", nullable = false),
        @JoinColumn(name = "LRUBICACIONID", referencedColumnName = "LRUBICACIONID", nullable = false)})
    @ManyToOne(optional = false)
    private Lrcotidatbienase lrcotidatbienase;

    public Lrcotidatbiendet() {
    }

    public Lrcotidatbiendet(Long lrcotidatbiendetid) {
        this.lrcotidatbiendetid = lrcotidatbiendetid;
    }

    public Long getLrcotidatbiendetid() {
        return lrcotidatbiendetid;
    }

    public void setLrcotidatbiendetid(Long lrcotidatbiendetid) {
        this.lrcotidatbiendetid = lrcotidatbiendetid;
    }

    public Integer getLrcotidatbiendetcant() {
        return lrcotidatbiendetcant;
    }

    public void setLrcotidatbiendetcant(Integer lrcotidatbiendetcant) {
        this.lrcotidatbiendetcant = lrcotidatbiendetcant;
    }

    public String getLrcotidatbiendetsdet() {
        return lrcotidatbiendetsdet;
    }

    public void setLrcotidatbiendetsdet(String lrcotidatbiendetsdet) {
        this.lrcotidatbiendetsdet = lrcotidatbiendetsdet;
    }

    public BigDecimal getLrcotidatbiendetprecio() {
        return lrcotidatbiendetprecio;
    }

    public void setLrcotidatbiendetprecio(BigDecimal lrcotidatbiendetprecio) {
        this.lrcotidatbiendetprecio = lrcotidatbiendetprecio;
    }

    public BigDecimal getLrcotidatbiendettotal() {
        return lrcotidatbiendettotal;
    }

    public void setLrcotidatbiendettotal(BigDecimal lrcotidatbiendettotal) {
        this.lrcotidatbiendettotal = lrcotidatbiendettotal;
    }

    public String getLrcotidatbiendetfotografia() {
        return lrcotidatbiendetfotografia;
    }

    public void setLrcotidatbiendetfotografia(String lrcotidatbiendetfotografia) {
        this.lrcotidatbiendetfotografia = lrcotidatbiendetfotografia;
    }

    public String getLrcotidatbiendetinventario() {
        return lrcotidatbiendetinventario;
    }

    public void setLrcotidatbiendetinventario(String lrcotidatbiendetinventario) {
        this.lrcotidatbiendetinventario = lrcotidatbiendetinventario;
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
        hash += (lrcotidatbiendetid != null ? lrcotidatbiendetid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcotidatbiendet)) {
            return false;
        }
        Lrcotidatbiendet other = (Lrcotidatbiendet) object;
        if ((this.lrcotidatbiendetid == null && other.lrcotidatbiendetid != null) || (this.lrcotidatbiendetid != null && !this.lrcotidatbiendetid.equals(other.lrcotidatbiendetid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcotidatbiendet[ lrcotidatbiendetid=" + lrcotidatbiendetid + " ]";
    }
    
}
