/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ControlMultas;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lenovo
 */
public class CnuevoRegistro extends HttpServlet {

    private EntityManager em;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pagina = "/controlMultas.jsp";
        RequestDispatcher rd = getServletContext().getRequestDispatcher(pagina);
        rd.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        em = Persistence.createEntityManagerFactory("ControlMercanciaPU").createEntityManager();
        em.getTransaction().begin();
        HttpSession misession = request.getSession(true);

        String referencia = request.getParameter("referencia");
        String pedimento = request.getParameter("pedimento");
        String cliente = request.getParameter("cliente");
        String asunto = request.getParameter("asunto");
        String numerodeActa = request.getParameter("numerodeActa");
        String motivo = request.getParameter("motivo");
        String responsable = request.getParameter("responsable");
   
        String monto = (String) misession.getAttribute("monto");
        String estatus = (String) misession.getAttribute("estatus");
        String notificacion = (String) misession.getAttribute("notificacion");
            java.util.Date fecha = new Date();
           
        String vencimiento = (String) misession.getAttribute("vencimiento");
        String contestacion = (String) misession.getAttribute("contestacion");
        String plazoAutoridad = (String) misession.getAttribute("plazoAutoridad");
        String comentario1 = (String) misession.getAttribute("comentario1");
         
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        String recientes = "Recienetes";
      
       
        ControlMultas clas = new ControlMultas();
        try {
            clas.setReferencia(referencia);
            clas.setPedimento(pedimento);
            clas.setCliente(cliente);
            clas.setAsunto(asunto);
            clas.setNumerodeActa(numerodeActa);
            clas.setMotivo(motivo);
            clas.setResponsable(responsable);
            clas.setEstatus(estatus);
            clas.setMonto(monto);
            clas.setNotificacion(fecha);
            clas.setVencimiento(fecha);
            clas.setContestacion(fecha);
            clas.setPlazoAutoridad(fecha);
            clas.setComentario1(comentario1);
            clas.setNombreSeccion(recientes);

            em.persist(clas);
            em.getTransaction().commit();
            em.close();
            response.getWriter().write("1");
        } catch (Exception e) {
            response.getWriter().write("0");
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
