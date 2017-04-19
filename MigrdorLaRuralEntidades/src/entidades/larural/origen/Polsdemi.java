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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "POLSDEMI", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "Polsdemi.findAll", query = "SELECT p FROM Polsdemi p"),
    @NamedQuery(name = "Polsdemi.findByTipoSeguro", query = "SELECT p FROM Polsdemi p WHERE p.polsdemiPK.tipoSeguro = :tipoSeguro"),
    @NamedQuery(name = "Polsdemi.findByTipoOperacion", query = "SELECT p FROM Polsdemi p WHERE p.polsdemiPK.tipoOperacion = :tipoOperacion"),
    @NamedQuery(name = "Polsdemi.findByEjercicio", query = "SELECT p FROM Polsdemi p WHERE p.polsdemiPK.ejercicio = :ejercicio"),
    @NamedQuery(name = "Polsdemi.findBySecc", query = "SELECT p FROM Polsdemi p WHERE p.polsdemiPK.secc = :secc"),
    @NamedQuery(name = "Polsdemi.findByPolnro", query = "SELECT p FROM Polsdemi p WHERE p.polsdemiPK.polnro = :polnro"),
    @NamedQuery(name = "Polsdemi.findByAnexo", query = "SELECT p FROM Polsdemi p WHERE p.polsdemiPK.anexo = :anexo"),
    @NamedQuery(name = "Polsdemi.findByFecha", query = "SELECT p FROM Polsdemi p WHERE p.fecha = :fecha"),
    @NamedQuery(name = "Polsdemi.findByCertProvisorio", query = "SELECT p FROM Polsdemi p WHERE p.certProvisorio = :certProvisorio"),
    @NamedQuery(name = "Polsdemi.findByTCambio", query = "SELECT p FROM Polsdemi p WHERE p.tCambio = :tCambio"),
    @NamedQuery(name = "Polsdemi.findByRenovPor", query = "SELECT p FROM Polsdemi p WHERE p.renovPor = :renovPor"),
    @NamedQuery(name = "Polsdemi.findByCantItem", query = "SELECT p FROM Polsdemi p WHERE p.cantItem = :cantItem"),
    @NamedQuery(name = "Polsdemi.findByVigdes", query = "SELECT p FROM Polsdemi p WHERE p.vigdes = :vigdes"),
    @NamedQuery(name = "Polsdemi.findByVighas", query = "SELECT p FROM Polsdemi p WHERE p.vighas = :vighas"),
    @NamedQuery(name = "Polsdemi.findByCantDias", query = "SELECT p FROM Polsdemi p WHERE p.cantDias = :cantDias"),
    @NamedQuery(name = "Polsdemi.findBySumaseg", query = "SELECT p FROM Polsdemi p WHERE p.sumaseg = :sumaseg"),
    @NamedQuery(name = "Polsdemi.findByPrima", query = "SELECT p FROM Polsdemi p WHERE p.prima = :prima"),
    @NamedQuery(name = "Polsdemi.findByGtosAdmi", query = "SELECT p FROM Polsdemi p WHERE p.gtosAdmi = :gtosAdmi"),
    @NamedQuery(name = "Polsdemi.findByRpf", query = "SELECT p FROM Polsdemi p WHERE p.rpf = :rpf"),
    @NamedQuery(name = "Polsdemi.findByOtros", query = "SELECT p FROM Polsdemi p WHERE p.otros = :otros"),
    @NamedQuery(name = "Polsdemi.findByIva", query = "SELECT p FROM Polsdemi p WHERE p.iva = :iva"),
    @NamedQuery(name = "Polsdemi.findByPremio", query = "SELECT p FROM Polsdemi p WHERE p.premio = :premio"),
    @NamedQuery(name = "Polsdemi.findByPorcComag", query = "SELECT p FROM Polsdemi p WHERE p.porcComag = :porcComag"),
    @NamedQuery(name = "Polsdemi.findByImpComag", query = "SELECT p FROM Polsdemi p WHERE p.impComag = :impComag"),
    @NamedQuery(name = "Polsdemi.findByPorcCom", query = "SELECT p FROM Polsdemi p WHERE p.porcCom = :porcCom"),
    @NamedQuery(name = "Polsdemi.findByPin", query = "SELECT p FROM Polsdemi p WHERE p.pin = :pin"),
    @NamedQuery(name = "Polsdemi.findByVtoTarjeta", query = "SELECT p FROM Polsdemi p WHERE p.vtoTarjeta = :vtoTarjeta"),
    @NamedQuery(name = "Polsdemi.findByFechaCarga", query = "SELECT p FROM Polsdemi p WHERE p.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "Polsdemi.findByCapRetenido", query = "SELECT p FROM Polsdemi p WHERE p.capRetenido = :capRetenido"),
    @NamedQuery(name = "Polsdemi.findByPrimaRetenida", query = "SELECT p FROM Polsdemi p WHERE p.primaRetenida = :primaRetenida"),
    @NamedQuery(name = "Polsdemi.findByPorcRetenido", query = "SELECT p FROM Polsdemi p WHERE p.porcRetenido = :porcRetenido"),
    @NamedQuery(name = "Polsdemi.findByCapContrato", query = "SELECT p FROM Polsdemi p WHERE p.capContrato = :capContrato"),
    @NamedQuery(name = "Polsdemi.findByPrimaContrato", query = "SELECT p FROM Polsdemi p WHERE p.primaContrato = :primaContrato"),
    @NamedQuery(name = "Polsdemi.findByPorcContrato", query = "SELECT p FROM Polsdemi p WHERE p.porcContrato = :porcContrato"),
    @NamedQuery(name = "Polsdemi.findByCapFacultativo", query = "SELECT p FROM Polsdemi p WHERE p.capFacultativo = :capFacultativo"),
    @NamedQuery(name = "Polsdemi.findByPrimaFacultativo", query = "SELECT p FROM Polsdemi p WHERE p.primaFacultativo = :primaFacultativo"),
    @NamedQuery(name = "Polsdemi.findByPorcFacultativo", query = "SELECT p FROM Polsdemi p WHERE p.porcFacultativo = :porcFacultativo"),
    @NamedQuery(name = "Polsdemi.findByEstado", query = "SELECT p FROM Polsdemi p WHERE p.estado = :estado"),
    @NamedQuery(name = "Polsdemi.findByNroFactura", query = "SELECT p FROM Polsdemi p WHERE p.nroFactura = :nroFactura"),
    @NamedQuery(name = "Polsdemi.findByInicial", query = "SELECT p FROM Polsdemi p WHERE p.inicial = :inicial"),
    @NamedQuery(name = "Polsdemi.findByNroCuotas", query = "SELECT p FROM Polsdemi p WHERE p.nroCuotas = :nroCuotas"),
    @NamedQuery(name = "Polsdemi.findByImpCuotas", query = "SELECT p FROM Polsdemi p WHERE p.impCuotas = :impCuotas"),
    @NamedQuery(name = "Polsdemi.findByAnxant", query = "SELECT p FROM Polsdemi p WHERE p.anxant = :anxant"),
    @NamedQuery(name = "Polsdemi.findByIntaseg", query = "SELECT p FROM Polsdemi p WHERE p.intaseg = :intaseg"),
    @NamedQuery(name = "Polsdemi.findByTipoEndoso", query = "SELECT p FROM Polsdemi p WHERE p.tipoEndoso = :tipoEndoso"),
    @NamedQuery(name = "Polsdemi.findByCodPrendario", query = "SELECT p FROM Polsdemi p WHERE p.codPrendario = :codPrendario"),
    @NamedQuery(name = "Polsdemi.findByNroEntrada", query = "SELECT p FROM Polsdemi p WHERE p.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "Polsdemi.findByPolant", query = "SELECT p FROM Polsdemi p WHERE p.polant = :polant"),
    @NamedQuery(name = "Polsdemi.findByCodEntidad", query = "SELECT p FROM Polsdemi p WHERE p.codEntidad = :codEntidad"),
    @NamedQuery(name = "Polsdemi.findByNroTarjeta", query = "SELECT p FROM Polsdemi p WHERE p.nroTarjeta = :nroTarjeta"),
    @NamedQuery(name = "Polsdemi.findByAnexoAnulado", query = "SELECT p FROM Polsdemi p WHERE p.anexoAnulado = :anexoAnulado"),
    @NamedQuery(name = "Polsdemi.findByEmpEstado", query = "SELECT p FROM Polsdemi p WHERE p.empEstado = :empEstado"),
    @NamedQuery(name = "Polsdemi.findByPlaya", query = "SELECT p FROM Polsdemi p WHERE p.playa = :playa"),
    @NamedQuery(name = "Polsdemi.findByCentro", query = "SELECT p FROM Polsdemi p WHERE p.centro = :centro"),
    @NamedQuery(name = "Polsdemi.findByFormaParte", query = "SELECT p FROM Polsdemi p WHERE p.formaParte = :formaParte"),
    @NamedQuery(name = "Polsdemi.findByPorLicitacion", query = "SELECT p FROM Polsdemi p WHERE p.porLicitacion = :porLicitacion"),
    @NamedQuery(name = "Polsdemi.findByFronting", query = "SELECT p FROM Polsdemi p WHERE p.fronting = :fronting"),
    @NamedQuery(name = "Polsdemi.findByVigFinal", query = "SELECT p FROM Polsdemi p WHERE p.vigFinal = :vigFinal"),
    @NamedQuery(name = "Polsdemi.findByUltPago", query = "SELECT p FROM Polsdemi p WHERE p.ultPago = :ultPago"),
    @NamedQuery(name = "Polsdemi.findByPorcCesion", query = "SELECT p FROM Polsdemi p WHERE p.porcCesion = :porcCesion"),
    @NamedQuery(name = "Polsdemi.findByComisionCesion", query = "SELECT p FROM Polsdemi p WHERE p.comisionCesion = :comisionCesion"),
    @NamedQuery(name = "Polsdemi.findByFranquicia", query = "SELECT p FROM Polsdemi p WHERE p.franquicia = :franquicia"),
    @NamedQuery(name = "Polsdemi.findByPorcFranquicia", query = "SELECT p FROM Polsdemi p WHERE p.porcFranquicia = :porcFranquicia"),
    @NamedQuery(name = "Polsdemi.findByNotaCobertura", query = "SELECT p FROM Polsdemi p WHERE p.notaCobertura = :notaCobertura"),
    @NamedQuery(name = "Polsdemi.findByPromedioEdad", query = "SELECT p FROM Polsdemi p WHERE p.promedioEdad = :promedioEdad"),
    @NamedQuery(name = "Polsdemi.findByExtraPrima", query = "SELECT p FROM Polsdemi p WHERE p.extraPrima = :extraPrima"),
    @NamedQuery(name = "Polsdemi.findByNSub1", query = "SELECT p FROM Polsdemi p WHERE p.nSub1 = :nSub1"),
    @NamedQuery(name = "Polsdemi.findByAnulacion", query = "SELECT p FROM Polsdemi p WHERE p.anulacion = :anulacion"),
    @NamedQuery(name = "Polsdemi.findBySiniestros", query = "SELECT p FROM Polsdemi p WHERE p.siniestros = :siniestros"),
    @NamedQuery(name = "Polsdemi.findByUsuarioModifica", query = "SELECT p FROM Polsdemi p WHERE p.usuarioModifica = :usuarioModifica"),
    @NamedQuery(name = "Polsdemi.findByPctIva", query = "SELECT p FROM Polsdemi p WHERE p.pctIva = :pctIva"),
    @NamedQuery(name = "Polsdemi.findByPrimaReaseVida", query = "SELECT p FROM Polsdemi p WHERE p.primaReaseVida = :primaReaseVida"),
    @NamedQuery(name = "Polsdemi.findByPolnroRact", query = "SELECT p FROM Polsdemi p WHERE p.polnroRact = :polnroRact"),
    @NamedQuery(name = "Polsdemi.findByPctIvaRpf", query = "SELECT p FROM Polsdemi p WHERE p.pctIvaRpf = :pctIvaRpf"),
    @NamedQuery(name = "Polsdemi.findByNroFacturaAgte", query = "SELECT p FROM Polsdemi p WHERE p.nroFacturaAgte = :nroFacturaAgte"),
    @NamedQuery(name = "Polsdemi.findByPctComisOrganiza", query = "SELECT p FROM Polsdemi p WHERE p.pctComisOrganiza = :pctComisOrganiza"),
    @NamedQuery(name = "Polsdemi.findByNroRecibo", query = "SELECT p FROM Polsdemi p WHERE p.nroRecibo = :nroRecibo"),
    @NamedQuery(name = "Polsdemi.findByTextoEspecial", query = "SELECT p FROM Polsdemi p WHERE p.textoEspecial = :textoEspecial"),
    @NamedQuery(name = "Polsdemi.findByTipoAccPer", query = "SELECT p FROM Polsdemi p WHERE p.tipoAccPer = :tipoAccPer"),
    @NamedQuery(name = "Polsdemi.findByAnexoRenov", query = "SELECT p FROM Polsdemi p WHERE p.anexoRenov = :anexoRenov"),
    @NamedQuery(name = "Polsdemi.findByMayorVtoCuota", query = "SELECT p FROM Polsdemi p WHERE p.mayorVtoCuota = :mayorVtoCuota"),
    @NamedQuery(name = "Polsdemi.findBySos", query = "SELECT p FROM Polsdemi p WHERE p.sos = :sos"),
    @NamedQuery(name = "Polsdemi.findByTipoPrestacion", query = "SELECT p FROM Polsdemi p WHERE p.tipoPrestacion = :tipoPrestacion"),
    @NamedQuery(name = "Polsdemi.findByObservaciones", query = "SELECT p FROM Polsdemi p WHERE p.observaciones = :observaciones"),
    @NamedQuery(name = "Polsdemi.findByNroCotizacion", query = "SELECT p FROM Polsdemi p WHERE p.nroCotizacion = :nroCotizacion"),
    @NamedQuery(name = "Polsdemi.findByDeclaracion", query = "SELECT p FROM Polsdemi p WHERE p.declaracion = :declaracion"),
    @NamedQuery(name = "Polsdemi.findByNroCotizacionPack", query = "SELECT p FROM Polsdemi p WHERE p.nroCotizacionPack = :nroCotizacionPack")})
public class Polsdemi implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "polsdemi")
    private List<Certvida> certvidaList;
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PolsdemiPK polsdemiPK;
    @Basic(optional = false)
    @Column(name = "FECHA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "CERT_PROVISORIO")
    private Integer certProvisorio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "T_CAMBIO", nullable = false, precision = 10, scale = 5)
    private BigDecimal tCambio;
    @Basic(optional = false)
    @Column(name = "RENOV_POR", nullable = false)
    private int renovPor;
    @Basic(optional = false)
    @Column(name = "CANT_ITEM", nullable = false)
    private int cantItem;
    @Basic(optional = false)
    @Column(name = "VIGDES", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date vigdes;
    @Column(name = "VIGHAS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vighas;
    @Basic(optional = false)
    @Column(name = "CANT_DIAS", nullable = false)
    private int cantDias;
    @Basic(optional = false)
    @Column(name = "SUMASEG", nullable = false)
    private long sumaseg;
    @Basic(optional = false)
    @Column(name = "PRIMA", nullable = false)
    private long prima;
    @Basic(optional = false)
    @Column(name = "GTOS_ADMI", nullable = false)
    private long gtosAdmi;
    @Basic(optional = false)
    @Column(name = "RPF", nullable = false)
    private long rpf;
    @Basic(optional = false)
    @Column(name = "OTROS", nullable = false)
    private long otros;
    @Basic(optional = false)
    @Column(name = "IVA", nullable = false)
    private long iva;
    @Basic(optional = false)
    @Column(name = "PREMIO", nullable = false)
    private long premio;
    @Basic(optional = false)
    @Column(name = "PORC_COMAG", nullable = false, precision = 5, scale = 2)
    private BigDecimal porcComag;
    @Basic(optional = false)
    @Column(name = "IMP_COMAG", nullable = false)
    private long impComag;
    @Basic(optional = false)
    @Column(name = "PORC_COM", nullable = false, precision = 5, scale = 2)
    private BigDecimal porcCom;
    @Column(name = "PIN", length = 20)
    private String pin;
    @Column(name = "VTO_TARJETA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vtoTarjeta;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Basic(optional = false)
    @Column(name = "CAP_RETENIDO", nullable = false)
    private long capRetenido;
    @Basic(optional = false)
    @Column(name = "PRIMA_RETENIDA", nullable = false)
    private long primaRetenida;
    @Basic(optional = false)
    @Column(name = "PORC_RETENIDO", nullable = false, precision = 10, scale = 7)
    private BigDecimal porcRetenido;
    @Basic(optional = false)
    @Column(name = "CAP_CONTRATO", nullable = false)
    private long capContrato;
    @Basic(optional = false)
    @Column(name = "PRIMA_CONTRATO", nullable = false)
    private long primaContrato;
    @Basic(optional = false)
    @Column(name = "PORC_CONTRATO", nullable = false, precision = 10, scale = 7)
    private BigDecimal porcContrato;
    @Basic(optional = false)
    @Column(name = "CAP_FACULTATIVO", nullable = false)
    private long capFacultativo;
    @Basic(optional = false)
    @Column(name = "PRIMA_FACULTATIVO", nullable = false)
    private long primaFacultativo;
    @Basic(optional = false)
    @Column(name = "PORC_FACULTATIVO", nullable = false, precision = 10, scale = 7)
    private BigDecimal porcFacultativo;
    @Basic(optional = false)
    @Column(name = "ESTADO", nullable = false)
    private short estado;
    @Column(name = "NRO_FACTURA")
    private Long nroFactura;
    @Basic(optional = false)
    @Column(name = "INICIAL", nullable = false)
    private long inicial;
    @Basic(optional = false)
    @Column(name = "NRO_CUOTAS", nullable = false)
    private short nroCuotas;
    @Basic(optional = false)
    @Column(name = "IMP_CUOTAS", nullable = false, precision = 15, scale = 2)
    private BigDecimal impCuotas;
    @Basic(optional = false)
    @Column(name = "ANXANT", nullable = false)
    private short anxant;
    @Basic(optional = false)
    @Column(name = "INTASEG", nullable = false, length = 150)
    private String intaseg;
    @Column(name = "TIPO_ENDOSO")
    private Short tipoEndoso;
    @Column(name = "COD_PRENDARIO")
    private Short codPrendario;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @Basic(optional = false)
    @Column(name = "POLANT", nullable = false)
    private int polant;
    @Column(name = "COD_ENTIDAD")
    private Short codEntidad;
    @Column(name = "NRO_TARJETA", length = 30)
    private String nroTarjeta;
    @Basic(optional = false)
    @Column(name = "ANEXO_ANULADO", nullable = false)
    private short anexoAnulado;
    @Basic(optional = false)
    @Column(name = "EMP_ESTADO", nullable = false)
    private short empEstado;
    @Basic(optional = false)
    @Column(name = "PLAYA", nullable = false)
    private short playa;
    @Basic(optional = false)
    @Column(name = "CENTRO", nullable = false)
    private short centro;
    @Column(name = "FORMA_PARTE", length = 350)
    private String formaParte;
    @Basic(optional = false)
    @Column(name = "POR_LICITACION", nullable = false)
    private short porLicitacion;
    @Basic(optional = false)
    @Column(name = "FRONTING", nullable = false)
    private short fronting;
    @Column(name = "VIG_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vigFinal;
    @Column(name = "ULT_PAGO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultPago;
    @Basic(optional = false)
    @Column(name = "PORC_CESION", nullable = false, precision = 6, scale = 3)
    private BigDecimal porcCesion;
    @Basic(optional = false)
    @Column(name = "COMISION_CESION", nullable = false)
    private long comisionCesion;
    @Basic(optional = false)
    @Column(name = "FRANQUICIA", nullable = false)
    private long franquicia;
    @Basic(optional = false)
    @Column(name = "PORC_FRANQUICIA", nullable = false, precision = 5, scale = 2)
    private BigDecimal porcFranquicia;
    @Column(name = "NOTA_COBERTURA", length = 20)
    private String notaCobertura;
    @Column(name = "PROMEDIO_EDAD")
    private Short promedioEdad;
    @Basic(optional = false)
    @Column(name = "EXTRA_PRIMA", nullable = false)
    private long extraPrima;
    @Column(name = "N_SUB1")
    private Integer nSub1;
    @Column(name = "ANULACION")
    private Short anulacion;
    @Column(name = "SINIESTROS")
    private Short siniestros;
    @Column(name = "USUARIO_MODIFICA")
    private Short usuarioModifica;
    @Basic(optional = false)
    @Column(name = "PCT_IVA", nullable = false, precision = 6, scale = 3)
    private BigDecimal pctIva;
    @Basic(optional = false)
    @Column(name = "PRIMA_REASE_VIDA", nullable = false, precision = 17, scale = 2)
    private BigDecimal primaReaseVida;
    @Column(name = "POLNRO_RACT", length = 30)
    private String polnroRact;
    @Basic(optional = false)
    @Column(name = "PCT_IVA_RPF", nullable = false, precision = 6, scale = 3)
    private BigDecimal pctIvaRpf;
    @Column(name = "NRO_FACTURA_AGTE", length = 15)
    private String nroFacturaAgte;
    @Basic(optional = false)
    @Column(name = "PCT_COMIS_ORGANIZA", nullable = false, precision = 5, scale = 2)
    private BigDecimal pctComisOrganiza;
    @Column(name = "NRO_RECIBO")
    private Long nroRecibo;
    @Column(name = "TEXTO_ESPECIAL", length = 4000)
    private String textoEspecial;
    @Column(name = "TIPO_ACC_PER")
    private Short tipoAccPer;
    @Basic(optional = false)
    @Column(name = "ANEXO_RENOV", nullable = false)
    private short anexoRenov;
    @Column(name = "MAYOR_VTO_CUOTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mayorVtoCuota;
    @Column(name = "SOS")
    private Short sos;
    @Basic(optional = false)
    @Column(name = "TIPO_PRESTACION", nullable = false)
    private short tipoPrestacion;
    @Column(name = "OBSERVACIONES", length = 500)
    private String observaciones;
    @Basic(optional = false)
    @Column(name = "NRO_COTIZACION", nullable = false)
    private long nroCotizacion;
    @Column(name = "DECLARACION", length = 1)
    private String declaracion;
    @Column(name = "NRO_COTIZACION_PACK")
    private Long nroCotizacionPack;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "polsdemi")
    private PolsdemiClasifica polsdemiClasifica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "polsdemi")
    private List<Districoase> districoaseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "polsdemi")
    private List<ItemDePolizasMe> itemDePolizasMeList;
    @JoinColumn(name = "COD_AGCIA", referencedColumnName = "COD_AGCIA", nullable = false)
    @ManyToOne(optional = false)
    private Agencias codAgcia;
    @JoinColumn(name = "COD_FORMA_PAGO", referencedColumnName = "COD_FORMA_PAGO", nullable = false)
    @ManyToOne(optional = false)
    private FormasPago codFormaPago;
    @JoinColumn(name = "CIA_CEDENTE", referencedColumnName = "N_CIA")
    @ManyToOne
    private Lisciare ciaCedente;
    @JoinColumn(name = "N_AGTE", referencedColumnName = "N_AGTE", nullable = false)
    @ManyToOne(optional = false)
    private Listagte nAgte;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;
    @JoinColumn(name = "N_ASEG", referencedColumnName = "N_ASEG", nullable = false)
    @ManyToOne(optional = false)
    private Listaseg nAseg;
    @JoinColumn(name = "N_COBR", referencedColumnName = "N_COBR", nullable = false)
    @ManyToOne(optional = false)
    private Listcobr nCobr;
    @JoinColumn(name = "SECC", referencedColumnName = "SECC", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Listsecc listsecc;
    @JoinColumn(name = "COD_USUARIO_PROCESO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuarioProceso;
    @JoinColumn(name = "COD_MONEY", referencedColumnName = "COD_MONEY", nullable = false)
    @ManyToOne(optional = false)
    private Monedas codMoney;
    @JoinColumn(name = "COD_ORGANIZADOR", referencedColumnName = "COD_ORGANIZADOR", nullable = false)
    @ManyToOne(optional = false)
    private Organizadores codOrganizador;
    @JoinColumn(name = "COD_TIPCOBRO", referencedColumnName = "COD_TIPCOBRO")
    @ManyToOne
    private TiposCobros codTipcobro;
    @JoinColumn(name = "TIPO_ORGANIZADOR", referencedColumnName = "COD_TIPO", nullable = false)
    @ManyToOne(optional = false)
    private TiposOrganizadores tipoOrganizador;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "polsdemi")
    private Policoase policoase;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "polsdemi")
    private List<ItemDePolizas> itemDePolizasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "polsdemi")
    private List<PolsdemiServicios> polsdemiServiciosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "polsdemi")
    private List<ItemPolizasCoaseguro> itemPolizasCoaseguroList;

    public Polsdemi() {
    }

    public Polsdemi(PolsdemiPK polsdemiPK) {
        this.polsdemiPK = polsdemiPK;
    }

    public Polsdemi(PolsdemiPK polsdemiPK, Date fecha, BigDecimal tCambio, int renovPor, int cantItem, Date vigdes, int cantDias, long sumaseg, long prima, long gtosAdmi, long rpf, long otros, long iva, long premio, BigDecimal porcComag, long impComag, BigDecimal porcCom, Date fechaCarga, long capRetenido, long primaRetenida, BigDecimal porcRetenido, long capContrato, long primaContrato, BigDecimal porcContrato, long capFacultativo, long primaFacultativo, BigDecimal porcFacultativo, short estado, long inicial, short nroCuotas, BigDecimal impCuotas, short anxant, String intaseg, int nroEntrada, int polant, short anexoAnulado, short empEstado, short playa, short centro, short porLicitacion, short fronting, BigDecimal porcCesion, long comisionCesion, long franquicia, BigDecimal porcFranquicia, long extraPrima, BigDecimal pctIva, BigDecimal primaReaseVida, BigDecimal pctIvaRpf, BigDecimal pctComisOrganiza, short anexoRenov, short tipoPrestacion, long nroCotizacion) {
        this.polsdemiPK = polsdemiPK;
        this.fecha = fecha;
        this.tCambio = tCambio;
        this.renovPor = renovPor;
        this.cantItem = cantItem;
        this.vigdes = vigdes;
        this.cantDias = cantDias;
        this.sumaseg = sumaseg;
        this.prima = prima;
        this.gtosAdmi = gtosAdmi;
        this.rpf = rpf;
        this.otros = otros;
        this.iva = iva;
        this.premio = premio;
        this.porcComag = porcComag;
        this.impComag = impComag;
        this.porcCom = porcCom;
        this.fechaCarga = fechaCarga;
        this.capRetenido = capRetenido;
        this.primaRetenida = primaRetenida;
        this.porcRetenido = porcRetenido;
        this.capContrato = capContrato;
        this.primaContrato = primaContrato;
        this.porcContrato = porcContrato;
        this.capFacultativo = capFacultativo;
        this.primaFacultativo = primaFacultativo;
        this.porcFacultativo = porcFacultativo;
        this.estado = estado;
        this.inicial = inicial;
        this.nroCuotas = nroCuotas;
        this.impCuotas = impCuotas;
        this.anxant = anxant;
        this.intaseg = intaseg;
        this.nroEntrada = nroEntrada;
        this.polant = polant;
        this.anexoAnulado = anexoAnulado;
        this.empEstado = empEstado;
        this.playa = playa;
        this.centro = centro;
        this.porLicitacion = porLicitacion;
        this.fronting = fronting;
        this.porcCesion = porcCesion;
        this.comisionCesion = comisionCesion;
        this.franquicia = franquicia;
        this.porcFranquicia = porcFranquicia;
        this.extraPrima = extraPrima;
        this.pctIva = pctIva;
        this.primaReaseVida = primaReaseVida;
        this.pctIvaRpf = pctIvaRpf;
        this.pctComisOrganiza = pctComisOrganiza;
        this.anexoRenov = anexoRenov;
        this.tipoPrestacion = tipoPrestacion;
        this.nroCotizacion = nroCotizacion;
    }

    public Polsdemi(short tipoSeguro, short tipoOperacion, short ejercicio, short secc, int polnro, short anexo) {
        this.polsdemiPK = new PolsdemiPK(tipoSeguro, tipoOperacion, ejercicio, secc, polnro, anexo);
    }

    public PolsdemiPK getPolsdemiPK() {
        return polsdemiPK;
    }

    public void setPolsdemiPK(PolsdemiPK polsdemiPK) {
        this.polsdemiPK = polsdemiPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getCertProvisorio() {
        return certProvisorio;
    }

    public void setCertProvisorio(Integer certProvisorio) {
        this.certProvisorio = certProvisorio;
    }

    public BigDecimal getTCambio() {
        return tCambio;
    }

    public void setTCambio(BigDecimal tCambio) {
        this.tCambio = tCambio;
    }

    public int getRenovPor() {
        return renovPor;
    }

    public void setRenovPor(int renovPor) {
        this.renovPor = renovPor;
    }

    public int getCantItem() {
        return cantItem;
    }

    public void setCantItem(int cantItem) {
        this.cantItem = cantItem;
    }

    public Date getVigdes() {
        return vigdes;
    }

    public void setVigdes(Date vigdes) {
        this.vigdes = vigdes;
    }

    public Date getVighas() {
        return vighas;
    }

    public void setVighas(Date vighas) {
        this.vighas = vighas;
    }

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public long getSumaseg() {
        return sumaseg;
    }

    public void setSumaseg(long sumaseg) {
        this.sumaseg = sumaseg;
    }

    public long getPrima() {
        return prima;
    }

    public void setPrima(long prima) {
        this.prima = prima;
    }

    public long getGtosAdmi() {
        return gtosAdmi;
    }

    public void setGtosAdmi(long gtosAdmi) {
        this.gtosAdmi = gtosAdmi;
    }

    public long getRpf() {
        return rpf;
    }

    public void setRpf(long rpf) {
        this.rpf = rpf;
    }

    public long getOtros() {
        return otros;
    }

    public void setOtros(long otros) {
        this.otros = otros;
    }

    public long getIva() {
        return iva;
    }

    public void setIva(long iva) {
        this.iva = iva;
    }

    public long getPremio() {
        return premio;
    }

    public void setPremio(long premio) {
        this.premio = premio;
    }

    public BigDecimal getPorcComag() {
        return porcComag;
    }

    public void setPorcComag(BigDecimal porcComag) {
        this.porcComag = porcComag;
    }

    public long getImpComag() {
        return impComag;
    }

    public void setImpComag(long impComag) {
        this.impComag = impComag;
    }

    public BigDecimal getPorcCom() {
        return porcCom;
    }

    public void setPorcCom(BigDecimal porcCom) {
        this.porcCom = porcCom;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Date getVtoTarjeta() {
        return vtoTarjeta;
    }

    public void setVtoTarjeta(Date vtoTarjeta) {
        this.vtoTarjeta = vtoTarjeta;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public long getCapRetenido() {
        return capRetenido;
    }

    public void setCapRetenido(long capRetenido) {
        this.capRetenido = capRetenido;
    }

    public long getPrimaRetenida() {
        return primaRetenida;
    }

    public void setPrimaRetenida(long primaRetenida) {
        this.primaRetenida = primaRetenida;
    }

    public BigDecimal getPorcRetenido() {
        return porcRetenido;
    }

    public void setPorcRetenido(BigDecimal porcRetenido) {
        this.porcRetenido = porcRetenido;
    }

    public long getCapContrato() {
        return capContrato;
    }

    public void setCapContrato(long capContrato) {
        this.capContrato = capContrato;
    }

    public long getPrimaContrato() {
        return primaContrato;
    }

    public void setPrimaContrato(long primaContrato) {
        this.primaContrato = primaContrato;
    }

    public BigDecimal getPorcContrato() {
        return porcContrato;
    }

    public void setPorcContrato(BigDecimal porcContrato) {
        this.porcContrato = porcContrato;
    }

    public long getCapFacultativo() {
        return capFacultativo;
    }

    public void setCapFacultativo(long capFacultativo) {
        this.capFacultativo = capFacultativo;
    }

    public long getPrimaFacultativo() {
        return primaFacultativo;
    }

    public void setPrimaFacultativo(long primaFacultativo) {
        this.primaFacultativo = primaFacultativo;
    }

    public BigDecimal getPorcFacultativo() {
        return porcFacultativo;
    }

    public void setPorcFacultativo(BigDecimal porcFacultativo) {
        this.porcFacultativo = porcFacultativo;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public Long getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(Long nroFactura) {
        this.nroFactura = nroFactura;
    }

    public long getInicial() {
        return inicial;
    }

    public void setInicial(long inicial) {
        this.inicial = inicial;
    }

    public short getNroCuotas() {
        return nroCuotas;
    }

    public void setNroCuotas(short nroCuotas) {
        this.nroCuotas = nroCuotas;
    }

    public BigDecimal getImpCuotas() {
        return impCuotas;
    }

    public void setImpCuotas(BigDecimal impCuotas) {
        this.impCuotas = impCuotas;
    }

    public short getAnxant() {
        return anxant;
    }

    public void setAnxant(short anxant) {
        this.anxant = anxant;
    }

    public String getIntaseg() {
        return intaseg;
    }

    public void setIntaseg(String intaseg) {
        this.intaseg = intaseg;
    }

    public Short getTipoEndoso() {
        return tipoEndoso;
    }

    public void setTipoEndoso(Short tipoEndoso) {
        this.tipoEndoso = tipoEndoso;
    }

    public Short getCodPrendario() {
        return codPrendario;
    }

    public void setCodPrendario(Short codPrendario) {
        this.codPrendario = codPrendario;
    }

    public int getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(int nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public int getPolant() {
        return polant;
    }

    public void setPolant(int polant) {
        this.polant = polant;
    }

    public Short getCodEntidad() {
        return codEntidad;
    }

    public void setCodEntidad(Short codEntidad) {
        this.codEntidad = codEntidad;
    }

    public String getNroTarjeta() {
        return nroTarjeta;
    }

    public void setNroTarjeta(String nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    public short getAnexoAnulado() {
        return anexoAnulado;
    }

    public void setAnexoAnulado(short anexoAnulado) {
        this.anexoAnulado = anexoAnulado;
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

    public short getCentro() {
        return centro;
    }

    public void setCentro(short centro) {
        this.centro = centro;
    }

    public String getFormaParte() {
        return formaParte;
    }

    public void setFormaParte(String formaParte) {
        this.formaParte = formaParte;
    }

    public short getPorLicitacion() {
        return porLicitacion;
    }

    public void setPorLicitacion(short porLicitacion) {
        this.porLicitacion = porLicitacion;
    }

    public short getFronting() {
        return fronting;
    }

    public void setFronting(short fronting) {
        this.fronting = fronting;
    }

    public Date getVigFinal() {
        return vigFinal;
    }

    public void setVigFinal(Date vigFinal) {
        this.vigFinal = vigFinal;
    }

    public Date getUltPago() {
        return ultPago;
    }

    public void setUltPago(Date ultPago) {
        this.ultPago = ultPago;
    }

    public BigDecimal getPorcCesion() {
        return porcCesion;
    }

    public void setPorcCesion(BigDecimal porcCesion) {
        this.porcCesion = porcCesion;
    }

    public long getComisionCesion() {
        return comisionCesion;
    }

    public void setComisionCesion(long comisionCesion) {
        this.comisionCesion = comisionCesion;
    }

    public long getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(long franquicia) {
        this.franquicia = franquicia;
    }

    public BigDecimal getPorcFranquicia() {
        return porcFranquicia;
    }

    public void setPorcFranquicia(BigDecimal porcFranquicia) {
        this.porcFranquicia = porcFranquicia;
    }

    public String getNotaCobertura() {
        return notaCobertura;
    }

    public void setNotaCobertura(String notaCobertura) {
        this.notaCobertura = notaCobertura;
    }

    public Short getPromedioEdad() {
        return promedioEdad;
    }

    public void setPromedioEdad(Short promedioEdad) {
        this.promedioEdad = promedioEdad;
    }

    public long getExtraPrima() {
        return extraPrima;
    }

    public void setExtraPrima(long extraPrima) {
        this.extraPrima = extraPrima;
    }

    public Integer getNSub1() {
        return nSub1;
    }

    public void setNSub1(Integer nSub1) {
        this.nSub1 = nSub1;
    }

    public Short getAnulacion() {
        return anulacion;
    }

    public void setAnulacion(Short anulacion) {
        this.anulacion = anulacion;
    }

    public Short getSiniestros() {
        return siniestros;
    }

    public void setSiniestros(Short siniestros) {
        this.siniestros = siniestros;
    }

    public Short getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(Short usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    public BigDecimal getPctIva() {
        return pctIva;
    }

    public void setPctIva(BigDecimal pctIva) {
        this.pctIva = pctIva;
    }

    public BigDecimal getPrimaReaseVida() {
        return primaReaseVida;
    }

    public void setPrimaReaseVida(BigDecimal primaReaseVida) {
        this.primaReaseVida = primaReaseVida;
    }

    public String getPolnroRact() {
        return polnroRact;
    }

    public void setPolnroRact(String polnroRact) {
        this.polnroRact = polnroRact;
    }

    public BigDecimal getPctIvaRpf() {
        return pctIvaRpf;
    }

    public void setPctIvaRpf(BigDecimal pctIvaRpf) {
        this.pctIvaRpf = pctIvaRpf;
    }

    public String getNroFacturaAgte() {
        return nroFacturaAgte;
    }

    public void setNroFacturaAgte(String nroFacturaAgte) {
        this.nroFacturaAgte = nroFacturaAgte;
    }

    public BigDecimal getPctComisOrganiza() {
        return pctComisOrganiza;
    }

    public void setPctComisOrganiza(BigDecimal pctComisOrganiza) {
        this.pctComisOrganiza = pctComisOrganiza;
    }

    public Long getNroRecibo() {
        return nroRecibo;
    }

    public void setNroRecibo(Long nroRecibo) {
        this.nroRecibo = nroRecibo;
    }

    public String getTextoEspecial() {
        return textoEspecial;
    }

    public void setTextoEspecial(String textoEspecial) {
        this.textoEspecial = textoEspecial;
    }

    public Short getTipoAccPer() {
        return tipoAccPer;
    }

    public void setTipoAccPer(Short tipoAccPer) {
        this.tipoAccPer = tipoAccPer;
    }

    public short getAnexoRenov() {
        return anexoRenov;
    }

    public void setAnexoRenov(short anexoRenov) {
        this.anexoRenov = anexoRenov;
    }

    public Date getMayorVtoCuota() {
        return mayorVtoCuota;
    }

    public void setMayorVtoCuota(Date mayorVtoCuota) {
        this.mayorVtoCuota = mayorVtoCuota;
    }

    public Short getSos() {
        return sos;
    }

    public void setSos(Short sos) {
        this.sos = sos;
    }

    public short getTipoPrestacion() {
        return tipoPrestacion;
    }

    public void setTipoPrestacion(short tipoPrestacion) {
        this.tipoPrestacion = tipoPrestacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public long getNroCotizacion() {
        return nroCotizacion;
    }

    public void setNroCotizacion(long nroCotizacion) {
        this.nroCotizacion = nroCotizacion;
    }

    public String getDeclaracion() {
        return declaracion;
    }

    public void setDeclaracion(String declaracion) {
        this.declaracion = declaracion;
    }

    public Long getNroCotizacionPack() {
        return nroCotizacionPack;
    }

    public void setNroCotizacionPack(Long nroCotizacionPack) {
        this.nroCotizacionPack = nroCotizacionPack;
    }

    public PolsdemiClasifica getPolsdemiClasifica() {
        return polsdemiClasifica;
    }

    public void setPolsdemiClasifica(PolsdemiClasifica polsdemiClasifica) {
        this.polsdemiClasifica = polsdemiClasifica;
    }

    public List<Districoase> getDistricoaseList() {
        return districoaseList;
    }

    public void setDistricoaseList(List<Districoase> districoaseList) {
        this.districoaseList = districoaseList;
    }

    public List<ItemDePolizasMe> getItemDePolizasMeList() {
        return itemDePolizasMeList;
    }

    public void setItemDePolizasMeList(List<ItemDePolizasMe> itemDePolizasMeList) {
        this.itemDePolizasMeList = itemDePolizasMeList;
    }

    public Agencias getCodAgcia() {
        return codAgcia;
    }

    public void setCodAgcia(Agencias codAgcia) {
        this.codAgcia = codAgcia;
    }

    public FormasPago getCodFormaPago() {
        return codFormaPago;
    }

    public void setCodFormaPago(FormasPago codFormaPago) {
        this.codFormaPago = codFormaPago;
    }

    public Lisciare getCiaCedente() {
        return ciaCedente;
    }

    public void setCiaCedente(Lisciare ciaCedente) {
        this.ciaCedente = ciaCedente;
    }

    public Listagte getNAgte() {
        return nAgte;
    }

    public void setNAgte(Listagte nAgte) {
        this.nAgte = nAgte;
    }

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Listaseg getNAseg() {
        return nAseg;
    }

    public void setNAseg(Listaseg nAseg) {
        this.nAseg = nAseg;
    }

    public Listcobr getNCobr() {
        return nCobr;
    }

    public void setNCobr(Listcobr nCobr) {
        this.nCobr = nCobr;
    }

    public Listsecc getListsecc() {
        return listsecc;
    }

    public void setListsecc(Listsecc listsecc) {
        this.listsecc = listsecc;
    }

    public Usuarios getCodUsuarioProceso() {
        return codUsuarioProceso;
    }

    public void setCodUsuarioProceso(Usuarios codUsuarioProceso) {
        this.codUsuarioProceso = codUsuarioProceso;
    }

    public Monedas getCodMoney() {
        return codMoney;
    }

    public void setCodMoney(Monedas codMoney) {
        this.codMoney = codMoney;
    }

    public Organizadores getCodOrganizador() {
        return codOrganizador;
    }

    public void setCodOrganizador(Organizadores codOrganizador) {
        this.codOrganizador = codOrganizador;
    }

    public TiposCobros getCodTipcobro() {
        return codTipcobro;
    }

    public void setCodTipcobro(TiposCobros codTipcobro) {
        this.codTipcobro = codTipcobro;
    }

    public TiposOrganizadores getTipoOrganizador() {
        return tipoOrganizador;
    }

    public void setTipoOrganizador(TiposOrganizadores tipoOrganizador) {
        this.tipoOrganizador = tipoOrganizador;
    }

    public Policoase getPolicoase() {
        return policoase;
    }

    public void setPolicoase(Policoase policoase) {
        this.policoase = policoase;
    }

    public List<ItemDePolizas> getItemDePolizasList() {
        return itemDePolizasList;
    }

    public void setItemDePolizasList(List<ItemDePolizas> itemDePolizasList) {
        this.itemDePolizasList = itemDePolizasList;
    }

    public List<PolsdemiServicios> getPolsdemiServiciosList() {
        return polsdemiServiciosList;
    }

    public void setPolsdemiServiciosList(List<PolsdemiServicios> polsdemiServiciosList) {
        this.polsdemiServiciosList = polsdemiServiciosList;
    }

    public List<ItemPolizasCoaseguro> getItemPolizasCoaseguroList() {
        return itemPolizasCoaseguroList;
    }

    public void setItemPolizasCoaseguroList(List<ItemPolizasCoaseguro> itemPolizasCoaseguroList) {
        this.itemPolizasCoaseguroList = itemPolizasCoaseguroList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (polsdemiPK != null ? polsdemiPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Polsdemi)) {
            return false;
        }
        Polsdemi other = (Polsdemi) object;
        if ((this.polsdemiPK == null && other.polsdemiPK != null) || (this.polsdemiPK != null && !this.polsdemiPK.equals(other.polsdemiPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Polsdemi[ polsdemiPK=" + polsdemiPK + " ]";
    }

    public List<Certvida> getCertvidaList() {
        return certvidaList;
    }

    public void setCertvidaList(List<Certvida> certvidaList) {
        this.certvidaList = certvidaList;
    }
    
}
