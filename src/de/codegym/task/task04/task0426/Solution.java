package de.codegym.task.task04.task0426;

/* 
Etiketten und Zahlen
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        int zahl = Integer.parseInt(bis.readLine());

        if (zahl == 0) {
            System.out.println("Null");
        } else if (zahl % 2 == 0 && zahl >0) {
            System.out.println("Positive gerade Zahl");
        } else if ( zahl % 2 != 0 && zahl > 0) {
            System.out.println("Positive ungerade Zahl");
        } else if (zahl % 2 != 0 && zahl < 0) {
            System.out.println("Negative ungerade Zahl");
        } else if (zahl % 2 == 0 && zahl < 0){
            System.out.println("Negative gerade Zahl");
        }
    }
}
