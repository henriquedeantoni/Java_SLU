package Module6;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeradorPalavrasNumeros {
	private static final String[] TECLADO = {
	       "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"
	    };

	    public static void validarNumero(String numero) throws NumeroInvalidoException {
	        if (!numero.matches("[2-9]{7}")) {
	            throw new NumeroInvalidoException("Número inválido! Deve conter exatamente 7 dígitos e apenas números de 2 a 9.");
	        }
	    }

	    public static List<String> palavrasGerar(String numero) {
	        List<String> resultados = new ArrayList<>();
	        palavrasGerarRecursivo(numero, 0, new StringBuilder(), resultados);
	        return resultados;
	    }

	    private static void palavrasGerarRecursivo(String numero, int index, StringBuilder palavra, List<String> resultados) {
	        if (index == numero.length()) {
	            resultados.add(palavra.toString());
	            return;
	        }

	        int digito = numero.charAt(index) - '0';
	        for (char letra : TECLADO[digito].toCharArray()) {
	            palavra.append(letra);
	            palavrasGerarRecursivo(numero, index + 1, palavra, resultados);
	            palavra.deleteCharAt(palavra.length() - 1);
	        }
	    }

	    public static void salvarEmArquivo(List<String> palavras, String nomeArquivo) {
	        try (FileWriter writer = new FileWriter(nomeArquivo)) {
	            for (String palavra : palavras) {
	                writer.write(palavra + "\n");
	            }
	            System.out.println("Arquivo '" + nomeArquivo + "' gerado com sucesso!");
	        } catch (IOException e) {
	            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
	        }
	    }
}
