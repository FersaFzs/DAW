alert("Hola mundo")

let peso = prompt("Introduce tu peso en kg: ");
let altura = parseFloat(prompt("Introduce tu altura en metros"));
let imc = peso / (altura * altura);

alert(`Tu IMC es: ${imc}`);