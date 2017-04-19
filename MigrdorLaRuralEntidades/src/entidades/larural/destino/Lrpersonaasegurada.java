/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRPERSONAASEGURADA")
@NamedQueries({
    @NamedQuery(name = "Lrpersonaasegurada.findAll", query = "SELECT l FROM Lrpersonaasegurada l"),
    @NamedQuery(name = "Lrpersonaasegurada.findByLrpersonaaseguradaid", query = "SELECT l FROM Lrpersonaasegurada l WHERE l.lrpersonaaseguradaid = :lrpersonaaseguradaid"),
    @NamedQuery(name = "Lrpersonaasegurada.findByLrpersonaaseguradanro", query = "SELECT l FROM Lrpersonaasegurada l WHERE l.lrpersonaaseguradanro = :lrpersonaaseguradanro"),
    @NamedQuery(name = "Lrpersonaasegurada.findByLrpersonaaseguradasumaaseg", query = "SELECT l FROM Lrpersonaasegurada l WHERE l.lrpersonaaseguradasumaaseg = :lrpersonaaseguradasumaaseg"),
    @NamedQuery(name = "Lrpersonaasegurada.findByLrpersonaaseguradaual", query = "SELECT l FROM Lrpersonaasegurada l WHERE l.lrpersonaaseguradaual = :lrpersonaaseguradaual"),
    @NamedQuery(name = "Lrpersonaasegurada.findByLrpersonaaseguradafal", query = "SELECT l FROM Lrpersonaasegurada l WHERE l.lrpersonaaseguradafal = :lrpersonaaseguradafal"),
    @NamedQuery(name = "Lrpersonaasegurada.findByLrpersonaaseguradaumd", query = "SELECT l FROM Lrpersonaasegurada l WHERE l.lrpersonaaseguradaumd = :lrpersonaaseguradaumd"),
    @NamedQuery(name = "Lrpersonaasegurada.findByLrpersonaaseguradafmd", query = "SELECT l FROM Lrpersonaasegurada l WHERE l.lrpersonaaseguradafmd = :lrpersonaaseguradafmd"),
    @NamedQuery(name = "Lrpersonaasegurada.findByLrpersonaaseguradapersonaid", query = "SELECT l FROM Lrpersonaasegurada l WHERE l.lrpersonaaseguradapersonaid = :lrpersonaaseguradapersonaid"),
    @NamedQuery(name = "Lrpersonaasegurada.findByLrpersonaaseguradausamoto", query = "SELECT l FROM Lrpersonaasegurada l WHERE l.lrpersonaaseguradausamoto = :lrpersonaaseguradausamoto")})
public class Lrpersonaasegurada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "LRPERSONAASEGURADAID_SEQ_GENERATOR", sequenceName = "LRPERSONAASEGURADAID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LRPERSONAASEGURADAID_SEQ_GENERATOR")
    @Column(name = "LRPERSONAASEGURADAID", nullable = false)
    private Long lrpersonaaseguradaid;
    @Basic(optional = false)
    @Column(name = "LRPERSONAASEGURADANRO", nullable = false)
    private short lrpersonaaseguradanro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRPERSONAASEGURADASUMAASEG", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersonaaseguradasumaaseg;
    @Column(name = "LRPERSONAASEGURADAUAL", length = 30)
    private String lrpersonaaseguradaual;
    @Column(name = "LRPERSONAASEGURADAFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrpersonaaseguradafal;
    @Column(name = "LRPERSONAASEGURADAUMD", length = 30)
    private String lrpersonaaseguradaumd;
    @Column(name = "LRPERSONAASEGURADAFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrpersonaaseguradafmd;
    @Basic(optional = false)
    @Column(name = "LRPERSONAASEGURADAPERSONAID", nullable = false)
    private long lrpersonaaseguradapersonaid;
    @Basic(optional = false)
    @Column(name = "LRPERSONAASEGURADAUSAMOTO", nullable = false)
    private Character lrpersonaaseguradausamoto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrpersonaaseguradaid")
    private List<Lrpersasegcobertura> lrpersasegcoberturaList;
    @JoinColumn(name = "LRAGRUPACARGOID", referencedColumnName = "LRAGRUPACARGOID", nullable = false)
    @ManyToOne(optional = false)
    private Lragrupacargo lragrupacargoid;
    @JoinColumn(name = "LRTURNOID", referencedColumnName = "LRTURNOID", nullable = false)
    @ManyToOne(optional = false)
    private Lrturno lrturnoid;
    @JoinColumn(name = "LRUBICACIONID", referencedColumnName = "LRUBICACIONID", nullable = false)
    @ManyToOne(optional = false)
    private Lrubicacion lrubicacionid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrpersonaaseguradaid")
    private List<Lrbeneficiario> lrbeneficiarioList;

    public Lrpersonaasegurada() {
    }

    public Lrpersonaasegurada(Long lrpersonaaseguradaid) {
        this.lrpersonaaseguradaid = lrpersonaaseguradaid;
    }

    public Lrpersonaasegurada(Long lrpersonaaseguradaid, short lrpersonaaseguradanro, BigDecimal lrpersonaaseguradasumaaseg, long lrpersonaaseguradapersonaid, Character lrpersonaaseguradausamoto) {
        this.lrpersonaaseguradaid = lrpersonaaseguradaid;
        this.lrpersonaaseguradanro = lrpersonaaseguradanro;
        this.lrpersonaaseguradasumaaseg = lrpersonaaseguradasumaaseg;
        this.lrpersonaaseguradapersonaid = lrpersonaaseguradapersonaid;
        this.lrpersonaaseguradausamoto = lrpersonaaseguradausamoto;
    }

    public Long getLrpersonaaseguradaid() {
        return lrpersonaaseguradaid;
    }

    public void setLrpersonaaseguradaid(Long lrpersonaaseguradaid) {
        this.lrpersonaaseguradaid = lrpersonaaseguradaid;
    }

    public short getLrpersonaaseguradanro() {
        return lrpersonaaseguradanro;
    }

    public void setLrpersonaaseguradanro(short lrpersonaaseguradanro) {
        this.lrpersonaaseguradanro = lrpersonaaseguradanro;
    }

    public BigDecimal getLrpersonaaseguradasumaaseg() {
        return lrpersonaaseguradasumaaseg;
    }

    public void setLrpersonaaseguradasumaaseg(BigDecimal lrpersonaaseguradasumaaseg) {
        this.lrpersonaaseguradasumaaseg = lrpersonaaseguradasumaaseg;
    }

    public String getLrpersonaaseguradaual() {
        return lrpersonaaseguradaual;
    }

    public void setLrpersonaaseguradaual(String lrpersonaaseguradaual) {
        this.lrpersonaaseguradaual = lrpersonaaseguradaual;
    }

    public Date getLrpersonaaseguradafal() {
        return lrpersonaaseguradafal;
    }

    public void setLrpersonaaseguradafal(Date lrpersonaaseguradafal) {
        this.lrpersonaaseguradafal = lrpersonaaseguradafal;
    }

    public String getLrpersonaaseguradaumd() {
        return lrpersonaaseguradaumd;
    }

    public void setLrpersonaaseguradaumd(String lrpersonaaseguradaumd) {
        this.lrpersonaaseguradaumd = lrpersonaaseguradaumd;
    }

    public Date getLrpersonaaseguradafmd() {
        return lrpersonaaseguradafmd;
    }

    public void setLrpersonaaseguradafmd(Date lrpersonaaseguradafmd) {
        this.lrpersonaaseguradafmd = lrpersonaaseguradafmd;
    }

    public long getLrpersonaaseguradapersonaid() {
        return lrpersonaaseguradapersonaid;
    }

    public void setLrpersonaaseguradapersonaid(long lrpersonaaseguradapersonaid) {
        this.lrpersonaaseguradapersonaid = lrpersonaaseguradapersonaid;
    }

    public Character getLrpersonaaseguradausamoto() {
        return lrpersonaaseguradausamoto;
    }

    public void setLrpersonaaseguradausamoto(Character lrpersonaaseguradausamoto) {
        this.lrpersonaaseguradausamoto = lrpersonaaseguradausamoto;
    }

    public List<Lrpersasegcobertura> getLrpersasegcoberturaList() {
        return lrpersasegcoberturaList;
    }

    public void setLrpersasegcoberturaList(List<Lrpersasegcobertura> lrpersasegcoberturaList) {
        this.lrpersasegcoberturaList = lrpersasegcoberturaList;
    }

    public Lragrupacargo getLragrupacargoid() {
        return lragrupacargoid;
    }

    public void setLragrupacargoid(Lragrupacargo lragrupacargoid) {
        this.lragrupacargoid = lragrupacargoid;
    }

    public Lrturno getLrturnoid() {
        return lrturnoid;
    }

    public void setLrturnoid(Lrturno lrturnoid) {
        this.lrturnoid = lrturnoid;
    }

    public Lrubicacion getLrubicacionid() {
        return lrubicacionid;
    }

    public void setLrubicacionid(Lrubicacion lrubicacionid) {
        this.lrubicacionid = lrubicacionid;
    }

    public List<Lrbeneficiario> getLrbeneficiarioList() {
        return lrbeneficiarioList;
    }

    public void setLrbeneficiarioList(List<Lrbeneficiario> lrbeneficiarioList) {
        this.lrbeneficiarioList = lrbeneficiarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrpersonaaseguradaid != null ? lrpersonaaseguradaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrpersonaasegurada)) {
            return false;
        }
        Lrpersonaasegurada other = (Lrpersonaasegurada) object;
        if ((this.lrpersonaaseguradaid == null && other.lrpersonaaseguradaid != null) || (this.lrpersonaaseguradaid != null && !this.lrpersonaaseguradaid.equals(other.lrpersonaaseguradaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrpersonaasegurada[ lrpersonaaseguradaid=" + lrpersonaaseguradaid + " ]";
    }

}
