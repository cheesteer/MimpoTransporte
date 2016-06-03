package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ControlMultasConsulta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html  ng-app=\"myApp\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
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
      out.write("    </head>\n");
      out.write("    <body ng-controller=\"myCtrl\">\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                Materialize.updateTextFields();\n");
      out.write("                $('select').material_select();\n");
      out.write("                $('.datepicker').pickadate({\n");
      out.write("                    selectMonths: true, // Creates a dropdown to control month\n");
      out.write("                    selectYears: 15, // Creates a dropdown of 15 years to control year\n");
      out.write("\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <nav>\n");
      out.write("                <div class=\"nav-wrapper   blue darken-2\"  >\n");
      out.write("                    <a href=\"#\" class=\"brand-logo right\" >  <img src=\"imagenes/mim.jpg\" >       \n");
      out.write("                    </a>\n");
      out.write("                             \n");
      out.write("                    <ul id=\"nav-mobile\" class=\"left hide-on-med-and-down \">\n");
      out.write("                        <li> <a href=\"index.jsp\">Glosa</a></li>\n");
      out.write("                         <li class=\"active \"><a href=\"ControlMultasConsulta.jsp\">Multas</a></li>\n");
      out.write("                        <li><a href=\"referencia.html\">Referencia</a></li>\n");
      out.write("                        <li><a href=\"Tramitacion.html\">Tramitacion</a></li>\n");
      out.write("                        <li><a href=\"Administrativo.html\">Administrativo</a></li>\n");
      out.write("                        <li><a href=\"Reportes.html\">Reportes</a></li>\n");
      out.write("                        <li><a href=\"Admin.html\">Admin</a></li>\n");
      out.write("                        <li><a href=\"OtrosMas.html\">otros</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                             \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"chip right\">\n");
      out.write("                    <img src=\"imagenes/images1.jpg\" alt=\"Contact Person\">\n");
      out.write("                    Usuario: Nestor Espinoza\n");
      out.write("                </div> \n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <br><br><br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("               <div class=\"input-field col offset-m4 m4 text-lighten-1\">\n");
      out.write("                        <select id=\"Reporte\" ng-model=\"Reporte\">\n");
      out.write("                            <option value=\"\" disabled selected>Elije tu Reporte</option>\n");
      out.write("                            <option value=\"Concluidas\">Concluidas</option>\n");
      out.write("                            <option value=\"Pamas\">Pamas</option>\n");
      out.write("                            <option value=\"Recientes\">Recientes</option>\n");
      out.write("                            <option value=\"Atrasados sin resolucion\">Atrasados sin resolucion</option>\n");
      out.write("                            <option value=\"Pendientes Notificacion Importadores\">Pendientes Notificacion Importadores</option>\n");
      out.write("                            <option value=\"Ciudad Juarez\">Ciudad Juarez</option>\n");
      out.write("                        </select>\n");
      out.write("                        <label>Tipo Resporte</label>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
