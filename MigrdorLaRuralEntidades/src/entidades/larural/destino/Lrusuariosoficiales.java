/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRUSUARIOSOFICIALES")
@NamedQueries({
    @NamedQuery(name = "Lrusuariosoficiales.findAll", query = "SELECT l FROM Lrusuariosoficiales l"),
    @NamedQuery(name = "Lrusuariosoficiales.findByLrusuariosoficialesid", query = "SELECT l FROM Lrusuariosoficiales l WHERE l.lrusuariosoficialesid = :lrusuariosoficialesid"),
    @NamedQuery(name = "Lrusuariosoficiales.findByLrusuariosoficialesessuperviso", query = "SELECT l FROM Lrusuariosoficiales l WHERE l.lrusuariosoficialesessuperviso = :lrusuariosoficialesessuperviso"),
    @NamedQuery(name = "Lrusuariosoficiales.findByLrusuariosoficialesesback", query = "SELECT l FROM Lrusuariosoficiales l WHERE l.lrusuariosoficialesesback = :lrusuariosoficialesesback")})
public class Lrusuariosoficiales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRUSUARIOSOFICIALESID", nullable = false)
    private Long lrusuariosoficialesid;
    @Basic(optional = false)
    @Column(name = "LRUSUARIOSOFICIALESESSUPERVISO", nullable = false)
    private Character lrusuariosoficialesessuperviso;
    @Column(name = "LRUSUARIOSOFICIALESESBACK")
    private Long lrusuariosoficialesesback;
    @JoinColumn(name = "LRUSUARIOSID", referencedColumnName = "LRUSUARIOSID", nullable = false)
    @ManyToOne(optional = false)
    private Lrusuario lrusuariosid;

    public Lrusuariosoficiales() {
    }

    public Lrusuariosoficiales(Long lrusuariosoficialesid) {
        this.lrusuariosoficialesid = lrusuariosoficialesid;
    }

    public Lrusuariosoficiales(Long lrusuariosoficialesid, Character lrusuariosoficialesessuperviso) {
        this.lrusuariosoficialesid = lrusuariosoficialesid;
        this.lrusuariosoficialesessuperviso = lrusuariosoficialesessuperviso;
    }

    public Long getLrusuariosoficialesid() {
        return lrusuariosoficialesid;
    }

    public void setLrusuariosoficialesid(Long lrusuariosoficialesid) {
        this.lrusuariosoficialesid = lrusuariosoficialesid;
    }

    public Character getLrusuariosoficialesessuperviso() {
        return lrusuariosoficialesessuperviso;
    }

    public void setLrusuariosoficialesessuperviso(Character lrusuariosoficialesessuperviso) {
        this.lrusuariosoficialesessuperviso = lrusuariosoficialesessuperviso;
    }

    public Long getLrusuariosoficialesesback() {
        return lrusuariosoficialesesback;
    }

    public void setLrusuariosoficialesesback(Long lrusuariosoficialesesback) {
        this.lrusuariosoficialesesback = lrusuariosoficialesesback;
    }

    public Lrusuario getLrusuariosid() {
        return lrusuariosid;
    }

    public void setLrusuariosid(Lrusuario lrusuariosid) {
        this.lrusuariosid = lrusuariosid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrusuariosoficialesid != null ? lrusuariosoficialesid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrusuariosoficiales)) {
            return false;
        }
        Lrusuariosoficiales other = (Lrusuariosoficiales) object;
        if ((this.lrusuariosoficialesid == null && other.lrusuariosoficialesid != null) || (this.lrusuariosoficialesid != null && !this.lrusuariosoficialesid.equals(other.lrusuariosoficialesid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrusuariosoficiales[ lrusuariosoficialesid=" + lrusuariosoficialesid + " ]";
    }
    
}
