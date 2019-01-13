package lk.ijse.boot_wholesale;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import lk.ijse.boot_wholesale.repository.AdminRepository;

@SpringBootApplication
@ComponentScan("lk.ijse.boot_wholesale")
@EnableJpaRepositories(basePackageClasses=AdminRepository.class)
@Configurable
public class BootWholesaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootWholesaleApplication.class, args);
	}

}

