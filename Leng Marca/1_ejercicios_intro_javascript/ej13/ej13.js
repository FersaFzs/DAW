let enlaces=["https://es.wikipedia.org/wiki/", "https://www.apple.com/es/", "https://www.google.es/"];
let textos=["wikipedia", "apple", "google"];

for(let i = 0; i < enlaces.length; i++){
    let link = document.createElement("a");
    link.href= enlaces[i];
    link.textContent = textos[i];
    link.style.display="block";
    link.target="_blank";

    document.body.appendChild(link);
};
