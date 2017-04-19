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
@Table(name = "LRTIPOPREMIO")
@NamedQueries({
    @NamedQuery(name = "Lrtipopremio.findAll", query = "SELECT l FROM Lrtipopremio l"),
    @NamedQuery(name = "Lrtipopremio.findByLrtipopremioid", query = "SELECT l FROM Lrtipopremio l WHERE l.lrtipopremioid = :lrtipopremioid"),
    @NamedQuery(name = "Lrtipopremio.findByLrtipopremiocod", query = "SELECT l FROM Lrtipopremio l WHERE l.lrtipopremiocod = :lrtipopremiocod"),
    @NamedQuery(name = "Lrtipopremio.findByLrtipopremiodesc", query = "SELECT l FROM Lrtipopremio l WHERE l.lrtipopremiodesc = :lrtipopremiodesc"),
    @NamedQuery(name = "Lrtipopremio.findByLrtipopremioac", query = "SELECT l FROM Lrtipopremio l WHERE l.lrtipopremioac = :lrtipopremioac"),
    @NamedQuery(name = "Lrtipopremio.findByLrtipopremioual", query = "SELECT l FROM Lrtipopremio l WHERE l.lrtipopremioual = :lrtipopremioual"),
    @NamedQuery(name = "Lrtipopremio.findByLrtipopremiofal", query = "SELECT l FROM Lrtipopremio l WHERE l.lrtipopremiofal = :lrtipopremiofal"),
    @NamedQuery(name = "Lrtipopremio.findByLrtipopremioumd", query = "SELECT l FROM Lrtipopremio l WHERE l.lrtipopremioumd = :lrtipopremioumd"),
    @NamedQuery(name = "Lrtipopremio.findByLrtipopremiofmd", query = "SELECT l FROM Lrtipopremio l WHERE l.lrtipopremiofmd = :lrtipopremiofmd")})
public class Lrtipopremio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRTIPOPREMIOID", nullable = false)
    private Long lrtipopremioid;
    @Basic(optional = false)
    @Column(name = "LRTIPOPREMIOCOD", nullable = false, length = 5)
    private String lrtipopremiocod;
    @Basic(optional = false)
    @Column(name = "LRTIPOPREMIODESC", nullable = false, length = 100)
    private String lrtipopremiodesc;
    @Basic(optional = false)
    @Column(name = "LRTIPOPREMIOAC", nullable = false)
    private Character lrtipopremioac;
    @Column(name = "LRTIPOPREMIOUAL", length = 30)
    private String lrtipopremioual;
    @Column(name = "LRTIPOPREMIOFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtipopremiofal;
    @Column(name = "LRTIPOPREMIOUMD", length = 30)
    private String lrtipopremioumd;
    @Column(name = "LRTIPOPREMIOFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtipopremiofmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrtipopremio")
    private List<Lrcotiplanbienpremio> lrcotiplanbienpremioList;
    @JoinColumn(name = "LRAGRUPAPREMIOID", referencedColumnName = "LRAGRUPAPREMIOID", nullable = false)
    @ManyToOne(optional = false)
    private Lragrupapremio lragrupapremioid;

    public Lrtipopremio() {
    }

    public Lrtipopremio(Long lrtipopremioid) {
        this.lrtipopremioid = lrtipopremioid;
    }

    public Lrtipopremio(Long lrtipopremioid, String lrtipopremiocod, String lrtipopremiodesc, Character lrtipopremioac) {
        this.lrtipopremioid = lrtipopremioid;
        this.lrtipopremiocod = lrtipopremiocod;
        this.lrtipopremiodesc = lrtipopremiodesc;
        this.lrtipopremioac = lrtipopremioac;
    }

    public Long getLrtipopremioid() {
        return lrtipopremioid;
    }

    public void setLrtipopremioid(Long lrtipopremioid) {
        this.lrtipopremioid = lrtipopremioid;
    }

    public String getLrtipopremiocod() {
        return lrtipopremiocod;
    }

    public void setLrtipopremiocod(String lrtipopremiocod) {
        this.lrtipopremiocod = lrtipopremiocod;
    }

    public String getLrtipopremiodesc() {
        return lrtipopremiodesc;
    }

    public void setLrtipopremiodesc(String lrtipopremiodesc) {
        this.lrtipopremiodesc = lrtipopremiodesc;
    }

    public Character getLrtipopremioac() {
        return lrtipopremioac;
    }

    public void setLrtipopremioac(Character lrtipopremioac) {
        this.lrtipopremioac = lrtipopremioac;
    }

    public String getLrtipopremioual() {
        return lrtipopremioual;
    }

    public void setLrtipopremioual(String lrtipopremioual) {
        this.lrtipopremioual = lrtipopremioual;
    }

    public Date getLrtipopremiofal() {
        return lrtipopremiofal;
    }

    public void setLrtipopremiofal(Date lrtipopremiofal) {
        this.lrtipopremiofal = lrtipopremiofal;
    }

    public String getLrtipopremioumd() {
        return lrtipopremioumd;
    }

    public void setLrtipopremioumd(String lrtipopremioumd) {
        this.lrtipopremioumd = lrtipopremioumd;
    }

    public Date getLrtipopremiofmd() {
        return lrtipopremiofmd;
    }

    public void setLrtipopremiofmd(Date lrtipopremiofmd) {
        this.lrtipopremiofmd = lrtipopremiofmd;
    }

    public List<Lrcotiplanbienpremio> getLrcotiplanbienpremioList() {
        return lrcotiplanbienpremioList;
    }

    public void setLrcotiplanbienpremioList(List<Lrcotiplanbienpremio> lrcotiplanbienpremioList) {
        this.lrcotiplanbienpremioList = lrcotiplanbienpremioList;
    }

    public Lragrupapremio getLragrupapremioid() {
        return lragrupapremioid;
    }

    public void setLragrupapremioid(Lragrupapremio lragrupapremioid) {
        this.lragrupapremioid = lragrupapremioid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrtipopremioid != null ? lrtipopremioid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtipopremio)) {
            return false;
        }
        Lrtipopremio other = (Lrtipopremio) object;
        if ((this.lrtipopremioid == null && other.lrtipopremioid != null) || (this.lrtipopremioid != null && !this.lrtipopremioid.equals(other.lrtipopremioid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtipopremio[ lrtipopremioid=" + lrtipopremioid + " ]";
    }
    
}
