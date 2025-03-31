document.addEventListener("DOMContentLoaded", function () {
    fetch("./software.json")
        .then(response => response.json())
        .then(data => {
            
            document.getElementById("empresa-nombre").textContent = data.empresa.nombre;
            document.getElementById("empresa-ubicacion").textContent = data.empresa.ubicacion;

           
            const proyectosContainer = document.getElementById("proyectos-container");
            data.empresa.proyectos.forEach(proyecto => {
                let proyectoDiv = document.createElement("div");
                proyectoDiv.innerHTML = `
                    <h3>${proyecto.nombre}</h3>
                    <p><b>Objetivo:</b> ${proyecto.objetivo}</p>
                `;
                proyectosContainer.appendChild(proyectoDiv);
            });

            const equipo = data.empresa.proyectos[0].equipo; 
            const dev1 = document.getElementById("dev1");
            const dev2 = document.getElementById("dev2");


            dev1.querySelector("span").textContent = equipo[0].nombre;
            dev1.querySelector("img").src = equipo[0].imagen;

            dev2.querySelector("span").textContent = equipo[1].nombre;
            dev2.querySelector("img").src = equipo[1].imagen; 
        })
        .catch(error => console.error("Error cargando el JSON:", error));
});