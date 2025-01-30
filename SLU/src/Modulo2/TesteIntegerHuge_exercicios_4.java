package Modulo2;

import java.util.Scanner;

public class TesteIntegerHuge_exercicios_4 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntegerHuge primeiroNumero = new IntegerHuge();
        IntegerHuge segundoNumero = new IntegerHuge();
		
		System.out.println("Digite o primeiro numero: ");
		String primeiroNumeroEntrada = scanner.nextLine();
		primeiroNumero.setMatrizCharDigitosHuge(primeiroNumeroEntrada);
				
		System.out.println("Digite o segundo numero de tamanho igual ao primeiro: ");
		String segundoNumeroEntrada = scanner.nextLine();
		segundoNumero.setMatrizCharDigitosHuge(segundoNumeroEntrada);
		
		System.out.println("A soma entre os dois é: " + IntegerHuge.ToString(primeiroNumero.Add(primeiroNumero, segundoNumero)));
		System.out.println("A subtração entre os dois é: " + IntegerHuge.ToString(primeiroNumero.subtract(primeiroNumero, segundoNumero)));
		
		scanner.close();
	}
}
