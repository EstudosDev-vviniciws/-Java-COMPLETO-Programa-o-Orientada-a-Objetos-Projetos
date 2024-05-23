package POO;
import java.util.Scanner;

import POO.entidades2.*;
public class poo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("Ensira os dados do produto: ");
        System.out.print("Nome: ");
        produto.nome = scanner.nextLine();
        System.out.print("Preço: ");
        produto.preco = scanner.nextDouble();
        System.out.print("Quantidade: ");
        produto.quantidade = scanner.nextInt();

        produto.toString();

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
