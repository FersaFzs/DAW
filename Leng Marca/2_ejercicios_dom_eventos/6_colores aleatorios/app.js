"use strict";

// Arrays de colores
const digitos_hexadecimales = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"];
const colores_nombres = ["red", "blue", "green", "yellow", "purple", "orange", "pink", "brown", "cyan", "magenta"];

// Selección de elementos del DOM
let colorTexto = document.querySelector(".color");
let botonHex = document.getElementById("btn-hexa");
let botonNom = document.getElementById("btn-nombre");

// Función para generar un color hexadecimal aleatorio
function generarColorHexadecimal() {
    let colorHex = "#";
    for(let a = 0; a < 6; a++){
        let i = Math.floor(Math.random() * digitos_hexadecimales.length);
        colorHex += digitos_hexadecimales[i];
    }
    aplicarColor(colorHex);
}

// Función para seleccionar un color por nombre aleatorio
function generarColorPorNombre() {
    let j = Math.floor(Math.random() * colores_nombres.length);
    aplicarColor(colores_nombres[j]);
}

// Función para aplicar el color al fondo y actualizar el texto
function aplicarColor(color) {
    document.body.style.backgroundColor = color;
    colorTexto.textContent = color;
    colorTexto.style.color = color;
}

// Eventos de los botones
botonHex.addEventListener("click", generarColorHexadecimal);
botonNom.addEventListener("click", generarColorPorNombre);
