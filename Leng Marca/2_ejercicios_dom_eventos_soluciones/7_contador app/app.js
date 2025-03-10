"use strict";

// SELECCIONAR ELEMENTOS PARA MOSTRAR INFORMACIÓN
const value = document.querySelector(".value");

// SELECCIONAR BOTONES
const decreaseBtn = document.querySelector(".decrease");
const resetBtn = document.querySelector(".reset");
const increaseBtn = document.querySelector(".increase");

let counter = 0; // Valor inicial del contador

// PROGRAMAR CADA ACCIÓN  (decrease, reset, increase)
decreaseBtn.addEventListener("click", () => {
    counter--;
    updateCounter();
});

resetBtn.addEventListener("click", () => {
    counter = 0;
    updateCounter();
});

increaseBtn.addEventListener("click", () => {
    counter++;
    updateCounter();
});

// FUNCIÓN PARA ACTUALIZAR EL CONTADOR
function updateCounter() {
    value.textContent = counter;

    // CAMBIAR COLOR SEGÚN EL VALOR
    if (counter > 0) {
        value.style.color = "green";
    } else if (counter < 0) {
        value.style.color = "red";
    } else {
        value.style.color = "var(--clr-grey-1)";
    }
}
