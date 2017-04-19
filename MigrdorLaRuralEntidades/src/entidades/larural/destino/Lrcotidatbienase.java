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
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRCOTIDATBIENASE")
@NamedQueries({
    @NamedQuery(name = "Lrcotidatbienase.findAll", query = "SELECT l FROM Lrcotidatbienase l"),
    @NamedQuery(name = "Lrcotidatbienase.findByLrcotidatbienasenroitem", query = "SELECT l FROM Lrcotidatbienase l WHERE l.lrcotidatbienasenroitem = :lrcotidatbienasenroitem"),
    @NamedQuery(name = "Lrcotidatbienase.findByRiesgosaseid", query = "SELECT l FROM Lrcotidatbienase l WHERE l.riesgosaseid = :riesgosaseid"),
    @NamedQuery(name = "Lrcotidatbienase.findBySeccid", query = "SELECT l FROM Lrcotidatbienase l WHERE l.seccid = :seccid"),
    @NamedQuery(name = "Lrcotidatbienase.findByLrcotidatbienasesumaase", query = "SELECT l FROM Lrcotidatbienase l WHERE l.lrcotidatbienasesumaase = :lrcotidatbienasesumaase"),
    @NamedQuery(name = "Lrcotidatbienase.findByLrcotidatbienaseagrupacargoid", query = "SELECT l FROM Lrcotidatbienase l WHERE l.lrcotidatbienaseagrupacargoid = :lrcotidatbienaseagrupacargoid"),
    @NamedQuery(name = "Lrcotidatbienase.findByLrcotidatbienasecoberttipid", query = "SELECT l FROM Lrcotidatbienase l WHERE l.lrcotidatbienasecoberttipid = :lrcotidatbienasecoberttipid"),
    @NamedQuery(name = "Lrcotidatbienase.findByLrcotidatbienasecant", query = "SELECT l FROM Lrcotidatbienase l WHERE l.lrcotidatbienasecant = :lrcotidatbienasecant"),
    @NamedQuery(name = "Lrcotidatbienase.findByLrcotidatbienaseprimaren", query = "SELECT l FROM Lrcotidatbienase l WHERE l.lrcotidatbienaseprimaren = :lrcotidatbienaseprimaren"),
    @NamedQuery(name = "Lrcotidatbienase.findByLrcotidatbienasehasta", query = "SELECT l FROM Lrcotidatbienase l WHERE l.lrcotidatbienasehasta = :lrcotidatbienasehasta"),
    @NamedQuery(name = "Lrcotidatbienase.findByLrcotidatbienasedesde", query = "SELECT l FROM Lrcotidatbienase l WHERE l.lrcotidatbienasedesde = :lrcotidatbienasedesde"),
    @NamedQuery(name = "Lrcotidatbienase.findByLrcotidatbienasepromedioedad", query = "SELECT l FROM Lrcotidatbienase l WHERE l.lrcotidatbienasepromedioedad = :lrcotidatbienasepromedioedad"),
    @NamedQuery(name = "Lrcotidatbienase.findByLrcotidatbienasetasa", query = "SELECT l FROM Lrcotidatbienase l WHERE l.lrcotidatbienasetasa = :lrcotidatbienasetasa"),
    @NamedQuery(name = "Lrcotidatbienase.findByLrcotidatbienaseobjetoseguroid", query = "SELECT l FROM Lrcotidatbienase l WHERE l.lrcotidatbienaseobjetoseguroid = :lrcotidatbienaseobjetoseguroid"),
    @NamedQuery(name = "Lrcotidatbienase.findByLrcotidatbienasetipo", query = "SELECT l FROM Lrcotidatbienase l WHERE l.lrcotidatbienasetipo = :lrcotidatbienasetipo"),
    @NamedQuery(name = "Lrcotidatbienase.findByLrcotidatbienasesumaaseaux", query = "SELECT l FROM Lrcotidatbienase l WHERE l.lrcotidatbienasesumaaseaux = :lrcotidatbienasesumaaseaux")})
public class Lrcotidatbienase implements Serializable {
    @Column(name = "LRCOTIDATBIENASECODCONTRATISTA", precision = 17, scale = 2)
    private BigDecimal lrcotidatbienasecodcontratista;
    @Column(name = "LRCOTIDATBIENASEMODIFI")
    private Character lrcotidatbienasemodifi;
    @Column(name = "LRCOTIDATBIENASEPREMIO", precision = 17, scale = 2)
    private BigDecimal lrcotidatbienasepremio;
    @Column(name = "LRCOTIDATBIENASEUSAMOTO")
    private Character lrcotidatbienaseusamoto;
    @Column(name = "LRCOTIDATBIENASELRITEMASEGPLAN")
    private Long lrcotidatbienaselritemasegplan;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcotidatbienase")
    private List<Lrdatosvehiculo> lrdatosvehiculoList;

    private static final long serialVersionUID = 1L;

//    @Embeddable
//    public static class LrcotidatbienasePK {
//
//        @Basic(optional = false)
//        @Column(name = "LRCOTIDATBIENASEID", nullable = false)
//        private long lrcotidatbienaseid;
//        @Basic(optional = false)
//        @Column(name = "LRUBICACIONID", nullable = false, updatable = false, insertable = false)
//        private Long lrubicacion;
//
//        public long getLrcotidatbienaseid() {
//            return lrcotidatbienaseid;
//        }
//
//        public void setLrcotidatbienaseid(long lrcotidatbienaseid) {
//            this.lrcotidatbienaseid = lrcotidatbienaseid;
//        }
//
//        public Long getLrubicacionid() {
//            return lrubicacion;
//        }
//
//        public void setLrubicacionid(Long lrubicacionid) {
//            this.lrubicacion = lrubicacionid;
//        }
//        
//        
//        
//    }

    @EmbeddedId
    protected LrcotidatbienasePK lrcotidatbienasePK;
    @Basic(optional = false)
    @Column(name = "LRCOTIDATBIENASENROITEM", nullable = false)
    private long lrcotidatbienasenroitem;
    @Column(name = "RIESGOSASEID")
    private Short riesgosaseid;
    @Column(name = "SECCID")
    private Short seccid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRCOTIDATBIENASESUMAASE", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotidatbienasesumaase;
    @Column(name = "LRCOTIDATBIENASEAGRUPACARGOID")
    private Long lrcotidatbienaseagrupacargoid;
    @Column(name = "LRCOTIDATBIENASECOBERTTIPID")
    private Short lrcotidatbienasecoberttipid;
    @Column(name = "LRCOTIDATBIENASECANT")
    private Long lrcotidatbienasecant;
    @Column(name = "LRCOTIDATBIENASEPRIMAREN", precision = 17, scale = 2)
    private BigDecimal lrcotidatbienaseprimaren;
    @Column(name = "LRCOTIDATBIENASEHASTA", precision = 17, scale = 2)
    private BigDecimal lrcotidatbienasehasta;
    @Column(name = "LRCOTIDATBIENASEDESDE", precision = 17, scale = 2)
    private BigDecimal lrcotidatbienasedesde;
    @Column(name = "LRCOTIDATBIENASEPROMEDIOEDAD")
    private Short lrcotidatbienasepromedioedad;
    @Column(name = "LRCOTIDATBIENASETASA", precision = 7, scale = 2)
    private BigDecimal lrcotidatbienasetasa;
    @Column(name = "LRCOTIDATBIENASEOBJETOSEGUROID")
    private Long lrcotidatbienaseobjetoseguroid;
    @Column(name = "LRCOTIDATBIENASETIPO", length = 2)
    private String lrcotidatbienasetipo;
    @Column(name = "LRCOTIDATBIENASESUMAASEAUX", precision = 17, scale = 2)
    private BigDecimal lrcotidatbienasesumaaseaux;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcotidatbienase")
    private List<Lrcotibientexto> lrcotibientextoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcotidatbienase")
    private List<Lrcotidatbiendet> lrcotidatbiendetList;
    @JoinColumn(name = "LRCARGOID", referencedColumnName = "LRCARGOID")
    @ManyToOne
    private Lrcargo lrcargoid;
    @JoinColumn(name = "LRDESPACHANTEID", referencedColumnName = "LRDESPACHANTEID")
    @ManyToOne
    private Lrdespachante lrdespachanteid;
    @JoinColumn(name = "SLRPERSONAID", referencedColumnName = "LRPERSONAID")
    @ManyToOne
    private Lrpersona slrpersonaid;
    @MapsId("lrubicacionid")
    @JoinColumn(name = "LRUBICACIONID", referencedColumnName = "LRUBICACIONID", nullable = false)
    @ManyToOne(optional = false)
    private Lrubicacion lrubicacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcotidatbienase")
    private List<Lrcotiplanbien> lrcotiplanbienList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcotidatbienase")
    private List<Lrcajasfuertes> lrcajasfuertesList;
    @OneToMany(mappedBy = "lrcotidatbienase")
    private List<Lrpersonasautorizadas> lrpersonasautorizadasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrcotidatbienase")
    private List<Lrdetalletransporte> lrdetalletransporteList;

    public Lrcotidatbienase() {
    }

    public Lrcotidatbienase(LrcotidatbienasePK lrcotidatbienasePK) {
        this.lrcotidatbienasePK = lrcotidatbienasePK;
    }

    public Lrcotidatbienase(LrcotidatbienasePK lrcotidatbienasePK, long lrcotidatbienasenroitem, BigDecimal lrcotidatbienasesumaase) {
        this.lrcotidatbienasePK = lrcotidatbienasePK;
        this.lrcotidatbienasenroitem = lrcotidatbienasenroitem;
        this.lrcotidatbienasesumaase = lrcotidatbienasesumaase;
    }

    public LrcotidatbienasePK getLrcotidatbienasePK() {
        return lrcotidatbienasePK;
    }

    public void setLrcotidatbienasePK(LrcotidatbienasePK lrcotidatbienasePK) {
        this.lrcotidatbienasePK = lrcotidatbienasePK;
    }

    public long getLrcotidatbienasenroitem() {
        return lrcotidatbienasenroitem;
    }

    public void setLrcotidatbienasenroitem(long lrcotidatbienasenroitem) {
        this.lrcotidatbienasenroitem = lrcotidatbienasenroitem;
    }

    public Short getRiesgosaseid() {
        return riesgosaseid;
    }

    public void setRiesgosaseid(Short riesgosaseid) {
        this.riesgosaseid = riesgosaseid;
    }

    public Short getSeccid() {
        return seccid;
    }

    public void setSeccid(Short seccid) {
        this.seccid = seccid;
    }

    public BigDecimal getLrcotidatbienasesumaase() {
        return lrcotidatbienasesumaase;
    }

    public void setLrcotidatbienasesumaase(BigDecimal lrcotidatbienasesumaase) {
        this.lrcotidatbienasesumaase = lrcotidatbienasesumaase;
    }

    public Long getLrcotidatbienaseagrupacargoid() {
        return lrcotidatbienaseagrupacargoid;
    }

    public void setLrcotidatbienaseagrupacargoid(Long lrcotidatbienaseagrupacargoid) {
        this.lrcotidatbienaseagrupacargoid = lrcotidatbienaseagrupacargoid;
    }

    public Short getLrcotidatbienasecoberttipid() {
        return lrcotidatbienasecoberttipid;
    }

    public void setLrcotidatbienasecoberttipid(Short lrcotidatbienasecoberttipid) {
        this.lrcotidatbienasecoberttipid = lrcotidatbienasecoberttipid;
    }

    public Long getLrcotidatbienasecant() {
        return lrcotidatbienasecant;
    }

    public void setLrcotidatbienasecant(Long lrcotidatbienasecant) {
        this.lrcotidatbienasecant = lrcotidatbienasecant;
    }

    public BigDecimal getLrcotidatbienaseprimaren() {
        return lrcotidatbienaseprimaren;
    }

    public void setLrcotidatbienaseprimaren(BigDecimal lrcotidatbienaseprimaren) {
        this.lrcotidatbienaseprimaren = lrcotidatbienaseprimaren;
    }

    public BigDecimal getLrcotidatbienasehasta() {
        return lrcotidatbienasehasta;
    }

    public void setLrcotidatbienasehasta(BigDecimal lrcotidatbienasehasta) {
        this.lrcotidatbienasehasta = lrcotidatbienasehasta;
    }

    public BigDecimal getLrcotidatbienasedesde() {
        return lrcotidatbienasedesde;
    }

    public void setLrcotidatbienasedesde(BigDecimal lrcotidatbienasedesde) {
        this.lrcotidatbienasedesde = lrcotidatbienasedesde;
    }

    public Short getLrcotidatbienasepromedioedad() {
        return lrcotidatbienasepromedioedad;
    }

    public void setLrcotidatbienasepromedioedad(Short lrcotidatbienasepromedioedad) {
        this.lrcotidatbienasepromedioedad = lrcotidatbienasepromedioedad;
    }

    public BigDecimal getLrcotidatbienasetasa() {
        return lrcotidatbienasetasa;
    }

    public void setLrcotidatbienasetasa(BigDecimal lrcotidatbienasetasa) {
        this.lrcotidatbienasetasa = lrcotidatbienasetasa;
    }

    public Long getLrcotidatbienaseobjetoseguroid() {
        return lrcotidatbienaseobjetoseguroid;
    }

    public void setLrcotidatbienaseobjetoseguroid(Long lrcotidatbienaseobjetoseguroid) {
        this.lrcotidatbienaseobjetoseguroid = lrcotidatbienaseobjetoseguroid;
    }

    public String getLrcotidatbienasetipo() {
        return lrcotidatbienasetipo;
    }

    public void setLrcotidatbienasetipo(String lrcotidatbienasetipo) {
        this.lrcotidatbienasetipo = lrcotidatbienasetipo;
    }

    public BigDecimal getLrcotidatbienasesumaaseaux() {
        return lrcotidatbienasesumaaseaux;
    }

    public void setLrcotidatbienasesumaaseaux(BigDecimal lrcotidatbienasesumaaseaux) {
        this.lrcotidatbienasesumaaseaux = lrcotidatbienasesumaaseaux;
    }

    public List<Lrcotibientexto> getLrcotibientextoList() {
        return lrcotibientextoList;
    }

    public void setLrcotibientextoList(List<Lrcotibientexto> lrcotibientextoList) {
        this.lrcotibientextoList = lrcotibientextoList;
    }

    public List<Lrcotidatbiendet> getLrcotidatbiendetList() {
        return lrcotidatbiendetList;
    }

    public void setLrcotidatbiendetList(List<Lrcotidatbiendet> lrcotidatbiendetList) {
        this.lrcotidatbiendetList = lrcotidatbiendetList;
    }

    public Lrcargo getLrcargoid() {
        return lrcargoid;
    }

    public void setLrcargoid(Lrcargo lrcargoid) {
        this.lrcargoid = lrcargoid;
    }

    public Lrdespachante getLrdespachanteid() {
        return lrdespachanteid;
    }

    public void setLrdespachanteid(Lrdespachante lrdespachanteid) {
        this.lrdespachanteid = lrdespachanteid;
    }

    public Lrpersona getSlrpersonaid() {
        return slrpersonaid;
    }

    public void setSlrpersonaid(Lrpersona slrpersonaid) {
        this.slrpersonaid = slrpersonaid;
    }

//    public Lrubicacion getLrubicacion() {
//        return lrubicacion;
//    }
//
//    public void setLrubicacion(Lrubicacion lrubicacion) {
//        this.lrubicacion = lrubicacion;
//    }

    public List<Lrcotiplanbien> getLrcotiplanbienList() {
        return lrcotiplanbienList;
    }

    public void setLrcotiplanbienList(List<Lrcotiplanbien> lrcotiplanbienList) {
        this.lrcotiplanbienList = lrcotiplanbienList;
    }

    public List<Lrcajasfuertes> getLrcajasfuertesList() {
        return lrcajasfuertesList;
    }

    public void setLrcajasfuertesList(List<Lrcajasfuertes> lrcajasfuertesList) {
        this.lrcajasfuertesList = lrcajasfuertesList;
    }

    public List<Lrpersonasautorizadas> getLrpersonasautorizadasList() {
        return lrpersonasautorizadasList;
    }

    public void setLrpersonasautorizadasList(List<Lrpersonasautorizadas> lrpersonasautorizadasList) {
        this.lrpersonasautorizadasList = lrpersonasautorizadasList;
    }

    public List<Lrdetalletransporte> getLrdetalletransporteList() {
        return lrdetalletransporteList;
    }

    public void setLrdetalletransporteList(List<Lrdetalletransporte> lrdetalletransporteList) {
        this.lrdetalletransporteList = lrdetalletransporteList;
    }

    public Lrubicacion getLrubicacion() {
        return lrubicacion;
    }

    public void setLrubicacion(Lrubicacion lrubicacion) {
        this.lrubicacion = lrubicacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcotidatbienasePK != null ? lrcotidatbienasePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcotidatbienase)) {
            return false;
        }
        Lrcotidatbienase other = (Lrcotidatbienase) object;
        if ((this.lrcotidatbienasePK == null && other.lrcotidatbienasePK != null) || (this.lrcotidatbienasePK != null && !this.lrcotidatbienasePK.equals(other.lrcotidatbienasePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcotidatbienase[ lrcotidatbienasePK=" + lrcotidatbienasePK + " ]";
    }

    public Character getLrcotidatbienaseusamoto() {
        return lrcotidatbienaseusamoto;
    }

    public void setLrcotidatbienaseusamoto(Character lrcotidatbienaseusamoto) {
        this.lrcotidatbienaseusamoto = lrcotidatbienaseusamoto;
    }

    public Long getLrcotidatbienaselritemasegplan() {
        return lrcotidatbienaselritemasegplan;
    }

    public void setLrcotidatbienaselritemasegplan(Long lrcotidatbienaselritemasegplan) {
        this.lrcotidatbienaselritemasegplan = lrcotidatbienaselritemasegplan;
    }

    public BigDecimal getLrcotidatbienasecodcontratista() {
        return lrcotidatbienasecodcontratista;
    }

    public void setLrcotidatbienasecodcontratista(BigDecimal lrcotidatbienasecodcontratista) {
        this.lrcotidatbienasecodcontratista = lrcotidatbienasecodcontratista;
    }

    public List<Lrdatosvehiculo> getLrdatosvehiculoList() {
        return lrdatosvehiculoList;
    }

    public void setLrdatosvehiculoList(List<Lrdatosvehiculo> lrdatosvehiculoList) {
        this.lrdatosvehiculoList = lrdatosvehiculoList;
    }


    public Character getLrcotidatbienasemodifi() {
        return lrcotidatbienasemodifi;
    }

    public void setLrcotidatbienasemodifi(Character lrcotidatbienasemodifi) {
        this.lrcotidatbienasemodifi = lrcotidatbienasemodifi;
    }

    public BigDecimal getLrcotidatbienasepremio() {
        return lrcotidatbienasepremio;
    }

    public void setLrcotidatbienasepremio(BigDecimal lrcotidatbienasepremio) {
        this.lrcotidatbienasepremio = lrcotidatbienasepremio;
    }

}
