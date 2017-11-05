package caderno4Exercicio1;

import javax.swing.JOptionPane;

public class AppCasa {

	public static void main(String args[])
	{
		Casa c = new Casa();
		String aux;
		
		aux = JOptionPane.showInputDialog("Numero");
		c.numero = Integer.parseInt(aux);
		aux = JOptionPane.showInputDialog("Cor");
		c.cor = aux;

		aux = JOptionPane.showInputDialog("Deseja abrir porta 'S' ou 'N'");
		if(aux.equals("S"))
			c.abrirPorta();
		aux = JOptionPane.showInputDialog("Deseja abrir janela 'S' ou 'N'");
		if(aux.equals("S"))
			c.abrirJanela();

		System.out.println(c);
		c.imprimirDadosCasa();
		/*
		System.out.println(c.numero);
		System.out.println(c.cor);
		System.out.println(c.estadoPorta);
		System.out.println(c.estadoJanela);
		*/
	}
}
