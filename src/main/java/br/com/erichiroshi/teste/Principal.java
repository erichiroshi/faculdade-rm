package br.com.erichiroshi.teste;

import br.com.erichiroshi.model.Area.AreaSecaoC;
import br.com.erichiroshi.model.Area.AreaSecaoCaixao;
import br.com.erichiroshi.model.Area.AreaSecaoCircular;
import br.com.erichiroshi.model.Area.AreaSecaoCircularVazado;
import br.com.erichiroshi.model.Area.AreaSecaoI;
import br.com.erichiroshi.model.Area.AreaSecaoL;
import br.com.erichiroshi.model.Area.AreaSecaoRetangular;
import br.com.erichiroshi.model.Area.AreaSecaoT;
import br.com.erichiroshi.model.Area.AreaSecaoTriangular;
import br.com.erichiroshi.model.Centroide.CentroideSecaoC;
import br.com.erichiroshi.model.Centroide.CentroideSecaoCaixao;
import br.com.erichiroshi.model.Centroide.CentroideSecaoCircular;
import br.com.erichiroshi.model.Centroide.CentroideSecaoCircularVazado;
import br.com.erichiroshi.model.Centroide.CentroideSecaoI;
import br.com.erichiroshi.model.Centroide.CentroideSecaoL;
import br.com.erichiroshi.model.Centroide.CentroideSecaoRetangular;
import br.com.erichiroshi.model.Centroide.CentroideSecaoT;
import br.com.erichiroshi.model.Centroide.CentroideSecaoTriangular;
import br.com.erichiroshi.model.Inercia.InerciaSecaoC;
import br.com.erichiroshi.model.Inercia.InerciaSecaoCaixao;
import br.com.erichiroshi.model.Inercia.InerciaSecaoCircular;
import br.com.erichiroshi.model.Inercia.InerciaSecaoCircularVazado;
import br.com.erichiroshi.model.Inercia.InerciaSecaoI;
import br.com.erichiroshi.model.Inercia.InerciaSecaoL;
import br.com.erichiroshi.model.Inercia.InerciaSecaoRetangular;
import br.com.erichiroshi.model.Inercia.InerciaSecaoT;
import br.com.erichiroshi.model.Inercia.InerciaSecaoTriangular;
import br.com.erichiroshi.model.entidade.Secao;
import br.com.erichiroshi.model.entidade.SecaoC;
import br.com.erichiroshi.model.entidade.SecaoCaixao;
import br.com.erichiroshi.model.entidade.SecaoCircular;
import br.com.erichiroshi.model.entidade.SecaoCircularVazado;
import br.com.erichiroshi.model.entidade.SecaoI;
import br.com.erichiroshi.model.entidade.SecaoL;
import br.com.erichiroshi.model.entidade.SecaoRetangular;
import br.com.erichiroshi.model.entidade.SecaoT;
import br.com.erichiroshi.model.entidade.SecaoTriangular;
import br.com.erichiroshi.model.momento_estatico.MomentoEstaticoSecaoC;
import br.com.erichiroshi.model.momento_estatico.MomentoEstaticoSecaoCaixao;
import br.com.erichiroshi.model.momento_estatico.MomentoEstaticoSecaoCircular;
import br.com.erichiroshi.model.momento_estatico.MomentoEstaticoSecaoCircularVazado;
import br.com.erichiroshi.model.momento_estatico.MomentoEstaticoSecaoI;
import br.com.erichiroshi.model.momento_estatico.MomentoEstaticoSecaoL;
import br.com.erichiroshi.model.momento_estatico.MomentoEstaticoSecaoRetangular;
import br.com.erichiroshi.model.momento_estatico.MomentoEstaticoSecaoT;
import br.com.erichiroshi.model.momento_estatico.MomentoEstaticoSecaoTriangular;
import br.com.erichiroshi.model.raio_de_giracao.RaioDeGiracaoSecaoC;
import br.com.erichiroshi.model.raio_de_giracao.RaioDeGiracaoSecaoCaixao;
import br.com.erichiroshi.model.raio_de_giracao.RaioDeGiracaoSecaoCircular;
import br.com.erichiroshi.model.raio_de_giracao.RaioDeGiracaoSecaoCircularVazado;
import br.com.erichiroshi.model.raio_de_giracao.RaioDeGiracaoSecaoI;
import br.com.erichiroshi.model.raio_de_giracao.RaioDeGiracaoSecaoL;
import br.com.erichiroshi.model.raio_de_giracao.RaioDeGiracaoSecaoRetangular;
import br.com.erichiroshi.model.raio_de_giracao.RaioDeGiracaoSecaoT;
import br.com.erichiroshi.model.raio_de_giracao.RaioDeGiracaoSecaoTriangular;

public class Principal {

	public static void main(String[] args) {

		System.out.println("Secão Retangular");
		double largura = 0.20;
		double altura = 0.25;
		System.out.println("Área: " + AreaSecaoRetangular.calculaArea(largura, altura));
		System.out.println("X:  " + CentroideSecaoRetangular.calculaCentroideEixoYY(largura, altura));
		System.out.println("Y:  " + CentroideSecaoRetangular.calculaCentroideEixoXX(largura, altura));
		System.out.println("Qx: " + MomentoEstaticoSecaoRetangular.calculaMomentoEstaticoEixoXX(largura, altura));
		System.out.println("Qy: " + MomentoEstaticoSecaoRetangular.calculaMomentoEstaticoEixoYY(largura, altura));
		System.out.println("Ix: " + InerciaSecaoRetangular.calculaInerciaEixoXX(largura, altura));
		System.out.println("Iy: " + InerciaSecaoRetangular.calculaInerciaEixoYY(largura, altura));
		System.out.println("Kx: " + RaioDeGiracaoSecaoRetangular.calculaRaioDeGiracaoEixoXX(largura, altura));
		System.out.println("Ky: " + RaioDeGiracaoSecaoRetangular.calculaRaioDeGiracaoEixoYY(largura, altura));
		System.out.println();

		SecaoRetangular r = new SecaoRetangular(largura, altura);
		escreveSecao(r);

		System.out.println("Seção Caixão");
		double larguraExterna = 21;
		double alturaExterna = 25;
		double larguraInterna = 15;
		double alturaInterna = 19;
		System.out.println(
				"Área: " + AreaSecaoCaixao.calculaArea(larguraExterna, alturaExterna, larguraInterna, alturaInterna));
		System.out.println("X:  " + CentroideSecaoCaixao.calculaCentroideEixoYY(larguraExterna, alturaExterna,
				larguraInterna, alturaInterna));
		System.out.println("Y:  " + CentroideSecaoCaixao.calculaCentroideEixoXX(larguraExterna, alturaExterna,
				larguraInterna, alturaInterna));
		System.out.println("Qx: " + MomentoEstaticoSecaoCaixao.calculaMomentoEstaticoEixoXX(larguraExterna,
				alturaExterna, larguraInterna, alturaInterna));
		System.out.println("Qy: " + MomentoEstaticoSecaoCaixao.calculaMomentoEstaticoEixoYY(larguraExterna,
				alturaExterna, larguraInterna, alturaInterna));
		System.out.println("Ix: " + InerciaSecaoCaixao.calculaInerciaEixoXX(larguraExterna, alturaExterna,
				larguraInterna, alturaInterna));
		System.out.println("Iy: " + InerciaSecaoCaixao.calculaInerciaEixoYY(larguraExterna, alturaExterna,
				larguraInterna, alturaInterna));
		System.out.println("Kx: " + RaioDeGiracaoSecaoCaixao.calculaRaioDeGiracaoEixoXX(larguraExterna, alturaExterna,
				larguraInterna, alturaInterna));
		System.out.println("Ky: " + RaioDeGiracaoSecaoCaixao.calculaRaioDeGiracaoEixoYY(larguraExterna, alturaExterna,
				larguraInterna, alturaInterna));
		System.out.println();

		SecaoCaixao caixao = new SecaoCaixao(larguraExterna, alturaExterna, larguraInterna, alturaInterna);
		escreveSecao(caixao);

		System.out.println("Seção Circular");
		double raio = 30;
		System.out.println("Área: " + AreaSecaoCircular.calculaArea(raio));
		System.out.println("X:  " + CentroideSecaoCircular.calculaCentroideEixoYY(raio));
		System.out.println("Y:  " + CentroideSecaoCircular.calculaCentroideEixoXX(raio));
		System.out.println("Qx: " + MomentoEstaticoSecaoCircular.calculaMomentoEstaticoEixoXX(raio));
		System.out.println("Qy: " + MomentoEstaticoSecaoCircular.calculaMomentoEstaticoEixoYY(raio));
		System.out.println("Ix: " + InerciaSecaoCircular.calculaInerciaEixoXX(raio));
		System.out.println("Iy: " + InerciaSecaoCircular.calculaInerciaEixoYY(raio));
		System.out.println("Kx: " + RaioDeGiracaoSecaoCircular.calculaRaioDeGiracaoEixoXX(raio));
		System.out.println("Ky: " + RaioDeGiracaoSecaoCircular.calculaRaioDeGiracaoEixoYY(raio));
		System.out.println();

		SecaoCircular circular = new SecaoCircular(raio);
		escreveSecao(circular);

		System.out.println("Seção Circular Vazado");
		double raioExterno = 7.5;
		double raioInterno = 7.0;
		System.out.println("Área: " + AreaSecaoCircularVazado.calculaArea(raioExterno, raioInterno));
		System.out.println("X:  " + CentroideSecaoCircularVazado.calculaCentroideEixoYY(raioExterno, raioInterno));
		System.out.println("Y:  " + CentroideSecaoCircularVazado.calculaCentroideEixoXX(raioExterno, raioInterno));
		System.out.println(
				"Qx: " + MomentoEstaticoSecaoCircularVazado.calculaMomentoEstaticoEixoXX(raioExterno, raioInterno));
		System.out.println(
				"Qy: " + MomentoEstaticoSecaoCircularVazado.calculaMomentoEstaticoEixoYY(raioExterno, raioInterno));
		System.out.println("Ix: " + InerciaSecaoCircularVazado.calculaInerciaEixoXX(raioExterno, raioInterno));
		System.out.println("Iy: " + InerciaSecaoCircularVazado.calculaInerciaEixoYY(raioExterno, raioInterno));
		System.out.println(
				"Kx: " + RaioDeGiracaoSecaoCircularVazado.calculaRaioDeGiracaoEixoXX(raioExterno, raioInterno));
		System.out.println(
				"Ky: " + RaioDeGiracaoSecaoCircularVazado.calculaRaioDeGiracaoEixoYY(raioExterno, raioInterno));
		System.out.println();

		SecaoCircularVazado cv = new SecaoCircularVazado(raioExterno, raioInterno);
		escreveSecao(cv);

		System.out.println("Seção Triangular");
		double alturaTriangulo = 250;
		double baseTriangulo = 200;
		double aTriangulo = 75;
		System.out.println("Área: " + AreaSecaoTriangular.calculaArea(baseTriangulo, alturaTriangulo));
		System.out.println(
				"X:  " + CentroideSecaoTriangular.calculaCentroideEixoYY(baseTriangulo, alturaTriangulo, aTriangulo));
		System.out.println("Y:  " + CentroideSecaoTriangular.calculaCentroideEixoXX(baseTriangulo, alturaTriangulo));
		System.out.println(
				"Qx: " + MomentoEstaticoSecaoTriangular.calculaMomentoEstaticoEixoXX(baseTriangulo, alturaTriangulo));
		System.out.println("Qy: " + MomentoEstaticoSecaoTriangular.calculaMomentoEstaticoEixoYY(baseTriangulo,
				alturaTriangulo, aTriangulo));
		System.out.println("Ix: " + InerciaSecaoTriangular.calculaInerciaEixoXX(baseTriangulo, alturaTriangulo));
		System.out.println(
				"Iy: " + InerciaSecaoTriangular.calculaInerciaEixoYY(baseTriangulo, alturaTriangulo, aTriangulo));
		System.out.println(
				"Kx: " + RaioDeGiracaoSecaoTriangular.calculaRaioDeGiracaoEixoXX(baseTriangulo, alturaTriangulo));
		System.out.println("Ky: "
				+ RaioDeGiracaoSecaoTriangular.calculaRaioDeGiracaoEixoYY(baseTriangulo, alturaTriangulo, aTriangulo));
		System.out.println();

		SecaoTriangular tri = new SecaoTriangular(baseTriangulo, alturaTriangulo, aTriangulo);
		escreveSecao(tri);

		System.out.println("Seção I");
		double larguraAlma = 0.5;
		double alturaAlma = 6;
		double larguraAbaInferior = 8;
		double alturaAbaInferior = 0.5;
		double larguraAbaSuperior = 8;
		double alturaAbaSuperior = 0.5;
		System.out.println("Área: " + AreaSecaoI.calculaArea(larguraAlma, alturaAlma, larguraAbaInferior,
				alturaAbaInferior, larguraAbaSuperior, alturaAbaSuperior));
		System.out.println("X:  " + CentroideSecaoI.calculaCentroideEixoYY(larguraAlma, alturaAlma, larguraAbaInferior,
				alturaAbaInferior, larguraAbaSuperior, alturaAbaSuperior));
		System.out.println("Y:  " + CentroideSecaoI.calculaCentroideEixoXX(larguraAlma, alturaAlma, larguraAbaInferior,
				alturaAbaInferior, larguraAbaSuperior, alturaAbaSuperior));
		System.out.println("Qx: " + MomentoEstaticoSecaoI.calculaMomentoEstaticoEixoXX(larguraAlma, alturaAlma,
				larguraAbaInferior, alturaAbaInferior, larguraAbaSuperior, alturaAbaSuperior));
		System.out.println("Qy: " + MomentoEstaticoSecaoI.calculaMomentoEstaticoEixoYY(larguraAlma, alturaAlma,
				larguraAbaInferior, alturaAbaInferior, larguraAbaSuperior, alturaAbaSuperior));
		System.out.println("Ix: " + InerciaSecaoI.calculaInerciaEixoXX(larguraAlma, alturaAlma, larguraAbaInferior,
				alturaAbaInferior, larguraAbaSuperior, alturaAbaSuperior));
		System.out.println("Iy: " + InerciaSecaoI.calculaInerciaEixoYY(larguraAlma, alturaAlma, larguraAbaInferior,
				alturaAbaInferior, larguraAbaSuperior, alturaAbaSuperior));
		System.out.println("Kx: " + RaioDeGiracaoSecaoI.calculaRaioDeGiracaoEixoXX(larguraAlma, alturaAlma,
				larguraAbaInferior, alturaAbaInferior, larguraAbaSuperior, alturaAbaSuperior));
		System.out.println("Ky: " + RaioDeGiracaoSecaoI.calculaRaioDeGiracaoEixoYY(larguraAlma, alturaAlma,
				larguraAbaInferior, alturaAbaInferior, larguraAbaSuperior, alturaAbaSuperior));
		System.out.println();

		Secao i = new SecaoI(larguraAlma, alturaAlma, larguraAbaInferior, alturaAbaInferior, larguraAbaSuperior,
				alturaAbaSuperior);
		escreveSecao(i);

		System.out.println("Seção T");
		double larguraAlmaT = 0.03;
		double alturaAlmaT = 0.2;
		double larguraAbaT = 0.2;
		double alturaAbaT = 0.03;
		System.out.println("Área: " + AreaSecaoT.calculaArea(larguraAlmaT, alturaAlmaT, larguraAbaT, alturaAbaT));
		System.out.println(
				"X:  " + CentroideSecaoT.calculaCentroideEixoYY(larguraAlmaT, alturaAlmaT, larguraAbaT, alturaAbaT));
		System.out.println(
				"Y:  " + CentroideSecaoT.calculaCentroideEixoXX(larguraAlmaT, alturaAlmaT, larguraAbaT, alturaAbaT));
		System.out.println("Qx: " + MomentoEstaticoSecaoT.calculaMomentoEstaticoEixoXX(larguraAlmaT, alturaAlmaT,
				larguraAbaT, alturaAbaT));
		System.out.println("Qy: " + MomentoEstaticoSecaoT.calculaMomentoEstaticoEixoYY(larguraAlmaT, alturaAlmaT,
				larguraAbaT, alturaAbaT));
		System.out.println(
				"Ix: " + InerciaSecaoT.calculaInerciaEixoXX(larguraAlmaT, alturaAlmaT, larguraAbaT, alturaAbaT));
		System.out.println(
				"Iy: " + InerciaSecaoT.calculaInerciaEixoYY(larguraAlmaT, alturaAlmaT, larguraAbaT, alturaAbaT));
		System.out.println("Kx: "
				+ RaioDeGiracaoSecaoT.calculaRaioDeGiracaoEixoXX(larguraAlmaT, alturaAlmaT, larguraAbaT, alturaAbaT));
		System.out.println("Ky: "
				+ RaioDeGiracaoSecaoT.calculaRaioDeGiracaoEixoYY(larguraAlmaT, alturaAlmaT, larguraAbaT, alturaAbaT));
		System.out.println();

		Secao t = new SecaoT(larguraAlmaT, alturaAlmaT, larguraAbaT, alturaAbaT);
		escreveSecao(t);

		System.out.println("Seção L");
		double larguraAlmaL = 1;
		double alturaAlmaL = 4;
		double larguraAbaL = 4;
		double alturaAbaL = 1;
		System.out.println("Área: " + AreaSecaoL.calculaArea(larguraAlmaL, alturaAlmaL, larguraAbaL, alturaAbaL));
		System.out.println(
				"X:  " + CentroideSecaoL.calculaCentroideEixoYY(larguraAlmaL, alturaAlmaL, larguraAbaL, alturaAbaL));
		System.out.println(
				"Y:  " + CentroideSecaoL.calculaCentroideEixoXX(larguraAlmaL, alturaAlmaL, larguraAbaL, alturaAbaL));
		System.out.println("Qx: " + MomentoEstaticoSecaoL.calculaMomentoEstaticoEixoXX(larguraAlmaL, alturaAlmaL,
				larguraAbaL, alturaAbaL));
		System.out.println("Qy: " + MomentoEstaticoSecaoL.calculaMomentoEstaticoEixoYY(larguraAlmaL, alturaAlmaL,
				larguraAbaL, alturaAbaL));
		System.out.println(
				"Ix: " + InerciaSecaoL.calculaInerciaEixoXX(larguraAlmaL, alturaAlmaL, larguraAbaL, alturaAbaL));
		System.out.println(
				"Iy: " + InerciaSecaoL.calculaInerciaEixoYY(larguraAlmaL, alturaAlmaL, larguraAbaL, alturaAbaL));
		System.out.println("Kx: "
				+ RaioDeGiracaoSecaoL.calculaRaioDeGiracaoEixoXX(larguraAlmaL, alturaAlmaL, larguraAbaL, alturaAbaL));
		System.out.println("Ky: "
				+ RaioDeGiracaoSecaoL.calculaRaioDeGiracaoEixoYY(larguraAlmaL, alturaAlmaL, larguraAbaL, alturaAbaL));
		System.out.println();

		Secao l = new SecaoL(larguraAlmaL, alturaAlmaL, larguraAbaL, alturaAbaL);
		escreveSecao(l);

		System.out.println("Seção C");
		double larguraAlmaC = 0.1;
		double alturaAlmaC = 1.1;
		double larguraAbaC = 0.75;
		double alturaAbaC = 0.1;
		System.out.println("Área: " + AreaSecaoC.calculaArea(larguraAlmaC, alturaAlmaC, larguraAbaC, alturaAbaC));
		System.out.println(
				"X:  " + CentroideSecaoC.calculaCentroideEixoYY(larguraAlmaC, alturaAlmaC, larguraAbaC, alturaAbaC));
		System.out.println(
				"Y:  " + CentroideSecaoC.calculaCentroideEixoXX(larguraAlmaC, alturaAlmaC, larguraAbaC, alturaAbaC));
		System.out.println("Qx: " + MomentoEstaticoSecaoC.calculaMomentoEstaticoEixoXX(larguraAlmaC, alturaAlmaC,
				larguraAbaC, alturaAbaC, larguraAbaC, alturaAbaC));
		System.out.println("Qy: " + MomentoEstaticoSecaoC.calculaMomentoEstaticoEixoYY(larguraAlmaC, alturaAlmaC,
				larguraAbaC, alturaAbaC, larguraAbaC, alturaAbaC));
		System.out.println(
				"Ix: " + InerciaSecaoC.calculaInerciaEixoXX(larguraAlmaC, alturaAlmaC, larguraAbaC, alturaAbaC));
		System.out.println(
				"Iy: " + InerciaSecaoC.calculaInerciaEixoYY(larguraAlmaC, alturaAlmaC, larguraAbaC, alturaAbaC));
		System.out.println("Kx: "
				+ RaioDeGiracaoSecaoC.calculaRaioDeGiracaoEixoXX(larguraAlmaC, alturaAlmaC, larguraAbaC, alturaAbaC));
		System.out.println("Ky: "
				+ RaioDeGiracaoSecaoC.calculaRaioDeGiracaoEixoYY(larguraAlmaC, alturaAlmaC, larguraAbaC, alturaAbaC));
		System.out.println();

		Secao c = new SecaoC(larguraAlmaC, alturaAlmaC, larguraAbaC, alturaAbaC, larguraAbaC, alturaAbaC);
		escreveSecao(c);

	}

	public static void escreveSecao(Secao secao) {
		System.out.println("Área: " + secao.calcularArea());
		System.out.println("X:  " + secao.calcularCentroideEixoYY());
		System.out.println("Y:  " + secao.calcularCentroideEixoXX());
		System.out.println("Qx: " + secao.calcularMomentoEstaticoEixoXX());
		System.out.println("Qy: " + secao.calcularMomentoEstaticoEixoYY());
		System.out.println("Ix: " + secao.calcularInerciaEixoXX());
		System.out.println("Iy: " + secao.calcularInerciaEixoYY());
		System.out.println("Ixy: " + secao.calcularProdutoInercia());
		System.out.println("Kx: " + secao.calcularRaioDeGiracaoEixoXX());
		System.out.println("Ky: " + secao.calcularRaioDeGiracaoEixoYY());
		System.out.println("-------------------------------------------------------");
		System.out.println();
	}

}
