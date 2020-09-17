package br.com.erichiroshi.model.Area;

public abstract class AreaSecaoL {

	public static double calculaArea(double larguraAlma, double alturaAlma, double larguraAba, double alturaAba) {
		return AreaSecaoRetangular.calculaArea(larguraAlma, alturaAlma)
				+ AreaSecaoRetangular.calculaArea(larguraAba, alturaAba);
	}
}
