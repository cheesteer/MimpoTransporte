<%-- 
    Document   : ControlMultasConsulta
    Created on : 27/05/2016, 01:25:33 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html  ng-app="myApp">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="js/jquery-1.12.3.js" type="text/javascript"></script>
        <script src="js/jquery-1.12.3.min.js" type="text/javascript"></script>
        <script src="js/materialize.js" type="text/javascript"></script>
        <script src="js/materialize.min.js" type="text/javascript"></script>
        <link href="css/materialize.css" rel="stylesheet" type="text/css"/>
        <link href="css/materialize.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/angular.js" type="text/javascript"></script>
        <script src="js/angular.min.js" type="text/javascript"></script>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <script src="js/index.js" type="text/javascript"></script>
    </head>
    <body ng-controller="myCtrl">
        <script>

            $(document).ready(function () {
                Materialize.updateTextFields();
                $('select').material_select();
                $('.datepicker').pickadate({
                    selectMonths: true, // Creates a dropdown to control month
                    selectYears: 15, // Creates a dropdown of 15 years to control year

                });

            });

        </script>
        <br>
        <div class="container">
            <nav>
                <div class="nav-wrapper   blue darken-2"  >
                    <a href="#" class="brand-logo right" >  <img src="imagenes/mim.jpg" >       
                    </a>
                             
                    <ul id="nav-mobile" class="left hide-on-med-and-down ">
                        <li> <a href="index.jsp">Glosa</a></li>
                         <li class="active "><a href="ControlMultasConsulta.jsp">Multas</a></li>
                        <li><a href="referencia.html">Referencia</a></li>
                        <li><a href="Tramitacion.html">Tramitacion</a></li>
                        <li><a href="Administrativo.html">Administrativo</a></li>
                        <li><a href="Reportes.html">Reportes</a></li>
                        <li><a href="Admin.html">Admin</a></li>
                        <li><a href="OtrosMas.html">otros</a></li>
                    </ul>
                             
                </div>

                <div class="chip right">
                    <img src="imagenes/images1.jpg" alt="Contact Person">
                    Usuario: Nestor Espinoza
                </div> 
            </nav>
        </div>
        <br><br><br>
        <div class="container">
            <div class="row">
               <div class="input-field col offset-m4 m4 text-lighten-1">
                        <select id="Reporte" ng-model="Reporte">
                            <option value="" disabled selected>Elije tu Reporte</option>
                            <option value="Concluidas">Concluidas</option>
                            <option value="Pamas">Pamas</option>
                            <option value="Recientes">Recientes</option>
                            <option value="Atrasados sin resolucion">Atrasados sin resolucion</option>
                            <option value="Pendientes Notificacion Importadores">Pendientes Notificacion Importadores</option>
                            <option value="Ciudad Juarez">Ciudad Juarez</option>
                        </select>
                        <label>Tipo Resporte</label>
                    </div>
            </div>
        </div>
    </body>
</html>
