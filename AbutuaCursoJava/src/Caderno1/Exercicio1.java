/*
 * Cap. 1 - Exerc�cio 1
Objetivo:
Construa uma aplica��o em Java que receba 2 valores:
-1� o pre�o;
-2� a categoria (1-limpeza, 2-alimenta��o, 3- vestu�rio).
Calcule o valor do aumento, usando a tabela a seguir:
Pre�o Categoria Aumento
<= R$ 25,00
1 5%
2 8%
3 10%
> R$ 25,00
1 12%
2 15%
3 18%
Imprimir na ordem abaixo:
-1� o novo pre�o com o aumento;
-2� a classifica��o, de acordo com a tabela.
Novo Pre�o Classifica��o
<= R$ 50,00 BARATO
Entre R$ 50,00 e R$ 120,00 NORMAL
>= R$ 120,00 CARO
Passos:
Construa uma classe p�blica chamada Exercicio1
Essa classe possui o m�todo main que deve receber na respectiva ordem:
1-O pre�o do produto;
2-A categoria (1-limpeza, 2-alimenta��o, 3- vestu�rio).
Fa�a os c�lculos necess�rios utilizando as tabelas acima.
Imprima os resultados na seguinte ordem:
1-O novo pre�o do produto;
2-A classifica��o de acordo com a tabela, em letras mai�sculas.
Restri��es:
Obedecer a ordem da entrada de dados.
Obedecer a ordem da sa�da de dados.
Utilizar um System.out.println para cada saida de dados.
Considere que o usu�rio vai digitar somente dados v�lidos.
 * 
 */

package Caderno1;

import javax.swing.JOptionPane;

public class Exercicio1 
{

	public static void main(String args[]) {
		int B;
		double A, precoInicial = 25.00, barato=50.00, caro = 120.00;
		String aux;
		aux = JOptionPane.showInputDialog("Pre�o:");
		A = Double.parseDouble(aux);
		aux = JOptionPane.showInputDialog("Categoria:");
		B = Integer.parseInt(aux);
		
		if (A<=precoInicial) {
			if (B==1) 
				A *= 1.05;
			if (B==2)
				A *= 1.08;
			if (B==3)
				A *= 1.1;
		}
		
		else
		{
			if (B==1) 
				A *= 1.12;
			if (B==2)
				A *= 1.15;
			if (B==3)
				A *= 1.18;
		}
		System.out.println(A);
		if (A<=barato) 
			System.out.println("BARATO");
		else if (A>barato&&A<=caro) 
			System.out.println("NORMAL");
		else
			System.out.println("CARO");
			
	}

}
