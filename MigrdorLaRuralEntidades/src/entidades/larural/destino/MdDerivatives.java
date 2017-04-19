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
@Table(name = "MD_DERIVATIVES")
@NamedQueries({
    @NamedQuery(name = "MdDerivatives.findAll", query = "SELECT m FROM MdDerivatives m"),
    @NamedQuery(name = "MdDerivatives.findById", query = "SELECT m FROM MdDerivatives m WHERE m.id = :id"),
    @NamedQuery(name = "MdDerivatives.findBySrcId", query = "SELECT m FROM MdDerivatives m WHERE m.srcId = :srcId"),
    @NamedQuery(name = "MdDerivatives.findBySrcType", query = "SELECT m FROM MdDerivatives m WHERE m.srcType = :srcType"),
    @NamedQuery(name = "MdDerivatives.findByDerivedId", query = "SELECT m FROM MdDerivatives m WHERE m.derivedId = :derivedId"),
    @NamedQuery(name = "MdDerivatives.findByDerivedType", query = "SELECT m FROM MdDerivatives m WHERE m.derivedType = :derivedType"),
    @NamedQuery(name = "MdDerivatives.findByTransformed", query = "SELECT m FROM MdDerivatives m WHERE m.transformed = :transformed"),
    @NamedQuery(name = "MdDerivatives.findByOriginalIdentifier", query = "SELECT m FROM MdDerivatives m WHERE m.originalIdentifier = :originalIdentifier"),
    @NamedQuery(name = "MdDerivatives.findByNewIdentifier", query = "SELECT m FROM MdDerivatives m WHERE m.newIdentifier = :newIdentifier"),
    @NamedQuery(name = "MdDerivatives.findByDerivedObjectNamespace", query = "SELECT m FROM MdDerivatives m WHERE m.derivedObjectNamespace = :derivedObjectNamespace"),
    @NamedQuery(name = "MdDerivatives.findByDerivativeReason", query = "SELECT m FROM MdDerivatives m WHERE m.derivativeReason = :derivativeReason"),
    @NamedQuery(name = "MdDerivatives.findBySecurityGroupId", query = "SELECT m FROM MdDerivatives m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdDerivatives.findByCreatedOn", query = "SELECT m FROM MdDerivatives m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdDerivatives.findByCreatedBy", query = "SELECT m FROM MdDerivatives m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdDerivatives.findByLastUpdatedOn", query = "SELECT m FROM MdDerivatives m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MdDerivatives.findByLastUpdatedBy", query = "SELECT m FROM MdDerivatives m WHERE m.lastUpdatedBy = :lastUpdatedBy"),
    @NamedQuery(name = "MdDerivatives.findByEnabled", query = "SELECT m FROM MdDerivatives m WHERE m.enabled = :enabled")})
public class MdDerivatives implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "SRC_ID", nullable = false)
    private BigInteger srcId;
    @Column(name = "SRC_TYPE", length = 4000)
    private String srcType;
    @Basic(optional = false)
    @Column(name = "DERIVED_ID", nullable = false)
    private BigInteger derivedId;
    @Column(name = "DERIVED_TYPE", length = 4000)
    private String derivedType;
    @Column(name = "TRANSFORMED")
    private Character transformed;
    @Column(name = "ORIGINAL_IDENTIFIER", length = 4000)
    private String originalIdentifier;
    @Column(name = "NEW_IDENTIFIER", length = 4000)
    private String newIdentifier;
    @Column(name = "DERIVED_OBJECT_NAMESPACE", length = 40)
    private String derivedObjectNamespace;
    @Column(name = "DERIVATIVE_REASON", length = 10)
    private String derivativeReason;
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
    @Column(name = "ENABLED")
    private Character enabled;
    @JoinColumn(name = "DERIVED_CONNECTION_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdConnections derivedConnectionIdFk;

    public MdDerivatives() {
    }

    public MdDerivatives(BigDecimal id) {
        this.id = id;
    }

    public MdDerivatives(BigDecimal id, BigInteger srcId, BigInteger derivedId, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.srcId = srcId;
        this.derivedId = derivedId;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getSrcId() {
        return srcId;
    }

    public void setSrcId(BigInteger srcId) {
        this.srcId = srcId;
    }

    public String getSrcType() {
        return srcType;
    }

    public void setSrcType(String srcType) {
        this.srcType = srcType;
    }

    public BigInteger getDerivedId() {
        return derivedId;
    }

    public void setDerivedId(BigInteger derivedId) {
        this.derivedId = derivedId;
    }

    public String getDerivedType() {
        return derivedType;
    }

    public void setDerivedType(String derivedType) {
        this.derivedType = derivedType;
    }

    public Character getTransformed() {
        return transformed;
    }

    public void setTransformed(Character transformed) {
        this.transformed = transformed;
    }

    public String getOriginalIdentifier() {
        return originalIdentifier;
    }

    public void setOriginalIdentifier(String originalIdentifier) {
        this.originalIdentifier = originalIdentifier;
    }

    public String getNewIdentifier() {
        return newIdentifier;
    }

    public void setNewIdentifier(String newIdentifier) {
        this.newIdentifier = newIdentifier;
    }

    public String getDerivedObjectNamespace() {
        return derivedObjectNamespace;
    }

    public void setDerivedObjectNamespace(String derivedObjectNamespace) {
        this.derivedObjectNamespace = derivedObjectNamespace;
    }

    public String getDerivativeReason() {
        return derivativeReason;
    }

    public void setDerivativeReason(String derivativeReason) {
        this.derivativeReason = derivativeReason;
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

    public Character getEnabled() {
        return enabled;
    }

    public void setEnabled(Character enabled) {
        this.enabled = enabled;
    }

    public MdConnections getDerivedConnectionIdFk() {
        return derivedConnectionIdFk;
    }

    public void setDerivedConnectionIdFk(MdConnections derivedConnectionIdFk) {
        this.derivedConnectionIdFk = derivedConnectionIdFk;
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
        if (!(object instanceof MdDerivatives)) {
            return false;
        }
        MdDerivatives other = (MdDerivatives) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdDerivatives[ id=" + id + " ]";
    }
    
}
