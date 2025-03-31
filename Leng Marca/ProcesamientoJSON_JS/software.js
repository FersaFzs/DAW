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
                    <p><strong>Objetivo:</strong> ${proyecto.objetivo}</p>
                    <h4>Equipo de trabajo:</h4>
                `;
                
                proyecto.equipo.forEach(miembro => {
                    let miembroDiv = document.createElement("div");
                    miembroDiv.innerHTML = `
                        <h5>${miembro.nombre} - ${miembro.rol}</h5>
                        <ul>
                            ${miembro.tareas.map(tarea => `
                                <li>
                                    <strong>${tarea.nombre}</strong>: ${tarea.descripcion} <br>
                                    <strong>Inicio:</strong> ${tarea.fecha_inicio}, <strong>Fin:</strong> ${tarea.fecha_fin} <br>
                                    <strong>Estado:</strong> ${tarea.completada ? "✅ Completada" : "❌ Pendiente"}
                                </li>
                            `).join("")}
                        </ul>
                    `;
                    proyectoDiv.appendChild(miembroDiv);
                });
                proyectosContainer.appendChild(proyectoDiv);
            });
        })
        .catch(error => console.error("Error cargando el JSON:", error));
});
