
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class PruebaRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Rectangulo r = new Rectangulo();
        
        System.out.print("Ingrese la Base: ");
        double ancho= entrada.nextDouble();
        r.setAncho(ancho);
        
        System.out.print("Ingree la Longitud: ");
        double longitud = entrada.nextDouble();
        r.setLongitud(longitud);
        
        System.out.println("\nAncho: " + r.getAncho());
        System.out.println("Longitud: " + r.getLongitud());
        System.out.println("Area: " + r.calcularArea());
        System.out.println("Perimetro: "+r.calcularPerimetro()+"\n");
    }
    
}
