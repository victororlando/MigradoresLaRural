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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRUBICACION")
@NamedQueries({
    @NamedQuery(name = "Lrubicacion.findAll", query = "SELECT l FROM Lrubicacion l"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionid", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionid = :lrubicacionid"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacioncalleprincipal", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacioncalleprincipal = :lrubicacioncalleprincipal"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacioncalletransversal", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacioncalletransversal = :lrubicacioncalletransversal"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionctactectral", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionctactectral = :lrubicacionctactectral"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionedificio", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionedificio = :lrubicacionedificio"),
    @NamedQuery(name = "Lrubicacion.findByLrubicaciondpto", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicaciondpto = :lrubicaciondpto"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionlocal", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionlocal = :lrubicacionlocal"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionpiso", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionpiso = :lrubicacionpiso"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionnro", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionnro = :lrubicacionnro"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionbloque", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionbloque = :lrubicacionbloque"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionual", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionual = :lrubicacionual"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionfal", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionfal = :lrubicacionfal"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionumd", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionumd = :lrubicacionumd"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionfmd", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionfmd = :lrubicacionfmd"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionrespmax", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionrespmax = :lrubicacionrespmax"),
    @NamedQuery(name = "Lrubicacion.findByLrbarriosid", query = "SELECT l FROM Lrubicacion l WHERE l.lrbarriosid = :lrbarriosid"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacioncantsuc", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacioncantsuc = :lrubicacioncantsuc"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacioncantemp", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacioncantemp = :lrubicacioncantemp"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionnominado", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionnominado = :lrubicacionnominado"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionhasta", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionhasta = :lrubicacionhasta"),
    @NamedQuery(name = "Lrubicacion.findByLrubicaciondesde", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicaciondesde = :lrubicaciondesde"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacioninventario", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacioninventario = :lrubicacioninventario"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionposeeinv", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionposeeinv = :lrubicacionposeeinv"),
    @NamedQuery(name = "Lrubicacion.findByLrubicaciontotalventanillas", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicaciontotalventanillas = :lrubicaciontotalventanillas"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionsumaaseguradaplayer", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionsumaaseguradaplayer = :lrubicacionsumaaseguradaplayer"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacioncantplayeros", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacioncantplayeros = :lrubicacioncantplayeros"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionhorariohasta", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionhorariohasta = :lrubicacionhorariohasta"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionhorariodesde", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionhorariodesde = :lrubicacionhorariodesde"),
    @NamedQuery(name = "Lrubicacion.findByLrubicaciondescripcion", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicaciondescripcion = :lrubicaciondescripcion"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionmedidaseguridadvent", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionmedidaseguridadvent = :lrubicacionmedidaseguridadvent"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionmaxporventan", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionmaxporventan = :lrubicacionmaxporventan"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacioncantventan", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacioncantventan = :lrubicacioncantventan"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacioncajafuerte", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacioncajafuerte = :lrubicacioncajafuerte"),
    @NamedQuery(name = "Lrubicacion.findByLrubicaciondepid", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicaciondepid = :lrubicaciondepid"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionciuid", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionciuid = :lrubicacionciuid"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionnroinspeccion", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionnroinspeccion = :lrubicacionnroinspeccion"),
    @NamedQuery(name = "Lrubicacion.findByLrubicaciontotalplayeros", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicaciontotalplayeros = :lrubicaciontotalplayeros"),
    @NamedQuery(name = "Lrubicacion.findByLrubicaciondestinotransid", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicaciondestinotransid = :lrubicaciondestinotransid"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionastillero", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionastillero = :lrubicacionastillero"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionagravante", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionagravante = :lrubicacionagravante"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionorigentransid", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionorigentransid = :lrubicacionorigentransid"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionporpersona", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionporpersona = :lrubicacionporpersona"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionporpromediogrupal", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionporpromediogrupal = :lrubicacionporpromediogrupal"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionporpromediogral", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionporpromediogral = :lrubicacionporpromediogral"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionmontocarteraactual", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionmontocarteraactual = :lrubicacionmontocarteraactual"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionsiniestralidad", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionsiniestralidad = :lrubicacionsiniestralidad"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionpromedadcliente", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionpromedadcliente = :lrubicacionpromedadcliente"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacioncantperprestarias", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacioncantperprestarias = :lrubicacioncantperprestarias"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacioncapitalmaxpersona", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacioncapitalmaxpersona = :lrubicacioncapitalmaxpersona"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionpersonaaseid", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionpersonaaseid = :lrubicacionpersonaaseid"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionrutaferry", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionrutaferry = :lrubicacionrutaferry"),
    @NamedQuery(name = "Lrubicacion.findByLrubicacionferry", query = "SELECT l FROM Lrubicacion l WHERE l.lrubicacionferry = :lrubicacionferry")})
public class Lrubicacion implements Serializable {
    @Column(name = "LRUBICACIONAPLICAENDPREND")
    private Character lrubicacionaplicaendprend;
    @Column(name = "LRUBICACIONCANTVIAJEROS")
    private Short lrubicacioncantviajeros;
    @Column(name = "LRUBICACIONCANTVEHICULOS")
    private Short lrubicacioncantvehiculos;
  
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "LRUBICACION_SEQ_GENERATOR", sequenceName = "LRUBICACIONID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LRUBICACION_SEQ_GENERATOR")
    @Basic(optional = false)
    @Column(name = "LRUBICACIONID", nullable = false)
    private Long lrubicacionid;
    @Basic(optional = false)
    @Column(name = "LRUBICACIONCALLEPRINCIPAL", nullable = false, length = 200)
    private String lrubicacioncalleprincipal;
    @Basic(optional = false)
    @Column(name = "LRUBICACIONCALLETRANSVERSAL", nullable = false, length = 200)
    private String lrubicacioncalletransversal;
    @Basic(optional = false)
    @Column(name = "LRUBICACIONCTACTECTRAL", nullable = false, length = 50)
    private String lrubicacionctactectral;
    @Basic(optional = false)
    @Column(name = "LRUBICACIONEDIFICIO", nullable = false, length = 100)
    private String lrubicacionedificio;
    @Basic(optional = false)
    @Column(name = "LRUBICACIONDPTO", nullable = false, length = 100)
    private String lrubicaciondpto;
    @Basic(optional = false)
    @Column(name = "LRUBICACIONLOCAL", nullable = false, length = 100)
    private String lrubicacionlocal;
    @Basic(optional = false)
    @Column(name = "LRUBICACIONPISO", nullable = false)
    private short lrubicacionpiso;
    @Basic(optional = false)
    @Column(name = "LRUBICACIONNRO", nullable = false, length = 10)
    private String lrubicacionnro;
    @Basic(optional = false)
    @Column(name = "LRUBICACIONBLOQUE", nullable = false, length = 20)
    private String lrubicacionbloque;
    @Column(name = "LRUBICACIONUAL", length = 30)
    private String lrubicacionual;
    @Column(name = "LRUBICACIONFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrubicacionfal;
    @Column(name = "LRUBICACIONUMD", length = 30)
    private String lrubicacionumd;
    @Column(name = "LRUBICACIONFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrubicacionfmd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRUBICACIONRESPMAX", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrubicacionrespmax;
    @Column(name = "LRBARRIOSID")
    private Integer lrbarriosid;
    @Basic(optional = false)
    @Column(name = "LRUBICACIONCANTSUC", nullable = false)
    private int lrubicacioncantsuc;
    @Basic(optional = false)
    @Column(name = "LRUBICACIONCANTEMP", nullable = false)
    private int lrubicacioncantemp;
    @Basic(optional = false)
    @Column(name = "LRUBICACIONNOMINADO", nullable = false)
    private Character lrubicacionnominado;
    @Basic(optional = false)
    @Column(name = "LRUBICACIONHASTA", nullable = false, length = 200)
    private String lrubicacionhasta;
    @Basic(optional = false)
    @Column(name = "LRUBICACIONDESDE", nullable = false, length = 200)
    private String lrubicaciondesde;
    @Column(name = "LRUBICACIONINVENTARIO", length = 500)
    private String lrubicacioninventario;
    @Column(name = "LRUBICACIONPOSEEINV")
    private Character lrubicacionposeeinv;
    @Column(name = "LRUBICACIONTOTALVENTANILLAS", precision = 17, scale = 2)
    private BigDecimal lrubicaciontotalventanillas;
    @Column(name = "LRUBICACIONSUMAASEGURADAPLAYER", precision = 17, scale = 2)
    private BigDecimal lrubicacionsumaaseguradaplayer;
    @Column(name = "LRUBICACIONCANTPLAYEROS")
    private Long lrubicacioncantplayeros;
    @Column(name = "LRUBICACIONHORARIOHASTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrubicacionhorariohasta;
    @Column(name = "LRUBICACIONHORARIODESDE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrubicacionhorariodesde;
    @Column(name = "LRUBICACIONDESCRIPCION", length = 100)
    private String lrubicaciondescripcion;
    @Column(name = "LRUBICACIONMEDIDASEGURIDADVENT")
    private Character lrubicacionmedidaseguridadvent;
    @Column(name = "LRUBICACIONMAXPORVENTAN", precision = 17, scale = 2)
    private BigDecimal lrubicacionmaxporventan;
    @Column(name = "LRUBICACIONCANTVENTAN")
    private Long lrubicacioncantventan;
    @Column(name = "LRUBICACIONCAJAFUERTE")
    private Character lrubicacioncajafuerte;
    @Basic(optional = false)
    @Column(name = "LRUBICACIONDEPID", nullable = false)
    private short lrubicaciondepid;
    @Basic(optional = false)
    @Column(name = "LRUBICACIONCIUID", nullable = false)
    private short lrubicacionciuid;
    @Column(name = "LRUBICACIONNROINSPECCION")
    private Long lrubicacionnroinspeccion;
    @Column(name = "LRUBICACIONTOTALPLAYEROS")
    private Long lrubicaciontotalplayeros;
    @Column(name = "LRUBICACIONDESTINOTRANSID")
    private Long lrubicaciondestinotransid;
    @Column(name = "LRUBICACIONASTILLERO", length = 300)
    private String lrubicacionastillero;
    @Column(name = "LRUBICACIONAGRAVANTE")
    private Character lrubicacionagravante;
    @Column(name = "LRUBICACIONORIGENTRANSID")
    private Long lrubicacionorigentransid;
    @Column(name = "LRUBICACIONPORPERSONA")
    private Character lrubicacionporpersona;
    @Column(name = "LRUBICACIONPORPROMEDIOGRUPAL")
    private Character lrubicacionporpromediogrupal;
    @Column(name = "LRUBICACIONPORPROMEDIOGRAL")
    private Character lrubicacionporpromediogral;
    @Column(name = "LRUBICACIONMONTOCARTERAACTUAL", precision = 17, scale = 2)
    private BigDecimal lrubicacionmontocarteraactual;
    @Column(name = "LRUBICACIONSINIESTRALIDAD", precision = 17, scale = 2)
    private BigDecimal lrubicacionsiniestralidad;
    @Column(name = "LRUBICACIONPROMEDADCLIENTE", precision = 17, scale = 2)
    private BigDecimal lrubicacionpromedadcliente;
    @Column(name = "LRUBICACIONCANTPERPRESTARIAS")
    private Long lrubicacioncantperprestarias;
    @Column(name = "LRUBICACIONCAPITALMAXPERSONA", precision = 17, scale = 2)
    private BigDecimal lrubicacioncapitalmaxpersona;
    @Column(name = "LRUBICACIONPERSONAASEID")
    private Long lrubicacionpersonaaseid;
    @Column(name = "LRUBICACIONRUTAFERRY", length = 200)
    private String lrubicacionrutaferry;
    @Column(name = "LRUBICACIONFERRY")
    private Character lrubicacionferry;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrubicacionid")
    private List<Lrcumulo> lrcumuloList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrubicacion")
    private List<Lrcotidatbienase> lrcotidatbienaseList;
    @JoinColumns({
        @JoinColumn(name = "LRCOTIZACIONNRO", referencedColumnName = "LRCOTIZACIONNRO", nullable = false),
        @JoinColumn(name = "LRCOTIZACIONVERSION", referencedColumnName = "LRCOTIZACIONVERSION", nullable = false)})
    @ManyToOne(optional = false)
    private Lrcotizacion lrcotizacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrubicacionid")
    private List<Lrdetriesgotec> lrdetriesgotecList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrubicacionid")
    private List<Lrcotinspeccion> lrcotinspeccionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrubicacionid")
    private List<Lrotrosriesgostecnicos> lrotrosriesgostecnicosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrubicacionid")
    private List<Lrpersonaasegurada> lrpersonaaseguradaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrubicacionid")
    private List<Lragrupacargoturno> lragrupacargoturnoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrubicacionid")
    private List<Lrreaseguro> lrreaseguroList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrubicacionid")
    private List<Lrubicacionadjuntos> lrubicacionadjuntosList;
    @OneToMany(mappedBy = "lrubicacionid")
    private List<Lrpersonasautorizadas> lrpersonasautorizadasList;

    public Lrubicacion() {
    }

    public Lrubicacion(Long lrubicacionid) {
        this.lrubicacionid = lrubicacionid;
    }

    public Lrubicacion(Long lrubicacionid, String lrubicacioncalleprincipal, String lrubicacioncalletransversal, String lrubicacionctactectral, String lrubicacionedificio, String lrubicaciondpto, String lrubicacionlocal, short lrubicacionpiso, String lrubicacionnro, String lrubicacionbloque, BigDecimal lrubicacionrespmax, int lrubicacioncantsuc, int lrubicacioncantemp, Character lrubicacionnominado, String lrubicacionhasta, String lrubicaciondesde, short lrubicaciondepid, short lrubicacionciuid) {
        this.lrubicacionid = lrubicacionid;
        this.lrubicacioncalleprincipal = lrubicacioncalleprincipal;
        this.lrubicacioncalletransversal = lrubicacioncalletransversal;
        this.lrubicacionctactectral = lrubicacionctactectral;
        this.lrubicacionedificio = lrubicacionedificio;
        this.lrubicaciondpto = lrubicaciondpto;
        this.lrubicacionlocal = lrubicacionlocal;
        this.lrubicacionpiso = lrubicacionpiso;
        this.lrubicacionnro = lrubicacionnro;
        this.lrubicacionbloque = lrubicacionbloque;
        this.lrubicacionrespmax = lrubicacionrespmax;
        this.lrubicacioncantsuc = lrubicacioncantsuc;
        this.lrubicacioncantemp = lrubicacioncantemp;
        this.lrubicacionnominado = lrubicacionnominado;
        this.lrubicacionhasta = lrubicacionhasta;
        this.lrubicaciondesde = lrubicaciondesde;
        this.lrubicaciondepid = lrubicaciondepid;
        this.lrubicacionciuid = lrubicacionciuid;
    }

    public Long getLrubicacionid() {
        return lrubicacionid;
    }

    public void setLrubicacionid(Long lrubicacionid) {
        this.lrubicacionid = lrubicacionid;
    }

    public String getLrubicacioncalleprincipal() {
        return lrubicacioncalleprincipal;
    }

    public void setLrubicacioncalleprincipal(String lrubicacioncalleprincipal) {
        this.lrubicacioncalleprincipal = lrubicacioncalleprincipal;
    }

    public String getLrubicacioncalletransversal() {
        return lrubicacioncalletransversal;
    }

    public void setLrubicacioncalletransversal(String lrubicacioncalletransversal) {
        this.lrubicacioncalletransversal = lrubicacioncalletransversal;
    }

    public String getLrubicacionctactectral() {
        return lrubicacionctactectral;
    }

    public void setLrubicacionctactectral(String lrubicacionctactectral) {
        this.lrubicacionctactectral = lrubicacionctactectral;
    }

    public String getLrubicacionedificio() {
        return lrubicacionedificio;
    }

    public void setLrubicacionedificio(String lrubicacionedificio) {
        this.lrubicacionedificio = lrubicacionedificio;
    }

    public String getLrubicaciondpto() {
        return lrubicaciondpto;
    }

    public void setLrubicaciondpto(String lrubicaciondpto) {
        this.lrubicaciondpto = lrubicaciondpto;
    }

    public String getLrubicacionlocal() {
        return lrubicacionlocal;
    }

    public void setLrubicacionlocal(String lrubicacionlocal) {
        this.lrubicacionlocal = lrubicacionlocal;
    }

    public short getLrubicacionpiso() {
        return lrubicacionpiso;
    }

    public void setLrubicacionpiso(short lrubicacionpiso) {
        this.lrubicacionpiso = lrubicacionpiso;
    }

    public String getLrubicacionnro() {
        return lrubicacionnro;
    }

    public void setLrubicacionnro(String lrubicacionnro) {
        this.lrubicacionnro = lrubicacionnro;
    }

    public String getLrubicacionbloque() {
        return lrubicacionbloque;
    }

    public void setLrubicacionbloque(String lrubicacionbloque) {
        this.lrubicacionbloque = lrubicacionbloque;
    }

    public String getLrubicacionual() {
        return lrubicacionual;
    }

    public void setLrubicacionual(String lrubicacionual) {
        this.lrubicacionual = lrubicacionual;
    }

    public Date getLrubicacionfal() {
        return lrubicacionfal;
    }

    public void setLrubicacionfal(Date lrubicacionfal) {
        this.lrubicacionfal = lrubicacionfal;
    }

    public String getLrubicacionumd() {
        return lrubicacionumd;
    }

    public void setLrubicacionumd(String lrubicacionumd) {
        this.lrubicacionumd = lrubicacionumd;
    }

    public Date getLrubicacionfmd() {
        return lrubicacionfmd;
    }

    public void setLrubicacionfmd(Date lrubicacionfmd) {
        this.lrubicacionfmd = lrubicacionfmd;
    }

    public BigDecimal getLrubicacionrespmax() {
        return lrubicacionrespmax;
    }

    public void setLrubicacionrespmax(BigDecimal lrubicacionrespmax) {
        this.lrubicacionrespmax = lrubicacionrespmax;
    }

    public Integer getLrbarriosid() {
        return lrbarriosid;
    }

    public void setLrbarriosid(Integer lrbarriosid) {
        this.lrbarriosid = lrbarriosid;
    }

    public int getLrubicacioncantsuc() {
        return lrubicacioncantsuc;
    }

    public void setLrubicacioncantsuc(int lrubicacioncantsuc) {
        this.lrubicacioncantsuc = lrubicacioncantsuc;
    }

    public int getLrubicacioncantemp() {
        return lrubicacioncantemp;
    }

    public void setLrubicacioncantemp(int lrubicacioncantemp) {
        this.lrubicacioncantemp = lrubicacioncantemp;
    }

    public Character getLrubicacionnominado() {
        return lrubicacionnominado;
    }

    public void setLrubicacionnominado(Character lrubicacionnominado) {
        this.lrubicacionnominado = lrubicacionnominado;
    }

    public String getLrubicacionhasta() {
        return lrubicacionhasta;
    }

    public void setLrubicacionhasta(String lrubicacionhasta) {
        this.lrubicacionhasta = lrubicacionhasta;
    }

    public String getLrubicaciondesde() {
        return lrubicaciondesde;
    }

    public void setLrubicaciondesde(String lrubicaciondesde) {
        this.lrubicaciondesde = lrubicaciondesde;
    }

    public String getLrubicacioninventario() {
        return lrubicacioninventario;
    }

    public void setLrubicacioninventario(String lrubicacioninventario) {
        this.lrubicacioninventario = lrubicacioninventario;
    }

    public Character getLrubicacionposeeinv() {
        return lrubicacionposeeinv;
    }

    public void setLrubicacionposeeinv(Character lrubicacionposeeinv) {
        this.lrubicacionposeeinv = lrubicacionposeeinv;
    }

    public BigDecimal getLrubicaciontotalventanillas() {
        return lrubicaciontotalventanillas;
    }

    public void setLrubicaciontotalventanillas(BigDecimal lrubicaciontotalventanillas) {
        this.lrubicaciontotalventanillas = lrubicaciontotalventanillas;
    }

    public BigDecimal getLrubicacionsumaaseguradaplayer() {
        return lrubicacionsumaaseguradaplayer;
    }

    public void setLrubicacionsumaaseguradaplayer(BigDecimal lrubicacionsumaaseguradaplayer) {
        this.lrubicacionsumaaseguradaplayer = lrubicacionsumaaseguradaplayer;
    }

    public Long getLrubicacioncantplayeros() {
        return lrubicacioncantplayeros;
    }

    public void setLrubicacioncantplayeros(Long lrubicacioncantplayeros) {
        this.lrubicacioncantplayeros = lrubicacioncantplayeros;
    }

    public Date getLrubicacionhorariohasta() {
        return lrubicacionhorariohasta;
    }

    public void setLrubicacionhorariohasta(Date lrubicacionhorariohasta) {
        this.lrubicacionhorariohasta = lrubicacionhorariohasta;
    }

    public Date getLrubicacionhorariodesde() {
        return lrubicacionhorariodesde;
    }

    public void setLrubicacionhorariodesde(Date lrubicacionhorariodesde) {
        this.lrubicacionhorariodesde = lrubicacionhorariodesde;
    }

    public String getLrubicaciondescripcion() {
        return lrubicaciondescripcion;
    }

    public void setLrubicaciondescripcion(String lrubicaciondescripcion) {
        this.lrubicaciondescripcion = lrubicaciondescripcion;
    }

    public Character getLrubicacionmedidaseguridadvent() {
        return lrubicacionmedidaseguridadvent;
    }

    public void setLrubicacionmedidaseguridadvent(Character lrubicacionmedidaseguridadvent) {
        this.lrubicacionmedidaseguridadvent = lrubicacionmedidaseguridadvent;
    }

    public BigDecimal getLrubicacionmaxporventan() {
        return lrubicacionmaxporventan;
    }

    public void setLrubicacionmaxporventan(BigDecimal lrubicacionmaxporventan) {
        this.lrubicacionmaxporventan = lrubicacionmaxporventan;
    }

    public Long getLrubicacioncantventan() {
        return lrubicacioncantventan;
    }

    public void setLrubicacioncantventan(Long lrubicacioncantventan) {
        this.lrubicacioncantventan = lrubicacioncantventan;
    }

    public Character getLrubicacioncajafuerte() {
        return lrubicacioncajafuerte;
    }

    public void setLrubicacioncajafuerte(Character lrubicacioncajafuerte) {
        this.lrubicacioncajafuerte = lrubicacioncajafuerte;
    }

    public short getLrubicaciondepid() {
        return lrubicaciondepid;
    }

    public void setLrubicaciondepid(short lrubicaciondepid) {
        this.lrubicaciondepid = lrubicaciondepid;
    }

    public short getLrubicacionciuid() {
        return lrubicacionciuid;
    }

    public void setLrubicacionciuid(short lrubicacionciuid) {
        this.lrubicacionciuid = lrubicacionciuid;
    }

    public Long getLrubicacionnroinspeccion() {
        return lrubicacionnroinspeccion;
    }

    public void setLrubicacionnroinspeccion(Long lrubicacionnroinspeccion) {
        this.lrubicacionnroinspeccion = lrubicacionnroinspeccion;
    }

    public Long getLrubicaciontotalplayeros() {
        return lrubicaciontotalplayeros;
    }

    public void setLrubicaciontotalplayeros(Long lrubicaciontotalplayeros) {
        this.lrubicaciontotalplayeros = lrubicaciontotalplayeros;
    }

    public Long getLrubicaciondestinotransid() {
        return lrubicaciondestinotransid;
    }

    public void setLrubicaciondestinotransid(Long lrubicaciondestinotransid) {
        this.lrubicaciondestinotransid = lrubicaciondestinotransid;
    }

    public String getLrubicacionastillero() {
        return lrubicacionastillero;
    }

    public void setLrubicacionastillero(String lrubicacionastillero) {
        this.lrubicacionastillero = lrubicacionastillero;
    }

    public Character getLrubicacionagravante() {
        return lrubicacionagravante;
    }

    public void setLrubicacionagravante(Character lrubicacionagravante) {
        this.lrubicacionagravante = lrubicacionagravante;
    }

    public Long getLrubicacionorigentransid() {
        return lrubicacionorigentransid;
    }

    public void setLrubicacionorigentransid(Long lrubicacionorigentransid) {
        this.lrubicacionorigentransid = lrubicacionorigentransid;
    }

    public Character getLrubicacionporpersona() {
        return lrubicacionporpersona;
    }

    public void setLrubicacionporpersona(Character lrubicacionporpersona) {
        this.lrubicacionporpersona = lrubicacionporpersona;
    }

    public Character getLrubicacionporpromediogrupal() {
        return lrubicacionporpromediogrupal;
    }

    public void setLrubicacionporpromediogrupal(Character lrubicacionporpromediogrupal) {
        this.lrubicacionporpromediogrupal = lrubicacionporpromediogrupal;
    }

    public Character getLrubicacionporpromediogral() {
        return lrubicacionporpromediogral;
    }

    public void setLrubicacionporpromediogral(Character lrubicacionporpromediogral) {
        this.lrubicacionporpromediogral = lrubicacionporpromediogral;
    }

    public BigDecimal getLrubicacionmontocarteraactual() {
        return lrubicacionmontocarteraactual;
    }

    public void setLrubicacionmontocarteraactual(BigDecimal lrubicacionmontocarteraactual) {
        this.lrubicacionmontocarteraactual = lrubicacionmontocarteraactual;
    }

    public BigDecimal getLrubicacionsiniestralidad() {
        return lrubicacionsiniestralidad;
    }

    public void setLrubicacionsiniestralidad(BigDecimal lrubicacionsiniestralidad) {
        this.lrubicacionsiniestralidad = lrubicacionsiniestralidad;
    }

    public BigDecimal getLrubicacionpromedadcliente() {
        return lrubicacionpromedadcliente;
    }

    public void setLrubicacionpromedadcliente(BigDecimal lrubicacionpromedadcliente) {
        this.lrubicacionpromedadcliente = lrubicacionpromedadcliente;
    }

    public Long getLrubicacioncantperprestarias() {
        return lrubicacioncantperprestarias;
    }

    public void setLrubicacioncantperprestarias(Long lrubicacioncantperprestarias) {
        this.lrubicacioncantperprestarias = lrubicacioncantperprestarias;
    }

    public BigDecimal getLrubicacioncapitalmaxpersona() {
        return lrubicacioncapitalmaxpersona;
    }

    public void setLrubicacioncapitalmaxpersona(BigDecimal lrubicacioncapitalmaxpersona) {
        this.lrubicacioncapitalmaxpersona = lrubicacioncapitalmaxpersona;
    }

    public Long getLrubicacionpersonaaseid() {
        return lrubicacionpersonaaseid;
    }

    public void setLrubicacionpersonaaseid(Long lrubicacionpersonaaseid) {
        this.lrubicacionpersonaaseid = lrubicacionpersonaaseid;
    }

    public String getLrubicacionrutaferry() {
        return lrubicacionrutaferry;
    }

    public void setLrubicacionrutaferry(String lrubicacionrutaferry) {
        this.lrubicacionrutaferry = lrubicacionrutaferry;
    }

    public Character getLrubicacionferry() {
        return lrubicacionferry;
    }

    public void setLrubicacionferry(Character lrubicacionferry) {
        this.lrubicacionferry = lrubicacionferry;
    }

    public List<Lrcumulo> getLrcumuloList() {
        return lrcumuloList;
    }

    public void setLrcumuloList(List<Lrcumulo> lrcumuloList) {
        this.lrcumuloList = lrcumuloList;
    }

    public List<Lrcotidatbienase> getLrcotidatbienaseList() {
        return lrcotidatbienaseList;
    }

    public void setLrcotidatbienaseList(List<Lrcotidatbienase> lrcotidatbienaseList) {
        this.lrcotidatbienaseList = lrcotidatbienaseList;
    }

    public Lrcotizacion getLrcotizacion() {
        return lrcotizacion;
    }

    public void setLrcotizacion(Lrcotizacion lrcotizacion) {
        this.lrcotizacion = lrcotizacion;
    }

    public List<Lrdetriesgotec> getLrdetriesgotecList() {
        return lrdetriesgotecList;
    }

    public void setLrdetriesgotecList(List<Lrdetriesgotec> lrdetriesgotecList) {
        this.lrdetriesgotecList = lrdetriesgotecList;
    }

    public List<Lrcotinspeccion> getLrcotinspeccionList() {
        return lrcotinspeccionList;
    }

    public void setLrcotinspeccionList(List<Lrcotinspeccion> lrcotinspeccionList) {
        this.lrcotinspeccionList = lrcotinspeccionList;
    }

    public List<Lrotrosriesgostecnicos> getLrotrosriesgostecnicosList() {
        return lrotrosriesgostecnicosList;
    }

    public void setLrotrosriesgostecnicosList(List<Lrotrosriesgostecnicos> lrotrosriesgostecnicosList) {
        this.lrotrosriesgostecnicosList = lrotrosriesgostecnicosList;
    }

    public List<Lrpersonaasegurada> getLrpersonaaseguradaList() {
        return lrpersonaaseguradaList;
    }

    public void setLrpersonaaseguradaList(List<Lrpersonaasegurada> lrpersonaaseguradaList) {
        this.lrpersonaaseguradaList = lrpersonaaseguradaList;
    }

    public List<Lragrupacargoturno> getLragrupacargoturnoList() {
        return lragrupacargoturnoList;
    }

    public void setLragrupacargoturnoList(List<Lragrupacargoturno> lragrupacargoturnoList) {
        this.lragrupacargoturnoList = lragrupacargoturnoList;
    }

    public List<Lrreaseguro> getLrreaseguroList() {
        return lrreaseguroList;
    }

    public void setLrreaseguroList(List<Lrreaseguro> lrreaseguroList) {
        this.lrreaseguroList = lrreaseguroList;
    }

    public List<Lrubicacionadjuntos> getLrubicacionadjuntosList() {
        return lrubicacionadjuntosList;
    }

    public void setLrubicacionadjuntosList(List<Lrubicacionadjuntos> lrubicacionadjuntosList) {
        this.lrubicacionadjuntosList = lrubicacionadjuntosList;
    }

    public List<Lrpersonasautorizadas> getLrpersonasautorizadasList() {
        return lrpersonasautorizadasList;
    }

    public void setLrpersonasautorizadasList(List<Lrpersonasautorizadas> lrpersonasautorizadasList) {
        this.lrpersonasautorizadasList = lrpersonasautorizadasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrubicacionid != null ? lrubicacionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrubicacion)) {
            return false;
        }
        Lrubicacion other = (Lrubicacion) object;
        if ((this.lrubicacionid == null && other.lrubicacionid != null) || (this.lrubicacionid != null && !this.lrubicacionid.equals(other.lrubicacionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrubicacion[ lrubicacionid=" + lrubicacionid + " ]";
    }

    public Character getLrubicacionaplicaendprend() {
        return lrubicacionaplicaendprend;
    }

    public void setLrubicacionaplicaendprend(Character lrubicacionaplicaendprend) {
        this.lrubicacionaplicaendprend = lrubicacionaplicaendprend;
    }

    public Short getLrubicacioncantviajeros() {
        return lrubicacioncantviajeros;
    }

    public void setLrubicacioncantviajeros(Short lrubicacioncantviajeros) {
        this.lrubicacioncantviajeros = lrubicacioncantviajeros;
    }

    public Short getLrubicacioncantvehiculos() {
        return lrubicacioncantvehiculos;
    }

    public void setLrubicacioncantvehiculos(Short lrubicacioncantvehiculos) {
        this.lrubicacioncantvehiculos = lrubicacioncantvehiculos;
    }



}
