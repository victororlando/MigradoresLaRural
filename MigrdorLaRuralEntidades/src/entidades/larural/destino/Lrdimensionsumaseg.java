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
@Table(name = "LRDIMENSIONSUMASEG")
@NamedQueries({
    @NamedQuery(name = "Lrdimensionsumaseg.findAll", query = "SELECT l FROM Lrdimensionsumaseg l"),
    @NamedQuery(name = "Lrdimensionsumaseg.findByLrdimensionsumasegid", query = "SELECT l FROM Lrdimensionsumaseg l WHERE l.lrdimensionsumasegid = :lrdimensionsumasegid"),
    @NamedQuery(name = "Lrdimensionsumaseg.findByLrdimensionsumasegmonid", query = "SELECT l FROM Lrdimensionsumaseg l WHERE l.lrdimensionsumasegmonid = :lrdimensionsumasegmonid"),
    @NamedQuery(name = "Lrdimensionsumaseg.findByLrdimensionsumasegdesde", query = "SELECT l FROM Lrdimensionsumaseg l WHERE l.lrdimensionsumasegdesde = :lrdimensionsumasegdesde"),
    @NamedQuery(name = "Lrdimensionsumaseg.findByLrdimensionsumaseghasta", query = "SELECT l FROM Lrdimensionsumaseg l WHERE l.lrdimensionsumaseghasta = :lrdimensionsumaseghasta"),
    @NamedQuery(name = "Lrdimensionsumaseg.findByLrdimensionsumasegfijo", query = "SELECT l FROM Lrdimensionsumaseg l WHERE l.lrdimensionsumasegfijo = :lrdimensionsumasegfijo"),
    @NamedQuery(name = "Lrdimensionsumaseg.findByLrdimensionsumasegpuntaje", query = "SELECT l FROM Lrdimensionsumaseg l WHERE l.lrdimensionsumasegpuntaje = :lrdimensionsumasegpuntaje"),
    @NamedQuery(name = "Lrdimensionsumaseg.findByLrdimensionsumasegact", query = "SELECT l FROM Lrdimensionsumaseg l WHERE l.lrdimensionsumasegact = :lrdimensionsumasegact"),
    @NamedQuery(name = "Lrdimensionsumaseg.findByLrdimensionsumasegual", query = "SELECT l FROM Lrdimensionsumaseg l WHERE l.lrdimensionsumasegual = :lrdimensionsumasegual"),
    @NamedQuery(name = "Lrdimensionsumaseg.findByLrdimensionsumasegfal", query = "SELECT l FROM Lrdimensionsumaseg l WHERE l.lrdimensionsumasegfal = :lrdimensionsumasegfal"),
    @NamedQuery(name = "Lrdimensionsumaseg.findByLrdimensionsumasegumd", query = "SELECT l FROM Lrdimensionsumaseg l WHERE l.lrdimensionsumasegumd = :lrdimensionsumasegumd"),
    @NamedQuery(name = "Lrdimensionsumaseg.findByLrdimensionsumasegfmd", query = "SELECT l FROM Lrdimensionsumaseg l WHERE l.lrdimensionsumasegfmd = :lrdimensionsumasegfmd")})
public class Lrdimensionsumaseg implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONSUMASEGID", nullable = false)
    private Long lrdimensionsumasegid;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONSUMASEGMONID", nullable = false)
    private long lrdimensionsumasegmonid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONSUMASEGDESDE", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrdimensionsumasegdesde;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONSUMASEGHASTA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrdimensionsumaseghasta;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONSUMASEGFIJO", nullable = false)
    private Character lrdimensionsumasegfijo;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONSUMASEGPUNTAJE", nullable = false)
    private short lrdimensionsumasegpuntaje;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONSUMASEGACT", nullable = false)
    private Character lrdimensionsumasegact;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONSUMASEGUAL", nullable = false, length = 30)
    private String lrdimensionsumasegual;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONSUMASEGFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrdimensionsumasegfal;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONSUMASEGUMD", nullable = false, length = 30)
    private String lrdimensionsumasegumd;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONSUMASEGFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrdimensionsumasegfmd;
    @JoinColumn(name = "DSA_LRAREAID", referencedColumnName = "LRAREAID", nullable = false)
    @ManyToOne(optional = false)
    private Lrarea dsaLrareaid;
    @JoinColumn(name = "LRDIMENSIONID", referencedColumnName = "LRDIMENSIONID", nullable = false)
    @ManyToOne(optional = false)
    private Lrdimension lrdimensionid;
    @JoinColumn(name = "DSA_LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false)
    @ManyToOne(optional = false)
    private Lrseccdetalle dsaLrseccdetalleid;

    public Lrdimensionsumaseg() {
    }

    public Lrdimensionsumaseg(Long lrdimensionsumasegid) {
        this.lrdimensionsumasegid = lrdimensionsumasegid;
    }

    public Lrdimensionsumaseg(Long lrdimensionsumasegid, long lrdimensionsumasegmonid, BigDecimal lrdimensionsumasegdesde, BigDecimal lrdimensionsumaseghasta, Character lrdimensionsumasegfijo, short lrdimensionsumasegpuntaje, Character lrdimensionsumasegact, String lrdimensionsumasegual, Date lrdimensionsumasegfal, String lrdimensionsumasegumd, Date lrdimensionsumasegfmd) {
        this.lrdimensionsumasegid = lrdimensionsumasegid;
        this.lrdimensionsumasegmonid = lrdimensionsumasegmonid;
        this.lrdimensionsumasegdesde = lrdimensionsumasegdesde;
        this.lrdimensionsumaseghasta = lrdimensionsumaseghasta;
        this.lrdimensionsumasegfijo = lrdimensionsumasegfijo;
        this.lrdimensionsumasegpuntaje = lrdimensionsumasegpuntaje;
        this.lrdimensionsumasegact = lrdimensionsumasegact;
        this.lrdimensionsumasegual = lrdimensionsumasegual;
        this.lrdimensionsumasegfal = lrdimensionsumasegfal;
        this.lrdimensionsumasegumd = lrdimensionsumasegumd;
        this.lrdimensionsumasegfmd = lrdimensionsumasegfmd;
    }

    public Long getLrdimensionsumasegid() {
        return lrdimensionsumasegid;
    }

    public void setLrdimensionsumasegid(Long lrdimensionsumasegid) {
        this.lrdimensionsumasegid = lrdimensionsumasegid;
    }

    public long getLrdimensionsumasegmonid() {
        return lrdimensionsumasegmonid;
    }

    public void setLrdimensionsumasegmonid(long lrdimensionsumasegmonid) {
        this.lrdimensionsumasegmonid = lrdimensionsumasegmonid;
    }

    public BigDecimal getLrdimensionsumasegdesde() {
        return lrdimensionsumasegdesde;
    }

    public void setLrdimensionsumasegdesde(BigDecimal lrdimensionsumasegdesde) {
        this.lrdimensionsumasegdesde = lrdimensionsumasegdesde;
    }

    public BigDecimal getLrdimensionsumaseghasta() {
        return lrdimensionsumaseghasta;
    }

    public void setLrdimensionsumaseghasta(BigDecimal lrdimensionsumaseghasta) {
        this.lrdimensionsumaseghasta = lrdimensionsumaseghasta;
    }

    public Character getLrdimensionsumasegfijo() {
        return lrdimensionsumasegfijo;
    }

    public void setLrdimensionsumasegfijo(Character lrdimensionsumasegfijo) {
        this.lrdimensionsumasegfijo = lrdimensionsumasegfijo;
    }

    public short getLrdimensionsumasegpuntaje() {
        return lrdimensionsumasegpuntaje;
    }

    public void setLrdimensionsumasegpuntaje(short lrdimensionsumasegpuntaje) {
        this.lrdimensionsumasegpuntaje = lrdimensionsumasegpuntaje;
    }

    public Character getLrdimensionsumasegact() {
        return lrdimensionsumasegact;
    }

    public void setLrdimensionsumasegact(Character lrdimensionsumasegact) {
        this.lrdimensionsumasegact = lrdimensionsumasegact;
    }

    public String getLrdimensionsumasegual() {
        return lrdimensionsumasegual;
    }

    public void setLrdimensionsumasegual(String lrdimensionsumasegual) {
        this.lrdimensionsumasegual = lrdimensionsumasegual;
    }

    public Date getLrdimensionsumasegfal() {
        return lrdimensionsumasegfal;
    }

    public void setLrdimensionsumasegfal(Date lrdimensionsumasegfal) {
        this.lrdimensionsumasegfal = lrdimensionsumasegfal;
    }

    public String getLrdimensionsumasegumd() {
        return lrdimensionsumasegumd;
    }

    public void setLrdimensionsumasegumd(String lrdimensionsumasegumd) {
        this.lrdimensionsumasegumd = lrdimensionsumasegumd;
    }

    public Date getLrdimensionsumasegfmd() {
        return lrdimensionsumasegfmd;
    }

    public void setLrdimensionsumasegfmd(Date lrdimensionsumasegfmd) {
        this.lrdimensionsumasegfmd = lrdimensionsumasegfmd;
    }

    public Lrarea getDsaLrareaid() {
        return dsaLrareaid;
    }

    public void setDsaLrareaid(Lrarea dsaLrareaid) {
        this.dsaLrareaid = dsaLrareaid;
    }

    public Lrdimension getLrdimensionid() {
        return lrdimensionid;
    }

    public void setLrdimensionid(Lrdimension lrdimensionid) {
        this.lrdimensionid = lrdimensionid;
    }

    public Lrseccdetalle getDsaLrseccdetalleid() {
        return dsaLrseccdetalleid;
    }

    public void setDsaLrseccdetalleid(Lrseccdetalle dsaLrseccdetalleid) {
        this.dsaLrseccdetalleid = dsaLrseccdetalleid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrdimensionsumasegid != null ? lrdimensionsumasegid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrdimensionsumaseg)) {
            return false;
        }
        Lrdimensionsumaseg other = (Lrdimensionsumaseg) object;
        if ((this.lrdimensionsumasegid == null && other.lrdimensionsumasegid != null) || (this.lrdimensionsumasegid != null && !this.lrdimensionsumasegid.equals(other.lrdimensionsumasegid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrdimensionsumaseg[ lrdimensionsumasegid=" + lrdimensionsumasegid + " ]";
    }
    
}
