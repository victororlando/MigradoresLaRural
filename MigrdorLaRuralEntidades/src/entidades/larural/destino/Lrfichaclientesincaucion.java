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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRFICHACLIENTESINCAUCION")
@NamedQueries({
    @NamedQuery(name = "Lrfichaclientesincaucion.findAll", query = "SELECT l FROM Lrfichaclientesincaucion l"),
    @NamedQuery(name = "Lrfichaclientesincaucion.findByLrfichaclientesincaucionid", query = "SELECT l FROM Lrfichaclientesincaucion l WHERE l.lrfichaclientesincaucionid = :lrfichaclientesincaucionid"),
    @NamedQuery(name = "Lrfichaclientesincaucion.findByLrfichaclientesincauciontiempo", query = "SELECT l FROM Lrfichaclientesincaucion l WHERE l.lrfichaclientesincauciontiempo = :lrfichaclientesincauciontiempo"),
    @NamedQuery(name = "Lrfichaclientesincaucion.findByLrfichaclientesincaucionimpor", query = "SELECT l FROM Lrfichaclientesincaucion l WHERE l.lrfichaclientesincaucionimpor = :lrfichaclientesincaucionimpor"),
    @NamedQuery(name = "Lrfichaclientesincaucion.findByLrfichaclientesincaucionporcsi", query = "SELECT l FROM Lrfichaclientesincaucion l WHERE l.lrfichaclientesincaucionporcsi = :lrfichaclientesincaucionporcsi")})
public class Lrfichaclientesincaucion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTESINCAUCIONID", nullable = false)
    private Long lrfichaclientesincaucionid;
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTESINCAUCIONTIEMPO", nullable = false, length = 40)
    private String lrfichaclientesincauciontiempo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTESINCAUCIONIMPOR", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrfichaclientesincaucionimpor;
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTESINCAUCIONPORCSI", nullable = false)
    private short lrfichaclientesincaucionporcsi;
    @JoinColumn(name = "LRFICHACLIENTEID", referencedColumnName = "LRFICHACLIENTEID", nullable = false)
    @ManyToOne(optional = false)
    private Lrfichacliente lrfichaclienteid;
    @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false)
    @ManyToOne(optional = false)
    private Lrseccdetalle lrseccdetalleid;

    public Lrfichaclientesincaucion() {
    }

    public Lrfichaclientesincaucion(Long lrfichaclientesincaucionid) {
        this.lrfichaclientesincaucionid = lrfichaclientesincaucionid;
    }

    public Lrfichaclientesincaucion(Long lrfichaclientesincaucionid, String lrfichaclientesincauciontiempo, BigDecimal lrfichaclientesincaucionimpor, short lrfichaclientesincaucionporcsi) {
        this.lrfichaclientesincaucionid = lrfichaclientesincaucionid;
        this.lrfichaclientesincauciontiempo = lrfichaclientesincauciontiempo;
        this.lrfichaclientesincaucionimpor = lrfichaclientesincaucionimpor;
        this.lrfichaclientesincaucionporcsi = lrfichaclientesincaucionporcsi;
    }

    public Long getLrfichaclientesincaucionid() {
        return lrfichaclientesincaucionid;
    }

    public void setLrfichaclientesincaucionid(Long lrfichaclientesincaucionid) {
        this.lrfichaclientesincaucionid = lrfichaclientesincaucionid;
    }

    public String getLrfichaclientesincauciontiempo() {
        return lrfichaclientesincauciontiempo;
    }

    public void setLrfichaclientesincauciontiempo(String lrfichaclientesincauciontiempo) {
        this.lrfichaclientesincauciontiempo = lrfichaclientesincauciontiempo;
    }

    public BigDecimal getLrfichaclientesincaucionimpor() {
        return lrfichaclientesincaucionimpor;
    }

    public void setLrfichaclientesincaucionimpor(BigDecimal lrfichaclientesincaucionimpor) {
        this.lrfichaclientesincaucionimpor = lrfichaclientesincaucionimpor;
    }

    public short getLrfichaclientesincaucionporcsi() {
        return lrfichaclientesincaucionporcsi;
    }

    public void setLrfichaclientesincaucionporcsi(short lrfichaclientesincaucionporcsi) {
        this.lrfichaclientesincaucionporcsi = lrfichaclientesincaucionporcsi;
    }

    public Lrfichacliente getLrfichaclienteid() {
        return lrfichaclienteid;
    }

    public void setLrfichaclienteid(Lrfichacliente lrfichaclienteid) {
        this.lrfichaclienteid = lrfichaclienteid;
    }

    public Lrseccdetalle getLrseccdetalleid() {
        return lrseccdetalleid;
    }

    public void setLrseccdetalleid(Lrseccdetalle lrseccdetalleid) {
        this.lrseccdetalleid = lrseccdetalleid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrfichaclientesincaucionid != null ? lrfichaclientesincaucionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrfichaclientesincaucion)) {
            return false;
        }
        Lrfichaclientesincaucion other = (Lrfichaclientesincaucion) object;
        if ((this.lrfichaclientesincaucionid == null && other.lrfichaclientesincaucionid != null) || (this.lrfichaclientesincaucionid != null && !this.lrfichaclientesincaucionid.equals(other.lrfichaclientesincaucionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrfichaclientesincaucion[ lrfichaclientesincaucionid=" + lrfichaclientesincaucionid + " ]";
    }
    
}
