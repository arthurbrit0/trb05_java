public class Frete { // associando tipo de frete com a strategy de calculo especifica

	TipoFrete tipo; // tipo --> normal, sedex ou jadlog
	CalcularFrete calculaFrete; // metodo de calculo que sera utilizado, dependendo do tipo de frete

	Frete(TipoFrete tipo) {
		this.tipo = tipo;
	}

	public double calculaFrete() {
		double valor = 0;
		// checando o tipo de frete e variando a strategy utilizada, variando de acordo
		// com o tipo de frete escolhido

		if (tipo instanceof FreteNormal) {
			System.out.println("Frete Normal");
			calculaFrete = new CalcularFreteNormal();
			valor = calculaFrete.calculaFrete(tipo);
		} else if (tipo instanceof FreteSedex) {
			System.out.println("Frete Sedex");
			calculaFrete = new CalcularFreteSedex();
			valor = calculaFrete.calculaFrete(tipo);
		} else if (tipo instanceof FreteJadlog) {
			System.out.println("Frete Jadlog");
			calculaFrete = new CalcularFreteJadlog();
			valor = calculaFrete.calculaFrete(tipo);
		}
		System.out.println(valor);
		return valor;
	}

}
