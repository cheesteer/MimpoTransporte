/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ControlMultas;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lenovo
 */
public class CObtenerMultass extends HttpServlet {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Mimpo_TransporteDOWPU");

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String seccion = (String) request.getParameter("seccion");
        List listaMultas;
        System.out.println("secciones jajaja " + seccion);

        if (seccion.equals("todos")) {
            listaMultas = obtenerMultas();
        } else if (seccion.equals("PAMA")) {
            listaMultas = obtenerMultasPama();

        } else {
            listaMultas = obtenerMultasSeccion(seccion);
        }

        Gson g = new Gson();
        String toJson = g.toJson(listaMultas);
        System.out.println("json  de control de multas jajaja  " + toJson);
        response.getWriter().write(toJson);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String modificar = (String) request.getParameter("modificar");

        String id = request.getParameter("id");

        System.out.println(id + "multas secciones jajaja " + modificar);
        actualizarStatusMulta(modificar, Integer.parseInt(id));
        response.getWriter().write("Actualizado correctamente");

    }

    public void actualizarStatusMulta(String status, int id) {
        EntityManager crea = emf.createEntityManager();
        ControlMultas cm = crea.find(ControlMultas.class, id);
        crea.getTransaction().begin();
        cm.setNombreSeccion(status);
        crea.getTransaction().commit();
        System.out.println("actualizado");
    }

    public List obtenerMultasPama() {
        System.out.println("multas pama");
        return emf.createEntityManager().createNativeQuery("select * from ControlMultas where Asunto like 'PAMA'", ControlMultas.class).getResultList();
    }

    public List obtenerMultasSeccion(String seccion) {
        return emf.createEntityManager().createNativeQuery("select * from ControlMultas where NombreSeccion = ? ", ControlMultas.class).setParameter(1, seccion).getResultList();
    }

    public List obtenerMultas() {
        return emf.createEntityManager().createNativeQuery("select * from ControlMultas ", ControlMultas.class).getResultList();
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    public void persist(Object object) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

}
