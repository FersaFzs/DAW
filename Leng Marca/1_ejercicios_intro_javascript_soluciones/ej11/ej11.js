let datos = ["Agua", "Zumo", "Pepsi", "Cocacola", "Sprite"];
let select = document.createElement("select");

datos.forEach(op => {
    let option = document.createElement("option");
    option.value = op;
    option.textContent = op;
    select.appendChild(option);
});

document.body.appendChild(select);
