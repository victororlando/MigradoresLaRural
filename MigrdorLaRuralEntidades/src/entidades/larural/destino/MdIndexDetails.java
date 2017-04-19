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
@Table(name = "MD_INDEX_DETAILS")
@NamedQueries({
    @NamedQuery(name = "MdIndexDetails.findAll", query = "SELECT m FROM MdIndexDetails m"),
    @NamedQuery(name = "MdIndexDetails.findById", query = "SELECT m FROM MdIndexDetails m WHERE m.id = :id"),
    @NamedQuery(name = "MdIndexDetails.findByIndexPortion", query = "SELECT m FROM MdIndexDetails m WHERE m.indexPortion = :indexPortion"),
    @NamedQuery(name = "MdIndexDetails.findByDetailOrder", query = "SELECT m FROM MdIndexDetails m WHERE m.detailOrder = :detailOrder"),
    @NamedQuery(name = "MdIndexDetails.findBySecurityGroupId", query = "SELECT m FROM MdIndexDetails m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdIndexDetails.findByCreatedOn", query = "SELECT m FROM MdIndexDetails m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdIndexDetails.findByCreatedBy", query = "SELECT m FROM MdIndexDetails m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdIndexDetails.findByLastUpdatedOn", query = "SELECT m FROM MdIndexDetails m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MdIndexDetails.findByLastUpdatedBy", query = "SELECT m FROM MdIndexDetails m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MdIndexDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Column(name = "INDEX_PORTION")
    private BigInteger indexPortion;
    @Basic(optional = false)
    @Column(name = "DETAIL_ORDER", nullable = false)
    private BigInteger detailOrder;
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
    @JoinColumn(name = "COLUMN_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdColumns columnIdFk;
    @JoinColumn(name = "INDEX_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdIndexes indexIdFk;

    public MdIndexDetails() {
    }

    public MdIndexDetails(BigDecimal id) {
        this.id = id;
    }

    public MdIndexDetails(BigDecimal id, BigInteger detailOrder, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.detailOrder = detailOrder;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getIndexPortion() {
        return indexPortion;
    }

    public void setIndexPortion(BigInteger indexPortion) {
        this.indexPortion = indexPortion;
    }

    public BigInteger getDetailOrder() {
        return detailOrder;
    }

    public void setDetailOrder(BigInteger detailOrder) {
        this.detailOrder = detailOrder;
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

    public MdColumns getColumnIdFk() {
        return columnIdFk;
    }

    public void setColumnIdFk(MdColumns columnIdFk) {
        this.columnIdFk = columnIdFk;
    }

    public MdIndexes getIndexIdFk() {
        return indexIdFk;
    }

    public void setIndexIdFk(MdIndexes indexIdFk) {
        this.indexIdFk = indexIdFk;
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
        if (!(object instanceof MdIndexDetails)) {
            return false;
        }
        MdIndexDetails other = (MdIndexDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdIndexDetails[ id=" + id + " ]";
    }
    
}
