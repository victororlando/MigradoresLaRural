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
@Table(name = "MD_CONSTRAINT_DETAILS")
@NamedQueries({
    @NamedQuery(name = "MdConstraintDetails.findAll", query = "SELECT m FROM MdConstraintDetails m"),
    @NamedQuery(name = "MdConstraintDetails.findById", query = "SELECT m FROM MdConstraintDetails m WHERE m.id = :id"),
    @NamedQuery(name = "MdConstraintDetails.findByRefFlag", query = "SELECT m FROM MdConstraintDetails m WHERE m.refFlag = :refFlag"),
    @NamedQuery(name = "MdConstraintDetails.findByColumnPortion", query = "SELECT m FROM MdConstraintDetails m WHERE m.columnPortion = :columnPortion"),
    @NamedQuery(name = "MdConstraintDetails.findByDetailOrder", query = "SELECT m FROM MdConstraintDetails m WHERE m.detailOrder = :detailOrder"),
    @NamedQuery(name = "MdConstraintDetails.findBySecurityGroupId", query = "SELECT m FROM MdConstraintDetails m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdConstraintDetails.findByCreatedOn", query = "SELECT m FROM MdConstraintDetails m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdConstraintDetails.findByCreatedBy", query = "SELECT m FROM MdConstraintDetails m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdConstraintDetails.findByLastUpdatedOn", query = "SELECT m FROM MdConstraintDetails m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MdConstraintDetails.findByLastUpdatedBy", query = "SELECT m FROM MdConstraintDetails m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MdConstraintDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Column(name = "REF_FLAG")
    private Character refFlag;
    @Column(name = "COLUMN_PORTION")
    private BigInteger columnPortion;
    @Lob
    @Column(name = "CONSTRAINT_TEXT")
    private String constraintText;
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
    @JoinColumn(name = "COLUMN_ID_FK", referencedColumnName = "ID")
    @ManyToOne
    private MdColumns columnIdFk;
    @JoinColumn(name = "CONSTRAINT_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdConstraints constraintIdFk;

    public MdConstraintDetails() {
    }

    public MdConstraintDetails(BigDecimal id) {
        this.id = id;
    }

    public MdConstraintDetails(BigDecimal id, BigInteger detailOrder, BigInteger securityGroupId, Date createdOn) {
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

    public Character getRefFlag() {
        return refFlag;
    }

    public void setRefFlag(Character refFlag) {
        this.refFlag = refFlag;
    }

    public BigInteger getColumnPortion() {
        return columnPortion;
    }

    public void setColumnPortion(BigInteger columnPortion) {
        this.columnPortion = columnPortion;
    }

    public String getConstraintText() {
        return constraintText;
    }

    public void setConstraintText(String constraintText) {
        this.constraintText = constraintText;
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

    public MdConstraints getConstraintIdFk() {
        return constraintIdFk;
    }

    public void setConstraintIdFk(MdConstraints constraintIdFk) {
        this.constraintIdFk = constraintIdFk;
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
        if (!(object instanceof MdConstraintDetails)) {
            return false;
        }
        MdConstraintDetails other = (MdConstraintDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdConstraintDetails[ id=" + id + " ]";
    }
    
}
