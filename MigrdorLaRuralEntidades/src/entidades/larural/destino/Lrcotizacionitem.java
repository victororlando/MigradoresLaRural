/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
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
@Table(name = "LRCOTIZACIONITEM")
@NamedQueries({
    @NamedQuery(name = "Lrcotizacionitem.findAll", query = "SELECT l FROM Lrcotizacionitem l"),
    @NamedQuery(name = "Lrcotizacionitem.findByLrcotizacionitemid", query = "SELECT l FROM Lrcotizacionitem l WHERE l.lrcotizacionitemid = :lrcotizacionitemid"),
    @NamedQuery(name = "Lrcotizacionitem.findBySseccdetalleid", query = "SELECT l FROM Lrcotizacionitem l WHERE l.sseccdetalleid = :sseccdetalleid"),
    @NamedQuery(name = "Lrcotizacionitem.findByStipoplanid", query = "SELECT l FROM Lrcotizacionitem l WHERE l.stipoplanid = :stipoplanid"),
    @NamedQuery(name = "Lrcotizacionitem.findBySparmcotiplanid", query = "SELECT l FROM Lrcotizacionitem l WHERE l.sparmcotiplanid = :sparmcotiplanid"),
    @NamedQuery(name = "Lrcotizacionitem.findByScotizacionversion", query = "SELECT l FROM Lrcotizacionitem l WHERE l.scotizacionversion = :scotizacionversion"),
    @NamedQuery(name = "Lrcotizacionitem.findByScotidatbienaseid", query = "SELECT l FROM Lrcotizacionitem l WHERE l.scotidatbienaseid = :scotidatbienaseid"),
    @NamedQuery(name = "Lrcotizacionitem.findByLrcotizacionitemformula", query = "SELECT l FROM Lrcotizacionitem l WHERE l.lrcotizacionitemformula = :lrcotizacionitemformula"),
    @NamedQuery(name = "Lrcotizacionitem.findByLrcotizacionitemformularesul", query = "SELECT l FROM Lrcotizacionitem l WHERE l.lrcotizacionitemformularesul = :lrcotizacionitemformularesul"),
    @NamedQuery(name = "Lrcotizacionitem.findByLrcotizacionitemformulavalor", query = "SELECT l FROM Lrcotizacionitem l WHERE l.lrcotizacionitemformulavalor = :lrcotizacionitemformulavalor"),
    @NamedQuery(name = "Lrcotizacionitem.findByLrcotizacionitemordenejec", query = "SELECT l FROM Lrcotizacionitem l WHERE l.lrcotizacionitemordenejec = :lrcotizacionitemordenejec"),
    @NamedQuery(name = "Lrcotizacionitem.findByLrcotizacionitemordenvisual", query = "SELECT l FROM Lrcotizacionitem l WHERE l.lrcotizacionitemordenvisual = :lrcotizacionitemordenvisual"),
    @NamedQuery(name = "Lrcotizacionitem.findByLrcotizacionitemcampaux", query = "SELECT l FROM Lrcotizacionitem l WHERE l.lrcotizacionitemcampaux = :lrcotizacionitemcampaux"),
    @NamedQuery(name = "Lrcotizacionitem.findByLrcotizacionitemcotfin", query = "SELECT l FROM Lrcotizacionitem l WHERE l.lrcotizacionitemcotfin = :lrcotizacionitemcotfin"),
    @NamedQuery(name = "Lrcotizacionitem.findByLrcotizacionitemimprime", query = "SELECT l FROM Lrcotizacionitem l WHERE l.lrcotizacionitemimprime = :lrcotizacionitemimprime"),
    @NamedQuery(name = "Lrcotizacionitem.findByLrcotizacionitemmuestravalc", query = "SELECT l FROM Lrcotizacionitem l WHERE l.lrcotizacionitemmuestravalc = :lrcotizacionitemmuestravalc"),
    @NamedQuery(name = "Lrcotizacionitem.findByLrcotizacionitemordenimpre", query = "SELECT l FROM Lrcotizacionitem l WHERE l.lrcotizacionitemordenimpre = :lrcotizacionitemordenimpre"),
    @NamedQuery(name = "Lrcotizacionitem.findByLrcotizacionitemual", query = "SELECT l FROM Lrcotizacionitem l WHERE l.lrcotizacionitemual = :lrcotizacionitemual"),
    @NamedQuery(name = "Lrcotizacionitem.findByLrcotizacionitemfal", query = "SELECT l FROM Lrcotizacionitem l WHERE l.lrcotizacionitemfal = :lrcotizacionitemfal"),
    @NamedQuery(name = "Lrcotizacionitem.findByLrcotizacionitemumd", query = "SELECT l FROM Lrcotizacionitem l WHERE l.lrcotizacionitemumd = :lrcotizacionitemumd"),
    @NamedQuery(name = "Lrcotizacionitem.findByLrcotizacionitemfmd", query = "SELECT l FROM Lrcotizacionitem l WHERE l.lrcotizacionitemfmd = :lrcotizacionitemfmd"),
    @NamedQuery(name = "Lrcotizacionitem.findByLrcotizacionnro", query = "SELECT l FROM Lrcotizacionitem l WHERE l.lrcotizacionnro = :lrcotizacionnro")})
public class Lrcotizacionitem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONITEMID", nullable = false)
    private Long lrcotizacionitemid;
    @Basic(optional = false)
    @Column(name = "SSECCDETALLEID", nullable = false)
    private long sseccdetalleid;
    @Basic(optional = false)
    @Column(name = "STIPOPLANID", nullable = false)
    private long stipoplanid;
    @Basic(optional = false)
    @Column(name = "SPARMCOTIPLANID", nullable = false)
    private long sparmcotiplanid;
    @Basic(optional = false)
    @Column(name = "SCOTIZACIONVERSION", nullable = false)
    private long scotizacionversion;
    @Basic(optional = false)
    @Column(name = "SCOTIDATBIENASEID", nullable = false)
    private long scotidatbienaseid;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONITEMFORMULA", nullable = false, length = 4000)
    private String lrcotizacionitemformula;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONITEMFORMULARESUL", nullable = false, length = 4000)
    private String lrcotizacionitemformularesul;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONITEMFORMULAVALOR", nullable = false, length = 4000)
    private String lrcotizacionitemformulavalor;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONITEMORDENEJEC", nullable = false)
    private short lrcotizacionitemordenejec;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONITEMORDENVISUAL", nullable = false)
    private long lrcotizacionitemordenvisual;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONITEMCAMPAUX", nullable = false)
    private Character lrcotizacionitemcampaux;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONITEMCOTFIN", nullable = false)
    private Character lrcotizacionitemcotfin;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONITEMIMPRIME", nullable = false)
    private Character lrcotizacionitemimprime;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONITEMMUESTRAVALC", nullable = false)
    private Character lrcotizacionitemmuestravalc;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONITEMORDENIMPRE", nullable = false)
    private short lrcotizacionitemordenimpre;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONITEMUAL", nullable = false, length = 30)
    private String lrcotizacionitemual;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONITEMFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotizacionitemfal;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONITEMUMD", nullable = false, length = 30)
    private String lrcotizacionitemumd;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONITEMFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotizacionitemfmd;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONNRO", nullable = false)
    private long lrcotizacionnro;
    @JoinColumn(name = "LRPARMITEMID", referencedColumnName = "LRPARMITEMID", nullable = false)
    @ManyToOne(optional = false)
    private Lrparmitem lrparmitemid;

    public Lrcotizacionitem() {
    }

    public Lrcotizacionitem(Long lrcotizacionitemid) {
        this.lrcotizacionitemid = lrcotizacionitemid;
    }

    public Lrcotizacionitem(Long lrcotizacionitemid, long sseccdetalleid, long stipoplanid, long sparmcotiplanid, long scotizacionversion, long scotidatbienaseid, String lrcotizacionitemformula, String lrcotizacionitemformularesul, String lrcotizacionitemformulavalor, short lrcotizacionitemordenejec, long lrcotizacionitemordenvisual, Character lrcotizacionitemcampaux, Character lrcotizacionitemcotfin, Character lrcotizacionitemimprime, Character lrcotizacionitemmuestravalc, short lrcotizacionitemordenimpre, String lrcotizacionitemual, Date lrcotizacionitemfal, String lrcotizacionitemumd, Date lrcotizacionitemfmd, long lrcotizacionnro) {
        this.lrcotizacionitemid = lrcotizacionitemid;
        this.sseccdetalleid = sseccdetalleid;
        this.stipoplanid = stipoplanid;
        this.sparmcotiplanid = sparmcotiplanid;
        this.scotizacionversion = scotizacionversion;
        this.scotidatbienaseid = scotidatbienaseid;
        this.lrcotizacionitemformula = lrcotizacionitemformula;
        this.lrcotizacionitemformularesul = lrcotizacionitemformularesul;
        this.lrcotizacionitemformulavalor = lrcotizacionitemformulavalor;
        this.lrcotizacionitemordenejec = lrcotizacionitemordenejec;
        this.lrcotizacionitemordenvisual = lrcotizacionitemordenvisual;
        this.lrcotizacionitemcampaux = lrcotizacionitemcampaux;
        this.lrcotizacionitemcotfin = lrcotizacionitemcotfin;
        this.lrcotizacionitemimprime = lrcotizacionitemimprime;
        this.lrcotizacionitemmuestravalc = lrcotizacionitemmuestravalc;
        this.lrcotizacionitemordenimpre = lrcotizacionitemordenimpre;
        this.lrcotizacionitemual = lrcotizacionitemual;
        this.lrcotizacionitemfal = lrcotizacionitemfal;
        this.lrcotizacionitemumd = lrcotizacionitemumd;
        this.lrcotizacionitemfmd = lrcotizacionitemfmd;
        this.lrcotizacionnro = lrcotizacionnro;
    }

    public Long getLrcotizacionitemid() {
        return lrcotizacionitemid;
    }

    public void setLrcotizacionitemid(Long lrcotizacionitemid) {
        this.lrcotizacionitemid = lrcotizacionitemid;
    }

    public long getSseccdetalleid() {
        return sseccdetalleid;
    }

    public void setSseccdetalleid(long sseccdetalleid) {
        this.sseccdetalleid = sseccdetalleid;
    }

    public long getStipoplanid() {
        return stipoplanid;
    }

    public void setStipoplanid(long stipoplanid) {
        this.stipoplanid = stipoplanid;
    }

    public long getSparmcotiplanid() {
        return sparmcotiplanid;
    }

    public void setSparmcotiplanid(long sparmcotiplanid) {
        this.sparmcotiplanid = sparmcotiplanid;
    }

    public long getScotizacionversion() {
        return scotizacionversion;
    }

    public void setScotizacionversion(long scotizacionversion) {
        this.scotizacionversion = scotizacionversion;
    }

    public long getScotidatbienaseid() {
        return scotidatbienaseid;
    }

    public void setScotidatbienaseid(long scotidatbienaseid) {
        this.scotidatbienaseid = scotidatbienaseid;
    }

    public String getLrcotizacionitemformula() {
        return lrcotizacionitemformula;
    }

    public void setLrcotizacionitemformula(String lrcotizacionitemformula) {
        this.lrcotizacionitemformula = lrcotizacionitemformula;
    }

    public String getLrcotizacionitemformularesul() {
        return lrcotizacionitemformularesul;
    }

    public void setLrcotizacionitemformularesul(String lrcotizacionitemformularesul) {
        this.lrcotizacionitemformularesul = lrcotizacionitemformularesul;
    }

    public String getLrcotizacionitemformulavalor() {
        return lrcotizacionitemformulavalor;
    }

    public void setLrcotizacionitemformulavalor(String lrcotizacionitemformulavalor) {
        this.lrcotizacionitemformulavalor = lrcotizacionitemformulavalor;
    }

    public short getLrcotizacionitemordenejec() {
        return lrcotizacionitemordenejec;
    }

    public void setLrcotizacionitemordenejec(short lrcotizacionitemordenejec) {
        this.lrcotizacionitemordenejec = lrcotizacionitemordenejec;
    }

    public long getLrcotizacionitemordenvisual() {
        return lrcotizacionitemordenvisual;
    }

    public void setLrcotizacionitemordenvisual(long lrcotizacionitemordenvisual) {
        this.lrcotizacionitemordenvisual = lrcotizacionitemordenvisual;
    }

    public Character getLrcotizacionitemcampaux() {
        return lrcotizacionitemcampaux;
    }

    public void setLrcotizacionitemcampaux(Character lrcotizacionitemcampaux) {
        this.lrcotizacionitemcampaux = lrcotizacionitemcampaux;
    }

    public Character getLrcotizacionitemcotfin() {
        return lrcotizacionitemcotfin;
    }

    public void setLrcotizacionitemcotfin(Character lrcotizacionitemcotfin) {
        this.lrcotizacionitemcotfin = lrcotizacionitemcotfin;
    }

    public Character getLrcotizacionitemimprime() {
        return lrcotizacionitemimprime;
    }

    public void setLrcotizacionitemimprime(Character lrcotizacionitemimprime) {
        this.lrcotizacionitemimprime = lrcotizacionitemimprime;
    }

    public Character getLrcotizacionitemmuestravalc() {
        return lrcotizacionitemmuestravalc;
    }

    public void setLrcotizacionitemmuestravalc(Character lrcotizacionitemmuestravalc) {
        this.lrcotizacionitemmuestravalc = lrcotizacionitemmuestravalc;
    }

    public short getLrcotizacionitemordenimpre() {
        return lrcotizacionitemordenimpre;
    }

    public void setLrcotizacionitemordenimpre(short lrcotizacionitemordenimpre) {
        this.lrcotizacionitemordenimpre = lrcotizacionitemordenimpre;
    }

    public String getLrcotizacionitemual() {
        return lrcotizacionitemual;
    }

    public void setLrcotizacionitemual(String lrcotizacionitemual) {
        this.lrcotizacionitemual = lrcotizacionitemual;
    }

    public Date getLrcotizacionitemfal() {
        return lrcotizacionitemfal;
    }

    public void setLrcotizacionitemfal(Date lrcotizacionitemfal) {
        this.lrcotizacionitemfal = lrcotizacionitemfal;
    }

    public String getLrcotizacionitemumd() {
        return lrcotizacionitemumd;
    }

    public void setLrcotizacionitemumd(String lrcotizacionitemumd) {
        this.lrcotizacionitemumd = lrcotizacionitemumd;
    }

    public Date getLrcotizacionitemfmd() {
        return lrcotizacionitemfmd;
    }

    public void setLrcotizacionitemfmd(Date lrcotizacionitemfmd) {
        this.lrcotizacionitemfmd = lrcotizacionitemfmd;
    }

    public long getLrcotizacionnro() {
        return lrcotizacionnro;
    }

    public void setLrcotizacionnro(long lrcotizacionnro) {
        this.lrcotizacionnro = lrcotizacionnro;
    }

    public Lrparmitem getLrparmitemid() {
        return lrparmitemid;
    }

    public void setLrparmitemid(Lrparmitem lrparmitemid) {
        this.lrparmitemid = lrparmitemid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcotizacionitemid != null ? lrcotizacionitemid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcotizacionitem)) {
            return false;
        }
        Lrcotizacionitem other = (Lrcotizacionitem) object;
        if ((this.lrcotizacionitemid == null && other.lrcotizacionitemid != null) || (this.lrcotizacionitemid != null && !this.lrcotizacionitemid.equals(other.lrcotizacionitemid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcotizacionitem[ lrcotizacionitemid=" + lrcotizacionitemid + " ]";
    }
    
}
