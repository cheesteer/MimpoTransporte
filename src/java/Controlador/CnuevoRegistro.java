/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ControlMultas;
import com.google.gson.Gson;
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

        System.out.println("hola mundo do post");

        em = Persistence.createEntityManagerFactory("Mimpo_TransporteDOWPU").createEntityManager();
        em.getTransaction().begin();
        //  HttpSession misession = request.getSession(true);

        String referencia = request.getParameter("referencia");
        String pedimento = request.getParameter("pedimento");
        String cliente = request.getParameter("cliente");
        String asunto = request.getParameter("asunto");
        String numerodeActa = request.getParameter("numerodeActa");
        String motivo = request.getParameter("motivo");
        String responsable = request.getParameter("responsable");

        String monto = (String) request.getParameter("monto");
        String estatus = (String) request.getParameter("estatus");
        String notificacion = (String) request.getParameter("notificacion");
        //  java.util.Date fecha = new Date();

        String vencimiento = (String) request.getParameter("vencimiento");
        String contestacion = (String) request.getParameter("contestacion");
        String plazoAutoridad = (String) request.getParameter("plazoAutoridad");
        String comentario1 = (String) request.getParameter("comentario1");
        String despacho = (String) request.getParameter("despacho");

        // SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        String recientes = "Recientes";

        System.out.println("despachoo  " + despacho);

        ControlMultas clas = new ControlMultas();
        try {
            clas.setReferencia(referencia);
            clas.setPedimento(pedimento);
            clas.setCliente(cliente);
            clas.setAsunto(asunto);
            clas.setNumerodeActa(numerodeActa);
            clas.setMotivo(motivo);
            clas.setResponsable(responsable);    
            clas.setMonto(monto);
            clas.setNotificacion(obtenerFecha(notificacion));
            clas.setVencimiento(obtenerFecha(vencimiento));
            clas.setContestacion(obtenerFecha(contestacion));
            clas.setDespacho(obtenerFecha(despacho));      
            clas.setComentario1(comentario1);
            clas.setNombreSeccion(recientes);
            Gson g = new Gson();
            String toJson = g.toJson(clas);
            System.out.println("JSON" + toJson);
            em.persist(clas);
            em.getTransaction().commit();
            em.close();
            response.getWriter().write("1");
        } catch (Exception e) {

            System.out.println("error " + e);
            response.getWriter().write("0");
        }

    }

    public Date obtenerFecha(String dateInString) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {

            date = formatter.parse(dateInString);
            System.out.println(date);
            System.out.println(formatter.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
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
