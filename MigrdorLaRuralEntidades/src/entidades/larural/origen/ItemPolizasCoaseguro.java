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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "ITEM_POLIZAS_COASEGURO", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "ItemPolizasCoaseguro.findAll", query = "SELECT i FROM ItemPolizasCoaseguro i"),
    @NamedQuery(name = "ItemPolizasCoaseguro.findByEjercicio", query = "SELECT i FROM ItemPolizasCoaseguro i WHERE i.itemPolizasCoaseguroPK.ejercicio = :ejercicio"),
    @NamedQuery(name = "ItemPolizasCoaseguro.findByTipoOperacion", query = "SELECT i FROM ItemPolizasCoaseguro i WHERE i.itemPolizasCoaseguroPK.tipoOperacion = :tipoOperacion"),
    @NamedQuery(name = "ItemPolizasCoaseguro.findByTipoSeguro", query = "SELECT i FROM ItemPolizasCoaseguro i WHERE i.itemPolizasCoaseguroPK.tipoSeguro = :tipoSeguro"),
    @NamedQuery(name = "ItemPolizasCoaseguro.findBySecc", query = "SELECT i FROM ItemPolizasCoaseguro i WHERE i.itemPolizasCoaseguroPK.secc = :secc"),
    @NamedQuery(name = "ItemPolizasCoaseguro.findByPolnro", query = "SELECT i FROM ItemPolizasCoaseguro i WHERE i.itemPolizasCoaseguroPK.polnro = :polnro"),
    @NamedQuery(name = "ItemPolizasCoaseguro.findByAnexo", query = "SELECT i FROM ItemPolizasCoaseguro i WHERE i.itemPolizasCoaseguroPK.anexo = :anexo"),
    @NamedQuery(name = "ItemPolizasCoaseguro.findByItem", query = "SELECT i FROM ItemPolizasCoaseguro i WHERE i.itemPolizasCoaseguroPK.item = :item"),
    @NamedQuery(name = "ItemPolizasCoaseguro.findBySumaseg", query = "SELECT i FROM ItemPolizasCoaseguro i WHERE i.sumaseg = :sumaseg"),
    @NamedQuery(name = "ItemPolizasCoaseguro.findByPrima", query = "SELECT i FROM ItemPolizasCoaseguro i WHERE i.prima = :prima"),
    @NamedQuery(name = "ItemPolizasCoaseguro.findBySumasegMe", query = "SELECT i FROM ItemPolizasCoaseguro i WHERE i.sumasegMe = :sumasegMe"),
    @NamedQuery(name = "ItemPolizasCoaseguro.findByPrimaMe", query = "SELECT i FROM ItemPolizasCoaseguro i WHERE i.primaMe = :primaMe")})
public class ItemPolizasCoaseguro implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ItemPolizasCoaseguroPK itemPolizasCoaseguroPK;
    @Basic(optional = false)
    @Column(name = "SUMASEG", nullable = false)
    private long sumaseg;
    @Basic(optional = false)
    @Column(name = "PRIMA", nullable = false)
    private long prima;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "SUMASEG_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal sumasegMe;
    @Basic(optional = false)
    @Column(name = "PRIMA_ME", nullable = false, precision = 15, scale = 2)
    private BigDecimal primaMe;
    @JoinColumns({
        @JoinColumn(name = "TIPO_OPERACION", referencedColumnName = "TIPO_OPERACION", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "EJERCICIO", referencedColumnName = "EJERCICIO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "SECC", referencedColumnName = "SECC", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "POLNRO", referencedColumnName = "POLNRO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "ANEXO", referencedColumnName = "ANEXO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "TIPO_SEGURO", referencedColumnName = "TIPO_SEGURO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "ITEM", referencedColumnName = "ITEM", nullable = false, insertable = false, updatable = false)})
    @OneToOne(optional = false)
    private ItemDePolizas itemDePolizas;
    @JoinColumns({
        @JoinColumn(name = "EJERCICIO", referencedColumnName = "EJERCICIO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "TIPO_SEGURO", referencedColumnName = "TIPO_SEGURO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "TIPO_OPERACION", referencedColumnName = "TIPO_OPERACION", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "SECC", referencedColumnName = "SECC", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "POLNRO", referencedColumnName = "POLNRO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "ANEXO", referencedColumnName = "ANEXO", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Policoase policoase;
    @JoinColumns({
        @JoinColumn(name = "EJERCICIO", referencedColumnName = "EJERCICIO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "TIPO_SEGURO", referencedColumnName = "TIPO_SEGURO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "TIPO_OPERACION", referencedColumnName = "TIPO_OPERACION", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "SECC", referencedColumnName = "SECC", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "POLNRO", referencedColumnName = "POLNRO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "ANEXO", referencedColumnName = "ANEXO", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Polsdemi polsdemi;

    public ItemPolizasCoaseguro() {
    }

    public ItemPolizasCoaseguro(ItemPolizasCoaseguroPK itemPolizasCoaseguroPK) {
        this.itemPolizasCoaseguroPK = itemPolizasCoaseguroPK;
    }

    public ItemPolizasCoaseguro(ItemPolizasCoaseguroPK itemPolizasCoaseguroPK, long sumaseg, long prima, BigDecimal sumasegMe, BigDecimal primaMe) {
        this.itemPolizasCoaseguroPK = itemPolizasCoaseguroPK;
        this.sumaseg = sumaseg;
        this.prima = prima;
        this.sumasegMe = sumasegMe;
        this.primaMe = primaMe;
    }

    public ItemPolizasCoaseguro(short ejercicio, short tipoOperacion, short tipoSeguro, short secc, int polnro, short anexo, int item) {
        this.itemPolizasCoaseguroPK = new ItemPolizasCoaseguroPK(ejercicio, tipoOperacion, tipoSeguro, secc, polnro, anexo, item);
    }

    public ItemPolizasCoaseguroPK getItemPolizasCoaseguroPK() {
        return itemPolizasCoaseguroPK;
    }

    public void setItemPolizasCoaseguroPK(ItemPolizasCoaseguroPK itemPolizasCoaseguroPK) {
        this.itemPolizasCoaseguroPK = itemPolizasCoaseguroPK;
    }

    public long getSumaseg() {
        return sumaseg;
    }

    public void setSumaseg(long sumaseg) {
        this.sumaseg = sumaseg;
    }

    public long getPrima() {
        return prima;
    }

    public void setPrima(long prima) {
        this.prima = prima;
    }

    public BigDecimal getSumasegMe() {
        return sumasegMe;
    }

    public void setSumasegMe(BigDecimal sumasegMe) {
        this.sumasegMe = sumasegMe;
    }

    public BigDecimal getPrimaMe() {
        return primaMe;
    }

    public void setPrimaMe(BigDecimal primaMe) {
        this.primaMe = primaMe;
    }

    public ItemDePolizas getItemDePolizas() {
        return itemDePolizas;
    }

    public void setItemDePolizas(ItemDePolizas itemDePolizas) {
        this.itemDePolizas = itemDePolizas;
    }

    public Policoase getPolicoase() {
        return policoase;
    }

    public void setPolicoase(Policoase policoase) {
        this.policoase = policoase;
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
        hash += (itemPolizasCoaseguroPK != null ? itemPolizasCoaseguroPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemPolizasCoaseguro)) {
            return false;
        }
        ItemPolizasCoaseguro other = (ItemPolizasCoaseguro) object;
        if ((this.itemPolizasCoaseguroPK == null && other.itemPolizasCoaseguroPK != null) || (this.itemPolizasCoaseguroPK != null && !this.itemPolizasCoaseguroPK.equals(other.itemPolizasCoaseguroPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.ItemPolizasCoaseguro[ itemPolizasCoaseguroPK=" + itemPolizasCoaseguroPK + " ]";
    }
    
}
