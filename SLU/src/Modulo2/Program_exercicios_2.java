package Modulo2;
import java.util.Scanner;

public class Program_exercicios_2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		Digitos digit = new Digitos();
		System.out.println("Digite um numero: ");
		int numero = Integer.parseInt(scanner.nextLine());
		digit.setDigito(numero);
		digit.ImprimeDigitos();		

	}

}
