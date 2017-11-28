package Caderno14Exercicio1;

public class Pneu {
	private double tamanho;
	private String fabricante;
	public Pneu(double tamanho)
	{
		this.tamanho = tamanho;
				
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String toString()
	{
		return this.fabricante+this.tamanho;
	}
}
