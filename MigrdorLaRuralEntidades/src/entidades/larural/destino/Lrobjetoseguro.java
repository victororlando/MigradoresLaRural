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
@Table(name = "LROBJETOSEGURO")
@NamedQueries({
    @NamedQuery(name = "Lrobjetoseguro.findAll", query = "SELECT l FROM Lrobjetoseguro l"),
    @NamedQuery(name = "Lrobjetoseguro.findByLrobjetoseguroid", query = "SELECT l FROM Lrobjetoseguro l WHERE l.lrobjetoseguroid = :lrobjetoseguroid"),
    @NamedQuery(name = "Lrobjetoseguro.findByLrobjetosegurodesc", query = "SELECT l FROM Lrobjetoseguro l WHERE l.lrobjetosegurodesc = :lrobjetosegurodesc"),
    @NamedQuery(name = "Lrobjetoseguro.findByLrobjetoseguroac", query = "SELECT l FROM Lrobjetoseguro l WHERE l.lrobjetoseguroac = :lrobjetoseguroac"),
    @NamedQuery(name = "Lrobjetoseguro.findByLrobjetoseguroual", query = "SELECT l FROM Lrobjetoseguro l WHERE l.lrobjetoseguroual = :lrobjetoseguroual"),
    @NamedQuery(name = "Lrobjetoseguro.findByLrobjetosegurofal", query = "SELECT l FROM Lrobjetoseguro l WHERE l.lrobjetosegurofal = :lrobjetosegurofal"),
    @NamedQuery(name = "Lrobjetoseguro.findByLrobjetoseguroumd", query = "SELECT l FROM Lrobjetoseguro l WHERE l.lrobjetoseguroumd = :lrobjetoseguroumd"),
    @NamedQuery(name = "Lrobjetoseguro.findByLrobjetosegurofmd", query = "SELECT l FROM Lrobjetoseguro l WHERE l.lrobjetosegurofmd = :lrobjetosegurofmd")})
public class Lrobjetoseguro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LROBJETOSEGUROID", nullable = false)
    private Long lrobjetoseguroid;
    @Basic(optional = false)
    @Column(name = "LROBJETOSEGURODESC", nullable = false, length = 100)
    private String lrobjetosegurodesc;
    @Basic(optional = false)
    @Column(name = "LROBJETOSEGUROAC", nullable = false)
    private Character lrobjetoseguroac;
    @Column(name = "LROBJETOSEGUROUAL", length = 30)
    private String lrobjetoseguroual;
    @Column(name = "LROBJETOSEGUROFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrobjetosegurofal;
    @Column(name = "LROBJETOSEGUROUMD", length = 30)
    private String lrobjetoseguroumd;
    @Column(name = "LROBJETOSEGUROFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrobjetosegurofmd;

    public Lrobjetoseguro() {
    }

    public Lrobjetoseguro(Long lrobjetoseguroid) {
        this.lrobjetoseguroid = lrobjetoseguroid;
    }

    public Lrobjetoseguro(Long lrobjetoseguroid, String lrobjetosegurodesc, Character lrobjetoseguroac) {
        this.lrobjetoseguroid = lrobjetoseguroid;
        this.lrobjetosegurodesc = lrobjetosegurodesc;
        this.lrobjetoseguroac = lrobjetoseguroac;
    }

    public Long getLrobjetoseguroid() {
        return lrobjetoseguroid;
    }

    public void setLrobjetoseguroid(Long lrobjetoseguroid) {
        this.lrobjetoseguroid = lrobjetoseguroid;
    }

    public String getLrobjetosegurodesc() {
        return lrobjetosegurodesc;
    }

    public void setLrobjetosegurodesc(String lrobjetosegurodesc) {
        this.lrobjetosegurodesc = lrobjetosegurodesc;
    }

    public Character getLrobjetoseguroac() {
        return lrobjetoseguroac;
    }

    public void setLrobjetoseguroac(Character lrobjetoseguroac) {
        this.lrobjetoseguroac = lrobjetoseguroac;
    }

    public String getLrobjetoseguroual() {
        return lrobjetoseguroual;
    }

    public void setLrobjetoseguroual(String lrobjetoseguroual) {
        this.lrobjetoseguroual = lrobjetoseguroual;
    }

    public Date getLrobjetosegurofal() {
        return lrobjetosegurofal;
    }

    public void setLrobjetosegurofal(Date lrobjetosegurofal) {
        this.lrobjetosegurofal = lrobjetosegurofal;
    }

    public String getLrobjetoseguroumd() {
        return lrobjetoseguroumd;
    }

    public void setLrobjetoseguroumd(String lrobjetoseguroumd) {
        this.lrobjetoseguroumd = lrobjetoseguroumd;
    }

    public Date getLrobjetosegurofmd() {
        return lrobjetosegurofmd;
    }

    public void setLrobjetosegurofmd(Date lrobjetosegurofmd) {
        this.lrobjetosegurofmd = lrobjetosegurofmd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrobjetoseguroid != null ? lrobjetoseguroid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrobjetoseguro)) {
            return false;
        }
        Lrobjetoseguro other = (Lrobjetoseguro) object;
        if ((this.lrobjetoseguroid == null && other.lrobjetoseguroid != null) || (this.lrobjetoseguroid != null && !this.lrobjetoseguroid.equals(other.lrobjetoseguroid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrobjetoseguro[ lrobjetoseguroid=" + lrobjetoseguroid + " ]";
    }
    
}
