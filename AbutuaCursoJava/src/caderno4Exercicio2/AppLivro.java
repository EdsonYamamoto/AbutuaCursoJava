package caderno4Exercicio2;

import javax.swing.JOptionPane;

public class AppLivro {
	
	public static void main(String[] args)
	{
		String aux;
		int qtdInteresse=0, codigo, qtd=3;
		Livro[] livro;
		livro = new Livro[qtd];
		for (int i = 0; i < livro.length; i++) 
		{
			livro[i] = new Livro();
			
			aux = JOptionPane.showInputDialog("codigo");
			livro[i].codigo = Integer.parseInt(aux);
			
			aux = JOptionPane.showInputDialog("titulo");
			livro[i].titulo= aux;
			
			aux = JOptionPane.showInputDialog("autor");
			livro[i].autor = aux;

			aux = JOptionPane.showInputDialog("editora");
			livro[i].editora = aux;
			
			aux = JOptionPane.showInputDialog("valor");
			livro[i].valor = Double.parseDouble(aux);
		}
		
		aux = JOptionPane.showInputDialog("quantidade de interessados");
		qtdInteresse = Integer.parseInt(aux);
		for (int i = 0; i < qtdInteresse; i++) {
			aux = JOptionPane.showInputDialog("codigo");
			codigo = Integer.parseInt(aux);
			for (int j = 0; j < livro.length; j++) 
				if (codigo==livro[j].codigo) 
					livro[j].novoInteressado();
		}
		for (int i = 0; i < livro.length; i++) 
			System.out.println(livro[i]);
		
		for (int i = 0; i < livro.length; i++) 
			livro[i].imprimirDadosLivro();
	}
}

