package Modulo4;

import java.util.Scanner;

public class TesteMorse_exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreve uma mensagem:");
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
