package de.codegym.task.task05.task0505;

/* 
Fellknäuelgemetzel
*/

public class Solution {
    public static void main(String[] args) {
        Katze katzeA = new Katze("Katze1", 10,10,10);
        Katze katzeB = new Katze("Katze2", 2, 2, 2);
        Katze katzeC = new Katze("Katze3",4,4,4);

        Boolean kampfA_B = katzeA.kaempfen(katzeB);
        Boolean kampfB_C = katzeB.kaempfen(katzeC);
        Boolean kampfA_C = katzeA.kaempfen(katzeC);

        System.out.println("Ergebnis Katze A vs Katze B "+ kampfA_B);
        System.out.println("Ergebnis Katze B vs Katze C "+ kampfB_C);
        System.out.println("Ergebnis Katze A vs Katze C "+ kampfA_C);


    }

    public static class Katze {
        protected String name;
        protected int alter;
        protected int gewicht;
        protected int staerke;

        public Katze(String name, int alter, int gewicht, int staerke) {
            this.name = name;
            this.alter = alter;
            this.gewicht = gewicht;
            this.staerke = staerke;
        }

        public boolean kaempfen(Katze andereKatze) {
            int alterVorteil = this.alter > andereKatze.alter ? 1 : 0;
            int gewichtVorteil = this.gewicht > andereKatze.gewicht ? 1 : 0;
            int staerkeVorteil = this.staerke > andereKatze.staerke ? 1 : 0;

            int punktzahl = alterVorteil + gewichtVorteil + staerkeVorteil;
            return punktzahl > 2; // return punktzahl > 2 ? true : false;
        }
    }
}
