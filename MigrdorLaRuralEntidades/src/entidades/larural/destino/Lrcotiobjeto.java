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
@Table(name = "LRCOTIOBJETO")
@NamedQueries({
    @NamedQuery(name = "Lrcotiobjeto.findAll", query = "SELECT l FROM Lrcotiobjeto l"),
    @NamedQuery(name = "Lrcotiobjeto.findByLrcotiobjetoid", query = "SELECT l FROM Lrcotiobjeto l WHERE l.lrcotiobjetoid = :lrcotiobjetoid"),
    @NamedQuery(name = "Lrcotiobjeto.findByLrcotiobjetonombre", query = "SELECT l FROM Lrcotiobjeto l WHERE l.lrcotiobjetonombre = :lrcotiobjetonombre"),
    @NamedQuery(name = "Lrcotiobjeto.findByLrcotiobjetodescripcion", query = "SELECT l FROM Lrcotiobjeto l WHERE l.lrcotiobjetodescripcion = :lrcotiobjetodescripcion"),
    @NamedQuery(name = "Lrcotiobjeto.findByLrcotiobjetofal", query = "SELECT l FROM Lrcotiobjeto l WHERE l.lrcotiobjetofal = :lrcotiobjetofal"),
    @NamedQuery(name = "Lrcotiobjeto.findByLrcotiobjetoual", query = "SELECT l FROM Lrcotiobjeto l WHERE l.lrcotiobjetoual = :lrcotiobjetoual"),
    @NamedQuery(name = "Lrcotiobjeto.findByLrcotiobjetofmd", query = "SELECT l FROM Lrcotiobjeto l WHERE l.lrcotiobjetofmd = :lrcotiobjetofmd"),
    @NamedQuery(name = "Lrcotiobjeto.findByLrcotiobjetoumd", query = "SELECT l FROM Lrcotiobjeto l WHERE l.lrcotiobjetoumd = :lrcotiobjetoumd")})
public class Lrcotiobjeto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCOTIOBJETOID", nullable = false)
    private Long lrcotiobjetoid;
    @Basic(optional = false)
    @Column(name = "LRCOTIOBJETONOMBRE", nullable = false, length = 100)
    private String lrcotiobjetonombre;
    @Basic(optional = false)
    @Column(name = "LRCOTIOBJETODESCRIPCION", nullable = false, length = 150)
    private String lrcotiobjetodescripcion;
    @Basic(optional = false)
    @Column(name = "LRCOTIOBJETOFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotiobjetofal;
    @Basic(optional = false)
    @Column(name = "LRCOTIOBJETOUAL", nullable = false, length = 30)
    private String lrcotiobjetoual;
    @Column(name = "LRCOTIOBJETOFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotiobjetofmd;
    @Column(name = "LRCOTIOBJETOUMD", length = 30)
    private String lrcotiobjetoumd;

    public Lrcotiobjeto() {
    }

    public Lrcotiobjeto(Long lrcotiobjetoid) {
        this.lrcotiobjetoid = lrcotiobjetoid;
    }

    public Lrcotiobjeto(Long lrcotiobjetoid, String lrcotiobjetonombre, String lrcotiobjetodescripcion, Date lrcotiobjetofal, String lrcotiobjetoual) {
        this.lrcotiobjetoid = lrcotiobjetoid;
        this.lrcotiobjetonombre = lrcotiobjetonombre;
        this.lrcotiobjetodescripcion = lrcotiobjetodescripcion;
        this.lrcotiobjetofal = lrcotiobjetofal;
        this.lrcotiobjetoual = lrcotiobjetoual;
    }

    public Long getLrcotiobjetoid() {
        return lrcotiobjetoid;
    }

    public void setLrcotiobjetoid(Long lrcotiobjetoid) {
        this.lrcotiobjetoid = lrcotiobjetoid;
    }

    public String getLrcotiobjetonombre() {
        return lrcotiobjetonombre;
    }

    public void setLrcotiobjetonombre(String lrcotiobjetonombre) {
        this.lrcotiobjetonombre = lrcotiobjetonombre;
    }

    public String getLrcotiobjetodescripcion() {
        return lrcotiobjetodescripcion;
    }

    public void setLrcotiobjetodescripcion(String lrcotiobjetodescripcion) {
        this.lrcotiobjetodescripcion = lrcotiobjetodescripcion;
    }

    public Date getLrcotiobjetofal() {
        return lrcotiobjetofal;
    }

    public void setLrcotiobjetofal(Date lrcotiobjetofal) {
        this.lrcotiobjetofal = lrcotiobjetofal;
    }

    public String getLrcotiobjetoual() {
        return lrcotiobjetoual;
    }

    public void setLrcotiobjetoual(String lrcotiobjetoual) {
        this.lrcotiobjetoual = lrcotiobjetoual;
    }

    public Date getLrcotiobjetofmd() {
        return lrcotiobjetofmd;
    }

    public void setLrcotiobjetofmd(Date lrcotiobjetofmd) {
        this.lrcotiobjetofmd = lrcotiobjetofmd;
    }

    public String getLrcotiobjetoumd() {
        return lrcotiobjetoumd;
    }

    public void setLrcotiobjetoumd(String lrcotiobjetoumd) {
        this.lrcotiobjetoumd = lrcotiobjetoumd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcotiobjetoid != null ? lrcotiobjetoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcotiobjeto)) {
            return false;
        }
        Lrcotiobjeto other = (Lrcotiobjeto) object;
        if ((this.lrcotiobjetoid == null && other.lrcotiobjetoid != null) || (this.lrcotiobjetoid != null && !this.lrcotiobjetoid.equals(other.lrcotiobjetoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcotiobjeto[ lrcotiobjetoid=" + lrcotiobjetoid + " ]";
    }
    
}
