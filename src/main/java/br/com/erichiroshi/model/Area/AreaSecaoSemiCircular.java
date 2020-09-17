package br.com.erichiroshi.model.Area;

public abstract class AreaSecaoSemiCircular {

	public static double calculaArea(double raio) {
		return AreaSecaoCircular.calculaArea(raio) / 2;
	}
}
