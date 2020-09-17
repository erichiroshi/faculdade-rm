package br.com.erichiroshi.model.momento_estatico;

public abstract class MomentoEstaticoSecaoSemiCircular {

	// Q = y.A
	public static double calculaMomentoEstaticoEixoXX(double raioExterno, double raioInterno) {

		return MomentoEstaticoSecaoCircular.calculaMomentoEstaticoEixoXX(raioExterno)
				- MomentoEstaticoSecaoCircular.calculaMomentoEstaticoEixoXX(raioInterno);
	}

	// Q = y.A
	public static double calculaMomentoEstaticoEixoYY(double raioExterno, double raioInterno) {

		return MomentoEstaticoSecaoCircular.calculaMomentoEstaticoEixoYY(raioExterno)
				- MomentoEstaticoSecaoCircular.calculaMomentoEstaticoEixoYY(raioInterno);
	}

}
