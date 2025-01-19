/**Paquete: Es donde guardamos este archivo para tener todo bien ordenado*/
package com.desafio.forohub;

/**Importar herramientas: Aquí estamos trayendo las herramientas de Spring Boot para crear la aplicación*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**Etiqueta mágica: Esto le dice a Spring Boot que aquí comienza mi aplicación*/
@SpringBootApplication

/**Se crea la clase que es donde estará toda la aplicación.*/
public class ForohubApplication {

	/**Esto es como el interruptor que enciende la aplicación, Spring Boot empieza a trabajar.*/
	public static void main(String[] args) {
		SpringApplication.run(ForohubApplication.class, args);
	}

}
