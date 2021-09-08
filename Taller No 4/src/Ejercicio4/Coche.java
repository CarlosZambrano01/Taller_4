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
public class Coche {
    // atributos
    private String color, marca, modelo, matricula;
    private int numeroCaballos, numeroPuertas;
    
    // constructor
    public Coche(){
        this.color = "";
        this.marca = "";
        this.modelo = "";
        this.numeroCaballos = 0;
        this.numeroPuertas = 0;
        this.matricula = "";
    }
    
    public Coche(int nc, int np, String mat){
        this.color = "Rojo";
        this.marca = "Mustang";
        this.modelo = "xt600";
        this.numeroCaballos = nc;
        this.numeroPuertas = np;
        this.matricula = mat;
    }
    
    //getters y setters
    public String getColor(){
        return this.color;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public int getnumeroCaballos(){
        return this.numeroCaballos;
    }
    
    public int getnumeroPuertas(){
        return this.numeroPuertas;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public void setColor(String c){
        this.color = c;
    }
    
    public void setMarca(String m){
        this.marca = m;
    }
    
    public void setModelo(String mod){
        this.modelo = mod;
    }
    
    public void setnumeroCaballos(int nc){
        this.numeroCaballos = nc;
    }
    
    public void setnumeroPuertas(int np){
        this.numeroPuertas = np;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
}
