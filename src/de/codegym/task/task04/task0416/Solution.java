package de.codegym.task.task04.task0416;

/* 
Blind über die Straße gehen
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble(); // Liest die Eingabe als double

        if (t % 5 < 3) {
            System.out.println("grün");
        } else if (t % 5 < 4) {
            System.out.println("gelb");
        } else {
            System.out.println("rot");
        }

        scanner.close(); // Scanner schließen
    }
}