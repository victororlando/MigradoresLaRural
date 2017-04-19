/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRDETALLEMEDIOTRANS")
@NamedQueries({
    @NamedQuery(name = "Lrdetallemediotrans.findAll", query = "SELECT l FROM Lrdetallemediotrans l"),
    @NamedQuery(name = "Lrdetallemediotrans.findByLrdetallemediotransid", query = "SELECT l FROM Lrdetallemediotrans l WHERE l.lrdetallemediotransid = :lrdetallemediotransid"),
    @NamedQuery(name = "Lrdetallemediotrans.findByLrdetalletransporteid", query = "SELECT l FROM Lrdetallemediotrans l WHERE l.lrdetalletransporteid = :lrdetalletransporteid"),
    @NamedQuery(name = "Lrdetallemediotrans.findByLrdetallemediotransmarca", query = "SELECT l FROM Lrdetallemediotrans l WHERE l.lrdetallemediotransmarca = :lrdetallemediotransmarca"),
    @NamedQuery(name = "Lrdetallemediotrans.findByLrdetallemediotransmodelo", query = "SELECT l FROM Lrdetallemediotrans l WHERE l.lrdetallemediotransmodelo = :lrdetallemediotransmodelo"),
    @NamedQuery(name = "Lrdetallemediotrans.findByLrdetallemediotransanho", query = "SELECT l FROM Lrdetallemediotrans l WHERE l.lrdetallemediotransanho = :lrdetallemediotransanho"),
    @NamedQuery(name = "Lrdetallemediotrans.findByLrdetallemediotransmatricula", query = "SELECT l FROM Lrdetallemediotrans l WHERE l.lrdetallemediotransmatricula = :lrdetallemediotransmatricula"),
    @NamedQuery(name = "Lrdetallemediotrans.findByLrdetallemediotranscontenedor", query = "SELECT l FROM Lrdetallemediotrans l WHERE l.lrdetallemediotranscontenedor = :lrdetallemediotranscontenedor"),
    @NamedQuery(name = "Lrdetallemediotrans.findByLrdetallemediotransbarco", query = "SELECT l FROM Lrdetallemediotrans l WHERE l.lrdetallemediotransbarco = :lrdetallemediotransbarco"),
    @NamedQuery(name = "Lrdetallemediotrans.findByLrdetallemediotransbarcaza", query = "SELECT l FROM Lrdetallemediotrans l WHERE l.lrdetallemediotransbarcaza = :lrdetallemediotransbarcaza"),
    @NamedQuery(name = "Lrdetallemediotrans.findByLrdetallemediotranschapa", query = "SELECT l FROM Lrdetallemediotrans l WHERE l.lrdetallemediotranschapa = :lrdetallemediotranschapa"),
    @NamedQuery(name = "Lrdetallemediotrans.findByLrdetallemediotransci", query = "SELECT l FROM Lrdetallemediotrans l WHERE l.lrdetallemediotransci = :lrdetallemediotransci"),
    @NamedQuery(name = "Lrdetallemediotrans.findByLrdetallemediotransnombre", query = "SELECT l FROM Lrdetallemediotrans l WHERE l.lrdetallemediotransnombre = :lrdetallemediotransnombre"),
    @NamedQuery(name = "Lrdetallemediotrans.findByLrdetallemediotransregnro", query = "SELECT l FROM Lrdetallemediotrans l WHERE l.lrdetallemediotransregnro = :lrdetallemediotransregnro")})
public class Lrdetallemediotrans implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRDETALLEMEDIOTRANSID", nullable = false)
    private Long lrdetallemediotransid;
    @Basic(optional = false)
    @Column(name = "LRDETALLETRANSPORTEID", nullable = false)
    private long lrdetalletransporteid;
    @Basic(optional = false)
    @Column(name = "LRDETALLEMEDIOTRANSMARCA", nullable = false, length = 100)
    private String lrdetallemediotransmarca;
    @Basic(optional = false)
    @Column(name = "LRDETALLEMEDIOTRANSMODELO", nullable = false, length = 100)
    private String lrdetallemediotransmodelo;
    @Basic(optional = false)
    @Column(name = "LRDETALLEMEDIOTRANSANHO", nullable = false)
    private short lrdetallemediotransanho;
    @Basic(optional = false)
    @Column(name = "LRDETALLEMEDIOTRANSMATRICULA", nullable = false, length = 20)
    private String lrdetallemediotransmatricula;
    @Basic(optional = false)
    @Column(name = "LRDETALLEMEDIOTRANSCONTENEDOR", nullable = false, length = 20)
    private String lrdetallemediotranscontenedor;
    @Basic(optional = false)
    @Column(name = "LRDETALLEMEDIOTRANSBARCO", nullable = false, length = 20)
    private String lrdetallemediotransbarco;
    @Basic(optional = false)
    @Column(name = "LRDETALLEMEDIOTRANSBARCAZA", nullable = false, length = 20)
    private String lrdetallemediotransbarcaza;
    @Basic(optional = false)
    @Column(name = "LRDETALLEMEDIOTRANSCHAPA", nullable = false, length = 20)
    private String lrdetallemediotranschapa;
    @Basic(optional = false)
    @Column(name = "LRDETALLEMEDIOTRANSCI", nullable = false, length = 20)
    private String lrdetallemediotransci;
    @Basic(optional = false)
    @Column(name = "LRDETALLEMEDIOTRANSNOMBRE", nullable = false, length = 100)
    private String lrdetallemediotransnombre;
    @Basic(optional = false)
    @Column(name = "LRDETALLEMEDIOTRANSREGNRO", nullable = false)
    private long lrdetallemediotransregnro;

    public Lrdetallemediotrans() {
    }

    public Lrdetallemediotrans(Long lrdetallemediotransid) {
        this.lrdetallemediotransid = lrdetallemediotransid;
    }

    public Lrdetallemediotrans(Long lrdetallemediotransid, long lrdetalletransporteid, String lrdetallemediotransmarca, String lrdetallemediotransmodelo, short lrdetallemediotransanho, String lrdetallemediotransmatricula, String lrdetallemediotranscontenedor, String lrdetallemediotransbarco, String lrdetallemediotransbarcaza, String lrdetallemediotranschapa, String lrdetallemediotransci, String lrdetallemediotransnombre, long lrdetallemediotransregnro) {
        this.lrdetallemediotransid = lrdetallemediotransid;
        this.lrdetalletransporteid = lrdetalletransporteid;
        this.lrdetallemediotransmarca = lrdetallemediotransmarca;
        this.lrdetallemediotransmodelo = lrdetallemediotransmodelo;
        this.lrdetallemediotransanho = lrdetallemediotransanho;
        this.lrdetallemediotransmatricula = lrdetallemediotransmatricula;
        this.lrdetallemediotranscontenedor = lrdetallemediotranscontenedor;
        this.lrdetallemediotransbarco = lrdetallemediotransbarco;
        this.lrdetallemediotransbarcaza = lrdetallemediotransbarcaza;
        this.lrdetallemediotranschapa = lrdetallemediotranschapa;
        this.lrdetallemediotransci = lrdetallemediotransci;
        this.lrdetallemediotransnombre = lrdetallemediotransnombre;
        this.lrdetallemediotransregnro = lrdetallemediotransregnro;
    }

    public Long getLrdetallemediotransid() {
        return lrdetallemediotransid;
    }

    public void setLrdetallemediotransid(Long lrdetallemediotransid) {
        this.lrdetallemediotransid = lrdetallemediotransid;
    }

    public long getLrdetalletransporteid() {
        return lrdetalletransporteid;
    }

    public void setLrdetalletransporteid(long lrdetalletransporteid) {
        this.lrdetalletransporteid = lrdetalletransporteid;
    }

    public String getLrdetallemediotransmarca() {
        return lrdetallemediotransmarca;
    }

    public void setLrdetallemediotransmarca(String lrdetallemediotransmarca) {
        this.lrdetallemediotransmarca = lrdetallemediotransmarca;
    }

    public String getLrdetallemediotransmodelo() {
        return lrdetallemediotransmodelo;
    }

    public void setLrdetallemediotransmodelo(String lrdetallemediotransmodelo) {
        this.lrdetallemediotransmodelo = lrdetallemediotransmodelo;
    }

    public short getLrdetallemediotransanho() {
        return lrdetallemediotransanho;
    }

    public void setLrdetallemediotransanho(short lrdetallemediotransanho) {
        this.lrdetallemediotransanho = lrdetallemediotransanho;
    }

    public String getLrdetallemediotransmatricula() {
        return lrdetallemediotransmatricula;
    }

    public void setLrdetallemediotransmatricula(String lrdetallemediotransmatricula) {
        this.lrdetallemediotransmatricula = lrdetallemediotransmatricula;
    }

    public String getLrdetallemediotranscontenedor() {
        return lrdetallemediotranscontenedor;
    }

    public void setLrdetallemediotranscontenedor(String lrdetallemediotranscontenedor) {
        this.lrdetallemediotranscontenedor = lrdetallemediotranscontenedor;
    }

    public String getLrdetallemediotransbarco() {
        return lrdetallemediotransbarco;
    }

    public void setLrdetallemediotransbarco(String lrdetallemediotransbarco) {
        this.lrdetallemediotransbarco = lrdetallemediotransbarco;
    }

    public String getLrdetallemediotransbarcaza() {
        return lrdetallemediotransbarcaza;
    }

    public void setLrdetallemediotransbarcaza(String lrdetallemediotransbarcaza) {
        this.lrdetallemediotransbarcaza = lrdetallemediotransbarcaza;
    }

    public String getLrdetallemediotranschapa() {
        return lrdetallemediotranschapa;
    }

    public void setLrdetallemediotranschapa(String lrdetallemediotranschapa) {
        this.lrdetallemediotranschapa = lrdetallemediotranschapa;
    }

    public String getLrdetallemediotransci() {
        return lrdetallemediotransci;
    }

    public void setLrdetallemediotransci(String lrdetallemediotransci) {
        this.lrdetallemediotransci = lrdetallemediotransci;
    }

    public String getLrdetallemediotransnombre() {
        return lrdetallemediotransnombre;
    }

    public void setLrdetallemediotransnombre(String lrdetallemediotransnombre) {
        this.lrdetallemediotransnombre = lrdetallemediotransnombre;
    }

    public long getLrdetallemediotransregnro() {
        return lrdetallemediotransregnro;
    }

    public void setLrdetallemediotransregnro(long lrdetallemediotransregnro) {
        this.lrdetallemediotransregnro = lrdetallemediotransregnro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrdetallemediotransid != null ? lrdetallemediotransid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrdetallemediotrans)) {
            return false;
        }
        Lrdetallemediotrans other = (Lrdetallemediotrans) object;
        if ((this.lrdetallemediotransid == null && other.lrdetallemediotransid != null) || (this.lrdetallemediotransid != null && !this.lrdetallemediotransid.equals(other.lrdetallemediotransid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrdetallemediotrans[ lrdetallemediotransid=" + lrdetallemediotransid + " ]";
    }
    
}
