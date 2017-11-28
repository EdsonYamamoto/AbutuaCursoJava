package caderno7Exercicio3;

public class Data {
	private int dia = 1;
	private int mes = 1;
	private int ano = 1900;
	
	
	//2
	public Data(int dia, int mes, int ano){
		if(!isValidDate(dia,mes,ano))
		{
			this.dia = 1;
			this.mes = 1;
			this.ano = 1900;
		}
		else
		{
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
	}
	
	public void setData(int dia, int mes, int ano)
	{
		
		if(isValidDate(dia,mes,ano))
		{
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
	}
	//3
	public int getDia(){
		return this.dia;
	}
	public int getMes(){
		return this.mes;
	}
	public int getAno(){
		return this.ano;
	}
	
	//4
	public void setDia(int d){
		setData(d, this.mes, this.ano);
	}
	public void setMes(int m){
		setData(this.dia, m, this.ano);
	}
	public void setAno(int a){
		setData(this.dia, this.mes, a);
	}
	// 6
	public String getDiaSemana()
	{
		String dia="";
		int soma=3,dRef=1, mRef=1,aRef=1990;

		soma+=this.dia;
		while(this.ano != aRef)
		{
			if(isAnoBissexto(aRef))
				soma+=366;
			else
				soma+=365;
			aRef++;
		}
		
		
		while(this.mes!=mRef)
		{
			dRef++;
			soma++;
			if(!isValidDate(dRef, mRef, aRef))
			{	
				dRef=1;
				mRef++;
			}	
		}
		soma %= 7;
		
		switch(soma)
		{
		
			case 0:
				dia = "Domingo";
			break;
			case 1:
				dia = "Segunda-Feira";
			break;
			
			case 2:
				dia = "Terça-Feira";
			break;
			
			case 3:
				dia = "Quarta-Feira";
			break;
			
			case 4:
				dia = "Quinta-Feira";
			break;
			
			case 5:
				dia = "Sexta-Feira";
			break;
			case 6:
				dia = "Sábado";
			break;
		}		
		return dia;
	}
	//7
	
	public String getDataExtenso(){
		
		String nome="";
		int auxNum, auxNum2=0, cont=0;
		int casasDec;
		
		auxNum=this.dia;
		casasDec=1;
		do {
			auxNum=auxNum/10;
			casasDec++;
			
		} while (auxNum>10);
		auxNum = this.dia;
		do {
			
			if(auxNum>=20)
			{
				auxNum2 = (int) (auxNum%Math.pow(10, casasDec-1));
				auxNum = auxNum-auxNum2;
			}
			
			if(auxNum>10&&auxNum<20)
			{
				switch(auxNum)
				{
				case(11):nome+="Onze ";break;
				case(12):nome+="Doze ";break;
				case(13):nome+="Treze ";break;
				case(14):nome+="Quatorze ";break;
				case(15):nome+="Quinze ";break;
				case(16):nome+="Dezesseis ";break;
				case(17):nome+="Dezessete ";break;
				case(18):nome+="Dezoito ";break;
				case(19):nome+="Dezenove ";break;
				}

				casasDec-=2;
			}
			
			else
			{
				switch(auxNum)
				{
					case(1):nome+="Um ";break;
					case(2):nome+="Dois ";break;
					case(3):nome+="Três ";break;
					case(4):nome+="Quatro ";break;
					case(5):nome+="Cinco ";break;
					case(6):nome+="Seis ";break;
					case(7):nome+="Sete ";break;
					case(8):nome+="Oito ";break;
					case(9):nome+="Nove ";break;
					case(10):nome+="Dez ";break;
					case(20):nome+="Vinte ";break;
					case(30):nome+="Trinta ";break;
				}
				casasDec--;
			}
			auxNum = auxNum2;
			int aux = (int) (auxNum/Math.pow(10, casasDec-1));
			if(auxNum2>0&&casasDec>0&&aux!=0)
				nome+="e ";
		}while(casasDec>0);
		//dias
		
		nome+="de";
		switch(this.mes)
		{
			case(1):nome+=" Janeiro ";break;
			case(2):nome+=" Fevereiro ";break;
			case(3):nome+=" Março ";break;
			case(4):nome+=" Abril ";break;
			case(5):nome+=" Maio ";break;
			case(6):nome+=" Junho ";break;
			case(7):nome+=" Julho ";break;
			case(8):nome+=" Agosto ";break;
			case(9):nome+=" Setembro ";break;
			case(10):nome+=" Outubro ";break;
			case(11):nome+=" Novembro ";break;
			case(12):nome+=" Dezembro ";break;
			
		}

		nome+="de ";
		
		auxNum=this.ano;
		casasDec=1;
		do {
			auxNum=auxNum/10;
			casasDec++;
		} while (auxNum>10);
		
		auxNum = this.ano;
		
		
		do {
			if(auxNum>=20)
			{
				auxNum2 = (int) (auxNum%Math.pow(10, casasDec-1));
				auxNum = auxNum-auxNum2;
			}
			
			if(auxNum>10&&auxNum<20)
			{
				switch(auxNum)
				{
				case(11):nome+="Onze ";break;
				case(12):nome+="Doze ";break;
				case(13):nome+="Treze ";break;
				case(14):nome+="Quatorze ";break;
				case(15):nome+="Quinze ";break;
				case(16):nome+="Dezesses ";break;
				case(17):nome+="Dezessete ";break;
				case(18):nome+="Dezoito ";break;
				case(19):nome+="Dezenove ";break;
				}

				casasDec-=2;
			}
			
			else
			{
				int aux = (int) (auxNum/Math.pow(10, casasDec-1));
				if (aux!=0) {
					switch(auxNum)
					{
						case(1):nome+="Um ";break;
						case(2):nome+="Dois ";break;
						case(3):nome+="Três ";break;
						case(4):nome+="Quatro ";break;
						case(5):nome+="Cinco ";break;
						case(6):nome+="Seis ";break;
						case(7):nome+="Sete ";break;
						case(8):nome+="Oito ";break;
						case(9):nome+="Nove ";break;
						case(10):nome+="Dez ";break;
						case(20):nome+="Vinte ";break;
						case(30):nome+="Trinta ";break;
						case(40):nome+="Quarenta ";break;
						case(50):nome+="Cinquenta ";break;
						case(60):nome+="Secenta ";break;
						case(70):nome+="Setenta ";break;
						case(80):nome+="Oitenta ";break;
						case(90):nome+="Noventa ";break;
						case(100):nome+="Cem ";break;
						case(200):nome+="Duzentos ";break;
						case(300):nome+="Trezentos ";break;
						case(400):nome+="Quatrocentos ";break;
						case(500):nome+="Quinhentos ";break;
						case(600):nome+="Seiscentos ";break;
						case(700):nome+="Setecentos ";break;
						case(800):nome+="Oitocentos ";break;
						case(900):nome+="Novecentos ";break;
						case(1000):nome+="Mil ";break;
						case(2000):nome+="Dois Mil ";break;
						case(3000):nome+="Três Mil ";break;
						case(4000):nome+="Quatro Mil ";break;
						case(5000):nome+="Cinco Mil ";break;
						case(6000):nome+="Seis Mil ";break;
						case(7000):nome+="Sete Mil ";break;
						case(8000):nome+="Oito Mil ";break;
						case(9000):nome+="Nove Mil ";break;
					}
					casasDec--;
				
				auxNum = auxNum2;
				
				if(auxNum2>0&&casasDec>0)
					nome+="e ";
				}
			
				else
					casasDec--;
			}
		}while(casasDec>0);
		//dias
		return nome;
	}
	//8
	public int getMaxDiaMes(int mes, int ano)
	{
		int dias = 0;
		switch(mes)
		{
			case(1):
				dias=31;
			break;
			
			case(2):
				if(isAnoBissexto(ano))
					dias=29;
				else
					dias=28;
			break;
			
			case(3):
				dias=31;
			break;
			
			case(4):
				dias=30;
			break;
			
			case(5):
				dias=31;
			break;
			
			case(6):
				dias=30;
			break;
			
			case(7):
				dias=31;
			break;
			
			case(8):
				dias=31;
			break;
			
			case(9):
				dias=30;
			break;
			
			case(10):
				dias=31;
			break;
			
			case(11):
				dias=30;
			break;
			
			case(12):
				dias=31;
			break;
			
		}
		return dias;
	}
	//9
	public int getDiasCorridos()
	{
		int diaRef=1, mesRef=1, anoRef=1900;
		int dias=0;
		
		dias = this.dia-diaRef;
		while(mesRef!=this.mes||anoRef!=this.ano)
		{
			dias += getMaxDiaMes(mesRef, anoRef);
			mesRef++;
			if(mesRef>12)
			{
				anoRef++;
				mesRef=0;
			}
		}
		
		
		return dias;
	}

	//10
	public boolean isAnoBissexto(int ano){
	    if(ano==1900)
	        return false;
		else if(ano%4==0)
		{
			if (ano%100==0) 
			{	
				if(ano%400==0)
					return true;
				return false;
			}
			
			return true;			
		}
		else
    		return false;
	}
	
	public boolean isValidDate (int dia, int mes, int ano)
	{
		int dias=0;
		dias = getMaxDiaMes(mes, ano);
		if(dia>0&&dia<=dias&&mes>0&&mes<=12&&ano>=1900&&ano<=9999)
			return true;		
		return false;
	}
	
	//12
	public String toString()
	{
		String aux="";
		if(this.dia<10)
			aux="0";
		aux+=this.dia;
		aux+="/";
		if(this.mes<10)
			aux+="0";
		aux+=this.mes;
		aux+="/";
		if(this.ano<10)
			aux+="000";
		if(this.ano<100)
			aux+="00";
		if(this.ano<1000)
			aux+="0";
		aux+=this.ano;
		
		return aux;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data(04,10,2032);
		Data d1 = new Data(1,1,1900);
		
		System.out.println(d1.getDiaSemana());
	}
}