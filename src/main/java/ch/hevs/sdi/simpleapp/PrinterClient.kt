package ch.hevs.sdi.simpleapp

import org.springframework.stereotype.Component

@Component
class PrinterClient(private val printer: Printer) {
    init {
        printer.print("Hello world!")
    }
}
