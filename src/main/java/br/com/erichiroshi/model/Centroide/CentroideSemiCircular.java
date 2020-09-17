package br.com.erichiroshi.model.Centroide;

public abstract class CentroideSemiCircular {

	public static double calculaCentroideSemiCircular(double raio) {
		return (4 * raio) / (3 * Math.PI);
	}

}
