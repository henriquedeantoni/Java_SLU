package Modulo4;

public class Duplicata {
	private int[] numeros;
	
	//construtor
	
	public Duplicata()
	{		
		this.numeros = null;
	}
	
	public int[] AdicionaNumero(int novoNumero) 
	{
		if(NaoDuplicata(numeros, novoNumero))
		{
			int comprimento = numeros.length;
		
			int[] novaArray = new int[comprimento];
		
			for(int i=0; i<comprimento; i++)
			{
				novaArray[i]=numeros[i];
			}
			novaArray[comprimento-1]=novoNumero;
			
			return novaArray;
		}
		System.out.println("O número informado já existe, não pode duplicar valor!");
		return numeros;
	}
	
	private boolean NaoDuplicata(int[] arrayPrevia, int numero)
	{
		for(int i=0; i<arrayPrevia.length; i++)
		{
			if(arrayPrevia[i]==numero)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void ImprimeNumeros(int[] arrayPrevia) {
        if (arrayPrevia == null || arrayPrevia.length == 0) {
            System.out.println("O array está vazio ou não foi inicializado.");
            return;
        }

        System.out.print("Números no array: ");
        for (int num : arrayPrevia) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
