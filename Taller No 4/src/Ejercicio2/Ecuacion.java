
package Ejercicio2;

/**
 *
 * @author carlo
 */
public class Ecuacion {
    
    private int a;
    private int b;
    private int c;
    
    // constructor por defecto
    public Ecuacion(){
      
    }
    
    // constructor sobrecragado 1
    public Ecuacion(int a, int b, int c){
        this.a=a; 
        this.b=b;
        this.c=c;
    }
    
    // constructor sobrecargado 2
    public Ecuacion(int a, int b){
        this.a=a;
        this.b=b;
        
    }
    
    
    
    public int getA(){
        return this.a;
    }
    
    public int getB(){
        return this.b;
    }
    
    public int getC(){
        return this.c;
    }
    
    
    public void setA(int a){
        this.a=a;
    }
    
    public void setB(int b){
        this.b=b;
    }
    
    public void setC(int c){
        this.c=c;
    }
    
    public double evaluarEcuacion(int x){
        
        double y = this.a * Math.pow(x, 2) + this.b*x + this.c;
        return y;
    }
}