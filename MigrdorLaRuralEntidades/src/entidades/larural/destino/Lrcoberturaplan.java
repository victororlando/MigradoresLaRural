/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRCOBERTURAPLAN")
@NamedQueries({
    @NamedQuery(name = "Lrcoberturaplan.findAll", query = "SELECT l FROM Lrcoberturaplan l"),
    @NamedQuery(name = "Lrcoberturaplan.findByLrcoberturaplanid", query = "SELECT l FROM Lrcoberturaplan l WHERE l.lrcoberturaplanid = :lrcoberturaplanid"),
    @NamedQuery(name = "Lrcoberturaplan.findByLrseccdetalleid", query = "SELECT l FROM Lrcoberturaplan l WHERE l.lrseccdetalleid = :lrseccdetalleid"),
    @NamedQuery(name = "Lrcoberturaplan.findByLrparmcotiplanid", query = "SELECT l FROM Lrcoberturaplan l WHERE l.lrparmcotiplanid = :lrparmcotiplanid"),
    @NamedQuery(name = "Lrcoberturaplan.findByLrtipoplanid", query = "SELECT l FROM Lrcoberturaplan l WHERE l.lrtipoplanid = :lrtipoplanid"),
    @NamedQuery(name = "Lrcoberturaplan.findByLrmodocoberturaid", query = "SELECT l FROM Lrcoberturaplan l WHERE l.lrmodocoberturaid = :lrmodocoberturaid"),
    @NamedQuery(name = "Lrcoberturaplan.findByCoberturastipid", query = "SELECT l FROM Lrcoberturaplan l WHERE l.coberturastipid = :coberturastipid"),
    @NamedQuery(name = "Lrcoberturaplan.findByLrcoberturaplanpordefecto", query = "SELECT l FROM Lrcoberturaplan l WHERE l.lrcoberturaplanpordefecto = :lrcoberturaplanpordefecto"),
    @NamedQuery(name = "Lrcoberturaplan.findByLrcoberturaplanmonid", query = "SELECT l FROM Lrcoberturaplan l WHERE l.lrcoberturaplanmonid = :lrcoberturaplanmonid"),
    @NamedQuery(name = "Lrcoberturaplan.findByLrcoberturaplanfijo", query = "SELECT l FROM Lrcoberturaplan l WHERE l.lrcoberturaplanfijo = :lrcoberturaplanfijo"),
    @NamedQuery(name = "Lrcoberturaplan.findByLrcoberturaplanesporc", query = "SELECT l FROM Lrcoberturaplan l WHERE l.lrcoberturaplanesporc = :lrcoberturaplanesporc"),
    @NamedQuery(name = "Lrcoberturaplan.findByLrcoberturaplanbasica", query = "SELECT l FROM Lrcoberturaplan l WHERE l.lrcoberturaplanbasica = :lrcoberturaplanbasica"),
    @NamedQuery(name = "Lrcoberturaplan.findByLrcoberturaplanvalor", query = "SELECT l FROM Lrcoberturaplan l WHERE l.lrcoberturaplanvalor = :lrcoberturaplanvalor"),
    @NamedQuery(name = "Lrcoberturaplan.findByLrcoberturaplanac", query = "SELECT l FROM Lrcoberturaplan l WHERE l.lrcoberturaplanac = :lrcoberturaplanac"),
    @NamedQuery(name = "Lrcoberturaplan.findByLrcoberturaplanual", query = "SELECT l FROM Lrcoberturaplan l WHERE l.lrcoberturaplanual = :lrcoberturaplanual"),
    @NamedQuery(name = "Lrcoberturaplan.findByLrcoberturaplanfal", query = "SELECT l FROM Lrcoberturaplan l WHERE l.lrcoberturaplanfal = :lrcoberturaplanfal"),
    @NamedQuery(name = "Lrcoberturaplan.findByLrcoberturaplanumd", query = "SELECT l FROM Lrcoberturaplan l WHERE l.lrcoberturaplanumd = :lrcoberturaplanumd"),
    @NamedQuery(name = "Lrcoberturaplan.findByLrcoberturaplanfmd", query = "SELECT l FROM Lrcoberturaplan l WHERE l.lrcoberturaplanfmd = :lrcoberturaplanfmd"),
    @NamedQuery(name = "Lrcoberturaplan.findBySeccid", query = "SELECT l FROM Lrcoberturaplan l WHERE l.seccid = :seccid"),
    @NamedQuery(name = "Lrcoberturaplan.findByRiesgosaseid", query = "SELECT l FROM Lrcoberturaplan l WHERE l.riesgosaseid = :riesgosaseid")})
public class Lrcoberturaplan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCOBERTURAPLANID", nullable = false)
    private Long lrcoberturaplanid;
    @Basic(optional = false)
    @Column(name = "LRSECCDETALLEID", nullable = false)
    private long lrseccdetalleid;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIPLANID", nullable = false)
    private long lrparmcotiplanid;
    @Basic(optional = false)
    @Column(name = "LRTIPOPLANID", nullable = false)
    private long lrtipoplanid;
    @Basic(optional = false)
    @Column(name = "LRMODOCOBERTURAID", nullable = false)
    private long lrmodocoberturaid;
    @Basic(optional = false)
    @Column(name = "COBERTURASTIPID", nullable = false)
    private short coberturastipid;
    @Basic(optional = false)
    @Column(name = "LRCOBERTURAPLANPORDEFECTO", nullable = false)
    private Character lrcoberturaplanpordefecto;
    @Basic(optional = false)
    @Column(name = "LRCOBERTURAPLANMONID", nullable = false)
    private long lrcoberturaplanmonid;
    @Basic(optional = false)
    @Column(name = "LRCOBERTURAPLANFIJO", nullable = false)
    private Character lrcoberturaplanfijo;
    @Basic(optional = false)
    @Column(name = "LRCOBERTURAPLANESPORC", nullable = false)
    private Character lrcoberturaplanesporc;
    @Basic(optional = false)
    @Column(name = "LRCOBERTURAPLANBASICA", nullable = false)
    private Character lrcoberturaplanbasica;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRCOBERTURAPLANVALOR", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcoberturaplanvalor;
    @Basic(optional = false)
    @Column(name = "LRCOBERTURAPLANAC", nullable = false)
    private Character lrcoberturaplanac;
    @Column(name = "LRCOBERTURAPLANUAL", length = 30)
    private String lrcoberturaplanual;
    @Column(name = "LRCOBERTURAPLANFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcoberturaplanfal;
    @Column(name = "LRCOBERTURAPLANUMD", length = 30)
    private String lrcoberturaplanumd;
    @Column(name = "LRCOBERTURAPLANFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcoberturaplanfmd;
    @Basic(optional = false)
    @Column(name = "SECCID", nullable = false)
    private short seccid;
    @Basic(optional = false)
    @Column(name = "RIESGOSASEID", nullable = false)
    private short riesgosaseid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "scoberturaplanid")
    private List<Lrcotiplanbiencobertura> lrcotiplanbiencoberturaList;

    public Lrcoberturaplan() {
    }

    public Lrcoberturaplan(Long lrcoberturaplanid) {
        this.lrcoberturaplanid = lrcoberturaplanid;
    }

    public Lrcoberturaplan(Long lrcoberturaplanid, long lrseccdetalleid, long lrparmcotiplanid, long lrtipoplanid, long lrmodocoberturaid, short coberturastipid, Character lrcoberturaplanpordefecto, long lrcoberturaplanmonid, Character lrcoberturaplanfijo, Character lrcoberturaplanesporc, Character lrcoberturaplanbasica, BigDecimal lrcoberturaplanvalor, Character lrcoberturaplanac, short seccid, short riesgosaseid) {
        this.lrcoberturaplanid = lrcoberturaplanid;
        this.lrseccdetalleid = lrseccdetalleid;
        this.lrparmcotiplanid = lrparmcotiplanid;
        this.lrtipoplanid = lrtipoplanid;
        this.lrmodocoberturaid = lrmodocoberturaid;
        this.coberturastipid = coberturastipid;
        this.lrcoberturaplanpordefecto = lrcoberturaplanpordefecto;
        this.lrcoberturaplanmonid = lrcoberturaplanmonid;
        this.lrcoberturaplanfijo = lrcoberturaplanfijo;
        this.lrcoberturaplanesporc = lrcoberturaplanesporc;
        this.lrcoberturaplanbasica = lrcoberturaplanbasica;
        this.lrcoberturaplanvalor = lrcoberturaplanvalor;
        this.lrcoberturaplanac = lrcoberturaplanac;
        this.seccid = seccid;
        this.riesgosaseid = riesgosaseid;
    }

    public Long getLrcoberturaplanid() {
        return lrcoberturaplanid;
    }

    public void setLrcoberturaplanid(Long lrcoberturaplanid) {
        this.lrcoberturaplanid = lrcoberturaplanid;
    }

    public long getLrseccdetalleid() {
        return lrseccdetalleid;
    }

    public void setLrseccdetalleid(long lrseccdetalleid) {
        this.lrseccdetalleid = lrseccdetalleid;
    }

    public long getLrparmcotiplanid() {
        return lrparmcotiplanid;
    }

    public void setLrparmcotiplanid(long lrparmcotiplanid) {
        this.lrparmcotiplanid = lrparmcotiplanid;
    }

    public long getLrtipoplanid() {
        return lrtipoplanid;
    }

    public void setLrtipoplanid(long lrtipoplanid) {
        this.lrtipoplanid = lrtipoplanid;
    }

    public long getLrmodocoberturaid() {
        return lrmodocoberturaid;
    }

    public void setLrmodocoberturaid(long lrmodocoberturaid) {
        this.lrmodocoberturaid = lrmodocoberturaid;
    }

    public short getCoberturastipid() {
        return coberturastipid;
    }

    public void setCoberturastipid(short coberturastipid) {
        this.coberturastipid = coberturastipid;
    }

    public Character getLrcoberturaplanpordefecto() {
        return lrcoberturaplanpordefecto;
    }

    public void setLrcoberturaplanpordefecto(Character lrcoberturaplanpordefecto) {
        this.lrcoberturaplanpordefecto = lrcoberturaplanpordefecto;
    }

    public long getLrcoberturaplanmonid() {
        return lrcoberturaplanmonid;
    }

    public void setLrcoberturaplanmonid(long lrcoberturaplanmonid) {
        this.lrcoberturaplanmonid = lrcoberturaplanmonid;
    }

    public Character getLrcoberturaplanfijo() {
        return lrcoberturaplanfijo;
    }

    public void setLrcoberturaplanfijo(Character lrcoberturaplanfijo) {
        this.lrcoberturaplanfijo = lrcoberturaplanfijo;
    }

    public Character getLrcoberturaplanesporc() {
        return lrcoberturaplanesporc;
    }

    public void setLrcoberturaplanesporc(Character lrcoberturaplanesporc) {
        this.lrcoberturaplanesporc = lrcoberturaplanesporc;
    }

    public Character getLrcoberturaplanbasica() {
        return lrcoberturaplanbasica;
    }

    public void setLrcoberturaplanbasica(Character lrcoberturaplanbasica) {
        this.lrcoberturaplanbasica = lrcoberturaplanbasica;
    }

    public BigDecimal getLrcoberturaplanvalor() {
        return lrcoberturaplanvalor;
    }

    public void setLrcoberturaplanvalor(BigDecimal lrcoberturaplanvalor) {
        this.lrcoberturaplanvalor = lrcoberturaplanvalor;
    }

    public Character getLrcoberturaplanac() {
        return lrcoberturaplanac;
    }

    public void setLrcoberturaplanac(Character lrcoberturaplanac) {
        this.lrcoberturaplanac = lrcoberturaplanac;
    }

    public String getLrcoberturaplanual() {
        return lrcoberturaplanual;
    }

    public void setLrcoberturaplanual(String lrcoberturaplanual) {
        this.lrcoberturaplanual = lrcoberturaplanual;
    }

    public Date getLrcoberturaplanfal() {
        return lrcoberturaplanfal;
    }

    public void setLrcoberturaplanfal(Date lrcoberturaplanfal) {
        this.lrcoberturaplanfal = lrcoberturaplanfal;
    }

    public String getLrcoberturaplanumd() {
        return lrcoberturaplanumd;
    }

    public void setLrcoberturaplanumd(String lrcoberturaplanumd) {
        this.lrcoberturaplanumd = lrcoberturaplanumd;
    }

    public Date getLrcoberturaplanfmd() {
        return lrcoberturaplanfmd;
    }

    public void setLrcoberturaplanfmd(Date lrcoberturaplanfmd) {
        this.lrcoberturaplanfmd = lrcoberturaplanfmd;
    }

    public short getSeccid() {
        return seccid;
    }

    public void setSeccid(short seccid) {
        this.seccid = seccid;
    }

    public short getRiesgosaseid() {
        return riesgosaseid;
    }

    public void setRiesgosaseid(short riesgosaseid) {
        this.riesgosaseid = riesgosaseid;
    }

    public List<Lrcotiplanbiencobertura> getLrcotiplanbiencoberturaList() {
        return lrcotiplanbiencoberturaList;
    }

    public void setLrcotiplanbiencoberturaList(List<Lrcotiplanbiencobertura> lrcotiplanbiencoberturaList) {
        this.lrcotiplanbiencoberturaList = lrcotiplanbiencoberturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcoberturaplanid != null ? lrcoberturaplanid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcoberturaplan)) {
            return false;
        }
        Lrcoberturaplan other = (Lrcoberturaplan) object;
        if ((this.lrcoberturaplanid == null && other.lrcoberturaplanid != null) || (this.lrcoberturaplanid != null && !this.lrcoberturaplanid.equals(other.lrcoberturaplanid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcoberturaplan[ lrcoberturaplanid=" + lrcoberturaplanid + " ]";
    }
    
}
