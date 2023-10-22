package me.dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal da aplicação
 * 
 * As dependências desse projeto são H2, Spring Web, Spring Data JPA e Spring
 * Boot DevTools
 * 
 * Para acessar a memória do banco de dados, acesse
 * http://localhost:8080/h2-console
 * 
 * Para acessar a API, acesse http://localhost:8080/bootcamp/swagger-ui.html
 * 
 * @author AninhaPardini
 */

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
