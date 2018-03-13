package ch.hevs.sdi.simpleapp

import org.apache.commons.logging.LogFactory

class FancyPrinter: Printer {
    private val log = LogFactory.getLog(FancyPrinter::class.java)

    override fun print(message: String) = log.info(message)
}
