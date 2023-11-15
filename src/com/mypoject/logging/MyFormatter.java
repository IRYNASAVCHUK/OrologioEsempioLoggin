package com.mypoject.logging;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyFormatter extends Formatter{

    @Override
    public String format(LogRecord record) {
        String timestamp = formatDateWithMillis(record.getMillis());
        long number = record.getSequenceNumber();
        String sequenceNumber= Long.toString(number);
        String className = record.getSourceClassName();
        String methodName = record.getSourceMethodName();
        String level = record.getLevel().toString();
        String message = record.getMessage();
        long thread = record.getLongThreadID();
        String threadID =Long.toString(thread);

        return "{" +
                "\n\"timestamp\":\"" + timestamp + "\"," +
                "\n\"sequence number\":\"" + sequenceNumber + "\"," +
                "\n\"class\":\"" + className + "\"," +
                "\n\"method\":\"" + methodName + "\"," +
                "\n\"thread ID\":\"" + threadID + "\"," +
                "\n\"level\":\"" + level + "\"," +
                "\n\"message\":\"" + message + "\"" +
                "\n}\n";
    }
    private String formatDateWithMillis(long millis) {
        Date date = new Date(millis);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        return sdf.format(date);
    }
    
}
