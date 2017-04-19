/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "BENEFICIARIOS", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "Beneficiarios.findAll", query = "SELECT b FROM Beneficiarios b"),
    @NamedQuery(name = "Beneficiarios.findByCodBeneficiario", query = "SELECT b FROM Beneficiarios b WHERE b.beneficiariosPK.codBeneficiario = :codBeneficiario"),
    @NamedQuery(name = "Beneficiarios.findByNombre", query = "SELECT b FROM Beneficiarios b WHERE b.nombre = :nombre"),
    @NamedQuery(name = "Beneficiarios.findByEjercicio", query = "SELECT b FROM Beneficiarios b WHERE b.beneficiariosPK.ejercicio = :ejercicio"),
    @NamedQuery(name = "Beneficiarios.findByTipoSeguro", query = "SELECT b FROM Beneficiarios b WHERE b.beneficiariosPK.tipoSeguro = :tipoSeguro"),
    @NamedQuery(name = "Beneficiarios.findByTipoOperacion", query = "SELECT b FROM Beneficiarios b WHERE b.beneficiariosPK.tipoOperacion = :tipoOperacion"),
    @NamedQuery(name = "Beneficiarios.findBySecc", query = "SELECT b FROM Beneficiarios b WHERE b.beneficiariosPK.secc = :secc"),
    @NamedQuery(name = "Beneficiarios.findByPolnro", query = "SELECT b FROM Beneficiarios b WHERE b.beneficiariosPK.polnro = :polnro"),
    @NamedQuery(name = "Beneficiarios.findByAnexo", query = "SELECT b FROM Beneficiarios b WHERE b.beneficiariosPK.anexo = :anexo"),
    @NamedQuery(name = "Beneficiarios.findByRelacionParent", query = "SELECT b FROM Beneficiarios b WHERE b.relacionParent = :relacionParent"),
    @NamedQuery(name = "Beneficiarios.findByPorcentaje", query = "SELECT b FROM Beneficiarios b WHERE b.porcentaje = :porcentaje"),
    @NamedQuery(name = "Beneficiarios.findByCiNro", query = "SELECT b FROM Beneficiarios b WHERE b.ciNro = :ciNro"),
    @NamedQuery(name = "Beneficiarios.findByItem", query = "SELECT b FROM Beneficiarios b WHERE b.item = :item"),
    @NamedQuery(name = "Beneficiarios.findByNroCert", query = "SELECT b FROM Beneficiarios b WHERE b.beneficiariosPK.nroCert = :nroCert")})
public class Beneficiarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BeneficiariosPK beneficiariosPK;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 60)
    private String nombre;
    @Column(name = "RELACION_PARENT", length = 30)
    private String relacionParent;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PORCENTAJE", nullable = false, precision = 6, scale = 3)
    private BigDecimal porcentaje;
    @Column(name = "CI_NRO", length = 15)
    private String ciNro;
    @Column(name = "ITEM")
    private Short item;
    @JoinColumns({
        @JoinColumn(name = "N_ASEG_VIDA", referencedColumnName = "COD_ASEG_VIDA"),
        @JoinColumn(name = "COD_BENEFICIARIO", referencedColumnName = "COD_BENEF", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private BenefAsegVida benefAsegVida;

    public Beneficiarios() {
    }

    public Beneficiarios(BeneficiariosPK beneficiariosPK) {
        this.beneficiariosPK = beneficiariosPK;
    }

    public Beneficiarios(BeneficiariosPK beneficiariosPK, String nombre, BigDecimal porcentaje) {
        this.beneficiariosPK = beneficiariosPK;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

    public Beneficiarios(int codBeneficiario, short ejercicio, short tipoSeguro, short tipoOperacion, short secc, int polnro, short anexo, int nroCert) {
        this.beneficiariosPK = new BeneficiariosPK(codBeneficiario, ejercicio, tipoSeguro, tipoOperacion, secc, polnro, anexo, nroCert);
    }

    public BeneficiariosPK getBeneficiariosPK() {
        return beneficiariosPK;
    }

    public void setBeneficiariosPK(BeneficiariosPK beneficiariosPK) {
        this.beneficiariosPK = beneficiariosPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRelacionParent() {
        return relacionParent;
    }

    public void setRelacionParent(String relacionParent) {
        this.relacionParent = relacionParent;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getCiNro() {
        return ciNro;
    }

    public void setCiNro(String ciNro) {
        this.ciNro = ciNro;
    }

    public Short getItem() {
        return item;
    }

    public void setItem(Short item) {
        this.item = item;
    }

    public BenefAsegVida getBenefAsegVida() {
        return benefAsegVida;
    }

    public void setBenefAsegVida(BenefAsegVida benefAsegVida) {
        this.benefAsegVida = benefAsegVida;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (beneficiariosPK != null ? beneficiariosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Beneficiarios)) {
            return false;
        }
        Beneficiarios other = (Beneficiarios) object;
        if ((this.beneficiariosPK == null && other.beneficiariosPK != null) || (this.beneficiariosPK != null && !this.beneficiariosPK.equals(other.beneficiariosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Beneficiarios[ beneficiariosPK=" + beneficiariosPK + " ]";
    }
    
}
