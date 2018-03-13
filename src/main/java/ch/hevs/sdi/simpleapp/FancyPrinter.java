package ch.hevs.sdi.simpleapp;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class FancyPrinter implements Printer {
    private Log log = LogFactory.getLog(FancyPrinter.class);

    @Override
    public void print(String message) {
        log.info(message);
    }
}
