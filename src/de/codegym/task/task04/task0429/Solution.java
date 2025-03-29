package de.codegym.task.task04.task0429;

/* 
Positive und negative Zahlen
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        //Eingabe von drei Zahlen
        int zahl1 = Integer.parseInt(bis.readLine());
        int zahl2 = Integer.parseInt(bis.readLine());
        int zahl3 = Integer.parseInt(bis.readLine());
        //zaehler von positiven oder negativen zahlen
        int nennerplus = 0;
        int nennerminus = 0;

        if(zahl1>0){
            nennerplus++;
        }else if (zahl1<0){
            nennerminus++;
        }
        if(zahl2>0){
            nennerplus++;
        }else if (zahl2<0){
            nennerminus++;
        }
        if(zahl3>0){
            nennerplus++;
        }else if(zahl3<0){
            nennerminus++;
        }
        System.out.println("Anzahl negativer Zahlen: " + nennerminus);
        System.out.println("Anzahl positiver Zahlen: " +nennerplus);

    }
}
