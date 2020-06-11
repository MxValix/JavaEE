package com.azienda.classiAvanzate.parteC.esercizi.b;
import java.util.Scanner;


public class ChiamanteOperazioni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scelta = 0;
        OperazioniAritmetiche operazioniAritmetiche = null;
        Integer risultato = null;
        Integer n1 = null;
        Integer n2 = null;
        do {
            System.out.println("Che operazione vuoi effettuare?");
            System.out.println("1. Addizione");
            System.out.println("2. Differenza");
            System.out.println("3. Moltiplicazione");
            System.out.println("4. Divisione");
            System.out.println("5. Esci dal programma");

            scelta = scanner.nextInt();
            boolean checkOperazione = (scelta > 0 && scelta < 5);

            if (checkOperazione) {
                System.out.print("Inserisci i numeri di cui vuoi fare l'operazione: ");
                n1 = scanner.nextInt();
                n2 = scanner.nextInt();
                if (scelta == 1) {
                    operazioniAritmetiche = new Somma();

                } else if (scelta == 2) {
                    operazioniAritmetiche = new Differenza();
                } else if (scelta == 3) {
                    operazioniAritmetiche = new Moltiplicazione();

                } else if (scelta == 4) {
                    operazioniAritmetiche = new Divisione();
                }
            } else if (scelta != 5) {
                System.out.println("Scelta non valida.");
            }

            if (operazioniAritmetiche != null) {
                risultato = operazioniAritmetiche.operate(n1, n2);
                if (risultato == null) System.out.println("Non calcolabile");
                else operazioniAritmetiche.printResult(risultato);
                operazioniAritmetiche = null;
            }


        } while (scelta != 5);
        scanner.close();
        System.out.println("Programma terminato.");

    }

}
