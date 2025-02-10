package Modulo4;

public class Morse {
	private String[] mensagemMorse;
	
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
	
	public void setMensagemDecodificada(String mensagemDecodificada)
	{
		this.mensagemDecodificada = mensagemDecodificada;
	}
	
	public String getMensagemDecodificada()
	{
		return mensagemDecodificada;
	}

	public void setMensagemMorse(String[] mensagemMorse)
	{
		this.mensagemMorse = mensagemMorse;
	}
	
	public String[] getMensagemMorse()
	{
		return mensagemMorse;
	}
	
	public Morse() {}
	
	
}
