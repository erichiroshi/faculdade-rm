package br.com.erichiroshi.model.raio_de_giracao;

import br.com.erichiroshi.model.Area.AreaSecaoRetangular;
import br.com.erichiroshi.model.Inercia.InerciaSecaoRetangular;

public abstract class RaioDeGiracaoSecaoRetangular {

	public static double calculaRaioDeGiracaoEixoXX(double largura, double altura) {
		return Math.sqrt(InerciaSecaoRetangular.calculaInerciaEixoXX(largura, altura)/AreaSecaoRetangular.calculaArea(largura, altura));
	}
	
	public static double calculaRaioDeGiracaoEixoYY(double largura, double altura) {
		return Math.sqrt(InerciaSecaoRetangular.calculaInerciaEixoYY(largura, altura)/AreaSecaoRetangular.calculaArea(largura, altura));
	}
}
