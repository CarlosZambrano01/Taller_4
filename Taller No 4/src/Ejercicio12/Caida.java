/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12;

/**
 *
 * @author EQUIPO
 */
public class Caida {
    //atributos
    public static double vInicial = 0.0;
    private double altura;
    public static double g = 9.8;
    
    // constructor
    public Caida(){
        this.altura = 0.0;
    }
    
    //getters y setters
    public double getAltura(){
        return this.altura;
    }
    
    public void setAltura(double h){
        this.altura = h;
    }
    
    // metodos miembros
    public double velocidadFinal(){
        double vFinal;  
        vFinal = Math.sqrt(Caida.vInicial + 2 *Caida.g * this.altura);
        return vFinal;
    }
    
    public double distanciaRecorridaT(){
        double vFinal;  
        vFinal = Math.sqrt(Caida.vInicial + 2 *Caida.g * this.altura);
        return vFinal/Caida.g;
    }
}
