import java.util.TreeSet;

public class Ejercicio2 {
    public static void main(String[] args){
        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(3);
        numeros.add(4);
        numeros.add(6);
        numeros.add(1);
        numeros.add(7);
        numeros.add(2);
        numeros.add(8);
        numeros.add(10);
        numeros.add(9);
        numeros.add(5);

        //El TreeSet los ordena solos en orden ascendente
        for(int n : numeros){
            System.out.println(n);
        }
    }
}
