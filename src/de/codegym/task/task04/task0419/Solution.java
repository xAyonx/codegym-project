package de.codegym.task.task04.task0419;

/* 
Die größte von vier Zahlen
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        int max = a;

        if (b>max) {
            max = b;
        } if (c>max) {
            max = c;
        } if (d>max) {
            max = d;
        }
        System.out.println(max);
    }
}
