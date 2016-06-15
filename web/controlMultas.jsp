<%-- 
    Document   : index
    Created on : 15/04/2016, 12:05:17 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html  ng-app="myApp"  >
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body  ng-controller="controlMultasCtrl" > <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/css/materialize.min.css">

        <!-- Compiled and minified JavaScript -->
        <script src="js/jquery-1.12.3.js" type="text/javascript"></script>
        <script src="js/jquery-1.12.3.min.js" type="text/javascript"></script>
        <script src="js/materialize.js" type="text/javascript"></script>
        <script src="js/materialize.min.js" type="text/javascript"></script>
        <link href="css/materialize.css" rel="stylesheet" type="text/css"/>
        <link href="css/waverPersonalizado.css" rel="stylesheet" type="text/css"/>
        <link href="css/materialize.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/angular.js" type="text/javascript"></script>
        <script src="js/angular.min.js" type="text/javascript"></script>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <script src="js/index.js" type="text/javascript"></script>
        <script src="js/nuevoRegistro/nuevoRegistro.js" type="text/javascript"></script>


        <script>
                $(document).ready(function () {
                    Materialize.updateTextFields();
                    $('select').material_select();
                    $('.datepicker').pickadate({
                        selectMonths: true, // Creates a dropdown to control month
                        selectYears: 15, // Creates a dropdown of 15 years to control year
                        format: 'dd/mm/yyyy'
                    });
                    $('.modal-trigger').leanModal();
                });

                Materialize.scrollFire(options);


        </script>

        <nav>
            <div class="nav-wrapper   blue darken-2 "  >
                <a href="#" class="brand-logo right" >  <img src="imagenes/mim.jpg" >       
                </a>
                <ul id="nav-mobile" class="left">
                    <li><a></a></li>
                    <li><a></a></li>
                    <li><a></a></li>
                    <li><a></a></li>
                    <li><a></a></li>
                    <li><a></a></li>
                    <li   class="active " > <a blue-grey-text >Glosa</a></li>
                    <li><a href="referencia.html">Referencia</a></li>
                    <li><a href="Tramitacion.html">Tramitacion</a></li>
                    <li><a href="Administrativo.html">Administrativo</a></li>
                    <li><a href="Reportes.html">Reportes</a></li>
                    <li><a href="Admin.html">Admin</a></li>
                    <li><a href="controlMultas.jsp">Control Multas</a></li>
                </ul>
            </div>
            <div class="chip right">
                <img src="imagenes/images1.jpg" alt="Contact Person">
                Usuario: Nestor Espinoza
            </div> 


        </nav>

        <br>

        <!-- Page Layout here -->
        <div class="row">
            <br>
            <div class="col s12 m2 l2"> <!-- Note that "m4 l3" was added -->

                <nav>
                    <div class="nav-wrapper  cyan lighten-4  ">
                        <div class="col s12 center-align">
                            <a  class="breadcrumb blue-grey-text  ">Sección Busqueda</a>

                        </div>
                    </div>




                </nav>

                <label blue-grey-text >Catalogo de Busqueda</label>
                <div class="collection black-text">
                    <a  class="collection-item black-text"  ng-click="todos()" >Todos<span class="badge"></span></a>
                    <a  class="collection-item black-text"  ng-click="concluidos()">Concluidos<span class="badge"></span></a>
                    <a  class="collection-item black-text"  ng-click="pama()">Pama<span class="badge"></span></a>
                    <a  class="collection-item black-text"  ng-click="atrasadosSR()">Atrasados sin resolucion<span class="badge"></span></a>
                    <a  class="collection-item black-text"  ng-click="cD()">Ciudad Juárez<span class="badge"></span></a>
                    <!--   <a  class="collection-item black-text"  ng-click="pendientesNot()">Pendientes Notificaciones<span class="badge"></span></a>-->
                    <a  class="collection-item black-text"  ng-click="Recientes()">Recientes<span class="badge"></span></a>
                    <a  class="collection-item black-text"  ng-click="porVencer()">Por vencer<span class="badge"></span></a>
                </div>



            </div> <!--se cierra el div de la seccion de busqueda -->

            <div class=" container col s12 m8 l10 "> <!-- Note that "m8 l9" was added -->
                <nav>
                    <div class="nav-wrapper cyan lighten-4">
                        <div class="col s12 center-align ">
                            <a href="#!" class="breadcrumb  blue-grey-text ">Sección De Revisión Pedimento Glosa</a>
                        </div>
                    </div>

                </nav>
                <!--Seccion llenado de pedimentos -->



                <!-- Modal Trigger -->
                <div class="container">
                    <div class=" row"> 
                        <div class="container offset-m4 col  m6 ">
                            <a class=" waves-effect waves-mimpo btn-small   btn modal-trigger  blue " href="#modal1">Nuevo Registro</a>

                        </div>
                    </div>
                </div>
                <!-- Modal Structure -->
                <div id="modal1" class="modal  modal-fixed-footer">

                    <div class="modal-content large">
                        <center><h2><a >Registrar Nueva Insidencia </a></h2></center>
                        <div class="row">
                            <div class="input-field col s3">
                                <input value="" id="referencia" type="text" class="validate">
                                <label class="active" for="Referencia">Referencia </label>
                            </div>

                            <div class="input-field col s3">
                                <input value="" id="pedimento" type="text" class="validate">
                                <label class="active" for="Pedimento">Pedimento </label>
                            </div>
                            <div class="input-field col s6">
                                <select name="cliente" id="cliente" ng-model="Sucursal">
                                    <option value="" disabled selected>Elije Cliente</option>
                                    <option value="Comercializadora188">COMERCIALIZADORA 1888, S.A. DE C.V.</option>
                                    <option value="importacionesPh">IMPORTACIONES PH, S.A. DE C.V.</option>
                                    <option value="placio">PALACIO IMPORTACIONES S.A. DE C.V.</option>
                                </select>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s3">
                                <input value="" id="asunto" type="text" class="validate">
                                <label class="active" for="asunto">Asunto </label>
                            </div>
                            <div class="input-field col s3">
                                <input value="" id="numeroActa" type="text" class="validate">
                                <label class="active" for="numeroActa">Numero De Acta </label>
                            </div>
                            <div class="input-field col s6">
                                <input value="" id="motivo" type="text" class="validate">
                                <label class="active" for="motivo">Motivo </label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s6">
                                <input value="" id="responsable" type="text" class="validate">
                                <label class="active" for="responsable">Responsable </label>
                            </div>
                            <!--   <div class="input-field col s3">
                                   <input value="" id="estatus" type="text" class="validate">
                                   <label class="active" for="estatus">Estatus </label>
                               </div>-->
                            <div class="input-field col s6">
                                <input value="" id="monto" type="text" class="validate">
                                <label class="active" for="monto">Monto </label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s3">
                                <input   id="despacho" type="date"   class="datepicker">
                                <label class="active" for="despacho">Despacho </label>
                            </div>
                            <div class="input-field col s3">
                                <label class="active" for="notificacion">Notificacion </label>
                                <input value="" id="notificacion" type="date" class="datepicker">

                            </div>
                            <div class="input-field col s6">
                                <label class="active" for="vencimiento">Vencimiento </label>
                                <input value="" id="vencimiento" type="date" class="datepicker">

                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s3">
                                <input value="" id="constestacion" type="date" class="datepicker">
                                <label class="active" for="constestacion">Constestacion </label>
                            </div>                   
                        </div>
                    </div>
                    <div class="modal-footer">
                        <a href="#!" class=" modal-action modal-close waves-effect waves-green btn-flat" id="guardarNuevoRegistro">Guardar</a>
                        <a href="#!" class=" modal-action modal-close waves-effect waves-red btn-flat" id="cancelarNuevoRegistro">Cerrar</a>
                    </div>
                </div>






                <!-- Modal Structure -->
                <div id="mensajedelnuevoregistro" class="modal  modal-fixed-footer">

                    <div class="modal-content">
                        <center>Respuesta</center>
                        <div class="row">
                            <div class="input-field col s3">
                                <input value="" id="referencia" type="text" class="validate">
                                <label class="active" for="Referencia">Referencia </label>
                            </div>

                            <div class="input-field col s3">
                                <input value="" id="pedimento" type="text" class="validate">
                                <label class="active" for="Pedimento">Pedimento </label>
                            </div>

                        </div>




                    </div>
                    <div class="modal-footer">
                        <a href="#!" class=" modal-action modal-close waves-effect waves-green btn-flat" id="guardarNuevoRegistro">Guardar</a>
                        <a href="#!" class=" modal-action modal-close waves-effect waves-red btn-flat" id="cancelarNuevoRegistro">Cerrar</a>
                    </div>
                </div>






                <div id="modalSeguimiento" class="modal  modal-fixed-footer"  >

                    <div class="modal-content large">

                        <div class="row">
                            <div class="input-field col s12">
                                <select ng-model="deAcuerdo" ng-change="selectAction()">
                                    <option value=""selected> Seleccionar</option>                                   
                                    <option value="Si">Si</option>
                                    <option value="No">No</option>

                                </select>
                                <label>Está de acuerdo con la autoridad?</label>
                            </div>
                        </div>
                        <div  ng-if="deAcuerdo == 'Si'">
                            <div class="row">
                                <form action="#" class="input-field col s12" >
                                    <label class="active" for="asunto">Numero de oficio  </label>                                    
                                    <input value="" id="numOficio" type="text" class="validate">
                                    <div class="file-field input-field">
                                        <div class="btn">
                                            <span>File</span>
                                            <input type="file">
                                        </div>
                                        <div class="file-path-wrapper">
                                            <input class="file-path validate" type="text">
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div class="row">
                                <form action="#" class="input-field col s12" >
                                    <label class="active" for="asunto">Numero de crédito fiscal   </label>
                                     <input value="" id="numCreditoFiscal" type="text" class="validate">
                                    <div class="file-field input-field">
                                        <div class="btn">
                                            <span>File</span>
                                            <input type="file">
                                        </div>
                                        <div class="file-path-wrapper">
                                            <input class="file-path validate" type="text">
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div class="row">
                                <form action="#" class="input-field col s12" >
                                    <label class="active" for="asunto">Numero de cheque  </label>
                                       <input value="" id="numCheque" type="text" class="validate">
                                    <div class="file-field input-field">
                                        <div class="btn">
                                            <span>File</span>
                                            <input type="file">
                                        </div>
                                        <div class="file-path-wrapper">
                                            <input class="file-path validate" type="text">
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div class="row">
                                <div class="input-field col s3">
                                    <input value="" id="constestacion" type="date" class="datepicker">
                                    <label class="active" for="constestacion">Fecha de deposito </label>
                                </div>                       
                            </div>
                        </div>



                        <div  ng-if="deAcuerdo == 'No'">
                            <div class="row">
                                <form action="#" class="input-field col s12" >
                                    <label class="active" for="asunto">Numero de escrito   </label>
                                    <input value="" id="numEscrito" type="text" class="validate">
                                    <div class="file-field input-field">
                                        <div class="btn">
                                            <span>File</span>
                                            <input type="file">
                                        </div>
                                        <div class="file-path-wrapper">
                                            <input class="file-path validate" type="text">
                                        </div>
                                    </div>
                                </form>
                            </div>
                            
                              <div class="row">
                            <div class="input-field col s3">
                                <input   id="" type="date"   class="datepicker">
                                <label class="active" for="fredaccion">Fecha Redacción </label>
                            </div>
                            <div class="input-field col s3">
                                <label class="active" for="fregistro">Fecha Registro </label>
                                <input value="" id="fregistro" type="date" class="datepicker">

                            </div>
                            <div class="input-field col s6">
                                <label class="active" for="fvencimiento">Fecha Vencimiento 45</label>
                                <input value="" id="fvencimiento" type="date" class="datepicker">

                            </div>
                        </div>
                         
                        </div>
                    </div>
                    <div class="modal-footer">
                        <a  class="   waves-effect waves-green btn-flat" ng-click="modificarStatus()">Guardar</a>
                        <a href="#!" class=" modal-action  modal-close waves-effect waves-red btn-flat" id="cancelarNuevoRegistro">Cerrar</a>
                    </div>
                </div>









                <style>
                    #table-scroll {
                        height:auto;
                        overflow:auto;  
                        margin-top:auto;
                    }
                </style>

                <div  class="col s12 container"  id="table-scroll" >
                    <div class="row">

                        <div class="col l12 m12">

                            <table class=" bordered responsive" id="tablaMultas">
                                <!-- <thead>
                                     <tr class="center-align">
                                         <th data-field="Referencia" >Referencia</th>
                                         <th data-field="Cliente">Cliente</th>
                                         <th data-field="Pedimento">Pedimento</th>
                                         <th data-field="Asunto">Asunto</th>
                                         <th data-field="Numero_Acta">Numero De Acta</th>
                                         <th data-field="Motivo">Motivo</th>
                                         <th data-field="Responsable">Responsable</th>
                                         <th data-field="Estatus">Estatus</th>
                                         <th data-field="Monto">Monto</th>
                                         <th data-field="Despacho">Despacho</th>
                                         <th data-field="Notificacion">Notificacion </th>
                                         <th data-field="Vencimiento">Vencimiento</th>     
                                         <th data-field="Contestacion">Contestacion</th>
                                         <th data-field="Contestacion_4_meses">Contestacion 4 meses</th>
                                         <th data-field="Asunto_Notificacion_ciudad_juarez">Asunto Notificacion Ciudad Juárez</th>
                                         <th data-field="Plaza_Autoridad"> Plaza Autoridad</th>
                                         <th data-field="Notificacion_resolucion_definitiva">Notificacion Resolucion Definitiva</th>
                                         <th data-field="Asuntos_concluidos">Asuntos concluidos</th>
                                         <th data-field="Numero_de_resolucion_definitiva">Numero de resolucion definitiva</th>
                                         <th data-field="Comentario1">Comentario 1 </th>
                                         <th data-field="Comentario2">Comentario 2</th>
                                         <th data-field="Comentario_Pama"> Comentario Pama</th>
 
                                     </tr>
                                 </thead>-->

                                <!--  <tbody   id="tBodytablaMultas">
                                        <tr >
                                             <td>{{multa.referencia}}</td>
                                             <td>{{multa.cliente}}</td>
                                             <td>{{multa.pedimento}}</td>
                                             <td>{{multa.asunto}}</td>
                                             <td>{{multa.numerodeActa}}</td>
                                             <td>{{multa.motivo}}</td>
                                             <td>{{multa.responsable}}</td>
                                             <td>{{multa.estatus}}</td>
                                             <td>{{multa.monto}}</td>
                                             <td>{{multa.despacho}}</td>
                                             <td>{{multa.notificacion}}</td>
                                             <td>{{multa.vencimiento}}</td>
                                             <td>{{multa.contestacion}}</td>
                                             <td>{{multa.vencimiento4Meses}}</td>
                                             <td>{{multa.asuntosnotificadosenCdJuarez}}</td>
                                             <td>{{multa.plazoAutoridad}}</td>
                                             <td>{{multa.notificacionResolucionDefefinitiva}}</td>
                                             <td>{{multa.asuntosConcluidos}}</td>
                                             <td>{{multa.numeroDeResolucionDefinitiva}}</td>
                                             <td>{{multa.comentario1}}</td>
                                             <td>{{multa.comentario2}}</td>
                                             <td>{{multa.comentarioPama}}</td>
                                         </tr> 
  
  
  
  
                                  </tbody>-->
                            </table>
                        </div>
                    </div>
                </div>
            </div>

        </div>


    </body>
</html>
