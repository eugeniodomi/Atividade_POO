package cofrinho.virtual;

//A classe 'Euro' é uma subclasse de 'Moeda' e representa uma moeda do tipo Euro
public class Euro extends Moeda {

    public Euro(double value) {
        this.value = value;
    }
    
    // Sobrescreve o método 'info()' da classe mãe 'Moeda' para exibir informações específicas da moeda Euro
    @Override
    public void info() {
        System.out.println("Euro: € " + this.value);
    }

    // Sobrescreve o método 'converter()' da classe mãe 'Moeda' para realizar a conversão do Euro para BRL
    @Override
    public double converter() {
        // Implementa a conversão de 1 EUR para BRL (exemplo: 1 EUR = 6 BRL)
        return this.value * 6.0; 
    }

    // Sobrescreve o método 'equals()' para comparar objetos Euro com base no valor da moeda
    @Override
    public boolean equals(Object object) {
        if (this.getClass() != object.getClass()) {
            return false;
        }
        // Realiza o cast para comparar o valor da moeda Euro
        Euro euroObject = (Euro) object;
        return this.value == euroObject.value;
    }
}