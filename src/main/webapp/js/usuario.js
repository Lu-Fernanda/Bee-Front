

function registroUsuario() {
 alert
    var nombre = $('#nombre').val();
    var apellido = $('#apellido').val();
    var cc = $('#cc').val();
    var celular = $('#celular').val();
    var correo = $('#correo').val();
    var genero = $('#genero').val();
    var edad = $('#edad').val();
    var nombreModelo = $('#nombreModelo').val();

    var sendInfo = {
        cc:cc,
        nombre:nombre,
        apellido: apellido,
        celular: celular,
        correo: correo,
        genero: genero,
        edad:edad,
        nombreModelo:nombreModelo

    };   
    
    console.log(sendInfo);

    $.ajax({
        url: "https://jboton-bee.herokuapp.com/indexRest/rest/usuario",
        data: JSON.stringify(sendInfo),
        type: "POST",
        dataType: "json",
        contentType: "application/json; charset=utf-8",
        
        success: function (result) {
            console.log(result);
            alert("REGISTRO EXITOSO!");
            window.location = "index.html";

        }
    });


}

function registroDenuncia() {

    var sospecha = $('#sospecha').val();
    var tipoPersona = $('#tipoPersona').val();
    var nombrePersona = $('#nombrePersona').val();
    var relato = $('#relato').val();
    var estado = $('#estado').val();
    var idDenunciante = $('#idDenunciante').val();
    
    var sendInfo = {
        sospecha:sospecha,
        tipoPersona:tipoPersona,
        nombrePersona:nombrePersona,
        relato:relato,
        estado:estado,
        idDenunciante:idDenunciante

    };   
    
    console.log(sendInfo);

    $.ajax({
        url: "https://jboton-bee.herokuapp.com/indexRest/rest/denuncia",
        data: JSON.stringify(sendInfo),
        type: "POST",
        dataType: "json",
        contentType: "application/json; charset=utf-8",
        
        success: function (result) {
            console.log(result);
            alert("Gracias porcontribuir!");
            window.location = "index.html";

        }
    });


}