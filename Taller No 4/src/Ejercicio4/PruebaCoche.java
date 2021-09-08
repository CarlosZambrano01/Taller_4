/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;
import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class PruebaCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el color del coche: ");
        String color = entrada.next();
        
        System.out.print("Ingrese la marca del coche: ");
        String marca = entrada.next();
        
        System.out.print("Ingrese el modelo del coche: ");
        String modelo = entrada.next();
        
        System.out.print("Ingrese el numero de caballos del coche: ");
        int numeroCaballos = entrada.nextInt();
        
        System.out.print("Ingrese el numero de puertas del coche: ");
        int numeroPuertas = entrada.nextInt();
        
        System.out.print("Ingrese la matricula del coche: ");
        String matricula = entrada.next();
        
        Coche miCoche = crearCoche(color, marca, modelo, numeroCaballos, numeroPuertas, matricula);
        printInfoCoche(miCoche);
        
        Coche coche2 = new Coche(240, 2, "SJG-458");
        printInfoCoche(coche2);
        
        
    }
    
    public static Coche crearCoche(String c, String m, String mod, int nc, int np, String matricula){
        Coche coche = new Coche();
        
        coche.setColor(c);
        coche.setMarca(m);
        coche.setModelo(mod);
        coche.setnumeroCaballos(nc);
        coche.setnumeroPuertas(np); 
        coche.setMatricula(matricula);
        
        return coche;
    }
    
    
    
    
    public static void printInfoCoche(Coche coche){
        System.out.println("\nInformacion del coche.");
        System.out.println("\nColor: " + coche.getColor());
        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("No de caballos: " + coche.getnumeroCaballos());
        System.out.println("No puertas: " + coche.getnumeroPuertas());
        System.out.println("Matricula: " + coche.getMatricula()+"\n\n");
    }
}
