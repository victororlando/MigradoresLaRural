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
@Table(name = "LISTAGTE", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "Listagte.findAll", query = "SELECT l FROM Listagte l"),
    @NamedQuery(name = "Listagte.findByNAgte", query = "SELECT l FROM Listagte l WHERE l.nAgte = :nAgte"),
    @NamedQuery(name = "Listagte.findByNombre", query = "SELECT l FROM Listagte l WHERE l.nombre = :nombre"),
    @NamedQuery(name = "Listagte.findByMatricula", query = "SELECT l FROM Listagte l WHERE l.matricula = :matricula"),
    @NamedQuery(name = "Listagte.findByVtoMatricula", query = "SELECT l FROM Listagte l WHERE l.vtoMatricula = :vtoMatricula"),
    @NamedQuery(name = "Listagte.findByRuc", query = "SELECT l FROM Listagte l WHERE l.ruc = :ruc"),
    @NamedQuery(name = "Listagte.findByDireccion", query = "SELECT l FROM Listagte l WHERE l.direccion = :direccion"),
    @NamedQuery(name = "Listagte.findByTelefono", query = "SELECT l FROM Listagte l WHERE l.telefono = :telefono"),
    @NamedQuery(name = "Listagte.findByCelular", query = "SELECT l FROM Listagte l WHERE l.celular = :celular"),
    @NamedQuery(name = "Listagte.findByTipoComision", query = "SELECT l FROM Listagte l WHERE l.tipoComision = :tipoComision"),
    @NamedQuery(name = "Listagte.findByCtaContable", query = "SELECT l FROM Listagte l WHERE l.ctaContable = :ctaContable"),
    @NamedQuery(name = "Listagte.findByConIva", query = "SELECT l FROM Listagte l WHERE l.conIva = :conIva"),
    @NamedQuery(name = "Listagte.findByEstado", query = "SELECT l FROM Listagte l WHERE l.estado = :estado"),
    @NamedQuery(name = "Listagte.findByClave", query = "SELECT l FROM Listagte l WHERE l.clave = :clave"),
    @NamedQuery(name = "Listagte.findByEmail", query = "SELECT l FROM Listagte l WHERE l.email = :email"),
    @NamedQuery(name = "Listagte.findByCtaAdelanto", query = "SELECT l FROM Listagte l WHERE l.ctaAdelanto = :ctaAdelanto"),
    @NamedQuery(name = "Listagte.findByCodBenef", query = "SELECT l FROM Listagte l WHERE l.codBenef = :codBenef"),
    @NamedQuery(name = "Listagte.findByFechaCarga", query = "SELECT l FROM Listagte l WHERE l.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "Listagte.findByUsuarioSistema", query = "SELECT l FROM Listagte l WHERE l.usuarioSistema = :usuarioSistema"),
    @NamedQuery(name = "Listagte.findByNroEntrada", query = "SELECT l FROM Listagte l WHERE l.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "Listagte.findByMetaAgte", query = "SELECT l FROM Listagte l WHERE l.metaAgte = :metaAgte"),
    @NamedQuery(name = "Listagte.findByGrupo", query = "SELECT l FROM Listagte l WHERE l.grupo = :grupo"),
    @NamedQuery(name = "Listagte.findByCtaContableDevolucion", query = "SELECT l FROM Listagte l WHERE l.ctaContableDevolucion = :ctaContableDevolucion"),
    @NamedQuery(name = "Listagte.findByCtaContableDiNp", query = "SELECT l FROM Listagte l WHERE l.ctaContableDiNp = :ctaContableDiNp"),
    @NamedQuery(name = "Listagte.findByCalculaDif", query = "SELECT l FROM Listagte l WHERE l.calculaDif = :calculaDif"),
    @NamedQuery(name = "Listagte.findByCorredora", query = "SELECT l FROM Listagte l WHERE l.corredora = :corredora"),
    @NamedQuery(name = "Listagte.findByConFactura", query = "SELECT l FROM Listagte l WHERE l.conFactura = :conFactura"),
    @NamedQuery(name = "Listagte.findByVtoContratoCia", query = "SELECT l FROM Listagte l WHERE l.vtoContratoCia = :vtoContratoCia"),
    @NamedQuery(name = "Listagte.findByVtoPolizaGtia", query = "SELECT l FROM Listagte l WHERE l.vtoPolizaGtia = :vtoPolizaGtia"),
    @NamedQuery(name = "Listagte.findByUsuarioModifica", query = "SELECT l FROM Listagte l WHERE l.usuarioModifica = :usuarioModifica")})
public class Listagte implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "N_AGTE", nullable = false)
    private Integer nAgte;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    @Column(name = "MATRICULA")
    private Long matricula;
    @Column(name = "VTO_MATRICULA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vtoMatricula;
    @Column(name = "RUC", length = 20)
    private String ruc;
    @Column(name = "DIRECCION", length = 50)
    private String direccion;
    @Column(name = "TELEFONO", length = 30)
    private String telefono;
    @Column(name = "CELULAR", length = 25)
    private String celular;
    @Basic(optional = false)
    @Column(name = "TIPO_COMISION", nullable = false)
    private short tipoComision;
    @Column(name = "CTA_CONTABLE", length = 13)
    private String ctaContable;
    @Basic(optional = false)
    @Column(name = "CON_IVA", nullable = false)
    private short conIva;
    @Basic(optional = false)
    @Column(name = "ESTADO", nullable = false)
    private short estado;
    @Column(name = "CLAVE", length = 8)
    private String clave;
    @Column(name = "EMAIL", length = 50)
    private String email;
    @Column(name = "CTA_ADELANTO", length = 13)
    private String ctaAdelanto;
    @Column(name = "COD_BENEF")
    private Integer codBenef;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Column(name = "USUARIO_SISTEMA")
    private Short usuarioSistema;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @Column(name = "META_AGTE")
    private Long metaAgte;
    @Column(name = "GRUPO")
    private Short grupo;
    @Column(name = "CTA_CONTABLE_DEVOLUCION", length = 13)
    private String ctaContableDevolucion;
    @Column(name = "CTA_CONTABLE_DI_NP", length = 13)
    private String ctaContableDiNp;
    @Column(name = "CALCULA_DIF")
    private Short calculaDif;
    @Basic(optional = false)
    @Column(name = "CORREDORA", nullable = false)
    private short corredora;
    @Column(name = "CON_FACTURA")
    private Short conFactura;
    @Column(name = "VTO_CONTRATO_CIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vtoContratoCia;
    @Column(name = "VTO_POLIZA_GTIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vtoPolizaGtia;
    @Basic(optional = false)
    @Column(name = "USUARIO_MODIFICA", nullable = false)
    private short usuarioModifica;
    @JoinColumn(name = "COD_BROKER", referencedColumnName = "COD_BROKER")
    @ManyToOne
    private AgentesBroker codBroker;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nAgte")
    private List<Polsdemi> polsdemiList;

    public Listagte() {
    }

    public Listagte(Integer nAgte) {
        this.nAgte = nAgte;
    }

    public Listagte(Integer nAgte, String nombre, short tipoComision, short conIva, short estado, Date fechaCarga, int nroEntrada, short corredora, short usuarioModifica) {
        this.nAgte = nAgte;
        this.nombre = nombre;
        this.tipoComision = tipoComision;
        this.conIva = conIva;
        this.estado = estado;
        this.fechaCarga = fechaCarga;
        this.nroEntrada = nroEntrada;
        this.corredora = corredora;
        this.usuarioModifica = usuarioModifica;
    }

    public Integer getNAgte() {
        return nAgte;
    }

    public void setNAgte(Integer nAgte) {
        this.nAgte = nAgte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public Date getVtoMatricula() {
        return vtoMatricula;
    }

    public void setVtoMatricula(Date vtoMatricula) {
        this.vtoMatricula = vtoMatricula;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public short getTipoComision() {
        return tipoComision;
    }

    public void setTipoComision(short tipoComision) {
        this.tipoComision = tipoComision;
    }

    public String getCtaContable() {
        return ctaContable;
    }

    public void setCtaContable(String ctaContable) {
        this.ctaContable = ctaContable;
    }

    public short getConIva() {
        return conIva;
    }

    public void setConIva(short conIva) {
        this.conIva = conIva;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCtaAdelanto() {
        return ctaAdelanto;
    }

    public void setCtaAdelanto(String ctaAdelanto) {
        this.ctaAdelanto = ctaAdelanto;
    }

    public Integer getCodBenef() {
        return codBenef;
    }

    public void setCodBenef(Integer codBenef) {
        this.codBenef = codBenef;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public Short getUsuarioSistema() {
        return usuarioSistema;
    }

    public void setUsuarioSistema(Short usuarioSistema) {
        this.usuarioSistema = usuarioSistema;
    }

    public int getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(int nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public Long getMetaAgte() {
        return metaAgte;
    }

    public void setMetaAgte(Long metaAgte) {
        this.metaAgte = metaAgte;
    }

    public Short getGrupo() {
        return grupo;
    }

    public void setGrupo(Short grupo) {
        this.grupo = grupo;
    }

    public String getCtaContableDevolucion() {
        return ctaContableDevolucion;
    }

    public void setCtaContableDevolucion(String ctaContableDevolucion) {
        this.ctaContableDevolucion = ctaContableDevolucion;
    }

    public String getCtaContableDiNp() {
        return ctaContableDiNp;
    }

    public void setCtaContableDiNp(String ctaContableDiNp) {
        this.ctaContableDiNp = ctaContableDiNp;
    }

    public Short getCalculaDif() {
        return calculaDif;
    }

    public void setCalculaDif(Short calculaDif) {
        this.calculaDif = calculaDif;
    }

    public short getCorredora() {
        return corredora;
    }

    public void setCorredora(short corredora) {
        this.corredora = corredora;
    }

    public Short getConFactura() {
        return conFactura;
    }

    public void setConFactura(Short conFactura) {
        this.conFactura = conFactura;
    }

    public Date getVtoContratoCia() {
        return vtoContratoCia;
    }

    public void setVtoContratoCia(Date vtoContratoCia) {
        this.vtoContratoCia = vtoContratoCia;
    }

    public Date getVtoPolizaGtia() {
        return vtoPolizaGtia;
    }

    public void setVtoPolizaGtia(Date vtoPolizaGtia) {
        this.vtoPolizaGtia = vtoPolizaGtia;
    }

    public short getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(short usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    public AgentesBroker getCodBroker() {
        return codBroker;
    }

    public void setCodBroker(AgentesBroker codBroker) {
        this.codBroker = codBroker;
    }

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
    }

    public List<Polsdemi> getPolsdemiList() {
        return polsdemiList;
    }

    public void setPolsdemiList(List<Polsdemi> polsdemiList) {
        this.polsdemiList = polsdemiList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nAgte != null ? nAgte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Listagte)) {
            return false;
        }
        Listagte other = (Listagte) object;
        if ((this.nAgte == null && other.nAgte != null) || (this.nAgte != null && !this.nAgte.equals(other.nAgte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Listagte[ nAgte=" + nAgte + " ]";
    }
    
}
