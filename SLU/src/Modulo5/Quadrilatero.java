package Modulo5;

public class Quadrilatero {
	protected Pontos p1, p2, p3, p4;
	
	public Quadrilatero(Pontos p1, Pontos p2, Pontos p3, Pontos p4) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}
	
	public void plotarPontos()
	{
		System.out.println("Pontos: (" + p1.getPontoX() + ","  + p1.getPontoY() + "),(" + p2.getPontoX() + ","  + p2.getPontoY() 
		+ "),(" + p3.getPontoX() + ","  + p3.getPontoY() + "),(" + p4.getPontoX() + ","  + p4.getPontoY() + ")");
	}
	
	public double CalculeArea()
	{
		return 0.5*Math.abs(p1.getPontoX()*p2.getPontoY()+p2.getPontoX()*p3.getPontoY()+p4.getPontoX()*p1.getPontoY()
				-p1.getPontoY()*p2.getPontoX()-p2.getPontoY()*p3.getPontoX()-p3.getPontoY()*p4.getPontoX()-p4.getPontoY()*p1.getPontoX());
	}
}
