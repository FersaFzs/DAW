"use strict";

// SELECCIONAR ELEMENTOS PARA MOSTRAR INFORMACION
const decreaseBtn = document.querySelector(".decrease");
// SELECCIONAR BOTONES
const resetBtn = document.querySelector(".reset");
const increaseBtn = document.querySelector(".increase");
const value = document.querySelector(".value");

let counter = 0; // Valor inicial del contador

// PROGRAMAR CADA ACCION (decrease, reset, increase)
decreaseBtn.addEventListener("click", () =>{
    counter--;
    updateCounter();
})

resetBtn.addEventListener("click", () =>{
    counter = 0;
    updateCounter();
})

increaseBtn.addEventListener("click", () =>{
    counter++;
    updateCounter();
})

// FUNCIÓN PARA ACTUALIZAR EL CONTADOR
function updateCounter() {
    value.textContent = counter;

    if(counter>0){
        value.style.color = "green";
    } else if (counter === 0){
        value.style.color = "var(--clr-grey-1)";
    } else {
        value.style.color = "red";
    }
}
