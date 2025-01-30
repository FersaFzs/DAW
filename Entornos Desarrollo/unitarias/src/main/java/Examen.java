public class Examen {

    public static int calcularFactorial(int numero){
        if(numero<0){
            throw new IllegalArgumentException("No se puede hacer factorial de un número negativo");
        }
        int factorial=1;

        for (int i=1;i<=numero;i++){
            factorial*=i;
        }

        return factorial;
    }

    public static int[] inventirArray(int[] array){
        int[] invertido=new int[array.length];

        for(int i=array.length-1;i>=0;i--){ //Había un error en el bucle que en vez de contar hacia abajo empezando desde el final, contaba hacia arriba empezando por el final (de i++ a i--)
            invertido[i]=array[array.length-i-1];
        }

        return invertido;
    }

    public static int contarCambios(int[] array){
        int cambios=0;

        for(int i=1;i<array.length;i++){
            if((array[i-1]<0 && array[i]>0) || (array[i-1]>0 && array[i]<0)){
                cambios++;
            }
        }

        return cambios;
    }

    public static int posicionPrimerNegativo(int[] array){
        int resultado=-1;

        for(int i=0;i<array.length;i++){
            if(array[i]<0){
                resultado=i; //Había un error en el que a resultado le guardaba el valor en la posicion, no la posición.
                break; //Salimos del bucle cuando encontramos el primer negativo, ya que no queremos que se guarde si hay más negativos después.
            }
        }

        return resultado;
    }
}
