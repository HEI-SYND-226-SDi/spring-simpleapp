package ch.hevs.sdi.simpleapp;

public class SimplePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.printf(message + "\n");
    }
}
