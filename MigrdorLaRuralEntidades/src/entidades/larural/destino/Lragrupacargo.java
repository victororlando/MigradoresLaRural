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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRAGRUPACARGO")
@NamedQueries({
    @NamedQuery(name = "Lragrupacargo.findAll", query = "SELECT l FROM Lragrupacargo l"),
    @NamedQuery(name = "Lragrupacargo.findByLragrupacargoid", query = "SELECT l FROM Lragrupacargo l WHERE l.lragrupacargoid = :lragrupacargoid"),
    @NamedQuery(name = "Lragrupacargo.findByLragrupacargodesc", query = "SELECT l FROM Lragrupacargo l WHERE l.lragrupacargodesc = :lragrupacargodesc"),
    @NamedQuery(name = "Lragrupacargo.findByLragrupacargoac", query = "SELECT l FROM Lragrupacargo l WHERE l.lragrupacargoac = :lragrupacargoac"),
    @NamedQuery(name = "Lragrupacargo.findByLragrupacargoual", query = "SELECT l FROM Lragrupacargo l WHERE l.lragrupacargoual = :lragrupacargoual"),
    @NamedQuery(name = "Lragrupacargo.findByLragrupacargofal", query = "SELECT l FROM Lragrupacargo l WHERE l.lragrupacargofal = :lragrupacargofal"),
    @NamedQuery(name = "Lragrupacargo.findByLragrupacargoumd", query = "SELECT l FROM Lragrupacargo l WHERE l.lragrupacargoumd = :lragrupacargoumd"),
    @NamedQuery(name = "Lragrupacargo.findByLragrupacargofmd", query = "SELECT l FROM Lragrupacargo l WHERE l.lragrupacargofmd = :lragrupacargofmd")})
public class Lragrupacargo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "LRAGRUPACARGOID_SEQ_GENERATOR", sequenceName = "LRAGRUPACARGOID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LRAGRUPACARGOID_SEQ_GENERATOR")
    @Basic(optional = false)
    @Column(name = "LRAGRUPACARGOID", nullable = false)
    private Long lragrupacargoid;
    @Basic(optional = false)
    @Column(name = "LRAGRUPACARGODESC", nullable = false, length = 100)
    private String lragrupacargodesc;
    @Basic(optional = false)
    @Column(name = "LRAGRUPACARGOAC", nullable = false)
    private Character lragrupacargoac;
    @Column(name = "LRAGRUPACARGOUAL", length = 30)
    private String lragrupacargoual;
    @Column(name = "LRAGRUPACARGOFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lragrupacargofal;
    @Column(name = "LRAGRUPACARGOUMD", length = 30)
    private String lragrupacargoumd;
    @Column(name = "LRAGRUPACARGOFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lragrupacargofmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lragrupacargoid")
    private List<Lrpersonaasegurada> lrpersonaaseguradaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lragrupacargoid")
    private List<Lragrupacargoturno> lragrupacargoturnoList;

    public Lragrupacargo() {
    }

    public Lragrupacargo(Long lragrupacargoid) {
        this.lragrupacargoid = lragrupacargoid;
    }

    public Lragrupacargo(Long lragrupacargoid, String lragrupacargodesc, Character lragrupacargoac) {
        this.lragrupacargoid = lragrupacargoid;
        this.lragrupacargodesc = lragrupacargodesc;
        this.lragrupacargoac = lragrupacargoac;
    }

    public Long getLragrupacargoid() {
        return lragrupacargoid;
    }

    public void setLragrupacargoid(Long lragrupacargoid) {
        this.lragrupacargoid = lragrupacargoid;
    }

    public String getLragrupacargodesc() {
        return lragrupacargodesc;
    }

    public void setLragrupacargodesc(String lragrupacargodesc) {
        this.lragrupacargodesc = lragrupacargodesc;
    }

    public Character getLragrupacargoac() {
        return lragrupacargoac;
    }

    public void setLragrupacargoac(Character lragrupacargoac) {
        this.lragrupacargoac = lragrupacargoac;
    }

    public String getLragrupacargoual() {
        return lragrupacargoual;
    }

    public void setLragrupacargoual(String lragrupacargoual) {
        this.lragrupacargoual = lragrupacargoual;
    }

    public Date getLragrupacargofal() {
        return lragrupacargofal;
    }

    public void setLragrupacargofal(Date lragrupacargofal) {
        this.lragrupacargofal = lragrupacargofal;
    }

    public String getLragrupacargoumd() {
        return lragrupacargoumd;
    }

    public void setLragrupacargoumd(String lragrupacargoumd) {
        this.lragrupacargoumd = lragrupacargoumd;
    }

    public Date getLragrupacargofmd() {
        return lragrupacargofmd;
    }

    public void setLragrupacargofmd(Date lragrupacargofmd) {
        this.lragrupacargofmd = lragrupacargofmd;
    }

    public List<Lrpersonaasegurada> getLrpersonaaseguradaList() {
        return lrpersonaaseguradaList;
    }

    public void setLrpersonaaseguradaList(List<Lrpersonaasegurada> lrpersonaaseguradaList) {
        this.lrpersonaaseguradaList = lrpersonaaseguradaList;
    }

    public List<Lragrupacargoturno> getLragrupacargoturnoList() {
        return lragrupacargoturnoList;
    }

    public void setLragrupacargoturnoList(List<Lragrupacargoturno> lragrupacargoturnoList) {
        this.lragrupacargoturnoList = lragrupacargoturnoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lragrupacargoid != null ? lragrupacargoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lragrupacargo)) {
            return false;
        }
        Lragrupacargo other = (Lragrupacargo) object;
        if ((this.lragrupacargoid == null && other.lragrupacargoid != null) || (this.lragrupacargoid != null && !this.lragrupacargoid.equals(other.lragrupacargoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lragrupacargo[ lragrupacargoid=" + lragrupacargoid + " ]";
    }

}
