package br.com.erichiroshi.model.momento_estatico;

import br.com.erichiroshi.model.Area.AreaSecaoRetangular;

public abstract class MomentoEstaticoSecaoC {

	// Qx = y.A
	public static double calculaMomentoEstaticoEixoXX(double larguraAlma, double alturaAlma, double larguraAbaInferior,
			double alturaAbaInferior, double larguraAbaSuperior, double alturaAbaSuperior) {

		double areaAbaInferior = AreaSecaoRetangular.calculaArea(larguraAbaInferior, alturaAbaInferior);
		double areaAbaSuperior = AreaSecaoRetangular.calculaArea(larguraAbaSuperior, alturaAbaSuperior);
		double areaAlma = AreaSecaoRetangular.calculaArea(larguraAlma, alturaAlma);
		double yAbaInferior = alturaAbaInferior / 2;
		double yAlma = alturaAlma / 2 + alturaAbaInferior;
		double yAbaSuperior = alturaAbaSuperior / 2 + alturaAlma + alturaAbaInferior;

		return yAbaInferior * areaAbaInferior + yAlma * areaAlma + yAbaSuperior * areaAbaSuperior;
	}

	// Qy = x.A
	public static double calculaMomentoEstaticoEixoYY(double larguraAlma, double alturaAlma, double larguraAbaInferior,
			double alturaAbaInferior, double larguraAbaSuperior, double alturaAbaSuperior) {

		double areaAbaInferior = AreaSecaoRetangular.calculaArea(larguraAbaInferior, alturaAbaInferior);
		double areaAbaSuperior = AreaSecaoRetangular.calculaArea(larguraAbaSuperior, alturaAbaSuperior);
		double areaAlma = AreaSecaoRetangular.calculaArea(larguraAlma, alturaAlma);
		double xAbaInferior = larguraAbaInferior / 2;
		double xAlma = larguraAlma / 2;
		double xAbaSuperior = larguraAbaSuperior / 2;

		return xAbaInferior * areaAbaInferior + xAlma * areaAlma + xAbaSuperior * areaAbaSuperior;
	}

}
