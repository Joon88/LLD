package me.sajid.chainOfResponsibilityDP.handler;

public class InfoLogHandler extends LogHandler {
    public InfoLogHandler(LogHandler nextLogHandler) {
        super(nextLogHandler);
    }

    @Override
    public void log(int logLevel, String msg) {
        if(logLevel == INFO)
            System.out.println("INFO::" + msg);
        else
            super.log(logLevel, msg);
    }
}
