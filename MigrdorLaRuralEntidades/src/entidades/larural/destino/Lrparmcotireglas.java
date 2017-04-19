/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
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
@Table(name = "LRPARMCOTIREGLAS")
@NamedQueries({
    @NamedQuery(name = "Lrparmcotireglas.findAll", query = "SELECT l FROM Lrparmcotireglas l"),
    @NamedQuery(name = "Lrparmcotireglas.findByMonid", query = "SELECT l FROM Lrparmcotireglas l WHERE l.lrparmcotireglasPK.monid = :monid"),
    @NamedQuery(name = "Lrparmcotireglas.findByLrparmitemid", query = "SELECT l FROM Lrparmcotireglas l WHERE l.lrparmcotireglasPK.lrparmitemid = :lrparmitemid"),
    @NamedQuery(name = "Lrparmcotireglas.findByLrseccdetalleid", query = "SELECT l FROM Lrparmcotireglas l WHERE l.lrparmcotireglasPK.lrseccdetalleid = :lrseccdetalleid"),
    @NamedQuery(name = "Lrparmcotireglas.findByLrparmcotiplanid", query = "SELECT l FROM Lrparmcotireglas l WHERE l.lrparmcotireglasPK.lrparmcotiplanid = :lrparmcotiplanid"),
    @NamedQuery(name = "Lrparmcotireglas.findByLrtipoplanid", query = "SELECT l FROM Lrparmcotireglas l WHERE l.lrparmcotireglasPK.lrtipoplanid = :lrtipoplanid"),
    @NamedQuery(name = "Lrparmcotireglas.findByLragrupaimpresionid", query = "SELECT l FROM Lrparmcotireglas l WHERE l.lrparmcotireglasPK.lragrupaimpresionid = :lragrupaimpresionid"),
    @NamedQuery(name = "Lrparmcotireglas.findByLrparmcotireglascoditem", query = "SELECT l FROM Lrparmcotireglas l WHERE l.lrparmcotireglascoditem = :lrparmcotireglascoditem"),
    @NamedQuery(name = "Lrparmcotireglas.findByLrparmcotireglasformula", query = "SELECT l FROM Lrparmcotireglas l WHERE l.lrparmcotireglasformula = :lrparmcotireglasformula"),
    @NamedQuery(name = "Lrparmcotireglas.findByLrparmcotireglasordenejecucion", query = "SELECT l FROM Lrparmcotireglas l WHERE l.lrparmcotireglasordenejecucion = :lrparmcotireglasordenejecucion"),
    @NamedQuery(name = "Lrparmcotireglas.findByLrparmcotireglasordenenvisual", query = "SELECT l FROM Lrparmcotireglas l WHERE l.lrparmcotireglasordenenvisual = :lrparmcotireglasordenenvisual"),
    @NamedQuery(name = "Lrparmcotireglas.findByLrparmcotireglascampaux", query = "SELECT l FROM Lrparmcotireglas l WHERE l.lrparmcotireglascampaux = :lrparmcotireglascampaux"),
    @NamedQuery(name = "Lrparmcotireglas.findByLrparmcotireglasingresa", query = "SELECT l FROM Lrparmcotireglas l WHERE l.lrparmcotireglasingresa = :lrparmcotireglasingresa"),
    @NamedQuery(name = "Lrparmcotireglas.findByLrparmcotireglasviscarga", query = "SELECT l FROM Lrparmcotireglas l WHERE l.lrparmcotireglasviscarga = :lrparmcotireglasviscarga"),
    @NamedQuery(name = "Lrparmcotireglas.findByLrparmcotireglascotfin", query = "SELECT l FROM Lrparmcotireglas l WHERE l.lrparmcotireglascotfin = :lrparmcotireglascotfin"),
    @NamedQuery(name = "Lrparmcotireglas.findByLrparmcotireglasimprime", query = "SELECT l FROM Lrparmcotireglas l WHERE l.lrparmcotireglasimprime = :lrparmcotireglasimprime"),
    @NamedQuery(name = "Lrparmcotireglas.findByLrparmcotireglascomimprime", query = "SELECT l FROM Lrparmcotireglas l WHERE l.lrparmcotireglascomimprime = :lrparmcotireglascomimprime"),
    @NamedQuery(name = "Lrparmcotireglas.findByLrparmcotireglasprgejecuta", query = "SELECT l FROM Lrparmcotireglas l WHERE l.lrparmcotireglasprgejecuta = :lrparmcotireglasprgejecuta"),
    @NamedQuery(name = "Lrparmcotireglas.findByLrparmcotireglasmuestraval", query = "SELECT l FROM Lrparmcotireglas l WHERE l.lrparmcotireglasmuestraval = :lrparmcotireglasmuestraval"),
    @NamedQuery(name = "Lrparmcotireglas.findByLrparmcotireglasact", query = "SELECT l FROM Lrparmcotireglas l WHERE l.lrparmcotireglasact = :lrparmcotireglasact"),
    @NamedQuery(name = "Lrparmcotireglas.findByLrparmcotireglasual", query = "SELECT l FROM Lrparmcotireglas l WHERE l.lrparmcotireglasual = :lrparmcotireglasual"),
    @NamedQuery(name = "Lrparmcotireglas.findByLrparmcotireglasfal", query = "SELECT l FROM Lrparmcotireglas l WHERE l.lrparmcotireglasfal = :lrparmcotireglasfal"),
    @NamedQuery(name = "Lrparmcotireglas.findByLrparmcotireglasumd", query = "SELECT l FROM Lrparmcotireglas l WHERE l.lrparmcotireglasumd = :lrparmcotireglasumd"),
    @NamedQuery(name = "Lrparmcotireglas.findByLrparmcotireglasfmd", query = "SELECT l FROM Lrparmcotireglas l WHERE l.lrparmcotireglasfmd = :lrparmcotireglasfmd")})
public class Lrparmcotireglas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrparmcotireglasPK lrparmcotireglasPK;
    @Column(name = "LRPARMCOTIREGLASCODITEM")
    private Long lrparmcotireglascoditem;
    @Column(name = "LRPARMCOTIREGLASFORMULA", length = 4000)
    private String lrparmcotireglasformula;
    @Column(name = "LRPARMCOTIREGLASORDENEJECUCION")
    private Short lrparmcotireglasordenejecucion;
    @Column(name = "LRPARMCOTIREGLASORDENENVISUAL")
    private Long lrparmcotireglasordenenvisual;
    @Column(name = "LRPARMCOTIREGLASCAMPAUX")
    private Character lrparmcotireglascampaux;
    @Column(name = "LRPARMCOTIREGLASINGRESA")
    private Character lrparmcotireglasingresa;
    @Column(name = "LRPARMCOTIREGLASVISCARGA")
    private Character lrparmcotireglasviscarga;
    @Column(name = "LRPARMCOTIREGLASCOTFIN")
    private Character lrparmcotireglascotfin;
    @Column(name = "LRPARMCOTIREGLASIMPRIME")
    private Character lrparmcotireglasimprime;
    @Column(name = "LRPARMCOTIREGLASCOMIMPRIME", length = 60)
    private String lrparmcotireglascomimprime;
    @Column(name = "LRPARMCOTIREGLASPRGEJECUTA", length = 60)
    private String lrparmcotireglasprgejecuta;
    @Column(name = "LRPARMCOTIREGLASMUESTRAVAL")
    private Character lrparmcotireglasmuestraval;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIREGLASACT", nullable = false)
    private Character lrparmcotireglasact;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIREGLASUAL", nullable = false, length = 30)
    private String lrparmcotireglasual;
    @Basic(optional = false)
    @Column(name = "LRPARMCOTIREGLASFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrparmcotireglasfal;
    @Column(name = "LRPARMCOTIREGLASUMD", length = 30)
    private String lrparmcotireglasumd;
    @Column(name = "LRPARMCOTIREGLASFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrparmcotireglasfmd;
    @JoinColumn(name = "LRAGRUPAIMPRESIONID", referencedColumnName = "LRAGRUPAIMPRESIONID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lragrupaimpresion lragrupaimpresion;
    @JoinColumns({
        @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "LRPARMCOTIPLANID", referencedColumnName = "LRPARMCOTIPLANID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "LRTIPOPLANID", referencedColumnName = "LRTIPOPLANID", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Lrparmcotiplansecc lrparmcotiplansecc;
    @JoinColumn(name = "LRPARMITEMID", referencedColumnName = "LRPARMITEMID", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrparmitem lrparmitem;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrparmcotireglas")
    private List<Lrhistoricoreglas> lrhistoricoreglasList;

    public Lrparmcotireglas() {
    }

    public Lrparmcotireglas(LrparmcotireglasPK lrparmcotireglasPK) {
        this.lrparmcotireglasPK = lrparmcotireglasPK;
    }

    public Lrparmcotireglas(LrparmcotireglasPK lrparmcotireglasPK, Character lrparmcotireglasact, String lrparmcotireglasual, Date lrparmcotireglasfal) {
        this.lrparmcotireglasPK = lrparmcotireglasPK;
        this.lrparmcotireglasact = lrparmcotireglasact;
        this.lrparmcotireglasual = lrparmcotireglasual;
        this.lrparmcotireglasfal = lrparmcotireglasfal;
    }

    public Lrparmcotireglas(short monid, long lrparmitemid, long lrseccdetalleid, long lrparmcotiplanid, long lrtipoplanid, long lragrupaimpresionid) {
        this.lrparmcotireglasPK = new LrparmcotireglasPK(monid, lrparmitemid, lrseccdetalleid, lrparmcotiplanid, lrtipoplanid, lragrupaimpresionid);
    }

    public LrparmcotireglasPK getLrparmcotireglasPK() {
        return lrparmcotireglasPK;
    }

    public void setLrparmcotireglasPK(LrparmcotireglasPK lrparmcotireglasPK) {
        this.lrparmcotireglasPK = lrparmcotireglasPK;
    }

    public Long getLrparmcotireglascoditem() {
        return lrparmcotireglascoditem;
    }

    public void setLrparmcotireglascoditem(Long lrparmcotireglascoditem) {
        this.lrparmcotireglascoditem = lrparmcotireglascoditem;
    }

    public String getLrparmcotireglasformula() {
        return lrparmcotireglasformula;
    }

    public void setLrparmcotireglasformula(String lrparmcotireglasformula) {
        this.lrparmcotireglasformula = lrparmcotireglasformula;
    }

    public Short getLrparmcotireglasordenejecucion() {
        return lrparmcotireglasordenejecucion;
    }

    public void setLrparmcotireglasordenejecucion(Short lrparmcotireglasordenejecucion) {
        this.lrparmcotireglasordenejecucion = lrparmcotireglasordenejecucion;
    }

    public Long getLrparmcotireglasordenenvisual() {
        return lrparmcotireglasordenenvisual;
    }

    public void setLrparmcotireglasordenenvisual(Long lrparmcotireglasordenenvisual) {
        this.lrparmcotireglasordenenvisual = lrparmcotireglasordenenvisual;
    }

    public Character getLrparmcotireglascampaux() {
        return lrparmcotireglascampaux;
    }

    public void setLrparmcotireglascampaux(Character lrparmcotireglascampaux) {
        this.lrparmcotireglascampaux = lrparmcotireglascampaux;
    }

    public Character getLrparmcotireglasingresa() {
        return lrparmcotireglasingresa;
    }

    public void setLrparmcotireglasingresa(Character lrparmcotireglasingresa) {
        this.lrparmcotireglasingresa = lrparmcotireglasingresa;
    }

    public Character getLrparmcotireglasviscarga() {
        return lrparmcotireglasviscarga;
    }

    public void setLrparmcotireglasviscarga(Character lrparmcotireglasviscarga) {
        this.lrparmcotireglasviscarga = lrparmcotireglasviscarga;
    }

    public Character getLrparmcotireglascotfin() {
        return lrparmcotireglascotfin;
    }

    public void setLrparmcotireglascotfin(Character lrparmcotireglascotfin) {
        this.lrparmcotireglascotfin = lrparmcotireglascotfin;
    }

    public Character getLrparmcotireglasimprime() {
        return lrparmcotireglasimprime;
    }

    public void setLrparmcotireglasimprime(Character lrparmcotireglasimprime) {
        this.lrparmcotireglasimprime = lrparmcotireglasimprime;
    }

    public String getLrparmcotireglascomimprime() {
        return lrparmcotireglascomimprime;
    }

    public void setLrparmcotireglascomimprime(String lrparmcotireglascomimprime) {
        this.lrparmcotireglascomimprime = lrparmcotireglascomimprime;
    }

    public String getLrparmcotireglasprgejecuta() {
        return lrparmcotireglasprgejecuta;
    }

    public void setLrparmcotireglasprgejecuta(String lrparmcotireglasprgejecuta) {
        this.lrparmcotireglasprgejecuta = lrparmcotireglasprgejecuta;
    }

    public Character getLrparmcotireglasmuestraval() {
        return lrparmcotireglasmuestraval;
    }

    public void setLrparmcotireglasmuestraval(Character lrparmcotireglasmuestraval) {
        this.lrparmcotireglasmuestraval = lrparmcotireglasmuestraval;
    }

    public Character getLrparmcotireglasact() {
        return lrparmcotireglasact;
    }

    public void setLrparmcotireglasact(Character lrparmcotireglasact) {
        this.lrparmcotireglasact = lrparmcotireglasact;
    }

    public String getLrparmcotireglasual() {
        return lrparmcotireglasual;
    }

    public void setLrparmcotireglasual(String lrparmcotireglasual) {
        this.lrparmcotireglasual = lrparmcotireglasual;
    }

    public Date getLrparmcotireglasfal() {
        return lrparmcotireglasfal;
    }

    public void setLrparmcotireglasfal(Date lrparmcotireglasfal) {
        this.lrparmcotireglasfal = lrparmcotireglasfal;
    }

    public String getLrparmcotireglasumd() {
        return lrparmcotireglasumd;
    }

    public void setLrparmcotireglasumd(String lrparmcotireglasumd) {
        this.lrparmcotireglasumd = lrparmcotireglasumd;
    }

    public Date getLrparmcotireglasfmd() {
        return lrparmcotireglasfmd;
    }

    public void setLrparmcotireglasfmd(Date lrparmcotireglasfmd) {
        this.lrparmcotireglasfmd = lrparmcotireglasfmd;
    }

    public Lragrupaimpresion getLragrupaimpresion() {
        return lragrupaimpresion;
    }

    public void setLragrupaimpresion(Lragrupaimpresion lragrupaimpresion) {
        this.lragrupaimpresion = lragrupaimpresion;
    }

    public Lrparmcotiplansecc getLrparmcotiplansecc() {
        return lrparmcotiplansecc;
    }

    public void setLrparmcotiplansecc(Lrparmcotiplansecc lrparmcotiplansecc) {
        this.lrparmcotiplansecc = lrparmcotiplansecc;
    }

    public Lrparmitem getLrparmitem() {
        return lrparmitem;
    }

    public void setLrparmitem(Lrparmitem lrparmitem) {
        this.lrparmitem = lrparmitem;
    }

    public List<Lrhistoricoreglas> getLrhistoricoreglasList() {
        return lrhistoricoreglasList;
    }

    public void setLrhistoricoreglasList(List<Lrhistoricoreglas> lrhistoricoreglasList) {
        this.lrhistoricoreglasList = lrhistoricoreglasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrparmcotireglasPK != null ? lrparmcotireglasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrparmcotireglas)) {
            return false;
        }
        Lrparmcotireglas other = (Lrparmcotireglas) object;
        if ((this.lrparmcotireglasPK == null && other.lrparmcotireglasPK != null) || (this.lrparmcotireglasPK != null && !this.lrparmcotireglasPK.equals(other.lrparmcotireglasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrparmcotireglas[ lrparmcotireglasPK=" + lrparmcotireglasPK + " ]";
    }
    
}
