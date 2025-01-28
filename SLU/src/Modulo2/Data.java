package Modulo2;

public class Data {

	// atributo
		private String dia;
		private String mes;
		private String ano;
		
		// setters and getters
		public void setDia(String dia)
		{
			this.dia = dia;
		}
		
		public String getDia()
		{
			return dia;
		}
		
		public void setMes(String mes)
		{
			this.mes = mes;
		}
		
		public String getMes()
		{
			return mes;
		}

		
		public void setAno(String ano)
		{
			this.ano = ano;
		}
		
		public String getAno()
		{
			return ano;
		}
		
		
		// construtor
	    public Data(String mes, String dia, String ano) {
	        this.mes = mes;
	        this.dia = dia;
	        this.ano = ano;
	    }
		
		public enum Dia{
			DOMINGO("Dom"),
		    SEGUNDA("Seg"),
		    TERÇA("Ter"),
		    QUARTA("Qua"),
		    QUINTA("Qui"),
		    SEXTA("Sex"),
		    SÁBADO("Sab");

			private final String nome;
			
			Dia(String nome) {
				this nome = nome;
			};
			
			public String getNome() {
		        return nome;
		    }
		}

}
