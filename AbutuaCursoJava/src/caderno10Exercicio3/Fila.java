package caderno10Exercicio3;

import java.util.List;

public class Fila {
	List pessoasSemPreferencia;
	List pessoasComPreferencia;
	int anterior;

	void addPessoa(int idade)
	{
		if(idade>=60)
			getPessoasComPreferencia();
		else
			getPessoasSemPreferencia();
	}
	List getPessoasSemPreferencia()
	{
		return pessoasSemPreferencia;
	}
	List getPessoasComPreferencia()
	{
		return pessoasComPreferencia;
		
	}
	List getFila(){
		List total = null;
		//pessoasComPreferencia+pessoasSemPreferencia;
		return total;
	}
	public static void main(String args[])
	{
		
	}
}
