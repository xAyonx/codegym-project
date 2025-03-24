package de.codegym.task.task03.task0303;

/* 
Währungsumtausch
*/

public class Solution {
    public static void main(String[] args) {
        double ergebnis1 = eurInUsdUmwandeln(50, 1.08);
        double ergebnis2 = eurInUsdUmwandeln(100, 1.10);

        System.out.println(ergebnis1);
        System.out.println(ergebnis2);
    }

    public static double eurInUsdUmwandeln(int eur, double wechselkurs) {
        return eur * wechselkurs; //Ergebnis berechnen und zurückgeben.
    }
}
