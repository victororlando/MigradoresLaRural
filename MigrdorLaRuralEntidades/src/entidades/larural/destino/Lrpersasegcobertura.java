/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.larural.destino;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author victoro
 */
@Entity
@Table(name = "LRPERSASEGCOBERTURA")
@NamedQueries({
    @NamedQuery(name = "Lrpersasegcobertura.findAll", query = "SELECT l FROM Lrpersasegcobertura l"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturaid", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturaid = :lrpersasegcoberturaid"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrcotidatbienaseid", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrcotidatbienaseid = :lrcotidatbienaseid"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturatasabruta", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturatasabruta = :lrpersasegcoberturatasabruta"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturadescuentoma", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturadescuentoma = :lrpersasegcoberturadescuentoma"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturarecargomat", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturarecargomat = :lrpersasegcoberturarecargomat"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturadescuentore", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturadescuentore = :lrpersasegcoberturadescuentore"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturarecargorea", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturarecargorea = :lrpersasegcoberturarecargorea"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturadescuentoco", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturadescuentoco = :lrpersasegcoberturadescuentoco"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturarecargocoa", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturarecargocoa = :lrpersasegcoberturarecargocoa"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturaprimatecbru", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturaprimatecbru = :lrpersasegcoberturaprimatecbru"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturatasatec", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturatasatec = :lrpersasegcoberturatasatec"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturadesccorpora", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturadesccorpora = :lrpersasegcoberturadesccorpora"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturasubtotcomis", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturasubtotcomis = :lrpersasegcoberturasubtotcomis"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturacomicontrat", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturacomicontrat = :lrpersasegcoberturacomicontrat"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturacominegocia", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturacominegocia = :lrpersasegcoberturacominegocia"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturacomicedida", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturacomicedida = :lrpersasegcoberturacomicedida"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturacomiotrosga", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturacomiotrosga = :lrpersasegcoberturacomiotrosga"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturatotalcom", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturatotalcom = :lrpersasegcoberturatotalcom"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturagtoadmin", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturagtoadmin = :lrpersasegcoberturagtoadmin"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturaprimacombru", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturaprimacombru = :lrpersasegcoberturaprimacombru"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturarecargocom", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturarecargocom = :lrpersasegcoberturarecargocom"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturadescom", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturadescom = :lrpersasegcoberturadescom"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturabonificacio", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturabonificacio = :lrpersasegcoberturabonificacio"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturaprimacomnet", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturaprimacomnet = :lrpersasegcoberturaprimacomnet"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturatasacomneta", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturatasacomneta = :lrpersasegcoberturatasacomneta"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturaiva", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturaiva = :lrpersasegcoberturaiva"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturarpf", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturarpf = :lrpersasegcoberturarpf"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturadescrpf", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturadescrpf = :lrpersasegcoberturadescrpf"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturaajustetarje", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturaajustetarje = :lrpersasegcoberturaajustetarje"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturapremio", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturapremio = :lrpersasegcoberturapremio"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturaprimatecnet", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturaprimatecnet = :lrpersasegcoberturaprimatecnet"),
    @NamedQuery(name = "Lrpersasegcobertura.findByLrpersasegcoberturasumaase", query = "SELECT l FROM Lrpersasegcobertura l WHERE l.lrpersasegcoberturasumaase = :lrpersasegcoberturasumaase")})
public class Lrpersasegcobertura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURAID", nullable = false)
    private Long lrpersasegcoberturaid;
    @Basic(optional = false)
    @Column(name = "LRCOTIDATBIENASEID", nullable = false)
    private long lrcotidatbienaseid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURATASABRUTA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturatasabruta;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURADESCUENTOMA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturadescuentoma;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURARECARGOMAT", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturarecargomat;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURADESCUENTORE", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturadescuentore;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURARECARGOREA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturarecargorea;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURADESCUENTOCO", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturadescuentoco;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURARECARGOCOA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturarecargocoa;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURAPRIMATECBRU", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturaprimatecbru;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURATASATEC", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturatasatec;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURADESCCORPORA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturadesccorpora;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURASUBTOTCOMIS", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturasubtotcomis;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURACOMICONTRAT", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturacomicontrat;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURACOMINEGOCIA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturacominegocia;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURACOMICEDIDA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturacomicedida;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURACOMIOTROSGA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturacomiotrosga;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURATOTALCOM", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturatotalcom;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURAGTOADMIN", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturagtoadmin;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURAPRIMACOMBRU", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturaprimacombru;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURARECARGOCOM", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturarecargocom;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURADESCOM", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturadescom;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURABONIFICACIO", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturabonificacio;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURAPRIMACOMNET", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturaprimacomnet;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURATASACOMNETA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturatasacomneta;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURAIVA", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturaiva;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURARPF", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturarpf;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURADESCRPF", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturadescrpf;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURAAJUSTETARJE", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturaajustetarje;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURAPREMIO", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturapremio;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURAPRIMATECNET", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturaprimatecnet;
    @Basic(optional = false)
    @Column(name = "LRPERSASEGCOBERTURASUMAASE", nullable = false, precision = 17, scale = 2)
    private BigDecimal lrpersasegcoberturasumaase;
    @JoinColumn(name = "LRPERSONAASEGURADAID", referencedColumnName = "LRPERSONAASEGURADAID", nullable = false)
    @ManyToOne(optional = false)
    private Lrpersonaasegurada lrpersonaaseguradaid;

    public Lrpersasegcobertura() {
    }

    public Lrpersasegcobertura(Long lrpersasegcoberturaid) {
        this.lrpersasegcoberturaid = lrpersasegcoberturaid;
    }

    public Lrpersasegcobertura(Long lrpersasegcoberturaid, long lrcotidatbienaseid, BigDecimal lrpersasegcoberturatasabruta, BigDecimal lrpersasegcoberturadescuentoma, BigDecimal lrpersasegcoberturarecargomat, BigDecimal lrpersasegcoberturadescuentore, BigDecimal lrpersasegcoberturarecargorea, BigDecimal lrpersasegcoberturadescuentoco, BigDecimal lrpersasegcoberturarecargocoa, BigDecimal lrpersasegcoberturaprimatecbru, BigDecimal lrpersasegcoberturatasatec, BigDecimal lrpersasegcoberturadesccorpora, BigDecimal lrpersasegcoberturasubtotcomis, BigDecimal lrpersasegcoberturacomicontrat, BigDecimal lrpersasegcoberturacominegocia, BigDecimal lrpersasegcoberturacomicedida, BigDecimal lrpersasegcoberturacomiotrosga, BigDecimal lrpersasegcoberturatotalcom, BigDecimal lrpersasegcoberturagtoadmin, BigDecimal lrpersasegcoberturaprimacombru, BigDecimal lrpersasegcoberturarecargocom, BigDecimal lrpersasegcoberturadescom, BigDecimal lrpersasegcoberturabonificacio, BigDecimal lrpersasegcoberturaprimacomnet, BigDecimal lrpersasegcoberturatasacomneta, BigDecimal lrpersasegcoberturaiva, BigDecimal lrpersasegcoberturarpf, BigDecimal lrpersasegcoberturadescrpf, BigDecimal lrpersasegcoberturaajustetarje, BigDecimal lrpersasegcoberturapremio, BigDecimal lrpersasegcoberturaprimatecnet, BigDecimal lrpersasegcoberturasumaase) {
        this.lrpersasegcoberturaid = lrpersasegcoberturaid;
        this.lrcotidatbienaseid = lrcotidatbienaseid;
        this.lrpersasegcoberturatasabruta = lrpersasegcoberturatasabruta;
        this.lrpersasegcoberturadescuentoma = lrpersasegcoberturadescuentoma;
        this.lrpersasegcoberturarecargomat = lrpersasegcoberturarecargomat;
        this.lrpersasegcoberturadescuentore = lrpersasegcoberturadescuentore;
        this.lrpersasegcoberturarecargorea = lrpersasegcoberturarecargorea;
        this.lrpersasegcoberturadescuentoco = lrpersasegcoberturadescuentoco;
        this.lrpersasegcoberturarecargocoa = lrpersasegcoberturarecargocoa;
        this.lrpersasegcoberturaprimatecbru = lrpersasegcoberturaprimatecbru;
        this.lrpersasegcoberturatasatec = lrpersasegcoberturatasatec;
        this.lrpersasegcoberturadesccorpora = lrpersasegcoberturadesccorpora;
        this.lrpersasegcoberturasubtotcomis = lrpersasegcoberturasubtotcomis;
        this.lrpersasegcoberturacomicontrat = lrpersasegcoberturacomicontrat;
        this.lrpersasegcoberturacominegocia = lrpersasegcoberturacominegocia;
        this.lrpersasegcoberturacomicedida = lrpersasegcoberturacomicedida;
        this.lrpersasegcoberturacomiotrosga = lrpersasegcoberturacomiotrosga;
        this.lrpersasegcoberturatotalcom = lrpersasegcoberturatotalcom;
        this.lrpersasegcoberturagtoadmin = lrpersasegcoberturagtoadmin;
        this.lrpersasegcoberturaprimacombru = lrpersasegcoberturaprimacombru;
        this.lrpersasegcoberturarecargocom = lrpersasegcoberturarecargocom;
        this.lrpersasegcoberturadescom = lrpersasegcoberturadescom;
        this.lrpersasegcoberturabonificacio = lrpersasegcoberturabonificacio;
        this.lrpersasegcoberturaprimacomnet = lrpersasegcoberturaprimacomnet;
        this.lrpersasegcoberturatasacomneta = lrpersasegcoberturatasacomneta;
        this.lrpersasegcoberturaiva = lrpersasegcoberturaiva;
        this.lrpersasegcoberturarpf = lrpersasegcoberturarpf;
        this.lrpersasegcoberturadescrpf = lrpersasegcoberturadescrpf;
        this.lrpersasegcoberturaajustetarje = lrpersasegcoberturaajustetarje;
        this.lrpersasegcoberturapremio = lrpersasegcoberturapremio;
        this.lrpersasegcoberturaprimatecnet = lrpersasegcoberturaprimatecnet;
        this.lrpersasegcoberturasumaase = lrpersasegcoberturasumaase;
    }

    public Long getLrpersasegcoberturaid() {
        return lrpersasegcoberturaid;
    }

    public void setLrpersasegcoberturaid(Long lrpersasegcoberturaid) {
        this.lrpersasegcoberturaid = lrpersasegcoberturaid;
    }

    public long getLrcotidatbienaseid() {
        return lrcotidatbienaseid;
    }

    public void setLrcotidatbienaseid(long lrcotidatbienaseid) {
        this.lrcotidatbienaseid = lrcotidatbienaseid;
    }

    public BigDecimal getLrpersasegcoberturatasabruta() {
        return lrpersasegcoberturatasabruta;
    }

    public void setLrpersasegcoberturatasabruta(BigDecimal lrpersasegcoberturatasabruta) {
        this.lrpersasegcoberturatasabruta = lrpersasegcoberturatasabruta;
    }

    public BigDecimal getLrpersasegcoberturadescuentoma() {
        return lrpersasegcoberturadescuentoma;
    }

    public void setLrpersasegcoberturadescuentoma(BigDecimal lrpersasegcoberturadescuentoma) {
        this.lrpersasegcoberturadescuentoma = lrpersasegcoberturadescuentoma;
    }

    public BigDecimal getLrpersasegcoberturarecargomat() {
        return lrpersasegcoberturarecargomat;
    }

    public void setLrpersasegcoberturarecargomat(BigDecimal lrpersasegcoberturarecargomat) {
        this.lrpersasegcoberturarecargomat = lrpersasegcoberturarecargomat;
    }

    public BigDecimal getLrpersasegcoberturadescuentore() {
        return lrpersasegcoberturadescuentore;
    }

    public void setLrpersasegcoberturadescuentore(BigDecimal lrpersasegcoberturadescuentore) {
        this.lrpersasegcoberturadescuentore = lrpersasegcoberturadescuentore;
    }

    public BigDecimal getLrpersasegcoberturarecargorea() {
        return lrpersasegcoberturarecargorea;
    }

    public void setLrpersasegcoberturarecargorea(BigDecimal lrpersasegcoberturarecargorea) {
        this.lrpersasegcoberturarecargorea = lrpersasegcoberturarecargorea;
    }

    public BigDecimal getLrpersasegcoberturadescuentoco() {
        return lrpersasegcoberturadescuentoco;
    }

    public void setLrpersasegcoberturadescuentoco(BigDecimal lrpersasegcoberturadescuentoco) {
        this.lrpersasegcoberturadescuentoco = lrpersasegcoberturadescuentoco;
    }

    public BigDecimal getLrpersasegcoberturarecargocoa() {
        return lrpersasegcoberturarecargocoa;
    }

    public void setLrpersasegcoberturarecargocoa(BigDecimal lrpersasegcoberturarecargocoa) {
        this.lrpersasegcoberturarecargocoa = lrpersasegcoberturarecargocoa;
    }

    public BigDecimal getLrpersasegcoberturaprimatecbru() {
        return lrpersasegcoberturaprimatecbru;
    }

    public void setLrpersasegcoberturaprimatecbru(BigDecimal lrpersasegcoberturaprimatecbru) {
        this.lrpersasegcoberturaprimatecbru = lrpersasegcoberturaprimatecbru;
    }

    public BigDecimal getLrpersasegcoberturatasatec() {
        return lrpersasegcoberturatasatec;
    }

    public void setLrpersasegcoberturatasatec(BigDecimal lrpersasegcoberturatasatec) {
        this.lrpersasegcoberturatasatec = lrpersasegcoberturatasatec;
    }

    public BigDecimal getLrpersasegcoberturadesccorpora() {
        return lrpersasegcoberturadesccorpora;
    }

    public void setLrpersasegcoberturadesccorpora(BigDecimal lrpersasegcoberturadesccorpora) {
        this.lrpersasegcoberturadesccorpora = lrpersasegcoberturadesccorpora;
    }

    public BigDecimal getLrpersasegcoberturasubtotcomis() {
        return lrpersasegcoberturasubtotcomis;
    }

    public void setLrpersasegcoberturasubtotcomis(BigDecimal lrpersasegcoberturasubtotcomis) {
        this.lrpersasegcoberturasubtotcomis = lrpersasegcoberturasubtotcomis;
    }

    public BigDecimal getLrpersasegcoberturacomicontrat() {
        return lrpersasegcoberturacomicontrat;
    }

    public void setLrpersasegcoberturacomicontrat(BigDecimal lrpersasegcoberturacomicontrat) {
        this.lrpersasegcoberturacomicontrat = lrpersasegcoberturacomicontrat;
    }

    public BigDecimal getLrpersasegcoberturacominegocia() {
        return lrpersasegcoberturacominegocia;
    }

    public void setLrpersasegcoberturacominegocia(BigDecimal lrpersasegcoberturacominegocia) {
        this.lrpersasegcoberturacominegocia = lrpersasegcoberturacominegocia;
    }

    public BigDecimal getLrpersasegcoberturacomicedida() {
        return lrpersasegcoberturacomicedida;
    }

    public void setLrpersasegcoberturacomicedida(BigDecimal lrpersasegcoberturacomicedida) {
        this.lrpersasegcoberturacomicedida = lrpersasegcoberturacomicedida;
    }

    public BigDecimal getLrpersasegcoberturacomiotrosga() {
        return lrpersasegcoberturacomiotrosga;
    }

    public void setLrpersasegcoberturacomiotrosga(BigDecimal lrpersasegcoberturacomiotrosga) {
        this.lrpersasegcoberturacomiotrosga = lrpersasegcoberturacomiotrosga;
    }

    public BigDecimal getLrpersasegcoberturatotalcom() {
        return lrpersasegcoberturatotalcom;
    }

    public void setLrpersasegcoberturatotalcom(BigDecimal lrpersasegcoberturatotalcom) {
        this.lrpersasegcoberturatotalcom = lrpersasegcoberturatotalcom;
    }

    public BigDecimal getLrpersasegcoberturagtoadmin() {
        return lrpersasegcoberturagtoadmin;
    }

    public void setLrpersasegcoberturagtoadmin(BigDecimal lrpersasegcoberturagtoadmin) {
        this.lrpersasegcoberturagtoadmin = lrpersasegcoberturagtoadmin;
    }

    public BigDecimal getLrpersasegcoberturaprimacombru() {
        return lrpersasegcoberturaprimacombru;
    }

    public void setLrpersasegcoberturaprimacombru(BigDecimal lrpersasegcoberturaprimacombru) {
        this.lrpersasegcoberturaprimacombru = lrpersasegcoberturaprimacombru;
    }

    public BigDecimal getLrpersasegcoberturarecargocom() {
        return lrpersasegcoberturarecargocom;
    }

    public void setLrpersasegcoberturarecargocom(BigDecimal lrpersasegcoberturarecargocom) {
        this.lrpersasegcoberturarecargocom = lrpersasegcoberturarecargocom;
    }

    public BigDecimal getLrpersasegcoberturadescom() {
        return lrpersasegcoberturadescom;
    }

    public void setLrpersasegcoberturadescom(BigDecimal lrpersasegcoberturadescom) {
        this.lrpersasegcoberturadescom = lrpersasegcoberturadescom;
    }

    public BigDecimal getLrpersasegcoberturabonificacio() {
        return lrpersasegcoberturabonificacio;
    }

    public void setLrpersasegcoberturabonificacio(BigDecimal lrpersasegcoberturabonificacio) {
        this.lrpersasegcoberturabonificacio = lrpersasegcoberturabonificacio;
    }

    public BigDecimal getLrpersasegcoberturaprimacomnet() {
        return lrpersasegcoberturaprimacomnet;
    }

    public void setLrpersasegcoberturaprimacomnet(BigDecimal lrpersasegcoberturaprimacomnet) {
        this.lrpersasegcoberturaprimacomnet = lrpersasegcoberturaprimacomnet;
    }

    public BigDecimal getLrpersasegcoberturatasacomneta() {
        return lrpersasegcoberturatasacomneta;
    }

    public void setLrpersasegcoberturatasacomneta(BigDecimal lrpersasegcoberturatasacomneta) {
        this.lrpersasegcoberturatasacomneta = lrpersasegcoberturatasacomneta;
    }

    public BigDecimal getLrpersasegcoberturaiva() {
        return lrpersasegcoberturaiva;
    }

    public void setLrpersasegcoberturaiva(BigDecimal lrpersasegcoberturaiva) {
        this.lrpersasegcoberturaiva = lrpersasegcoberturaiva;
    }

    public BigDecimal getLrpersasegcoberturarpf() {
        return lrpersasegcoberturarpf;
    }

    public void setLrpersasegcoberturarpf(BigDecimal lrpersasegcoberturarpf) {
        this.lrpersasegcoberturarpf = lrpersasegcoberturarpf;
    }

    public BigDecimal getLrpersasegcoberturadescrpf() {
        return lrpersasegcoberturadescrpf;
    }

    public void setLrpersasegcoberturadescrpf(BigDecimal lrpersasegcoberturadescrpf) {
        this.lrpersasegcoberturadescrpf = lrpersasegcoberturadescrpf;
    }

    public BigDecimal getLrpersasegcoberturaajustetarje() {
        return lrpersasegcoberturaajustetarje;
    }

    public void setLrpersasegcoberturaajustetarje(BigDecimal lrpersasegcoberturaajustetarje) {
        this.lrpersasegcoberturaajustetarje = lrpersasegcoberturaajustetarje;
    }

    public BigDecimal getLrpersasegcoberturapremio() {
        return lrpersasegcoberturapremio;
    }

    public void setLrpersasegcoberturapremio(BigDecimal lrpersasegcoberturapremio) {
        this.lrpersasegcoberturapremio = lrpersasegcoberturapremio;
    }

    public BigDecimal getLrpersasegcoberturaprimatecnet() {
        return lrpersasegcoberturaprimatecnet;
    }

    public void setLrpersasegcoberturaprimatecnet(BigDecimal lrpersasegcoberturaprimatecnet) {
        this.lrpersasegcoberturaprimatecnet = lrpersasegcoberturaprimatecnet;
    }

    public BigDecimal getLrpersasegcoberturasumaase() {
        return lrpersasegcoberturasumaase;
    }

    public void setLrpersasegcoberturasumaase(BigDecimal lrpersasegcoberturasumaase) {
        this.lrpersasegcoberturasumaase = lrpersasegcoberturasumaase;
    }

    public Lrpersonaasegurada getLrpersonaaseguradaid() {
        return lrpersonaaseguradaid;
    }

    public void setLrpersonaaseguradaid(Lrpersonaasegurada lrpersonaaseguradaid) {
        this.lrpersonaaseguradaid = lrpersonaaseguradaid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrpersasegcoberturaid != null ? lrpersasegcoberturaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lrpersasegcobertura)) {
            return false;
        }
        Lrpersasegcobertura other = (Lrpersasegcobertura) object;
        if ((this.lrpersasegcoberturaid == null && other.lrpersasegcoberturaid != null) || (this.lrpersasegcoberturaid != null && !this.lrpersasegcoberturaid.equals(other.lrpersasegcoberturaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidadesdestino.Lrpersasegcobertura[ lrpersasegcoberturaid=" + lrpersasegcoberturaid + " ]";
    }
    
}
