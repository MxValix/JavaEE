package com.azienda.classiAvanzate.parteC.esercizi.a;

public class Differenza implements OperazioniAritmetiche{

	@Override
	public Integer operate(Integer a, Integer b) {
		Integer differenza = a-b;
		return differenza;
	}
	
	@Override
	public void printResult(Integer result) {
		System.out.println("Il risultato è: " + result);
	}

}
