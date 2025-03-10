"use strict";

let tam_y = 150;
let pos_y = 50;
let temporizador_d, temporizador_t;
let activo_teclado = false;

// Elementos del DOM
const botonCrece = document.querySelector("#inicio");
const botonPara = document.querySelector("#paro");
const botonTeclado = document.querySelector("#activar");
const divCrece = document.querySelector("#dimension");
const divMover = document.querySelector("#teclado");

// Evento 'keydown'
function moverDiv(activo) {
    if(activo){
        document.addEventListener("keydown", (event) => {
            switch (event.key) {
                case "ArrowUp":
                    pos_y -= 10;
                    break;
                case "ArrowDown":
                    pos_y += 10;
                    break;
            }
            if (activo_teclado) {
                divMover.style.top = pos_y + "px"; 
            }
        });
    }
}

// Evento 'click' primer botón
botonCrece.addEventListener("click", () => {
    creacerDiv(true);
});

// Evento 'click' segundo botón
botonPara.addEventListener("click", () => {
    creacerDiv(false);
});

// Evento 'click' tercer botón
botonTeclado.addEventListener("click", () => {
    let contador = 10;
    temporizador_t = setInterval(() => {
        activo_teclado = true;
        moverDiv(true);
        contador--;
        if(contador === 0){
            moverDiv(false);
            activo_teclado = false;
            clearInterval(temporizador_t)
        }
    }, 1000);
});

// Función corregida
function creacerDiv(activo) {
    if (activo) {
        temporizador_d = setInterval(() => {
            tam_y += 10;
            divCrece.style.height = tam_y + "px"; 
        }, 1000);
    } else {
        clearInterval(temporizador_d);
    }
}
