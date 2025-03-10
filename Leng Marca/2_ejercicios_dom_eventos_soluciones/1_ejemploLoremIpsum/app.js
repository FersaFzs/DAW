// a) Cambia de color a verde de todo el texto dentro de los div con clase artículo
document.querySelectorAll("div.artículo").forEach(div => {
    div.style.color = "green";
});

// b) Fija a 2em el tamaño del texto de los enlaces del div noticias
document.querySelectorAll("div#noticias a").forEach(a => {
    a.style.fontSize = "2em";
});

// c) Cambia el texto de los enlaces dentro en los divs publicidad, articulo y secundario a "leer más..."
document.querySelectorAll("div.publicidad a, div.artículo a, div#secundario a").forEach(a => {
    a.textContent = "leer más...";
});

// d) Cambia todos los enlaces dentro del div con id noticias para que se abran en una ventana distinta
document.querySelectorAll("div#noticias a").forEach(a => {
    a.setAttribute("target", "_blank");
});

// e) Ponerle un borde de color rojo y tamaño 3 pixeles al input text
document.querySelectorAll("input[type='text']").forEach(input => {
    input.style.border = "3px solid red";
    input.classList.add("borde-rojo");
});

// f) Cambia el texto dentro de todos los h2 a "Tu página tiene un virus" dentro del div con id secundario
document.querySelectorAll("div#secundario h2").forEach(h2 => {
    h2.textContent = "Tu página tiene un virus";
});

// g) Cambiar la imagen de todos los artículos por la imagen de la bombilla encendida
document.querySelectorAll("div.artículo img").forEach(img => {
    img.src = "bombilla_encendida.jpg";
});

// h) Cambiar el alto del div con id secundario a 1000px
document.getElementById("secundario").style.height = "1000px";

// i) Cambiar el ancho del menú principal a 300px
document.querySelector("#menu-principal").style.width = "300px";