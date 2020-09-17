package br.com.erichiroshi.model.Inercia;

public abstract class InerciaSecaoCaixao {

	public static double calculaInerciaEixoXX(double larguraExterna, double alturaExterna, double larguraInterna, double alturaInterna) {
		return InerciaSecaoRetangular.calculaInerciaEixoXX(larguraExterna, alturaExterna)
				- InerciaSecaoRetangular.calculaInerciaEixoXX(larguraInterna, alturaInterna);
	}

	public static double calculaInerciaEixoYY(double larguraExterna, double alturaExterna, double larguraInterna, double alturaInterna) {
		return InerciaSecaoRetangular.calculaInerciaEixoYY(larguraExterna, alturaExterna)
				- InerciaSecaoRetangular.calculaInerciaEixoYY(larguraInterna, alturaInterna);
	}

}
