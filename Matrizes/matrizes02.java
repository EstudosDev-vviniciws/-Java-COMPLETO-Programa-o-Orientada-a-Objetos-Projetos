import java.util.Scanner;
public class matrizes02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int i2 = 0; i2 < n; i2++) {
                mat[i][i2] = scanner.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int cont = 0;
        for (int i = 0; i < n; i++) {
            for (int i2 = 0; i2 < n; i2++) {
                if (mat[i][i2] < 0) 
                cont++;
            }
        }
        System.out.println("Números negativos: " + cont);
        scanner.close();
    }
    
}
