/*
 * Cap. 1 - Exercício 1
Objetivo:
Construa uma aplicação em Java que receba 2 valores:
-1º o preço;
-2º a categoria (1-limpeza, 2-alimentação, 3- vestuário).
Calcule o valor do aumento, usando a tabela a seguir:
Preço Categoria Aumento
<= R$ 25,00
1 5%
2 8%
3 10%
> R$ 25,00
1 12%
2 15%
3 18%
Imprimir na ordem abaixo:
-1º o novo preço com o aumento;
-2º a classificação, de acordo com a tabela.
Novo Preço Classificação
<= R$ 50,00 BARATO
Entre R$ 50,00 e R$ 120,00 NORMAL
>= R$ 120,00 CARO
Passos:
Construa uma classe pública chamada Exercicio1
Essa classe possui o método main que deve receber na respectiva ordem:
1-O preço do produto;
2-A categoria (1-limpeza, 2-alimentação, 3- vestuário).
Faça os cálculos necessários utilizando as tabelas acima.
Imprima os resultados na seguinte ordem:
1-O novo preço do produto;
2-A classificação de acordo com a tabela, em letras maiúsculas.
Restrições:
Obedecer a ordem da entrada de dados.
Obedecer a ordem da saída de dados.
Utilizar um System.out.println para cada saida de dados.
Considere que o usuário vai digitar somente dados válidos.
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
		aux = JOptionPane.showInputDialog("Preço:");
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
