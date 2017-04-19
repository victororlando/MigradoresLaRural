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
@Table(name = "LRFICHACLIENTEPRIMCAUCION")
@NamedQueries({
    @NamedQuery(name = "Lrfichaclienteprimcaucion.findAll", query = "SELECT l FROM Lrfichaclienteprimcaucion l"),
    @NamedQuery(name = "Lrfichaclienteprimcaucion.findByLrfichaclienteprimcaucionid", query = "SELECT l FROM Lrfichaclienteprimcaucion l WHERE l.lrfichaclienteprimcaucionid = :lrfichaclienteprimcaucionid"),
    @NamedQuery(name = "Lrfichaclienteprimcaucion.findByLrfichaclienteprimcauciontiemp", query = "SELECT l FROM Lrfichaclienteprimcaucion l WHERE l.lrfichaclienteprimcauciontiemp = :lrfichaclienteprimcauciontiemp"),
    @NamedQuery(name = "Lrfichaclienteprimcaucion.findByLrfichaclienteprimcaucionimpor", query = "SELECT l FROM Lrfichaclienteprimcaucion l WHERE l.lrfichaclienteprimcaucionimpor = :lrfichaclienteprimcaucionimpor")})
public class Lrfichaclienteprimcaucion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTEPRIMCAUCIONID", nullable = false)
    private Long lrfichaclienteprimcaucionid;
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTEPRIMCAUCIONTIEMP", nullable = false, length = 40)
    private String lrfichaclienteprimcauciontiemp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTEPRIMCAUCIONIMPOR", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrfichaclienteprimcaucionimpor;
    @JoinColumn(name = "LRFICHACLIENTEID", referencedColumnName = "LRFICHACLIENTEID", nullable = false)
    @ManyToOne(optional = false)
    private Lrfichacliente lrfichaclienteid;
    @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false)
    @ManyToOne(optional = false)
    private Lrseccdetalle lrseccdetalleid;

    public Lrfichaclienteprimcaucion() {
    }

    public Lrfichaclienteprimcaucion(Long lrfichaclienteprimcaucionid) {
        this.lrfichaclienteprimcaucionid = lrfichaclienteprimcaucionid;
    }

    public Lrfichaclienteprimcaucion(Long lrfichaclienteprimcaucionid, String lrfichaclienteprimcauciontiemp, BigDecimal lrfichaclienteprimcaucionimpor) {
        this.lrfichaclienteprimcaucionid = lrfichaclienteprimcaucionid;
        this.lrfichaclienteprimcauciontiemp = lrfichaclienteprimcauciontiemp;
        this.lrfichaclienteprimcaucionimpor = lrfichaclienteprimcaucionimpor;
    }

    public Long getLrfichaclienteprimcaucionid() {
        return lrfichaclienteprimcaucionid;
    }

    public void setLrfichaclienteprimcaucionid(Long lrfichaclienteprimcaucionid) {
        this.lrfichaclienteprimcaucionid = lrfichaclienteprimcaucionid;
    }

    public String getLrfichaclienteprimcauciontiemp() {
        return lrfichaclienteprimcauciontiemp;
    }

    public void setLrfichaclienteprimcauciontiemp(String lrfichaclienteprimcauciontiemp) {
        this.lrfichaclienteprimcauciontiemp = lrfichaclienteprimcauciontiemp;
    }

    public BigDecimal getLrfichaclienteprimcaucionimpor() {
        return lrfichaclienteprimcaucionimpor;
    }

    public void setLrfichaclienteprimcaucionimpor(BigDecimal lrfichaclienteprimcaucionimpor) {
        this.lrfichaclienteprimcaucionimpor = lrfichaclienteprimcaucionimpor;
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
        hash += (lrfichaclienteprimcaucionid != null ? lrfichaclienteprimcaucionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrfichaclienteprimcaucion)) {
            return false;
        }
        Lrfichaclienteprimcaucion other = (Lrfichaclienteprimcaucion) object;
        if ((this.lrfichaclienteprimcaucionid == null && other.lrfichaclienteprimcaucionid != null) || (this.lrfichaclienteprimcaucionid != null && !this.lrfichaclienteprimcaucionid.equals(other.lrfichaclienteprimcaucionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrfichaclienteprimcaucion[ lrfichaclienteprimcaucionid=" + lrfichaclienteprimcaucionid + " ]";
    }
    
}
