document.addEventListener("DOMContentLoaded", function () {
    fetch("./software.json")
        .then(response => response.json())
        .then(data => {
            // Obtener a maría el [1]
            const dev = data.empresa.proyectos[0].equipo[1]; 
            const proyectos = data.empresa.proyectos;

            // Mostrar nombre e imagen del dev
            document.querySelector(".dev-nombre").textContent = dev.nombre;
            document.querySelector(".pfp").src = dev.imagen; 

            // Mostrar proyectos
            const proyectosContainer = document.getElementById("proyectos-container");
            proyectosContainer.innerHTML = ""; 

            proyectos.forEach(proyecto => {
                const proyectoDiv = document.createElement("div");
                proyectoDiv.classList.add("proyecto");

                proyectoDiv.innerHTML = `
                    <h3>${proyecto.nombre}</h3>
                    <p><b>Objetivo:</b> ${proyecto.objetivo}</p>
                    <h4>Tareas asignadas:</h4>
                    <ul class="tareas-lista">
                        ${dev.tareas.map(tarea => `
                            <li>
                                <strong>${tarea.nombre}</strong><br>
                                <span>${tarea.descripcion}</span><br>
                                <small>${tarea.fecha_inicio} → ${tarea.fecha_fin}</small>
                                <span class="estado ${tarea.completada ? 'completada' : 'pendiente'}">
                                    ${tarea.completada ? '✅ Completada' : '🔄 Pendiente'}
                                </span>
                            </li>
                        `).join("")}
                    </ul>
                `;

                proyectosContainer.appendChild(proyectoDiv);
            });
        })
        .catch(error => console.error("Error cargando el JSON:", error));
});