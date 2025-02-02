package Modulo3;

import java.util.Scanner;

public class TesteDecimalBinario_Exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Digite um numero binario qualquer: ");
		String binario = scanner.nextLine();
		
		DecimalBinario novoDecimal = new DecimalBinario(binario);
		
		novoDecimal.MostrarDecimal();
		
	}

}
