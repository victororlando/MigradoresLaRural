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
@Table(name = "MD_MIGR_DEPENDENCY")
@NamedQueries({
    @NamedQuery(name = "MdMigrDependency.findAll", query = "SELECT m FROM MdMigrDependency m"),
    @NamedQuery(name = "MdMigrDependency.findById", query = "SELECT m FROM MdMigrDependency m WHERE m.id = :id"),
    @NamedQuery(name = "MdMigrDependency.findByParentId", query = "SELECT m FROM MdMigrDependency m WHERE m.parentId = :parentId"),
    @NamedQuery(name = "MdMigrDependency.findByChildId", query = "SELECT m FROM MdMigrDependency m WHERE m.childId = :childId"),
    @NamedQuery(name = "MdMigrDependency.findByParentObjectType", query = "SELECT m FROM MdMigrDependency m WHERE m.parentObjectType = :parentObjectType"),
    @NamedQuery(name = "MdMigrDependency.findByChildObjectType", query = "SELECT m FROM MdMigrDependency m WHERE m.childObjectType = :childObjectType"),
    @NamedQuery(name = "MdMigrDependency.findBySecurityGroupId", query = "SELECT m FROM MdMigrDependency m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdMigrDependency.findByCreatedOn", query = "SELECT m FROM MdMigrDependency m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdMigrDependency.findByCreatedBy", query = "SELECT m FROM MdMigrDependency m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdMigrDependency.findByLastUpdatedOn", query = "SELECT m FROM MdMigrDependency m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MdMigrDependency.findByLastUpdatedBy", query = "SELECT m FROM MdMigrDependency m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MdMigrDependency implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "PARENT_ID", nullable = false)
    private BigInteger parentId;
    @Basic(optional = false)
    @Column(name = "CHILD_ID", nullable = false)
    private BigInteger childId;
    @Basic(optional = false)
    @Column(name = "PARENT_OBJECT_TYPE", nullable = false, length = 4000)
    private String parentObjectType;
    @Basic(optional = false)
    @Column(name = "CHILD_OBJECT_TYPE", nullable = false, length = 4000)
    private String childObjectType;
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

    public MdMigrDependency() {
    }

    public MdMigrDependency(BigDecimal id) {
        this.id = id;
    }

    public MdMigrDependency(BigDecimal id, BigInteger parentId, BigInteger childId, String parentObjectType, String childObjectType, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.parentId = parentId;
        this.childId = childId;
        this.parentObjectType = parentObjectType;
        this.childObjectType = childObjectType;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getParentId() {
        return parentId;
    }

    public void setParentId(BigInteger parentId) {
        this.parentId = parentId;
    }

    public BigInteger getChildId() {
        return childId;
    }

    public void setChildId(BigInteger childId) {
        this.childId = childId;
    }

    public String getParentObjectType() {
        return parentObjectType;
    }

    public void setParentObjectType(String parentObjectType) {
        this.parentObjectType = parentObjectType;
    }

    public String getChildObjectType() {
        return childObjectType;
    }

    public void setChildObjectType(String childObjectType) {
        this.childObjectType = childObjectType;
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
        if (!(object instanceof MdMigrDependency)) {
            return false;
        }
        MdMigrDependency other = (MdMigrDependency) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdMigrDependency[ id=" + id + " ]";
    }
    
}
