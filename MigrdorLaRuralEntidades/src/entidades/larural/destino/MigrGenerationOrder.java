/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "MIGR_GENERATION_ORDER", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"OBJECT_ID"})})
@NamedQueries({
    @NamedQuery(name = "MigrGenerationOrder.findAll", query = "SELECT m FROM MigrGenerationOrder m"),
    @NamedQuery(name = "MigrGenerationOrder.findById", query = "SELECT m FROM MigrGenerationOrder m WHERE m.id = :id"),
    @NamedQuery(name = "MigrGenerationOrder.findByObjectId", query = "SELECT m FROM MigrGenerationOrder m WHERE m.objectId = :objectId"),
    @NamedQuery(name = "MigrGenerationOrder.findByObjectType", query = "SELECT m FROM MigrGenerationOrder m WHERE m.objectType = :objectType"),
    @NamedQuery(name = "MigrGenerationOrder.findByGenerationOrder", query = "SELECT m FROM MigrGenerationOrder m WHERE m.generationOrder = :generationOrder")})
public class MigrGenerationOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "OBJECT_ID", nullable = false)
    private BigInteger objectId;
    @Basic(optional = false)
    @Column(name = "OBJECT_TYPE", nullable = false, length = 4000)
    private String objectType;
    @Basic(optional = false)
    @Column(name = "GENERATION_ORDER", nullable = false)
    private BigInteger generationOrder;
    @JoinColumn(name = "CONNECTION_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdConnections connectionIdFk;

    public MigrGenerationOrder() {
    }

    public MigrGenerationOrder(BigDecimal id) {
        this.id = id;
    }

    public MigrGenerationOrder(BigDecimal id, BigInteger objectId, String objectType, BigInteger generationOrder) {
        this.id = id;
        this.objectId = objectId;
        this.objectType = objectType;
        this.generationOrder = generationOrder;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getObjectId() {
        return objectId;
    }

    public void setObjectId(BigInteger objectId) {
        this.objectId = objectId;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public BigInteger getGenerationOrder() {
        return generationOrder;
    }

    public void setGenerationOrder(BigInteger generationOrder) {
        this.generationOrder = generationOrder;
    }

    public MdConnections getConnectionIdFk() {
        return connectionIdFk;
    }

    public void setConnectionIdFk(MdConnections connectionIdFk) {
        this.connectionIdFk = connectionIdFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MigrGenerationOrder)) {
            return false;
        }
        MigrGenerationOrder other = (MigrGenerationOrder) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MigrGenerationOrder[ id=" + id + " ]";
    }
    
}
