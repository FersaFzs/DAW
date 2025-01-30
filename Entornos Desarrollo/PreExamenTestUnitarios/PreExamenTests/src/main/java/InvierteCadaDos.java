public class InvierteCadaDos {
    public static double[] invierte_cada_2(double[] array) {
        double[] resultado = new double[array.length];
        for (int n = 0; n < (array.length - 1); n += 2) {
            resultado[n] = array[n + 1];
            resultado[n + 1] = array[n];
        }
        if (array.length % 2 != 0) {
            resultado[resultado.length - 1] = array[array.length - 1];
        }
        return resultado;
    }
}
