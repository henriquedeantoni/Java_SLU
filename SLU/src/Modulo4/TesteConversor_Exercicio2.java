package Modulo4;

import java.util.Scanner;

import Modulo2.Empregado;

public class TesteConversor_Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Faça uma pergunta de conversão de unidades, \n Por exemplo.: \n Quantos centímetros tem um metro? \n Quantos quilogramas tem uma libra?");
        String pergunta1 = scanner.nextLine();
        
        RespostaConversor respostaConversor = new RespostaConversor(pergunta1);
        respostaConversor.setPergunta(pergunta1);
        System.out.println("Respondendo para : "+respostaConversor.getFrasePergunta());
        
        for(int i=0; i<respostaConversor.getFrasePergunta().length; i++)
        {
        	System.out.println(respostaConversor.getFrasePergunta()[i]);
        }
        
        System.out.println(respostaConversor.getPrimeiraUnidade());

	}

}
