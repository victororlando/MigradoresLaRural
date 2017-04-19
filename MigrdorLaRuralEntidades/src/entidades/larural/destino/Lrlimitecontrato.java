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
@Table(name = "LRLIMITECONTRATO")
@NamedQueries({
    @NamedQuery(name = "Lrlimitecontrato.findAll", query = "SELECT l FROM Lrlimitecontrato l"),
    @NamedQuery(name = "Lrlimitecontrato.findByLrlimitecontratoid", query = "SELECT l FROM Lrlimitecontrato l WHERE l.lrlimitecontratoid = :lrlimitecontratoid"),
    @NamedQuery(name = "Lrlimitecontrato.findByLrlimitecontratodesc", query = "SELECT l FROM Lrlimitecontrato l WHERE l.lrlimitecontratodesc = :lrlimitecontratodesc"),
    @NamedQuery(name = "Lrlimitecontrato.findByLrlimitecontratoimportedesde", query = "SELECT l FROM Lrlimitecontrato l WHERE l.lrlimitecontratoimportedesde = :lrlimitecontratoimportedesde"),
    @NamedQuery(name = "Lrlimitecontrato.findByLrlimitecontratoimportehasta", query = "SELECT l FROM Lrlimitecontrato l WHERE l.lrlimitecontratoimportehasta = :lrlimitecontratoimportehasta"),
    @NamedQuery(name = "Lrlimitecontrato.findByLrlimitecontratomsg", query = "SELECT l FROM Lrlimitecontrato l WHERE l.lrlimitecontratomsg = :lrlimitecontratomsg"),
    @NamedQuery(name = "Lrlimitecontrato.findByLrlimitecontratoac", query = "SELECT l FROM Lrlimitecontrato l WHERE l.lrlimitecontratoac = :lrlimitecontratoac"),
    @NamedQuery(name = "Lrlimitecontrato.findByLrlimitecontratoual", query = "SELECT l FROM Lrlimitecontrato l WHERE l.lrlimitecontratoual = :lrlimitecontratoual"),
    @NamedQuery(name = "Lrlimitecontrato.findByLrlimitecontratofal", query = "SELECT l FROM Lrlimitecontrato l WHERE l.lrlimitecontratofal = :lrlimitecontratofal"),
    @NamedQuery(name = "Lrlimitecontrato.findByLrlimitecontratoumd", query = "SELECT l FROM Lrlimitecontrato l WHERE l.lrlimitecontratoumd = :lrlimitecontratoumd"),
    @NamedQuery(name = "Lrlimitecontrato.findByLrlimitecontratofmd", query = "SELECT l FROM Lrlimitecontrato l WHERE l.lrlimitecontratofmd = :lrlimitecontratofmd")})
public class Lrlimitecontrato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRLIMITECONTRATOID", nullable = false)
    private Long lrlimitecontratoid;
    @Basic(optional = false)
    @Column(name = "LRLIMITECONTRATODESC", nullable = false, length = 100)
    private String lrlimitecontratodesc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRLIMITECONTRATOIMPORTEDESDE", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrlimitecontratoimportedesde;
    @Basic(optional = false)
    @Column(name = "LRLIMITECONTRATOIMPORTEHASTA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrlimitecontratoimportehasta;
    @Basic(optional = false)
    @Column(name = "LRLIMITECONTRATOMSG", nullable = false, length = 200)
    private String lrlimitecontratomsg;
    @Basic(optional = false)
    @Column(name = "LRLIMITECONTRATOAC", nullable = false)
    private Character lrlimitecontratoac;
    @Basic(optional = false)
    @Column(name = "LRLIMITECONTRATOUAL", nullable = false, length = 30)
    private String lrlimitecontratoual;
    @Basic(optional = false)
    @Column(name = "LRLIMITECONTRATOFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrlimitecontratofal;
    @Basic(optional = false)
    @Column(name = "LRLIMITECONTRATOUMD", nullable = false, length = 30)
    private String lrlimitecontratoumd;
    @Basic(optional = false)
    @Column(name = "LRLIMITECONTRATOFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrlimitecontratofmd;
    @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false)
    @ManyToOne(optional = false)
    private Lrseccdetalle lrseccdetalleid;

    public Lrlimitecontrato() {
    }

    public Lrlimitecontrato(Long lrlimitecontratoid) {
        this.lrlimitecontratoid = lrlimitecontratoid;
    }

    public Lrlimitecontrato(Long lrlimitecontratoid, String lrlimitecontratodesc, BigDecimal lrlimitecontratoimportedesde, BigDecimal lrlimitecontratoimportehasta, String lrlimitecontratomsg, Character lrlimitecontratoac, String lrlimitecontratoual, Date lrlimitecontratofal, String lrlimitecontratoumd, Date lrlimitecontratofmd) {
        this.lrlimitecontratoid = lrlimitecontratoid;
        this.lrlimitecontratodesc = lrlimitecontratodesc;
        this.lrlimitecontratoimportedesde = lrlimitecontratoimportedesde;
        this.lrlimitecontratoimportehasta = lrlimitecontratoimportehasta;
        this.lrlimitecontratomsg = lrlimitecontratomsg;
        this.lrlimitecontratoac = lrlimitecontratoac;
        this.lrlimitecontratoual = lrlimitecontratoual;
        this.lrlimitecontratofal = lrlimitecontratofal;
        this.lrlimitecontratoumd = lrlimitecontratoumd;
        this.lrlimitecontratofmd = lrlimitecontratofmd;
    }

    public Long getLrlimitecontratoid() {
        return lrlimitecontratoid;
    }

    public void setLrlimitecontratoid(Long lrlimitecontratoid) {
        this.lrlimitecontratoid = lrlimitecontratoid;
    }

    public String getLrlimitecontratodesc() {
        return lrlimitecontratodesc;
    }

    public void setLrlimitecontratodesc(String lrlimitecontratodesc) {
        this.lrlimitecontratodesc = lrlimitecontratodesc;
    }

    public BigDecimal getLrlimitecontratoimportedesde() {
        return lrlimitecontratoimportedesde;
    }

    public void setLrlimitecontratoimportedesde(BigDecimal lrlimitecontratoimportedesde) {
        this.lrlimitecontratoimportedesde = lrlimitecontratoimportedesde;
    }

    public BigDecimal getLrlimitecontratoimportehasta() {
        return lrlimitecontratoimportehasta;
    }

    public void setLrlimitecontratoimportehasta(BigDecimal lrlimitecontratoimportehasta) {
        this.lrlimitecontratoimportehasta = lrlimitecontratoimportehasta;
    }

    public String getLrlimitecontratomsg() {
        return lrlimitecontratomsg;
    }

    public void setLrlimitecontratomsg(String lrlimitecontratomsg) {
        this.lrlimitecontratomsg = lrlimitecontratomsg;
    }

    public Character getLrlimitecontratoac() {
        return lrlimitecontratoac;
    }

    public void setLrlimitecontratoac(Character lrlimitecontratoac) {
        this.lrlimitecontratoac = lrlimitecontratoac;
    }

    public String getLrlimitecontratoual() {
        return lrlimitecontratoual;
    }

    public void setLrlimitecontratoual(String lrlimitecontratoual) {
        this.lrlimitecontratoual = lrlimitecontratoual;
    }

    public Date getLrlimitecontratofal() {
        return lrlimitecontratofal;
    }

    public void setLrlimitecontratofal(Date lrlimitecontratofal) {
        this.lrlimitecontratofal = lrlimitecontratofal;
    }

    public String getLrlimitecontratoumd() {
        return lrlimitecontratoumd;
    }

    public void setLrlimitecontratoumd(String lrlimitecontratoumd) {
        this.lrlimitecontratoumd = lrlimitecontratoumd;
    }

    public Date getLrlimitecontratofmd() {
        return lrlimitecontratofmd;
    }

    public void setLrlimitecontratofmd(Date lrlimitecontratofmd) {
        this.lrlimitecontratofmd = lrlimitecontratofmd;
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
        hash += (lrlimitecontratoid != null ? lrlimitecontratoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrlimitecontrato)) {
            return false;
        }
        Lrlimitecontrato other = (Lrlimitecontrato) object;
        if ((this.lrlimitecontratoid == null && other.lrlimitecontratoid != null) || (this.lrlimitecontratoid != null && !this.lrlimitecontratoid.equals(other.lrlimitecontratoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrlimitecontrato[ lrlimitecontratoid=" + lrlimitecontratoid + " ]";
    }
    
}
