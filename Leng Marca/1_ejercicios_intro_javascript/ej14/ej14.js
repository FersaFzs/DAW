document.addEventListener("keydown",
    (event)=>{
        switch(event.key){
            case "ArrowUp":
                alert("Tecla arriba pulsada");
                break;
            case "ArrowDown":
                alert("Tecla abajo pulsada");
                break;
            case "ArrowLeft":
                alert("Tecla izquierda pulsada");
                break;
            case "ArrowRight":
                alert("Tecla derecha pulsada");
                break;
            default:
                alert("Tecla no reconocida");
        }   
    });

let temporizador=setTimeout(
    ()=>{
        alert("Han pasado 10 segundos");
    }, 10000);

let cuenta = 0;
let div_info=querySelector("#info");
div_info.innerText=cuenta;
let intervalo=setInterval(
    ()=>{
        cuenta++;
        div_info.innerText=cuenta;
    }, 10000);
