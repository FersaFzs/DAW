public class Ejercicio5 {
    public static void main(String[] args){
        String path = "C:\\Users\\Administrator\\Desktop\\DAW\\Programacion\\EjerciciosTxt\\Ficheros\\archivo1.txt";
        int lineas = LeerTXT.cuentaLineas(path);
        System.out.println("\nEl archivo tiene: "+ lineas + " lineas");
    }
}
