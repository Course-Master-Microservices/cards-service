package dev.alho.cards;

import dev.alho.cards.dto.CardsContactInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication

@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "Bank Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "John Doe",
						email = "tutor@alho.dev",
						url = "https://www.alho.dev"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.alho.dev"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Bank Cards microservice REST API Documentation",
				url = "https://www.alho.dev/swagger-ui.html"
		)
)
@EnableConfigurationProperties({CardsContactInfoDto.class})
@EnableJpaAuditing(auditorAwareRef = "auditAware")
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}
