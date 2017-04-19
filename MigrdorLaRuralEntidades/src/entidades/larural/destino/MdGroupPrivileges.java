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
@Table(name = "MD_GROUP_PRIVILEGES")
@NamedQueries({
    @NamedQuery(name = "MdGroupPrivileges.findAll", query = "SELECT m FROM MdGroupPrivileges m"),
    @NamedQuery(name = "MdGroupPrivileges.findById", query = "SELECT m FROM MdGroupPrivileges m WHERE m.id = :id"),
    @NamedQuery(name = "MdGroupPrivileges.findBySecurityGroupId", query = "SELECT m FROM MdGroupPrivileges m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdGroupPrivileges.findByCreatedOn", query = "SELECT m FROM MdGroupPrivileges m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdGroupPrivileges.findByCreatedBy", query = "SELECT m FROM MdGroupPrivileges m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdGroupPrivileges.findByLastUpdatedOn", query = "SELECT m FROM MdGroupPrivileges m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MdGroupPrivileges.findByLastUpdatedBy", query = "SELECT m FROM MdGroupPrivileges m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MdGroupPrivileges implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
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
    @JoinColumn(name = "GROUP_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdGroups groupIdFk;
    @JoinColumn(name = "PRIVILEGE_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdPrivileges privilegeIdFk;

    public MdGroupPrivileges() {
    }

    public MdGroupPrivileges(BigDecimal id) {
        this.id = id;
    }

    public MdGroupPrivileges(BigDecimal id, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
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

    public MdGroups getGroupIdFk() {
        return groupIdFk;
    }

    public void setGroupIdFk(MdGroups groupIdFk) {
        this.groupIdFk = groupIdFk;
    }

    public MdPrivileges getPrivilegeIdFk() {
        return privilegeIdFk;
    }

    public void setPrivilegeIdFk(MdPrivileges privilegeIdFk) {
        this.privilegeIdFk = privilegeIdFk;
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
        if (!(object instanceof MdGroupPrivileges)) {
            return false;
        }
        MdGroupPrivileges other = (MdGroupPrivileges) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdGroupPrivileges[ id=" + id + " ]";
    }
    
}
