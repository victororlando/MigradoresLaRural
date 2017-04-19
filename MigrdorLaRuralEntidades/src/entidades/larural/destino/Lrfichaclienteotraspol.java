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
@Table(name = "LRFICHACLIENTEOTRASPOL")
@NamedQueries({
    @NamedQuery(name = "Lrfichaclienteotraspol.findAll", query = "SELECT l FROM Lrfichaclienteotraspol l"),
    @NamedQuery(name = "Lrfichaclienteotraspol.findByLrfichaclienteotraspolid", query = "SELECT l FROM Lrfichaclienteotraspol l WHERE l.lrfichaclienteotraspolid = :lrfichaclienteotraspolid"),
    @NamedQuery(name = "Lrfichaclienteotraspol.findByLrfichaclienteotraspolcant", query = "SELECT l FROM Lrfichaclienteotraspol l WHERE l.lrfichaclienteotraspolcant = :lrfichaclienteotraspolcant"),
    @NamedQuery(name = "Lrfichaclienteotraspol.findByLrfichaclienteotraspolimpor", query = "SELECT l FROM Lrfichaclienteotraspol l WHERE l.lrfichaclienteotraspolimpor = :lrfichaclienteotraspolimpor")})
public class Lrfichaclienteotraspol implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTEOTRASPOLID", nullable = false)
    private Long lrfichaclienteotraspolid;
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTEOTRASPOLCANT", nullable = false)
    private int lrfichaclienteotraspolcant;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTEOTRASPOLIMPOR", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrfichaclienteotraspolimpor;
    @JoinColumn(name = "LRFICHACLIENTEID", referencedColumnName = "LRFICHACLIENTEID", nullable = false)
    @ManyToOne(optional = false)
    private Lrfichacliente lrfichaclienteid;
    @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false)
    @ManyToOne(optional = false)
    private Lrseccdetalle lrseccdetalleid;

    public Lrfichaclienteotraspol() {
    }

    public Lrfichaclienteotraspol(Long lrfichaclienteotraspolid) {
        this.lrfichaclienteotraspolid = lrfichaclienteotraspolid;
    }

    public Lrfichaclienteotraspol(Long lrfichaclienteotraspolid, int lrfichaclienteotraspolcant, BigDecimal lrfichaclienteotraspolimpor) {
        this.lrfichaclienteotraspolid = lrfichaclienteotraspolid;
        this.lrfichaclienteotraspolcant = lrfichaclienteotraspolcant;
        this.lrfichaclienteotraspolimpor = lrfichaclienteotraspolimpor;
    }

    public Long getLrfichaclienteotraspolid() {
        return lrfichaclienteotraspolid;
    }

    public void setLrfichaclienteotraspolid(Long lrfichaclienteotraspolid) {
        this.lrfichaclienteotraspolid = lrfichaclienteotraspolid;
    }

    public int getLrfichaclienteotraspolcant() {
        return lrfichaclienteotraspolcant;
    }

    public void setLrfichaclienteotraspolcant(int lrfichaclienteotraspolcant) {
        this.lrfichaclienteotraspolcant = lrfichaclienteotraspolcant;
    }

    public BigDecimal getLrfichaclienteotraspolimpor() {
        return lrfichaclienteotraspolimpor;
    }

    public void setLrfichaclienteotraspolimpor(BigDecimal lrfichaclienteotraspolimpor) {
        this.lrfichaclienteotraspolimpor = lrfichaclienteotraspolimpor;
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
        hash += (lrfichaclienteotraspolid != null ? lrfichaclienteotraspolid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrfichaclienteotraspol)) {
            return false;
        }
        Lrfichaclienteotraspol other = (Lrfichaclienteotraspol) object;
        if ((this.lrfichaclienteotraspolid == null && other.lrfichaclienteotraspolid != null) || (this.lrfichaclienteotraspolid != null && !this.lrfichaclienteotraspolid.equals(other.lrfichaclienteotraspolid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrfichaclienteotraspol[ lrfichaclienteotraspolid=" + lrfichaclienteotraspolid + " ]";
    }
    
}
