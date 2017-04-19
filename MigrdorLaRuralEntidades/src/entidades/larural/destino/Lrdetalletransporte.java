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
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "LRDETALLETRANSPORTE")
@NamedQueries({
    @NamedQuery(name = "Lrdetalletransporte.findAll", query = "SELECT l FROM Lrdetalletransporte l"),
    @NamedQuery(name = "Lrdetalletransporte.findByLrdetalletransporteid", query = "SELECT l FROM Lrdetalletransporte l WHERE l.lrdetalletransporteid = :lrdetalletransporteid"),
    @NamedQuery(name = "Lrdetalletransporte.findByLrdetalletransportecantidad", query = "SELECT l FROM Lrdetalletransporte l WHERE l.lrdetalletransportecantidad = :lrdetalletransportecantidad"),
    @NamedQuery(name = "Lrdetalletransporte.findByLrdetalletransportesumatransp", query = "SELECT l FROM Lrdetalletransporte l WHERE l.lrdetalletransportesumatransp = :lrdetalletransportesumatransp"),
    @NamedQuery(name = "Lrdetalletransporte.findByLrdetalletransportejuntos", query = "SELECT l FROM Lrdetalletransporte l WHERE l.lrdetalletransportejuntos = :lrdetalletransportejuntos"),
    @NamedQuery(name = "Lrdetalletransporte.findByLrdetalletransportemontodiario", query = "SELECT l FROM Lrdetalletransporte l WHERE l.lrdetalletransportemontodiario = :lrdetalletransportemontodiario"),
    @NamedQuery(name = "Lrdetalletransporte.findByLrdetalletransportemontomensua", query = "SELECT l FROM Lrdetalletransporte l WHERE l.lrdetalletransportemontomensua = :lrdetalletransportemontomensua"),
    @NamedQuery(name = "Lrdetalletransporte.findByLrdetalletransportemontoanual", query = "SELECT l FROM Lrdetalletransporte l WHERE l.lrdetalletransportemontoanual = :lrdetalletransportemontoanual"),
    @NamedQuery(name = "Lrdetalletransporte.findByLrdetalletransportetipo", query = "SELECT l FROM Lrdetalletransporte l WHERE l.lrdetalletransportetipo = :lrdetalletransportetipo"),
    @NamedQuery(name = "Lrdetalletransporte.findByLrdetalletransportenombre", query = "SELECT l FROM Lrdetalletransporte l WHERE l.lrdetalletransportenombre = :lrdetalletransportenombre"),
    @NamedQuery(name = "Lrdetalletransporte.findByLrdetalletransporteanho", query = "SELECT l FROM Lrdetalletransporte l WHERE l.lrdetalletransporteanho = :lrdetalletransporteanho"),
    @NamedQuery(name = "Lrdetalletransporte.findByLrdetalletransportematricula", query = "SELECT l FROM Lrdetalletransporte l WHERE l.lrdetalletransportematricula = :lrdetalletransportematricula"),
    @NamedQuery(name = "Lrdetalletransporte.findByLrdetalletransportemarcamotor", query = "SELECT l FROM Lrdetalletransporte l WHERE l.lrdetalletransportemarcamotor = :lrdetalletransportemarcamotor"),
    @NamedQuery(name = "Lrdetalletransporte.findByLrdetalletransportemodpotencia", query = "SELECT l FROM Lrdetalletransporte l WHERE l.lrdetalletransportemodpotencia = :lrdetalletransportemodpotencia"),
    @NamedQuery(name = "Lrdetalletransporte.findByLrdetalletransporteuso", query = "SELECT l FROM Lrdetalletransporte l WHERE l.lrdetalletransporteuso = :lrdetalletransporteuso")})
public class Lrdetalletransporte implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRDETALLETRANSPORTEID", nullable = false)
    private Long lrdetalletransporteid;
    @Basic(optional = false)
    @Column(name = "LRDETALLETRANSPORTECANTIDAD", nullable = false)
    private short lrdetalletransportecantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRDETALLETRANSPORTESUMATRANSP", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrdetalletransportesumatransp;
    @Basic(optional = false)
    @Column(name = "LRDETALLETRANSPORTEJUNTOS", nullable = false)
    private Character lrdetalletransportejuntos;
    @Basic(optional = false)
    @Column(name = "LRDETALLETRANSPORTEMONTODIARIO", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrdetalletransportemontodiario;
    @Basic(optional = false)
    @Column(name = "LRDETALLETRANSPORTEMONTOMENSUA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrdetalletransportemontomensua;
    @Basic(optional = false)
    @Column(name = "LRDETALLETRANSPORTEMONTOANUAL", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrdetalletransportemontoanual;
    @Column(name = "LRDETALLETRANSPORTETIPO", length = 30)
    private String lrdetalletransportetipo;
    @Column(name = "LRDETALLETRANSPORTENOMBRE", length = 30)
    private String lrdetalletransportenombre;
    @Column(name = "LRDETALLETRANSPORTEANHO")
    private Short lrdetalletransporteanho;
    @Column(name = "LRDETALLETRANSPORTEMATRICULA", length = 20)
    private String lrdetalletransportematricula;
    @Column(name = "LRDETALLETRANSPORTEMARCAMOTOR", length = 100)
    private String lrdetalletransportemarcamotor;
    @Column(name = "LRDETALLETRANSPORTEMODPOTENCIA", length = 100)
    private String lrdetalletransportemodpotencia;
    @Column(name = "LRDETALLETRANSPORTEUSO", length = 100)
    private String lrdetalletransporteuso;
    @JoinColumns({
        @JoinColumn(name = "SDETTRANSCOTIDATBIENASEID", referencedColumnName = "LRCOTIDATBIENASEID", nullable = false),
        @JoinColumn(name = "SDETTRANSLRUBICACIONID", referencedColumnName = "LRUBICACIONID", nullable = false)})
    @ManyToOne(optional = false)
    private Lrcotidatbienase lrcotidatbienase;
    @JoinColumn(name = "LRMEDIOSTRANSPORTEID", referencedColumnName = "LRMEDIOSTRANSPORTEID")
    @ManyToOne
    private Lrmediostransporte lrmediostransporteid;
    @JoinColumn(name = "SLRVIATRANSPORTEID", referencedColumnName = "LRVIATRANSPORTEID")
    @ManyToOne
    private Lrviatransporte slrviatransporteid;

    public Lrdetalletransporte() {
    }

    public Lrdetalletransporte(Long lrdetalletransporteid) {
        this.lrdetalletransporteid = lrdetalletransporteid;
    }

    public Lrdetalletransporte(Long lrdetalletransporteid, short lrdetalletransportecantidad, BigDecimal lrdetalletransportesumatransp, Character lrdetalletransportejuntos, BigDecimal lrdetalletransportemontodiario, BigDecimal lrdetalletransportemontomensua, BigDecimal lrdetalletransportemontoanual) {
        this.lrdetalletransporteid = lrdetalletransporteid;
        this.lrdetalletransportecantidad = lrdetalletransportecantidad;
        this.lrdetalletransportesumatransp = lrdetalletransportesumatransp;
        this.lrdetalletransportejuntos = lrdetalletransportejuntos;
        this.lrdetalletransportemontodiario = lrdetalletransportemontodiario;
        this.lrdetalletransportemontomensua = lrdetalletransportemontomensua;
        this.lrdetalletransportemontoanual = lrdetalletransportemontoanual;
    }

    public Long getLrdetalletransporteid() {
        return lrdetalletransporteid;
    }

    public void setLrdetalletransporteid(Long lrdetalletransporteid) {
        this.lrdetalletransporteid = lrdetalletransporteid;
    }

    public short getLrdetalletransportecantidad() {
        return lrdetalletransportecantidad;
    }

    public void setLrdetalletransportecantidad(short lrdetalletransportecantidad) {
        this.lrdetalletransportecantidad = lrdetalletransportecantidad;
    }

    public BigDecimal getLrdetalletransportesumatransp() {
        return lrdetalletransportesumatransp;
    }

    public void setLrdetalletransportesumatransp(BigDecimal lrdetalletransportesumatransp) {
        this.lrdetalletransportesumatransp = lrdetalletransportesumatransp;
    }

    public Character getLrdetalletransportejuntos() {
        return lrdetalletransportejuntos;
    }

    public void setLrdetalletransportejuntos(Character lrdetalletransportejuntos) {
        this.lrdetalletransportejuntos = lrdetalletransportejuntos;
    }

    public BigDecimal getLrdetalletransportemontodiario() {
        return lrdetalletransportemontodiario;
    }

    public void setLrdetalletransportemontodiario(BigDecimal lrdetalletransportemontodiario) {
        this.lrdetalletransportemontodiario = lrdetalletransportemontodiario;
    }

    public BigDecimal getLrdetalletransportemontomensua() {
        return lrdetalletransportemontomensua;
    }

    public void setLrdetalletransportemontomensua(BigDecimal lrdetalletransportemontomensua) {
        this.lrdetalletransportemontomensua = lrdetalletransportemontomensua;
    }

    public BigDecimal getLrdetalletransportemontoanual() {
        return lrdetalletransportemontoanual;
    }

    public void setLrdetalletransportemontoanual(BigDecimal lrdetalletransportemontoanual) {
        this.lrdetalletransportemontoanual = lrdetalletransportemontoanual;
    }

    public String getLrdetalletransportetipo() {
        return lrdetalletransportetipo;
    }

    public void setLrdetalletransportetipo(String lrdetalletransportetipo) {
        this.lrdetalletransportetipo = lrdetalletransportetipo;
    }

    public String getLrdetalletransportenombre() {
        return lrdetalletransportenombre;
    }

    public void setLrdetalletransportenombre(String lrdetalletransportenombre) {
        this.lrdetalletransportenombre = lrdetalletransportenombre;
    }

    public Short getLrdetalletransporteanho() {
        return lrdetalletransporteanho;
    }

    public void setLrdetalletransporteanho(Short lrdetalletransporteanho) {
        this.lrdetalletransporteanho = lrdetalletransporteanho;
    }

    public String getLrdetalletransportematricula() {
        return lrdetalletransportematricula;
    }

    public void setLrdetalletransportematricula(String lrdetalletransportematricula) {
        this.lrdetalletransportematricula = lrdetalletransportematricula;
    }

    public String getLrdetalletransportemarcamotor() {
        return lrdetalletransportemarcamotor;
    }

    public void setLrdetalletransportemarcamotor(String lrdetalletransportemarcamotor) {
        this.lrdetalletransportemarcamotor = lrdetalletransportemarcamotor;
    }

    public String getLrdetalletransportemodpotencia() {
        return lrdetalletransportemodpotencia;
    }

    public void setLrdetalletransportemodpotencia(String lrdetalletransportemodpotencia) {
        this.lrdetalletransportemodpotencia = lrdetalletransportemodpotencia;
    }

    public String getLrdetalletransporteuso() {
        return lrdetalletransporteuso;
    }

    public void setLrdetalletransporteuso(String lrdetalletransporteuso) {
        this.lrdetalletransporteuso = lrdetalletransporteuso;
    }

    public Lrcotidatbienase getLrcotidatbienase() {
        return lrcotidatbienase;
    }

    public void setLrcotidatbienase(Lrcotidatbienase lrcotidatbienase) {
        this.lrcotidatbienase = lrcotidatbienase;
    }

    public Lrmediostransporte getLrmediostransporteid() {
        return lrmediostransporteid;
    }

    public void setLrmediostransporteid(Lrmediostransporte lrmediostransporteid) {
        this.lrmediostransporteid = lrmediostransporteid;
    }

    public Lrviatransporte getSlrviatransporteid() {
        return slrviatransporteid;
    }

    public void setSlrviatransporteid(Lrviatransporte slrviatransporteid) {
        this.slrviatransporteid = slrviatransporteid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrdetalletransporteid != null ? lrdetalletransporteid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrdetalletransporte)) {
            return false;
        }
        Lrdetalletransporte other = (Lrdetalletransporte) object;
        if ((this.lrdetalletransporteid == null && other.lrdetalletransporteid != null) || (this.lrdetalletransporteid != null && !this.lrdetalletransporteid.equals(other.lrdetalletransporteid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrdetalletransporte[ lrdetalletransporteid=" + lrdetalletransporteid + " ]";
    }
    
}
