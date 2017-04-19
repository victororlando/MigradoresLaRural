/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen.lrgxprod;

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
@Table(name = "PARMCOTISECCIONES", schema = "RURAL")
@NamedQueries({
    @NamedQuery(name = "Parmcotisecciones.findAll", query = "SELECT p FROM Parmcotisecciones p"),
    @NamedQuery(name = "Parmcotisecciones.findByParmcotiseccionesid", query = "SELECT p FROM Parmcotisecciones p WHERE p.parmcotiseccionesid = :parmcotiseccionesid"),
    @NamedQuery(name = "Parmcotisecciones.findByParmcotiseccionesnom", query = "SELECT p FROM Parmcotisecciones p WHERE p.parmcotiseccionesnom = :parmcotiseccionesnom"),
    @NamedQuery(name = "Parmcotisecciones.findByParmcotiseccioneshab", query = "SELECT p FROM Parmcotisecciones p WHERE p.parmcotiseccioneshab = :parmcotiseccioneshab"),
    @NamedQuery(name = "Parmcotisecciones.findByParmcotiseccionesual", query = "SELECT p FROM Parmcotisecciones p WHERE p.parmcotiseccionesual = :parmcotiseccionesual"),
    @NamedQuery(name = "Parmcotisecciones.findByParmcotiseccionesfal", query = "SELECT p FROM Parmcotisecciones p WHERE p.parmcotiseccionesfal = :parmcotiseccionesfal"),
    @NamedQuery(name = "Parmcotisecciones.findByParmcotiseccionesumd", query = "SELECT p FROM Parmcotisecciones p WHERE p.parmcotiseccionesumd = :parmcotiseccionesumd"),
    @NamedQuery(name = "Parmcotisecciones.findByParmcotiseccionesfmd", query = "SELECT p FROM Parmcotisecciones p WHERE p.parmcotiseccionesfmd = :parmcotiseccionesfmd"),
    @NamedQuery(name = "Parmcotisecciones.findByParmcotiseccioneswc", query = "SELECT p FROM Parmcotisecciones p WHERE p.parmcotiseccioneswc = :parmcotiseccioneswc")})
public class Parmcotisecciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PARMCOTISECCIONESID", nullable = false)
    private Long parmcotiseccionesid;
    @Basic(optional = false)
    @Column(name = "PARMCOTISECCIONESNOM", nullable = false, length = 60)
    private String parmcotiseccionesnom;
    @Basic(optional = false)
    @Column(name = "PARMCOTISECCIONESHAB", nullable = false)
    private Character parmcotiseccioneshab;
    @Basic(optional = false)
    @Column(name = "PARMCOTISECCIONESUAL", nullable = false, length = 30)
    private String parmcotiseccionesual;
    @Basic(optional = false)
    @Column(name = "PARMCOTISECCIONESFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date parmcotiseccionesfal;
    @Column(name = "PARMCOTISECCIONESUMD", length = 30)
    private String parmcotiseccionesumd;
    @Column(name = "PARMCOTISECCIONESFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date parmcotiseccionesfmd;
    @Column(name = "PARMCOTISECCIONESWC", length = 60)
    private String parmcotiseccioneswc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parmcotiseccionesid")
    private List<Cotidetsecciones> cotidetseccionesList;

    public Parmcotisecciones() {
    }

    public Parmcotisecciones(Long parmcotiseccionesid) {
        this.parmcotiseccionesid = parmcotiseccionesid;
    }

    public Parmcotisecciones(Long parmcotiseccionesid, String parmcotiseccionesnom, Character parmcotiseccioneshab, String parmcotiseccionesual, Date parmcotiseccionesfal) {
        this.parmcotiseccionesid = parmcotiseccionesid;
        this.parmcotiseccionesnom = parmcotiseccionesnom;
        this.parmcotiseccioneshab = parmcotiseccioneshab;
        this.parmcotiseccionesual = parmcotiseccionesual;
        this.parmcotiseccionesfal = parmcotiseccionesfal;
    }

    public Long getParmcotiseccionesid() {
        return parmcotiseccionesid;
    }

    public void setParmcotiseccionesid(Long parmcotiseccionesid) {
        this.parmcotiseccionesid = parmcotiseccionesid;
    }

    public String getParmcotiseccionesnom() {
        return parmcotiseccionesnom;
    }

    public void setParmcotiseccionesnom(String parmcotiseccionesnom) {
        this.parmcotiseccionesnom = parmcotiseccionesnom;
    }

    public Character getParmcotiseccioneshab() {
        return parmcotiseccioneshab;
    }

    public void setParmcotiseccioneshab(Character parmcotiseccioneshab) {
        this.parmcotiseccioneshab = parmcotiseccioneshab;
    }

    public String getParmcotiseccionesual() {
        return parmcotiseccionesual;
    }

    public void setParmcotiseccionesual(String parmcotiseccionesual) {
        this.parmcotiseccionesual = parmcotiseccionesual;
    }

    public Date getParmcotiseccionesfal() {
        return parmcotiseccionesfal;
    }

    public void setParmcotiseccionesfal(Date parmcotiseccionesfal) {
        this.parmcotiseccionesfal = parmcotiseccionesfal;
    }

    public String getParmcotiseccionesumd() {
        return parmcotiseccionesumd;
    }

    public void setParmcotiseccionesumd(String parmcotiseccionesumd) {
        this.parmcotiseccionesumd = parmcotiseccionesumd;
    }

    public Date getParmcotiseccionesfmd() {
        return parmcotiseccionesfmd;
    }

    public void setParmcotiseccionesfmd(Date parmcotiseccionesfmd) {
        this.parmcotiseccionesfmd = parmcotiseccionesfmd;
    }

    public String getParmcotiseccioneswc() {
        return parmcotiseccioneswc;
    }

    public void setParmcotiseccioneswc(String parmcotiseccioneswc) {
        this.parmcotiseccioneswc = parmcotiseccioneswc;
    }

    public List<Cotidetsecciones> getCotidetseccionesList() {
        return cotidetseccionesList;
    }

    public void setCotidetseccionesList(List<Cotidetsecciones> cotidetseccionesList) {
        this.cotidetseccionesList = cotidetseccionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (parmcotiseccionesid != null ? parmcotiseccionesid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parmcotisecciones)) {
            return false;
        }
        Parmcotisecciones other = (Parmcotisecciones) object;
        if ((this.parmcotiseccionesid == null && other.parmcotiseccionesid != null) || (this.parmcotiseccionesid != null && !this.parmcotiseccionesid.equals(other.parmcotiseccionesid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.lrgxprod.Parmcotisecciones[ parmcotiseccionesid=" + parmcotiseccionesid + " ]";
    }
    
}
