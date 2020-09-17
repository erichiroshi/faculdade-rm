package br.com.erichiroshi.model.Centroide;

import br.com.erichiroshi.model.Area.AreaSecaoRetangular;

public abstract class CentroideSecaoT {

	// y = y.A/A
	public static double calculaCentroideEixoXX(double larguraAlma, double alturaAlma, double larguraAba,
			double alturaAba) {
		double areaAlma = AreaSecaoRetangular.calculaArea(larguraAlma, alturaAlma);
		double areaAba = AreaSecaoRetangular.calculaArea(larguraAba, alturaAba);

		return ((alturaAlma / 2) * areaAlma + (alturaAlma + alturaAba / 2) * areaAba) / (areaAlma + areaAba);
	}

	// x = x.A/A
	public static double calculaCentroideEixoYY(double larguraAlma, double alturaAlma, double larguraAba,
			double alturaAba) {

		return larguraAba / 2;
	}

}
