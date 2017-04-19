/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "ASEG_VIDA", schema = "SOFTTEN", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"NOMB_ASEG", "DOCUMENTO"})})
@NamedQueries({
    @NamedQuery(name = "AsegVida.findAll", query = "SELECT a FROM AsegVida a"),
    @NamedQuery(name = "AsegVida.findByNAseg", query = "SELECT a FROM AsegVida a WHERE a.nAseg = :nAseg"),
    @NamedQuery(name = "AsegVida.findByNombAseg", query = "SELECT a FROM AsegVida a WHERE a.nombAseg = :nombAseg"),
    @NamedQuery(name = "AsegVida.findByDocumento", query = "SELECT a FROM AsegVida a WHERE a.documento = :documento"),
    @NamedQuery(name = "AsegVida.findByFechaNacimiento", query = "SELECT a FROM AsegVida a WHERE a.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "AsegVida.findByBeneficiario", query = "SELECT a FROM AsegVida a WHERE a.beneficiario = :beneficiario"),
    @NamedQuery(name = "AsegVida.findByFechaCarga", query = "SELECT a FROM AsegVida a WHERE a.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "AsegVida.findByNroEntrada", query = "SELECT a FROM AsegVida a WHERE a.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "AsegVida.findByDireccion", query = "SELECT a FROM AsegVida a WHERE a.direccion = :direccion"),
    @NamedQuery(name = "AsegVida.findByTelefono", query = "SELECT a FROM AsegVida a WHERE a.telefono = :telefono"),
    @NamedQuery(name = "AsegVida.findByPrimerContacto", query = "SELECT a FROM AsegVida a WHERE a.primerContacto = :primerContacto"),
    @NamedQuery(name = "AsegVida.findBySgteContacto", query = "SELECT a FROM AsegVida a WHERE a.sgteContacto = :sgteContacto"),
    @NamedQuery(name = "AsegVida.findByUltimoContacto", query = "SELECT a FROM AsegVida a WHERE a.ultimoContacto = :ultimoContacto"),
    @NamedQuery(name = "AsegVida.findByCodSocio", query = "SELECT a FROM AsegVida a WHERE a.codSocio = :codSocio"),
    @NamedQuery(name = "AsegVida.findByEmail", query = "SELECT a FROM AsegVida a WHERE a.email = :email"),
    @NamedQuery(name = "AsegVida.findByReciboTarjeta", query = "SELECT a FROM AsegVida a WHERE a.reciboTarjeta = :reciboTarjeta"),
    @NamedQuery(name = "AsegVida.findBySexo", query = "SELECT a FROM AsegVida a WHERE a.sexo = :sexo"),
    @NamedQuery(name = "AsegVida.findByEstado", query = "SELECT a FROM AsegVida a WHERE a.estado = :estado")})
public class AsegVida implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "asegVida")
    private List<BenefAsegVida> benefAsegVidaList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "N_ASEG", nullable = false)
    private Integer nAseg;
    @Basic(optional = false)
    @Column(name = "NOMB_ASEG", nullable = false, length = 100)
    private String nombAseg;
    @Basic(optional = false)
    @Column(name = "DOCUMENTO", nullable = false, length = 15)
    private String documento;
    @Basic(optional = false)
    @Column(name = "FECHA_NACIMIENTO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Column(name = "BENEFICIARIO", length = 200)
    private String beneficiario;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @Column(name = "DIRECCION", length = 80)
    private String direccion;
    @Column(name = "TELEFONO", length = 25)
    private String telefono;
    @Column(name = "PRIMER_CONTACTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date primerContacto;
    @Column(name = "SGTE_CONTACTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sgteContacto;
    @Column(name = "ULTIMO_CONTACTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimoContacto;
    @Column(name = "COD_SOCIO")
    private Integer codSocio;
    @Column(name = "EMAIL", length = 60)
    private String email;
    @Column(name = "RECIBO_TARJETA")
    private Short reciboTarjeta;
    @Column(name = "SEXO")
    private Short sexo;
    @Column(name = "ESTADO")
    private Short estado;
    @JoinColumns({
        @JoinColumn(name = "TIPO_PROFESION", referencedColumnName = "TIPO_PROFESION", nullable = false),
        @JoinColumn(name = "PROFESION", referencedColumnName = "PROFESION", nullable = false)})
    @ManyToOne(optional = false)
    private Profesion profesion;
    @JoinColumn(name = "TIPO_DOCUMENTO", referencedColumnName = "COD_TIPO", nullable = false)
    @ManyToOne(optional = false)
    private TipoDocumento tipoDocumento;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nAseg")
    private List<Certvida> certvidaList;

    public AsegVida() {
    }

    public AsegVida(Integer nAseg) {
        this.nAseg = nAseg;
    }

    public AsegVida(Integer nAseg, String nombAseg, String documento, Date fechaNacimiento, Date fechaCarga, int nroEntrada) {
        this.nAseg = nAseg;
        this.nombAseg = nombAseg;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaCarga = fechaCarga;
        this.nroEntrada = nroEntrada;
    }

    public Integer getNAseg() {
        return nAseg;
    }

    public void setNAseg(Integer nAseg) {
        this.nAseg = nAseg;
    }

    public String getNombAseg() {
        return nombAseg;
    }

    public void setNombAseg(String nombAseg) {
        this.nombAseg = nombAseg;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public int getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(int nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getPrimerContacto() {
        return primerContacto;
    }

    public void setPrimerContacto(Date primerContacto) {
        this.primerContacto = primerContacto;
    }

    public Date getSgteContacto() {
        return sgteContacto;
    }

    public void setSgteContacto(Date sgteContacto) {
        this.sgteContacto = sgteContacto;
    }

    public Date getUltimoContacto() {
        return ultimoContacto;
    }

    public void setUltimoContacto(Date ultimoContacto) {
        this.ultimoContacto = ultimoContacto;
    }

    public Integer getCodSocio() {
        return codSocio;
    }

    public void setCodSocio(Integer codSocio) {
        this.codSocio = codSocio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Short getReciboTarjeta() {
        return reciboTarjeta;
    }

    public void setReciboTarjeta(Short reciboTarjeta) {
        this.reciboTarjeta = reciboTarjeta;
    }

    public Short getSexo() {
        return sexo;
    }

    public void setSexo(Short sexo) {
        this.sexo = sexo;
    }

    public Short getEstado() {
        return estado;
    }

    public void setEstado(Short estado) {
        this.estado = estado;
    }

    public Profesion getProfesion() {
        return profesion;
    }

    public void setProfesion(Profesion profesion) {
        this.profesion = profesion;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
    }

    public List<Certvida> getCertvidaList() {
        return certvidaList;
    }

    public void setCertvidaList(List<Certvida> certvidaList) {
        this.certvidaList = certvidaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nAseg != null ? nAseg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsegVida)) {
            return false;
        }
        AsegVida other = (AsegVida) object;
        if ((this.nAseg == null && other.nAseg != null) || (this.nAseg != null && !this.nAseg.equals(other.nAseg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.AsegVida[ nAseg=" + nAseg + " ]";
    }

    public List<BenefAsegVida> getBenefAsegVidaList() {
        return benefAsegVidaList;
    }

    public void setBenefAsegVidaList(List<BenefAsegVida> benefAsegVidaList) {
        this.benefAsegVidaList = benefAsegVidaList;
    }
    
}
