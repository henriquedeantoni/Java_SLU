package Modulo2;

import java.util.Scanner;

public class TesteRacionais_exercicios_3 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		Data data = new Data();
		System.out.println("Digite um dia: ");
		int dia = Integer.parseInt(scanner.nextLine());
		data.setDia(dia);
		System.out.println("Digite um mes: ");
		int mes = Integer.parseInt(scanner.nextLine());
		data.setMes(mes);
		System.out.println("Digite um ano");
		int ano = Integer.parseInt(scanner.nextLine());
		data.setAno(ano);
	
		data.showDate();	

	}
}
