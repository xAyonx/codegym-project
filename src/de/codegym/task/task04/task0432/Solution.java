package de.codegym.task.task04.task0432;



/* 
Von einer guten Sache kann man nie zu viel haben
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        String zeichen = bis.readLine();
        int n = Integer.parseInt(bis.readLine());

        while (n>0){
            System.out.println(zeichen);
            n--;
        }
    }
}
