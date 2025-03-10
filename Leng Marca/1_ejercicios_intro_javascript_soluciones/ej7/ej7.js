let min = 1, max = 50, intento;
let correcto = alert(`Piensa un número entre ${min} y ${max} y recuérdalo.`);

while (true) {
    intento = Math.floor((min + max) / 2);
    let respuesta = prompt(`¿Es ${intento}? (mayor/menor/correcto)`);
    if (respuesta === "correcto") {
        alert("¡Adiviné tu número!");
        break;
    } else if (respuesta === "mayor") {
        min = intento + 1;
    } else if (respuesta === "menor") {
        max = intento - 1;
    } else{
        alert("Error.")
    }
}
