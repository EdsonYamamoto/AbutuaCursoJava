package caderno8Exercicio2;

public class Data {
	private int dia, mes, ano;
	public Data()
	{
		dia = 1;
		mes = 1;
		ano = 1900;
	}
	public boolean isValidDate(int dia, int mes, int ano)
	{
		return false;
	}
	public int getDia()
	{
		return this.dia;
	}

	public int getMes()
	{
		return this.mes;
	}

	public int getAno()
	{
		return this.ano;
	}

	public void setDia(int d)
	{
		this.dia = d;
	}
	public void setMes(int m)
	{
		this.mes = m;
	}
	
	public void setAno(int a)
	{
		this.ano = a;
	}
	public String getDiaSemana()
	{
		return null;
	}
	public String getDataExtenso()
	{
		return null;
	}
}
