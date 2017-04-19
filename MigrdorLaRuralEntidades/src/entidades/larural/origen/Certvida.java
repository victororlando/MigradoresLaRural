/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "CERTVIDA", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "Certvida.findAll", query = "SELECT c FROM Certvida c"),
    @NamedQuery(name = "Certvida.findByEjercicio", query = "SELECT c FROM Certvida c WHERE c.certvidaPK.ejercicio = :ejercicio"),
    @NamedQuery(name = "Certvida.findByTipoSeguro", query = "SELECT c FROM Certvida c WHERE c.certvidaPK.tipoSeguro = :tipoSeguro"),
    @NamedQuery(name = "Certvida.findByTipoOperacion", query = "SELECT c FROM Certvida c WHERE c.certvidaPK.tipoOperacion = :tipoOperacion"),
    @NamedQuery(name = "Certvida.findBySecc", query = "SELECT c FROM Certvida c WHERE c.certvidaPK.secc = :secc"),
    @NamedQuery(name = "Certvida.findByPolnro", query = "SELECT c FROM Certvida c WHERE c.certvidaPK.polnro = :polnro"),
    @NamedQuery(name = "Certvida.findByAnexo", query = "SELECT c FROM Certvida c WHERE c.certvidaPK.anexo = :anexo"),
    @NamedQuery(name = "Certvida.findByNroCert", query = "SELECT c FROM Certvida c WHERE c.certvidaPK.nroCert = :nroCert"),
    @NamedQuery(name = "Certvida.findByVigdes", query = "SELECT c FROM Certvida c WHERE c.vigdes = :vigdes"),
    @NamedQuery(name = "Certvida.findByVighas", query = "SELECT c FROM Certvida c WHERE c.vighas = :vighas"),
    @NamedQuery(name = "Certvida.findByTipoPlazo", query = "SELECT c FROM Certvida c WHERE c.tipoPlazo = :tipoPlazo"),
    @NamedQuery(name = "Certvida.findByPlazo", query = "SELECT c FROM Certvida c WHERE c.plazo = :plazo"),
    @NamedQuery(name = "Certvida.findBySumaseg", query = "SELECT c FROM Certvida c WHERE c.sumaseg = :sumaseg"),
    @NamedQuery(name = "Certvida.findByPremio", query = "SELECT c FROM Certvida c WHERE c.premio = :premio"),
    @NamedQuery(name = "Certvida.findByPrimaContrato", query = "SELECT c FROM Certvida c WHERE c.primaContrato = :primaContrato"),
    @NamedQuery(name = "Certvida.findByPorcRetenido", query = "SELECT c FROM Certvida c WHERE c.porcRetenido = :porcRetenido"),
    @NamedQuery(name = "Certvida.findByPorcFacultativo", query = "SELECT c FROM Certvida c WHERE c.porcFacultativo = :porcFacultativo"),
    @NamedQuery(name = "Certvida.findByPrimaRetenida", query = "SELECT c FROM Certvida c WHERE c.primaRetenida = :primaRetenida"),
    @NamedQuery(name = "Certvida.findByPrimaFacultativo", query = "SELECT c FROM Certvida c WHERE c.primaFacultativo = :primaFacultativo"),
    @NamedQuery(name = "Certvida.findByCapContrato", query = "SELECT c FROM Certvida c WHERE c.capContrato = :capContrato"),
    @NamedQuery(name = "Certvida.findByCapRetenido", query = "SELECT c FROM Certvida c WHERE c.capRetenido = :capRetenido"),
    @NamedQuery(name = "Certvida.findByPorcContrato", query = "SELECT c FROM Certvida c WHERE c.porcContrato = :porcContrato"),
    @NamedQuery(name = "Certvida.findByCapFacultativo", query = "SELECT c FROM Certvida c WHERE c.capFacultativo = :capFacultativo"),
    @NamedQuery(name = "Certvida.findBySumasegMe", query = "SELECT c FROM Certvida c WHERE c.sumasegMe = :sumasegMe"),
    @NamedQuery(name = "Certvida.findByPremioMe", query = "SELECT c FROM Certvida c WHERE c.premioMe = :premioMe"),
    @NamedQuery(name = "Certvida.findByNroOrden", query = "SELECT c FROM Certvida c WHERE c.nroOrden = :nroOrden"),
    @NamedQuery(name = "Certvida.findByFechaCarga", query = "SELECT c FROM Certvida c WHERE c.fechaCarga = :fechaCarga"),
    @NamedQuery(name = "Certvida.findByNroEntrada", query = "SELECT c FROM Certvida c WHERE c.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "Certvida.findByDiasPlazo", query = "SELECT c FROM Certvida c WHERE c.diasPlazo = :diasPlazo"),
    @NamedQuery(name = "Certvida.findByTasaAsignadaVida", query = "SELECT c FROM Certvida c WHERE c.tasaAsignadaVida = :tasaAsignadaVida"),
    @NamedQuery(name = "Certvida.findByTasaReaseguro", query = "SELECT c FROM Certvida c WHERE c.tasaReaseguro = :tasaReaseguro"),
    @NamedQuery(name = "Certvida.findByFormaPlazo", query = "SELECT c FROM Certvida c WHERE c.formaPlazo = :formaPlazo"),
    @NamedQuery(name = "Certvida.findByExcluido", query = "SELECT c FROM Certvida c WHERE c.excluido = :excluido"),
    @NamedQuery(name = "Certvida.findByUsuarioExcluye", query = "SELECT c FROM Certvida c WHERE c.usuarioExcluye = :usuarioExcluye"),
    @NamedQuery(name = "Certvida.findByPrima", query = "SELECT c FROM Certvida c WHERE c.prima = :prima"),
    @NamedQuery(name = "Certvida.findByPrimaMe", query = "SELECT c FROM Certvida c WHERE c.primaMe = :primaMe"),
    @NamedQuery(name = "Certvida.findByGtspol", query = "SELECT c FROM Certvida c WHERE c.gtspol = :gtspol"),
    @NamedQuery(name = "Certvida.findByGtspolMe", query = "SELECT c FROM Certvida c WHERE c.gtspolMe = :gtspolMe"),
    @NamedQuery(name = "Certvida.findByImporteCuota", query = "SELECT c FROM Certvida c WHERE c.importeCuota = :importeCuota"),
    @NamedQuery(name = "Certvida.findByImporteCuotaMe", query = "SELECT c FROM Certvida c WHERE c.importeCuotaMe = :importeCuotaMe"),
    @NamedQuery(name = "Certvida.findByPctGtos", query = "SELECT c FROM Certvida c WHERE c.pctGtos = :pctGtos"),
    @NamedQuery(name = "Certvida.findByNroCuotas", query = "SELECT c FROM Certvida c WHERE c.nroCuotas = :nroCuotas"),
    @NamedQuery(name = "Certvida.findByPctTasa", query = "SELECT c FROM Certvida c WHERE c.pctTasa = :pctTasa"),
    @NamedQuery(name = "Certvida.findByCodigoTasa", query = "SELECT c FROM Certvida c WHERE c.codigoTasa = :codigoTasa"),
    @NamedQuery(name = "Certvida.findByTextoCertificado", query = "SELECT c FROM Certvida c WHERE c.textoCertificado = :textoCertificado"),
    @NamedQuery(name = "Certvida.findByObservacion", query = "SELECT c FROM Certvida c WHERE c.observacion = :observacion"),
    @NamedQuery(name = "Certvida.findByPctExtraPrima", query = "SELECT c FROM Certvida c WHERE c.pctExtraPrima = :pctExtraPrima"),
    @NamedQuery(name = "Certvida.findByExtraPrima", query = "SELECT c FROM Certvida c WHERE c.extraPrima = :extraPrima"),
    @NamedQuery(name = "Certvida.findByExtraPrimaMe", query = "SELECT c FROM Certvida c WHERE c.extraPrimaMe = :extraPrimaMe"),
    @NamedQuery(name = "Certvida.findByPromedioEdad", query = "SELECT c FROM Certvida c WHERE c.promedioEdad = :promedioEdad"),
    @NamedQuery(name = "Certvida.findByEdadAseg", query = "SELECT c FROM Certvida c WHERE c.edadAseg = :edadAseg"),
    @NamedQuery(name = "Certvida.findByTipoCalculoRease", query = "SELECT c FROM Certvida c WHERE c.tipoCalculoRease = :tipoCalculoRease"),
    @NamedQuery(name = "Certvida.findByRetencion", query = "SELECT c FROM Certvida c WHERE c.retencion = :retencion"),
    @NamedQuery(name = "Certvida.findByRetencionMe", query = "SELECT c FROM Certvida c WHERE c.retencionMe = :retencionMe"),
    @NamedQuery(name = "Certvida.findByCuotaParte", query = "SELECT c FROM Certvida c WHERE c.cuotaParte = :cuotaParte"),
    @NamedQuery(name = "Certvida.findByCuotaParteMe", query = "SELECT c FROM Certvida c WHERE c.cuotaParteMe = :cuotaParteMe"),
    @NamedQuery(name = "Certvida.findByPrimerExcedente", query = "SELECT c FROM Certvida c WHERE c.primerExcedente = :primerExcedente"),
    @NamedQuery(name = "Certvida.findByPrimerExcedenteMe", query = "SELECT c FROM Certvida c WHERE c.primerExcedenteMe = :primerExcedenteMe"),
    @NamedQuery(name = "Certvida.findByCesionRease", query = "SELECT c FROM Certvida c WHERE c.cesionRease = :cesionRease"),
    @NamedQuery(name = "Certvida.findByCesionReaseMe", query = "SELECT c FROM Certvida c WHERE c.cesionReaseMe = :cesionReaseMe"),
    @NamedQuery(name = "Certvida.findByFechaCesion", query = "SELECT c FROM Certvida c WHERE c.fechaCesion = :fechaCesion"),
    @NamedQuery(name = "Certvida.findByCodMoney", query = "SELECT c FROM Certvida c WHERE c.codMoney = :codMoney"),
    @NamedQuery(name = "Certvida.findByTCambio", query = "SELECT c FROM Certvida c WHERE c.tCambio = :tCambio"),
    @NamedQuery(name = "Certvida.findByCodAseg", query = "SELECT c FROM Certvida c WHERE c.codAseg = :codAseg"),
    @NamedQuery(name = "Certvida.findByCoberturas", query = "SELECT c FROM Certvida c WHERE c.coberturas = :coberturas"),
    @NamedQuery(name = "Certvida.findByPrimaReaseg", query = "SELECT c FROM Certvida c WHERE c.primaReaseg = :primaReaseg"),
    @NamedQuery(name = "Certvida.findByPrimaReasegMe", query = "SELECT c FROM Certvida c WHERE c.primaReasegMe = :primaReasegMe"),
    @NamedQuery(name = "Certvida.findByItem", query = "SELECT c FROM Certvida c WHERE c.item = :item"),
    @NamedQuery(name = "Certvida.findByCumulo", query = "SELECT c FROM Certvida c WHERE c.cumulo = :cumulo"),
    @NamedQuery(name = "Certvida.findByTipoAutorizaCumulo", query = "SELECT c FROM Certvida c WHERE c.tipoAutorizaCumulo = :tipoAutorizaCumulo"),
    @NamedQuery(name = "Certvida.findByUsuarioAutorizaCumulo", query = "SELECT c FROM Certvida c WHERE c.usuarioAutorizaCumulo = :usuarioAutorizaCumulo"),
    @NamedQuery(name = "Certvida.findByIva", query = "SELECT c FROM Certvida c WHERE c.iva = :iva"),
    @NamedQuery(name = "Certvida.findByIvaMe", query = "SELECT c FROM Certvida c WHERE c.ivaMe = :ivaMe"),
    @NamedQuery(name = "Certvida.findByTabla", query = "SELECT c FROM Certvida c WHERE c.tabla = :tabla"),
    @NamedQuery(name = "Certvida.findByPctTabla", query = "SELECT c FROM Certvida c WHERE c.pctTabla = :pctTabla"),
    @NamedQuery(name = "Certvida.findByPctVida", query = "SELECT c FROM Certvida c WHERE c.pctVida = :pctVida"),
    @NamedQuery(name = "Certvida.findByPctIp", query = "SELECT c FROM Certvida c WHERE c.pctIp = :pctIp"),
    @NamedQuery(name = "Certvida.findByPctOtros", query = "SELECT c FROM Certvida c WHERE c.pctOtros = :pctOtros"),
    @NamedQuery(name = "Certvida.findByCkPremio", query = "SELECT c FROM Certvida c WHERE c.ckPremio = :ckPremio"),
    @NamedQuery(name = "Certvida.findByPctVidaReaseg", query = "SELECT c FROM Certvida c WHERE c.pctVidaReaseg = :pctVidaReaseg"),
    @NamedQuery(name = "Certvida.findByPctIpReaseg", query = "SELECT c FROM Certvida c WHERE c.pctIpReaseg = :pctIpReaseg"),
    @NamedQuery(name = "Certvida.findByPctDiReaseg", query = "SELECT c FROM Certvida c WHERE c.pctDiReaseg = :pctDiReaseg"),
    @NamedQuery(name = "Certvida.findByPrimaVidaReaseg", query = "SELECT c FROM Certvida c WHERE c.primaVidaReaseg = :primaVidaReaseg"),
    @NamedQuery(name = "Certvida.findByPrimaIpReaseg", query = "SELECT c FROM Certvida c WHERE c.primaIpReaseg = :primaIpReaseg"),
    @NamedQuery(name = "Certvida.findByPrimaDiReaseg", query = "SELECT c FROM Certvida c WHERE c.primaDiReaseg = :primaDiReaseg"),
    @NamedQuery(name = "Certvida.findByCapCedido", query = "SELECT c FROM Certvida c WHERE c.capCedido = :capCedido"),
    @NamedQuery(name = "Certvida.findByPrimaCedida", query = "SELECT c FROM Certvida c WHERE c.primaCedida = :primaCedida"),
    @NamedQuery(name = "Certvida.findByFacturacion", query = "SELECT c FROM Certvida c WHERE c.facturacion = :facturacion")})
public class Certvida implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CertvidaPK certvidaPK;
    @Basic(optional = false)
    @Column(name = "VIGDES", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date vigdes;
    @Basic(optional = false)
    @Column(name = "VIGHAS", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date vighas;
    @Basic(optional = false)
    @Column(name = "TIPO_PLAZO", nullable = false, length = 2)
    private String tipoPlazo;
    @Basic(optional = false)
    @Column(name = "PLAZO", nullable = false)
    private short plazo;
    @Basic(optional = false)
    @Column(name = "SUMASEG", nullable = false)
    private long sumaseg;
    @Basic(optional = false)
    @Column(name = "PREMIO", nullable = false)
    private long premio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRIMA_CONTRATO", precision = 17, scale = 2)
    private BigDecimal primaContrato;
    @Column(name = "PORC_RETENIDO", precision = 10, scale = 7)
    private BigDecimal porcRetenido;
    @Column(name = "PORC_FACULTATIVO", precision = 10, scale = 7)
    private BigDecimal porcFacultativo;
    @Column(name = "PRIMA_RETENIDA", precision = 17, scale = 2)
    private BigDecimal primaRetenida;
    @Column(name = "PRIMA_FACULTATIVO", precision = 17, scale = 2)
    private BigDecimal primaFacultativo;
    @Column(name = "CAP_CONTRATO", precision = 17, scale = 2)
    private BigDecimal capContrato;
    @Column(name = "CAP_RETENIDO", precision = 17, scale = 2)
    private BigDecimal capRetenido;
    @Column(name = "PORC_CONTRATO", precision = 10, scale = 7)
    private BigDecimal porcContrato;
    @Column(name = "CAP_FACULTATIVO", precision = 17, scale = 2)
    private BigDecimal capFacultativo;
    @Column(name = "SUMASEG_ME", precision = 15, scale = 2)
    private BigDecimal sumasegMe;
    @Column(name = "PREMIO_ME", precision = 15, scale = 2)
    private BigDecimal premioMe;
    @Column(name = "NRO_ORDEN")
    private Integer nroOrden;
    @Basic(optional = false)
    @Column(name = "FECHA_CARGA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCarga;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @Column(name = "DIAS_PLAZO")
    private Short diasPlazo;
    @Basic(optional = false)
    @Column(name = "TASA_ASIGNADA_VIDA", nullable = false)
    private short tasaAsignadaVida;
    @Column(name = "TASA_REASEGURO", precision = 8, scale = 4)
    private BigDecimal tasaReaseguro;
    @Column(name = "FORMA_PLAZO")
    private Short formaPlazo;
    @Column(name = "EXCLUIDO")
    private Short excluido;
    @Column(name = "USUARIO_EXCLUYE")
    private Short usuarioExcluye;
    @Column(name = "PRIMA")
    private Long prima;
    @Column(name = "PRIMA_ME", precision = 15, scale = 2)
    private BigDecimal primaMe;
    @Column(name = "GTSPOL")
    private Long gtspol;
    @Column(name = "GTSPOL_ME", precision = 15, scale = 2)
    private BigDecimal gtspolMe;
    @Column(name = "IMPORTE_CUOTA")
    private Long importeCuota;
    @Column(name = "IMPORTE_CUOTA_ME", precision = 15, scale = 2)
    private BigDecimal importeCuotaMe;
    @Column(name = "PCT_GTOS", precision = 6, scale = 2)
    private BigDecimal pctGtos;
    @Column(name = "NRO_CUOTAS")
    private Short nroCuotas;
    @Column(name = "PCT_TASA", precision = 15, scale = 4)
    private BigDecimal pctTasa;
    @Column(name = "CODIGO_TASA")
    private Long codigoTasa;
    @Column(name = "TEXTO_CERTIFICADO", length = 4000)
    private String textoCertificado;
    @Column(name = "OBSERVACION", length = 150)
    private String observacion;
    @Basic(optional = false)
    @Column(name = "PCT_EXTRA_PRIMA", nullable = false, precision = 7, scale = 4)
    private BigDecimal pctExtraPrima;
    @Basic(optional = false)
    @Column(name = "EXTRA_PRIMA", nullable = false)
    private long extraPrima;
    @Basic(optional = false)
    @Column(name = "EXTRA_PRIMA_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal extraPrimaMe;
    @Column(name = "PROMEDIO_EDAD")
    private Short promedioEdad;
    @Column(name = "EDAD_ASEG")
    private Short edadAseg;
    @Column(name = "TIPO_CALCULO_REASE")
    private Short tipoCalculoRease;
    @Column(name = "RETENCION")
    private Long retencion;
    @Column(name = "RETENCION_ME", precision = 15, scale = 2)
    private BigDecimal retencionMe;
    @Column(name = "CUOTA_PARTE")
    private Long cuotaParte;
    @Column(name = "CUOTA_PARTE_ME", precision = 15, scale = 2)
    private BigDecimal cuotaParteMe;
    @Column(name = "PRIMER_EXCEDENTE")
    private Long primerExcedente;
    @Column(name = "PRIMER_EXCEDENTE_ME", precision = 15, scale = 2)
    private BigDecimal primerExcedenteMe;
    @Column(name = "CESION_REASE")
    private Long cesionRease;
    @Column(name = "CESION_REASE_ME", precision = 15, scale = 2)
    private BigDecimal cesionReaseMe;
    @Column(name = "FECHA_CESION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCesion;
    @Column(name = "COD_MONEY")
    private Short codMoney;
    @Column(name = "T_CAMBIO", precision = 10, scale = 5)
    private BigDecimal tCambio;
    @Column(name = "COD_ASEG")
    private Integer codAseg;
    @Column(name = "COBERTURAS", length = 300)
    private String coberturas;
    @Column(name = "PRIMA_REASEG", precision = 15, scale = 2)
    private BigDecimal primaReaseg;
    @Column(name = "PRIMA_REASEG_ME", precision = 15, scale = 2)
    private BigDecimal primaReasegMe;
    @Column(name = "ITEM")
    private Integer item;
    @Basic(optional = false)
    @Column(name = "CUMULO", nullable = false)
    private short cumulo;
    @Column(name = "TIPO_AUTORIZA_CUMULO", length = 60)
    private String tipoAutorizaCumulo;
    @Column(name = "USUARIO_AUTORIZA_CUMULO")
    private Short usuarioAutorizaCumulo;
    @Basic(optional = false)
    @Column(name = "IVA", nullable = false)
    private long iva;
    @Basic(optional = false)
    @Column(name = "IVA_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal ivaMe;
    @Column(name = "TABLA", length = 2)
    private String tabla;
    @Basic(optional = false)
    @Column(name = "PCT_TABLA", nullable = false, precision = 7, scale = 4)
    private BigDecimal pctTabla;
    @Basic(optional = false)
    @Column(name = "PCT_VIDA", nullable = false, precision = 7, scale = 4)
    private BigDecimal pctVida;
    @Basic(optional = false)
    @Column(name = "PCT_IP", nullable = false, precision = 7, scale = 4)
    private BigDecimal pctIp;
    @Basic(optional = false)
    @Column(name = "PCT_OTROS", nullable = false, precision = 7, scale = 4)
    private BigDecimal pctOtros;
    @Basic(optional = false)
    @Column(name = "CK_PREMIO", nullable = false)
    private short ckPremio;
    @Basic(optional = false)
    @Column(name = "PCT_VIDA_REASEG", nullable = false, precision = 8, scale = 4)
    private BigDecimal pctVidaReaseg;
    @Basic(optional = false)
    @Column(name = "PCT_IP_REASEG", nullable = false, precision = 8, scale = 4)
    private BigDecimal pctIpReaseg;
    @Basic(optional = false)
    @Column(name = "PCT_DI_REASEG", nullable = false, precision = 8, scale = 4)
    private BigDecimal pctDiReaseg;
    @Basic(optional = false)
    @Column(name = "PRIMA_VIDA_REASEG", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaVidaReaseg;
    @Basic(optional = false)
    @Column(name = "PRIMA_IP_REASEG", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaIpReaseg;
    @Basic(optional = false)
    @Column(name = "PRIMA_DI_REASEG", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaDiReaseg;
    @Basic(optional = false)
    @Column(name = "CAP_CEDIDO", nullable = false, precision = 17, scale = 2)
    private BigDecimal capCedido;
    @Basic(optional = false)
    @Column(name = "PRIMA_CEDIDA", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaCedida;
    @Basic(optional = false)
    @Column(name = "FACTURACION", nullable = false)
    private short facturacion;
    @JoinColumn(name = "N_ASEG", referencedColumnName = "N_ASEG", nullable = false)
    @ManyToOne(optional = false)
    private AsegVida nAseg;
    @JoinColumns({
        @JoinColumn(name = "EJERCICIO", referencedColumnName = "EJERCICIO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "TIPO_SEGURO", referencedColumnName = "TIPO_SEGURO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "TIPO_OPERACION", referencedColumnName = "TIPO_OPERACION", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "SECC", referencedColumnName = "SECC", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "POLNRO", referencedColumnName = "POLNRO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "ANEXO", referencedColumnName = "ANEXO", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Polsdemi polsdemi;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;

    public Certvida() {
    }

    public Certvida(CertvidaPK certvidaPK) {
        this.certvidaPK = certvidaPK;
    }

    public Certvida(CertvidaPK certvidaPK, Date vigdes, Date vighas, String tipoPlazo, short plazo, long sumaseg, long premio, Date fechaCarga, int nroEntrada, short tasaAsignadaVida, BigDecimal pctExtraPrima, long extraPrima, BigDecimal extraPrimaMe, short cumulo, long iva, BigDecimal ivaMe, BigDecimal pctTabla, BigDecimal pctVida, BigDecimal pctIp, BigDecimal pctOtros, short ckPremio, BigDecimal pctVidaReaseg, BigDecimal pctIpReaseg, BigDecimal pctDiReaseg, BigDecimal primaVidaReaseg, BigDecimal primaIpReaseg, BigDecimal primaDiReaseg, BigDecimal capCedido, BigDecimal primaCedida, short facturacion) {
        this.certvidaPK = certvidaPK;
        this.vigdes = vigdes;
        this.vighas = vighas;
        this.tipoPlazo = tipoPlazo;
        this.plazo = plazo;
        this.sumaseg = sumaseg;
        this.premio = premio;
        this.fechaCarga = fechaCarga;
        this.nroEntrada = nroEntrada;
        this.tasaAsignadaVida = tasaAsignadaVida;
        this.pctExtraPrima = pctExtraPrima;
        this.extraPrima = extraPrima;
        this.extraPrimaMe = extraPrimaMe;
        this.cumulo = cumulo;
        this.iva = iva;
        this.ivaMe = ivaMe;
        this.pctTabla = pctTabla;
        this.pctVida = pctVida;
        this.pctIp = pctIp;
        this.pctOtros = pctOtros;
        this.ckPremio = ckPremio;
        this.pctVidaReaseg = pctVidaReaseg;
        this.pctIpReaseg = pctIpReaseg;
        this.pctDiReaseg = pctDiReaseg;
        this.primaVidaReaseg = primaVidaReaseg;
        this.primaIpReaseg = primaIpReaseg;
        this.primaDiReaseg = primaDiReaseg;
        this.capCedido = capCedido;
        this.primaCedida = primaCedida;
        this.facturacion = facturacion;
    }

    public Certvida(short ejercicio, short tipoSeguro, short tipoOperacion, short secc, int polnro, short anexo, int nroCert) {
        this.certvidaPK = new CertvidaPK(ejercicio, tipoSeguro, tipoOperacion, secc, polnro, anexo, nroCert);
    }

    public CertvidaPK getCertvidaPK() {
        return certvidaPK;
    }

    public void setCertvidaPK(CertvidaPK certvidaPK) {
        this.certvidaPK = certvidaPK;
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

    public String getTipoPlazo() {
        return tipoPlazo;
    }

    public void setTipoPlazo(String tipoPlazo) {
        this.tipoPlazo = tipoPlazo;
    }

    public short getPlazo() {
        return plazo;
    }

    public void setPlazo(short plazo) {
        this.plazo = plazo;
    }

    public long getSumaseg() {
        return sumaseg;
    }

    public void setSumaseg(long sumaseg) {
        this.sumaseg = sumaseg;
    }

    public long getPremio() {
        return premio;
    }

    public void setPremio(long premio) {
        this.premio = premio;
    }

    public BigDecimal getPrimaContrato() {
        return primaContrato;
    }

    public void setPrimaContrato(BigDecimal primaContrato) {
        this.primaContrato = primaContrato;
    }

    public BigDecimal getPorcRetenido() {
        return porcRetenido;
    }

    public void setPorcRetenido(BigDecimal porcRetenido) {
        this.porcRetenido = porcRetenido;
    }

    public BigDecimal getPorcFacultativo() {
        return porcFacultativo;
    }

    public void setPorcFacultativo(BigDecimal porcFacultativo) {
        this.porcFacultativo = porcFacultativo;
    }

    public BigDecimal getPrimaRetenida() {
        return primaRetenida;
    }

    public void setPrimaRetenida(BigDecimal primaRetenida) {
        this.primaRetenida = primaRetenida;
    }

    public BigDecimal getPrimaFacultativo() {
        return primaFacultativo;
    }

    public void setPrimaFacultativo(BigDecimal primaFacultativo) {
        this.primaFacultativo = primaFacultativo;
    }

    public BigDecimal getCapContrato() {
        return capContrato;
    }

    public void setCapContrato(BigDecimal capContrato) {
        this.capContrato = capContrato;
    }

    public BigDecimal getCapRetenido() {
        return capRetenido;
    }

    public void setCapRetenido(BigDecimal capRetenido) {
        this.capRetenido = capRetenido;
    }

    public BigDecimal getPorcContrato() {
        return porcContrato;
    }

    public void setPorcContrato(BigDecimal porcContrato) {
        this.porcContrato = porcContrato;
    }

    public BigDecimal getCapFacultativo() {
        return capFacultativo;
    }

    public void setCapFacultativo(BigDecimal capFacultativo) {
        this.capFacultativo = capFacultativo;
    }

    public BigDecimal getSumasegMe() {
        return sumasegMe;
    }

    public void setSumasegMe(BigDecimal sumasegMe) {
        this.sumasegMe = sumasegMe;
    }

    public BigDecimal getPremioMe() {
        return premioMe;
    }

    public void setPremioMe(BigDecimal premioMe) {
        this.premioMe = premioMe;
    }

    public Integer getNroOrden() {
        return nroOrden;
    }

    public void setNroOrden(Integer nroOrden) {
        this.nroOrden = nroOrden;
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

    public Short getDiasPlazo() {
        return diasPlazo;
    }

    public void setDiasPlazo(Short diasPlazo) {
        this.diasPlazo = diasPlazo;
    }

    public short getTasaAsignadaVida() {
        return tasaAsignadaVida;
    }

    public void setTasaAsignadaVida(short tasaAsignadaVida) {
        this.tasaAsignadaVida = tasaAsignadaVida;
    }

    public BigDecimal getTasaReaseguro() {
        return tasaReaseguro;
    }

    public void setTasaReaseguro(BigDecimal tasaReaseguro) {
        this.tasaReaseguro = tasaReaseguro;
    }

    public Short getFormaPlazo() {
        return formaPlazo;
    }

    public void setFormaPlazo(Short formaPlazo) {
        this.formaPlazo = formaPlazo;
    }

    public Short getExcluido() {
        return excluido;
    }

    public void setExcluido(Short excluido) {
        this.excluido = excluido;
    }

    public Short getUsuarioExcluye() {
        return usuarioExcluye;
    }

    public void setUsuarioExcluye(Short usuarioExcluye) {
        this.usuarioExcluye = usuarioExcluye;
    }

    public Long getPrima() {
        return prima;
    }

    public void setPrima(Long prima) {
        this.prima = prima;
    }

    public BigDecimal getPrimaMe() {
        return primaMe;
    }

    public void setPrimaMe(BigDecimal primaMe) {
        this.primaMe = primaMe;
    }

    public Long getGtspol() {
        return gtspol;
    }

    public void setGtspol(Long gtspol) {
        this.gtspol = gtspol;
    }

    public BigDecimal getGtspolMe() {
        return gtspolMe;
    }

    public void setGtspolMe(BigDecimal gtspolMe) {
        this.gtspolMe = gtspolMe;
    }

    public Long getImporteCuota() {
        return importeCuota;
    }

    public void setImporteCuota(Long importeCuota) {
        this.importeCuota = importeCuota;
    }

    public BigDecimal getImporteCuotaMe() {
        return importeCuotaMe;
    }

    public void setImporteCuotaMe(BigDecimal importeCuotaMe) {
        this.importeCuotaMe = importeCuotaMe;
    }

    public BigDecimal getPctGtos() {
        return pctGtos;
    }

    public void setPctGtos(BigDecimal pctGtos) {
        this.pctGtos = pctGtos;
    }

    public Short getNroCuotas() {
        return nroCuotas;
    }

    public void setNroCuotas(Short nroCuotas) {
        this.nroCuotas = nroCuotas;
    }

    public BigDecimal getPctTasa() {
        return pctTasa;
    }

    public void setPctTasa(BigDecimal pctTasa) {
        this.pctTasa = pctTasa;
    }

    public Long getCodigoTasa() {
        return codigoTasa;
    }

    public void setCodigoTasa(Long codigoTasa) {
        this.codigoTasa = codigoTasa;
    }

    public String getTextoCertificado() {
        return textoCertificado;
    }

    public void setTextoCertificado(String textoCertificado) {
        this.textoCertificado = textoCertificado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public BigDecimal getPctExtraPrima() {
        return pctExtraPrima;
    }

    public void setPctExtraPrima(BigDecimal pctExtraPrima) {
        this.pctExtraPrima = pctExtraPrima;
    }

    public long getExtraPrima() {
        return extraPrima;
    }

    public void setExtraPrima(long extraPrima) {
        this.extraPrima = extraPrima;
    }

    public BigDecimal getExtraPrimaMe() {
        return extraPrimaMe;
    }

    public void setExtraPrimaMe(BigDecimal extraPrimaMe) {
        this.extraPrimaMe = extraPrimaMe;
    }

    public Short getPromedioEdad() {
        return promedioEdad;
    }

    public void setPromedioEdad(Short promedioEdad) {
        this.promedioEdad = promedioEdad;
    }

    public Short getEdadAseg() {
        return edadAseg;
    }

    public void setEdadAseg(Short edadAseg) {
        this.edadAseg = edadAseg;
    }

    public Short getTipoCalculoRease() {
        return tipoCalculoRease;
    }

    public void setTipoCalculoRease(Short tipoCalculoRease) {
        this.tipoCalculoRease = tipoCalculoRease;
    }

    public Long getRetencion() {
        return retencion;
    }

    public void setRetencion(Long retencion) {
        this.retencion = retencion;
    }

    public BigDecimal getRetencionMe() {
        return retencionMe;
    }

    public void setRetencionMe(BigDecimal retencionMe) {
        this.retencionMe = retencionMe;
    }

    public Long getCuotaParte() {
        return cuotaParte;
    }

    public void setCuotaParte(Long cuotaParte) {
        this.cuotaParte = cuotaParte;
    }

    public BigDecimal getCuotaParteMe() {
        return cuotaParteMe;
    }

    public void setCuotaParteMe(BigDecimal cuotaParteMe) {
        this.cuotaParteMe = cuotaParteMe;
    }

    public Long getPrimerExcedente() {
        return primerExcedente;
    }

    public void setPrimerExcedente(Long primerExcedente) {
        this.primerExcedente = primerExcedente;
    }

    public BigDecimal getPrimerExcedenteMe() {
        return primerExcedenteMe;
    }

    public void setPrimerExcedenteMe(BigDecimal primerExcedenteMe) {
        this.primerExcedenteMe = primerExcedenteMe;
    }

    public Long getCesionRease() {
        return cesionRease;
    }

    public void setCesionRease(Long cesionRease) {
        this.cesionRease = cesionRease;
    }

    public BigDecimal getCesionReaseMe() {
        return cesionReaseMe;
    }

    public void setCesionReaseMe(BigDecimal cesionReaseMe) {
        this.cesionReaseMe = cesionReaseMe;
    }

    public Date getFechaCesion() {
        return fechaCesion;
    }

    public void setFechaCesion(Date fechaCesion) {
        this.fechaCesion = fechaCesion;
    }

    public Short getCodMoney() {
        return codMoney;
    }

    public void setCodMoney(Short codMoney) {
        this.codMoney = codMoney;
    }

    public BigDecimal getTCambio() {
        return tCambio;
    }

    public void setTCambio(BigDecimal tCambio) {
        this.tCambio = tCambio;
    }

    public Integer getCodAseg() {
        return codAseg;
    }

    public void setCodAseg(Integer codAseg) {
        this.codAseg = codAseg;
    }

    public String getCoberturas() {
        return coberturas;
    }

    public void setCoberturas(String coberturas) {
        this.coberturas = coberturas;
    }

    public BigDecimal getPrimaReaseg() {
        return primaReaseg;
    }

    public void setPrimaReaseg(BigDecimal primaReaseg) {
        this.primaReaseg = primaReaseg;
    }

    public BigDecimal getPrimaReasegMe() {
        return primaReasegMe;
    }

    public void setPrimaReasegMe(BigDecimal primaReasegMe) {
        this.primaReasegMe = primaReasegMe;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public short getCumulo() {
        return cumulo;
    }

    public void setCumulo(short cumulo) {
        this.cumulo = cumulo;
    }

    public String getTipoAutorizaCumulo() {
        return tipoAutorizaCumulo;
    }

    public void setTipoAutorizaCumulo(String tipoAutorizaCumulo) {
        this.tipoAutorizaCumulo = tipoAutorizaCumulo;
    }

    public Short getUsuarioAutorizaCumulo() {
        return usuarioAutorizaCumulo;
    }

    public void setUsuarioAutorizaCumulo(Short usuarioAutorizaCumulo) {
        this.usuarioAutorizaCumulo = usuarioAutorizaCumulo;
    }

    public long getIva() {
        return iva;
    }

    public void setIva(long iva) {
        this.iva = iva;
    }

    public BigDecimal getIvaMe() {
        return ivaMe;
    }

    public void setIvaMe(BigDecimal ivaMe) {
        this.ivaMe = ivaMe;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public BigDecimal getPctTabla() {
        return pctTabla;
    }

    public void setPctTabla(BigDecimal pctTabla) {
        this.pctTabla = pctTabla;
    }

    public BigDecimal getPctVida() {
        return pctVida;
    }

    public void setPctVida(BigDecimal pctVida) {
        this.pctVida = pctVida;
    }

    public BigDecimal getPctIp() {
        return pctIp;
    }

    public void setPctIp(BigDecimal pctIp) {
        this.pctIp = pctIp;
    }

    public BigDecimal getPctOtros() {
        return pctOtros;
    }

    public void setPctOtros(BigDecimal pctOtros) {
        this.pctOtros = pctOtros;
    }

    public short getCkPremio() {
        return ckPremio;
    }

    public void setCkPremio(short ckPremio) {
        this.ckPremio = ckPremio;
    }

    public BigDecimal getPctVidaReaseg() {
        return pctVidaReaseg;
    }

    public void setPctVidaReaseg(BigDecimal pctVidaReaseg) {
        this.pctVidaReaseg = pctVidaReaseg;
    }

    public BigDecimal getPctIpReaseg() {
        return pctIpReaseg;
    }

    public void setPctIpReaseg(BigDecimal pctIpReaseg) {
        this.pctIpReaseg = pctIpReaseg;
    }

    public BigDecimal getPctDiReaseg() {
        return pctDiReaseg;
    }

    public void setPctDiReaseg(BigDecimal pctDiReaseg) {
        this.pctDiReaseg = pctDiReaseg;
    }

    public BigDecimal getPrimaVidaReaseg() {
        return primaVidaReaseg;
    }

    public void setPrimaVidaReaseg(BigDecimal primaVidaReaseg) {
        this.primaVidaReaseg = primaVidaReaseg;
    }

    public BigDecimal getPrimaIpReaseg() {
        return primaIpReaseg;
    }

    public void setPrimaIpReaseg(BigDecimal primaIpReaseg) {
        this.primaIpReaseg = primaIpReaseg;
    }

    public BigDecimal getPrimaDiReaseg() {
        return primaDiReaseg;
    }

    public void setPrimaDiReaseg(BigDecimal primaDiReaseg) {
        this.primaDiReaseg = primaDiReaseg;
    }

    public BigDecimal getCapCedido() {
        return capCedido;
    }

    public void setCapCedido(BigDecimal capCedido) {
        this.capCedido = capCedido;
    }

    public BigDecimal getPrimaCedida() {
        return primaCedida;
    }

    public void setPrimaCedida(BigDecimal primaCedida) {
        this.primaCedida = primaCedida;
    }

    public short getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(short facturacion) {
        this.facturacion = facturacion;
    }

    public AsegVida getNAseg() {
        return nAseg;
    }

    public void setNAseg(AsegVida nAseg) {
        this.nAseg = nAseg;
    }

    public Polsdemi getPolsdemi() {
        return polsdemi;
    }

    public void setPolsdemi(Polsdemi polsdemi) {
        this.polsdemi = polsdemi;
    }

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (certvidaPK != null ? certvidaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Certvida)) {
            return false;
        }
        Certvida other = (Certvida) object;
        if ((this.certvidaPK == null && other.certvidaPK != null) || (this.certvidaPK != null && !this.certvidaPK.equals(other.certvidaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Certvida[ certvidaPK=" + certvidaPK + " ]";
    }
    
}
