package Modulo3;

import java.util.Scanner;

public class TesteVendas_Exercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        double VendasTotais = 0.0;

        while (true) {
            System.out.print("Escolha o número do produto de 1 a 5, ou 0 para sair: ");
            int produto = scanner.nextInt();

            if (produto == 0) break;

            System.out.print("Informe a quantidade vendida: ");
            int quantidade = scanner.nextInt();
       
            Vendas venda = new Vendas(produto, quantidade);

            if (venda.getPreco() == 0.0) {
                System.out.println("Produto inválido! Escolha entre 1 e 5.");
                continue; 
            }

            double totalProduto = venda.calcularTotal();
            VendasTotais += totalProduto;

            System.out.printf("Produto %d: %d unidades x R$%.2f = R$%.2f%n",
                    venda.getProduto(), venda.getQuantidade(), venda.getPreco(), totalProduto);
        }

        System.out.printf("Total de vendas: R$%.2f%n", VendasTotais);

        scanner.close();

	}

}
