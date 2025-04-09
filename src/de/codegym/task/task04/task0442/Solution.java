package de.codegym.task.task04.task0442;


/* 
Addieren
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while (true){
            int a = Integer.parseInt(bis.readLine());
            sum+=a;
            if (a==-1){
                break;
            }
        }
        System.out.println(sum);



    }
}
