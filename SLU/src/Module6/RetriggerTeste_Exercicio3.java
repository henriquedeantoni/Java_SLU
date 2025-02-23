package Module6;

public class RetriggerTeste_Exercicio3 {

	public static void main(String[] args) {
	
		 try {
	            RetriggerException.unMethod();
	        } catch (Exception e) {
	            System.out.println("Exceção capturada no main:");
	            e.printStackTrace();
	        }
	}
}
