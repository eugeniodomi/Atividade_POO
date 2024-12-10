package cofrinho.virtual;

public class Real extends Moeda {

    // Construtor que inicializa o valor da moeda Real
    public Real(double value) {
        this.value = value; // Atribui o valor da moeda Real à variável 'value'
    }

    
    // Sobrescreve o método 'info()' da classe mãe 'Moeda' para exibir informações específicas da moeda Real
    @Override
    public void info() {
        System.out.println("Real: R$ " + this.value);
    }

    // Sobrescreve o método 'converter()' da classe mãe 'Moeda' para retornar o valor em Real
    @Override
    public double converter() {
       
        return this.value; // Exemplo, retorna o valor em reais.
    }

    // Sobrescreve o método 'equals()' para comparar objetos Real com base no valor da moeda
    @Override
    public boolean equals(Object object) {
        if (this.getClass() != object.getClass()) {
            return false;
        }
        // Realiza o cast para comparar o valor da moeda Real
        Real realObject = (Real) object;
        return this.value == realObject.value; 
    }
}
