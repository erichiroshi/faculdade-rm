package br.com.erichiroshi.model.Inercia;

import br.com.erichiroshi.model.Area.AreaSecaoRetangular;
import br.com.erichiroshi.model.Centroide.CentroideSecaoC;

public abstract class InerciaSecaoC {

	// I = I + A.dy² dy=y.A/A
	public static double calculaInerciaEixoXX(double larguraAlma, double alturaAlma, double larguraAba, double alturaAba) {

		double areaAba = AreaSecaoRetangular.calculaArea(larguraAba, alturaAba);
		double dyAba = (alturaAlma / 2 + alturaAba) - alturaAba / 2;

		return 2 * (InerciaSecaoRetangular.calculaInerciaEixoXX(larguraAba, alturaAba) + areaAba * Math.pow(dyAba, 2))
				+ InerciaSecaoRetangular.calculaInerciaEixoXX(larguraAlma, alturaAlma);
	}

	// I = I + A.dx² x=x.A/A
	public static double calculaInerciaEixoYY(double larguraAlma, double alturaAlma, double larguraAba, double alturaAba) {
		double areaAlma = AreaSecaoRetangular.calculaArea(larguraAlma, alturaAlma);
		double areaAba = AreaSecaoRetangular.calculaArea(larguraAba, alturaAba);

		double x = CentroideSecaoC.calculaCentroideEixoYY(larguraAlma, alturaAlma, larguraAba, alturaAba);
		double dxAlma = x - larguraAlma / 2;
		double dxAba = larguraAba / 2 - x;

		return 2 * (InerciaSecaoRetangular.calculaInerciaEixoYY(larguraAba, alturaAba) + areaAba * Math.pow(dxAba, 2))
				+ InerciaSecaoRetangular.calculaInerciaEixoYY(larguraAlma, alturaAlma) + areaAlma * Math.pow(dxAlma, 2);
	}

}