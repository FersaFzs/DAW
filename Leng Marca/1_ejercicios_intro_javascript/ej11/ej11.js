
let datos=["agua","zumo","pepsi","cocacola","sprite"];
let select= document.createElement("select");


datos.forEach(op => {
    let option = document.createElement("option");
    option.value = op;
    option.textContent = op;
    select.append(option);
})
document.body.appendChild(select);
