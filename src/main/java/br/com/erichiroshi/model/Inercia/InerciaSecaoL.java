package br.com.erichiroshi.model.Inercia;

import br.com.erichiroshi.model.Area.AreaSecaoRetangular;
import br.com.erichiroshi.model.Centroide.CentroideSecaoL;

public abstract class InerciaSecaoL {

	// I = b.h³/12 + Ady² y = y.A/A
	public static double calculaInerciaEixoXX(double larguraAlma, double alturaAlma, double larguraAba,
			double alturaAba) {

		double areaAlma = AreaSecaoRetangular.calculaArea(larguraAlma, alturaAlma);
		double areaAba = AreaSecaoRetangular.calculaArea(larguraAba, alturaAba);
		double yc = CentroideSecaoL.calculaCentroideEixoXX(larguraAlma, alturaAlma, larguraAba, alturaAba);
		double dyAba = yc - alturaAba / 2;
		double dyAlma = (alturaAlma / 2 + alturaAba) - yc;

		return InerciaSecaoRetangular.calculaInerciaEixoXX(larguraAba, alturaAba) + areaAba * Math.pow(dyAba, 2)
				+ InerciaSecaoRetangular.calculaInerciaEixoXX(larguraAlma, alturaAlma) + areaAlma * Math.pow(dyAlma, 2);
	}

	public static double calculaInerciaEixoYY(double larguraAlma, double alturaAlma, double larguraAba,
			double alturaAba) {

		double areaAlma = AreaSecaoRetangular.calculaArea(larguraAlma, alturaAlma);
		double areaAba = AreaSecaoRetangular.calculaArea(larguraAba, alturaAba);
		double xc = CentroideSecaoL.calculaCentroideEixoYY(larguraAlma, alturaAlma, larguraAba, alturaAba);
		double dxAba = larguraAba / 2 - xc;
		double dxAlma = xc - larguraAlma / 2;

		return InerciaSecaoRetangular.calculaInerciaEixoYY(larguraAba, alturaAba) + areaAba * Math.pow(dxAba, 2)
				+ InerciaSecaoRetangular.calculaInerciaEixoYY(larguraAlma, alturaAlma) + areaAlma * Math.pow(dxAlma, 2);
	}

}
