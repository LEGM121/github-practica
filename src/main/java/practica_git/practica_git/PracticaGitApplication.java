package practica_git.practica_git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PracticaGitApplication {
  @GetMapping("/saludar")
  public String saludar() {
    return "¡Hola, a todos, bienvenidos a la práctica de Git!";

  }
    @GetMapping("/despedir")
    public String despedir() {
        return "¡Adiós, gracias - participar en la práctica de Git -HUB!";

    }
	public static void main(String[] args) {
		SpringApplication.run(PracticaGitApplication.class, args);
	}

}
