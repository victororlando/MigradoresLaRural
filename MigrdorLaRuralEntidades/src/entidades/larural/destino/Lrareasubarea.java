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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "LRAREASUBAREA")
@NamedQueries({
    @NamedQuery(name = "Lrareasubarea.findAll", query = "SELECT l FROM Lrareasubarea l"),
    @NamedQuery(name = "Lrareasubarea.findByLrareaid", query = "SELECT l FROM Lrareasubarea l WHERE l.lrareasubareaPK.lrareaid = :lrareaid"),
    @NamedQuery(name = "Lrareasubarea.findByLrsubareaid", query = "SELECT l FROM Lrareasubarea l WHERE l.lrareasubareaPK.lrsubareaid = :lrsubareaid"),
    @NamedQuery(name = "Lrareasubarea.findByLrareasubareavisflujo", query = "SELECT l FROM Lrareasubarea l WHERE l.lrareasubareavisflujo = :lrareasubareavisflujo"),
    @NamedQuery(name = "Lrareasubarea.findByLrareasubareaact", query = "SELECT l FROM Lrareasubarea l WHERE l.lrareasubareaact = :lrareasubareaact"),
    @NamedQuery(name = "Lrareasubarea.findByLrareasubareafal", query = "SELECT l FROM Lrareasubarea l WHERE l.lrareasubareafal = :lrareasubareafal"),
    @NamedQuery(name = "Lrareasubarea.findByLrareasubareaual", query = "SELECT l FROM Lrareasubarea l WHERE l.lrareasubareaual = :lrareasubareaual"),
    @NamedQuery(name = "Lrareasubarea.findByLrareasubareafmd", query = "SELECT l FROM Lrareasubarea l WHERE l.lrareasubareafmd = :lrareasubareafmd"),
    @NamedQuery(name = "Lrareasubarea.findByLrareasubareaumd", query = "SELECT l FROM Lrareasubarea l WHERE l.lrareasubareaumd = :lrareasubareaumd")})
public class Lrareasubarea implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrareasubareaPK lrareasubareaPK;
    @Basic(optional = false)
    @Column(name = "LRAREASUBAREAVISFLUJO", nullable = false)
    private Character lrareasubareavisflujo;
    @Basic(optional = false)
    @Column(name = "LRAREASUBAREAACT", nullable = false)
    private Character lrareasubareaact;
    @Basic(optional = false)
    @Column(name = "LRAREASUBAREAFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrareasubareafal;
    @Basic(optional = false)
    @Column(name = "LRAREASUBAREAUAL", nullable = false, length = 30)
    private String lrareasubareaual;
    @Basic(optional = false)
    @Column(name = "LRAREASUBAREAFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrareasubareafmd;
    @Basic(optional = false)
    @Column(name = "LRAREASUBAREAUMD", nullable = false, length = 30)
    private String lrareasubareaumd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrareasubarea")
    private List<Lrflujoinspeccion> lrflujoinspeccionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrareasubarea")
    private List<Lrmotivorechazo> lrmotivorechazoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrareasubarea")
    private List<Lragrupaformulario> lragrupaformularioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrareasubarea")
    private List<Lrparmaccduracion> lrparmaccduracionList;
    @OneToMany(mappedBy = "lrareasubarea")
    private List<Lrflujoreglas> lrflujoreglasList;
    @JoinColumn(name = "LRAREAID", referencedColumnName = "LRAREAID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrarea lrarea;
    @JoinColumn(name = "LRSUBAREAID", referencedColumnName = "LRSUBAREAID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrsubarea lrsubarea;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrareasubarea")
    private List<Lrflujocotizacion> lrflujocotizacionList;

    public Lrareasubarea() {
    }

    public Lrareasubarea(LrareasubareaPK lrareasubareaPK) {
        this.lrareasubareaPK = lrareasubareaPK;
    }

    public Lrareasubarea(LrareasubareaPK lrareasubareaPK, Character lrareasubareavisflujo, Character lrareasubareaact, Date lrareasubareafal, String lrareasubareaual, Date lrareasubareafmd, String lrareasubareaumd) {
        this.lrareasubareaPK = lrareasubareaPK;
        this.lrareasubareavisflujo = lrareasubareavisflujo;
        this.lrareasubareaact = lrareasubareaact;
        this.lrareasubareafal = lrareasubareafal;
        this.lrareasubareaual = lrareasubareaual;
        this.lrareasubareafmd = lrareasubareafmd;
        this.lrareasubareaumd = lrareasubareaumd;
    }

    public Lrareasubarea(long lrareaid, long lrsubareaid) {
        this.lrareasubareaPK = new LrareasubareaPK(lrareaid, lrsubareaid);
    }

    public LrareasubareaPK getLrareasubareaPK() {
        return lrareasubareaPK;
    }

    public void setLrareasubareaPK(LrareasubareaPK lrareasubareaPK) {
        this.lrareasubareaPK = lrareasubareaPK;
    }

    public Character getLrareasubareavisflujo() {
        return lrareasubareavisflujo;
    }

    public void setLrareasubareavisflujo(Character lrareasubareavisflujo) {
        this.lrareasubareavisflujo = lrareasubareavisflujo;
    }

    public Character getLrareasubareaact() {
        return lrareasubareaact;
    }

    public void setLrareasubareaact(Character lrareasubareaact) {
        this.lrareasubareaact = lrareasubareaact;
    }

    public Date getLrareasubareafal() {
        return lrareasubareafal;
    }

    public void setLrareasubareafal(Date lrareasubareafal) {
        this.lrareasubareafal = lrareasubareafal;
    }

    public String getLrareasubareaual() {
        return lrareasubareaual;
    }

    public void setLrareasubareaual(String lrareasubareaual) {
        this.lrareasubareaual = lrareasubareaual;
    }

    public Date getLrareasubareafmd() {
        return lrareasubareafmd;
    }

    public void setLrareasubareafmd(Date lrareasubareafmd) {
        this.lrareasubareafmd = lrareasubareafmd;
    }

    public String getLrareasubareaumd() {
        return lrareasubareaumd;
    }

    public void setLrareasubareaumd(String lrareasubareaumd) {
        this.lrareasubareaumd = lrareasubareaumd;
    }

    public List<Lrflujoinspeccion> getLrflujoinspeccionList() {
        return lrflujoinspeccionList;
    }

    public void setLrflujoinspeccionList(List<Lrflujoinspeccion> lrflujoinspeccionList) {
        this.lrflujoinspeccionList = lrflujoinspeccionList;
    }

    public List<Lrmotivorechazo> getLrmotivorechazoList() {
        return lrmotivorechazoList;
    }

    public void setLrmotivorechazoList(List<Lrmotivorechazo> lrmotivorechazoList) {
        this.lrmotivorechazoList = lrmotivorechazoList;
    }

    public List<Lragrupaformulario> getLragrupaformularioList() {
        return lragrupaformularioList;
    }

    public void setLragrupaformularioList(List<Lragrupaformulario> lragrupaformularioList) {
        this.lragrupaformularioList = lragrupaformularioList;
    }

    public List<Lrparmaccduracion> getLrparmaccduracionList() {
        return lrparmaccduracionList;
    }

    public void setLrparmaccduracionList(List<Lrparmaccduracion> lrparmaccduracionList) {
        this.lrparmaccduracionList = lrparmaccduracionList;
    }

    public List<Lrflujoreglas> getLrflujoreglasList() {
        return lrflujoreglasList;
    }

    public void setLrflujoreglasList(List<Lrflujoreglas> lrflujoreglasList) {
        this.lrflujoreglasList = lrflujoreglasList;
    }

    public Lrarea getLrarea() {
        return lrarea;
    }

    public void setLrarea(Lrarea lrarea) {
        this.lrarea = lrarea;
    }

    public Lrsubarea getLrsubarea() {
        return lrsubarea;
    }

    public void setLrsubarea(Lrsubarea lrsubarea) {
        this.lrsubarea = lrsubarea;
    }

    public List<Lrflujocotizacion> getLrflujocotizacionList() {
        return lrflujocotizacionList;
    }

    public void setLrflujocotizacionList(List<Lrflujocotizacion> lrflujocotizacionList) {
        this.lrflujocotizacionList = lrflujocotizacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrareasubareaPK != null ? lrareasubareaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrareasubarea)) {
            return false;
        }
        Lrareasubarea other = (Lrareasubarea) object;
        if ((this.lrareasubareaPK == null && other.lrareasubareaPK != null) || (this.lrareasubareaPK != null && !this.lrareasubareaPK.equals(other.lrareasubareaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrareasubarea[ lrareasubareaPK=" + lrareasubareaPK + " ]";
    }
    
}
