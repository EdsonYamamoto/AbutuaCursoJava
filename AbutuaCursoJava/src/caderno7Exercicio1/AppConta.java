package caderno7Exercicio1;

import javax.swing.JOptionPane;

public class AppConta {
	public static void main(String[] args)
	{
		int qtd=1, count=0;
		String aux;
		Conta c;
		double valor;

		aux = JOptionPane.showInputDialog("Conta: ");
		c = new Conta(Integer.parseInt(aux));
		aux = JOptionPane.showInputDialog("Nome cliente: ");
		c.setCliente(aux);
		aux = JOptionPane.showInputDialog("Saldo: ");
		c.depositar(Double.parseDouble(aux));
		
		int op;
		aux = JOptionPane.showInputDialog("opcao");
		op = Integer.parseInt(aux);
		while(op!=0)
		{
			switch(op){
			//0. Sair do menu (Laço)
			
			//1. Ver somente o saldo da conta
			case(1):
				System.out.println(c.getSaldo());
				break;
				
			//2. Saque. Se valor do sake maior que o saldo, imprimir EXATAMENTE:
			//"Saldo Insuficiente, caso contrário efetue o saque."
			case(2):
				aux = JOptionPane.showInputDialog("saque");
				if (!c.sacar(Double.parseDouble(aux)))
					System.out.println("Saldo Insuficiente");
				else
					System.out.println("Efetue o saque.");
				break;
				
			//3. Depósito. (Aceitar somente valores positivos)
			case(3):
				aux = JOptionPane.showInputDialog("saque");
				valor = Double.parseDouble(aux);
				if (valor>0) 
					c.depositar(valor);
				break;
				
			//4. Imprimir todos os dados da conta.
			case(4):
				System.out.println(c);
				break;	
			}

			aux = JOptionPane.showInputDialog("opcao");
			op = Integer.parseInt(aux);
		}
	}
}
