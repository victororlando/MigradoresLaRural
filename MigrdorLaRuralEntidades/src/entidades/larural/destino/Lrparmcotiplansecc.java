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
import javax.persistence.Lob;
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
@Table(name = "LRPARMCOTIPLANSECC")
@NamedQueries({
    @NamedQuery(name = "Lrparmcotiplansecc.findAll", query = "SELECT l FROM Lrparmcotiplansecc l"),
    @NamedQuery(name = "Lrparmcotiplansecc.findByLrseccdetalleid", query = "SELECT l FROM Lrparmcotiplansecc l WHERE l.lrparmcotiplanseccPK.lrseccdetalleid = :lrseccdetalleid"),
    @NamedQuery(name = "Lrparmcotiplansecc.findByLrparmcotiplanid", query = "SELECT l FROM Lrparmcotiplansecc l WHERE l.lrparmcotiplanseccPK.lrparmcotiplanid = :lrparmcotiplanid"),
    @NamedQuery(name = "Lrparmcotiplansecc.findByLrtipoplanid", query = "SELECT l FROM Lrparmcotiplansecc l WHERE l.lrparmcotiplanseccPK.lrtipoplanid = :lrtipoplanid"),
    @NamedQuery(name = "Lrparmcotiplansecc.findByLrparmcotiplanseccordcol", query = "SELECT l FROM Lrparmcotiplansecc l WHERE l.lrparmcotiplanseccordcol = :lrparmcotiplanseccordcol"),
    @NamedQuery(name = "Lrparmcotiplansecc.findByLrparmcotiplanseccctr", query = "SELECT l FROM Lrparmcotiplansecc l WHERE l.lrparmcotiplanseccctr = :lrparmcotiplanseccctr"),
    @NamedQuery(name = "Lrparmcotiplansecc.findByLrparmcotiplanseccconnfranq", query = "SELECT l FROM Lrparmcotiplansecc l WHERE l.lrparmcotiplanseccconnfranq = :lrparmcotiplanseccconnfranq"),
    @NamedQuery(name = "Lrparmcotiplansecc.findByLrparmcotiplanseccfijo", query = "SELECT l FROM Lrparmcotiplansecc l WHERE l.lrparmcotiplanseccfijo = :lrparmcotiplanseccfijo"),
    @NamedQuery(name = "Lrparmcotiplansecc.findByLrparmcotiplanseccact", query = "SELECT l FROM Lrparmcotiplansecc l WHERE l.lrparmcotiplanseccact = :lrparmcotiplanseccact"),
    @NamedQuery(name = "Lrparmcotiplansecc.findByLrparmcotiplanseccual", query = "SELECT l FROM Lrparmcotiplansecc l WHERE l.lrparmcotiplanseccual = :lrparmcotiplanseccual"),
    @NamedQuery(name = "Lrparmcotiplansecc.findByLrparmcotiplanseccfal", query = "SELECT l FROM Lrparmcotiplansecc l WHERE l.lrparmcotiplanseccfal = :lrparmcotiplanseccfal"),
    @NamedQuery(name = "Lrparmcotiplansecc.findByLrparmcotiplanseccumd", query = "SELECT l FROM Lrparmcotiplansecc l WHERE l.lrparmcotiplanseccumd = :lrparmcotiplanseccumd"),
    @NamedQuery(name = "Lrparmcotiplansecc.findByLrparmcotiplanseccfmd", query = "SELECT l FROM Lrparmcotiplansecc l WHERE l.lrparmcotiplanseccfmd = :lrparmcotiplanseccfmd"),
    @NamedQuery(name = "Lrparmcotiplansecc.findByLrparmcotiplanseccpremiomin", query = "SELECT l FROM Lrparmcotiplansecc l WHERE l.lrparmcotiplanseccpremiomin = :lrparmcotiplanseccpremiomin"),
    @NamedQuery(name = "Lrparmcotiplansecc.findByLrparmcotiplanseccprimamin", query = "SELECT l FROM Lrparmcotiplansecc l WHERE l.lrparmcotiplanseccprimamin = :lrparmcotiplanseccprimamin"),
    @NamedQuery(name = "Lrparmcotiplansecc.findByLrparmcotiplanseccporcentrega", query = "SELECT l FROM Lrparmcotiplansecc l WHERE l.lrparmcotiplanseccporcentrega = :lrparmcotiplanseccporcentrega"),
    @NamedQuery(name = "Lrparmcotiplansecc.findByLrparmcotiplansecccantcuotas", query = "SELECT l FROM Lrparmcotiplansecc l WHERE l.lrparmcotiplansecccantcuotas = :lrparmcotiplansecccantcuotas"),
    @NamedQuery(name = "Lrparmcotiplansecc.findByLrparmcotiplanseccpordefecto", query = "SELECT l FROM Lrparmcotiplansecc l WHERE l.lrparmcotiplanseccpordefecto = :lrparmcotiplanseccpordefecto")})
public class Lrparmcotiplansecc implements Serializable {
    @Column(name = "LRPARMCOTIPLANSECCPACKCOTISOLO")
    private Character lrparmcotiplanseccpackcotisolo;
    @Column(name = "LRPARMCOTIPLANSECCGRUPAL")
    private Character lrparmcotiplanseccgrupal;
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrparmcotiplanseccPK lrparmcotiplanseccPK;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIPLANSECCORDCOL", nullable = false)
    private short lrparmcotiplanseccordcol;
    @Basic(optional = false)
    @Lob
    @Column(name = "LRPARMCOTIPLANSECCTEXTPOLIZA", nullable = false)
    private String lrparmcotiplansecctextpoliza;
    @Column(name = "LRPARMCOTIPLANSECCCTR")
    private Character lrparmcotiplanseccctr;
    @Column(name = "LRPARMCOTIPLANSECCCONNFRANQ")
    private Character lrparmcotiplanseccconnfranq;
    @Column(name = "LRPARMCOTIPLANSECCFIJO")
    private Character lrparmcotiplanseccfijo;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIPLANSECCACT", nullable = false)
    private Character lrparmcotiplanseccact;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIPLANSECCUAL", nullable = false, length = 30)
    private String lrparmcotiplanseccual;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIPLANSECCFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrparmcotiplanseccfal;
    @Column(name = "LRPARMCOTIPLANSECCUMD", length = 30)
    private String lrparmcotiplanseccumd;
    @Column(name = "LRPARMCOTIPLANSECCFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrparmcotiplanseccfmd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIPLANSECCPREMIOMIN", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrparmcotiplanseccpremiomin;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIPLANSECCPRIMAMIN", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrparmcotiplanseccprimamin;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIPLANSECCPORCENTREGA", nullable = false, precision = 7, scale = 2)
    private BigDecimal lrparmcotiplanseccporcentrega;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIPLANSECCCANTCUOTAS", nullable = false)
    private short lrparmcotiplansecccantcuotas;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIPLANSECCPORDEFECTO", nullable = false)
    private Character lrparmcotiplanseccpordefecto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrparmcotiplansecc")
    private List<Lrparmcotireglas> lrparmcotireglasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrparmcotiplansecc")
    private List<Lrgastoplan> lrgastoplanList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrparmcotiplansecc")
    private List<Lrajusteplan> lrajusteplanList;
    @JoinColumns({
        @JoinColumn(name = "LRPARMCOTIPLANID", referencedColumnName = "LRPARMCOTIPLANID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "LRTIPOPLANID", referencedColumnName = "LRTIPOPLANID", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Lrparmcotiplan lrparmcotiplan;
    @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrseccdetalle lrseccdetalle;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrparmcotiplansecc")
    private List<Lrexclusionesplan> lrexclusionesplanList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrparmcotiplansecc")
    private List<Lrcotizacionplan> lrcotizacionplanList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrparmcotiplansecc")
    private List<Lrtipofranquiciaplan> lrtipofranquiciaplanList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrparmcotiplansecc")
    private List<Lrtasatransporte> lrtasatransporteList;

    public Lrparmcotiplansecc() {
    }

    public Lrparmcotiplansecc(LrparmcotiplanseccPK lrparmcotiplanseccPK) {
        this.lrparmcotiplanseccPK = lrparmcotiplanseccPK;
    }

    public Lrparmcotiplansecc(LrparmcotiplanseccPK lrparmcotiplanseccPK, short lrparmcotiplanseccordcol, String lrparmcotiplansecctextpoliza, Character lrparmcotiplanseccact, String lrparmcotiplanseccual, Date lrparmcotiplanseccfal, BigDecimal lrparmcotiplanseccpremiomin, BigDecimal lrparmcotiplanseccprimamin, BigDecimal lrparmcotiplanseccporcentrega, short lrparmcotiplansecccantcuotas, Character lrparmcotiplanseccpordefecto) {
        this.lrparmcotiplanseccPK = lrparmcotiplanseccPK;
        this.lrparmcotiplanseccordcol = lrparmcotiplanseccordcol;
        this.lrparmcotiplansecctextpoliza = lrparmcotiplansecctextpoliza;
        this.lrparmcotiplanseccact = lrparmcotiplanseccact;
        this.lrparmcotiplanseccual = lrparmcotiplanseccual;
        this.lrparmcotiplanseccfal = lrparmcotiplanseccfal;
        this.lrparmcotiplanseccpremiomin = lrparmcotiplanseccpremiomin;
        this.lrparmcotiplanseccprimamin = lrparmcotiplanseccprimamin;
        this.lrparmcotiplanseccporcentrega = lrparmcotiplanseccporcentrega;
        this.lrparmcotiplansecccantcuotas = lrparmcotiplansecccantcuotas;
        this.lrparmcotiplanseccpordefecto = lrparmcotiplanseccpordefecto;
    }

    public Lrparmcotiplansecc(long lrseccdetalleid, long lrparmcotiplanid, long lrtipoplanid) {
        this.lrparmcotiplanseccPK = new LrparmcotiplanseccPK(lrseccdetalleid, lrparmcotiplanid, lrtipoplanid);
    }

    public LrparmcotiplanseccPK getLrparmcotiplanseccPK() {
        return lrparmcotiplanseccPK;
    }

    public void setLrparmcotiplanseccPK(LrparmcotiplanseccPK lrparmcotiplanseccPK) {
        this.lrparmcotiplanseccPK = lrparmcotiplanseccPK;
    }

    public short getLrparmcotiplanseccordcol() {
        return lrparmcotiplanseccordcol;
    }

    public void setLrparmcotiplanseccordcol(short lrparmcotiplanseccordcol) {
        this.lrparmcotiplanseccordcol = lrparmcotiplanseccordcol;
    }

    public String getLrparmcotiplansecctextpoliza() {
        return lrparmcotiplansecctextpoliza;
    }

    public void setLrparmcotiplansecctextpoliza(String lrparmcotiplansecctextpoliza) {
        this.lrparmcotiplansecctextpoliza = lrparmcotiplansecctextpoliza;
    }

    public Character getLrparmcotiplanseccctr() {
        return lrparmcotiplanseccctr;
    }

    public void setLrparmcotiplanseccctr(Character lrparmcotiplanseccctr) {
        this.lrparmcotiplanseccctr = lrparmcotiplanseccctr;
    }

    public Character getLrparmcotiplanseccconnfranq() {
        return lrparmcotiplanseccconnfranq;
    }

    public void setLrparmcotiplanseccconnfranq(Character lrparmcotiplanseccconnfranq) {
        this.lrparmcotiplanseccconnfranq = lrparmcotiplanseccconnfranq;
    }

    public Character getLrparmcotiplanseccfijo() {
        return lrparmcotiplanseccfijo;
    }

    public void setLrparmcotiplanseccfijo(Character lrparmcotiplanseccfijo) {
        this.lrparmcotiplanseccfijo = lrparmcotiplanseccfijo;
    }

    public Character getLrparmcotiplanseccact() {
        return lrparmcotiplanseccact;
    }

    public void setLrparmcotiplanseccact(Character lrparmcotiplanseccact) {
        this.lrparmcotiplanseccact = lrparmcotiplanseccact;
    }

    public String getLrparmcotiplanseccual() {
        return lrparmcotiplanseccual;
    }

    public void setLrparmcotiplanseccual(String lrparmcotiplanseccual) {
        this.lrparmcotiplanseccual = lrparmcotiplanseccual;
    }

    public Date getLrparmcotiplanseccfal() {
        return lrparmcotiplanseccfal;
    }

    public void setLrparmcotiplanseccfal(Date lrparmcotiplanseccfal) {
        this.lrparmcotiplanseccfal = lrparmcotiplanseccfal;
    }

    public String getLrparmcotiplanseccumd() {
        return lrparmcotiplanseccumd;
    }

    public void setLrparmcotiplanseccumd(String lrparmcotiplanseccumd) {
        this.lrparmcotiplanseccumd = lrparmcotiplanseccumd;
    }

    public Date getLrparmcotiplanseccfmd() {
        return lrparmcotiplanseccfmd;
    }

    public void setLrparmcotiplanseccfmd(Date lrparmcotiplanseccfmd) {
        this.lrparmcotiplanseccfmd = lrparmcotiplanseccfmd;
    }

    public BigDecimal getLrparmcotiplanseccpremiomin() {
        return lrparmcotiplanseccpremiomin;
    }

    public void setLrparmcotiplanseccpremiomin(BigDecimal lrparmcotiplanseccpremiomin) {
        this.lrparmcotiplanseccpremiomin = lrparmcotiplanseccpremiomin;
    }

    public BigDecimal getLrparmcotiplanseccprimamin() {
        return lrparmcotiplanseccprimamin;
    }

    public void setLrparmcotiplanseccprimamin(BigDecimal lrparmcotiplanseccprimamin) {
        this.lrparmcotiplanseccprimamin = lrparmcotiplanseccprimamin;
    }

    public BigDecimal getLrparmcotiplanseccporcentrega() {
        return lrparmcotiplanseccporcentrega;
    }

    public void setLrparmcotiplanseccporcentrega(BigDecimal lrparmcotiplanseccporcentrega) {
        this.lrparmcotiplanseccporcentrega = lrparmcotiplanseccporcentrega;
    }

    public short getLrparmcotiplansecccantcuotas() {
        return lrparmcotiplansecccantcuotas;
    }

    public void setLrparmcotiplansecccantcuotas(short lrparmcotiplansecccantcuotas) {
        this.lrparmcotiplansecccantcuotas = lrparmcotiplansecccantcuotas;
    }

    public Character getLrparmcotiplanseccpordefecto() {
        return lrparmcotiplanseccpordefecto;
    }

    public void setLrparmcotiplanseccpordefecto(Character lrparmcotiplanseccpordefecto) {
        this.lrparmcotiplanseccpordefecto = lrparmcotiplanseccpordefecto;
    }

    public List<Lrparmcotireglas> getLrparmcotireglasList() {
        return lrparmcotireglasList;
    }

    public void setLrparmcotireglasList(List<Lrparmcotireglas> lrparmcotireglasList) {
        this.lrparmcotireglasList = lrparmcotireglasList;
    }

    public List<Lrgastoplan> getLrgastoplanList() {
        return lrgastoplanList;
    }

    public void setLrgastoplanList(List<Lrgastoplan> lrgastoplanList) {
        this.lrgastoplanList = lrgastoplanList;
    }

    public List<Lrajusteplan> getLrajusteplanList() {
        return lrajusteplanList;
    }

    public void setLrajusteplanList(List<Lrajusteplan> lrajusteplanList) {
        this.lrajusteplanList = lrajusteplanList;
    }

    public Lrparmcotiplan getLrparmcotiplan() {
        return lrparmcotiplan;
    }

    public void setLrparmcotiplan(Lrparmcotiplan lrparmcotiplan) {
        this.lrparmcotiplan = lrparmcotiplan;
    }

    public Lrseccdetalle getLrseccdetalle() {
        return lrseccdetalle;
    }

    public void setLrseccdetalle(Lrseccdetalle lrseccdetalle) {
        this.lrseccdetalle = lrseccdetalle;
    }

    public List<Lrexclusionesplan> getLrexclusionesplanList() {
        return lrexclusionesplanList;
    }

    public void setLrexclusionesplanList(List<Lrexclusionesplan> lrexclusionesplanList) {
        this.lrexclusionesplanList = lrexclusionesplanList;
    }

    public List<Lrcotizacionplan> getLrcotizacionplanList() {
        return lrcotizacionplanList;
    }

    public void setLrcotizacionplanList(List<Lrcotizacionplan> lrcotizacionplanList) {
        this.lrcotizacionplanList = lrcotizacionplanList;
    }

    public List<Lrtipofranquiciaplan> getLrtipofranquiciaplanList() {
        return lrtipofranquiciaplanList;
    }

    public void setLrtipofranquiciaplanList(List<Lrtipofranquiciaplan> lrtipofranquiciaplanList) {
        this.lrtipofranquiciaplanList = lrtipofranquiciaplanList;
    }

    public List<Lrtasatransporte> getLrtasatransporteList() {
        return lrtasatransporteList;
    }

    public void setLrtasatransporteList(List<Lrtasatransporte> lrtasatransporteList) {
        this.lrtasatransporteList = lrtasatransporteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrparmcotiplanseccPK != null ? lrparmcotiplanseccPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrparmcotiplansecc)) {
            return false;
        }
        Lrparmcotiplansecc other = (Lrparmcotiplansecc) object;
        if ((this.lrparmcotiplanseccPK == null && other.lrparmcotiplanseccPK != null) || (this.lrparmcotiplanseccPK != null && !this.lrparmcotiplanseccPK.equals(other.lrparmcotiplanseccPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrparmcotiplansecc[ lrparmcotiplanseccPK=" + lrparmcotiplanseccPK + " ]";
    }

    public Character getLrparmcotiplanseccpackcotisolo() {
        return lrparmcotiplanseccpackcotisolo;
    }

    public void setLrparmcotiplanseccpackcotisolo(Character lrparmcotiplanseccpackcotisolo) {
        this.lrparmcotiplanseccpackcotisolo = lrparmcotiplanseccpackcotisolo;
    }

    public Character getLrparmcotiplanseccgrupal() {
        return lrparmcotiplanseccgrupal;
    }

    public void setLrparmcotiplanseccgrupal(Character lrparmcotiplanseccgrupal) {
        this.lrparmcotiplanseccgrupal = lrparmcotiplanseccgrupal;
    }
    
}
