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
@Table(name = "LRSECCDETALLE")
@NamedQueries({
    @NamedQuery(name = "Lrseccdetalle.findAll", query = "SELECT l FROM Lrseccdetalle l"),
    @NamedQuery(name = "Lrseccdetalle.findByLrseccdetalleid", query = "SELECT l FROM Lrseccdetalle l WHERE l.lrseccdetalleid = :lrseccdetalleid"),
    @NamedQuery(name = "Lrseccdetalle.findByLrseccdetallemodid", query = "SELECT l FROM Lrseccdetalle l WHERE l.lrseccdetallemodid = :lrseccdetallemodid"),
    @NamedQuery(name = "Lrseccdetalle.findByLrseccdetallenom", query = "SELECT l FROM Lrseccdetalle l WHERE l.lrseccdetallenom = :lrseccdetallenom"),
    @NamedQuery(name = "Lrseccdetalle.findByLrseccdetallehab", query = "SELECT l FROM Lrseccdetalle l WHERE l.lrseccdetallehab = :lrseccdetallehab"),
    @NamedQuery(name = "Lrseccdetalle.findByLrseccdetalleual", query = "SELECT l FROM Lrseccdetalle l WHERE l.lrseccdetalleual = :lrseccdetalleual"),
    @NamedQuery(name = "Lrseccdetalle.findByLrseccdetallefal", query = "SELECT l FROM Lrseccdetalle l WHERE l.lrseccdetallefal = :lrseccdetallefal"),
    @NamedQuery(name = "Lrseccdetalle.findByLrseccdetalleumd", query = "SELECT l FROM Lrseccdetalle l WHERE l.lrseccdetalleumd = :lrseccdetalleumd"),
    @NamedQuery(name = "Lrseccdetalle.findByLrseccdetallefmd", query = "SELECT l FROM Lrseccdetalle l WHERE l.lrseccdetallefmd = :lrseccdetallefmd")})
public class Lrseccdetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRSECCDETALLEID", nullable = false)
    private Long lrseccdetalleid;
    @Basic(optional = false)
    @Column(name = "LRSECCDETALLEMODID", nullable = false)
    private short lrseccdetallemodid;
    @Basic(optional = false)
    @Column(name = "LRSECCDETALLENOM", nullable = false, length = 100)
    private String lrseccdetallenom;
    @Basic(optional = false)
    @Column(name = "LRSECCDETALLEHAB", nullable = false)
    private Character lrseccdetallehab;
    @Basic(optional = false)
    @Column(name = "LRSECCDETALLEUAL", nullable = false, length = 30)
    private String lrseccdetalleual;
    @Basic(optional = false)
    @Column(name = "LRSECCDETALLEFAL", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrseccdetallefal;
    @Basic(optional = false)
    @Column(name = "LRSECCDETALLEUMD", nullable = false, length = 30)
    private String lrseccdetalleumd;
    @Basic(optional = false)
    @Column(name = "LRSECCDETALLEFMD", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrseccdetallefmd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrseccdetalleid")
    private List<Lrprimamincaucion> lrprimamincaucionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrseccdetalleid")
    private List<Lrtasamodalidad> lrtasamodalidadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrafseccdetalleid")
    private List<Lragrupaformulario> lragrupaformularioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrseccdetalle")
    private List<Lrparmaccduracion> lrparmaccduracionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dsaLrseccdetalleid")
    private List<Lrdimensionsumaseg> lrdimensionsumasegList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrseccdetalleid")
    private List<Lrtasaporrango> lrtasaporrangoList;
    @JoinColumn(name = "LRSECCIONID", referencedColumnName = "LRSECCIONID", nullable = false)
    @ManyToOne(optional = false)
    private Lrseccion lrseccionid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrseccdetalleid")
    private List<Lrperiodocorto> lrperiodocortoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrseccdetalleid")
    private List<Lrcotizacion> lrcotizacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrseccdetalleid")
    private List<Lrdimension> lrdimensionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrseccdetalle")
    private List<Lrflujoreglas> lrflujoreglasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrseccdetalleid")
    private List<Lrfichaclienteotraspol> lrfichaclienteotraspolList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrseccdetalle")
    private List<Lrpuntuaciondefinitiva> lrpuntuaciondefinitivaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrseccdetalle")
    private List<Lrparmcotiplansecc> lrparmcotiplanseccList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrseccdetalleid")
    private List<Lrfichaclientesincaucion> lrfichaclientesincaucionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrseccdetalleid")
    private List<Lrflujopantalla> lrflujopantallaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrseccdetalleid")
    private List<Lrcontrolreamisc> lrcontrolreamiscList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrseccdetalle")
    private List<Lrmatrizpuntaje> lrmatrizpuntajeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrseccdetalleid")
    private List<Lrfichaclienteprimcaucion> lrfichaclienteprimcaucionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrseccdetalleid")
    private List<Lrprimaminmonto> lrprimaminmontoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrseccdetalle")
    private List<Lrtasarubroriesgo> lrtasarubroriesgoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrseccdetalleid")
    private List<Lrtasapersonaperiodo> lrtasapersonaperiodoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrseccdetalleid")
    private List<Lrseccformulario> lrseccformularioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lrseccdetalleid")
    private List<Lrlimitecontrato> lrlimitecontratoList;

    public Lrseccdetalle() {
    }

    public Lrseccdetalle(Long lrseccdetalleid) {
        this.lrseccdetalleid = lrseccdetalleid;
    }

    public Lrseccdetalle(Long lrseccdetalleid, short lrseccdetallemodid, String lrseccdetallenom, Character lrseccdetallehab, String lrseccdetalleual, Date lrseccdetallefal, String lrseccdetalleumd, Date lrseccdetallefmd) {
        this.lrseccdetalleid = lrseccdetalleid;
        this.lrseccdetallemodid = lrseccdetallemodid;
        this.lrseccdetallenom = lrseccdetallenom;
        this.lrseccdetallehab = lrseccdetallehab;
        this.lrseccdetalleual = lrseccdetalleual;
        this.lrseccdetallefal = lrseccdetallefal;
        this.lrseccdetalleumd = lrseccdetalleumd;
        this.lrseccdetallefmd = lrseccdetallefmd;
    }

    public Long getLrseccdetalleid() {
        return lrseccdetalleid;
    }

    public void setLrseccdetalleid(Long lrseccdetalleid) {
        this.lrseccdetalleid = lrseccdetalleid;
    }

    public short getLrseccdetallemodid() {
        return lrseccdetallemodid;
    }

    public void setLrseccdetallemodid(short lrseccdetallemodid) {
        this.lrseccdetallemodid = lrseccdetallemodid;
    }

    public String getLrseccdetallenom() {
        return lrseccdetallenom;
    }

    public void setLrseccdetallenom(String lrseccdetallenom) {
        this.lrseccdetallenom = lrseccdetallenom;
    }

    public Character getLrseccdetallehab() {
        return lrseccdetallehab;
    }

    public void setLrseccdetallehab(Character lrseccdetallehab) {
        this.lrseccdetallehab = lrseccdetallehab;
    }

    public String getLrseccdetalleual() {
        return lrseccdetalleual;
    }

    public void setLrseccdetalleual(String lrseccdetalleual) {
        this.lrseccdetalleual = lrseccdetalleual;
    }

    public Date getLrseccdetallefal() {
        return lrseccdetallefal;
    }

    public void setLrseccdetallefal(Date lrseccdetallefal) {
        this.lrseccdetallefal = lrseccdetallefal;
    }

    public String getLrseccdetalleumd() {
        return lrseccdetalleumd;
    }

    public void setLrseccdetalleumd(String lrseccdetalleumd) {
        this.lrseccdetalleumd = lrseccdetalleumd;
    }

    public Date getLrseccdetallefmd() {
        return lrseccdetallefmd;
    }

    public void setLrseccdetallefmd(Date lrseccdetallefmd) {
        this.lrseccdetallefmd = lrseccdetallefmd;
    }

    public List<Lrprimamincaucion> getLrprimamincaucionList() {
        return lrprimamincaucionList;
    }

    public void setLrprimamincaucionList(List<Lrprimamincaucion> lrprimamincaucionList) {
        this.lrprimamincaucionList = lrprimamincaucionList;
    }

    public List<Lrtasamodalidad> getLrtasamodalidadList() {
        return lrtasamodalidadList;
    }

    public void setLrtasamodalidadList(List<Lrtasamodalidad> lrtasamodalidadList) {
        this.lrtasamodalidadList = lrtasamodalidadList;
    }

    public List<Lragrupaformulario> getLragrupaformularioList() {
        return lragrupaformularioList;
    }

    public void setLragrupaformularioList(List<Lragrupaformulario> lragrupaformularioList) {
        this.lragrupaformularioList = lragrupaformularioList;
    }

    public List<Lrparmaccduracion> getLrparmaccduracionList() {
        return lrparmaccduracionList;
    }

    public void setLrparmaccduracionList(List<Lrparmaccduracion> lrparmaccduracionList) {
        this.lrparmaccduracionList = lrparmaccduracionList;
    }

    public List<Lrdimensionsumaseg> getLrdimensionsumasegList() {
        return lrdimensionsumasegList;
    }

    public void setLrdimensionsumasegList(List<Lrdimensionsumaseg> lrdimensionsumasegList) {
        this.lrdimensionsumasegList = lrdimensionsumasegList;
    }

    public List<Lrtasaporrango> getLrtasaporrangoList() {
        return lrtasaporrangoList;
    }

    public void setLrtasaporrangoList(List<Lrtasaporrango> lrtasaporrangoList) {
        this.lrtasaporrangoList = lrtasaporrangoList;
    }

    public Lrseccion getLrseccionid() {
        return lrseccionid;
    }

    public void setLrseccionid(Lrseccion lrseccionid) {
        this.lrseccionid = lrseccionid;
    }

    public List<Lrperiodocorto> getLrperiodocortoList() {
        return lrperiodocortoList;
    }

    public void setLrperiodocortoList(List<Lrperiodocorto> lrperiodocortoList) {
        this.lrperiodocortoList = lrperiodocortoList;
    }

    public List<Lrcotizacion> getLrcotizacionList() {
        return lrcotizacionList;
    }

    public void setLrcotizacionList(List<Lrcotizacion> lrcotizacionList) {
        this.lrcotizacionList = lrcotizacionList;
    }

    public List<Lrdimension> getLrdimensionList() {
        return lrdimensionList;
    }

    public void setLrdimensionList(List<Lrdimension> lrdimensionList) {
        this.lrdimensionList = lrdimensionList;
    }

    public List<Lrflujoreglas> getLrflujoreglasList() {
        return lrflujoreglasList;
    }

    public void setLrflujoreglasList(List<Lrflujoreglas> lrflujoreglasList) {
        this.lrflujoreglasList = lrflujoreglasList;
    }

    public List<Lrfichaclienteotraspol> getLrfichaclienteotraspolList() {
        return lrfichaclienteotraspolList;
    }

    public void setLrfichaclienteotraspolList(List<Lrfichaclienteotraspol> lrfichaclienteotraspolList) {
        this.lrfichaclienteotraspolList = lrfichaclienteotraspolList;
    }

    public List<Lrpuntuaciondefinitiva> getLrpuntuaciondefinitivaList() {
        return lrpuntuaciondefinitivaList;
    }

    public void setLrpuntuaciondefinitivaList(List<Lrpuntuaciondefinitiva> lrpuntuaciondefinitivaList) {
        this.lrpuntuaciondefinitivaList = lrpuntuaciondefinitivaList;
    }

    public List<Lrparmcotiplansecc> getLrparmcotiplanseccList() {
        return lrparmcotiplanseccList;
    }

    public void setLrparmcotiplanseccList(List<Lrparmcotiplansecc> lrparmcotiplanseccList) {
        this.lrparmcotiplanseccList = lrparmcotiplanseccList;
    }

    public List<Lrfichaclientesincaucion> getLrfichaclientesincaucionList() {
        return lrfichaclientesincaucionList;
    }

    public void setLrfichaclientesincaucionList(List<Lrfichaclientesincaucion> lrfichaclientesincaucionList) {
        this.lrfichaclientesincaucionList = lrfichaclientesincaucionList;
    }

    public List<Lrflujopantalla> getLrflujopantallaList() {
        return lrflujopantallaList;
    }

    public void setLrflujopantallaList(List<Lrflujopantalla> lrflujopantallaList) {
        this.lrflujopantallaList = lrflujopantallaList;
    }

    public List<Lrcontrolreamisc> getLrcontrolreamiscList() {
        return lrcontrolreamiscList;
    }

    public void setLrcontrolreamiscList(List<Lrcontrolreamisc> lrcontrolreamiscList) {
        this.lrcontrolreamiscList = lrcontrolreamiscList;
    }

    public List<Lrmatrizpuntaje> getLrmatrizpuntajeList() {
        return lrmatrizpuntajeList;
    }

    public void setLrmatrizpuntajeList(List<Lrmatrizpuntaje> lrmatrizpuntajeList) {
        this.lrmatrizpuntajeList = lrmatrizpuntajeList;
    }

    public List<Lrfichaclienteprimcaucion> getLrfichaclienteprimcaucionList() {
        return lrfichaclienteprimcaucionList;
    }

    public void setLrfichaclienteprimcaucionList(List<Lrfichaclienteprimcaucion> lrfichaclienteprimcaucionList) {
        this.lrfichaclienteprimcaucionList = lrfichaclienteprimcaucionList;
    }

    public List<Lrprimaminmonto> getLrprimaminmontoList() {
        return lrprimaminmontoList;
    }

    public void setLrprimaminmontoList(List<Lrprimaminmonto> lrprimaminmontoList) {
        this.lrprimaminmontoList = lrprimaminmontoList;
    }

    public List<Lrtasarubroriesgo> getLrtasarubroriesgoList() {
        return lrtasarubroriesgoList;
    }

    public void setLrtasarubroriesgoList(List<Lrtasarubroriesgo> lrtasarubroriesgoList) {
        this.lrtasarubroriesgoList = lrtasarubroriesgoList;
    }

    public List<Lrtasapersonaperiodo> getLrtasapersonaperiodoList() {
        return lrtasapersonaperiodoList;
    }

    public void setLrtasapersonaperiodoList(List<Lrtasapersonaperiodo> lrtasapersonaperiodoList) {
        this.lrtasapersonaperiodoList = lrtasapersonaperiodoList;
    }

    public List<Lrseccformulario> getLrseccformularioList() {
        return lrseccformularioList;
    }

    public void setLrseccformularioList(List<Lrseccformulario> lrseccformularioList) {
        this.lrseccformularioList = lrseccformularioList;
    }

    public List<Lrlimitecontrato> getLrlimitecontratoList() {
        return lrlimitecontratoList;
    }

    public void setLrlimitecontratoList(List<Lrlimitecontrato> lrlimitecontratoList) {
        this.lrlimitecontratoList = lrlimitecontratoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrseccdetalleid != null ? lrseccdetalleid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrseccdetalle)) {
            return false;
        }
        Lrseccdetalle other = (Lrseccdetalle) object;
        if ((this.lrseccdetalleid == null && other.lrseccdetalleid != null) || (this.lrseccdetalleid != null && !this.lrseccdetalleid.equals(other.lrseccdetalleid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrseccdetalle[ lrseccdetalleid=" + lrseccdetalleid + " ]";
    }
    
}
