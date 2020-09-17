package br.com.erichiroshi.model.Area;

public abstract class AreaSecaoT {

	public static double calculaArea(double larguraAlma, double alturaAlma, double larguraAba, double alturaAba) {
		
		return AreaSecaoRetangular.calculaArea(larguraAlma, alturaAlma)
				+ AreaSecaoRetangular.calculaArea(larguraAba, alturaAba);
	}
}
