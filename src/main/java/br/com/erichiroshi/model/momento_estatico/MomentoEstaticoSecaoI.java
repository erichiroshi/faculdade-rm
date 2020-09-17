package br.com.erichiroshi.model.momento_estatico;

import br.com.erichiroshi.model.Area.AreaSecaoRetangular;

public abstract class MomentoEstaticoSecaoI {

	// Qx = y.A
	public static double calculaMomentoEstaticoEixoXX(double larguraAlma, double alturaAlma, double larguraAbaInferior,
			double alturaAbaInferior, double larguraAbaSuperior, double alturaAbaSuperior) {

		double areaAbaInferior = AreaSecaoRetangular.calculaArea(larguraAbaInferior, alturaAbaInferior);
		double areaAbaSuperior = AreaSecaoRetangular.calculaArea(larguraAbaSuperior, alturaAbaSuperior);
		double areaAlma = AreaSecaoRetangular.calculaArea(larguraAlma, alturaAlma);

		return alturaAbaInferior / 2 * areaAbaInferior + (alturaAlma / 2 + alturaAbaInferior) * areaAlma
				+ (alturaAbaSuperior / 2 + alturaAlma + alturaAbaInferior) * areaAbaSuperior;
	}

	// Qy = x.A
	public static double calculaMomentoEstaticoEixoYY(double larguraAlma, double alturaAlma, double larguraAbaInferior,
			double alturaAbaInferior, double larguraAbaSuperior, double alturaAbaSuperior) {

		double areaAbaInferior = AreaSecaoRetangular.calculaArea(larguraAbaInferior, alturaAbaInferior);
		double areaAbaSuperior = AreaSecaoRetangular.calculaArea(larguraAbaSuperior, alturaAbaSuperior);
		double areaAlma = AreaSecaoRetangular.calculaArea(larguraAlma, alturaAlma);
		double x = larguraAbaInferior >= larguraAbaSuperior ? larguraAbaInferior / 2 : larguraAbaSuperior / 2;

		return x * areaAbaInferior + x * areaAlma + x * areaAbaSuperior;
	}

}
