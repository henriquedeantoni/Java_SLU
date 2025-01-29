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
	
	public NumeroRacional SomaFracao(NumeroRacional primeiraFracao, NumeroRacional segundaFracao)
	{
		int novoNumerador = primeiraFracao.numerador*segundaFracao.denominador + segundaFracao.numerador*primeiraFracao.denominador;
		int novoDenominador = primeiraFracao.denominador*segundaFracao.denominador;
		NumeroRacional novoRacional = new NumeroRacional(novoNumerador, novoDenominador);
		
		return novoRacional;
	}
	
	public NumeroRacional SubtraiFracao(NumeroRacional primeiraFracao, NumeroRacional segundaFracao)
	{
		int novoNumerador = primeiraFracao.numerador*segundaFracao.denominador - segundaFracao.numerador*primeiraFracao.denominador;
		int novoDenominador = primeiraFracao.denominador*segundaFracao.denominador;
		NumeroRacional novoRacional = new NumeroRacional(novoNumerador, novoDenominador);
		
		return novoRacional;
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
}
