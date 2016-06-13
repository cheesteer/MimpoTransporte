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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LMCM
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
    @NamedQuery(name = "ControlMultas.findByNumerodeActa", query = "SELECT c FROM ControlMultas c WHERE c.numerodeActa = :numerodeActa"),
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
    @NamedQuery(name = "ControlMultas.findByNumeroDeResolucionDefinitiva", query = "SELECT c FROM ControlMultas c WHERE c.numeroDeResolucionDefinitiva = :numeroDeResolucionDefinitiva")})
public class ControlMultas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id  @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Size(max = 100)
    @Column(name = "NombreSeccion")
    private String nombreSeccion;
    @Size(max = 15)
    @Column(name = "Referencia")
    private String referencia;
    @Size(max = 50)
    @Column(name = "Cliente")
    private String cliente;
    @Size(max = 15)
    @Column(name = "Pedimento")
    private String pedimento;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Asunto")
    private String asunto;
    @Size(max = 15)
    @Column(name = "Numero_de_Acta")
    private String numerodeActa;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Motivo")
    private String motivo;
    @Size(max = 50)
    @Column(name = "Responsable")
    private String responsable;
    @Size(max = 15)
    @Column(name = "Estatus")
    private String estatus;
    @Size(max = 15)
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
    @Column(name = "Vencimiento4Meses")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vencimiento4Meses;
    @Column(name = "AsuntosnotificadosenCd_Juarez")
    @Temporal(TemporalType.TIMESTAMP)
    private Date asuntosnotificadosenCdJuarez;
    @Column(name = "PlazoAutoridad")
    @Temporal(TemporalType.TIMESTAMP)
    private Date plazoAutoridad;
    @Column(name = "NotificacionResolucionDefefinitiva")
    @Temporal(TemporalType.TIMESTAMP)
    private Date notificacionResolucionDefefinitiva;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "AsuntosConcluidos")
    private String asuntosConcluidos;
    @Size(max = 50)
    @Column(name = "NumeroDeResolucionDefinitiva")
    private String numeroDeResolucionDefinitiva;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Comentario1")
    private String comentario1;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Comentario2")
    private String comentario2;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "ComentarioPama")
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
