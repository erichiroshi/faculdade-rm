package br.com.erichiroshi.model.Area;

public abstract class AreaSecaoI {

	public static double calculaArea(double larguraAlma, double alturaAlma, double larguraAbaInferior,
			double alturaAbaInferior, double larguraAbaSuperior, double alturaAbaSuperior) {

		return AreaSecaoRetangular.calculaArea(larguraAbaInferior, alturaAbaInferior)
				+ AreaSecaoRetangular.calculaArea(larguraAlma, alturaAlma)
				+ AreaSecaoRetangular.calculaArea(larguraAbaSuperior, alturaAbaSuperior);
	}
}
