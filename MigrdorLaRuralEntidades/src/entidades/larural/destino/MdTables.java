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
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "MD_TABLES")
@NamedQueries({
    @NamedQuery(name = "MdTables.findAll", query = "SELECT m FROM MdTables m"),
    @NamedQuery(name = "MdTables.findById", query = "SELECT m FROM MdTables m WHERE m.id = :id"),
    @NamedQuery(name = "MdTables.findByTableName", query = "SELECT m FROM MdTables m WHERE m.tableName = :tableName"),
    @NamedQuery(name = "MdTables.findByNativeKey", query = "SELECT m FROM MdTables m WHERE m.nativeKey = :nativeKey"),
    @NamedQuery(name = "MdTables.findByQualifiedNativeName", query = "SELECT m FROM MdTables m WHERE m.qualifiedNativeName = :qualifiedNativeName"),
    @NamedQuery(name = "MdTables.findByComments", query = "SELECT m FROM MdTables m WHERE m.comments = :comments"),
    @NamedQuery(name = "MdTables.findBySecurityGroupId", query = "SELECT m FROM MdTables m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdTables.findByCreatedOn", query = "SELECT m FROM MdTables m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdTables.findByCreatedBy", query = "SELECT m FROM MdTables m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdTables.findByLastUpdatedOn", query = "SELECT m FROM MdTables m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MdTables.findByLastUpdatedBy", query = "SELECT m FROM MdTables m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MdTables implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "TABLE_NAME", nullable = false, length = 4000)
    private String tableName;
    @Lob
    @Column(name = "NATIVE_SQL")
    private String nativeSql;
    @Column(name = "NATIVE_KEY", length = 4000)
    private String nativeKey;
    @Basic(optional = false)
    @Column(name = "QUALIFIED_NATIVE_NAME", nullable = false, length = 4000)
    private String qualifiedNativeName;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tableIdFk")
    private List<MdConstraints> mdConstraintsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tableIdFk")
    private List<MdPartitions> mdPartitionsList;
    @JoinColumn(name = "SCHEMA_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdSchemas schemaIdFk;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tableIdFk")
    private List<MdColumns> mdColumnsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tableIdFk")
    private List<MdIndexes> mdIndexesList;

    public MdTables() {
    }

    public MdTables(BigDecimal id) {
        this.id = id;
    }

    public MdTables(BigDecimal id, String tableName, String qualifiedNativeName, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.tableName = tableName;
        this.qualifiedNativeName = qualifiedNativeName;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
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

    public String getQualifiedNativeName() {
        return qualifiedNativeName;
    }

    public void setQualifiedNativeName(String qualifiedNativeName) {
        this.qualifiedNativeName = qualifiedNativeName;
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

    public List<MdConstraints> getMdConstraintsList() {
        return mdConstraintsList;
    }

    public void setMdConstraintsList(List<MdConstraints> mdConstraintsList) {
        this.mdConstraintsList = mdConstraintsList;
    }

    public List<MdPartitions> getMdPartitionsList() {
        return mdPartitionsList;
    }

    public void setMdPartitionsList(List<MdPartitions> mdPartitionsList) {
        this.mdPartitionsList = mdPartitionsList;
    }

    public MdSchemas getSchemaIdFk() {
        return schemaIdFk;
    }

    public void setSchemaIdFk(MdSchemas schemaIdFk) {
        this.schemaIdFk = schemaIdFk;
    }

    public List<MdColumns> getMdColumnsList() {
        return mdColumnsList;
    }

    public void setMdColumnsList(List<MdColumns> mdColumnsList) {
        this.mdColumnsList = mdColumnsList;
    }

    public List<MdIndexes> getMdIndexesList() {
        return mdIndexesList;
    }

    public void setMdIndexesList(List<MdIndexes> mdIndexesList) {
        this.mdIndexesList = mdIndexesList;
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
        if (!(object instanceof MdTables)) {
            return false;
        }
        MdTables other = (MdTables) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdTables[ id=" + id + " ]";
    }
    
}
