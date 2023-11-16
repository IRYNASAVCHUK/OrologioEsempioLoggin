package com.myproject.logging;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger{
    private static final Logger logger = Logger.getLogger(MyLogger.class.getName());

    static {
        configureLogger();
    }

    private MyLogger() {
        throw new IllegalStateException("Utility class");
    }

    private static void configureLogger() {
        logger.setLevel(Level.ALL);
        MyHandler.configureHandler(logger);
    }

    public static Logger getLogger() {
        return logger;
    }
    
}
