package br.com.erichiroshi.model.momento_estatico;

public abstract class MomentoEstaticoSecaoCircular {

	// Q = y.A
	public static double calculaMomentoEstaticoEixoXX(double raio) {

		return Math.PI * Math.pow(raio, 3);
	}

	// Q = y.A
	public static double calculaMomentoEstaticoEixoYY(double raio) {

		return Math.PI * Math.pow(raio, 3);
	}

}
