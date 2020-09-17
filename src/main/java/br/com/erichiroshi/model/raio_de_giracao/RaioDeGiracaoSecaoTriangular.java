package br.com.erichiroshi.model.raio_de_giracao;

import br.com.erichiroshi.model.Area.AreaSecaoTriangular;
import br.com.erichiroshi.model.Inercia.InerciaSecaoTriangular;

public abstract class RaioDeGiracaoSecaoTriangular {

	public static double calculaRaioDeGiracaoEixoXX(double base, double altura) {
		return Math.sqrt(InerciaSecaoTriangular.calculaInerciaEixoXX(base, altura)/AreaSecaoTriangular.calculaArea(base, altura));
	}
	
	public static double calculaRaioDeGiracaoEixoYY(double base, double altura, double a) {
		return Math.sqrt(InerciaSecaoTriangular.calculaInerciaEixoYY(base, altura, a)
				/ AreaSecaoTriangular.calculaArea(base, altura));
	}
}
