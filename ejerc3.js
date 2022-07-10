

let contrasena=prompt("Introduzca su contraseña");

var cont=1;
while(cont < 5) {

if(contrasena=='1234') {
		alert('Bienvenido, adelante');
    cont = 0;
		break;

}
else{
      cont ++;
		  alert('Error. Los datos son incorrectos');
		
		if(cont==5) 
		  alert('Lo siento, demasiado intentos, no puedes entrar');
		}	
    }
	
