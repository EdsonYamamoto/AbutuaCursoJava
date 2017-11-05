/*
 * Cap. 1 - Exercício 2
Objetivo:
Construa uma aplicação em Java que recebe e soma vários números inteiros.
Quando receber o número 0 imprima o resultado e encerre a aplicação.
Passos:
Construa uma classe pública chamada Exercicio2.
Essa classe possui o método main que deve receber números inteiros
até que o número 0 seja recebido.
Imprima o resultado da soma e encerre a aplicação.
Restrições:
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
