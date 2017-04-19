/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRCOTIPLANBIEN")
@NamedQueries({
    @NamedQuery(name = "Lrcotiplanbien.findAll", query = "SELECT l FROM Lrcotiplanbien l"),
    @NamedQuery(name = "Lrcotiplanbien.findBySseccdetalleid", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienPK.sseccdetalleid = :sseccdetalleid"),
    @NamedQuery(name = "Lrcotiplanbien.findBySparmcotiplanid", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienPK.sparmcotiplanid = :sparmcotiplanid"),
    @NamedQuery(name = "Lrcotiplanbien.findByStipoplanid", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienPK.stipoplanid = :stipoplanid"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotizacionnro", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienPK.lrcotizacionnro = :lrcotizacionnro"),
    @NamedQuery(name = "Lrcotiplanbien.findByScotizacionversion", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienPK.scotizacionversion = :scotizacionversion"),
    @NamedQuery(name = "Lrcotiplanbien.findByScotidatbienaseid", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienPK.scotidatbienaseid = :scotidatbienaseid"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbientasabruta", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbientasabruta = :lrcotiplanbientasabruta"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbiendescuentomat", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbiendescuentomat = :lrcotiplanbiendescuentomat"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbienrecargomat", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienrecargomat = :lrcotiplanbienrecargomat"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbiendescuentorea", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbiendescuentorea = :lrcotiplanbiendescuentorea"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbienrecargorea", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienrecargorea = :lrcotiplanbienrecargorea"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbiendescuentocoa", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbiendescuentocoa = :lrcotiplanbiendescuentocoa"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbienrecargocoa", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienrecargocoa = :lrcotiplanbienrecargocoa"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbienprimatecbruta", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienprimatecbruta = :lrcotiplanbienprimatecbruta"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbienmmu", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienmmu = :lrcotiplanbienmmu"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbienfes", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienfes = :lrcotiplanbienfes"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbiendesctec", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbiendesctec = :lrcotiplanbiendesctec"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbienprimatecneta", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienprimatecneta = :lrcotiplanbienprimatecneta"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbientasatec", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbientasatec = :lrcotiplanbientasatec"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbiendesccorporativo", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbiendesccorporativo = :lrcotiplanbiendesccorporativo"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbiensubtotcomisiones", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbiensubtotcomisiones = :lrcotiplanbiensubtotcomisiones"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbiencomicontrato", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbiencomicontrato = :lrcotiplanbiencomicontrato"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbiencominegociada", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbiencominegociada = :lrcotiplanbiencominegociada"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbiencomicedida", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbiencomicedida = :lrcotiplanbiencomicedida"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbiencomiotrosgastos", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbiencomiotrosgastos = :lrcotiplanbiencomiotrosgastos"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbiengtoadm", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbiengtoadm = :lrcotiplanbiengtoadm"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbienprimacombruta", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienprimacombruta = :lrcotiplanbienprimacombruta"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbienrecargocom", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienrecargocom = :lrcotiplanbienrecargocom"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbiendesccom", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbiendesccom = :lrcotiplanbiendesccom"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbienbonificacion", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienbonificacion = :lrcotiplanbienbonificacion"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbienprimacomneta", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienprimacomneta = :lrcotiplanbienprimacomneta"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbientasacomneta", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbientasacomneta = :lrcotiplanbientasacomneta"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbieniva", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbieniva = :lrcotiplanbieniva"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbienpremiocont", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienpremiocont = :lrcotiplanbienpremiocont"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbienrpf", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienrpf = :lrcotiplanbienrpf"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbiendescrpf", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbiendescrpf = :lrcotiplanbiendescrpf"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbienpremiofin", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienpremiofin = :lrcotiplanbienpremiofin"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbienajustetrajeta", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienajustetrajeta = :lrcotiplanbienajustetrajeta"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbienpremiotarjetalr", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienpremiotarjetalr = :lrcotiplanbienpremiotarjetalr"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbienpremiocontpmd", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienpremiocontpmd = :lrcotiplanbienpremiocontpmd"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbienpremiotarjetalrp", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbienpremiotarjetalrp = :lrcotiplanbienpremiotarjetalrp"),
    @NamedQuery(name = "Lrcotiplanbien.findByLrcotiplanbiensubtotalcom", query = "SELECT l FROM Lrcotiplanbien l WHERE l.lrcotiplanbiensubtotalcom = :lrcotiplanbiensubtotalcom")})
public class Lrcotiplanbien implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrcotiplanbienPK lrcotiplanbienPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENTASABRUTA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbientasabruta;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENDESCUENTOMAT", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbiendescuentomat;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENRECARGOMAT", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienrecargomat;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENDESCUENTOREA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbiendescuentorea;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENRECARGOREA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienrecargorea;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENDESCUENTOCOA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbiendescuentocoa;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENRECARGOCOA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienrecargocoa;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENPRIMATECBRUTA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienprimatecbruta;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENMMU", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienmmu;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENFES", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienfes;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENDESCTEC", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbiendesctec;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENPRIMATECNETA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienprimatecneta;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENTASATEC", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbientasatec;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENDESCCORPORATIVO", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbiendesccorporativo;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENSUBTOTCOMISIONES", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbiensubtotcomisiones;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENCOMICONTRATO", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbiencomicontrato;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENCOMINEGOCIADA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbiencominegociada;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENCOMICEDIDA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbiencomicedida;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENCOMIOTROSGASTOS", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbiencomiotrosgastos;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENGTOADM", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbiengtoadm;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENPRIMACOMBRUTA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienprimacombruta;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENRECARGOCOM", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienrecargocom;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENDESCCOM", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbiendesccom;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENBONIFICACION", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienbonificacion;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENPRIMACOMNETA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienprimacomneta;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENTASACOMNETA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbientasacomneta;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENIVA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbieniva;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENPREMIOCONT", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiocont;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENRPF", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienrpf;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENDESCRPF", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbiendescrpf;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENPREMIOFIN", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiofin;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENAJUSTETRAJETA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienajustetrajeta;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENPREMIOTARJETALR", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiotarjetalr;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENPREMIOCONTPMD", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiocontpmd;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENPREMIOTARJETALRP", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiotarjetalrp;
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENSUBTOTALCOM", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbiensubtotalcom;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcotiplanbien")
    private List<Lrcotiplanbienpremio> lrcotiplanbienpremioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcotiplanbien")
    private List<Lrcotiplanbiencobertura> lrcotiplanbiencoberturaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcotiplanbien")
    private List<Lrcotiplanbienexclusion> lrcotiplanbienexclusionList;
    @JoinColumns({
        @JoinColumn(name = "SCOTIDATBIENASEID", referencedColumnName = "LRCOTIDATBIENASEID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "LRUBICACIONID", referencedColumnName = "LRUBICACIONID", nullable = false)})
    @ManyToOne(optional = false)
    private Lrcotidatbienase lrcotidatbienase;
    @JoinColumns({
        @JoinColumn(name = "SSECCDETALLEID", referencedColumnName = "SSECCDETALLEID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "SPARMCOTIPLANID", referencedColumnName = "SPARMCOTIPLANID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "STIPOPLANID", referencedColumnName = "STIPOPLANID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "LRCOTIZACIONNRO", referencedColumnName = "LRCOTIZACIONNRO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "SCOTIZACIONVERSION", referencedColumnName = "LRCOTIZACIONVERSION", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Lrcotizacionplan lrcotizacionplan;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcotiplanbien")
    private List<Lrcotiplanbiendesc> lrcotiplanbiendescList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcotiplanbien")
    private List<Lrcotiplanbiengasto> lrcotiplanbiengastoList;

    public Lrcotiplanbien() {
    }

    public Lrcotiplanbien(LrcotiplanbienPK lrcotiplanbienPK) {
        this.lrcotiplanbienPK = lrcotiplanbienPK;
    }

    public Lrcotiplanbien(LrcotiplanbienPK lrcotiplanbienPK, BigDecimal lrcotiplanbientasabruta, BigDecimal lrcotiplanbiendescuentomat, BigDecimal lrcotiplanbienrecargomat, BigDecimal lrcotiplanbiendescuentorea, BigDecimal lrcotiplanbienrecargorea, BigDecimal lrcotiplanbiendescuentocoa, BigDecimal lrcotiplanbienrecargocoa, BigDecimal lrcotiplanbienprimatecbruta, BigDecimal lrcotiplanbienmmu, BigDecimal lrcotiplanbienfes, BigDecimal lrcotiplanbiendesctec, BigDecimal lrcotiplanbienprimatecneta, BigDecimal lrcotiplanbientasatec, BigDecimal lrcotiplanbiendesccorporativo, BigDecimal lrcotiplanbiensubtotcomisiones, BigDecimal lrcotiplanbiencomicontrato, BigDecimal lrcotiplanbiencominegociada, BigDecimal lrcotiplanbiencomicedida, BigDecimal lrcotiplanbiencomiotrosgastos, BigDecimal lrcotiplanbiengtoadm, BigDecimal lrcotiplanbienprimacombruta, BigDecimal lrcotiplanbienrecargocom, BigDecimal lrcotiplanbiendesccom, BigDecimal lrcotiplanbienbonificacion, BigDecimal lrcotiplanbienprimacomneta, BigDecimal lrcotiplanbientasacomneta, BigDecimal lrcotiplanbieniva, BigDecimal lrcotiplanbienpremiocont, BigDecimal lrcotiplanbienrpf, BigDecimal lrcotiplanbiendescrpf, BigDecimal lrcotiplanbienpremiofin, BigDecimal lrcotiplanbienajustetrajeta, BigDecimal lrcotiplanbienpremiotarjetalr, BigDecimal lrcotiplanbienpremiocontpmd, BigDecimal lrcotiplanbienpremiotarjetalrp, BigDecimal lrcotiplanbiensubtotalcom) {
        this.lrcotiplanbienPK = lrcotiplanbienPK;
        this.lrcotiplanbientasabruta = lrcotiplanbientasabruta;
        this.lrcotiplanbiendescuentomat = lrcotiplanbiendescuentomat;
        this.lrcotiplanbienrecargomat = lrcotiplanbienrecargomat;
        this.lrcotiplanbiendescuentorea = lrcotiplanbiendescuentorea;
        this.lrcotiplanbienrecargorea = lrcotiplanbienrecargorea;
        this.lrcotiplanbiendescuentocoa = lrcotiplanbiendescuentocoa;
        this.lrcotiplanbienrecargocoa = lrcotiplanbienrecargocoa;
        this.lrcotiplanbienprimatecbruta = lrcotiplanbienprimatecbruta;
        this.lrcotiplanbienmmu = lrcotiplanbienmmu;
        this.lrcotiplanbienfes = lrcotiplanbienfes;
        this.lrcotiplanbiendesctec = lrcotiplanbiendesctec;
        this.lrcotiplanbienprimatecneta = lrcotiplanbienprimatecneta;
        this.lrcotiplanbientasatec = lrcotiplanbientasatec;
        this.lrcotiplanbiendesccorporativo = lrcotiplanbiendesccorporativo;
        this.lrcotiplanbiensubtotcomisiones = lrcotiplanbiensubtotcomisiones;
        this.lrcotiplanbiencomicontrato = lrcotiplanbiencomicontrato;
        this.lrcotiplanbiencominegociada = lrcotiplanbiencominegociada;
        this.lrcotiplanbiencomicedida = lrcotiplanbiencomicedida;
        this.lrcotiplanbiencomiotrosgastos = lrcotiplanbiencomiotrosgastos;
        this.lrcotiplanbiengtoadm = lrcotiplanbiengtoadm;
        this.lrcotiplanbienprimacombruta = lrcotiplanbienprimacombruta;
        this.lrcotiplanbienrecargocom = lrcotiplanbienrecargocom;
        this.lrcotiplanbiendesccom = lrcotiplanbiendesccom;
        this.lrcotiplanbienbonificacion = lrcotiplanbienbonificacion;
        this.lrcotiplanbienprimacomneta = lrcotiplanbienprimacomneta;
        this.lrcotiplanbientasacomneta = lrcotiplanbientasacomneta;
        this.lrcotiplanbieniva = lrcotiplanbieniva;
        this.lrcotiplanbienpremiocont = lrcotiplanbienpremiocont;
        this.lrcotiplanbienrpf = lrcotiplanbienrpf;
        this.lrcotiplanbiendescrpf = lrcotiplanbiendescrpf;
        this.lrcotiplanbienpremiofin = lrcotiplanbienpremiofin;
        this.lrcotiplanbienajustetrajeta = lrcotiplanbienajustetrajeta;
        this.lrcotiplanbienpremiotarjetalr = lrcotiplanbienpremiotarjetalr;
        this.lrcotiplanbienpremiocontpmd = lrcotiplanbienpremiocontpmd;
        this.lrcotiplanbienpremiotarjetalrp = lrcotiplanbienpremiotarjetalrp;
        this.lrcotiplanbiensubtotalcom = lrcotiplanbiensubtotalcom;
    }

    public Lrcotiplanbien(long sseccdetalleid, long sparmcotiplanid, long stipoplanid, long lrcotizacionnro, long scotizacionversion, long scotidatbienaseid) {
        this.lrcotiplanbienPK = new LrcotiplanbienPK(sseccdetalleid, sparmcotiplanid, stipoplanid, lrcotizacionnro, scotizacionversion, scotidatbienaseid);
    }

    public LrcotiplanbienPK getLrcotiplanbienPK() {
        return lrcotiplanbienPK;
    }

    public void setLrcotiplanbienPK(LrcotiplanbienPK lrcotiplanbienPK) {
        this.lrcotiplanbienPK = lrcotiplanbienPK;
    }

    public BigDecimal getLrcotiplanbientasabruta() {
        return lrcotiplanbientasabruta;
    }

    public void setLrcotiplanbientasabruta(BigDecimal lrcotiplanbientasabruta) {
        this.lrcotiplanbientasabruta = lrcotiplanbientasabruta;
    }

    public BigDecimal getLrcotiplanbiendescuentomat() {
        return lrcotiplanbiendescuentomat;
    }

    public void setLrcotiplanbiendescuentomat(BigDecimal lrcotiplanbiendescuentomat) {
        this.lrcotiplanbiendescuentomat = lrcotiplanbiendescuentomat;
    }

    public BigDecimal getLrcotiplanbienrecargomat() {
        return lrcotiplanbienrecargomat;
    }

    public void setLrcotiplanbienrecargomat(BigDecimal lrcotiplanbienrecargomat) {
        this.lrcotiplanbienrecargomat = lrcotiplanbienrecargomat;
    }

    public BigDecimal getLrcotiplanbiendescuentorea() {
        return lrcotiplanbiendescuentorea;
    }

    public void setLrcotiplanbiendescuentorea(BigDecimal lrcotiplanbiendescuentorea) {
        this.lrcotiplanbiendescuentorea = lrcotiplanbiendescuentorea;
    }

    public BigDecimal getLrcotiplanbienrecargorea() {
        return lrcotiplanbienrecargorea;
    }

    public void setLrcotiplanbienrecargorea(BigDecimal lrcotiplanbienrecargorea) {
        this.lrcotiplanbienrecargorea = lrcotiplanbienrecargorea;
    }

    public BigDecimal getLrcotiplanbiendescuentocoa() {
        return lrcotiplanbiendescuentocoa;
    }

    public void setLrcotiplanbiendescuentocoa(BigDecimal lrcotiplanbiendescuentocoa) {
        this.lrcotiplanbiendescuentocoa = lrcotiplanbiendescuentocoa;
    }

    public BigDecimal getLrcotiplanbienrecargocoa() {
        return lrcotiplanbienrecargocoa;
    }

    public void setLrcotiplanbienrecargocoa(BigDecimal lrcotiplanbienrecargocoa) {
        this.lrcotiplanbienrecargocoa = lrcotiplanbienrecargocoa;
    }

    public BigDecimal getLrcotiplanbienprimatecbruta() {
        return lrcotiplanbienprimatecbruta;
    }

    public void setLrcotiplanbienprimatecbruta(BigDecimal lrcotiplanbienprimatecbruta) {
        this.lrcotiplanbienprimatecbruta = lrcotiplanbienprimatecbruta;
    }

    public BigDecimal getLrcotiplanbienmmu() {
        return lrcotiplanbienmmu;
    }

    public void setLrcotiplanbienmmu(BigDecimal lrcotiplanbienmmu) {
        this.lrcotiplanbienmmu = lrcotiplanbienmmu;
    }

    public BigDecimal getLrcotiplanbienfes() {
        return lrcotiplanbienfes;
    }

    public void setLrcotiplanbienfes(BigDecimal lrcotiplanbienfes) {
        this.lrcotiplanbienfes = lrcotiplanbienfes;
    }

    public BigDecimal getLrcotiplanbiendesctec() {
        return lrcotiplanbiendesctec;
    }

    public void setLrcotiplanbiendesctec(BigDecimal lrcotiplanbiendesctec) {
        this.lrcotiplanbiendesctec = lrcotiplanbiendesctec;
    }

    public BigDecimal getLrcotiplanbienprimatecneta() {
        return lrcotiplanbienprimatecneta;
    }

    public void setLrcotiplanbienprimatecneta(BigDecimal lrcotiplanbienprimatecneta) {
        this.lrcotiplanbienprimatecneta = lrcotiplanbienprimatecneta;
    }

    public BigDecimal getLrcotiplanbientasatec() {
        return lrcotiplanbientasatec;
    }

    public void setLrcotiplanbientasatec(BigDecimal lrcotiplanbientasatec) {
        this.lrcotiplanbientasatec = lrcotiplanbientasatec;
    }

    public BigDecimal getLrcotiplanbiendesccorporativo() {
        return lrcotiplanbiendesccorporativo;
    }

    public void setLrcotiplanbiendesccorporativo(BigDecimal lrcotiplanbiendesccorporativo) {
        this.lrcotiplanbiendesccorporativo = lrcotiplanbiendesccorporativo;
    }

    public BigDecimal getLrcotiplanbiensubtotcomisiones() {
        return lrcotiplanbiensubtotcomisiones;
    }

    public void setLrcotiplanbiensubtotcomisiones(BigDecimal lrcotiplanbiensubtotcomisiones) {
        this.lrcotiplanbiensubtotcomisiones = lrcotiplanbiensubtotcomisiones;
    }

    public BigDecimal getLrcotiplanbiencomicontrato() {
        return lrcotiplanbiencomicontrato;
    }

    public void setLrcotiplanbiencomicontrato(BigDecimal lrcotiplanbiencomicontrato) {
        this.lrcotiplanbiencomicontrato = lrcotiplanbiencomicontrato;
    }

    public BigDecimal getLrcotiplanbiencominegociada() {
        return lrcotiplanbiencominegociada;
    }

    public void setLrcotiplanbiencominegociada(BigDecimal lrcotiplanbiencominegociada) {
        this.lrcotiplanbiencominegociada = lrcotiplanbiencominegociada;
    }

    public BigDecimal getLrcotiplanbiencomicedida() {
        return lrcotiplanbiencomicedida;
    }

    public void setLrcotiplanbiencomicedida(BigDecimal lrcotiplanbiencomicedida) {
        this.lrcotiplanbiencomicedida = lrcotiplanbiencomicedida;
    }

    public BigDecimal getLrcotiplanbiencomiotrosgastos() {
        return lrcotiplanbiencomiotrosgastos;
    }

    public void setLrcotiplanbiencomiotrosgastos(BigDecimal lrcotiplanbiencomiotrosgastos) {
        this.lrcotiplanbiencomiotrosgastos = lrcotiplanbiencomiotrosgastos;
    }

    public BigDecimal getLrcotiplanbiengtoadm() {
        return lrcotiplanbiengtoadm;
    }

    public void setLrcotiplanbiengtoadm(BigDecimal lrcotiplanbiengtoadm) {
        this.lrcotiplanbiengtoadm = lrcotiplanbiengtoadm;
    }

    public BigDecimal getLrcotiplanbienprimacombruta() {
        return lrcotiplanbienprimacombruta;
    }

    public void setLrcotiplanbienprimacombruta(BigDecimal lrcotiplanbienprimacombruta) {
        this.lrcotiplanbienprimacombruta = lrcotiplanbienprimacombruta;
    }

    public BigDecimal getLrcotiplanbienrecargocom() {
        return lrcotiplanbienrecargocom;
    }

    public void setLrcotiplanbienrecargocom(BigDecimal lrcotiplanbienrecargocom) {
        this.lrcotiplanbienrecargocom = lrcotiplanbienrecargocom;
    }

    public BigDecimal getLrcotiplanbiendesccom() {
        return lrcotiplanbiendesccom;
    }

    public void setLrcotiplanbiendesccom(BigDecimal lrcotiplanbiendesccom) {
        this.lrcotiplanbiendesccom = lrcotiplanbiendesccom;
    }

    public BigDecimal getLrcotiplanbienbonificacion() {
        return lrcotiplanbienbonificacion;
    }

    public void setLrcotiplanbienbonificacion(BigDecimal lrcotiplanbienbonificacion) {
        this.lrcotiplanbienbonificacion = lrcotiplanbienbonificacion;
    }

    public BigDecimal getLrcotiplanbienprimacomneta() {
        return lrcotiplanbienprimacomneta;
    }

    public void setLrcotiplanbienprimacomneta(BigDecimal lrcotiplanbienprimacomneta) {
        this.lrcotiplanbienprimacomneta = lrcotiplanbienprimacomneta;
    }

    public BigDecimal getLrcotiplanbientasacomneta() {
        return lrcotiplanbientasacomneta;
    }

    public void setLrcotiplanbientasacomneta(BigDecimal lrcotiplanbientasacomneta) {
        this.lrcotiplanbientasacomneta = lrcotiplanbientasacomneta;
    }

    public BigDecimal getLrcotiplanbieniva() {
        return lrcotiplanbieniva;
    }

    public void setLrcotiplanbieniva(BigDecimal lrcotiplanbieniva) {
        this.lrcotiplanbieniva = lrcotiplanbieniva;
    }

    public BigDecimal getLrcotiplanbienpremiocont() {
        return lrcotiplanbienpremiocont;
    }

    public void setLrcotiplanbienpremiocont(BigDecimal lrcotiplanbienpremiocont) {
        this.lrcotiplanbienpremiocont = lrcotiplanbienpremiocont;
    }

    public BigDecimal getLrcotiplanbienrpf() {
        return lrcotiplanbienrpf;
    }

    public void setLrcotiplanbienrpf(BigDecimal lrcotiplanbienrpf) {
        this.lrcotiplanbienrpf = lrcotiplanbienrpf;
    }

    public BigDecimal getLrcotiplanbiendescrpf() {
        return lrcotiplanbiendescrpf;
    }

    public void setLrcotiplanbiendescrpf(BigDecimal lrcotiplanbiendescrpf) {
        this.lrcotiplanbiendescrpf = lrcotiplanbiendescrpf;
    }

    public BigDecimal getLrcotiplanbienpremiofin() {
        return lrcotiplanbienpremiofin;
    }

    public void setLrcotiplanbienpremiofin(BigDecimal lrcotiplanbienpremiofin) {
        this.lrcotiplanbienpremiofin = lrcotiplanbienpremiofin;
    }

    public BigDecimal getLrcotiplanbienajustetrajeta() {
        return lrcotiplanbienajustetrajeta;
    }

    public void setLrcotiplanbienajustetrajeta(BigDecimal lrcotiplanbienajustetrajeta) {
        this.lrcotiplanbienajustetrajeta = lrcotiplanbienajustetrajeta;
    }

    public BigDecimal getLrcotiplanbienpremiotarjetalr() {
        return lrcotiplanbienpremiotarjetalr;
    }

    public void setLrcotiplanbienpremiotarjetalr(BigDecimal lrcotiplanbienpremiotarjetalr) {
        this.lrcotiplanbienpremiotarjetalr = lrcotiplanbienpremiotarjetalr;
    }

    public BigDecimal getLrcotiplanbienpremiocontpmd() {
        return lrcotiplanbienpremiocontpmd;
    }

    public void setLrcotiplanbienpremiocontpmd(BigDecimal lrcotiplanbienpremiocontpmd) {
        this.lrcotiplanbienpremiocontpmd = lrcotiplanbienpremiocontpmd;
    }

    public BigDecimal getLrcotiplanbienpremiotarjetalrp() {
        return lrcotiplanbienpremiotarjetalrp;
    }

    public void setLrcotiplanbienpremiotarjetalrp(BigDecimal lrcotiplanbienpremiotarjetalrp) {
        this.lrcotiplanbienpremiotarjetalrp = lrcotiplanbienpremiotarjetalrp;
    }

    public BigDecimal getLrcotiplanbiensubtotalcom() {
        return lrcotiplanbiensubtotalcom;
    }

    public void setLrcotiplanbiensubtotalcom(BigDecimal lrcotiplanbiensubtotalcom) {
        this.lrcotiplanbiensubtotalcom = lrcotiplanbiensubtotalcom;
    }

    public List<Lrcotiplanbienpremio> getLrcotiplanbienpremioList() {
        return lrcotiplanbienpremioList;
    }

    public void setLrcotiplanbienpremioList(List<Lrcotiplanbienpremio> lrcotiplanbienpremioList) {
        this.lrcotiplanbienpremioList = lrcotiplanbienpremioList;
    }

    public List<Lrcotiplanbiencobertura> getLrcotiplanbiencoberturaList() {
        return lrcotiplanbiencoberturaList;
    }

    public void setLrcotiplanbiencoberturaList(List<Lrcotiplanbiencobertura> lrcotiplanbiencoberturaList) {
        this.lrcotiplanbiencoberturaList = lrcotiplanbiencoberturaList;
    }

    public List<Lrcotiplanbienexclusion> getLrcotiplanbienexclusionList() {
        return lrcotiplanbienexclusionList;
    }

    public void setLrcotiplanbienexclusionList(List<Lrcotiplanbienexclusion> lrcotiplanbienexclusionList) {
        this.lrcotiplanbienexclusionList = lrcotiplanbienexclusionList;
    }

    public Lrcotidatbienase getLrcotidatbienase() {
        return lrcotidatbienase;
    }

    public void setLrcotidatbienase(Lrcotidatbienase lrcotidatbienase) {
        this.lrcotidatbienase = lrcotidatbienase;
    }

    public Lrcotizacionplan getLrcotizacionplan() {
        return lrcotizacionplan;
    }

    public void setLrcotizacionplan(Lrcotizacionplan lrcotizacionplan) {
        this.lrcotizacionplan = lrcotizacionplan;
    }

    public List<Lrcotiplanbiendesc> getLrcotiplanbiendescList() {
        return lrcotiplanbiendescList;
    }

    public void setLrcotiplanbiendescList(List<Lrcotiplanbiendesc> lrcotiplanbiendescList) {
        this.lrcotiplanbiendescList = lrcotiplanbiendescList;
    }

    public List<Lrcotiplanbiengasto> getLrcotiplanbiengastoList() {
        return lrcotiplanbiengastoList;
    }

    public void setLrcotiplanbiengastoList(List<Lrcotiplanbiengasto> lrcotiplanbiengastoList) {
        this.lrcotiplanbiengastoList = lrcotiplanbiengastoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcotiplanbienPK != null ? lrcotiplanbienPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcotiplanbien)) {
            return false;
        }
        Lrcotiplanbien other = (Lrcotiplanbien) object;
        if ((this.lrcotiplanbienPK == null && other.lrcotiplanbienPK != null) || (this.lrcotiplanbienPK != null && !this.lrcotiplanbienPK.equals(other.lrcotiplanbienPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcotiplanbien[ lrcotiplanbienPK=" + lrcotiplanbienPK + " ]";
    }
    
}
