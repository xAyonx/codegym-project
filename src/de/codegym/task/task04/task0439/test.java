package de.codegym.task.task04.task0439;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Kettenbrief
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        String name = bis.readLine();
        String text = name + " liebt mich.";

        for (int i = 0; i < 10; i++) {
            System.out.println(text);
        }
    }
}
