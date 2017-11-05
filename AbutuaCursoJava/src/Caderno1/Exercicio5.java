package Caderno1;

import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main(String[] args){
		int anoInicial=2000, anoFinal=2008;
		double salarioInicial, aumento=0, taxaAumento=0.01;
		String aux;
		aux = JOptionPane.showInputDialog("Digite valor");
		salarioInicial = Double.parseDouble(aux);
		aumento = salarioInicial;
		for (int i = anoInicial; i < anoFinal; i++) {

			aumento *= (1+taxaAumento);
			taxaAumento *= 2;
		}
		System.out.println(aumento);
	}
}
