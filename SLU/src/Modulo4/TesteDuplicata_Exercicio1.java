package Modulo4;

import java.util.Scanner;

public class TesteDuplicata_Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Duplicata novoArray = new Duplicata();
		
		While(true)
		{
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar número");
            System.out.println("2 - Exibir números");
            System.out.println("3 - Sair");
            
            int opcao = scanner.nextInt();
            
            if (opcao == 0) break;

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número para adicionar: ");
                    int numAdd = scanner.nextInt();
                    novoArray.AdicionaNumero(numAdd);
                    break;
                case 2:
                	novoArray.ImprimeNumeros(null);
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
		}
		scanner.close();
	}
}
