package br.com.erichiroshi.model.momento_estatico;

import br.com.erichiroshi.model.Area.AreaSecaoRetangular;

public abstract class MomentoEstaticoSecaoT {

	// Qx = y.A
	public static double calculaMomentoEstaticoEixoXX(double larguraAlma, double alturaAlma, double larguraAba,
			double alturaAba) {

		double areaAba = AreaSecaoRetangular.calculaArea(larguraAba, alturaAba);
		double areaAlma = AreaSecaoRetangular.calculaArea(larguraAlma, alturaAlma);

		return alturaAlma / 2 * areaAlma + (alturaAba / 2 + alturaAlma) * areaAba;
	}

	// Qy = x.A
	public static double calculaMomentoEstaticoEixoYY(double larguraAlma, double alturaAlma, double larguraAba,
			double alturaAba) {

		double areaAba = AreaSecaoRetangular.calculaArea(larguraAba, alturaAba);
		double areaAlma = AreaSecaoRetangular.calculaArea(larguraAlma, alturaAlma);
		double x = larguraAba / 2;

		return x * areaAlma + x * areaAba;
	}

}
