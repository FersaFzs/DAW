// Crear etiquetas
let label = document.createElement("label");
label.textContent = "Fecha: ";
document.body.appendChild(label);

// Crear select de días
let selectDia = document.createElement("select");
let dias = ["Día"];
for (let i = 1; i <= 31; i++) {
    dias.push(i);
}
dias.forEach(dia => {
    let option = document.createElement("option");
    option.value = dia;
    option.textContent = dia;
    selectDia.appendChild(option);
});
document.body.appendChild(selectDia);

// Crear select de meses
let selectMes = document.createElement("select");
let meses = ["Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
    "Agosto", "Septiembre","Octubre", "Noviembre", "Diciembre"];
meses.forEach(mes => {
    let option = document.createElement("option");
    option.value = mes;
    option.textContent = mes;
    selectMes.appendChild(option);
});
document.body.appendChild(selectMes);

// Crear select de años
let selectAnio = document.createElement("select");
let anios = ["Año"];
for (let i = new Date().getFullYear(); i >= 1900; i--) {
    anios.push(i);
}
anios.forEach(anio => {
    let option = document.createElement("option");
    option.value = anio;
    option.textContent = anio;
    selectAnio.appendChild(option);
});
document.body.appendChild(selectAnio);
