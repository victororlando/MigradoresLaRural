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
@Table(name = "LRPERSONATC")
@NamedQueries({
    @NamedQuery(name = "Lrpersonatc.findAll", query = "SELECT l FROM Lrpersonatc l"),
    @NamedQuery(name = "Lrpersonatc.findByLrpersonatcid", query = "SELECT l FROM Lrpersonatc l WHERE l.lrpersonatcPK.lrpersonatcid = :lrpersonatcid"),
    @NamedQuery(name = "Lrpersonatc.findByLrpersonaid", query = "SELECT l FROM Lrpersonatc l WHERE l.lrpersonatcPK.lrpersonaid = :lrpersonaid"),
    @NamedQuery(name = "Lrpersonatc.findByEntidadid", query = "SELECT l FROM Lrpersonatc l WHERE l.entidadid = :entidadid"),
    @NamedQuery(name = "Lrpersonatc.findByLrpersonatcnro", query = "SELECT l FROM Lrpersonatc l WHERE l.lrpersonatcnro = :lrpersonatcnro"),
    @NamedQuery(name = "Lrpersonatc.findByLrpersonatcvto", query = "SELECT l FROM Lrpersonatc l WHERE l.lrpersonatcvto = :lrpersonatcvto"),
    @NamedQuery(name = "Lrpersonatc.findByLrpersonatcpin", query = "SELECT l FROM Lrpersonatc l WHERE l.lrpersonatcpin = :lrpersonatcpin"),
    @NamedQuery(name = "Lrpersonatc.findByLrpersonausu", query = "SELECT l FROM Lrpersonatc l WHERE l.lrpersonausu = :lrpersonausu"),
    @NamedQuery(name = "Lrpersonatc.findByLrpersonatctitular", query = "SELECT l FROM Lrpersonatc l WHERE l.lrpersonatctitular = :lrpersonatctitular"),
    @NamedQuery(name = "Lrpersonatc.findByLrpersonahab", query = "SELECT l FROM Lrpersonatc l WHERE l.lrpersonahab = :lrpersonahab"),
    @NamedQuery(name = "Lrpersonatc.findByLrpersonarcprioridad", query = "SELECT l FROM Lrpersonatc l WHERE l.lrpersonarcprioridad = :lrpersonarcprioridad"),
    @NamedQuery(name = "Lrpersonatc.findByLrpersonatclineacredito", query = "SELECT l FROM Lrpersonatc l WHERE l.lrpersonatclineacredito = :lrpersonatclineacredito"),
    @NamedQuery(name = "Lrpersonatc.findByLrpersonatcexterno", query = "SELECT l FROM Lrpersonatc l WHERE l.lrpersonatcexterno = :lrpersonatcexterno"),
    @NamedQuery(name = "Lrpersonatc.findByLrpersonatcaseg", query = "SELECT l FROM Lrpersonatc l WHERE l.lrpersonatcaseg = :lrpersonatcaseg")})
public class Lrpersonatc implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrpersonatcPK lrpersonatcPK;
    @Basic(optional = false)
    @Column(name = "ENTIDADID", nullable = false)
    private long entidadid;
    @Basic(optional = false)
    @Column(name = "LRPERSONATCNRO", nullable = false, length = 30)
    private String lrpersonatcnro;
    @Column(name = "LRPERSONATCVTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrpersonatcvto;
    @Column(name = "LRPERSONATCPIN", length = 20)
    private String lrpersonatcpin;
    @Basic(optional = false)
    @Column(name = "LRPERSONAUSU", nullable = false)
    private short lrpersonausu;
    @Column(name = "LRPERSONATCTITULAR", length = 100)
    private String lrpersonatctitular;
    @Basic(optional = false)
    @Column(name = "LRPERSONAHAB", nullable = false)
    private short lrpersonahab;
    @Column(name = "LRPERSONARCPRIORIDAD")
    private Short lrpersonarcprioridad;
    @Column(name = "LRPERSONATCLINEACREDITO")
    private Long lrpersonatclineacredito;
    @Column(name = "LRPERSONATCEXTERNO", length = 1)
    private String lrpersonatcexterno;
    @Column(name = "LRPERSONATCASEG")
    private Integer lrpersonatcaseg;
    @JoinColumn(name = "LRPERSONAID", referencedColumnName = "LRPERSONAID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrpersona lrpersona;

    public Lrpersonatc() {
    }

    public Lrpersonatc(LrpersonatcPK lrpersonatcPK) {
        this.lrpersonatcPK = lrpersonatcPK;
    }

    public Lrpersonatc(LrpersonatcPK lrpersonatcPK, long entidadid, String lrpersonatcnro, short lrpersonausu, short lrpersonahab) {
        this.lrpersonatcPK = lrpersonatcPK;
        this.entidadid = entidadid;
        this.lrpersonatcnro = lrpersonatcnro;
        this.lrpersonausu = lrpersonausu;
        this.lrpersonahab = lrpersonahab;
    }

    public Lrpersonatc(int lrpersonatcid, long lrpersonaid) {
        this.lrpersonatcPK = new LrpersonatcPK(lrpersonatcid, lrpersonaid);
    }

    public LrpersonatcPK getLrpersonatcPK() {
        return lrpersonatcPK;
    }

    public void setLrpersonatcPK(LrpersonatcPK lrpersonatcPK) {
        this.lrpersonatcPK = lrpersonatcPK;
    }

    public long getEntidadid() {
        return entidadid;
    }

    public void setEntidadid(long entidadid) {
        this.entidadid = entidadid;
    }

    public String getLrpersonatcnro() {
        return lrpersonatcnro;
    }

    public void setLrpersonatcnro(String lrpersonatcnro) {
        this.lrpersonatcnro = lrpersonatcnro;
    }

    public Date getLrpersonatcvto() {
        return lrpersonatcvto;
    }

    public void setLrpersonatcvto(Date lrpersonatcvto) {
        this.lrpersonatcvto = lrpersonatcvto;
    }

    public String getLrpersonatcpin() {
        return lrpersonatcpin;
    }

    public void setLrpersonatcpin(String lrpersonatcpin) {
        this.lrpersonatcpin = lrpersonatcpin;
    }

    public short getLrpersonausu() {
        return lrpersonausu;
    }

    public void setLrpersonausu(short lrpersonausu) {
        this.lrpersonausu = lrpersonausu;
    }

    public String getLrpersonatctitular() {
        return lrpersonatctitular;
    }

    public void setLrpersonatctitular(String lrpersonatctitular) {
        this.lrpersonatctitular = lrpersonatctitular;
    }

    public short getLrpersonahab() {
        return lrpersonahab;
    }

    public void setLrpersonahab(short lrpersonahab) {
        this.lrpersonahab = lrpersonahab;
    }

    public Short getLrpersonarcprioridad() {
        return lrpersonarcprioridad;
    }

    public void setLrpersonarcprioridad(Short lrpersonarcprioridad) {
        this.lrpersonarcprioridad = lrpersonarcprioridad;
    }

    public Long getLrpersonatclineacredito() {
        return lrpersonatclineacredito;
    }

    public void setLrpersonatclineacredito(Long lrpersonatclineacredito) {
        this.lrpersonatclineacredito = lrpersonatclineacredito;
    }

    public String getLrpersonatcexterno() {
        return lrpersonatcexterno;
    }

    public void setLrpersonatcexterno(String lrpersonatcexterno) {
        this.lrpersonatcexterno = lrpersonatcexterno;
    }

    public Integer getLrpersonatcaseg() {
        return lrpersonatcaseg;
    }

    public void setLrpersonatcaseg(Integer lrpersonatcaseg) {
        this.lrpersonatcaseg = lrpersonatcaseg;
    }

    public Lrpersona getLrpersona() {
        return lrpersona;
    }

    public void setLrpersona(Lrpersona lrpersona) {
        this.lrpersona = lrpersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrpersonatcPK != null ? lrpersonatcPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrpersonatc)) {
            return false;
        }
        Lrpersonatc other = (Lrpersonatc) object;
        if ((this.lrpersonatcPK == null && other.lrpersonatcPK != null) || (this.lrpersonatcPK != null && !this.lrpersonatcPK.equals(other.lrpersonatcPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrpersonatc[ lrpersonatcPK=" + lrpersonatcPK + " ]";
    }
    
}
