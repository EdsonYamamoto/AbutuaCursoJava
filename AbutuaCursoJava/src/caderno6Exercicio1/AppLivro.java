package caderno6Exercicio1;

import javax.swing.JOptionPane;

public class AppLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qtd=2;
		Livro liv[];
		liv = new Livro[qtd];
		double valor;
		for (int i = 0; i < qtd; i++) 
		{
			liv[i] = new Livro();
			String aux;
			aux=JOptionPane.showInputDialog("Codigo");
			liv[i].setCodigo(Integer.parseInt(aux));
			aux=JOptionPane.showInputDialog("Autor");
			liv[i].setAutor(aux);
			aux=JOptionPane.showInputDialog("Titulo");
			liv[i].setTitulo(aux);
			aux=JOptionPane.showInputDialog("Valor");
			liv[i].setValor(Double.parseDouble(aux));
			System.out.println(liv[i].getCodigo());
		}
		valor = liv[0].getValor();
		for (int i = 1; i < liv.length; i++) {
			if(valor<liv[i].getValor())
				valor = liv[i].getValor();
		}
		for (int i = 0; i < liv.length; i++)
			if(valor == liv[i].getValor())
				System.out.println(liv[i]);
	}
}