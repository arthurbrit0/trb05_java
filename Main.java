
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // lendo o tipo de frete do usuário
		System.out.println("Escolha o tipo de frete:");
		System.out.println("1. Frete Normal");
		System.out.println("2. Frete Sedex");
		System.out.println("3. Frete Jadlog");
		int escolha = scanner.nextInt();
		TipoFrete tipoFrete;

		if (escolha == 1) {
			tipoFrete = new FreteNormal();
		} else if (escolha == 2) {
			tipoFrete = new FreteSedex();
		} else if (escolha == 3) {
			tipoFrete = new FreteJadlog();
		} else {
			System.out.println("Opção inválida.");
			scanner.close();
			return;
		}

		System.out.println("Informe o peso do produto (em kg):");
		tipoFrete.peso = scanner.nextDouble();
		System.out.println("O produto é frágil? (sim/nao):");
		String fragil = scanner.next();
		tipoFrete.fragilidade = fragil.equalsIgnoreCase("sim") ? "fragil" : "nao";
		System.out.println("Informe a distância para o frete (em km):");
		tipoFrete.distancia = scanner.nextDouble();
		Frete frete = new Frete(tipoFrete); // instanciando um frete com o tipo de frete escolhido pelo usuario e seus
											// dados
		double valorFrete = frete.calculaFrete(); // calculando o frete com a estrategia especifica do frete
		System.out.println("O valor do frete é: R$ " + valorFrete);

		scanner.close();
	}
}