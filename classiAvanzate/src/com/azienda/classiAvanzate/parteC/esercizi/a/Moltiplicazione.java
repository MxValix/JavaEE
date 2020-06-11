package com.azienda.classiAvanzate.parteC.esercizi.a;

public class Moltiplicazione implements OperazioniAritmetiche{

	@Override
	public Integer operate(Integer a, Integer b) {
		Integer moltiplicazione = a*b;
		return moltiplicazione;
	}
	
	@Override
	public void printResult(Integer result) {
		System.out.println("Il risultato è: " + result);
	}

}
