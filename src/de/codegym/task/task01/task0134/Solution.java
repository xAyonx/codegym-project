package de.codegym.task.task01.task0134;

/* 
Pool mit Wasser füllen
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(volumenBerechnen(25, 5, 2));
    }

    public static long volumenBerechnen(int a, int b, int c) {
        //schreib hier deinen Code
        long volumenInKubikmetern = a* b * c;

        return volumenInKubikmetern * 1000;
    }
}