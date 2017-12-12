package Caderno12Exercicio1;

public class Cliente {
	private String nome;
	private double saldo;
	private Caixa caixa;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Caixa getCaixa() {
		return caixa;
	}
	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}
	@Override
	public String toString()
	{
		return "Nome: "+this.nome+", Saldo: "+this.saldo;
	}
}
