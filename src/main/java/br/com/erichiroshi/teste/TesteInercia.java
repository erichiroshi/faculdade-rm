package br.com.erichiroshi.teste;

import br.com.erichiroshi.model.Centroide.CentroideSecaoC;
import br.com.erichiroshi.model.Inercia.InerciaSecaoC;
import br.com.erichiroshi.model.Inercia.InerciaSecaoCaixao;
import br.com.erichiroshi.model.Inercia.InerciaSecaoCircular;
import br.com.erichiroshi.model.Inercia.InerciaSecaoCircularVazado;
import br.com.erichiroshi.model.Inercia.InerciaSecaoI;
import br.com.erichiroshi.model.Inercia.InerciaSecaoRetangular;
import br.com.erichiroshi.model.Inercia.InerciaSecaoT;

public class TesteInercia {

	public static void main(String[] args) {

		System.out.println(InerciaSecaoRetangular.calculaInerciaEixoXX(10d, 15d));
		System.out.println(InerciaSecaoRetangular.calculaInerciaEixoYY(10d, 15d));
		System.out.println();
		System.out.println(InerciaSecaoI.calculaInerciaEixoXX(25, 250, 125, 30, 200, 30));
		System.out.println(InerciaSecaoI.calculaInerciaEixoYY(25, 250, 125, 30, 200, 30));
		System.out.println();
		System.out.println(InerciaSecaoCaixao.calculaInerciaEixoXX(240, 230, 200, 200));
		System.out.println(InerciaSecaoCaixao.calculaInerciaEixoYY(240, 230, 200, 200));
		System.out.println();
		System.out.println(InerciaSecaoCircular.calculaInerciaEixoXX(5));
		System.out.println(InerciaSecaoCircular.calculaInerciaEixoYY(5));
		System.out.println();
		System.out.println(InerciaSecaoCircularVazado.calculaInerciaEixoXX(5, 2));
		System.out.println(InerciaSecaoCircularVazado.calculaInerciaEixoYY(5, 2));
		System.out.println();
		System.out.println(InerciaSecaoC.calculaInerciaEixoXX(10, 100, 40, 10));
		System.out.println(InerciaSecaoC.calculaInerciaEixoYY(10, 100, 40, 10));
		System.out.println();
		System.out.println(InerciaSecaoT.calculaInerciaEixoXX(40, 60, 80, 20));
		System.out.println(InerciaSecaoT.calculaInerciaEixoYY(40, 60, 80, 20));

		System.out.println();
		System.out.println(CentroideSecaoC.calculaCentroideEixoXX(1, 9, 10.5, 1));
		System.out.println(CentroideSecaoC.calculaCentroideEixoYY(1, 9, 10.5, 1));
		System.out.println();
		System.out.println(InerciaSecaoC.calculaInerciaEixoXX(1, 9, 10.5, 1));
		System.out.println(InerciaSecaoC.calculaInerciaEixoYY(1, 9, 10.5, 1));
	}
}
