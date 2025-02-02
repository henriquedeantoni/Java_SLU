package Modulo3;

public class Vendas {
	
	 private int produto;
	 private int quantidade;
	 private double preco;

	 // Getters e Setters
	 public int getProduto() { return produto; }
	 public int getQuantidade() { return quantidade; }
	 public double getPreco() { return preco; }

	 
	 // Construtor
	 public Vendas() {}
	 public Vendas(int produto, int quantidade) {
	    this.produto = produto;
	    this.quantidade = quantidade;
	    this.preco = obterPreco(produto);
	 }

	 // Métodos
	 private double obterPreco(int produto) {
	     switch (produto) {
	         case 1: return 2.98;
	         case 2: return 4.50;
	         case 3: return 9.98;
	         case 4: return 4.49;
	         case 5: return 6.87;
	         default: return 0.0;
	     }
	 }

	    
	 public double calcularTotal() {
	    return preco * quantidade;
	 }
}
