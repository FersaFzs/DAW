function lanzarDado() {
    let dado = Math.floor(Math.random() * 6) + 1;
    document.getElementById("dado").src = `./dados/dice${dado}.png`;
}
document.body.innerHTML = `<img id="dado" src="./dados/dice1.png" width="100">
    <br><button onclick="lanzarDado()">Lanzar</button>`;
document.body.style.backgroundColor = "black";  
