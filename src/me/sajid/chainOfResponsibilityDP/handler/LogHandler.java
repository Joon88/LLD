package me.sajid.chainOfResponsibilityDP.handler;

// this can be a normal class as well
public abstract class LogHandler {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    private final LogHandler nextLogHandler;

    public LogHandler(LogHandler nextLogHandler) {
        this.nextLogHandler = nextLogHandler;
    }
    public void log(int logLevel, String msg) {
        if(this.nextLogHandler != null)
            this.nextLogHandler.log(logLevel, msg);
    }
}
