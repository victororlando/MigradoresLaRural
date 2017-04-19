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
@Table(name = "LRFORMATRANSLADO")
@NamedQueries({
    @NamedQuery(name = "Lrformatranslado.findAll", query = "SELECT l FROM Lrformatranslado l"),
    @NamedQuery(name = "Lrformatranslado.findByLrformatransladoid", query = "SELECT l FROM Lrformatranslado l WHERE l.lrformatransladoid = :lrformatransladoid"),
    @NamedQuery(name = "Lrformatranslado.findByLrformatransladodesc", query = "SELECT l FROM Lrformatranslado l WHERE l.lrformatransladodesc = :lrformatransladodesc"),
    @NamedQuery(name = "Lrformatranslado.findByLrformatransladofal", query = "SELECT l FROM Lrformatranslado l WHERE l.lrformatransladofal = :lrformatransladofal"),
    @NamedQuery(name = "Lrformatranslado.findByLrformatransladoual", query = "SELECT l FROM Lrformatranslado l WHERE l.lrformatransladoual = :lrformatransladoual"),
    @NamedQuery(name = "Lrformatranslado.findByLrformatransladofmd", query = "SELECT l FROM Lrformatranslado l WHERE l.lrformatransladofmd = :lrformatransladofmd"),
    @NamedQuery(name = "Lrformatranslado.findByLrformatransladoumd", query = "SELECT l FROM Lrformatranslado l WHERE l.lrformatransladoumd = :lrformatransladoumd"),
    @NamedQuery(name = "Lrformatranslado.findByLrformatransladohab", query = "SELECT l FROM Lrformatranslado l WHERE l.lrformatransladohab = :lrformatransladohab")})
public class Lrformatranslado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRFORMATRANSLADOID", nullable = false)
    private Long lrformatransladoid;
    @Basic(optional = false)
    @Column(name = "LRFORMATRANSLADODESC", nullable = false, length = 100)
    private String lrformatransladodesc;
    @Basic(optional = false)
    @Column(name = "LRFORMATRANSLADOFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrformatransladofal;
    @Basic(optional = false)
    @Column(name = "LRFORMATRANSLADOUAL", nullable = false, length = 40)
    private String lrformatransladoual;
    @Basic(optional = false)
    @Column(name = "LRFORMATRANSLADOFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrformatransladofmd;
    @Basic(optional = false)
    @Column(name = "LRFORMATRANSLADOUMD", nullable = false, length = 40)
    private String lrformatransladoumd;
    @Basic(optional = false)
    @Column(name = "LRFORMATRANSLADOHAB", nullable = false)
    private Character lrformatransladohab;
    @OneToMany(mappedBy = "lrformatransladoid")
    private List<Lrpersonasautorizadas> lrpersonasautorizadasList;

    public Lrformatranslado() {
    }

    public Lrformatranslado(Long lrformatransladoid) {
        this.lrformatransladoid = lrformatransladoid;
    }

    public Lrformatranslado(Long lrformatransladoid, String lrformatransladodesc, Date lrformatransladofal, String lrformatransladoual, Date lrformatransladofmd, String lrformatransladoumd, Character lrformatransladohab) {
        this.lrformatransladoid = lrformatransladoid;
        this.lrformatransladodesc = lrformatransladodesc;
        this.lrformatransladofal = lrformatransladofal;
        this.lrformatransladoual = lrformatransladoual;
        this.lrformatransladofmd = lrformatransladofmd;
        this.lrformatransladoumd = lrformatransladoumd;
        this.lrformatransladohab = lrformatransladohab;
    }

    public Long getLrformatransladoid() {
        return lrformatransladoid;
    }

    public void setLrformatransladoid(Long lrformatransladoid) {
        this.lrformatransladoid = lrformatransladoid;
    }

    public String getLrformatransladodesc() {
        return lrformatransladodesc;
    }

    public void setLrformatransladodesc(String lrformatransladodesc) {
        this.lrformatransladodesc = lrformatransladodesc;
    }

    public Date getLrformatransladofal() {
        return lrformatransladofal;
    }

    public void setLrformatransladofal(Date lrformatransladofal) {
        this.lrformatransladofal = lrformatransladofal;
    }

    public String getLrformatransladoual() {
        return lrformatransladoual;
    }

    public void setLrformatransladoual(String lrformatransladoual) {
        this.lrformatransladoual = lrformatransladoual;
    }

    public Date getLrformatransladofmd() {
        return lrformatransladofmd;
    }

    public void setLrformatransladofmd(Date lrformatransladofmd) {
        this.lrformatransladofmd = lrformatransladofmd;
    }

    public String getLrformatransladoumd() {
        return lrformatransladoumd;
    }

    public void setLrformatransladoumd(String lrformatransladoumd) {
        this.lrformatransladoumd = lrformatransladoumd;
    }

    public Character getLrformatransladohab() {
        return lrformatransladohab;
    }

    public void setLrformatransladohab(Character lrformatransladohab) {
        this.lrformatransladohab = lrformatransladohab;
    }

    public List<Lrpersonasautorizadas> getLrpersonasautorizadasList() {
        return lrpersonasautorizadasList;
    }

    public void setLrpersonasautorizadasList(List<Lrpersonasautorizadas> lrpersonasautorizadasList) {
        this.lrpersonasautorizadasList = lrpersonasautorizadasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrformatransladoid != null ? lrformatransladoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrformatranslado)) {
            return false;
        }
        Lrformatranslado other = (Lrformatranslado) object;
        if ((this.lrformatransladoid == null && other.lrformatransladoid != null) || (this.lrformatransladoid != null && !this.lrformatransladoid.equals(other.lrformatransladoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrformatranslado[ lrformatransladoid=" + lrformatransladoid + " ]";
    }
    
}
