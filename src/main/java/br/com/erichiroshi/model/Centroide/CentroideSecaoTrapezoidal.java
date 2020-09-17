package br.com.erichiroshi.model.Centroide;

public abstract class CentroideSecaoTrapezoidal {

	public static double calculaCentroidoEixoXX(double baseMaior, double baseMenor, double altura) {
		return ((2 * baseMenor + baseMaior) / (baseMenor + baseMaior)) * (altura / 3);
	}
}
