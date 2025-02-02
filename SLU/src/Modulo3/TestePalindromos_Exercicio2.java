package Modulo3;

import java.util.Scanner;

public class TestePalindromos_Exercicio2 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
	
		Palindromos palindromo1 = new Palindromos();
	
		System.out.println("Informe uma palavra");
		
		String palavra = scanner.nextLine();
		
		palindromo1.setPalavra(palavra);
		
		boolean isPalindromo = Palindromos.TestaPalindromo(palavra);
		
		Palindromos.Mensagem(isPalindromo);
		
	}
	
}
