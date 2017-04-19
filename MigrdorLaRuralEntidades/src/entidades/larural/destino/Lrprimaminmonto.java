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
@Table(name = "LRPRIMAMINMONTO")
@NamedQueries({
    @NamedQuery(name = "Lrprimaminmonto.findAll", query = "SELECT l FROM Lrprimaminmonto l"),
    @NamedQuery(name = "Lrprimaminmonto.findByLrprimaminmontoid", query = "SELECT l FROM Lrprimaminmonto l WHERE l.lrprimaminmontoid = :lrprimaminmontoid"),
    @NamedQuery(name = "Lrprimaminmonto.findByLrprimaminmontoprima", query = "SELECT l FROM Lrprimaminmonto l WHERE l.lrprimaminmontoprima = :lrprimaminmontoprima"),
    @NamedQuery(name = "Lrprimaminmonto.findByLrprimaminmontocapdesde", query = "SELECT l FROM Lrprimaminmonto l WHERE l.lrprimaminmontocapdesde = :lrprimaminmontocapdesde"),
    @NamedQuery(name = "Lrprimaminmonto.findByLrprimaminmontocaphasta", query = "SELECT l FROM Lrprimaminmonto l WHERE l.lrprimaminmontocaphasta = :lrprimaminmontocaphasta")})
public class Lrprimaminmonto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRPRIMAMINMONTOID", nullable = false)
    private Long lrprimaminmontoid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRPRIMAMINMONTOPRIMA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrprimaminmontoprima;
    @Basic(optional = false)
    @Column(name = "LRPRIMAMINMONTOCAPDESDE", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrprimaminmontocapdesde;
    @Basic(optional = false)
    @Column(name = "LRPRIMAMINMONTOCAPHASTA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrprimaminmontocaphasta;
    @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false)
    @ManyToOne(optional = false)
    private Lrseccdetalle lrseccdetalleid;

    public Lrprimaminmonto() {
    }

    public Lrprimaminmonto(Long lrprimaminmontoid) {
        this.lrprimaminmontoid = lrprimaminmontoid;
    }

    public Lrprimaminmonto(Long lrprimaminmontoid, BigDecimal lrprimaminmontoprima, BigDecimal lrprimaminmontocapdesde, BigDecimal lrprimaminmontocaphasta) {
        this.lrprimaminmontoid = lrprimaminmontoid;
        this.lrprimaminmontoprima = lrprimaminmontoprima;
        this.lrprimaminmontocapdesde = lrprimaminmontocapdesde;
        this.lrprimaminmontocaphasta = lrprimaminmontocaphasta;
    }

    public Long getLrprimaminmontoid() {
        return lrprimaminmontoid;
    }

    public void setLrprimaminmontoid(Long lrprimaminmontoid) {
        this.lrprimaminmontoid = lrprimaminmontoid;
    }

    public BigDecimal getLrprimaminmontoprima() {
        return lrprimaminmontoprima;
    }

    public void setLrprimaminmontoprima(BigDecimal lrprimaminmontoprima) {
        this.lrprimaminmontoprima = lrprimaminmontoprima;
    }

    public BigDecimal getLrprimaminmontocapdesde() {
        return lrprimaminmontocapdesde;
    }

    public void setLrprimaminmontocapdesde(BigDecimal lrprimaminmontocapdesde) {
        this.lrprimaminmontocapdesde = lrprimaminmontocapdesde;
    }

    public BigDecimal getLrprimaminmontocaphasta() {
        return lrprimaminmontocaphasta;
    }

    public void setLrprimaminmontocaphasta(BigDecimal lrprimaminmontocaphasta) {
        this.lrprimaminmontocaphasta = lrprimaminmontocaphasta;
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
        hash += (lrprimaminmontoid != null ? lrprimaminmontoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrprimaminmonto)) {
            return false;
        }
        Lrprimaminmonto other = (Lrprimaminmonto) object;
        if ((this.lrprimaminmontoid == null && other.lrprimaminmontoid != null) || (this.lrprimaminmontoid != null && !this.lrprimaminmontoid.equals(other.lrprimaminmontoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrprimaminmonto[ lrprimaminmontoid=" + lrprimaminmontoid + " ]";
    }
    
}
