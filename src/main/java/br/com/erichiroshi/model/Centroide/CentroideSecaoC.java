package br.com.erichiroshi.model.Centroide;

import br.com.erichiroshi.model.Area.AreaSecaoRetangular;

public abstract class CentroideSecaoC {

	// y = y.A/A
	public static double calculaCentroideEixoXX(double larguraAlma, double alturaAlma, double larguraAba,
			double alturaAba) {

		return alturaAlma / 2 + alturaAba;
	}

	// x = x.A/A
	public static double calculaCentroideEixoYY(double larguraAlma, double alturaAlma, double larguraAba,
			double alturaAba) {

		double areaAlma = AreaSecaoRetangular.calculaArea(larguraAlma, alturaAlma);
		double areaAba = AreaSecaoRetangular.calculaArea(larguraAba, alturaAba);

		return (larguraAlma / 2 * areaAlma + 2 * (larguraAba / 2 * areaAba)) / (areaAlma + 2 * areaAba);
	}

}
