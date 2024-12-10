package cofrinho.virtual;

import java.util.Scanner;

public class ScreenMenu {

	private Scanner put1; // Scanner para capturar entradas do usuário
	private Cofre cofrinho; // Instância da classe Cofre para manipular as moedas no cofre
	
	public ScreenMenu() {
		put1 = new Scanner(System.in);
		cofrinho = new Cofre();
		}
	
    // Desenho estilizado para o menu inicial
	public void exibirMenu() {
		
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣶⣿⣿⣷⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⣀⣴⣾⣿⣿⣿⠋⣉⣉⠙⣿⣿⣿⣷⣦⣀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⢀⣤⣶⣿⣿⣿⣿⣿⣿⣿⠀⣿⣿⠀⣿⣿⣿⣿⣿⣿⣿⣶⣤⡀⠀⠀⠀");
        System.out.println("⠀⠀⠀⣤⣤⣤⣤⣤⡄⠀⠀⠀⢀⣠⣿⣿⣤⣤⣄⡀⠀⢠⣤⣤⣤⣤⣤⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⣿⣿⣿⠀⠀⠀⢀⣴⣿⡿⠛⠛⠛⠛⠛⠇⠀⠀⠀⣿⣿⣿⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⣿⣿⣿⠀⠀⠀⣸⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⣿⣿⣿⠀⠀⠀⣿⣿⠀⠀⠀⠀⢠⣤⣤⣤⠀⠀⠀⣿⣿⣿⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⣿⣿⣿⠀⠀⠀⢹⣿⣆⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⣿⣿⣿⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⣿⣿⣿⠀⠀⠀⠀⠻⣿⣷⣤⣤⣤⣤⣾⣿⠀⠀⠀⣿⣿⣿⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⣿⣿⣿⠀⠀⠀⠀⠀⠈⠙⣿⣿⠛⠛⠉⠁⠀⠀⠀⣿⣿⣿⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠛⠛⠛⠛⠛⠃⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⠘⠛⠛⠛⠛⠛⠀⠀⠀");
        System.out.println("⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠉⠉⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀");
        System.out.println("⠀⢰⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⡆⠀");
        System.out.println("⠀⠈⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠁⠀");
		
        String nome = "EUGÊNIO DOMINGUES";
        String ru = "RU: 4785479";

        int larguraTotal = 39; // Largura total da linha
        int espacosAntesNome = (larguraTotal - nome.length()) / 2;
        int espacosAntesRU = (larguraTotal - ru.length()) / 2;

        System.out.println("=======================================");
        System.out.println("    BEM-VINDO AO COFRE DO SENHOR");
        System.out.printf("%" + espacosAntesNome + "s%s%n", "", nome);
        System.out.printf("%" + espacosAntesRU + "s%s%n", "", ru);
        System.out.println("=======================================");
        System.out.println("O QUE DESEJA FAZER?");
        System.out.println("=======================================");
        System.out.println("1 - Adicionar Moeda");
        System.out.println("2 - Remover Moeda");
        System.out.println("3 - Listar Moedas");
        System.out.println("4 - Obter Valor Convertido");
        System.out.println("0 - Sair");
        System.out.println("=======================================");
        System.out.print("Digite sua opção: ");
		String option = put1.next();
	
        // Funcionalidade do Menu Principal: Switch para gerenciar as opções escolhidas
		switch (option) {
			case "0": 
				System.out.println("Finalizando operação!");
				break;
				
			case "1": //Adicionar Moedas
				System.out.println("Escolha a moeda:");
				System.out.println("1 - Real");
				System.out.println("2 - Dolar");
				System.out.println("3 - Euro");
				
				int opcaoMoeda = put1.nextInt(); // Captura da opção de moeda
				 
				System.out.println("Digite o valor: ");
				double valorMoeda = put1.nextDouble();
				
				
				// Criação de instâncias das subclasses de Moeda (polimorfismo)
                // Aqui, a classe mãe "Moeda" tem métodos que são implementados de maneira específica nas classes filhas (Real, Dolar, Euro)
				if (opcaoMoeda == 1){
					Real moeda = new Real(valorMoeda);
					cofrinho.adicionar(moeda);
				} else if(opcaoMoeda == 2){
					Dolar moeda = new Dolar(valorMoeda);
					cofrinho.adicionar(moeda);
				} else if(opcaoMoeda == 3){
					Euro moeda = new Euro(valorMoeda);
					cofrinho.adicionar(moeda);
				} else {
					System.out.println("Não existe essa moeda");
				}
				System.out.println("Adicionado !!!");
			
				exibirMenu();
				break;
				
			case "2": //Remover Moedas
				System.out.println("Escolha a moeda:");
				System.out.println("1 - Real");
				System.out.println("2 - Dolar");
				System.out.println("3 - Euro");
				
				int opcaoMoeda1 = put1.nextInt();
				
				System.out.println("Digite o valor: ");
				double valorMoeda1 = put1.nextDouble();
				
                // Remoção de moeda de acordo com a escolha do usuário
                // Polimorfismo em ação: o método `remover` pode ser chamado com diferentes tipos de moeda
				if (opcaoMoeda1 == 1){
					Real moeda = new Real(valorMoeda1);
					cofrinho.remover(moeda);
					} else if(opcaoMoeda1 == 2){
					Dolar moeda = new Dolar(valorMoeda1);
					cofrinho.remover(moeda);
					} else if(opcaoMoeda1 == 3){
					Euro moeda = new Euro(valorMoeda1);
					cofrinho.remover(moeda);
						} else {
					System.out.println("Não contém esta moeda no banco, opção inválida!");
					}
					
				exibirMenu();	
				System.out.println("Removido :)");
				exibirMenu();
				break;
				
			case "3": // Listar Moedas
				cofrinho.listagemMoedas(); // Chama o método da classe Cofre para listar as moedas
				exibirMenu();
				break;
				
			case "4": // Converter o total para reais
				double convertedValue = cofrinho.totalConvertido();
				System.out.println("Valor total, convertido para reais: " + convertedValue);
				exibirMenu();
				break;
				
			default: //Caso o usuário insira uma opção inválida
				System.out.println("Tente novamente!");
				exibirMenu();
				break;
		
		}

	}
}



