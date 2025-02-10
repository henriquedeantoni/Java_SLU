package Modulo4;

import java.util.Arrays;

public class RespostaConversor {
	
	private String pergunta;
	
	private String resposta;
	
	private double valorNaoConvertido;
	
	private String primeiraUnidade;

	private String segundaUnidade;
	
	private String[] frasePergunta;
	
	public class PronomesPergunta
	{
		public final static String[] pronomes = {"Qual", "qual", "Como", "como", "Quanto", "quanto", "Quantos", "quantos", "Calcule", "calcule", "Transforme", "transforme", "Converte", "converte"};
	}
	
	public class ComprimentoUnidades
	{
		public final static double[] relCompMetricaUnidades = {1000, 100, 10,  1.000, 0.1, 0.01, 0.001};
		public final static String[] unCompMetricaUnidades = {"quilómetro", "hectômetro", "decâmetro", "metro", "decimetro", "centímetro", "milimetro"};
	
		public final static double[] relCompInglesUnidades = {63360, 36, 12,  1.000, 0.001};
		public final static String[] unCompInglesUnidades = {"milha", "jarda", "pé", "polegada", "mil"};
		
		public final static double relationComprMetricIngles = (1000/1609.344); // 1000 metro tem 1000/1609.344 milhas
	}
	
	public class MassaUnidades
	{
		public final static double[] relMassaMetricaUnidades = {1000,  1.000, 0.001};
		public final static String[] unMassaMetricaUnidades = {"tonelada", "quilograma", "grama"};
	
		public final static double[] relMassaInglesUnidades = {2000, 1.000, 0.0625};
		public final static String[] unMassaInglesUnidades = {"ton", "libras", "onça"};
		
		public final static double relationMassaMetricIngles = (1000/453.592); // 1.000 kg tem 1000/453.592 libras
	}
	
	// Getters and Setters
	public void setPergunta(String pergunta)
	{
		this.pergunta = pergunta;
	}
	public String getPergunta()
	{
		return pergunta;
	}
	
	public String getResposta()
	{
		return resposta;
	}
	
	public String[] getFrasePergunta()
	{
		return frasePergunta;
	}
	

	
	public String getPrimeiraUnidade()
	{
		return primeiraUnidade;
	}
	
	//Constructor
	RespostaConversor(String pergunta)
	{
		this.pergunta = pergunta;
		this.frasePergunta = pergunta.split(" ");
		this.resposta = ProcessaPergunta(pergunta);
	}
	
	//metodos
	public String ProcessaPergunta(String pergunta)
	{
		String pronome = EncontraPronome(frasePergunta, PronomesPergunta.pronomes );
		if(pronome.length()==0)
		{
			return "Tem certeza que fez uma pergunta corretamente?";
		}
		else
		{
			ValorParaConverter(frasePergunta, pronome);
			PreencheUnidadesParaConverter(frasePergunta, pronome);
			System.out.println(primeiraUnidade);
			System.out.println(segundaUnidade);
		}
		return "";
	}
	
	private String EncontraPronome(String[] frasePergunta, String[] pronomes)
	{
		for(int i=0; i<frasePergunta.length; i++)
		{
			for(int j=0; j<pronomes.length; j++)
			{
				if(frasePergunta[i]==pronomes[j])
				{
					return frasePergunta[i];
				}
			}
		}
		return "";
	}
	
	private void PreencheUnidadesParaConverter(String[] frasePergunta, String pronome)
	{
		for(int i=0; i<frasePergunta.length; i++)
		{
			if(frasePergunta[i]==pronome)
			{
				for(int j=1; j<frasePergunta.length-i; j++)
				{
					if(Arrays.asList(ComprimentoUnidades.unCompMetricaUnidades).contains(frasePergunta[i+j]))
					{
						primeiraUnidade=frasePergunta[i+j];
					}else if(Arrays.asList(ComprimentoUnidades.unCompInglesUnidades).contains(frasePergunta[i+j]))
					{
						primeiraUnidade=frasePergunta[i+j];
					}else if(Arrays.asList(MassaUnidades.unMassaMetricaUnidades).contains(frasePergunta[i+j]))
					{
						primeiraUnidade=frasePergunta[i+j];
					}else if(Arrays.asList(MassaUnidades.unMassaInglesUnidades).contains(frasePergunta[i+j]))
					{
						primeiraUnidade=frasePergunta[i+j];
					}
					
					for(int k=1; k<frasePergunta.length-i-j; k++)
					{
						if(Arrays.asList(ComprimentoUnidades.unCompMetricaUnidades).contains(frasePergunta[i+j+k]))
						{
							segundaUnidade=frasePergunta[i+j];
						}else if(Arrays.asList(ComprimentoUnidades.unCompInglesUnidades).contains(frasePergunta[i+j+k]))
						{
							segundaUnidade=frasePergunta[i+j];
						}else if(Arrays.asList(MassaUnidades.unMassaMetricaUnidades).contains(frasePergunta[i+j+k]))
						{
							segundaUnidade=frasePergunta[i+j];
						}else if(Arrays.asList(MassaUnidades.unMassaInglesUnidades).contains(frasePergunta[i+j+k]))
						{
							segundaUnidade=frasePergunta[i+j];
						}
					}
					return;
				}
			}
			return;
		}
	}

	private void ValorParaConverter(String[] frasePergunta, String pronome)
	{
		for(int i=0; i<frasePergunta.length; i++)
		{
			if(frasePergunta[i].matches(".*\\d.*"))
			{
				valorNaoConvertido = Double.parseDouble(frasePergunta[i]);
			}
		}
	}
	
	
	
}


