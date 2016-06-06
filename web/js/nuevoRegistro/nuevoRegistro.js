$(document).ready(function () {
    

    $(document).on("click", "#cancelarNuevoRegistro", function () {
        cancelar();
    });

    $(document).on("click", "#guardarNuevoRegistro", function () {
//        var modelo = $("#nuevoregistromodelo").val();
//        if (modelo == "") {
//            alert("El campo Modelo es requerido");
//            return;
//        } else {
            guardarnuevoregistroejecutivo();
//        }
    });
});

function guardarnuevoregistroejecutivo() {
    var referencia = $("#referencia").val();
    var pedimento = $("#pedimento").val();
    var cliente = $("#cliente").val();
    var asunto = $("#asunto").val();
    var numeroActa = $("#numeroActa").val();
    var motivo = $("#motivo").val();
    var responsable = $("#responsable").val();
    var estatus = $("#estatus").val();
    var monto = $("#monto").val();
    var notificacion = $("#notificacion").val();
    var vencimiento = $("#vencimiento").val();
    var constestacion = $("#constestacion").val();
    var plazoAutoridad = $("#plazoAutoridad").val();
    var observacion = $("#observacion").val();
    console.log("llebagdo")
    $.ajax({
        url: 'CnuevoRegistro',
        method: 'POST',
        data: {"referencia": referencia
            , "pedimento": pedimento
            , "cliente": cliente
            , "asunto": asunto
            , "numerodeActa": numeroActa
            , "motivo": motivo
            , "responsable": responsable
            , "estatus": estatus
            , "monto": monto
            , "notificacion": notificacion
            , "vencimiento": vencimiento
            , "contestacion": constestacion
            , "plazoAutoridad": plazoAutoridad
            , "comentario1": observacion
        },
        success: function (request) {
             alert(request);
            if (request == 0) {
              //  $("#mensajedelnuevoregistro").html("ERROR AL REGISTRAR, FAVOR DE INTENTARLO DE NUEVO");
             //   $("#modalinformacion").openModal();
            } else {
              //  $("#mensajedelnuevoregistro").html("REGISTRADO CORRECTAMENTE");
              //  $("#modalinformacion").openModal();
                cancelar();
            }
        }
    });//fin de ajax
    
    console.log("saliendo") 
}

function cancelar() {
    $("#referencia").val("");
    $("#pedimento").val("");
    $("#cliente").val("");
    $("#asunto").val("");
    $("#numeroActa").val("");
    $("#motivo").val("");
    $("#responsable").val("");
    $("#estatus").val("");
    $("#monto").val("");
    $("#notificacion").val("");
    $("#vencimiento").val("");
    $("#constestacion").val("");
    $("#plazoAutoridad").val("");
    $("#observacion").val("");

}