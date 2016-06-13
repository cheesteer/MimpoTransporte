var app = angular.module("myApp", []);
app.controller("myCtrl", function ($scope, $http) {
    // alert("hola mundo desde angularS");
    $scope.Sucursal = '';
    $scope.Referencia = '';
    $scope.Embarques_Por_cita = '';
    $scope.Equipo_Utilizado = '';
    $scope.Contenedor = '';
    $scope.Placas = '';
    $scope.Almacen = '';
    $scope.Inicio_De_Transito = '';
    $scope.Numero_De_Cita = '';
    $scope.Hora_De_Cita = '';
    $scope.Fecha_De_Arribo = '';
    $scope.Inicio_Descarga = '';
    $scope.Fin_Descarga = '';
    $scope.Dias_De_Espera = '';
    $scope.Tiempo_Descarga = '';
    $scope.Tiempo_Espera_Descarga = '';
    $scope.Tiempo_Unidad_Almacen = '';
    $scope.Custodia = '';
    $scope.enviar = function () {

//        var datos = {aduana: $scope.aduana, style: $scope.style};
//        console.log("sds " + angular.toJson(datos,true))
//        $http.post("cindex", angular.toJson(datos)).success(function (data, status) {
//            alert()
//        });

        $http({
            method: 'POST',
            url: 'Cindex3',
            data: {
                sucursal: $scope.Sucursal,
                referencias: $scope.Referencia,
                embarquesporcita: $scope.Embarques_Por_cita,
                equipoutilizado: $scope.Equipo_Utilizado,
                configuracion: $scope.Contenedor,
                placas: $scope.Placas,
                almacen: $scope.Almacen,
                iniciodetransito: $scope.Inicio_De_Transito,
                numeroCita: $scope.Numero_De_Cita,
                horacita: $scope.Hora_De_Cita,
                fechaarribo: $scope.Fecha_De_Arribo,
                iniciodescarga: $scope.Inicio_Descarga,
                findescarga: $scope.Fin_Descarga,
                diasEspera: $scope.Dias_De_Espera,
                tiempoEsperadescarga: $scope.Tiempo_Descarga,
                tiempodescarga: $scope.Tiempo_Espera_Descarga,
                tiempoUnidadAlmacen: $scope.Tiempo_Unidad_Almacen,
                Custodia: $scope.Custodia
            },
            headers: {
                'Content-Type': 'application/json'
            }
        }).success(function (data) {
            alert("que onda " + data);
        }).error(function (data) {
            console.log(data);
        });
    };
});
app.controller("controlMultasCtrl", function ($scope, $http, $compile, $q) {
    var trHtml = "";
    var headHtml = "";


    var tabla = angular.element(document.querySelector('#tablaMultas'));
    llamarMultas();
    $scope.todos = function () {
        llamarMultas();
    }

    function llamarMultas() {
        headHtml = ""
        trHtml = "";
        tabla.html("");
        headHtml += "<thead>";
        headHtml += "<tr class='center - align' valign='top' >";
        headHtml += "<th data-field='Referencia' >Referencia</th>";
        headHtml += "<th data-field='Cliente' >Cliente</th>";
        headHtml += "<th data-field='Pedimento'>Pedimento</th>";
        headHtml += "<th data-field='Asunto'>Asunto</th>";
        headHtml += "<th data-field='Numero_Acta'>Numero De Acta</th>";
        headHtml += "<th data-field='Motivo'>Motivo</th>";
        headHtml += "<th data-field='Responsable'>Responsable</th>";
        headHtml += "<th data-field='Estatus'>Estatus</th>";
        headHtml += "<th data-field='Monto'>Monto</th>";
        headHtml += "<th data-field='Despacho'>Despacho</th>";
        headHtml += " <th data-field='Notificacion'>Notificacion</th>";
        headHtml += "<th data-field='Vencimiento'>Vencimiento</th>";
        headHtml += "<th data-field='Contestacion'>Contestacion</th>";
        headHtml += "<th data-field='Contestacion_4_meses'>Contestacion 4 meses</th>";
        headHtml += "<th data-field='Asunto_Notificacion_ciudad_juarez'>Asunto Notificacion Ciudad Juárez</th>";
        headHtml += "<th data-field='Plazo_Autoridad'> Plazo Autoridad</th>";
        headHtml += "<th data-field='Notificacion_resolucion_definitiva'>Notificacion Resolucion Definitiva</th>";
        headHtml += "<th data-field='Asuntos_concluidos'>Asuntos concluidos</th>";
        headHtml += "<th data-field='Numero_de_resolucion_definitiva'>Numero de resolucion definitiva</th>";
        headHtml += "<th data-field='Comentario1'>Comentario 1 </th>";
        headHtml += "<th data-field='Comentario2'>Comentario 2</th>";
        headHtml += "<th data-field='Comentario_Pama'> Comentario Pama</th>";
        tabla.append(headHtml);
        $q.when(obtenerDatos("todos"), function (lista) {
            trHtml += "<tbody>";
            for (var i = 0; i < lista.length; i++) {
                var referencia = angular.isDefined(lista[i].referencia) == true ? lista[i].referencia : "";
                var cliente = angular.isDefined(lista[i].cliente) == true ? lista[i].cliente : "";
                var pedimento = angular.isDefined(lista[i].pedimento) == true ? lista[i].pedimento : "";
                var asunto = angular.isDefined(lista[i].asunto) == true ? lista[i].asunto : "";
                var numerodeActa = angular.isDefined(lista[i].numerodeActa) == true ? lista[i].numerodeActa : "";
                var motivo = angular.isDefined(lista[i].motivo) == true ? lista[i].motivo : "";
                var responsable = angular.isDefined(lista[i].responsable) == true ? lista[i].responsable : "";
                var estatus = angular.isDefined(lista[i].estatus) == true ? lista[i].estatus : "";
                var monto = angular.isDefined(lista[i].monto) == true ? lista[i].monto : "";
                var despacho = angular.isDefined(lista[i].despacho) == true ? lista[i].despacho : "";
                var notificacion = angular.isDefined(lista[i].notificacion) == true ? lista[i].notificacion : "";
                var contestacion = angular.isDefined(lista[i].contestacion) == true ? lista[i].contestacion : "";
                var vencimiento = angular.isDefined(lista[i].vencimiento) == true ? lista[i].vencimiento : "";
                var vencimiento4Meses = angular.isDefined(lista[i].vencimiento4Meses) == true ? lista[i].vencimiento4Meses : "";
                var asuntosnotificadosenCdJuarez = angular.isDefined(lista[i].asuntosnotificadosenCdJuarez) == true ? lista[i].asuntosnotificadosenCdJuarez : "";
                var plazoAutoridad = angular.isDefined(lista[i].plazoAutoridad) == true ? lista[i].plazoAutoridad : "";
                var notificacionResolucionDefefinitiva = angular.isDefined(lista[i].notificacionResolucionDefefinitiva) == true ? lista[i].notificacionResolucionDefefinitiva : "";
                var asuntosConcluidos = angular.isDefined(lista[i].asuntosConcluidos) == true ? lista[i].asuntosConcluidos : "";
                var numeroDeResolucionDefinitiva = angular.isDefined(lista[i].numeroDeResolucionDefinitiva) == true ? lista[i].numeroDeResolucionDefinitiva : "";
                var comentario1 = angular.isDefined(lista[i].comentario1) == true ? lista[i].comentario1 : "";
                var comentario2 = angular.isDefined(lista[i].comentario2) == true ? lista[i].comentario2 : "";
                var comentarioPama = angular.isDefined(lista[i].comentarioPama) == true ? lista[i].comentarioPama : "";
                trHtml += "<tr>";
                trHtml += "<td>" + referencia + "</td>";
                trHtml += "<td>" + cliente + "</td>";
                trHtml += "<td>" + pedimento + "</td>";
                trHtml += "<td>" + asunto + "</td>";
                trHtml += "<td>" + numerodeActa + "</td>";
                trHtml += "<td>" + motivo + "</td>";
                trHtml += "<td>" + responsable + "</td>";
                trHtml += "<td>" + estatus + "</td>";
                trHtml += "<td>" + monto + "</td>";
                trHtml += "<td>" + despacho + "</td>";
                trHtml += "<td>" + notificacion + "</td>";
                trHtml += "<td>" + vencimiento + "</td>";
                trHtml += "<td>" + contestacion + "</td>";
                trHtml += "<td>" + vencimiento4Meses + "</td>";
                trHtml += "<td>" + asuntosnotificadosenCdJuarez + "</td>";
                trHtml += "<td>" + plazoAutoridad + "' </td>";
                trHtml += "<td>" + notificacionResolucionDefefinitiva + "</td>";
                trHtml += "<td>" + asuntosConcluidos + "</td>";
                trHtml += "<td>" + numeroDeResolucionDefinitiva + "</td>";
                trHtml += "<td>" + comentario1 + "</td>";
                trHtml += "<td>" + comentario2 + "</td>";
                trHtml += "<td>" + comentarioPama + "</td>";
                trHtml += "</tr>";
            }
            trHtml += "</tbody>";
            tabla.append($compile(trHtml)($scope));
        })



    }


    $scope.concluidos = function () {
        headHtml += "<thead>";
        headHtml += "<tr class='center - align'>";
        headHtml += "<th data-field='Referencia' >Referencia</th>";
        headHtml += "<th data-field='Cliente'>Cliente</th>";
        headHtml += "<th data-field='Pedimento'>Pedimento</th>";
        headHtml += "<th data-field='Asunto'>Asunto</th>";
        headHtml += "<th data-field='Numero_Acta'>Numero De Acta</th>";
        headHtml += "<th data-field='Motivo'>Motivo</th>";
        headHtml += "<th data-field='Responsable'>Responsable</th>";
        headHtml += "<th data-field='Estatus'>Estatus</th>";
        headHtml += "<th data-field='Monto'>Monto</th>";
        headHtml += "<th data-field='Despacho'>Despacho</th>";
        headHtml += "<th data-field='Notificacion'>Notificacion </th>";
        headHtml += "<th data-field='Vencimiento'>Vencimiento</th> ";
        headHtml += "<th data-field='Contestacion'>Contestacion</th>";
        headHtml += "<th data-field='Notificacion_resolucion_definitiva'>Notificacion Resolucion Definitiva</th>";
        headHtml += "<th data-field='Asuntos_concluidos'>Asuntos concluidos</th>";
        headHtml += "<th data-field='Numero_de_resolucion_definitiva'>Numero de resolucion definitiva</th>";
        head.append(headHtml);
        $q.when(obtenerDatos("concluidos"), function (lista) {
            for (var i = 0; i < lista.length; i++) {
                if (lista[i].nombreSeccion == "Concluidas")
                {
                    trHtml += "<tr>";
                    trHtml += "<td>" + lista[i].referencia + "</td>";
                    trHtml += "<td>" + lista[i].cliente + "</td>";
                    trHtml += "<td>" + lista[i].pedimento + "</td>";
                    trHtml += "<td>" + lista[i].asunto + "</td>";
                    trHtml += "<td>" + lista[i].numerodeActa + "</td>";
                    trHtml += "<td>" + lista[i].motivo + "</td>";
                    trHtml += "<td>" + lista[i].responsable + "</td>";
                    trHtml += "<td>" + lista[i].estatus + "</td>";
                    trHtml += "<td>" + lista[i].monto + "</td>";
                    trHtml += "<td>" + lista[i].despacho + "</td>";
                    trHtml += "<td>" + lista[i].notificacion + "</td>";
                    trHtml += "<td>" + lista[i].vencimiento + "</td>";
                    trHtml += "<td>" + lista[i].contestacion + "</td>";
                    trHtml += "<td>" + lista[i].notificacionResolucionDefefinitiva + "</td>";
                    trHtml += "<td>" + lista[i].asuntosConcluidos + "</td>";
                    trHtml += "<td>" + lista[i].numeroDeResolucionDefinitiva + "</td>";
                    trHtml += "</tr>";
                }
            }
            body.append(trHtml);
        })
    }


    $scope.pama = function () {
        headHtml += "<thead>";
        headHtml += "<tr class='center - align'>";
        headHtml += "<th data-field='Referencia' >Referencia</th>";
        headHtml += "<th data-field='Pedimento'>Pedimento</th>";
        headHtml += "<th data-field='Cliente'>Cliente</th>";
        headHtml += "<th data-field='Asunto'>Asunto</th>";
        headHtml += "<th data-field='Numero_Acta'>Numero De Acta</th>";
        headHtml += "<th data-field='Motivo'>Motivo</th>";
        headHtml += "<th data-field='Responsable'>Responsable</th>";
        headHtml += "<th data-field='Monto'>Monto</th>";
        headHtml += "<th data-field='Despacho'>Despacho</th>";
        headHtml += " <th data-field='Notificacion'>Notificacion</th>";
        headHtml += "<th data-field='Vencimiento'>Vencimiento</th>";
        headHtml += "<th data-field='Contestacion'>Contestacion</th>";
        //   headHtml += "<th data-field='Plazo_Autoridad'> Plazo Autoridad</th>";
        //   headHtml += "<th data-field='Numero_de_resolucion_definitiva'>Numero de resolucion definitiva</th>";
        //   headHtml += "<th data-field='ComentarioPama'>Comentario Pama </th>";
        head.append(headHtml);
        $q.when(obtenerDatos("pama"), function (lista) {
            for (var i = 0; i < lista.length; i++) {
                if (lista[i].asunto == "PAMA")
                {
                    trHtml += "<tr>";
                    trHtml += "<td>" + lista[i].referencia + "</td>";
                    trHtml += "<td>" + lista[i].pedimento + "</td>";
                    trHtml += "<td>" + lista[i].cliente + "</td>";
                    trHtml += "<td>" + lista[i].asunto + "</td>";
                    trHtml += "<td>" + lista[i].numerodeActa + "</td>";
                    trHtml += "<td>" + lista[i].motivo + "</td>";
                    trHtml += "<td>" + lista[i].responsable + "</td>";
                    trHtml += "<td>" + lista[i].monto + "</td>";
                    trHtml += "<td>" + lista[i].despacho + "</td>";
                    trHtml += "<td>" + lista[i].notificacion + "</td>";
                    trHtml += "<td>" + lista[i].vencimiento + "</td>";
                    trHtml += "<td>" + lista[i].contestacion + "</td>";
                    // trHtml += "<td>" + lista[i].plazoAutoridad + "' </td>";
                    //  trHtml += "<td>" + lista[i].numeroDeResolucionDefinitiva + "</td>";
                    //   trHtml += "<td>" + lista[i].comentarioPama + "</td>";
                    trHtml += "</tr>";
                }
            }
            body.append(trHtml);
        })
    }
    $scope.atrasadosSR = function () {
        headHtml += "<thead>";
        headHtml += "<tr class='center - align'>";
        headHtml += "<th data-field='Referencia' >Referencia</th>";
        headHtml += "<th data-field='Cliente'>Cliente</th>";
        headHtml += "<th data-field='Pedimento'>Pedimento</th>";
        headHtml += "<th data-field='Asunto'>Asunto</th>";
        headHtml += "<th data-field='Numero_Acta'>Numero De Acta</th>";
        headHtml += "<th data-field='Motivo'>Motivo</th>";
        headHtml += "<th data-field='Estatus'>Estatus</th>";
        headHtml += "<th data-field='Despacho'>Despacho</th>";
        headHtml += " <th data-field='Notificacion'>Notificacion</th>";
        headHtml += "<th data-field='Vencimiento'>Vencimiento</th>";
        headHtml += "<th data-field='Contestacion'>Contestacion</th>";
        headHtml += "<th data-field='Plazo_Autoridad'> Plazo Autoridad</th>";
        headHtml += "<th data-field='Asuntos_concluidos'>Asuntos concluidos</th>";
        headHtml += "<th data-field='Numero_de_resolucion_definitiva'>Numero de resolucion definitiva</th>";
        headHtml += "<th data-field='Comentario1'>Comentario 1 </th>";
        head.html(headHtml);
        $q.when(obtenerDatos("atrasados"), function (lista) {
            for (var i = 0; i < lista.length; i++) {
                if (lista[i].nombreSeccion == "Atrasados sin resolucion")
                {
                    trHtml += "<tr>";
                    trHtml += "<td>" + lista[i].referencia + "</td>";
                    trHtml += "<td>" + lista[i].cliente + "</td>";
                    trHtml += "<td>" + lista[i].pedimento + "</td>";
                    trHtml += "<td>" + lista[i].asunto + "</td>";
                    trHtml += "<td>" + lista[i].numerodeActa + "</td>";
                    trHtml += "<td>" + lista[i].motivo + "</td>";
                    trHtml += "<td>" + lista[i].estatus + "</td>";
                    trHtml += "<td>" + lista[i].despacho + "</td>";
                    trHtml += "<td>" + lista[i].notificacion + "</td>";
                    trHtml += "<td>" + lista[i].vencimiento + "</td>";
                    trHtml += "<td>" + lista[i].contestacion + "</td>";
                    trHtml += "<td>" + lista[i].plazoAutoridad + "' </td>";
                    trHtml += "<td>" + lista[i].asuntosConcluidos + "</td>";
                    trHtml += "<td>" + lista[i].numeroDeResolucionDefinitiva + "</td>";
                    trHtml += "<td>" + lista[i].comentario1 + "</td>";
                    trHtml += "</tr>";
                }
            }
            body.append(trHtml);
        })
    }
    $scope.cD = function () {
        headHtml += "<thead>";
        headHtml += "<tr class='center - align'>";
        headHtml += "<th data-field='Referencia' >Referencia</th>";
        headHtml += "<th data-field='Cliente'>Cliente</th>";
        headHtml += "<th data-field='Pedimento'>Pedimento</th>";
        headHtml += "<th data-field='Asunto'>Asunto</th>";
        headHtml += "<th data-field='Numero_Acta'>Numero De Acta</th>";
        headHtml += "<th data-field='Motivo'>Motivo</th>";
        headHtml += "<th data-field='Estatus'>Estatus</th>";
        headHtml += "<th data-field='Despacho'>Despacho</th>";
        headHtml += " <th data-field='Notificacion'>Notificacion</th>";
        headHtml += "<th data-field='Vencimiento'>Vencimiento</th>";
        headHtml += "<th data-field='Contestacion'>Contestacion</th>";
        headHtml += "<th data-field='Contestacion_4_meses'>Contestacion 4 meses</th>";
        headHtml += "<th data-field='Asunto_Notificacion_ciudad_juarez'>Asunto Notificacion Ciudad Juárez</th>";
        headHtml += "<th data-field='Comentario1'>Comentario 1 </th>";
        head.append(headHtml);
        $q.when(obtenerDatos("juarez"), function (lista) {
            for (var i = 0; i < lista.length; i++) {
                if (lista[i].nombreSeccion == "Cd. Juarez")
                {
                    trHtml += "<tr>";
                    trHtml += "<td>" + lista[i].referencia + "</td>";
                    trHtml += "<td>" + lista[i].cliente + "</td>";
                    trHtml += "<td>" + lista[i].pedimento + "</td>";
                    trHtml += "<td>" + lista[i].asunto + "</td>";
                    trHtml += "<td>" + lista[i].numerodeActa + "</td>";
                    trHtml += "<td>" + lista[i].motivo + "</td>";
                    trHtml += "<td>" + lista[i].estatus + "</td>";
                    trHtml += "<td>" + lista[i].despacho + "</td>";
                    trHtml += "<td>" + lista[i].notificacion + "</td>";
                    trHtml += "<td>" + lista[i].vencimiento + "</td>";
                    trHtml += "<td>" + lista[i].contestacion + "</td>";
                    trHtml += "<td>" + lista[i].vencimiento4Meses + "</td>";
                    trHtml += "<td>" + lista[i].asuntosnotificadosenCdJuarez + "</td>";
                    trHtml += "<td>" + lista[i].comentario1 + "</td>";
                    trHtml += "</tr>";
                }
            }
            body.append(trHtml);
        })
    }
    $scope.Recientes = function () {

        headHtml = ""
        trHtml = "";
        tabla.html("");
        headHtml += "<thead>";
        headHtml += "<tr class='center - align'>";
        headHtml += "<th data-field='Plazo_Autoridad'>Seguimiento</th>";
        headHtml += "<th data-field='Referencia' >Referencia</th>";
        headHtml += "<th data-field='Pedimento'>Pedimento</th>";
        headHtml += "<th data-field='Cliente'>Cliente</th>";
        headHtml += "<th data-field='Asunto'>Asunto</th>";
        headHtml += "<th data-field='Numero_Acta'>Numero De Acta</th>";
        headHtml += "<th data-field='Motivo'>Motivo</th>";
        headHtml += "<th data-field='Responsable'>Responsable</th>";
        headHtml += "<th data-field='Monto'>Monto </th>";
        headHtml += "<th data-field='Despacho'>Despacho</th>";
        headHtml += " <th data-field='Notificacion'>Notificacion</th>";
        headHtml += "<th data-field='Vencimiento'>Vencimiento</th>";
        headHtml += "<th data-field='Contestacion'>Contestacion</th>";

        // headHtml += "<th data-field='Comentario1'>Comentario 1 </th>";
        tabla.append(headHtml);
        trHtml += "<tbody>";
        $q.when(obtenerDatos("Recientes"), function (lista) {
            for (var i = 0; i < lista.length; i++) {

                var referencia = angular.isDefined(lista[i].referencia) == true ? lista[i].referencia : "";
                var cliente = angular.isDefined(lista[i].cliente) == true ? lista[i].cliente : "";
                var pedimento = angular.isDefined(lista[i].pedimento) == true ? lista[i].pedimento : "";
                var asunto = angular.isDefined(lista[i].asunto) == true ? lista[i].asunto : "";
                var numerodeActa = angular.isDefined(lista[i].numerodeActa) == true ? lista[i].numerodeActa : "";
                var motivo = angular.isDefined(lista[i].motivo) == true ? lista[i].motivo : "";
                var responsable = angular.isDefined(lista[i].responsable) == true ? lista[i].responsable : "";
                // var estatus = angular.isDefined(lista[i].estatus) == true ? lista[i].estatus : "";
                var monto = angular.isDefined(lista[i].monto) == true ? lista[i].monto : "";
                var despacho = angular.isDefined(lista[i].despacho) == true ? lista[i].despacho : "";
                var notificacion = angular.isDefined(lista[i].notificacion) == true ? lista[i].notificacion : "";
                var contestacion = angular.isDefined(lista[i].contestacion) == true ? lista[i].contestacion : "";
                var vencimiento = angular.isDefined(lista[i].vencimiento) == true ? lista[i].vencimiento : "";

                trHtml += "<tr>"; 
                trHtml += '<td id='+lista[i].id+'><div ng-click="darSeguimiento($event)" class="waves-effect waves-mimpo btn-small   btn modal-trigger    green"  >Seguimiento</div></td>';
                trHtml += "<td>" + referencia + "</td>";
                trHtml += "<td>" + pedimento + "</td>";
                trHtml += "<td>" + cliente + "</td>";
                trHtml += "<td>" + asunto + "</td>";
                trHtml += "<td>" + numerodeActa + "</td>";
                trHtml += "<td>" + motivo + "</td>";
                trHtml += "<td>" + responsable + "</td>";
                trHtml += "<td>" + monto + "</td>";
                trHtml += "<td>" + despacho + "</td>";
                trHtml += "<td>" + notificacion + "</td>";
                trHtml += "<td>" + vencimiento + "</td>";
                trHtml += "<td>" + contestacion + "</td>";


                trHtml += "</tr>";

            }
            trHtml += "<tbody>";
            tabla.append($compile(trHtml)($scope));
        })
    }

    $scope.darSeguimiento = function (clickEvent) {
        console.log("hola muindo" + angular.toJson(clickEvent,true))
        
        $scope.myParentId= clickEvent.target.parentElement.id;
        var model = angular.element(document.querySelector('#modalSeguimiento'));
        model.openModal();
        console.log("terminando  muindo"+  $scope.myParentId)
    }
    function obtenerDatos(sec) {
        var def = $q.defer();
        $http({
            method: 'GET',
            url: 'CObtenerMultass',
            params: {seccion: sec},
            headers: {
                'Content-Type': 'application/json'
            }
        }).success(function (data) {
            var lista = [];
            lista = angular.fromJson(data);
            def.resolve(lista);
        }).error(function (data) {
            console.log(data);
            def.reject(data);
        });
        return def.promise;
    }


});





