package com.myproject.logging;

import java.util.logging.Logger;

import com.myproject.clock.IOrologio;

public class LoggingUtils {
    // Metodo per registrare gli ingressi e le uscite dal metodo getOra()
    public static void logEnteringAndExiting(Logger logger, IOrologio orologio) {
        String className = orologio.getClass().getSimpleName();
        String methodName = "getOra";

        logger.entering(className, methodName);
        logger.info("Ora: " + orologio.getOra());
        logger.exiting(className, methodName);
    }
}
