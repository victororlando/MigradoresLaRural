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
@Table(name = "LRAJUSTEPLAN")
@NamedQueries({
    @NamedQuery(name = "Lrajusteplan.findAll", query = "SELECT l FROM Lrajusteplan l"),
    @NamedQuery(name = "Lrajusteplan.findByLrajusteid", query = "SELECT l FROM Lrajusteplan l WHERE l.lrajusteplanPK.lrajusteid = :lrajusteid"),
    @NamedQuery(name = "Lrajusteplan.findByLrseccdetalleid", query = "SELECT l FROM Lrajusteplan l WHERE l.lrajusteplanPK.lrseccdetalleid = :lrseccdetalleid"),
    @NamedQuery(name = "Lrajusteplan.findByLrparmcotiplanid", query = "SELECT l FROM Lrajusteplan l WHERE l.lrajusteplanPK.lrparmcotiplanid = :lrparmcotiplanid"),
    @NamedQuery(name = "Lrajusteplan.findByLrtipoplanid", query = "SELECT l FROM Lrajusteplan l WHERE l.lrajusteplanPK.lrtipoplanid = :lrtipoplanid"),
    @NamedQuery(name = "Lrajusteplan.findByLrajusteplanpormin", query = "SELECT l FROM Lrajusteplan l WHERE l.lrajusteplanpormin = :lrajusteplanpormin"),
    @NamedQuery(name = "Lrajusteplan.findByLrajusteplanpormax", query = "SELECT l FROM Lrajusteplan l WHERE l.lrajusteplanpormax = :lrajusteplanpormax"),
    @NamedQuery(name = "Lrajusteplan.findByLrajusteplanobs", query = "SELECT l FROM Lrajusteplan l WHERE l.lrajusteplanobs = :lrajusteplanobs"),
    @NamedQuery(name = "Lrajusteplan.findByLrajusteplanviscarga", query = "SELECT l FROM Lrajusteplan l WHERE l.lrajusteplanviscarga = :lrajusteplanviscarga"),
    @NamedQuery(name = "Lrajusteplan.findByLrajusteplanimpre", query = "SELECT l FROM Lrajusteplan l WHERE l.lrajusteplanimpre = :lrajusteplanimpre"),
    @NamedQuery(name = "Lrajusteplan.findByLrajusteplancomoimpre", query = "SELECT l FROM Lrajusteplan l WHERE l.lrajusteplancomoimpre = :lrajusteplancomoimpre"),
    @NamedQuery(name = "Lrajusteplan.findByLrajusteplanmuestraval", query = "SELECT l FROM Lrajusteplan l WHERE l.lrajusteplanmuestraval = :lrajusteplanmuestraval"),
    @NamedQuery(name = "Lrajusteplan.findByLrajusteplanual", query = "SELECT l FROM Lrajusteplan l WHERE l.lrajusteplanual = :lrajusteplanual"),
    @NamedQuery(name = "Lrajusteplan.findByLrajusteplanfal", query = "SELECT l FROM Lrajusteplan l WHERE l.lrajusteplanfal = :lrajusteplanfal"),
    @NamedQuery(name = "Lrajusteplan.findByLrajusteplanumd", query = "SELECT l FROM Lrajusteplan l WHERE l.lrajusteplanumd = :lrajusteplanumd"),
    @NamedQuery(name = "Lrajusteplan.findByLrajusteplanfmd", query = "SELECT l FROM Lrajusteplan l WHERE l.lrajusteplanfmd = :lrajusteplanfmd"),
    @NamedQuery(name = "Lrajusteplan.findByLrajusteplanac", query = "SELECT l FROM Lrajusteplan l WHERE l.lrajusteplanac = :lrajusteplanac"),
    @NamedQuery(name = "Lrajusteplan.findByLrajusteplanpordefecto", query = "SELECT l FROM Lrajusteplan l WHERE l.lrajusteplanpordefecto = :lrajusteplanpordefecto")})
public class Lrajusteplan implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrajusteplanPK lrajusteplanPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRAJUSTEPLANPORMIN", nullable = false, precision = 7, scale = 2)
    private BigDecimal lrajusteplanpormin;
    @Basic(optional = false)
    @Column(name = "LRAJUSTEPLANPORMAX", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrajusteplanpormax;
    @Basic(optional = false)
    @Column(name = "LRAJUSTEPLANOBS", nullable = false, length = 100)
    private String lrajusteplanobs;
    @Basic(optional = false)
    @Column(name = "LRAJUSTEPLANVISCARGA", nullable = false)
    private Character lrajusteplanviscarga;
    @Basic(optional = false)
    @Column(name = "LRAJUSTEPLANIMPRE", nullable = false)
    private Character lrajusteplanimpre;
    @Basic(optional = false)
    @Column(name = "LRAJUSTEPLANCOMOIMPRE", nullable = false, length = 60)
    private String lrajusteplancomoimpre;
    @Basic(optional = false)
    @Column(name = "LRAJUSTEPLANMUESTRAVAL", nullable = false)
    private Character lrajusteplanmuestraval;
    @Column(name = "LRAJUSTEPLANUAL", length = 30)
    private String lrajusteplanual;
    @Column(name = "LRAJUSTEPLANFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrajusteplanfal;
    @Column(name = "LRAJUSTEPLANUMD", length = 30)
    private String lrajusteplanumd;
    @Column(name = "LRAJUSTEPLANFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrajusteplanfmd;
    @Basic(optional = false)
    @Column(name = "LRAJUSTEPLANAC", nullable = false)
    private Character lrajusteplanac;
    @Basic(optional = false)
    @Column(name = "LRAJUSTEPLANPORDEFECTO", nullable = false)
    private Character lrajusteplanpordefecto;
    @JoinColumn(name = "LRAJUSTEID", referencedColumnName = "LRAJUSTEID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrajuste lrajuste;
    @JoinColumns({
        @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "LRPARMCOTIPLANID", referencedColumnName = "LRPARMCOTIPLANID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "LRTIPOPLANID", referencedColumnName = "LRTIPOPLANID", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Lrparmcotiplansecc lrparmcotiplansecc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrajusteplan")
    private List<Lrcotiplanbiendesc> lrcotiplanbiendescList;

    public Lrajusteplan() {
    }

    public Lrajusteplan(LrajusteplanPK lrajusteplanPK) {
        this.lrajusteplanPK = lrajusteplanPK;
    }

    public Lrajusteplan(LrajusteplanPK lrajusteplanPK, BigDecimal lrajusteplanpormin, BigDecimal lrajusteplanpormax, String lrajusteplanobs, Character lrajusteplanviscarga, Character lrajusteplanimpre, String lrajusteplancomoimpre, Character lrajusteplanmuestraval, Character lrajusteplanac, Character lrajusteplanpordefecto) {
        this.lrajusteplanPK = lrajusteplanPK;
        this.lrajusteplanpormin = lrajusteplanpormin;
        this.lrajusteplanpormax = lrajusteplanpormax;
        this.lrajusteplanobs = lrajusteplanobs;
        this.lrajusteplanviscarga = lrajusteplanviscarga;
        this.lrajusteplanimpre = lrajusteplanimpre;
        this.lrajusteplancomoimpre = lrajusteplancomoimpre;
        this.lrajusteplanmuestraval = lrajusteplanmuestraval;
        this.lrajusteplanac = lrajusteplanac;
        this.lrajusteplanpordefecto = lrajusteplanpordefecto;
    }

    public Lrajusteplan(long lrajusteid, long lrseccdetalleid, long lrparmcotiplanid, long lrtipoplanid) {
        this.lrajusteplanPK = new LrajusteplanPK(lrajusteid, lrseccdetalleid, lrparmcotiplanid, lrtipoplanid);
    }

    public LrajusteplanPK getLrajusteplanPK() {
        return lrajusteplanPK;
    }

    public void setLrajusteplanPK(LrajusteplanPK lrajusteplanPK) {
        this.lrajusteplanPK = lrajusteplanPK;
    }

    public BigDecimal getLrajusteplanpormin() {
        return lrajusteplanpormin;
    }

    public void setLrajusteplanpormin(BigDecimal lrajusteplanpormin) {
        this.lrajusteplanpormin = lrajusteplanpormin;
    }

    public BigDecimal getLrajusteplanpormax() {
        return lrajusteplanpormax;
    }

    public void setLrajusteplanpormax(BigDecimal lrajusteplanpormax) {
        this.lrajusteplanpormax = lrajusteplanpormax;
    }

    public String getLrajusteplanobs() {
        return lrajusteplanobs;
    }

    public void setLrajusteplanobs(String lrajusteplanobs) {
        this.lrajusteplanobs = lrajusteplanobs;
    }

    public Character getLrajusteplanviscarga() {
        return lrajusteplanviscarga;
    }

    public void setLrajusteplanviscarga(Character lrajusteplanviscarga) {
        this.lrajusteplanviscarga = lrajusteplanviscarga;
    }

    public Character getLrajusteplanimpre() {
        return lrajusteplanimpre;
    }

    public void setLrajusteplanimpre(Character lrajusteplanimpre) {
        this.lrajusteplanimpre = lrajusteplanimpre;
    }

    public String getLrajusteplancomoimpre() {
        return lrajusteplancomoimpre;
    }

    public void setLrajusteplancomoimpre(String lrajusteplancomoimpre) {
        this.lrajusteplancomoimpre = lrajusteplancomoimpre;
    }

    public Character getLrajusteplanmuestraval() {
        return lrajusteplanmuestraval;
    }

    public void setLrajusteplanmuestraval(Character lrajusteplanmuestraval) {
        this.lrajusteplanmuestraval = lrajusteplanmuestraval;
    }

    public String getLrajusteplanual() {
        return lrajusteplanual;
    }

    public void setLrajusteplanual(String lrajusteplanual) {
        this.lrajusteplanual = lrajusteplanual;
    }

    public Date getLrajusteplanfal() {
        return lrajusteplanfal;
    }

    public void setLrajusteplanfal(Date lrajusteplanfal) {
        this.lrajusteplanfal = lrajusteplanfal;
    }

    public String getLrajusteplanumd() {
        return lrajusteplanumd;
    }

    public void setLrajusteplanumd(String lrajusteplanumd) {
        this.lrajusteplanumd = lrajusteplanumd;
    }

    public Date getLrajusteplanfmd() {
        return lrajusteplanfmd;
    }

    public void setLrajusteplanfmd(Date lrajusteplanfmd) {
        this.lrajusteplanfmd = lrajusteplanfmd;
    }

    public Character getLrajusteplanac() {
        return lrajusteplanac;
    }

    public void setLrajusteplanac(Character lrajusteplanac) {
        this.lrajusteplanac = lrajusteplanac;
    }

    public Character getLrajusteplanpordefecto() {
        return lrajusteplanpordefecto;
    }

    public void setLrajusteplanpordefecto(Character lrajusteplanpordefecto) {
        this.lrajusteplanpordefecto = lrajusteplanpordefecto;
    }

    public Lrajuste getLrajuste() {
        return lrajuste;
    }

    public void setLrajuste(Lrajuste lrajuste) {
        this.lrajuste = lrajuste;
    }

    public Lrparmcotiplansecc getLrparmcotiplansecc() {
        return lrparmcotiplansecc;
    }

    public void setLrparmcotiplansecc(Lrparmcotiplansecc lrparmcotiplansecc) {
        this.lrparmcotiplansecc = lrparmcotiplansecc;
    }

    public List<Lrcotiplanbiendesc> getLrcotiplanbiendescList() {
        return lrcotiplanbiendescList;
    }

    public void setLrcotiplanbiendescList(List<Lrcotiplanbiendesc> lrcotiplanbiendescList) {
        this.lrcotiplanbiendescList = lrcotiplanbiendescList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrajusteplanPK != null ? lrajusteplanPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrajusteplan)) {
            return false;
        }
        Lrajusteplan other = (Lrajusteplan) object;
        if ((this.lrajusteplanPK == null && other.lrajusteplanPK != null) || (this.lrajusteplanPK != null && !this.lrajusteplanPK.equals(other.lrajusteplanPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrajusteplan[ lrajusteplanPK=" + lrajusteplanPK + " ]";
    }
    
}
