package Modulo5;

public class EmpregadoComissao {
	
    private String primeiroNome;
    private String sobrenomePaterno;
    private String numeroCPF;
    private double vendasBrutas;
    private double porcentagemComissao;
    
    public EmpregadoComissao(String primeiroNome, String numeroCPF, String sobrenomePaterno, double vendasBrutas, double porcentagemComissão )
    {
    	if (vendasBrutas < 0.0) {
            throw new IllegalArgumentException("As vendas brutas devem ser >= 0.0");
        }
        if (porcentagemComissao <= 0.0 || porcentagemComissao > 1.0) {
            throw new IllegalArgumentException("A porcentagem de comissão deve ser > 0.0 e <= 1.0");
        }

        this.primeiroNome = primeiroNome;
        this.sobrenomePaterno = sobrenomePaterno;
        this.numeroCPF = numeroCPF;
        this.vendasBrutas  = vendasBrutas ;
        this.porcentagemComissao = porcentagemComissao;
        
    }

	public double CalculaComissao()
	{
		return vendasBrutas * porcentagemComissao;
	}
        
    @Override
    public String toString() {
        return String.format("%s %s%nCPF: %s%nVendas Brutas: %.2f%nComissão: %.2f",
        	primeiroNome, sobrenomePaterno, numeroCPF, vendasBrutas, porcentagemComissao);
    }
    
}
