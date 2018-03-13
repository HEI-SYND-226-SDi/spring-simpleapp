package ch.hevs.sdi.simpleapp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class SimpleappApplication

fun main(args: Array<String>) {
    SpringApplication.run(SimpleappApplication::class.java, *args)
}
