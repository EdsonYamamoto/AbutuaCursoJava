package caderno8Exercicio1;

public class Relogio {
	private int horas;
	private int minutos; 
	private int segundos;

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
	
	public Relogio(int horas, int minutos, int segundos)
	{
		int min=0, hor=0;
		if(segundos>=0)
		{
			min = segundos/60;
			this.segundos = segundos%60;
		}
			
		if(minutos>=0)
		{
			hor = (minutos+min)/60;
			this.minutos = (minutos+min)%60;
		}
			
		if(horas>=0)
			this.horas = horas+hor;
		
	}
	
	public Relogio(int horas, int minutos)
	{
		int hor=0;
		if(minutos>=0)
		{
			hor = (minutos)/60;
			this.minutos = minutos%60;
		}
			
		if(horas>=0)
			this.horas = horas+hor;
	}
	
	public Relogio()
	{
		
	}
	
	public boolean compararRelogio(Relogio reg){
//		if(this == reg)
		if(this.horas == reg.horas && this.minutos == reg.minutos && this.segundos == reg.segundos)
			return true;
		return false;
	}
	public boolean compararRelogio(int hora, int minuto, int segundo){
		if(this.horas == hora && this.minutos == minuto && this.segundos == segundo)
			return true;
		return false;
	}
	public void somarSegundos(int segundo)
	{
		if(segundo>0)
		{			
			this.segundos += segundo;
			this.minutos += this.segundos/60;
			this.horas += this.minutos/60;
			this.segundos %= 60;
			this.minutos %= 60;
		}
	}
	public void somarMinutos(int minuto)
	{
		if(minuto>0)
		{			
			this.minutos += minuto;
			this.horas += this.minutos/60;
			this.minutos %= 60;
		}
	}
	public void somarHoras(int hora)
	{
		if(hora>0)
		{			
			this.horas += hora;
		}
	}

	public void somarRelogio(int hora, int minuto, int segundo)
	{
		somarSegundos(segundo);
		somarMinutos(minuto);
		somarHoras(hora);
	}

	public void somarRelogio(int hora, int minuto)
	{
		somarMinutos(minuto);
		somarHoras(hora);
	}
	public void somarRelogio(Relogio r)
	{
		somarSegundos(r.segundos);
		somarMinutos(r.minutos);
		somarHoras(r.horas);
	}
	public void somarRelogio(String relogio) 
	{
		int horas=0, minutos=0, segundos = 0;
		String[] aux = relogio.split(":");
		
		horas = Integer.parseInt(aux[0]);
		minutos = Integer.parseInt(aux[1]);
		segundos = Integer.parseInt(aux[2]);
		
		this.somarSegundos(segundos);
		this.somarMinutos(minutos);
		this.somarHoras(horas);
	}
	public String toString()
	{
		String aux="";

		if(this.horas<10)
			aux += "0"+this.horas;
		else
			aux += this.horas;
		aux +=":";

		if(this.minutos<10)
			aux += "0"+this.minutos;
		else
			aux += this.minutos;
		aux +=":";
		
		if(this.segundos<10)
			aux += "0"+this.segundos;
		else
			aux += this.segundos;
		return aux;
	}

	public static void main (String[] args)
	{
		Relogio r = new Relogio(50,2,2);
		Relogio rw = new Relogio(3,1,4);
		System.out.println(r);
		r.somarRelogio("2:3:0");
		System.out.println(rw);
	}
}