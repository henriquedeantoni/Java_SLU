package Modulo2;

public class Empregado {
	
    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    // Construtor
    public Empregado()
    {
    	
    }
    public Empregado(String primeiroNome, String sobrenome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        setSalarioMensal(salarioMensal);  // Usa o método set para verificar o salário
    }

    // setters e getters
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal > 0) 
        {  
            this.salarioMensal = salarioMensal;
        }
    }

    // Métodos
    public double calcularSalarioAnual() {
        return salarioMensal*12;
    }
    
    public void aumentarSalario(double percentual)
    {
        if (percentual > 0) {
            salarioMensal += salarioMensal * percentual / 100;
        }
    }
}
