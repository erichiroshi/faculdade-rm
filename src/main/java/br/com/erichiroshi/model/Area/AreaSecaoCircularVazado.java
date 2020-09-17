package br.com.erichiroshi.model.Area;

public abstract class AreaSecaoCircularVazado {

	public static double calculaArea(double raioExterno, double raioInterno) {
		return AreaSecaoCircular.calculaArea(raioExterno) - AreaSecaoCircular.calculaArea(raioInterno);
	}
}
