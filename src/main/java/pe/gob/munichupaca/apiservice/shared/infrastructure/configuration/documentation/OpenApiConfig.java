package pe.gob.munichupaca.apiservice.shared.infrastructure.configuration.documentation;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI vopilotOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Municipalidad Provincial de Chupaca - API")
                        .description("Service | Vehicle Management application REST API documentation.")
                        .version("1.0.0")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("MP. Chupaca Wiki Documentation")
                        .url("https://github.com/WilverAR/vehicle-management-backend/wiki"));
    }
}
