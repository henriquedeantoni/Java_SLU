package Modulo5;

import java.util.Scanner;


public class EmpregadoBaseMaisComissao extends EmpregadoComissao {
	
	private double salarioBase;
	public EmpregadoBaseMaisComissao(String primeiroNome, String sobrenomePaterno, String numeroCPF, double vendasBrutas, double porcentagemComissao, double salarioBase)
	{
		
		super(primeiroNome, sobrenomePaterno, numeroCPF, vendasBrutas, porcentagemComissao);
		
		if(salarioBase < 0.0)
		{
			throw new IllegalArgumentException("O salário base deve ser >= 0.0");
		}
		
		this.salarioBase = salarioBase;
	}
	
	public void setSalarioBase( double salarioBase) {
		if(salarioBase < 0.0)
		{
			throw new IllegalArgumentException("O salário base deve ser >= 0.0");
		}
	}
	
	public double getSalarioBase() { return salarioBase;}
	
	@Override
	public double entradas() {return getSalarioBase() + super.entradas();}

	@Override
	public String toString() {
		return String.format("%s %s %n $s: %.2f", "salário base", super.toString(), "salário base", getSalarioBase());
	}
}
