/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldo;

import java.util.Scanner;

/**
 *
 * @author diaz
 */
public class Sueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float a,b;
        double nor,canasta,ladi,isr,isr2;
             Scanner  leer = new Scanner(System.in);
             System.out.println("¿Cuanto te pagan por hora");
             a=leer.nextFloat();
             System.out.println("¿Cuantas horas trabajaste?");
             b=leer.nextFloat();
             nor=a*b;
             canasta=nor*20/100;
             ladi=nor+canasta;
             isr=nor*0.16/100;
             isr2=nor-isr;
             System.out.println("Sueldo normal"+nor);
             System.out.println("Canasta basica"+ladi);
             System.out.println("Canasta basica"+isr2);
          
          System.out.println("Jimena Diaz");   
    }
    
}
