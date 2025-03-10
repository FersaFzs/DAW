"use strict";

//SELECCIONAR ELEMENTOS PARA MOSTRAR INFORMACION
const valueText = document.querySelector(".value");

//SELECCIONAR BOTONES
const btnAmarillo = document.querySelector(".btn-amarillo");
const btnAzul = document.querySelector(".btn-azul");
const btnNaranja = document.querySelector(".btn-naranja");

//PROGRAMAR CADA ACCION 
function cambiarColor(color) {
    valueText.style.color = color;
}

btnAmarillo.addEventListener("click", () => cambiarColor("yellow"));
btnAzul.addEventListener("click", () => cambiarColor("cyan"));
btnNaranja.addEventListener("click", () => cambiarColor("orange"));