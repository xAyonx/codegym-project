package de.codegym.task.task04.task0443;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Ein Name ist ein Name
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        String name = bis.readLine();
        String y = bis.readLine();
        String m = bis.readLine();
        String d = bis.readLine();

        System.out.println("Mein Name ist " + name + ".");
        System.out.println("Ich wurde am " + d + "." + m + "." + y + " geboren");
    }
}
