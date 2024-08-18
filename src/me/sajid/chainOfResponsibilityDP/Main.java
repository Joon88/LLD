package me.sajid.chainOfResponsibilityDP;

import me.sajid.chainOfResponsibilityDP.handler.DebugLogHandler;
import me.sajid.chainOfResponsibilityDP.handler.ErrorLogHandler;
import me.sajid.chainOfResponsibilityDP.handler.InfoLogHandler;
import me.sajid.chainOfResponsibilityDP.handler.LogHandler;

public class Main {
    public static void main(String[] args) {
        LogHandler log = new InfoLogHandler(new DebugLogHandler(new ErrorLogHandler(null)));
        log.log(LogHandler.ERROR,"Hello Error");
        log.log(LogHandler.INFO,"Hello Info");
        log.log(LogHandler.ERROR,"Hello Error");
        log.log(LogHandler.DEBUG,"Hello Debug");
        log.log(5,"Hello Debug"); // no log handler defined for log level 5
    }
}
