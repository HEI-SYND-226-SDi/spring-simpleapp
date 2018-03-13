package ch.hevs.sdi.simpleapp

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
open class SimpleappConfiguration {
    @Bean
    @Profile("default")
    open fun printer() = SimplePrinter()

    @Bean
    @Profile("fancy")
    open fun fancyPrinter() = FancyPrinter()
}
