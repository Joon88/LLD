package me.sajid.chainOfResponsibilityDP.handler;

public class ErrorLogHandler extends LogHandler {
    public ErrorLogHandler(LogHandler nextLogHandler) {
        super(nextLogHandler);
    }

    @Override
    public void log(int logLevel, String msg) {
        if(logLevel == ERROR)
            System.out.println("ERROR::" + msg);
        else
            super.log(logLevel, msg);
    }
}
