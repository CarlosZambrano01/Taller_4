/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class TestEcuacion {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor de X: ");
        int x = entrada.nextInt();
        
        Ecuacion e = new Ecuacion();
        e.setA(3);
        e.setB(2);
        e.setC(5);
        
        System.out.printf("Y(%d)= %.2f%n",x, e.evaluarEcuacion(x) );
        
        
        /*Ecuacion eSobrecargada = new Ecuacion(3,2,5);
        System.out.printf("* Y(%d)= %.2f%n",x, eSobrecargada.evaluarEcuacion(x) );
        
        Ecuacion eSobrecargada2 = new Ecuacion(3,2);
        System.out.printf("* Y(%d)= %.2f%n",x, eSobrecargada2.evaluarEcuacion(x) );*/
        
    }
}
