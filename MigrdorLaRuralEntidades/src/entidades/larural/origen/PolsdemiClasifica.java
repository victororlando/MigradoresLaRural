/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "POLSDEMI_CLASIFICA", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "PolsdemiClasifica.findAll", query = "SELECT p FROM PolsdemiClasifica p"),
    @NamedQuery(name = "PolsdemiClasifica.findByTipoSeguro", query = "SELECT p FROM PolsdemiClasifica p WHERE p.polsdemiClasificaPK.tipoSeguro = :tipoSeguro"),
    @NamedQuery(name = "PolsdemiClasifica.findByTipoOperacion", query = "SELECT p FROM PolsdemiClasifica p WHERE p.polsdemiClasificaPK.tipoOperacion = :tipoOperacion"),
    @NamedQuery(name = "PolsdemiClasifica.findByEjercicio", query = "SELECT p FROM PolsdemiClasifica p WHERE p.polsdemiClasificaPK.ejercicio = :ejercicio"),
    @NamedQuery(name = "PolsdemiClasifica.findBySecc", query = "SELECT p FROM PolsdemiClasifica p WHERE p.polsdemiClasificaPK.secc = :secc"),
    @NamedQuery(name = "PolsdemiClasifica.findByPolnro", query = "SELECT p FROM PolsdemiClasifica p WHERE p.polsdemiClasificaPK.polnro = :polnro"),
    @NamedQuery(name = "PolsdemiClasifica.findByAnexo", query = "SELECT p FROM PolsdemiClasifica p WHERE p.polsdemiClasificaPK.anexo = :anexo"),
    @NamedQuery(name = "PolsdemiClasifica.findByClaseAsegManual", query = "SELECT p FROM PolsdemiClasifica p WHERE p.claseAsegManual = :claseAsegManual"),
    @NamedQuery(name = "PolsdemiClasifica.findByClaseAsegSistema", query = "SELECT p FROM PolsdemiClasifica p WHERE p.claseAsegSistema = :claseAsegSistema"),
    @NamedQuery(name = "PolsdemiClasifica.findByClasePolizaManual", query = "SELECT p FROM PolsdemiClasifica p WHERE p.clasePolizaManual = :clasePolizaManual"),
    @NamedQuery(name = "PolsdemiClasifica.findByClasePolizaSistema", query = "SELECT p FROM PolsdemiClasifica p WHERE p.clasePolizaSistema = :clasePolizaSistema"),
    @NamedQuery(name = "PolsdemiClasifica.findByUsuarioCarga", query = "SELECT p FROM PolsdemiClasifica p WHERE p.usuarioCarga = :usuarioCarga"),
    @NamedQuery(name = "PolsdemiClasifica.findByUsuarioModifica", query = "SELECT p FROM PolsdemiClasifica p WHERE p.usuarioModifica = :usuarioModifica"),
    @NamedQuery(name = "PolsdemiClasifica.findByNroEntrada", query = "SELECT p FROM PolsdemiClasifica p WHERE p.nroEntrada = :nroEntrada")})
public class PolsdemiClasifica implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PolsdemiClasificaPK polsdemiClasificaPK;
    @Column(name = "CLASE_ASEG_MANUAL", length = 10)
    private String claseAsegManual;
    @Column(name = "CLASE_ASEG_SISTEMA", length = 10)
    private String claseAsegSistema;
    @Column(name = "CLASE_POLIZA_MANUAL", length = 25)
    private String clasePolizaManual;
    @Column(name = "CLASE_POLIZA_SISTEMA", length = 25)
    private String clasePolizaSistema;
    @Basic(optional = false)
    @Column(name = "USUARIO_CARGA", nullable = false)
    private short usuarioCarga;
    @Basic(optional = false)
    @Column(name = "USUARIO_MODIFICA", nullable = false)
    private short usuarioModifica;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private long nroEntrada;
    @JoinColumns({
        @JoinColumn(name = "EJERCICIO", referencedColumnName = "EJERCICIO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "TIPO_SEGURO", referencedColumnName = "TIPO_SEGURO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "TIPO_OPERACION", referencedColumnName = "TIPO_OPERACION", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "SECC", referencedColumnName = "SECC", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "POLNRO", referencedColumnName = "POLNRO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "ANEXO", referencedColumnName = "ANEXO", nullable = false, insertable = false, updatable = false)})
    @OneToOne(optional = false)
    private Polsdemi polsdemi;

    public PolsdemiClasifica() {
    }

    public PolsdemiClasifica(PolsdemiClasificaPK polsdemiClasificaPK) {
        this.polsdemiClasificaPK = polsdemiClasificaPK;
    }

    public PolsdemiClasifica(PolsdemiClasificaPK polsdemiClasificaPK, short usuarioCarga, short usuarioModifica, long nroEntrada) {
        this.polsdemiClasificaPK = polsdemiClasificaPK;
        this.usuarioCarga = usuarioCarga;
        this.usuarioModifica = usuarioModifica;
        this.nroEntrada = nroEntrada;
    }

    public PolsdemiClasifica(short tipoSeguro, short tipoOperacion, short ejercicio, short secc, int polnro, short anexo) {
        this.polsdemiClasificaPK = new PolsdemiClasificaPK(tipoSeguro, tipoOperacion, ejercicio, secc, polnro, anexo);
    }

    public PolsdemiClasificaPK getPolsdemiClasificaPK() {
        return polsdemiClasificaPK;
    }

    public void setPolsdemiClasificaPK(PolsdemiClasificaPK polsdemiClasificaPK) {
        this.polsdemiClasificaPK = polsdemiClasificaPK;
    }

    public String getClaseAsegManual() {
        return claseAsegManual;
    }

    public void setClaseAsegManual(String claseAsegManual) {
        this.claseAsegManual = claseAsegManual;
    }

    public String getClaseAsegSistema() {
        return claseAsegSistema;
    }

    public void setClaseAsegSistema(String claseAsegSistema) {
        this.claseAsegSistema = claseAsegSistema;
    }

    public String getClasePolizaManual() {
        return clasePolizaManual;
    }

    public void setClasePolizaManual(String clasePolizaManual) {
        this.clasePolizaManual = clasePolizaManual;
    }

    public String getClasePolizaSistema() {
        return clasePolizaSistema;
    }

    public void setClasePolizaSistema(String clasePolizaSistema) {
        this.clasePolizaSistema = clasePolizaSistema;
    }

    public short getUsuarioCarga() {
        return usuarioCarga;
    }

    public void setUsuarioCarga(short usuarioCarga) {
        this.usuarioCarga = usuarioCarga;
    }

    public short getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(short usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    public long getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(long nroEntrada) {
        this.nroEntrada = nroEntrada;
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
        hash += (polsdemiClasificaPK != null ? polsdemiClasificaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PolsdemiClasifica)) {
            return false;
        }
        PolsdemiClasifica other = (PolsdemiClasifica) object;
        if ((this.polsdemiClasificaPK == null && other.polsdemiClasificaPK != null) || (this.polsdemiClasificaPK != null && !this.polsdemiClasificaPK.equals(other.polsdemiClasificaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.PolsdemiClasifica[ polsdemiClasificaPK=" + polsdemiClasificaPK + " ]";
    }
    
}
