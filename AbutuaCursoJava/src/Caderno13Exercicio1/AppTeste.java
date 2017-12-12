package Caderno13Exercicio1;

import javax.swing.JOptionPane;

public class AppTeste {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente(1);
		System.out.println(c1);
		c1.setNomeCliente(JOptionPane.showInputDialog("nome"));
		
		Pedido p1 = new Pedido(1);
		System.out.println(p1);
		
	}

}
