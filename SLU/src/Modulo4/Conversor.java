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
	
	
	public class ComprimentoUnidades
	{
		private final double[] relCompMetricaUnidades = {1000, 100, 10,  1.000, 0.1, 0.01, 0.001};
		private final String[] unCompMetricaUnidades = {"quilómetro", "hectômetro", "decâmetro", "metro", "decimetro", "centímetro", "milimetro"};
	
		private final double[] relCompInglesUnidades = {63360, 36, 12,  1.000, 0.001};
		private final String[] unCompInglesUnidades = {"milha", "jarda", "pé", "polegada", "mil"};
		
		private final double relationComprMetricIngles = (1000/1609.344); // 1000 metro tem 1000/1609.344 milhas
	}
	
	public class MassaUnidades
	{
		private final double[] relMassMetricaUnidades = {1000,  1.000, 0.001};
		private final String[] unMassMetricaUnidades = {"tonelada", "quilograma", "grama"};
	
		private final double[] relCompInglesUnidades = {2000, 1.000, 0.0625};
		private final String[] unCompInglesUnidades = {"ton", "libras", "onça"};
		
		private final double relationMassaMetricIngles = (1000/453.592); // 1.000 kg tem 1000/453.592 libras
	}	
	
	
}


