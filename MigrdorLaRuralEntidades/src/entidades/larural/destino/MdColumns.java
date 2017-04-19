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
@Table(name = "MD_COLUMNS")
@NamedQueries({
    @NamedQuery(name = "MdColumns.findAll", query = "SELECT m FROM MdColumns m"),
    @NamedQuery(name = "MdColumns.findById", query = "SELECT m FROM MdColumns m WHERE m.id = :id"),
    @NamedQuery(name = "MdColumns.findByColumnName", query = "SELECT m FROM MdColumns m WHERE m.columnName = :columnName"),
    @NamedQuery(name = "MdColumns.findByColumnOrder", query = "SELECT m FROM MdColumns m WHERE m.columnOrder = :columnOrder"),
    @NamedQuery(name = "MdColumns.findByColumnType", query = "SELECT m FROM MdColumns m WHERE m.columnType = :columnType"),
    @NamedQuery(name = "MdColumns.findByPrecision", query = "SELECT m FROM MdColumns m WHERE m.precision = :precision"),
    @NamedQuery(name = "MdColumns.findByScale", query = "SELECT m FROM MdColumns m WHERE m.scale = :scale"),
    @NamedQuery(name = "MdColumns.findByNullable", query = "SELECT m FROM MdColumns m WHERE m.nullable = :nullable"),
    @NamedQuery(name = "MdColumns.findByDefaultValue", query = "SELECT m FROM MdColumns m WHERE m.defaultValue = :defaultValue"),
    @NamedQuery(name = "MdColumns.findByNativeKey", query = "SELECT m FROM MdColumns m WHERE m.nativeKey = :nativeKey"),
    @NamedQuery(name = "MdColumns.findByDatatypeTransformedFlag", query = "SELECT m FROM MdColumns m WHERE m.datatypeTransformedFlag = :datatypeTransformedFlag"),
    @NamedQuery(name = "MdColumns.findByComments", query = "SELECT m FROM MdColumns m WHERE m.comments = :comments"),
    @NamedQuery(name = "MdColumns.findBySecurityGroupId", query = "SELECT m FROM MdColumns m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdColumns.findByCreatedBy", query = "SELECT m FROM MdColumns m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdColumns.findByCreatedOn", query = "SELECT m FROM MdColumns m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdColumns.findByLastUpdatedBy", query = "SELECT m FROM MdColumns m WHERE m.lastUpdatedBy = :lastUpdatedBy"),
    @NamedQuery(name = "MdColumns.findByLastUpdatedOn", query = "SELECT m FROM MdColumns m WHERE m.lastUpdatedOn = :lastUpdatedOn")})
public class MdColumns implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "COLUMN_NAME", nullable = false, length = 4000)
    private String columnName;
    @Basic(optional = false)
    @Column(name = "COLUMN_ORDER", nullable = false)
    private BigInteger columnOrder;
    @Column(name = "COLUMN_TYPE", length = 4000)
    private String columnType;
    @Column(name = "PRECISION")
    private BigInteger precision;
    @Column(name = "SCALE")
    private BigInteger scale;
    @Basic(optional = false)
    @Column(name = "NULLABLE", nullable = false)
    private Character nullable;
    @Column(name = "DEFAULT_VALUE", length = 4000)
    private String defaultValue;
    @Lob
    @Column(name = "NATIVE_SQL")
    private String nativeSql;
    @Column(name = "NATIVE_KEY", length = 4000)
    private String nativeKey;
    @Column(name = "DATATYPE_TRANSFORMED_FLAG")
    private Character datatypeTransformedFlag;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "columnIdFk")
    private List<MdIndexDetails> mdIndexDetailsList;
    @OneToMany(mappedBy = "columnIdFk")
    private List<MdConstraintDetails> mdConstraintDetailsList;
    @JoinColumn(name = "TABLE_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdTables tableIdFk;

    public MdColumns() {
    }

    public MdColumns(BigDecimal id) {
        this.id = id;
    }

    public MdColumns(BigDecimal id, String columnName, BigInteger columnOrder, Character nullable, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.columnName = columnName;
        this.columnOrder = columnOrder;
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

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public BigInteger getColumnOrder() {
        return columnOrder;
    }

    public void setColumnOrder(BigInteger columnOrder) {
        this.columnOrder = columnOrder;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public BigInteger getPrecision() {
        return precision;
    }

    public void setPrecision(BigInteger precision) {
        this.precision = precision;
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

    public Character getDatatypeTransformedFlag() {
        return datatypeTransformedFlag;
    }

    public void setDatatypeTransformedFlag(Character datatypeTransformedFlag) {
        this.datatypeTransformedFlag = datatypeTransformedFlag;
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

    public List<MdIndexDetails> getMdIndexDetailsList() {
        return mdIndexDetailsList;
    }

    public void setMdIndexDetailsList(List<MdIndexDetails> mdIndexDetailsList) {
        this.mdIndexDetailsList = mdIndexDetailsList;
    }

    public List<MdConstraintDetails> getMdConstraintDetailsList() {
        return mdConstraintDetailsList;
    }

    public void setMdConstraintDetailsList(List<MdConstraintDetails> mdConstraintDetailsList) {
        this.mdConstraintDetailsList = mdConstraintDetailsList;
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
        if (!(object instanceof MdColumns)) {
            return false;
        }
        MdColumns other = (MdColumns) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdColumns[ id=" + id + " ]";
    }
    
}
