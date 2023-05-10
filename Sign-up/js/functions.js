// Declaro variables y mensajes de error
var usuario = document.getElementById("user");
var pw = document.getElementById("pw");
var error = document.getElementById("error");
var errorUsuario = document.getElementById("errorUsuario");
var errorPassword = document.getElementById("errorPassword");
errorPassword.style.color = "red";
errorUsuario.style.color = "red";
var form = document.getElementById("formulario");

// Valido que se haya ingresado algo en los campos
form.addEventListener("submit",function(e){     
        e.preventDefault();
                
        if(usuario.value == null || usuario.value == ''){
            errorUsuario.innerHTML = 'Ingresa tu usuario';
            usuario.style.border = "1px solid red";
        }
        if(pw.value === null || pw.value === ''){
            errorPassword.innerHTML = 'Ingresa tu contraseña';
            pw.style.border = "1px solid red";
        }
       

    });

// Valido que el usuario no sea admin
usuario.addEventListener("blur",function(e){
    e.preventDefault();

    if (usuario.value == "admin") {
        errorUsuario.innerHTML = "El usuario no puede ser admin";
        usuario.style.border = "1px solid red";
    } 
    else {
        errorUsuario.innerHTML = "";
        usuario.style.border = "1px solid #dee2e6";
    }
});
    
// Valido que la contraseña no sea admin ni 1234
pw.addEventListener("blur",function(e){
    e.preventDefault();

    if (pw.value == 'admin') {
        errorPassword.innerHTML = "La contraseña no puede ser admin";
        pw.style.border = "1px solid red";
    } 
    else if (pw.value == "1234") {
        errorPassword.innerHTML = "La contraseña no puede ser 1234";
        pw.style.border = "1px solid red";
    }
    else {
        errorPassword.innerHTML = "";
        pw.style.border = "1px solid #dee2e6";
    }
});

