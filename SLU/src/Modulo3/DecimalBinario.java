package Modulo3;

public class DecimalBinario {
	//propriedades
	private String numeroBinario;
	private int numeroDecimal;
	
	// getters e setters
	public void setNumeroBinario(String numeroBinario)
	{
		this.numeroBinario = numeroBinario;
	}
	
	public String getNumeroBinario()
	{
		return numeroBinario;
	}
	
	
	public int getNumeroDecimal()
	{
		return numeroDecimal;
	}
	
	//construtores
	
	public DecimalBinario() {}
	public DecimalBinario(String numeroBinario)
	{
		this.numeroBinario = numeroBinario;
		this.numeroDecimal = ConverteBinarioDecimal(numeroBinario);
	}
	
	public int ConverteBinarioDecimal(String numeroBinario)
	{
		int total=0;
		int potencia=0;
		int coeficiente=0;
		
		for(int i=0; i<numeroBinario.length(); i++)
		{
			coeficiente = numeroBinario.charAt(numeroBinario.length()-i-1)-'0';
			potencia = i;
			
			total = total + coeficiente*(int)Math.pow(2, potencia);
		}
		
		return total;
	}
	
	public void MostrarDecimal()
	{
		System.out.println("O numero em formato decimal é: "+numeroDecimal);
	}
}
