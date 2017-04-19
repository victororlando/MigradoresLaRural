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
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "LRCONTACTO")
@NamedQueries({
    @NamedQuery(name = "Lrcontacto.findAll", query = "SELECT l FROM Lrcontacto l"),
    @NamedQuery(name = "Lrcontacto.findByLrcontactoid", query = "SELECT l FROM Lrcontacto l WHERE l.lrcontactoid = :lrcontactoid"),
    @NamedQuery(name = "Lrcontacto.findByLrcontactonombre", query = "SELECT l FROM Lrcontacto l WHERE l.lrcontactonombre = :lrcontactonombre"),
    @NamedQuery(name = "Lrcontacto.findByLrcontactoapellido", query = "SELECT l FROM Lrcontacto l WHERE l.lrcontactoapellido = :lrcontactoapellido"),
    @NamedQuery(name = "Lrcontacto.findByLrcontactotelefono", query = "SELECT l FROM Lrcontacto l WHERE l.lrcontactotelefono = :lrcontactotelefono"),
    @NamedQuery(name = "Lrcontacto.findByLrcontactoac", query = "SELECT l FROM Lrcontacto l WHERE l.lrcontactoac = :lrcontactoac"),
    @NamedQuery(name = "Lrcontacto.findByLrcontactoual", query = "SELECT l FROM Lrcontacto l WHERE l.lrcontactoual = :lrcontactoual"),
    @NamedQuery(name = "Lrcontacto.findByLrcontactofal", query = "SELECT l FROM Lrcontacto l WHERE l.lrcontactofal = :lrcontactofal"),
    @NamedQuery(name = "Lrcontacto.findByLrcontactoumd", query = "SELECT l FROM Lrcontacto l WHERE l.lrcontactoumd = :lrcontactoumd"),
    @NamedQuery(name = "Lrcontacto.findByLrcontactofmd", query = "SELECT l FROM Lrcontacto l WHERE l.lrcontactofmd = :lrcontactofmd")})
public class Lrcontacto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCONTACTOID", nullable = false)
    private Long lrcontactoid;
    @Basic(optional = false)
    @Column(name = "LRCONTACTONOMBRE", nullable = false, length = 100)
    private String lrcontactonombre;
    @Basic(optional = false)
    @Column(name = "LRCONTACTOAPELLIDO", nullable = false, length = 200)
    private String lrcontactoapellido;
    @Basic(optional = false)
    @Column(name = "LRCONTACTOTELEFONO", nullable = false, length = 30)
    private String lrcontactotelefono;
    @Basic(optional = false)
    @Column(name = "LRCONTACTOAC", nullable = false)
    private Character lrcontactoac;
    @Basic(optional = false)
    @Column(name = "LRCONTACTOUAL", nullable = false, length = 30)
    private String lrcontactoual;
    @Basic(optional = false)
    @Column(name = "LRCONTACTOFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcontactofal;
    @Basic(optional = false)
    @Column(name = "LRCONTACTOUMD", nullable = false, length = 30)
    private String lrcontactoumd;
    @Basic(optional = false)
    @Column(name = "LRCONTACTOFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcontactofmd;
    @JoinColumn(name = "LRPROPUESTAID", referencedColumnName = "LRPROPUESTAID", nullable = false)
    @ManyToOne(optional = false)
    private Lrpropuesta lrpropuestaid;

    public Lrcontacto() {
    }

    public Lrcontacto(Long lrcontactoid) {
        this.lrcontactoid = lrcontactoid;
    }

    public Lrcontacto(Long lrcontactoid, String lrcontactonombre, String lrcontactoapellido, String lrcontactotelefono, Character lrcontactoac, String lrcontactoual, Date lrcontactofal, String lrcontactoumd, Date lrcontactofmd) {
        this.lrcontactoid = lrcontactoid;
        this.lrcontactonombre = lrcontactonombre;
        this.lrcontactoapellido = lrcontactoapellido;
        this.lrcontactotelefono = lrcontactotelefono;
        this.lrcontactoac = lrcontactoac;
        this.lrcontactoual = lrcontactoual;
        this.lrcontactofal = lrcontactofal;
        this.lrcontactoumd = lrcontactoumd;
        this.lrcontactofmd = lrcontactofmd;
    }

    public Long getLrcontactoid() {
        return lrcontactoid;
    }

    public void setLrcontactoid(Long lrcontactoid) {
        this.lrcontactoid = lrcontactoid;
    }

    public String getLrcontactonombre() {
        return lrcontactonombre;
    }

    public void setLrcontactonombre(String lrcontactonombre) {
        this.lrcontactonombre = lrcontactonombre;
    }

    public String getLrcontactoapellido() {
        return lrcontactoapellido;
    }

    public void setLrcontactoapellido(String lrcontactoapellido) {
        this.lrcontactoapellido = lrcontactoapellido;
    }

    public String getLrcontactotelefono() {
        return lrcontactotelefono;
    }

    public void setLrcontactotelefono(String lrcontactotelefono) {
        this.lrcontactotelefono = lrcontactotelefono;
    }

    public Character getLrcontactoac() {
        return lrcontactoac;
    }

    public void setLrcontactoac(Character lrcontactoac) {
        this.lrcontactoac = lrcontactoac;
    }

    public String getLrcontactoual() {
        return lrcontactoual;
    }

    public void setLrcontactoual(String lrcontactoual) {
        this.lrcontactoual = lrcontactoual;
    }

    public Date getLrcontactofal() {
        return lrcontactofal;
    }

    public void setLrcontactofal(Date lrcontactofal) {
        this.lrcontactofal = lrcontactofal;
    }

    public String getLrcontactoumd() {
        return lrcontactoumd;
    }

    public void setLrcontactoumd(String lrcontactoumd) {
        this.lrcontactoumd = lrcontactoumd;
    }

    public Date getLrcontactofmd() {
        return lrcontactofmd;
    }

    public void setLrcontactofmd(Date lrcontactofmd) {
        this.lrcontactofmd = lrcontactofmd;
    }

    public Lrpropuesta getLrpropuestaid() {
        return lrpropuestaid;
    }

    public void setLrpropuestaid(Lrpropuesta lrpropuestaid) {
        this.lrpropuestaid = lrpropuestaid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcontactoid != null ? lrcontactoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcontacto)) {
            return false;
        }
        Lrcontacto other = (Lrcontacto) object;
        if ((this.lrcontactoid == null && other.lrcontactoid != null) || (this.lrcontactoid != null && !this.lrcontactoid.equals(other.lrcontactoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcontacto[ lrcontactoid=" + lrcontactoid + " ]";
    }
    
}
