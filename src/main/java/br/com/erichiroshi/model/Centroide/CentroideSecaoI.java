package br.com.erichiroshi.model.Centroide;

import br.com.erichiroshi.model.Area.AreaSecaoRetangular;

public abstract class CentroideSecaoI {

	// y = y.A/A
	public static double calculaCentroideEixoXX(double larguraAlma, double alturaAlma, double larguraAbaInferior,
			double alturaAbaInferior, double larguraAbaSuperior, double alturaAbaSuperior) {

		double areaAbaInferior = AreaSecaoRetangular.calculaArea(larguraAbaInferior, alturaAbaInferior);
		double areaAbaSuperior = AreaSecaoRetangular.calculaArea(larguraAbaSuperior, alturaAbaSuperior);
		double areaAlma = AreaSecaoRetangular.calculaArea(larguraAlma, alturaAlma);
		double yAbaInferior = alturaAbaInferior / 2;
		double yAlma = alturaAlma / 2 + alturaAbaInferior;
		double yAbaSuperior = alturaAbaSuperior / 2 + alturaAlma + alturaAbaInferior;

		return (yAbaInferior * areaAbaInferior + yAlma * areaAlma + yAbaSuperior * areaAbaSuperior)
				/ (areaAbaInferior + areaAlma + areaAbaSuperior);

	}

	// x = x.A/A
	public static double calculaCentroideEixoYY(double larguraAlma, double alturaAlma, double larguraAbaInferior,
			double alturaAbaInferior, double larguraAbaSuperior, double alturaAbaSuperior) {

		if (larguraAbaSuperior >= larguraAbaInferior)
			return larguraAbaSuperior / 2;
		else
			return larguraAbaInferior / 2;

	}
}
