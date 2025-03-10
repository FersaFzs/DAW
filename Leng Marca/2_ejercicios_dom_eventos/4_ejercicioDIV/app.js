"use strict";

// Seleccionamos elementos del DOM
let div = document.getElementById("info");
let boton = document.querySelector("button");

let temporizador;           // Variable para el intervalo
let juegoActivo = false;    // Controla si el juego está en marcha
let tiempoRestante;         // Tiempo restante en segundos
const tiempoLimite = 10;    // Tiempo en segundos antes de perder

// Estilo inicial del div
div.style.position = "absolute";

// Función para mover el div a una posición aleatoria
function moverDiv() {
    tiempoRestante = tiempoLimite;
    temporizador = setInterval(() => {
        if (tiempoRestante > 0) {
            tiempoRestante--;
            div.innerText = tiempoRestante;
            
            let posX = Math.floor(Math.random() * (window.innerWidth - div.clientWidth));
            let posY = Math.floor(Math.random() * (window.innerHeight - div.clientHeight));

            div.style.left = posX + "px";
            div.style.top = posY + "px";
        } else {
            alert("¡HAS PERDIDO!");
            finalizarJuego();
        }
    }, 1000);
}

// Función que inicia el juego
function iniciarJuego() {
    if (!juegoActivo) {
        juegoActivo = true;
        boton.disabled = true;
        div.innerText = tiempoLimite;
        moverDiv();
        // Agregar el evento para ganar
        div.addEventListener("click", ganarJuego);
    }
}

// Función para finalizar el juego
function finalizarJuego() {
    clearInterval(temporizador);
    juegoActivo = false;
    boton.disabled = false;
    div.innerText = "Fin";
    div.removeEventListener("click", ganarJuego);
}

// Función que muestra el mensaje de victoria
function ganarJuego() {
    clearInterval(temporizador); // Evita múltiples temporizadores
    alert("¡HAS GANADO!");
    finalizarJuego();
}

// Evento para el botón de inicio
boton.addEventListener("click", iniciarJuego);