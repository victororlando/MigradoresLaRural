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
@Table(name = "MD_CONNECTIONS")
@NamedQueries({
    @NamedQuery(name = "MdConnections.findAll", query = "SELECT m FROM MdConnections m"),
    @NamedQuery(name = "MdConnections.findById", query = "SELECT m FROM MdConnections m WHERE m.id = :id"),
    @NamedQuery(name = "MdConnections.findByType", query = "SELECT m FROM MdConnections m WHERE m.type = :type"),
    @NamedQuery(name = "MdConnections.findByHost", query = "SELECT m FROM MdConnections m WHERE m.host = :host"),
    @NamedQuery(name = "MdConnections.findByPort", query = "SELECT m FROM MdConnections m WHERE m.port = :port"),
    @NamedQuery(name = "MdConnections.findByUsername", query = "SELECT m FROM MdConnections m WHERE m.username = :username"),
    @NamedQuery(name = "MdConnections.findByPassword", query = "SELECT m FROM MdConnections m WHERE m.password = :password"),
    @NamedQuery(name = "MdConnections.findByDburl", query = "SELECT m FROM MdConnections m WHERE m.dburl = :dburl"),
    @NamedQuery(name = "MdConnections.findByName", query = "SELECT m FROM MdConnections m WHERE m.name = :name"),
    @NamedQuery(name = "MdConnections.findByStatus", query = "SELECT m FROM MdConnections m WHERE m.status = :status"),
    @NamedQuery(name = "MdConnections.findByNumCatalogs", query = "SELECT m FROM MdConnections m WHERE m.numCatalogs = :numCatalogs"),
    @NamedQuery(name = "MdConnections.findByNumColumns", query = "SELECT m FROM MdConnections m WHERE m.numColumns = :numColumns"),
    @NamedQuery(name = "MdConnections.findByNumConstraints", query = "SELECT m FROM MdConnections m WHERE m.numConstraints = :numConstraints"),
    @NamedQuery(name = "MdConnections.findByNumGroups", query = "SELECT m FROM MdConnections m WHERE m.numGroups = :numGroups"),
    @NamedQuery(name = "MdConnections.findByNumRoles", query = "SELECT m FROM MdConnections m WHERE m.numRoles = :numRoles"),
    @NamedQuery(name = "MdConnections.findByNumIndexes", query = "SELECT m FROM MdConnections m WHERE m.numIndexes = :numIndexes"),
    @NamedQuery(name = "MdConnections.findByNumOtherObjects", query = "SELECT m FROM MdConnections m WHERE m.numOtherObjects = :numOtherObjects"),
    @NamedQuery(name = "MdConnections.findByNumPackages", query = "SELECT m FROM MdConnections m WHERE m.numPackages = :numPackages"),
    @NamedQuery(name = "MdConnections.findByNumPrivileges", query = "SELECT m FROM MdConnections m WHERE m.numPrivileges = :numPrivileges"),
    @NamedQuery(name = "MdConnections.findByNumSchemas", query = "SELECT m FROM MdConnections m WHERE m.numSchemas = :numSchemas"),
    @NamedQuery(name = "MdConnections.findByNumSequences", query = "SELECT m FROM MdConnections m WHERE m.numSequences = :numSequences"),
    @NamedQuery(name = "MdConnections.findByNumStoredPrograms", query = "SELECT m FROM MdConnections m WHERE m.numStoredPrograms = :numStoredPrograms"),
    @NamedQuery(name = "MdConnections.findByNumSynonyms", query = "SELECT m FROM MdConnections m WHERE m.numSynonyms = :numSynonyms"),
    @NamedQuery(name = "MdConnections.findByNumTables", query = "SELECT m FROM MdConnections m WHERE m.numTables = :numTables"),
    @NamedQuery(name = "MdConnections.findByNumTablespaces", query = "SELECT m FROM MdConnections m WHERE m.numTablespaces = :numTablespaces"),
    @NamedQuery(name = "MdConnections.findByNumTriggers", query = "SELECT m FROM MdConnections m WHERE m.numTriggers = :numTriggers"),
    @NamedQuery(name = "MdConnections.findByNumUserDefinedDataTypes", query = "SELECT m FROM MdConnections m WHERE m.numUserDefinedDataTypes = :numUserDefinedDataTypes"),
    @NamedQuery(name = "MdConnections.findByNumUsers", query = "SELECT m FROM MdConnections m WHERE m.numUsers = :numUsers"),
    @NamedQuery(name = "MdConnections.findByNumViews", query = "SELECT m FROM MdConnections m WHERE m.numViews = :numViews"),
    @NamedQuery(name = "MdConnections.findByComments", query = "SELECT m FROM MdConnections m WHERE m.comments = :comments"),
    @NamedQuery(name = "MdConnections.findBySecurityGroupId", query = "SELECT m FROM MdConnections m WHERE m.securityGroupId = :securityGroupId"),
    @NamedQuery(name = "MdConnections.findByCreatedOn", query = "SELECT m FROM MdConnections m WHERE m.createdOn = :createdOn"),
    @NamedQuery(name = "MdConnections.findByCreatedBy", query = "SELECT m FROM MdConnections m WHERE m.createdBy = :createdBy"),
    @NamedQuery(name = "MdConnections.findByLastUpdatedOn", query = "SELECT m FROM MdConnections m WHERE m.lastUpdatedOn = :lastUpdatedOn"),
    @NamedQuery(name = "MdConnections.findByLastUpdatedBy", query = "SELECT m FROM MdConnections m WHERE m.lastUpdatedBy = :lastUpdatedBy")})
public class MdConnections implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal id;
    @Column(name = "TYPE", length = 4000)
    private String type;
    @Column(name = "HOST", length = 4000)
    private String host;
    @Column(name = "PORT")
    private BigInteger port;
    @Column(name = "USERNAME", length = 4000)
    private String username;
    @Column(name = "PASSWORD", length = 4000)
    private String password;
    @Column(name = "DBURL", length = 4000)
    private String dburl;
    @Column(name = "NAME", length = 255)
    private String name;
    @Lob
    @Column(name = "NATIVE_SQL")
    private String nativeSql;
    @Column(name = "STATUS", length = 30)
    private String status;
    @Column(name = "NUM_CATALOGS")
    private BigInteger numCatalogs;
    @Column(name = "NUM_COLUMNS")
    private BigInteger numColumns;
    @Column(name = "NUM_CONSTRAINTS")
    private BigInteger numConstraints;
    @Column(name = "NUM_GROUPS")
    private BigInteger numGroups;
    @Column(name = "NUM_ROLES")
    private BigInteger numRoles;
    @Column(name = "NUM_INDEXES")
    private BigInteger numIndexes;
    @Column(name = "NUM_OTHER_OBJECTS")
    private BigInteger numOtherObjects;
    @Column(name = "NUM_PACKAGES")
    private BigInteger numPackages;
    @Column(name = "NUM_PRIVILEGES")
    private BigInteger numPrivileges;
    @Column(name = "NUM_SCHEMAS")
    private BigInteger numSchemas;
    @Column(name = "NUM_SEQUENCES")
    private BigInteger numSequences;
    @Column(name = "NUM_STORED_PROGRAMS")
    private BigInteger numStoredPrograms;
    @Column(name = "NUM_SYNONYMS")
    private BigInteger numSynonyms;
    @Column(name = "NUM_TABLES")
    private BigInteger numTables;
    @Column(name = "NUM_TABLESPACES")
    private BigInteger numTablespaces;
    @Column(name = "NUM_TRIGGERS")
    private BigInteger numTriggers;
    @Column(name = "NUM_USER_DEFINED_DATA_TYPES")
    private BigInteger numUserDefinedDataTypes;
    @Column(name = "NUM_USERS")
    private BigInteger numUsers;
    @Column(name = "NUM_VIEWS")
    private BigInteger numViews;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "connectionIdFk")
    private List<MdCatalogs> mdCatalogsList;
    @JoinColumn(name = "PROJECT_ID_FK", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private MdProjects projectIdFk;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "connectionIdFk")
    private List<MdMigrDependency> mdMigrDependencyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "connectionIdFk")
    private List<MdAdditionalProperties> mdAdditionalPropertiesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "connectionIdFk")
    private List<MdMigrParameter> mdMigrParameterList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "connectionIdFk")
    private List<MdMigrWeakdep> mdMigrWeakdepList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "derivedConnectionIdFk")
    private List<MdDerivatives> mdDerivativesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "connectionIdFk")
    private List<MigrGenerationOrder> migrGenerationOrderList;

    public MdConnections() {
    }

    public MdConnections(BigDecimal id) {
        this.id = id;
    }

    public MdConnections(BigDecimal id, BigInteger securityGroupId, Date createdOn) {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public BigInteger getPort() {
        return port;
    }

    public void setPort(BigInteger port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDburl() {
        return dburl;
    }

    public void setDburl(String dburl) {
        this.dburl = dburl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNativeSql() {
        return nativeSql;
    }

    public void setNativeSql(String nativeSql) {
        this.nativeSql = nativeSql;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigInteger getNumCatalogs() {
        return numCatalogs;
    }

    public void setNumCatalogs(BigInteger numCatalogs) {
        this.numCatalogs = numCatalogs;
    }

    public BigInteger getNumColumns() {
        return numColumns;
    }

    public void setNumColumns(BigInteger numColumns) {
        this.numColumns = numColumns;
    }

    public BigInteger getNumConstraints() {
        return numConstraints;
    }

    public void setNumConstraints(BigInteger numConstraints) {
        this.numConstraints = numConstraints;
    }

    public BigInteger getNumGroups() {
        return numGroups;
    }

    public void setNumGroups(BigInteger numGroups) {
        this.numGroups = numGroups;
    }

    public BigInteger getNumRoles() {
        return numRoles;
    }

    public void setNumRoles(BigInteger numRoles) {
        this.numRoles = numRoles;
    }

    public BigInteger getNumIndexes() {
        return numIndexes;
    }

    public void setNumIndexes(BigInteger numIndexes) {
        this.numIndexes = numIndexes;
    }

    public BigInteger getNumOtherObjects() {
        return numOtherObjects;
    }

    public void setNumOtherObjects(BigInteger numOtherObjects) {
        this.numOtherObjects = numOtherObjects;
    }

    public BigInteger getNumPackages() {
        return numPackages;
    }

    public void setNumPackages(BigInteger numPackages) {
        this.numPackages = numPackages;
    }

    public BigInteger getNumPrivileges() {
        return numPrivileges;
    }

    public void setNumPrivileges(BigInteger numPrivileges) {
        this.numPrivileges = numPrivileges;
    }

    public BigInteger getNumSchemas() {
        return numSchemas;
    }

    public void setNumSchemas(BigInteger numSchemas) {
        this.numSchemas = numSchemas;
    }

    public BigInteger getNumSequences() {
        return numSequences;
    }

    public void setNumSequences(BigInteger numSequences) {
        this.numSequences = numSequences;
    }

    public BigInteger getNumStoredPrograms() {
        return numStoredPrograms;
    }

    public void setNumStoredPrograms(BigInteger numStoredPrograms) {
        this.numStoredPrograms = numStoredPrograms;
    }

    public BigInteger getNumSynonyms() {
        return numSynonyms;
    }

    public void setNumSynonyms(BigInteger numSynonyms) {
        this.numSynonyms = numSynonyms;
    }

    public BigInteger getNumTables() {
        return numTables;
    }

    public void setNumTables(BigInteger numTables) {
        this.numTables = numTables;
    }

    public BigInteger getNumTablespaces() {
        return numTablespaces;
    }

    public void setNumTablespaces(BigInteger numTablespaces) {
        this.numTablespaces = numTablespaces;
    }

    public BigInteger getNumTriggers() {
        return numTriggers;
    }

    public void setNumTriggers(BigInteger numTriggers) {
        this.numTriggers = numTriggers;
    }

    public BigInteger getNumUserDefinedDataTypes() {
        return numUserDefinedDataTypes;
    }

    public void setNumUserDefinedDataTypes(BigInteger numUserDefinedDataTypes) {
        this.numUserDefinedDataTypes = numUserDefinedDataTypes;
    }

    public BigInteger getNumUsers() {
        return numUsers;
    }

    public void setNumUsers(BigInteger numUsers) {
        this.numUsers = numUsers;
    }

    public BigInteger getNumViews() {
        return numViews;
    }

    public void setNumViews(BigInteger numViews) {
        this.numViews = numViews;
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

    public List<MdCatalogs> getMdCatalogsList() {
        return mdCatalogsList;
    }

    public void setMdCatalogsList(List<MdCatalogs> mdCatalogsList) {
        this.mdCatalogsList = mdCatalogsList;
    }

    public MdProjects getProjectIdFk() {
        return projectIdFk;
    }

    public void setProjectIdFk(MdProjects projectIdFk) {
        this.projectIdFk = projectIdFk;
    }

    public List<MdMigrDependency> getMdMigrDependencyList() {
        return mdMigrDependencyList;
    }

    public void setMdMigrDependencyList(List<MdMigrDependency> mdMigrDependencyList) {
        this.mdMigrDependencyList = mdMigrDependencyList;
    }

    public List<MdAdditionalProperties> getMdAdditionalPropertiesList() {
        return mdAdditionalPropertiesList;
    }

    public void setMdAdditionalPropertiesList(List<MdAdditionalProperties> mdAdditionalPropertiesList) {
        this.mdAdditionalPropertiesList = mdAdditionalPropertiesList;
    }

    public List<MdMigrParameter> getMdMigrParameterList() {
        return mdMigrParameterList;
    }

    public void setMdMigrParameterList(List<MdMigrParameter> mdMigrParameterList) {
        this.mdMigrParameterList = mdMigrParameterList;
    }

    public List<MdMigrWeakdep> getMdMigrWeakdepList() {
        return mdMigrWeakdepList;
    }

    public void setMdMigrWeakdepList(List<MdMigrWeakdep> mdMigrWeakdepList) {
        this.mdMigrWeakdepList = mdMigrWeakdepList;
    }

    public List<MdDerivatives> getMdDerivativesList() {
        return mdDerivativesList;
    }

    public void setMdDerivativesList(List<MdDerivatives> mdDerivativesList) {
        this.mdDerivativesList = mdDerivativesList;
    }

    public List<MigrGenerationOrder> getMigrGenerationOrderList() {
        return migrGenerationOrderList;
    }

    public void setMigrGenerationOrderList(List<MigrGenerationOrder> migrGenerationOrderList) {
        this.migrGenerationOrderList = migrGenerationOrderList;
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
        if (!(object instanceof MdConnections)) {
            return false;
        }
        MdConnections other = (MdConnections) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.MdConnections[ id=" + id + " ]";
    }
    
}
