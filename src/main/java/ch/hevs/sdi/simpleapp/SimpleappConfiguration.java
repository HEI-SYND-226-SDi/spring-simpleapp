package ch.hevs.sdi.simpleapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleappConfiguration {
    @Bean
    Printer printer() {
        return new FancyPrinter();
    }
}
