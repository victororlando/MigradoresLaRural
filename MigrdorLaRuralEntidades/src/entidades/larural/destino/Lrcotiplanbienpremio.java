/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRCOTIPLANBIENPREMIO")
@NamedQueries({
    @NamedQuery(name = "Lrcotiplanbienpremio.findAll", query = "SELECT l FROM Lrcotiplanbienpremio l"),
    @NamedQuery(name = "Lrcotiplanbienpremio.findByLrtipopremioid", query = "SELECT l FROM Lrcotiplanbienpremio l WHERE l.lrcotiplanbienpremioPK.lrtipopremioid = :lrtipopremioid"),
    @NamedQuery(name = "Lrcotiplanbienpremio.findBySseccdetalleid", query = "SELECT l FROM Lrcotiplanbienpremio l WHERE l.lrcotiplanbienpremioPK.sseccdetalleid = :sseccdetalleid"),
    @NamedQuery(name = "Lrcotiplanbienpremio.findBySparmcotiplanid", query = "SELECT l FROM Lrcotiplanbienpremio l WHERE l.lrcotiplanbienpremioPK.sparmcotiplanid = :sparmcotiplanid"),
    @NamedQuery(name = "Lrcotiplanbienpremio.findByStipoplanid", query = "SELECT l FROM Lrcotiplanbienpremio l WHERE l.lrcotiplanbienpremioPK.stipoplanid = :stipoplanid"),
    @NamedQuery(name = "Lrcotiplanbienpremio.findByScotizacionversion", query = "SELECT l FROM Lrcotiplanbienpremio l WHERE l.lrcotiplanbienpremioPK.scotizacionversion = :scotizacionversion"),
    @NamedQuery(name = "Lrcotiplanbienpremio.findByLrcotizacionnro", query = "SELECT l FROM Lrcotiplanbienpremio l WHERE l.lrcotiplanbienpremioPK.lrcotizacionnro = :lrcotizacionnro"),
    @NamedQuery(name = "Lrcotiplanbienpremio.findByScotidatbienaseid", query = "SELECT l FROM Lrcotiplanbienpremio l WHERE l.lrcotiplanbienpremioPK.scotidatbienaseid = :scotidatbienaseid"),
    @NamedQuery(name = "Lrcotiplanbienpremio.findByLrcotiplanbienpremiomonto", query = "SELECT l FROM Lrcotiplanbienpremio l WHERE l.lrcotiplanbienpremiomonto = :lrcotiplanbienpremiomonto")})
public class Lrcotiplanbienpremio implements Serializable {
    @Column(name = "LRCOTIPLANBIENPREMIOMONTOPACK", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiomontopack;
    @Column(name = "LRCOTIPLANBIENPREMIOSUBTOTALCO", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiosubtotalco;
    @Column(name = "LRCOTIPLANBIENPREMIOTCLR", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiotclr;
    @Column(name = "LRCOTIPLANBIENPREMIOAJUSTETC", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremioajustetc;
    @Column(name = "LRCOTIPLANBIENPREMIODESCRPF", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiodescrpf;
    @Column(name = "LRCOTIPLANBIENPREMIORPF", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiorpf;
    @Column(name = "LRCOTIPLANBIENPREMIOIVA", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremioiva;
    @Column(name = "LRCOTIPLANBIENPREMIOTASACOMNET", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiotasacomnet;
    @Column(name = "LRCOTIPLANBIENPREMIOPRIMACOMNE", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremioprimacomne;
    @Column(name = "LRCOTIPLANBIENPREMIOBONIFICACI", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiobonificaci;
    @Column(name = "LRCOTIPLANBIENPREMIODESCCOM", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiodesccom;
    @Column(name = "LRCOTIPLANBIENPREMIORECCOM", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremioreccom;
    @Column(name = "LRCOTIPLANBIENPREMIOPRIMACOMBR", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremioprimacombr;
    @Column(name = "LRCOTIPLANBIENPREMIOGTOADM", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiogtoadm;
    @Column(name = "LRCOTIPLANBIENPREMIOOTROSGTOS", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiootrosgtos;
    @Column(name = "LRCOTIPLANBIENPREMIOCOMICEDIDA", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiocomicedida;
    @Column(name = "LRCOTIPLANBIENPREMIOCOMINEGOCI", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiocominegoci;
    @Column(name = "LRCOTIPLANBIENPREMIOCOMICONTRA", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiocomicontra;
    @Column(name = "LRCOTIPLANBIENPREMIOSUBTOTCOMI", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiosubtotcomi;
    @Column(name = "LRCOTIPLANBIENPREMIODESCCORP", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiodesccorp;
    @Column(name = "LRCOTIPLANBIENPREMIOTASATEC", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiotasatec;
    @Column(name = "LRCOTIPLANBIENPREMIOPRIMATECNE", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremioprimatecne;
    @Column(name = "LRCOTIPLANBIENPREMIODESCTEC", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiodesctec;
    @Column(name = "LRCOTIPLANBIENPREMIOMMU", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiommu;
    @Column(name = "LRCOTIPLANBIENPREMIOPRIMTECBRU", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremioprimtecbru;
    @Column(name = "LRCOTIPLANBIENPREMIORECCOA", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremioreccoa;
    @Column(name = "LRCOTIPLANBIENPREMIODESCCOA", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiodesccoa;
    @Column(name = "LRCOTIPLANBIENPREMIORECREA", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiorecrea;
    @Column(name = "LRCOTIPLANBIENPREMIODESCREA", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiodescrea;
    @Column(name = "LRCOTIPLANBIENPREMIORECMAT", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiorecmat;
    @Column(name = "LRCOTIPLANBIENPREMIODESCMAT", precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiodescmat;
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrcotiplanbienpremioPK lrcotiplanbienpremioPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRCOTIPLANBIENPREMIOMONTO", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrcotiplanbienpremiomonto;
    @JoinColumns({
        @JoinColumn(name = "SSECCDETALLEID", referencedColumnName = "SSECCDETALLEID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "SPARMCOTIPLANID", referencedColumnName = "SPARMCOTIPLANID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "STIPOPLANID", referencedColumnName = "STIPOPLANID", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "LRCOTIZACIONNRO", referencedColumnName = "LRCOTIZACIONNRO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "SCOTIZACIONVERSION", referencedColumnName = "SCOTIZACIONVERSION", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "SCOTIDATBIENASEID", referencedColumnName = "SCOTIDATBIENASEID", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Lrcotiplanbien lrcotiplanbien;
    @JoinColumn(name = "LRTIPOPREMIOID", referencedColumnName = "LRTIPOPREMIOID", nullable = false,insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lrtipopremio lrtipopremio;

    public Lrcotiplanbienpremio() {
    }

    public Lrcotiplanbienpremio(LrcotiplanbienpremioPK lrcotiplanbienpremioPK) {
        this.lrcotiplanbienpremioPK = lrcotiplanbienpremioPK;
    }

    public Lrcotiplanbienpremio(LrcotiplanbienpremioPK lrcotiplanbienpremioPK, BigDecimal lrcotiplanbienpremiomonto) {
        this.lrcotiplanbienpremioPK = lrcotiplanbienpremioPK;
        this.lrcotiplanbienpremiomonto = lrcotiplanbienpremiomonto;
    }

    public Lrcotiplanbienpremio(long lrtipopremioid, long sseccdetalleid, long sparmcotiplanid, long stipoplanid, long scotizacionversion, long lrcotizacionnro, long scotidatbienaseid) {
        this.lrcotiplanbienpremioPK = new LrcotiplanbienpremioPK(lrtipopremioid, sseccdetalleid, sparmcotiplanid, stipoplanid, scotizacionversion, lrcotizacionnro, scotidatbienaseid);
    }

    public LrcotiplanbienpremioPK getLrcotiplanbienpremioPK() {
        return lrcotiplanbienpremioPK;
    }

    public void setLrcotiplanbienpremioPK(LrcotiplanbienpremioPK lrcotiplanbienpremioPK) {
        this.lrcotiplanbienpremioPK = lrcotiplanbienpremioPK;
    }

    public BigDecimal getLrcotiplanbienpremiomonto() {
        return lrcotiplanbienpremiomonto;
    }

    public void setLrcotiplanbienpremiomonto(BigDecimal lrcotiplanbienpremiomonto) {
        this.lrcotiplanbienpremiomonto = lrcotiplanbienpremiomonto;
    }

    public Lrcotiplanbien getLrcotiplanbien() {
        return lrcotiplanbien;
    }

    public void setLrcotiplanbien(Lrcotiplanbien lrcotiplanbien) {
        this.lrcotiplanbien = lrcotiplanbien;
    }

    public Lrtipopremio getLrtipopremio() {
        return lrtipopremio;
    }

    public void setLrtipopremio(Lrtipopremio lrtipopremio) {
        this.lrtipopremio = lrtipopremio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrcotiplanbienpremioPK != null ? lrcotiplanbienpremioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrcotiplanbienpremio)) {
            return false;
        }
        Lrcotiplanbienpremio other = (Lrcotiplanbienpremio) object;
        if ((this.lrcotiplanbienpremioPK == null && other.lrcotiplanbienpremioPK != null) || (this.lrcotiplanbienpremioPK != null && !this.lrcotiplanbienpremioPK.equals(other.lrcotiplanbienpremioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrcotiplanbienpremio[ lrcotiplanbienpremioPK=" + lrcotiplanbienpremioPK + " ]";
    }

    public BigDecimal getLrcotiplanbienpremiomontopack() {
        return lrcotiplanbienpremiomontopack;
    }

    public void setLrcotiplanbienpremiomontopack(BigDecimal lrcotiplanbienpremiomontopack) {
        this.lrcotiplanbienpremiomontopack = lrcotiplanbienpremiomontopack;
    }

    public BigDecimal getLrcotiplanbienpremiosubtotalco() {
        return lrcotiplanbienpremiosubtotalco;
    }

    public void setLrcotiplanbienpremiosubtotalco(BigDecimal lrcotiplanbienpremiosubtotalco) {
        this.lrcotiplanbienpremiosubtotalco = lrcotiplanbienpremiosubtotalco;
    }

    public BigDecimal getLrcotiplanbienpremiotclr() {
        return lrcotiplanbienpremiotclr;
    }

    public void setLrcotiplanbienpremiotclr(BigDecimal lrcotiplanbienpremiotclr) {
        this.lrcotiplanbienpremiotclr = lrcotiplanbienpremiotclr;
    }

    public BigDecimal getLrcotiplanbienpremioajustetc() {
        return lrcotiplanbienpremioajustetc;
    }

    public void setLrcotiplanbienpremioajustetc(BigDecimal lrcotiplanbienpremioajustetc) {
        this.lrcotiplanbienpremioajustetc = lrcotiplanbienpremioajustetc;
    }

    public BigDecimal getLrcotiplanbienpremiodescrpf() {
        return lrcotiplanbienpremiodescrpf;
    }

    public void setLrcotiplanbienpremiodescrpf(BigDecimal lrcotiplanbienpremiodescrpf) {
        this.lrcotiplanbienpremiodescrpf = lrcotiplanbienpremiodescrpf;
    }

    public BigDecimal getLrcotiplanbienpremiorpf() {
        return lrcotiplanbienpremiorpf;
    }

    public void setLrcotiplanbienpremiorpf(BigDecimal lrcotiplanbienpremiorpf) {
        this.lrcotiplanbienpremiorpf = lrcotiplanbienpremiorpf;
    }

    public BigDecimal getLrcotiplanbienpremioiva() {
        return lrcotiplanbienpremioiva;
    }

    public void setLrcotiplanbienpremioiva(BigDecimal lrcotiplanbienpremioiva) {
        this.lrcotiplanbienpremioiva = lrcotiplanbienpremioiva;
    }

    public BigDecimal getLrcotiplanbienpremiotasacomnet() {
        return lrcotiplanbienpremiotasacomnet;
    }

    public void setLrcotiplanbienpremiotasacomnet(BigDecimal lrcotiplanbienpremiotasacomnet) {
        this.lrcotiplanbienpremiotasacomnet = lrcotiplanbienpremiotasacomnet;
    }

    public BigDecimal getLrcotiplanbienpremioprimacomne() {
        return lrcotiplanbienpremioprimacomne;
    }

    public void setLrcotiplanbienpremioprimacomne(BigDecimal lrcotiplanbienpremioprimacomne) {
        this.lrcotiplanbienpremioprimacomne = lrcotiplanbienpremioprimacomne;
    }

    public BigDecimal getLrcotiplanbienpremiobonificaci() {
        return lrcotiplanbienpremiobonificaci;
    }

    public void setLrcotiplanbienpremiobonificaci(BigDecimal lrcotiplanbienpremiobonificaci) {
        this.lrcotiplanbienpremiobonificaci = lrcotiplanbienpremiobonificaci;
    }

    public BigDecimal getLrcotiplanbienpremiodesccom() {
        return lrcotiplanbienpremiodesccom;
    }

    public void setLrcotiplanbienpremiodesccom(BigDecimal lrcotiplanbienpremiodesccom) {
        this.lrcotiplanbienpremiodesccom = lrcotiplanbienpremiodesccom;
    }

    public BigDecimal getLrcotiplanbienpremioreccom() {
        return lrcotiplanbienpremioreccom;
    }

    public void setLrcotiplanbienpremioreccom(BigDecimal lrcotiplanbienpremioreccom) {
        this.lrcotiplanbienpremioreccom = lrcotiplanbienpremioreccom;
    }

    public BigDecimal getLrcotiplanbienpremioprimacombr() {
        return lrcotiplanbienpremioprimacombr;
    }

    public void setLrcotiplanbienpremioprimacombr(BigDecimal lrcotiplanbienpremioprimacombr) {
        this.lrcotiplanbienpremioprimacombr = lrcotiplanbienpremioprimacombr;
    }

    public BigDecimal getLrcotiplanbienpremiogtoadm() {
        return lrcotiplanbienpremiogtoadm;
    }

    public void setLrcotiplanbienpremiogtoadm(BigDecimal lrcotiplanbienpremiogtoadm) {
        this.lrcotiplanbienpremiogtoadm = lrcotiplanbienpremiogtoadm;
    }

    public BigDecimal getLrcotiplanbienpremiootrosgtos() {
        return lrcotiplanbienpremiootrosgtos;
    }

    public void setLrcotiplanbienpremiootrosgtos(BigDecimal lrcotiplanbienpremiootrosgtos) {
        this.lrcotiplanbienpremiootrosgtos = lrcotiplanbienpremiootrosgtos;
    }

    public BigDecimal getLrcotiplanbienpremiocomicedida() {
        return lrcotiplanbienpremiocomicedida;
    }

    public void setLrcotiplanbienpremiocomicedida(BigDecimal lrcotiplanbienpremiocomicedida) {
        this.lrcotiplanbienpremiocomicedida = lrcotiplanbienpremiocomicedida;
    }

    public BigDecimal getLrcotiplanbienpremiocominegoci() {
        return lrcotiplanbienpremiocominegoci;
    }

    public void setLrcotiplanbienpremiocominegoci(BigDecimal lrcotiplanbienpremiocominegoci) {
        this.lrcotiplanbienpremiocominegoci = lrcotiplanbienpremiocominegoci;
    }

    public BigDecimal getLrcotiplanbienpremiocomicontra() {
        return lrcotiplanbienpremiocomicontra;
    }

    public void setLrcotiplanbienpremiocomicontra(BigDecimal lrcotiplanbienpremiocomicontra) {
        this.lrcotiplanbienpremiocomicontra = lrcotiplanbienpremiocomicontra;
    }

    public BigDecimal getLrcotiplanbienpremiosubtotcomi() {
        return lrcotiplanbienpremiosubtotcomi;
    }

    public void setLrcotiplanbienpremiosubtotcomi(BigDecimal lrcotiplanbienpremiosubtotcomi) {
        this.lrcotiplanbienpremiosubtotcomi = lrcotiplanbienpremiosubtotcomi;
    }

    public BigDecimal getLrcotiplanbienpremiodesccorp() {
        return lrcotiplanbienpremiodesccorp;
    }

    public void setLrcotiplanbienpremiodesccorp(BigDecimal lrcotiplanbienpremiodesccorp) {
        this.lrcotiplanbienpremiodesccorp = lrcotiplanbienpremiodesccorp;
    }

    public BigDecimal getLrcotiplanbienpremiotasatec() {
        return lrcotiplanbienpremiotasatec;
    }

    public void setLrcotiplanbienpremiotasatec(BigDecimal lrcotiplanbienpremiotasatec) {
        this.lrcotiplanbienpremiotasatec = lrcotiplanbienpremiotasatec;
    }

    public BigDecimal getLrcotiplanbienpremioprimatecne() {
        return lrcotiplanbienpremioprimatecne;
    }

    public void setLrcotiplanbienpremioprimatecne(BigDecimal lrcotiplanbienpremioprimatecne) {
        this.lrcotiplanbienpremioprimatecne = lrcotiplanbienpremioprimatecne;
    }

    public BigDecimal getLrcotiplanbienpremiodesctec() {
        return lrcotiplanbienpremiodesctec;
    }

    public void setLrcotiplanbienpremiodesctec(BigDecimal lrcotiplanbienpremiodesctec) {
        this.lrcotiplanbienpremiodesctec = lrcotiplanbienpremiodesctec;
    }

    public BigDecimal getLrcotiplanbienpremiommu() {
        return lrcotiplanbienpremiommu;
    }

    public void setLrcotiplanbienpremiommu(BigDecimal lrcotiplanbienpremiommu) {
        this.lrcotiplanbienpremiommu = lrcotiplanbienpremiommu;
    }

    public BigDecimal getLrcotiplanbienpremioprimtecbru() {
        return lrcotiplanbienpremioprimtecbru;
    }

    public void setLrcotiplanbienpremioprimtecbru(BigDecimal lrcotiplanbienpremioprimtecbru) {
        this.lrcotiplanbienpremioprimtecbru = lrcotiplanbienpremioprimtecbru;
    }

    public BigDecimal getLrcotiplanbienpremioreccoa() {
        return lrcotiplanbienpremioreccoa;
    }

    public void setLrcotiplanbienpremioreccoa(BigDecimal lrcotiplanbienpremioreccoa) {
        this.lrcotiplanbienpremioreccoa = lrcotiplanbienpremioreccoa;
    }

    public BigDecimal getLrcotiplanbienpremiodesccoa() {
        return lrcotiplanbienpremiodesccoa;
    }

    public void setLrcotiplanbienpremiodesccoa(BigDecimal lrcotiplanbienpremiodesccoa) {
        this.lrcotiplanbienpremiodesccoa = lrcotiplanbienpremiodesccoa;
    }

    public BigDecimal getLrcotiplanbienpremiorecrea() {
        return lrcotiplanbienpremiorecrea;
    }

    public void setLrcotiplanbienpremiorecrea(BigDecimal lrcotiplanbienpremiorecrea) {
        this.lrcotiplanbienpremiorecrea = lrcotiplanbienpremiorecrea;
    }

    public BigDecimal getLrcotiplanbienpremiodescrea() {
        return lrcotiplanbienpremiodescrea;
    }

    public void setLrcotiplanbienpremiodescrea(BigDecimal lrcotiplanbienpremiodescrea) {
        this.lrcotiplanbienpremiodescrea = lrcotiplanbienpremiodescrea;
    }

    public BigDecimal getLrcotiplanbienpremiorecmat() {
        return lrcotiplanbienpremiorecmat;
    }

    public void setLrcotiplanbienpremiorecmat(BigDecimal lrcotiplanbienpremiorecmat) {
        this.lrcotiplanbienpremiorecmat = lrcotiplanbienpremiorecmat;
    }

    public BigDecimal getLrcotiplanbienpremiodescmat() {
        return lrcotiplanbienpremiodescmat;
    }

    public void setLrcotiplanbienpremiodescmat(BigDecimal lrcotiplanbienpremiodescmat) {
        this.lrcotiplanbienpremiodescmat = lrcotiplanbienpremiodescmat;
    }
    
}
