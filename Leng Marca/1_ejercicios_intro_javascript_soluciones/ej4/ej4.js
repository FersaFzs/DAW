let palabra = prompt("Introduce una palabra en inglés:").toLowerCase();
let traduccion;
switch (palabra) {
    case "cat": traduccion = "gato"; break;
    case "dog": traduccion = "perro"; break;
    case "yellow": traduccion = "amarillo"; break;
    case "sleep": traduccion = "dormir"; break;
    default: traduccion = "No hay traducción disponible.";
}
alert(traduccion);