package trabalho;

public class Adrianne {
	public static void main(String[] args) {
		System.out.println("Quest�o 1");
		
		double pi = 3.14159;
		double raio = 64;
		double areaCirculo = pi * (raio * raio);
		
		System.out.println("�rea do C�rculo = " + areaCirculo);
		System.out.println();
		
		
		System.out.println("Quest�o 2");
		
		double A = 20;
		double B = 30;
		double C = 50;
		double Triangulo = (A * C)/2;
		double Circulo2 = pi * (C * C);
		double Trapezio1 = (A + B) * C;
		double Trapezio2 = Trapezio1 / 2;
		double Quadrado = B * B;
		double Retangulo = A * B;
		
		System.out.println("�rea do Tri�ngulo = " + Triangulo);
		System.out.println("�rea do C�rculo = " + Circulo2);
		System.out.println("�rea do Trap�zio = " + Trapezio2);
		System.out.println("�rea do Quadrado = " + Quadrado);
		System.out.println("�rea do Retangulo = " + Retangulo);
		System.out.println();
		
		
		System.out.println("Quest�o 3");
		
		double a = 3;
		double b = -15;
		double c = 12;
		double delta = Math.pow(b, 2.0) - 4 * a * c;
		double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		
    }
	
}
