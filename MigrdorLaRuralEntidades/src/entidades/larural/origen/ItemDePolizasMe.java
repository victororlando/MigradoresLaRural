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
@Table(name = "ITEM_DE_POLIZAS_ME", schema = "SOFTTEN")
@NamedQueries({
    @NamedQuery(name = "ItemDePolizasMe.findAll", query = "SELECT i FROM ItemDePolizasMe i"),
    @NamedQuery(name = "ItemDePolizasMe.findByEjercicio", query = "SELECT i FROM ItemDePolizasMe i WHERE i.itemDePolizasMePK.ejercicio = :ejercicio"),
    @NamedQuery(name = "ItemDePolizasMe.findBySecc", query = "SELECT i FROM ItemDePolizasMe i WHERE i.itemDePolizasMePK.secc = :secc"),
    @NamedQuery(name = "ItemDePolizasMe.findByPolnro", query = "SELECT i FROM ItemDePolizasMe i WHERE i.itemDePolizasMePK.polnro = :polnro"),
    @NamedQuery(name = "ItemDePolizasMe.findByAnexo", query = "SELECT i FROM ItemDePolizasMe i WHERE i.itemDePolizasMePK.anexo = :anexo"),
    @NamedQuery(name = "ItemDePolizasMe.findByTipoOperacion", query = "SELECT i FROM ItemDePolizasMe i WHERE i.itemDePolizasMePK.tipoOperacion = :tipoOperacion"),
    @NamedQuery(name = "ItemDePolizasMe.findByTipoSeguro", query = "SELECT i FROM ItemDePolizasMe i WHERE i.itemDePolizasMePK.tipoSeguro = :tipoSeguro"),
    @NamedQuery(name = "ItemDePolizasMe.findByItem", query = "SELECT i FROM ItemDePolizasMe i WHERE i.itemDePolizasMePK.item = :item"),
    @NamedQuery(name = "ItemDePolizasMe.findBySumaseg", query = "SELECT i FROM ItemDePolizasMe i WHERE i.sumaseg = :sumaseg"),
    @NamedQuery(name = "ItemDePolizasMe.findByPrima", query = "SELECT i FROM ItemDePolizasMe i WHERE i.prima = :prima")})
public class ItemDePolizasMe implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ItemDePolizasMePK itemDePolizasMePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "SUMASEG", nullable = false, precision = 15, scale = 2)
    private BigDecimal sumaseg;
    @Basic(optional = false)
    @Column(name = "PRIMA", nullable = false, precision = 15, scale = 2)
    private BigDecimal prima;
    @JoinColumns({
        @JoinColumn(name = "EJERCICIO", referencedColumnName = "EJERCICIO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "TIPO_SEGURO", referencedColumnName = "TIPO_SEGURO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "TIPO_OPERACION", referencedColumnName = "TIPO_OPERACION", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "SECC", referencedColumnName = "SECC", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "POLNRO", referencedColumnName = "POLNRO", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "ANEXO", referencedColumnName = "ANEXO", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Polsdemi polsdemi;

    public ItemDePolizasMe() {
    }

    public ItemDePolizasMe(ItemDePolizasMePK itemDePolizasMePK) {
        this.itemDePolizasMePK = itemDePolizasMePK;
    }

    public ItemDePolizasMe(ItemDePolizasMePK itemDePolizasMePK, BigDecimal sumaseg, BigDecimal prima) {
        this.itemDePolizasMePK = itemDePolizasMePK;
        this.sumaseg = sumaseg;
        this.prima = prima;
    }

    public ItemDePolizasMe(short ejercicio, short secc, int polnro, short anexo, short tipoOperacion, short tipoSeguro, int item) {
        this.itemDePolizasMePK = new ItemDePolizasMePK(ejercicio, secc, polnro, anexo, tipoOperacion, tipoSeguro, item);
    }

    public ItemDePolizasMePK getItemDePolizasMePK() {
        return itemDePolizasMePK;
    }

    public void setItemDePolizasMePK(ItemDePolizasMePK itemDePolizasMePK) {
        this.itemDePolizasMePK = itemDePolizasMePK;
    }

    public BigDecimal getSumaseg() {
        return sumaseg;
    }

    public void setSumaseg(BigDecimal sumaseg) {
        this.sumaseg = sumaseg;
    }

    public BigDecimal getPrima() {
        return prima;
    }

    public void setPrima(BigDecimal prima) {
        this.prima = prima;
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
        hash += (itemDePolizasMePK != null ? itemDePolizasMePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemDePolizasMe)) {
            return false;
        }
        ItemDePolizasMe other = (ItemDePolizasMe) object;
        if ((this.itemDePolizasMePK == null && other.itemDePolizasMePK != null) || (this.itemDePolizasMePK != null && !this.itemDePolizasMePK.equals(other.itemDePolizasMePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.ItemDePolizasMe[ itemDePolizasMePK=" + itemDePolizasMePK + " ]";
    }
    
}
