package Modulo3;

public class Palindromos {
	private String palavra;
	private boolean statusPalindromo;
	
	public void setPalavra(String palavra)
	{
		if(ValidaPalavra(palavra))
		{
			this.palavra = palavra;
			System.out.println("palavra informada possui 5 letras e foi gravada com sucesso.");
		}
		else
		{
			System.out.println("palavra informada NÃO possui 5 letras e não pode ser gravada.");
		}
	}
	
	public void setStatusPalindromo(boolean statusPalindromo)
	{
		this.statusPalindromo = statusPalindromo;
	}
	
	public boolean getStatusPalindromo()
	{
		return statusPalindromo;
	}
	
	public String getPalavra()
	{
		return palavra;
	}
	
	public Palindromos()
	{
		
	}
	public Palindromos(String palavra)
	{
		this.palavra = palavra;
	}
	
	public boolean ValidaPalavra(String palavra)
	{
		if(palavra.length() == 5)
		{
			return true;
		}
		return false;
	}
	
	public static boolean TestaPalindromo(String palavra)
	{	
		for(int i=0; i<palavra.length()-1; i++ )
		{
			if(palavra.charAt(i) != palavra.charAt(palavra.length()-1-i))
			{
				return false;
			}
		}
		return true;		
	}
	
	public static void Mensagem(boolean testaPalindromo)
	{
		if(testaPalindromo)
		{
			System.out.println("A palavra é um palindromo");
		}
		else
		{
			System.out.println("A palavra não é um palindromo");
		}
	}
}
