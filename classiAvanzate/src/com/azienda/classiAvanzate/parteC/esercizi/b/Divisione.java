package com.azienda.classiAvanzate.parteC.esercizi.b;

public class Divisione extends Calcolatrice{

	@Override
	public Integer operate(Integer a, Integer b) {
		Integer divisione = null;
		if (b!=0) {
			divisione = a/b;
		}
		return divisione;
	}

}
