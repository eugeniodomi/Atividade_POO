package cofrinho.virtual;


	//A classe 'Dolar' é uma subclasse de 'Moeda' e representa uma moeda do tipo Dólar
public class Dolar extends Moeda {

    // Construtor que inicializa o valor da moeda Dólar
    public Dolar(double value) {
        this.value = value;
    }

    @Override
    public void info() {
        System.out.println("Dólar: US$ " + this.value);
    }

    @Override
    public double converter() {
        // Implementar a conversão
        return this.value * 5.2; // Exemplo de conversão, 1 USD = 5.2 BRL
    }

    @Override
    public boolean equals(Object object) {
        if (this.getClass() != object.getClass()) {
            return false;
        }
        // Realiza o cast para comparar o valor da moeda Dólar
        Dolar dolarObject = (Dolar) object;
        return this.value == dolarObject.value; // Compara os valores das moedas
    }
}