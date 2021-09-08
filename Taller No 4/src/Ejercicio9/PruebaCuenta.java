/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class PruebaCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Cuenta c = new Cuenta();
        
        System.out.print("Ingrese el numero de cuenta: ");
        int noCuenta = entrada.nextInt();
        c.setNoCuenta(noCuenta);
        
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = entrada.next();
        c.setNoombreCliente(nombreCliente);
        
        System.out.print("Ingrese el saldo: ");
        double saldo = entrada.nextDouble();
        c.setSaldo(saldo);
        
        /*int opc = 0;
        
        do{
            System.out.println("----------------------");
            System.out.println("Menu Opciones");
            System.out.println("1. Consignar");
            System.out.println("2. Retirar");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.print("Seleccione: ");
            opc = entrada.nextInt();
            System.out.println("----------------------\n");
            
            switch(opc){
                case 1: 
                        System.out.print("Ingrese el monto que desea consignar: ");
                        double monto = entrada.nextDouble();
                        consignar(monto);
                        break;
            }
        }while(opc!=0);*/
    }
    
}
