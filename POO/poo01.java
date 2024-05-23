package POO;
import java.util.Scanner;

import POO.entidades1.*;

class poo01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();
        
        System.out.println("Digite as medidas do triangulo X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();
        System.out.println("Digite as medidas do triangulo Y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area do triângulo X: %.4f%n", areaX);
        System.out.printf("Area do triâgulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior area: X");
        }
        else {
            System.out.println("Maior area: Y");
        }
        scanner.close();
    }
}