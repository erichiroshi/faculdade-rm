package br.com.erichiroshi.model.momento_estatico;

import br.com.erichiroshi.model.Area.AreaSecaoCircularVazado;
import br.com.erichiroshi.model.Centroide.CentroideSecaoCircularVazado;

public abstract class MomentoEstaticoSecaoCircularVazado {

	// Qx = y.A
	public static double calculaMomentoEstaticoEixoXX(double raioExterno, double raioInterno) {
		double y = CentroideSecaoCircularVazado.calculaCentroideEixoXX(raioExterno, raioInterno);
		double area = AreaSecaoCircularVazado.calculaArea(raioExterno, raioInterno);

		return y * area;
	}

	// Qy = x.A
	public static double calculaMomentoEstaticoEixoYY(double raioExterno, double raioInterno) {
		double x = CentroideSecaoCircularVazado.calculaCentroideEixoXX(raioExterno, raioInterno);
		double area = AreaSecaoCircularVazado.calculaArea(raioExterno, raioInterno);

		return x * area;
	}
}
