package ch.hevs.sdi.simpleapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class SimpleappConfiguration {
    @Bean
    @Scope("singleton")
    @Lazy(false)
    Printer printer() {
        return new SimplePrinter();
    }
}
