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

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LISTASEG", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "Listaseg.findAll", query = "SELECT l FROM Listaseg l"),
    @NamedQuery(name = "Listaseg.findByNAseg", query = "SELECT l FROM Listaseg l WHERE l.nAseg = :nAseg"),
    @NamedQuery(name = "Listaseg.findByNombAseg", query = "SELECT l FROM Listaseg l WHERE l.nombAseg = :nombAseg"),
    @NamedQuery(name = "Listaseg.findByDocumento", query = "SELECT l FROM Listaseg l WHERE l.documento = :documento"),
    @NamedQuery(name = "Listaseg.findByFechaNacimiento", query = "SELECT l FROM Listaseg l WHERE l.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Listaseg.findByContratistaCaucion", query = "SELECT l FROM Listaseg l WHERE l.contratistaCaucion = :contratistaCaucion"),
    @NamedQuery(name = "Listaseg.findByEstadoCivil", query = "SELECT l FROM Listaseg l WHERE l.estadoCivil = :estadoCivil"),
    @NamedQuery(name = "Listaseg.findByDireccionParticular", query = "SELECT l FROM Listaseg l WHERE l.direccionParticular = :direccionParticular"),
    @NamedQuery(name = "Listaseg.findByTelefonoParticular", query = "SELECT l FROM Listaseg l WHERE l.telefonoParticular = :telefonoParticular"),
    @NamedQuery(name = "Listaseg.findByLugarTrabajo", query = "SELECT l FROM Listaseg l WHERE l.lugarTrabajo = :lugarTrabajo"),
    @NamedQuery(name = "Listaseg.findByDireccionComercial", query = "SELECT l FROM Listaseg l WHERE l.direccionComercial = :direccionComercial"),
    @NamedQuery(name = "Listaseg.findByTelefonoComercial", query = "SELECT l FROM Listaseg l WHERE l.telefonoComercial = :telefonoComercial"),
    @NamedQuery(name = "Listaseg.findByCelular", query = "SELECT l FROM Listaseg l WHERE l.celular = :celular"),
    @NamedQuery(name = "Listaseg.findByEmail", query = "SELECT l FROM Listaseg l WHERE l.email = :email"),
    @NamedQuery(name = "Listaseg.findByNAgte", query = "SELECT l FROM Listaseg l WHERE l.nAgte = :nAgte"),
    @NamedQuery(name = "Listaseg.findByNCobr", query = "SELECT l FROM Listaseg l WHERE l.nCobr = :nCobr"),
    @NamedQuery(name = "Listaseg.findByEmpEstado", query = "SELECT l FROM Listaseg l WHERE l.empEstado = :empEstado"),
    @NamedQuery(name = "Listaseg.findByPlaya", query = "SELECT l FROM Listaseg l WHERE l.playa = :playa"),
    @NamedQuery(name = "Listaseg.findByEstado", query = "SELECT l FROM Listaseg l WHERE l.estado = :estado"),
    @NamedQuery(name = "Listaseg.findBySinIva", query = "SELECT l FROM Listaseg l WHERE l.sinIva = :sinIva"),
    @NamedQuery(name = "Listaseg.findByObservacion", query = "SELECT l FROM Listaseg l WHERE l.observacion = :observacion"),
    @NamedQuery(name = "Listaseg.findByFechaCarga", query = "SELECT l FROM Listaseg l WHERE l.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "Listaseg.findByNroEntrada", query = "SELECT l FROM Listaseg l WHERE l.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "Listaseg.findByEmpresa", query = "SELECT l FROM Listaseg l WHERE l.empresa = :empresa"),
    @NamedQuery(name = "Listaseg.findByPrimerContacto", query = "SELECT l FROM Listaseg l WHERE l.primerContacto = :primerContacto"),
    @NamedQuery(name = "Listaseg.findBySgteContacto", query = "SELECT l FROM Listaseg l WHERE l.sgteContacto = :sgteContacto"),
    @NamedQuery(name = "Listaseg.findByUltimoContacto", query = "SELECT l FROM Listaseg l WHERE l.ultimoContacto = :ultimoContacto"),
    @NamedQuery(name = "Listaseg.findByFaltanDocumentos", query = "SELECT l FROM Listaseg l WHERE l.faltanDocumentos = :faltanDocumentos"),
    @NamedQuery(name = "Listaseg.findByDocumentosFaltantes", query = "SELECT l FROM Listaseg l WHERE l.documentosFaltantes = :documentosFaltantes"),
    @NamedQuery(name = "Listaseg.findByFechaFalta", query = "SELECT l FROM Listaseg l WHERE l.fechaFalta = :fechaFalta"),
    @NamedQuery(name = "Listaseg.findByNombres", query = "SELECT l FROM Listaseg l WHERE l.nombres = :nombres"),
    @NamedQuery(name = "Listaseg.findByApellidos", query = "SELECT l FROM Listaseg l WHERE l.apellidos = :apellidos"),
    @NamedQuery(name = "Listaseg.findByApellidoCasada", query = "SELECT l FROM Listaseg l WHERE l.apellidoCasada = :apellidoCasada"),
    @NamedQuery(name = "Listaseg.findBySexo", query = "SELECT l FROM Listaseg l WHERE l.sexo = :sexo"),
    @NamedQuery(name = "Listaseg.findByNacionalidad", query = "SELECT l FROM Listaseg l WHERE l.nacionalidad = :nacionalidad"),
    @NamedQuery(name = "Listaseg.findByLugarNacimiento", query = "SELECT l FROM Listaseg l WHERE l.lugarNacimiento = :lugarNacimiento"),
    @NamedQuery(name = "Listaseg.findByFax", query = "SELECT l FROM Listaseg l WHERE l.fax = :fax"),
    @NamedQuery(name = "Listaseg.findByEmpleador", query = "SELECT l FROM Listaseg l WHERE l.empleador = :empleador"),
    @NamedQuery(name = "Listaseg.findByDireccionEmpleador", query = "SELECT l FROM Listaseg l WHERE l.direccionEmpleador = :direccionEmpleador"),
    @NamedQuery(name = "Listaseg.findByTelefonoEmpleador", query = "SELECT l FROM Listaseg l WHERE l.telefonoEmpleador = :telefonoEmpleador"),
    @NamedQuery(name = "Listaseg.findByCelularEmpleador", query = "SELECT l FROM Listaseg l WHERE l.celularEmpleador = :celularEmpleador"),
    @NamedQuery(name = "Listaseg.findByFaxEmpleador", query = "SELECT l FROM Listaseg l WHERE l.faxEmpleador = :faxEmpleador"),
    @NamedQuery(name = "Listaseg.findByEmailEmpleador", query = "SELECT l FROM Listaseg l WHERE l.emailEmpleador = :emailEmpleador"),
    @NamedQuery(name = "Listaseg.findByRucEmpleador", query = "SELECT l FROM Listaseg l WHERE l.rucEmpleador = :rucEmpleador"),
    @NamedQuery(name = "Listaseg.findByActividadEmpleador", query = "SELECT l FROM Listaseg l WHERE l.actividadEmpleador = :actividadEmpleador"),
    @NamedQuery(name = "Listaseg.findByFechaConstitucion", query = "SELECT l FROM Listaseg l WHERE l.fechaConstitucion = :fechaConstitucion"),
    @NamedQuery(name = "Listaseg.findByActividadEmpresa", query = "SELECT l FROM Listaseg l WHERE l.actividadEmpresa = :actividadEmpresa"),
    @NamedQuery(name = "Listaseg.findByNombresDirector1", query = "SELECT l FROM Listaseg l WHERE l.nombresDirector1 = :nombresDirector1"),
    @NamedQuery(name = "Listaseg.findByApellidosDirector1", query = "SELECT l FROM Listaseg l WHERE l.apellidosDirector1 = :apellidosDirector1"),
    @NamedQuery(name = "Listaseg.findByDocumentoDirector1", query = "SELECT l FROM Listaseg l WHERE l.documentoDirector1 = :documentoDirector1"),
    @NamedQuery(name = "Listaseg.findByNombresDirector2", query = "SELECT l FROM Listaseg l WHERE l.nombresDirector2 = :nombresDirector2"),
    @NamedQuery(name = "Listaseg.findByApellidosDirector2", query = "SELECT l FROM Listaseg l WHERE l.apellidosDirector2 = :apellidosDirector2"),
    @NamedQuery(name = "Listaseg.findByDocumentoDirector2", query = "SELECT l FROM Listaseg l WHERE l.documentoDirector2 = :documentoDirector2"),
    @NamedQuery(name = "Listaseg.findByNombresApoderado", query = "SELECT l FROM Listaseg l WHERE l.nombresApoderado = :nombresApoderado"),
    @NamedQuery(name = "Listaseg.findByApellidosApoderado", query = "SELECT l FROM Listaseg l WHERE l.apellidosApoderado = :apellidosApoderado"),
    @NamedQuery(name = "Listaseg.findByEstadoCivilApoderado", query = "SELECT l FROM Listaseg l WHERE l.estadoCivilApoderado = :estadoCivilApoderado"),
    @NamedQuery(name = "Listaseg.findByFechaNacimientoApoderado", query = "SELECT l FROM Listaseg l WHERE l.fechaNacimientoApoderado = :fechaNacimientoApoderado"),
    @NamedQuery(name = "Listaseg.findByNacionalidadApoderado", query = "SELECT l FROM Listaseg l WHERE l.nacionalidadApoderado = :nacionalidadApoderado"),
    @NamedQuery(name = "Listaseg.findByLugarNacimientoApoderado", query = "SELECT l FROM Listaseg l WHERE l.lugarNacimientoApoderado = :lugarNacimientoApoderado"),
    @NamedQuery(name = "Listaseg.findByDireccionApoderado", query = "SELECT l FROM Listaseg l WHERE l.direccionApoderado = :direccionApoderado"),
    @NamedQuery(name = "Listaseg.findByTipoDocumentoApoderado", query = "SELECT l FROM Listaseg l WHERE l.tipoDocumentoApoderado = :tipoDocumentoApoderado"),
    @NamedQuery(name = "Listaseg.findByDocumentoApoderado", query = "SELECT l FROM Listaseg l WHERE l.documentoApoderado = :documentoApoderado"),
    @NamedQuery(name = "Listaseg.findByDocumentoViejo", query = "SELECT l FROM Listaseg l WHERE l.documentoViejo = :documentoViejo"),
    @NamedQuery(name = "Listaseg.findByCodSocio", query = "SELECT l FROM Listaseg l WHERE l.codSocio = :codSocio"),
    @NamedQuery(name = "Listaseg.findByRuc", query = "SELECT l FROM Listaseg l WHERE l.ruc = :ruc"),
    @NamedQuery(name = "Listaseg.findByEnvioCarta", query = "SELECT l FROM Listaseg l WHERE l.envioCarta = :envioCarta"),
    @NamedQuery(name = "Listaseg.findByCodAsegVida", query = "SELECT l FROM Listaseg l WHERE l.codAsegVida = :codAsegVida"),
    @NamedQuery(name = "Listaseg.findByReciboTarjeta", query = "SELECT l FROM Listaseg l WHERE l.reciboTarjeta = :reciboTarjeta"),
    @NamedQuery(name = "Listaseg.findByCodOrganizador", query = "SELECT l FROM Listaseg l WHERE l.codOrganizador = :codOrganizador"),
    @NamedQuery(name = "Listaseg.findByBloqueoCuotaVencida", query = "SELECT l FROM Listaseg l WHERE l.bloqueoCuotaVencida = :bloqueoCuotaVencida"),
    @NamedQuery(name = "Listaseg.findByBloqueoAtrasoContado", query = "SELECT l FROM Listaseg l WHERE l.bloqueoAtrasoContado = :bloqueoAtrasoContado"),
    @NamedQuery(name = "Listaseg.findByUsuarioModifica", query = "SELECT l FROM Listaseg l WHERE l.usuarioModifica = :usuarioModifica")})
public class Listaseg implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nAseg")
    private List<Propauto> propautoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "listaseg")
    private List<Tarjetas> tarjetasList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "N_ASEG", nullable = false)
    private Integer nAseg;
    @Basic(optional = false)
    @Column(name = "NOMB_ASEG", nullable = false, length = 100)
    private String nombAseg;
    @Column(name = "DOCUMENTO", length = 15)
    private String documento;
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Column(name = "CONTRATISTA_CAUCION")
    private Integer contratistaCaucion;
    @Column(name = "ESTADO_CIVIL")
    private Short estadoCivil;
    @Column(name = "DIRECCION_PARTICULAR", length = 60)
    private String direccionParticular;
    @Column(name = "TELEFONO_PARTICULAR", length = 30)
    private String telefonoParticular;
    @Column(name = "LUGAR_TRABAJO", length = 40)
    private String lugarTrabajo;
    @Column(name = "DIRECCION_COMERCIAL", length = 60)
    private String direccionComercial;
    @Column(name = "TELEFONO_COMERCIAL", length = 30)
    private String telefonoComercial;
    @Column(name = "CELULAR", length = 20)
    private String celular;
    @Column(name = "EMAIL", length = 50)
    private String email;
    @Basic(optional = false)
    @Column(name = "N_AGTE", nullable = false)
    private int nAgte;
    @Basic(optional = false)
    @Column(name = "N_COBR", nullable = false)
    private int nCobr;
    @Basic(optional = false)
    @Column(name = "EMP_ESTADO", nullable = false)
    private short empEstado;
    @Basic(optional = false)
    @Column(name = "PLAYA", nullable = false)
    private short playa;
    @Basic(optional = false)
    @Column(name = "ESTADO", nullable = false)
    private short estado;
    @Basic(optional = false)
    @Column(name = "SIN_IVA", nullable = false)
    private short sinIva;
    @Column(name = "OBSERVACION", length = 1000)
    private String observacion;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @Column(name = "EMPRESA")
    private Short empresa;
    @Column(name = "PRIMER_CONTACTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date primerContacto;
    @Column(name = "SGTE_CONTACTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sgteContacto;
    @Column(name = "ULTIMO_CONTACTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimoContacto;
    @Column(name = "FALTAN_DOCUMENTOS")
    private Short faltanDocumentos;
    @Column(name = "DOCUMENTOS_FALTANTES", length = 500)
    private String documentosFaltantes;
    @Column(name = "FECHA_FALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFalta;
    @Column(name = "NOMBRES", length = 60)
    private String nombres;
    @Column(name = "APELLIDOS", length = 50)
    private String apellidos;
    @Column(name = "APELLIDO_CASADA", length = 30)
    private String apellidoCasada;
    @Column(name = "SEXO")
    private Short sexo;
    @Column(name = "NACIONALIDAD")
    private Short nacionalidad;
    @Column(name = "LUGAR_NACIMIENTO", length = 50)
    private String lugarNacimiento;
    @Column(name = "FAX", length = 20)
    private String fax;
    @Column(name = "EMPLEADOR", length = 40)
    private String empleador;
    @Column(name = "DIRECCION_EMPLEADOR", length = 60)
    private String direccionEmpleador;
    @Column(name = "TELEFONO_EMPLEADOR", length = 20)
    private String telefonoEmpleador;
    @Column(name = "CELULAR_EMPLEADOR", length = 20)
    private String celularEmpleador;
    @Column(name = "FAX_EMPLEADOR", length = 20)
    private String faxEmpleador;
    @Column(name = "EMAIL_EMPLEADOR", length = 50)
    private String emailEmpleador;
    @Column(name = "RUC_EMPLEADOR", length = 15)
    private String rucEmpleador;
    @Column(name = "ACTIVIDAD_EMPLEADOR", length = 50)
    private String actividadEmpleador;
    @Column(name = "FECHA_CONSTITUCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaConstitucion;
    @Column(name = "ACTIVIDAD_EMPRESA", length = 50)
    private String actividadEmpresa;
    @Column(name = "NOMBRES_DIRECTOR1", length = 30)
    private String nombresDirector1;
    @Column(name = "APELLIDOS_DIRECTOR1", length = 30)
    private String apellidosDirector1;
    @Column(name = "DOCUMENTO_DIRECTOR1", length = 15)
    private String documentoDirector1;
    @Column(name = "NOMBRES_DIRECTOR2", length = 30)
    private String nombresDirector2;
    @Column(name = "APELLIDOS_DIRECTOR2", length = 30)
    private String apellidosDirector2;
    @Column(name = "DOCUMENTO_DIRECTOR2", length = 15)
    private String documentoDirector2;
    @Column(name = "NOMBRES_APODERADO", length = 30)
    private String nombresApoderado;
    @Column(name = "APELLIDOS_APODERADO", length = 30)
    private String apellidosApoderado;
    @Column(name = "ESTADO_CIVIL_APODERADO")
    private Short estadoCivilApoderado;
    @Column(name = "FECHA_NACIMIENTO_APODERADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimientoApoderado;
    @Column(name = "NACIONALIDAD_APODERADO")
    private Short nacionalidadApoderado;
    @Column(name = "LUGAR_NACIMIENTO_APODERADO", length = 50)
    private String lugarNacimientoApoderado;
    @Column(name = "DIRECCION_APODERADO", length = 60)
    private String direccionApoderado;
    @Column(name = "TIPO_DOCUMENTO_APODERADO")
    private Short tipoDocumentoApoderado;
    @Column(name = "DOCUMENTO_APODERADO", length = 15)
    private String documentoApoderado;
    @Column(name = "DOCUMENTO_VIEJO", length = 20)
    private String documentoViejo;
    @Column(name = "COD_SOCIO")
    private Integer codSocio;
    @Column(name = "RUC", length = 15)
    private String ruc;
    @Column(name = "ENVIO_CARTA")
    private Short envioCarta;
    @Column(name = "COD_ASEG_VIDA")
    private Integer codAsegVida;
    @Column(name = "RECIBO_TARJETA")
    private Short reciboTarjeta;
    @Column(name = "COD_ORGANIZADOR")
    private Integer codOrganizador;
    @Column(name = "BLOQUEO_CUOTA_VENCIDA", length = 1)
    private String bloqueoCuotaVencida;
    @Column(name = "BLOQUEO_ATRASO_CONTADO", length = 1)
    private String bloqueoAtrasoContado;
    @Column(name = "USUARIO_MODIFICA")
    private Short usuarioModifica;
    @OneToMany(mappedBy = "nAseg")
    private List<Archbene> archbeneList;
    @JoinColumn(name = "COD_GRUPO", referencedColumnName = "COD_GRUPO")
    @ManyToOne
    private GrupoDeAsegurados codGrupo;
    @JoinColumns({
        @JoinColumn(name = "TIPO_PROFESION", referencedColumnName = "TIPO_PROFESION"),
        @JoinColumn(name = "PROFESION", referencedColumnName = "PROFESION")})
    @ManyToOne
    private Profesion profesion;
    @JoinColumn(name = "TIPO_DOCUMENTO", referencedColumnName = "COD_TIPO", nullable = false)
    @ManyToOne(optional = false)
    private TipoDocumento tipoDocumento;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;
    @JoinColumns({
        @JoinColumn(name = "COD_ZONA_PARTICULAR", referencedColumnName = "COD_ZONA"),
        @JoinColumn(name = "COD_DPTO_PARTICULAR", referencedColumnName = "COD_DPTO", nullable = false),
        @JoinColumn(name = "COD_CIUDAD_PARTICULAR", referencedColumnName = "COD_CIUDAD", nullable = false)})
    @ManyToOne(optional = false)
    private Zonas zonas;
    @JoinColumns({
        @JoinColumn(name = "COD_ZONA_COMERCIAL", referencedColumnName = "COD_ZONA"),
        @JoinColumn(name = "COD_DPTO_COMERCIAL", referencedColumnName = "COD_DPTO", nullable = false),
        @JoinColumn(name = "COD_CIUDAD_COMERCIAL", referencedColumnName = "COD_CIUDAD", nullable = false)})
    @ManyToOne(optional = false)
    private Zonas zonas1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nAseg")
    private List<Polsdemi> polsdemiList;

    public Listaseg() {
    }

    public Listaseg(Integer nAseg) {
        this.nAseg = nAseg;
    }

    public Listaseg(Integer nAseg, String nombAseg, int nAgte, int nCobr, short empEstado, short playa, short estado, short sinIva, Date fechaCarga, int nroEntrada) {
        this.nAseg = nAseg;
        this.nombAseg = nombAseg;
        this.nAgte = nAgte;
        this.nCobr = nCobr;
        this.empEstado = empEstado;
        this.playa = playa;
        this.estado = estado;
        this.sinIva = sinIva;
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

    public Integer getContratistaCaucion() {
        return contratistaCaucion;
    }

    public void setContratistaCaucion(Integer contratistaCaucion) {
        this.contratistaCaucion = contratistaCaucion;
    }

    public Short getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(Short estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDireccionParticular() {
        return direccionParticular;
    }

    public void setDireccionParticular(String direccionParticular) {
        this.direccionParticular = direccionParticular;
    }

    public String getTelefonoParticular() {
        return telefonoParticular;
    }

    public void setTelefonoParticular(String telefonoParticular) {
        this.telefonoParticular = telefonoParticular;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    public String getDireccionComercial() {
        return direccionComercial;
    }

    public void setDireccionComercial(String direccionComercial) {
        this.direccionComercial = direccionComercial;
    }

    public String getTelefonoComercial() {
        return telefonoComercial;
    }

    public void setTelefonoComercial(String telefonoComercial) {
        this.telefonoComercial = telefonoComercial;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNAgte() {
        return nAgte;
    }

    public void setNAgte(int nAgte) {
        this.nAgte = nAgte;
    }

    public int getNCobr() {
        return nCobr;
    }

    public void setNCobr(int nCobr) {
        this.nCobr = nCobr;
    }

    public short getEmpEstado() {
        return empEstado;
    }

    public void setEmpEstado(short empEstado) {
        this.empEstado = empEstado;
    }

    public short getPlaya() {
        return playa;
    }

    public void setPlaya(short playa) {
        this.playa = playa;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public short getSinIva() {
        return sinIva;
    }

    public void setSinIva(short sinIva) {
        this.sinIva = sinIva;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
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

    public Short getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Short empresa) {
        this.empresa = empresa;
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

    public Short getFaltanDocumentos() {
        return faltanDocumentos;
    }

    public void setFaltanDocumentos(Short faltanDocumentos) {
        this.faltanDocumentos = faltanDocumentos;
    }

    public String getDocumentosFaltantes() {
        return documentosFaltantes;
    }

    public void setDocumentosFaltantes(String documentosFaltantes) {
        this.documentosFaltantes = documentosFaltantes;
    }

    public Date getFechaFalta() {
        return fechaFalta;
    }

    public void setFechaFalta(Date fechaFalta) {
        this.fechaFalta = fechaFalta;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidoCasada() {
        return apellidoCasada;
    }

    public void setApellidoCasada(String apellidoCasada) {
        this.apellidoCasada = apellidoCasada;
    }

    public Short getSexo() {
        return sexo;
    }

    public void setSexo(Short sexo) {
        this.sexo = sexo;
    }

    public Short getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Short nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmpleador() {
        return empleador;
    }

    public void setEmpleador(String empleador) {
        this.empleador = empleador;
    }

    public String getDireccionEmpleador() {
        return direccionEmpleador;
    }

    public void setDireccionEmpleador(String direccionEmpleador) {
        this.direccionEmpleador = direccionEmpleador;
    }

    public String getTelefonoEmpleador() {
        return telefonoEmpleador;
    }

    public void setTelefonoEmpleador(String telefonoEmpleador) {
        this.telefonoEmpleador = telefonoEmpleador;
    }

    public String getCelularEmpleador() {
        return celularEmpleador;
    }

    public void setCelularEmpleador(String celularEmpleador) {
        this.celularEmpleador = celularEmpleador;
    }

    public String getFaxEmpleador() {
        return faxEmpleador;
    }

    public void setFaxEmpleador(String faxEmpleador) {
        this.faxEmpleador = faxEmpleador;
    }

    public String getEmailEmpleador() {
        return emailEmpleador;
    }

    public void setEmailEmpleador(String emailEmpleador) {
        this.emailEmpleador = emailEmpleador;
    }

    public String getRucEmpleador() {
        return rucEmpleador;
    }

    public void setRucEmpleador(String rucEmpleador) {
        this.rucEmpleador = rucEmpleador;
    }

    public String getActividadEmpleador() {
        return actividadEmpleador;
    }

    public void setActividadEmpleador(String actividadEmpleador) {
        this.actividadEmpleador = actividadEmpleador;
    }

    public Date getFechaConstitucion() {
        return fechaConstitucion;
    }

    public void setFechaConstitucion(Date fechaConstitucion) {
        this.fechaConstitucion = fechaConstitucion;
    }

    public String getActividadEmpresa() {
        return actividadEmpresa;
    }

    public void setActividadEmpresa(String actividadEmpresa) {
        this.actividadEmpresa = actividadEmpresa;
    }

    public String getNombresDirector1() {
        return nombresDirector1;
    }

    public void setNombresDirector1(String nombresDirector1) {
        this.nombresDirector1 = nombresDirector1;
    }

    public String getApellidosDirector1() {
        return apellidosDirector1;
    }

    public void setApellidosDirector1(String apellidosDirector1) {
        this.apellidosDirector1 = apellidosDirector1;
    }

    public String getDocumentoDirector1() {
        return documentoDirector1;
    }

    public void setDocumentoDirector1(String documentoDirector1) {
        this.documentoDirector1 = documentoDirector1;
    }

    public String getNombresDirector2() {
        return nombresDirector2;
    }

    public void setNombresDirector2(String nombresDirector2) {
        this.nombresDirector2 = nombresDirector2;
    }

    public String getApellidosDirector2() {
        return apellidosDirector2;
    }

    public void setApellidosDirector2(String apellidosDirector2) {
        this.apellidosDirector2 = apellidosDirector2;
    }

    public String getDocumentoDirector2() {
        return documentoDirector2;
    }

    public void setDocumentoDirector2(String documentoDirector2) {
        this.documentoDirector2 = documentoDirector2;
    }

    public String getNombresApoderado() {
        return nombresApoderado;
    }

    public void setNombresApoderado(String nombresApoderado) {
        this.nombresApoderado = nombresApoderado;
    }

    public String getApellidosApoderado() {
        return apellidosApoderado;
    }

    public void setApellidosApoderado(String apellidosApoderado) {
        this.apellidosApoderado = apellidosApoderado;
    }

    public Short getEstadoCivilApoderado() {
        return estadoCivilApoderado;
    }

    public void setEstadoCivilApoderado(Short estadoCivilApoderado) {
        this.estadoCivilApoderado = estadoCivilApoderado;
    }

    public Date getFechaNacimientoApoderado() {
        return fechaNacimientoApoderado;
    }

    public void setFechaNacimientoApoderado(Date fechaNacimientoApoderado) {
        this.fechaNacimientoApoderado = fechaNacimientoApoderado;
    }

    public Short getNacionalidadApoderado() {
        return nacionalidadApoderado;
    }

    public void setNacionalidadApoderado(Short nacionalidadApoderado) {
        this.nacionalidadApoderado = nacionalidadApoderado;
    }

    public String getLugarNacimientoApoderado() {
        return lugarNacimientoApoderado;
    }

    public void setLugarNacimientoApoderado(String lugarNacimientoApoderado) {
        this.lugarNacimientoApoderado = lugarNacimientoApoderado;
    }

    public String getDireccionApoderado() {
        return direccionApoderado;
    }

    public void setDireccionApoderado(String direccionApoderado) {
        this.direccionApoderado = direccionApoderado;
    }

    public Short getTipoDocumentoApoderado() {
        return tipoDocumentoApoderado;
    }

    public void setTipoDocumentoApoderado(Short tipoDocumentoApoderado) {
        this.tipoDocumentoApoderado = tipoDocumentoApoderado;
    }

    public String getDocumentoApoderado() {
        return documentoApoderado;
    }

    public void setDocumentoApoderado(String documentoApoderado) {
        this.documentoApoderado = documentoApoderado;
    }

    public String getDocumentoViejo() {
        return documentoViejo;
    }

    public void setDocumentoViejo(String documentoViejo) {
        this.documentoViejo = documentoViejo;
    }

    public Integer getCodSocio() {
        return codSocio;
    }

    public void setCodSocio(Integer codSocio) {
        this.codSocio = codSocio;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Short getEnvioCarta() {
        return envioCarta;
    }

    public void setEnvioCarta(Short envioCarta) {
        this.envioCarta = envioCarta;
    }

    public Integer getCodAsegVida() {
        return codAsegVida;
    }

    public void setCodAsegVida(Integer codAsegVida) {
        this.codAsegVida = codAsegVida;
    }

    public Short getReciboTarjeta() {
        return reciboTarjeta;
    }

    public void setReciboTarjeta(Short reciboTarjeta) {
        this.reciboTarjeta = reciboTarjeta;
    }

    public Integer getCodOrganizador() {
        return codOrganizador;
    }

    public void setCodOrganizador(Integer codOrganizador) {
        this.codOrganizador = codOrganizador;
    }

    public String getBloqueoCuotaVencida() {
        return bloqueoCuotaVencida;
    }

    public void setBloqueoCuotaVencida(String bloqueoCuotaVencida) {
        this.bloqueoCuotaVencida = bloqueoCuotaVencida;
    }

    public String getBloqueoAtrasoContado() {
        return bloqueoAtrasoContado;
    }

    public void setBloqueoAtrasoContado(String bloqueoAtrasoContado) {
        this.bloqueoAtrasoContado = bloqueoAtrasoContado;
    }

    public Short getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(Short usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    public List<Archbene> getArchbeneList() {
        return archbeneList;
    }

    public void setArchbeneList(List<Archbene> archbeneList) {
        this.archbeneList = archbeneList;
    }

    public GrupoDeAsegurados getCodGrupo() {
        return codGrupo;
    }

    public void setCodGrupo(GrupoDeAsegurados codGrupo) {
        this.codGrupo = codGrupo;
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

    public Zonas getZonas() {
        return zonas;
    }

    public void setZonas(Zonas zonas) {
        this.zonas = zonas;
    }

    public Zonas getZonas1() {
        return zonas1;
    }

    public void setZonas1(Zonas zonas1) {
        this.zonas1 = zonas1;
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
        hash += (nAseg != null ? nAseg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Listaseg)) {
            return false;
        }
        Listaseg other = (Listaseg) object;
        if ((this.nAseg == null && other.nAseg != null) || (this.nAseg != null && !this.nAseg.equals(other.nAseg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Listaseg[ nAseg=" + nAseg + " ]";
    }

    public List<Tarjetas> getTarjetasList() {
        return tarjetasList;
    }

    public void setTarjetasList(List<Tarjetas> tarjetasList) {
        this.tarjetasList = tarjetasList;
    }

    public List<Propauto> getPropautoList() {
        return propautoList;
    }

    public void setPropautoList(List<Propauto> propautoList) {
        this.propautoList = propautoList;
    }
    
}
