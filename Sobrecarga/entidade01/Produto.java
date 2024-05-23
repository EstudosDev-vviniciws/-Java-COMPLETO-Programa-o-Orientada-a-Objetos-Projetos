package Sobrecarga.entidade01;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public Produto() {
    }

    /*Sobrecarga seria disponibilizar mais de uma versão da mesma 
    operação, mas a diferença entre elas será a lista de parametros.
    Por exemplo no que foi com os dois "public Produto" abaixo.*/

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public double valortotalEstoque() {
        return preco * quantidade;
    }

    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome
        + ", $ "
        + String.format("%.2f", preco)
        + ", "
        + quantidade
        + " unidades, Total: $ "
        +  String.format("%.2f", valortotalEstoque());
    }

}   