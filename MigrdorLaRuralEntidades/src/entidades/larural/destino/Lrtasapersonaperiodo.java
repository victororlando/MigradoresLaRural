/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRTASAPERSONAPERIODO", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"LRPERSONAID", "LRSECCDETALLEID"})})
@NamedQueries({
    @NamedQuery(name = "Lrtasapersonaperiodo.findAll", query = "SELECT l FROM Lrtasapersonaperiodo l"),
    @NamedQuery(name = "Lrtasapersonaperiodo.findByLrtasapersonaperiodoid", query = "SELECT l FROM Lrtasapersonaperiodo l WHERE l.lrtasapersonaperiodoid = :lrtasapersonaperiodoid"),
    @NamedQuery(name = "Lrtasapersonaperiodo.findByLrtasapersonaperiodotasa", query = "SELECT l FROM Lrtasapersonaperiodo l WHERE l.lrtasapersonaperiodotasa = :lrtasapersonaperiodotasa"),
    @NamedQuery(name = "Lrtasapersonaperiodo.findByLrtasapersonaperiododesde", query = "SELECT l FROM Lrtasapersonaperiodo l WHERE l.lrtasapersonaperiododesde = :lrtasapersonaperiododesde"),
    @NamedQuery(name = "Lrtasapersonaperiodo.findByLrtasapersonaperiodohasta", query = "SELECT l FROM Lrtasapersonaperiodo l WHERE l.lrtasapersonaperiodohasta = :lrtasapersonaperiodohasta")})
public class Lrtasapersonaperiodo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRTASAPERSONAPERIODOID", nullable = false)
    private Long lrtasapersonaperiodoid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRTASAPERSONAPERIODOTASA", nullable = false, precision = 7, scale = 2)
    private BigDecimal lrtasapersonaperiodotasa;
    @Basic(optional = false)
    @Column(name = "LRTASAPERSONAPERIODODESDE", nullable = false)
    private int lrtasapersonaperiododesde;
    @Basic(optional = false)
    @Column(name = "LRTASAPERSONAPERIODOHASTA", nullable = false)
    private int lrtasapersonaperiodohasta;
    @JoinColumn(name = "LRPERSONAID", referencedColumnName = "LRPERSONAID")
    @ManyToOne
    private Lrpersona lrpersonaid;
    @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false)
    @ManyToOne(optional = false)
    private Lrseccdetalle lrseccdetalleid;

    public Lrtasapersonaperiodo() {
    }

    public Lrtasapersonaperiodo(Long lrtasapersonaperiodoid) {
        this.lrtasapersonaperiodoid = lrtasapersonaperiodoid;
    }

    public Lrtasapersonaperiodo(Long lrtasapersonaperiodoid, BigDecimal lrtasapersonaperiodotasa, int lrtasapersonaperiododesde, int lrtasapersonaperiodohasta) {
        this.lrtasapersonaperiodoid = lrtasapersonaperiodoid;
        this.lrtasapersonaperiodotasa = lrtasapersonaperiodotasa;
        this.lrtasapersonaperiododesde = lrtasapersonaperiododesde;
        this.lrtasapersonaperiodohasta = lrtasapersonaperiodohasta;
    }

    public Long getLrtasapersonaperiodoid() {
        return lrtasapersonaperiodoid;
    }

    public void setLrtasapersonaperiodoid(Long lrtasapersonaperiodoid) {
        this.lrtasapersonaperiodoid = lrtasapersonaperiodoid;
    }

    public BigDecimal getLrtasapersonaperiodotasa() {
        return lrtasapersonaperiodotasa;
    }

    public void setLrtasapersonaperiodotasa(BigDecimal lrtasapersonaperiodotasa) {
        this.lrtasapersonaperiodotasa = lrtasapersonaperiodotasa;
    }

    public int getLrtasapersonaperiododesde() {
        return lrtasapersonaperiododesde;
    }

    public void setLrtasapersonaperiododesde(int lrtasapersonaperiododesde) {
        this.lrtasapersonaperiododesde = lrtasapersonaperiododesde;
    }

    public int getLrtasapersonaperiodohasta() {
        return lrtasapersonaperiodohasta;
    }

    public void setLrtasapersonaperiodohasta(int lrtasapersonaperiodohasta) {
        this.lrtasapersonaperiodohasta = lrtasapersonaperiodohasta;
    }

    public Lrpersona getLrpersonaid() {
        return lrpersonaid;
    }

    public void setLrpersonaid(Lrpersona lrpersonaid) {
        this.lrpersonaid = lrpersonaid;
    }

    public Lrseccdetalle getLrseccdetalleid() {
        return lrseccdetalleid;
    }

    public void setLrseccdetalleid(Lrseccdetalle lrseccdetalleid) {
        this.lrseccdetalleid = lrseccdetalleid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrtasapersonaperiodoid != null ? lrtasapersonaperiodoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtasapersonaperiodo)) {
            return false;
        }
        Lrtasapersonaperiodo other = (Lrtasapersonaperiodo) object;
        if ((this.lrtasapersonaperiodoid == null && other.lrtasapersonaperiodoid != null) || (this.lrtasapersonaperiodoid != null && !this.lrtasapersonaperiodoid.equals(other.lrtasapersonaperiodoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtasapersonaperiodo[ lrtasapersonaperiodoid=" + lrtasapersonaperiodoid + " ]";
    }
    
}
