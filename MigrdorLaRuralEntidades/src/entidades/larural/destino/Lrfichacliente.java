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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRFICHACLIENTE", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"LRPERSONAID"})})
@NamedQueries({
    @NamedQuery(name = "Lrfichacliente.findAll", query = "SELECT l FROM Lrfichacliente l"),
    @NamedQuery(name = "Lrfichacliente.findByLrfichaclienteid", query = "SELECT l FROM Lrfichacliente l WHERE l.lrfichaclienteid = :lrfichaclienteid"),
    @NamedQuery(name = "Lrfichacliente.findByLrfichaclientedesde", query = "SELECT l FROM Lrfichacliente l WHERE l.lrfichaclientedesde = :lrfichaclientedesde"),
    @NamedQuery(name = "Lrfichacliente.findByLrfichaclientehasta", query = "SELECT l FROM Lrfichacliente l WHERE l.lrfichaclientehasta = :lrfichaclientehasta"),
    @NamedQuery(name = "Lrfichacliente.findByLrfichaclientelinea", query = "SELECT l FROM Lrfichacliente l WHERE l.lrfichaclientelinea = :lrfichaclientelinea"),
    @NamedQuery(name = "Lrfichacliente.findByLrfichaclientesaldo", query = "SELECT l FROM Lrfichacliente l WHERE l.lrfichaclientesaldo = :lrfichaclientesaldo"),
    @NamedQuery(name = "Lrfichacliente.findByLrfichaclientepolizasvigentes", query = "SELECT l FROM Lrfichacliente l WHERE l.lrfichaclientepolizasvigentes = :lrfichaclientepolizasvigentes"),
    @NamedQuery(name = "Lrfichacliente.findByLrfichaclienteanho1", query = "SELECT l FROM Lrfichacliente l WHERE l.lrfichaclienteanho1 = :lrfichaclienteanho1"),
    @NamedQuery(name = "Lrfichacliente.findByLrfichaclienteimportecuotavenc", query = "SELECT l FROM Lrfichacliente l WHERE l.lrfichaclienteimportecuotavenc = :lrfichaclienteimportecuotavenc"),
    @NamedQuery(name = "Lrfichacliente.findByLrfichaclientedocuok", query = "SELECT l FROM Lrfichacliente l WHERE l.lrfichaclientedocuok = :lrfichaclientedocuok"),
    @NamedQuery(name = "Lrfichacliente.findByLrfichaclientefal", query = "SELECT l FROM Lrfichacliente l WHERE l.lrfichaclientefal = :lrfichaclientefal"),
    @NamedQuery(name = "Lrfichacliente.findByLrfichaclienteual", query = "SELECT l FROM Lrfichacliente l WHERE l.lrfichaclienteual = :lrfichaclienteual"),
    @NamedQuery(name = "Lrfichacliente.findByLrfichaclientefmd", query = "SELECT l FROM Lrfichacliente l WHERE l.lrfichaclientefmd = :lrfichaclientefmd"),
    @NamedQuery(name = "Lrfichacliente.findByLrfichaclienteumd", query = "SELECT l FROM Lrfichacliente l WHERE l.lrfichaclienteumd = :lrfichaclienteumd"),
    @NamedQuery(name = "Lrfichacliente.findByLrfichaclienteanho2", query = "SELECT l FROM Lrfichacliente l WHERE l.lrfichaclienteanho2 = :lrfichaclienteanho2")})
public class Lrfichacliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTEID", nullable = false)
    private Long lrfichaclienteid;
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTEDESDE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrfichaclientedesde;
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTEHASTA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrfichaclientehasta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTELINEA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrfichaclientelinea;
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTESALDO", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrfichaclientesaldo;
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTEPOLIZASVIGENTES", nullable = false)
    private long lrfichaclientepolizasvigentes;
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTEANHO1", nullable = false)
    private long lrfichaclienteanho1;
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTEIMPORTECUOTAVENC", nullable = false)
    private long lrfichaclienteimportecuotavenc;
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTEDOCUOK", nullable = false, length = 1)
    private String lrfichaclientedocuok;
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTEFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrfichaclientefal;
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTEUAL", nullable = false, length = 40)
    private String lrfichaclienteual;
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTEFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrfichaclientefmd;
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTEUMD", nullable = false, length = 40)
    private String lrfichaclienteumd;
    @Basic(optional = false)
    @Column(name = "LRFICHACLIENTEANHO2", nullable = false)
    private long lrfichaclienteanho2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrfichaclienteid")
    private List<Lrfichaclientecaucionpol> lrfichaclientecaucionpolList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrfichaclienteid")
    private List<Lrfichaclienteotraspol> lrfichaclienteotraspolList;
    @JoinColumn(name = "LRPERSONAID", referencedColumnName = "LRPERSONAID", nullable = false)
    @OneToOne(optional = false)
    private Lrpersona lrpersonaid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrfichaclienteid")
    private List<Lrfichaclientesincaucion> lrfichaclientesincaucionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrfichacliente")
    private List<Lrfichaclientedocu> lrfichaclientedocuList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrfichaclienteid")
    private List<Lrfichaclienteprimcaucion> lrfichaclienteprimcaucionList;

    public Lrfichacliente() {
    }

    public Lrfichacliente(Long lrfichaclienteid) {
        this.lrfichaclienteid = lrfichaclienteid;
    }

    public Lrfichacliente(Long lrfichaclienteid, Date lrfichaclientedesde, Date lrfichaclientehasta, BigDecimal lrfichaclientelinea, BigDecimal lrfichaclientesaldo, long lrfichaclientepolizasvigentes, long lrfichaclienteanho1, long lrfichaclienteimportecuotavenc, String lrfichaclientedocuok, Date lrfichaclientefal, String lrfichaclienteual, Date lrfichaclientefmd, String lrfichaclienteumd, long lrfichaclienteanho2) {
        this.lrfichaclienteid = lrfichaclienteid;
        this.lrfichaclientedesde = lrfichaclientedesde;
        this.lrfichaclientehasta = lrfichaclientehasta;
        this.lrfichaclientelinea = lrfichaclientelinea;
        this.lrfichaclientesaldo = lrfichaclientesaldo;
        this.lrfichaclientepolizasvigentes = lrfichaclientepolizasvigentes;
        this.lrfichaclienteanho1 = lrfichaclienteanho1;
        this.lrfichaclienteimportecuotavenc = lrfichaclienteimportecuotavenc;
        this.lrfichaclientedocuok = lrfichaclientedocuok;
        this.lrfichaclientefal = lrfichaclientefal;
        this.lrfichaclienteual = lrfichaclienteual;
        this.lrfichaclientefmd = lrfichaclientefmd;
        this.lrfichaclienteumd = lrfichaclienteumd;
        this.lrfichaclienteanho2 = lrfichaclienteanho2;
    }

    public Long getLrfichaclienteid() {
        return lrfichaclienteid;
    }

    public void setLrfichaclienteid(Long lrfichaclienteid) {
        this.lrfichaclienteid = lrfichaclienteid;
    }

    public Date getLrfichaclientedesde() {
        return lrfichaclientedesde;
    }

    public void setLrfichaclientedesde(Date lrfichaclientedesde) {
        this.lrfichaclientedesde = lrfichaclientedesde;
    }

    public Date getLrfichaclientehasta() {
        return lrfichaclientehasta;
    }

    public void setLrfichaclientehasta(Date lrfichaclientehasta) {
        this.lrfichaclientehasta = lrfichaclientehasta;
    }

    public BigDecimal getLrfichaclientelinea() {
        return lrfichaclientelinea;
    }

    public void setLrfichaclientelinea(BigDecimal lrfichaclientelinea) {
        this.lrfichaclientelinea = lrfichaclientelinea;
    }

    public BigDecimal getLrfichaclientesaldo() {
        return lrfichaclientesaldo;
    }

    public void setLrfichaclientesaldo(BigDecimal lrfichaclientesaldo) {
        this.lrfichaclientesaldo = lrfichaclientesaldo;
    }

    public long getLrfichaclientepolizasvigentes() {
        return lrfichaclientepolizasvigentes;
    }

    public void setLrfichaclientepolizasvigentes(long lrfichaclientepolizasvigentes) {
        this.lrfichaclientepolizasvigentes = lrfichaclientepolizasvigentes;
    }

    public long getLrfichaclienteanho1() {
        return lrfichaclienteanho1;
    }

    public void setLrfichaclienteanho1(long lrfichaclienteanho1) {
        this.lrfichaclienteanho1 = lrfichaclienteanho1;
    }

    public long getLrfichaclienteimportecuotavenc() {
        return lrfichaclienteimportecuotavenc;
    }

    public void setLrfichaclienteimportecuotavenc(long lrfichaclienteimportecuotavenc) {
        this.lrfichaclienteimportecuotavenc = lrfichaclienteimportecuotavenc;
    }

    public String getLrfichaclientedocuok() {
        return lrfichaclientedocuok;
    }

    public void setLrfichaclientedocuok(String lrfichaclientedocuok) {
        this.lrfichaclientedocuok = lrfichaclientedocuok;
    }

    public Date getLrfichaclientefal() {
        return lrfichaclientefal;
    }

    public void setLrfichaclientefal(Date lrfichaclientefal) {
        this.lrfichaclientefal = lrfichaclientefal;
    }

    public String getLrfichaclienteual() {
        return lrfichaclienteual;
    }

    public void setLrfichaclienteual(String lrfichaclienteual) {
        this.lrfichaclienteual = lrfichaclienteual;
    }

    public Date getLrfichaclientefmd() {
        return lrfichaclientefmd;
    }

    public void setLrfichaclientefmd(Date lrfichaclientefmd) {
        this.lrfichaclientefmd = lrfichaclientefmd;
    }

    public String getLrfichaclienteumd() {
        return lrfichaclienteumd;
    }

    public void setLrfichaclienteumd(String lrfichaclienteumd) {
        this.lrfichaclienteumd = lrfichaclienteumd;
    }

    public long getLrfichaclienteanho2() {
        return lrfichaclienteanho2;
    }

    public void setLrfichaclienteanho2(long lrfichaclienteanho2) {
        this.lrfichaclienteanho2 = lrfichaclienteanho2;
    }

    public List<Lrfichaclientecaucionpol> getLrfichaclientecaucionpolList() {
        return lrfichaclientecaucionpolList;
    }

    public void setLrfichaclientecaucionpolList(List<Lrfichaclientecaucionpol> lrfichaclientecaucionpolList) {
        this.lrfichaclientecaucionpolList = lrfichaclientecaucionpolList;
    }

    public List<Lrfichaclienteotraspol> getLrfichaclienteotraspolList() {
        return lrfichaclienteotraspolList;
    }

    public void setLrfichaclienteotraspolList(List<Lrfichaclienteotraspol> lrfichaclienteotraspolList) {
        this.lrfichaclienteotraspolList = lrfichaclienteotraspolList;
    }

    public Lrpersona getLrpersonaid() {
        return lrpersonaid;
    }

    public void setLrpersonaid(Lrpersona lrpersonaid) {
        this.lrpersonaid = lrpersonaid;
    }

    public List<Lrfichaclientesincaucion> getLrfichaclientesincaucionList() {
        return lrfichaclientesincaucionList;
    }

    public void setLrfichaclientesincaucionList(List<Lrfichaclientesincaucion> lrfichaclientesincaucionList) {
        this.lrfichaclientesincaucionList = lrfichaclientesincaucionList;
    }

    public List<Lrfichaclientedocu> getLrfichaclientedocuList() {
        return lrfichaclientedocuList;
    }

    public void setLrfichaclientedocuList(List<Lrfichaclientedocu> lrfichaclientedocuList) {
        this.lrfichaclientedocuList = lrfichaclientedocuList;
    }

    public List<Lrfichaclienteprimcaucion> getLrfichaclienteprimcaucionList() {
        return lrfichaclienteprimcaucionList;
    }

    public void setLrfichaclienteprimcaucionList(List<Lrfichaclienteprimcaucion> lrfichaclienteprimcaucionList) {
        this.lrfichaclienteprimcaucionList = lrfichaclienteprimcaucionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrfichaclienteid != null ? lrfichaclienteid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrfichacliente)) {
            return false;
        }
        Lrfichacliente other = (Lrfichacliente) object;
        if ((this.lrfichaclienteid == null && other.lrfichaclienteid != null) || (this.lrfichaclienteid != null && !this.lrfichaclienteid.equals(other.lrfichaclienteid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrfichacliente[ lrfichaclienteid=" + lrfichaclienteid + " ]";
    }

}
