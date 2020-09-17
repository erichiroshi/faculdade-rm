package br.com.erichiroshi.model.Area;

public abstract class AreaSecaoC {

	public static double calculaArea(double larguraAlma, double alturaAlma, double larguraAba, double alturaAba) {
		
		return AreaSecaoRetangular.calculaArea(larguraAlma, alturaAlma)
				+ 2 * AreaSecaoRetangular.calculaArea(larguraAba, alturaAba);
	}
}
