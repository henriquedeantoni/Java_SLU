package Module6;

public class RetriggerException {
	public static void unMethod2() throws Exception {
		throw new Exception("Exceção lançada em unMethod2");
	}
	
	public static void unMethod() throws Exception{
		try
		{
			unMethod2();
		}
		catch(Exception ex)
		{
			System.out.println("Exceção capturada em unMehotd e relançada...");
			throw ex;
		}
	}
}
