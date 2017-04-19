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
import javax.persistence.Id;
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
@Table(name = "LRREASEGURODET")
@NamedQueries({
    @NamedQuery(name = "Lrreasegurodet.findAll", query = "SELECT l FROM Lrreasegurodet l"),
    @NamedQuery(name = "Lrreasegurodet.findByLrreasegurodetid", query = "SELECT l FROM Lrreasegurodet l WHERE l.lrreasegurodetid = :lrreasegurodetid"),
    @NamedQuery(name = "Lrreasegurodet.findByComreacoaid", query = "SELECT l FROM Lrreasegurodet l WHERE l.comreacoaid = :comreacoaid"),
    @NamedQuery(name = "Lrreasegurodet.findByLrreasegurodetac", query = "SELECT l FROM Lrreasegurodet l WHERE l.lrreasegurodetac = :lrreasegurodetac"),
    @NamedQuery(name = "Lrreasegurodet.findByLrreasegurodetual", query = "SELECT l FROM Lrreasegurodet l WHERE l.lrreasegurodetual = :lrreasegurodetual"),
    @NamedQuery(name = "Lrreasegurodet.findByLrreasegurodetfal", query = "SELECT l FROM Lrreasegurodet l WHERE l.lrreasegurodetfal = :lrreasegurodetfal"),
    @NamedQuery(name = "Lrreasegurodet.findByLrreasegurodetumd", query = "SELECT l FROM Lrreasegurodet l WHERE l.lrreasegurodetumd = :lrreasegurodetumd"),
    @NamedQuery(name = "Lrreasegurodet.findByLrreasegurodetfmd", query = "SELECT l FROM Lrreasegurodet l WHERE l.lrreasegurodetfmd = :lrreasegurodetfmd"),
    @NamedQuery(name = "Lrreasegurodet.findByLrreasegurodetimporte", query = "SELECT l FROM Lrreasegurodet l WHERE l.lrreasegurodetimporte = :lrreasegurodetimporte"),
    @NamedQuery(name = "Lrreasegurodet.findByLrreasegurodetporc", query = "SELECT l FROM Lrreasegurodet l WHERE l.lrreasegurodetporc = :lrreasegurodetporc"),
    @NamedQuery(name = "Lrreasegurodet.findByLrreasegurodettasabrutalr", query = "SELECT l FROM Lrreasegurodet l WHERE l.lrreasegurodettasabrutalr = :lrreasegurodettasabrutalr"),
    @NamedQuery(name = "Lrreasegurodet.findByLrreasegurodetprimabrutalr", query = "SELECT l FROM Lrreasegurodet l WHERE l.lrreasegurodetprimabrutalr = :lrreasegurodetprimabrutalr"),
    @NamedQuery(name = "Lrreasegurodet.findByLrreasegurodetrecargo", query = "SELECT l FROM Lrreasegurodet l WHERE l.lrreasegurodetrecargo = :lrreasegurodetrecargo"),
    @NamedQuery(name = "Lrreasegurodet.findByLrreasegurodetdesc", query = "SELECT l FROM Lrreasegurodet l WHERE l.lrreasegurodetdesc = :lrreasegurodetdesc"),
    @NamedQuery(name = "Lrreasegurodet.findByLrreasegurodettasabrutarec", query = "SELECT l FROM Lrreasegurodet l WHERE l.lrreasegurodettasabrutarec = :lrreasegurodettasabrutarec"),
    @NamedQuery(name = "Lrreasegurodet.findByLrreasegurodetprimabrutarec", query = "SELECT l FROM Lrreasegurodet l WHERE l.lrreasegurodetprimabrutarec = :lrreasegurodetprimabrutarec"),
    @NamedQuery(name = "Lrreasegurodet.findByLrreasegurodettasarea", query = "SELECT l FROM Lrreasegurodet l WHERE l.lrreasegurodettasarea = :lrreasegurodettasarea"),
    @NamedQuery(name = "Lrreasegurodet.findByLrreasegurodetprimacedidabruta", query = "SELECT l FROM Lrreasegurodet l WHERE l.lrreasegurodetprimacedidabruta = :lrreasegurodetprimacedidabruta"),
    @NamedQuery(name = "Lrreasegurodet.findByLrreasegurodetdiftasa", query = "SELECT l FROM Lrreasegurodet l WHERE l.lrreasegurodetdiftasa = :lrreasegurodetdiftasa"),
    @NamedQuery(name = "Lrreasegurodet.findByLrreasegurodetporcdif", query = "SELECT l FROM Lrreasegurodet l WHERE l.lrreasegurodetporcdif = :lrreasegurodetporcdif"),
    @NamedQuery(name = "Lrreasegurodet.findByLrreasegurodetimpcom", query = "SELECT l FROM Lrreasegurodet l WHERE l.lrreasegurodetimpcom = :lrreasegurodetimpcom"),
    @NamedQuery(name = "Lrreasegurodet.findByLrreasegurodetprimacedidaneta", query = "SELECT l FROM Lrreasegurodet l WHERE l.lrreasegurodetprimacedidaneta = :lrreasegurodetprimacedidaneta"),
    @NamedQuery(name = "Lrreasegurodet.findByLrreasegurocomrea", query = "SELECT l FROM Lrreasegurodet l WHERE l.lrreasegurocomrea = :lrreasegurocomrea")})
public class Lrreasegurodet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETID", nullable = false)
    private Long lrreasegurodetid;
    @Basic(optional = false)
    @Column(name = "COMREACOAID", nullable = false)
    private short comreacoaid;
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETAC", nullable = false)
    private Character lrreasegurodetac;
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETUAL", nullable = false, length = 30)
    private String lrreasegurodetual;
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrreasegurodetfal;
    @Column(name = "LRREASEGURODETUMD", length = 30)
    private String lrreasegurodetumd;
    @Column(name = "LRREASEGURODETFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrreasegurodetfmd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETIMPORTE", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrreasegurodetimporte;
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETPORC", nullable = false, precision = 8, scale = 5)
    private BigDecimal lrreasegurodetporc;
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETTASABRUTALR", nullable = false, precision = 8, scale = 5)
    private BigDecimal lrreasegurodettasabrutalr;
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETPRIMABRUTALR", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrreasegurodetprimabrutalr;
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETRECARGO", nullable = false, precision = 8, scale = 5)
    private BigDecimal lrreasegurodetrecargo;
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETDESC", nullable = false, precision = 8, scale = 5)
    private BigDecimal lrreasegurodetdesc;
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETTASABRUTAREC", nullable = false, precision = 8, scale = 5)
    private BigDecimal lrreasegurodettasabrutarec;
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETPRIMABRUTAREC", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrreasegurodetprimabrutarec;
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETTASAREA", nullable = false, precision = 8, scale = 5)
    private BigDecimal lrreasegurodettasarea;
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETPRIMACEDIDABRUTA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrreasegurodetprimacedidabruta;
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETDIFTASA", nullable = false, precision = 8, scale = 5)
    private BigDecimal lrreasegurodetdiftasa;
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETPORCDIF", nullable = false, precision = 8, scale = 5)
    private BigDecimal lrreasegurodetporcdif;
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETIMPCOM", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrreasegurodetimpcom;
    @Basic(optional = false)
    @Column(name = "LRREASEGURODETPRIMACEDIDANETA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrreasegurodetprimacedidaneta;
    @Basic(optional = false)
    @Column(name = "LRREASEGUROCOMREA", nullable = false, precision = 8, scale = 5)
    private BigDecimal lrreasegurocomrea;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrreasegurodet")
    private List<Lrreasegurodetitem> lrreasegurodetitemList;
    @JoinColumn(name = "LRREASEGUROID", referencedColumnName = "LRREASEGUROID", nullable = false)
    @ManyToOne(optional = false)
    private Lrreaseguro lrreaseguroid;

    public Lrreasegurodet() {
    }

    public Lrreasegurodet(Long lrreasegurodetid) {
        this.lrreasegurodetid = lrreasegurodetid;
    }

    public Lrreasegurodet(Long lrreasegurodetid, short comreacoaid, Character lrreasegurodetac, String lrreasegurodetual, Date lrreasegurodetfal, BigDecimal lrreasegurodetimporte, BigDecimal lrreasegurodetporc, BigDecimal lrreasegurodettasabrutalr, BigDecimal lrreasegurodetprimabrutalr, BigDecimal lrreasegurodetrecargo, BigDecimal lrreasegurodetdesc, BigDecimal lrreasegurodettasabrutarec, BigDecimal lrreasegurodetprimabrutarec, BigDecimal lrreasegurodettasarea, BigDecimal lrreasegurodetprimacedidabruta, BigDecimal lrreasegurodetdiftasa, BigDecimal lrreasegurodetporcdif, BigDecimal lrreasegurodetimpcom, BigDecimal lrreasegurodetprimacedidaneta, BigDecimal lrreasegurocomrea) {
        this.lrreasegurodetid = lrreasegurodetid;
        this.comreacoaid = comreacoaid;
        this.lrreasegurodetac = lrreasegurodetac;
        this.lrreasegurodetual = lrreasegurodetual;
        this.lrreasegurodetfal = lrreasegurodetfal;
        this.lrreasegurodetimporte = lrreasegurodetimporte;
        this.lrreasegurodetporc = lrreasegurodetporc;
        this.lrreasegurodettasabrutalr = lrreasegurodettasabrutalr;
        this.lrreasegurodetprimabrutalr = lrreasegurodetprimabrutalr;
        this.lrreasegurodetrecargo = lrreasegurodetrecargo;
        this.lrreasegurodetdesc = lrreasegurodetdesc;
        this.lrreasegurodettasabrutarec = lrreasegurodettasabrutarec;
        this.lrreasegurodetprimabrutarec = lrreasegurodetprimabrutarec;
        this.lrreasegurodettasarea = lrreasegurodettasarea;
        this.lrreasegurodetprimacedidabruta = lrreasegurodetprimacedidabruta;
        this.lrreasegurodetdiftasa = lrreasegurodetdiftasa;
        this.lrreasegurodetporcdif = lrreasegurodetporcdif;
        this.lrreasegurodetimpcom = lrreasegurodetimpcom;
        this.lrreasegurodetprimacedidaneta = lrreasegurodetprimacedidaneta;
        this.lrreasegurocomrea = lrreasegurocomrea;
    }

    public Long getLrreasegurodetid() {
        return lrreasegurodetid;
    }

    public void setLrreasegurodetid(Long lrreasegurodetid) {
        this.lrreasegurodetid = lrreasegurodetid;
    }

    public short getComreacoaid() {
        return comreacoaid;
    }

    public void setComreacoaid(short comreacoaid) {
        this.comreacoaid = comreacoaid;
    }

    public Character getLrreasegurodetac() {
        return lrreasegurodetac;
    }

    public void setLrreasegurodetac(Character lrreasegurodetac) {
        this.lrreasegurodetac = lrreasegurodetac;
    }

    public String getLrreasegurodetual() {
        return lrreasegurodetual;
    }

    public void setLrreasegurodetual(String lrreasegurodetual) {
        this.lrreasegurodetual = lrreasegurodetual;
    }

    public Date getLrreasegurodetfal() {
        return lrreasegurodetfal;
    }

    public void setLrreasegurodetfal(Date lrreasegurodetfal) {
        this.lrreasegurodetfal = lrreasegurodetfal;
    }

    public String getLrreasegurodetumd() {
        return lrreasegurodetumd;
    }

    public void setLrreasegurodetumd(String lrreasegurodetumd) {
        this.lrreasegurodetumd = lrreasegurodetumd;
    }

    public Date getLrreasegurodetfmd() {
        return lrreasegurodetfmd;
    }

    public void setLrreasegurodetfmd(Date lrreasegurodetfmd) {
        this.lrreasegurodetfmd = lrreasegurodetfmd;
    }

    public BigDecimal getLrreasegurodetimporte() {
        return lrreasegurodetimporte;
    }

    public void setLrreasegurodetimporte(BigDecimal lrreasegurodetimporte) {
        this.lrreasegurodetimporte = lrreasegurodetimporte;
    }

    public BigDecimal getLrreasegurodetporc() {
        return lrreasegurodetporc;
    }

    public void setLrreasegurodetporc(BigDecimal lrreasegurodetporc) {
        this.lrreasegurodetporc = lrreasegurodetporc;
    }

    public BigDecimal getLrreasegurodettasabrutalr() {
        return lrreasegurodettasabrutalr;
    }

    public void setLrreasegurodettasabrutalr(BigDecimal lrreasegurodettasabrutalr) {
        this.lrreasegurodettasabrutalr = lrreasegurodettasabrutalr;
    }

    public BigDecimal getLrreasegurodetprimabrutalr() {
        return lrreasegurodetprimabrutalr;
    }

    public void setLrreasegurodetprimabrutalr(BigDecimal lrreasegurodetprimabrutalr) {
        this.lrreasegurodetprimabrutalr = lrreasegurodetprimabrutalr;
    }

    public BigDecimal getLrreasegurodetrecargo() {
        return lrreasegurodetrecargo;
    }

    public void setLrreasegurodetrecargo(BigDecimal lrreasegurodetrecargo) {
        this.lrreasegurodetrecargo = lrreasegurodetrecargo;
    }

    public BigDecimal getLrreasegurodetdesc() {
        return lrreasegurodetdesc;
    }

    public void setLrreasegurodetdesc(BigDecimal lrreasegurodetdesc) {
        this.lrreasegurodetdesc = lrreasegurodetdesc;
    }

    public BigDecimal getLrreasegurodettasabrutarec() {
        return lrreasegurodettasabrutarec;
    }

    public void setLrreasegurodettasabrutarec(BigDecimal lrreasegurodettasabrutarec) {
        this.lrreasegurodettasabrutarec = lrreasegurodettasabrutarec;
    }

    public BigDecimal getLrreasegurodetprimabrutarec() {
        return lrreasegurodetprimabrutarec;
    }

    public void setLrreasegurodetprimabrutarec(BigDecimal lrreasegurodetprimabrutarec) {
        this.lrreasegurodetprimabrutarec = lrreasegurodetprimabrutarec;
    }

    public BigDecimal getLrreasegurodettasarea() {
        return lrreasegurodettasarea;
    }

    public void setLrreasegurodettasarea(BigDecimal lrreasegurodettasarea) {
        this.lrreasegurodettasarea = lrreasegurodettasarea;
    }

    public BigDecimal getLrreasegurodetprimacedidabruta() {
        return lrreasegurodetprimacedidabruta;
    }

    public void setLrreasegurodetprimacedidabruta(BigDecimal lrreasegurodetprimacedidabruta) {
        this.lrreasegurodetprimacedidabruta = lrreasegurodetprimacedidabruta;
    }

    public BigDecimal getLrreasegurodetdiftasa() {
        return lrreasegurodetdiftasa;
    }

    public void setLrreasegurodetdiftasa(BigDecimal lrreasegurodetdiftasa) {
        this.lrreasegurodetdiftasa = lrreasegurodetdiftasa;
    }

    public BigDecimal getLrreasegurodetporcdif() {
        return lrreasegurodetporcdif;
    }

    public void setLrreasegurodetporcdif(BigDecimal lrreasegurodetporcdif) {
        this.lrreasegurodetporcdif = lrreasegurodetporcdif;
    }

    public BigDecimal getLrreasegurodetimpcom() {
        return lrreasegurodetimpcom;
    }

    public void setLrreasegurodetimpcom(BigDecimal lrreasegurodetimpcom) {
        this.lrreasegurodetimpcom = lrreasegurodetimpcom;
    }

    public BigDecimal getLrreasegurodetprimacedidaneta() {
        return lrreasegurodetprimacedidaneta;
    }

    public void setLrreasegurodetprimacedidaneta(BigDecimal lrreasegurodetprimacedidaneta) {
        this.lrreasegurodetprimacedidaneta = lrreasegurodetprimacedidaneta;
    }

    public BigDecimal getLrreasegurocomrea() {
        return lrreasegurocomrea;
    }

    public void setLrreasegurocomrea(BigDecimal lrreasegurocomrea) {
        this.lrreasegurocomrea = lrreasegurocomrea;
    }

    public List<Lrreasegurodetitem> getLrreasegurodetitemList() {
        return lrreasegurodetitemList;
    }

    public void setLrreasegurodetitemList(List<Lrreasegurodetitem> lrreasegurodetitemList) {
        this.lrreasegurodetitemList = lrreasegurodetitemList;
    }

    public Lrreaseguro getLrreaseguroid() {
        return lrreaseguroid;
    }

    public void setLrreaseguroid(Lrreaseguro lrreaseguroid) {
        this.lrreaseguroid = lrreaseguroid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrreasegurodetid != null ? lrreasegurodetid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrreasegurodet)) {
            return false;
        }
        Lrreasegurodet other = (Lrreasegurodet) object;
        if ((this.lrreasegurodetid == null && other.lrreasegurodetid != null) || (this.lrreasegurodetid != null && !this.lrreasegurodetid.equals(other.lrreasegurodetid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrreasegurodet[ lrreasegurodetid=" + lrreasegurodetid + " ]";
    }
    
}
