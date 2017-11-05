package Caderno3Exercicio5;

import javax.swing.JOptionPane;

public class AppFuncionario {
	public static void main(String args[])
	{
		Funcionario f = new Funcionario();
		String aux;
		double aumentoDependente=66.00, aumento, percentual, dependentes, total;
		
		aux = JOptionPane.showInputDialog("Nome");
		f.nome = aux;
		aux = JOptionPane.showInputDialog("Qtd dependentes");
		f.dependentes = Integer.parseInt(aux);
		aux = JOptionPane.showInputDialog("Salario");
		f.salario = Double.parseDouble(aux);
		System.out.println(f);
		System.out.println(f.salario);
		if(f.salario<1000)
			percentual=0.1;
		
		else
			percentual=0.05;
		
		aumento = f.salario * percentual;
		
		percentual *= 100;
		
		dependentes = aumentoDependente * f.dependentes;
		
		/*
		System.out.println("Salário atual: R$ "+f.salario);
		System.out.println("Quantidade de Dependentes: "+f.dependentes+".");
		System.out.println("Valor do aumento: "+percentual+"% = R$ "+aumento);
		System.out.println("Acrescimo por dependente: R$ "+dependentes);
		total = f.salario+aumento+dependentes;
		System.out.println("Novo salário = "+f.salario+" + "+ aumento +" + "+ dependentes +" = R$ "+total);
		*/
		total = f.salario+aumento+dependentes;
		f.salario = total;
		System.out.println(f);
		System.out.println(f.salario);
	}
}
