package br.com.erichiroshi.model.raio_de_giracao;

import br.com.erichiroshi.model.Area.AreaSecaoL;
import br.com.erichiroshi.model.Inercia.InerciaSecaoL;

public abstract class RaioDeGiracaoSecaoL {

	public static double calculaRaioDeGiracaoEixoXX(double larguraAlma, double alturaAlma, double larguraAba,
			double alturaAba) {

		return Math.sqrt(InerciaSecaoL.calculaInerciaEixoXX(larguraAlma, alturaAlma, larguraAba, alturaAba)
				/ AreaSecaoL.calculaArea(larguraAlma, alturaAlma, larguraAba, alturaAba));
	}

	public static double calculaRaioDeGiracaoEixoYY(double larguraAlma, double alturaAlma, double larguraAba,
			double alturaAba) {

		return Math.sqrt(InerciaSecaoL.calculaInerciaEixoYY(larguraAlma, alturaAlma, larguraAba, alturaAba)
				/ AreaSecaoL.calculaArea(larguraAlma, alturaAlma, larguraAba, alturaAba));
	}
}
