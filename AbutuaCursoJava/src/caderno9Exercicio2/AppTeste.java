package caderno9Exercicio2;

import javax.swing.JOptionPane;

public class AppTeste {
	public static void main(String args[])
	{
		String aux;
		int qtd = 5;
		//ArrayList<Produto> prod = new ArrayList<Produto>();
		Produto prod[] = new Produto[qtd];
		
		for(int i=0;i<prod.length;i++)
			prod[i] = new Produto();
		
		for (Produto p : prod) {
			aux = JOptionPane.showInputDialog("Nome");
			p.setNome(aux);
			aux = JOptionPane.showInputDialog("Preco");
			p.setPreco(Float.parseFloat(aux));
			aux = JOptionPane.showInputDialog("Qtd");
			p.setQuantidade(Integer.parseInt(aux));
		}
		double maior=0;
		for (Produto p : prod)
			if(maior<p.getValorEstoque())
				maior = p.getValorEstoque();
		
		for (Produto p : prod)
			if(maior==p.getValorEstoque())
				System.out.println(p);
			
		for (Produto p : prod)
			System.out.println(p);
			
	}
}
