/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *
 * @author EQUIPO
 */
public class Triangulo {
    // atributos
    private double base, altura;
    
    // constructor
    public Triangulo(){
        this.base = 0.0;
        this.altura = 0.0;
    }
    
    //getters y setters
    public double getBase(){
        return this.base;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setBase(double b){
        this.base = b;
    }
    
    public void setAltura(double h){
        this.altura = h;
    }
    
    // metodos miembros
    public double longitudLados(){
        double lados;
        double mediaBase = this.base/2;
        lados = ((Math.sqrt((Math.pow(this.altura, 2)) + (Math.pow(mediaBase, 2)))));
        return lados;
    }
    
    public double calcularArea(){
        
        return this.base*this.altura/2;
    }
    
    public double calcularPerimetro(){
        double lados;
        double mediaBase = this.base/2;
        lados = ((Math.sqrt((Math.pow(this.altura, 2)) + (Math.pow(mediaBase, 2)))));
        
        return 2 * lados + this.base;
    }
    
    public double calcularAngulo(){
        double alpha;
        alpha = Math.floor(Math.toDegrees(Math.atan(this.altura/(this.base/2))));
        return  180 - alpha * 2;
    }
}
