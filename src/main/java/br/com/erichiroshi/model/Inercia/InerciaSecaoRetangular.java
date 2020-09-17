package br.com.erichiroshi.model.Inercia;

public abstract class InerciaSecaoRetangular {

	//I = I + A*dy²
	public static double calculaInerciaEixoXX(double largura, double altura) {
		return largura * Math.pow(altura, 3) / 12;
	}

	public static double calculaInerciaEixoYY(double largura, double altura) {
		return altura * Math.pow(largura, 3) / 12;
	}

}
