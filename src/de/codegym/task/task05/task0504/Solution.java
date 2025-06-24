package de.codegym.task.task05.task0504;


/* 
Die drei „Muskatztiere“
*/

public class Solution {
    public static void main(String[] args) {
        Katze katze1= new Katze("Java", 3, 5, 5);
        Katze katze2 = new Katze("Phyton", 4,5,6);
        Katze katze3 = new Katze("Json",4,3,5);
    }

    public static class Katze {
        private String name;
        private int alter;
        private int gewicht;
        private int staerke;

        public Katze(String name, int alter, int gewicht, int staerke) {
            this.name = name;
            this.alter = alter;
            this.gewicht = gewicht;
            this.staerke = staerke;
        }
    }
}