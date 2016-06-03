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
    var body = angular.element(document.querySelector('#tBodytablaMultas'));
    var head = angular.element(document.querySelector('#tablaMultas'));

    // head.html("");
    // body.html("");
    $scope.todos = function () {
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
        head.append(headHtml);
        $q.when(obtenerDatos(), function (lista) {
            for (var i = 0; i < lista.length; i++) {
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
                trHtml += "<td>" + lista[i].vencimiento4Meses + "</td>";
                trHtml += "<td>" + lista[i].asuntosnotificadosenCdJuarez + "</td>";
                trHtml += "<td>" + lista[i].plazoAutoridad + "' </td>";
                trHtml += "<td>" + lista[i].notificacionResolucionDefefinitiva + "</td>";
                trHtml += "<td>" + lista[i].asuntosConcluidos + "</td>";
                trHtml += "<td>" + lista[i].numeroDeResolucionDefinitiva + "</td>";
                trHtml += "<td>" + lista[i].comentario1 + "</td>";
                trHtml += "<td>" + lista[i].comentario2 + "</td>";
                trHtml += "<td>" + lista[i].comentarioPama + "</td>";
                trHtml += "</tr>";
            }
            body.append(trHtml);
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


        $q.when(obtenerDatos(), function (lista) {
            for (var i = 0; i < lista.length; i++) {
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
            body.append(trHtml);
        })
    }


    $scope.pama = function () {
headHtml += "<thead>";
        headHtml += "<tr class='center - align'>";
        headHtml += "<th data-field='Referencia' >Referencia</th>";
        headHtml += "<th data-field='Cliente'>Cliente</th>";
        headHtml += "<th data-field='Pedimento'>Pedimento</th>";
        headHtml += "<th data-field='Asunto'>Asunto</th>";
        headHtml += "<th data-field='Numero_Acta'>Numero De Acta</th>";
        headHtml += "<th data-field='Motivo'>Motivo</th>";
        headHtml += "<th data-field='Estatus'>Estatus</th>";
        headHtml += "<th data-field='Monto'>Monto</th>";
        headHtml += "<th data-field='Despacho'>Despacho</th>";
        headHtml += " <th data-field='Notificacion'>Notificacion</th>";
        headHtml += "<th data-field='Vencimiento'>Vencimiento</th>";
        headHtml += "<th data-field='Contestacion'>Contestacion</th>";
        headHtml += "<th data-field='Plazo_Autoridad'> Plazo Autoridad</th>";
        headHtml += "<th data-field='Numero_de_resolucion_definitiva'>Numero de resolucion definitiva</th>";
        headHtml += "<th data-field='ComentarioPama'>Comentario Pama </th>";
        head.append(headHtml);
        $q.when(obtenerDatos(), function (lista) {
            for (var i = 0; i < lista.length; i++) {
                trHtml += "<tr>";
                trHtml += "<td>" + lista[i].referencia + "</td>";
                trHtml += "<td>" + lista[i].cliente + "</td>";
                trHtml += "<td>" + lista[i].pedimento + "</td>";
                trHtml += "<td>" + lista[i].asunto + "</td>";
                trHtml += "<td>" + lista[i].numerodeActa + "</td>";
                trHtml += "<td>" + lista[i].motivo + "</td>";
                trHtml += "<td>" + lista[i].estatus + "</td>";
                trHtml += "<td>" + lista[i].monto + "</td>";
                trHtml += "<td>" + lista[i].despacho + "</td>";
                trHtml += "<td>" + lista[i].notificacion + "</td>";
                trHtml += "<td>" + lista[i].vencimiento + "</td>";
                trHtml += "<td>" + lista[i].contestacion + "</td>";
                trHtml += "<td>" + lista[i].plazoAutoridad + "' </td>";
                trHtml += "<td>" + lista[i].numeroDeResolucionDefinitiva + "</td>";
                 trHtml += "<td>" + lista[i].comentarioPama + "</td>";
                trHtml += "</tr>";
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
       
        head.append(headHtml);
        $q.when(obtenerDatos(), function (lista) {
            for (var i = 0; i < lista.length; i++) {
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
        $q.when(obtenerDatos(), function (lista) {
            for (var i = 0; i < lista.length; i++) {
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
            body.append(trHtml);
        })
    }
    $scope.pendientesNot = function () {
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
        headHtml += "<th data-field='Comentario1'>Comentario 1 </th>";
        head.append(headHtml);
        $q.when(obtenerDatos(), function (lista) {
            for (var i = 0; i < lista.length; i++) {
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
                trHtml += "<td>" + lista[i].comentario1 + "</td>";
                trHtml += "</tr>";
               
            }
            body.append(trHtml);
        })
    }
    function obtenerDatos() {
        var def = $q.defer();
        $http({
            method: 'GET',
            url: 'CObtenerMultass',
            //data =concluidos
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





