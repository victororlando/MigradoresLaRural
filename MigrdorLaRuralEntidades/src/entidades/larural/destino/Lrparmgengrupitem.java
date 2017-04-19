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
import javax.persistence.JoinColumns;
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
@Table(name = "LRPARMGENGRUPITEM")
@NamedQueries({
    @NamedQuery(name = "Lrparmgengrupitem.findAll", query = "SELECT l FROM Lrparmgengrupitem l"),
    @NamedQuery(name = "Lrparmgengrupitem.findByLrparmgengrupitemid", query = "SELECT l FROM Lrparmgengrupitem l WHERE l.lrparmgengrupitemPK.lrparmgengrupitemid = :lrparmgengrupitemid"),
    @NamedQuery(name = "Lrparmgengrupitem.findByLrparmgenid", query = "SELECT l FROM Lrparmgengrupitem l WHERE l.lrparmgengrupitemPK.lrparmgenid = :lrparmgenid"),
    @NamedQuery(name = "Lrparmgengrupitem.findByLrparmgengrupid", query = "SELECT l FROM Lrparmgengrupitem l WHERE l.lrparmgengrupitemPK.lrparmgengrupid = :lrparmgengrupid"),
    @NamedQuery(name = "Lrparmgengrupitem.findByLrparmgengrupitemdesc", query = "SELECT l FROM Lrparmgengrupitem l WHERE l.lrparmgengrupitemdesc = :lrparmgengrupitemdesc"),
    @NamedQuery(name = "Lrparmgengrupitem.findByLrparmgengrupitemest", query = "SELECT l FROM Lrparmgengrupitem l WHERE l.lrparmgengrupitemest = :lrparmgengrupitemest"),
    @NamedQuery(name = "Lrparmgengrupitem.findByLrparmgengrupitemnom", query = "SELECT l FROM Lrparmgengrupitem l WHERE l.lrparmgengrupitemnom = :lrparmgengrupitemnom"),
    @NamedQuery(name = "Lrparmgengrupitem.findByLrparmgengrupitemtext", query = "SELECT l FROM Lrparmgengrupitem l WHERE l.lrparmgengrupitemtext = :lrparmgengrupitemtext"),
    @NamedQuery(name = "Lrparmgengrupitem.findByLrparmgengrupitemfcha", query = "SELECT l FROM Lrparmgengrupitem l WHERE l.lrparmgengrupitemfcha = :lrparmgengrupitemfcha"),
    @NamedQuery(name = "Lrparmgengrupitem.findByLrparmgengrupitemnume", query = "SELECT l FROM Lrparmgengrupitem l WHERE l.lrparmgengrupitemnume = :lrparmgengrupitemnume"),
    @NamedQuery(name = "Lrparmgengrupitem.findByLrparmgengrupitemfal", query = "SELECT l FROM Lrparmgengrupitem l WHERE l.lrparmgengrupitemfal = :lrparmgengrupitemfal"),
    @NamedQuery(name = "Lrparmgengrupitem.findByLrparmgengrupitemual", query = "SELECT l FROM Lrparmgengrupitem l WHERE l.lrparmgengrupitemual = :lrparmgengrupitemual"),
    @NamedQuery(name = "Lrparmgengrupitem.findByLrparmgengrupitemfmd", query = "SELECT l FROM Lrparmgengrupitem l WHERE l.lrparmgengrupitemfmd = :lrparmgengrupitemfmd"),
    @NamedQuery(name = "Lrparmgengrupitem.findByLrparmgengrupitemumd", query = "SELECT l FROM Lrparmgengrupitem l WHERE l.lrparmgengrupitemumd = :lrparmgengrupitemumd")})
public class Lrparmgengrupitem implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrparmgengrupitemPK lrparmgengrupitemPK;
    @Basic(optional = false)
    @Column(name = "LRPARMGENGRUPITEMDESC", nullable = false, length = 4000)
    private String lrparmgengrupitemdesc;
    @Basic(optional = false)
    @Column(name = "LRPARMGENGRUPITEMEST", nullable = false)
    private Character lrparmgengrupitemest;
    @Basic(optional = false)
    @Column(name = "LRPARMGENGRUPITEMNOM", nullable = false, length = 60)
    private String lrparmgengrupitemnom;
    @Basic(optional = false)
    @Column(name = "LRPARMGENGRUPITEMTEXT", nullable = false, length = 4000)
    private String lrparmgengrupitemtext;
    @Basic(optional = false)
    @Column(name = "LRPARMGENGRUPITEMFCHA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrparmgengrupitemfcha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRPARMGENGRUPITEMNUME", nullable = false, precision = 17, scale = 6)
    private BigDecimal lrparmgengrupitemnume;
    @Basic(optional = false)
    @Column(name = "LRPARMGENGRUPITEMFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrparmgengrupitemfal;
    @Basic(optional = false)
    @Column(name = "LRPARMGENGRUPITEMUAL", nullable = false, length = 30)
    private String lrparmgengrupitemual;
    @Basic(optional = false)
    @Column(name = "LRPARMGENGRUPITEMFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrparmgengrupitemfmd;
    @Basic(optional = false)
    @Column(name = "LRPARMGENGRUPITEMUMD", nullable = false, length = 30)
    private String lrparmgengrupitemumd;
    @JoinColumns({
        @JoinColumn(name = "LRPARMGENID", referencedColumnName = "LRPARMGENID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "LRPARMGENGRUPID", referencedColumnName = "LRPARMGENGRUPID", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Lrparmgengrup lrparmgengrup;

    public Lrparmgengrupitem() {
    }

    public Lrparmgengrupitem(LrparmgengrupitemPK lrparmgengrupitemPK) {
        this.lrparmgengrupitemPK = lrparmgengrupitemPK;
    }

    public Lrparmgengrupitem(LrparmgengrupitemPK lrparmgengrupitemPK, String lrparmgengrupitemdesc, Character lrparmgengrupitemest, String lrparmgengrupitemnom, String lrparmgengrupitemtext, Date lrparmgengrupitemfcha, BigDecimal lrparmgengrupitemnume, Date lrparmgengrupitemfal, String lrparmgengrupitemual, Date lrparmgengrupitemfmd, String lrparmgengrupitemumd) {
        this.lrparmgengrupitemPK = lrparmgengrupitemPK;
        this.lrparmgengrupitemdesc = lrparmgengrupitemdesc;
        this.lrparmgengrupitemest = lrparmgengrupitemest;
        this.lrparmgengrupitemnom = lrparmgengrupitemnom;
        this.lrparmgengrupitemtext = lrparmgengrupitemtext;
        this.lrparmgengrupitemfcha = lrparmgengrupitemfcha;
        this.lrparmgengrupitemnume = lrparmgengrupitemnume;
        this.lrparmgengrupitemfal = lrparmgengrupitemfal;
        this.lrparmgengrupitemual = lrparmgengrupitemual;
        this.lrparmgengrupitemfmd = lrparmgengrupitemfmd;
        this.lrparmgengrupitemumd = lrparmgengrupitemumd;
    }

    public Lrparmgengrupitem(long lrparmgengrupitemid, long lrparmgenid, long lrparmgengrupid) {
        this.lrparmgengrupitemPK = new LrparmgengrupitemPK(lrparmgengrupitemid, lrparmgenid, lrparmgengrupid);
    }

    public LrparmgengrupitemPK getLrparmgengrupitemPK() {
        return lrparmgengrupitemPK;
    }

    public void setLrparmgengrupitemPK(LrparmgengrupitemPK lrparmgengrupitemPK) {
        this.lrparmgengrupitemPK = lrparmgengrupitemPK;
    }

    public String getLrparmgengrupitemdesc() {
        return lrparmgengrupitemdesc;
    }

    public void setLrparmgengrupitemdesc(String lrparmgengrupitemdesc) {
        this.lrparmgengrupitemdesc = lrparmgengrupitemdesc;
    }

    public Character getLrparmgengrupitemest() {
        return lrparmgengrupitemest;
    }

    public void setLrparmgengrupitemest(Character lrparmgengrupitemest) {
        this.lrparmgengrupitemest = lrparmgengrupitemest;
    }

    public String getLrparmgengrupitemnom() {
        return lrparmgengrupitemnom;
    }

    public void setLrparmgengrupitemnom(String lrparmgengrupitemnom) {
        this.lrparmgengrupitemnom = lrparmgengrupitemnom;
    }

    public String getLrparmgengrupitemtext() {
        return lrparmgengrupitemtext;
    }

    public void setLrparmgengrupitemtext(String lrparmgengrupitemtext) {
        this.lrparmgengrupitemtext = lrparmgengrupitemtext;
    }

    public Date getLrparmgengrupitemfcha() {
        return lrparmgengrupitemfcha;
    }

    public void setLrparmgengrupitemfcha(Date lrparmgengrupitemfcha) {
        this.lrparmgengrupitemfcha = lrparmgengrupitemfcha;
    }

    public BigDecimal getLrparmgengrupitemnume() {
        return lrparmgengrupitemnume;
    }

    public void setLrparmgengrupitemnume(BigDecimal lrparmgengrupitemnume) {
        this.lrparmgengrupitemnume = lrparmgengrupitemnume;
    }

    public Date getLrparmgengrupitemfal() {
        return lrparmgengrupitemfal;
    }

    public void setLrparmgengrupitemfal(Date lrparmgengrupitemfal) {
        this.lrparmgengrupitemfal = lrparmgengrupitemfal;
    }

    public String getLrparmgengrupitemual() {
        return lrparmgengrupitemual;
    }

    public void setLrparmgengrupitemual(String lrparmgengrupitemual) {
        this.lrparmgengrupitemual = lrparmgengrupitemual;
    }

    public Date getLrparmgengrupitemfmd() {
        return lrparmgengrupitemfmd;
    }

    public void setLrparmgengrupitemfmd(Date lrparmgengrupitemfmd) {
        this.lrparmgengrupitemfmd = lrparmgengrupitemfmd;
    }

    public String getLrparmgengrupitemumd() {
        return lrparmgengrupitemumd;
    }

    public void setLrparmgengrupitemumd(String lrparmgengrupitemumd) {
        this.lrparmgengrupitemumd = lrparmgengrupitemumd;
    }

    public Lrparmgengrup getLrparmgengrup() {
        return lrparmgengrup;
    }

    public void setLrparmgengrup(Lrparmgengrup lrparmgengrup) {
        this.lrparmgengrup = lrparmgengrup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrparmgengrupitemPK != null ? lrparmgengrupitemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrparmgengrupitem)) {
            return false;
        }
        Lrparmgengrupitem other = (Lrparmgengrupitem) object;
        if ((this.lrparmgengrupitemPK == null && other.lrparmgengrupitemPK != null) || (this.lrparmgengrupitemPK != null && !this.lrparmgengrupitemPK.equals(other.lrparmgengrupitemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrparmgengrupitem[ lrparmgengrupitemPK=" + lrparmgengrupitemPK + " ]";
    }
    
}
