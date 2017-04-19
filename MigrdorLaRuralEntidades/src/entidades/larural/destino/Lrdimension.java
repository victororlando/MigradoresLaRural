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
@Table(name = "LRDIMENSION")
@NamedQueries({
    @NamedQuery(name = "Lrdimension.findAll", query = "SELECT l FROM Lrdimension l"),
    @NamedQuery(name = "Lrdimension.findByLrdimensionid", query = "SELECT l FROM Lrdimension l WHERE l.lrdimensionid = :lrdimensionid"),
    @NamedQuery(name = "Lrdimension.findByLrdimensiontipocampo", query = "SELECT l FROM Lrdimension l WHERE l.lrdimensiontipocampo = :lrdimensiontipocampo"),
    @NamedQuery(name = "Lrdimension.findByLrdimensionvista", query = "SELECT l FROM Lrdimension l WHERE l.lrdimensionvista = :lrdimensionvista"),
    @NamedQuery(name = "Lrdimension.findByLrdimensioncampo", query = "SELECT l FROM Lrdimension l WHERE l.lrdimensioncampo = :lrdimensioncampo"),
    @NamedQuery(name = "Lrdimension.findByLrdimensionpuntua", query = "SELECT l FROM Lrdimension l WHERE l.lrdimensionpuntua = :lrdimensionpuntua"),
    @NamedQuery(name = "Lrdimension.findByLrdimensionpuntfijo", query = "SELECT l FROM Lrdimension l WHERE l.lrdimensionpuntfijo = :lrdimensionpuntfijo"),
    @NamedQuery(name = "Lrdimension.findByLrdimensionpuntaje", query = "SELECT l FROM Lrdimension l WHERE l.lrdimensionpuntaje = :lrdimensionpuntaje"),
    @NamedQuery(name = "Lrdimension.findByLrdimensionfuncion", query = "SELECT l FROM Lrdimension l WHERE l.lrdimensionfuncion = :lrdimensionfuncion"),
    @NamedQuery(name = "Lrdimension.findByLrdimensionorden", query = "SELECT l FROM Lrdimension l WHERE l.lrdimensionorden = :lrdimensionorden"),
    @NamedQuery(name = "Lrdimension.findByLrdimensionnivel", query = "SELECT l FROM Lrdimension l WHERE l.lrdimensionnivel = :lrdimensionnivel"),
    @NamedQuery(name = "Lrdimension.findByLrdimensionac", query = "SELECT l FROM Lrdimension l WHERE l.lrdimensionac = :lrdimensionac"),
    @NamedQuery(name = "Lrdimension.findByLrdimensionual", query = "SELECT l FROM Lrdimension l WHERE l.lrdimensionual = :lrdimensionual"),
    @NamedQuery(name = "Lrdimension.findByLrdimensionfal", query = "SELECT l FROM Lrdimension l WHERE l.lrdimensionfal = :lrdimensionfal"),
    @NamedQuery(name = "Lrdimension.findByLrdimensionumd", query = "SELECT l FROM Lrdimension l WHERE l.lrdimensionumd = :lrdimensionumd"),
    @NamedQuery(name = "Lrdimension.findByLrdimensionfmd", query = "SELECT l FROM Lrdimension l WHERE l.lrdimensionfmd = :lrdimensionfmd"),
    @NamedQuery(name = "Lrdimension.findByLrdimensionalerta", query = "SELECT l FROM Lrdimension l WHERE l.lrdimensionalerta = :lrdimensionalerta"),
    @NamedQuery(name = "Lrdimension.findByLrdimensionagregalinea", query = "SELECT l FROM Lrdimension l WHERE l.lrdimensionagregalinea = :lrdimensionagregalinea"),
    @NamedQuery(name = "Lrdimension.findByLrdimensioncantidad", query = "SELECT l FROM Lrdimension l WHERE l.lrdimensioncantidad = :lrdimensioncantidad"),
    @NamedQuery(name = "Lrdimension.findByLrdimensionseleccionunica", query = "SELECT l FROM Lrdimension l WHERE l.lrdimensionseleccionunica = :lrdimensionseleccionunica")})
public class Lrdimension implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONID", nullable = false)
    private Long lrdimensionid;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONTIPOCAMPO", nullable = false, length = 20)
    private String lrdimensiontipocampo;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONVISTA", nullable = false, length = 30)
    private String lrdimensionvista;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONCAMPO", nullable = false, length = 30)
    private String lrdimensioncampo;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONPUNTUA", nullable = false)
    private Character lrdimensionpuntua;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONPUNTFIJO", nullable = false)
    private Character lrdimensionpuntfijo;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONPUNTAJE", nullable = false)
    private short lrdimensionpuntaje;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONFUNCION", nullable = false, length = 60)
    private String lrdimensionfuncion;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONORDEN", nullable = false)
    private int lrdimensionorden;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONNIVEL", nullable = false)
    private int lrdimensionnivel;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONAC", nullable = false)
    private Character lrdimensionac;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONUAL", nullable = false, length = 30)
    private String lrdimensionual;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrdimensionfal;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONUMD", nullable = false, length = 30)
    private String lrdimensionumd;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrdimensionfmd;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONALERTA", nullable = false)
    private Character lrdimensionalerta;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONAGREGALINEA", nullable = false)
    private Character lrdimensionagregalinea;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONCANTIDAD", nullable = false)
    private short lrdimensioncantidad;
    @Basic(optional = false)
    @Column(name = "LRDIMENSIONSELECCIONUNICA", nullable = false)
    private Character lrdimensionseleccionunica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrdimensionid")
    private List<Lrdimensionsumaseg> lrdimensionsumasegList;
    @JoinColumn(name = "LRAGRUPAFORMULARIOID", referencedColumnName = "LRAGRUPAFORMULARIOID", nullable = false)
    @ManyToOne(optional = false)
    private Lragrupaformulario lragrupaformularioid;
    @JoinColumn(name = "LRAREAID", referencedColumnName = "LRAREAID", nullable = false)
    @ManyToOne(optional = false)
    private Lrarea lrareaid;
    @OneToMany(mappedBy = "lrdLrdimensionid")
    private List<Lrdimension> lrdimensionList;
    @JoinColumn(name = "LRD_LRDIMENSIONID", referencedColumnName = "LRDIMENSIONID")
    @ManyToOne
    private Lrdimension lrdLrdimensionid;
    @JoinColumn(name = "LRDIMENSIONITEMID", referencedColumnName = "LRDIMENSIONITEMID", nullable = false)
    @ManyToOne(optional = false)
    private Lrdimensionitem lrdimensionitemid;
    @JoinColumn(name = "LRSECCDETALLEID", referencedColumnName = "LRSECCDETALLEID", nullable = false)
    @ManyToOne(optional = false)
    private Lrseccdetalle lrseccdetalleid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrdimensionid")
    private List<Lrcotinspdet> lrcotinspdetList;

    public Lrdimension() {
    }

    public Lrdimension(Long lrdimensionid) {
        this.lrdimensionid = lrdimensionid;
    }

    public Lrdimension(Long lrdimensionid, String lrdimensiontipocampo, String lrdimensionvista, String lrdimensioncampo, Character lrdimensionpuntua, Character lrdimensionpuntfijo, short lrdimensionpuntaje, String lrdimensionfuncion, int lrdimensionorden, int lrdimensionnivel, Character lrdimensionac, String lrdimensionual, Date lrdimensionfal, String lrdimensionumd, Date lrdimensionfmd, Character lrdimensionalerta, Character lrdimensionagregalinea, short lrdimensioncantidad, Character lrdimensionseleccionunica) {
        this.lrdimensionid = lrdimensionid;
        this.lrdimensiontipocampo = lrdimensiontipocampo;
        this.lrdimensionvista = lrdimensionvista;
        this.lrdimensioncampo = lrdimensioncampo;
        this.lrdimensionpuntua = lrdimensionpuntua;
        this.lrdimensionpuntfijo = lrdimensionpuntfijo;
        this.lrdimensionpuntaje = lrdimensionpuntaje;
        this.lrdimensionfuncion = lrdimensionfuncion;
        this.lrdimensionorden = lrdimensionorden;
        this.lrdimensionnivel = lrdimensionnivel;
        this.lrdimensionac = lrdimensionac;
        this.lrdimensionual = lrdimensionual;
        this.lrdimensionfal = lrdimensionfal;
        this.lrdimensionumd = lrdimensionumd;
        this.lrdimensionfmd = lrdimensionfmd;
        this.lrdimensionalerta = lrdimensionalerta;
        this.lrdimensionagregalinea = lrdimensionagregalinea;
        this.lrdimensioncantidad = lrdimensioncantidad;
        this.lrdimensionseleccionunica = lrdimensionseleccionunica;
    }

    public Long getLrdimensionid() {
        return lrdimensionid;
    }

    public void setLrdimensionid(Long lrdimensionid) {
        this.lrdimensionid = lrdimensionid;
    }

    public String getLrdimensiontipocampo() {
        return lrdimensiontipocampo;
    }

    public void setLrdimensiontipocampo(String lrdimensiontipocampo) {
        this.lrdimensiontipocampo = lrdimensiontipocampo;
    }

    public String getLrdimensionvista() {
        return lrdimensionvista;
    }

    public void setLrdimensionvista(String lrdimensionvista) {
        this.lrdimensionvista = lrdimensionvista;
    }

    public String getLrdimensioncampo() {
        return lrdimensioncampo;
    }

    public void setLrdimensioncampo(String lrdimensioncampo) {
        this.lrdimensioncampo = lrdimensioncampo;
    }

    public Character getLrdimensionpuntua() {
        return lrdimensionpuntua;
    }

    public void setLrdimensionpuntua(Character lrdimensionpuntua) {
        this.lrdimensionpuntua = lrdimensionpuntua;
    }

    public Character getLrdimensionpuntfijo() {
        return lrdimensionpuntfijo;
    }

    public void setLrdimensionpuntfijo(Character lrdimensionpuntfijo) {
        this.lrdimensionpuntfijo = lrdimensionpuntfijo;
    }

    public short getLrdimensionpuntaje() {
        return lrdimensionpuntaje;
    }

    public void setLrdimensionpuntaje(short lrdimensionpuntaje) {
        this.lrdimensionpuntaje = lrdimensionpuntaje;
    }

    public String getLrdimensionfuncion() {
        return lrdimensionfuncion;
    }

    public void setLrdimensionfuncion(String lrdimensionfuncion) {
        this.lrdimensionfuncion = lrdimensionfuncion;
    }

    public int getLrdimensionorden() {
        return lrdimensionorden;
    }

    public void setLrdimensionorden(int lrdimensionorden) {
        this.lrdimensionorden = lrdimensionorden;
    }

    public int getLrdimensionnivel() {
        return lrdimensionnivel;
    }

    public void setLrdimensionnivel(int lrdimensionnivel) {
        this.lrdimensionnivel = lrdimensionnivel;
    }

    public Character getLrdimensionac() {
        return lrdimensionac;
    }

    public void setLrdimensionac(Character lrdimensionac) {
        this.lrdimensionac = lrdimensionac;
    }

    public String getLrdimensionual() {
        return lrdimensionual;
    }

    public void setLrdimensionual(String lrdimensionual) {
        this.lrdimensionual = lrdimensionual;
    }

    public Date getLrdimensionfal() {
        return lrdimensionfal;
    }

    public void setLrdimensionfal(Date lrdimensionfal) {
        this.lrdimensionfal = lrdimensionfal;
    }

    public String getLrdimensionumd() {
        return lrdimensionumd;
    }

    public void setLrdimensionumd(String lrdimensionumd) {
        this.lrdimensionumd = lrdimensionumd;
    }

    public Date getLrdimensionfmd() {
        return lrdimensionfmd;
    }

    public void setLrdimensionfmd(Date lrdimensionfmd) {
        this.lrdimensionfmd = lrdimensionfmd;
    }

    public Character getLrdimensionalerta() {
        return lrdimensionalerta;
    }

    public void setLrdimensionalerta(Character lrdimensionalerta) {
        this.lrdimensionalerta = lrdimensionalerta;
    }

    public Character getLrdimensionagregalinea() {
        return lrdimensionagregalinea;
    }

    public void setLrdimensionagregalinea(Character lrdimensionagregalinea) {
        this.lrdimensionagregalinea = lrdimensionagregalinea;
    }

    public short getLrdimensioncantidad() {
        return lrdimensioncantidad;
    }

    public void setLrdimensioncantidad(short lrdimensioncantidad) {
        this.lrdimensioncantidad = lrdimensioncantidad;
    }

    public Character getLrdimensionseleccionunica() {
        return lrdimensionseleccionunica;
    }

    public void setLrdimensionseleccionunica(Character lrdimensionseleccionunica) {
        this.lrdimensionseleccionunica = lrdimensionseleccionunica;
    }

    public List<Lrdimensionsumaseg> getLrdimensionsumasegList() {
        return lrdimensionsumasegList;
    }

    public void setLrdimensionsumasegList(List<Lrdimensionsumaseg> lrdimensionsumasegList) {
        this.lrdimensionsumasegList = lrdimensionsumasegList;
    }

    public Lragrupaformulario getLragrupaformularioid() {
        return lragrupaformularioid;
    }

    public void setLragrupaformularioid(Lragrupaformulario lragrupaformularioid) {
        this.lragrupaformularioid = lragrupaformularioid;
    }

    public Lrarea getLrareaid() {
        return lrareaid;
    }

    public void setLrareaid(Lrarea lrareaid) {
        this.lrareaid = lrareaid;
    }

    public List<Lrdimension> getLrdimensionList() {
        return lrdimensionList;
    }

    public void setLrdimensionList(List<Lrdimension> lrdimensionList) {
        this.lrdimensionList = lrdimensionList;
    }

    public Lrdimension getLrdLrdimensionid() {
        return lrdLrdimensionid;
    }

    public void setLrdLrdimensionid(Lrdimension lrdLrdimensionid) {
        this.lrdLrdimensionid = lrdLrdimensionid;
    }

    public Lrdimensionitem getLrdimensionitemid() {
        return lrdimensionitemid;
    }

    public void setLrdimensionitemid(Lrdimensionitem lrdimensionitemid) {
        this.lrdimensionitemid = lrdimensionitemid;
    }

    public Lrseccdetalle getLrseccdetalleid() {
        return lrseccdetalleid;
    }

    public void setLrseccdetalleid(Lrseccdetalle lrseccdetalleid) {
        this.lrseccdetalleid = lrseccdetalleid;
    }

    public List<Lrcotinspdet> getLrcotinspdetList() {
        return lrcotinspdetList;
    }

    public void setLrcotinspdetList(List<Lrcotinspdet> lrcotinspdetList) {
        this.lrcotinspdetList = lrcotinspdetList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrdimensionid != null ? lrdimensionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrdimension)) {
            return false;
        }
        Lrdimension other = (Lrdimension) object;
        if ((this.lrdimensionid == null && other.lrdimensionid != null) || (this.lrdimensionid != null && !this.lrdimensionid.equals(other.lrdimensionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrdimension[ lrdimensionid=" + lrdimensionid + " ]";
    }
    
}
