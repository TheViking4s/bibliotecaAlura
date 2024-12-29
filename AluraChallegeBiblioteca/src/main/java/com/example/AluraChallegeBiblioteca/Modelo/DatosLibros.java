package com.example.AluraChallegeBiblioteca.Modelo;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DatosLibros(
        double id ,
        @JsonAlias("title") String titulo,
        @JsonAlias("Authors")String Autor,
        @JsonAlias("languages")String lenguaje
) {

}
