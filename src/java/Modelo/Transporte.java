/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "Transporte")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transporte.findAll", query = "SELECT t FROM Transporte t"),
    @NamedQuery(name = "Transporte.findByIdTransporte", query = "SELECT t FROM Transporte t WHERE t.idTransporte = :idTransporte"),
    @NamedQuery(name = "Transporte.findBySucursal", query = "SELECT t FROM Transporte t WHERE t.sucursal = :sucursal"),
    @NamedQuery(name = "Transporte.findByReferencias", query = "SELECT t FROM Transporte t WHERE t.referencias = :referencias"),
    @NamedQuery(name = "Transporte.findByEmbarquesporcita", query = "SELECT t FROM Transporte t WHERE t.embarquesporcita = :embarquesporcita"),
    @NamedQuery(name = "Transporte.findByEquipoutilizado", query = "SELECT t FROM Transporte t WHERE t.equipoutilizado = :equipoutilizado"),
    @NamedQuery(name = "Transporte.findByConfiguracion", query = "SELECT t FROM Transporte t WHERE t.configuracion = :configuracion"),
    @NamedQuery(name = "Transporte.findByPlacas", query = "SELECT t FROM Transporte t WHERE t.placas = :placas"),
    @NamedQuery(name = "Transporte.findByAlmacen", query = "SELECT t FROM Transporte t WHERE t.almacen = :almacen"),
    @NamedQuery(name = "Transporte.findByIniciodetransito", query = "SELECT t FROM Transporte t WHERE t.iniciodetransito = :iniciodetransito"),
    @NamedQuery(name = "Transporte.findByNumeroCita", query = "SELECT t FROM Transporte t WHERE t.numeroCita = :numeroCita"),
    @NamedQuery(name = "Transporte.findByHoracita", query = "SELECT t FROM Transporte t WHERE t.horacita = :horacita"),
    @NamedQuery(name = "Transporte.findByFechaarribo", query = "SELECT t FROM Transporte t WHERE t.fechaarribo = :fechaarribo"),
    @NamedQuery(name = "Transporte.findByIniciodescarga", query = "SELECT t FROM Transporte t WHERE t.iniciodescarga = :iniciodescarga"),
    @NamedQuery(name = "Transporte.findByFindescarga", query = "SELECT t FROM Transporte t WHERE t.findescarga = :findescarga"),
    @NamedQuery(name = "Transporte.findByDiasEspera", query = "SELECT t FROM Transporte t WHERE t.diasEspera = :diasEspera"),
    @NamedQuery(name = "Transporte.findByTiempoEsperadescarga", query = "SELECT t FROM Transporte t WHERE t.tiempoEsperadescarga = :tiempoEsperadescarga"),
    @NamedQuery(name = "Transporte.findByTiempodescarga", query = "SELECT t FROM Transporte t WHERE t.tiempodescarga = :tiempodescarga"),
    @NamedQuery(name = "Transporte.findByTiempoUnidadAlmacen", query = "SELECT t FROM Transporte t WHERE t.tiempoUnidadAlmacen = :tiempoUnidadAlmacen"),
    @NamedQuery(name = "Transporte.findByIdCostoTransporte", query = "SELECT t FROM Transporte t WHERE t.idCostoTransporte = :idCostoTransporte")})
public class Transporte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Transporte")
    private Integer idTransporte;
    @Column(name = "Sucursal")
    private String sucursal;
    @Column(name = "Referencias")
    private String referencias;
    @Column(name = "Embarques_por_cita")
    private Integer embarquesporcita;
    @Column(name = "Equipo_utilizado")
    private String equipoutilizado;
    @Column(name = "Configuracion")
    private String configuracion;
    @Column(name = "Placas")
    private String placas;
    @Column(name = "Almacen")
    private String almacen;
    @Column(name = "Inicio_de_transito")
    @Temporal(TemporalType.TIMESTAMP)
    private Date iniciodetransito;
    @Column(name = "Numero_Cita")
    private String numeroCita;
    @Column(name = "Hora_cita")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horacita;
    @Column(name = "Fecha_arribo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaarribo;
    @Column(name = "Inicio_descarga")
    @Temporal(TemporalType.TIMESTAMP)
    private Date iniciodescarga;
    @Column(name = "Fin_descarga")
    @Temporal(TemporalType.TIMESTAMP)
    private Date findescarga;
    @Column(name = "Dias_Espera")
    @Temporal(TemporalType.TIMESTAMP)
    private Date diasEspera;
    @Column(name = "TiempoEspera_descarga")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tiempoEsperadescarga;
    @Column(name = "Tiempo_descarga")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tiempodescarga;
    @Column(name = "TiempoUnidad_Almacen")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tiempoUnidadAlmacen;
    @Column(name = "Id_CostoTransporte")
    private Integer idCostoTransporte;

    public Transporte() {
    }

    public Transporte(Integer idTransporte) {
        this.idTransporte = idTransporte;
    }

    public Integer getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(Integer idTransporte) {
        this.idTransporte = idTransporte;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public Integer getEmbarquesporcita() {
        return embarquesporcita;
    }

    public void setEmbarquesporcita(Integer embarquesporcita) {
        this.embarquesporcita = embarquesporcita;
    }

    public String getEquipoutilizado() {
        return equipoutilizado;
    }

    public void setEquipoutilizado(String equipoutilizado) {
        this.equipoutilizado = equipoutilizado;
    }

    public String getConfiguracion() {
        return configuracion;
    }

    public void setConfiguracion(String configuracion) {
        this.configuracion = configuracion;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getAlmacen() {
        return almacen;
    }

    public void setAlmacen(String almacen) {
        this.almacen = almacen;
    }

    public Date getIniciodetransito() {
        return iniciodetransito;
    }

    public void setIniciodetransito(Date iniciodetransito) {
        this.iniciodetransito = iniciodetransito;
    }

    public String getNumeroCita() {
        return numeroCita;
    }

    public void setNumeroCita(String numeroCita) {
        this.numeroCita = numeroCita;
    }

    public Date getHoracita() {
        return horacita;
    }

    public void setHoracita(Date horacita) {
        this.horacita = horacita;
    }

    public Date getFechaarribo() {
        return fechaarribo;
    }

    public void setFechaarribo(Date fechaarribo) {
        this.fechaarribo = fechaarribo;
    }

    public Date getIniciodescarga() {
        return iniciodescarga;
    }

    public void setIniciodescarga(Date iniciodescarga) {
        this.iniciodescarga = iniciodescarga;
    }

    public Date getFindescarga() {
        return findescarga;
    }

    public void setFindescarga(Date findescarga) {
        this.findescarga = findescarga;
    }

    public Date getDiasEspera() {
        return diasEspera;
    }

    public void setDiasEspera(Date diasEspera) {
        this.diasEspera = diasEspera;
    }

    public Date getTiempoEsperadescarga() {
        return tiempoEsperadescarga;
    }

    public void setTiempoEsperadescarga(Date tiempoEsperadescarga) {
        this.tiempoEsperadescarga = tiempoEsperadescarga;
    }

    public Date getTiempodescarga() {
        return tiempodescarga;
    }

    public void setTiempodescarga(Date tiempodescarga) {
        this.tiempodescarga = tiempodescarga;
    }

    public Date getTiempoUnidadAlmacen() {
        return tiempoUnidadAlmacen;
    }

    public void setTiempoUnidadAlmacen(Date tiempoUnidadAlmacen) {
        this.tiempoUnidadAlmacen = tiempoUnidadAlmacen;
    }

    public Integer getIdCostoTransporte() {
        return idCostoTransporte;
    }

    public void setIdCostoTransporte(Integer idCostoTransporte) {
        this.idCostoTransporte = idCostoTransporte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTransporte != null ? idTransporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transporte)) {
            return false;
        }
        Transporte other = (Transporte) object;
        if ((this.idTransporte == null && other.idTransporte != null) || (this.idTransporte != null && !this.idTransporte.equals(other.idTransporte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Transporte[ idTransporte=" + idTransporte + " ]";
    }
    
}
