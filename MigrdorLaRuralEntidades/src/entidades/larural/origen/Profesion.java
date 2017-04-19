/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.origen;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "PROFESION",  schema = "SOFTTEN", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"NOMBRE_PROFESION"})})
@NamedQueries({
    @NamedQuery(name = "Profesion.findAll", query = "SELECT p FROM Profesion p"),
    @NamedQuery(name = "Profesion.findByTipoProfesion", query = "SELECT p FROM Profesion p WHERE p.profesionPK.tipoProfesion = :tipoProfesion"),
    @NamedQuery(name = "Profesion.findByProfesion", query = "SELECT p FROM Profesion p WHERE p.profesionPK.profesion = :profesion"),
    @NamedQuery(name = "Profesion.findByNombreProfesion", query = "SELECT p FROM Profesion p WHERE p.nombreProfesion = :nombreProfesion"),
    @NamedQuery(name = "Profesion.findByNroEntrada", query = "SELECT p FROM Profesion p WHERE p.nroEntrada = :nroEntrada")})
public class Profesion implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "profesion")
    private List<AsegVida> asegVidaList;
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProfesionPK profesionPK;
    @Basic(optional = false)
    @Column(name = "NOMBRE_PROFESION", nullable = false, length = 30)
    private String nombreProfesion;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @OneToMany(mappedBy = "profesion")
    private List<Listaseg> listasegList;
    @JoinColumn(name = "TIPO_PROFESION", referencedColumnName = "TIPO_PROFESION", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TipoProfesion tipoProfesion1;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsuario;

    public Profesion() {
    }

    public Profesion(ProfesionPK profesionPK) {
        this.profesionPK = profesionPK;
    }

    public Profesion(ProfesionPK profesionPK, String nombreProfesion, int nroEntrada) {
        this.profesionPK = profesionPK;
        this.nombreProfesion = nombreProfesion;
        this.nroEntrada = nroEntrada;
    }

    public Profesion(short tipoProfesion, short profesion) {
        this.profesionPK = new ProfesionPK(tipoProfesion, profesion);
    }

    public ProfesionPK getProfesionPK() {
        return profesionPK;
    }

    public void setProfesionPK(ProfesionPK profesionPK) {
        this.profesionPK = profesionPK;
    }

    public String getNombreProfesion() {
        return nombreProfesion;
    }

    public void setNombreProfesion(String nombreProfesion) {
        this.nombreProfesion = nombreProfesion;
    }

    public int getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(int nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public List<Listaseg> getListasegList() {
        return listasegList;
    }

    public void setListasegList(List<Listaseg> listasegList) {
        this.listasegList = listasegList;
    }

    public TipoProfesion getTipoProfesion1() {
        return tipoProfesion1;
    }

    public void setTipoProfesion1(TipoProfesion tipoProfesion1) {
        this.tipoProfesion1 = tipoProfesion1;
    }

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (profesionPK != null ? profesionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profesion)) {
            return false;
        }
        Profesion other = (Profesion) object;
        if ((this.profesionPK == null && other.profesionPK != null) || (this.profesionPK != null && !this.profesionPK.equals(other.profesionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Profesion[ profesionPK=" + profesionPK + " ]";
    }

    public List<AsegVida> getAsegVidaList() {
        return asegVidaList;
    }

    public void setAsegVidaList(List<AsegVida> asegVidaList) {
        this.asegVidaList = asegVidaList;
    }
    
}
