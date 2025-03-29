package de.codegym.task.task04.task0428;

/* 
Positive Zahl
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        //Angaben von drei Ganzen Zahlen
        int a = Integer.parseInt(bis.readLine());
        int b = Integer.parseInt(bis.readLine());
        int c = Integer.parseInt(bis.readLine());
        int nenner = 0;

        if (a>0){
            nenner++;
        }
        if (b>0){
            nenner++;
        }
        if(c>0){
            nenner++;
        }
        System.out.println(nenner);
    }
}
