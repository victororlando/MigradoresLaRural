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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRCOTIPLANBIENCOBERTURA")
@NamedQueries({
    @NamedQuery(name = "Lrcotiplanbiencobertura.findAll", query = "SELECT l FROM Lrcotiplanbiencobertura l"),
    @NamedQuery(name = "Lrcotiplanbiencobertura.findByLrcotiplanbiencoberturaid", query = "SELECT l FROM Lrcotiplanbiencobertura l WHERE l.lrcotiplanbiencoberturaid = :lrcotiplanbiencoberturaid"),
    @NamedQuery(name = "Lrcotiplanbiencobertura.findByLrcotiplanbiencoberturaporc", query = "SELECT l FROM Lrcotiplanbiencobertura l WHERE l.lrcotiplanbiencoberturaporc = :lrcotiplanbiencoberturaporc"),
    @NamedQuery(name = "Lrcotiplanbiencobertura.findByLrcotiplanbiencoberturavalor", query = "SELECT l FROM Lrcotiplanbiencobertura l WHERE l.lrcotiplanbiencoberturavalor = :lrcotiplanbiencoberturavalor"),
    @NamedQuery(name = "Lrcotiplanbiencobertura.findByLrcotiplanbiencoberturaual", query = "SELECT l FROM Lrcotiplanbiencobertura l WHERE l.lrcotiplanbiencoberturaual = :lrcotiplanbiencoberturaual"),
    @NamedQuery(name = "Lrcotiplanbiencobertura.findByLrcotiplanbiencoberturafal", query = "SELECT l FROM Lrcotiplanbiencobertura l WHERE l.lrcotiplanbiencoberturafal = :lrcotiplanbiencoberturafal"),
    @NamedQuery(name = "Lrcotiplanbiencobertura.findByLrcotiplanbiencoberturaumd", query = "SELECT l FROM Lrcotiplanbiencobertura l WHERE l.lrcotiplanbiencoberturaumd = :lrcotiplanbiencoberturaumd"),
    @NamedQuery(name = "Lrcotiplanbiencobertura.findByLrcotiplanbiencoberturafmd", query = "SELECT l FROM Lrcotiplanbiencobertura l WHERE l.lrcotiplanbiencoberturafmd = :lrcotiplanbiencoberturafmd")})
public class Lrcotiplanbiencobertura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "LRCOTIPLANBIENCOBERTURA_SEQ_GENERATOR", sequenceName = "LRCOTIPLANBIENCOBERTURAID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LRCOTIPLANBIENCOBERTURA_SEQ_GENERATOR")
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENCOBERTURAID", nullable = false)
    private Long lrcotiplanbiencoberturaid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENCOBERTURAPORC", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbiencoberturaporc;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENCOBERTURAVALOR", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbiencoberturavalor;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENCOBERTURAUAL", nullable = false, length = 30)
    private String lrcotiplanbiencoberturaual;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENCOBERTURAFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotiplanbiencoberturafal;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENCOBERTURAUMD", nullable = false, length = 30)
    private String lrcotiplanbiencoberturaumd;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENCOBERTURAFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotiplanbiencoberturafmd;
    @JoinColumn(name = "SCOBERTURAPLANID", referencedColumnName = "LRCOBERTURAPLANID", nullable = false)
    @ManyToOne(optional = false)
    private Lrcoberturaplan scoberturaplanid;
    @JoinColumns({
        @JoinColumn(name = "SSECCDETALLEID", referencedColumnName = "SSECCDETALLEID", nullable = false),
        @JoinColumn(name = "SPARMCOTIPLANID", referencedColumnName = "SPARMCOTIPLANID", nullable = false),
        @JoinColumn(name = "STIPOPLANID", referencedColumnName = "STIPOPLANID", nullable = false),
        @JoinColumn(name = "LRCOTIZACIONNRO", referencedColumnName = "LRCOTIZACIONNRO", nullable = false),
        @JoinColumn(name = "SCOTIZACIONVERSION", referencedColumnName = "SCOTIZACIONVERSION", nullable = false),
        @JoinColumn(name = "SCOTIDATBIENASEID", referencedColumnName = "SCOTIDATBIENASEID", nullable = false)})
    @ManyToOne(optional = false)
    private Lrcotiplanbien lrcotiplanbien;
    @JoinColumn(name = "SMODOCOBERTURAID", referencedColumnName = "LRMODOCOBERTURAID", nullable = false)
    @ManyToOne(optional = false)
    private Lrmodocobertura smodocoberturaid;

    public Lrcotiplanbiencobertura() {
    }

    public Lrcotiplanbiencobertura(Long lrcotiplanbiencoberturaid) {
        this.lrcotiplanbiencoberturaid = lrcotiplanbiencoberturaid;
    }

    public Lrcotiplanbiencobertura(Long lrcotiplanbiencoberturaid, BigDecimal lrcotiplanbiencoberturaporc, BigDecimal lrcotiplanbiencoberturavalor, String lrcotiplanbiencoberturaual, Date lrcotiplanbiencoberturafal, String lrcotiplanbiencoberturaumd, Date lrcotiplanbiencoberturafmd) {
        this.lrcotiplanbiencoberturaid = lrcotiplanbiencoberturaid;
        this.lrcotiplanbiencoberturaporc = lrcotiplanbiencoberturaporc;
        this.lrcotiplanbiencoberturavalor = lrcotiplanbiencoberturavalor;
        this.lrcotiplanbiencoberturaual = lrcotiplanbiencoberturaual;
        this.lrcotiplanbiencoberturafal = lrcotiplanbiencoberturafal;
        this.lrcotiplanbiencoberturaumd = lrcotiplanbiencoberturaumd;
        this.lrcotiplanbiencoberturafmd = lrcotiplanbiencoberturafmd;
    }

    public Long getLrcotiplanbiencoberturaid() {
        return lrcotiplanbiencoberturaid;
    }

    public void setLrcotiplanbiencoberturaid(Long lrcotiplanbiencoberturaid) {
        this.lrcotiplanbiencoberturaid = lrcotiplanbiencoberturaid;
    }

    public BigDecimal getLrcotiplanbiencoberturaporc() {
        return lrcotiplanbiencoberturaporc;
    }

    public void setLrcotiplanbiencoberturaporc(BigDecimal lrcotiplanbiencoberturaporc) {
        this.lrcotiplanbiencoberturaporc = lrcotiplanbiencoberturaporc;
    }

    public BigDecimal getLrcotiplanbiencoberturavalor() {
        return lrcotiplanbiencoberturavalor;
    }

    public void setLrcotiplanbiencoberturavalor(BigDecimal lrcotiplanbiencoberturavalor) {
        this.lrcotiplanbiencoberturavalor = lrcotiplanbiencoberturavalor;
    }

    public String getLrcotiplanbiencoberturaual() {
        return lrcotiplanbiencoberturaual;
    }

    public void setLrcotiplanbiencoberturaual(String lrcotiplanbiencoberturaual) {
        this.lrcotiplanbiencoberturaual = lrcotiplanbiencoberturaual;
    }

    public Date getLrcotiplanbiencoberturafal() {
        return lrcotiplanbiencoberturafal;
    }

    public void setLrcotiplanbiencoberturafal(Date lrcotiplanbiencoberturafal) {
        this.lrcotiplanbiencoberturafal = lrcotiplanbiencoberturafal;
    }

    public String getLrcotiplanbiencoberturaumd() {
        return lrcotiplanbiencoberturaumd;
    }

    public void setLrcotiplanbiencoberturaumd(String lrcotiplanbiencoberturaumd) {
        this.lrcotiplanbiencoberturaumd = lrcotiplanbiencoberturaumd;
    }

    public Date getLrcotiplanbiencoberturafmd() {
        return lrcotiplanbiencoberturafmd;
    }

    public void setLrcotiplanbiencoberturafmd(Date lrcotiplanbiencoberturafmd) {
        this.lrcotiplanbiencoberturafmd = lrcotiplanbiencoberturafmd;
    }

    public Lrcoberturaplan getScoberturaplanid() {
        return scoberturaplanid;
    }

    public void setScoberturaplanid(Lrcoberturaplan scoberturaplanid) {
        this.scoberturaplanid = scoberturaplanid;
    }

    public Lrcotiplanbien getLrcotiplanbien() {
        return lrcotiplanbien;
    }

    public void setLrcotiplanbien(Lrcotiplanbien lrcotiplanbien) {
        this.lrcotiplanbien = lrcotiplanbien;
    }

    public Lrmodocobertura getSmodocoberturaid() {
        return smodocoberturaid;
    }

    public void setSmodocoberturaid(Lrmodocobertura smodocoberturaid) {
        this.smodocoberturaid = smodocoberturaid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcotiplanbiencoberturaid != null ? lrcotiplanbiencoberturaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcotiplanbiencobertura)) {
            return false;
        }
        Lrcotiplanbiencobertura other = (Lrcotiplanbiencobertura) object;
        if ((this.lrcotiplanbiencoberturaid == null && other.lrcotiplanbiencoberturaid != null) || (this.lrcotiplanbiencoberturaid != null && !this.lrcotiplanbiencoberturaid.equals(other.lrcotiplanbiencoberturaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcotiplanbiencobertura[ lrcotiplanbiencoberturaid=" + lrcotiplanbiencoberturaid + " ]";
    }

}
