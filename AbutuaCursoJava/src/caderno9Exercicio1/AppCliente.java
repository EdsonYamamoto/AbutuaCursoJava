package caderno9Exercicio1;


import javax.swing.JOptionPane;

public class AppCliente {
	public static void main(String args[])
	{
		int qtd=2;
		Cliente cliente[] = new Cliente[qtd];
		String aux = null;
		
		for(int i=0;i<cliente.length;i++)
			cliente[i] = new Cliente();
		
		for(Cliente c : cliente)
		{
			aux = JOptionPane.showInputDialog("codigo");
			c.setCodigo(Integer.parseInt(aux));
			aux = JOptionPane.showInputDialog("nome");
			c.setNome(aux);
			aux = JOptionPane.showInputDialog("saldo");
			c.setSaldo(Double.parseDouble(aux));
		}
		
		imprimir(cliente);
		
		
	}
	public static void imprimir(Cliente clientes[])
	{
		for(Cliente c : clientes)
		{
			System.out.println(c);
		}
	}
}
