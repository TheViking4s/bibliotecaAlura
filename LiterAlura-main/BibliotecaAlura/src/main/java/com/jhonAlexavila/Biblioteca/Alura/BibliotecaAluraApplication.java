package com.jhonAlexavila.Biblioteca.Alura;

import com.jhonAlexavila.Biblioteca.Alura.main.Main;
import com.jhonAlexavila.Biblioteca.Alura.repository.IAuthorRepository;
import com.jhonAlexavila.Biblioteca.Alura.repository.IbookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BibliotecaAluraApplication implements CommandLineRunner {
	@Autowired
	private IbookRepository bookRepository;
	@Autowired
	private IAuthorRepository authorRepository;
	public static void main(String[] args) {
		SpringApplication.run(BibliotecaAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main(bookRepository, authorRepository);
		main.displayMenu();
	}
}
