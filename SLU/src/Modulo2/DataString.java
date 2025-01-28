package Modulo2;

import java.util.Arrays;

public class DataString {

	// atributo
		private String dia;
		public String[] diasValidos = {"seg", "ter", "qua", "qui", "sex", "sab"};
		private String mes;
		public String[] mesesValidos = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"};
		private String ano;
		public char[] anosDigitosValidos = {'1','2','3','4','5','6','7','8','9','0'};
		
		// setters and getters
		public void setDia(String dia)
		{
			if(ValidaDia(dia))
			{
				this.dia = dia;
			}
		}
		
		public String getDia()
		{
			return dia;
		}
		
		public void setMes(String mes)
		{
			if(ValidaMes(mes))
			{
				this.mes = mes;
			}
		}
		
		public String getMes()
		{
			return mes;
		}

		
		public void setAno(String ano)
		{
			if(ValidaMes(mes))
			{
				this.ano = ano;
			}			
		}
		
		public String getAno()
		{
			return ano;
		}
		
		public DataString()
		{
			
		}
		// construtor
	    public DataString(String mes, String dia, String ano) {
	        this.dia = dia;
	        this.mes = mes;
	        this.ano = ano;
	    }
		
		protected boolean ValidaDia(String dia) {
			for (String diaArray : diasValidos)
			{
				if(diaArray.contains(dia.toLowerCase()))
				{
					System.out.println("Valor para dia não encontrado!");
					return true;
				}
			}
			return false;
		}
		
		protected boolean ValidaMes(String mes) {
			for (String mesArray : mesesValidos)
			{
				if(mesArray.contains(mes.toLowerCase()))
				{
					System.out.println("Valor para mês não encontrado!");
					return true;
				}
			}
			return false;
		}
		
		protected boolean ValidaAno(String ano) {
			
		    if (ano.length() != 4) {
		    	System.out.println("Ano só recebe pode receber 4 numeros.");
		        return false;
		    }
		    
		    for (int i = 0; i < ano.length(); i++) {
		        if (!Character.isDigit(ano.charAt(i))) {
		        	System.out.println("Ano só recebe pode receber valores numéricos");
		            return false; //
		        }
		    }
		    
		    return true;
		}

		@Override
		public String toString() {
			return "Data [dia=" + dia + ", diasValidos=" + Arrays.toString(diasValidos) + ", mes=" + mes
					+ ", mesesValidos=" + Arrays.toString(mesesValidos) + ", ano=" + ano + ", anosDigitosValidos="
					+ Arrays.toString(anosDigitosValidos) + ", getDia()=" + getDia() + ", getMes()=" + getMes()
					+ ", getAno()=" + getAno() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}
		
		public void ShowDated(String dia, String mes, String ano)
		{
			System.out.println("Hoje é " + dia +" do mês " + mes + " do ano" + ano);
		}

}
