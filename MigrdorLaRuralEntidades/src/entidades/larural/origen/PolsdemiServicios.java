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
@Table(name = "POLSDEMI_SERVICIOS", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "PolsdemiServicios.findAll", query = "SELECT p FROM PolsdemiServicios p"),
    @NamedQuery(name = "PolsdemiServicios.findByTipoSeguro", query = "SELECT p FROM PolsdemiServicios p WHERE p.polsdemiServiciosPK.tipoSeguro = :tipoSeguro"),
    @NamedQuery(name = "PolsdemiServicios.findByTipoOperacion", query = "SELECT p FROM PolsdemiServicios p WHERE p.polsdemiServiciosPK.tipoOperacion = :tipoOperacion"),
    @NamedQuery(name = "PolsdemiServicios.findByEjercicio", query = "SELECT p FROM PolsdemiServicios p WHERE p.polsdemiServiciosPK.ejercicio = :ejercicio"),
    @NamedQuery(name = "PolsdemiServicios.findBySecc", query = "SELECT p FROM PolsdemiServicios p WHERE p.polsdemiServiciosPK.secc = :secc"),
    @NamedQuery(name = "PolsdemiServicios.findByPolnro", query = "SELECT p FROM PolsdemiServicios p WHERE p.polsdemiServiciosPK.polnro = :polnro"),
    @NamedQuery(name = "PolsdemiServicios.findByAnexo", query = "SELECT p FROM PolsdemiServicios p WHERE p.polsdemiServiciosPK.anexo = :anexo"),
    @NamedQuery(name = "PolsdemiServicios.findByCodigoServicio", query = "SELECT p FROM PolsdemiServicios p WHERE p.polsdemiServiciosPK.codigoServicio = :codigoServicio"),
    @NamedQuery(name = "PolsdemiServicios.findByCodBenef", query = "SELECT p FROM PolsdemiServicios p WHERE p.polsdemiServiciosPK.codBenef = :codBenef"),
    @NamedQuery(name = "PolsdemiServicios.findByImporte", query = "SELECT p FROM PolsdemiServicios p WHERE p.importe = :importe"),
    @NamedQuery(name = "PolsdemiServicios.findByNroEntrada", query = "SELECT p FROM PolsdemiServicios p WHERE p.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "PolsdemiServicios.findByCodUsuario", query = "SELECT p FROM PolsdemiServicios p WHERE p.codUsuario = :codUsuario")})
public class PolsdemiServicios implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PolsdemiServiciosPK polsdemiServiciosPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "IMPORTE", nullable = false, precision = 17, scale = 2)
    private BigDecimal importe;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @Basic(optional = false)
    @Column(name = "COD_USUARIO", nullable = false)
    private short codUsuario;
    @JoinColumns({
        @JoinColumn(name = "SECC", referencedColumnName = "SECC", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "CODIGO_SERVICIO", referencedColumnName = "CODIGO_SERVICIO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "COD_BENEF", referencedColumnName = "COD_BENEF", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ArchbeneServicios archbeneServicios;
    @JoinColumns({
        @JoinColumn(name = "EJERCICIO", referencedColumnName = "EJERCICIO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "TIPO_SEGURO", referencedColumnName = "TIPO_SEGURO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "TIPO_OPERACION", referencedColumnName = "TIPO_OPERACION", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "SECC", referencedColumnName = "SECC", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "POLNRO", referencedColumnName = "POLNRO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "ANEXO", referencedColumnName = "ANEXO", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Polsdemi polsdemi;

    public PolsdemiServicios() {
    }

    public PolsdemiServicios(PolsdemiServiciosPK polsdemiServiciosPK) {
        this.polsdemiServiciosPK = polsdemiServiciosPK;
    }

    public PolsdemiServicios(PolsdemiServiciosPK polsdemiServiciosPK, BigDecimal importe, int nroEntrada, short codUsuario) {
        this.polsdemiServiciosPK = polsdemiServiciosPK;
        this.importe = importe;
        this.nroEntrada = nroEntrada;
        this.codUsuario = codUsuario;
    }

    public PolsdemiServicios(short tipoSeguro, short tipoOperacion, short ejercicio, short secc, int polnro, short anexo, short codigoServicio, int codBenef) {
        this.polsdemiServiciosPK = new PolsdemiServiciosPK(tipoSeguro, tipoOperacion, ejercicio, secc, polnro, anexo, codigoServicio, codBenef);
    }

    public PolsdemiServiciosPK getPolsdemiServiciosPK() {
        return polsdemiServiciosPK;
    }

    public void setPolsdemiServiciosPK(PolsdemiServiciosPK polsdemiServiciosPK) {
        this.polsdemiServiciosPK = polsdemiServiciosPK;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public int getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(int nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public short getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(short codUsuario) {
        this.codUsuario = codUsuario;
    }

    public ArchbeneServicios getArchbeneServicios() {
        return archbeneServicios;
    }

    public void setArchbeneServicios(ArchbeneServicios archbeneServicios) {
        this.archbeneServicios = archbeneServicios;
    }

    public Polsdemi getPolsdemi() {
        return polsdemi;
    }

    public void setPolsdemi(Polsdemi polsdemi) {
        this.polsdemi = polsdemi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (polsdemiServiciosPK != null ? polsdemiServiciosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PolsdemiServicios)) {
            return false;
        }
        PolsdemiServicios other = (PolsdemiServicios) object;
        if ((this.polsdemiServiciosPK == null && other.polsdemiServiciosPK != null) || (this.polsdemiServiciosPK != null && !this.polsdemiServiciosPK.equals(other.polsdemiServiciosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.PolsdemiServicios[ polsdemiServiciosPK=" + polsdemiServiciosPK + " ]";
    }
    
}
