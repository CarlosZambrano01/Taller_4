/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author EQUIPO
 */
public class Rectangulo {
    // atributos
    private double ancho;
    private double longitud;
    
    // constructor
    public Rectangulo(){
       this.ancho= 0.0;
       this.longitud= 0.0;
    }
    
    //getters y setters
    public double getAncho(){
        return this.ancho;
    }
    
    public double getLongitud(){
        return this.longitud;
    }
    
    public void setAncho(double a){
        this.ancho = a;
    }
    
    public void setLongitud(double l){
        this.longitud=l;
    }
    
    // metodos miembros
    
    public double calcularArea(){
        return this.ancho * this.longitud;
    }
    public double calcularPerimetro(){
        return 2*(this.ancho+this.longitud);
    }
}
