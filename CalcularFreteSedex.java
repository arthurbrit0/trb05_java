public class CalcularFreteSedex implements CalcularFrete { // implementação da classe para calcular frete sedex

	public double calculaFrete(TipoFrete tf) {
		double valor = 0;
		if (tf.fragilidade == "fragil")
			valor += 20;
		if (tf.peso > 10)
			valor += 25;
		return valor += tf.distancia * 1.25 + tf.taxa; // calculo do frete depende da fragilidade, peso, distancia e
														// taxa fixa
	}

}
