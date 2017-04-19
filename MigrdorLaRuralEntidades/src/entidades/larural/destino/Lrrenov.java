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
@Table(name = "LRRENOV")
@NamedQueries({
    @NamedQuery(name = "Lrrenov.findAll", query = "SELECT l FROM Lrrenov l"),
    @NamedQuery(name = "Lrrenov.findByLrrenovid", query = "SELECT l FROM Lrrenov l WHERE l.lrrenovid = :lrrenovid"),
    @NamedQuery(name = "Lrrenov.findByLrrenovtiposeg", query = "SELECT l FROM Lrrenov l WHERE l.lrrenovtiposeg = :lrrenovtiposeg"),
    @NamedQuery(name = "Lrrenov.findByLrrenovtipoope", query = "SELECT l FROM Lrrenov l WHERE l.lrrenovtipoope = :lrrenovtipoope"),
    @NamedQuery(name = "Lrrenov.findByLrrenovejercicio", query = "SELECT l FROM Lrrenov l WHERE l.lrrenovejercicio = :lrrenovejercicio"),
    @NamedQuery(name = "Lrrenov.findByLrrenovsecc", query = "SELECT l FROM Lrrenov l WHERE l.lrrenovsecc = :lrrenovsecc"),
    @NamedQuery(name = "Lrrenov.findByLrrenovpoliza", query = "SELECT l FROM Lrrenov l WHERE l.lrrenovpoliza = :lrrenovpoliza"),
    @NamedQuery(name = "Lrrenov.findByLrrenovanexo", query = "SELECT l FROM Lrrenov l WHERE l.lrrenovanexo = :lrrenovanexo"),
    @NamedQuery(name = "Lrrenov.findByLrrenovsumaaseg", query = "SELECT l FROM Lrrenov l WHERE l.lrrenovsumaaseg = :lrrenovsumaaseg"),
    @NamedQuery(name = "Lrrenov.findByLrrenovprimatec", query = "SELECT l FROM Lrrenov l WHERE l.lrrenovprimatec = :lrrenovprimatec"),
    @NamedQuery(name = "Lrrenov.findByLrrenovgastosadm", query = "SELECT l FROM Lrrenov l WHERE l.lrrenovgastosadm = :lrrenovgastosadm"),
    @NamedQuery(name = "Lrrenov.findByLrrenovrpf", query = "SELECT l FROM Lrrenov l WHERE l.lrrenovrpf = :lrrenovrpf"),
    @NamedQuery(name = "Lrrenov.findByLrrenovotros", query = "SELECT l FROM Lrrenov l WHERE l.lrrenovotros = :lrrenovotros"),
    @NamedQuery(name = "Lrrenov.findByLrrenovprimacom", query = "SELECT l FROM Lrrenov l WHERE l.lrrenovprimacom = :lrrenovprimacom"),
    @NamedQuery(name = "Lrrenov.findByLrrenoviva", query = "SELECT l FROM Lrrenov l WHERE l.lrrenoviva = :lrrenoviva"),
    @NamedQuery(name = "Lrrenov.findByLrrenovpremio", query = "SELECT l FROM Lrrenov l WHERE l.lrrenovpremio = :lrrenovpremio"),
    @NamedQuery(name = "Lrrenov.findByLrrenovporccomagte", query = "SELECT l FROM Lrrenov l WHERE l.lrrenovporccomagte = :lrrenovporccomagte"),
    @NamedQuery(name = "Lrrenov.findByLrrenovimpcomagte", query = "SELECT l FROM Lrrenov l WHERE l.lrrenovimpcomagte = :lrrenovimpcomagte"),
    @NamedQuery(name = "Lrrenov.findByLrrenoventregaini", query = "SELECT l FROM Lrrenov l WHERE l.lrrenoventregaini = :lrrenoventregaini"),
    @NamedQuery(name = "Lrrenov.findByLrrenovcantcuotas", query = "SELECT l FROM Lrrenov l WHERE l.lrrenovcantcuotas = :lrrenovcantcuotas"),
    @NamedQuery(name = "Lrrenov.findByLrrenovimpcuotas", query = "SELECT l FROM Lrrenov l WHERE l.lrrenovimpcuotas = :lrrenovimpcuotas"),
    @NamedQuery(name = "Lrrenov.findByLrrenovual", query = "SELECT l FROM Lrrenov l WHERE l.lrrenovual = :lrrenovual"),
    @NamedQuery(name = "Lrrenov.findByLrrenovfal", query = "SELECT l FROM Lrrenov l WHERE l.lrrenovfal = :lrrenovfal")})
public class Lrrenov implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "LRRENOV_SEQ_GENERATOR", sequenceName = "LRRENOVID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LRRENOV_SEQ_GENERATOR")
    @Basic(optional = false)
    @Column(name = "LRRENOVID", nullable = false)
    private Long lrrenovid;
    @Basic(optional = false)
    @Column(name = "LRRENOVTIPOSEG", nullable = false)
    private short lrrenovtiposeg;
    @Basic(optional = false)
    @Column(name = "LRRENOVTIPOOPE", nullable = false)
    private short lrrenovtipoope;
    @Basic(optional = false)
    @Column(name = "LRRENOVEJERCICIO", nullable = false)
    private short lrrenovejercicio;
    @Basic(optional = false)
    @Column(name = "LRRENOVSECC", nullable = false)
    private short lrrenovsecc;
    @Basic(optional = false)
    @Column(name = "LRRENOVPOLIZA", nullable = false)
    private int lrrenovpoliza;
    @Basic(optional = false)
    @Column(name = "LRRENOVANEXO", nullable = false)
    private short lrrenovanexo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRRENOVSUMAASEG", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrrenovsumaaseg;
    @Basic(optional = false)
    @Column(name = "LRRENOVPRIMATEC", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrrenovprimatec;
    @Basic(optional = false)
    @Column(name = "LRRENOVGASTOSADM", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrrenovgastosadm;
    @Basic(optional = false)
    @Column(name = "LRRENOVRPF", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrrenovrpf;
    @Basic(optional = false)
    @Column(name = "LRRENOVOTROS", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrrenovotros;
    @Basic(optional = false)
    @Column(name = "LRRENOVPRIMACOM", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrrenovprimacom;
    @Basic(optional = false)
    @Column(name = "LRRENOVIVA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrrenoviva;
    @Basic(optional = false)
    @Column(name = "LRRENOVPREMIO", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrrenovpremio;
    @Basic(optional = false)
    @Column(name = "LRRENOVPORCCOMAGTE", nullable = false, precision = 4, scale = 2)
    private BigDecimal lrrenovporccomagte;
    @Basic(optional = false)
    @Column(name = "LRRENOVIMPCOMAGTE", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrrenovimpcomagte;
    @Basic(optional = false)
    @Column(name = "LRRENOVENTREGAINI", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrrenoventregaini;
    @Basic(optional = false)
    @Column(name = "LRRENOVCANTCUOTAS", nullable = false)
    private short lrrenovcantcuotas;
    @Basic(optional = false)
    @Column(name = "LRRENOVIMPCUOTAS", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrrenovimpcuotas;
    @Basic(optional = false)
    @Column(name = "LRRENOVUAL", nullable = false, length = 30)
    private String lrrenovual;
    @Basic(optional = false)
    @Column(name = "LRRENOVFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrrenovfal;

    public Lrrenov() {
    }

    public Lrrenov(Long lrrenovid) {
        this.lrrenovid = lrrenovid;
    }

    public Lrrenov(Long lrrenovid, short lrrenovtiposeg, short lrrenovtipoope, short lrrenovejercicio, short lrrenovsecc, int lrrenovpoliza, short lrrenovanexo, BigDecimal lrrenovsumaaseg, BigDecimal lrrenovprimatec, BigDecimal lrrenovgastosadm, BigDecimal lrrenovrpf, BigDecimal lrrenovotros, BigDecimal lrrenovprimacom, BigDecimal lrrenoviva, BigDecimal lrrenovpremio, BigDecimal lrrenovporccomagte, BigDecimal lrrenovimpcomagte, BigDecimal lrrenoventregaini, short lrrenovcantcuotas, BigDecimal lrrenovimpcuotas, String lrrenovual, Date lrrenovfal) {
        this.lrrenovid = lrrenovid;
        this.lrrenovtiposeg = lrrenovtiposeg;
        this.lrrenovtipoope = lrrenovtipoope;
        this.lrrenovejercicio = lrrenovejercicio;
        this.lrrenovsecc = lrrenovsecc;
        this.lrrenovpoliza = lrrenovpoliza;
        this.lrrenovanexo = lrrenovanexo;
        this.lrrenovsumaaseg = lrrenovsumaaseg;
        this.lrrenovprimatec = lrrenovprimatec;
        this.lrrenovgastosadm = lrrenovgastosadm;
        this.lrrenovrpf = lrrenovrpf;
        this.lrrenovotros = lrrenovotros;
        this.lrrenovprimacom = lrrenovprimacom;
        this.lrrenoviva = lrrenoviva;
        this.lrrenovpremio = lrrenovpremio;
        this.lrrenovporccomagte = lrrenovporccomagte;
        this.lrrenovimpcomagte = lrrenovimpcomagte;
        this.lrrenoventregaini = lrrenoventregaini;
        this.lrrenovcantcuotas = lrrenovcantcuotas;
        this.lrrenovimpcuotas = lrrenovimpcuotas;
        this.lrrenovual = lrrenovual;
        this.lrrenovfal = lrrenovfal;
    }

    public Long getLrrenovid() {
        return lrrenovid;
    }

    public void setLrrenovid(Long lrrenovid) {
        this.lrrenovid = lrrenovid;
    }

    public short getLrrenovtiposeg() {
        return lrrenovtiposeg;
    }

    public void setLrrenovtiposeg(short lrrenovtiposeg) {
        this.lrrenovtiposeg = lrrenovtiposeg;
    }

    public short getLrrenovtipoope() {
        return lrrenovtipoope;
    }

    public void setLrrenovtipoope(short lrrenovtipoope) {
        this.lrrenovtipoope = lrrenovtipoope;
    }

    public short getLrrenovejercicio() {
        return lrrenovejercicio;
    }

    public void setLrrenovejercicio(short lrrenovejercicio) {
        this.lrrenovejercicio = lrrenovejercicio;
    }

    public short getLrrenovsecc() {
        return lrrenovsecc;
    }

    public void setLrrenovsecc(short lrrenovsecc) {
        this.lrrenovsecc = lrrenovsecc;
    }

    public int getLrrenovpoliza() {
        return lrrenovpoliza;
    }

    public void setLrrenovpoliza(int lrrenovpoliza) {
        this.lrrenovpoliza = lrrenovpoliza;
    }

    public short getLrrenovanexo() {
        return lrrenovanexo;
    }

    public void setLrrenovanexo(short lrrenovanexo) {
        this.lrrenovanexo = lrrenovanexo;
    }

    public BigDecimal getLrrenovsumaaseg() {
        return lrrenovsumaaseg;
    }

    public void setLrrenovsumaaseg(BigDecimal lrrenovsumaaseg) {
        this.lrrenovsumaaseg = lrrenovsumaaseg;
    }

    public BigDecimal getLrrenovprimatec() {
        return lrrenovprimatec;
    }

    public void setLrrenovprimatec(BigDecimal lrrenovprimatec) {
        this.lrrenovprimatec = lrrenovprimatec;
    }

    public BigDecimal getLrrenovgastosadm() {
        return lrrenovgastosadm;
    }

    public void setLrrenovgastosadm(BigDecimal lrrenovgastosadm) {
        this.lrrenovgastosadm = lrrenovgastosadm;
    }

    public BigDecimal getLrrenovrpf() {
        return lrrenovrpf;
    }

    public void setLrrenovrpf(BigDecimal lrrenovrpf) {
        this.lrrenovrpf = lrrenovrpf;
    }

    public BigDecimal getLrrenovotros() {
        return lrrenovotros;
    }

    public void setLrrenovotros(BigDecimal lrrenovotros) {
        this.lrrenovotros = lrrenovotros;
    }

    public BigDecimal getLrrenovprimacom() {
        return lrrenovprimacom;
    }

    public void setLrrenovprimacom(BigDecimal lrrenovprimacom) {
        this.lrrenovprimacom = lrrenovprimacom;
    }

    public BigDecimal getLrrenoviva() {
        return lrrenoviva;
    }

    public void setLrrenoviva(BigDecimal lrrenoviva) {
        this.lrrenoviva = lrrenoviva;
    }

    public BigDecimal getLrrenovpremio() {
        return lrrenovpremio;
    }

    public void setLrrenovpremio(BigDecimal lrrenovpremio) {
        this.lrrenovpremio = lrrenovpremio;
    }

    public BigDecimal getLrrenovporccomagte() {
        return lrrenovporccomagte;
    }

    public void setLrrenovporccomagte(BigDecimal lrrenovporccomagte) {
        this.lrrenovporccomagte = lrrenovporccomagte;
    }

    public BigDecimal getLrrenovimpcomagte() {
        return lrrenovimpcomagte;
    }

    public void setLrrenovimpcomagte(BigDecimal lrrenovimpcomagte) {
        this.lrrenovimpcomagte = lrrenovimpcomagte;
    }

    public BigDecimal getLrrenoventregaini() {
        return lrrenoventregaini;
    }

    public void setLrrenoventregaini(BigDecimal lrrenoventregaini) {
        this.lrrenoventregaini = lrrenoventregaini;
    }

    public short getLrrenovcantcuotas() {
        return lrrenovcantcuotas;
    }

    public void setLrrenovcantcuotas(short lrrenovcantcuotas) {
        this.lrrenovcantcuotas = lrrenovcantcuotas;
    }

    public BigDecimal getLrrenovimpcuotas() {
        return lrrenovimpcuotas;
    }

    public void setLrrenovimpcuotas(BigDecimal lrrenovimpcuotas) {
        this.lrrenovimpcuotas = lrrenovimpcuotas;
    }

    public String getLrrenovual() {
        return lrrenovual;
    }

    public void setLrrenovual(String lrrenovual) {
        this.lrrenovual = lrrenovual;
    }

    public Date getLrrenovfal() {
        return lrrenovfal;
    }

    public void setLrrenovfal(Date lrrenovfal) {
        this.lrrenovfal = lrrenovfal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrrenovid != null ? lrrenovid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrrenov)) {
            return false;
        }
        Lrrenov other = (Lrrenov) object;
        if ((this.lrrenovid == null && other.lrrenovid != null) || (this.lrrenovid != null && !this.lrrenovid.equals(other.lrrenovid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrrenov[ lrrenovid=" + lrrenovid + " ]";
    }

}
