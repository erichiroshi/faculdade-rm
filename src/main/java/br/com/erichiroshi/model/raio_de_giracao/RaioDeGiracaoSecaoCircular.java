package br.com.erichiroshi.model.raio_de_giracao;

import br.com.erichiroshi.model.Area.AreaSecaoCircular;
import br.com.erichiroshi.model.Inercia.InerciaSecaoCircular;

public abstract class RaioDeGiracaoSecaoCircular {

	public static double calculaRaioDeGiracaoEixoXX(double raio) {
		return Math.sqrt(InerciaSecaoCircular.calculaInerciaEixoXX(raio) / AreaSecaoCircular.calculaArea(raio));
	}

	public static double calculaRaioDeGiracaoEixoYY(double raio) {
		return Math.sqrt(InerciaSecaoCircular.calculaInerciaEixoYY(raio) / AreaSecaoCircular.calculaArea(raio));
	}
}
