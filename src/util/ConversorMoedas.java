package util;

public class ConversorMoedas {

	public static double IOF = 1.06;

	public static double dolarParaReal(double quantidade, double valorDolar) {
		
		double retorno;
		
		retorno = quantidade * valorDolar * IOF;
		
		return retorno;
	}
}
