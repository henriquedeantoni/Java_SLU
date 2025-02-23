package Module6;

public class OrdemExcecoes {
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
        
        catch (Exception e) { // Superclasse capturada primeiro
            System.out.println("Exceção geral capturada: " + e.getMessage());
        }
        
        catch (ArithmeticException e) { // Subclasse depois (ERRO)
            System.out.println("Erro: Divisão por zero!");
        }

        catch (InputMismatchException e) { // Outra subclasse depois (ERRO)
            System.out.println("Erro: Entrada inválida. Digite apenas números inteiros.");
        }

        scanner.close();
    }
}
