package br.com.erichiroshi.model.momento_estatico;

import br.com.erichiroshi.model.Area.AreaSecaoCaixao;
import br.com.erichiroshi.model.Centroide.CentroideSecaoCaixao;

public abstract class MomentoEstaticoSecaoCaixao {

	// Qx = y.A
	public static double calculaMomentoEstaticoEixoXX(double larguraExterna, double alturaExterna,
			double larguraInterna, double alturaInterna) {

		double y = CentroideSecaoCaixao.calculaCentroideEixoXX(larguraExterna, alturaExterna, larguraInterna,
				alturaInterna);
		double area = AreaSecaoCaixao.calculaArea(larguraExterna, alturaExterna, larguraInterna, alturaInterna);
		return y * area;

	}

	// Qy = x.A
	public static double calculaMomentoEstaticoEixoYY(double larguraExterna, double alturaExterna,
			double larguraInterna, double alturaInterna) {

		double x = CentroideSecaoCaixao.calculaCentroideEixoYY(larguraExterna, alturaExterna, larguraInterna,
				alturaInterna);
		double area = AreaSecaoCaixao.calculaArea(larguraExterna, alturaExterna, larguraInterna, alturaInterna);
		return x * area;
	}

}

