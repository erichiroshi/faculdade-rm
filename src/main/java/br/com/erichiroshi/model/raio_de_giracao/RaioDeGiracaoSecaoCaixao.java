package br.com.erichiroshi.model.raio_de_giracao;

import br.com.erichiroshi.model.Area.AreaSecaoCaixao;
import br.com.erichiroshi.model.Inercia.InerciaSecaoCaixao;

public abstract class RaioDeGiracaoSecaoCaixao {

	public static double calculaRaioDeGiracaoEixoXX(double larguraExterna, double alturaExterna, double larguraInterna,
			double alturaInterna) {
		return Math.sqrt(
				InerciaSecaoCaixao.calculaInerciaEixoXX(larguraExterna, alturaExterna, larguraInterna, alturaInterna)
						/ AreaSecaoCaixao.calculaArea(larguraExterna, alturaExterna, larguraInterna, alturaInterna));
	}

	public static double calculaRaioDeGiracaoEixoYY(double larguraExterna, double alturaExterna, double larguraInterna,
			double alturaInterna) {
		return Math.sqrt(
				InerciaSecaoCaixao.calculaInerciaEixoYY(larguraExterna, alturaExterna, larguraInterna, alturaInterna)
						/ AreaSecaoCaixao.calculaArea(larguraExterna, alturaExterna, larguraInterna, alturaInterna));
	}
}
