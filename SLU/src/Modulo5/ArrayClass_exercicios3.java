package Modulo5;

import java.util.Scanner;

public class ArrayClass_exercicios3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do array");
		
		int size = Integer.parseInt(scanner.nextLine());
		
		ArrayClass arrayClass1 = new ArrayClass(size);
		
		arrayClass1.WriteArray(0);
		arrayClass1.printArray(0);
		
		System.out.println("O menor valore é:");
		System.out.println(arrayClass1.minimoRecursive(arrayClass1.getArray(), size));
		
	}

}
