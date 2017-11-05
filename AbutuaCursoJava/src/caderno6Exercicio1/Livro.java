package caderno6Exercicio1;

public class Livro {
	private int codigo;
	private String autor;
	private String titulo;
	private double valor;
	
	public int getCodigo(){
		return this.codigo;
	}
	public void setCodigo(int Cod){
		this.codigo = Cod;
	}
	
	public String getAutor(){
		return this.autor;
	}
	public void setAutor(String Aut){
		this.autor = Aut;
	}
	
	public String getTitulo(){
		return this.titulo;
	}
	public void setTitulo(String Tit){
		this.titulo = Tit;
	}
	public double getValor(){
		return this.valor;
	}
	public void setValor(double Val){
		this.valor = Val;
	}
	
	public String toString(){
	return this.codigo + " " + this.autor + " " + this.titulo + " " + this.valor;
	}
}
