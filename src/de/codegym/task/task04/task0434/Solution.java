package de.codegym.task.task04.task0434;

/*
Multiplikationstabelle
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int zeile = 1; // Startwert für die Zeilen
        int spalte; // Variable für die Spalten

        while (zeile <= 10) { // Äußere Schleife für die Zeilen
            spalte = 1; // Startwert für die Spalten in jeder Zeile

            while (spalte <= 10) { // Innere Schleife für die Spalten
                System.out.print(zeile * spalte + " "); // Multiplikation und Ausgabe
                spalte++;
            }
            System.out.println(); // Zeilenumbruch nach jeder Zeile
            zeile++;
        }
    }
}