/*
 * Cap. 1 - Exerc�cio 2
Objetivo:
Construa uma aplica��o em Java que recebe e soma v�rios n�meros inteiros.
Quando receber o n�mero 0 imprima o resultado e encerre a aplica��o.
Passos:
Construa uma classe p�blica chamada Exercicio2.
Essa classe possui o m�todo main que deve receber n�meros inteiros
at� que o n�mero 0 seja recebido.
Imprima o resultado da soma e encerre a aplica��o.
Restri��es:
Imprimir somente o resultado.
 */

package Caderno1;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String args[]) {
		int soma = 0;
		String aux;
		do{
			aux = JOptionPane.showInputDialog("Digite o valor:");
			soma += Integer.parseInt(aux);
		}while (Integer.parseInt(aux)!=0);
		System.out.println(soma);
	}

}
