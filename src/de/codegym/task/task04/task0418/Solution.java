package de.codegym.task.task04.task0418;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Mindestens zwei Zahlen
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int min = a < b ? a : b;
        System.out.println(min);
    }
}