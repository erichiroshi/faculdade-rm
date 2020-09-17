package br.com.erichiroshi.model.momento_estatico;

import br.com.erichiroshi.model.Area.AreaSecaoRetangular;

public abstract class MomentoEstaticoSecaoRetangular {

	// Qx = y.A
	public static double calculaMomentoEstaticoEixoXX(double largura, double altura) {
		double area = AreaSecaoRetangular.calculaArea(largura, altura);
		return (altura / 2) * area;
	}

	// Qy = x.A
	public static double calculaMomentoEstaticoEixoYY(double largura, double altura) {
		double area = AreaSecaoRetangular.calculaArea(largura, altura);
		return (largura / 2) * area;
	}

}
