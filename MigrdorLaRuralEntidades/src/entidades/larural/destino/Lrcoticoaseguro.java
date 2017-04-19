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
@Table(name = "LRCOTICOASEGURO")
@NamedQueries({
    @NamedQuery(name = "Lrcoticoaseguro.findAll", query = "SELECT l FROM Lrcoticoaseguro l"),
    @NamedQuery(name = "Lrcoticoaseguro.findByLrcoticoaseguroid", query = "SELECT l FROM Lrcoticoaseguro l WHERE l.lrcoticoaseguroid = :lrcoticoaseguroid"),
    @NamedQuery(name = "Lrcoticoaseguro.findByLrcoticoaseguroporcpart", query = "SELECT l FROM Lrcoticoaseguro l WHERE l.lrcoticoaseguroporcpart = :lrcoticoaseguroporcpart"),
    @NamedQuery(name = "Lrcoticoaseguro.findByLrcoticoasegurosumaseg", query = "SELECT l FROM Lrcoticoaseguro l WHERE l.lrcoticoasegurosumaseg = :lrcoticoasegurosumaseg"),
    @NamedQuery(name = "Lrcoticoaseguro.findByLrcoticoaseguroprimacom", query = "SELECT l FROM Lrcoticoaseguro l WHERE l.lrcoticoaseguroprimacom = :lrcoticoaseguroprimacom"),
    @NamedQuery(name = "Lrcoticoaseguro.findByLrcoticoaseguropremio", query = "SELECT l FROM Lrcoticoaseguro l WHERE l.lrcoticoaseguropremio = :lrcoticoaseguropremio"),
    @NamedQuery(name = "Lrcoticoaseguro.findByLrcoticoaseguropiloto", query = "SELECT l FROM Lrcoticoaseguro l WHERE l.lrcoticoaseguropiloto = :lrcoticoaseguropiloto"),
    @NamedQuery(name = "Lrcoticoaseguro.findByLrcoticoaseguroual", query = "SELECT l FROM Lrcoticoaseguro l WHERE l.lrcoticoaseguroual = :lrcoticoaseguroual"),
    @NamedQuery(name = "Lrcoticoaseguro.findByLrcoticoasegurofal", query = "SELECT l FROM Lrcoticoaseguro l WHERE l.lrcoticoasegurofal = :lrcoticoasegurofal"),
    @NamedQuery(name = "Lrcoticoaseguro.findByLrcoticoaseguroumd", query = "SELECT l FROM Lrcoticoaseguro l WHERE l.lrcoticoaseguroumd = :lrcoticoaseguroumd"),
    @NamedQuery(name = "Lrcoticoaseguro.findByLrcoticoasegurofmd", query = "SELECT l FROM Lrcoticoaseguro l WHERE l.lrcoticoasegurofmd = :lrcoticoasegurofmd"),
    @NamedQuery(name = "Lrcoticoaseguro.findByComreacoaid", query = "SELECT l FROM Lrcoticoaseguro l WHERE l.comreacoaid = :comreacoaid"),
    @NamedQuery(name = "Lrcoticoaseguro.findByLrcoticoaseguropoliza", query = "SELECT l FROM Lrcoticoaseguro l WHERE l.lrcoticoaseguropoliza = :lrcoticoaseguropoliza"),
    @NamedQuery(name = "Lrcoticoaseguro.findByLrcoticoaseguroprimatec", query = "SELECT l FROM Lrcoticoaseguro l WHERE l.lrcoticoaseguroprimatec = :lrcoticoaseguroprimatec"),
    @NamedQuery(name = "Lrcoticoaseguro.findByLrcoticoasegurogasadm", query = "SELECT l FROM Lrcoticoaseguro l WHERE l.lrcoticoasegurogasadm = :lrcoticoasegurogasadm"),
    @NamedQuery(name = "Lrcoticoaseguro.findByLrcoticoaseguroiva", query = "SELECT l FROM Lrcoticoaseguro l WHERE l.lrcoticoaseguroiva = :lrcoticoaseguroiva")})
public class Lrcoticoaseguro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "LRCOTICOASEGURO_SEQ_GENERATOR", sequenceName = "LRCOTICOASEGUROID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LRCOTICOASEGURO_SEQ_GENERATOR")
    @Basic(optional = false)
    @Column(name = "LRCOTICOASEGUROID", nullable = false)
    private Long lrcoticoaseguroid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRCOTICOASEGUROPORCPART", nullable = false, precision = 7, scale = 5)
    private BigDecimal lrcoticoaseguroporcpart;
    @Basic(optional = false)
    @Column(name = "LRCOTICOASEGUROSUMASEG", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcoticoasegurosumaseg;
    @Basic(optional = false)
    @Column(name = "LRCOTICOASEGUROPRIMACOM", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcoticoaseguroprimacom;
    @Basic(optional = false)
    @Column(name = "LRCOTICOASEGUROPREMIO", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcoticoaseguropremio;
    @Basic(optional = false)
    @Column(name = "LRCOTICOASEGUROPILOTO", nullable = false)
    private Character lrcoticoaseguropiloto;
    @Basic(optional = false)
    @Column(name = "LRCOTICOASEGUROUAL", nullable = false, length = 30)
    private String lrcoticoaseguroual;
    @Basic(optional = false)
    @Column(name = "LRCOTICOASEGUROFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcoticoasegurofal;
    @Basic(optional = false)
    @Column(name = "LRCOTICOASEGUROUMD", nullable = false, length = 30)
    private String lrcoticoaseguroumd;
    @Basic(optional = false)
    @Column(name = "LRCOTICOASEGUROFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcoticoasegurofmd;
    @Basic(optional = false)
    @Column(name = "COMREACOAID", nullable = false)
    private short comreacoaid;
    @Column(name = "LRCOTICOASEGUROPOLIZA", length = 30)
    private String lrcoticoaseguropoliza;
    @Column(name = "LRCOTICOASEGUROPRIMATEC", precision = 17, scale = 2)
    private BigDecimal lrcoticoaseguroprimatec;
    @Column(name = "LRCOTICOASEGUROGASADM", precision = 17, scale = 2)
    private BigDecimal lrcoticoasegurogasadm;
    @Column(name = "LRCOTICOASEGUROIVA", precision = 17, scale = 2)
    private BigDecimal lrcoticoaseguroiva;
    @JoinColumns({
        @JoinColumn(name = "LRCOTIZACIONNRO", referencedColumnName = "LRCOTIZACIONNRO", nullable = false),
        @JoinColumn(name = "LRCOTIZACIONVERSION", referencedColumnName = "LRCOTIZACIONVERSION", nullable = false)})
    @ManyToOne(optional = false)
    private Lrcotizacion lrcotizacion;

    public Lrcoticoaseguro() {
    }

    public Lrcoticoaseguro(Long lrcoticoaseguroid) {
        this.lrcoticoaseguroid = lrcoticoaseguroid;
    }

    public Lrcoticoaseguro(Long lrcoticoaseguroid, BigDecimal lrcoticoaseguroporcpart, BigDecimal lrcoticoasegurosumaseg, BigDecimal lrcoticoaseguroprimacom, BigDecimal lrcoticoaseguropremio, Character lrcoticoaseguropiloto, String lrcoticoaseguroual, Date lrcoticoasegurofal, String lrcoticoaseguroumd, Date lrcoticoasegurofmd, short comreacoaid) {
        this.lrcoticoaseguroid = lrcoticoaseguroid;
        this.lrcoticoaseguroporcpart = lrcoticoaseguroporcpart;
        this.lrcoticoasegurosumaseg = lrcoticoasegurosumaseg;
        this.lrcoticoaseguroprimacom = lrcoticoaseguroprimacom;
        this.lrcoticoaseguropremio = lrcoticoaseguropremio;
        this.lrcoticoaseguropiloto = lrcoticoaseguropiloto;
        this.lrcoticoaseguroual = lrcoticoaseguroual;
        this.lrcoticoasegurofal = lrcoticoasegurofal;
        this.lrcoticoaseguroumd = lrcoticoaseguroumd;
        this.lrcoticoasegurofmd = lrcoticoasegurofmd;
        this.comreacoaid = comreacoaid;
    }

    public Long getLrcoticoaseguroid() {
        return lrcoticoaseguroid;
    }

    public void setLrcoticoaseguroid(Long lrcoticoaseguroid) {
        this.lrcoticoaseguroid = lrcoticoaseguroid;
    }

    public BigDecimal getLrcoticoaseguroporcpart() {
        return lrcoticoaseguroporcpart;
    }

    public void setLrcoticoaseguroporcpart(BigDecimal lrcoticoaseguroporcpart) {
        this.lrcoticoaseguroporcpart = lrcoticoaseguroporcpart;
    }

    public BigDecimal getLrcoticoasegurosumaseg() {
        return lrcoticoasegurosumaseg;
    }

    public void setLrcoticoasegurosumaseg(BigDecimal lrcoticoasegurosumaseg) {
        this.lrcoticoasegurosumaseg = lrcoticoasegurosumaseg;
    }

    public BigDecimal getLrcoticoaseguroprimacom() {
        return lrcoticoaseguroprimacom;
    }

    public void setLrcoticoaseguroprimacom(BigDecimal lrcoticoaseguroprimacom) {
        this.lrcoticoaseguroprimacom = lrcoticoaseguroprimacom;
    }

    public BigDecimal getLrcoticoaseguropremio() {
        return lrcoticoaseguropremio;
    }

    public void setLrcoticoaseguropremio(BigDecimal lrcoticoaseguropremio) {
        this.lrcoticoaseguropremio = lrcoticoaseguropremio;
    }

    public Character getLrcoticoaseguropiloto() {
        return lrcoticoaseguropiloto;
    }

    public void setLrcoticoaseguropiloto(Character lrcoticoaseguropiloto) {
        this.lrcoticoaseguropiloto = lrcoticoaseguropiloto;
    }

    public String getLrcoticoaseguroual() {
        return lrcoticoaseguroual;
    }

    public void setLrcoticoaseguroual(String lrcoticoaseguroual) {
        this.lrcoticoaseguroual = lrcoticoaseguroual;
    }

    public Date getLrcoticoasegurofal() {
        return lrcoticoasegurofal;
    }

    public void setLrcoticoasegurofal(Date lrcoticoasegurofal) {
        this.lrcoticoasegurofal = lrcoticoasegurofal;
    }

    public String getLrcoticoaseguroumd() {
        return lrcoticoaseguroumd;
    }

    public void setLrcoticoaseguroumd(String lrcoticoaseguroumd) {
        this.lrcoticoaseguroumd = lrcoticoaseguroumd;
    }

    public Date getLrcoticoasegurofmd() {
        return lrcoticoasegurofmd;
    }

    public void setLrcoticoasegurofmd(Date lrcoticoasegurofmd) {
        this.lrcoticoasegurofmd = lrcoticoasegurofmd;
    }

    public short getComreacoaid() {
        return comreacoaid;
    }

    public void setComreacoaid(short comreacoaid) {
        this.comreacoaid = comreacoaid;
    }

    public String getLrcoticoaseguropoliza() {
        return lrcoticoaseguropoliza;
    }

    public void setLrcoticoaseguropoliza(String lrcoticoaseguropoliza) {
        this.lrcoticoaseguropoliza = lrcoticoaseguropoliza;
    }

    public BigDecimal getLrcoticoaseguroprimatec() {
        return lrcoticoaseguroprimatec;
    }

    public void setLrcoticoaseguroprimatec(BigDecimal lrcoticoaseguroprimatec) {
        this.lrcoticoaseguroprimatec = lrcoticoaseguroprimatec;
    }

    public BigDecimal getLrcoticoasegurogasadm() {
        return lrcoticoasegurogasadm;
    }

    public void setLrcoticoasegurogasadm(BigDecimal lrcoticoasegurogasadm) {
        this.lrcoticoasegurogasadm = lrcoticoasegurogasadm;
    }

    public BigDecimal getLrcoticoaseguroiva() {
        return lrcoticoaseguroiva;
    }

    public void setLrcoticoaseguroiva(BigDecimal lrcoticoaseguroiva) {
        this.lrcoticoaseguroiva = lrcoticoaseguroiva;
    }

    public Lrcotizacion getLrcotizacion() {
        return lrcotizacion;
    }

    public void setLrcotizacion(Lrcotizacion lrcotizacion) {
        this.lrcotizacion = lrcotizacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcoticoaseguroid != null ? lrcoticoaseguroid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcoticoaseguro)) {
            return false;
        }
        Lrcoticoaseguro other = (Lrcoticoaseguro) object;
        if ((this.lrcoticoaseguroid == null && other.lrcoticoaseguroid != null) || (this.lrcoticoaseguroid != null && !this.lrcoticoaseguroid.equals(other.lrcoticoaseguroid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcoticoaseguro[ lrcoticoaseguroid=" + lrcoticoaseguroid + " ]";
    }

}
