package Arrays;
import java.util.Scanner;

import Arrays.entidade01.*;
public class array01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Produto[] vect = new Produto[n];

        for (int i = 0; i < vect.length; i++) {
            scanner.nextLine();
            String nome = scanner.nextLine();
            double preco = scanner.nextDouble();
            vect[i] = new Produto(nome, preco);
        }

        double soma = 0;

        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPreco();
        }
        double media = soma / vect.length;

        System.out.printf("Media da soma: %.2f%n", media);

        scanner.close();
    }
    
}
