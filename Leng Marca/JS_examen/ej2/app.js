"use strict";

let contenido = [
  "El arte de la conversación",
  "Explorando nuevas perspectivas",
  "Innovación y creatividad",
  "Descubriendo nuevos horizontes",
  "Conectando mentes brillantes",
  "Diversidad y unidad",
  "Explorando el cosmos",
  "Crecimiento personal",
  "Transformando el mundo",
  "Descubrimientos fascinantes",
  "Aventuras inesperadas",
  "Desafíos emocionantes",
  "Sueños por realizar",
  "Redefiniendo lo posible",
  "Explorando la naturaleza",
  "Cultivando el conocimiento",
  "Celebrando la vida",
  "Pasión por el aprendizaje",
  "Abrazando la diversidad",
  "Inspirando el cambio",
];

// a) Generar una lista
const lista = document.createElement("ol");
contenido.forEach(dato => {
  const elementoLista = document.createElement("li");
  elementoLista.textContent = dato;
  lista.appendChild(elementoLista);
});
document.body.appendChild(lista);

// Separador
document.body.appendChild(document.createElement("br"));

// b) Generar una tabla con clase "formato"
const tabla = document.createElement("table");

tabla.classList.add("formato");

contenido.forEach(dato => {
  const fila = document.createElement("tr");
  const columna = document.createElement("td");
  columna.textContent = texto;
  fila.appendChild(columna);
  tabla.appendChild(fila);
});
document.body.appendChild(tabla);

// Separador
document.body.appendChild(document.createElement("br"));

// c) Generar un datalist
const datalist = document.createElement("datalist");
datalist.id = "opciones";

contenido.forEach(texto => {
  const option = document.createElement("option");
  option.value = texto;
  datalist.appendChild(option);
});
document.body.appendChild(datalist);

// Asociar datalist a un input
const input = document.createElement("input");
input.setAttribute("list", "opciones");
document.body.appendChild(input);
