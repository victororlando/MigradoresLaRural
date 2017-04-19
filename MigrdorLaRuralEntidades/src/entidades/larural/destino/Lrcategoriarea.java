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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "LRCATEGORIAREA")
@NamedQueries({
    @NamedQuery(name = "Lrcategoriarea.findAll", query = "SELECT l FROM Lrcategoriarea l"),
    @NamedQuery(name = "Lrcategoriarea.findByLrcategoriaid", query = "SELECT l FROM Lrcategoriarea l WHERE l.lrcategoriareaPK.lrcategoriaid = :lrcategoriaid"),
    @NamedQuery(name = "Lrcategoriarea.findByComreacoaid", query = "SELECT l FROM Lrcategoriarea l WHERE l.lrcategoriareaPK.comreacoaid = :comreacoaid"),
    @NamedQuery(name = "Lrcategoriarea.findByMonid", query = "SELECT l FROM Lrcategoriarea l WHERE l.lrcategoriareaPK.monid = :monid"),
    @NamedQuery(name = "Lrcategoriarea.findByLrcategoriareaimp", query = "SELECT l FROM Lrcategoriarea l WHERE l.lrcategoriareaimp = :lrcategoriareaimp"),
    @NamedQuery(name = "Lrcategoriarea.findByLrcategoriareaac", query = "SELECT l FROM Lrcategoriarea l WHERE l.lrcategoriareaac = :lrcategoriareaac"),
    @NamedQuery(name = "Lrcategoriarea.findByLrcategoriareaual", query = "SELECT l FROM Lrcategoriarea l WHERE l.lrcategoriareaual = :lrcategoriareaual"),
    @NamedQuery(name = "Lrcategoriarea.findByLrcategoriareafal", query = "SELECT l FROM Lrcategoriarea l WHERE l.lrcategoriareafal = :lrcategoriareafal"),
    @NamedQuery(name = "Lrcategoriarea.findByLrcategoriareaumd", query = "SELECT l FROM Lrcategoriarea l WHERE l.lrcategoriareaumd = :lrcategoriareaumd"),
    @NamedQuery(name = "Lrcategoriarea.findByLrcategoriareafmd", query = "SELECT l FROM Lrcategoriarea l WHERE l.lrcategoriareafmd = :lrcategoriareafmd"),
    @NamedQuery(name = "Lrcategoriarea.findByLrcategoriareacomision", query = "SELECT l FROM Lrcategoriarea l WHERE l.lrcategoriareacomision = :lrcategoriareacomision")})
public class Lrcategoriarea implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrcategoriareaPK lrcategoriareaPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRCATEGORIAREAIMP", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcategoriareaimp;
    @Basic(optional = false)
    @Column(name = "LRCATEGORIAREAAC", nullable = false)
    private Character lrcategoriareaac;
    @Basic(optional = false)
    @Column(name = "LRCATEGORIAREAUAL", nullable = false, length = 30)
    private String lrcategoriareaual;
    @Basic(optional = false)
    @Column(name = "LRCATEGORIAREAFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcategoriareafal;
    @Basic(optional = false)
    @Column(name = "LRCATEGORIAREAUMD", nullable = false, length = 30)
    private String lrcategoriareaumd;
    @Basic(optional = false)
    @Column(name = "LRCATEGORIAREAFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcategoriareafmd;
    @Column(name = "LRCATEGORIAREACOMISION")
    private Long lrcategoriareacomision;
    @JoinColumn(name = "LRCATEGORIAID", referencedColumnName = "LRCATEGORIAID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrcategoria lrcategoria;

    public Lrcategoriarea() {
    }

    public Lrcategoriarea(LrcategoriareaPK lrcategoriareaPK) {
        this.lrcategoriareaPK = lrcategoriareaPK;
    }

    public Lrcategoriarea(LrcategoriareaPK lrcategoriareaPK, BigDecimal lrcategoriareaimp, Character lrcategoriareaac, String lrcategoriareaual, Date lrcategoriareafal, String lrcategoriareaumd, Date lrcategoriareafmd) {
        this.lrcategoriareaPK = lrcategoriareaPK;
        this.lrcategoriareaimp = lrcategoriareaimp;
        this.lrcategoriareaac = lrcategoriareaac;
        this.lrcategoriareaual = lrcategoriareaual;
        this.lrcategoriareafal = lrcategoriareafal;
        this.lrcategoriareaumd = lrcategoriareaumd;
        this.lrcategoriareafmd = lrcategoriareafmd;
    }

    public Lrcategoriarea(long lrcategoriaid, short comreacoaid, short monid) {
        this.lrcategoriareaPK = new LrcategoriareaPK(lrcategoriaid, comreacoaid, monid);
    }

    public LrcategoriareaPK getLrcategoriareaPK() {
        return lrcategoriareaPK;
    }

    public void setLrcategoriareaPK(LrcategoriareaPK lrcategoriareaPK) {
        this.lrcategoriareaPK = lrcategoriareaPK;
    }

    public BigDecimal getLrcategoriareaimp() {
        return lrcategoriareaimp;
    }

    public void setLrcategoriareaimp(BigDecimal lrcategoriareaimp) {
        this.lrcategoriareaimp = lrcategoriareaimp;
    }

    public Character getLrcategoriareaac() {
        return lrcategoriareaac;
    }

    public void setLrcategoriareaac(Character lrcategoriareaac) {
        this.lrcategoriareaac = lrcategoriareaac;
    }

    public String getLrcategoriareaual() {
        return lrcategoriareaual;
    }

    public void setLrcategoriareaual(String lrcategoriareaual) {
        this.lrcategoriareaual = lrcategoriareaual;
    }

    public Date getLrcategoriareafal() {
        return lrcategoriareafal;
    }

    public void setLrcategoriareafal(Date lrcategoriareafal) {
        this.lrcategoriareafal = lrcategoriareafal;
    }

    public String getLrcategoriareaumd() {
        return lrcategoriareaumd;
    }

    public void setLrcategoriareaumd(String lrcategoriareaumd) {
        this.lrcategoriareaumd = lrcategoriareaumd;
    }

    public Date getLrcategoriareafmd() {
        return lrcategoriareafmd;
    }

    public void setLrcategoriareafmd(Date lrcategoriareafmd) {
        this.lrcategoriareafmd = lrcategoriareafmd;
    }

    public Long getLrcategoriareacomision() {
        return lrcategoriareacomision;
    }

    public void setLrcategoriareacomision(Long lrcategoriareacomision) {
        this.lrcategoriareacomision = lrcategoriareacomision;
    }

    public Lrcategoria getLrcategoria() {
        return lrcategoria;
    }

    public void setLrcategoria(Lrcategoria lrcategoria) {
        this.lrcategoria = lrcategoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcategoriareaPK != null ? lrcategoriareaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcategoriarea)) {
            return false;
        }
        Lrcategoriarea other = (Lrcategoriarea) object;
        if ((this.lrcategoriareaPK == null && other.lrcategoriareaPK != null) || (this.lrcategoriareaPK != null && !this.lrcategoriareaPK.equals(other.lrcategoriareaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcategoriarea[ lrcategoriareaPK=" + lrcategoriareaPK + " ]";
    }
    
}
