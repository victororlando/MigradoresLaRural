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
@Table(name = "LRTASACOBERTURA")
@NamedQueries({
    @NamedQuery(name = "Lrtasacobertura.findAll", query = "SELECT l FROM Lrtasacobertura l"),
    @NamedQuery(name = "Lrtasacobertura.findByLrtasacoberturaid", query = "SELECT l FROM Lrtasacobertura l WHERE l.lrtasacoberturaid = :lrtasacoberturaid"),
    @NamedQuery(name = "Lrtasacobertura.findByLrtasacoberturaedad", query = "SELECT l FROM Lrtasacobertura l WHERE l.lrtasacoberturaedad = :lrtasacoberturaedad"),
    @NamedQuery(name = "Lrtasacobertura.findByLrtasacoberturadesde", query = "SELECT l FROM Lrtasacobertura l WHERE l.lrtasacoberturadesde = :lrtasacoberturadesde"),
    @NamedQuery(name = "Lrtasacobertura.findByLrtasacoberturahasta", query = "SELECT l FROM Lrtasacobertura l WHERE l.lrtasacoberturahasta = :lrtasacoberturahasta"),
    @NamedQuery(name = "Lrtasacobertura.findBySeccid", query = "SELECT l FROM Lrtasacobertura l WHERE l.seccid = :seccid"),
    @NamedQuery(name = "Lrtasacobertura.findByCoberturastipid", query = "SELECT l FROM Lrtasacobertura l WHERE l.coberturastipid = :coberturastipid"),
    @NamedQuery(name = "Lrtasacobertura.findByLrtasacoberturanuevo", query = "SELECT l FROM Lrtasacobertura l WHERE l.lrtasacoberturanuevo = :lrtasacoberturanuevo"),
    @NamedQuery(name = "Lrtasacobertura.findByLrtasacoberturarenov", query = "SELECT l FROM Lrtasacobertura l WHERE l.lrtasacoberturarenov = :lrtasacoberturarenov"),
    @NamedQuery(name = "Lrtasacobertura.findByLrtasacoberturaac", query = "SELECT l FROM Lrtasacobertura l WHERE l.lrtasacoberturaac = :lrtasacoberturaac"),
    @NamedQuery(name = "Lrtasacobertura.findByLrtasacoberturaual", query = "SELECT l FROM Lrtasacobertura l WHERE l.lrtasacoberturaual = :lrtasacoberturaual"),
    @NamedQuery(name = "Lrtasacobertura.findByLrtasacoberturafal", query = "SELECT l FROM Lrtasacobertura l WHERE l.lrtasacoberturafal = :lrtasacoberturafal"),
    @NamedQuery(name = "Lrtasacobertura.findByLrtasacoberturaumd", query = "SELECT l FROM Lrtasacobertura l WHERE l.lrtasacoberturaumd = :lrtasacoberturaumd"),
    @NamedQuery(name = "Lrtasacobertura.findByLrtasacoberturafmd", query = "SELECT l FROM Lrtasacobertura l WHERE l.lrtasacoberturafmd = :lrtasacoberturafmd"),
    @NamedQuery(name = "Lrtasacobertura.findByRiesgosaseid", query = "SELECT l FROM Lrtasacobertura l WHERE l.riesgosaseid = :riesgosaseid")})
public class Lrtasacobertura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRTASACOBERTURAID", nullable = false)
    private Long lrtasacoberturaid;
    @Basic(optional = false)
    @Column(name = "LRTASACOBERTURAEDAD", nullable = false)
    private short lrtasacoberturaedad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRTASACOBERTURADESDE", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrtasacoberturadesde;
    @Basic(optional = false)
    @Column(name = "LRTASACOBERTURAHASTA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrtasacoberturahasta;
    @Basic(optional = false)
    @Column(name = "SECCID", nullable = false)
    private short seccid;
    @Basic(optional = false)
    @Column(name = "COBERTURASTIPID", nullable = false)
    private short coberturastipid;
    @Basic(optional = false)
    @Column(name = "LRTASACOBERTURANUEVO", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrtasacoberturanuevo;
    @Basic(optional = false)
    @Column(name = "LRTASACOBERTURARENOV", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrtasacoberturarenov;
    @Basic(optional = false)
    @Column(name = "LRTASACOBERTURAAC", nullable = false)
    private Character lrtasacoberturaac;
    @Basic(optional = false)
    @Column(name = "LRTASACOBERTURAUAL", nullable = false, length = 30)
    private String lrtasacoberturaual;
    @Basic(optional = false)
    @Column(name = "LRTASACOBERTURAFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtasacoberturafal;
    @Basic(optional = false)
    @Column(name = "LRTASACOBERTURAUMD", nullable = false, length = 30)
    private String lrtasacoberturaumd;
    @Basic(optional = false)
    @Column(name = "LRTASACOBERTURAFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrtasacoberturafmd;
    @Basic(optional = false)
    @Column(name = "RIESGOSASEID", nullable = false)
    private short riesgosaseid;

    public Lrtasacobertura() {
    }

    public Lrtasacobertura(Long lrtasacoberturaid) {
        this.lrtasacoberturaid = lrtasacoberturaid;
    }

    public Lrtasacobertura(Long lrtasacoberturaid, short lrtasacoberturaedad, BigDecimal lrtasacoberturadesde, BigDecimal lrtasacoberturahasta, short seccid, short coberturastipid, BigDecimal lrtasacoberturanuevo, BigDecimal lrtasacoberturarenov, Character lrtasacoberturaac, String lrtasacoberturaual, Date lrtasacoberturafal, String lrtasacoberturaumd, Date lrtasacoberturafmd, short riesgosaseid) {
        this.lrtasacoberturaid = lrtasacoberturaid;
        this.lrtasacoberturaedad = lrtasacoberturaedad;
        this.lrtasacoberturadesde = lrtasacoberturadesde;
        this.lrtasacoberturahasta = lrtasacoberturahasta;
        this.seccid = seccid;
        this.coberturastipid = coberturastipid;
        this.lrtasacoberturanuevo = lrtasacoberturanuevo;
        this.lrtasacoberturarenov = lrtasacoberturarenov;
        this.lrtasacoberturaac = lrtasacoberturaac;
        this.lrtasacoberturaual = lrtasacoberturaual;
        this.lrtasacoberturafal = lrtasacoberturafal;
        this.lrtasacoberturaumd = lrtasacoberturaumd;
        this.lrtasacoberturafmd = lrtasacoberturafmd;
        this.riesgosaseid = riesgosaseid;
    }

    public Long getLrtasacoberturaid() {
        return lrtasacoberturaid;
    }

    public void setLrtasacoberturaid(Long lrtasacoberturaid) {
        this.lrtasacoberturaid = lrtasacoberturaid;
    }

    public short getLrtasacoberturaedad() {
        return lrtasacoberturaedad;
    }

    public void setLrtasacoberturaedad(short lrtasacoberturaedad) {
        this.lrtasacoberturaedad = lrtasacoberturaedad;
    }

    public BigDecimal getLrtasacoberturadesde() {
        return lrtasacoberturadesde;
    }

    public void setLrtasacoberturadesde(BigDecimal lrtasacoberturadesde) {
        this.lrtasacoberturadesde = lrtasacoberturadesde;
    }

    public BigDecimal getLrtasacoberturahasta() {
        return lrtasacoberturahasta;
    }

    public void setLrtasacoberturahasta(BigDecimal lrtasacoberturahasta) {
        this.lrtasacoberturahasta = lrtasacoberturahasta;
    }

    public short getSeccid() {
        return seccid;
    }

    public void setSeccid(short seccid) {
        this.seccid = seccid;
    }

    public short getCoberturastipid() {
        return coberturastipid;
    }

    public void setCoberturastipid(short coberturastipid) {
        this.coberturastipid = coberturastipid;
    }

    public BigDecimal getLrtasacoberturanuevo() {
        return lrtasacoberturanuevo;
    }

    public void setLrtasacoberturanuevo(BigDecimal lrtasacoberturanuevo) {
        this.lrtasacoberturanuevo = lrtasacoberturanuevo;
    }

    public BigDecimal getLrtasacoberturarenov() {
        return lrtasacoberturarenov;
    }

    public void setLrtasacoberturarenov(BigDecimal lrtasacoberturarenov) {
        this.lrtasacoberturarenov = lrtasacoberturarenov;
    }

    public Character getLrtasacoberturaac() {
        return lrtasacoberturaac;
    }

    public void setLrtasacoberturaac(Character lrtasacoberturaac) {
        this.lrtasacoberturaac = lrtasacoberturaac;
    }

    public String getLrtasacoberturaual() {
        return lrtasacoberturaual;
    }

    public void setLrtasacoberturaual(String lrtasacoberturaual) {
        this.lrtasacoberturaual = lrtasacoberturaual;
    }

    public Date getLrtasacoberturafal() {
        return lrtasacoberturafal;
    }

    public void setLrtasacoberturafal(Date lrtasacoberturafal) {
        this.lrtasacoberturafal = lrtasacoberturafal;
    }

    public String getLrtasacoberturaumd() {
        return lrtasacoberturaumd;
    }

    public void setLrtasacoberturaumd(String lrtasacoberturaumd) {
        this.lrtasacoberturaumd = lrtasacoberturaumd;
    }

    public Date getLrtasacoberturafmd() {
        return lrtasacoberturafmd;
    }

    public void setLrtasacoberturafmd(Date lrtasacoberturafmd) {
        this.lrtasacoberturafmd = lrtasacoberturafmd;
    }

    public short getRiesgosaseid() {
        return riesgosaseid;
    }

    public void setRiesgosaseid(short riesgosaseid) {
        this.riesgosaseid = riesgosaseid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrtasacoberturaid != null ? lrtasacoberturaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrtasacobertura)) {
            return false;
        }
        Lrtasacobertura other = (Lrtasacobertura) object;
        if ((this.lrtasacoberturaid == null && other.lrtasacoberturaid != null) || (this.lrtasacoberturaid != null && !this.lrtasacoberturaid.equals(other.lrtasacoberturaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrtasacobertura[ lrtasacoberturaid=" + lrtasacoberturaid + " ]";
    }
    
}
