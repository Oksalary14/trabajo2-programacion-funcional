package com.ces2.trabajo2.modelo;

import java.util.List;

public interface EscribirLibro extends Planificar, Escribir, Editar {
    
    String getNombre();
    
   
    String mostrarLista();

       List<Libro> getLibros();
}