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
@Table(name = "LRAGRUPAPREMIO")
@NamedQueries({
    @NamedQuery(name = "Lragrupapremio.findAll", query = "SELECT l FROM Lragrupapremio l"),
    @NamedQuery(name = "Lragrupapremio.findByLragrupapremioid", query = "SELECT l FROM Lragrupapremio l WHERE l.lragrupapremioid = :lragrupapremioid"),
    @NamedQuery(name = "Lragrupapremio.findByLragrupapremiodesc", query = "SELECT l FROM Lragrupapremio l WHERE l.lragrupapremiodesc = :lragrupapremiodesc"),
    @NamedQuery(name = "Lragrupapremio.findByLragrupapremioac", query = "SELECT l FROM Lragrupapremio l WHERE l.lragrupapremioac = :lragrupapremioac"),
    @NamedQuery(name = "Lragrupapremio.findByLragrupapremioual", query = "SELECT l FROM Lragrupapremio l WHERE l.lragrupapremioual = :lragrupapremioual"),
    @NamedQuery(name = "Lragrupapremio.findByLragrupapremiofal", query = "SELECT l FROM Lragrupapremio l WHERE l.lragrupapremiofal = :lragrupapremiofal"),
    @NamedQuery(name = "Lragrupapremio.findByLragrupapremioumd", query = "SELECT l FROM Lragrupapremio l WHERE l.lragrupapremioumd = :lragrupapremioumd"),
    @NamedQuery(name = "Lragrupapremio.findByLragrupapremiofmd", query = "SELECT l FROM Lragrupapremio l WHERE l.lragrupapremiofmd = :lragrupapremiofmd")})
public class Lragrupapremio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRAGRUPAPREMIOID", nullable = false)
    private Long lragrupapremioid;
    @Basic(optional = false)
    @Column(name = "LRAGRUPAPREMIODESC", nullable = false, length = 100)
    private String lragrupapremiodesc;
    @Basic(optional = false)
    @Column(name = "LRAGRUPAPREMIOAC", nullable = false)
    private Character lragrupapremioac;
    @Column(name = "LRAGRUPAPREMIOUAL", length = 30)
    private String lragrupapremioual;
    @Column(name = "LRAGRUPAPREMIOFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lragrupapremiofal;
    @Column(name = "LRAGRUPAPREMIOUMD", length = 30)
    private String lragrupapremioumd;
    @Column(name = "LRAGRUPAPREMIOFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lragrupapremiofmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lragrupapremioid")
    private List<Lrtipopremio> lrtipopremioList;

    public Lragrupapremio() {
    }

    public Lragrupapremio(Long lragrupapremioid) {
        this.lragrupapremioid = lragrupapremioid;
    }

    public Lragrupapremio(Long lragrupapremioid, String lragrupapremiodesc, Character lragrupapremioac) {
        this.lragrupapremioid = lragrupapremioid;
        this.lragrupapremiodesc = lragrupapremiodesc;
        this.lragrupapremioac = lragrupapremioac;
    }

    public Long getLragrupapremioid() {
        return lragrupapremioid;
    }

    public void setLragrupapremioid(Long lragrupapremioid) {
        this.lragrupapremioid = lragrupapremioid;
    }

    public String getLragrupapremiodesc() {
        return lragrupapremiodesc;
    }

    public void setLragrupapremiodesc(String lragrupapremiodesc) {
        this.lragrupapremiodesc = lragrupapremiodesc;
    }

    public Character getLragrupapremioac() {
        return lragrupapremioac;
    }

    public void setLragrupapremioac(Character lragrupapremioac) {
        this.lragrupapremioac = lragrupapremioac;
    }

    public String getLragrupapremioual() {
        return lragrupapremioual;
    }

    public void setLragrupapremioual(String lragrupapremioual) {
        this.lragrupapremioual = lragrupapremioual;
    }

    public Date getLragrupapremiofal() {
        return lragrupapremiofal;
    }

    public void setLragrupapremiofal(Date lragrupapremiofal) {
        this.lragrupapremiofal = lragrupapremiofal;
    }

    public String getLragrupapremioumd() {
        return lragrupapremioumd;
    }

    public void setLragrupapremioumd(String lragrupapremioumd) {
        this.lragrupapremioumd = lragrupapremioumd;
    }

    public Date getLragrupapremiofmd() {
        return lragrupapremiofmd;
    }

    public void setLragrupapremiofmd(Date lragrupapremiofmd) {
        this.lragrupapremiofmd = lragrupapremiofmd;
    }

    public List<Lrtipopremio> getLrtipopremioList() {
        return lrtipopremioList;
    }

    public void setLrtipopremioList(List<Lrtipopremio> lrtipopremioList) {
        this.lrtipopremioList = lrtipopremioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lragrupapremioid != null ? lragrupapremioid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lragrupapremio)) {
            return false;
        }
        Lragrupapremio other = (Lragrupapremio) object;
        if ((this.lragrupapremioid == null && other.lragrupapremioid != null) || (this.lragrupapremioid != null && !this.lragrupapremioid.equals(other.lragrupapremioid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lragrupapremio[ lragrupapremioid=" + lragrupapremioid + " ]";
    }
    
}
