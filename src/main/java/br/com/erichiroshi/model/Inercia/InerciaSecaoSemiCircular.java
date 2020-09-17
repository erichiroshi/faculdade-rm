package br.com.erichiroshi.model.Inercia;

public abstract class InerciaSecaoSemiCircular {

	public static double calculaInerciaEixoXX(double raio) {
		return InerciaSecaoCircular.calculaInerciaEixoXX(raio) / 2;
	}

	public static double calculaInerciaEixoYY(double raio) {
		return InerciaSecaoCircular.calculaInerciaEixoYY(raio) / 2;
	}
}
