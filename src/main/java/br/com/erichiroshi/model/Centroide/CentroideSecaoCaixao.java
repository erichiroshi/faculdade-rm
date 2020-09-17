package br.com.erichiroshi.model.Centroide;

public abstract class CentroideSecaoCaixao {

	// y
	public static double calculaCentroideEixoXX(double larguraExterna, double alturaExterna, double larguraInterna,
			double alturaInterna) {

		return alturaExterna / 2;
	}

	// x
	public static double calculaCentroideEixoYY(double larguraExterna, double alturaExterna, double larguraInterna,
			double alturaInterna) {

		return larguraExterna / 2;
	}
}
