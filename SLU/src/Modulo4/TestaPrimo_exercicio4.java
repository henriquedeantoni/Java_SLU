package Modulo4;

import java.util.ArrayList;
import java.util.Scanner;

import Modulo2.NumeroRacional;

public class TestaPrimo_exercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("um número: ");
		
		int numero = Integer.parseInt(scanner.nextLine());
		
		NumPrimos numMorse = new NumPrimos();
		
		numMorse.setNumPrimo(numero);
		
		numMorse.VerificaNumPrimo();
		
		numMorse.ImprimePrimo();
		
		ArrayList<Integer> fatorPrimo = numMorse.GeraFatorPrimo();
		
		numMorse.ImprimeFatorPrimo(fatorPrimo);
	}

}
