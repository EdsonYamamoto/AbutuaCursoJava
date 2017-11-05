package caderno7Exercicio2;

public class Relogio {
	
	private int horas;
	private int minutos;
	private int segundos;
	
	public Relogio(int horas, int minutos, int segundos)
	{
		if(segundos<0)
			segundos=0;
		if(minutos<0)
			minutos=0;
		if(horas<0)
			horas=0;
		if(segundos>=0&& minutos>=0&&horas>=0)
		{
			minutos += (segundos / 60);
			horas += (minutos/60);
			this.minutos = minutos%60;
			this.segundos = segundos%60;
			this.horas = horas;
		}
	}
	
	public int getHoras()
	{
		return this.horas;
	}
	
	public int getMinutos()
	{
		return this.minutos;
	}
	
	public int getSegundos()
	{
		return this.segundos;
	}
	
	public void somarSegundos(int segundos)
	{
		
		if(segundos>0)
		{	
			somarMinutos((this.segundos+segundos) / 60);
			this.segundos = (this.segundos+segundos) % 60;
		}
	}
	public void somarMinutos(int minutos)
	{
		if(minutos>0)
		{
			somarHoras((minutos+this.minutos)/ 60);
			this.minutos = (minutos+this.minutos) % 60;
		}
	}
	public void somarHoras(int horas)
	{
		if(horas>0)
			this.horas += horas;
	}
	public void somarRelogio(Relogio reg)
	{
		somarSegundos(reg.segundos); 
		somarMinutos(reg.minutos);
		somarHoras(reg.horas);
	}
	public boolean compararRelogio(Relogio reg)
	{
		if(this.horas==reg.horas && this.minutos == reg.minutos && this.segundos == reg.segundos)
			return true;
		return false;
	}
	public String toString()
	{
		String aux="";
		if(this.horas<10)
			aux="0";
		aux +=this.horas+":";
		if(this.minutos<10)
			aux+="0";

		aux +=this.minutos+":";
		if(this.segundos<10)
			aux+="0";
		aux +=this.segundos;
		return aux;
	}
	public static void main(String args[]){
		Relogio a = new Relogio(10, 60, 3);
		Relogio b = new Relogio(0, 50, 30);
		System.out.println(a.getSegundos());
		System.out.println(a.getMinutos());
		System.out.println(a.getHoras());
		System.out.println(a.toString());
		System.out.println(b);
	}
}
