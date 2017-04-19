/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "BENEF_ASEG_VIDA", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "BenefAsegVida.findAll", query = "SELECT b FROM BenefAsegVida b"),
    @NamedQuery(name = "BenefAsegVida.findByCodAsegVida", query = "SELECT b FROM BenefAsegVida b WHERE b.benefAsegVidaPK.codAsegVida = :codAsegVida"),
    @NamedQuery(name = "BenefAsegVida.findByCodBenef", query = "SELECT b FROM BenefAsegVida b WHERE b.benefAsegVidaPK.codBenef = :codBenef"),
    @NamedQuery(name = "BenefAsegVida.findByNombre", query = "SELECT b FROM BenefAsegVida b WHERE b.nombre = :nombre"),
    @NamedQuery(name = "BenefAsegVida.findByRelacionParental", query = "SELECT b FROM BenefAsegVida b WHERE b.relacionParental = :relacionParental"),
    @NamedQuery(name = "BenefAsegVida.findByPorcentaje", query = "SELECT b FROM BenefAsegVida b WHERE b.porcentaje = :porcentaje"),
    @NamedQuery(name = "BenefAsegVida.findByCedIdentidad", query = "SELECT b FROM BenefAsegVida b WHERE b.cedIdentidad = :cedIdentidad")})
public class BenefAsegVida implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BenefAsegVidaPK benefAsegVidaPK;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 40)
    private String nombre;
    @Column(name = "RELACION_PARENTAL", length = 20)
    private String relacionParental;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PORCENTAJE", nullable = false, precision = 6, scale = 2)
    private BigDecimal porcentaje;
    @Column(name = "CED_IDENTIDAD", length = 50)
    private String cedIdentidad;
    @JoinColumn(name = "COD_ASEG_VIDA", referencedColumnName = "N_ASEG", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AsegVida asegVida;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "benefAsegVida")
    private List<Beneficiarios> beneficiariosList;

    public BenefAsegVida() {
    }

    public BenefAsegVida(BenefAsegVidaPK benefAsegVidaPK) {
        this.benefAsegVidaPK = benefAsegVidaPK;
    }

    public BenefAsegVida(BenefAsegVidaPK benefAsegVidaPK, String nombre, BigDecimal porcentaje) {
        this.benefAsegVidaPK = benefAsegVidaPK;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

    public BenefAsegVida(int codAsegVida, int codBenef) {
        this.benefAsegVidaPK = new BenefAsegVidaPK(codAsegVida, codBenef);
    }

    public BenefAsegVidaPK getBenefAsegVidaPK() {
        return benefAsegVidaPK;
    }

    public void setBenefAsegVidaPK(BenefAsegVidaPK benefAsegVidaPK) {
        this.benefAsegVidaPK = benefAsegVidaPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRelacionParental() {
        return relacionParental;
    }

    public void setRelacionParental(String relacionParental) {
        this.relacionParental = relacionParental;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getCedIdentidad() {
        return cedIdentidad;
    }

    public void setCedIdentidad(String cedIdentidad) {
        this.cedIdentidad = cedIdentidad;
    }

    public AsegVida getAsegVida() {
        return asegVida;
    }

    public void setAsegVida(AsegVida asegVida) {
        this.asegVida = asegVida;
    }

    public List<Beneficiarios> getBeneficiariosList() {
        return beneficiariosList;
    }

    public void setBeneficiariosList(List<Beneficiarios> beneficiariosList) {
        this.beneficiariosList = beneficiariosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (benefAsegVidaPK != null ? benefAsegVidaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BenefAsegVida)) {
            return false;
        }
        BenefAsegVida other = (BenefAsegVida) object;
        if ((this.benefAsegVidaPK == null && other.benefAsegVidaPK != null) || (this.benefAsegVidaPK != null && !this.benefAsegVidaPK.equals(other.benefAsegVidaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.BenefAsegVida[ benefAsegVidaPK=" + benefAsegVidaPK + " ]";
    }
    
}
