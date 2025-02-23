package Module6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecodeNumber {
	private List<String> numberFormated;
	private int numberSize;
	private final List<Character> digitsPermitted = Arrays.asList('2', '3', '4', '5', '6', '7', '8', '9');
	private final char[][] letterCorrespondent = {{'A','B','C'},{'A','B','C'}};
	
	
	public void setNumberFormated(List<String> numberFormated)
	{
		this.numberFormated = numberFormated;
	}
	
	public DecodeNumber(List<String> numberFormated)
	{
		this.numberFormated = numberFormated;
	}
	

}
