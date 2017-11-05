package caderno10Exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String args[])
	{
		List<Integer> teste = new ArrayList<Integer>();
		int var=0, maior=0;
		String aux;
		do {
			aux = JOptionPane.showInputDialog("numero maior que 0:");
			var = Integer.parseInt(aux);
			if(var>0)
			{
				teste.add(var);
				if(var>maior)
					maior = var;
			}
		} while (var>0);

		Collections.sort(teste);
		
		System.out.println(teste);
		
		//for (int i : teste) 
		//	System.out.println(Collections.frequency(teste, i));
		for (int i = 1;i <= 10; i++) {
			System.out.println(+i+":"+Collections.frequency(teste, i));
		}
	}
}

