package de.codegym.task.task04.task0424;

/* 
Drei Zahlen
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in)) ;
        int zahl1 = Integer.parseInt(bis.readLine());
        int zahl2 = Integer.parseInt(bis.readLine());
        int zahl3 = Integer.parseInt(bis.readLine());


        if (zahl1 == zahl2 && zahl1 != zahl3) {
            System.out.println(3);
        } else if (zahl1 == zahl3 && zahl1 != zahl2){
            System.out.println(2);
        } else if(zahl2 == zahl3 && zahl2 != zahl1){
            System.out.println(1);
        }


    }
}
