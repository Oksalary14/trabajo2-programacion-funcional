package com.ces2.trabajo2.modelo;

public class Libro {
    private String titulo;
    private String genero;
    private String autor;
    private int numeroPaginas;
    private int anioPublicacion;
    private Integer rating; // Atributo Integer para el Punto 5

    public Libro(String titulo, String genero, String autor, int numeroPaginas, int anioPublicacion, Integer rating) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.anioPublicacion = anioPublicacion;
        this.rating = rating;
    }

    
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getNumeroPaginas() { return numeroPaginas; }
    public void setNumeroPaginas(int numeroPaginas) { this.numeroPaginas = numeroPaginas; }

    public int getAnioPublicacion() { return anioPublicacion; }
    public void setAnioPublicacion(int anioPublicacion) { this.anioPublicacion = anioPublicacion; }

    public Integer getRating() { return rating; }
    public void setRating(Integer rating) { this.rating = rating; }

    
    public String imprimir() {
        return "Libro [titulo=" + titulo + ", genero=" + genero + ", autor=" + autor + 
               ", paginas=" + numeroPaginas + ", año=" + anioPublicacion + ", rating=" + rating + "]";
    }
}