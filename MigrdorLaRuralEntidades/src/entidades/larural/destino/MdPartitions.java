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
@Table(name = "MD_PARTITIONS")
@NamedQueries({
    @NamedQuery(name = "MdPartitions.findAll", query = "SELECT m FROM MdPartitions m"),
    @NamedQuery(name = "MdPartitions.findById", query = "SELECT m FROM MdPartitions m WHERE m.id = :id"),
    @NamedQuery(name = "MdPartitions.findByPartitionExpression", query = "SELECT m FROM MdPartitions m WHERE m.partitionExpression = :partitionExpression"),
    @NamedQuery(name = "MdPartitions.findByComments", query = "SELECT m FROM MdPartitions m WHERE m.comments = :comments"),
    @NamedQuery(name = "MdPartitions.findBySecurityGroupId", query = "SELECT m FROM MdPartitions m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdPartitions.findByCreatedBy", query = "SELECT m FROM MdPartitions m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdPartitions.findByCreatedOn", query = "SELECT m FROM MdPartitions m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdPartitions.findByLastUpdatedBy", query = "SELECT m FROM MdPartitions m WHERE m.lastUpdatedBy = :lastUpdatedBy"),
    @NamedQuery(name = "MdPartitions.findByLastUpdatedOn", query = "SELECT m FROM MdPartitions m WHERE m.lastUpdatedOn = :lastUpdatedOn")})
public class MdPartitions implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Lob
    @Column(name = "NATIVE_SQL")
    private String nativeSql;
    @Column(name = "PARTITION_EXPRESSION", length = 4000)
    private String partitionExpression;
    @Column(name = "COMMENTS", length = 4000)
    private String comments;
    @Basic(optional = false)
    @Column(name = "SECURITY_GROUP_ID", nullable = false)
    private BigInteger securityGroupId;
    @Column(name = "CREATED_BY", length = 255)
    private String createdBy;
    @Basic(optional = false)
    @Column(name = "CREATED_ON", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "LAST_UPDATED_BY", length = 255)
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedOn;
    @JoinColumn(name = "TABLE_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdTables tableIdFk;

    public MdPartitions() {
    }

    public MdPartitions(BigDecimal id) {
        this.id = id;
    }

    public MdPartitions(BigDecimal id, BigInteger securityGroupId, Date createdOn) {
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

    public String getNativeSql() {
        return nativeSql;
    }

    public void setNativeSql(String nativeSql) {
        this.nativeSql = nativeSql;
    }

    public String getPartitionExpression() {
        return partitionExpression;
    }

    public void setPartitionExpression(String partitionExpression) {
        this.partitionExpression = partitionExpression;
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

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(Date lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    public MdTables getTableIdFk() {
        return tableIdFk;
    }

    public void setTableIdFk(MdTables tableIdFk) {
        this.tableIdFk = tableIdFk;
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
        if (!(object instanceof MdPartitions)) {
            return false;
        }
        MdPartitions other = (MdPartitions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdPartitions[ id=" + id + " ]";
    }
    
}
