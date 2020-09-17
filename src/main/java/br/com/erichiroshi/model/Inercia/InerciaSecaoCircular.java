package br.com.erichiroshi.model.Inercia;

public abstract class InerciaSecaoCircular {

	private static final double PI = Math.PI;

	public static double calculaInerciaEixoXX(double raio) {
		return PI * Math.pow(raio, 4) / 4;
	}

	public static double calculaInerciaEixoYY(double raio) {
		return PI * Math.pow(raio, 4) / 4;
	}

}
