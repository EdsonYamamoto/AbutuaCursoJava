package caderno7Exercicio1;

public class Conta {
	private String cliente;
	private double saldo;
	private int numeroConta;
	
	public Conta(int numeroConta)
	{
		this.numeroConta = numeroConta;
	}
	//, que retorna o número da conta.
	public int getNumeroConta()
	{
		return this.numeroConta;
	}
	
	//, altera o número da conta.
	public void setNumeroConta(int numeroConta)
	{
		this.numeroConta = numeroConta;
	}
	
	//, que retorna o cliente.
	public String getCliente()
	{
		return this.cliente;
	}
	
	//, altera o cliente.
	public void setCliente(String cliente)
	{
		this.cliente=cliente;
	}
	
	//, que retorna o saldo atual.
	public double getSaldo()
	{
		return this.saldo;
	}
	
	//, que efetua um deposito na conta. Depositar apenas valores maiores que zero.
	public void depositar(double valor)
	{
		if (valor>0) {
			this.saldo+=valor;
		}
	}
	
	//;;, se o saque for confirmado (cliente possui saldo e valor do saque maior que zero), retorne true, caso contrário retorne false.
	public boolean sacar(double valor)
	{
		if(valor>0&&this.saldo>=valor)
		{
		    this.saldo -= valor;
		    return true;
		}
			
		return false;
	}
	//,que retorna todas as informações da conta: cliente, numeroConta esaldo.
	public String toString()
	{
		return this.cliente+" "+this.numeroConta+" "+this.saldo;
	}
}
