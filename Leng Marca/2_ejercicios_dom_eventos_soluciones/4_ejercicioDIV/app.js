"use strict";

// Seleccionamos elementos del DOM
let div = document.getElementById("info");
let boton = document.querySelector("button");

let temporizador;           // Variable para el intervalo
let juegoActivo = false;    // Controla si el juego está en marcha
let tiempoLimite = 10;      // Tiempo en segundos antes de perder

// Inicialmente, el div no se mueve
div.style.position = "absolute";

// Función para mover el div a una posición aleatoria
function moverDiv() {
    let posX = Math.floor(Math.random() * (window.innerWidth - div.clientWidth));
    let posY = Math.floor(Math.random() * (window.innerHeight - div.clientHeight));
    div.style.left = `${posX}px`;
    div.style.top = `${posY}px`;
}

// Función que inicia el juego
function iniciarJuego() {
    if (juegoActivo) return;            // Evita múltiples inicios

    juegoActivo = true;
    boton.disabled = true;              // Desactivar el botón mientras se juega
    div.style.pointerEvents = "auto";   // Habilitar clic en el div

    let tiempoRestante = tiempoLimite;

    // Mueve el div cada 1 segundo
    temporizador = setInterval(() => {
        moverDiv();
        tiempoRestante--;

        if (tiempoRestante > 0){
            div.innerText = tiempoRestante;
        }
        else {
            finalizarJuego(false);
        }
    }, 1000);
}

// Función para finalizar el juego
function finalizarJuego(ganado) {
    clearInterval(temporizador);    // Detener el temporizador
    juegoActivo = false;
    boton.disabled = false;         // Reactivar el botón

    if (ganado) {
        alert("¡HA GANADO!");
    } else {
        alert("¡HA PERDIDO!");
        div.style.pointerEvents = "none"; // Deshabilitar clic en el div
    }

    div.innerText = "DIV INFO";
}

// Evento para el botón de inicio
boton.addEventListener("click", iniciarJuego);

// Evento para ganar al hacer clic en el div
div.addEventListener("click", () => {
    if (juegoActivo) {
        finalizarJuego(true);
    }
});
