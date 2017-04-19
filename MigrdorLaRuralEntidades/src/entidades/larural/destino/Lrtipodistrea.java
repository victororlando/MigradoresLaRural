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
@Table(name = "LRTIPODISTREA")
@NamedQueries({
    @NamedQuery(name = "Lrtipodistrea.findAll", query = "SELECT l FROM Lrtipodistrea l"),
    @NamedQuery(name = "Lrtipodistrea.findByLrtipodistreaid", query = "SELECT l FROM Lrtipodistrea l WHERE l.lrtipodistreaid = :lrtipodistreaid"),
    @NamedQuery(name = "Lrtipodistrea.findByLrtipodistreadesc", query = "SELECT l FROM Lrtipodistrea l WHERE l.lrtipodistreadesc = :lrtipodistreadesc"),
    @NamedQuery(name = "Lrtipodistrea.findByLrtipodistreaac", query = "SELECT l FROM Lrtipodistrea l WHERE l.lrtipodistreaac = :lrtipodistreaac"),
    @NamedQuery(name = "Lrtipodistrea.findByLrtipodistreaual", query = "SELECT l FROM Lrtipodistrea l WHERE l.lrtipodistreaual = :lrtipodistreaual"),
    @NamedQuery(name = "Lrtipodistrea.findByLrtipodistreafal", query = "SELECT l FROM Lrtipodistrea l WHERE l.lrtipodistreafal = :lrtipodistreafal"),
    @NamedQuery(name = "Lrtipodistrea.findByLrtipodistreaumd", query = "SELECT l FROM Lrtipodistrea l WHERE l.lrtipodistreaumd = :lrtipodistreaumd"),
    @NamedQuery(name = "Lrtipodistrea.findByLrtipodistreafmd", query = "SELECT l FROM Lrtipodistrea l WHERE l.lrtipodistreafmd = :lrtipodistreafmd"),
    @NamedQuery(name = "Lrtipodistrea.findByLrtipodistreacodigo", query = "SELECT l FROM Lrtipodistrea l WHERE l.lrtipodistreacodigo = :lrtipodistreacodigo")})
public class Lrtipodistrea implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRTIPODISTREAID", nullable = false)
    private Long lrtipodistreaid;
    @Basic(optional = false)
    @Column(name = "LRTIPODISTREADESC", nullable = false, length = 100)
    private String lrtipodistreadesc;
    @Basic(optional = false)
    @Column(name = "LRTIPODISTREAAC", nullable = false)
    private Character lrtipodistreaac;
    @Basic(optional = false)
    @Column(name = "LRTIPODISTREAUAL", nullable = false, length = 30)
    private String lrtipodistreaual;
    @Basic(optional = false)
    @Column(name = "LRTIPODISTREAFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtipodistreafal;
    @Column(name = "LRTIPODISTREAUMD", length = 30)
    private String lrtipodistreaumd;
    @Column(name = "LRTIPODISTREAFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtipodistreafmd;
    @Basic(optional = false)
    @Column(name = "LRTIPODISTREACODIGO", nullable = false, length = 3)
    private String lrtipodistreacodigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrtipodistreaid")
    private List<Lrreaseguro> lrreaseguroList;

    public Lrtipodistrea() {
    }

    public Lrtipodistrea(Long lrtipodistreaid) {
        this.lrtipodistreaid = lrtipodistreaid;
    }

    public Lrtipodistrea(Long lrtipodistreaid, String lrtipodistreadesc, Character lrtipodistreaac, String lrtipodistreaual, Date lrtipodistreafal, String lrtipodistreacodigo) {
        this.lrtipodistreaid = lrtipodistreaid;
        this.lrtipodistreadesc = lrtipodistreadesc;
        this.lrtipodistreaac = lrtipodistreaac;
        this.lrtipodistreaual = lrtipodistreaual;
        this.lrtipodistreafal = lrtipodistreafal;
        this.lrtipodistreacodigo = lrtipodistreacodigo;
    }

    public Long getLrtipodistreaid() {
        return lrtipodistreaid;
    }

    public void setLrtipodistreaid(Long lrtipodistreaid) {
        this.lrtipodistreaid = lrtipodistreaid;
    }

    public String getLrtipodistreadesc() {
        return lrtipodistreadesc;
    }

    public void setLrtipodistreadesc(String lrtipodistreadesc) {
        this.lrtipodistreadesc = lrtipodistreadesc;
    }

    public Character getLrtipodistreaac() {
        return lrtipodistreaac;
    }

    public void setLrtipodistreaac(Character lrtipodistreaac) {
        this.lrtipodistreaac = lrtipodistreaac;
    }

    public String getLrtipodistreaual() {
        return lrtipodistreaual;
    }

    public void setLrtipodistreaual(String lrtipodistreaual) {
        this.lrtipodistreaual = lrtipodistreaual;
    }

    public Date getLrtipodistreafal() {
        return lrtipodistreafal;
    }

    public void setLrtipodistreafal(Date lrtipodistreafal) {
        this.lrtipodistreafal = lrtipodistreafal;
    }

    public String getLrtipodistreaumd() {
        return lrtipodistreaumd;
    }

    public void setLrtipodistreaumd(String lrtipodistreaumd) {
        this.lrtipodistreaumd = lrtipodistreaumd;
    }

    public Date getLrtipodistreafmd() {
        return lrtipodistreafmd;
    }

    public void setLrtipodistreafmd(Date lrtipodistreafmd) {
        this.lrtipodistreafmd = lrtipodistreafmd;
    }

    public String getLrtipodistreacodigo() {
        return lrtipodistreacodigo;
    }

    public void setLrtipodistreacodigo(String lrtipodistreacodigo) {
        this.lrtipodistreacodigo = lrtipodistreacodigo;
    }

    public List<Lrreaseguro> getLrreaseguroList() {
        return lrreaseguroList;
    }

    public void setLrreaseguroList(List<Lrreaseguro> lrreaseguroList) {
        this.lrreaseguroList = lrreaseguroList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrtipodistreaid != null ? lrtipodistreaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtipodistrea)) {
            return false;
        }
        Lrtipodistrea other = (Lrtipodistrea) object;
        if ((this.lrtipodistreaid == null && other.lrtipodistreaid != null) || (this.lrtipodistreaid != null && !this.lrtipodistreaid.equals(other.lrtipodistreaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtipodistrea[ lrtipodistreaid=" + lrtipodistreaid + " ]";
    }
    
}
