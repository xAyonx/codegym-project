package de.codegym.task.task03.task0304;

/* 
Aufgabe mit Prozentsätzen
*/

public class Solution {
    public static double zehnProzentZufuegen(int i) {

        return i + (i * 0.10);
    }

    public static void main(String[] args) {
        System.out.println(zehnProzentZufuegen(9));
    }
}
