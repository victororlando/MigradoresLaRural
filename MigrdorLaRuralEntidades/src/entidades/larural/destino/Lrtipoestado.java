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
@Table(name = "LRTIPOESTADO")
@NamedQueries({
    @NamedQuery(name = "Lrtipoestado.findAll", query = "SELECT l FROM Lrtipoestado l"),
    @NamedQuery(name = "Lrtipoestado.findByLrtipoestadoid", query = "SELECT l FROM Lrtipoestado l WHERE l.lrtipoestadoid = :lrtipoestadoid"),
    @NamedQuery(name = "Lrtipoestado.findByLrtipoestadodesc", query = "SELECT l FROM Lrtipoestado l WHERE l.lrtipoestadodesc = :lrtipoestadodesc"),
    @NamedQuery(name = "Lrtipoestado.findByLrtipoestadoac", query = "SELECT l FROM Lrtipoestado l WHERE l.lrtipoestadoac = :lrtipoestadoac"),
    @NamedQuery(name = "Lrtipoestado.findByLrtipoestadoual", query = "SELECT l FROM Lrtipoestado l WHERE l.lrtipoestadoual = :lrtipoestadoual"),
    @NamedQuery(name = "Lrtipoestado.findByLrtipoestadofal", query = "SELECT l FROM Lrtipoestado l WHERE l.lrtipoestadofal = :lrtipoestadofal"),
    @NamedQuery(name = "Lrtipoestado.findByLrtipoestadoumd", query = "SELECT l FROM Lrtipoestado l WHERE l.lrtipoestadoumd = :lrtipoestadoumd"),
    @NamedQuery(name = "Lrtipoestado.findByLrtipoestadofmd", query = "SELECT l FROM Lrtipoestado l WHERE l.lrtipoestadofmd = :lrtipoestadofmd")})
public class Lrtipoestado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRTIPOESTADOID", nullable = false)
    private Long lrtipoestadoid;
    @Basic(optional = false)
    @Column(name = "LRTIPOESTADODESC", nullable = false, length = 100)
    private String lrtipoestadodesc;
    @Basic(optional = false)
    @Column(name = "LRTIPOESTADOAC", nullable = false)
    private Character lrtipoestadoac;
    @Basic(optional = false)
    @Column(name = "LRTIPOESTADOUAL", nullable = false, length = 30)
    private String lrtipoestadoual;
    @Basic(optional = false)
    @Column(name = "LRTIPOESTADOFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtipoestadofal;
    @Column(name = "LRTIPOESTADOUMD", length = 30)
    private String lrtipoestadoumd;
    @Column(name = "LRTIPOESTADOFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtipoestadofmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrtipoestadoid")
    private List<Lrestadogral> lrestadogralList;

    public Lrtipoestado() {
    }

    public Lrtipoestado(Long lrtipoestadoid) {
        this.lrtipoestadoid = lrtipoestadoid;
    }

    public Lrtipoestado(Long lrtipoestadoid, String lrtipoestadodesc, Character lrtipoestadoac, String lrtipoestadoual, Date lrtipoestadofal) {
        this.lrtipoestadoid = lrtipoestadoid;
        this.lrtipoestadodesc = lrtipoestadodesc;
        this.lrtipoestadoac = lrtipoestadoac;
        this.lrtipoestadoual = lrtipoestadoual;
        this.lrtipoestadofal = lrtipoestadofal;
    }

    public Long getLrtipoestadoid() {
        return lrtipoestadoid;
    }

    public void setLrtipoestadoid(Long lrtipoestadoid) {
        this.lrtipoestadoid = lrtipoestadoid;
    }

    public String getLrtipoestadodesc() {
        return lrtipoestadodesc;
    }

    public void setLrtipoestadodesc(String lrtipoestadodesc) {
        this.lrtipoestadodesc = lrtipoestadodesc;
    }

    public Character getLrtipoestadoac() {
        return lrtipoestadoac;
    }

    public void setLrtipoestadoac(Character lrtipoestadoac) {
        this.lrtipoestadoac = lrtipoestadoac;
    }

    public String getLrtipoestadoual() {
        return lrtipoestadoual;
    }

    public void setLrtipoestadoual(String lrtipoestadoual) {
        this.lrtipoestadoual = lrtipoestadoual;
    }

    public Date getLrtipoestadofal() {
        return lrtipoestadofal;
    }

    public void setLrtipoestadofal(Date lrtipoestadofal) {
        this.lrtipoestadofal = lrtipoestadofal;
    }

    public String getLrtipoestadoumd() {
        return lrtipoestadoumd;
    }

    public void setLrtipoestadoumd(String lrtipoestadoumd) {
        this.lrtipoestadoumd = lrtipoestadoumd;
    }

    public Date getLrtipoestadofmd() {
        return lrtipoestadofmd;
    }

    public void setLrtipoestadofmd(Date lrtipoestadofmd) {
        this.lrtipoestadofmd = lrtipoestadofmd;
    }

    public List<Lrestadogral> getLrestadogralList() {
        return lrestadogralList;
    }

    public void setLrestadogralList(List<Lrestadogral> lrestadogralList) {
        this.lrestadogralList = lrestadogralList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrtipoestadoid != null ? lrtipoestadoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtipoestado)) {
            return false;
        }
        Lrtipoestado other = (Lrtipoestado) object;
        if ((this.lrtipoestadoid == null && other.lrtipoestadoid != null) || (this.lrtipoestadoid != null && !this.lrtipoestadoid.equals(other.lrtipoestadoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtipoestado[ lrtipoestadoid=" + lrtipoestadoid + " ]";
    }
    
}
