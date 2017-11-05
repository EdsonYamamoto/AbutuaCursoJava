package caderno5Exercicio1;

import javax.swing.JOptionPane;

public class AppRetangulo {
	public static void main(String args[])
	{
		String aux;
		Retangulo ret = new Retangulo();
		
		aux = JOptionPane.showInputDialog("Lado1:");
		ret.lado1 = Double.parseDouble(aux);
		aux = JOptionPane.showInputDialog("Lado2:");
		ret.lado2 = Double.parseDouble(aux);
		
		System.out.println(ret);
		System.out.println(ret.getPerimetro());
		System.out.println(ret.getArea());
	}
}
