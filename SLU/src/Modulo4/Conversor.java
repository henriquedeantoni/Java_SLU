package Modulo4;



public class Conversor {
	
	private String pergunta;
	
	private String resposta;
	
	private String[] unCompMetricas;
	
	private String[] unCompInglesas;
	
	private String[] unMassaMetricas;
	
	private String[] unMassaInglesas;
	
	private String[] unVolumeMetricas;
	
	private String[] unVolumeInglesas;			
	
}

public class PadraoMetricoSI
{
	private final double[] relCompMetricaUnidades = {1000, 100, 10,  1.00, 0.1, 0.01, 0.001};
	private final String[] unCompMetricaUnidades = {"quilómetro", "hectômetro", "decâmetro", "metro", "decimetro", "centímrtro", "milimetro"};
	
	private final double relMassaMetrica = 1;
	
	private final double relVolumeMetrica = 1;
}