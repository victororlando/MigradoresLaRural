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
@Table(name = "LRBENEFICIARIO")
@NamedQueries({
    @NamedQuery(name = "Lrbeneficiario.findAll", query = "SELECT l FROM Lrbeneficiario l"),
    @NamedQuery(name = "Lrbeneficiario.findByLrbeneficiarioid", query = "SELECT l FROM Lrbeneficiario l WHERE l.lrbeneficiarioid = :lrbeneficiarioid"),
    @NamedQuery(name = "Lrbeneficiario.findByLrbeneficiarioimporte", query = "SELECT l FROM Lrbeneficiario l WHERE l.lrbeneficiarioimporte = :lrbeneficiarioimporte"),
    @NamedQuery(name = "Lrbeneficiario.findByLrbeneficiarioac", query = "SELECT l FROM Lrbeneficiario l WHERE l.lrbeneficiarioac = :lrbeneficiarioac"),
    @NamedQuery(name = "Lrbeneficiario.findByLrbeneficiarioual", query = "SELECT l FROM Lrbeneficiario l WHERE l.lrbeneficiarioual = :lrbeneficiarioual"),
    @NamedQuery(name = "Lrbeneficiario.findByLrbeneficiariofal", query = "SELECT l FROM Lrbeneficiario l WHERE l.lrbeneficiariofal = :lrbeneficiariofal"),
    @NamedQuery(name = "Lrbeneficiario.findByLrbeneficiarioumd", query = "SELECT l FROM Lrbeneficiario l WHERE l.lrbeneficiarioumd = :lrbeneficiarioumd"),
    @NamedQuery(name = "Lrbeneficiario.findByLrbeneficiariofmd", query = "SELECT l FROM Lrbeneficiario l WHERE l.lrbeneficiariofmd = :lrbeneficiariofmd"),
    @NamedQuery(name = "Lrbeneficiario.findByLrbeneficiariopersonaid", query = "SELECT l FROM Lrbeneficiario l WHERE l.lrbeneficiariopersonaid = :lrbeneficiariopersonaid"),
    @NamedQuery(name = "Lrbeneficiario.findByLrbeneficiarioporc", query = "SELECT l FROM Lrbeneficiario l WHERE l.lrbeneficiarioporc = :lrbeneficiarioporc")})
public class Lrbeneficiario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "LRBENEFICIARIOID_SEQ_GENERATOR", sequenceName = "LRBENEFICIARIOID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LRBENEFICIARIOID_SEQ_GENERATOR")
    @Column(name = "LRBENEFICIARIOID", nullable = false)
    private Long lrbeneficiarioid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRBENEFICIARIOIMPORTE", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrbeneficiarioimporte;
    @Basic(optional = false)
    @Column(name = "LRBENEFICIARIOAC", nullable = false)
    private Character lrbeneficiarioac;
    @Column(name = "LRBENEFICIARIOUAL", length = 30)
    private String lrbeneficiarioual;
    @Column(name = "LRBENEFICIARIOFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrbeneficiariofal;
    @Column(name = "LRBENEFICIARIOUMD", length = 30)
    private String lrbeneficiarioumd;
    @Column(name = "LRBENEFICIARIOFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrbeneficiariofmd;
    @Basic(optional = false)
    @Column(name = "LRBENEFICIARIOPERSONAID", nullable = false)
    private long lrbeneficiariopersonaid;
    @Basic(optional = false)
    @Column(name = "LRBENEFICIARIOPORC", nullable = false, precision = 7, scale = 3)
    private BigDecimal lrbeneficiarioporc;
    @JoinColumn(name = "LRPERSONAASEGURADAID", referencedColumnName = "LRPERSONAASEGURADAID", nullable = false)
    @ManyToOne(optional = false)
    private Lrpersonaasegurada lrpersonaaseguradaid;
    @JoinColumn(name = "LRTIPOSVINCID", referencedColumnName = "LRTIPOSVINCID")
    @ManyToOne
    private Lrtiposvinc lrtiposvincid;

    public Lrbeneficiario() {
    }

    public Lrbeneficiario(Long lrbeneficiarioid) {
        this.lrbeneficiarioid = lrbeneficiarioid;
    }

    public Lrbeneficiario(Long lrbeneficiarioid, BigDecimal lrbeneficiarioimporte, Character lrbeneficiarioac, long lrbeneficiariopersonaid, BigDecimal lrbeneficiarioporc) {
        this.lrbeneficiarioid = lrbeneficiarioid;
        this.lrbeneficiarioimporte = lrbeneficiarioimporte;
        this.lrbeneficiarioac = lrbeneficiarioac;
        this.lrbeneficiariopersonaid = lrbeneficiariopersonaid;
        this.lrbeneficiarioporc = lrbeneficiarioporc;
    }

    public Long getLrbeneficiarioid() {
        return lrbeneficiarioid;
    }

    public void setLrbeneficiarioid(Long lrbeneficiarioid) {
        this.lrbeneficiarioid = lrbeneficiarioid;
    }

    public BigDecimal getLrbeneficiarioimporte() {
        return lrbeneficiarioimporte;
    }

    public void setLrbeneficiarioimporte(BigDecimal lrbeneficiarioimporte) {
        this.lrbeneficiarioimporte = lrbeneficiarioimporte;
    }

    public Character getLrbeneficiarioac() {
        return lrbeneficiarioac;
    }

    public void setLrbeneficiarioac(Character lrbeneficiarioac) {
        this.lrbeneficiarioac = lrbeneficiarioac;
    }

    public String getLrbeneficiarioual() {
        return lrbeneficiarioual;
    }

    public void setLrbeneficiarioual(String lrbeneficiarioual) {
        this.lrbeneficiarioual = lrbeneficiarioual;
    }

    public Date getLrbeneficiariofal() {
        return lrbeneficiariofal;
    }

    public void setLrbeneficiariofal(Date lrbeneficiariofal) {
        this.lrbeneficiariofal = lrbeneficiariofal;
    }

    public String getLrbeneficiarioumd() {
        return lrbeneficiarioumd;
    }

    public void setLrbeneficiarioumd(String lrbeneficiarioumd) {
        this.lrbeneficiarioumd = lrbeneficiarioumd;
    }

    public Date getLrbeneficiariofmd() {
        return lrbeneficiariofmd;
    }

    public void setLrbeneficiariofmd(Date lrbeneficiariofmd) {
        this.lrbeneficiariofmd = lrbeneficiariofmd;
    }

    public long getLrbeneficiariopersonaid() {
        return lrbeneficiariopersonaid;
    }

    public void setLrbeneficiariopersonaid(long lrbeneficiariopersonaid) {
        this.lrbeneficiariopersonaid = lrbeneficiariopersonaid;
    }

    public BigDecimal getLrbeneficiarioporc() {
        return lrbeneficiarioporc;
    }

    public void setLrbeneficiarioporc(BigDecimal lrbeneficiarioporc) {
        this.lrbeneficiarioporc = lrbeneficiarioporc;
    }

    public Lrpersonaasegurada getLrpersonaaseguradaid() {
        return lrpersonaaseguradaid;
    }

    public void setLrpersonaaseguradaid(Lrpersonaasegurada lrpersonaaseguradaid) {
        this.lrpersonaaseguradaid = lrpersonaaseguradaid;
    }

    public Lrtiposvinc getLrtiposvincid() {
        return lrtiposvincid;
    }

    public void setLrtiposvincid(Lrtiposvinc lrtiposvincid) {
        this.lrtiposvincid = lrtiposvincid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrbeneficiarioid != null ? lrbeneficiarioid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrbeneficiario)) {
            return false;
        }
        Lrbeneficiario other = (Lrbeneficiario) object;
        if ((this.lrbeneficiarioid == null && other.lrbeneficiarioid != null) || (this.lrbeneficiarioid != null && !this.lrbeneficiarioid.equals(other.lrbeneficiarioid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrbeneficiario[ lrbeneficiarioid=" + lrbeneficiarioid + " ]";
    }

}
