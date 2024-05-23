/* A palavra "this" é uma referência para o próprio objeto.

 • Usos comuns:
 
 - Diferenciar atributos de variáveis locais
 - Passar o próprio objeto como argumento na chamada de um método ou
construtor. */

/* EXEMPLO ABAIXO:

public Product(String nome, double preco, int quantidade) {
      this.name = nome;
      this.price = preco;
      this.quantity = quantidade;
}

Quando os valores "nome, preco e quantidade" que estão no escopo
do construtor, forem executados, eles seram copiados para o objeto
"produto".

Produto produto = new Produto("TV", 1500.0, 0); */