package de.codegym.task.task05.task0503;


/* 
Abfrage- und Änderungsmethoden für die Hund-Klasse
*/

public class Hund {
    int alter;
    String name;

    public void setName(String bello) {
        this.name = bello;
    }
    public void setAlter(int neuAlt) {
        this.alter = neuAlt;
    }
    public int getAlter(){
        return this.alter;
    }
    public String getName() {
        return this.name;
    }


    public static void main(String[] args) {

    }
}
