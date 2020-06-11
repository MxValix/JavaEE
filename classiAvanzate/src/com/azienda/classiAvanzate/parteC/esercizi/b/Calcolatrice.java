package com.azienda.classiAvanzate.parteC.esercizi.b;

public abstract class Calcolatrice implements OperazioniAritmetiche{

	@Override
	public void printResult(Integer result) {
		System.out.println("Il risultato è: " + result);
	}
	
}
