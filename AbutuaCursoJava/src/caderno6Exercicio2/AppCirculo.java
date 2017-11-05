package caderno6Exercicio2;

import javax.swing.JOptionPane;

public class AppCirculo {
	public static void main(String[] args)
	{
		String aux=null;
		int qtd=3;
		Circulo c[] = new Circulo[qtd];
		for (int i = 0; i < qtd; i++) 
		{
		    c[i] = new Circulo();
		    aux = JOptionPane.showInputDialog("Raio:");
    		c[i].setRaio(Double.parseDouble(aux));
		}
		for (int i = 0; i < qtd; i++) {
			System.out.println(c[i]);
		}
	}
}