package Modulo5;

public class Quadrilatero_exercicio5 {

	public static void main(String[] args) {
		
		//pontos do paralelogramo
		Pontos p1 = new Pontos(0,0);
		Pontos p2 = new Pontos(2,2);
		Pontos p3 = new Pontos(8,2);
		Pontos p4 = new Pontos(6,6);

		Paralelogramo paralelogramo = new Paralelogramo(p1,p2,p3,p4);
		System.out.println(paralelogramo.CalculeArea());
		
		//pontos do Retangulo
		Pontos p5 = new Pontos(0,0);
		Pontos p6 = new Pontos(0,5);
		Pontos p7 = new Pontos(8,2);
		Pontos p8 = new Pontos(15,0);

		Retangulo retangulo = new Retangulo(p5,p6,p7,p8);
		System.out.println(retangulo.CalculeArea());
		
		//pontos do Trapezio
		Pontos p9 = new Pontos(0,0);
		Pontos p10 = new Pontos(2,4);
		Pontos p11 = new Pontos(8,4);
		Pontos p12 = new Pontos(10,0);
		
		Trapezio trapezio = new Trapezio(p9, p10, p11, p12);
		System.out.println(trapezio.CalculeArea());
		
		//pontos do Quadrado
		Pontos p13 = new Pontos(0,0);
		Pontos p14 = new Pontos(0,5);
		Pontos p15 = new Pontos(5,5);
		Pontos p16 = new Pontos(5,0);
				
		Quadrado quadrado = new Quadrado(p13, p14, p15, p16);
		System.out.println(quadrado.CalculeArea());
	}

}
