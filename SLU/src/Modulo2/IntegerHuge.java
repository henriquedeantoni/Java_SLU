package Modulo2;

public class IntegerHuge {
	
	private String matrizCharDigitosHuge;
	private int[] matrizIntDigitosHuge;

	public void setMatrizCharDigitosHuge(String matrizCharDigitosHuge)
	{
		this.matrizCharDigitosHuge = matrizCharDigitosHuge;
	}
	
	public String getMatrizCharDigitosHuge()
	{
		return matrizCharDigitosHuge;
	}
			
	public IntegerHuge()
	{
		
	}
	public IntegerHuge(String matrizCharDigitosHuge , int[] matrizIntDigitosHuge)
	{
		this.matrizCharDigitosHuge = matrizCharDigitosHuge;
		this.matrizIntDigitosHuge = Parse(matrizCharDigitosHuge);
	}
	
	public int[] Parse(String matrizCharDigitosHuge)
	{
		int[] novaMatriz = new int[matrizCharDigitosHuge.length()];
		
		for(int i=0; i<matrizCharDigitosHuge.length(); i++)
		{
			novaMatriz[i] = Character.getNumericValue(matrizCharDigitosHuge.charAt(i));
		}
		return novaMatriz;
	}
	
	public static String ToString(int[] outraMatriz)
	{
		StringBuilder novaString = new StringBuilder();
		
		for(int i=0; i<outraMatriz.length; i++)
		{
			novaString.append(Character.forDigit(outraMatriz[i], 10));
		}
		
		return novaString.toString();
	}
	
	//metodos
	public boolean isEqualAt(IntegerHuge outraMatriz)
	{
		for(int i=0; i<outraMatriz.matrizCharDigitosHuge.length(); i++)
		{
			if(this.matrizCharDigitosHuge.charAt(i) != outraMatriz.matrizCharDigitosHuge.charAt(i))
			{
				return false;
			}
		}
		return true;
	}
	
	public boolean isDifferentFrom(IntegerHuge outraMatriz)
	{
		for(int i=0; i<outraMatriz.matrizCharDigitosHuge.length(); i++)
		{
			if(this.matrizCharDigitosHuge.charAt(i) != outraMatriz.matrizCharDigitosHuge.charAt(i))
			{
				return true;
			}
		}
		return false;
	}

	public boolean isBiggerThan(IntegerHuge primeiraMatriz, IntegerHuge segundaMatriz)
	{
		int[] primeiraMatrizInt = Parse(primeiraMatriz.matrizCharDigitosHuge);
		int[] segundaMatrizInt = Parse(segundaMatriz.matrizCharDigitosHuge);
		
		for(int i=0; i<primeiraMatriz.matrizCharDigitosHuge.length(); i++)
		{
			if(primeiraMatrizInt[i]>segundaMatrizInt[i])
			{
				return true;
			}			
		}
		return false;
	}

	public boolean isLessThan(IntegerHuge primeiraMatriz, IntegerHuge segundaMatriz)
	{
		int[] primeiraMatrizInt = Parse(primeiraMatriz.matrizCharDigitosHuge);
		int[] segundaMatrizInt = Parse(segundaMatriz.matrizCharDigitosHuge);
		
		for(int i=0; i<primeiraMatriz.matrizCharDigitosHuge.length(); i++)
		{
			if(primeiraMatrizInt[i]<segundaMatrizInt[i])
			{
				return true;
			}			
		}
		return false;
	}


	public int[] Add(IntegerHuge primeiraMatriz, IntegerHuge segundaMatriz)
	{
		int decimal=0;
		int[] primeiraMatrizInt = Parse(primeiraMatriz.matrizCharDigitosHuge);
		int[] segundaMatrizInt = Parse(segundaMatriz.matrizCharDigitosHuge);
		int[] resultadoMatrizInt = new int[primeiraMatriz.matrizCharDigitosHuge.length()];
		
		for(int i=primeiraMatriz.matrizCharDigitosHuge.length()-1; i>0; i--)
		{
			if(primeiraMatrizInt[i]+segundaMatrizInt[i]<10)
			{
				resultadoMatrizInt[i] = primeiraMatrizInt[i]+segundaMatrizInt[i]+decimal;
				decimal=0;
			}
			else
			{
				resultadoMatrizInt[i] = primeiraMatrizInt[i]+segundaMatrizInt[i] - 10;
				decimal=1;
			}
		}
		if (decimal == 1)
		{
			resultadoMatrizInt[0]=decimal;
		}
				
		return resultadoMatrizInt;
	}
	
	public int[] subtract(IntegerHuge primeiraMatriz, IntegerHuge segundaMatriz)
	{
		int decimal=0;
		int[] primeiraMatrizInt = Parse(primeiraMatriz.matrizCharDigitosHuge);
		int[] segundaMatrizInt = Parse(segundaMatriz.matrizCharDigitosHuge);
		int[] resultadoMatrizInt = new int[primeiraMatriz.matrizCharDigitosHuge.length()];
		
		for(int i=primeiraMatriz.matrizCharDigitosHuge.length()-1; i>0; i--)
		{
			if(primeiraMatrizInt[i]-segundaMatrizInt[i]<0)
			{
				resultadoMatrizInt[i] = 10+primeiraMatrizInt[i]-segundaMatrizInt[i]+decimal;
				decimal=-1;
			}
			else
			{
				resultadoMatrizInt[i] = primeiraMatrizInt[i]+segundaMatrizInt[i]+decimal;
				decimal=0;
			}
		}
		if (decimal == -1)
		{
			resultadoMatrizInt[0]=0;
		}
				
		return resultadoMatrizInt;
	}
	
	

}
