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
@Table(catalog = "Mimpo", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ControlMultas.findAll", query = "SELECT c FROM ControlMultas c")})
public class ControlMultas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Column(name = "Nombre_Seccion", length = 255)
    private String nombreSeccion;
    @Column(length = 255)
    private String referencia;
    @Column(length = 255)
    private String cliente;
    @Column(length = 255)
    private String pedimento;
    @Column(length = 255)
    private String asunto;
    @Column(name = "Numero_de_Acta", length = 255)
    private String numerodeActa;
    @Column(length = 255)
    private String motivo;
    @Column(length = 255)
    private String responsable;
    @Column(length = 255)
    private String estatus;
    @Column(length = 255)
    private String monto;
    @Temporal(TemporalType.TIMESTAMP)
    private Date despacho;
    @Temporal(TemporalType.TIMESTAMP)
    private Date notificacion;
    @Temporal(TemporalType.TIMESTAMP)
    private Date vencimiento;
    @Temporal(TemporalType.TIMESTAMP)
    private Date contestacion;
    @Column(name = "Vencimiento_4Meses")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vencimiento4Meses;
    @Column(name = "Asuntos_notificados_en_Cd_Juarez")
    @Temporal(TemporalType.TIMESTAMP)
    private Date asuntosnotificadosenCdJuarez;
    @Column(name = "Plazo_Autoridad")
    @Temporal(TemporalType.TIMESTAMP)
    private Date plazoAutoridad;
    @Column(name = "Notificacion_Resolucion_Defefinitiva")
    @Temporal(TemporalType.TIMESTAMP)
    private Date notificacionResolucionDefefinitiva;
    @Column(name = "Asuntos_Concluidos", length = 255)
    private String asuntosConcluidos;
    @Column(name = "Numero_De_Resolucion_Definitiva", length = 255)
    private String numeroDeResolucionDefinitiva;
    @Column(length = 255)
    private String comentario1;
    @Column(length = 255)
    private String comentario2;
    @Column(name = "Comentario_Pama", length = 255)
    private String comentarioPama;

    public ControlMultas() {
    }

    public ControlMultas(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreSeccion() {
        return nombreSeccion;
    }

    public void setNombreSeccion(String nombreSeccion) {
        this.nombreSeccion = nombreSeccion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getPedimento() {
        return pedimento;
    }

    public void setPedimento(String pedimento) {
        this.pedimento = pedimento;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getNumerodeActa() {
        return numerodeActa;
    }

    public void setNumerodeActa(String numerodeActa) {
        this.numerodeActa = numerodeActa;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public Date getDespacho() {
        return despacho;
    }

    public void setDespacho(Date despacho) {
        this.despacho = despacho;
    }

    public Date getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(Date notificacion) {
        this.notificacion = notificacion;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public Date getContestacion() {
        return contestacion;
    }

    public void setContestacion(Date contestacion) {
        this.contestacion = contestacion;
    }

    public Date getVencimiento4Meses() {
        return vencimiento4Meses;
    }

    public void setVencimiento4Meses(Date vencimiento4Meses) {
        this.vencimiento4Meses = vencimiento4Meses;
    }

    public Date getAsuntosnotificadosenCdJuarez() {
        return asuntosnotificadosenCdJuarez;
    }

    public void setAsuntosnotificadosenCdJuarez(Date asuntosnotificadosenCdJuarez) {
        this.asuntosnotificadosenCdJuarez = asuntosnotificadosenCdJuarez;
    }

    public Date getPlazoAutoridad() {
        return plazoAutoridad;
    }

    public void setPlazoAutoridad(Date plazoAutoridad) {
        this.plazoAutoridad = plazoAutoridad;
    }

    public Date getNotificacionResolucionDefefinitiva() {
        return notificacionResolucionDefefinitiva;
    }

    public void setNotificacionResolucionDefefinitiva(Date notificacionResolucionDefefinitiva) {
        this.notificacionResolucionDefefinitiva = notificacionResolucionDefefinitiva;
    }

    public String getAsuntosConcluidos() {
        return asuntosConcluidos;
    }

    public void setAsuntosConcluidos(String asuntosConcluidos) {
        this.asuntosConcluidos = asuntosConcluidos;
    }

    public String getNumeroDeResolucionDefinitiva() {
        return numeroDeResolucionDefinitiva;
    }

    public void setNumeroDeResolucionDefinitiva(String numeroDeResolucionDefinitiva) {
        this.numeroDeResolucionDefinitiva = numeroDeResolucionDefinitiva;
    }

    public String getComentario1() {
        return comentario1;
    }

    public void setComentario1(String comentario1) {
        this.comentario1 = comentario1;
    }

    public String getComentario2() {
        return comentario2;
    }

    public void setComentario2(String comentario2) {
        this.comentario2 = comentario2;
    }

    public String getComentarioPama() {
        return comentarioPama;
    }

    public void setComentarioPama(String comentarioPama) {
        this.comentarioPama = comentarioPama;
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
        if (!(object instanceof ControlMultas)) {
            return false;
        }
        ControlMultas other = (ControlMultas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.ControlMultas[ id=" + id + " ]";
    }
    
}
