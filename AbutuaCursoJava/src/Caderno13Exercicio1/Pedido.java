package Caderno13Exercicio1;

import caderno8Exercicio2.Data;

public class Pedido {
	private int numeroPedido;
	private String descricao;
	private double totalPedido;
	private Data dataEntrada;
	
	
	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getTotalPedido() {
		return totalPedido;
	}

	public void setTotalPedido(double totalPedido) {
		this.totalPedido = totalPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setDataEntrada(Data dataEntrada) {
		this.dataEntrada.setData(dataEntrada.getDia(), dataEntrada.getMes(), dataEntrada.getAno());
	}

	private Cliente cliente;
	
	public Pedido (int numeroPedido)
	{
		this.numeroPedido = numeroPedido;
	}
	
}