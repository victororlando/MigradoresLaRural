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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "LRCOTIZACION")
@NamedQueries({
    @NamedQuery(name = "Lrcotizacion.findAll", query = "SELECT l FROM Lrcotizacion l"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionnro", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionPK.lrcotizacionnro = :lrcotizacionnro"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionversion", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionPK.lrcotizacionversion = :lrcotizacionversion"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionfechacoti", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionfechacoti = :lrcotizacionfechacoti"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionrubroid", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionrubroid = :lrcotizacionrubroid"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionsubrubroid", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionsubrubroid = :lrcotizacionsubrubroid"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionagenteid", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionagenteid = :lrcotizacionagenteid"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionsubagenteid", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionsubagenteid = :lrcotizacionsubagenteid"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionformapagoid", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionformapagoid = :lrcotizacionformapagoid"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizaciontipocobroid", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizaciontipocobroid = :lrcotizaciontipocobroid"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizaciontipocoti", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizaciontipocoti = :lrcotizaciontipocoti"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionmontototal", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionmontototal = :lrcotizacionmontototal"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacioncobradorid", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacioncobradorid = :lrcotizacioncobradorid"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionprendarioid", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionprendarioid = :lrcotizacionprendarioid"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionpordeclaracion", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionpordeclaracion = :lrcotizacionpordeclaracion"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionvtotarjeta", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionvtotarjeta = :lrcotizacionvtotarjeta"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionnrotarjeta", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionnrotarjeta = :lrcotizacionnrotarjeta"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionaprobcontclr", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionaprobcontclr = :lrcotizacionaprobcontclr"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionvigdesde", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionvigdesde = :lrcotizacionvigdesde"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionvighasta", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionvighasta = :lrcotizacionvighasta"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionvigencia", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionvigencia = :lrcotizacionvigencia"),
    @NamedQuery(name = "Lrcotizacion.findByLractividadid", query = "SELECT l FROM Lrcotizacion l WHERE l.lractividadid = :lractividadid"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionnropoliza", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionnropoliza = :lrcotizacionnropoliza"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionejerciciorenov", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionejerciciorenov = :lrcotizacionejerciciorenov"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionnropolizarenov", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionnropolizarenov = :lrcotizacionnropolizarenov"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionanexo", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionanexo = :lrcotizacionanexo"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionendoso", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionendoso = :lrcotizacionendoso"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionendosopor", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionendosopor = :lrcotizacionendosopor"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionual", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionual = :lrcotizacionual"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionfal", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionfal = :lrcotizacionfal"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionumd", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionumd = :lrcotizacionumd"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionfmd", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionfmd = :lrcotizacionfmd"),
    @NamedQuery(name = "Lrcotizacion.findByEntidadid", query = "SELECT l FROM Lrcotizacion l WHERE l.entidadid = :entidadid"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizaciondeclaraciondelmes", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizaciondeclaraciondelmes = :lrcotizaciondeclaraciondelmes"),
    @NamedQuery(name = "Lrcotizacion.findByEndoprendaid", query = "SELECT l FROM Lrcotizacion l WHERE l.endoprendaid = :endoprendaid"),
    @NamedQuery(name = "Lrcotizacion.findByLrtipocotizacionid", query = "SELECT l FROM Lrcotizacion l WHERE l.lrtipocotizacionid = :lrtipocotizacionid"),
    @NamedQuery(name = "Lrcotizacion.findByLrmedidaprestacionid", query = "SELECT l FROM Lrcotizacion l WHERE l.lrmedidaprestacionid = :lrmedidaprestacionid"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionac", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionac = :lrcotizacionac"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionobs4", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionobs4 = :lrcotizacionobs4"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionobs3", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionobs3 = :lrcotizacionobs3"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionobs2", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionobs2 = :lrcotizacionobs2"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionobs1", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionobs1 = :lrcotizacionobs1"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionfchtope", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionfchtope = :lrcotizacionfchtope"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionporpmd", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionporpmd = :lrcotizacionporpmd"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizaciontasapactada", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizaciontasapactada = :lrcotizaciontasapactada"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionusuactual", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionusuactual = :lrcotizacionusuactual"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionpersonaaseg", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionpersonaaseg = :lrcotizacionpersonaaseg"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionfroning", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionfroning = :lrcotizacionfroning"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizaciontcaseg", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizaciontcaseg = :lrcotizaciontcaseg"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizaciontcexterno", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizaciontcexterno = :lrcotizaciontcexterno"),
    @NamedQuery(name = "Lrcotizacion.findByLrcotizacionnrotransaccion", query = "SELECT l FROM Lrcotizacion l WHERE l.lrcotizacionnrotransaccion = :lrcotizacionnrotransaccion")})
public class Lrcotizacion implements Serializable {
    @Column(name = "LRCOTIZACIONINDIVIDUAL")
    private Character lrcotizacionindividual;
    @Column(name = "LRCOTIZACIONNROPACK")
    private Long lrcotizacionnropack;
    @Column(name = "LRCOTIZACIONMOTIVOANULACIONID")
    private Long lrcotizacionmotivoanulacionid;
    @Column(name = "LRCOTIZACIONFORMAANULACION", length = 1)
    private String lrcotizacionformaanulacion;
    @Column(name = "LRCOTIZACIONENDOTIPID")
    private Long lrcotizacionendotipid;
//    @Column(name = "LRCOTIZACIONENDOTIPID")
//    private Long lrcotizacionendotipid;
    @Column(name = "LRCOTIZACIONNROMIGRA")
    private Long lrcotizacionnromigra;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONNROPOLIZA", nullable = false)
    private int lrcotizacionnropoliza;
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrcotizacionPK lrcotizacionPK;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONFECHACOTI", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotizacionfechacoti;
    @Column(name = "LRCOTIZACIONRUBROID")
    private Long lrcotizacionrubroid;
    @Column(name = "LRCOTIZACIONSUBRUBROID")
    private Long lrcotizacionsubrubroid;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONAGENTEID", nullable = false)
    private long lrcotizacionagenteid;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONSUBAGENTEID", nullable = false)
    private long lrcotizacionsubagenteid;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONFORMAPAGOID", nullable = false)
    private long lrcotizacionformapagoid;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONTIPOCOBROID", nullable = false)
    private long lrcotizaciontipocobroid;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONTIPOCOTI", nullable = false)
    private short lrcotizaciontipocoti;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONMONTOTOTAL", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotizacionmontototal;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONCOBRADORID", nullable = false)
    private long lrcotizacioncobradorid;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONPRENDARIOID", nullable = false)
    private long lrcotizacionprendarioid;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONPORDECLARACION", nullable = false)
    private Character lrcotizacionpordeclaracion;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONVTOTARJETA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotizacionvtotarjeta;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONNROTARJETA", nullable = false, length = 30)
    private String lrcotizacionnrotarjeta;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONAPROBCONTCLR", nullable = false)
    private Character lrcotizacionaprobcontclr;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONVIGDESDE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotizacionvigdesde;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONVIGHASTA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotizacionvighasta;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONVIGENCIA", nullable = false)
    private short lrcotizacionvigencia;
    @Column(name = "LRACTIVIDADID")
    private Long lractividadid;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONEJERCICIORENOV", nullable = false)
    private short lrcotizacionejerciciorenov;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONNROPOLIZARENOV", nullable = false)
    private int lrcotizacionnropolizarenov;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONANEXO", nullable = false)
    private short lrcotizacionanexo;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONENDOSO", nullable = false)
    private long lrcotizacionendoso;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONENDOSOPOR", nullable = false)
    private long lrcotizacionendosopor;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONUAL", nullable = false, length = 30)
    private String lrcotizacionual;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotizacionfal;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONUMD", nullable = false, length = 30)
    private String lrcotizacionumd;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotizacionfmd;
    @Column(name = "ENTIDADID")
    private Long entidadid;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONDECLARACIONDELMES", nullable = false)
    private Character lrcotizaciondeclaraciondelmes;
    @Column(name = "ENDOPRENDAID")
    private Long endoprendaid;
    @Column(name = "LRTIPOCOTIZACIONID")
    private Long lrtipocotizacionid;
    @Column(name = "LRMEDIDAPRESTACIONID")
    private Long lrmedidaprestacionid;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONAC", nullable = false)
    private Character lrcotizacionac;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONOBS4", nullable = false, length = 1000)
    private String lrcotizacionobs4;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONOBS3", nullable = false, length = 1000)
    private String lrcotizacionobs3;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONOBS2", nullable = false, length = 1000)
    private String lrcotizacionobs2;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONOBS1", nullable = false, length = 1000)
    private String lrcotizacionobs1;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONFCHTOPE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotizacionfchtope;
    @Column(name = "LRCOTIZACIONPORPMD", precision = 7, scale = 2)
    private BigDecimal lrcotizacionporpmd;
    @Column(name = "LRCOTIZACIONTASAPACTADA", precision = 7, scale = 2)
    private BigDecimal lrcotizaciontasapactada;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONUSUACTUAL", nullable = false, length = 30)
    private String lrcotizacionusuactual;
    @Column(name = "LRCOTIZACIONPERSONAASEG")
    private Long lrcotizacionpersonaaseg;
    @Column(name = "LRCOTIZACIONFRONING")
    private Character lrcotizacionfroning;
    @Column(name = "LRCOTIZACIONTCASEG")
    private Integer lrcotizaciontcaseg;
    @Column(name = "LRCOTIZACIONTCEXTERNO")
    private Character lrcotizaciontcexterno;
    @Column(name = "LRCOTIZACIONNROTRANSACCION")
    private Long lrcotizacionnrotransaccion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcotizacion")
    private List<Lrubicacion> lrubicacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcotizacion")
    private List<Lrtareacotizacion> lrtareacotizacionList;
    @JoinColumn(name = "LRCLASEPOLIZAID", referencedColumnName = "LRCLASEPOLIZAID", nullable = false)
    @ManyToOne(optional = false)
    private Lrclasepoliza lrclasepolizaid;
    @JoinColumn(name = "LRESTADOCOTIZACIONID", referencedColumnName = "LRESTADOCOTIZACIONID", nullable = false)
    @ManyToOne(optional = false)
    private Lrestadocotizacion lrestadocotizacionid;
    @JoinColumn(name = "LRMODOCOTIZACIONID", referencedColumnName = "LRMODOCOTIZACIONID", nullable = false)
    @ManyToOne(optional = false)
    private Lrmodocotizacion lrmodocotizacionid;
    @JoinColumn(name = "LRPROPUESTAID", referencedColumnName = "LRPROPUESTAID", nullable = false)
    @ManyToOne(optional = false)
    private Lrpropuesta lrpropuestaid;
    @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false)
    @ManyToOne(optional = false)
    private Lrseccdetalle lrseccdetalleid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcotizacion")
    private List<Lrcoticoaseguro> lrcoticoaseguroList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcotizacion")
    private List<Lrcotimotivorechazo> lrcotimotivorechazoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcotizacion")
    private List<Lrflujocotizacion> lrflujocotizacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcotizacion")
    private List<Lrcotizacionplan> lrcotizacionplanList;

    public Lrcotizacion() {
    }

    public Lrcotizacion(LrcotizacionPK lrcotizacionPK) {
        this.lrcotizacionPK = lrcotizacionPK;
    }

    public Lrcotizacion(LrcotizacionPK lrcotizacionPK, Date lrcotizacionfechacoti, long lrcotizacionagenteid, long lrcotizacionsubagenteid, long lrcotizacionformapagoid, long lrcotizaciontipocobroid, short lrcotizaciontipocoti, BigDecimal lrcotizacionmontototal, long lrcotizacioncobradorid, long lrcotizacionprendarioid, Character lrcotizacionpordeclaracion, Date lrcotizacionvtotarjeta, String lrcotizacionnrotarjeta, Character lrcotizacionaprobcontclr, Date lrcotizacionvigdesde, Date lrcotizacionvighasta, short lrcotizacionvigencia, short lrcotizacionnropoliza, short lrcotizacionejerciciorenov, int lrcotizacionnropolizarenov, short lrcotizacionanexo, long lrcotizacionendoso, long lrcotizacionendosopor, String lrcotizacionual, Date lrcotizacionfal, String lrcotizacionumd, Date lrcotizacionfmd, Character lrcotizaciondeclaraciondelmes, Character lrcotizacionac, String lrcotizacionobs4, String lrcotizacionobs3, String lrcotizacionobs2, String lrcotizacionobs1, Date lrcotizacionfchtope, String lrcotizacionusuactual) {
        this.lrcotizacionPK = lrcotizacionPK;
        this.lrcotizacionfechacoti = lrcotizacionfechacoti;
        this.lrcotizacionagenteid = lrcotizacionagenteid;
        this.lrcotizacionsubagenteid = lrcotizacionsubagenteid;
        this.lrcotizacionformapagoid = lrcotizacionformapagoid;
        this.lrcotizaciontipocobroid = lrcotizaciontipocobroid;
        this.lrcotizaciontipocoti = lrcotizaciontipocoti;
        this.lrcotizacionmontototal = lrcotizacionmontototal;
        this.lrcotizacioncobradorid = lrcotizacioncobradorid;
        this.lrcotizacionprendarioid = lrcotizacionprendarioid;
        this.lrcotizacionpordeclaracion = lrcotizacionpordeclaracion;
        this.lrcotizacionvtotarjeta = lrcotizacionvtotarjeta;
        this.lrcotizacionnrotarjeta = lrcotizacionnrotarjeta;
        this.lrcotizacionaprobcontclr = lrcotizacionaprobcontclr;
        this.lrcotizacionvigdesde = lrcotizacionvigdesde;
        this.lrcotizacionvighasta = lrcotizacionvighasta;
        this.lrcotizacionvigencia = lrcotizacionvigencia;
        this.lrcotizacionnropoliza = lrcotizacionnropoliza;
        this.lrcotizacionejerciciorenov = lrcotizacionejerciciorenov;
        this.lrcotizacionnropolizarenov = lrcotizacionnropolizarenov;
        this.lrcotizacionanexo = lrcotizacionanexo;
        this.lrcotizacionendoso = lrcotizacionendoso;
        this.lrcotizacionendosopor = lrcotizacionendosopor;
        this.lrcotizacionual = lrcotizacionual;
        this.lrcotizacionfal = lrcotizacionfal;
        this.lrcotizacionumd = lrcotizacionumd;
        this.lrcotizacionfmd = lrcotizacionfmd;
        this.lrcotizaciondeclaraciondelmes = lrcotizaciondeclaraciondelmes;
        this.lrcotizacionac = lrcotizacionac;
        this.lrcotizacionobs4 = lrcotizacionobs4;
        this.lrcotizacionobs3 = lrcotizacionobs3;
        this.lrcotizacionobs2 = lrcotizacionobs2;
        this.lrcotizacionobs1 = lrcotizacionobs1;
        this.lrcotizacionfchtope = lrcotizacionfchtope;
        this.lrcotizacionusuactual = lrcotizacionusuactual;
    }

    public Lrcotizacion(long lrcotizacionnro, long lrcotizacionversion) {
        this.lrcotizacionPK = new LrcotizacionPK(lrcotizacionnro, lrcotizacionversion);
    }

    public LrcotizacionPK getLrcotizacionPK() {
        return lrcotizacionPK;
    }

    public void setLrcotizacionPK(LrcotizacionPK lrcotizacionPK) {
        this.lrcotizacionPK = lrcotizacionPK;
    }

    public Date getLrcotizacionfechacoti() {
        return lrcotizacionfechacoti;
    }

    public void setLrcotizacionfechacoti(Date lrcotizacionfechacoti) {
        this.lrcotizacionfechacoti = lrcotizacionfechacoti;
    }

    public Long getLrcotizacionrubroid() {
        return lrcotizacionrubroid;
    }

    public void setLrcotizacionrubroid(Long lrcotizacionrubroid) {
        this.lrcotizacionrubroid = lrcotizacionrubroid;
    }

    public Long getLrcotizacionsubrubroid() {
        return lrcotizacionsubrubroid;
    }

    public void setLrcotizacionsubrubroid(Long lrcotizacionsubrubroid) {
        this.lrcotizacionsubrubroid = lrcotizacionsubrubroid;
    }

    public long getLrcotizacionagenteid() {
        return lrcotizacionagenteid;
    }

    public void setLrcotizacionagenteid(long lrcotizacionagenteid) {
        this.lrcotizacionagenteid = lrcotizacionagenteid;
    }

    public long getLrcotizacionsubagenteid() {
        return lrcotizacionsubagenteid;
    }

    public void setLrcotizacionsubagenteid(long lrcotizacionsubagenteid) {
        this.lrcotizacionsubagenteid = lrcotizacionsubagenteid;
    }

    public long getLrcotizacionformapagoid() {
        return lrcotizacionformapagoid;
    }

    public void setLrcotizacionformapagoid(long lrcotizacionformapagoid) {
        this.lrcotizacionformapagoid = lrcotizacionformapagoid;
    }

    public long getLrcotizaciontipocobroid() {
        return lrcotizaciontipocobroid;
    }

    public void setLrcotizaciontipocobroid(long lrcotizaciontipocobroid) {
        this.lrcotizaciontipocobroid = lrcotizaciontipocobroid;
    }

    public short getLrcotizaciontipocoti() {
        return lrcotizaciontipocoti;
    }

    public void setLrcotizaciontipocoti(short lrcotizaciontipocoti) {
        this.lrcotizaciontipocoti = lrcotizaciontipocoti;
    }

    public BigDecimal getLrcotizacionmontototal() {
        return lrcotizacionmontototal;
    }

    public void setLrcotizacionmontototal(BigDecimal lrcotizacionmontototal) {
        this.lrcotizacionmontototal = lrcotizacionmontototal;
    }

    public long getLrcotizacioncobradorid() {
        return lrcotizacioncobradorid;
    }

    public void setLrcotizacioncobradorid(long lrcotizacioncobradorid) {
        this.lrcotizacioncobradorid = lrcotizacioncobradorid;
    }

    public long getLrcotizacionprendarioid() {
        return lrcotizacionprendarioid;
    }

    public void setLrcotizacionprendarioid(long lrcotizacionprendarioid) {
        this.lrcotizacionprendarioid = lrcotizacionprendarioid;
    }

    public Character getLrcotizacionpordeclaracion() {
        return lrcotizacionpordeclaracion;
    }

    public void setLrcotizacionpordeclaracion(Character lrcotizacionpordeclaracion) {
        this.lrcotizacionpordeclaracion = lrcotizacionpordeclaracion;
    }

    public Date getLrcotizacionvtotarjeta() {
        return lrcotizacionvtotarjeta;
    }

    public void setLrcotizacionvtotarjeta(Date lrcotizacionvtotarjeta) {
        this.lrcotizacionvtotarjeta = lrcotizacionvtotarjeta;
    }

    public String getLrcotizacionnrotarjeta() {
        return lrcotizacionnrotarjeta;
    }

    public void setLrcotizacionnrotarjeta(String lrcotizacionnrotarjeta) {
        this.lrcotizacionnrotarjeta = lrcotizacionnrotarjeta;
    }

    public Character getLrcotizacionaprobcontclr() {
        return lrcotizacionaprobcontclr;
    }

    public void setLrcotizacionaprobcontclr(Character lrcotizacionaprobcontclr) {
        this.lrcotizacionaprobcontclr = lrcotizacionaprobcontclr;
    }

    public Date getLrcotizacionvigdesde() {
        return lrcotizacionvigdesde;
    }

    public void setLrcotizacionvigdesde(Date lrcotizacionvigdesde) {
        this.lrcotizacionvigdesde = lrcotizacionvigdesde;
    }

    public Date getLrcotizacionvighasta() {
        return lrcotizacionvighasta;
    }

    public void setLrcotizacionvighasta(Date lrcotizacionvighasta) {
        this.lrcotizacionvighasta = lrcotizacionvighasta;
    }

    public short getLrcotizacionvigencia() {
        return lrcotizacionvigencia;
    }

    public void setLrcotizacionvigencia(short lrcotizacionvigencia) {
        this.lrcotizacionvigencia = lrcotizacionvigencia;
    }

    public Long getLractividadid() {
        return lractividadid;
    }

    public void setLractividadid(Long lractividadid) {
        this.lractividadid = lractividadid;
    }


    public short getLrcotizacionejerciciorenov() {
        return lrcotizacionejerciciorenov;
    }

    public void setLrcotizacionejerciciorenov(short lrcotizacionejerciciorenov) {
        this.lrcotizacionejerciciorenov = lrcotizacionejerciciorenov;
    }

    public int getLrcotizacionnropolizarenov() {
        return lrcotizacionnropolizarenov;
    }

    public void setLrcotizacionnropolizarenov(int lrcotizacionnropolizarenov) {
        this.lrcotizacionnropolizarenov = lrcotizacionnropolizarenov;
    }

    public short getLrcotizacionanexo() {
        return lrcotizacionanexo;
    }

    public void setLrcotizacionanexo(short lrcotizacionanexo) {
        this.lrcotizacionanexo = lrcotizacionanexo;
    }

    public long getLrcotizacionendoso() {
        return lrcotizacionendoso;
    }

    public void setLrcotizacionendoso(long lrcotizacionendoso) {
        this.lrcotizacionendoso = lrcotizacionendoso;
    }

    public long getLrcotizacionendosopor() {
        return lrcotizacionendosopor;
    }

    public void setLrcotizacionendosopor(long lrcotizacionendosopor) {
        this.lrcotizacionendosopor = lrcotizacionendosopor;
    }

    public String getLrcotizacionual() {
        return lrcotizacionual;
    }

    public void setLrcotizacionual(String lrcotizacionual) {
        this.lrcotizacionual = lrcotizacionual;
    }

    public Date getLrcotizacionfal() {
        return lrcotizacionfal;
    }

    public void setLrcotizacionfal(Date lrcotizacionfal) {
        this.lrcotizacionfal = lrcotizacionfal;
    }

    public String getLrcotizacionumd() {
        return lrcotizacionumd;
    }

    public void setLrcotizacionumd(String lrcotizacionumd) {
        this.lrcotizacionumd = lrcotizacionumd;
    }

    public Date getLrcotizacionfmd() {
        return lrcotizacionfmd;
    }

    public void setLrcotizacionfmd(Date lrcotizacionfmd) {
        this.lrcotizacionfmd = lrcotizacionfmd;
    }

    public Long getEntidadid() {
        return entidadid;
    }

    public void setEntidadid(Long entidadid) {
        this.entidadid = entidadid;
    }

    public Character getLrcotizaciondeclaraciondelmes() {
        return lrcotizaciondeclaraciondelmes;
    }

    public void setLrcotizaciondeclaraciondelmes(Character lrcotizaciondeclaraciondelmes) {
        this.lrcotizaciondeclaraciondelmes = lrcotizaciondeclaraciondelmes;
    }

    public Long getEndoprendaid() {
        return endoprendaid;
    }

    public void setEndoprendaid(Long endoprendaid) {
        this.endoprendaid = endoprendaid;
    }

    public Long getLrtipocotizacionid() {
        return lrtipocotizacionid;
    }

    public void setLrtipocotizacionid(Long lrtipocotizacionid) {
        this.lrtipocotizacionid = lrtipocotizacionid;
    }

    public Long getLrmedidaprestacionid() {
        return lrmedidaprestacionid;
    }

    public void setLrmedidaprestacionid(Long lrmedidaprestacionid) {
        this.lrmedidaprestacionid = lrmedidaprestacionid;
    }

    public Character getLrcotizacionac() {
        return lrcotizacionac;
    }

    public void setLrcotizacionac(Character lrcotizacionac) {
        this.lrcotizacionac = lrcotizacionac;
    }

    public String getLrcotizacionobs4() {
        return lrcotizacionobs4;
    }

    public void setLrcotizacionobs4(String lrcotizacionobs4) {
        this.lrcotizacionobs4 = lrcotizacionobs4;
    }

    public String getLrcotizacionobs3() {
        return lrcotizacionobs3;
    }

    public void setLrcotizacionobs3(String lrcotizacionobs3) {
        this.lrcotizacionobs3 = lrcotizacionobs3;
    }

    public String getLrcotizacionobs2() {
        return lrcotizacionobs2;
    }

    public void setLrcotizacionobs2(String lrcotizacionobs2) {
        this.lrcotizacionobs2 = lrcotizacionobs2;
    }

    public String getLrcotizacionobs1() {
        return lrcotizacionobs1;
    }

    public void setLrcotizacionobs1(String lrcotizacionobs1) {
        this.lrcotizacionobs1 = lrcotizacionobs1;
    }

    public Date getLrcotizacionfchtope() {
        return lrcotizacionfchtope;
    }

    public void setLrcotizacionfchtope(Date lrcotizacionfchtope) {
        this.lrcotizacionfchtope = lrcotizacionfchtope;
    }

    public BigDecimal getLrcotizacionporpmd() {
        return lrcotizacionporpmd;
    }

    public void setLrcotizacionporpmd(BigDecimal lrcotizacionporpmd) {
        this.lrcotizacionporpmd = lrcotizacionporpmd;
    }

    public BigDecimal getLrcotizaciontasapactada() {
        return lrcotizaciontasapactada;
    }

    public void setLrcotizaciontasapactada(BigDecimal lrcotizaciontasapactada) {
        this.lrcotizaciontasapactada = lrcotizaciontasapactada;
    }

    public String getLrcotizacionusuactual() {
        return lrcotizacionusuactual;
    }

    public void setLrcotizacionusuactual(String lrcotizacionusuactual) {
        this.lrcotizacionusuactual = lrcotizacionusuactual;
    }

    public Long getLrcotizacionpersonaaseg() {
        return lrcotizacionpersonaaseg;
    }

    public void setLrcotizacionpersonaaseg(Long lrcotizacionpersonaaseg) {
        this.lrcotizacionpersonaaseg = lrcotizacionpersonaaseg;
    }

    public Character getLrcotizacionfroning() {
        return lrcotizacionfroning;
    }

    public void setLrcotizacionfroning(Character lrcotizacionfroning) {
        this.lrcotizacionfroning = lrcotizacionfroning;
    }

    public Integer getLrcotizaciontcaseg() {
        return lrcotizaciontcaseg;
    }

    public void setLrcotizaciontcaseg(Integer lrcotizaciontcaseg) {
        this.lrcotizaciontcaseg = lrcotizaciontcaseg;
    }

    public Character getLrcotizaciontcexterno() {
        return lrcotizaciontcexterno;
    }

    public void setLrcotizaciontcexterno(Character lrcotizaciontcexterno) {
        this.lrcotizaciontcexterno = lrcotizaciontcexterno;
    }

    public Long getLrcotizacionnrotransaccion() {
        return lrcotizacionnrotransaccion;
    }

    public void setLrcotizacionnrotransaccion(Long lrcotizacionnrotransaccion) {
        this.lrcotizacionnrotransaccion = lrcotizacionnrotransaccion;
    }

    public List<Lrubicacion> getLrubicacionList() {
        return lrubicacionList;
    }

    public void setLrubicacionList(List<Lrubicacion> lrubicacionList) {
        this.lrubicacionList = lrubicacionList;
    }

    public List<Lrtareacotizacion> getLrtareacotizacionList() {
        return lrtareacotizacionList;
    }

    public void setLrtareacotizacionList(List<Lrtareacotizacion> lrtareacotizacionList) {
        this.lrtareacotizacionList = lrtareacotizacionList;
    }

    public Lrclasepoliza getLrclasepolizaid() {
        return lrclasepolizaid;
    }

    public void setLrclasepolizaid(Lrclasepoliza lrclasepolizaid) {
        this.lrclasepolizaid = lrclasepolizaid;
    }

    public Lrestadocotizacion getLrestadocotizacionid() {
        return lrestadocotizacionid;
    }

    public void setLrestadocotizacionid(Lrestadocotizacion lrestadocotizacionid) {
        this.lrestadocotizacionid = lrestadocotizacionid;
    }

    public Lrmodocotizacion getLrmodocotizacionid() {
        return lrmodocotizacionid;
    }

    public void setLrmodocotizacionid(Lrmodocotizacion lrmodocotizacionid) {
        this.lrmodocotizacionid = lrmodocotizacionid;
    }

    public Lrpropuesta getLrpropuestaid() {
        return lrpropuestaid;
    }

    public void setLrpropuestaid(Lrpropuesta lrpropuestaid) {
        this.lrpropuestaid = lrpropuestaid;
    }

    public Lrseccdetalle getLrseccdetalleid() {
        return lrseccdetalleid;
    }

    public void setLrseccdetalleid(Lrseccdetalle lrseccdetalleid) {
        this.lrseccdetalleid = lrseccdetalleid;
    }

    public List<Lrcoticoaseguro> getLrcoticoaseguroList() {
        return lrcoticoaseguroList;
    }

    public void setLrcoticoaseguroList(List<Lrcoticoaseguro> lrcoticoaseguroList) {
        this.lrcoticoaseguroList = lrcoticoaseguroList;
    }

    public List<Lrcotimotivorechazo> getLrcotimotivorechazoList() {
        return lrcotimotivorechazoList;
    }

    public void setLrcotimotivorechazoList(List<Lrcotimotivorechazo> lrcotimotivorechazoList) {
        this.lrcotimotivorechazoList = lrcotimotivorechazoList;
    }

    public List<Lrflujocotizacion> getLrflujocotizacionList() {
        return lrflujocotizacionList;
    }

    public void setLrflujocotizacionList(List<Lrflujocotizacion> lrflujocotizacionList) {
        this.lrflujocotizacionList = lrflujocotizacionList;
    }

    public List<Lrcotizacionplan> getLrcotizacionplanList() {
        return lrcotizacionplanList;
    }

    public void setLrcotizacionplanList(List<Lrcotizacionplan> lrcotizacionplanList) {
        this.lrcotizacionplanList = lrcotizacionplanList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcotizacionPK != null ? lrcotizacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcotizacion)) {
            return false;
        }
        Lrcotizacion other = (Lrcotizacion) object;
        if ((this.lrcotizacionPK == null && other.lrcotizacionPK != null) || (this.lrcotizacionPK != null && !this.lrcotizacionPK.equals(other.lrcotizacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcotizacion[ lrcotizacionPK=" + lrcotizacionPK + " ]";
    }

    public int getLrcotizacionnropoliza() {
        return lrcotizacionnropoliza;
    }

    public void setLrcotizacionnropoliza(int lrcotizacionnropoliza) {
        this.lrcotizacionnropoliza = lrcotizacionnropoliza;
    }

//    public Long getLrcotizacionendotipid() {
//        return lrcotizacionendotipid;
//    }
//
//    public void setLrcotizacionendotipid(Long lrcotizacionendotipid) {
//        this.lrcotizacionendotipid = lrcotizacionendotipid;
//    }

    public Long getLrcotizacionnromigra() {
        return lrcotizacionnromigra;
    }

    public void setLrcotizacionnromigra(Long lrcotizacionnromigra) {
        this.lrcotizacionnromigra = lrcotizacionnromigra;
    }

    public Long getLrcotizacionendotipid() {
        return lrcotizacionendotipid;
    }

    public void setLrcotizacionendotipid(Long lrcotizacionendotipid) {
        this.lrcotizacionendotipid = lrcotizacionendotipid;
    }

    public Long getLrcotizacionmotivoanulacionid() {
        return lrcotizacionmotivoanulacionid;
    }

    public void setLrcotizacionmotivoanulacionid(Long lrcotizacionmotivoanulacionid) {
        this.lrcotizacionmotivoanulacionid = lrcotizacionmotivoanulacionid;
    }

    public String getLrcotizacionformaanulacion() {
        return lrcotizacionformaanulacion;
    }

    public void setLrcotizacionformaanulacion(String lrcotizacionformaanulacion) {
        this.lrcotizacionformaanulacion = lrcotizacionformaanulacion;
    }

    public Character getLrcotizacionindividual() {
        return lrcotizacionindividual;
    }

    public void setLrcotizacionindividual(Character lrcotizacionindividual) {
        this.lrcotizacionindividual = lrcotizacionindividual;
    }

    public Long getLrcotizacionnropack() {
        return lrcotizacionnropack;
    }

    public void setLrcotizacionnropack(Long lrcotizacionnropack) {
        this.lrcotizacionnropack = lrcotizacionnropack;
    }
    
}
