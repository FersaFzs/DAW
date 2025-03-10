let golpes = parseInt(prompt("Número de golpes realizados:"));
let par = parseInt(prompt("Par del hoyo:"));

let mensaje = (golpes == 1) ? "Hole-in-one!" :
              (golpes <= par - 2) ? "Eagle" :
              (golpes == par - 1) ? "Birdie" :
              (golpes == par) ? "Par" :
              (golpes == par + 1) ? "Bogey" :
              (golpes == par + 2) ? "Double Bogey" :
              (golpes >= par + 3) ? "Go Home!" :
              "Error";

alert(mensaje);
