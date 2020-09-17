package br.com.erichiroshi.model.Inercia;

public abstract class InerciaSecaoTriangular {

	public static double calculaInerciaEixoXX(double base, double altura) {
		return (base * Math.pow(altura, 3)) / 36;
	}

	public static double calculaInerciaEixoYY(double base, double altura, double a) {
		return (altura * base / 36) * (Math.pow(base, 2) - a * base + Math.pow(a, 2));
	}
}
