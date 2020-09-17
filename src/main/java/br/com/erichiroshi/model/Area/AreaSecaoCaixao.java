package br.com.erichiroshi.model.Area;

public abstract class AreaSecaoCaixao {

	public static double calculaArea(double larguraExterna, double alturaExterna, double larguraInterna,
			double alturaInterna) {
		return AreaSecaoRetangular.calculaArea(larguraExterna, alturaExterna)
				- AreaSecaoRetangular.calculaArea(larguraInterna, alturaInterna);
	}

}
