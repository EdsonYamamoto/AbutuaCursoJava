package caderno8Exercicio3;

public class Aluno {
	private int matricula; 
	private String nome; 
	private double notaProva1; 
	private double notaProva2; 
	private double notaTrabalho1; 
	private double notaTrabalho2;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNotaProva1() {
		return notaProva1;
	}
	public void setNotaProva1(double notaProva1) {
		this.notaProva1 = notaProva1;
	}
	public double getNotaProva2() {
		return notaProva2;
	}
	public void setNotaProva2(double notaProva2) {
		this.notaProva2 = notaProva2;
	}
	public double getNotaTrabalho1() {
		return notaTrabalho1;
	}
	public void setNotaTrabalho1(double notaTrabalho1) {
		this.notaTrabalho1 = notaTrabalho1;
	}
	public double getNotaTrabalho2() {
		return notaTrabalho2;
	}
	public void setNotaTrabalho2(double notaTrabalho2) {
		this.notaTrabalho2 = notaTrabalho2;
	}
	public Aluno()
	{
	}
	
	public Aluno(int matricula)
	{
		setMatricula(matricula);
	}
	public Aluno(int matricula, String nome)
	{
		setMatricula(matricula);
		setNome(nome);
	}
	public double getMediaTrabalhos()
	{
		return ((this.notaTrabalho1*0.4)+(this.notaTrabalho2*0.6));
	}
	public double getMediaProvas()
	{
		return ((this.notaProva1/3.0)+(this.notaProva2*2.0/3.0));
	}
	public double getMediaFinal()
	{
		double a, aux2;
		int aux=0;
		a= this.getMediaTrabalhos()*0.25+ this.getMediaProvas()*0.75;
		aux = (int) a;
		aux2 = a%1;
		System.out.println(aux2);
		if(aux2>0.00 && aux2<=0.25)
			a =(double) aux + 0.25;
		else if(aux2>0.25 && aux2<=0.5)
			a =(double) aux + 0.5;
		else if(aux2>0.5 && aux2<=0.75)
			a =(double) aux + 0.75;
		else if(aux2>0.75 && aux2<1)
			a =(double) aux + 1;
		return a;
	}
	public String getResultadoFinal()
	{
		String aux="";
		if(getMediaFinal()>=0 && getMediaFinal()<4)
			aux= "Reprovado";
		else if(getMediaFinal()>=4 && getMediaFinal()<7)	
			aux = "Recuperação";
		else if(getMediaFinal()>=7 && getMediaFinal()<9.5)	
			aux = "Aprovado";
		else 
			aux = "Aprovado com Louvor";
		
		return aux;
	}
	public String toString()
	{
		return this.matricula+" "+this.nome+" "+this.getMediaFinal()+" "+this.getResultadoFinal();
	} 
}
