// a) Modificar el texto de los párrafos dentro del div con la clase contenido
const parrafosContenido = document.querySelectorAll(".contenido p");
parrafosContenido.forEach(parrafo => {
    parrafo.textContent = "Modificado con JavaScript";
});

// b) Modificar todas las imágenes por la imagen "mario.jpg"
const imagenes = document.querySelectorAll("img");
imagenes.forEach(img => {
    img.src = "mario.jpg";
});

// c) Modificar el input de tipo texto cambiando a 50% su border-radius
const inputTexto = document.querySelectorAll("input[type=text]");
inputTexto.forEach(input => {
    input.style.borderRadius = "50%";
});

// d) Cambiar los inputs de tipo checkbox a tipo radio
const checkboxes = document.querySelectorAll("input[type=checkbox]");
checkboxes.forEach(checkbox => {
    checkbox.type = "radio";
});

// e) Seleccionar el div con id "seccion" y sustituir la clase destacado por ornamentado
const seccion = document.querySelector("#seccion");
seccion.classList.remove("destacado");
seccion.classList.add("ornamentado");
