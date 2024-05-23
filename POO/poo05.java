package POO;

import java.util.Scanner;

import POO.entidades5.Calculadora;

public class poo05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o valor do raio: ");
        double raio = scanner.nextDouble();

        double c = Calculadora.circunferencia(raio);

        double v = Calculadora.volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor do PI: %.2f%n", Calculadora.PI);
        scanner.close();
    }
    
}
