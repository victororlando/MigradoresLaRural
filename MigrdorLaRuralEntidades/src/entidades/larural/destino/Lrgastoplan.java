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
@Table(name = "LRGASTOPLAN")
@NamedQueries({
    @NamedQuery(name = "Lrgastoplan.findAll", query = "SELECT l FROM Lrgastoplan l"),
    @NamedQuery(name = "Lrgastoplan.findByLrseccdetalleid", query = "SELECT l FROM Lrgastoplan l WHERE l.lrgastoplanPK.lrseccdetalleid = :lrseccdetalleid"),
    @NamedQuery(name = "Lrgastoplan.findByLrparmcotiplanid", query = "SELECT l FROM Lrgastoplan l WHERE l.lrgastoplanPK.lrparmcotiplanid = :lrparmcotiplanid"),
    @NamedQuery(name = "Lrgastoplan.findByLrtipoplanid", query = "SELECT l FROM Lrgastoplan l WHERE l.lrgastoplanPK.lrtipoplanid = :lrtipoplanid"),
    @NamedQuery(name = "Lrgastoplan.findByTiposserviciosseccid", query = "SELECT l FROM Lrgastoplan l WHERE l.lrgastoplanPK.tiposserviciosseccid = :tiposserviciosseccid"),
    @NamedQuery(name = "Lrgastoplan.findByProvid", query = "SELECT l FROM Lrgastoplan l WHERE l.lrgastoplanPK.provid = :provid"),
    @NamedQuery(name = "Lrgastoplan.findByMonid", query = "SELECT l FROM Lrgastoplan l WHERE l.lrgastoplanPK.monid = :monid"),
    @NamedQuery(name = "Lrgastoplan.findBySeccid", query = "SELECT l FROM Lrgastoplan l WHERE l.seccid = :seccid"),
    @NamedQuery(name = "Lrgastoplan.findByLrgastoplanfijo", query = "SELECT l FROM Lrgastoplan l WHERE l.lrgastoplanfijo = :lrgastoplanfijo"),
    @NamedQuery(name = "Lrgastoplan.findByLrgastoplanporc", query = "SELECT l FROM Lrgastoplan l WHERE l.lrgastoplanporc = :lrgastoplanporc"),
    @NamedQuery(name = "Lrgastoplan.findByLrgastoplanvalor", query = "SELECT l FROM Lrgastoplan l WHERE l.lrgastoplanvalor = :lrgastoplanvalor"),
    @NamedQuery(name = "Lrgastoplan.findByLrgastoplanpordefecto", query = "SELECT l FROM Lrgastoplan l WHERE l.lrgastoplanpordefecto = :lrgastoplanpordefecto"),
    @NamedQuery(name = "Lrgastoplan.findByLrgastoplanac", query = "SELECT l FROM Lrgastoplan l WHERE l.lrgastoplanac = :lrgastoplanac"),
    @NamedQuery(name = "Lrgastoplan.findByLrgastoplanual", query = "SELECT l FROM Lrgastoplan l WHERE l.lrgastoplanual = :lrgastoplanual"),
    @NamedQuery(name = "Lrgastoplan.findByLrgastoplanfal", query = "SELECT l FROM Lrgastoplan l WHERE l.lrgastoplanfal = :lrgastoplanfal"),
    @NamedQuery(name = "Lrgastoplan.findByLrgastoplanumd", query = "SELECT l FROM Lrgastoplan l WHERE l.lrgastoplanumd = :lrgastoplanumd"),
    @NamedQuery(name = "Lrgastoplan.findByLrgastoplanfmd", query = "SELECT l FROM Lrgastoplan l WHERE l.lrgastoplanfmd = :lrgastoplanfmd")})
public class Lrgastoplan implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrgastoplanPK lrgastoplanPK;
    @Basic(optional = false)
    @Column(name = "SECCID", nullable = false)
    private short seccid;
    @Basic(optional = false)
    @Column(name = "LRGASTOPLANFIJO", nullable = false)
    private Character lrgastoplanfijo;
    @Basic(optional = false)
    @Column(name = "LRGASTOPLANPORC", nullable = false)
    private Character lrgastoplanporc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRGASTOPLANVALOR", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrgastoplanvalor;
    @Basic(optional = false)
    @Column(name = "LRGASTOPLANPORDEFECTO", nullable = false)
    private Character lrgastoplanpordefecto;
    @Basic(optional = false)
    @Column(name = "LRGASTOPLANAC", nullable = false)
    private Character lrgastoplanac;
    @Basic(optional = false)
    @Column(name = "LRGASTOPLANUAL", nullable = false, length = 30)
    private String lrgastoplanual;
    @Basic(optional = false)
    @Column(name = "LRGASTOPLANFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrgastoplanfal;
    @Basic(optional = false)
    @Column(name = "LRGASTOPLANUMD", nullable = false, length = 30)
    private String lrgastoplanumd;
    @Basic(optional = false)
    @Column(name = "LRGASTOPLANFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrgastoplanfmd;
    @JoinColumns({
        @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "LRPARMCOTIPLANID", referencedColumnName = "LRPARMCOTIPLANID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "LRTIPOPLANID", referencedColumnName = "LRTIPOPLANID", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Lrparmcotiplansecc lrparmcotiplansecc;

    public Lrgastoplan() {
    }

    public Lrgastoplan(LrgastoplanPK lrgastoplanPK) {
        this.lrgastoplanPK = lrgastoplanPK;
    }

    public Lrgastoplan(LrgastoplanPK lrgastoplanPK, short seccid, Character lrgastoplanfijo, Character lrgastoplanporc, BigDecimal lrgastoplanvalor, Character lrgastoplanpordefecto, Character lrgastoplanac, String lrgastoplanual, Date lrgastoplanfal, String lrgastoplanumd, Date lrgastoplanfmd) {
        this.lrgastoplanPK = lrgastoplanPK;
        this.seccid = seccid;
        this.lrgastoplanfijo = lrgastoplanfijo;
        this.lrgastoplanporc = lrgastoplanporc;
        this.lrgastoplanvalor = lrgastoplanvalor;
        this.lrgastoplanpordefecto = lrgastoplanpordefecto;
        this.lrgastoplanac = lrgastoplanac;
        this.lrgastoplanual = lrgastoplanual;
        this.lrgastoplanfal = lrgastoplanfal;
        this.lrgastoplanumd = lrgastoplanumd;
        this.lrgastoplanfmd = lrgastoplanfmd;
    }

    public Lrgastoplan(long lrseccdetalleid, long lrparmcotiplanid, long lrtipoplanid, short tiposserviciosseccid, int provid, short monid) {
        this.lrgastoplanPK = new LrgastoplanPK(lrseccdetalleid, lrparmcotiplanid, lrtipoplanid, tiposserviciosseccid, provid, monid);
    }

    public LrgastoplanPK getLrgastoplanPK() {
        return lrgastoplanPK;
    }

    public void setLrgastoplanPK(LrgastoplanPK lrgastoplanPK) {
        this.lrgastoplanPK = lrgastoplanPK;
    }

    public short getSeccid() {
        return seccid;
    }

    public void setSeccid(short seccid) {
        this.seccid = seccid;
    }

    public Character getLrgastoplanfijo() {
        return lrgastoplanfijo;
    }

    public void setLrgastoplanfijo(Character lrgastoplanfijo) {
        this.lrgastoplanfijo = lrgastoplanfijo;
    }

    public Character getLrgastoplanporc() {
        return lrgastoplanporc;
    }

    public void setLrgastoplanporc(Character lrgastoplanporc) {
        this.lrgastoplanporc = lrgastoplanporc;
    }

    public BigDecimal getLrgastoplanvalor() {
        return lrgastoplanvalor;
    }

    public void setLrgastoplanvalor(BigDecimal lrgastoplanvalor) {
        this.lrgastoplanvalor = lrgastoplanvalor;
    }

    public Character getLrgastoplanpordefecto() {
        return lrgastoplanpordefecto;
    }

    public void setLrgastoplanpordefecto(Character lrgastoplanpordefecto) {
        this.lrgastoplanpordefecto = lrgastoplanpordefecto;
    }

    public Character getLrgastoplanac() {
        return lrgastoplanac;
    }

    public void setLrgastoplanac(Character lrgastoplanac) {
        this.lrgastoplanac = lrgastoplanac;
    }

    public String getLrgastoplanual() {
        return lrgastoplanual;
    }

    public void setLrgastoplanual(String lrgastoplanual) {
        this.lrgastoplanual = lrgastoplanual;
    }

    public Date getLrgastoplanfal() {
        return lrgastoplanfal;
    }

    public void setLrgastoplanfal(Date lrgastoplanfal) {
        this.lrgastoplanfal = lrgastoplanfal;
    }

    public String getLrgastoplanumd() {
        return lrgastoplanumd;
    }

    public void setLrgastoplanumd(String lrgastoplanumd) {
        this.lrgastoplanumd = lrgastoplanumd;
    }

    public Date getLrgastoplanfmd() {
        return lrgastoplanfmd;
    }

    public void setLrgastoplanfmd(Date lrgastoplanfmd) {
        this.lrgastoplanfmd = lrgastoplanfmd;
    }

    public Lrparmcotiplansecc getLrparmcotiplansecc() {
        return lrparmcotiplansecc;
    }

    public void setLrparmcotiplansecc(Lrparmcotiplansecc lrparmcotiplansecc) {
        this.lrparmcotiplansecc = lrparmcotiplansecc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrgastoplanPK != null ? lrgastoplanPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrgastoplan)) {
            return false;
        }
        Lrgastoplan other = (Lrgastoplan) object;
        if ((this.lrgastoplanPK == null && other.lrgastoplanPK != null) || (this.lrgastoplanPK != null && !this.lrgastoplanPK.equals(other.lrgastoplanPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrgastoplan[ lrgastoplanPK=" + lrgastoplanPK + " ]";
    }
    
}
