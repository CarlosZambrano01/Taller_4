/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

/**
 *
 * @author EQUIPO
 */
public class Libro {
    // atributos
    private String titulo, autor, isbn, edicion, editorial, ciudad, pais, fechaEdicion;
    private int noPaginas;
    
    // constructor
    public Libro(){
        this.titulo = "";
        this.autor = "";
        this.isbn = "";
        this.noPaginas = 0;
        this.edicion = "";
        this.editorial = "";
        this.ciudad = "";
        this.pais = "";
        this.fechaEdicion = "";
    }
    
    //getters y setters
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public int getNoPaginas() {
        return noPaginas;
    }
    
    public String getEdicion() {
        return edicion;
    }
    
    public String getEditorial() {
        return editorial;
    }
    
    public String getCiudad() {
        return ciudad;
    }
    
    public String getPais() {
        return pais;
    }
    
    public String getFechaEdicion() {
        return fechaEdicion;
    } 
    
    public void setTitulo(String t) {
        this.titulo = t;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNoPaginas(int np) {
        this.noPaginas = np;
    }
    
    public void setEdicion(String ed) {
        this.edicion = ed;
    }

    public void setEditorial(String edit) {
        this.editorial = edit;
    }

    public void setCiudad(String ciu) {
        this.ciudad = ciu;
    }

    public void setPais(String p) {
        this.pais = p;
    }

    public void setFechaEdicion(String fd) {
        this.fechaEdicion = fd;
    }

    
    
    
}
