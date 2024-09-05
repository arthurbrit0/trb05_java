
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha o tipo de frete:");
		System.out.println("1. Frete Normal");
		System.out.println("2. Frete Sedex");
		int escolha = scanner.nextInt();
		TipoFrete tipoFrete;

		if (escolha == 1) {
			tipoFrete = new FreteNormal();
		} else if (escolha == 2) {
			tipoFrete = new FreteSedex();
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
		Frete frete = new Frete(tipoFrete);
		double valorFrete = frete.calculaFrete();
		System.out.println("O valor do frete é: R$ " + valorFrete);

		scanner.close();
	}
}