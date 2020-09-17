package br.com.erichiroshi.model.momento_estatico;

import br.com.erichiroshi.model.Area.AreaSecaoRetangular;

public abstract class MomentoEstaticoSecaoL {

	// Qx = y.A
	public static double calculaMomentoEstaticoEixoXX(double larguraAlma, double alturaAlma, double larguraAba,
			double alturaAba) {

		double areaAba = AreaSecaoRetangular.calculaArea(larguraAba, alturaAba);
		double areaAlma = AreaSecaoRetangular.calculaArea(larguraAlma, alturaAlma);
		double yAba = alturaAba / 2;
		double yAlma = alturaAlma / 2 + alturaAba;

		return yAba * areaAba + yAlma * areaAlma;
	}

	// Qy = x.A
	public static double calculaMomentoEstaticoEixoYY(double larguraAlma, double alturaAlma, double larguraAba,
			double alturaAba) {

		double areaAba = AreaSecaoRetangular.calculaArea(larguraAba, alturaAba);
		double areaAlma = AreaSecaoRetangular.calculaArea(larguraAlma, alturaAlma);
		double xAba = larguraAba / 2;
		double xAlma = larguraAlma / 2;

		return xAba * areaAba + xAlma * areaAlma;
	}

}
