package br.com.erichiroshi.model.Area;

public abstract class AreaSecaoCircular {

	public static double calculaArea(double raio) {
		return Math.PI * Math.pow(raio, 2);
	}
}
