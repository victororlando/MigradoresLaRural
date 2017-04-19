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
import javax.persistence.Lob;
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
@Table(name = "MD_USER_DEFINED_DATA_TYPES")
@NamedQueries({
    @NamedQuery(name = "MdUserDefinedDataTypes.findAll", query = "SELECT m FROM MdUserDefinedDataTypes m"),
    @NamedQuery(name = "MdUserDefinedDataTypes.findById", query = "SELECT m FROM MdUserDefinedDataTypes m WHERE m.id = :id"),
    @NamedQuery(name = "MdUserDefinedDataTypes.findByDataTypeName", query = "SELECT m FROM MdUserDefinedDataTypes m WHERE m.dataTypeName = :dataTypeName"),
    @NamedQuery(name = "MdUserDefinedDataTypes.findByDefinition", query = "SELECT m FROM MdUserDefinedDataTypes m WHERE m.definition = :definition"),
    @NamedQuery(name = "MdUserDefinedDataTypes.findByNativeKey", query = "SELECT m FROM MdUserDefinedDataTypes m WHERE m.nativeKey = :nativeKey"),
    @NamedQuery(name = "MdUserDefinedDataTypes.findByComments", query = "SELECT m FROM MdUserDefinedDataTypes m WHERE m.comments = :comments"),
    @NamedQuery(name = "MdUserDefinedDataTypes.findBySecurityGroupId", query = "SELECT m FROM MdUserDefinedDataTypes m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdUserDefinedDataTypes.findByCreatedOn", query = "SELECT m FROM MdUserDefinedDataTypes m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdUserDefinedDataTypes.findByCreatedBy", query = "SELECT m FROM MdUserDefinedDataTypes m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdUserDefinedDataTypes.findByLastUpdatedOn", query = "SELECT m FROM MdUserDefinedDataTypes m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MdUserDefinedDataTypes.findByLastUpdatedBy", query = "SELECT m FROM MdUserDefinedDataTypes m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MdUserDefinedDataTypes implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "DATA_TYPE_NAME", nullable = false, length = 4000)
    private String dataTypeName;
    @Basic(optional = false)
    @Column(name = "DEFINITION", nullable = false, length = 4000)
    private String definition;
    @Basic(optional = false)
    @Lob
    @Column(name = "NATIVE_SQL", nullable = false)
    private String nativeSql;
    @Column(name = "NATIVE_KEY", length = 4000)
    private String nativeKey;
    @Column(name = "COMMENTS", length = 4000)
    private String comments;
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
    @JoinColumn(name = "SCHEMA_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdSchemas schemaIdFk;

    public MdUserDefinedDataTypes() {
    }

    public MdUserDefinedDataTypes(BigDecimal id) {
        this.id = id;
    }

    public MdUserDefinedDataTypes(BigDecimal id, String dataTypeName, String definition, String nativeSql, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.dataTypeName = dataTypeName;
        this.definition = definition;
        this.nativeSql = nativeSql;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getDataTypeName() {
        return dataTypeName;
    }

    public void setDataTypeName(String dataTypeName) {
        this.dataTypeName = dataTypeName;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getNativeSql() {
        return nativeSql;
    }

    public void setNativeSql(String nativeSql) {
        this.nativeSql = nativeSql;
    }

    public String getNativeKey() {
        return nativeKey;
    }

    public void setNativeKey(String nativeKey) {
        this.nativeKey = nativeKey;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public MdSchemas getSchemaIdFk() {
        return schemaIdFk;
    }

    public void setSchemaIdFk(MdSchemas schemaIdFk) {
        this.schemaIdFk = schemaIdFk;
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
        if (!(object instanceof MdUserDefinedDataTypes)) {
            return false;
        }
        MdUserDefinedDataTypes other = (MdUserDefinedDataTypes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdUserDefinedDataTypes[ id=" + id + " ]";
    }
    
}
