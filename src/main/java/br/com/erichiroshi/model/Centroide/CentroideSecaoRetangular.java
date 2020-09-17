package br.com.erichiroshi.model.Centroide;

public abstract class CentroideSecaoRetangular {

	//y
	public static double calculaCentroideEixoXX(double largura, double altura) {
		return altura/2;
	}
	
	//x
	public static double calculaCentroideEixoYY(double largura, double altura) {
		return largura/2;
	}
}
