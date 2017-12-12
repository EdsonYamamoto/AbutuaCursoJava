package Caderno14Exercicio1;

public class Carro {

	private int codigo;
	private String modelo;
	private Motor motor;
	private Pneu[] pneus;

	public Carro() {
		this.pneus = new Pneu[5]; 
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Pneu[] getPneus() {
		return pneus;
	}

	public void setPneus(Pneu[] pneus) {
		this.pneus = pneus;
	}
	@Override
	public String toString()
	{
		return this.codigo+this.modelo+this.motor+this.pneus;
	}
}
