/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "CostoTransporte")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CostoTransporte.findAll", query = "SELECT c FROM CostoTransporte c"),
    @NamedQuery(name = "CostoTransporte.findByIdCostoTransporte", query = "SELECT c FROM CostoTransporte c WHERE c.idCostoTransporte = :idCostoTransporte"),
    @NamedQuery(name = "CostoTransporte.findByConcepto", query = "SELECT c FROM CostoTransporte c WHERE c.concepto = :concepto"),
    @NamedQuery(name = "CostoTransporte.findByRuta", query = "SELECT c FROM CostoTransporte c WHERE c.ruta = :ruta"),
    @NamedQuery(name = "CostoTransporte.findByPrecio", query = "SELECT c FROM CostoTransporte c WHERE c.precio = :precio"),
    @NamedQuery(name = "CostoTransporte.findByObservacion", query = "SELECT c FROM CostoTransporte c WHERE c.observacion = :observacion")})
public class CostoTransporte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id_CostoTransporte")
    private Integer idCostoTransporte;
    @Column(name = "concepto")
    private String concepto;
    @Column(name = "Ruta")
    private String ruta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Precio")
    private BigDecimal precio;
    @Column(name = "Observacion")
    private String observacion;

    public CostoTransporte() {
    }

    public CostoTransporte(Integer idCostoTransporte) {
        this.idCostoTransporte = idCostoTransporte;
    }

    public Integer getIdCostoTransporte() {
        return idCostoTransporte;
    }

    public void setIdCostoTransporte(Integer idCostoTransporte) {
        this.idCostoTransporte = idCostoTransporte;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCostoTransporte != null ? idCostoTransporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CostoTransporte)) {
            return false;
        }
        CostoTransporte other = (CostoTransporte) object;
        if ((this.idCostoTransporte == null && other.idCostoTransporte != null) || (this.idCostoTransporte != null && !this.idCostoTransporte.equals(other.idCostoTransporte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.CostoTransporte[ idCostoTransporte=" + idCostoTransporte + " ]";
    }
    
}
