package de.codegym.task.task04.task0423;

/* 
Der Türsteher
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        String name = bis.readLine();
        int alter = Integer.parseInt(bis.readLine());

        if (alter > 20) {
            System.out.println("18 ist alt genug");
        }
    }
}
