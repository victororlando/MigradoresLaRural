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
@Table(name = "MIGR_DATATYPE_TRANSFORM_MAP")
@NamedQueries({
    @NamedQuery(name = "MigrDatatypeTransformMap.findAll", query = "SELECT m FROM MigrDatatypeTransformMap m"),
    @NamedQuery(name = "MigrDatatypeTransformMap.findById", query = "SELECT m FROM MigrDatatypeTransformMap m WHERE m.id = :id"),
    @NamedQuery(name = "MigrDatatypeTransformMap.findByMapName", query = "SELECT m FROM MigrDatatypeTransformMap m WHERE m.mapName = :mapName"),
    @NamedQuery(name = "MigrDatatypeTransformMap.findBySecurityGroupId", query = "SELECT m FROM MigrDatatypeTransformMap m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MigrDatatypeTransformMap.findByCreatedOn", query = "SELECT m FROM MigrDatatypeTransformMap m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MigrDatatypeTransformMap.findByCreatedBy", query = "SELECT m FROM MigrDatatypeTransformMap m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MigrDatatypeTransformMap.findByLastUpdatedOn", query = "SELECT m FROM MigrDatatypeTransformMap m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MigrDatatypeTransformMap.findByLastUpdatedBy", query = "SELECT m FROM MigrDatatypeTransformMap m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MigrDatatypeTransformMap implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Column(name = "MAP_NAME", length = 4000)
    private String mapName;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mapIdFk")
    private List<MigrDatatypeTransformRule> migrDatatypeTransformRuleList;
    @JoinColumn(name = "PROJECT_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdProjects projectIdFk;

    public MigrDatatypeTransformMap() {
    }

    public MigrDatatypeTransformMap(BigDecimal id) {
        this.id = id;
    }

    public MigrDatatypeTransformMap(BigDecimal id, BigInteger securityGroupId, Date createdOn) {
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

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
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

    public List<MigrDatatypeTransformRule> getMigrDatatypeTransformRuleList() {
        return migrDatatypeTransformRuleList;
    }

    public void setMigrDatatypeTransformRuleList(List<MigrDatatypeTransformRule> migrDatatypeTransformRuleList) {
        this.migrDatatypeTransformRuleList = migrDatatypeTransformRuleList;
    }

    public MdProjects getProjectIdFk() {
        return projectIdFk;
    }

    public void setProjectIdFk(MdProjects projectIdFk) {
        this.projectIdFk = projectIdFk;
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
        if (!(object instanceof MigrDatatypeTransformMap)) {
            return false;
        }
        MigrDatatypeTransformMap other = (MigrDatatypeTransformMap) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MigrDatatypeTransformMap[ id=" + id + " ]";
    }
    
}
