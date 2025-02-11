package Modulo4;

import java.util.ArrayList;

public class NumPrimos {
	private int numPrimo;
	private boolean isPrime;
	private ArrayList<Integer> fatorPrimo;
	
	public void setNumPrimo(int numPrimo)
	{
		this.numPrimo = numPrimo;
	}
	
	public boolean getIsPrime()
	{
		return isPrime;
	}
	
	public ArrayList<Integer> getFatorPrimo()
	{
		return fatorPrimo;
	}
	
	public void VerificaNumPrimo()
	{
		for(int i=2; i<numPrimo; i++)
		{
			if(numPrimo%i == 0)
			{
				isPrime = false;
				return;
			}
		}
		
		isPrime = true;
	}
	
	public void ImprimePrimo()
	{
		if(isPrime)
		{
			System.out.println("É número primo");
		}
		else
		{
			System.out.println("Não é número primo");
		}
	}
	
	public ArrayList<Integer> GeraFatorPrimo()
	{
		ArrayList<Integer> fatorPrimo = new ArrayList<>();
		int valorInicial = 2;
		int numeroMaior = numPrimo; 
		
		while(valorInicial<numPrimo)
		{
			if(numeroMaior%valorInicial==0)
			{
				numeroMaior=(int)numeroMaior/valorInicial;
				fatorPrimo.add(valorInicial);
			}
			else
			{
				valorInicial++;
			}
		}
		
		return fatorPrimo;
	}
	
	public void ImprimeFatorPrimo(ArrayList<Integer> fatorPrimo)
	{
		System.out.print("Fator Primo: ");
		for(int i=0; i<fatorPrimo.size(); i++)
		{
			System.out.print("["+fatorPrimo.get(i)+"]");
		}
	}
	
}
