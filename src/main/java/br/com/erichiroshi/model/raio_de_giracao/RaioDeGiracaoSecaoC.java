package br.com.erichiroshi.model.raio_de_giracao;

import br.com.erichiroshi.model.Area.AreaSecaoC;
import br.com.erichiroshi.model.Inercia.InerciaSecaoC;

public abstract class RaioDeGiracaoSecaoC {

	public static double calculaRaioDeGiracaoEixoXX(double larguraAlma, double alturaAlma, double larguraAba, double alturaAba) {

		return Math.sqrt(InerciaSecaoC.calculaInerciaEixoXX(larguraAlma, alturaAlma, larguraAba, alturaAba)
				/ AreaSecaoC.calculaArea(larguraAlma, alturaAlma, larguraAba, alturaAba));
	}

	public static double calculaRaioDeGiracaoEixoYY(double larguraAlma, double alturaAlma, double larguraAba, double alturaAba) {

		return Math.sqrt(InerciaSecaoC.calculaInerciaEixoYY(larguraAlma, alturaAlma, larguraAba, alturaAba)
				/ AreaSecaoC.calculaArea(larguraAlma, alturaAlma, larguraAba, alturaAba));
	}
}
