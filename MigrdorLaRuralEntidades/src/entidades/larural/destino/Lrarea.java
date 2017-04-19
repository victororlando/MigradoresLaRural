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
@Table(name = "LRAREA")
@NamedQueries({
    @NamedQuery(name = "Lrarea.findAll", query = "SELECT l FROM Lrarea l"),
    @NamedQuery(name = "Lrarea.findByLrareaid", query = "SELECT l FROM Lrarea l WHERE l.lrareaid = :lrareaid"),
    @NamedQuery(name = "Lrarea.findByLrareadesc", query = "SELECT l FROM Lrarea l WHERE l.lrareadesc = :lrareadesc"),
    @NamedQuery(name = "Lrarea.findByLrareaactivo", query = "SELECT l FROM Lrarea l WHERE l.lrareaactivo = :lrareaactivo"),
    @NamedQuery(name = "Lrarea.findByLrareafal", query = "SELECT l FROM Lrarea l WHERE l.lrareafal = :lrareafal"),
    @NamedQuery(name = "Lrarea.findByLrareaual", query = "SELECT l FROM Lrarea l WHERE l.lrareaual = :lrareaual"),
    @NamedQuery(name = "Lrarea.findByLrareafmd", query = "SELECT l FROM Lrarea l WHERE l.lrareafmd = :lrareafmd"),
    @NamedQuery(name = "Lrarea.findByLrareaumd", query = "SELECT l FROM Lrarea l WHERE l.lrareaumd = :lrareaumd")})
public class Lrarea implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRAREAID", nullable = false)
    private Long lrareaid;
    @Basic(optional = false)
    @Column(name = "LRAREADESC", nullable = false, length = 300)
    private String lrareadesc;
    @Basic(optional = false)
    @Column(name = "LRAREAACTIVO", nullable = false)
    private Character lrareaactivo;
    @Basic(optional = false)
    @Column(name = "LRAREAFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrareafal;
    @Basic(optional = false)
    @Column(name = "LRAREAUAL", nullable = false, length = 30)
    private String lrareaual;
    @Basic(optional = false)
    @Column(name = "LRAREAFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrareafmd;
    @Basic(optional = false)
    @Column(name = "LRAREAUMD", nullable = false, length = 30)
    private String lrareaumd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dsaLrareaid")
    private List<Lrdimensionsumaseg> lrdimensionsumasegList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrareaid")
    private List<Lrdimension> lrdimensionList;
    @OneToMany(mappedBy = "lrareaid")
    private List<Lrflujoreglas> lrflujoreglasList;
    @OneToMany(mappedBy = "stlrareaid")
    private List<Lrflujoreglas> lrflujoreglasList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrarea")
    private List<Lrpuntuaciondefinitiva> lrpuntuaciondefinitivaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrarea")
    private List<Lrareasubarea> lrareasubareaList;
    @OneToMany(mappedBy = "lrareaid")
    private List<Lrpersonafis> lrpersonafisList;

    public Lrarea() {
    }

    public Lrarea(Long lrareaid) {
        this.lrareaid = lrareaid;
    }

    public Lrarea(Long lrareaid, String lrareadesc, Character lrareaactivo, Date lrareafal, String lrareaual, Date lrareafmd, String lrareaumd) {
        this.lrareaid = lrareaid;
        this.lrareadesc = lrareadesc;
        this.lrareaactivo = lrareaactivo;
        this.lrareafal = lrareafal;
        this.lrareaual = lrareaual;
        this.lrareafmd = lrareafmd;
        this.lrareaumd = lrareaumd;
    }

    public Long getLrareaid() {
        return lrareaid;
    }

    public void setLrareaid(Long lrareaid) {
        this.lrareaid = lrareaid;
    }

    public String getLrareadesc() {
        return lrareadesc;
    }

    public void setLrareadesc(String lrareadesc) {
        this.lrareadesc = lrareadesc;
    }

    public Character getLrareaactivo() {
        return lrareaactivo;
    }

    public void setLrareaactivo(Character lrareaactivo) {
        this.lrareaactivo = lrareaactivo;
    }

    public Date getLrareafal() {
        return lrareafal;
    }

    public void setLrareafal(Date lrareafal) {
        this.lrareafal = lrareafal;
    }

    public String getLrareaual() {
        return lrareaual;
    }

    public void setLrareaual(String lrareaual) {
        this.lrareaual = lrareaual;
    }

    public Date getLrareafmd() {
        return lrareafmd;
    }

    public void setLrareafmd(Date lrareafmd) {
        this.lrareafmd = lrareafmd;
    }

    public String getLrareaumd() {
        return lrareaumd;
    }

    public void setLrareaumd(String lrareaumd) {
        this.lrareaumd = lrareaumd;
    }

    public List<Lrdimensionsumaseg> getLrdimensionsumasegList() {
        return lrdimensionsumasegList;
    }

    public void setLrdimensionsumasegList(List<Lrdimensionsumaseg> lrdimensionsumasegList) {
        this.lrdimensionsumasegList = lrdimensionsumasegList;
    }

    public List<Lrdimension> getLrdimensionList() {
        return lrdimensionList;
    }

    public void setLrdimensionList(List<Lrdimension> lrdimensionList) {
        this.lrdimensionList = lrdimensionList;
    }

    public List<Lrflujoreglas> getLrflujoreglasList() {
        return lrflujoreglasList;
    }

    public void setLrflujoreglasList(List<Lrflujoreglas> lrflujoreglasList) {
        this.lrflujoreglasList = lrflujoreglasList;
    }

    public List<Lrflujoreglas> getLrflujoreglasList1() {
        return lrflujoreglasList1;
    }

    public void setLrflujoreglasList1(List<Lrflujoreglas> lrflujoreglasList1) {
        this.lrflujoreglasList1 = lrflujoreglasList1;
    }

    public List<Lrpuntuaciondefinitiva> getLrpuntuaciondefinitivaList() {
        return lrpuntuaciondefinitivaList;
    }

    public void setLrpuntuaciondefinitivaList(List<Lrpuntuaciondefinitiva> lrpuntuaciondefinitivaList) {
        this.lrpuntuaciondefinitivaList = lrpuntuaciondefinitivaList;
    }

    public List<Lrareasubarea> getLrareasubareaList() {
        return lrareasubareaList;
    }

    public void setLrareasubareaList(List<Lrareasubarea> lrareasubareaList) {
        this.lrareasubareaList = lrareasubareaList;
    }

    public List<Lrpersonafis> getLrpersonafisList() {
        return lrpersonafisList;
    }

    public void setLrpersonafisList(List<Lrpersonafis> lrpersonafisList) {
        this.lrpersonafisList = lrpersonafisList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrareaid != null ? lrareaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrarea)) {
            return false;
        }
        Lrarea other = (Lrarea) object;
        if ((this.lrareaid == null && other.lrareaid != null) || (this.lrareaid != null && !this.lrareaid.equals(other.lrareaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrarea[ lrareaid=" + lrareaid + " ]";
    }
    
}
