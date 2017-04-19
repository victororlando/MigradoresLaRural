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
@Table(name = "MIGR_DATATYPE_TRANSFORM_RULE")
@NamedQueries({
    @NamedQuery(name = "MigrDatatypeTransformRule.findAll", query = "SELECT m FROM MigrDatatypeTransformRule m"),
    @NamedQuery(name = "MigrDatatypeTransformRule.findById", query = "SELECT m FROM MigrDatatypeTransformRule m WHERE m.id = :id"),
    @NamedQuery(name = "MigrDatatypeTransformRule.findBySourceDataTypeName", query = "SELECT m FROM MigrDatatypeTransformRule m WHERE m.sourceDataTypeName = :sourceDataTypeName"),
    @NamedQuery(name = "MigrDatatypeTransformRule.findBySourcePrecision", query = "SELECT m FROM MigrDatatypeTransformRule m WHERE m.sourcePrecision = :sourcePrecision"),
    @NamedQuery(name = "MigrDatatypeTransformRule.findBySourceScale", query = "SELECT m FROM MigrDatatypeTransformRule m WHERE m.sourceScale = :sourceScale"),
    @NamedQuery(name = "MigrDatatypeTransformRule.findByTargetDataTypeName", query = "SELECT m FROM MigrDatatypeTransformRule m WHERE m.targetDataTypeName = :targetDataTypeName"),
    @NamedQuery(name = "MigrDatatypeTransformRule.findByTargetPrecision", query = "SELECT m FROM MigrDatatypeTransformRule m WHERE m.targetPrecision = :targetPrecision"),
    @NamedQuery(name = "MigrDatatypeTransformRule.findByTargetScale", query = "SELECT m FROM MigrDatatypeTransformRule m WHERE m.targetScale = :targetScale"),
    @NamedQuery(name = "MigrDatatypeTransformRule.findBySecurityGroupId", query = "SELECT m FROM MigrDatatypeTransformRule m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MigrDatatypeTransformRule.findByCreatedOn", query = "SELECT m FROM MigrDatatypeTransformRule m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MigrDatatypeTransformRule.findByCreatedBy", query = "SELECT m FROM MigrDatatypeTransformRule m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MigrDatatypeTransformRule.findByLastUpdatedOn", query = "SELECT m FROM MigrDatatypeTransformRule m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MigrDatatypeTransformRule.findByLastUpdatedBy", query = "SELECT m FROM MigrDatatypeTransformRule m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MigrDatatypeTransformRule implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "SOURCE_DATA_TYPE_NAME", nullable = false, length = 4000)
    private String sourceDataTypeName;
    @Column(name = "SOURCE_PRECISION")
    private BigInteger sourcePrecision;
    @Column(name = "SOURCE_SCALE")
    private BigInteger sourceScale;
    @Basic(optional = false)
    @Column(name = "TARGET_DATA_TYPE_NAME", nullable = false, length = 4000)
    private String targetDataTypeName;
    @Column(name = "TARGET_PRECISION")
    private BigInteger targetPrecision;
    @Column(name = "TARGET_SCALE")
    private BigInteger targetScale;
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
    @JoinColumn(name = "MAP_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MigrDatatypeTransformMap mapIdFk;

    public MigrDatatypeTransformRule() {
    }

    public MigrDatatypeTransformRule(BigDecimal id) {
        this.id = id;
    }

    public MigrDatatypeTransformRule(BigDecimal id, String sourceDataTypeName, String targetDataTypeName, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.sourceDataTypeName = sourceDataTypeName;
        this.targetDataTypeName = targetDataTypeName;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getSourceDataTypeName() {
        return sourceDataTypeName;
    }

    public void setSourceDataTypeName(String sourceDataTypeName) {
        this.sourceDataTypeName = sourceDataTypeName;
    }

    public BigInteger getSourcePrecision() {
        return sourcePrecision;
    }

    public void setSourcePrecision(BigInteger sourcePrecision) {
        this.sourcePrecision = sourcePrecision;
    }

    public BigInteger getSourceScale() {
        return sourceScale;
    }

    public void setSourceScale(BigInteger sourceScale) {
        this.sourceScale = sourceScale;
    }

    public String getTargetDataTypeName() {
        return targetDataTypeName;
    }

    public void setTargetDataTypeName(String targetDataTypeName) {
        this.targetDataTypeName = targetDataTypeName;
    }

    public BigInteger getTargetPrecision() {
        return targetPrecision;
    }

    public void setTargetPrecision(BigInteger targetPrecision) {
        this.targetPrecision = targetPrecision;
    }

    public BigInteger getTargetScale() {
        return targetScale;
    }

    public void setTargetScale(BigInteger targetScale) {
        this.targetScale = targetScale;
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

    public MigrDatatypeTransformMap getMapIdFk() {
        return mapIdFk;
    }

    public void setMapIdFk(MigrDatatypeTransformMap mapIdFk) {
        this.mapIdFk = mapIdFk;
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
        if (!(object instanceof MigrDatatypeTransformRule)) {
            return false;
        }
        MigrDatatypeTransformRule other = (MigrDatatypeTransformRule) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MigrDatatypeTransformRule[ id=" + id + " ]";
    }
    
}
