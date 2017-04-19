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
@Table(name = "LRFICHACLIENTEDOCU")
@NamedQueries({
    @NamedQuery(name = "Lrfichaclientedocu.findAll", query = "SELECT l FROM Lrfichaclientedocu l"),
    @NamedQuery(name = "Lrfichaclientedocu.findByLrdocumentoscaucionid", query = "SELECT l FROM Lrfichaclientedocu l WHERE l.lrfichaclientedocuPK.lrdocumentoscaucionid = :lrdocumentoscaucionid"),
    @NamedQuery(name = "Lrfichaclientedocu.findByLrfichaclienteid", query = "SELECT l FROM Lrfichaclientedocu l WHERE l.lrfichaclientedocuPK.lrfichaclienteid = :lrfichaclienteid"),
    @NamedQuery(name = "Lrfichaclientedocu.findByLrfichaclientedocuposee", query = "SELECT l FROM Lrfichaclientedocu l WHERE l.lrfichaclientedocuposee = :lrfichaclientedocuposee"),
    @NamedQuery(name = "Lrfichaclientedocu.findByLrfichaclientedocufechavig", query = "SELECT l FROM Lrfichaclientedocu l WHERE l.lrfichaclientedocufechavig = :lrfichaclientedocufechavig")})
public class Lrfichaclientedocu implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrfichaclientedocuPK lrfichaclientedocuPK;
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTEDOCUPOSEE", nullable = false)
    private Character lrfichaclientedocuposee;
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTEDOCUFECHAVIG", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrfichaclientedocufechavig;
    @JoinColumn(name = "LRDOCUMENTOSCAUCIONID", referencedColumnName = "LRDOCUMENTOSCAUCIONID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrdocumentoscaucion lrdocumentoscaucion;
    @JoinColumn(name = "LRFICHACLIENTEID", referencedColumnName = "LRFICHACLIENTEID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrfichacliente lrfichacliente;

    public Lrfichaclientedocu() {
    }

    public Lrfichaclientedocu(LrfichaclientedocuPK lrfichaclientedocuPK) {
        this.lrfichaclientedocuPK = lrfichaclientedocuPK;
    }

    public Lrfichaclientedocu(LrfichaclientedocuPK lrfichaclientedocuPK, Character lrfichaclientedocuposee, Date lrfichaclientedocufechavig) {
        this.lrfichaclientedocuPK = lrfichaclientedocuPK;
        this.lrfichaclientedocuposee = lrfichaclientedocuposee;
        this.lrfichaclientedocufechavig = lrfichaclientedocufechavig;
    }

    public Lrfichaclientedocu(long lrdocumentoscaucionid, long lrfichaclienteid) {
        this.lrfichaclientedocuPK = new LrfichaclientedocuPK(lrdocumentoscaucionid, lrfichaclienteid);
    }

    public LrfichaclientedocuPK getLrfichaclientedocuPK() {
        return lrfichaclientedocuPK;
    }

    public void setLrfichaclientedocuPK(LrfichaclientedocuPK lrfichaclientedocuPK) {
        this.lrfichaclientedocuPK = lrfichaclientedocuPK;
    }

    public Character getLrfichaclientedocuposee() {
        return lrfichaclientedocuposee;
    }

    public void setLrfichaclientedocuposee(Character lrfichaclientedocuposee) {
        this.lrfichaclientedocuposee = lrfichaclientedocuposee;
    }

    public Date getLrfichaclientedocufechavig() {
        return lrfichaclientedocufechavig;
    }

    public void setLrfichaclientedocufechavig(Date lrfichaclientedocufechavig) {
        this.lrfichaclientedocufechavig = lrfichaclientedocufechavig;
    }

    public Lrdocumentoscaucion getLrdocumentoscaucion() {
        return lrdocumentoscaucion;
    }

    public void setLrdocumentoscaucion(Lrdocumentoscaucion lrdocumentoscaucion) {
        this.lrdocumentoscaucion = lrdocumentoscaucion;
    }

    public Lrfichacliente getLrfichacliente() {
        return lrfichacliente;
    }

    public void setLrfichacliente(Lrfichacliente lrfichacliente) {
        this.lrfichacliente = lrfichacliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrfichaclientedocuPK != null ? lrfichaclientedocuPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrfichaclientedocu)) {
            return false;
        }
        Lrfichaclientedocu other = (Lrfichaclientedocu) object;
        if ((this.lrfichaclientedocuPK == null && other.lrfichaclientedocuPK != null) || (this.lrfichaclientedocuPK != null && !this.lrfichaclientedocuPK.equals(other.lrfichaclientedocuPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrfichaclientedocu[ lrfichaclientedocuPK=" + lrfichaclientedocuPK + " ]";
    }
    
}
