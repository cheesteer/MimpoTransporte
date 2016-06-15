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
@Table(name = "Fracciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fracciones.findAll", query = "SELECT f FROM Fracciones f"),
    @NamedQuery(name = "Fracciones.findByReferencia", query = "SELECT f FROM Fracciones f WHERE f.referencia = :referencia"),
    @NamedQuery(name = "Fracciones.findByPedimento", query = "SELECT f FROM Fracciones f WHERE f.pedimento = :pedimento"),
    @NamedQuery(name = "Fracciones.findByImportador", query = "SELECT f FROM Fracciones f WHERE f.importador = :importador"),
    @NamedQuery(name = "Fracciones.findByPrecioUnitario", query = "SELECT f FROM Fracciones f WHERE f.precioUnitario = :precioUnitario"),
    @NamedQuery(name = "Fracciones.findByRazonSocialdeProveedores", query = "SELECT f FROM Fracciones f WHERE f.razonSocialdeProveedores = :razonSocialdeProveedores"),
    @NamedQuery(name = "Fracciones.findByNombreAduanaEntrada", query = "SELECT f FROM Fracciones f WHERE f.nombreAduanaEntrada = :nombreAduanaEntrada"),
    @NamedQuery(name = "Fracciones.findByTipoOperaci\u00f3nDesc", query = "SELECT f FROM Fracciones f WHERE f.tipoOperaci\u00f3nDesc = :tipoOperaci\u00f3nDesc"),
    @NamedQuery(name = "Fracciones.findByReferenciaMercanc\u00eda", query = "SELECT f FROM Fracciones f WHERE f.referenciaMercanc\u00eda = :referenciaMercanc\u00eda"),
    @NamedQuery(name = "Fracciones.findByValorMonedaExtranjera", query = "SELECT f FROM Fracciones f WHERE f.valorMonedaExtranjera = :valorMonedaExtranjera"),
    @NamedQuery(name = "Fracciones.findByFracciones", query = "SELECT f FROM Fracciones f WHERE f.fracciones = :fracciones")})
public class Fracciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Referencia")
    private String referencia;
    @Column(name = "Pedimento")
    private String pedimento;
    @Column(name = "Importador")
    private String importador;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Precio Unitario")
    private Double precioUnitario;
    @Column(name = "Razon Social de Proveedores")
    private String razonSocialdeProveedores;
    @Column(name = "Nombre Aduana Entrada")
    private String nombreAduanaEntrada;
    @Column(name = "Tipo Operaci\u00f3n Desc")
    private String tipoOperaciónDesc;
    @Column(name = "Referencia Mercanc\u00eda")
    private String referenciaMercancía;
    @Column(name = "Valor Moneda Extranjera")
    private Double valorMonedaExtranjera;
    @Column(name = "Fracciones")
    private String fracciones;

    public Fracciones() {
    }

    public Fracciones(String referencia) {
        this.referencia = referencia;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getPedimento() {
        return pedimento;
    }

    public void setPedimento(String pedimento) {
        this.pedimento = pedimento;
    }

    public String getImportador() {
        return importador;
    }

    public void setImportador(String importador) {
        this.importador = importador;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getRazonSocialdeProveedores() {
        return razonSocialdeProveedores;
    }

    public void setRazonSocialdeProveedores(String razonSocialdeProveedores) {
        this.razonSocialdeProveedores = razonSocialdeProveedores;
    }

    public String getNombreAduanaEntrada() {
        return nombreAduanaEntrada;
    }

    public void setNombreAduanaEntrada(String nombreAduanaEntrada) {
        this.nombreAduanaEntrada = nombreAduanaEntrada;
    }

    public String getTipoOperaciónDesc() {
        return tipoOperaciónDesc;
    }

    public void setTipoOperaciónDesc(String tipoOperaciónDesc) {
        this.tipoOperaciónDesc = tipoOperaciónDesc;
    }

    public String getReferenciaMercancía() {
        return referenciaMercancía;
    }

    public void setReferenciaMercancía(String referenciaMercancía) {
        this.referenciaMercancía = referenciaMercancía;
    }

    public Double getValorMonedaExtranjera() {
        return valorMonedaExtranjera;
    }

    public void setValorMonedaExtranjera(Double valorMonedaExtranjera) {
        this.valorMonedaExtranjera = valorMonedaExtranjera;
    }

    public String getFracciones() {
        return fracciones;
    }

    public void setFracciones(String fracciones) {
        this.fracciones = fracciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (referencia != null ? referencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fracciones)) {
            return false;
        }
        Fracciones other = (Fracciones) object;
        if ((this.referencia == null && other.referencia != null) || (this.referencia != null && !this.referencia.equals(other.referencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Fracciones[ referencia=" + referencia + " ]";
    }
    
}
