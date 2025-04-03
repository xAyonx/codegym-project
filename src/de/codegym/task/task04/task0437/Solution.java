package de.codegym.task.task04.task0437;

/*
Ein Rechteck zeichnen
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int zeile = 10;

        for (int i = 0; i < zeile; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}