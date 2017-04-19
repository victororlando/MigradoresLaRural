/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "LRRUBRORIESGO")
@NamedQueries({
    @NamedQuery(name = "Lrrubroriesgo.findAll", query = "SELECT l FROM Lrrubroriesgo l"),
    @NamedQuery(name = "Lrrubroriesgo.findByRiesgosaseid", query = "SELECT l FROM Lrrubroriesgo l WHERE l.lrrubroriesgoPK.riesgosaseid = :riesgosaseid"),
    @NamedQuery(name = "Lrrubroriesgo.findBySeccid", query = "SELECT l FROM Lrrubroriesgo l WHERE l.lrrubroriesgoPK.seccid = :seccid"),
    @NamedQuery(name = "Lrrubroriesgo.findByRubrosid", query = "SELECT l FROM Lrrubroriesgo l WHERE l.lrrubroriesgoPK.rubrosid = :rubrosid"),
    @NamedQuery(name = "Lrrubroriesgo.findByLrrubroriesgoac", query = "SELECT l FROM Lrrubroriesgo l WHERE l.lrrubroriesgoac = :lrrubroriesgoac"),
    @NamedQuery(name = "Lrrubroriesgo.findByLrrubroriesgoual", query = "SELECT l FROM Lrrubroriesgo l WHERE l.lrrubroriesgoual = :lrrubroriesgoual"),
    @NamedQuery(name = "Lrrubroriesgo.findByLrrubroriesgofal", query = "SELECT l FROM Lrrubroriesgo l WHERE l.lrrubroriesgofal = :lrrubroriesgofal"),
    @NamedQuery(name = "Lrrubroriesgo.findByLrrubroriesgoumd", query = "SELECT l FROM Lrrubroriesgo l WHERE l.lrrubroriesgoumd = :lrrubroriesgoumd"),
    @NamedQuery(name = "Lrrubroriesgo.findByLrrubroriesgofmd", query = "SELECT l FROM Lrrubroriesgo l WHERE l.lrrubroriesgofmd = :lrrubroriesgofmd"),
    @NamedQuery(name = "Lrrubroriesgo.findByLrrubroriesgosumaseg", query = "SELECT l FROM Lrrubroriesgo l WHERE l.lrrubroriesgosumaseg = :lrrubroriesgosumaseg"),
    @NamedQuery(name = "Lrrubroriesgo.findByLrrubroriesgotasa", query = "SELECT l FROM Lrrubroriesgo l WHERE l.lrrubroriesgotasa = :lrrubroriesgotasa")})
public class Lrrubroriesgo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrrubroriesgoPK lrrubroriesgoPK;
    @Basic(optional = false)
    @Column(name = "LRRUBRORIESGOAC", nullable = false)
    private Character lrrubroriesgoac;
    @Basic(optional = false)
    @Column(name = "LRRUBRORIESGOUAL", nullable = false, length = 30)
    private String lrrubroriesgoual;
    @Basic(optional = false)
    @Column(name = "LRRUBRORIESGOFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrrubroriesgofal;
    @Basic(optional = false)
    @Column(name = "LRRUBRORIESGOUMD", nullable = false, length = 30)
    private String lrrubroriesgoumd;
    @Basic(optional = false)
    @Column(name = "LRRUBRORIESGOFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrrubroriesgofmd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRRUBRORIESGOSUMASEG", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrrubroriesgosumaseg;
    @Basic(optional = false)
    @Column(name = "LRRUBRORIESGOTASA", nullable = false, precision = 7, scale = 2)
    private BigDecimal lrrubroriesgotasa;

    public Lrrubroriesgo() {
    }

    public Lrrubroriesgo(LrrubroriesgoPK lrrubroriesgoPK) {
        this.lrrubroriesgoPK = lrrubroriesgoPK;
    }

    public Lrrubroriesgo(LrrubroriesgoPK lrrubroriesgoPK, Character lrrubroriesgoac, String lrrubroriesgoual, Date lrrubroriesgofal, String lrrubroriesgoumd, Date lrrubroriesgofmd, BigDecimal lrrubroriesgosumaseg, BigDecimal lrrubroriesgotasa) {
        this.lrrubroriesgoPK = lrrubroriesgoPK;
        this.lrrubroriesgoac = lrrubroriesgoac;
        this.lrrubroriesgoual = lrrubroriesgoual;
        this.lrrubroriesgofal = lrrubroriesgofal;
        this.lrrubroriesgoumd = lrrubroriesgoumd;
        this.lrrubroriesgofmd = lrrubroriesgofmd;
        this.lrrubroriesgosumaseg = lrrubroriesgosumaseg;
        this.lrrubroriesgotasa = lrrubroriesgotasa;
    }

    public Lrrubroriesgo(short riesgosaseid, short seccid, long rubrosid) {
        this.lrrubroriesgoPK = new LrrubroriesgoPK(riesgosaseid, seccid, rubrosid);
    }

    public LrrubroriesgoPK getLrrubroriesgoPK() {
        return lrrubroriesgoPK;
    }

    public void setLrrubroriesgoPK(LrrubroriesgoPK lrrubroriesgoPK) {
        this.lrrubroriesgoPK = lrrubroriesgoPK;
    }

    public Character getLrrubroriesgoac() {
        return lrrubroriesgoac;
    }

    public void setLrrubroriesgoac(Character lrrubroriesgoac) {
        this.lrrubroriesgoac = lrrubroriesgoac;
    }

    public String getLrrubroriesgoual() {
        return lrrubroriesgoual;
    }

    public void setLrrubroriesgoual(String lrrubroriesgoual) {
        this.lrrubroriesgoual = lrrubroriesgoual;
    }

    public Date getLrrubroriesgofal() {
        return lrrubroriesgofal;
    }

    public void setLrrubroriesgofal(Date lrrubroriesgofal) {
        this.lrrubroriesgofal = lrrubroriesgofal;
    }

    public String getLrrubroriesgoumd() {
        return lrrubroriesgoumd;
    }

    public void setLrrubroriesgoumd(String lrrubroriesgoumd) {
        this.lrrubroriesgoumd = lrrubroriesgoumd;
    }

    public Date getLrrubroriesgofmd() {
        return lrrubroriesgofmd;
    }

    public void setLrrubroriesgofmd(Date lrrubroriesgofmd) {
        this.lrrubroriesgofmd = lrrubroriesgofmd;
    }

    public BigDecimal getLrrubroriesgosumaseg() {
        return lrrubroriesgosumaseg;
    }

    public void setLrrubroriesgosumaseg(BigDecimal lrrubroriesgosumaseg) {
        this.lrrubroriesgosumaseg = lrrubroriesgosumaseg;
    }

    public BigDecimal getLrrubroriesgotasa() {
        return lrrubroriesgotasa;
    }

    public void setLrrubroriesgotasa(BigDecimal lrrubroriesgotasa) {
        this.lrrubroriesgotasa = lrrubroriesgotasa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrrubroriesgoPK != null ? lrrubroriesgoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrrubroriesgo)) {
            return false;
        }
        Lrrubroriesgo other = (Lrrubroriesgo) object;
        if ((this.lrrubroriesgoPK == null && other.lrrubroriesgoPK != null) || (this.lrrubroriesgoPK != null && !this.lrrubroriesgoPK.equals(other.lrrubroriesgoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrrubroriesgo[ lrrubroriesgoPK=" + lrrubroriesgoPK + " ]";
    }
    
}
