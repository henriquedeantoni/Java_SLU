package Modulo2;

import java.util.Scanner;

public class TesteRacionais_exercicios_3 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		NumeroRacional primeiraFracao = new NumeroRacional();
		NumeroRacional segundaFracao = new NumeroRacional();
		
		System.out.println("Digite o numerador da primeira fração: ");
		int primeiroNumerador = Integer.parseInt(scanner.nextLine());
		primeiraFracao.setNumerador(primeiroNumerador);
		
		System.out.println("Digite o denominador da primeira fração: ");
		int primeiroDenominador = Integer.parseInt(scanner.nextLine());
		primeiraFracao.setDenominador(primeiroDenominador);
		
		System.out.println("Digite o numerador da segunda fração: ");
		int segundoNumerador = Integer.parseInt(scanner.nextLine());
		segundaFracao.setNumerador(segundoNumerador);
		
		System.out.println("Digite o denominador da segunda fração: ");
		int segundoDenominador = Integer.parseInt(scanner.nextLine());
		segundaFracao.setDenominador(segundoDenominador);
		
		
		NumeroRacional fracaoResultante = new NumeroRacional();
				
		System.out.println("A soma das duas frações é: "+ fracaoResultante.RetornaRepresentacao( NumeroRacional.SomaFracao(primeiraFracao, segundaFracao)));

		System.out.println("A subtração das duas frações é: "+ fracaoResultante.RetornaRepresentacao( NumeroRacional.SubtraiFracao(primeiraFracao, segundaFracao)));

		System.out.println("A multiplicação das duas frações é: "+ fracaoResultante.RetornaRepresentacao( NumeroRacional.MultiplicaFracao(primeiraFracao, segundaFracao)));

		System.out.println("A subtração das duas frações é: "+ fracaoResultante.RetornaRepresentacao( NumeroRacional.DivideFracao(primeiraFracao, segundaFracao)));
		
		System.out.println("Seu formato decimal é: "+ NumeroRacional.FracaoDecimal(fracaoResultante));
		
		scanner.close();
	}
}
