package br.com.erichiroshi.model.Area;

public abstract class AreaSecaoTrapezoidal {

	public static double calculaArea(double baseMaior, double baseMenor, double altura) {
		return (baseMaior + baseMenor) * altura / 2;
	}

}
