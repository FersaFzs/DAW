public class Main {
    public static void main(String[] args){
        String pathNum = "C:\\Users\\Jose María Fernández\\Desktop\\DAW\\DAW\\Programacion\\ExamenFicheros\\Archivos\\numeros.txt";
        String pathCSV = "C:\\Users\\Jose María Fernández\\Desktop\\DAW\\DAW\\Programacion\\ExamenFicheros\\Archivos\\personas.csv";
        String pathXLSX = "C:\\Users\\Jose María Fernández\\Desktop\\DAW\\DAW\\Programacion\\ExamenFicheros\\Archivos\\personas_mayores_30.xlsx";
        Ejercicio1.Ejercicio1(pathNum);
        ArchivoPersonas.mostrar(pathCSV, pathXLSX);
    }
}
