package ch.hevs.sdi.simpleapp;

import org.springframework.stereotype.Component;

@Component
public class PrinterClient {
    private Printer printer;

    PrinterClient(Printer printer) {
        this.printer = printer;
        printer.print("Hello world!");
    }
}
