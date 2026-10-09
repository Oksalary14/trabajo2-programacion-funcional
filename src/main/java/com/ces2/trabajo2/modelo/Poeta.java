package com.ces2.trabajo2.modelo;

import java.util.List;

public class Poeta implements EscribirLibro {
    
    private String nombre;
    private List<Libro> libros;

    public Poeta(String nombre, List<Libro> libros) {
        this.nombre = nombre;
        this.libros = libros;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String planificarTrama(List<Libro> libros) {
        return "El poeta " + nombre + " está inspirándose para crear " + libros.size() + " nuevas obras poéticas.";
    }

    @Override
    public String escribirCapitulo(List<Libro> libros) {
        StringBuilder sb = new StringBuilder();
        sb.append("El poeta ").append(nombre).append(" está escribiendo versos para: ");
        for (Libro l : libros) {
            sb.append("'").append(l.getTitulo()).append("' de ").append(l.getAutor()).append(", ");
        }
        return sb.toString();
    }

    @Override
    public String editar(List<Libro> libros) {
        return "El poeta " + nombre + " está refinando la métrica y la rima de sus poemas.";
    }

    @Override
    public String mostrarLista() {
        return "Lista de libros del poeta " + nombre + ": " + libros;
    }
       @Override
   public List<Libro> getLibros() {
       return libros;
   }
}