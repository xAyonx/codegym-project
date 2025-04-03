package de.codegym.task.task04.task0436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Ein Rechteck zeichnen
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(bis.readLine());
        int n = Integer.parseInt(bis.readLine());

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print('8');
            }

            System.out.println();
        }
    }
}
