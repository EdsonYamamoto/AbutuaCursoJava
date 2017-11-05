package Caderno3Exercicio3;

import javax.swing.JOptionPane;

public class AppTesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aux;
		Aluno a1 = new Aluno();

		int qtdProvas=3;
		double prova[];
		a1.mediaFinal=0;
		
		aux = JOptionPane.showInputDialog("Nome");
		a1.nome = aux;
		
		prova = new double[qtdProvas];
		for (int i = 0; i < qtdProvas; i++)
		{
			aux = JOptionPane.showInputDialog("Nota "+i+1);
			prova[i] = Double.parseDouble(aux);
		}
		
		for (int i = 0; i < qtdProvas; i++)	
			a1.mediaFinal += prova[i];
		
		a1.mediaFinal /= qtdProvas;
		if (a1.mediaFinal >=7) 
			a1.situacao="Aprovado";
		else
			a1.situacao="Reprovado";
		System.out.println(a1);
		System.out.println(a1.situacao);
	}

}
