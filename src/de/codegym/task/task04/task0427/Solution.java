package de.codegym.task.task04.task0427;

/*
Zahlen beschreiben
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        int zahl = Integer.parseInt(bis.readLine());

        if (zahl >= 1 && zahl <= 999) {
            int zaehler = String.valueOf(zahl).length();

            if (zahl % 2 == 0 && zaehler == 1) {
                System.out.println("gerade einstellige Zahl");
            } else if (zahl % 2 != 0 && zaehler == 1) { // Klammern hinzugefügt
                System.out.println("ungerade einstellige Zahl");
            } else if (zahl % 2 == 0 && zaehler == 2) { // Klammern hinzugefügt
                System.out.println("gerade zweistellige Zahl");
            } else if (zahl % 2 != 0 && zaehler == 2) { // Klammern hinzugefügt
                System.out.println("ungerade zweistellige Zahl");
            } else if (zahl % 2 == 0 && zaehler == 3) { // Klammern hinzugefügt
                System.out.println("gerade dreistellige Zahl");
            } else if (zahl % 2 != 0 && zaehler == 3) { // Klammern hinzugefügt
                System.out.println("ungerade dreistellige Zahl");
            }
        }
    }
}