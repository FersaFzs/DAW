"use strict";

let div = document.getElementById("info");
let temporizador;
let seguirRaton = false; 

div.addEventListener("click",
    () => {
        clearInterval(temporizador);
        div.innerText="Desactivado";
    });

let tiempo = 10;
div.innerText = tiempo;

temporizador = setInterval(
    () => {
        let posX = Math.floor(Math.random() * 1900);
        let posY = Math.floor(Math.random() * 900);
        div.style.left = posX + "px";
        div.style.top = posY + "px";

        tiempo--;
        if (tiempo > 0) {
             div.innerText = tiempo;
        } else {
            clearInterval(temporizador);
            div.innerText = "BOOM¡¡¡";
        }
    }, 1000);

// Evento para detectar la tecla presionada
document.addEventListener("keydown",
    (evento) => {
        if (evento.key === "Enter") {
            seguirRaton = true; // Activar el seguimiento del ratón
        } else if (evento.key === " ") { // Espacio
            seguirRaton = false; // Desactivar el seguimiento del ratón
        }
    });

// Movimiento de la caja con el raton
document.addEventListener("mousemove",
    (evento) => {
        if (seguirRaton) {
            div.innerText = `(${evento.pageX}, ${evento.pageY})`;
            div.style.left = evento.pageX + "px";
            div.style.top = evento.pageY + "px";
        }
    });
