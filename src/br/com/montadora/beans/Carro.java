package br.com.montadora.beans;

public class Carro extends Veiculo{
	
	private int quantidadeJanela;

	Carro(){super();}
	Carro(String modelo, int capacidadeCombustivel, int quantidadeJanela){
		super(modelo, capacidadeCombustivel);
		this.quantidadeJanela = quantidadeJanela;}
	
	
	public int getQuantidadeJanela() {
		return quantidadeJanela;
	}

	public void setQuantidadeJanela(int quantidadeJanela) {
		this.quantidadeJanela = quantidadeJanela;
	}
	
	

}
