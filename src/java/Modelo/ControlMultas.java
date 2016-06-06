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
@Table(name = "ControlMultas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ControlMultas.findAll", query = "SELECT c FROM ControlMultas c"),
    @NamedQuery(name = "ControlMultas.findById", query = "SELECT c FROM ControlMultas c WHERE c.id = :id"),
    @NamedQuery(name = "ControlMultas.findByNombreSeccion", query = "SELECT c FROM ControlMultas c WHERE c.nombreSeccion = :nombreSeccion"),
    @NamedQuery(name = "ControlMultas.findByReferencia", query = "SELECT c FROM ControlMultas c WHERE c.referencia = :referencia"),
    @NamedQuery(name = "ControlMultas.findByCliente", query = "SELECT c FROM ControlMultas c WHERE c.cliente = :cliente"),
    @NamedQuery(name = "ControlMultas.findByPedimento", query = "SELECT c FROM ControlMultas c WHERE c.pedimento = :pedimento"),
    @NamedQuery(name = "ControlMultas.findByAsunto", query = "SELECT c FROM ControlMultas c WHERE c.asunto = :asunto"),
    @NamedQuery(name = "ControlMultas.findByNumerodeActa", query = "SELECT c FROM ControlMultas c WHERE c.numerodeActa = :numerodeActa"),
    @NamedQuery(name = "ControlMultas.findByMotivo", query = "SELECT c FROM ControlMultas c WHERE c.motivo = :motivo"),
    @NamedQuery(name = "ControlMultas.findByResponsable", query = "SELECT c FROM ControlMultas c WHERE c.responsable = :responsable"),
    @NamedQuery(name = "ControlMultas.findByEstatus", query = "SELECT c FROM ControlMultas c WHERE c.estatus = :estatus"),
    @NamedQuery(name = "ControlMultas.findByMonto", query = "SELECT c FROM ControlMultas c WHERE c.monto = :monto"),
    @NamedQuery(name = "ControlMultas.findByDespacho", query = "SELECT c FROM ControlMultas c WHERE c.despacho = :despacho"),
    @NamedQuery(name = "ControlMultas.findByNotificacion", query = "SELECT c FROM ControlMultas c WHERE c.notificacion = :notificacion"),
    @NamedQuery(name = "ControlMultas.findByVencimiento", query = "SELECT c FROM ControlMultas c WHERE c.vencimiento = :vencimiento"),
    @NamedQuery(name = "ControlMultas.findByContestacion", query = "SELECT c FROM ControlMultas c WHERE c.contestacion = :contestacion"),
    @NamedQuery(name = "ControlMultas.findByVencimiento4Meses", query = "SELECT c FROM ControlMultas c WHERE c.vencimiento4Meses = :vencimiento4Meses"),
    @NamedQuery(name = "ControlMultas.findByAsuntosnotificadosenCdJuarez", query = "SELECT c FROM ControlMultas c WHERE c.asuntosnotificadosenCdJuarez = :asuntosnotificadosenCdJuarez"),
    @NamedQuery(name = "ControlMultas.findByPlazoAutoridad", query = "SELECT c FROM ControlMultas c WHERE c.plazoAutoridad = :plazoAutoridad"),
    @NamedQuery(name = "ControlMultas.findByNotificacionResolucionDefefinitiva", query = "SELECT c FROM ControlMultas c WHERE c.notificacionResolucionDefefinitiva = :notificacionResolucionDefefinitiva"),
    @NamedQuery(name = "ControlMultas.findByAsuntosConcluidos", query = "SELECT c FROM ControlMultas c WHERE c.asuntosConcluidos = :asuntosConcluidos"),
    @NamedQuery(name = "ControlMultas.findByNumeroDeResolucionDefinitiva", query = "SELECT c FROM ControlMultas c WHERE c.numeroDeResolucionDefinitiva = :numeroDeResolucionDefinitiva"),
    @NamedQuery(name = "ControlMultas.findByComentario1", query = "SELECT c FROM ControlMultas c WHERE c.comentario1 = :comentario1"),
    @NamedQuery(name = "ControlMultas.findByComentario2", query = "SELECT c FROM ControlMultas c WHERE c.comentario2 = :comentario2"),
    @NamedQuery(name = "ControlMultas.findByComentarioPama", query = "SELECT c FROM ControlMultas c WHERE c.comentarioPama = :comentarioPama")})
public class ControlMultas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;    
    @Column(name = "Nombre_Seccion")
    private String nombreSeccion;
    @Column(name = "Referencia")
    private String referencia;
    @Column(name = "Cliente")
    private String cliente;
    @Column(name = "Pedimento")
    private String pedimento;
    @Column(name = "Asunto")
    private String asunto;
    @Column(name = "Numero_de_Acta")
    private String numerodeActa;
    @Column(name = "Motivo")
    private String motivo;
    @Column(name = "Responsable")
    private String responsable;
    @Column(name = "Estatus")
    private String estatus;
    @Column(name = "Monto")
    private String monto;
    @Column(name = "Despacho")
    @Temporal(TemporalType.TIMESTAMP)
    private Date despacho;
    @Column(name = "Notificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date notificacion;
    @Column(name = "Vencimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vencimiento;
    @Column(name = "Contestacion")
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
    @Column(name = "Asuntos_Concluidos")
    private String asuntosConcluidos;
    @Column(name = "Numero_De_Resolucion_Definitiva")
    private String numeroDeResolucionDefinitiva;
    @Column(name = "Comentario1")
    private String comentario1;
    @Column(name = "Comentario2")
    private String comentario2;
    @Column(name = "Comentario_Pama")
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
