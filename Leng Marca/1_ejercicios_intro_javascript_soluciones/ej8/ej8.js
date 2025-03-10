let texto = prompt("Introduce el texto del enlace:");
let url = prompt("Introduce la URL:");

let a = document.createElement("a");
a.href = url;
a.textContent = texto;
a.target = "_blank";
document.body.appendChild(a);
// defer en html