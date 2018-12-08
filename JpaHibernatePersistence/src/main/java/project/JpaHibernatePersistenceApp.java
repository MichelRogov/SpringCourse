package project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import project.model.user.User;

@SpringBootApplication
public class JpaHibernatePersistenceApp {

    public static void main(String[] args) {
        SpringApplication.run(project.JpaHibernatePersistenceApp.class, args);

        User user = new User();

        user.setFirstName("Alex");
        user.setLastName("Davidof");
        user.setEmail("aelx@davidof.com");

    }
}
