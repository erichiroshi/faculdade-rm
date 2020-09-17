package br.com.erichiroshi.teste;

import br.com.erichiroshi.model.Centroide.CentroideSecaoC;
import br.com.erichiroshi.model.Centroide.CentroideSecaoT;

public class TesteCentroide {

	public static void main(String[] args) {

		System.out.println(CentroideSecaoT.calculaCentroideEixoXX(2, 10, 8, 3));
		System.out.println(CentroideSecaoT.calculaCentroideEixoYY(2, 10, 8, 3));

		System.out.println(CentroideSecaoC.calculaCentroideEixoXX(10, 100, 40, 10));
		System.out.println(CentroideSecaoC.calculaCentroideEixoYY(10, 100, 40, 10));

	}
}
