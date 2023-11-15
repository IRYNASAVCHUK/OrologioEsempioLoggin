package com.mypoject.logging;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogRecord;

public class MyHandler extends FileHandler {

    public MyHandler(String pattern) throws IOException, SecurityException {
        super(pattern);
        //TODO Auto-generated constructor stub
    }

   
}
