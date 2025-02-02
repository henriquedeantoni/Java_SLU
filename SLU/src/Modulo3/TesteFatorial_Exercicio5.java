package Modulo3;

import java.util.Scanner;

public class TesteFatorial_Exercicio5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Digite a ordem do fatorial (um número inteiro) que deseja calcular (obs.: a ordem deverá ser menor que 17, para não dar Out Of Range do tipo integer):  ");
		int ordemFatorial = Integer.parseInt(scanner.nextLine());
		
		Fatorial novoFatorial = new Fatorial(ordemFatorial);
		
		//novoFatorial.CalculaFatorial(ordemFatorial, 1);
		novoFatorial.ImprimeFatorial();
		
	}
}
