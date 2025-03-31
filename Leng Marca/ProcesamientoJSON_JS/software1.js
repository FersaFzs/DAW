document.addEventListener("DOMContentLoaded", function () {
    fetch("./software.json")
        .then(response => response.json())
        .then(data => {
            // Obtener a Juan
            const juan = data.empresa.proyectos[0].equipo[0];
            const proyectos = data.empresa.proyectos;

            // Mostrar nombre e imagen de Juan
            document.querySelector(".dev-nombre").textContent = juan.nombre;
            document.querySelector(".pfp").src = juan.imagen;

            // Mostrar proyectos y tareas de Juan
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
                        ${juan.tareas.map(tarea => `
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