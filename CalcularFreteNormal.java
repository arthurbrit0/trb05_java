public class CalcularFreteNormal implements CalcularFrete { // implementação do cálculo de frente normal

	public double calculaFrete(TipoFrete fn) {
		double valor = 0;
		if (fn.fragilidade == "fragil")
			valor += 12;
		if (fn.peso > 10)
			valor += 17;
		return valor += fn.distancia * 1.2 + fn.taxa; // calculo do frete depende da fragilidade, peso, distancia e taxa
														// fixa
	}

}
