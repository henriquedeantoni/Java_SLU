package Modulo4;

import java.util.Scanner;

public class TesteMorse_exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreve uma mensagem:");
        String mensagem = scanner.nextLine();
        
        Morse mensagemMorse1 = new Morse();
        
        mensagemMorse1.setMensagemDecodificada(mensagem);
        
        String[] mensagemCodificada = mensagemMorse1.CodificaMorse(mensagem, Morse.morse, Morse.dicionario);
        
        mensagemMorse1.ImprimeCodigoMorse(mensagemCodificada);

	}

}
