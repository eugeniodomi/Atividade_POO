package cofrinho.virtual;

import java.util.ArrayList;

public class Cofre {
	// Lista para armazenar as moedas
private ArrayList<Moeda> coinList;
	//Construtor que inicializa a lista de moedas
	public Cofre() {
		this.coinList = new ArrayList<>();
			
	}
	// Adiciona uma moeda à lista
	public void adicionar(Moeda moeda) {
		this.coinList.add(moeda);
	}
	// Remove uma moeda da lista
	public void remover(Moeda moeda) {
		this.coinList.remove(moeda);
	}
	
	
	
	// Exibe as informações de todas as moedas no cofre 
	public void listagemMoedas () {
		
		if (this.coinList.isEmpty()) {
			System.out.println("Seu cofrinho está vazio :(");
			return;
		} else
			// Chama o método info() de cada moeda (polimorfismo)
			for (Moeda moeda : this.coinList) {
			moeda.info();
		}
	}

	
	// Converte o valor total das moedas e retorna o valor acumulado
	public double totalConvertido() {
	    if (this.coinList.isEmpty()) {
	        return 0.0;
	    }
	    
	    double valorAcumulado = 0;
	    for (Moeda moeda : this.coinList) {
	        valorAcumulado += moeda.converter();
	    } 
	    return valorAcumulado;
	}
}

