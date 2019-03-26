package ch.hevs.sdi.simpleapp;

import org.springframework.context.annotation.*;

@Configuration
public class SimpleappConfiguration {
    @Bean
    @Profile("default")
    Printer simplePrinter() {
        return new SimplePrinter();
    }

    @Bean
    @Profile("fancy")
    Printer fancyPrinter() {
        return new FancyPrinter();
    }
}
