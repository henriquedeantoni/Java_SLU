package Modulo3;

public class Fatorial {
	//propriedades
	private int numeroFatorial;
	private int ordemFatorial;
	
	//getters e setters
	public void setOrdemFatorial(int ordemFatorial)
	{
		this.ordemFatorial = ordemFatorial;
	}
	
		
	public Fatorial() {}
	
	public Fatorial(int ordemFatorial)
	{
		this.ordemFatorial=ordemFatorial;
		this.numeroFatorial=CalculaFatorial(ordemFatorial);
	}
	
	//Métodos
	
	public int CalculaFatorial(int ordemFatorial)
	{
		if(ordemFatorial>=2)
		{
			return ordemFatorial*CalculaFatorial(ordemFatorial-1);
		}
		else
		{
			return 1;
		}
	}
	
	/*public int CalculaFatorial(int ordemFatorial, int valorInicial)
	{
		if(ordemFatorial>=2)
		{
			valorInicial = valorInicial*ordemFatorial*CalculaFatorial(ordemFatorial-1, valorInicial);
		}
		else
		{
			valorInicial = valorInicial*1;
		}
		return (int)valorInicial;
	}*/
	
	public void ImprimeFatorial()
	{
		System.out.println("O número fatorial é: "+numeroFatorial);
	}
	
}
