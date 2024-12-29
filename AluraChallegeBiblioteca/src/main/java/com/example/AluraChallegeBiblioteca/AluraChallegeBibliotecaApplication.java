package com.example.AluraChallegeBiblioteca;

import ConsumoApi.ConsumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.crypto.spec.PSource;

@SpringBootApplication
public class AluraChallegeBibliotecaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AluraChallegeBibliotecaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("""
				****BIBLIOTECA ALURA****
				 1- búsqueda por titulo
				 2- lista de libros
				 3- lista por autor
				 4- lista de libros registrados
				 5- lista de libros por idioma
				 6- Salir
				""");

		var consumoApi=new ConsumoApi();
		var json=consumoApi.obtenerDatos("https://gutendex.com/books/");
		System.out.println(json);

	}

}



