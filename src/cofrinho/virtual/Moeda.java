package cofrinho.virtual;


//A classe Moeda é abstrata, servindo como classe base para todas as moedas

public abstract class Moeda { 
	double value;     // Atributo que armazena o valor da moeda
	
	public abstract void info();
		public abstract double converter();
	
	 
}
