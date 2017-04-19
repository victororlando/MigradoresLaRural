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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "LRCAJASFUERTES")
@NamedQueries({
    @NamedQuery(name = "Lrcajasfuertes.findAll", query = "SELECT l FROM Lrcajasfuertes l"),
    @NamedQuery(name = "Lrcajasfuertes.findByLrcajasfuertesid", query = "SELECT l FROM Lrcajasfuertes l WHERE l.lrcajasfuertesid = :lrcajasfuertesid"),
    @NamedQuery(name = "Lrcajasfuertes.findByLrcajasfuertesmarca", query = "SELECT l FROM Lrcajasfuertes l WHERE l.lrcajasfuertesmarca = :lrcajasfuertesmarca"),
    @NamedQuery(name = "Lrcajasfuertes.findByLrcajasfuertesmodelo", query = "SELECT l FROM Lrcajasfuertes l WHERE l.lrcajasfuertesmodelo = :lrcajasfuertesmodelo"),
    @NamedQuery(name = "Lrcajasfuertes.findByLrcajasfuertesvalor", query = "SELECT l FROM Lrcajasfuertes l WHERE l.lrcajasfuertesvalor = :lrcajasfuertesvalor"),
    @NamedQuery(name = "Lrcajasfuertes.findByLrcajasfuertesalto", query = "SELECT l FROM Lrcajasfuertes l WHERE l.lrcajasfuertesalto = :lrcajasfuertesalto"),
    @NamedQuery(name = "Lrcajasfuertes.findByLrcajasfuertesancho", query = "SELECT l FROM Lrcajasfuertes l WHERE l.lrcajasfuertesancho = :lrcajasfuertesancho"),
    @NamedQuery(name = "Lrcajasfuertes.findByLrcajasfuertesfondo", query = "SELECT l FROM Lrcajasfuertes l WHERE l.lrcajasfuertesfondo = :lrcajasfuertesfondo"),
    @NamedQuery(name = "Lrcajasfuertes.findByLrcajasfuertesespesor", query = "SELECT l FROM Lrcajasfuertes l WHERE l.lrcajasfuertesespesor = :lrcajasfuertesespesor"),
    @NamedQuery(name = "Lrcajasfuertes.findByLrcajasfuertesvacio", query = "SELECT l FROM Lrcajasfuertes l WHERE l.lrcajasfuertesvacio = :lrcajasfuertesvacio"),
    @NamedQuery(name = "Lrcajasfuertes.findByLrcajasfuertestipocombi", query = "SELECT l FROM Lrcajasfuertes l WHERE l.lrcajasfuertestipocombi = :lrcajasfuertestipocombi"),
    @NamedQuery(name = "Lrcajasfuertes.findByLrcajasfuertesubicacion", query = "SELECT l FROM Lrcajasfuertes l WHERE l.lrcajasfuertesubicacion = :lrcajasfuertesubicacion"),
    @NamedQuery(name = "Lrcajasfuertes.findByLrcajasfuertesformaubic", query = "SELECT l FROM Lrcajasfuertes l WHERE l.lrcajasfuertesformaubic = :lrcajasfuertesformaubic"),
    @NamedQuery(name = "Lrcajasfuertes.findByLrcajasfuertessumaasegurada", query = "SELECT l FROM Lrcajasfuertes l WHERE l.lrcajasfuertessumaasegurada = :lrcajasfuertessumaasegurada"),
    @NamedQuery(name = "Lrcajasfuertes.findByLrcajasfuertesual", query = "SELECT l FROM Lrcajasfuertes l WHERE l.lrcajasfuertesual = :lrcajasfuertesual"),
    @NamedQuery(name = "Lrcajasfuertes.findByLrcajasfuertesfal", query = "SELECT l FROM Lrcajasfuertes l WHERE l.lrcajasfuertesfal = :lrcajasfuertesfal"),
    @NamedQuery(name = "Lrcajasfuertes.findByLrcajasfuertesumd", query = "SELECT l FROM Lrcajasfuertes l WHERE l.lrcajasfuertesumd = :lrcajasfuertesumd"),
    @NamedQuery(name = "Lrcajasfuertes.findByLrcajasfuertesfmd", query = "SELECT l FROM Lrcajasfuertes l WHERE l.lrcajasfuertesfmd = :lrcajasfuertesfmd")})
public class Lrcajasfuertes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRCAJASFUERTESID", nullable = false)
    private Long lrcajasfuertesid;
    @Basic(optional = false)
    @Column(name = "LRCAJASFUERTESMARCA", nullable = false, length = 100)
    private String lrcajasfuertesmarca;
    @Basic(optional = false)
    @Column(name = "LRCAJASFUERTESMODELO", nullable = false, length = 100)
    private String lrcajasfuertesmodelo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRCAJASFUERTESVALOR", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcajasfuertesvalor;
    @Basic(optional = false)
    @Column(name = "LRCAJASFUERTESALTO", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcajasfuertesalto;
    @Basic(optional = false)
    @Column(name = "LRCAJASFUERTESANCHO", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcajasfuertesancho;
    @Basic(optional = false)
    @Column(name = "LRCAJASFUERTESFONDO", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcajasfuertesfondo;
    @Basic(optional = false)
    @Column(name = "LRCAJASFUERTESESPESOR", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcajasfuertesespesor;
    @Basic(optional = false)
    @Column(name = "LRCAJASFUERTESVACIO", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcajasfuertesvacio;
    @Basic(optional = false)
    @Column(name = "LRCAJASFUERTESTIPOCOMBI", nullable = false, length = 50)
    private String lrcajasfuertestipocombi;
    @Basic(optional = false)
    @Column(name = "LRCAJASFUERTESUBICACION", nullable = false, length = 100)
    private String lrcajasfuertesubicacion;
    @Basic(optional = false)
    @Column(name = "LRCAJASFUERTESFORMAUBIC", nullable = false, length = 100)
    private String lrcajasfuertesformaubic;
    @Basic(optional = false)
    @Column(name = "LRCAJASFUERTESSUMAASEGURADA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcajasfuertessumaasegurada;
    @Column(name = "LRCAJASFUERTESUAL", length = 30)
    private String lrcajasfuertesual;
    @Column(name = "LRCAJASFUERTESFAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcajasfuertesfal;
    @Column(name = "LRCAJASFUERTESUMD", length = 30)
    private String lrcajasfuertesumd;
    @Column(name = "LRCAJASFUERTESFMD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lrcajasfuertesfmd;
    @JoinColumns({
        @JoinColumn(name = "SCFCOTIDATBIENASEID", referencedColumnName = "LRCOTIDATBIENASEID", nullable = false),
        @JoinColumn(name = "SCFLRUBICACIONID", referencedColumnName = "LRUBICACIONID", nullable = false)})
    @ManyToOne(optional = false)
    private Lrcotidatbienase lrcotidatbienase;
    @OneToMany(mappedBy = "lrcajasfuertesid")
    private List<Lrpersonasautorizadas> lrpersonasautorizadasList;

    public Lrcajasfuertes() {
    }

    public Lrcajasfuertes(Long lrcajasfuertesid) {
        this.lrcajasfuertesid = lrcajasfuertesid;
    }

    public Lrcajasfuertes(Long lrcajasfuertesid, String lrcajasfuertesmarca, String lrcajasfuertesmodelo, BigDecimal lrcajasfuertesvalor, BigDecimal lrcajasfuertesalto, BigDecimal lrcajasfuertesancho, BigDecimal lrcajasfuertesfondo, BigDecimal lrcajasfuertesespesor, BigDecimal lrcajasfuertesvacio, String lrcajasfuertestipocombi, String lrcajasfuertesubicacion, String lrcajasfuertesformaubic, BigDecimal lrcajasfuertessumaasegurada) {
        this.lrcajasfuertesid = lrcajasfuertesid;
        this.lrcajasfuertesmarca = lrcajasfuertesmarca;
        this.lrcajasfuertesmodelo = lrcajasfuertesmodelo;
        this.lrcajasfuertesvalor = lrcajasfuertesvalor;
        this.lrcajasfuertesalto = lrcajasfuertesalto;
        this.lrcajasfuertesancho = lrcajasfuertesancho;
        this.lrcajasfuertesfondo = lrcajasfuertesfondo;
        this.lrcajasfuertesespesor = lrcajasfuertesespesor;
        this.lrcajasfuertesvacio = lrcajasfuertesvacio;
        this.lrcajasfuertestipocombi = lrcajasfuertestipocombi;
        this.lrcajasfuertesubicacion = lrcajasfuertesubicacion;
        this.lrcajasfuertesformaubic = lrcajasfuertesformaubic;
        this.lrcajasfuertessumaasegurada = lrcajasfuertessumaasegurada;
    }

    public Long getLrcajasfuertesid() {
        return lrcajasfuertesid;
    }

    public void setLrcajasfuertesid(Long lrcajasfuertesid) {
        this.lrcajasfuertesid = lrcajasfuertesid;
    }

    public String getLrcajasfuertesmarca() {
        return lrcajasfuertesmarca;
    }

    public void setLrcajasfuertesmarca(String lrcajasfuertesmarca) {
        this.lrcajasfuertesmarca = lrcajasfuertesmarca;
    }

    public String getLrcajasfuertesmodelo() {
        return lrcajasfuertesmodelo;
    }

    public void setLrcajasfuertesmodelo(String lrcajasfuertesmodelo) {
        this.lrcajasfuertesmodelo = lrcajasfuertesmodelo;
    }

    public BigDecimal getLrcajasfuertesvalor() {
        return lrcajasfuertesvalor;
    }

    public void setLrcajasfuertesvalor(BigDecimal lrcajasfuertesvalor) {
        this.lrcajasfuertesvalor = lrcajasfuertesvalor;
    }

    public BigDecimal getLrcajasfuertesalto() {
        return lrcajasfuertesalto;
    }

    public void setLrcajasfuertesalto(BigDecimal lrcajasfuertesalto) {
        this.lrcajasfuertesalto = lrcajasfuertesalto;
    }

    public BigDecimal getLrcajasfuertesancho() {
        return lrcajasfuertesancho;
    }

    public void setLrcajasfuertesancho(BigDecimal lrcajasfuertesancho) {
        this.lrcajasfuertesancho = lrcajasfuertesancho;
    }

    public BigDecimal getLrcajasfuertesfondo() {
        return lrcajasfuertesfondo;
    }

    public void setLrcajasfuertesfondo(BigDecimal lrcajasfuertesfondo) {
        this.lrcajasfuertesfondo = lrcajasfuertesfondo;
    }

    public BigDecimal getLrcajasfuertesespesor() {
        return lrcajasfuertesespesor;
    }

    public void setLrcajasfuertesespesor(BigDecimal lrcajasfuertesespesor) {
        this.lrcajasfuertesespesor = lrcajasfuertesespesor;
    }

    public BigDecimal getLrcajasfuertesvacio() {
        return lrcajasfuertesvacio;
    }

    public void setLrcajasfuertesvacio(BigDecimal lrcajasfuertesvacio) {
        this.lrcajasfuertesvacio = lrcajasfuertesvacio;
    }

    public String getLrcajasfuertestipocombi() {
        return lrcajasfuertestipocombi;
    }

    public void setLrcajasfuertestipocombi(String lrcajasfuertestipocombi) {
        this.lrcajasfuertestipocombi = lrcajasfuertestipocombi;
    }

    public String getLrcajasfuertesubicacion() {
        return lrcajasfuertesubicacion;
    }

    public void setLrcajasfuertesubicacion(String lrcajasfuertesubicacion) {
        this.lrcajasfuertesubicacion = lrcajasfuertesubicacion;
    }

    public String getLrcajasfuertesformaubic() {
        return lrcajasfuertesformaubic;
    }

    public void setLrcajasfuertesformaubic(String lrcajasfuertesformaubic) {
        this.lrcajasfuertesformaubic = lrcajasfuertesformaubic;
    }

    public BigDecimal getLrcajasfuertessumaasegurada() {
        return lrcajasfuertessumaasegurada;
    }

    public void setLrcajasfuertessumaasegurada(BigDecimal lrcajasfuertessumaasegurada) {
        this.lrcajasfuertessumaasegurada = lrcajasfuertessumaasegurada;
    }

    public String getLrcajasfuertesual() {
        return lrcajasfuertesual;
    }

    public void setLrcajasfuertesual(String lrcajasfuertesual) {
        this.lrcajasfuertesual = lrcajasfuertesual;
    }

    public Date getLrcajasfuertesfal() {
        return lrcajasfuertesfal;
    }

    public void setLrcajasfuertesfal(Date lrcajasfuertesfal) {
        this.lrcajasfuertesfal = lrcajasfuertesfal;
    }

    public String getLrcajasfuertesumd() {
        return lrcajasfuertesumd;
    }

    public void setLrcajasfuertesumd(String lrcajasfuertesumd) {
        this.lrcajasfuertesumd = lrcajasfuertesumd;
    }

    public Date getLrcajasfuertesfmd() {
        return lrcajasfuertesfmd;
    }

    public void setLrcajasfuertesfmd(Date lrcajasfuertesfmd) {
        this.lrcajasfuertesfmd = lrcajasfuertesfmd;
    }

    public Lrcotidatbienase getLrcotidatbienase() {
        return lrcotidatbienase;
    }

    public void setLrcotidatbienase(Lrcotidatbienase lrcotidatbienase) {
        this.lrcotidatbienase = lrcotidatbienase;
    }

    public List<Lrpersonasautorizadas> getLrpersonasautorizadasList() {
        return lrpersonasautorizadasList;
    }

    public void setLrpersonasautorizadasList(List<Lrpersonasautorizadas> lrpersonasautorizadasList) {
        this.lrpersonasautorizadasList = lrpersonasautorizadasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcajasfuertesid != null ? lrcajasfuertesid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcajasfuertes)) {
            return false;
        }
        Lrcajasfuertes other = (Lrcajasfuertes) object;
        if ((this.lrcajasfuertesid == null && other.lrcajasfuertesid != null) || (this.lrcajasfuertesid != null && !this.lrcajasfuertesid.equals(other.lrcajasfuertesid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcajasfuertes[ lrcajasfuertesid=" + lrcajasfuertesid + " ]";
    }
    
}
