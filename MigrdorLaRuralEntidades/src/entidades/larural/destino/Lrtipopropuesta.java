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
@Table(name = "LRTIPOPROPUESTA")
@NamedQueries({
    @NamedQuery(name = "Lrtipopropuesta.findAll", query = "SELECT l FROM Lrtipopropuesta l"),
    @NamedQuery(name = "Lrtipopropuesta.findByLrtipopropuestaid", query = "SELECT l FROM Lrtipopropuesta l WHERE l.lrtipopropuestaid = :lrtipopropuestaid"),
    @NamedQuery(name = "Lrtipopropuesta.findByLrtipopropuestadesc", query = "SELECT l FROM Lrtipopropuesta l WHERE l.lrtipopropuestadesc = :lrtipopropuestadesc"),
    @NamedQuery(name = "Lrtipopropuesta.findByLrtipopropuestaac", query = "SELECT l FROM Lrtipopropuesta l WHERE l.lrtipopropuestaac = :lrtipopropuestaac"),
    @NamedQuery(name = "Lrtipopropuesta.findByLrtipopropuestaual", query = "SELECT l FROM Lrtipopropuesta l WHERE l.lrtipopropuestaual = :lrtipopropuestaual"),
    @NamedQuery(name = "Lrtipopropuesta.findByLrtipopropuestafal", query = "SELECT l FROM Lrtipopropuesta l WHERE l.lrtipopropuestafal = :lrtipopropuestafal"),
    @NamedQuery(name = "Lrtipopropuesta.findByLrtipopropuestaumd", query = "SELECT l FROM Lrtipopropuesta l WHERE l.lrtipopropuestaumd = :lrtipopropuestaumd"),
    @NamedQuery(name = "Lrtipopropuesta.findByLrtipopropuestafmd", query = "SELECT l FROM Lrtipopropuesta l WHERE l.lrtipopropuestafmd = :lrtipopropuestafmd")})
public class Lrtipopropuesta implements Serializable {
    @OneToMany(mappedBy = "lrtipopropuestaid")
    private List<Lrpropuesta> lrpropuestaList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRTIPOPROPUESTAID", nullable = false)
    private Long lrtipopropuestaid;
    @Basic(optional = false)
    @Column(name = "LRTIPOPROPUESTADESC", nullable = false, length = 100)
    private String lrtipopropuestadesc;
    @Basic(optional = false)
    @Column(name = "LRTIPOPROPUESTAAC", nullable = false)
    private Character lrtipopropuestaac;
    @Column(name = "LRTIPOPROPUESTAUAL", length = 30)
    private String lrtipopropuestaual;
    @Column(name = "LRTIPOPROPUESTAFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtipopropuestafal;
    @Column(name = "LRTIPOPROPUESTAUMD", length = 20)
    private String lrtipopropuestaumd;
    @Column(name = "LRTIPOPROPUESTAFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtipopropuestafmd;

    public Lrtipopropuesta() {
    }

    public Lrtipopropuesta(Long lrtipopropuestaid) {
        this.lrtipopropuestaid = lrtipopropuestaid;
    }

    public Lrtipopropuesta(Long lrtipopropuestaid, String lrtipopropuestadesc, Character lrtipopropuestaac) {
        this.lrtipopropuestaid = lrtipopropuestaid;
        this.lrtipopropuestadesc = lrtipopropuestadesc;
        this.lrtipopropuestaac = lrtipopropuestaac;
    }

    public Long getLrtipopropuestaid() {
        return lrtipopropuestaid;
    }

    public void setLrtipopropuestaid(Long lrtipopropuestaid) {
        this.lrtipopropuestaid = lrtipopropuestaid;
    }

    public String getLrtipopropuestadesc() {
        return lrtipopropuestadesc;
    }

    public void setLrtipopropuestadesc(String lrtipopropuestadesc) {
        this.lrtipopropuestadesc = lrtipopropuestadesc;
    }

    public Character getLrtipopropuestaac() {
        return lrtipopropuestaac;
    }

    public void setLrtipopropuestaac(Character lrtipopropuestaac) {
        this.lrtipopropuestaac = lrtipopropuestaac;
    }

    public String getLrtipopropuestaual() {
        return lrtipopropuestaual;
    }

    public void setLrtipopropuestaual(String lrtipopropuestaual) {
        this.lrtipopropuestaual = lrtipopropuestaual;
    }

    public Date getLrtipopropuestafal() {
        return lrtipopropuestafal;
    }

    public void setLrtipopropuestafal(Date lrtipopropuestafal) {
        this.lrtipopropuestafal = lrtipopropuestafal;
    }

    public String getLrtipopropuestaumd() {
        return lrtipopropuestaumd;
    }

    public void setLrtipopropuestaumd(String lrtipopropuestaumd) {
        this.lrtipopropuestaumd = lrtipopropuestaumd;
    }

    public Date getLrtipopropuestafmd() {
        return lrtipopropuestafmd;
    }

    public void setLrtipopropuestafmd(Date lrtipopropuestafmd) {
        this.lrtipopropuestafmd = lrtipopropuestafmd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrtipopropuestaid != null ? lrtipopropuestaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtipopropuesta)) {
            return false;
        }
        Lrtipopropuesta other = (Lrtipopropuesta) object;
        if ((this.lrtipopropuestaid == null && other.lrtipopropuestaid != null) || (this.lrtipopropuestaid != null && !this.lrtipopropuestaid.equals(other.lrtipopropuestaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtipopropuesta[ lrtipopropuestaid=" + lrtipopropuestaid + " ]";
    }

    public List<Lrpropuesta> getLrpropuestaList() {
        return lrpropuestaList;
    }

    public void setLrpropuestaList(List<Lrpropuesta> lrpropuestaList) {
        this.lrpropuestaList = lrpropuestaList;
    }
    
}
