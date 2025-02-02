package Modulo3;

public class QuadradoGrafico {
	private int tamanhoLado;
	
	public void setTamanhoLado(int tamanhoLado)
	{
		this.tamanhoLado = tamanhoLado;
	}
	
	public int getTamanhoLado()
	{
		return tamanhoLado;
	}
	
	public QuadradoGrafico() {}
	
	public QuadradoGrafico(int tamanhoLado)
	{
		this.tamanhoLado=tamanhoLado;
	}
	
	public void ImprimeQuadrado(int tamanhoLado)
	{
		for(int i=0; i<tamanhoLado; i++)
		{
			System.out.print("*");
		}
		for(int i=1; i<tamanhoLado-1; i++)
		{
			System.out.print("\n");
			System.out.print("*");
			for(int j=1; j<tamanhoLado-1; j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");;
		}
		System.out.print("\n");
		for(int i=0; i<tamanhoLado; i++)
		{
			System.out.print("*");
		}
	}
}
