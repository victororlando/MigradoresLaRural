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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRCOTIZACIONPLAN")
@NamedQueries({
    @NamedQuery(name = "Lrcotizacionplan.findAll", query = "SELECT l FROM Lrcotizacionplan l"),
    @NamedQuery(name = "Lrcotizacionplan.findBySseccdetalleid", query = "SELECT l FROM Lrcotizacionplan l WHERE l.lrcotizacionplanPK.sseccdetalleid = :sseccdetalleid"),
    @NamedQuery(name = "Lrcotizacionplan.findBySparmcotiplanid", query = "SELECT l FROM Lrcotizacionplan l WHERE l.lrcotizacionplanPK.sparmcotiplanid = :sparmcotiplanid"),
    @NamedQuery(name = "Lrcotizacionplan.findByStipoplanid", query = "SELECT l FROM Lrcotizacionplan l WHERE l.lrcotizacionplanPK.stipoplanid = :stipoplanid"),
    @NamedQuery(name = "Lrcotizacionplan.findByLrcotizacionnro", query = "SELECT l FROM Lrcotizacionplan l WHERE l.lrcotizacionplanPK.lrcotizacionnro = :lrcotizacionnro"),
    @NamedQuery(name = "Lrcotizacionplan.findByLrcotizacionversion", query = "SELECT l FROM Lrcotizacionplan l WHERE l.lrcotizacionplanPK.lrcotizacionversion = :lrcotizacionversion"),
    @NamedQuery(name = "Lrcotizacionplan.findByLrcotizacionplanmonto", query = "SELECT l FROM Lrcotizacionplan l WHERE l.lrcotizacionplanmonto = :lrcotizacionplanmonto"),
    @NamedQuery(name = "Lrcotizacionplan.findByLrcotizacionplanaprobado", query = "SELECT l FROM Lrcotizacionplan l WHERE l.lrcotizacionplanaprobado = :lrcotizacionplanaprobado"),
    @NamedQuery(name = "Lrcotizacionplan.findByLrcotizacionplancantcuotas", query = "SELECT l FROM Lrcotizacionplan l WHERE l.lrcotizacionplancantcuotas = :lrcotizacionplancantcuotas"),
    @NamedQuery(name = "Lrcotizacionplan.findByLrcotizacionplanimpinicial", query = "SELECT l FROM Lrcotizacionplan l WHERE l.lrcotizacionplanimpinicial = :lrcotizacionplanimpinicial"),
    @NamedQuery(name = "Lrcotizacionplan.findByLrcotizacionplanimpcuota", query = "SELECT l FROM Lrcotizacionplan l WHERE l.lrcotizacionplanimpcuota = :lrcotizacionplanimpcuota"),
    @NamedQuery(name = "Lrcotizacionplan.findByLrcotizacionplanpolnro", query = "SELECT l FROM Lrcotizacionplan l WHERE l.lrcotizacionplanpolnro = :lrcotizacionplanpolnro"),
    @NamedQuery(name = "Lrcotizacionplan.findByLrcotizacionplancomagteporc", query = "SELECT l FROM Lrcotizacionplan l WHERE l.lrcotizacionplancomagteporc = :lrcotizacionplancomagteporc"),
    @NamedQuery(name = "Lrcotizacionplan.findByLrcotizacionplanual", query = "SELECT l FROM Lrcotizacionplan l WHERE l.lrcotizacionplanual = :lrcotizacionplanual"),
    @NamedQuery(name = "Lrcotizacionplan.findByLrcotizacionplanfal", query = "SELECT l FROM Lrcotizacionplan l WHERE l.lrcotizacionplanfal = :lrcotizacionplanfal"),
    @NamedQuery(name = "Lrcotizacionplan.findByLrcotizacionplanumd", query = "SELECT l FROM Lrcotizacionplan l WHERE l.lrcotizacionplanumd = :lrcotizacionplanumd"),
    @NamedQuery(name = "Lrcotizacionplan.findByLrcotizacionplanfmd", query = "SELECT l FROM Lrcotizacionplan l WHERE l.lrcotizacionplanfmd = :lrcotizacionplanfmd"),
    @NamedQuery(name = "Lrcotizacionplan.findByLrcotizacionplantipopremioid", query = "SELECT l FROM Lrcotizacionplan l WHERE l.lrcotizacionplantipopremioid = :lrcotizacionplantipopremioid"),
    @NamedQuery(name = "Lrcotizacionplan.findByLrcotizacionplanporc", query = "SELECT l FROM Lrcotizacionplan l WHERE l.lrcotizacionplanporc = :lrcotizacionplanporc")})
public class Lrcotizacionplan implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrcotizacionplanPK lrcotizacionplanPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONPLANMONTO", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotizacionplanmonto;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONPLANAPROBADO", nullable = false)
    private Character lrcotizacionplanaprobado;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONPLANCANTCUOTAS", nullable = false)
    private short lrcotizacionplancantcuotas;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONPLANIMPINICIAL", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotizacionplanimpinicial;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONPLANIMPCUOTA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotizacionplanimpcuota;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONPLANPOLNRO", nullable = false)
    private long lrcotizacionplanpolnro;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONPLANCOMAGTEPORC", nullable = false, precision = 7, scale = 2)
    private BigDecimal lrcotizacionplancomagteporc;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONPLANUAL", nullable = false, length = 30)
    private String lrcotizacionplanual;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONPLANFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotizacionplanfal;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONPLANUMD", nullable = false, length = 30)
    private String lrcotizacionplanumd;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONPLANFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcotizacionplanfmd;
    @Column(name = "LRCOTIZACIONPLANTIPOPREMIOID")
    private Long lrcotizacionplantipopremioid;
    @Basic(optional = false)
    @Column(name = "LRCOTIZACIONPLANPORC", nullable = false, precision = 7, scale = 2)
    private BigDecimal lrcotizacionplanporc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcotizacionplan")
    private List<Lrcotiplanbien> lrcotiplanbienList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcotizacionplan")
    private List<Lrcotifranquicia> lrcotifranquiciaList;
//    @JoinColumns({
//        @JoinColumn(name = "LRCOTIZACIONNRO", referencedColumnName = "LRCOTIZACIONNRO", nullable = false),
//        @JoinColumn(name = "LRCOTIZACIONVERSION", referencedColumnName = "LRCOTIZACIONVERSION", nullable = false)})
    @ManyToOne(optional = false)
    @PrimaryKeyJoinColumns({
        @PrimaryKeyJoinColumn(name = "LRCOTIZACIONNRO", referencedColumnName = "LRCOTIZACIONNRO"),
        @PrimaryKeyJoinColumn(name = "LRCOTIZACIONVERSION", referencedColumnName = "LRCOTIZACIONVERSION")})
    private Lrcotizacion lrcotizacion;
    @JoinColumns({
        @JoinColumn(name = "SSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "SPARMCOTIPLANID", referencedColumnName = "LRPARMCOTIPLANID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "STIPOPLANID", referencedColumnName = "LRTIPOPLANID", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    @PrimaryKeyJoinColumns({
        @PrimaryKeyJoinColumn(name = "SSECCDETALLEID", referencedColumnName = "SSECCDETALLEID"),
        @PrimaryKeyJoinColumn(name = "SPARMCOTIPLANID", referencedColumnName = "SPARMCOTIPLANID"),
        @PrimaryKeyJoinColumn(name = "STIPOPLANID", referencedColumnName = "STIPOPLANID")})
    private Lrparmcotiplansecc lrparmcotiplansecc;

    public Lrcotizacionplan() {
    }

    public Lrcotizacionplan(LrcotizacionplanPK lrcotizacionplanPK) {
        this.lrcotizacionplanPK = lrcotizacionplanPK;
    }

    public Lrcotizacionplan(LrcotizacionplanPK lrcotizacionplanPK, BigDecimal lrcotizacionplanmonto, Character lrcotizacionplanaprobado, short lrcotizacionplancantcuotas, BigDecimal lrcotizacionplanimpinicial, BigDecimal lrcotizacionplanimpcuota, long lrcotizacionplanpolnro, BigDecimal lrcotizacionplancomagteporc, String lrcotizacionplanual, Date lrcotizacionplanfal, String lrcotizacionplanumd, Date lrcotizacionplanfmd, BigDecimal lrcotizacionplanporc) {
        this.lrcotizacionplanPK = lrcotizacionplanPK;
        this.lrcotizacionplanmonto = lrcotizacionplanmonto;
        this.lrcotizacionplanaprobado = lrcotizacionplanaprobado;
        this.lrcotizacionplancantcuotas = lrcotizacionplancantcuotas;
        this.lrcotizacionplanimpinicial = lrcotizacionplanimpinicial;
        this.lrcotizacionplanimpcuota = lrcotizacionplanimpcuota;
        this.lrcotizacionplanpolnro = lrcotizacionplanpolnro;
        this.lrcotizacionplancomagteporc = lrcotizacionplancomagteporc;
        this.lrcotizacionplanual = lrcotizacionplanual;
        this.lrcotizacionplanfal = lrcotizacionplanfal;
        this.lrcotizacionplanumd = lrcotizacionplanumd;
        this.lrcotizacionplanfmd = lrcotizacionplanfmd;
        this.lrcotizacionplanporc = lrcotizacionplanporc;
    }

    public Lrcotizacionplan(long sseccdetalleid, long sparmcotiplanid, long stipoplanid, long lrcotizacionnro, long lrcotizacionversion) {
        this.lrcotizacionplanPK = new LrcotizacionplanPK(sseccdetalleid, sparmcotiplanid, stipoplanid, lrcotizacionnro, lrcotizacionversion);
    }

    public LrcotizacionplanPK getLrcotizacionplanPK() {
        return lrcotizacionplanPK;
    }

    public void setLrcotizacionplanPK(LrcotizacionplanPK lrcotizacionplanPK) {
        this.lrcotizacionplanPK = lrcotizacionplanPK;
    }

    public BigDecimal getLrcotizacionplanmonto() {
        return lrcotizacionplanmonto;
    }

    public void setLrcotizacionplanmonto(BigDecimal lrcotizacionplanmonto) {
        this.lrcotizacionplanmonto = lrcotizacionplanmonto;
    }

    public Character getLrcotizacionplanaprobado() {
        return lrcotizacionplanaprobado;
    }

    public void setLrcotizacionplanaprobado(Character lrcotizacionplanaprobado) {
        this.lrcotizacionplanaprobado = lrcotizacionplanaprobado;
    }

    public short getLrcotizacionplancantcuotas() {
        return lrcotizacionplancantcuotas;
    }

    public void setLrcotizacionplancantcuotas(short lrcotizacionplancantcuotas) {
        this.lrcotizacionplancantcuotas = lrcotizacionplancantcuotas;
    }

    public BigDecimal getLrcotizacionplanimpinicial() {
        return lrcotizacionplanimpinicial;
    }

    public void setLrcotizacionplanimpinicial(BigDecimal lrcotizacionplanimpinicial) {
        this.lrcotizacionplanimpinicial = lrcotizacionplanimpinicial;
    }

    public BigDecimal getLrcotizacionplanimpcuota() {
        return lrcotizacionplanimpcuota;
    }

    public void setLrcotizacionplanimpcuota(BigDecimal lrcotizacionplanimpcuota) {
        this.lrcotizacionplanimpcuota = lrcotizacionplanimpcuota;
    }

    public long getLrcotizacionplanpolnro() {
        return lrcotizacionplanpolnro;
    }

    public void setLrcotizacionplanpolnro(long lrcotizacionplanpolnro) {
        this.lrcotizacionplanpolnro = lrcotizacionplanpolnro;
    }

    public BigDecimal getLrcotizacionplancomagteporc() {
        return lrcotizacionplancomagteporc;
    }

    public void setLrcotizacionplancomagteporc(BigDecimal lrcotizacionplancomagteporc) {
        this.lrcotizacionplancomagteporc = lrcotizacionplancomagteporc;
    }

    public String getLrcotizacionplanual() {
        return lrcotizacionplanual;
    }

    public void setLrcotizacionplanual(String lrcotizacionplanual) {
        this.lrcotizacionplanual = lrcotizacionplanual;
    }

    public Date getLrcotizacionplanfal() {
        return lrcotizacionplanfal;
    }

    public void setLrcotizacionplanfal(Date lrcotizacionplanfal) {
        this.lrcotizacionplanfal = lrcotizacionplanfal;
    }

    public String getLrcotizacionplanumd() {
        return lrcotizacionplanumd;
    }

    public void setLrcotizacionplanumd(String lrcotizacionplanumd) {
        this.lrcotizacionplanumd = lrcotizacionplanumd;
    }

    public Date getLrcotizacionplanfmd() {
        return lrcotizacionplanfmd;
    }

    public void setLrcotizacionplanfmd(Date lrcotizacionplanfmd) {
        this.lrcotizacionplanfmd = lrcotizacionplanfmd;
    }

    public Long getLrcotizacionplantipopremioid() {
        return lrcotizacionplantipopremioid;
    }

    public void setLrcotizacionplantipopremioid(Long lrcotizacionplantipopremioid) {
        this.lrcotizacionplantipopremioid = lrcotizacionplantipopremioid;
    }

    public BigDecimal getLrcotizacionplanporc() {
        return lrcotizacionplanporc;
    }

    public void setLrcotizacionplanporc(BigDecimal lrcotizacionplanporc) {
        this.lrcotizacionplanporc = lrcotizacionplanporc;
    }

    public List<Lrcotiplanbien> getLrcotiplanbienList() {
        return lrcotiplanbienList;
    }

    public void setLrcotiplanbienList(List<Lrcotiplanbien> lrcotiplanbienList) {
        this.lrcotiplanbienList = lrcotiplanbienList;
    }

    public List<Lrcotifranquicia> getLrcotifranquiciaList() {
        return lrcotifranquiciaList;
    }

    public void setLrcotifranquiciaList(List<Lrcotifranquicia> lrcotifranquiciaList) {
        this.lrcotifranquiciaList = lrcotifranquiciaList;
    }

    public Lrcotizacion getLrcotizacion() {
        return lrcotizacion;
    }

    public void setLrcotizacion(Lrcotizacion lrcotizacion) {
        this.lrcotizacion = lrcotizacion;
    }

    public Lrparmcotiplansecc getLrparmcotiplansecc() {
        return lrparmcotiplansecc;
    }

    public void setLrparmcotiplansecc(Lrparmcotiplansecc lrparmcotiplansecc) {
        this.lrparmcotiplansecc = lrparmcotiplansecc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcotizacionplanPK != null ? lrcotizacionplanPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcotizacionplan)) {
            return false;
        }
        Lrcotizacionplan other = (Lrcotizacionplan) object;
        if ((this.lrcotizacionplanPK == null && other.lrcotizacionplanPK != null) || (this.lrcotizacionplanPK != null && !this.lrcotizacionplanPK.equals(other.lrcotizacionplanPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcotizacionplan[ lrcotizacionplanPK=" + lrcotizacionplanPK + " ]";
    }

}
