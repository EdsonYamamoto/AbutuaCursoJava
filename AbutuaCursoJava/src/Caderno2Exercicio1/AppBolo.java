/*
 * Cap. 2 - Exerc�cio 1
Objetivo:
Construa uma aplica��o Java que crie 3 objetos Bolo.
Passos:
Construa uma classe p�blica chamada Bolo.
A classe Bolo � uma classe vazia, sem m�todos e atributos.
Contrua uma classe p�blica chamada de AppBolo
Essa classe possui o m�todo main.
Dentro do m�todo main crie 3 objetos bolos.
Imprimir os conte�dos das tr�s vari�veis que guardam os objetos bolos usando println.
Use um println para cada vari�vel.
Exemplo: System.out.println(c1);
Restri��es:
N�o exitem entradas de dados nesse exerc�cio.
Use 3 println(s), cada um para uma vari�vel.
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
