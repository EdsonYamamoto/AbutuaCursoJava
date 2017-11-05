/*
 * Cap. 2 - Exercício 3
Objetivo:
Construa uma aplicação Java que crie 2 objetos Computadores.
Passos:
Construa 1 classe pública chamada de Computador.
Essa classe possui o método main (public static void main(String args[])).
Dentro do método main crie 2 objetos Computador.
Imprimir os conteúdos das 2 variáveis que guardam cada um dos objetos criados usando println.
Use um println para cada variável.
Exemplo: System.out.println(c1);
Restrições:
Não exitem entradas de dados nesse exercício.
Use 2 println(s), cada um para uma variável.
 */

package Caderno2Exercicio3;

public class Computador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computador comp1 = new Computador();
		Computador comp2 = new Computador();
		
		System.out.println(comp1);
		System.out.println(comp2);
	}

}
