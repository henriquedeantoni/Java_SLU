package Modulo3;

import java.util.Scanner;

import Modulo2.Digitos;

public class TesteQuadrado_Exercicio1 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        
		Digitos digit = new Digitos();
		System.out.println("Digite um numero: ");
		int numero = Integer.parseInt(scanner.nextLine());
		digit.setDigito(numero);
		digit.ImprimeDigitos();		

	}

}
