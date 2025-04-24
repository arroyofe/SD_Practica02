package practica02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("practica02.repository")
@EntityScan("practica02.model")
public class SdPractica02Application {

    public static void main(String[] args) {
        SpringApplication.run(SdPractica02Application.class, args);
    }

}
