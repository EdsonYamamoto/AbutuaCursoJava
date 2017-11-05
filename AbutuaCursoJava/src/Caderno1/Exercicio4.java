/*
 * Cap. 1 - Exerc�cio 4
Objetivo:
Construa uma aplica��o em Java que receba o valor do sal�rio m�nimo
e uma sequ�ncia de n�meros contendo 1� a quantidade de quilowatts gasta
por consumidor e 2� o tipo de consumidor:
1-Residencial;
2-Comercial;
3-Industrial.
Calcule e mostre:
-O pre�o do quilowatt, considere o valor sendo igual a 1/8 do sal�rio m�nimo;
-O valor a ser pago por cada consumidor com base no imposto da tabela abaixo:
Tipo Imposto (%)
1 5
2 10
3 15
Sabendo-se que o valor a ser pago = (quantidade KW * pre�o KW) + (impostos).
-A quantidade de consumidores que pagam entre R$500,00 e R$ 1.000,00.
Finalize a aplica��o quando a quantidade de quilowatts for igual a 0.
Passos:
Construa uma classe p�blica chamada Exercicio4.
Essa classe possui o m�todo main que deve receber o valor do sal�rio m�nimo,
calcular e imprimir o valor do quilowatt.
Depois utilize o la�o Do-While para receber os outros valores, calcular e imprimir
o total gasto de cada consumidor.
Quando o usu�rio digitar 0 para o valor do quilowatt saia do la�o e
imprima a quantidade de consumidores que pagam entre R$500,00 e R$1.000,00.
Restri��es:
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
