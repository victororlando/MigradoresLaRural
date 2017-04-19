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
@Table(name = "LRMODOCOBERTURA")
@NamedQueries({
    @NamedQuery(name = "Lrmodocobertura.findAll", query = "SELECT l FROM Lrmodocobertura l"),
    @NamedQuery(name = "Lrmodocobertura.findByLrmodocoberturaid", query = "SELECT l FROM Lrmodocobertura l WHERE l.lrmodocoberturaid = :lrmodocoberturaid"),
    @NamedQuery(name = "Lrmodocobertura.findByLrmodocoberturadesc", query = "SELECT l FROM Lrmodocobertura l WHERE l.lrmodocoberturadesc = :lrmodocoberturadesc"),
    @NamedQuery(name = "Lrmodocobertura.findByLrmodocoberturaac", query = "SELECT l FROM Lrmodocobertura l WHERE l.lrmodocoberturaac = :lrmodocoberturaac"),
    @NamedQuery(name = "Lrmodocobertura.findByLrmodocoberturaual", query = "SELECT l FROM Lrmodocobertura l WHERE l.lrmodocoberturaual = :lrmodocoberturaual"),
    @NamedQuery(name = "Lrmodocobertura.findByLrmodocoberturafal", query = "SELECT l FROM Lrmodocobertura l WHERE l.lrmodocoberturafal = :lrmodocoberturafal"),
    @NamedQuery(name = "Lrmodocobertura.findByLrmodocoberturaumd", query = "SELECT l FROM Lrmodocobertura l WHERE l.lrmodocoberturaumd = :lrmodocoberturaumd"),
    @NamedQuery(name = "Lrmodocobertura.findByLrmodocoberturafmd", query = "SELECT l FROM Lrmodocobertura l WHERE l.lrmodocoberturafmd = :lrmodocoberturafmd")})
public class Lrmodocobertura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRMODOCOBERTURAID", nullable = false)
    private Long lrmodocoberturaid;
    @Basic(optional = false)
    @Column(name = "LRMODOCOBERTURADESC", nullable = false, length = 50)
    private String lrmodocoberturadesc;
    @Basic(optional = false)
    @Column(name = "LRMODOCOBERTURAAC", nullable = false)
    private Character lrmodocoberturaac;
    @Column(name = "LRMODOCOBERTURAUAL", length = 30)
    private String lrmodocoberturaual;
    @Column(name = "LRMODOCOBERTURAFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrmodocoberturafal;
    @Column(name = "LRMODOCOBERTURAUMD", length = 30)
    private String lrmodocoberturaumd;
    @Column(name = "LRMODOCOBERTURAFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrmodocoberturafmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "smodocoberturaid")
    private List<Lrcotiplanbiencobertura> lrcotiplanbiencoberturaList;

    public Lrmodocobertura() {
    }

    public Lrmodocobertura(Long lrmodocoberturaid) {
        this.lrmodocoberturaid = lrmodocoberturaid;
    }

    public Lrmodocobertura(Long lrmodocoberturaid, String lrmodocoberturadesc, Character lrmodocoberturaac) {
        this.lrmodocoberturaid = lrmodocoberturaid;
        this.lrmodocoberturadesc = lrmodocoberturadesc;
        this.lrmodocoberturaac = lrmodocoberturaac;
    }

    public Long getLrmodocoberturaid() {
        return lrmodocoberturaid;
    }

    public void setLrmodocoberturaid(Long lrmodocoberturaid) {
        this.lrmodocoberturaid = lrmodocoberturaid;
    }

    public String getLrmodocoberturadesc() {
        return lrmodocoberturadesc;
    }

    public void setLrmodocoberturadesc(String lrmodocoberturadesc) {
        this.lrmodocoberturadesc = lrmodocoberturadesc;
    }

    public Character getLrmodocoberturaac() {
        return lrmodocoberturaac;
    }

    public void setLrmodocoberturaac(Character lrmodocoberturaac) {
        this.lrmodocoberturaac = lrmodocoberturaac;
    }

    public String getLrmodocoberturaual() {
        return lrmodocoberturaual;
    }

    public void setLrmodocoberturaual(String lrmodocoberturaual) {
        this.lrmodocoberturaual = lrmodocoberturaual;
    }

    public Date getLrmodocoberturafal() {
        return lrmodocoberturafal;
    }

    public void setLrmodocoberturafal(Date lrmodocoberturafal) {
        this.lrmodocoberturafal = lrmodocoberturafal;
    }

    public String getLrmodocoberturaumd() {
        return lrmodocoberturaumd;
    }

    public void setLrmodocoberturaumd(String lrmodocoberturaumd) {
        this.lrmodocoberturaumd = lrmodocoberturaumd;
    }

    public Date getLrmodocoberturafmd() {
        return lrmodocoberturafmd;
    }

    public void setLrmodocoberturafmd(Date lrmodocoberturafmd) {
        this.lrmodocoberturafmd = lrmodocoberturafmd;
    }

    public List<Lrcotiplanbiencobertura> getLrcotiplanbiencoberturaList() {
        return lrcotiplanbiencoberturaList;
    }

    public void setLrcotiplanbiencoberturaList(List<Lrcotiplanbiencobertura> lrcotiplanbiencoberturaList) {
        this.lrcotiplanbiencoberturaList = lrcotiplanbiencoberturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrmodocoberturaid != null ? lrmodocoberturaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrmodocobertura)) {
            return false;
        }
        Lrmodocobertura other = (Lrmodocobertura) object;
        if ((this.lrmodocoberturaid == null && other.lrmodocoberturaid != null) || (this.lrmodocoberturaid != null && !this.lrmodocoberturaid.equals(other.lrmodocoberturaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrmodocobertura[ lrmodocoberturaid=" + lrmodocoberturaid + " ]";
    }
    
}
