package Modulo5;

import java.util.Scanner;


public class EmpregadoBaseMaisComissao {
	
	private EmpregadoComissao empregadoComissao;
	
	private double salarioBase;
	
	
	public EmpregadoBaseMaisComissao(String primeiroNome, String sobrenomePaterno, String numeroCPF, double vendasBrutas, double porcentagemComissao, double salarioBase)
	{
		if(salarioBase < 0.0)
		{
			throw new IllegalArgumentException("O salário base deve ser >= 0.0");
		}
		this.empregadoComissao = new EmpregadoComissao(primeiroNome, sobrenomePaterno, numeroCPF, vendasBrutas, porcentagemComissao);
		this.salarioBase = salarioBase;
	}
	
	 public void setSalarioBase(double salarioBase) {
		 if (salarioBase < 0.0) {
			 throw new IllegalArgumentException("O salário base deve ser >= 0.0");
		 }
		 this.salarioBase = salarioBase;
	 }

	 public double getSalarioBase() {
	    return salarioBase;
	 }
	 
	 public double calcularReceita() {
		 return salarioBase + empregadoComissao.CalculaComissao();
	 }
	 
	 @Override
	 public String toString() {
		 return String.format("%s%nSalário Base: %.2f%n%s",
				 empregadoComissao.toString(), salarioBase, "Total Entradas: " + calcularReceita());
	 }
}
