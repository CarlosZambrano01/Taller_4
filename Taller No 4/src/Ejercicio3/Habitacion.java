/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author carlo
 */
public class Habitacion {
    private double largo, ancho, alto;
    
    public Habitacion(){
    }
    
    public Habitacion(double largo, double ancho, double alto){
        this.alto=alto;
        this.ancho=ancho;
        this.largo = largo;
    }

    /**
     * @return the largo
     */
    public double getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(double largo) {
        this.largo = largo;
    }

    /**
     * @return the ancho
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the alto
     */
    public double getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    public double cantidadEnchape(){
        return this.ancho*this.largo;
    }
    
    public double cantidadTapizado(){
        
        return 2*(this.alto*this.ancho) + 2 * (this.alto*this.largo);
    }
   
}
