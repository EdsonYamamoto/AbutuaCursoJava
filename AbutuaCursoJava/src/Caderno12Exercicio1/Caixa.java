package Caderno12Exercicio1;

public class Caixa {
	private int codigo;
	private String nomeOperador;
	private Cliente cliente;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNomeOperador() {
		return nomeOperador;
	}
	public void setNomeOperador(String nomeOperador) {
		this.nomeOperador = nomeOperador;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public String toString()
	{
		return "Nome: "+this.nomeOperador+", Codigo: "+this.codigo;
	}
}
