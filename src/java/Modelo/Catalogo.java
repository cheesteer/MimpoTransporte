/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "Catalogo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Catalogo.findAll", query = "SELECT c FROM Catalogo c"),
    @NamedQuery(name = "Catalogo.findById", query = "SELECT c FROM Catalogo c WHERE c.id = :id"),
    @NamedQuery(name = "Catalogo.findByAduanaDeEntrada", query = "SELECT c FROM Catalogo c WHERE c.aduanaDeEntrada = :aduanaDeEntrada"),
    @NamedQuery(name = "Catalogo.findByStyle", query = "SELECT c FROM Catalogo c WHERE c.style = :style")})
public class Catalogo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "ADUANA_DE_ENTRADA")
    private String aduanaDeEntrada;
    @Basic(optional = false)
    @Column(name = "STYLE")
    private String style;

    public Catalogo() {
    }

    public Catalogo(Integer id) {
        this.id = id;
    }

    public Catalogo(Integer id, String aduanaDeEntrada, String style) {
        this.id = id;
        this.aduanaDeEntrada = aduanaDeEntrada;
        this.style = style;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAduanaDeEntrada() {
        return aduanaDeEntrada;
    }

    public void setAduanaDeEntrada(String aduanaDeEntrada) {
        this.aduanaDeEntrada = aduanaDeEntrada;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
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
        if (!(object instanceof Catalogo)) {
            return false;
        }
        Catalogo other = (Catalogo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Catalogo[ id=" + id + " ]";
    }
    
}
