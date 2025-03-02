package Module6;

public class AClass_Exercicio5 {
	public static void main(String[] args) {
        try {
            System.out.println("Tentando criar um objeto OneClass...");
            AClass obj = new AClass("");
        } catch (Exception e) {
            System.err.println("Exceção capturada: " + e.getMessage());
        } finally {
            System.out.println("Finalizando execução do programa.");
        }
    }
}
