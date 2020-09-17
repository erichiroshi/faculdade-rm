package br.com.erichiroshi.model.raio_de_giracao;

import br.com.erichiroshi.model.Area.AreaSecaoI;
import br.com.erichiroshi.model.Inercia.InerciaSecaoI;

public abstract class RaioDeGiracaoSecaoI {

	public static double calculaRaioDeGiracaoEixoXX(double larguraAlma, double alturaAlma, double larguraAbaInferior,
			double alturaAbaInferior, double larguraAbaSuperior, double alturaAbaSuperior) {

		return Math.sqrt(InerciaSecaoI.calculaInerciaEixoXX(larguraAlma, alturaAlma, larguraAbaInferior,
				alturaAbaInferior, larguraAbaSuperior, alturaAbaSuperior)
				/ AreaSecaoI.calculaArea(larguraAlma, alturaAlma, larguraAbaInferior, alturaAbaInferior,
						larguraAbaSuperior, alturaAbaSuperior));
	}

	public static double calculaRaioDeGiracaoEixoYY(double larguraAlma, double alturaAlma, double larguraAbaInferior,
			double alturaAbaInferior, double larguraAbaSuperior, double alturaAbaSuperior) {

		return Math.sqrt(InerciaSecaoI.calculaInerciaEixoYY(larguraAlma, alturaAlma, larguraAbaInferior,
				alturaAbaInferior, larguraAbaSuperior, alturaAbaSuperior)
				/ AreaSecaoI.calculaArea(larguraAlma, alturaAlma, larguraAbaInferior, alturaAbaInferior,
						larguraAbaSuperior, alturaAbaSuperior));
	}
}
