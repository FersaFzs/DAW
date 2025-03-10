let n1 = parseFloat(prompt("Introduce el primer número:"));
let n2 = parseFloat(prompt("Introduce el segundo número:"));
let n3 = parseFloat(prompt("Introduce el tercer número:"));
let mensaje = (n1 > 10 && n2 > 10 && n3 > 10) ? "Todos son mayores de 10." : "No todos son mayores de 10.";
document.write(`<p>${mensaje}</p>`);
