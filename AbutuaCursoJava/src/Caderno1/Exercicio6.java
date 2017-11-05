/*
 * www.abutua.com 11
Cap. 1 - Exercício 6
Objetivo:
Uma empresa contratou 5 funcionários temporários.
De acordo com o valor das vendas mensais, os funcionários adquirem pontos que determinarão seus
salários ao final de cada mês.
Sabe-se que esses funcionários trabalharão nos meses de novembro a janeiro do ano seguinte.
Construa uma aplicação em Java que:
1) Leia as pontuações dos três meses de cada funcionário;
2) Calcule e imprima a pontuação total de cada funcionário nos três meses;
3) Calcule e imprima a média das pontuações de cada funcionário nos três meses;
4) Ao final determine e imprima a maior pontuação atingida entre todos os funcionários nos três meses.
Passos:
Construa uma classe pública chamada Exercicio6.
Essa classe possui o método main.
Utilize dois laços FOR, um dentro do outro.
O FOR externo percorre os 5 funcionários e o interno recebe os dados de cada mês do funcionário.
Imprima 1º a pontuação total de cada funcionário, depois a média e por último (fora do laço) a maior
pontuação encontrada.
Restrições:
Imprimir somente o resultado do cálculo.
Seguir a ordem de saída de dados.
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


