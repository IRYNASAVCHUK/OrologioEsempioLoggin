package com.mypoject;

import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;


import com.mypoject.clock.IOrologio;
import com.mypoject.clock.Meridiana;
import com.mypoject.clock.OrologioDaPolso;
import com.mypoject.clock.Sveglia;
import com.mypoject.logging.MyFormatter;


public class Main {
    public static void main(String[] args) {
        // Configura il logger
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.setLevel(Level.ALL); // Imposta il livello di registrazione a ALL

        try {
            // Crea un handler per scrivere i log su file
            Handler fileHandler = new FileHandler("logFile.txt");
            fileHandler.setLevel(Level.ALL); // Imposta il livello di registrazione a ALL

            // Imposta un formatter personalizzato per il formato JSON
            Formatter formatter = new MyFormatter();
            fileHandler.setFormatter(formatter);

            // Aggiungi l'handler al logger
            logger.addHandler(fileHandler);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Testa i metodi getOra() e registra i log
        IOrologio o1 = new Meridiana();
        logEnteringAndExiting(logger, o1);

        IOrologio o2 = new OrologioDaPolso(10, 20);
        logEnteringAndExiting(logger, o2);

        IOrologio o3 = new Sveglia(7, 30);
        logEnteringAndExiting(logger, o3);
    }

    // Metodo per registrare gli ingressi e le uscite dal metodo getOra()
    private static void logEnteringAndExiting(Logger logger, IOrologio orologio) {
        String className = orologio.getClass().getSimpleName();
        String methodName = "getOra";

        logger.entering(className, methodName);
        logger.info("Ora: " + orologio.getOra());
        logger.exiting(className, methodName);
    }
   
}
