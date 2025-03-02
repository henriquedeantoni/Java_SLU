package Module6;
import java.util.List;
import java.util.Scanner;

public class GeradorPalavras_Exercicio2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número de telefone de 7 dígitos (2-9): ");
            String numero = scanner.nextLine();

            GeradorPalavrasNumeros.validarNumero(numero);

            List<String> palavras = GeradorPalavrasNumeros.palavrasGerar(numero);

            GeradorPalavrasNumeros.salvarEmArquivo(palavras, "numero_telefones_convertidos.txt");

        } catch (NumeroInvalidoException e) {
            System.err.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
