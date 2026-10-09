package com.ces2.trabajo2.modelo;

import java.util.List;

public class Cronista implements EscribirLibro {
    
    private String nombre;
    private List<Libro> libros;

    public Cronista(String nombre, List<Libro> libros) {
        this.nombre = nombre;
        this.libros = libros;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String planificarTrama(List<Libro> libros) {
        return "El cronista " + nombre + " está investigando fuentes para " + libros.size() + " reportajes.";
    }

    @Override
    public String escribirCapitulo(List<Libro> libros) {
        StringBuilder sb = new StringBuilder();
        sb.append("El cronista ").append(nombre).append(" está documentando hechos reales para: ");
        for (Libro l : libros) {
            sb.append("'").append(l.getTitulo()).append("' (").append(l.getAnioPublicacion()).append("), ");
        }
        return sb.toString();
    }

    @Override
    public String editar(List<Libro> libros) {
        return "El cronista " + nombre + " está verificando datos y editando sus crónicas periodísticas.";
    }

    @Override
    public String mostrarLista() {
        return "Lista de libros del cronista " + nombre + ": " + libros;
    }
       @Override
   public List<Libro> getLibros() {
       return libros;
   }
}