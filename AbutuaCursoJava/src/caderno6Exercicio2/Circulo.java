package caderno6Exercicio2;
import java.lang.Math;

public class Circulo {
	private double raio;
	
	public double getRaio(){
		return this.raio;
	}
	public void setRaio(double R){
		this.raio = R;
	}
	
	public double getArea(){
		return Math.pow(this.raio, 2) * Math.PI;
	}
	public String toString(){
		return raio +" " + getArea();
	}
}
