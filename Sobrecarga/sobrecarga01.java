package Sobrecarga;
import java.util.Scanner;

import Sobrecarga.entidade01.*;
class construtor01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ensira os dados do produto: ");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        Produto produto = new Produto(nome, preco);

        System.out.println();
        System.out.println("Informações do produto: " + produto);
        
        System.out.println();
        System.out.print("Entre com o número de produtos para ser adicionado no estoque: ");
        int quantidade = scanner.nextInt();
        produto.adicionarProduto(quantidade);

        System.out.println();
        System.out.println("Informações atualizadas do produto: " + produto);

        System.out.println();
        System.out.print("Entre com o número de produtos para serem removidos do estoque: ");
        quantidade = scanner.nextInt();
        produto.removerProdutos(quantidade);

        System.out.println();
        System.out.println("Informações atualizadas do produto: " + produto);

        scanner.close();
    }
    
}