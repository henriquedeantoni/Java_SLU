package Modulo2;

public class NumeroRacional {
	private int numerador;
	private int denominador;
	
	public void setNumerador(int numerador)
	{
		this.numerador = numerador;
	}
	
	public int getNumerador()
	{
		return numerador;
	}
	
	public void setDenominador(int denominador)
	{
		this.denominador = denominador;
	}
	
	public int getDenominador()
	{
		return denominador;
	}
	
	public NumeroRacional()
	{
		
	}
	public NumeroRacional(int numerador, int denominador)
	{
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public static NumeroRacional SomaFracao(NumeroRacional primeiraFracao, NumeroRacional segundaFracao)
	{
		int novoNumerador = primeiraFracao.numerador*segundaFracao.denominador + segundaFracao.numerador*primeiraFracao.denominador;
		int novoDenominador = primeiraFracao.denominador*segundaFracao.denominador;
		NumeroRacional novoRacional = new NumeroRacional(novoNumerador, novoDenominador);
		
		return novoRacional;
	}
	
	public static NumeroRacional SubtraiFracao(NumeroRacional primeiraFracao, NumeroRacional segundaFracao)
	{
		int novoNumerador = primeiraFracao.numerador*segundaFracao.denominador - segundaFracao.numerador*primeiraFracao.denominador;
		int novoDenominador = primeiraFracao.denominador*segundaFracao.denominador;
		NumeroRacional novoRacional = new NumeroRacional(novoNumerador, novoDenominador);
		
		return novoRacional;
	}

	
	public static NumeroRacional MultiplicaFracao(NumeroRacional primeiraFracao, NumeroRacional segundaFracao)
	{
		int novoNumerador = primeiraFracao.numerador*segundaFracao.numerador;
		int novoDenominador = primeiraFracao.denominador*segundaFracao.denominador;
		NumeroRacional novoRacional = new NumeroRacional(novoNumerador, novoDenominador);
		
		return novoRacional;
	}
	
	public static NumeroRacional DivideFracao(NumeroRacional primeiraFracao, NumeroRacional segundaFracao)
	{
		int novoNumerador = primeiraFracao.numerador*segundaFracao.denominador;
		int novoDenominador = primeiraFracao.denominador*segundaFracao.numerador;
		NumeroRacional novoRacional = new NumeroRacional(novoNumerador, novoDenominador);
		
		return novoRacional;
	}
	

	public static String FracaoDecimal(NumeroRacional numeroRacional)
	{
		double decimal = (double) numeroRacional.numerador / numeroRacional.denominador;
		
		return String.format("%.3f",decimal);
	}
	
	public NumeroRacional ReducaoFracao(NumeroRacional numeroRacional)
	{
		NumeroRacional novoRacional = new NumeroRacional();
		
		if(denominador%numerador == 0)
		{
			novoRacional.setNumerador(1);
			novoRacional.setNumerador(denominador/numerador);
			return novoRacional;
		}
		return numeroRacional;
	}
	
	public String RetornaRepresentacao(NumeroRacional numeroRacional)
	{
		return "A fração é " + numeroRacional.numerador + "/" + numeroRacional.denominador ;
	}
	
	
}
