package Module6;

import java.util.Scanner;
import java.util.InputMismatchException;

public class OrdemCapturaExcecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o numerador: ");
            int numerador = scanner.nextInt();
            
            System.out.print("Digite o denominador: ");
            int denominador = scanner.nextInt();
            
            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } 
        
        catch (InputMismatchException e) { // Subclasse capturada primeiro
            System.out.println("Erro: Entrada inválida. Digite apenas números inteiros.");
        } 
        
        catch (ArithmeticException e) { // Outra subclasse antes da superclasse
            System.out.println("Erro: Divisão por zero!");
        } 
        
        catch (Exception e) { // Superclasse capturada por último
            System.out.println("Exceção geral capturada: " + e.getMessage());
        }

        scanner.close();
    }
}
