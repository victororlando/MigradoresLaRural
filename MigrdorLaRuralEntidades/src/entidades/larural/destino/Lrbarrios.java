/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "LRBARRIOS")
@NamedQueries({
    @NamedQuery(name = "Lrbarrios.findAll", query = "SELECT l FROM Lrbarrios l"),
    @NamedQuery(name = "Lrbarrios.findByLrbarriosid", query = "SELECT l FROM Lrbarrios l WHERE l.lrbarriosid = :lrbarriosid"),
    @NamedQuery(name = "Lrbarrios.findByLrbarriosnombre", query = "SELECT l FROM Lrbarrios l WHERE l.lrbarriosnombre = :lrbarriosnombre"),
    @NamedQuery(name = "Lrbarrios.findByLrbarriosfal", query = "SELECT l FROM Lrbarrios l WHERE l.lrbarriosfal = :lrbarriosfal"),
    @NamedQuery(name = "Lrbarrios.findByLrbarriosual", query = "SELECT l FROM Lrbarrios l WHERE l.lrbarriosual = :lrbarriosual"),
    @NamedQuery(name = "Lrbarrios.findByLrbarriosfmd", query = "SELECT l FROM Lrbarrios l WHERE l.lrbarriosfmd = :lrbarriosfmd"),
    @NamedQuery(name = "Lrbarrios.findByLrbarriosumd", query = "SELECT l FROM Lrbarrios l WHERE l.lrbarriosumd = :lrbarriosumd"),
    @NamedQuery(name = "Lrbarrios.findByLrbarrioshab", query = "SELECT l FROM Lrbarrios l WHERE l.lrbarrioshab = :lrbarrioshab"),
    @NamedQuery(name = "Lrbarrios.findByZonasid", query = "SELECT l FROM Lrbarrios l WHERE l.zonasid = :zonasid"),
    @NamedQuery(name = "Lrbarrios.findByCiuid", query = "SELECT l FROM Lrbarrios l WHERE l.ciuid = :ciuid"),
    @NamedQuery(name = "Lrbarrios.findByDepid", query = "SELECT l FROM Lrbarrios l WHERE l.depid = :depid")})
public class Lrbarrios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRBARRIOSID", nullable = false)
    private Integer lrbarriosid;
    @Basic(optional = false)
    @Column(name = "LRBARRIOSNOMBRE", nullable = false, length = 80)
    private String lrbarriosnombre;
    @Basic(optional = false)
    @Column(name = "LRBARRIOSFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrbarriosfal;
    @Basic(optional = false)
    @Column(name = "LRBARRIOSUAL", nullable = false, length = 30)
    private String lrbarriosual;
    @Basic(optional = false)
    @Column(name = "LRBARRIOSFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrbarriosfmd;
    @Basic(optional = false)
    @Column(name = "LRBARRIOSUMD", nullable = false, length = 30)
    private String lrbarriosumd;
    @Basic(optional = false)
    @Column(name = "LRBARRIOSHAB", nullable = false)
    private Character lrbarrioshab;
    @Basic(optional = false)
    @Column(name = "ZONASID", nullable = false)
    private short zonasid;
    @Basic(optional = false)
    @Column(name = "CIUID", nullable = false)
    private short ciuid;
    @Basic(optional = false)
    @Column(name = "DEPID", nullable = false)
    private short depid;
    @OneToMany(mappedBy = "lrbarriosid")
    private List<Lrpersona> lrpersonaList;

    public Lrbarrios() {
    }

    public Lrbarrios(Integer lrbarriosid) {
        this.lrbarriosid = lrbarriosid;
    }

    public Lrbarrios(Integer lrbarriosid, String lrbarriosnombre, Date lrbarriosfal, String lrbarriosual, Date lrbarriosfmd, String lrbarriosumd, Character lrbarrioshab, short zonasid, short ciuid, short depid) {
        this.lrbarriosid = lrbarriosid;
        this.lrbarriosnombre = lrbarriosnombre;
        this.lrbarriosfal = lrbarriosfal;
        this.lrbarriosual = lrbarriosual;
        this.lrbarriosfmd = lrbarriosfmd;
        this.lrbarriosumd = lrbarriosumd;
        this.lrbarrioshab = lrbarrioshab;
        this.zonasid = zonasid;
        this.ciuid = ciuid;
        this.depid = depid;
    }

    public Integer getLrbarriosid() {
        return lrbarriosid;
    }

    public void setLrbarriosid(Integer lrbarriosid) {
        this.lrbarriosid = lrbarriosid;
    }

    public String getLrbarriosnombre() {
        return lrbarriosnombre;
    }

    public void setLrbarriosnombre(String lrbarriosnombre) {
        this.lrbarriosnombre = lrbarriosnombre;
    }

    public Date getLrbarriosfal() {
        return lrbarriosfal;
    }

    public void setLrbarriosfal(Date lrbarriosfal) {
        this.lrbarriosfal = lrbarriosfal;
    }

    public String getLrbarriosual() {
        return lrbarriosual;
    }

    public void setLrbarriosual(String lrbarriosual) {
        this.lrbarriosual = lrbarriosual;
    }

    public Date getLrbarriosfmd() {
        return lrbarriosfmd;
    }

    public void setLrbarriosfmd(Date lrbarriosfmd) {
        this.lrbarriosfmd = lrbarriosfmd;
    }

    public String getLrbarriosumd() {
        return lrbarriosumd;
    }

    public void setLrbarriosumd(String lrbarriosumd) {
        this.lrbarriosumd = lrbarriosumd;
    }

    public Character getLrbarrioshab() {
        return lrbarrioshab;
    }

    public void setLrbarrioshab(Character lrbarrioshab) {
        this.lrbarrioshab = lrbarrioshab;
    }

    public short getZonasid() {
        return zonasid;
    }

    public void setZonasid(short zonasid) {
        this.zonasid = zonasid;
    }

    public short getCiuid() {
        return ciuid;
    }

    public void setCiuid(short ciuid) {
        this.ciuid = ciuid;
    }

    public short getDepid() {
        return depid;
    }

    public void setDepid(short depid) {
        this.depid = depid;
    }

    public List<Lrpersona> getLrpersonaList() {
        return lrpersonaList;
    }

    public void setLrpersonaList(List<Lrpersona> lrpersonaList) {
        this.lrpersonaList = lrpersonaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrbarriosid != null ? lrbarriosid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrbarrios)) {
            return false;
        }
        Lrbarrios other = (Lrbarrios) object;
        if ((this.lrbarriosid == null && other.lrbarriosid != null) || (this.lrbarriosid != null && !this.lrbarriosid.equals(other.lrbarriosid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrbarrios[ lrbarriosid=" + lrbarriosid + " ]";
    }
    
}
