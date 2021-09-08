/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class PruebaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Triangulo t = new Triangulo();
        
        System.out.print("Ingrese la Base: ");
        double base= entrada.nextDouble();
        t.setBase(base);
        
        System.out.print("Ingree la Altura: ");
        double altura = entrada.nextDouble();
        t.setAltura(altura);
        
        
        System.out.println("\nBase: " + t.getBase());
        System.out.println("Altura: " + t.getAltura());
        System.out.printf("La longitud de sus lados es: %.1f",t.longitudLados());
        System.out.printf("\nEL area es: %.1f",t.calcularArea());
        System.out.printf("\nEL perimetro es: %.1f",t.calcularPerimetro());
        System.out.printf("\nEL angulo vértice es: %.0f°\n\n",t.calcularAngulo());
    }
    
}
