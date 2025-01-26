package Modulo2;

public class Digitos {

	// atributo
	private int digito;
	private String digitoString;
	private String digitoInvertido;
	
	// setters and getters
	public void setDigito(int digito)
	{
		this.digito = digito;
		this.digitoString = Integer.toString(digito);
		this.digitoInvertido = new StringBuilder(digitoString).reverse().toString();
	}
	
	public int getDigito()
	{
		return digito;
	}
	
	public String getDigitoString()
	{
		return digitoString;
	}	
	
	public String getDigitoInvertido()
	{
		return digitoInvertido;
	}
	
	public Digitos()
	{
		
	}
	
	// construtor
	public Digitos(int digito ) {
		this.digito = digito;
	}
	
	// métodos
	
	public void ImprimeDigitos()
	{
		System.out.println("Array original:");
        for (int i = 0; i<digitoString.length(); i++) {
            System.out.print(digitoString.charAt(i));
        }

        System.out.println("\nArray invertido:");
        for (int i = 0; i<digitoString.length(); i++) {
            System.out.print(digitoString.charAt(i));
        } 
	}
	
	
}
