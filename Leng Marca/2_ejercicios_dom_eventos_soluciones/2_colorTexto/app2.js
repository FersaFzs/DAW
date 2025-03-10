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

btnAmarillo.addEventListener("mouseenter", () => cambiarColor("yellow"));
btnAzul.addEventListener("mouseenter", () => cambiarColor("cyan"));
btnNaranja.addEventListener("mouseenter", () => cambiarColor("orange"));

btnAmarillo.addEventListener("mouseleave", () => cambiarColor("var(--clr-grey-1)"));
btnAzul.addEventListener("mouseleave", () => cambiarColor("var(--clr-grey-1)"));
btnNaranja.addEventListener("mouseleave", () => cambiarColor("var(--clr-grey-1)"));