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
@Table(name = "MD_MIGR_PARAMETER")
@NamedQueries({
    @NamedQuery(name = "MdMigrParameter.findAll", query = "SELECT m FROM MdMigrParameter m"),
    @NamedQuery(name = "MdMigrParameter.findById", query = "SELECT m FROM MdMigrParameter m WHERE m.id = :id"),
    @NamedQuery(name = "MdMigrParameter.findByObjectId", query = "SELECT m FROM MdMigrParameter m WHERE m.objectId = :objectId"),
    @NamedQuery(name = "MdMigrParameter.findByObjectType", query = "SELECT m FROM MdMigrParameter m WHERE m.objectType = :objectType"),
    @NamedQuery(name = "MdMigrParameter.findByParamExisting", query = "SELECT m FROM MdMigrParameter m WHERE m.paramExisting = :paramExisting"),
    @NamedQuery(name = "MdMigrParameter.findByParamOrder", query = "SELECT m FROM MdMigrParameter m WHERE m.paramOrder = :paramOrder"),
    @NamedQuery(name = "MdMigrParameter.findByParamName", query = "SELECT m FROM MdMigrParameter m WHERE m.paramName = :paramName"),
    @NamedQuery(name = "MdMigrParameter.findByParamType", query = "SELECT m FROM MdMigrParameter m WHERE m.paramType = :paramType"),
    @NamedQuery(name = "MdMigrParameter.findByParamDataType", query = "SELECT m FROM MdMigrParameter m WHERE m.paramDataType = :paramDataType"),
    @NamedQuery(name = "MdMigrParameter.findByPercision", query = "SELECT m FROM MdMigrParameter m WHERE m.percision = :percision"),
    @NamedQuery(name = "MdMigrParameter.findByScale", query = "SELECT m FROM MdMigrParameter m WHERE m.scale = :scale"),
    @NamedQuery(name = "MdMigrParameter.findByNullable", query = "SELECT m FROM MdMigrParameter m WHERE m.nullable = :nullable"),
    @NamedQuery(name = "MdMigrParameter.findByDefaultValue", query = "SELECT m FROM MdMigrParameter m WHERE m.defaultValue = :defaultValue"),
    @NamedQuery(name = "MdMigrParameter.findBySecurityGroupId", query = "SELECT m FROM MdMigrParameter m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdMigrParameter.findByCreatedOn", query = "SELECT m FROM MdMigrParameter m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdMigrParameter.findByCreatedBy", query = "SELECT m FROM MdMigrParameter m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdMigrParameter.findByLastUpdatedOn", query = "SELECT m FROM MdMigrParameter m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MdMigrParameter.findByLastUpdatedBy", query = "SELECT m FROM MdMigrParameter m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MdMigrParameter implements Serializable {
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
    @Column(name = "PARAM_EXISTING", nullable = false)
    private BigInteger paramExisting;
    @Basic(optional = false)
    @Column(name = "PARAM_ORDER", nullable = false)
    private BigInteger paramOrder;
    @Basic(optional = false)
    @Column(name = "PARAM_NAME", nullable = false, length = 4000)
    private String paramName;
    @Basic(optional = false)
    @Column(name = "PARAM_TYPE", nullable = false, length = 4000)
    private String paramType;
    @Basic(optional = false)
    @Column(name = "PARAM_DATA_TYPE", nullable = false, length = 4000)
    private String paramDataType;
    @Column(name = "PERCISION")
    private BigInteger percision;
    @Column(name = "SCALE")
    private BigInteger scale;
    @Basic(optional = false)
    @Column(name = "NULLABLE", nullable = false)
    private Character nullable;
    @Column(name = "DEFAULT_VALUE", length = 4000)
    private String defaultValue;
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

    public MdMigrParameter() {
    }

    public MdMigrParameter(BigDecimal id) {
        this.id = id;
    }

    public MdMigrParameter(BigDecimal id, BigInteger objectId, String objectType, BigInteger paramExisting, BigInteger paramOrder, String paramName, String paramType, String paramDataType, Character nullable, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.objectId = objectId;
        this.objectType = objectType;
        this.paramExisting = paramExisting;
        this.paramOrder = paramOrder;
        this.paramName = paramName;
        this.paramType = paramType;
        this.paramDataType = paramDataType;
        this.nullable = nullable;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
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

    public BigInteger getParamExisting() {
        return paramExisting;
    }

    public void setParamExisting(BigInteger paramExisting) {
        this.paramExisting = paramExisting;
    }

    public BigInteger getParamOrder() {
        return paramOrder;
    }

    public void setParamOrder(BigInteger paramOrder) {
        this.paramOrder = paramOrder;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamType() {
        return paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    public String getParamDataType() {
        return paramDataType;
    }

    public void setParamDataType(String paramDataType) {
        this.paramDataType = paramDataType;
    }

    public BigInteger getPercision() {
        return percision;
    }

    public void setPercision(BigInteger percision) {
        this.percision = percision;
    }

    public BigInteger getScale() {
        return scale;
    }

    public void setScale(BigInteger scale) {
        this.scale = scale;
    }

    public Character getNullable() {
        return nullable;
    }

    public void setNullable(Character nullable) {
        this.nullable = nullable;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
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
        if (!(object instanceof MdMigrParameter)) {
            return false;
        }
        MdMigrParameter other = (MdMigrParameter) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdMigrParameter[ id=" + id + " ]";
    }
    
}
