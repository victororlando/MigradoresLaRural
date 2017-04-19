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
@Table(name = "LRAGRUPAIMPRESION")
@NamedQueries({
    @NamedQuery(name = "Lragrupaimpresion.findAll", query = "SELECT l FROM Lragrupaimpresion l"),
    @NamedQuery(name = "Lragrupaimpresion.findByLragrupaimpresionid", query = "SELECT l FROM Lragrupaimpresion l WHERE l.lragrupaimpresionid = :lragrupaimpresionid"),
    @NamedQuery(name = "Lragrupaimpresion.findByLragrupaimpresiondesc", query = "SELECT l FROM Lragrupaimpresion l WHERE l.lragrupaimpresiondesc = :lragrupaimpresiondesc"),
    @NamedQuery(name = "Lragrupaimpresion.findByLragrupaimpresionact", query = "SELECT l FROM Lragrupaimpresion l WHERE l.lragrupaimpresionact = :lragrupaimpresionact"),
    @NamedQuery(name = "Lragrupaimpresion.findByLragrupaimpresionual", query = "SELECT l FROM Lragrupaimpresion l WHERE l.lragrupaimpresionual = :lragrupaimpresionual"),
    @NamedQuery(name = "Lragrupaimpresion.findByLragrupaimpresionfal", query = "SELECT l FROM Lragrupaimpresion l WHERE l.lragrupaimpresionfal = :lragrupaimpresionfal"),
    @NamedQuery(name = "Lragrupaimpresion.findByLragrupaimpresionumd", query = "SELECT l FROM Lragrupaimpresion l WHERE l.lragrupaimpresionumd = :lragrupaimpresionumd"),
    @NamedQuery(name = "Lragrupaimpresion.findByLragrupaimpresionfmd", query = "SELECT l FROM Lragrupaimpresion l WHERE l.lragrupaimpresionfmd = :lragrupaimpresionfmd")})
public class Lragrupaimpresion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRAGRUPAIMPRESIONID", nullable = false)
    private Long lragrupaimpresionid;
    @Basic(optional = false)
    @Column(name = "LRAGRUPAIMPRESIONDESC", nullable = false, length = 100)
    private String lragrupaimpresiondesc;
    @Basic(optional = false)
    @Column(name = "LRAGRUPAIMPRESIONACT", nullable = false)
    private Character lragrupaimpresionact;
    @Basic(optional = false)
    @Column(name = "LRAGRUPAIMPRESIONUAL", nullable = false, length = 30)
    private String lragrupaimpresionual;
    @Basic(optional = false)
    @Column(name = "LRAGRUPAIMPRESIONFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lragrupaimpresionfal;
    @Column(name = "LRAGRUPAIMPRESIONUMD", length = 30)
    private String lragrupaimpresionumd;
    @Column(name = "LRAGRUPAIMPRESIONFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lragrupaimpresionfmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lragrupaimpresion")
    private List<Lrparmcotireglas> lrparmcotireglasList;

    public Lragrupaimpresion() {
    }

    public Lragrupaimpresion(Long lragrupaimpresionid) {
        this.lragrupaimpresionid = lragrupaimpresionid;
    }

    public Lragrupaimpresion(Long lragrupaimpresionid, String lragrupaimpresiondesc, Character lragrupaimpresionact, String lragrupaimpresionual, Date lragrupaimpresionfal) {
        this.lragrupaimpresionid = lragrupaimpresionid;
        this.lragrupaimpresiondesc = lragrupaimpresiondesc;
        this.lragrupaimpresionact = lragrupaimpresionact;
        this.lragrupaimpresionual = lragrupaimpresionual;
        this.lragrupaimpresionfal = lragrupaimpresionfal;
    }

    public Long getLragrupaimpresionid() {
        return lragrupaimpresionid;
    }

    public void setLragrupaimpresionid(Long lragrupaimpresionid) {
        this.lragrupaimpresionid = lragrupaimpresionid;
    }

    public String getLragrupaimpresiondesc() {
        return lragrupaimpresiondesc;
    }

    public void setLragrupaimpresiondesc(String lragrupaimpresiondesc) {
        this.lragrupaimpresiondesc = lragrupaimpresiondesc;
    }

    public Character getLragrupaimpresionact() {
        return lragrupaimpresionact;
    }

    public void setLragrupaimpresionact(Character lragrupaimpresionact) {
        this.lragrupaimpresionact = lragrupaimpresionact;
    }

    public String getLragrupaimpresionual() {
        return lragrupaimpresionual;
    }

    public void setLragrupaimpresionual(String lragrupaimpresionual) {
        this.lragrupaimpresionual = lragrupaimpresionual;
    }

    public Date getLragrupaimpresionfal() {
        return lragrupaimpresionfal;
    }

    public void setLragrupaimpresionfal(Date lragrupaimpresionfal) {
        this.lragrupaimpresionfal = lragrupaimpresionfal;
    }

    public String getLragrupaimpresionumd() {
        return lragrupaimpresionumd;
    }

    public void setLragrupaimpresionumd(String lragrupaimpresionumd) {
        this.lragrupaimpresionumd = lragrupaimpresionumd;
    }

    public Date getLragrupaimpresionfmd() {
        return lragrupaimpresionfmd;
    }

    public void setLragrupaimpresionfmd(Date lragrupaimpresionfmd) {
        this.lragrupaimpresionfmd = lragrupaimpresionfmd;
    }

    public List<Lrparmcotireglas> getLrparmcotireglasList() {
        return lrparmcotireglasList;
    }

    public void setLrparmcotireglasList(List<Lrparmcotireglas> lrparmcotireglasList) {
        this.lrparmcotireglasList = lrparmcotireglasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lragrupaimpresionid != null ? lragrupaimpresionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lragrupaimpresion)) {
            return false;
        }
        Lragrupaimpresion other = (Lragrupaimpresion) object;
        if ((this.lragrupaimpresionid == null && other.lragrupaimpresionid != null) || (this.lragrupaimpresionid != null && !this.lragrupaimpresionid.equals(other.lragrupaimpresionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lragrupaimpresion[ lragrupaimpresionid=" + lragrupaimpresionid + " ]";
    }
    
}
