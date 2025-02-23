package Module6;

public class ExceptionClassesTeste_Exercicio1 {

	public static void main(String[] args) {
	
		try {
			
			throw new ExceptionC("Erro na exceção de ExceptionC");
		}
		catch (Exception ex)
		{
			System.out.println("Capturada: " + ex.getClass().getSimpleName() + " - " + ex.getMessage());
		}
	}
}
