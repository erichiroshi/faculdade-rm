package br.com.erichiroshi.model.Inercia;

import br.com.erichiroshi.model.Area.AreaSecaoRetangular;
import br.com.erichiroshi.model.Centroide.CentroideSecaoT;

public abstract class InerciaSecaoT {

	// I = b.h³/12 + Ady² y = y.A/A
	public static double calculaInerciaEixoXX(double larguraAlma, double alturaAlma, double larguraAba,
			double alturaAba) {

		double areaAlma = AreaSecaoRetangular.calculaArea(larguraAlma, alturaAlma);
		double areaAba = AreaSecaoRetangular.calculaArea(larguraAba, alturaAba);
		double y = CentroideSecaoT.calculaCentroideEixoXX(larguraAlma, alturaAlma, larguraAba, alturaAba);

		double dyAlma = y - alturaAlma / 2;
		double dyAba = (alturaAlma + alturaAba / 2) - y;

		return InerciaSecaoRetangular.calculaInerciaEixoXX(larguraAlma, alturaAlma) + areaAlma * Math.pow(dyAlma, 2)
				+ InerciaSecaoRetangular.calculaInerciaEixoXX(larguraAba, alturaAba) + areaAba * Math.pow(dyAba, 2);
	}

	public static double calculaInerciaEixoYY(double larguraAlma, double alturaAlma, double larguraAba,
			double alturaAba) {
		return InerciaSecaoRetangular.calculaInerciaEixoYY(larguraAlma, alturaAlma)
				+ InerciaSecaoRetangular.calculaInerciaEixoYY(larguraAba, alturaAba);
	}

}
