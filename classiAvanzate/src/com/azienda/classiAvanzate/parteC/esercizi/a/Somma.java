package com.azienda.classiAvanzate.parteC.esercizi.a;

public class Somma implements OperazioniAritmetiche{

	@Override
	public Integer operate(Integer a, Integer b) {
		Integer somma = a+b;
		return somma;
	}

	@Override
	public void printResult(Integer result) {
		System.out.println("Il risultato è: " + result);
	}
}
