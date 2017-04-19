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
@Table(name = "LREXCLUSIONESPLAN")
@NamedQueries({
    @NamedQuery(name = "Lrexclusionesplan.findAll", query = "SELECT l FROM Lrexclusionesplan l"),
    @NamedQuery(name = "Lrexclusionesplan.findByLrexclusionesplanid", query = "SELECT l FROM Lrexclusionesplan l WHERE l.lrexclusionesplanid = :lrexclusionesplanid"),
    @NamedQuery(name = "Lrexclusionesplan.findByLrexclusionesplantexto", query = "SELECT l FROM Lrexclusionesplan l WHERE l.lrexclusionesplantexto = :lrexclusionesplantexto"),
    @NamedQuery(name = "Lrexclusionesplan.findByLrexclusionesplanac", query = "SELECT l FROM Lrexclusionesplan l WHERE l.lrexclusionesplanac = :lrexclusionesplanac"),
    @NamedQuery(name = "Lrexclusionesplan.findByLrexclusionesplanual", query = "SELECT l FROM Lrexclusionesplan l WHERE l.lrexclusionesplanual = :lrexclusionesplanual"),
    @NamedQuery(name = "Lrexclusionesplan.findByLrexclusionesplanfal", query = "SELECT l FROM Lrexclusionesplan l WHERE l.lrexclusionesplanfal = :lrexclusionesplanfal"),
    @NamedQuery(name = "Lrexclusionesplan.findByLrexclusionesplanumd", query = "SELECT l FROM Lrexclusionesplan l WHERE l.lrexclusionesplanumd = :lrexclusionesplanumd"),
    @NamedQuery(name = "Lrexclusionesplan.findByLrexclusionesplanfmd", query = "SELECT l FROM Lrexclusionesplan l WHERE l.lrexclusionesplanfmd = :lrexclusionesplanfmd")})
public class Lrexclusionesplan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LREXCLUSIONESPLANID", nullable = false)
    private Long lrexclusionesplanid;
    @Basic(optional = false)
    @Column(name = "LREXCLUSIONESPLANTEXTO", nullable = false, length = 1000)
    private String lrexclusionesplantexto;
    @Basic(optional = false)
    @Column(name = "LREXCLUSIONESPLANAC", nullable = false)
    private Character lrexclusionesplanac;
    @Basic(optional = false)
    @Column(name = "LREXCLUSIONESPLANUAL", nullable = false, length = 30)
    private String lrexclusionesplanual;
    @Basic(optional = false)
    @Column(name = "LREXCLUSIONESPLANFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrexclusionesplanfal;
    @Column(name = "LREXCLUSIONESPLANUMD", length = 30)
    private String lrexclusionesplanumd;
    @Column(name = "LREXCLUSIONESPLANFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrexclusionesplanfmd;
    @JoinColumns({
        @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false),
        @JoinColumn(name = "LRPARMCOTIPLANID", referencedColumnName = "LRPARMCOTIPLANID", nullable = false),
        @JoinColumn(name = "LRTIPOPLANID", referencedColumnName = "LRTIPOPLANID", nullable = false)})
    @ManyToOne(optional = false)
    private Lrparmcotiplansecc lrparmcotiplansecc;

    public Lrexclusionesplan() {
    }

    public Lrexclusionesplan(Long lrexclusionesplanid) {
        this.lrexclusionesplanid = lrexclusionesplanid;
    }

    public Lrexclusionesplan(Long lrexclusionesplanid, String lrexclusionesplantexto, Character lrexclusionesplanac, String lrexclusionesplanual, Date lrexclusionesplanfal) {
        this.lrexclusionesplanid = lrexclusionesplanid;
        this.lrexclusionesplantexto = lrexclusionesplantexto;
        this.lrexclusionesplanac = lrexclusionesplanac;
        this.lrexclusionesplanual = lrexclusionesplanual;
        this.lrexclusionesplanfal = lrexclusionesplanfal;
    }

    public Long getLrexclusionesplanid() {
        return lrexclusionesplanid;
    }

    public void setLrexclusionesplanid(Long lrexclusionesplanid) {
        this.lrexclusionesplanid = lrexclusionesplanid;
    }

    public String getLrexclusionesplantexto() {
        return lrexclusionesplantexto;
    }

    public void setLrexclusionesplantexto(String lrexclusionesplantexto) {
        this.lrexclusionesplantexto = lrexclusionesplantexto;
    }

    public Character getLrexclusionesplanac() {
        return lrexclusionesplanac;
    }

    public void setLrexclusionesplanac(Character lrexclusionesplanac) {
        this.lrexclusionesplanac = lrexclusionesplanac;
    }

    public String getLrexclusionesplanual() {
        return lrexclusionesplanual;
    }

    public void setLrexclusionesplanual(String lrexclusionesplanual) {
        this.lrexclusionesplanual = lrexclusionesplanual;
    }

    public Date getLrexclusionesplanfal() {
        return lrexclusionesplanfal;
    }

    public void setLrexclusionesplanfal(Date lrexclusionesplanfal) {
        this.lrexclusionesplanfal = lrexclusionesplanfal;
    }

    public String getLrexclusionesplanumd() {
        return lrexclusionesplanumd;
    }

    public void setLrexclusionesplanumd(String lrexclusionesplanumd) {
        this.lrexclusionesplanumd = lrexclusionesplanumd;
    }

    public Date getLrexclusionesplanfmd() {
        return lrexclusionesplanfmd;
    }

    public void setLrexclusionesplanfmd(Date lrexclusionesplanfmd) {
        this.lrexclusionesplanfmd = lrexclusionesplanfmd;
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
        hash += (lrexclusionesplanid != null ? lrexclusionesplanid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrexclusionesplan)) {
            return false;
        }
        Lrexclusionesplan other = (Lrexclusionesplan) object;
        if ((this.lrexclusionesplanid == null && other.lrexclusionesplanid != null) || (this.lrexclusionesplanid != null && !this.lrexclusionesplanid.equals(other.lrexclusionesplanid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrexclusionesplan[ lrexclusionesplanid=" + lrexclusionesplanid + " ]";
    }
    
}
