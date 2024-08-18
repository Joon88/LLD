package me.sajid.chainOfResponsibilityDP.handler;

public class DebugLogHandler extends LogHandler {
    public DebugLogHandler(LogHandler nextLogHandler) {
        super(nextLogHandler);
    }

    @Override
    public void log(int logLevel, String msg) {
        if(logLevel == DEBUG)
            System.out.println("DEBUG::" + msg);
        else
            super.log(logLevel, msg);
    }
}
