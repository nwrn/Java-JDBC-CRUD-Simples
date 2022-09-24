package br.com.montadora.beans;

public class Moto extends Veiculo{
	
	private int quantidadeAdesivo;

	Moto(){super();}
	Moto(String modelo, int capacidadeCombustivel, int quantidadeAdesivo){
		super(modelo, capacidadeCombustivel);
		this.quantidadeAdesivo = quantidadeAdesivo;}
	
	
	
	public int getQuantidadeAdesivo() {
		return quantidadeAdesivo;
	}

	public void setQuantidadeAdesivo(int quantidadeAdesivo) {
		this.quantidadeAdesivo = quantidadeAdesivo;
	}
	

}
