package com.azienda.classiAvanzate.parteC.esercizi.a;

public class Divisione implements OperazioniAritmetiche{

	@Override
	public Integer operate(Integer a, Integer b) {
		Integer divisione = null;
		if (b!=0) {
			divisione = a/b;
		}
		return divisione;
	}
	
	@Override
	public void printResult(Integer result) {
		System.out.println("Il risultato è: " + result);
	}

}
