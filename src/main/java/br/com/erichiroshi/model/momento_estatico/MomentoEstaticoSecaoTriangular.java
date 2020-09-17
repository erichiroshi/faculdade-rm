package br.com.erichiroshi.model.momento_estatico;

public abstract class MomentoEstaticoSecaoTriangular {

	// Qx = y.A
	public static double calculaMomentoEstaticoEixoXX(double base, double altura) {

		return (base * Math.pow(altura, 2)) / 6;
	}

	// Qy = y.A
	public static double calculaMomentoEstaticoEixoYY(double base, double altura, double a) {

		return (2 * base - a) * altura * base / 6;
	}

}
