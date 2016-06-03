package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class controlMultas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html  ng-app=\"myApp\"  >\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body  ng-controller=\"controlMultasCtrl\" > <!-- Compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/css/materialize.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Compiled and minified JavaScript -->\n");
      out.write("        <script src=\"js/jquery-1.12.3.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery-1.12.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/materialize.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/materialize.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"css/materialize.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/materialize.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/angular.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/angular.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"js/index.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("                $(document).ready(function () {\n");
      out.write("                    Materialize.updateTextFields();\n");
      out.write("                    $('select').material_select();\n");
      out.write("                    $('.datepicker').pickadate({\n");
      out.write("                        selectMonths: true, // Creates a dropdown to control month\n");
      out.write("                        selectYears: 15, // Creates a dropdown of 15 years to control year\n");
      out.write("                        dateFormat: 'dd/mm/yyyy'\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                Materialize.scrollFire(options);\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"nav-wrapper   blue darken-2 \"  >\n");
      out.write("                <a href=\"#\" class=\"brand-logo right\" >  <img src=\"imagenes/mim.jpg\" >       \n");
      out.write("                </a>\n");
      out.write("                <ul id=\"nav-mobile\" class=\"left\">\n");
      out.write("                    <li><a></a></li>\n");
      out.write("                    <li><a></a></li>\n");
      out.write("                    <li><a></a></li>\n");
      out.write("                    <li><a></a></li>\n");
      out.write("                    <li><a></a></li>\n");
      out.write("                    <li><a></a></li>\n");
      out.write("                    <li   class=\"active \" > <a blue-grey-text >Glosa</a></li>\n");
      out.write("                    <li><a href=\"referencia.html\">Referencia</a></li>\n");
      out.write("                    <li><a href=\"Tramitacion.html\">Tramitacion</a></li>\n");
      out.write("                    <li><a href=\"Administrativo.html\">Administrativo</a></li>\n");
      out.write("                    <li><a href=\"Reportes.html\">Reportes</a></li>\n");
      out.write("                    <li><a href=\"Admin.html\">Admin</a></li>\n");
      out.write("                    <li><a href=\"OtrosMas.html\">otros</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"chip right\">\n");
      out.write("                <img src=\"imagenes/images1.jpg\" alt=\"Contact Person\">\n");
      out.write("                Usuario: Nestor Espinoza\n");
      out.write("            </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <!-- Page Layout here -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <br>\n");
      out.write("            <div class=\"col s12 m2 l2\"> <!-- Note that \"m4 l3\" was added -->\n");
      out.write("\n");
      out.write("                <nav>\n");
      out.write("                    <div class=\"nav-wrapper  cyan lighten-4  \">\n");
      out.write("                        <div class=\"col s12 center-align\">\n");
      out.write("                            <a  class=\"breadcrumb blue-grey-text  \">Sección Busqueda</a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                <label blue-grey-text >Catalogo de Busqueda</label>\n");
      out.write("                <div class=\"collection black-text\">\n");
      out.write("                    <a  class=\"collection-item black-text\"  ng-click=\"todos()\" >Todos<span class=\"badge\"></span></a>\n");
      out.write("                    <a  class=\"collection-item black-text\"  ng-click=\"concluidos()\">Concluidos<span class=\"badge\"></span></a>\n");
      out.write("                    <a  class=\"collection-item black-text\"  ng-click=\"pama()\">Pama<span class=\"badge\"></span></a>\n");
      out.write("                    <a  class=\"collection-item black-text\"  ng-click=\"atrasadosSR()\">Atrasados sin resolucion<span class=\"badge\"></span></a>\n");
      out.write("                    <a  class=\"collection-item black-text\"  ng-click=\"cD()\">Ciudad Juárez<span class=\"badge\"></span></a>\n");
      out.write("                    <a  class=\"collection-item black-text\"  ng-click=\"pendientesNot()\">Pendientes Notificaciones<span class=\"badge\"></span></a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div> <!--se cierra el div de la seccion de busqueda -->\n");
      out.write("\n");
      out.write("            <div class=\" container col s12 m8 l10 \"> <!-- Note that \"m8 l9\" was added -->\n");
      out.write("                <nav>\n");
      out.write("                    <div class=\"nav-wrapper cyan lighten-4\">\n");
      out.write("                        <div class=\"col s12 center-align \">\n");
      out.write("                            <a href=\"#!\" class=\"breadcrumb  blue-grey-text \">Sección De Revisión Pedimento Glosa</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("                <!--Seccion llenado de pedimentos -->\n");
      out.write("\n");
      out.write("                <style>\n");
      out.write("                    #table-scroll {\n");
      out.write("                        height:auto;\n");
      out.write("                        overflow:auto;  \n");
      out.write("                        margin-top:auto;\n");
      out.write("                    }\n");
      out.write("                </style>\n");
      out.write("\n");
      out.write("                <div  class=\"col s12 container\"  id=\"table-scroll\" >\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                        <div class=\"col l12 m12\">\n");
      out.write("\n");
      out.write("                            <table class=\" bordered responsive\" id=\"tablaMultas\">\n");
      out.write("                                <!-- <thead>\n");
      out.write("                                     <tr class=\"center-align\">\n");
      out.write("                                         <th data-field=\"Referencia\" >Referencia</th>\n");
      out.write("                                         <th data-field=\"Cliente\">Cliente</th>\n");
      out.write("                                         <th data-field=\"Pedimento\">Pedimento</th>\n");
      out.write("                                         <th data-field=\"Asunto\">Asunto</th>\n");
      out.write("                                         <th data-field=\"Numero_Acta\">Numero De Acta</th>\n");
      out.write("                                         <th data-field=\"Motivo\">Motivo</th>\n");
      out.write("                                         <th data-field=\"Responsable\">Responsable</th>\n");
      out.write("                                         <th data-field=\"Estatus\">Estatus</th>\n");
      out.write("                                         <th data-field=\"Monto\">Monto</th>\n");
      out.write("                                         <th data-field=\"Despacho\">Despacho</th>\n");
      out.write("                                         <th data-field=\"Notificacion\">Notificacion </th>\n");
      out.write("                                         <th data-field=\"Vencimiento\">Vencimiento</th>     \n");
      out.write("                                         <th data-field=\"Contestacion\">Contestacion</th>\n");
      out.write("                                         <th data-field=\"Contestacion_4_meses\">Contestacion 4 meses</th>\n");
      out.write("                                         <th data-field=\"Asunto_Notificacion_ciudad_juarez\">Asunto Notificacion Ciudad Juárez</th>\n");
      out.write("                                         <th data-field=\"Plaza_Autoridad\"> Plaza Autoridad</th>\n");
      out.write("                                         <th data-field=\"Notificacion_resolucion_definitiva\">Notificacion Resolucion Definitiva</th>\n");
      out.write("                                         <th data-field=\"Asuntos_concluidos\">Asuntos concluidos</th>\n");
      out.write("                                         <th data-field=\"Numero_de_resolucion_definitiva\">Numero de resolucion definitiva</th>\n");
      out.write("                                         <th data-field=\"Comentario1\">Comentario 1 </th>\n");
      out.write("                                         <th data-field=\"Comentario2\">Comentario 2</th>\n");
      out.write("                                         <th data-field=\"Comentario_Pama\"> Comentario Pama</th>\n");
      out.write(" \n");
      out.write("                                     </tr>\n");
      out.write("                                 </thead>-->\n");
      out.write("\n");
      out.write("                                <tbody   id=\"tBodytablaMultas\">\n");
      out.write("                                    <!--   <tr >\n");
      out.write("                                           <td>{{multa.referencia}}</td>\n");
      out.write("                                           <td>{{multa.cliente}}</td>\n");
      out.write("                                           <td>{{multa.pedimento}}</td>\n");
      out.write("                                           <td>{{multa.asunto}}</td>\n");
      out.write("                                           <td>{{multa.numerodeActa}}</td>\n");
      out.write("                                           <td>{{multa.motivo}}</td>\n");
      out.write("                                           <td>{{multa.responsable}}</td>\n");
      out.write("                                           <td>{{multa.estatus}}</td>\n");
      out.write("                                           <td>{{multa.monto}}</td>\n");
      out.write("                                           <td>{{multa.despacho}}</td>\n");
      out.write("                                           <td>{{multa.notificacion}}</td>\n");
      out.write("                                           <td>{{multa.vencimiento}}</td>\n");
      out.write("                                           <td>{{multa.contestacion}}</td>\n");
      out.write("                                           <td>{{multa.vencimiento4Meses}}</td>\n");
      out.write("                                           <td>{{multa.asuntosnotificadosenCdJuarez}}</td>\n");
      out.write("                                           <td>{{multa.plazoAutoridad}}</td>\n");
      out.write("                                           <td>{{multa.notificacionResolucionDefefinitiva}}</td>\n");
      out.write("                                           <td>{{multa.asuntosConcluidos}}</td>\n");
      out.write("                                           <td>{{multa.numeroDeResolucionDefinitiva}}</td>\n");
      out.write("                                           <td>{{multa.comentario1}}</td>\n");
      out.write("                                           <td>{{multa.comentario2}}</td>\n");
      out.write("                                           <td>{{multa.comentarioPama}}</td>\n");
      out.write("                                       </tr>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}