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
@Table(name = "MD_APPLICATIONFILES")
@NamedQueries({
    @NamedQuery(name = "MdApplicationfiles.findAll", query = "SELECT m FROM MdApplicationfiles m"),
    @NamedQuery(name = "MdApplicationfiles.findById", query = "SELECT m FROM MdApplicationfiles m WHERE m.id = :id"),
    @NamedQuery(name = "MdApplicationfiles.findByName", query = "SELECT m FROM MdApplicationfiles m WHERE m.name = :name"),
    @NamedQuery(name = "MdApplicationfiles.findByUri", query = "SELECT m FROM MdApplicationfiles m WHERE m.uri = :uri"),
    @NamedQuery(name = "MdApplicationfiles.findByType", query = "SELECT m FROM MdApplicationfiles m WHERE m.type = :type"),
    @NamedQuery(name = "MdApplicationfiles.findByState", query = "SELECT m FROM MdApplicationfiles m WHERE m.state = :state"),
    @NamedQuery(name = "MdApplicationfiles.findByLanguage", query = "SELECT m FROM MdApplicationfiles m WHERE m.language = :language"),
    @NamedQuery(name = "MdApplicationfiles.findByLoc", query = "SELECT m FROM MdApplicationfiles m WHERE m.loc = :loc"),
    @NamedQuery(name = "MdApplicationfiles.findBySecurityGroupId", query = "SELECT m FROM MdApplicationfiles m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdApplicationfiles.findByCreatedOn", query = "SELECT m FROM MdApplicationfiles m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdApplicationfiles.findByCreatedBy", query = "SELECT m FROM MdApplicationfiles m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdApplicationfiles.findByUpdatedOn", query = "SELECT m FROM MdApplicationfiles m WHERE m.updatedOn = :updatedOn"),
    @NamedQuery(name = "MdApplicationfiles.findByUpdatedBy", query = "SELECT m FROM MdApplicationfiles m WHERE m.updatedBy = :updatedBy")})
public class MdApplicationfiles implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "NAME", nullable = false, length = 200)
    private String name;
    @Basic(optional = false)
    @Column(name = "URI", nullable = false, length = 4000)
    private String uri;
    @Basic(optional = false)
    @Column(name = "TYPE", nullable = false, length = 100)
    private String type;
    @Basic(optional = false)
    @Column(name = "STATE", nullable = false, length = 100)
    private String state;
    @Column(name = "LANGUAGE", length = 100)
    private String language;
    @Column(name = "LOC")
    private BigInteger loc;
    @Basic(optional = false)
    @Column(name = "SECURITY_GROUP_ID", nullable = false)
    private BigInteger securityGroupId;
    @Basic(optional = false)
    @Column(name = "CREATED_ON", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "CREATED_BY", length = 4000)
    private String createdBy;
    @Column(name = "UPDATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;
    @Column(name = "UPDATED_BY", length = 4000)
    private String updatedBy;
    @JoinColumn(name = "APPLICATIONS_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdApplications applicationsIdFk;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "applicationfilesId")
    private List<MdFileArtifacts> mdFileArtifactsList;

    public MdApplicationfiles() {
    }

    public MdApplicationfiles(BigDecimal id) {
        this.id = id;
    }

    public MdApplicationfiles(BigDecimal id, String name, String uri, String type, String state, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.name = name;
        this.uri = uri;
        this.type = type;
        this.state = state;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public BigInteger getLoc() {
        return loc;
    }

    public void setLoc(BigInteger loc) {
        this.loc = loc;
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

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public MdApplications getApplicationsIdFk() {
        return applicationsIdFk;
    }

    public void setApplicationsIdFk(MdApplications applicationsIdFk) {
        this.applicationsIdFk = applicationsIdFk;
    }

    public List<MdFileArtifacts> getMdFileArtifactsList() {
        return mdFileArtifactsList;
    }

    public void setMdFileArtifactsList(List<MdFileArtifacts> mdFileArtifactsList) {
        this.mdFileArtifactsList = mdFileArtifactsList;
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
        if (!(object instanceof MdApplicationfiles)) {
            return false;
        }
        MdApplicationfiles other = (MdApplicationfiles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdApplicationfiles[ id=" + id + " ]";
    }
    
}
