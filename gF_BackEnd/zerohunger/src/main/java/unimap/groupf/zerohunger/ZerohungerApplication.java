package unimap.groupf.zerohunger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository			
//not necessary in this context since it is typically used to indicate that a class is a data access object (DAO) or repository component.

@SpringBootApplication	
/*@SpringBootApplication	
 to indicate that the class contains Spring configuration & Spring Bean definition
 enable Spring Boot's auto-configuration feature.
 */
/*
class that contains Spring Bean definitions is typically referred to as a "configuration class" 
Within a configuration class, you can define one or more Beans using the @Bean annotation on a method 
that returns an object. Spring will then manage the lifecycle of the Bean, 
providing any necessary dependencies and ensuring that it's properly initialized.
 */
@ComponentScan //enable component scanning of the packages and sub-packages of the current class.
public class ZerohungerApplication {	// Main class Core class 

	public static void main(String[] args) {	
		SpringApplication.run(ZerohungerApplication.class, args); 
	}
}
