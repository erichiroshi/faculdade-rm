package br.com.erichiroshi.model.Inercia;

public abstract class InerciaSecaoCircularVazado {

	public static double calculaInerciaEixoXX(double raioExterno, double raioInterno) {
		return InerciaSecaoCircular.calculaInerciaEixoXX(raioExterno)
				- InerciaSecaoCircular.calculaInerciaEixoXX(raioInterno);
	}

	public static double calculaInerciaEixoYY(double raioExterno, double raioInterno) {
		return InerciaSecaoCircular.calculaInerciaEixoXX(raioExterno)
				- InerciaSecaoCircular.calculaInerciaEixoXX(raioInterno);
	}

}
