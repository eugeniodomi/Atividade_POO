package cofrinho.virtual;

import java.util.ArrayList;

public class Cofre {
	
private ArrayList<Moeda> coinList;
	
	public Cofre() {
		this.coinList = new ArrayList<>();
			
	}
	//adiciona moedas na lista
	public void adicionar(Moeda moeda) {
		this.coinList.add(moeda);
	}
	//remove moedas na lista
	public void remover(Moeda moeda) {
		this.coinList.remove(moeda);
	}
	
	
	
	// exibe moedas 
	public void listagemMoedas () {
		
		if (this.coinList.isEmpty()) {
			System.out.println("Seu cofrinho está vazio :(");
			return;
		} else
			for (Moeda moeda : this.coinList) {
			moeda.info();
		}
	}

	
	//método converte o valor e acumula o valor convertido e retorna o valor total da conversão 
	public double totalConvertido() {
		if (this.coinList.isEmpty()) {
			return 0.0;
		}
		
		if (this.coinList.size() == 1) {
			return 1.0;
		}
		
		double valorAcumulado = 0;
		for (Moeda moeda : this.coinList) {
			valorAcumulado = valorAcumulado + moeda.converter();
		} 
		return valorAcumulado;
	}
}


