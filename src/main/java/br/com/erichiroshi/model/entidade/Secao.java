package br.com.erichiroshi.model.entidade;

public interface Secao {

	double calcularArea();

	double calcularCentroideEixoXX();

	double calcularCentroideEixoYY();

	double calcularInerciaEixoXX();

	double calcularInerciaEixoYY();
	
	double calcularProdutoInercia();

	double calcularMomentoEstaticoEixoXX();

	double calcularMomentoEstaticoEixoYY();

	double calcularRaioDeGiracaoEixoXX();

	double calcularRaioDeGiracaoEixoYY();

}
