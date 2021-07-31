package ChainOfResponsibilityPattern;


import ChainOfResponsibilityPattern.logger.ConsoleLogger;
import ChainOfResponsibilityPattern.logger.ErrorLogger;
import ChainOfResponsibilityPattern.logger.FileLogger;
import ChainOfResponsibilityPattern.logger.Logger;

public class Demo {

    public static void main(String[] args) {

        Logger loggerChain = getChainOfLoggers();

//        loggerChain.logMessage(Logger.INFO, "This is an information.");

//        loggerChain.logMessage(Logger.DEBUG, "This is an debug level information.");
//
        loggerChain.logMessage(Logger.ERROR, "This is an error information.");
    }

    //Gets chain of loggers assuming that correct logger is of type ErrorLogger, if not --> get the next logger
    private static Logger getChainOfLoggers(){

        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        Logger fileLogger = new FileLogger(Logger.DEBUG);
        Logger consoleLogger = new ConsoleLogger(Logger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}
