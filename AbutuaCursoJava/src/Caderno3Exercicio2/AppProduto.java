package Caderno3Exercicio2;

import javax.swing.JOptionPane;

public class AppProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total;
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		Produto p3 = new Produto();
		
		String aux;
		aux = JOptionPane.showInputDialog("Descrição");
		p1.descricao = aux;
		aux = JOptionPane.showInputDialog("Valor");
		p1.valor = Double.parseDouble(aux);
		aux = JOptionPane.showInputDialog("Descrição");
		p2.descricao = aux;
		aux = JOptionPane.showInputDialog("Valor");
		p2.valor = Double.parseDouble(aux);
		aux = JOptionPane.showInputDialog("Descrição");
		p3.descricao = aux;
		aux = JOptionPane.showInputDialog("Valor");
		p3.valor = Double.parseDouble(aux);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		total = p1.valor+p2.valor+p3.valor;
		System.out.println(total);
	}

}
