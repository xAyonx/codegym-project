package de.codegym.task.task04.task0415;

/* 
Dreiecksregel
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a+b > c && a+c > b && b+c > a) {
            System.out.println("Das Dreieck ist möglich.");
        } else {
            System.out.println("Das Dreieck ist nicht möglich.");
        }
    }
}