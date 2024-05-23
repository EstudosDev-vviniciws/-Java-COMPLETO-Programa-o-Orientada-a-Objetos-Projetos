package POO;
import java.util.Scanner;

import POO.entidades3.*;
public class poo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario func = new Funcionario();

        System.out.print("Nome: ");
        func.nome = scanner.nextLine();
        System.out.print("Salário Bruto: ");
        func.salarioBruto = scanner.nextDouble();
        System.out.print("Taxa: ");
        func.taxa = scanner.nextDouble();

        System.out.println();
        System.out.println("Funcionário: ");
        System.out.println();
        System.out.println("Qual a porcentagem para aumentar o salário: ");
        double porcentagem = scanner.nextDouble();
        func.aumentoSalartio(porcentagem);

        System.out.println();
        System.out.println("Informações atualizadas: " + func);
        scanner.close();
    }
    
}
