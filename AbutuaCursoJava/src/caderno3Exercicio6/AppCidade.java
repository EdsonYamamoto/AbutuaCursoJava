package caderno3Exercicio6;

import javax.swing.JOptionPane;

public class AppCidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qtd=2;
		Cidade cid[] = new Cidade[qtd];
		String aux;
		double totalCond1=0, cond1 = 0, totalCond2=0, cond2=0, totalVerba=0, resto=0, verbaPop=0, verbaReg=0;

		for (int i=0;i<qtd;i++)
		{
			cid[i] = new Cidade();
			aux = JOptionPane.showInputDialog("nome:");
			cid[i].nome= aux;
			//nome1
			aux = JOptionPane.showInputDialog("regiao");
			cid[i].regiao = Integer.parseInt(aux);
			 //2. regiao1 (valores entre 1 e 5)
			aux =  JOptionPane.showInputDialog("populacao");
			cid[i].populacao = Integer.parseInt(aux);
			 //3. populacao1
		}
		
		aux =  JOptionPane.showInputDialog("Total verba");
		totalVerba = Integer.parseInt(aux);
		verbaPop = totalVerba /2;
		verbaReg = totalVerba /3;
		resto = totalVerba - verbaReg - verbaPop;
		
		for (int i = 0; i < qtd; i++) {
			if(cid[i].regiao == 1)
				cond1 = 0.1;
						
			if(cid[i].regiao == 2)
				cond1 = 0.2;
						
			if(cid[i].regiao == 3)
				cond1 = 0.3;
						
			if(cid[i].regiao == 4)
				cond1 = 0.4;
						
			if(cid[i].regiao == 5)
				cond1 = 0.5;
			
			if(cid[i].populacao<10000)
				cond2 = 0.2;
			if(cid[i].populacao>=10000)
				cond2 = 0.5;	
			
			cid[i].totalVerba = verbaPop*cond2;

			cid[i].totalVerba += verbaReg*cond1;

			totalCond2 += verbaPop*cond2; 
			totalCond1 += verbaReg*cond1;
		}
		resto += (verbaPop-totalCond2);
		resto += (verbaReg-totalCond1);
		
		for (int i = 0; i < qtd; i++) 
			cid[i].totalVerba += resto/2;
		
			
		for (int i = 0; i < qtd; i++) {
			System.out.println(cid[i]);
			System.out.println(cid[i].totalVerba);
		}
	}

}
