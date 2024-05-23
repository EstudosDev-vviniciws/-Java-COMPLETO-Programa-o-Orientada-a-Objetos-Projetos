package Exercicios;
import java.util.Scanner;

import Exercicios.entidade01.*;
public class exemplo01 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        contaBancaria conta;
        
        System.out.print("Entre com o numero da conta: ");
        int numero = scanner.nextInt();
        System.out.print("Entre com o nome do titular: ");
        scanner.nextLine();
        String titular = scanner.nextLine();
        System.out.print("Tem algum deposito inicial (S/N)? ");
        char resposta = scanner.next().charAt(0);
        if (resposta == 'S') {
            System.out.print("Entre com o valor do deposito inicial: ");
            double depositoInicial = scanner.nextDouble();
            conta = new contaBancaria(numero, titular, depositoInicial);
        }
        else {
            conta = new contaBancaria(numero, titular);
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Entre com o valor do deposito: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Entre com o valor do saque: ");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(conta);
        scanner.close();
    }
    
}
