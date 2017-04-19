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
@Table(name = "LRATRIBUTO")
@NamedQueries({
    @NamedQuery(name = "Lratributo.findAll", query = "SELECT l FROM Lratributo l"),
    @NamedQuery(name = "Lratributo.findByLratributoid", query = "SELECT l FROM Lratributo l WHERE l.lratributoid = :lratributoid"),
    @NamedQuery(name = "Lratributo.findByLratributodesc", query = "SELECT l FROM Lratributo l WHERE l.lratributodesc = :lratributodesc"),
    @NamedQuery(name = "Lratributo.findByLratributoac", query = "SELECT l FROM Lratributo l WHERE l.lratributoac = :lratributoac"),
    @NamedQuery(name = "Lratributo.findByLratributoual", query = "SELECT l FROM Lratributo l WHERE l.lratributoual = :lratributoual"),
    @NamedQuery(name = "Lratributo.findByLratributofal", query = "SELECT l FROM Lratributo l WHERE l.lratributofal = :lratributofal"),
    @NamedQuery(name = "Lratributo.findByLratributofmd", query = "SELECT l FROM Lratributo l WHERE l.lratributofmd = :lratributofmd"),
    @NamedQuery(name = "Lratributo.findByLratributoumd", query = "SELECT l FROM Lratributo l WHERE l.lratributoumd = :lratributoumd")})
public class Lratributo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRATRIBUTOID", nullable = false)
    private Long lratributoid;
    @Basic(optional = false)
    @Column(name = "LRATRIBUTODESC", nullable = false, length = 100)
    private String lratributodesc;
    @Basic(optional = false)
    @Column(name = "LRATRIBUTOAC", nullable = false)
    private Character lratributoac;
    @Column(name = "LRATRIBUTOUAL", length = 30)
    private String lratributoual;
    @Column(name = "LRATRIBUTOFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lratributofal;
    @Column(name = "LRATRIBUTOFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lratributofmd;
    @Column(name = "LRATRIBUTOUMD", length = 30)
    private String lratributoumd;

    public Lratributo() {
    }

    public Lratributo(Long lratributoid) {
        this.lratributoid = lratributoid;
    }

    public Lratributo(Long lratributoid, String lratributodesc, Character lratributoac) {
        this.lratributoid = lratributoid;
        this.lratributodesc = lratributodesc;
        this.lratributoac = lratributoac;
    }

    public Long getLratributoid() {
        return lratributoid;
    }

    public void setLratributoid(Long lratributoid) {
        this.lratributoid = lratributoid;
    }

    public String getLratributodesc() {
        return lratributodesc;
    }

    public void setLratributodesc(String lratributodesc) {
        this.lratributodesc = lratributodesc;
    }

    public Character getLratributoac() {
        return lratributoac;
    }

    public void setLratributoac(Character lratributoac) {
        this.lratributoac = lratributoac;
    }

    public String getLratributoual() {
        return lratributoual;
    }

    public void setLratributoual(String lratributoual) {
        this.lratributoual = lratributoual;
    }

    public Date getLratributofal() {
        return lratributofal;
    }

    public void setLratributofal(Date lratributofal) {
        this.lratributofal = lratributofal;
    }

    public Date getLratributofmd() {
        return lratributofmd;
    }

    public void setLratributofmd(Date lratributofmd) {
        this.lratributofmd = lratributofmd;
    }

    public String getLratributoumd() {
        return lratributoumd;
    }

    public void setLratributoumd(String lratributoumd) {
        this.lratributoumd = lratributoumd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lratributoid != null ? lratributoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lratributo)) {
            return false;
        }
        Lratributo other = (Lratributo) object;
        if ((this.lratributoid == null && other.lratributoid != null) || (this.lratributoid != null && !this.lratributoid.equals(other.lratributoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lratributo[ lratributoid=" + lratributoid + " ]";
    }
    
}
