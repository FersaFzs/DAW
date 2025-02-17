let alto = parseFloat(prompt("Introduce el alto del rectangulo: "));
let ancho = parseFloat(prompt("Introduce el ancho del rectangulo: "));

let superficie = alto * ancho;
document.getElementById("resultado").textContent=`La superficie del rectangulo es: ${superficie}`;
