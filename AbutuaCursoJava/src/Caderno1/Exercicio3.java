/*
 * Cap. 1 - Exercício 3
Objetivo:
Construa uma aplicação em Java que recebe uma quantidade
indeterminada de números inteiros e conte quantos deles
estão nos seguintes intervalos:
[1-25], [26-50], [51-75] e [76-100].
A entrada de dados deverá terminar quando for lido o número 0.
Passos:
Construa uma classe pública chamada Exercicio3.
Essa classe possui o método main que deve receber números inteiros
até que o número 0 seja digitado.
Some os números de acordo com os intervalos.
Ao final imprima a quantidade de números de cada intervalo
obedecendo a ordem dada.
Restrições:
Imprimir cada um dos 4 resultados utilizando 1 System.out.println();
 */
package Caderno1;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String args[]) {
		
		int cond1=0, cond2=0, cond3=0, cond4=0;
		String aux;
		
		do {
			aux = JOptionPane.showInputDialog("Digite numero:");
			if (Integer.parseInt(aux)>0&&Integer.parseInt(aux)<=25) 
				cond1++;
			else if (Integer.parseInt(aux)>25&&Integer.parseInt(aux)<=50) 
				cond2++;
			else if (Integer.parseInt(aux)>50&&Integer.parseInt(aux)<=75) 
				cond3++;
			else if (Integer.parseInt(aux)>75&&Integer.parseInt(aux)<=100) 
				cond4++;
		} while (Integer.parseInt(aux)!=0);
		//System.out.println("[1-25] = "+cond1);
		//System.out.println("[26-50] = "+cond2);
		//System.out.println("[51-75] = "+cond3);
		//System.out.println("[76-100] = "+cond4);
		System.out.println(cond1);
		System.out.println(cond2);
		System.out.println(cond3);
		System.out.println(cond4);

	}

}
