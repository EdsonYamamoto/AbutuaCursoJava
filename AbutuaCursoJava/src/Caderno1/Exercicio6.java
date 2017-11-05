/*
 * www.abutua.com 11
Cap. 1 - Exerc�cio 6
Objetivo:
Uma empresa contratou 5 funcion�rios tempor�rios.
De acordo com o valor das vendas mensais, os funcion�rios adquirem pontos que determinar�o seus
sal�rios ao final de cada m�s.
Sabe-se que esses funcion�rios trabalhar�o nos meses de novembro a janeiro do ano seguinte.
Construa uma aplica��o em Java que:
1) Leia as pontua��es dos tr�s meses de cada funcion�rio;
2) Calcule e imprima a pontua��o total de cada funcion�rio nos tr�s meses;
3) Calcule e imprima a m�dia das pontua��es de cada funcion�rio nos tr�s meses;
4) Ao final determine e imprima a maior pontua��o atingida entre todos os funcion�rios nos tr�s meses.
Passos:
Construa uma classe p�blica chamada Exercicio6.
Essa classe possui o m�todo main.
Utilize dois la�os FOR, um dentro do outro.
O FOR externo percorre os 5 funcion�rios e o interno recebe os dados de cada m�s do funcion�rio.
Imprima 1� a pontua��o total de cada funcion�rio, depois a m�dia e por �ltimo (fora do la�o) a maior
pontua��o encontrada.
Restri��es:
Imprimir somente o resultado do c�lculo.
Seguir a ordem de sa�da de dados.
 */
package Caderno1;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		String aux;
		int qtdFunc = 5, qtdMeses = 3; 
		double soma, media,maiorPont=0;
 		int func[][]; 
	   	func = new int[qtdMeses][qtdFunc];
	 	
		
		for (int i = 0; i < qtdFunc; i++) 
			for (int j = 0; j < qtdMeses ; j++) 
			{
				aux = JOptionPane.showInputDialog("Func:"+i+" Mes:"+j);
				func[j][i] = Integer.parseInt(aux);
			}
		
			
		for (int i = 0; i < qtdFunc; i++) 
		{
			soma = 0;
			media = 0;
			for (int j = 0; j < qtdMeses ; j++) 
			{
				soma += func[j][i];		
				if(maiorPont<func[j][i])
					maiorPont = func[j][i];			
			}
			media = soma/qtdMeses;	
			System.out.println(soma);		
			System.out.println(media);		
		}
		System.out.println(maiorPont);		
	}
}


