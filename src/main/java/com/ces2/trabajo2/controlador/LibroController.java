package com.ces2.trabajo2.controlador;

import com.ces2.trabajo2.modelo.EscribirLibro;
import com.ces2.trabajo2.modelo.Libro;
import com.ces2.trabajo2.repositories.EscritoresRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class LibroController {

    private final EscritoresRepository escritoresRepository;


public LibroController(EscritoresRepository escritoresRepository) {
    this.escritoresRepository = escritoresRepository;
}

  
    @GetMapping("/punto1")
    public String punto1(Model model) {
        String nombres = escritoresRepository.getEscritores().stream()
                .map(EscribirLibro::getNombre)
                .collect(Collectors.joining(", "));
        
        model.addAttribute("resultado", nombres);
        return "punto1";
    }

  
    @GetMapping("/punto2")
public String punto2(Model model) {
    IntSummaryStatistics stats = escritoresRepository.getEscritores().stream()
            .flatMap(escritor -> escritor.getLibros().stream())
            .mapToInt(Libro::getNumeroPaginas)
            .summaryStatistics();

    
    model.addAttribute("conteo", stats.getCount());
    model.addAttribute("suma", stats.getSum());
    model.addAttribute("promedio", stats.getAverage());
    model.addAttribute("minimo", stats.getMin());
    model.addAttribute("maximo", stats.getMax());

    return "punto2";
}

@GetMapping("/punto3")
public String punto3(Model model) {
    
    
    List<String> listaObjetos = escritoresRepository.getEscritores().stream()
            .flatMap(escritor -> escritor.getLibros().stream())
            .map(Libro::imprimir) 
            .collect(Collectors.toList());

    
    List<String> listaTitulos = escritoresRepository.getEscritores().stream()
            .flatMap(escritor -> escritor.getLibros().stream())
            .map(Libro::getTitulo)
            .collect(Collectors.toList());

    model.addAttribute("listaObjetos", listaObjetos);
    model.addAttribute("listaTitulos", listaTitulos);
    
    return "punto3";
}

   
    @GetMapping("/punto4")
    public String punto4(Model model) {
        
        boolean existeModerno = escritoresRepository.getEscritores().stream()
                .flatMap(escritor -> escritor.getLibros().stream())
                .anyMatch(libro -> libro.getAnioPublicacion() > 1950);

        
        boolean noHayTerror = escritoresRepository.getEscritores().stream()
                .flatMap(escritor -> escritor.getLibros().stream())
                .noneMatch(libro -> libro.getGenero().equals("Terror"));

        model.addAttribute("anyMatch", existeModerno);
        model.addAttribute("noneMatch", noHayTerror);
        return "punto4";
    }


    @GetMapping("/punto5")
    public String punto5(Model model) {
        Optional<Libro> libroMax = escritoresRepository.getEscritores().stream()
                .flatMap(escritor -> escritor.getLibros().stream())
                .max(Comparator.comparing(Libro::getRating));

        libroMax.ifPresent(libro -> model.addAttribute("libroMax", libro));
        return "punto5";
    }
}