let imgUrl = prompt("Introduce la URL de la imagen:");
let linkUrl = prompt("Introduce la URL de la página:");

let p = document.createElement("p");
let a = document.createElement("a");
let img = document.createElement("img");

img.src = imgUrl;
img.style.display = "block";
img.style.margin = "auto";
a.href = linkUrl;
a.appendChild(img);
p.style.textAlign = "center";
p.appendChild(a);

document.body.appendChild(p);
