let textos = [ "ScienceDaily", "MIT Technology Review", "NASA", "Artsy", "Brain Pickings", "TED"] ; 
let enlaces = ["https://www.sciencedaily.com/", "https://www.technologyreview.com/", "https://www.nasa.gov/",
            "https://www.artsy.net/", "https://www.brainpickings.org/", "https://www.ted.com/"]

for (let i = 0; i < enlaces.length; i++) {
  let enlace = document.createElement("a"); // Crea un elemento <a>
  enlace.href = enlaces[i]; // Establece la URL del enlace
  enlace.textContent = textos[i]; // Establece el texto del enlace
  enlace.target = "_blank";
  document.body.appendChild(enlace); // Agrega el enlace al contenedor
  document.body.appendChild(document.createElement("br")); // Agrega un salto de línea para separar los enlaces (opcional)
}