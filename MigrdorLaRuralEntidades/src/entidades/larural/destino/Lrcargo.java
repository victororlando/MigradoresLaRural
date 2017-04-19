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
@Table(name = "LRCARGO")
@NamedQueries({
    @NamedQuery(name = "Lrcargo.findAll", query = "SELECT l FROM Lrcargo l"),
    @NamedQuery(name = "Lrcargo.findByLrcargoid", query = "SELECT l FROM Lrcargo l WHERE l.lrcargoid = :lrcargoid"),
    @NamedQuery(name = "Lrcargo.findByLrcargodesc", query = "SELECT l FROM Lrcargo l WHERE l.lrcargodesc = :lrcargodesc"),
    @NamedQuery(name = "Lrcargo.findByLrcargohab", query = "SELECT l FROM Lrcargo l WHERE l.lrcargohab = :lrcargohab"),
    @NamedQuery(name = "Lrcargo.findByLrcargofal", query = "SELECT l FROM Lrcargo l WHERE l.lrcargofal = :lrcargofal"),
    @NamedQuery(name = "Lrcargo.findByLrcargoual", query = "SELECT l FROM Lrcargo l WHERE l.lrcargoual = :lrcargoual"),
    @NamedQuery(name = "Lrcargo.findByLrcargofmd", query = "SELECT l FROM Lrcargo l WHERE l.lrcargofmd = :lrcargofmd"),
    @NamedQuery(name = "Lrcargo.findByLrcargoumd", query = "SELECT l FROM Lrcargo l WHERE l.lrcargoumd = :lrcargoumd")})
public class Lrcargo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCARGOID", nullable = false)
    private Short lrcargoid;
    @Basic(optional = false)
    @Column(name = "LRCARGODESC", nullable = false, length = 100)
    private String lrcargodesc;
    @Basic(optional = false)
    @Column(name = "LRCARGOHAB", nullable = false)
    private Character lrcargohab;
    @Basic(optional = false)
    @Column(name = "LRCARGOFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcargofal;
    @Basic(optional = false)
    @Column(name = "LRCARGOUAL", nullable = false, length = 30)
    private String lrcargoual;
    @Basic(optional = false)
    @Column(name = "LRCARGOFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcargofmd;
    @Basic(optional = false)
    @Column(name = "LRCARGOUMD", nullable = false, length = 30)
    private String lrcargoumd;
    @OneToMany(mappedBy = "lrpersonajurcargocontacto")
    private List<Lrpersonajur> lrpersonajurList;
    @OneToMany(mappedBy = "lrpersonajurcargorepre")
    private List<Lrpersonajur> lrpersonajurList1;
    @OneToMany(mappedBy = "lrcargoid")
    private List<Lrcotidatbienase> lrcotidatbienaseList;
    @OneToMany(mappedBy = "lrcargoid")
    private List<Lrpersonafis> lrpersonafisList;
    @OneToMany(mappedBy = "slrcargoid")
    private List<Lrpersonasautorizadas> lrpersonasautorizadasList;

    public Lrcargo() {
    }

    public Lrcargo(Short lrcargoid) {
        this.lrcargoid = lrcargoid;
    }

    public Lrcargo(Short lrcargoid, String lrcargodesc, Character lrcargohab, Date lrcargofal, String lrcargoual, Date lrcargofmd, String lrcargoumd) {
        this.lrcargoid = lrcargoid;
        this.lrcargodesc = lrcargodesc;
        this.lrcargohab = lrcargohab;
        this.lrcargofal = lrcargofal;
        this.lrcargoual = lrcargoual;
        this.lrcargofmd = lrcargofmd;
        this.lrcargoumd = lrcargoumd;
    }

    public Short getLrcargoid() {
        return lrcargoid;
    }

    public void setLrcargoid(Short lrcargoid) {
        this.lrcargoid = lrcargoid;
    }

    public String getLrcargodesc() {
        return lrcargodesc;
    }

    public void setLrcargodesc(String lrcargodesc) {
        this.lrcargodesc = lrcargodesc;
    }

    public Character getLrcargohab() {
        return lrcargohab;
    }

    public void setLrcargohab(Character lrcargohab) {
        this.lrcargohab = lrcargohab;
    }

    public Date getLrcargofal() {
        return lrcargofal;
    }

    public void setLrcargofal(Date lrcargofal) {
        this.lrcargofal = lrcargofal;
    }

    public String getLrcargoual() {
        return lrcargoual;
    }

    public void setLrcargoual(String lrcargoual) {
        this.lrcargoual = lrcargoual;
    }

    public Date getLrcargofmd() {
        return lrcargofmd;
    }

    public void setLrcargofmd(Date lrcargofmd) {
        this.lrcargofmd = lrcargofmd;
    }

    public String getLrcargoumd() {
        return lrcargoumd;
    }

    public void setLrcargoumd(String lrcargoumd) {
        this.lrcargoumd = lrcargoumd;
    }

    public List<Lrpersonajur> getLrpersonajurList() {
        return lrpersonajurList;
    }

    public void setLrpersonajurList(List<Lrpersonajur> lrpersonajurList) {
        this.lrpersonajurList = lrpersonajurList;
    }

    public List<Lrpersonajur> getLrpersonajurList1() {
        return lrpersonajurList1;
    }

    public void setLrpersonajurList1(List<Lrpersonajur> lrpersonajurList1) {
        this.lrpersonajurList1 = lrpersonajurList1;
    }

    public List<Lrcotidatbienase> getLrcotidatbienaseList() {
        return lrcotidatbienaseList;
    }

    public void setLrcotidatbienaseList(List<Lrcotidatbienase> lrcotidatbienaseList) {
        this.lrcotidatbienaseList = lrcotidatbienaseList;
    }

    public List<Lrpersonafis> getLrpersonafisList() {
        return lrpersonafisList;
    }

    public void setLrpersonafisList(List<Lrpersonafis> lrpersonafisList) {
        this.lrpersonafisList = lrpersonafisList;
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
        hash += (lrcargoid != null ? lrcargoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcargo)) {
            return false;
        }
        Lrcargo other = (Lrcargo) object;
        if ((this.lrcargoid == null && other.lrcargoid != null) || (this.lrcargoid != null && !this.lrcargoid.equals(other.lrcargoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcargo[ lrcargoid=" + lrcargoid + " ]";
    }
    
}
