package caderno4Exercicio2;

public class Livro {
	int codigo;
	String autor;
	String titulo;
	String editora;
	double valor;
	int interessados;
	
	void novoInteressado()
	{
		System.out.println("Novo Interessado");
		interessados++;
	}
	
	void imprimirDadosLivro()
	{
		System.out.println(codigo);

		System.out.println(titulo);
		
		System.out.println(autor);
		
		System.out.println(editora);
		
		System.out.println(valor);
		
		System.out.println(interessados);
	}
}
