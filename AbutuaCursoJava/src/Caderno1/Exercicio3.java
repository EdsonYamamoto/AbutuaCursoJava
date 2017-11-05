/*
 * Cap. 1 - Exerc�cio 3
Objetivo:
Construa uma aplica��o em Java que recebe uma quantidade
indeterminada de n�meros inteiros e conte quantos deles
est�o nos seguintes intervalos:
[1-25], [26-50], [51-75] e [76-100].
A entrada de dados dever� terminar quando for lido o n�mero 0.
Passos:
Construa uma classe p�blica chamada Exercicio3.
Essa classe possui o m�todo main que deve receber n�meros inteiros
at� que o n�mero 0 seja digitado.
Some os n�meros de acordo com os intervalos.
Ao final imprima a quantidade de n�meros de cada intervalo
obedecendo a ordem dada.
Restri��es:
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
