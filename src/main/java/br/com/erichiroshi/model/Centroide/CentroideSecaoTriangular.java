package br.com.erichiroshi.model.Centroide;

public abstract class CentroideSecaoTriangular {

	// y
	public static double calculaCentroideEixoXX(double base, double altura) {
		return altura / 3;
	}

	// x
	public static double calculaCentroideEixoYY(double base, double altura, double a) {
		return (2 * base - a) / 3;
	}

}