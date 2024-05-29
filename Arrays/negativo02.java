package Arrays;
import java.util.Scanner;
public class negativo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int n = scanner.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vet[i] = scanner.nextInt();
        }

        System.out.println("Numeros Negativos: ");
        for (int i = 0; i < n; i++) {
            if (vet[i] < 0) {
                System.out.println(vet[i]);
            }
        }
        scanner.close();
    }
    
}
