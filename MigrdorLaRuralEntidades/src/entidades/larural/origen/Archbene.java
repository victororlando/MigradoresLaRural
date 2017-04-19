/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "ARCHBENE", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "Archbene.findAll", query = "SELECT a FROM Archbene a"),
    @NamedQuery(name = "Archbene.findByCodBenef", query = "SELECT a FROM Archbene a WHERE a.codBenef = :codBenef"),
    @NamedQuery(name = "Archbene.findByNombre", query = "SELECT a FROM Archbene a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Archbene.findByRuc", query = "SELECT a FROM Archbene a WHERE a.ruc = :ruc"),
    @NamedQuery(name = "Archbene.findByPctDcto", query = "SELECT a FROM Archbene a WHERE a.pctDcto = :pctDcto"),
    @NamedQuery(name = "Archbene.findByDireccion", query = "SELECT a FROM Archbene a WHERE a.direccion = :direccion"),
    @NamedQuery(name = "Archbene.findByTelefono", query = "SELECT a FROM Archbene a WHERE a.telefono = :telefono"),
    @NamedQuery(name = "Archbene.findByContacto", query = "SELECT a FROM Archbene a WHERE a.contacto = :contacto"),
    @NamedQuery(name = "Archbene.findByEmail", query = "SELECT a FROM Archbene a WHERE a.email = :email"),
    @NamedQuery(name = "Archbene.findByCelular", query = "SELECT a FROM Archbene a WHERE a.celular = :celular"),
    @NamedQuery(name = "Archbene.findBySucursales", query = "SELECT a FROM Archbene a WHERE a.sucursales = :sucursales"),
    @NamedQuery(name = "Archbene.findBySedeCent", query = "SELECT a FROM Archbene a WHERE a.sedeCent = :sedeCent"),
    @NamedQuery(name = "Archbene.findByFax", query = "SELECT a FROM Archbene a WHERE a.fax = :fax"),
    @NamedQuery(name = "Archbene.findByRetencion", query = "SELECT a FROM Archbene a WHERE a.retencion = :retencion"),
    @NamedQuery(name = "Archbene.findByEstado", query = "SELECT a FROM Archbene a WHERE a.estado = :estado"),
    @NamedQuery(name = "Archbene.findByCodUsuario", query = "SELECT a FROM Archbene a WHERE a.codUsuario = :codUsuario"),
    @NamedQuery(name = "Archbene.findByNroEntrada", query = "SELECT a FROM Archbene a WHERE a.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "Archbene.findByProvisionaAlarma", query = "SELECT a FROM Archbene a WHERE a.provisionaAlarma = :provisionaAlarma"),
    @NamedQuery(name = "Archbene.findByFacturaCompra", query = "SELECT a FROM Archbene a WHERE a.facturaCompra = :facturaCompra"),
    @NamedQuery(name = "Archbene.findByNroTimbrado", query = "SELECT a FROM Archbene a WHERE a.nroTimbrado = :nroTimbrado"),
    @NamedQuery(name = "Archbene.findByFechaVencimiento", query = "SELECT a FROM Archbene a WHERE a.fechaVencimiento = :fechaVencimiento"),
    @NamedQuery(name = "Archbene.findByNroTimbradoNc", query = "SELECT a FROM Archbene a WHERE a.nroTimbradoNc = :nroTimbradoNc"),
    @NamedQuery(name = "Archbene.findByFechaVencimientoNc", query = "SELECT a FROM Archbene a WHERE a.fechaVencimientoNc = :fechaVencimientoNc"),
    @NamedQuery(name = "Archbene.findByRetencionExterior", query = "SELECT a FROM Archbene a WHERE a.retencionExterior = :retencionExterior"),
    @NamedQuery(name = "Archbene.findByCodPais", query = "SELECT a FROM Archbene a WHERE a.codPais = :codPais")})
public class Archbene implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_BENEF", nullable = false)
    private Integer codBenef;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    @Column(name = "RUC", length = 20)
    private String ruc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PCT_DCTO", precision = 5, scale = 2)
    private BigDecimal pctDcto;
    @Column(name = "DIRECCION", length = 100)
    private String direccion;
    @Column(name = "TELEFONO", length = 30)
    private String telefono;
    @Column(name = "CONTACTO", length = 40)
    private String contacto;
    @Column(name = "EMAIL", length = 50)
    private String email;
    @Column(name = "CELULAR", length = 25)
    private String celular;
    @Column(name = "SUCURSALES", length = 100)
    private String sucursales;
    @Column(name = "SEDE_CENT")
    private Short sedeCent;
    @Column(name = "FAX", length = 20)
    private String fax;
    @Basic(optional = false)
    @Column(name = "RETENCION", nullable = false)
    private short retencion;
    @Basic(optional = false)
    @Column(name = "ESTADO", nullable = false)
    private short estado;
    @Basic(optional = false)
    @Column(name = "COD_USUARIO", nullable = false)
    private short codUsuario;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @Column(name = "PROVISIONA_ALARMA")
    private Short provisionaAlarma;
    @Basic(optional = false)
    @Column(name = "FACTURA_COMPRA", nullable = false)
    private short facturaCompra;
    @Column(name = "NRO_TIMBRADO", length = 20)
    private String nroTimbrado;
    @Column(name = "FECHA_VENCIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimiento;
    @Column(name = "NRO_TIMBRADO_NC", length = 20)
    private String nroTimbradoNc;
    @Column(name = "FECHA_VENCIMIENTO_NC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimientoNc;
    @Basic(optional = false)
    @Column(name = "RETENCION_EXTERIOR", nullable = false, length = 1)
    private String retencionExterior;
    @Column(name = "COD_PAIS")
    private Short codPais;
    @JoinColumn(name = "N_ASEG", referencedColumnName = "N_ASEG")
    @ManyToOne
    private Listaseg nAseg;
    @JoinColumn(name = "TIPO_CASA", referencedColumnName = "TIPO_CASA")
    @ManyToOne
    private TipoCasas tipoCasa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "archbene")
    private List<ArchbeneServicios> archbeneServiciosList;
    @OneToMany(mappedBy = "codBenef")
    private List<Listcobr> listcobrList;

    public Archbene() {
    }

    public Archbene(Integer codBenef) {
        this.codBenef = codBenef;
    }

    public Archbene(Integer codBenef, String nombre, short retencion, short estado, short codUsuario, int nroEntrada, short facturaCompra, String retencionExterior) {
        this.codBenef = codBenef;
        this.nombre = nombre;
        this.retencion = retencion;
        this.estado = estado;
        this.codUsuario = codUsuario;
        this.nroEntrada = nroEntrada;
        this.facturaCompra = facturaCompra;
        this.retencionExterior = retencionExterior;
    }

    public Integer getCodBenef() {
        return codBenef;
    }

    public void setCodBenef(Integer codBenef) {
        this.codBenef = codBenef;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public BigDecimal getPctDcto() {
        return pctDcto;
    }

    public void setPctDcto(BigDecimal pctDcto) {
        this.pctDcto = pctDcto;
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

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSucursales() {
        return sucursales;
    }

    public void setSucursales(String sucursales) {
        this.sucursales = sucursales;
    }

    public Short getSedeCent() {
        return sedeCent;
    }

    public void setSedeCent(Short sedeCent) {
        this.sedeCent = sedeCent;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public short getRetencion() {
        return retencion;
    }

    public void setRetencion(short retencion) {
        this.retencion = retencion;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public short getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(short codUsuario) {
        this.codUsuario = codUsuario;
    }

    public int getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(int nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public Short getProvisionaAlarma() {
        return provisionaAlarma;
    }

    public void setProvisionaAlarma(Short provisionaAlarma) {
        this.provisionaAlarma = provisionaAlarma;
    }

    public short getFacturaCompra() {
        return facturaCompra;
    }

    public void setFacturaCompra(short facturaCompra) {
        this.facturaCompra = facturaCompra;
    }

    public String getNroTimbrado() {
        return nroTimbrado;
    }

    public void setNroTimbrado(String nroTimbrado) {
        this.nroTimbrado = nroTimbrado;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNroTimbradoNc() {
        return nroTimbradoNc;
    }

    public void setNroTimbradoNc(String nroTimbradoNc) {
        this.nroTimbradoNc = nroTimbradoNc;
    }

    public Date getFechaVencimientoNc() {
        return fechaVencimientoNc;
    }

    public void setFechaVencimientoNc(Date fechaVencimientoNc) {
        this.fechaVencimientoNc = fechaVencimientoNc;
    }

    public String getRetencionExterior() {
        return retencionExterior;
    }

    public void setRetencionExterior(String retencionExterior) {
        this.retencionExterior = retencionExterior;
    }

    public Short getCodPais() {
        return codPais;
    }

    public void setCodPais(Short codPais) {
        this.codPais = codPais;
    }

    public Listaseg getNAseg() {
        return nAseg;
    }

    public void setNAseg(Listaseg nAseg) {
        this.nAseg = nAseg;
    }

    public TipoCasas getTipoCasa() {
        return tipoCasa;
    }

    public void setTipoCasa(TipoCasas tipoCasa) {
        this.tipoCasa = tipoCasa;
    }

    public List<ArchbeneServicios> getArchbeneServiciosList() {
        return archbeneServiciosList;
    }

    public void setArchbeneServiciosList(List<ArchbeneServicios> archbeneServiciosList) {
        this.archbeneServiciosList = archbeneServiciosList;
    }

    public List<Listcobr> getListcobrList() {
        return listcobrList;
    }

    public void setListcobrList(List<Listcobr> listcobrList) {
        this.listcobrList = listcobrList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codBenef != null ? codBenef.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Archbene)) {
            return false;
        }
        Archbene other = (Archbene) object;
        if ((this.codBenef == null && other.codBenef != null) || (this.codBenef != null && !this.codBenef.equals(other.codBenef))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Archbene[ codBenef=" + codBenef + " ]";
    }
    
}
