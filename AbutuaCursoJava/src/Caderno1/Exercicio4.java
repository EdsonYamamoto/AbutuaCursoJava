/*
 * Cap. 1 - Exercício 4
Objetivo:
Construa uma aplicação em Java que receba o valor do salário mínimo
e uma sequência de números contendo 1º a quantidade de quilowatts gasta
por consumidor e 2º o tipo de consumidor:
1-Residencial;
2-Comercial;
3-Industrial.
Calcule e mostre:
-O preço do quilowatt, considere o valor sendo igual a 1/8 do salário mínimo;
-O valor a ser pago por cada consumidor com base no imposto da tabela abaixo:
Tipo Imposto (%)
1 5
2 10
3 15
Sabendo-se que o valor a ser pago = (quantidade KW * preço KW) + (impostos).
-A quantidade de consumidores que pagam entre R$500,00 e R$ 1.000,00.
Finalize a aplicação quando a quantidade de quilowatts for igual a 0.
Passos:
Construa uma classe pública chamada Exercicio4.
Essa classe possui o método main que deve receber o valor do salário mínimo,
calcular e imprimir o valor do quilowatt.
Depois utilize o laço Do-While para receber os outros valores, calcular e imprimir
o total gasto de cada consumidor.
Quando o usuário digitar 0 para o valor do quilowatt saia do laço e
imprima a quantidade de consumidores que pagam entre R$500,00 e R$1.000,00.
Restrições:
Imprimir cada resultado utilizando System.out.println();
 */

package Caderno1;

import javax.swing.JOptionPane;


public class Exercicio4 {

	public static void main(String args[]) {
		String aux;
		double valor, consumo, salario, imposto=0, fatorCustoKW, gastoTotal;
		int tipo, faixa=0;
		fatorCustoKW = (double) 1/8;
		
		aux = JOptionPane.showInputDialog("salario minimo: ");
		salario = Double.parseDouble(aux);
		valor = fatorCustoKW * salario;
		System.out.println(valor);
		do {
			
			aux = JOptionPane.showInputDialog("kilo watts: ");
			consumo = Double.parseDouble(aux);
			if(consumo>0)
			{	
				aux = JOptionPane.showInputDialog("Tipo consumidor: ");
				tipo = Integer.parseInt(aux);
				if(tipo==1)
					imposto = (double)5.0;
				else if(tipo==2)
					imposto = (double)10.0;
				else if(tipo==3)
					imposto = (double)15.0;
				gastoTotal = consumo * valor*(imposto/100 + 1);
				System.out.println(gastoTotal);
				if (gastoTotal>=500&&gastoTotal<=1000)
					faixa++;
			}
		} while (consumo != 0);
		//System.out.println("Qtd de consumidores: "+faixa);
		System.out.println(faixa);
	}
}
