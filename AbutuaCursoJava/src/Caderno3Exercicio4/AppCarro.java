package Caderno3Exercicio4;

import javax.swing.JOptionPane;

public class AppCarro {
	public static void main(String args[])
	{
		Carro car = new Carro();
		String aux;
		double vel;
		double tolerancia=1.1;
		
		aux = JOptionPane.showInputDialog("Velocidade:");
		car.velocidade = Double.parseDouble(aux);
		aux = JOptionPane.showInputDialog("Via:");
		vel = Double.parseDouble(aux);
		vel *= tolerancia;
		System.out.println(car);
		if(vel<car.velocidade)
			car.quantidadeMultas++;
		System.out.println(car.quantidadeMultas);
		
	}
}
