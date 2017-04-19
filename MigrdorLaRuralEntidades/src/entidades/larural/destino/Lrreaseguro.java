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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "LRREASEGURO")
@NamedQueries({
    @NamedQuery(name = "Lrreaseguro.findAll", query = "SELECT l FROM Lrreaseguro l"),
    @NamedQuery(name = "Lrreaseguro.findByLrreaseguroid", query = "SELECT l FROM Lrreaseguro l WHERE l.lrreaseguroid = :lrreaseguroid"),
    @NamedQuery(name = "Lrreaseguro.findByLrreaseguroimptotal", query = "SELECT l FROM Lrreaseguro l WHERE l.lrreaseguroimptotal = :lrreaseguroimptotal"),
    @NamedQuery(name = "Lrreaseguro.findByLrreaseguroac", query = "SELECT l FROM Lrreaseguro l WHERE l.lrreaseguroac = :lrreaseguroac"),
    @NamedQuery(name = "Lrreaseguro.findByLrreaseguroual", query = "SELECT l FROM Lrreaseguro l WHERE l.lrreaseguroual = :lrreaseguroual"),
    @NamedQuery(name = "Lrreaseguro.findByLrreasegurofal", query = "SELECT l FROM Lrreaseguro l WHERE l.lrreasegurofal = :lrreasegurofal"),
    @NamedQuery(name = "Lrreaseguro.findByLrreaseguroumd", query = "SELECT l FROM Lrreaseguro l WHERE l.lrreaseguroumd = :lrreaseguroumd"),
    @NamedQuery(name = "Lrreaseguro.findByLrreasegurofmd", query = "SELECT l FROM Lrreaseguro l WHERE l.lrreasegurofmd = :lrreasegurofmd")})
public class Lrreaseguro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRREASEGUROID", nullable = false)
    private Long lrreaseguroid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRREASEGUROIMPTOTAL", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrreaseguroimptotal;
    @Basic(optional = false)
    @Column(name = "LRREASEGUROAC", nullable = false)
    private Character lrreaseguroac;
    @Basic(optional = false)
    @Column(name = "LRREASEGUROUAL", nullable = false, length = 30)
    private String lrreaseguroual;
    @Basic(optional = false)
    @Column(name = "LRREASEGUROFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrreasegurofal;
    @Basic(optional = false)
    @Column(name = "LRREASEGUROUMD", nullable = false, length = 30)
    private String lrreaseguroumd;
    @Basic(optional = false)
    @Column(name = "LRREASEGUROFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrreasegurofmd;
    @JoinColumn(name = "LRTIPODISTREAID", referencedColumnName = "LRTIPODISTREAID", nullable = false)
    @ManyToOne(optional = false)
    private Lrtipodistrea lrtipodistreaid;
    @JoinColumn(name = "LRUBICACIONID", referencedColumnName = "LRUBICACIONID", nullable = false)
    @ManyToOne(optional = false)
    private Lrubicacion lrubicacionid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrreaseguroid")
    private List<Lrreasegurodet> lrreasegurodetList;

    public Lrreaseguro() {
    }

    public Lrreaseguro(Long lrreaseguroid) {
        this.lrreaseguroid = lrreaseguroid;
    }

    public Lrreaseguro(Long lrreaseguroid, BigDecimal lrreaseguroimptotal, Character lrreaseguroac, String lrreaseguroual, Date lrreasegurofal, String lrreaseguroumd, Date lrreasegurofmd) {
        this.lrreaseguroid = lrreaseguroid;
        this.lrreaseguroimptotal = lrreaseguroimptotal;
        this.lrreaseguroac = lrreaseguroac;
        this.lrreaseguroual = lrreaseguroual;
        this.lrreasegurofal = lrreasegurofal;
        this.lrreaseguroumd = lrreaseguroumd;
        this.lrreasegurofmd = lrreasegurofmd;
    }

    public Long getLrreaseguroid() {
        return lrreaseguroid;
    }

    public void setLrreaseguroid(Long lrreaseguroid) {
        this.lrreaseguroid = lrreaseguroid;
    }

    public BigDecimal getLrreaseguroimptotal() {
        return lrreaseguroimptotal;
    }

    public void setLrreaseguroimptotal(BigDecimal lrreaseguroimptotal) {
        this.lrreaseguroimptotal = lrreaseguroimptotal;
    }

    public Character getLrreaseguroac() {
        return lrreaseguroac;
    }

    public void setLrreaseguroac(Character lrreaseguroac) {
        this.lrreaseguroac = lrreaseguroac;
    }

    public String getLrreaseguroual() {
        return lrreaseguroual;
    }

    public void setLrreaseguroual(String lrreaseguroual) {
        this.lrreaseguroual = lrreaseguroual;
    }

    public Date getLrreasegurofal() {
        return lrreasegurofal;
    }

    public void setLrreasegurofal(Date lrreasegurofal) {
        this.lrreasegurofal = lrreasegurofal;
    }

    public String getLrreaseguroumd() {
        return lrreaseguroumd;
    }

    public void setLrreaseguroumd(String lrreaseguroumd) {
        this.lrreaseguroumd = lrreaseguroumd;
    }

    public Date getLrreasegurofmd() {
        return lrreasegurofmd;
    }

    public void setLrreasegurofmd(Date lrreasegurofmd) {
        this.lrreasegurofmd = lrreasegurofmd;
    }

    public Lrtipodistrea getLrtipodistreaid() {
        return lrtipodistreaid;
    }

    public void setLrtipodistreaid(Lrtipodistrea lrtipodistreaid) {
        this.lrtipodistreaid = lrtipodistreaid;
    }

    public Lrubicacion getLrubicacionid() {
        return lrubicacionid;
    }

    public void setLrubicacionid(Lrubicacion lrubicacionid) {
        this.lrubicacionid = lrubicacionid;
    }

    public List<Lrreasegurodet> getLrreasegurodetList() {
        return lrreasegurodetList;
    }

    public void setLrreasegurodetList(List<Lrreasegurodet> lrreasegurodetList) {
        this.lrreasegurodetList = lrreasegurodetList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrreaseguroid != null ? lrreaseguroid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrreaseguro)) {
            return false;
        }
        Lrreaseguro other = (Lrreaseguro) object;
        if ((this.lrreaseguroid == null && other.lrreaseguroid != null) || (this.lrreaseguroid != null && !this.lrreaseguroid.equals(other.lrreaseguroid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrreaseguro[ lrreaseguroid=" + lrreaseguroid + " ]";
    }
    
}
