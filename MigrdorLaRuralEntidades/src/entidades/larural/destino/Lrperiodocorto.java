/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRPERIODOCORTO")
@NamedQueries({
    @NamedQuery(name = "Lrperiodocorto.findAll", query = "SELECT l FROM Lrperiodocorto l"),
    @NamedQuery(name = "Lrperiodocorto.findByLrperiodocortoid", query = "SELECT l FROM Lrperiodocorto l WHERE l.lrperiodocortoid = :lrperiodocortoid"),
    @NamedQuery(name = "Lrperiodocorto.findByLrperiodocortodiadesde", query = "SELECT l FROM Lrperiodocorto l WHERE l.lrperiodocortodiadesde = :lrperiodocortodiadesde"),
    @NamedQuery(name = "Lrperiodocorto.findByLrperiodocortodiahasta", query = "SELECT l FROM Lrperiodocorto l WHERE l.lrperiodocortodiahasta = :lrperiodocortodiahasta"),
    @NamedQuery(name = "Lrperiodocorto.findByLrperiodocortodiaporc", query = "SELECT l FROM Lrperiodocorto l WHERE l.lrperiodocortodiaporc = :lrperiodocortodiaporc"),
    @NamedQuery(name = "Lrperiodocorto.findByLrperiodocortoac", query = "SELECT l FROM Lrperiodocorto l WHERE l.lrperiodocortoac = :lrperiodocortoac"),
    @NamedQuery(name = "Lrperiodocorto.findByLrperiodocortoual", query = "SELECT l FROM Lrperiodocorto l WHERE l.lrperiodocortoual = :lrperiodocortoual"),
    @NamedQuery(name = "Lrperiodocorto.findByLrperiodocortofal", query = "SELECT l FROM Lrperiodocorto l WHERE l.lrperiodocortofal = :lrperiodocortofal"),
    @NamedQuery(name = "Lrperiodocorto.findByLrperiodocortoumd", query = "SELECT l FROM Lrperiodocorto l WHERE l.lrperiodocortoumd = :lrperiodocortoumd"),
    @NamedQuery(name = "Lrperiodocorto.findByLrperiodocortofmd", query = "SELECT l FROM Lrperiodocorto l WHERE l.lrperiodocortofmd = :lrperiodocortofmd")})
public class Lrperiodocorto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRPERIODOCORTOID", nullable = false)
    private Long lrperiodocortoid;
    @Basic(optional = false)
    @Column(name = "LRPERIODOCORTODIADESDE", nullable = false)
    private short lrperiodocortodiadesde;
    @Basic(optional = false)
    @Column(name = "LRPERIODOCORTODIAHASTA", nullable = false)
    private short lrperiodocortodiahasta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRPERIODOCORTODIAPORC", nullable = false, precision = 7, scale = 2)
    private BigDecimal lrperiodocortodiaporc;
    @Basic(optional = false)
    @Column(name = "LRPERIODOCORTOAC", nullable = false)
    private Character lrperiodocortoac;
    @Basic(optional = false)
    @Column(name = "LRPERIODOCORTOUAL", nullable = false, length = 30)
    private String lrperiodocortoual;
    @Basic(optional = false)
    @Column(name = "LRPERIODOCORTOFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrperiodocortofal;
    @Column(name = "LRPERIODOCORTOUMD", length = 30)
    private String lrperiodocortoumd;
    @Column(name = "LRPERIODOCORTOFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrperiodocortofmd;
    @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false)
    @ManyToOne(optional = false)
    private Lrseccdetalle lrseccdetalleid;

    public Lrperiodocorto() {
    }

    public Lrperiodocorto(Long lrperiodocortoid) {
        this.lrperiodocortoid = lrperiodocortoid;
    }

    public Lrperiodocorto(Long lrperiodocortoid, short lrperiodocortodiadesde, short lrperiodocortodiahasta, BigDecimal lrperiodocortodiaporc, Character lrperiodocortoac, String lrperiodocortoual, Date lrperiodocortofal) {
        this.lrperiodocortoid = lrperiodocortoid;
        this.lrperiodocortodiadesde = lrperiodocortodiadesde;
        this.lrperiodocortodiahasta = lrperiodocortodiahasta;
        this.lrperiodocortodiaporc = lrperiodocortodiaporc;
        this.lrperiodocortoac = lrperiodocortoac;
        this.lrperiodocortoual = lrperiodocortoual;
        this.lrperiodocortofal = lrperiodocortofal;
    }

    public Long getLrperiodocortoid() {
        return lrperiodocortoid;
    }

    public void setLrperiodocortoid(Long lrperiodocortoid) {
        this.lrperiodocortoid = lrperiodocortoid;
    }

    public short getLrperiodocortodiadesde() {
        return lrperiodocortodiadesde;
    }

    public void setLrperiodocortodiadesde(short lrperiodocortodiadesde) {
        this.lrperiodocortodiadesde = lrperiodocortodiadesde;
    }

    public short getLrperiodocortodiahasta() {
        return lrperiodocortodiahasta;
    }

    public void setLrperiodocortodiahasta(short lrperiodocortodiahasta) {
        this.lrperiodocortodiahasta = lrperiodocortodiahasta;
    }

    public BigDecimal getLrperiodocortodiaporc() {
        return lrperiodocortodiaporc;
    }

    public void setLrperiodocortodiaporc(BigDecimal lrperiodocortodiaporc) {
        this.lrperiodocortodiaporc = lrperiodocortodiaporc;
    }

    public Character getLrperiodocortoac() {
        return lrperiodocortoac;
    }

    public void setLrperiodocortoac(Character lrperiodocortoac) {
        this.lrperiodocortoac = lrperiodocortoac;
    }

    public String getLrperiodocortoual() {
        return lrperiodocortoual;
    }

    public void setLrperiodocortoual(String lrperiodocortoual) {
        this.lrperiodocortoual = lrperiodocortoual;
    }

    public Date getLrperiodocortofal() {
        return lrperiodocortofal;
    }

    public void setLrperiodocortofal(Date lrperiodocortofal) {
        this.lrperiodocortofal = lrperiodocortofal;
    }

    public String getLrperiodocortoumd() {
        return lrperiodocortoumd;
    }

    public void setLrperiodocortoumd(String lrperiodocortoumd) {
        this.lrperiodocortoumd = lrperiodocortoumd;
    }

    public Date getLrperiodocortofmd() {
        return lrperiodocortofmd;
    }

    public void setLrperiodocortofmd(Date lrperiodocortofmd) {
        this.lrperiodocortofmd = lrperiodocortofmd;
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
        hash += (lrperiodocortoid != null ? lrperiodocortoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrperiodocorto)) {
            return false;
        }
        Lrperiodocorto other = (Lrperiodocorto) object;
        if ((this.lrperiodocortoid == null && other.lrperiodocortoid != null) || (this.lrperiodocortoid != null && !this.lrperiodocortoid.equals(other.lrperiodocortoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrperiodocorto[ lrperiodocortoid=" + lrperiodocortoid + " ]";
    }
    
}
