//$(document).ready(function () {
//    $("#conluidos").click(function (event) {
////        var headHtml = "";
////        var trHtml = "";
////        headHtml += "<thead>";
////        headHtml += "<tr class='center - align'>";
////        headHtml += "<th data-field='Referencia' >Referencia</th>";
////        headHtml += "<th data-field='Cliente'>Cliente</th>";
////        headHtml += "<th data-field='Pedimento'>Pedimento</th>";
////        headHtml += "<th data-field='Asunto'>Asunto</th>";
////        headHtml += "<th data-field='Numero_Acta'>Numero De Acta</th>";
////        headHtml += "<th data-field='Motivo'>Motivo</th>";
////        headHtml += "<th data-field='Responsable'>Responsable</th>";
////        headHtml += "<th data-field='Estatus'>Estatus</th>";
////        headHtml += "<th data-field='Monto'>Monto</th>";
////        headHtml += "<th data-field='Despacho'>Despacho</th>";
////        headHtml += " <th data-field='Notificacion'>Notificacion </th>";
////        headHtml += "<th data-field='Vencimiento'>Vencimiento</th> ";
////        headHtml += " <th data-field='Contestacion'>Contestacion</th>";
////        headHtml += "<th data-field='Contestacion_4_meses'>Contestacion 4 meses</th>";
////        headHtml += "<th data-field='Asunto_Notificacion_ciudad_juarez'>Asunto Notificacion Ciudad Juárez</th>";
////        headHtml += "<th data-field='Plaza_Autoridad'> Plaza Autoridad</th>";
////        headHtml += "<th data-field='Notificacion_resolucion_definitiva'>Notificacion Resolucion Definitiva</th>";
////        headHtml += "<th data-field='Asuntos_concluidos'>Asuntos concluidos</th>";
////        headHtml += "<th data-field='Numero_de_resolucion_definitiva'>Numero de resolucion definitiva</th>";
////        headHtml += "<th data-field='Comentario1'>Comentario 1 </th>";
////        headHtml += "<th data-field='Comentario2'>Comentario 2</th>";
////        headHtml += "<th data-field='Comentario_Pama'> Comentario Pama</th>";
////
////
////
////        trHtml += "<tr ng-repeat='multa in listaMultas track by $index'>";
////        trHtml += "<td>{{multa.referencia}}</td>";
////        trHtml += "<td>{{multa.cliente}}</td>";
////        trHtml += "<td>{{multa.pedimento}}</td>";
////        trHtml += "<td>{{multa.asunto}}</td>";
////        trHtml += "<td>{{multa.numerodeActa}}</td>";
////        trHtml += "<td>{{multa.motivo}}</td>";
////        trHtml += "<td>{{multa.responsable}}</td>";
////        trHtml += "<td>{{multa.estatus}}</td>";
////        trHtml += "<td>{{multa.monto}}</td>";
////        trHtml += "<td>{{multa.despacho}}</td>";
////        trHtml += "<td>{{multa.notificacion}}</td>";
////        trHtml += "<td>{{multa.vencimiento}}</td>";
////        trHtml += "<td>{{multa.contestacion}}</td>";
////        trHtml += "<td>{{multa.vencimiento4Meses}}</td>";
////        trHtml += "<td>{{multa.asuntosnotificadosenCdJuarez}}</td>";
////        trHtml += "<td>{{multa.plazoAutoridad}}</td>";
////        trHtml += "<td>{{multa.notificacionResolucionDefefinitiva}}</td>";
////        trHtml += "<td>{{multa.asuntosConcluidos}}</td>";
////        trHtml += "<td>{{multa.numeroDeResolucionDefinitiva}}</td>";
////        trHtml += "<td>{{multa.comentario1}}</td>";
////        trHtml += "<td>{{multa.comentario2}}</td>";
////        trHtml += "<td>{{multa.comentarioPama}}</td>";
////        trHtml += "</tr>";
// 
//    
//        $("#tablaMultas").html(headHtml);
//         $("#tablaMultasBody").html(trHtml);
////            $.ajax({
////                url: "controlMultasAltas",
////                type: 'POST',
////                data: {'referencia': referencia, 'numeroFactura': noFactura,
////                    'cliente': cliente, 'proveedor': proveedor,
////                    'fechaEnvio': fechaEnvio, 'fechaRecepcion': fechaRecepcion, 'status': status, 'documento': documento, 'tipo': tipo},
////                success: function(request) {
////                    window.location.href = "Cregistro";
////                    console.log("la respuesta del servidor controller es  " + request)
//////                    limpiarCampos();
////                }});
//
//
//    });
//
//
//    function limpiarCampos() {
//        $("#inputReferencia").val(" ");
//        $("#inputFechaEnvio").val(" ");
//        $("#inputNoFactura").val(" ");
//        $("#inputfechaRecepcion").val(" ");
//        //  $("#inputCliente").val(" ");
//        //   $("#selectStatus").val(" ");
//        //   $("#proveedor").val(" ");
//        //    $("#selectDocumento").val(" ");
//        $("#selectTipo").val(" ");
//
//
//    }
//
//
////    function validarForm() {
////        var band = "0";
////        var referencia = $("#inputReferencia").val();
////        var fechaEnvio = $("#inputFechaEnvio").val();
////        var noFactura = $("#inputNoFactura").val();
////        var cliente = $("#inputCliente option:selected" ).text();
////        var status = $("#selectStatus option:selected" ).text();
////        var proveedor = $("#proveedor option:selected" ).text();
////        var documento = $("#selectDocumento option:selected" ).text();
////        var tipo = $("#selectTipo option:selected" ).text();
////        var fchaRep = $("#inputfechaRecepcion").val();
////
////
//////        var data = "";
////
//////        data += "refe  / " + referencia;
//////        data += "fechaEnvio " + fechaEnvio;
//////        data += " noFactura " + noFactura;
//////        data += " cliente " + cliente;
//////        data += " status " + status;
//////        data += " proveedor" + proveedor;
//////        data += "tipo " + tipo;
////        
////        console.log("provelslsls "+proveedor)
////        
//////        alert("dates es  uauauau" + data)
////
////        if (referencia == "") {
////            band = "1";
////            alert("agregar referencia");
////
////        }
////        if (fechaEnvio == "") {
////            band = "1";
////            alert("agregar fechaEnvio");
////        }
////        if (noFactura == "") {
////            band = "1";
////            alert("agregar noFactura");
////        }
////        if (cliente == "Seleccionar") {
////            band = "1";
////            alert("Seleccionar cliente");
////        }
////        if (status == "Seleccionar") {
////            band = "1";
////            alert("Seleccionar status");
////        }
////        if (proveedor == "Seleccionar") {
////            band = "1";
////            alert("Seleccionar proveedor");
////        }
////        if (documento == "Seleccionar") {
////            band = "1";
////            alert("Seleccionar documento");
////        }
////        if (tipo == "Seleccionar") {
////            band = "1";
////            alert("Seleccionar tipo");
////        }
////        if (status == "Firmada") {
////console.log("entro a firmada")
////            if (fchaRep == "") {
////                alert("status firmada, debe agregar fecha recepcion")
////
////                band = "1";
////            }
////
////
////        }
////
////
////
////        return  band;
////    }
////
//
//
//
//});
//
//
//
//
