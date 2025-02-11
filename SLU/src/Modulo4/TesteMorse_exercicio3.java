package Modulo4;

import java.util.Scanner;

public class TesteMorse_exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreve uma mensagem:");
        String mensagem = scanner.nextLine();
        
        Morse mensagemMorse1 = new Morse();
        
        mensagemMorse1.getMensagemDecodificada(mensagemMorse1);
        
        String[] mensagemCodificada = mensagemMorse1.CodificaMorse(mensagem, args, args)
        respostaConversor.setPergunta(pergunta1);
        System.out.println("Respondendo para : "+respostaConversor.getFrasePergunta());
        
        for(int i=0; i<respostaConversor.getFrasePergunta().length; i++)
        {
        	System.out.println(respostaConversor.getFrasePergunta()[i]);
        }
        
        System.out.println(respostaConversor.getPrimeiraUnidade());

	}

}
