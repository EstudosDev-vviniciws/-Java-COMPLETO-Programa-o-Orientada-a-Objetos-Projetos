package Arrays;
import java.util.Scanner;

import Arrays.entidade03.*;
public class pensionato03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluguel[] aluguel = new Aluguel[10];

        System.out.print("Quantos quartos seram alugados? ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Alguel #" + i + ":");
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.next();
            System.out.print("Quarto: ");
            int quartoNumero = scanner.nextInt();

            aluguel[quartoNumero] = new Aluguel(nome, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < 10; i++) {
            if (aluguel[i] != null) {
                System.out.println(i + ": " + aluguel[i]);
            }
        }

        scanner.close();
    }
    
}
