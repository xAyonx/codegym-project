package de.codegym.task.task04.task0414;

/* 
Anzahl der Tage in einem Jahr
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Erstellen eines Scanners für Eingabe
        Scanner scanner = new Scanner(System.in);

        //Einlesung von Tastatur
        int jahr = scanner.nextInt();

        //Konntrolle ob Schaltjahr
        if (jahr % 400 == 0) {
            System.out.println("Anzahl der Tage im Jahr: 366");
        } else if (jahr % 100 == 0) {
            System.out.println("Anzahl der Tage im Jahr: 365");
        } else if (jahr % 4 == 0) {
            System.out.println("Anzahl der Tage im Jahr: 366");
        } else {
            System.out.println("Anzahl der Tage im Jahr: 365");
        }

    }
}