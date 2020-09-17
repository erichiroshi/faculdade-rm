package br.com.erichiroshi.model.Inercia;

import br.com.erichiroshi.model.Area.AreaSecaoRetangular;
import br.com.erichiroshi.model.Centroide.CentroideSecaoI;

public abstract class InerciaSecaoI {

	// I = b.h³/12 + Ady²
	public static double calculaInerciaEixoXX(double larguraAlma, double alturaAlma, double larguraAbaInferior,
			double alturaAbaInferior, double larguraAbaSuperior, double alturaAbaSuperior) {

		double areaAbaInferior = AreaSecaoRetangular.calculaArea(larguraAbaInferior, alturaAbaInferior);
		double areaAbaSuperior = AreaSecaoRetangular.calculaArea(larguraAbaSuperior, alturaAbaSuperior);
		double areaAlma = AreaSecaoRetangular.calculaArea(larguraAlma, alturaAlma);
		double Cy = CentroideSecaoI.calculaCentroideEixoXX(larguraAlma, alturaAlma, larguraAbaInferior,
				alturaAbaInferior, larguraAbaSuperior, alturaAbaSuperior);

		double dyAbaInferior = Cy - alturaAbaInferior / 2;
		double dyAlma = alturaAlma >= Cy ? (alturaAlma / 2 + alturaAbaInferior) - Cy
				: Cy - (alturaAlma / 2 + alturaAbaInferior);
		double dyAbaSuperior = (alturaAbaSuperior / 2 + alturaAlma + alturaAbaInferior) - Cy;

		return InerciaSecaoRetangular.calculaInerciaEixoXX(larguraAbaInferior, alturaAbaInferior)
				+ areaAbaInferior * Math.pow(dyAbaInferior, 2)
				+ InerciaSecaoRetangular.calculaInerciaEixoXX(larguraAlma, alturaAlma) + areaAlma * Math.pow(dyAlma, 2)
				+ InerciaSecaoRetangular.calculaInerciaEixoXX(larguraAbaSuperior, alturaAbaSuperior)
				+ areaAbaSuperior * Math.pow(dyAbaSuperior, 2);
	}

	public static double calculaInerciaEixoYY(double larguraAlma, double alturaAlma, double larguraAbaInferior,
			double alturaAbaInferior, double larguraAbaSuperior, double alturaAbaSuperior) {

		return InerciaSecaoRetangular.calculaInerciaEixoYY(larguraAbaInferior, alturaAbaInferior)
				+ InerciaSecaoRetangular.calculaInerciaEixoYY(larguraAlma, alturaAlma)
				+ InerciaSecaoRetangular.calculaInerciaEixoYY(larguraAbaSuperior, alturaAbaSuperior);
	}
}
