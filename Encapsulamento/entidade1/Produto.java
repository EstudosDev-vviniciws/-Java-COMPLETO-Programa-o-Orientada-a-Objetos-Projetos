package Encapsulamento.entidade1;

public class Produto {

    /* Encapsulamento consiste em esconder detalhes
    de implementação de uma classe, expondo apenas
    operações seguras e que mantenham os objetos em
    um estado consistente.
    • Um objeto NÃO deve expor nenhum atributo 
    (modificador de acesso private)
    • Os atributos devem ser acessados por meio de métodos get e set. */

    private String nome;
    private double preco;
    private int quantidade;

    public Produto() {
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
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