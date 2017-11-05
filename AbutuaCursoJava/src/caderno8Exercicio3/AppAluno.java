package caderno8Exercicio3;

import javax.swing.JOptionPane;

public class AppAluno {
	private Aluno aluno=null;
	public static void main(String[] args)
	{
		AppAluno appAluno = new AppAluno();
		appAluno.menu();
	}
	
	public void menu()
	{
		String aux;
		int m=0;
		aux = JOptionPane.showInputDialog("m:");
		m = Integer.parseInt(aux);
		while(m!=0)
		{
			switch(m){
			case 1:
				receberDadosAluno();
				break;
				
			case 2:
				if(aluno!=null)
					receberTrabalhos();
				
				else
					System.out.println("Opção inválida!");
				break;
				
			case 3:
				if(aluno!=null)
					receberProvas();
				else
					System.out.println("Opção inválida!");
				break;
				
			case 4:
				if(aluno!=null)
					imprimirMediaFinal();
				else
					System.out.println("Opção inválida!");
				break;
				
			case 5:
				if(aluno!=null)
					imprimirResultadoFinal();
				else
					System.out.println("Opção inválida!");
				break;
				
			case 6:
				if(aluno!=null)
					imprimirAluno();
				
				else
					System.out.println("null");
				break;
			}
		}
		return;
	}
	public void receberDadosAluno()
	{
		String aux;
		aluno = new Aluno();
		aux = JOptionPane.showInputDialog("Matricula");
		aluno.setMatricula(Integer.parseInt(aux));
		aux = JOptionPane.showInputDialog("Nome");
		aluno.setNome(aux);
	}
	public void receberTrabalhos()
	{
		String aux;
		aux =JOptionPane.showInputDialog("Trabalho1");
		aluno.setNotaTrabalho1(Double.parseDouble(aux));
		aux =JOptionPane.showInputDialog("Trabalho2");
		aluno.setNotaTrabalho2(Double.parseDouble(aux));
	}
	public void receberProvas()
	{
		String aux;
		aux =JOptionPane.showInputDialog("Prova1");
		aluno.setNotaProva1(Double.parseDouble(aux));
		aux =JOptionPane.showInputDialog("Prova2");
		aluno.setNotaProva2(Double.parseDouble(aux));
	}
	public void imprimirMediaFinal()
	{
		System.out.println(aluno.getMediaFinal());
	}
	public void imprimirResultadoFinal()
	{
		System.out.println(aluno.getResultadoFinal());
	}
	public void imprimirAluno()
	{
		System.out.println(aluno);
	}
}
