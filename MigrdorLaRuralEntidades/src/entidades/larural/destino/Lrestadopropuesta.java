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
@Table(name = "LRESTADOPROPUESTA")
@NamedQueries({
    @NamedQuery(name = "Lrestadopropuesta.findAll", query = "SELECT l FROM Lrestadopropuesta l"),
    @NamedQuery(name = "Lrestadopropuesta.findByLrestadopropuestaid", query = "SELECT l FROM Lrestadopropuesta l WHERE l.lrestadopropuestaid = :lrestadopropuestaid"),
    @NamedQuery(name = "Lrestadopropuesta.findByLrestadopropuestadesc", query = "SELECT l FROM Lrestadopropuesta l WHERE l.lrestadopropuestadesc = :lrestadopropuestadesc"),
    @NamedQuery(name = "Lrestadopropuesta.findByLrestadopropuestaac", query = "SELECT l FROM Lrestadopropuesta l WHERE l.lrestadopropuestaac = :lrestadopropuestaac"),
    @NamedQuery(name = "Lrestadopropuesta.findByLrestadopropuestaual", query = "SELECT l FROM Lrestadopropuesta l WHERE l.lrestadopropuestaual = :lrestadopropuestaual"),
    @NamedQuery(name = "Lrestadopropuesta.findByLrestadopropuestafal", query = "SELECT l FROM Lrestadopropuesta l WHERE l.lrestadopropuestafal = :lrestadopropuestafal"),
    @NamedQuery(name = "Lrestadopropuesta.findByLrestadopropuestaumd", query = "SELECT l FROM Lrestadopropuesta l WHERE l.lrestadopropuestaumd = :lrestadopropuestaumd"),
    @NamedQuery(name = "Lrestadopropuesta.findByLrestadopropuestafmd", query = "SELECT l FROM Lrestadopropuesta l WHERE l.lrestadopropuestafmd = :lrestadopropuestafmd")})
public class Lrestadopropuesta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRESTADOPROPUESTAID", nullable = false)
    private Long lrestadopropuestaid;
    @Basic(optional = false)
    @Column(name = "LRESTADOPROPUESTADESC", nullable = false, length = 500)
    private String lrestadopropuestadesc;
    @Basic(optional = false)
    @Column(name = "LRESTADOPROPUESTAAC", nullable = false)
    private Character lrestadopropuestaac;
    @Basic(optional = false)
    @Column(name = "LRESTADOPROPUESTAUAL", nullable = false, length = 30)
    private String lrestadopropuestaual;
    @Basic(optional = false)
    @Column(name = "LRESTADOPROPUESTAFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrestadopropuestafal;
    @Basic(optional = false)
    @Column(name = "LRESTADOPROPUESTAUMD", nullable = false, length = 30)
    private String lrestadopropuestaumd;
    @Basic(optional = false)
    @Column(name = "LRESTADOPROPUESTAFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrestadopropuestafmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrestadopropuestaid")
    private List<Lrpropuesta> lrpropuestaList;

    public Lrestadopropuesta() {
    }

    public Lrestadopropuesta(Long lrestadopropuestaid) {
        this.lrestadopropuestaid = lrestadopropuestaid;
    }

    public Lrestadopropuesta(Long lrestadopropuestaid, String lrestadopropuestadesc, Character lrestadopropuestaac, String lrestadopropuestaual, Date lrestadopropuestafal, String lrestadopropuestaumd, Date lrestadopropuestafmd) {
        this.lrestadopropuestaid = lrestadopropuestaid;
        this.lrestadopropuestadesc = lrestadopropuestadesc;
        this.lrestadopropuestaac = lrestadopropuestaac;
        this.lrestadopropuestaual = lrestadopropuestaual;
        this.lrestadopropuestafal = lrestadopropuestafal;
        this.lrestadopropuestaumd = lrestadopropuestaumd;
        this.lrestadopropuestafmd = lrestadopropuestafmd;
    }

    public Long getLrestadopropuestaid() {
        return lrestadopropuestaid;
    }

    public void setLrestadopropuestaid(Long lrestadopropuestaid) {
        this.lrestadopropuestaid = lrestadopropuestaid;
    }

    public String getLrestadopropuestadesc() {
        return lrestadopropuestadesc;
    }

    public void setLrestadopropuestadesc(String lrestadopropuestadesc) {
        this.lrestadopropuestadesc = lrestadopropuestadesc;
    }

    public Character getLrestadopropuestaac() {
        return lrestadopropuestaac;
    }

    public void setLrestadopropuestaac(Character lrestadopropuestaac) {
        this.lrestadopropuestaac = lrestadopropuestaac;
    }

    public String getLrestadopropuestaual() {
        return lrestadopropuestaual;
    }

    public void setLrestadopropuestaual(String lrestadopropuestaual) {
        this.lrestadopropuestaual = lrestadopropuestaual;
    }

    public Date getLrestadopropuestafal() {
        return lrestadopropuestafal;
    }

    public void setLrestadopropuestafal(Date lrestadopropuestafal) {
        this.lrestadopropuestafal = lrestadopropuestafal;
    }

    public String getLrestadopropuestaumd() {
        return lrestadopropuestaumd;
    }

    public void setLrestadopropuestaumd(String lrestadopropuestaumd) {
        this.lrestadopropuestaumd = lrestadopropuestaumd;
    }

    public Date getLrestadopropuestafmd() {
        return lrestadopropuestafmd;
    }

    public void setLrestadopropuestafmd(Date lrestadopropuestafmd) {
        this.lrestadopropuestafmd = lrestadopropuestafmd;
    }

    public List<Lrpropuesta> getLrpropuestaList() {
        return lrpropuestaList;
    }

    public void setLrpropuestaList(List<Lrpropuesta> lrpropuestaList) {
        this.lrpropuestaList = lrpropuestaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrestadopropuestaid != null ? lrestadopropuestaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrestadopropuesta)) {
            return false;
        }
        Lrestadopropuesta other = (Lrestadopropuesta) object;
        if ((this.lrestadopropuestaid == null && other.lrestadopropuestaid != null) || (this.lrestadopropuestaid != null && !this.lrestadopropuestaid.equals(other.lrestadopropuestaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrestadopropuesta[ lrestadopropuestaid=" + lrestadopropuestaid + " ]";
    }
    
}
