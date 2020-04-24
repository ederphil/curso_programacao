package entities;

public class Retangulo {

	public double largura;
	public double altura;

	public double area() {
		return altura * largura;

	}

	public double perimetro() {
		return (altura + largura) * 2;

	}

	public double diagonal() {
		return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));

	}

}
