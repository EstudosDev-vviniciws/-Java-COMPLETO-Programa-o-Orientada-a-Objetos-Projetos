package Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] vect = new double[n];

        for(int i = 0; i < n; i++) {
            vect[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }
        double media = soma / n;
        System.out.printf("A media é: %.2f%n", media);
        scanner.close();
    }
    
}
