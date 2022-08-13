package com.cursor;

import org.apache.logging.log4j.*;

public class Main {

public static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.trace("This is a trace message");
        LOGGER.debug("This is a debug message");
        LOGGER.info("This is an info message");
        LOGGER.warn("This is a warn message");
        LOGGER.error("This is an error message");
        LOGGER.fatal("This is a fatal message");
        LOGGER.info("_________________dividing line________________________");





    }
}
