package caderno5Exercicio2;

import javax.swing.JOptionPane;

public class AppTriangulo {
	public static void main(String[] args)
	{
		String aux;
		Triangulo t = new Triangulo();
		
		aux = JOptionPane.showInputDialog("base");
		t.base = Double.parseDouble(aux);
		aux = JOptionPane.showInputDialog("altura");
		t.altura = Double.parseDouble(aux);
		System.out.println(t);
		System.out.println(t.dadosTriangulo());
	}
}
