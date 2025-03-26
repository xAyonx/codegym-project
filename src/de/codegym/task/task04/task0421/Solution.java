package de.codegym.task.task04.task0421;

/* 
Jen oder Jen?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();


        //Überprüfung der Namen, ob diese Identisch sind.
        if (name1.equals(name2)) {
            System.out.println("Die Namen sind identisch");
        }else if (!name1.equals(name2) && name1.length() == name2.length()) {
            System.out.println("Die Namen sind gleich lang");
        }

    }
}
