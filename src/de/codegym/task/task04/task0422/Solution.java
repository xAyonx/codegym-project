package de.codegym.task.task04.task0422;

/* 
18+
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        String name = bis.readLine();
        int alter = Integer.parseInt(bis.readLine());

        if (alter < 18) {
            System.out.println("Du bist noch zu jung");
        }
    }
}
