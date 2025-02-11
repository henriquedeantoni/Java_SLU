package Modulo4;

public class Morse {
	private String[] codigoMorse;
	
	private String mensagemDecodificada;
	
	public final static String[] morse = {
            ".-",    // A
            "-...",  // B
            "-.-.",  // C
            "-..",   // D
            ".",     // E
            "..-.",  // F
            "--.",   // G
            "....",  // H
            "..",    // I
            ".---",  // J
            "-.-",   // K
            ".-..",  // L
            "--",    // M
            "-.",    // N
            "---",   // O
            ".--.",  // P
            "--.-",  // Q
            ".-.",   // R
            "...",   // S
            "-",     // T
            "..-",   // U
            "...-",  // V
            ".--",   // W
            "-..-",  // X
            "-.--",  // Y
            "--..",  // Z
            "-----", // 0
            ".----", // 1
            "..---", // 2
            "...--", // 3
            "....-", // 4
            ".....", // 5
            "-....", // 6
            "--...", // 7
            "---..", // 8
            "----."  // 9
        };
	
	public final static String[] dicionario = 
	{
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
	};
	
	
	public void setMensagemDecodificada(String mensagemDecodificada)
	{
		this.mensagemDecodificada = mensagemDecodificada;
	}
	
	public String getMensagemDecodificada()
	{
		return mensagemDecodificada;
	}

	public void setCodigoMorse(String[] codigoMorse)
	{
		this.codigoMorse = codigoMorse;
	}
	
	public String[] getCodigoMorse()
	{
		return codigoMorse;
	}
	
	public Morse()
	{
		
	}
	
	public String TraduzMorse(String[] codigoMorse, String[] morse, String[] dicionario)
	{
		String mensagemTraduzida="";
		
		for(int i=0; i<codigoMorse.length; i++)
		{
			for(int j=0; j<morse.length; j++)
			{
				if(codigoMorse[i] == morse[j])
				{
					mensagemTraduzida+=dicionario[j];
				}
			}
		}
		
		return mensagemTraduzida;
	}
	
	public String[] CodificaMorse(String mensagemDecodificada, String[] morse, String[] dicionario)
	{
		String[] mensagemCodificada = new String[mensagemDecodificada.length()];
		
		for( int i=0; i<mensagemDecodificada.length(); i++)  
		{
			for(String letraDic : dicionario)
			{
				if(letraDic.charAt(0) == Character.toUpperCase(mensagemDecodificada.charAt(i)))
				{
					mensagemCodificada[i] = morse[i];
				}
			}
		}
		
		return mensagemCodificada;
	}
	
	public void ImprimeCodigoMorse(String[] codigoMorse)
	{
		System.out.println("Mensagem Codificada: ");
		for(String codigos : codigoMorse)
		{
			System.out.print(codigos);
		}
	}
	
	public void ImprimeMensagem(String mensagem)
	{
		System.out.println("Mensagem decodificada: ");
		System.out.println(mensagem);
	}
	
}
