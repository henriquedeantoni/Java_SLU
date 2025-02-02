package Modulo3;

import java.util.Scanner;

import Modulo2.Digitos;

public class TesteQuadrado_Exercicio1 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        QuadradoGrafico quadrado1 = new QuadradoGrafico();
        
        System.out.println("Digite o tamanho do lado do quadrado um numero inteiro: ");
        int tamanhoLado1 = Integer.parseInt(scanner.nextLine());
        
        quadrado1.setTamanhoLado(tamanhoLado1);
        
        quadrado1.ImprimeQuadrado(tamanhoLado1);

	}

}
