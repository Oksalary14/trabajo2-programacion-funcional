package com.ces2.trabajo2.repositories;

import com.ces2.trabajo2.modelo.*;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class EscritoresRepository {

    private final List<EscribirLibro> escritores;

    public EscritoresRepository() {
       
        Libro l1 = new Libro("Cien años de soledad", "Realismo mágico", "García Márquez", 471, 1967, 5);
        Libro l2 = new Libro("El amor en los tiempos del cólera", "Novela", "García Márquez", 368, 1985, 4);
        Libro l3 = new Libro("Crónica de una muerte anunciada", "Crónica", "García Márquez", 120, 1981, 4);
        Libro l4 = new Libro("Veinte poemas de amor", "Poesía", "Pablo Neruda", 100, 1924, 5);
        Libro l5 = new Libro("Los heraldos negros", "Poesía", "César Vallejo", 80, 1918, 4);
        Libro l6 = new Libro("Residencia en la tierra", "Poesía", "Pablo Neruda", 200, 1933, 5);
        Libro l7 = new Libro("El principito", "Fábula", "Saint-Exupéry", 96, 1943, 5);
        Libro l8 = new Libro("Don Quijote", "Novela", "Cervantes", 863, 1605, 5);
        Libro l9 = new Libro("La Odisea", "Épica", "Homero", 541, -800, 4);
        Libro l10 = new Libro("Hiroshima", "Crónica", "John Hersey", 152, 1946, 5);

        
        
        Novelista n1 = new Novelista("Gabriel García Márquez", List.of()); // 0 libros
        Novelista n2 = new Novelista("Mario Vargas Llosa", List.of(l1)); // 1 libro
        Novelista n3 = new Novelista("Isabel Allende", List.of(l1, l2)); // 2 libros
        Novelista n4 = new Novelista("Julio Cortázar", List.of(l1, l2, l7)); // 3 libros

       
        Poeta p1 = new Poeta("Pablo Neruda", List.of(l4, l6, l1, l2)); // 4 libros
        Poeta p2 = new Poeta("César Vallejo", List.of(l4, l5, l6, l1, l2)); // 5 libros
        Poeta p3 = new Poeta("Federico García Lorca", List.of()); // 0 libros
        Poeta p4 = new Poeta("Octavio Paz", List.of(l4)); // 1 libro

       
        Cronista c1 = new Cronista("Germán Castro Caycedo", List.of(l3, l10)); // 2 libros
        Cronista c2 = new Cronista("Leila Guerriero", List.of(l3, l10, l8)); // 3 libros
        Cronista c3 = new Cronista("Martín Caparrós", List.of(l3, l10, l8, l9)); // 4 libros
        Cronista c4 = new Cronista("Juan José Millás", List.of(l3, l10, l8, l9, l7)); // 5 libros

        this.escritores = List.of(n1, n2, n3, n4, p1, p2, p3, p4, c1, c2, c3, c4);
    }

    
    public List<EscribirLibro> getEscritores() {
        return escritores;
    }
}