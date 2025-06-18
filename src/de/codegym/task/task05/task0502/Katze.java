package de.codegym.task.task05.task0502;

/* 
Implementiere die Methode kaempfen
*/

public class Katze {
    public int alter;
    public int gewicht;
    public int staerke;

    public Katze() {
    }

    public boolean kaempfen(Katze andereKatze) {
        int uKf1 = (this.alter * 1) + (this.gewicht * 2) + (this.staerke *3);
        int uKf2 = (andereKatze.alter * 1) + (andereKatze.gewicht * 2) + (andereKatze.staerke * 3);

        if (uKf1>uKf2) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Katze katze1 = new Katze();

        katze1.alter = 5;
        katze1.gewicht = 6;
        katze1.staerke = 7;

        Katze katze2 = new Katze();
        katze2.alter = 5;
        katze2.gewicht = 6;
        katze2.staerke = 4;

        boolean hatKatze1Gewonnen = katze1.kaempfen(katze2);

        System.out.println("Hat Katze 1 gewonnen " + hatKatze1Gewonnen );
    }

}
