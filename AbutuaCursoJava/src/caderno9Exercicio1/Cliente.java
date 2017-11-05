package caderno9Exercicio1;

public class Cliente {
	private int codigo;
	private String nome;
	private double saldo;
	
	public Cliente ()
	{
		
	}
	public Cliente (int codigo)
	{
		this.codigo = codigo;
	}
	public Cliente (int codigo,double saldo)
	{
		this.codigo = codigo;
		this.saldo = saldo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
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
	public String toString()
	{
		return this.nome+ " " + this.codigo + " " + this.saldo;
	}
}
