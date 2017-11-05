/*
 * Cap. 2 - Exercício 1
Objetivo:
Construa uma aplicação Java que crie 3 objetos Bolo.
Passos:
Construa uma classe pública chamada Bolo.
A classe Bolo é uma classe vazia, sem métodos e atributos.
Contrua uma classe pública chamada de AppBolo
Essa classe possui o método main.
Dentro do método main crie 3 objetos bolos.
Imprimir os conteúdos das três variáveis que guardam os objetos bolos usando println.
Use um println para cada variável.
Exemplo: System.out.println(c1);
Restrições:
Não exitem entradas de dados nesse exercício.
Use 3 println(s), cada um para uma variável.
 */
package Caderno2Exercicio1;

public class AppBolo {
	public static void main(String[] args){
		Bolo b1 = new Bolo();
		Bolo b2 = new Bolo();
		Bolo b3 = new Bolo();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}
