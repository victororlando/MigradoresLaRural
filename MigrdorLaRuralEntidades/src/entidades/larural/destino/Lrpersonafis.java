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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "LRPERSONAFIS")
@NamedQueries({
    @NamedQuery(name = "Lrpersonafis.findAll", query = "SELECT l FROM Lrpersonafis l"),
    @NamedQuery(name = "Lrpersonafis.findByLrpersonafisid", query = "SELECT l FROM Lrpersonafis l WHERE l.lrpersonafisid = :lrpersonafisid"),
    @NamedQuery(name = "Lrpersonafis.findByLrpersonafisnombres", query = "SELECT l FROM Lrpersonafis l WHERE l.lrpersonafisnombres = :lrpersonafisnombres"),
    @NamedQuery(name = "Lrpersonafis.findByLrpersonafisapellidos", query = "SELECT l FROM Lrpersonafis l WHERE l.lrpersonafisapellidos = :lrpersonafisapellidos"),
    @NamedQuery(name = "Lrpersonafis.findByLrpersonafissex", query = "SELECT l FROM Lrpersonafis l WHERE l.lrpersonafissex = :lrpersonafissex"),
    @NamedQuery(name = "Lrpersonafis.findByLrpersonafisfchnac", query = "SELECT l FROM Lrpersonafis l WHERE l.lrpersonafisfchnac = :lrpersonafisfchnac"),
    @NamedQuery(name = "Lrpersonafis.findByLrpersonafisedad", query = "SELECT l FROM Lrpersonafis l WHERE l.lrpersonafisedad = :lrpersonafisedad"),
    @NamedQuery(name = "Lrpersonafis.findByLrprofid", query = "SELECT l FROM Lrpersonafis l WHERE l.lrprofid = :lrprofid"),
    @NamedQuery(name = "Lrpersonafis.findByLrnacionalidadid", query = "SELECT l FROM Lrpersonafis l WHERE l.lrnacionalidadid = :lrnacionalidadid"),
    @NamedQuery(name = "Lrpersonafis.findByLrpersonafiscargoantig", query = "SELECT l FROM Lrpersonafis l WHERE l.lrpersonafiscargoantig = :lrpersonafiscargoantig"),
    @NamedQuery(name = "Lrpersonafis.findByLrpersonafisantiguedad", query = "SELECT l FROM Lrpersonafis l WHERE l.lrpersonafisantiguedad = :lrpersonafisantiguedad"),
    @NamedQuery(name = "Lrpersonafis.findByLrpersonafisestcivil", query = "SELECT l FROM Lrpersonafis l WHERE l.lrpersonafisestcivil = :lrpersonafisestcivil"),
    @NamedQuery(name = "Lrpersonafis.findByLrpersonafislugartrab", query = "SELECT l FROM Lrpersonafis l WHERE l.lrpersonafislugartrab = :lrpersonafislugartrab"),
    @NamedQuery(name = "Lrpersonafis.findByLrdepidlaboral", query = "SELECT l FROM Lrpersonafis l WHERE l.lrdepidlaboral = :lrdepidlaboral"),
    @NamedQuery(name = "Lrpersonafis.findByLrciuidlaboral", query = "SELECT l FROM Lrpersonafis l WHERE l.lrciuidlaboral = :lrciuidlaboral"),
    @NamedQuery(name = "Lrpersonafis.findByLrpaisidresidencia", query = "SELECT l FROM Lrpersonafis l WHERE l.lrpaisidresidencia = :lrpaisidresidencia"),
    @NamedQuery(name = "Lrpersonafis.findByLrpersonafisdirlaboral", query = "SELECT l FROM Lrpersonafis l WHERE l.lrpersonafisdirlaboral = :lrpersonafisdirlaboral"),
    @NamedQuery(name = "Lrpersonafis.findByLrpersonafisdoctip", query = "SELECT l FROM Lrpersonafis l WHERE l.lrpersonafisdoctip = :lrpersonafisdoctip"),
    @NamedQuery(name = "Lrpersonafis.findByLrpersonafisseccid", query = "SELECT l FROM Lrpersonafis l WHERE l.lrpersonafisseccid = :lrpersonafisseccid"),
    @NamedQuery(name = "Lrpersonafis.findByLrpersonafistipoentidadid", query = "SELECT l FROM Lrpersonafis l WHERE l.lrpersonafistipoentidadid = :lrpersonafistipoentidadid")})
public class Lrpersonafis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRPERSONAFISID", nullable = false)
    private Long lrpersonafisid;
    @Basic(optional = false)
    @Column(name = "LRPERSONAFISNOMBRES", nullable = false, length = 80)
    private String lrpersonafisnombres;
    @Basic(optional = false)
    @Column(name = "LRPERSONAFISAPELLIDOS", nullable = false, length = 80)
    private String lrpersonafisapellidos;
    @Column(name = "LRPERSONAFISSEX")
    private Character lrpersonafissex;
    @Column(name = "LRPERSONAFISFCHNAC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrpersonafisfchnac;
    @Column(name = "LRPERSONAFISEDAD")
    private Short lrpersonafisedad;
    @Column(name = "LRPROFID")
    private Short lrprofid;
    @Column(name = "LRNACIONALIDADID")
    private Short lrnacionalidadid;
    @Column(name = "LRPERSONAFISCARGOANTIG")
    private Short lrpersonafiscargoantig;
    @Column(name = "LRPERSONAFISANTIGUEDAD")
    private Short lrpersonafisantiguedad;
    @Column(name = "LRPERSONAFISESTCIVIL", length = 2)
    private String lrpersonafisestcivil;
    @Column(name = "LRPERSONAFISLUGARTRAB", length = 80)
    private String lrpersonafislugartrab;
    @Column(name = "LRDEPIDLABORAL")
    private Short lrdepidlaboral;
    @Column(name = "LRCIUIDLABORAL")
    private Short lrciuidlaboral;
    @Column(name = "LRPAISIDRESIDENCIA")
    private Short lrpaisidresidencia;
    @Column(name = "LRPERSONAFISDIRLABORAL", length = 80)
    private String lrpersonafisdirlaboral;
    @Column(name = "LRPERSONAFISDOCTIP")
    private Short lrpersonafisdoctip;
    @Column(name = "LRPERSONAFISSECCID")
    private Long lrpersonafisseccid;
    @Column(name = "LRPERSONAFISTIPOENTIDADID")
    private Long lrpersonafistipoentidadid;
    @JoinColumn(name = "LRAREAID", referencedColumnName = "LRAREAID")
    @ManyToOne
    private Lrarea lrareaid;
    @JoinColumn(name = "LRCARGOID", referencedColumnName = "LRCARGOID")
    @ManyToOne
    private Lrcargo lrcargoid;

    public Lrpersonafis() {
    }

    public Lrpersonafis(Long lrpersonafisid) {
        this.lrpersonafisid = lrpersonafisid;
    }

    public Lrpersonafis(Long lrpersonafisid, String lrpersonafisnombres, String lrpersonafisapellidos) {
        this.lrpersonafisid = lrpersonafisid;
        this.lrpersonafisnombres = lrpersonafisnombres;
        this.lrpersonafisapellidos = lrpersonafisapellidos;
    }

    public Long getLrpersonafisid() {
        return lrpersonafisid;
    }

    public void setLrpersonafisid(Long lrpersonafisid) {
        this.lrpersonafisid = lrpersonafisid;
    }

    public String getLrpersonafisnombres() {
        return lrpersonafisnombres;
    }

    public void setLrpersonafisnombres(String lrpersonafisnombres) {
        this.lrpersonafisnombres = lrpersonafisnombres;
    }

    public String getLrpersonafisapellidos() {
        return lrpersonafisapellidos;
    }

    public void setLrpersonafisapellidos(String lrpersonafisapellidos) {
        this.lrpersonafisapellidos = lrpersonafisapellidos;
    }

    public Character getLrpersonafissex() {
        return lrpersonafissex;
    }

    public void setLrpersonafissex(Character lrpersonafissex) {
        this.lrpersonafissex = lrpersonafissex;
    }

    public Date getLrpersonafisfchnac() {
        return lrpersonafisfchnac;
    }

    public void setLrpersonafisfchnac(Date lrpersonafisfchnac) {
        this.lrpersonafisfchnac = lrpersonafisfchnac;
    }

    public Short getLrpersonafisedad() {
        return lrpersonafisedad;
    }

    public void setLrpersonafisedad(Short lrpersonafisedad) {
        this.lrpersonafisedad = lrpersonafisedad;
    }

    public Short getLrprofid() {
        return lrprofid;
    }

    public void setLrprofid(Short lrprofid) {
        this.lrprofid = lrprofid;
    }

    public Short getLrnacionalidadid() {
        return lrnacionalidadid;
    }

    public void setLrnacionalidadid(Short lrnacionalidadid) {
        this.lrnacionalidadid = lrnacionalidadid;
    }

    public Short getLrpersonafiscargoantig() {
        return lrpersonafiscargoantig;
    }

    public void setLrpersonafiscargoantig(Short lrpersonafiscargoantig) {
        this.lrpersonafiscargoantig = lrpersonafiscargoantig;
    }

    public Short getLrpersonafisantiguedad() {
        return lrpersonafisantiguedad;
    }

    public void setLrpersonafisantiguedad(Short lrpersonafisantiguedad) {
        this.lrpersonafisantiguedad = lrpersonafisantiguedad;
    }

    public String getLrpersonafisestcivil() {
        return lrpersonafisestcivil;
    }

    public void setLrpersonafisestcivil(String lrpersonafisestcivil) {
        this.lrpersonafisestcivil = lrpersonafisestcivil;
    }

    public String getLrpersonafislugartrab() {
        return lrpersonafislugartrab;
    }

    public void setLrpersonafislugartrab(String lrpersonafislugartrab) {
        this.lrpersonafislugartrab = lrpersonafislugartrab;
    }

    public Short getLrdepidlaboral() {
        return lrdepidlaboral;
    }

    public void setLrdepidlaboral(Short lrdepidlaboral) {
        this.lrdepidlaboral = lrdepidlaboral;
    }

    public Short getLrciuidlaboral() {
        return lrciuidlaboral;
    }

    public void setLrciuidlaboral(Short lrciuidlaboral) {
        this.lrciuidlaboral = lrciuidlaboral;
    }

    public Short getLrpaisidresidencia() {
        return lrpaisidresidencia;
    }

    public void setLrpaisidresidencia(Short lrpaisidresidencia) {
        this.lrpaisidresidencia = lrpaisidresidencia;
    }

    public String getLrpersonafisdirlaboral() {
        return lrpersonafisdirlaboral;
    }

    public void setLrpersonafisdirlaboral(String lrpersonafisdirlaboral) {
        this.lrpersonafisdirlaboral = lrpersonafisdirlaboral;
    }

    public Short getLrpersonafisdoctip() {
        return lrpersonafisdoctip;
    }

    public void setLrpersonafisdoctip(Short lrpersonafisdoctip) {
        this.lrpersonafisdoctip = lrpersonafisdoctip;
    }

    public Long getLrpersonafisseccid() {
        return lrpersonafisseccid;
    }

    public void setLrpersonafisseccid(Long lrpersonafisseccid) {
        this.lrpersonafisseccid = lrpersonafisseccid;
    }

    public Long getLrpersonafistipoentidadid() {
        return lrpersonafistipoentidadid;
    }

    public void setLrpersonafistipoentidadid(Long lrpersonafistipoentidadid) {
        this.lrpersonafistipoentidadid = lrpersonafistipoentidadid;
    }

    public Lrarea getLrareaid() {
        return lrareaid;
    }

    public void setLrareaid(Lrarea lrareaid) {
        this.lrareaid = lrareaid;
    }

    public Lrcargo getLrcargoid() {
        return lrcargoid;
    }

    public void setLrcargoid(Lrcargo lrcargoid) {
        this.lrcargoid = lrcargoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrpersonafisid != null ? lrpersonafisid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrpersonafis)) {
            return false;
        }
        Lrpersonafis other = (Lrpersonafis) object;
        if ((this.lrpersonafisid == null && other.lrpersonafisid != null) || (this.lrpersonafisid != null && !this.lrpersonafisid.equals(other.lrpersonafisid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrpersonafis[ lrpersonafisid=" + lrpersonafisid + " ]";
    }
    
}
