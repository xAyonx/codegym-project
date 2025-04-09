package de.codegym.task.task04.task0441;


/* 
Irgendwie durchschnittlich
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        int meridian;
        int a = Integer.parseInt(bis.readLine());
        int b = Integer.parseInt(bis.readLine());
        int c = Integer.parseInt(bis.readLine());

        if(a<=b && a>=c || a<=c && a>=b){
            meridian=a;
        }else if(b<=a && b>=c || b<=c && b>=a){
            meridian=b;
        }else {
            meridian=c;
        }
        System.out.println(meridian);
    }
}
