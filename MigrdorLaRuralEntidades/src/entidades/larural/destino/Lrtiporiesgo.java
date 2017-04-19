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
@Table(name = "LRTIPORIESGO")
@NamedQueries({
    @NamedQuery(name = "Lrtiporiesgo.findAll", query = "SELECT l FROM Lrtiporiesgo l"),
    @NamedQuery(name = "Lrtiporiesgo.findByLrtiporiesgoid", query = "SELECT l FROM Lrtiporiesgo l WHERE l.lrtiporiesgoid = :lrtiporiesgoid"),
    @NamedQuery(name = "Lrtiporiesgo.findByLrtiporiesgodesc", query = "SELECT l FROM Lrtiporiesgo l WHERE l.lrtiporiesgodesc = :lrtiporiesgodesc"),
    @NamedQuery(name = "Lrtiporiesgo.findByLrtiporiesgoac", query = "SELECT l FROM Lrtiporiesgo l WHERE l.lrtiporiesgoac = :lrtiporiesgoac"),
    @NamedQuery(name = "Lrtiporiesgo.findByLrtiporiesgoual", query = "SELECT l FROM Lrtiporiesgo l WHERE l.lrtiporiesgoual = :lrtiporiesgoual"),
    @NamedQuery(name = "Lrtiporiesgo.findByLrtiporiesgofal", query = "SELECT l FROM Lrtiporiesgo l WHERE l.lrtiporiesgofal = :lrtiporiesgofal"),
    @NamedQuery(name = "Lrtiporiesgo.findByLrtiporiesgoumd", query = "SELECT l FROM Lrtiporiesgo l WHERE l.lrtiporiesgoumd = :lrtiporiesgoumd"),
    @NamedQuery(name = "Lrtiporiesgo.findByLrtiporiesgofmd", query = "SELECT l FROM Lrtiporiesgo l WHERE l.lrtiporiesgofmd = :lrtiporiesgofmd")})
public class Lrtiporiesgo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRTIPORIESGOID", nullable = false)
    private Long lrtiporiesgoid;
    @Basic(optional = false)
    @Column(name = "LRTIPORIESGODESC", nullable = false, length = 100)
    private String lrtiporiesgodesc;
    @Basic(optional = false)
    @Column(name = "LRTIPORIESGOAC", nullable = false)
    private Character lrtiporiesgoac;
    @Basic(optional = false)
    @Column(name = "LRTIPORIESGOUAL", nullable = false, length = 30)
    private String lrtiporiesgoual;
    @Basic(optional = false)
    @Column(name = "LRTIPORIESGOFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtiporiesgofal;
    @Column(name = "LRTIPORIESGOUMD", length = 30)
    private String lrtiporiesgoumd;
    @Column(name = "LRTIPORIESGOFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtiporiesgofmd;

    public Lrtiporiesgo() {
    }

    public Lrtiporiesgo(Long lrtiporiesgoid) {
        this.lrtiporiesgoid = lrtiporiesgoid;
    }

    public Lrtiporiesgo(Long lrtiporiesgoid, String lrtiporiesgodesc, Character lrtiporiesgoac, String lrtiporiesgoual, Date lrtiporiesgofal) {
        this.lrtiporiesgoid = lrtiporiesgoid;
        this.lrtiporiesgodesc = lrtiporiesgodesc;
        this.lrtiporiesgoac = lrtiporiesgoac;
        this.lrtiporiesgoual = lrtiporiesgoual;
        this.lrtiporiesgofal = lrtiporiesgofal;
    }

    public Long getLrtiporiesgoid() {
        return lrtiporiesgoid;
    }

    public void setLrtiporiesgoid(Long lrtiporiesgoid) {
        this.lrtiporiesgoid = lrtiporiesgoid;
    }

    public String getLrtiporiesgodesc() {
        return lrtiporiesgodesc;
    }

    public void setLrtiporiesgodesc(String lrtiporiesgodesc) {
        this.lrtiporiesgodesc = lrtiporiesgodesc;
    }

    public Character getLrtiporiesgoac() {
        return lrtiporiesgoac;
    }

    public void setLrtiporiesgoac(Character lrtiporiesgoac) {
        this.lrtiporiesgoac = lrtiporiesgoac;
    }

    public String getLrtiporiesgoual() {
        return lrtiporiesgoual;
    }

    public void setLrtiporiesgoual(String lrtiporiesgoual) {
        this.lrtiporiesgoual = lrtiporiesgoual;
    }

    public Date getLrtiporiesgofal() {
        return lrtiporiesgofal;
    }

    public void setLrtiporiesgofal(Date lrtiporiesgofal) {
        this.lrtiporiesgofal = lrtiporiesgofal;
    }

    public String getLrtiporiesgoumd() {
        return lrtiporiesgoumd;
    }

    public void setLrtiporiesgoumd(String lrtiporiesgoumd) {
        this.lrtiporiesgoumd = lrtiporiesgoumd;
    }

    public Date getLrtiporiesgofmd() {
        return lrtiporiesgofmd;
    }

    public void setLrtiporiesgofmd(Date lrtiporiesgofmd) {
        this.lrtiporiesgofmd = lrtiporiesgofmd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrtiporiesgoid != null ? lrtiporiesgoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtiporiesgo)) {
            return false;
        }
        Lrtiporiesgo other = (Lrtiporiesgo) object;
        if ((this.lrtiporiesgoid == null && other.lrtiporiesgoid != null) || (this.lrtiporiesgoid != null && !this.lrtiporiesgoid.equals(other.lrtiporiesgoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtiporiesgo[ lrtiporiesgoid=" + lrtiporiesgoid + " ]";
    }
    
}
