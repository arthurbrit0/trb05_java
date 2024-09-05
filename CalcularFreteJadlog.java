public class CalcularFreteJadlog implements CalcularFrete { // implementação da classe para calcular frete jadlog

    public double calculaFrete(TipoFrete tf) {
        double valor = 0;
        if (tf.fragilidade == "fragil")
            valor += 13;
        if (tf.peso > 10)
            valor += 16;
        return valor += tf.distancia * 1.25 + tf.taxa; // calculo do frete depende da fragilidade, peso, distancia e
                                                       // taxa fixa
    }

}