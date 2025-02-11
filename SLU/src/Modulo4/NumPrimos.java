package Modulo4;

public class NumPrimos {
	private int numPrimo;
	private boolean isPrime;
	
	public void setNumPrimo(int numPrimo)
	{
		this.numPrimo = numPrimo;
	}
	
	public boolean getIsPrime()
	{
		return isPrime;
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
}
