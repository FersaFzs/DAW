"use strict";

let x=0, y=0, z=0, r=0;

// Elementos del DOM
const b_sumar = document.querySelector(".increaseX");
const b_random = document.querySelector(".randomY");
const b_binario = document.querySelector(".binarioZ");
const resultado = document.querySelector("#resultado");

// Evento sumar
b_sumar.addEventListener("click", ()=>{
    x += 1;
    r = x + y + z;
    resultado.textContent = x + " + " + y + " + " + z + " = " + r;
})

// Evento random
b_random.addEventListener("click", ()=>{
    y = Math.floor(Math.random()*100)+1;
    r = x + y + z;
    resultado.textContent = x + " + " + y + " + " + z + " = " + r;
})

// Evento binario
b_binario.addEventListener("click", ()=>{
    if(z === 0){
        z = 1;
    } else if (z === 1){
        z = 0;
    } else {
        alert("Error!");
    }
    r = x + y + z;
    resultado.textContent = x + " + " + y + " + " + z + " = " + r;
})