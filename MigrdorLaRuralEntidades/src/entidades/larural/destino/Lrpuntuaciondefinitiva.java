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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "LRPUNTUACIONDEFINITIVA")
@NamedQueries({
    @NamedQuery(name = "Lrpuntuaciondefinitiva.findAll", query = "SELECT l FROM Lrpuntuaciondefinitiva l"),
    @NamedQuery(name = "Lrpuntuaciondefinitiva.findByLrareaid", query = "SELECT l FROM Lrpuntuaciondefinitiva l WHERE l.lrpuntuaciondefinitivaPK.lrareaid = :lrareaid"),
    @NamedQuery(name = "Lrpuntuaciondefinitiva.findByLrseccdetalleid", query = "SELECT l FROM Lrpuntuaciondefinitiva l WHERE l.lrpuntuaciondefinitivaPK.lrseccdetalleid = :lrseccdetalleid"),
    @NamedQuery(name = "Lrpuntuaciondefinitiva.findByLragrupaformularioid", query = "SELECT l FROM Lrpuntuaciondefinitiva l WHERE l.lrpuntuaciondefinitivaPK.lragrupaformularioid = :lragrupaformularioid"),
    @NamedQuery(name = "Lrpuntuaciondefinitiva.findByLrcalificacionriesgoid", query = "SELECT l FROM Lrpuntuaciondefinitiva l WHERE l.lrpuntuaciondefinitivaPK.lrcalificacionriesgoid = :lrcalificacionriesgoid"),
    @NamedQuery(name = "Lrpuntuaciondefinitiva.findByLrpuntuaciondefinitivadesde", query = "SELECT l FROM Lrpuntuaciondefinitiva l WHERE l.lrpuntuaciondefinitivadesde = :lrpuntuaciondefinitivadesde"),
    @NamedQuery(name = "Lrpuntuaciondefinitiva.findByLrpuntuaciondefinitivahasta", query = "SELECT l FROM Lrpuntuaciondefinitiva l WHERE l.lrpuntuaciondefinitivahasta = :lrpuntuaciondefinitivahasta"),
    @NamedQuery(name = "Lrpuntuaciondefinitiva.findByLrpuntuaciondefinitivaac", query = "SELECT l FROM Lrpuntuaciondefinitiva l WHERE l.lrpuntuaciondefinitivaac = :lrpuntuaciondefinitivaac"),
    @NamedQuery(name = "Lrpuntuaciondefinitiva.findByLrpuntuaciondefinitivaual", query = "SELECT l FROM Lrpuntuaciondefinitiva l WHERE l.lrpuntuaciondefinitivaual = :lrpuntuaciondefinitivaual"),
    @NamedQuery(name = "Lrpuntuaciondefinitiva.findByLrpuntuaciondefinitivafal", query = "SELECT l FROM Lrpuntuaciondefinitiva l WHERE l.lrpuntuaciondefinitivafal = :lrpuntuaciondefinitivafal"),
    @NamedQuery(name = "Lrpuntuaciondefinitiva.findByLrpuntuaciondefinitivaumd", query = "SELECT l FROM Lrpuntuaciondefinitiva l WHERE l.lrpuntuaciondefinitivaumd = :lrpuntuaciondefinitivaumd"),
    @NamedQuery(name = "Lrpuntuaciondefinitiva.findByLrpuntuaciondefinitivafmd", query = "SELECT l FROM Lrpuntuaciondefinitiva l WHERE l.lrpuntuaciondefinitivafmd = :lrpuntuaciondefinitivafmd")})
public class Lrpuntuaciondefinitiva implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrpuntuaciondefinitivaPK lrpuntuaciondefinitivaPK;
    @Basic(optional = false)
    @Column(name = "LRPUNTUACIONDEFINITIVADESDE", nullable = false)
    private long lrpuntuaciondefinitivadesde;
    @Basic(optional = false)
    @Column(name = "LRPUNTUACIONDEFINITIVAHASTA", nullable = false)
    private long lrpuntuaciondefinitivahasta;
    @Basic(optional = false)
    @Column(name = "LRPUNTUACIONDEFINITIVAAC", nullable = false)
    private Character lrpuntuaciondefinitivaac;
    @Basic(optional = false)
    @Column(name = "LRPUNTUACIONDEFINITIVAUAL", nullable = false, length = 30)
    private String lrpuntuaciondefinitivaual;
    @Basic(optional = false)
    @Column(name = "LRPUNTUACIONDEFINITIVAFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrpuntuaciondefinitivafal;
    @Column(name = "LRPUNTUACIONDEFINITIVAUMD", length = 30)
    private String lrpuntuaciondefinitivaumd;
    @Column(name = "LRPUNTUACIONDEFINITIVAFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrpuntuaciondefinitivafmd;
    @JoinColumn(name = "LRAGRUPAFORMULARIOID", referencedColumnName = "LRAGRUPAFORMULARIOID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lragrupaformulario lragrupaformulario;
    @JoinColumn(name = "LRAREAID", referencedColumnName = "LRAREAID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrarea lrarea;
    @JoinColumn(name = "LRCALIFICACIONRIESGOID", referencedColumnName = "LRCALIFICACIONRIESGOID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrcalificacionriesgo lrcalificacionriesgo;
    @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrseccdetalle lrseccdetalle;

    public Lrpuntuaciondefinitiva() {
    }

    public Lrpuntuaciondefinitiva(LrpuntuaciondefinitivaPK lrpuntuaciondefinitivaPK) {
        this.lrpuntuaciondefinitivaPK = lrpuntuaciondefinitivaPK;
    }

    public Lrpuntuaciondefinitiva(LrpuntuaciondefinitivaPK lrpuntuaciondefinitivaPK, long lrpuntuaciondefinitivadesde, long lrpuntuaciondefinitivahasta, Character lrpuntuaciondefinitivaac, String lrpuntuaciondefinitivaual, Date lrpuntuaciondefinitivafal) {
        this.lrpuntuaciondefinitivaPK = lrpuntuaciondefinitivaPK;
        this.lrpuntuaciondefinitivadesde = lrpuntuaciondefinitivadesde;
        this.lrpuntuaciondefinitivahasta = lrpuntuaciondefinitivahasta;
        this.lrpuntuaciondefinitivaac = lrpuntuaciondefinitivaac;
        this.lrpuntuaciondefinitivaual = lrpuntuaciondefinitivaual;
        this.lrpuntuaciondefinitivafal = lrpuntuaciondefinitivafal;
    }

    public Lrpuntuaciondefinitiva(long lrareaid, long lrseccdetalleid, long lragrupaformularioid, long lrcalificacionriesgoid) {
        this.lrpuntuaciondefinitivaPK = new LrpuntuaciondefinitivaPK(lrareaid, lrseccdetalleid, lragrupaformularioid, lrcalificacionriesgoid);
    }

    public LrpuntuaciondefinitivaPK getLrpuntuaciondefinitivaPK() {
        return lrpuntuaciondefinitivaPK;
    }

    public void setLrpuntuaciondefinitivaPK(LrpuntuaciondefinitivaPK lrpuntuaciondefinitivaPK) {
        this.lrpuntuaciondefinitivaPK = lrpuntuaciondefinitivaPK;
    }

    public long getLrpuntuaciondefinitivadesde() {
        return lrpuntuaciondefinitivadesde;
    }

    public void setLrpuntuaciondefinitivadesde(long lrpuntuaciondefinitivadesde) {
        this.lrpuntuaciondefinitivadesde = lrpuntuaciondefinitivadesde;
    }

    public long getLrpuntuaciondefinitivahasta() {
        return lrpuntuaciondefinitivahasta;
    }

    public void setLrpuntuaciondefinitivahasta(long lrpuntuaciondefinitivahasta) {
        this.lrpuntuaciondefinitivahasta = lrpuntuaciondefinitivahasta;
    }

    public Character getLrpuntuaciondefinitivaac() {
        return lrpuntuaciondefinitivaac;
    }

    public void setLrpuntuaciondefinitivaac(Character lrpuntuaciondefinitivaac) {
        this.lrpuntuaciondefinitivaac = lrpuntuaciondefinitivaac;
    }

    public String getLrpuntuaciondefinitivaual() {
        return lrpuntuaciondefinitivaual;
    }

    public void setLrpuntuaciondefinitivaual(String lrpuntuaciondefinitivaual) {
        this.lrpuntuaciondefinitivaual = lrpuntuaciondefinitivaual;
    }

    public Date getLrpuntuaciondefinitivafal() {
        return lrpuntuaciondefinitivafal;
    }

    public void setLrpuntuaciondefinitivafal(Date lrpuntuaciondefinitivafal) {
        this.lrpuntuaciondefinitivafal = lrpuntuaciondefinitivafal;
    }

    public String getLrpuntuaciondefinitivaumd() {
        return lrpuntuaciondefinitivaumd;
    }

    public void setLrpuntuaciondefinitivaumd(String lrpuntuaciondefinitivaumd) {
        this.lrpuntuaciondefinitivaumd = lrpuntuaciondefinitivaumd;
    }

    public Date getLrpuntuaciondefinitivafmd() {
        return lrpuntuaciondefinitivafmd;
    }

    public void setLrpuntuaciondefinitivafmd(Date lrpuntuaciondefinitivafmd) {
        this.lrpuntuaciondefinitivafmd = lrpuntuaciondefinitivafmd;
    }

    public Lragrupaformulario getLragrupaformulario() {
        return lragrupaformulario;
    }

    public void setLragrupaformulario(Lragrupaformulario lragrupaformulario) {
        this.lragrupaformulario = lragrupaformulario;
    }

    public Lrarea getLrarea() {
        return lrarea;
    }

    public void setLrarea(Lrarea lrarea) {
        this.lrarea = lrarea;
    }

    public Lrcalificacionriesgo getLrcalificacionriesgo() {
        return lrcalificacionriesgo;
    }

    public void setLrcalificacionriesgo(Lrcalificacionriesgo lrcalificacionriesgo) {
        this.lrcalificacionriesgo = lrcalificacionriesgo;
    }

    public Lrseccdetalle getLrseccdetalle() {
        return lrseccdetalle;
    }

    public void setLrseccdetalle(Lrseccdetalle lrseccdetalle) {
        this.lrseccdetalle = lrseccdetalle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrpuntuaciondefinitivaPK != null ? lrpuntuaciondefinitivaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrpuntuaciondefinitiva)) {
            return false;
        }
        Lrpuntuaciondefinitiva other = (Lrpuntuaciondefinitiva) object;
        if ((this.lrpuntuaciondefinitivaPK == null && other.lrpuntuaciondefinitivaPK != null) || (this.lrpuntuaciondefinitivaPK != null && !this.lrpuntuaciondefinitivaPK.equals(other.lrpuntuaciondefinitivaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrpuntuaciondefinitiva[ lrpuntuaciondefinitivaPK=" + lrpuntuaciondefinitivaPK + " ]";
    }
    
}
