package com.labseq.labseqservice.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
public class OpenApiConfig {
    @Value("${labseq-service.openapi.dev-url}")
    private String devUrl;

    @Bean
    public OpenAPI myOpenAPI() {
        Server devServer = new Server();
        devServer.setUrl(devUrl);
        devServer.setDescription("Server URL in Development environment");


        Contact contact = new Contact();
        contact.setEmail("iago6489@gmail.com");
        contact.setName("Labseq-service");
        contact.setUrl("${labseq-service.openapi.dev-url}");

        License mitLicense =
                new License().name("MIT License").url("https://choosealicense.com/licenses/mit/");

        Info info =
                new Info()
                        .title("Labseq-service System API")
                        .version("1.0")
                        .contact(contact)
                        .description("This api returns the calculated value based on the input.")
                        .termsOfService("https://www.iago_america.com/terms")
                        .license(mitLicense);

        return new OpenAPI().info(info).servers(List.of(devServer));
    }
}

