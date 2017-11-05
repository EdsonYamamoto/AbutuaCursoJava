package caderno10Exercicio1;
import caderno9Exercicio1.*;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AppCliente {
	public static void main(String args[])
	{
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
		int qtd=5;
		String aux=null;
		
		for(int i=0;i<qtd;i++)
			cliente.add(new Cliente());
			
		
		for (int i = 0; i < cliente.size(); i++) {
			aux = JOptionPane.showInputDialog("codigo");
			cliente.get(i).setCodigo(Integer.parseInt(aux));
			aux = JOptionPane.showInputDialog("nome");
			cliente.get(i).setNome(aux);
			aux = JOptionPane.showInputDialog("saldo");
			cliente.get(i).setSaldo(Double.parseDouble(aux));
		}
		imprimir(cliente);
		
	}
	public static void imprimir(ArrayList<Cliente> lista)
	{
		for(Cliente c : lista)
		{
			System.out.println(c);
		}
	}
}
