package br.com.montadora.beans;

public class Veiculo {
	private String modelo;
	private int capacidadeCombustivel;

	Veiculo(){}
	Veiculo(String modelo, int capacidadeCombustivel){
		this.modelo = modelo;
		this.capacidadeCombustivel = capacidadeCombustivel;}
	
	public String getModelo() {return modelo;
	}
	public void setModelo(String modelo) {this.modelo = modelo;
	}
	
	public int getCapacidadeCombustivel() {return capacidadeCombustivel;
	}
	public void setCapacidadeCombustivel(int capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}


}
