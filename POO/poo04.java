package POO;
import java.util.Scanner;

import POO.entidades4.*;
public class poo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Prova prova = new Prova();

        prova.nome = scanner.nextLine();
        prova.n1 = scanner.nextDouble();
        prova.n2 = scanner.nextDouble();
        prova.n3 = scanner.nextDouble();

        System.out.printf("Nota Final: %.2f%n", prova.notaFinal());

        if (prova.notaFinal() < 60.0) {
            System.out.println("Infelizmente você não passou.");
            System.out.printf("Pontos faltando: %.2f%n", prova.pontosFaltando());
        }
        else {
            System.out.println("Parabéns, você passou!");
        }
        
        scanner.close();
    }
    
}
