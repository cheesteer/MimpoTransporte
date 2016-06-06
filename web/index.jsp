<%-- 
    Document   : index
    Created on : 26/05/2016, 08:13:20 PM
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
                    dateFormat: 'dd/mm/yyyy'        
                });

            });

        </script>
        <br>
        <div class="row">
             
                  <nav>
                <div class="nav-wrapper   blue darken-2"  >
                    <a href="#" class="brand-logo right" >  <img src="imagenes/mim.jpg" >       
                    </a>
                    <ul name="nav-mobile" class="left hide-on-med-and-down ">
                        <li   class="active "> <a href="index.jsp">Glosa</a></li>
                         <li><a href="ControlMultasConsulta.jsp">Multas</a></li>
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
        <div class="container responsive-table">
            <div class="row">
                <form class="col s12">
                    <div class="input-field col s2">
                        <select name="Sucursal" ng-model="Sucursal" >
                            <option value="" disabled selected>Elije tu sucursal</option>
                            <option value="Veracruz">Veracruz</option>
                            <option value="Lazaro">Lazaro</option>
                            <option value="Laredo">Laredo</option>
                            <option value="Aeropuerto Internacional Ciudad De Mexico">Aeropuerto Internacional Ciudad De Mexico</option>
                        </select>
                        <label>Sucursal</label>
                    </div>

                    <div class="input-field col s2">
                        <input ng-model="Referencia"  name="Referencia" type="text" class="validate">
                        <label for="Referencia">Referencia</label>
                    </div>

                    <div class="input-field col s2">
                        <input ng-model="Embarques_Por_cita" name="Embarques_Por_cita" type="text" class="validate">
                        <label for="Embarques_Por_Cita">Embarques Por Cita</label>
                    </div>
                    <div class="input-field col s2">
                        <input ng-model="Equipo_Utilizado" name="Equipo_Utilizado" type="text" class="validate">
                        <label for="Equipo_Utilizado">Equipo Utilizado</label>
                    </div>
                    <div class="input-field col s2">
                        <select ng-model="Contenedor" name="Contenedor" >
                            <option value="" disabled selected>Elije tu Configuracion</option>
                            <option value="Sencillo">Sencillo</option>
                            <option value="Full">Full</option>
                        </select>
                        <label>Configuracion Transporte</label>
                    </div>
                    <div class="input-field col s2">
                        <input ng-model="Placas" name="Placas" type="text" class="validate">
                        <label for="Placas">Placas</label>
                    </div>

                    <div class="row"> 
                        <div class="input-field col s2">
                            <input ng-model="Almacen" name="Almacen" type="text" class="validate">
                            <label for="Almacen">Almacen</label>
                        </div>


                        <div class="input-field col s2">
                            <input ng-model="Inicio_De_Transito" name="Inicio_De_Transito" type="date" class="datepicker">
                            <label for="Inicio_De_Transito">Inicio De Transito</label>
                        </div>


                        <div class="input-field col s2">
                            <input ng-model="Numero_De_Cita"  name="Numero_De_Cita" type="text" class="validate">
                            <label for="Numero_De_Cita">Numero De Cita</label>
                        </div>

                        <div class="input-field col s2">
                            <input ng-model="Hora_De_Cita" name="Hora_De_Cita" type="date" class="datepicker">
                            <label for="Hora_De_Cita">Hora De Cita</label>
                        </div>
                        <div class="input-field col s2">
                            <input ng-model="Fecha_De_Arribo" name="Fecha_De_Arribo" type="date" class="datepicker">
                            <label for="Fecha_De_Arribo">Fecha De Arribo</label>
                        </div>
                        <div class="input-field col s2">
                            <input ng-model="Inicio_Descarga" name="Inicio_Descarga" type="date" class="datepicker">
                            <label for="Inicio_Descarga">Inicio Descarga</label>
                        </div>

                    </div>
                    <div class="row"> 

                        <div class="input-field col s2">
                            <input ng-model="Fin_Descarga" name="Fin_Descarga" type="date" class="datepicker">
                            <label for="Fin_Descarga">Fin Descarga</label>
                        </div>
                        <div class="input-field col s2">
                            <input ng-model="Dias_De_Espera" name="Dias_De_Espera" type="date" class="datepicker">
                            <label for="Dias_De_Espera">Dias De Espera</label>
                        </div>
                        <div class="input-field col s2">
                            <input ng-model="Tiempo_Descarga" name="Tiempo_Descarga" type="date" class="datepicker">
                            <label for="Tiempo_Descarga">Tiempo Descarga</label>
                        </div>
                        <div class="input-field col s2">
                            <input ng-model="Tiempo_Espera_Descarga" name="Tiempo_Espera_Descarga" type="date" class="datepicker">
                            <label for="Tiempo_Espera_Descarga">Tiempo Espera Descarga</label>
                        </div>

                        <div class="input-field col s2">
                            <input ng-model="Tiempo_Unidad_Almacen" name="Tiempo_Unidad_Almacen" type="date" class="datepicker">
                            <label for="Tiempo_Unidad_Almacen">Tiempo Unidad Almacen</label>
                        </div>
                        <div class="input-field col s2">
                            <select ng-model="Ruta"  name="Ruta">
                                <option value="" disabled selected>Elije Tu Ruta</option>
                                <option value="Transporte sencillo Veracruz-Mexico Ruta Normal">Transporte sencillo Veracruz-Mexico Ruta Normal</option>
                                <option value="Transporte sencillo Veracruz-Mexico Ruta Arco Norte">Transporte sencillo Veracruz-Mexico Ruta Arco Norte</option>
                                <option value="Transporte Full Veracruz-Mexico Ruta Normal">Transporte Full Veracruz-Mexico Ruta Normal</option>
                                <option value="Transporte Full Veracruz-Mexico Ruta Arco Norte">Transporte Full Veracruz-Mexico Ruta Arco Norte</option>
                                <option value="Transporte Sencillo Lazaro-Mexico Ruta Normal">Transporte Sencillo Lazaro-Mexico Ruta Norma</option>
                                <option value="Transporte Full Lazaro-Mexico Ruta Normal">Transporte Full Lazaro-Mexico Ruta Norma</option>
                                <option value="Caja Seca Lazaro-Mexico Ruta Normal">Caja Seca  Lazaro-Mexico Ruta Norma</option>

                            </select>
                            <label>Elija La Ruta</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col col s2 offset-s10 ">
                            <p>
                                <input ng-model="Custodia" name="Custodia"  type="checkbox" name="Custodia" />
                                <label for="Custodia">Custodia</label>
                            </p>

                        </div>
                         <div class="input-field col s2">
                            <input ng-click="enviar()"  name="Enviar" type="button" value="Enviar">
                           
                        </div>

                       
                    </div>



                </form>
            </div>
        </div>
    </body>
</html>
