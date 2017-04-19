/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "MD_ADDITIONAL_PROPERTIES")
@NamedQueries({
    @NamedQuery(name = "MdAdditionalProperties.findAll", query = "SELECT m FROM MdAdditionalProperties m"),
    @NamedQuery(name = "MdAdditionalProperties.findById", query = "SELECT m FROM MdAdditionalProperties m WHERE m.id = :id"),
    @NamedQuery(name = "MdAdditionalProperties.findByRefIdFk", query = "SELECT m FROM MdAdditionalProperties m WHERE m.refIdFk = :refIdFk"),
    @NamedQuery(name = "MdAdditionalProperties.findByRefType", query = "SELECT m FROM MdAdditionalProperties m WHERE m.refType = :refType"),
    @NamedQuery(name = "MdAdditionalProperties.findByPropertyOrder", query = "SELECT m FROM MdAdditionalProperties m WHERE m.propertyOrder = :propertyOrder"),
    @NamedQuery(name = "MdAdditionalProperties.findByPropKey", query = "SELECT m FROM MdAdditionalProperties m WHERE m.propKey = :propKey"),
    @NamedQuery(name = "MdAdditionalProperties.findByValue", query = "SELECT m FROM MdAdditionalProperties m WHERE m.value = :value"),
    @NamedQuery(name = "MdAdditionalProperties.findBySecurityGroupId", query = "SELECT m FROM MdAdditionalProperties m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdAdditionalProperties.findByCreatedOn", query = "SELECT m FROM MdAdditionalProperties m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdAdditionalProperties.findByCreatedBy", query = "SELECT m FROM MdAdditionalProperties m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdAdditionalProperties.findByLastUpdatedOn", query = "SELECT m FROM MdAdditionalProperties m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MdAdditionalProperties.findByLastUpdatedBy", query = "SELECT m FROM MdAdditionalProperties m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MdAdditionalProperties implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "REF_ID_FK", nullable = false)
    private BigInteger refIdFk;
    @Basic(optional = false)
    @Column(name = "REF_TYPE", nullable = false, length = 4000)
    private String refType;
    @Column(name = "PROPERTY_ORDER")
    private BigInteger propertyOrder;
    @Basic(optional = false)
    @Column(name = "PROP_KEY", nullable = false, length = 4000)
    private String propKey;
    @Column(name = "VALUE", length = 4000)
    private String value;
    @Basic(optional = false)
    @Column(name = "SECURITY_GROUP_ID", nullable = false)
    private BigInteger securityGroupId;
    @Basic(optional = false)
    @Column(name = "CREATED_ON", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "CREATED_BY", length = 255)
    private String createdBy;
    @Column(name = "LAST_UPDATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedOn;
    @Column(name = "LAST_UPDATED_BY", length = 255)
    private String lastUpdatedBy;
    @JoinColumn(name = "CONNECTION_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdConnections connectionIdFk;

    public MdAdditionalProperties() {
    }

    public MdAdditionalProperties(BigDecimal id) {
        this.id = id;
    }

    public MdAdditionalProperties(BigDecimal id, BigInteger refIdFk, String refType, String propKey, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.refIdFk = refIdFk;
        this.refType = refType;
        this.propKey = propKey;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getRefIdFk() {
        return refIdFk;
    }

    public void setRefIdFk(BigInteger refIdFk) {
        this.refIdFk = refIdFk;
    }

    public String getRefType() {
        return refType;
    }

    public void setRefType(String refType) {
        this.refType = refType;
    }

    public BigInteger getPropertyOrder() {
        return propertyOrder;
    }

    public void setPropertyOrder(BigInteger propertyOrder) {
        this.propertyOrder = propertyOrder;
    }

    public String getPropKey() {
        return propKey;
    }

    public void setPropKey(String propKey) {
        this.propKey = propKey;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public BigInteger getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(BigInteger securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(Date lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
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
        if (!(object instanceof MdAdditionalProperties)) {
            return false;
        }
        MdAdditionalProperties other = (MdAdditionalProperties) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdAdditionalProperties[ id=" + id + " ]";
    }
    
}
