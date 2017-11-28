package Caderno13Exercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class Cliente {
	private int codigoCliente;
	private String nomeCliente;
	private ArrayList<Pedido> pedidos;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public Cliente(int codigoCliente)
	{
		this.codigoCliente = codigoCliente;
	}
	
	public void addPedido(Pedido pedido)
	{
		pedidos.add(pedido);
	}
	
	public Iterator<Pedido> getPedidosIterator()
	{
		Iterator<Pedido> i = pedidos.iterator();
		while (i.hasNext()) {
			System.out.println(i);
		}
		return null;
	}
	
	
	
	public int getCodigoCliente() {
		return codigoCliente;
	}
	
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	@Override
	public String toString()
	{
		System.out.println(getTotalPedidos());
		
		return null;
	}
	
	public double getTotalPedidos()
	{
		return 0;
	}
	
	public int getQuantidadePedidos() 
	{
		return 0;
	}
}
