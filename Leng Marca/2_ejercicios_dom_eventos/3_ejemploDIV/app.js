"use strict";

let div = document.getElementById("info");
div.addEventListener("click",
    () => {
        clearInterval(temporizador);
        div.innerText="Desactivado";
    });

// setTimeout(
//     ()=>{
//         div.innerText="BOOM¡¡¡¡¡";
//     },5000);

let tiempo = 10;
div.innerText = tiempo;
let temporizador = setInterval(
    () => {
        let posX = Math.floor(Math.random() * 1900);
        let posY = Math.floor(Math.random() * 900);
        div.style.left=posX + "px";
        div.style.top=posY + "px";
    }, 1000);



    let seguirRaton = false;

    function moverConRaton(evento) {
        let div = document.getElementById("info");
        div.innerText = `(${evento.pageX}, ${evento.pageY})`;
        div.style.left = evento.pageX + "px";
        div.style.top = evento.pageY + "px";
    }
    
    document.addEventListener("keydown", (evento) => {
        if (evento.key === "Enter") {
            seguirRaton = true;
            document.addEventListener("mousemove", moverConRaton);
        } else if (evento.key === " ") { // La tecla espacio es " "
            seguirRaton = false;
            document.removeEventListener("mousemove", moverConRaton);
        }
    });
    
