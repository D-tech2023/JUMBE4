package net.javaguides.employeespringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSpringBootApplication.class, args);
	}

	@Autowired
	private repository EmploRepository;

	public EmployeeSpringBootApplication() {
		super();
	}

	public void run(String... args)  throws Exception{
		employee Employee= new employee();
		Employee.setName("jumbe");
		Employee.setEmail("denisdamas@gmail.com");


	}
}
