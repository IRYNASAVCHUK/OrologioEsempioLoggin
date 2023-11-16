package com.myproject;

import java.util.logging.Logger;

import com.myproject.clock.IOrologio;
import com.myproject.clock.Meridiana;
import com.myproject.clock.OrologioDaPolso;
import com.myproject.clock.Sveglia;
import com.myproject.logging.LoggingUtils;
import com.myproject.logging.MyFormatter;
import com.myproject.logging.MyHandler;
import com.myproject.logging.MyLogger;


public class Main {
    public static void main(String[] args) {
        // Configura il logger
        Logger logger = MyLogger.getLogger();

        try {
            // Crea un handler per scrivere i log su file
            MyHandler fileHandler = new MyHandler();
            // Imposta un formatter personalizzato per il formato JSON
            MyFormatter formatter = new MyFormatter();
            fileHandler.setFormatter(formatter);
            // Aggiungi l'handler al logger
            logger.addHandler(fileHandler);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Testa i metodi getOra() e registra i log
        IOrologio o1 = new Meridiana();
        LoggingUtils.logEnteringAndExiting(logger, o1);

        IOrologio o2 = new OrologioDaPolso(10, 20);
        LoggingUtils.logEnteringAndExiting(logger, o2);

        IOrologio o3 = new Sveglia(7, 30);
        LoggingUtils.logEnteringAndExiting(logger, o3);
    }
   
}
