package br.com.erichiroshi.model.raio_de_giracao;

import br.com.erichiroshi.model.Area.AreaSecaoT;
import br.com.erichiroshi.model.Inercia.InerciaSecaoT;

public abstract class RaioDeGiracaoSecaoT {

	public static double calculaRaioDeGiracaoEixoXX(double larguraAlma, double alturaAlma, double larguraAba,
			double alturaAba) {

		return Math.sqrt(InerciaSecaoT.calculaInerciaEixoXX(larguraAlma, alturaAlma, larguraAba, alturaAba)
				/ AreaSecaoT.calculaArea(larguraAlma, alturaAlma, larguraAba, alturaAba));
	}

	public static double calculaRaioDeGiracaoEixoYY(double larguraAlma, double alturaAlma, double larguraAba,
			double alturaAba) {

		return Math.sqrt(InerciaSecaoT.calculaInerciaEixoYY(larguraAlma, alturaAlma, larguraAba, alturaAba)
				/ AreaSecaoT.calculaArea(larguraAlma, alturaAlma, larguraAba, alturaAba));
	}
}
