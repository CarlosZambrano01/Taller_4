/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class PruebaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        pedirInfoLibro();
        
    }
   
    
    public static void pedirInfoLibro(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el titulo del libro: ");
        String titulo = entrada.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = entrada.nextLine();
        System.out.print("Ingrese el ISBN del libro: ");
        String isbn = entrada.next();
        //entrada.nextLine();
        System.out.print("Ingrese el No de paginas del libro: ");
        int noPaginas = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese la edicion del libro: ");
        String edicion = entrada.nextLine();
        System.out.print("Ingrese la editorial del libro: ");
        String editorial = entrada.nextLine();
        System.out.print("Ingrese la ciudad del libro: ");
        String ciudad = entrada.next();
        System.out.print("Ingrese el pais del libro: ");
        String pais = entrada.next();
        entrada.nextLine();
        System.out.print("Ingrese la fecha de edicion del libro: ");
        String fechaEdicion = entrada.nextLine();
        
        Libro libro = crearLibro(titulo, autor, isbn, noPaginas, edicion, editorial, ciudad, pais, fechaEdicion);
        printInfoLibro(libro);
    }
    
    public static Libro crearLibro(String t, String autor, String isbn, int np, String ed, String edit, String ciu, String p, String fd){
        Libro libro = new Libro();
        
        libro.setTitulo(t);
        libro.setAutor(autor);
        libro.setIsbn(isbn);
        libro.setNoPaginas(np);
        libro.setEdicion(ed);
        libro.setEditorial(edit);
        libro.setCiudad(ciu);
        libro.setPais(p);
        libro.setFechaEdicion(fd);
        return libro;
    }
    
    public static void printInfoLibro(Libro libro){
        System.out.println("\n\nInformacion del libro.");
        System.out.println("\nTitulo: " + libro.getTitulo());
        System.out.println(libro.getEdicion() + " edición");
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("ISBN: " + libro.getIsbn());
        System.out.println(libro.getEditorial() + ", " + libro.getCiudad() + " (" + libro.getPais() + "), " + libro.getFechaEdicion());
        System.out.println(libro.getNoPaginas() + " páginas" + "\n\n");
    }
}
