let meses=["Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"];
let selectDia=document.createElement("select");
let selectMes=document.createElement("select");
let selectAnio=document.createElement("select");

meses.forEach(mes =>{
    let option = document.createElement("option");
    option.value = mes;
    option.textContent = mes;
    selectMes.append(option);
})

for(let dia = 1; dia < 31; dia++){
    let option1 = document.createElement("option");
    option1.value = dia;
    option1.textContent = dia;
    selectDia.append(option1);
}

for(let anio = 1990; anio < 2026; anio++){
    let option2 = document.createElement("option");
    option2.value = anio;
    option2.textContent = anio;
    selectAnio.append(option2);
}
let texto = document.createElement("text");
texto.textContent ="Fecha:";
document.body.appendChild(texto);
document.body.appendChild(selectDia);
document.body.appendChild(selectMes);
document.body.appendChild(selectAnio);
