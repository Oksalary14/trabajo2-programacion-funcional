package com.ces2.trabajo2.modelo;

import java.util.List;

public class Novelista implements EscribirLibro {
    
    private String nombre;
    private List<Libro> libros;

    public Novelista(String nombre, List<Libro> libros) {
        this.nombre = nombre;
        this.libros = libros;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String planificarTrama(List<Libro> libros) {
        return "El novelista " + nombre + " está planificando la trama para " + libros.size() + " libros de realismo mágico y ficción.";
    }

    @Override
    public String escribirCapitulo(List<Libro> libros) {
        StringBuilder sb = new StringBuilder();
        sb.append("El novelista ").append(nombre).append(" está escribiendo capítulos para: ");
        for (Libro l : libros) {
            sb.append("'").append(l.getTitulo()).append("' (").append(l.getGenero()).append("), ");
        }
        return sb.toString();
    }

    @Override
    public String editar(List<Libro> libros) {
        return "El novelista " + nombre + " está editando y corrigiendo los manuscritos de sus obras.";
    }

    @Override
    public String mostrarLista() {
        return "Lista de libros del novelista " + nombre + ": " + libros;
    }
    
       @Override
   public List<Libro> getLibros() {
       return libros;
   }
}