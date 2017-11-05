package caderno11Exercicio2;

public class PessoaApp {

 public static void main(String[] args)
 {
	 PessoaPrivada p1 = new PessoaPrivada();
	 PessoaProtegida p2 = new PessoaProtegida();
	 /*
	 p1.nome = "Pedro";
	 p1.idade = 25;
	 */
	 p2.nome = "Paulo";
	 p2.idade = 32;
	 System.out.println(p1);
	 System.out.println(p2);
 }
}
