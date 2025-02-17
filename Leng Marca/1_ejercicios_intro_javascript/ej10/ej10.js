

document.body.style.background = "black";
document.body.innerHTML = `<img id="dado" src="./dados/dice1.png" width="100"> <br>
<button onclick="lanzarDado()">Lanzar</button>`;

function lanzarDado(){
    let resultado = Math.floor(Math.random() * 6) + 1;
    document.getElementById("dado").src=`./dados/dice${resultado}.png`;
}