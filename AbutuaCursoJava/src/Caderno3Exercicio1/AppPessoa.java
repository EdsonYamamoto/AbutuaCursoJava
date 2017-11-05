package Caderno3Exercicio1;

import javax.swing.JOptionPane;

public class AppPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner(System.in);
		String aux;
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		aux = JOptionPane.showInputDialog("Nome");
		p1.nome = aux;
		aux = JOptionPane.showInputDialog("Altura");
		p1.altura = Double.parseDouble(aux);

		aux = JOptionPane.showInputDialog("Nome:");
		p2.nome = aux;
		aux = JOptionPane.showInputDialog("Altura:");
		p2.altura = Double.parseDouble(aux);

		if (p1.altura>p2.altura) 
			System.out.println(p1);
		
		else if(p1.altura == p2.altura)
			System.out.println("MESMA ALTURA");
		else
			System.out.println(p2);
	}

}
