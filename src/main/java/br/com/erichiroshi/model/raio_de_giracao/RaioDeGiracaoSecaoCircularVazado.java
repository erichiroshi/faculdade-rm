package br.com.erichiroshi.model.raio_de_giracao;

import br.com.erichiroshi.model.Area.AreaSecaoCircularVazado;
import br.com.erichiroshi.model.Inercia.InerciaSecaoCircularVazado;

public abstract class RaioDeGiracaoSecaoCircularVazado {

	public static double calculaRaioDeGiracaoEixoXX(double raioExterno, double raioInterno) {
		return Math.sqrt(InerciaSecaoCircularVazado.calculaInerciaEixoXX(raioExterno, raioInterno)
				/ AreaSecaoCircularVazado.calculaArea(raioExterno, raioInterno));
	}

	public static double calculaRaioDeGiracaoEixoYY(double raioExterno, double raioInterno) {
		return Math.sqrt(InerciaSecaoCircularVazado.calculaInerciaEixoYY(raioExterno, raioInterno)
				/ AreaSecaoCircularVazado.calculaArea(raioExterno, raioInterno));
	}
}
