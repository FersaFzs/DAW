public class ejercicio11 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2}, {3, 4}};
        int[][] transpuesta = new int[2][2];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}