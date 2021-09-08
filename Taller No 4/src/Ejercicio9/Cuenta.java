/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;

/**
 *
 * @author EQUIPO
 */
public class Cuenta {
    // atributos
    private int noCuenta;
    private String nombreCliente;
    private double saldo;
    
    // constructor
    public Cuenta(){
        this.noCuenta = 0;
        this.nombreCliente = "";
        this.saldo = 0;
    }
    
    //getters y setters
    public int getNoCuenta(){
        return this.noCuenta;
    }
    
    public String getNombreCliente(){
        return this.nombreCliente;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setNoCuenta(int n){
        this.noCuenta = n;
    }
    
    public void setNoombreCliente(String name){
        this.nombreCliente = name;
    }
    
    public void setSaldo(double v){
        this.saldo = v;
    }
    
    // metodos miembros
    /*public boolean consignar(double monto){
        return this.saldo + monto;
    }*/
    
}


