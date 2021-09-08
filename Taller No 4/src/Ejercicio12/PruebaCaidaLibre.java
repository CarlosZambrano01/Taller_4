/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class PruebaCaidaLibre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Caida obj = new Caida();
        
        
        System.out.print("Ingrese la altura de la cual se deja caer el objeto: ");
        double altura = entrada.nextDouble();
        obj.setAltura(altura);
        
        System.out.println("\nAltura: " + obj.getAltura());
        System.out.printf("Su velocidad final al llegar al suelo es: %.2f",obj.velocidadFinal());
        System.out.printf("\nLa distancia que recorrio el cuerpo fue de: %.1f m en %.2f s\n\n", obj.getAltura(), obj.distanciaRecorridaT());
    }
    
}
