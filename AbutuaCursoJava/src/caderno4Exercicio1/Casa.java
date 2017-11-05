package caderno4Exercicio1;

public class Casa {
	String cor; 
	int numero; 
	boolean estadoPorta; 
	boolean estadoJanela;
	void abrirPorta()
	{
		System.out.println("Porta Aberta");
		estadoPorta=true;
	}
	void fecharPorta()
	{
		System.out.println("Porta Fechada");
		estadoPorta=false;
	}
	void abrirJanela()
	{
		System.out.println("Janela Aberta");
		estadoJanela=true;		
	}
	void fecharJanela()
	{
		System.out.println("Janela Fechada");
		estadoJanela=false;		
	}
	void imprimirDadosCasa()
	{
		System.out.println(numero);
		System.out.println(cor);
		System.out.println(estadoPorta);
		System.out.println(estadoJanela);

	}
}
