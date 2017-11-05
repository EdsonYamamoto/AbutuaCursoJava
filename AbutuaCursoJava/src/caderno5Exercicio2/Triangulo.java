package caderno5Exercicio2;

public class Triangulo {
	double base;
	double altura;
	public double getArea()
	{
		double area;
		area=(this.base*this.altura)/2;
		return area;
	}
	public String dadosTriangulo()
	{
		return base + " " + altura + " " + getArea(); 
	}
}
