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
@Table(name = "LRDATOSVEHICULO")
@NamedQueries({
    @NamedQuery(name = "Lrdatosvehiculo.findAll", query = "SELECT l FROM Lrdatosvehiculo l"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculoid", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculoid = :lrdatosvehiculoid"),
    @NamedQuery(name = "Lrdatosvehiculo.findByVehiculostipid", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.vehiculostipid = :vehiculostipid"),
    @NamedQuery(name = "Lrdatosvehiculo.findByMarcasid", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.marcasid = :marcasid"),
    @NamedQuery(name = "Lrdatosvehiculo.findByModelosid", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.modelosid = :modelosid"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculoanho", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculoanho = :lrdatosvehiculoanho"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculomotor", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculomotor = :lrdatosvehiculomotor"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculovalorcasco", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculovalorcasco = :lrdatosvehiculovalorcasco"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculonrochasis", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculonrochasis = :lrdatosvehiculonrochasis"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculonrochapa", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculonrochapa = :lrdatosvehiculonrochapa"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculoblindaje", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculoblindaje = :lrdatosvehiculoblindaje"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculotipoblindaje", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculotipoblindaje = :lrdatosvehiculotipoblindaje"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculovalorblindaje", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculovalorblindaje = :lrdatosvehiculovalorblindaje"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculotuvostro", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculotuvostro = :lrdatosvehiculotuvostro"),
    @NamedQuery(name = "Lrdatosvehiculo.findByTiposimportacionid", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.tiposimportacionid = :tiposimportacionid"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculoairbagcl", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculoairbagcl = :lrdatosvehiculoairbagcl"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculoairbagcf", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculoairbagcf = :lrdatosvehiculoairbagcf"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculoairbagotros", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculoairbagotros = :lrdatosvehiculoairbagotros"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculosisseg", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculosisseg = :lrdatosvehiculosisseg"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculosissegtip", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculosissegtip = :lrdatosvehiculosissegtip"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculocilindros", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculocilindros = :lrdatosvehiculocilindros"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculocaja", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculocaja = :lrdatosvehiculocaja"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculotipoeje", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculotipoeje = :lrdatosvehiculotipoeje"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculotracc", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculotracc = :lrdatosvehiculotracc"),
    @NamedQuery(name = "Lrdatosvehiculo.findByVehiculocolorid", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.vehiculocolorid = :vehiculocolorid"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculomovidoa", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculomovidoa = :lrdatosvehiculomovidoa"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculopuertas", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculopuertas = :lrdatosvehiculopuertas"),
    @NamedQuery(name = "Lrdatosvehiculo.findByProcedenciaid", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.procedenciaid = :procedenciaid"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculotone", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculotone = :lrdatosvehiculotone"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculoantiguedad", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculoantiguedad = :lrdatosvehiculoantiguedad"),
    @NamedQuery(name = "Lrdatosvehiculo.findByVehiculosusoid", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.vehiculosusoid = :vehiculosusoid"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculocodgps", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculocodgps = :lrdatosvehiculocodgps"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculocartaverde", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculocartaverde = :lrdatosvehiculocartaverde"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculosingrua", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculosingrua = :lrdatosvehiculosingrua"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculocantocu", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculocantocu = :lrdatosvehiculocantocu"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculofal", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculofal = :lrdatosvehiculofal"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculoual", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculoual = :lrdatosvehiculoual"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculofmd", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculofmd = :lrdatosvehiculofmd"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculoumd", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculoumd = :lrdatosvehiculoumd"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculofranqadic", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculofranqadic = :lrdatosvehiculofranqadic"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculoovpadic", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculoovpadic = :lrdatosvehiculoovpadic"),
    @NamedQuery(name = "Lrdatosvehiculo.findByLrdatosvehiculorcadic", query = "SELECT l FROM Lrdatosvehiculo l WHERE l.lrdatosvehiculorcadic = :lrdatosvehiculorcadic")})
public class Lrdatosvehiculo implements Serializable {

    @Id
    @SequenceGenerator(name = "LRDATOSVEHICULOID_SEQ_GENERATOR", sequenceName = "LRDATOSVEHICULOID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LRDATOSVEHICULOID_SEQ_GENERATOR")
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOID", nullable = false)
    private Long lrdatosvehiculoid;
    @Basic(optional = false)
    @Column(name = "VEHICULOSTIPID", nullable = false)
    private long vehiculostipid;
    @Basic(optional = false)
    @Column(name = "MARCASID", nullable = false)
    private long marcasid;
    @Basic(optional = false)
    @Column(name = "MODELOSID", nullable = false)
    private long modelosid;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOANHO", nullable = false)
    private short lrdatosvehiculoanho;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOMOTOR", nullable = false, length = 20)
    private String lrdatosvehiculomotor;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOVALORCASCO", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrdatosvehiculovalorcasco;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULONROCHASIS", nullable = false, length = 30)
    private String lrdatosvehiculonrochasis;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULONROCHAPA", nullable = false, length = 15)
    private String lrdatosvehiculonrochapa;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOBLINDAJE", nullable = false)
    private Character lrdatosvehiculoblindaje;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOTIPOBLINDAJE", nullable = false, length = 15)
    private String lrdatosvehiculotipoblindaje;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOVALORBLINDAJE", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrdatosvehiculovalorblindaje;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOTUVOSTRO", nullable = false)
    private Character lrdatosvehiculotuvostro;
    @Basic(optional = false)
    @Column(name = "TIPOSIMPORTACIONID", nullable = false)
    private long tiposimportacionid;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOAIRBAGCL", nullable = false)
    private Character lrdatosvehiculoairbagcl;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOAIRBAGCF", nullable = false)
    private Character lrdatosvehiculoairbagcf;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOAIRBAGOTROS", nullable = false, length = 50)
    private String lrdatosvehiculoairbagotros;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOSISSEG", nullable = false)
    private Character lrdatosvehiculosisseg;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOSISSEGTIP", nullable = false, length = 50)
    private String lrdatosvehiculosissegtip;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOCILINDROS", nullable = false, length = 50)
    private String lrdatosvehiculocilindros;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOCAJA", nullable = false, length = 10)
    private String lrdatosvehiculocaja;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOTIPOEJE", nullable = false, length = 50)
    private String lrdatosvehiculotipoeje;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOTRACC", nullable = false, length = 50)
    private String lrdatosvehiculotracc;
    @Column(name = "VEHICULOCOLORID")
    private Long vehiculocolorid;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOMOVIDOA", nullable = false, length = 50)
    private String lrdatosvehiculomovidoa;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOPUERTAS", nullable = false)
    private short lrdatosvehiculopuertas;
    @Column(name = "PROCEDENCIAID")
    private Long procedenciaid;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOTONE", nullable = false, length = 50)
    private String lrdatosvehiculotone;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOANTIGUEDAD", nullable = false)
    private short lrdatosvehiculoantiguedad;
    @Basic(optional = false)
    @Column(name = "VEHICULOSUSOID", nullable = false)
    private long vehiculosusoid;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOCODGPS", nullable = false)
    private short lrdatosvehiculocodgps;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOCARTAVERDE", nullable = false)
    private Character lrdatosvehiculocartaverde;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULORCADIC", nullable = false)
    private short lrdatosvehiculorcadic;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOOVPADIC", nullable = false)
    private short lrdatosvehiculoovpadic;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOSINGRUA", nullable = false)
    private Character lrdatosvehiculosingrua;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOFRANQADIC", nullable = false)
    private Character lrdatosvehiculofranqadic;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOCANTOCU", nullable = false)
    private short lrdatosvehiculocantocu;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrdatosvehiculofal;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOUAL", nullable = false, length = 30)
    private String lrdatosvehiculoual;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrdatosvehiculofmd;
    @Basic(optional = false)
    @Column(name = "LRDATOSVEHICULOUMD", nullable = false, length = 30)
    private String lrdatosvehiculoumd;
    @JoinColumns({
        @JoinColumn(name = "LRCOTIDATBIENASEID", referencedColumnName = "LRCOTIDATBIENASEID", nullable = false),
        @JoinColumn(name = "LRUBICACIONID", referencedColumnName = "LRUBICACIONID", nullable = false)})
    @ManyToOne(optional = false)
    private Lrcotidatbienase lrcotidatbienase;

    public Lrdatosvehiculo() {
    }

    public Lrdatosvehiculo(Long lrdatosvehiculoid) {
        this.lrdatosvehiculoid = lrdatosvehiculoid;
    }

    public Lrdatosvehiculo(Long lrdatosvehiculoid, long vehiculostipid, long marcasid, long modelosid, short lrdatosvehiculoanho, String lrdatosvehiculomotor, BigDecimal lrdatosvehiculovalorcasco, String lrdatosvehiculonrochasis, String lrdatosvehiculonrochapa, Character lrdatosvehiculoblindaje, String lrdatosvehiculotipoblindaje, BigDecimal lrdatosvehiculovalorblindaje, Character lrdatosvehiculotuvostro, long tiposimportacionid, Character lrdatosvehiculoairbagcl, Character lrdatosvehiculoairbagcf, String lrdatosvehiculoairbagotros, Character lrdatosvehiculosisseg, String lrdatosvehiculosissegtip, String lrdatosvehiculocilindros, String lrdatosvehiculocaja, String lrdatosvehiculotipoeje, String lrdatosvehiculotracc, String lrdatosvehiculomovidoa, short lrdatosvehiculopuertas, String lrdatosvehiculotone, short lrdatosvehiculoantiguedad, long vehiculosusoid, short lrdatosvehiculocodgps, Character lrdatosvehiculocartaverde, short lrdatosvehiculorcadic, short lrdatosvehiculoovpadic, Character lrdatosvehiculosingrua, Character lrdatosvehiculofranqadic, short lrdatosvehiculocantocu, Date lrdatosvehiculofal, String lrdatosvehiculoual, Date lrdatosvehiculofmd, String lrdatosvehiculoumd) {
        this.lrdatosvehiculoid = lrdatosvehiculoid;
        this.vehiculostipid = vehiculostipid;
        this.marcasid = marcasid;
        this.modelosid = modelosid;
        this.lrdatosvehiculoanho = lrdatosvehiculoanho;
        this.lrdatosvehiculomotor = lrdatosvehiculomotor;
        this.lrdatosvehiculovalorcasco = lrdatosvehiculovalorcasco;
        this.lrdatosvehiculonrochasis = lrdatosvehiculonrochasis;
        this.lrdatosvehiculonrochapa = lrdatosvehiculonrochapa;
        this.lrdatosvehiculoblindaje = lrdatosvehiculoblindaje;
        this.lrdatosvehiculotipoblindaje = lrdatosvehiculotipoblindaje;
        this.lrdatosvehiculovalorblindaje = lrdatosvehiculovalorblindaje;
        this.lrdatosvehiculotuvostro = lrdatosvehiculotuvostro;
        this.tiposimportacionid = tiposimportacionid;
        this.lrdatosvehiculoairbagcl = lrdatosvehiculoairbagcl;
        this.lrdatosvehiculoairbagcf = lrdatosvehiculoairbagcf;
        this.lrdatosvehiculoairbagotros = lrdatosvehiculoairbagotros;
        this.lrdatosvehiculosisseg = lrdatosvehiculosisseg;
        this.lrdatosvehiculosissegtip = lrdatosvehiculosissegtip;
        this.lrdatosvehiculocilindros = lrdatosvehiculocilindros;
        this.lrdatosvehiculocaja = lrdatosvehiculocaja;
        this.lrdatosvehiculotipoeje = lrdatosvehiculotipoeje;
        this.lrdatosvehiculotracc = lrdatosvehiculotracc;
        this.lrdatosvehiculomovidoa = lrdatosvehiculomovidoa;
        this.lrdatosvehiculopuertas = lrdatosvehiculopuertas;
        this.lrdatosvehiculotone = lrdatosvehiculotone;
        this.lrdatosvehiculoantiguedad = lrdatosvehiculoantiguedad;
        this.vehiculosusoid = vehiculosusoid;
        this.lrdatosvehiculocodgps = lrdatosvehiculocodgps;
        this.lrdatosvehiculocartaverde = lrdatosvehiculocartaverde;
        this.lrdatosvehiculorcadic = lrdatosvehiculorcadic;
        this.lrdatosvehiculoovpadic = lrdatosvehiculoovpadic;
        this.lrdatosvehiculosingrua = lrdatosvehiculosingrua;
        this.lrdatosvehiculofranqadic = lrdatosvehiculofranqadic;
        this.lrdatosvehiculocantocu = lrdatosvehiculocantocu;
        this.lrdatosvehiculofal = lrdatosvehiculofal;
        this.lrdatosvehiculoual = lrdatosvehiculoual;
        this.lrdatosvehiculofmd = lrdatosvehiculofmd;
        this.lrdatosvehiculoumd = lrdatosvehiculoumd;
    }

    public Long getLrdatosvehiculoid() {
        return lrdatosvehiculoid;
    }

    public void setLrdatosvehiculoid(Long lrdatosvehiculoid) {
        this.lrdatosvehiculoid = lrdatosvehiculoid;
    }

    public long getVehiculostipid() {
        return vehiculostipid;
    }

    public void setVehiculostipid(long vehiculostipid) {
        this.vehiculostipid = vehiculostipid;
    }

    public long getMarcasid() {
        return marcasid;
    }

    public void setMarcasid(long marcasid) {
        this.marcasid = marcasid;
    }

    public long getModelosid() {
        return modelosid;
    }

    public void setModelosid(long modelosid) {
        this.modelosid = modelosid;
    }

    public short getLrdatosvehiculoanho() {
        return lrdatosvehiculoanho;
    }

    public void setLrdatosvehiculoanho(short lrdatosvehiculoanho) {
        this.lrdatosvehiculoanho = lrdatosvehiculoanho;
    }

    public String getLrdatosvehiculomotor() {
        return lrdatosvehiculomotor;
    }

    public void setLrdatosvehiculomotor(String lrdatosvehiculomotor) {
        this.lrdatosvehiculomotor = lrdatosvehiculomotor;
    }

    public BigDecimal getLrdatosvehiculovalorcasco() {
        return lrdatosvehiculovalorcasco;
    }

    public void setLrdatosvehiculovalorcasco(BigDecimal lrdatosvehiculovalorcasco) {
        this.lrdatosvehiculovalorcasco = lrdatosvehiculovalorcasco;
    }

    public String getLrdatosvehiculonrochasis() {
        return lrdatosvehiculonrochasis;
    }

    public void setLrdatosvehiculonrochasis(String lrdatosvehiculonrochasis) {
        this.lrdatosvehiculonrochasis = lrdatosvehiculonrochasis;
    }

    public String getLrdatosvehiculonrochapa() {
        return lrdatosvehiculonrochapa;
    }

    public void setLrdatosvehiculonrochapa(String lrdatosvehiculonrochapa) {
        this.lrdatosvehiculonrochapa = lrdatosvehiculonrochapa;
    }

    public Character getLrdatosvehiculoblindaje() {
        return lrdatosvehiculoblindaje;
    }

    public void setLrdatosvehiculoblindaje(Character lrdatosvehiculoblindaje) {
        this.lrdatosvehiculoblindaje = lrdatosvehiculoblindaje;
    }

    public String getLrdatosvehiculotipoblindaje() {
        return lrdatosvehiculotipoblindaje;
    }

    public void setLrdatosvehiculotipoblindaje(String lrdatosvehiculotipoblindaje) {
        this.lrdatosvehiculotipoblindaje = lrdatosvehiculotipoblindaje;
    }

    public BigDecimal getLrdatosvehiculovalorblindaje() {
        return lrdatosvehiculovalorblindaje;
    }

    public void setLrdatosvehiculovalorblindaje(BigDecimal lrdatosvehiculovalorblindaje) {
        this.lrdatosvehiculovalorblindaje = lrdatosvehiculovalorblindaje;
    }

    public Character getLrdatosvehiculotuvostro() {
        return lrdatosvehiculotuvostro;
    }

    public void setLrdatosvehiculotuvostro(Character lrdatosvehiculotuvostro) {
        this.lrdatosvehiculotuvostro = lrdatosvehiculotuvostro;
    }

    public long getTiposimportacionid() {
        return tiposimportacionid;
    }

    public void setTiposimportacionid(long tiposimportacionid) {
        this.tiposimportacionid = tiposimportacionid;
    }

    public Character getLrdatosvehiculoairbagcl() {
        return lrdatosvehiculoairbagcl;
    }

    public void setLrdatosvehiculoairbagcl(Character lrdatosvehiculoairbagcl) {
        this.lrdatosvehiculoairbagcl = lrdatosvehiculoairbagcl;
    }

    public Character getLrdatosvehiculoairbagcf() {
        return lrdatosvehiculoairbagcf;
    }

    public void setLrdatosvehiculoairbagcf(Character lrdatosvehiculoairbagcf) {
        this.lrdatosvehiculoairbagcf = lrdatosvehiculoairbagcf;
    }

    public String getLrdatosvehiculoairbagotros() {
        return lrdatosvehiculoairbagotros;
    }

    public void setLrdatosvehiculoairbagotros(String lrdatosvehiculoairbagotros) {
        this.lrdatosvehiculoairbagotros = lrdatosvehiculoairbagotros;
    }

    public Character getLrdatosvehiculosisseg() {
        return lrdatosvehiculosisseg;
    }

    public void setLrdatosvehiculosisseg(Character lrdatosvehiculosisseg) {
        this.lrdatosvehiculosisseg = lrdatosvehiculosisseg;
    }

    public String getLrdatosvehiculosissegtip() {
        return lrdatosvehiculosissegtip;
    }

    public void setLrdatosvehiculosissegtip(String lrdatosvehiculosissegtip) {
        this.lrdatosvehiculosissegtip = lrdatosvehiculosissegtip;
    }

    public String getLrdatosvehiculocilindros() {
        return lrdatosvehiculocilindros;
    }

    public void setLrdatosvehiculocilindros(String lrdatosvehiculocilindros) {
        this.lrdatosvehiculocilindros = lrdatosvehiculocilindros;
    }

    public String getLrdatosvehiculocaja() {
        return lrdatosvehiculocaja;
    }

    public void setLrdatosvehiculocaja(String lrdatosvehiculocaja) {
        this.lrdatosvehiculocaja = lrdatosvehiculocaja;
    }

    public String getLrdatosvehiculotipoeje() {
        return lrdatosvehiculotipoeje;
    }

    public void setLrdatosvehiculotipoeje(String lrdatosvehiculotipoeje) {
        this.lrdatosvehiculotipoeje = lrdatosvehiculotipoeje;
    }

    public String getLrdatosvehiculotracc() {
        return lrdatosvehiculotracc;
    }

    public void setLrdatosvehiculotracc(String lrdatosvehiculotracc) {
        this.lrdatosvehiculotracc = lrdatosvehiculotracc;
    }

    public Long getVehiculocolorid() {
        return vehiculocolorid;
    }

    public void setVehiculocolorid(Long vehiculocolorid) {
        this.vehiculocolorid = vehiculocolorid;
    }

    public String getLrdatosvehiculomovidoa() {
        return lrdatosvehiculomovidoa;
    }

    public void setLrdatosvehiculomovidoa(String lrdatosvehiculomovidoa) {
        this.lrdatosvehiculomovidoa = lrdatosvehiculomovidoa;
    }

    public short getLrdatosvehiculopuertas() {
        return lrdatosvehiculopuertas;
    }

    public void setLrdatosvehiculopuertas(short lrdatosvehiculopuertas) {
        this.lrdatosvehiculopuertas = lrdatosvehiculopuertas;
    }

    public Long getProcedenciaid() {
        return procedenciaid;
    }

    public void setProcedenciaid(Long procedenciaid) {
        this.procedenciaid = procedenciaid;
    }

    public String getLrdatosvehiculotone() {
        return lrdatosvehiculotone;
    }

    public void setLrdatosvehiculotone(String lrdatosvehiculotone) {
        this.lrdatosvehiculotone = lrdatosvehiculotone;
    }

    public short getLrdatosvehiculoantiguedad() {
        return lrdatosvehiculoantiguedad;
    }

    public void setLrdatosvehiculoantiguedad(short lrdatosvehiculoantiguedad) {
        this.lrdatosvehiculoantiguedad = lrdatosvehiculoantiguedad;
    }

    public long getVehiculosusoid() {
        return vehiculosusoid;
    }

    public void setVehiculosusoid(long vehiculosusoid) {
        this.vehiculosusoid = vehiculosusoid;
    }

    public short getLrdatosvehiculocodgps() {
        return lrdatosvehiculocodgps;
    }

    public void setLrdatosvehiculocodgps(short lrdatosvehiculocodgps) {
        this.lrdatosvehiculocodgps = lrdatosvehiculocodgps;
    }

    public Character getLrdatosvehiculocartaverde() {
        return lrdatosvehiculocartaverde;
    }

    public void setLrdatosvehiculocartaverde(Character lrdatosvehiculocartaverde) {
        this.lrdatosvehiculocartaverde = lrdatosvehiculocartaverde;
    }

    public short getLrdatosvehiculorcadic() {
        return lrdatosvehiculorcadic;
    }

    public void setLrdatosvehiculorcadic(short lrdatosvehiculorcadic) {
        this.lrdatosvehiculorcadic = lrdatosvehiculorcadic;
    }

    public short getLrdatosvehiculoovpadic() {
        return lrdatosvehiculoovpadic;
    }

    public void setLrdatosvehiculoovpadic(short lrdatosvehiculoovpadic) {
        this.lrdatosvehiculoovpadic = lrdatosvehiculoovpadic;
    }

    public Character getLrdatosvehiculosingrua() {
        return lrdatosvehiculosingrua;
    }

    public void setLrdatosvehiculosingrua(Character lrdatosvehiculosingrua) {
        this.lrdatosvehiculosingrua = lrdatosvehiculosingrua;
    }

    public Character getLrdatosvehiculofranqadic() {
        return lrdatosvehiculofranqadic;
    }

    public void setLrdatosvehiculofranqadic(Character lrdatosvehiculofranqadic) {
        this.lrdatosvehiculofranqadic = lrdatosvehiculofranqadic;
    }

    public short getLrdatosvehiculocantocu() {
        return lrdatosvehiculocantocu;
    }

    public void setLrdatosvehiculocantocu(short lrdatosvehiculocantocu) {
        this.lrdatosvehiculocantocu = lrdatosvehiculocantocu;
    }

    public Date getLrdatosvehiculofal() {
        return lrdatosvehiculofal;
    }

    public void setLrdatosvehiculofal(Date lrdatosvehiculofal) {
        this.lrdatosvehiculofal = lrdatosvehiculofal;
    }

    public String getLrdatosvehiculoual() {
        return lrdatosvehiculoual;
    }

    public void setLrdatosvehiculoual(String lrdatosvehiculoual) {
        this.lrdatosvehiculoual = lrdatosvehiculoual;
    }

    public Date getLrdatosvehiculofmd() {
        return lrdatosvehiculofmd;
    }

    public void setLrdatosvehiculofmd(Date lrdatosvehiculofmd) {
        this.lrdatosvehiculofmd = lrdatosvehiculofmd;
    }

    public String getLrdatosvehiculoumd() {
        return lrdatosvehiculoumd;
    }

    public void setLrdatosvehiculoumd(String lrdatosvehiculoumd) {
        this.lrdatosvehiculoumd = lrdatosvehiculoumd;
    }

    public Lrcotidatbienase getLrcotidatbienase() {
        return lrcotidatbienase;
    }

    public void setLrcotidatbienase(Lrcotidatbienase lrcotidatbienase) {
        this.lrcotidatbienase = lrcotidatbienase;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrdatosvehiculoid != null ? lrdatosvehiculoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrdatosvehiculo)) {
            return false;
        }
        Lrdatosvehiculo other = (Lrdatosvehiculo) object;
        if ((this.lrdatosvehiculoid == null && other.lrdatosvehiculoid != null) || (this.lrdatosvehiculoid != null && !this.lrdatosvehiculoid.equals(other.lrdatosvehiculoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.destino.Lrdatosvehiculo[ lrdatosvehiculoid=" + lrdatosvehiculoid + " ]";
    }

}
