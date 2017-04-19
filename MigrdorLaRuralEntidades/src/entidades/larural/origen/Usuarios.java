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
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "USUARIOS", schema = "SOFTTEN",  uniqueConstraints = {
    @UniqueConstraint(columnNames = {"USERID"}),
    @UniqueConstraint(columnNames = {"NOMBRE"})})
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
    @NamedQuery(name = "Usuarios.findByCodUsuario", query = "SELECT u FROM Usuarios u WHERE u.codUsuario = :codUsuario"),
    @NamedQuery(name = "Usuarios.findByUserid", query = "SELECT u FROM Usuarios u WHERE u.userid = :userid"),
    @NamedQuery(name = "Usuarios.findByContrasena", query = "SELECT u FROM Usuarios u WHERE u.contrasena = :contrasena"),
    @NamedQuery(name = "Usuarios.findByNombre", query = "SELECT u FROM Usuarios u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "Usuarios.findByNivel", query = "SELECT u FROM Usuarios u WHERE u.nivel = :nivel"),
    @NamedQuery(name = "Usuarios.findByEstado", query = "SELECT u FROM Usuarios u WHERE u.estado = :estado"),
    @NamedQuery(name = "Usuarios.findByNroEntrada", query = "SELECT u FROM Usuarios u WHERE u.nroEntrada = :nroEntrada"),
    @NamedQuery(name = "Usuarios.findByUsuarioCarga", query = "SELECT u FROM Usuarios u WHERE u.usuarioCarga = :usuarioCarga"),
    @NamedQuery(name = "Usuarios.findByFirmante", query = "SELECT u FROM Usuarios u WHERE u.firmante = :firmante"),
    @NamedQuery(name = "Usuarios.findByCargoFirmante", query = "SELECT u FROM Usuarios u WHERE u.cargoFirmante = :cargoFirmante"),
    @NamedQuery(name = "Usuarios.findByCentro", query = "SELECT u FROM Usuarios u WHERE u.centro = :centro"),
    @NamedQuery(name = "Usuarios.findByEncargado", query = "SELECT u FROM Usuarios u WHERE u.encargado = :encargado"),
    @NamedQuery(name = "Usuarios.findByCantIntroPass", query = "SELECT u FROM Usuarios u WHERE u.cantIntroPass = :cantIntroPass"),
    @NamedQuery(name = "Usuarios.findByMarca", query = "SELECT u FROM Usuarios u WHERE u.marca = :marca"),
    @NamedQuery(name = "Usuarios.findByUsuarioModifica", query = "SELECT u FROM Usuarios u WHERE u.usuarioModifica = :usuarioModifica"),
    @NamedQuery(name = "Usuarios.findByEmailCorporativo", query = "SELECT u FROM Usuarios u WHERE u.emailCorporativo = :emailCorporativo")})
public class Usuarios implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<AsegVida> asegVidaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<Certvida> certvidaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioCarga")
    private List<CoberturasDetalle> coberturasDetalleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<Marcas> marcasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<TiposVehiculos> tiposVehiculosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<ModelosVehiculos> modelosVehiculosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<Listbco> listbcoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<Tarjetas> tarjetasList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_USUARIO", nullable = false)
    private Short codUsuario;
    @Basic(optional = false)
    @Column(name = "USERID", nullable = false, length = 20)
    private String userid;
    @Basic(optional = false)
    @Column(name = "CONTRASENA", nullable = false, length = 15)
    private String contrasena;
    @Basic(optional = false)
    @Column(name = "NOMBRE", nullable = false, length = 60)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "NIVEL", nullable = false)
    private short nivel;
    @Basic(optional = false)
    @Column(name = "ESTADO", nullable = false)
    private short estado;
    @Basic(optional = false)
    @Column(name = "NRO_ENTRADA", nullable = false)
    private int nroEntrada;
    @Basic(optional = false)
    @Column(name = "USUARIO_CARGA", nullable = false)
    private short usuarioCarga;
    @Basic(optional = false)
    @Column(name = "FIRMANTE", nullable = false)
    private short firmante;
    @Column(name = "CARGO_FIRMANTE", length = 80)
    private String cargoFirmante;
    @Basic(optional = false)
    @Column(name = "CENTRO", nullable = false)
    private short centro;
    @Column(name = "ENCARGADO")
    private Short encargado;
    @Column(name = "CANT_INTRO_PASS")
    private Short cantIntroPass;
    @Column(name = "MARCA")
    private Short marca;
    @Basic(optional = false)
    @Column(name = "USUARIO_MODIFICA", nullable = false)
    private short usuarioModifica;
    @Column(name = "EMAIL_CORPORATIVO", length = 60)
    private String emailCorporativo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<TipoProfesion> tipoProfesionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<Agencias> agenciasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<Rubros> rubrosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<ListseccTiposServicios> listseccTiposServiciosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioModifica")
    private List<ListseccTiposServicios> listseccTiposServiciosList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<Listaseg> listasegList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<Listagte> listagteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<Actividad> actividadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<Departamento> departamentoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<GrupoDeAsegurados> grupoDeAseguradosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<TipoDocumento> tipoDocumentoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<Negocios> negociosList;
    @JoinColumn(name = "DEPARTAMENTO", referencedColumnName = "COD_DPTO")
    @ManyToOne
    private SeccionesEmpresa departamento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<SubRubro> subRubroList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<Organizadores> organizadoresList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<Polsdemi> polsdemiList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuarioProceso")
    private List<Polsdemi> polsdemiList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<Zonas> zonasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<Profesion> profesionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioModifica")
    private List<TiposOrganizadores> tiposOrganizadoresList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<TiposOrganizadores> tiposOrganizadoresList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<Ciudades> ciudadesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<AgentesBroker> agentesBrokerList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<Listcobr> listcobrList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsuario")
    private List<Centros> centrosList;

    public Usuarios() {
    }

    public Usuarios(Short codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Usuarios(Short codUsuario, String userid, String contrasena, String nombre, short nivel, short estado, int nroEntrada, short usuarioCarga, short firmante, short centro, short usuarioModifica) {
        this.codUsuario = codUsuario;
        this.userid = userid;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.nivel = nivel;
        this.estado = estado;
        this.nroEntrada = nroEntrada;
        this.usuarioCarga = usuarioCarga;
        this.firmante = firmante;
        this.centro = centro;
        this.usuarioModifica = usuarioModifica;
    }

    public Short getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Short codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getNivel() {
        return nivel;
    }

    public void setNivel(short nivel) {
        this.nivel = nivel;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public int getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(int nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public short getUsuarioCarga() {
        return usuarioCarga;
    }

    public void setUsuarioCarga(short usuarioCarga) {
        this.usuarioCarga = usuarioCarga;
    }

    public short getFirmante() {
        return firmante;
    }

    public void setFirmante(short firmante) {
        this.firmante = firmante;
    }

    public String getCargoFirmante() {
        return cargoFirmante;
    }

    public void setCargoFirmante(String cargoFirmante) {
        this.cargoFirmante = cargoFirmante;
    }

    public short getCentro() {
        return centro;
    }

    public void setCentro(short centro) {
        this.centro = centro;
    }

    public Short getEncargado() {
        return encargado;
    }

    public void setEncargado(Short encargado) {
        this.encargado = encargado;
    }

    public Short getCantIntroPass() {
        return cantIntroPass;
    }

    public void setCantIntroPass(Short cantIntroPass) {
        this.cantIntroPass = cantIntroPass;
    }

    public Short getMarca() {
        return marca;
    }

    public void setMarca(Short marca) {
        this.marca = marca;
    }

    public short getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(short usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    public String getEmailCorporativo() {
        return emailCorporativo;
    }

    public void setEmailCorporativo(String emailCorporativo) {
        this.emailCorporativo = emailCorporativo;
    }

    public List<TipoProfesion> getTipoProfesionList() {
        return tipoProfesionList;
    }

    public void setTipoProfesionList(List<TipoProfesion> tipoProfesionList) {
        this.tipoProfesionList = tipoProfesionList;
    }

    public List<Agencias> getAgenciasList() {
        return agenciasList;
    }

    public void setAgenciasList(List<Agencias> agenciasList) {
        this.agenciasList = agenciasList;
    }

    public List<Rubros> getRubrosList() {
        return rubrosList;
    }

    public void setRubrosList(List<Rubros> rubrosList) {
        this.rubrosList = rubrosList;
    }

    public List<ListseccTiposServicios> getListseccTiposServiciosList() {
        return listseccTiposServiciosList;
    }

    public void setListseccTiposServiciosList(List<ListseccTiposServicios> listseccTiposServiciosList) {
        this.listseccTiposServiciosList = listseccTiposServiciosList;
    }

    public List<ListseccTiposServicios> getListseccTiposServiciosList1() {
        return listseccTiposServiciosList1;
    }

    public void setListseccTiposServiciosList1(List<ListseccTiposServicios> listseccTiposServiciosList1) {
        this.listseccTiposServiciosList1 = listseccTiposServiciosList1;
    }

    public List<Listaseg> getListasegList() {
        return listasegList;
    }

    public void setListasegList(List<Listaseg> listasegList) {
        this.listasegList = listasegList;
    }

    public List<Listagte> getListagteList() {
        return listagteList;
    }

    public void setListagteList(List<Listagte> listagteList) {
        this.listagteList = listagteList;
    }

    public List<Actividad> getActividadList() {
        return actividadList;
    }

    public void setActividadList(List<Actividad> actividadList) {
        this.actividadList = actividadList;
    }

    public List<Departamento> getDepartamentoList() {
        return departamentoList;
    }

    public void setDepartamentoList(List<Departamento> departamentoList) {
        this.departamentoList = departamentoList;
    }

    public List<GrupoDeAsegurados> getGrupoDeAseguradosList() {
        return grupoDeAseguradosList;
    }

    public void setGrupoDeAseguradosList(List<GrupoDeAsegurados> grupoDeAseguradosList) {
        this.grupoDeAseguradosList = grupoDeAseguradosList;
    }

    public List<TipoDocumento> getTipoDocumentoList() {
        return tipoDocumentoList;
    }

    public void setTipoDocumentoList(List<TipoDocumento> tipoDocumentoList) {
        this.tipoDocumentoList = tipoDocumentoList;
    }

    public List<Negocios> getNegociosList() {
        return negociosList;
    }

    public void setNegociosList(List<Negocios> negociosList) {
        this.negociosList = negociosList;
    }

    public SeccionesEmpresa getDepartamento() {
        return departamento;
    }

    public void setDepartamento(SeccionesEmpresa departamento) {
        this.departamento = departamento;
    }

    public List<SubRubro> getSubRubroList() {
        return subRubroList;
    }

    public void setSubRubroList(List<SubRubro> subRubroList) {
        this.subRubroList = subRubroList;
    }

    public List<Organizadores> getOrganizadoresList() {
        return organizadoresList;
    }

    public void setOrganizadoresList(List<Organizadores> organizadoresList) {
        this.organizadoresList = organizadoresList;
    }

    public List<Polsdemi> getPolsdemiList() {
        return polsdemiList;
    }

    public void setPolsdemiList(List<Polsdemi> polsdemiList) {
        this.polsdemiList = polsdemiList;
    }

    public List<Polsdemi> getPolsdemiList1() {
        return polsdemiList1;
    }

    public void setPolsdemiList1(List<Polsdemi> polsdemiList1) {
        this.polsdemiList1 = polsdemiList1;
    }

    public List<Zonas> getZonasList() {
        return zonasList;
    }

    public void setZonasList(List<Zonas> zonasList) {
        this.zonasList = zonasList;
    }

    public List<Profesion> getProfesionList() {
        return profesionList;
    }

    public void setProfesionList(List<Profesion> profesionList) {
        this.profesionList = profesionList;
    }

    public List<TiposOrganizadores> getTiposOrganizadoresList() {
        return tiposOrganizadoresList;
    }

    public void setTiposOrganizadoresList(List<TiposOrganizadores> tiposOrganizadoresList) {
        this.tiposOrganizadoresList = tiposOrganizadoresList;
    }

    public List<TiposOrganizadores> getTiposOrganizadoresList1() {
        return tiposOrganizadoresList1;
    }

    public void setTiposOrganizadoresList1(List<TiposOrganizadores> tiposOrganizadoresList1) {
        this.tiposOrganizadoresList1 = tiposOrganizadoresList1;
    }

    public List<Ciudades> getCiudadesList() {
        return ciudadesList;
    }

    public void setCiudadesList(List<Ciudades> ciudadesList) {
        this.ciudadesList = ciudadesList;
    }

    public List<AgentesBroker> getAgentesBrokerList() {
        return agentesBrokerList;
    }

    public void setAgentesBrokerList(List<AgentesBroker> agentesBrokerList) {
        this.agentesBrokerList = agentesBrokerList;
    }

    public List<Listcobr> getListcobrList() {
        return listcobrList;
    }

    public void setListcobrList(List<Listcobr> listcobrList) {
        this.listcobrList = listcobrList;
    }

    public List<Centros> getCentrosList() {
        return centrosList;
    }

    public void setCentrosList(List<Centros> centrosList) {
        this.centrosList = centrosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codUsuario != null ? codUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.codUsuario == null && other.codUsuario != null) || (this.codUsuario != null && !this.codUsuario.equals(other.codUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.larural.origen.Usuarios[ codUsuario=" + codUsuario + " ]";
    }

    public List<Listbco> getListbcoList() {
        return listbcoList;
    }

    public void setListbcoList(List<Listbco> listbcoList) {
        this.listbcoList = listbcoList;
    }

    public List<Tarjetas> getTarjetasList() {
        return tarjetasList;
    }

    public void setTarjetasList(List<Tarjetas> tarjetasList) {
        this.tarjetasList = tarjetasList;
    }

    public List<Marcas> getMarcasList() {
        return marcasList;
    }

    public void setMarcasList(List<Marcas> marcasList) {
        this.marcasList = marcasList;
    }

    public List<TiposVehiculos> getTiposVehiculosList() {
        return tiposVehiculosList;
    }

    public void setTiposVehiculosList(List<TiposVehiculos> tiposVehiculosList) {
        this.tiposVehiculosList = tiposVehiculosList;
    }

    public List<ModelosVehiculos> getModelosVehiculosList() {
        return modelosVehiculosList;
    }

    public void setModelosVehiculosList(List<ModelosVehiculos> modelosVehiculosList) {
        this.modelosVehiculosList = modelosVehiculosList;
    }

    public List<CoberturasDetalle> getCoberturasDetalleList() {
        return coberturasDetalleList;
    }

    public void setCoberturasDetalleList(List<CoberturasDetalle> coberturasDetalleList) {
        this.coberturasDetalleList = coberturasDetalleList;
    }

    public List<AsegVida> getAsegVidaList() {
        return asegVidaList;
    }

    public void setAsegVidaList(List<AsegVida> asegVidaList) {
        this.asegVidaList = asegVidaList;
    }

    public List<Certvida> getCertvidaList() {
        return certvidaList;
    }

    public void setCertvidaList(List<Certvida> certvidaList) {
        this.certvidaList = certvidaList;
    }
    
}
