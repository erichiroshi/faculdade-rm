package br.com.erichiroshi.model.Centroide;

import br.com.erichiroshi.model.Area.AreaSecaoRetangular;

public abstract class CentroideSecaoL {

	// y = y.A/A
	public static double calculaCentroideEixoXX(double larguraAlma, double alturaAlma, double larguraAba,
			double alturaAba) {
		double areaAlma = AreaSecaoRetangular.calculaArea(larguraAlma, alturaAlma);
		double areaAba = AreaSecaoRetangular.calculaArea(larguraAba, alturaAba);
		double yAlma = alturaAlma / 2 + alturaAba;
		double yAba = alturaAba / 2;

		return (yAba * areaAba + yAlma * areaAlma) / (areaAba + areaAlma);
	}

	// x = x.A/A
	public static double calculaCentroideEixoYY(double larguraAlma, double alturaAlma, double larguraAba,
			double alturaAba) {
		double areaAlma = AreaSecaoRetangular.calculaArea(larguraAlma, alturaAlma);
		double areaAba = AreaSecaoRetangular.calculaArea(larguraAba, alturaAba);
		double xAlma = larguraAlma / 2;
		double xAba = larguraAba / 2;

		return (xAba * areaAba + xAlma * areaAlma) / (areaAba + areaAlma);
	}

}
