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
@Table(name = "LRTIPOFRANQUICIAPLAN")
@NamedQueries({
    @NamedQuery(name = "Lrtipofranquiciaplan.findAll", query = "SELECT l FROM Lrtipofranquiciaplan l"),
    @NamedQuery(name = "Lrtipofranquiciaplan.findByLrtipofranquiciaplanid", query = "SELECT l FROM Lrtipofranquiciaplan l WHERE l.lrtipofranquiciaplanid = :lrtipofranquiciaplanid"),
    @NamedQuery(name = "Lrtipofranquiciaplan.findByLrtipofranquiciaplantipfranqid", query = "SELECT l FROM Lrtipofranquiciaplan l WHERE l.lrtipofranquiciaplantipfranqid = :lrtipofranquiciaplantipfranqid"),
    @NamedQuery(name = "Lrtipofranquiciaplan.findByLrtipofranquiciaplanfijo", query = "SELECT l FROM Lrtipofranquiciaplan l WHERE l.lrtipofranquiciaplanfijo = :lrtipofranquiciaplanfijo"),
    @NamedQuery(name = "Lrtipofranquiciaplan.findByLrtipofranquiciaplanesporc", query = "SELECT l FROM Lrtipofranquiciaplan l WHERE l.lrtipofranquiciaplanesporc = :lrtipofranquiciaplanesporc"),
    @NamedQuery(name = "Lrtipofranquiciaplan.findByLrtipofranquiciaplanvalor", query = "SELECT l FROM Lrtipofranquiciaplan l WHERE l.lrtipofranquiciaplanvalor = :lrtipofranquiciaplanvalor"),
    @NamedQuery(name = "Lrtipofranquiciaplan.findByLrtipofranquiciaplanac", query = "SELECT l FROM Lrtipofranquiciaplan l WHERE l.lrtipofranquiciaplanac = :lrtipofranquiciaplanac"),
    @NamedQuery(name = "Lrtipofranquiciaplan.findByLrtipofranquiciaplanual", query = "SELECT l FROM Lrtipofranquiciaplan l WHERE l.lrtipofranquiciaplanual = :lrtipofranquiciaplanual"),
    @NamedQuery(name = "Lrtipofranquiciaplan.findByLrtipofranquiciaplanfal", query = "SELECT l FROM Lrtipofranquiciaplan l WHERE l.lrtipofranquiciaplanfal = :lrtipofranquiciaplanfal"),
    @NamedQuery(name = "Lrtipofranquiciaplan.findByLrtipofranquiciaplanumd", query = "SELECT l FROM Lrtipofranquiciaplan l WHERE l.lrtipofranquiciaplanumd = :lrtipofranquiciaplanumd"),
    @NamedQuery(name = "Lrtipofranquiciaplan.findByLrtipofranquiciaplanfmd", query = "SELECT l FROM Lrtipofranquiciaplan l WHERE l.lrtipofranquiciaplanfmd = :lrtipofranquiciaplanfmd"),
    @NamedQuery(name = "Lrtipofranquiciaplan.findByMonid", query = "SELECT l FROM Lrtipofranquiciaplan l WHERE l.monid = :monid")})
public class Lrtipofranquiciaplan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRTIPOFRANQUICIAPLANID", nullable = false)
    private Long lrtipofranquiciaplanid;
    @Basic(optional = false)
    @Column(name = "LRTIPOFRANQUICIAPLANTIPFRANQID", nullable = false)
    private long lrtipofranquiciaplantipfranqid;
    @Basic(optional = false)
    @Column(name = "LRTIPOFRANQUICIAPLANFIJO", nullable = false)
    private Character lrtipofranquiciaplanfijo;
    @Basic(optional = false)
    @Column(name = "LRTIPOFRANQUICIAPLANESPORC", nullable = false)
    private Character lrtipofranquiciaplanesporc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRTIPOFRANQUICIAPLANVALOR", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrtipofranquiciaplanvalor;
    @Basic(optional = false)
    @Column(name = "LRTIPOFRANQUICIAPLANAC", nullable = false)
    private Character lrtipofranquiciaplanac;
    @Basic(optional = false)
    @Column(name = "LRTIPOFRANQUICIAPLANUAL", nullable = false, length = 30)
    private String lrtipofranquiciaplanual;
    @Basic(optional = false)
    @Column(name = "LRTIPOFRANQUICIAPLANFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtipofranquiciaplanfal;
    @Column(name = "LRTIPOFRANQUICIAPLANUMD", length = 30)
    private String lrtipofranquiciaplanumd;
    @Column(name = "LRTIPOFRANQUICIAPLANFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtipofranquiciaplanfmd;
    @Basic(optional = false)
    @Column(name = "MONID", nullable = false)
    private short monid;
    @JoinColumns({
        @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false),
        @JoinColumn(name = "LRPARMCOTIPLANID", referencedColumnName = "LRPARMCOTIPLANID", nullable = false),
        @JoinColumn(name = "LRTIPOPLANID", referencedColumnName = "LRTIPOPLANID", nullable = false)})
    @ManyToOne(optional = false)
    private Lrparmcotiplansecc lrparmcotiplansecc;

    public Lrtipofranquiciaplan() {
    }

    public Lrtipofranquiciaplan(Long lrtipofranquiciaplanid) {
        this.lrtipofranquiciaplanid = lrtipofranquiciaplanid;
    }

    public Lrtipofranquiciaplan(Long lrtipofranquiciaplanid, long lrtipofranquiciaplantipfranqid, Character lrtipofranquiciaplanfijo, Character lrtipofranquiciaplanesporc, BigDecimal lrtipofranquiciaplanvalor, Character lrtipofranquiciaplanac, String lrtipofranquiciaplanual, Date lrtipofranquiciaplanfal, short monid) {
        this.lrtipofranquiciaplanid = lrtipofranquiciaplanid;
        this.lrtipofranquiciaplantipfranqid = lrtipofranquiciaplantipfranqid;
        this.lrtipofranquiciaplanfijo = lrtipofranquiciaplanfijo;
        this.lrtipofranquiciaplanesporc = lrtipofranquiciaplanesporc;
        this.lrtipofranquiciaplanvalor = lrtipofranquiciaplanvalor;
        this.lrtipofranquiciaplanac = lrtipofranquiciaplanac;
        this.lrtipofranquiciaplanual = lrtipofranquiciaplanual;
        this.lrtipofranquiciaplanfal = lrtipofranquiciaplanfal;
        this.monid = monid;
    }

    public Long getLrtipofranquiciaplanid() {
        return lrtipofranquiciaplanid;
    }

    public void setLrtipofranquiciaplanid(Long lrtipofranquiciaplanid) {
        this.lrtipofranquiciaplanid = lrtipofranquiciaplanid;
    }

    public long getLrtipofranquiciaplantipfranqid() {
        return lrtipofranquiciaplantipfranqid;
    }

    public void setLrtipofranquiciaplantipfranqid(long lrtipofranquiciaplantipfranqid) {
        this.lrtipofranquiciaplantipfranqid = lrtipofranquiciaplantipfranqid;
    }

    public Character getLrtipofranquiciaplanfijo() {
        return lrtipofranquiciaplanfijo;
    }

    public void setLrtipofranquiciaplanfijo(Character lrtipofranquiciaplanfijo) {
        this.lrtipofranquiciaplanfijo = lrtipofranquiciaplanfijo;
    }

    public Character getLrtipofranquiciaplanesporc() {
        return lrtipofranquiciaplanesporc;
    }

    public void setLrtipofranquiciaplanesporc(Character lrtipofranquiciaplanesporc) {
        this.lrtipofranquiciaplanesporc = lrtipofranquiciaplanesporc;
    }

    public BigDecimal getLrtipofranquiciaplanvalor() {
        return lrtipofranquiciaplanvalor;
    }

    public void setLrtipofranquiciaplanvalor(BigDecimal lrtipofranquiciaplanvalor) {
        this.lrtipofranquiciaplanvalor = lrtipofranquiciaplanvalor;
    }

    public Character getLrtipofranquiciaplanac() {
        return lrtipofranquiciaplanac;
    }

    public void setLrtipofranquiciaplanac(Character lrtipofranquiciaplanac) {
        this.lrtipofranquiciaplanac = lrtipofranquiciaplanac;
    }

    public String getLrtipofranquiciaplanual() {
        return lrtipofranquiciaplanual;
    }

    public void setLrtipofranquiciaplanual(String lrtipofranquiciaplanual) {
        this.lrtipofranquiciaplanual = lrtipofranquiciaplanual;
    }

    public Date getLrtipofranquiciaplanfal() {
        return lrtipofranquiciaplanfal;
    }

    public void setLrtipofranquiciaplanfal(Date lrtipofranquiciaplanfal) {
        this.lrtipofranquiciaplanfal = lrtipofranquiciaplanfal;
    }

    public String getLrtipofranquiciaplanumd() {
        return lrtipofranquiciaplanumd;
    }

    public void setLrtipofranquiciaplanumd(String lrtipofranquiciaplanumd) {
        this.lrtipofranquiciaplanumd = lrtipofranquiciaplanumd;
    }

    public Date getLrtipofranquiciaplanfmd() {
        return lrtipofranquiciaplanfmd;
    }

    public void setLrtipofranquiciaplanfmd(Date lrtipofranquiciaplanfmd) {
        this.lrtipofranquiciaplanfmd = lrtipofranquiciaplanfmd;
    }

    public short getMonid() {
        return monid;
    }

    public void setMonid(short monid) {
        this.monid = monid;
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
        hash += (lrtipofranquiciaplanid != null ? lrtipofranquiciaplanid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtipofranquiciaplan)) {
            return false;
        }
        Lrtipofranquiciaplan other = (Lrtipofranquiciaplan) object;
        if ((this.lrtipofranquiciaplanid == null && other.lrtipofranquiciaplanid != null) || (this.lrtipofranquiciaplanid != null && !this.lrtipofranquiciaplanid.equals(other.lrtipofranquiciaplanid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtipofranquiciaplan[ lrtipofranquiciaplanid=" + lrtipofranquiciaplanid + " ]";
    }
    
}
