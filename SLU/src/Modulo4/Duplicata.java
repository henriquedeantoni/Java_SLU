package Modulo4;

public class Duplicata {
	private int[] numeros = null;
	
	public Duplicata(int[] numeros)
	{		
		this.numeros = numeros ;
	}
	
	//construtor
	public void setDuplicate(int[] numeros)
	{
		this.numeros = numeros;
	}
	
	public void AdicionaNumero(int novoNumero) 
	{
		
		if(numeros == null)
		{
			int[] novaArray = new int[1];
			novaArray[0]=novoNumero;
			setDuplicate(novaArray);
		}
		else if(NaoDuplicata(numeros, novoNumero))
		{
			int comprimento = numeros.length;
			int[] novaArray = new int[comprimento+1];
			for(int i=0; i<comprimento; i++)
			{
				novaArray[i]=numeros[i];
			}
			novaArray[comprimento]=novoNumero;
			
			setDuplicate(novaArray);
		}
	}
	
	private boolean NaoDuplicata(int[] arrayPrevia, int numero)
	{
		for(int i=0; i<arrayPrevia.length; i++)
		{
			if(arrayPrevia[i]==numero)
			{
				System.out.println("O número informado já existe, não pode duplicar valor!");
				return false;
			}
		}
		return true;
	}
	
	public void ImprimeNumeros() {
		
        if (numeros == null || numeros.length == 0) {
            System.out.println("O array está vazio ou não foi inicializado.");
            return;
        }

        System.out.print("Números no array: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
